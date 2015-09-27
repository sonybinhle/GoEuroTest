package mapper;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract interface IMapper<T> {
	
	public abstract T map(String paramString) throws JSONException;

	public abstract T map(JSONObject paramJSONObject) throws JSONException;

	public abstract List<T> maps(String paramString) throws JSONException;

	public abstract List<T> maps(JSONArray paramJSONArray) throws JSONException;
	
}
