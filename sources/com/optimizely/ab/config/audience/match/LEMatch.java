package com.optimizely.ab.config.audience.match;

class LEMatch implements Match {
    LEMatch() {
    }

    public Boolean eval(Object obj, Object obj2) {
        return Boolean.valueOf(NumberComparator.compare(obj2, obj) <= 0);
    }
}
