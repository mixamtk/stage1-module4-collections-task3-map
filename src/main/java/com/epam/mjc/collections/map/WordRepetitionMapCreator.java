package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        if (!sentence.isEmpty()) {
            String delimiter = " ";
            String emptyStr = "";
            String comma = ",";
            String dot = "\\.";
            String workStr = sentence.strip()
                    .replaceAll(comma, emptyStr)
                    .replaceAll(dot, emptyStr);
            String[] arrWord = workStr.split(delimiter);
            String putWord;
            for (String word : arrWord) {
                putWord = word.toLowerCase();
                Integer value = result.putIfAbsent(putWord, 1);
                if (value != null) result.put(putWord, ++value);

            }
        }
        return result;
    }
}
