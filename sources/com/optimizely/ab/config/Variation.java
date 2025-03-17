package com.optimizely.ab.config;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Variation implements IdKeyMapped {
    private final Boolean featureEnabled;
    private final List<FeatureVariableUsageInstance> featureVariableUsageInstances;

    /* renamed from: id  reason: collision with root package name */
    private final String f122317id;
    private final String key;
    private final Map<String, FeatureVariableUsageInstance> variableIdToFeatureVariableUsageInstanceMap;

    public Variation(String str, String str2) {
        this(str, str2, (List<FeatureVariableUsageInstance>) null);
    }

    public Boolean getFeatureEnabled() {
        return this.featureEnabled;
    }

    public List<FeatureVariableUsageInstance> getFeatureVariableUsageInstances() {
        return this.featureVariableUsageInstances;
    }

    public String getId() {
        return this.f122317id;
    }

    public String getKey() {
        return this.key;
    }

    public Map<String, FeatureVariableUsageInstance> getVariableIdToFeatureVariableUsageInstanceMap() {
        return this.variableIdToFeatureVariableUsageInstanceMap;
    }

    public boolean is(String str) {
        return this.key.equals(str);
    }

    public String toString() {
        return "Variation{id='" + this.f122317id + '\'' + ", key='" + this.key + '\'' + '}';
    }

    public Variation(String str, String str2, List<FeatureVariableUsageInstance> list) {
        this(str, str2, Boolean.FALSE, list);
    }

    public Variation(String str, String str2, Boolean bool, List<FeatureVariableUsageInstance> list) {
        this.f122317id = str;
        this.key = str2;
        if (bool != null) {
            this.featureEnabled = bool;
        } else {
            this.featureEnabled = Boolean.FALSE;
        }
        if (list == null) {
            this.featureVariableUsageInstances = Collections.emptyList();
        } else {
            this.featureVariableUsageInstances = list;
        }
        this.variableIdToFeatureVariableUsageInstanceMap = ProjectConfigUtils.generateIdMapping(this.featureVariableUsageInstances);
    }
}
