package resource;

public class GoeuroPlaceResource extends AbstractResource {
	
	private String city;

	public GoeuroPlaceResource() {
	}

	public GoeuroPlaceResource(String city) {
		this.city = city;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBaseUrl() {
		return "http://api.goeuro.com/api/v2/";
	}

	public String getResourceUrl() {
		return "position/suggest/en/" + this.city;
	}
	
}
