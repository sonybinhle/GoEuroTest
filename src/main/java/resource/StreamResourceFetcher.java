package resource;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

public class StreamResourceFetcher implements IResourceFetcher {
	
	public String fetch(IResource resource) throws Exception {
		String link = resource.getUrl();
		StringBuilder sb = new StringBuilder();
		URLConnection urlConn = null;
		InputStreamReader in = null;
		try {
			URL url = new URL(link);
			urlConn = url.openConnection();
			urlConn.setReadTimeout(2000);

			InputStream inputStream = urlConn.getInputStream();
			in = new InputStreamReader(inputStream, Charset.defaultCharset());

			BufferedReader bufferedReader = new BufferedReader(in);
			int buff;
			while ((buff = bufferedReader.read()) != -1) {
				sb.append((char) buff);
			}
			
			bufferedReader.close();
			in.close();
			
		} catch (SocketTimeoutException e) {
			throw new Exception("Request time out!");
		} catch (Exception e) {
			throw e;
		}
		
		return sb.toString();
	}
	
}
