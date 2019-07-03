package apiTest;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Logger;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 * 
 * API response verification for Itunes music/video.
 * @author Manmeet Kaur
 *
 */
public class apiCall {

	public static void main(String[] args) throws IOException, ParseException {
		final Logger LOGGER = Logger.getLogger(apiCall.class.getName());
		Boolean flag = false;
		URL url = new URL("https://itunes.apple.com/search?term=jack+johnson&entity=musicVideo");
		HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
		urlc.setRequestMethod("GET");
		urlc.connect();
		String response = "";
		// get response code
		int responseCode = urlc.getResponseCode();
		String contentType = urlc.getContentType();
		if (responseCode == HttpURLConnection.HTTP_OK && "text/javascript; charset=utf-8".equals(contentType)) {
			Scanner sc = new Scanner(url.openStream());
			while (sc.hasNext()) {
				response += sc.nextLine();
			}

			sc.close();
			JSONParser parse = new JSONParser();
			JSONObject jobj = (JSONObject) parse.parse(response);
			JSONArray resultArr = (JSONArray) jobj.get("results");
			Long resCount = (Long) jobj.get("resultCount");
			if (resCount > 0) {
				for (Object object : resultArr) {
					JSONObject obj = (JSONObject) object;
					if (obj.get("trackId").equals("") && !obj.get("kind").equals("music-video")) {
						flag=true;
						break;
					}
				}
			} else {
				flag=true;
			}
			if(flag==false) {
				LOGGER.info("Response verified Successfully!!");
			}else {
				LOGGER.info("Response has some issues");
			}
		}

	}
}