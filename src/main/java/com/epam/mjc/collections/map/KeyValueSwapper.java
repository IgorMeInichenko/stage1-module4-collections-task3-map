package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;


public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            if (result.containsKey(entry.getValue())) {
                if (result.get(entry.getValue()) > entry.getKey()) {
                    result.put(entry.getValue(), entry.getKey());
                }
            }
            else{
                result.put(entry.getValue(), entry.getKey());
            }
        }
        return result;
    }
}
