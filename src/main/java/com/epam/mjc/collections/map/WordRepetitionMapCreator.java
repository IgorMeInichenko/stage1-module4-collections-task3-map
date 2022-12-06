package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String,Integer> result = new HashMap<>();
        for (String sX: sentence.split("\\W+")){
            if (!Objects.equals(sX, "")){
                String s = sX.toLowerCase();
                if (result.containsKey(s)){
                    result.put(s,result.get(s)+1);
                }
                else {
                    result.put(s.toLowerCase(), 1);
                }
            }
        }
        return result;
    }
}
