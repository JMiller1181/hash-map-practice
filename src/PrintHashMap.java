import java.util.HashMap;

public class PrintHashMap {
    public static void printKeys(HashMap<String,String> hashmap){
        for (String key: hashmap.keySet()) {
            System.out.println(key);
        }
    }
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for (String key: hashmap.keySet()) {
            if(key.contains(text)){
                System.out.println(hashmap.get(key));
            }
        }
    }
    public static void main(String[] args){
        HashMap<String,String> map = new HashMap<>();
        map.put("first", "one");
        map.put("second", "two");
        map.put("third", "three");
        printKeys(map);
        printKeysWhere(map, "i");
        printValuesOfKeysWhere(map, "i");
    }
}
