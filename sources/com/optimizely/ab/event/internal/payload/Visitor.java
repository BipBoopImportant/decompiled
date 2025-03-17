package com.optimizely.ab.event.internal.payload;

import java.util.List;

public class Visitor {
    List<Attribute> attributes;
    String sessionId;
    List<Snapshot> snapshots;
    String visitorId;

    public static class Builder {
        private List<Attribute> attributes;
        private String sessionId = null;
        private List<Snapshot> snapshots;
        private String visitorId;

        public Visitor build() {
            return new Visitor(this.visitorId, this.sessionId, this.attributes, this.snapshots);
        }

        public Builder setAttributes(List<Attribute> list) {
            this.attributes = list;
            return this;
        }

        public Builder setSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        public Builder setSnapshots(List<Snapshot> list) {
            this.snapshots = list;
            return this;
        }

        public Builder setVisitorId(String str) {
            this.visitorId = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Visitor visitor = (Visitor) obj;
        if (!this.visitorId.equals(visitor.visitorId)) {
            return false;
        }
        String str = this.sessionId;
        if (str == null ? visitor.sessionId != null : !str.equals(visitor.sessionId)) {
            return false;
        }
        List<Attribute> list = this.attributes;
        if (list == null ? visitor.attributes == null : list.equals(visitor.attributes)) {
            return this.snapshots.equals(visitor.snapshots);
        }
        return false;
    }

    public List<Attribute> getAttributes() {
        return this.attributes;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public List<Snapshot> getSnapshots() {
        return this.snapshots;
    }

    public String getVisitorId() {
        return this.visitorId;
    }

    public int hashCode() {
        int hashCode = this.visitorId.hashCode() * 31;
        String str = this.sessionId;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<Attribute> list = this.attributes;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((hashCode2 + i10) * 31) + this.snapshots.hashCode();
    }

    public void setAttributes(List<Attribute> list) {
        this.attributes = list;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setSnapshots(List<Snapshot> list) {
        this.snapshots = list;
    }

    public void setVisitorId(String str) {
        this.visitorId = str;
    }

    public Visitor() {
    }

    private Visitor(String str, String str2, List<Attribute> list, List<Snapshot> list2) {
        this.visitorId = str;
        this.sessionId = str2;
        this.attributes = list;
        this.snapshots = list2;
    }
}
