package model;

public class Place {
	
	private Long id;
	private String name;
	private String type;
	private double latitude;
	private double longitude;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String toString() {
		return "GoeuroPlace [_id=" + this.id + ", name=" + this.name + ", type=" + this.type + ", latitude="
				+ this.latitude + ", longitude=" + this.longitude + "]";
	}
	
}
