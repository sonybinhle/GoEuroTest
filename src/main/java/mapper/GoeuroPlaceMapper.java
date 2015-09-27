package mapper;

import model.Place;
import org.json.JSONException;
import org.json.JSONObject;

public class GoeuroPlaceMapper extends AbstractMapper<Place> {
	
	public Place map(JSONObject jsonObj) throws JSONException {
		Place place = new Place();

		place.setId(Long.valueOf(jsonObj.getLong("_id")));
		place.setType(jsonObj.getString("type"));
		place.setName(jsonObj.getString("name"));
		place.setLongitude(jsonObj.getJSONObject("geo_position").getDouble("longitude"));
		place.setLatitude(jsonObj.getJSONObject("geo_position").getDouble("latitude"));

		return place;
	}
	
}
