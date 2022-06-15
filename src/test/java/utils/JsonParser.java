package utils;

import data.UserData;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;


public class JsonParser {
    private static JSONParser parser = new JSONParser();
    private static JSONArray arr = null;

    public static void parsing() {
        try {
            arr = (JSONArray) parser.parse(new FileReader("src/main/resources/data.json"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (Object o : arr) {
            JSONObject jsonObject = (JSONObject) o;
            UserData.setFirstName((String)jsonObject.get("first name"));
            UserData.setLastName((String)jsonObject.get("last name"));
            UserData.setEmail((String) jsonObject.get("email"));
            UserData.setPassword((String) jsonObject.get("password"));
            UserData.setAddress((String) jsonObject.get("address"));
            UserData.setMobilePhone((String) jsonObject.get("mobile phone"));
            UserData.setZip((String) jsonObject.get("zip"));
            UserData.setState((String) jsonObject.get("state"));
            UserData.setCity((String) jsonObject.get("city"));

        }

    }
}
