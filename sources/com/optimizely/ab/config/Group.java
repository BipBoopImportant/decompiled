package com.optimizely.ab.config;

import java.util.ArrayList;
import java.util.List;

public class Group implements IdMapped {
    public static final String RANDOM_POLICY = "random";
    private final List<Experiment> experiments;

    /* renamed from: id  reason: collision with root package name */
    private final String f122312id;
    private final String policy;
    private final List<TrafficAllocation> trafficAllocation;

    public Group(String str, String str2, List<Experiment> list, List<TrafficAllocation> list2) {
        this.f122312id = str;
        this.policy = str2;
        this.trafficAllocation = list2;
        this.experiments = new ArrayList(list.size());
        for (Experiment next : list) {
            if (str != null && !str.equals(next.getGroupId())) {
                next = new Experiment(next.getId(), next.getKey(), next.getStatus(), next.getLayerId(), next.getAudienceIds(), next.getAudienceConditions(), next.getVariations(), next.getUserIdToVariationKeyMap(), next.getTrafficAllocation(), str);
            }
            this.experiments.add(next);
        }
    }

    public List<Experiment> getExperiments() {
        return this.experiments;
    }

    public String getId() {
        return this.f122312id;
    }

    public String getPolicy() {
        return this.policy;
    }

    public List<TrafficAllocation> getTrafficAllocation() {
        return this.trafficAllocation;
    }

    public String toString() {
        return "Group{id='" + this.f122312id + '\'' + ", policy='" + this.policy + '\'' + ", experiments=" + this.experiments + ", trafficAllocation=" + this.trafficAllocation + '}';
    }
}
