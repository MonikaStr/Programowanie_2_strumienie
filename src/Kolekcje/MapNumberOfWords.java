package Kolekcje;

import java.util.HashMap;
import java.util.Map;

public class MapNumberOfWords {

    Map<String, Integer> map = new HashMap<>();

    public Map<String, Integer> numberOfWords(String sentence) {
        String[] tableOfWords = sentence.split(" ");
        for (String s : tableOfWords) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            }
            else {
                map.put(s, map.get(s) + 1);
            }
        }
        return map;
    }
}
