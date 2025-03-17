package com.optimizely.ab.config;

public class Attribute implements IdKeyMapped {

    /* renamed from: id  reason: collision with root package name */
    private final String f122306id;
    private final String key;
    private final String segmentId;

    public Attribute(String str, String str2) {
        this(str, str2, (String) null);
    }

    public String getId() {
        return this.f122306id;
    }

    public String getKey() {
        return this.key;
    }

    public String getSegmentId() {
        return this.segmentId;
    }

    public String toString() {
        return "Attribute{id='" + this.f122306id + '\'' + ", key='" + this.key + '\'' + ", segmentId='" + this.segmentId + '\'' + '}';
    }

    public Attribute(String str, String str2, String str3) {
        this.f122306id = str;
        this.key = str2;
        this.segmentId = str3;
    }
}
