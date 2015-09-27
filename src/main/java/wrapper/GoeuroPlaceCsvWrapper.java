package wrapper;

import model.Place;

public class GoeuroPlaceCsvWrapper extends AbstractWrapper<Place> {
	
	public GoeuroPlaceCsvWrapper() {
	}

	public GoeuroPlaceCsvWrapper(Place place) {
		super(place);
	}

	public String toFormat() {
		if (this.obj == null) {
			return "";
		} else {
			return ((Place) this.obj).getId() + ", " + ((Place) this.obj).getName() + ", " + ((Place) this.obj).getType()
				+ ", " + ((Place) this.obj).getLatitude() + ", " + ((Place) this.obj).getLongitude();
		}
	}
	
}
