package data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;


public class JsonParserClass {
    private static JSONParser parser = new JSONParser();
    private static JSONArray arr = null;
    public static String firstName;
    public static String lastName;
    public static String email;
    public static String password;
    public static String address;
    public static String mobilePhone;
    public static String zip;
    public static String state;
    public static String city;

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
            firstName = (String) jsonObject.get("first name");
            lastName = (String) jsonObject.get("last name");
            email = (String) jsonObject.get("email");
            password = (String) jsonObject.get("password");
            address = (String) jsonObject.get("address");
            mobilePhone = (String) jsonObject.get("mobile phone");
            zip = (String) jsonObject.get("zip");
            state = (String) jsonObject.get("state");
            city = (String) jsonObject.get("city");

        }

    }
}
