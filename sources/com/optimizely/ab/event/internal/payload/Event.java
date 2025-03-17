package com.optimizely.ab.event.internal.payload;

import java.util.Map;

public class Event {
    String entityId;
    String key;
    Number quantity;
    Number revenue;
    Map<String, ?> tags;
    long timestamp;
    String type;
    String uuid;
    Number value;

    public static class Builder {
        private String entityId;
        private String key;
        private Number quantity = null;
        private Number revenue = null;
        private Map<String, ?> tags = null;
        private long timestamp;
        private String type;
        private String uuid;
        private Number value = null;

        public Event build() {
            return new Event(this.timestamp, this.uuid, this.entityId, this.key, this.quantity, this.revenue, this.tags, this.type, this.value);
        }

        public Builder setEntityId(String str) {
            this.entityId = str;
            return this;
        }

        public Builder setKey(String str) {
            this.key = str;
            return this;
        }

        public Builder setQuantity(Number number) {
            this.quantity = number;
            return this;
        }

        public Builder setRevenue(Number number) {
            this.revenue = number;
            return this;
        }

        public Builder setTags(Map<String, ?> map) {
            this.tags = map;
            return this;
        }

        public Builder setTimestamp(long j10) {
            this.timestamp = j10;
            return this;
        }

        public Builder setType(String str) {
            this.type = str;
            return this;
        }

        public Builder setUuid(String str) {
            this.uuid = str;
            return this;
        }

        public Builder setValue(Number number) {
            this.value = number;
            return this;
        }
    }

    public Event() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Event event = (Event) obj;
        if (this.timestamp != event.timestamp || !this.uuid.equals(event.uuid)) {
            return false;
        }
        String str = this.entityId;
        if (str == null ? event.entityId != null : !str.equals(event.entityId)) {
            return false;
        }
        String str2 = this.key;
        if (str2 == null ? event.key != null : !str2.equals(event.key)) {
            return false;
        }
        Number number = this.quantity;
        if (number == null ? event.quantity != null : !number.equals(event.quantity)) {
            return false;
        }
        Number number2 = this.revenue;
        if (number2 == null ? event.revenue != null : !number2.equals(event.revenue)) {
            return false;
        }
        Map<String, ?> map = this.tags;
        if (map == null ? event.tags != null : !map.equals(event.tags)) {
            return false;
        }
        if (!this.type.equals(event.type)) {
            return false;
        }
        Number number3 = this.value;
        Number number4 = event.value;
        return number3 != null ? number3.equals(number4) : number4 == null;
    }

    public String getEntityId() {
        return this.entityId;
    }

    public String getKey() {
        return this.key;
    }

    public Number getQuantity() {
        return this.quantity;
    }

    public Number getRevenue() {
        return this.revenue;
    }

    public Map<String, ?> getTags() {
        return this.tags;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }

    public String getUuid() {
        return this.uuid;
    }

    public Number getValue() {
        return this.value;
    }

    public int hashCode() {
        long j10 = this.timestamp;
        int hashCode = ((((int) (j10 ^ (j10 >>> 32))) * 31) + this.uuid.hashCode()) * 31;
        String str = this.entityId;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.key;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Number number = this.quantity;
        int hashCode4 = (hashCode3 + (number != null ? number.hashCode() : 0)) * 31;
        Number number2 = this.revenue;
        int hashCode5 = (hashCode4 + (number2 != null ? number2.hashCode() : 0)) * 31;
        Map<String, ?> map = this.tags;
        int hashCode6 = (((hashCode5 + (map != null ? map.hashCode() : 0)) * 31) + this.type.hashCode()) * 31;
        Number number3 = this.value;
        if (number3 != null) {
            i10 = number3.hashCode();
        }
        return hashCode6 + i10;
    }

    public void setEntityId(String str) {
        this.entityId = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setQuantity(Number number) {
        this.quantity = number;
    }

    public void setRevenue(Number number) {
        this.revenue = number;
    }

    public void setTags(Map<String, ?> map) {
        this.tags = map;
    }

    public void setTimestamp(long j10) {
        this.timestamp = j10;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setValue(Number number) {
        this.value = number;
    }

    public Event(long j10, String str, String str2, String str3, Number number, Number number2, Map<String, ?> map, String str4, Number number3) {
        this.timestamp = j10;
        this.uuid = str;
        this.entityId = str2;
        this.key = str3;
        this.quantity = number;
        this.revenue = number2;
        this.tags = map;
        this.type = str4;
        this.value = number3;
    }
}
