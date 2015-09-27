package mapper;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class AbstractMapper<T> implements IMapper<T> {
	
	public T map(String json) throws JSONException {
		JSONObject jsonObj = new JSONObject(json);
		return (T) map(jsonObj);
	}

	public List<T> maps(String json) throws JSONException {
		JSONArray jsonArr = new JSONArray(json);
		return maps(jsonArr);
	}

	public List<T> maps(JSONArray jsonArr) throws JSONException {
		List<T> list = new ArrayList<T>();
		for (int i = 0; i < jsonArr.length(); i++) {
			JSONObject jsonObj = jsonArr.getJSONObject(i);
			T obj = map(jsonObj);
			list.add(obj);
		}
		return list;
	}
	
}
