package com.optimizely.ab.bucketing;

import com.optimizely.ab.config.Experiment;
import com.optimizely.ab.config.Variation;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public Experiment f122301a;

    /* renamed from: b  reason: collision with root package name */
    public Variation f122302b;

    /* renamed from: c  reason: collision with root package name */
    public a f122303c;

    public enum a {
        FEATURE_TEST("feature-test"),
        ROLLOUT("rollout");
        
        private final String key;

        private a(String str) {
            this.key = str;
        }

        public String toString() {
            return this.key;
        }
    }

    public c(Experiment experiment, Variation variation, a aVar) {
        this.f122301a = experiment;
        this.f122302b = variation;
        this.f122303c = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        Variation variation = this.f122302b;
        if (variation == null ? cVar.f122302b == null : variation.equals(cVar.f122302b)) {
            return this.f122303c == cVar.f122303c;
        }
        return false;
    }

    public int hashCode() {
        Variation variation = this.f122302b;
        int i10 = 0;
        int hashCode = (variation != null ? variation.hashCode() : 0) * 31;
        a aVar = this.f122303c;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode + i10;
    }
}
