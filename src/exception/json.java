package exception;

import org.json.JSONObject;

public class json {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("name", "Tien");
        obj.put("age",24);
        System.out.println(obj.toString());
    }
}
