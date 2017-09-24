import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by maiq on 24/09/17.
 */
public class OrgJson {

    private static String readJsonFromFile(String sampleJsonFile) throws IOException {

        String resultString = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(sampleJsonFile));
        StringBuilder stringBuilder = new StringBuilder();
        String line = bufferedReader.readLine();
        while (line != null) {

            stringBuilder.append(line);
            line = bufferedReader.readLine();
        }
        resultString = stringBuilder.toString();
        return resultString;
    }

    public static void main(String[] args) throws JSONException, IOException {

        String jsonString = readJsonFromFile("src/main/resources/sample.json");
        JSONObject jsonObject = new JSONObject(jsonString);
        String pageName = jsonObject.getJSONObject("pageInfo").getString("pageName");
        System.out.println(pageName);

        String pagePic = jsonObject.getJSONObject("pageInfo").getString("pagePic");
        System.out.println(pagePic);

        JSONArray jsonArray = jsonObject.getJSONArray("posts");
        for (int i = 0; i < jsonArray.length(); i++) {
            System.out.println(jsonArray.getJSONObject(i).getString("post_id"));
            System.out.println(jsonArray.getJSONObject(i).getString("actor_id"));
            System.out.println(jsonArray.getJSONObject(i).getString("picOfPersonWhoPosted"));
            System.out.println(jsonArray.getJSONObject(i).getString("nameOfPersonWhoPosted"));
            System.out.println(jsonArray.getJSONObject(i).getString("message"));
            System.out.println(jsonArray.getJSONObject(i).getString("likesCount"));
            System.out.println(jsonArray.getJSONObject(i).getString("comments"));
            System.out.println(jsonArray.getJSONObject(i).getString("timeOfPost"));
        }
    }
}
