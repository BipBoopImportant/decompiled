package com.optimizely.ab.config.audience.match;

class SemanticVersionLTMatch implements Match {
    SemanticVersionLTMatch() {
    }

    public Boolean eval(Object obj, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        return Boolean.valueOf(SemanticVersion.compare(obj2, obj) < 0);
    }
}
