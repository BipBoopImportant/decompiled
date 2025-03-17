package com.optimizely.ab.config;

public class TrafficAllocation {
    private final int endOfRange;
    private final String entityId;

    public TrafficAllocation(String str, int i10) {
        this.entityId = str;
        this.endOfRange = i10;
    }

    public int getEndOfRange() {
        return this.endOfRange;
    }

    public String getEntityId() {
        return this.entityId;
    }

    public String toString() {
        return "TrafficAllocation{entityId='" + this.entityId + '\'' + ", endOfRange=" + this.endOfRange + '}';
    }
}
