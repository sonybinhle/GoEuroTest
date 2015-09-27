package main;

import java.util.ArrayList;
import java.util.List;
import mapper.GoeuroPlaceMapper;
import mapper.IMapper;
import model.Place;
import org.json.JSONException;
import resource.GoeuroPlaceResource;
import resource.IResource;
import resource.IResourceFetcher;
import resource.StreamResourceFetcher;
import wrapper.GoeuroPlaceCsvWrapper;
import wrapper.IWrapper;
import writer.CsvWriter;
import writer.IWriter;

public class GoEuroTest {
	
	public static void main(String[] agrs) throws Exception {
		try {
			if ((agrs == null) || (agrs.length == 0)) {
				throw new Exception("No arguments found(Format: java -jar GoEuroTest.jar \"CITY_NAME\")");
			}
			String city = agrs[0];

			IResource resouce = new GoeuroPlaceResource(city);

			IResourceFetcher fetcher = new StreamResourceFetcher();

			String placesJson = fetcher.fetch(resouce);

			IMapper<Place> mapper = new GoeuroPlaceMapper();
			List<Place> places = mapper.maps(placesJson);
			
			if (places.isEmpty()) {
				throw new Exception("Your place may be incorrect or not in the database");
			}
			
			List<IWrapper> wrappers = getListPlaceWrapper(places);
			
			String dest = city + ".csv";
			IWriter writer = new CsvWriter();
			writer.write(wrappers, dest);
			
		} catch (JSONException e) {
			printMsg("Json Exception!");
		} catch (Exception e) {
			printMsg(e.getMessage());
		}
	}

	private static void printMsg(String msg) {
		System.out.println(msg + "\n");
	}

	private static List<IWrapper> getListPlaceWrapper(List<Place> places) {
		List<IWrapper> wrappers = new ArrayList<IWrapper>();
		for (Place place : places) {
			wrappers.add(new GoeuroPlaceCsvWrapper(place));
		}
		return wrappers;
	}
	
}
