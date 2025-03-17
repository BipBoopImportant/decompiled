package com.optimizely.ab.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectConfigUtils {
    public static Map<String, List<String>> generateExperimentFeatureMapping(List<FeatureFlag> list) {
        HashMap hashMap = new HashMap();
        for (FeatureFlag next : list) {
            for (String next2 : next.getExperimentIds()) {
                if (hashMap.containsKey(next2)) {
                    ((List) hashMap.get(next2)).add(next.getKey());
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next.getKey());
                    hashMap.put(next2, arrayList);
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static <T extends IdMapped> Map<String, T> generateIdMapping(List<T> list) {
        HashMap hashMap = new HashMap();
        for (T t10 : list) {
            hashMap.put(t10.getId(), t10);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static <T extends IdKeyMapped> Map<String, T> generateNameMapping(List<T> list) {
        HashMap hashMap = new HashMap();
        for (T t10 : list) {
            hashMap.put(t10.getKey(), t10);
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
