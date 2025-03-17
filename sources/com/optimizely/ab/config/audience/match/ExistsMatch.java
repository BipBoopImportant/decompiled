package com.optimizely.ab.config.audience.match;

class ExistsMatch implements Match {
    ExistsMatch() {
    }

    public Boolean eval(Object obj, Object obj2) {
        return Boolean.valueOf(obj2 != null);
    }
}
