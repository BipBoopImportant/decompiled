package com.optimizely.ab.config;

public class FeatureVariableUsageInstance implements IdMapped {

    /* renamed from: id  reason: collision with root package name */
    private final String f122311id;
    private final String value;

    public FeatureVariableUsageInstance(String str, String str2) {
        this.f122311id = str;
        this.value = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FeatureVariableUsageInstance featureVariableUsageInstance = (FeatureVariableUsageInstance) obj;
        return this.f122311id.equals(featureVariableUsageInstance.f122311id) && this.value.equals(featureVariableUsageInstance.value);
    }

    public String getId() {
        return this.f122311id;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.f122311id.hashCode() * 31) + this.value.hashCode();
    }
}
