package com.optimizely.ab.event.internal.payload;

import DE.C12747b;
import java.util.List;

public class EventBatch {
    String accountId;
    Boolean anonymizeIp;
    String clientName;
    String clientVersion;
    Boolean enrichDecisions;
    String projectId;
    String revision;
    List<Visitor> visitors;

    public static class Builder {
        private String accountId;
        private Boolean anonymizeIp;
        private String clientName = ClientEngine.JAVA_SDK.getClientEngineValue();
        private String clientVersion = C12747b.a();
        private String projectId;
        private String revision;
        private List<Visitor> visitors;

        public EventBatch build() {
            return new EventBatch(this.clientName, this.clientVersion, this.accountId, this.visitors, this.anonymizeIp, this.projectId, this.revision);
        }

        public Builder setAccountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder setAnonymizeIp(Boolean bool) {
            this.anonymizeIp = bool;
            return this;
        }

        public Builder setClientName(String str) {
            this.clientName = str;
            return this;
        }

        public Builder setClientVersion(String str) {
            this.clientVersion = str;
            return this;
        }

        public Builder setProjectId(String str) {
            this.projectId = str;
            return this;
        }

        public Builder setRevision(String str) {
            this.revision = str;
            return this;
        }

        public Builder setVisitors(List<Visitor> list) {
            this.visitors = list;
            return this;
        }
    }

    public enum ClientEngine {
        JAVA_SDK("java-sdk"),
        ANDROID_SDK("android-sdk"),
        ANDROID_TV_SDK("android-tv-sdk");
        
        private final String clientEngineValue;

        private ClientEngine(String str) {
            this.clientEngineValue = str;
        }

        public String getClientEngineValue() {
            return this.clientEngineValue;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventBatch eventBatch = (EventBatch) obj;
        if (!this.accountId.equals(eventBatch.accountId) || !this.visitors.equals(eventBatch.visitors)) {
            return false;
        }
        Boolean bool = this.anonymizeIp;
        if (bool == null ? eventBatch.anonymizeIp != null : !bool.equals(eventBatch.anonymizeIp)) {
            return false;
        }
        String str = this.clientName;
        if (str == null ? eventBatch.clientName != null : !str.equals(eventBatch.clientName)) {
            return false;
        }
        String str2 = this.clientVersion;
        if (str2 == null ? eventBatch.clientVersion != null : !str2.equals(eventBatch.clientVersion)) {
            return false;
        }
        String str3 = this.projectId;
        if (str3 == null ? eventBatch.projectId != null : !str3.equals(eventBatch.projectId)) {
            return false;
        }
        String str4 = this.revision;
        String str5 = eventBatch.revision;
        return str4 != null ? str4.equals(str5) : str5 == null;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Boolean getAnonymizeIp() {
        return this.anonymizeIp;
    }

    public String getClientName() {
        return this.clientName;
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public Boolean getEnrichDecisions() {
        return this.enrichDecisions;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public String getRevision() {
        return this.revision;
    }

    public List<Visitor> getVisitors() {
        return this.visitors;
    }

    public int hashCode() {
        int hashCode = ((this.accountId.hashCode() * 31) + this.visitors.hashCode()) * 31;
        Boolean bool = this.anonymizeIp;
        int i10 = 0;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.clientName;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.clientVersion;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.projectId;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.revision;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode5 + i10;
    }

    public void setAccountId(String str) {
        this.accountId = str;
    }

    public void setAnonymizeIp(Boolean bool) {
        this.anonymizeIp = bool;
    }

    public void setClientName(String str) {
        this.clientName = str;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    public void setEnrichDecisions(Boolean bool) {
        this.enrichDecisions = bool;
    }

    public void setProjectId(String str) {
        this.projectId = str;
    }

    public void setRevision(String str) {
        this.revision = str;
    }

    public void setVisitors(List<Visitor> list) {
        this.visitors = list;
    }

    public EventBatch() {
    }

    private EventBatch(String str, String str2, String str3, List<Visitor> list, Boolean bool, String str4, String str5) {
        this.accountId = str3;
        this.visitors = list;
        this.enrichDecisions = Boolean.TRUE;
        this.anonymizeIp = bool;
        this.clientName = str;
        this.clientVersion = str2;
        this.projectId = str4;
        this.revision = str5;
    }
}
