package com.optimizely.ab.event.internal.payload;

import java.util.List;

public class Snapshot {
    Long activationTimestamp;
    List<Decision> decisions;
    List<Event> events;

    public static class Builder {
        private List<Decision> decisions;
        private List<Event> events;

        public Snapshot build() {
            return new Snapshot(this.decisions, this.events);
        }

        public Builder setDecisions(List<Decision> list) {
            this.decisions = list;
            return this;
        }

        public Builder setEvents(List<Event> list) {
            this.events = list;
            return this;
        }
    }

    public Snapshot() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Snapshot snapshot = (Snapshot) obj;
        Long l10 = this.activationTimestamp;
        if (l10 == null ? snapshot.activationTimestamp != null : !l10.equals(snapshot.activationTimestamp)) {
            return false;
        }
        List<Decision> list = this.decisions;
        if (list == null ? snapshot.decisions == null : list.equals(snapshot.decisions)) {
            return this.events.equals(snapshot.events);
        }
        return false;
    }

    public Long getActivationTimestamp() {
        return this.activationTimestamp;
    }

    public List<Decision> getDecisions() {
        return this.decisions;
    }

    public List<Event> getEvents() {
        return this.events;
    }

    public int hashCode() {
        int hashCode = (this.decisions.hashCode() * 31) + this.events.hashCode();
        Long l10 = this.activationTimestamp;
        return l10 != null ? (hashCode * 31) + ((int) (l10.longValue() ^ (this.activationTimestamp.longValue() >>> 32))) : hashCode;
    }

    public void setActivationTimestamp(Long l10) {
        this.activationTimestamp = l10;
    }

    public void setDecisions(List<Decision> list) {
        this.decisions = list;
    }

    public void setEvents(List<Event> list) {
        this.events = list;
    }

    public Snapshot(List<Decision> list, List<Event> list2) {
        this.decisions = list;
        this.events = list2;
        this.activationTimestamp = null;
    }
}
