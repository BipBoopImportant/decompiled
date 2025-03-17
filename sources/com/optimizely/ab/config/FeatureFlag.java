package com.optimizely.ab.config;

import java.util.List;
import java.util.Map;

public class FeatureFlag implements IdKeyMapped {
    private final List<String> experimentIds;

    /* renamed from: id  reason: collision with root package name */
    private final String f122309id;
    private final String key;
    private final String rolloutId;
    private final Map<String, FeatureVariable> variableKeyToFeatureVariableMap;
    private final List<FeatureVariable> variables;

    public FeatureFlag(String str, String str2, String str3, List<String> list, List<FeatureVariable> list2) {
        this.f122309id = str;
        this.key = str2;
        this.rolloutId = str3;
        this.experimentIds = list;
        this.variables = list2;
        this.variableKeyToFeatureVariableMap = ProjectConfigUtils.generateNameMapping(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FeatureFlag featureFlag = (FeatureFlag) obj;
        if (this.f122309id.equals(featureFlag.f122309id) && this.key.equals(featureFlag.key) && this.rolloutId.equals(featureFlag.rolloutId) && this.experimentIds.equals(featureFlag.experimentIds) && this.variables.equals(featureFlag.variables)) {
            return this.variableKeyToFeatureVariableMap.equals(featureFlag.variableKeyToFeatureVariableMap);
        }
        return false;
    }

    public List<String> getExperimentIds() {
        return this.experimentIds;
    }

    public String getId() {
        return this.f122309id;
    }

    public String getKey() {
        return this.key;
    }

    public String getRolloutId() {
        return this.rolloutId;
    }

    public Map<String, FeatureVariable> getVariableKeyToFeatureVariableMap() {
        return this.variableKeyToFeatureVariableMap;
    }

    public List<FeatureVariable> getVariables() {
        return this.variables;
    }

    public int hashCode() {
        return (((((((((this.f122309id.hashCode() * 31) + this.key.hashCode()) * 31) + this.rolloutId.hashCode()) * 31) + this.experimentIds.hashCode()) * 31) + this.variables.hashCode()) * 31) + this.variableKeyToFeatureVariableMap.hashCode();
    }

    public String toString() {
        return "FeatureFlag{id='" + this.f122309id + '\'' + ", key='" + this.key + '\'' + ", rolloutId='" + this.rolloutId + '\'' + ", experimentIds=" + this.experimentIds + ", variables=" + this.variables + ", variableKeyToFeatureVariableMap=" + this.variableKeyToFeatureVariableMap + '}';
    }
}
