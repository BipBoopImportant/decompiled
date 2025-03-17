package com.optimizely.ab.event.internal.payload;

public class Decision {
    String campaignId;
    String experimentId;
    boolean isCampaignHoldback;
    DecisionMetadata metadata;
    String variationId;

    public static class Builder {
        private String campaignId;
        private String experimentId;
        private boolean isCampaignHoldback;
        private DecisionMetadata metadata;
        private String variationId;

        public Decision build() {
            return new Decision(this.campaignId, this.experimentId, this.variationId, this.isCampaignHoldback, this.metadata);
        }

        public Builder setCampaignId(String str) {
            this.campaignId = str;
            return this;
        }

        public Builder setExperimentId(String str) {
            this.experimentId = str;
            return this;
        }

        public Builder setIsCampaignHoldback(boolean z10) {
            this.isCampaignHoldback = z10;
            return this;
        }

        public Builder setMetadata(DecisionMetadata decisionMetadata) {
            this.metadata = decisionMetadata;
            return this;
        }

        public Builder setVariationId(String str) {
            this.variationId = str;
            return this;
        }
    }

    public Decision() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Decision decision = (Decision) obj;
        if (this.isCampaignHoldback == decision.isCampaignHoldback && this.campaignId.equals(decision.campaignId) && this.experimentId.equals(decision.experimentId)) {
            return this.variationId.equals(decision.variationId);
        }
        return false;
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public String getExperimentId() {
        return this.experimentId;
    }

    public boolean getIsCampaignHoldback() {
        return this.isCampaignHoldback;
    }

    public DecisionMetadata getMetadata() {
        return this.metadata;
    }

    public String getVariationId() {
        return this.variationId;
    }

    public int hashCode() {
        return (((((((this.campaignId.hashCode() * 31) + this.experimentId.hashCode()) * 31) + this.variationId.hashCode()) * 31) + this.metadata.hashCode()) * 31) + (this.isCampaignHoldback ? 1 : 0);
    }

    public Decision(String str, String str2, String str3, boolean z10, DecisionMetadata decisionMetadata) {
        this.campaignId = str;
        this.experimentId = str2;
        this.variationId = str3;
        this.isCampaignHoldback = z10;
        this.metadata = decisionMetadata;
    }
}
