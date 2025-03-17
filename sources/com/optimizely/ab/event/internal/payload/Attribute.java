package com.optimizely.ab.event.internal.payload;

public class Attribute {
    public static final String CUSTOM_ATTRIBUTE_TYPE = "custom";
    public static final String CUSTOM_EVENT_TYPE = "custom";
    String entityId;
    String key;
    String type;
    Object value;

    public static class Builder {
        private String entityId;
        private String key;
        private String type;
        private Object value;

        public Attribute build() {
            return new Attribute(this.entityId, this.key, this.type, this.value);
        }

        public Builder setEntityId(String str) {
            this.entityId = str;
            return this;
        }

        public Builder setKey(String str) {
            this.key = str;
            return this;
        }

        public Builder setType(String str) {
            this.type = str;
            return this;
        }

        public Builder setValue(Object obj) {
            this.value = obj;
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
        Attribute attribute = (Attribute) obj;
        if (this.entityId.equals(attribute.entityId) && this.key.equals(attribute.key) && this.type.equals(attribute.type)) {
            return this.value.equals(attribute.value);
        }
        return false;
    }

    public String getEntityId() {
        return this.entityId;
    }

    public String getKey() {
        return this.key;
    }

    public String getType() {
        return this.type;
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((this.entityId.hashCode() * 31) + this.key.hashCode()) * 31) + this.type.hashCode()) * 31) + this.value.hashCode();
    }

    public void setEntityId(String str) {
        this.entityId = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public Attribute() {
    }

    private Attribute(String str, String str2, String str3, Object obj) {
        this.entityId = str;
        this.key = str2;
        this.type = str3;
        this.value = obj;
    }
}
