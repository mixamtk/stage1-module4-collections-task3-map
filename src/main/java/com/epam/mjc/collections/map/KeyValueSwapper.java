package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map <String, Integer> result = new HashMap<>();
        for (Integer key: sourceMap.keySet())
            result.put(sourceMap.get(key), key);
        return result;
    }
}
