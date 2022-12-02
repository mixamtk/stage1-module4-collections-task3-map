package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map <String, Integer> result = new TreeMap<>();
        for (Integer key : sourceMap.keySet()) {
            result.put(sourceMap.get(key), key);
        }
        return result;
    }
}
