import java.util.*;

public class TaskWithMap {
    public static void main(String[] args) {
    }

    public static Map<String,Integer> stringsCount(List<String> strings){
        Map<String,Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, Collections.frequency(strings,str));
        }
        return map;
    }
}
