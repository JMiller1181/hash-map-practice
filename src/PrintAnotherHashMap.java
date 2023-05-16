import java.util.HashMap;
public class PrintAnotherHashMap {
    public static void printValues(HashMap<String,Book> hashmap){
        for(String key: hashmap.keySet()){
            System.out.println(hashmap.get(key));
        }
    }
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for(String key: hashmap.keySet()){
            if(hashmap.get(key).getName().contains(text)){
            System.out.println(hashmap.get(key));
            }
        }
    }
    public static void main(String[] args){
        Book book = new Book("A book", 1999, "words");
        Book book1 = new Book("Another Book", 1979, "More Words");
        Book dictionary = new Book("The Dictionary", 2023, "No words");
        HashMap<String, Book> hashMap = new HashMap<>();
        hashMap.put("first",book);
        hashMap.put("second", book1);
        hashMap.put("third", dictionary);
        printValues(hashMap);
        printValueIfNameContains(hashMap, "i");
    }
}

