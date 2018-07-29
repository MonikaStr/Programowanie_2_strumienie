package Kolekcje;

import java.util.HashMap;
import java.util.Map;

public class MapUniqueLetters {

    private Map<Character, Integer> map = new HashMap<>();
    private Map<String, Integer> mapOfInputs = new HashMap<>();

    public int uniqueLetters(String input) {

        if (mapOfInputs.containsKey(input)) {
            return mapOfInputs.get(input);
        } else {

            input = input.trim();
            char[] charsArray = input.toCharArray();

            int counter = 0;
            for (char c : charsArray) {
                if (!map.containsKey(c)) {
                    map.put(c, 1);
                    counter++;
                }
            }
            mapOfInputs.put(input, counter);
            return counter;
        }
    }


}

/*
2.	Napisz funkcję, która przyjmuje Stringa I zwróci liczbę unikalnych liter
(np. dla „Kopytko” funkcja powinna zwrócić 5). Zakładamy, że funkcja będzie często wywoływana z tymi sami wartościami,
więc chcemy zapamiętywać wyniki, aby, jeśli podany zostanie String już wcześniej napotkany, metoda zwróciła już wyliczony wynik.
 */