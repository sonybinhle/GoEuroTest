package resource;

public abstract class AbstractResource implements IResource {
	
	public abstract String getBaseUrl();

	public abstract String getResourceUrl();

	public String getUrl() {
		return getBaseUrl() + getResourceUrl();
	}
	
}
