package bai4;

import java.util.HashMap;
import java.util.Map;

public class CountWordUsingMap {
    public static void main(String[] args) {
        String str = "Hello World Hello";
        Map<String, Integer> map = new HashMap<>();
        String[] words = str.split("\\s+");

        for(String word : words){
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }else {
                map.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
