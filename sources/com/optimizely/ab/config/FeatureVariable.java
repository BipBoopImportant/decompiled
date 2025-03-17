package com.optimizely.ab.config;

public class FeatureVariable implements IdKeyMapped {
    public static final String BOOLEAN_TYPE = "boolean";
    public static final String DOUBLE_TYPE = "double";
    public static final String INTEGER_TYPE = "integer";
    public static final String JSON_TYPE = "json";
    public static final String STRING_TYPE = "string";
    private final String defaultValue;

    /* renamed from: id  reason: collision with root package name */
    private final String f122310id;
    private final String key;
    private final VariableStatus status;
    private final String subType;
    private final String type;

    public enum VariableStatus {
        ACTIVE("active"),
        ARCHIVED("archived");
        
        private final String variableStatus;

        private VariableStatus(String str) {
            this.variableStatus = str;
        }

        public static VariableStatus fromString(String str) {
            if (str == null) {
                return null;
            }
            for (VariableStatus variableStatus2 : values()) {
                if (str.equals(variableStatus2.getVariableStatus())) {
                    return variableStatus2;
                }
            }
            return null;
        }

        public String getVariableStatus() {
            return this.variableStatus;
        }
    }

    public FeatureVariable(String str, String str2, String str3, VariableStatus variableStatus, String str4, String str5) {
        this.f122310id = str;
        this.key = str2;
        this.defaultValue = str3;
        this.status = variableStatus;
        this.type = str4;
        this.subType = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FeatureVariable featureVariable = (FeatureVariable) obj;
        if (this.f122310id.equals(featureVariable.f122310id) && this.key.equals(featureVariable.key) && this.defaultValue.equals(featureVariable.defaultValue) && this.type.equals(featureVariable.type)) {
            return this.status == featureVariable.status;
        }
        return false;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public String getId() {
        return this.f122310id;
    }

    public String getKey() {
        return this.key;
    }

    public VariableStatus getStatus() {
        return this.status;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r2.subType;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType() {
        /*
            r2 = this;
            java.lang.String r0 = r2.type
            java.lang.String r1 = "string"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r2.subType
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = "json"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0017
            return r1
        L_0x0017:
            java.lang.String r0 = r2.type
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.optimizely.ab.config.FeatureVariable.getType():java.lang.String");
    }

    public int hashCode() {
        int hashCode = ((((((this.f122310id.hashCode() * 31) + this.key.hashCode()) * 31) + this.defaultValue.hashCode()) * 31) + this.type.hashCode()) * 31;
        String str = this.subType;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        VariableStatus variableStatus = this.status;
        if (variableStatus != null) {
            i10 = variableStatus.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "FeatureVariable{id='" + this.f122310id + '\'' + ", key='" + this.key + '\'' + ", defaultValue='" + this.defaultValue + '\'' + ", type=" + this.type + ", subType=" + this.subType + ", status=" + this.status + '}';
    }
}
