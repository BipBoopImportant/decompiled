package com.optimizely.ab.event.internal.payload;

import java.util.StringJoiner;

public class DecisionMetadata {
    boolean enabled;
    String flagKey;
    String ruleKey;
    String ruleType;
    String variationKey;

    public static class Builder {
        private boolean enabled;
        private String flagKey;
        private String ruleKey;
        private String ruleType;
        private String variationKey;

        public DecisionMetadata build() {
            return new DecisionMetadata(this.flagKey, this.ruleKey, this.ruleType, this.variationKey, this.enabled);
        }

        public Builder setEnabled(boolean z10) {
            this.enabled = z10;
            return this;
        }

        public Builder setFlagKey(String str) {
            this.flagKey = str;
            return this;
        }

        public Builder setRuleKey(String str) {
            this.ruleKey = str;
            return this;
        }

        public Builder setRuleType(String str) {
            this.ruleType = str;
            return this;
        }

        public Builder setVariationKey(String str) {
            this.variationKey = str;
            return this;
        }
    }

    public DecisionMetadata() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DecisionMetadata decisionMetadata = (DecisionMetadata) obj;
        if (this.ruleType.equals(decisionMetadata.ruleType) && this.ruleKey.equals(decisionMetadata.ruleKey) && this.flagKey.equals(decisionMetadata.flagKey) && this.enabled == decisionMetadata.enabled) {
            return this.variationKey.equals(decisionMetadata.variationKey);
        }
        return false;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public String getFlagKey() {
        return this.flagKey;
    }

    public String getRuleKey() {
        return this.ruleKey;
    }

    public String getRuleType() {
        return this.ruleType;
    }

    public String getVariationKey() {
        return this.variationKey;
    }

    public int hashCode() {
        return (((((this.ruleType.hashCode() * 31) + this.flagKey.hashCode()) * 31) + this.ruleKey.hashCode()) * 31) + this.variationKey.hashCode();
    }

    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", DecisionMetadata.class.getSimpleName() + "[", "]");
        StringJoiner add = stringJoiner.add("flagKey='" + this.flagKey + "'");
        StringJoiner add2 = add.add("ruleKey='" + this.ruleKey + "'");
        StringJoiner add3 = add2.add("ruleType='" + this.ruleType + "'");
        StringJoiner add4 = add3.add("variationKey='" + this.variationKey + "'");
        return add4.add("enabled=" + this.enabled).toString();
    }

    public DecisionMetadata(String str, String str2, String str3, String str4, boolean z10) {
        this.flagKey = str;
        this.ruleKey = str2;
        this.ruleType = str3;
        this.variationKey = str4;
        this.enabled = z10;
    }
}
