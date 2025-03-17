package com.optimizely.ab.config;

import java.util.List;

public class Rollout implements IdMapped {
    private final List<Experiment> experiments;

    /* renamed from: id  reason: collision with root package name */
    private final String f122316id;

    public Rollout(String str, List<Experiment> list) {
        this.f122316id = str;
        this.experiments = list;
    }

    public List<Experiment> getExperiments() {
        return this.experiments;
    }

    public String getId() {
        return this.f122316id;
    }

    public String toString() {
        return "Rollout{id='" + this.f122316id + '\'' + ", experiments=" + this.experiments + '}';
    }
}
