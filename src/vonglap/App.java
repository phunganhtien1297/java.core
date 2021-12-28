package vonglap;
import java.util.HashMap;

// HashMap<string, string> map = new HashMap<string, string>();
// HashMap là một tập hợp các cặp key-value
public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> maps = new HashMap<Integer, String>();
        maps.put(1, "java");
        maps.put(2, "PHP");
        maps.put(3, "reactjs");
        maps.put(1, "HTML");
        // key trùng nhau sẽ lấy key cuối
        //dựa vào key để lấy value
        for(int key : maps.keySet()){
            System.out.println("key= "+key + " value= "+maps.get(key));
        }
        // lấy tất cả value
        for(String value : maps.values()){
            System.out.println("value="+value);
        }
    }
}
