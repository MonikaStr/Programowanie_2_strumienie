package Kolekcje;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetUniqueLetters {

    private Set<Character> setUniqueLetters = new HashSet<>();
    private Map<String, Integer> mapOfInputs = new HashMap<>();

    public int numberOfUniqueLetters(String input) {

        if (mapOfInputs.containsKey(input)) {
            return mapOfInputs.get(input);}
            else {

        input = input.trim();
        char[] charsArray = input.toCharArray();

        for (char c : charsArray) {
            setUniqueLetters.add(c);
        }
        mapOfInputs.put(input, setUniqueLetters.size());
        return setUniqueLetters.size();
        }
    }

}
