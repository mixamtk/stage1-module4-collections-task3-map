package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        boolean result = false;
        for (Integer key: functionMap.keySet()) {
            if (functionMap.get(key) == requiredValue) result = true;
        }
    return result;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer elem: sourceList) {
            result.put(elem, 5 * elem + 2);
        }
        return result;
    }
}
