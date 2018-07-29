package Kolekcje;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LettersWithIndices {

    private Map<Character, List<Integer>> map = new HashMap<>();


    public void showLettersWithIndices(String input) {
        input.trim();
        char[] tabWithLetters = input.toCharArray();

        for (int i = 0; i < tabWithLetters.length; i++) {
            if (!map.containsKey(tabWithLetters[i])) {
                map.put(tabWithLetters[i], new ArrayList<Integer>());
                map.get(tabWithLetters[i]).add(i);
            }
            else {
                map.get(tabWithLetters[i]).add(i);
            }
        }
    }

}
