package com.optimizely.ab.config.audience.match;

class SubstringMatch implements Match {
    SubstringMatch() {
    }

    public Boolean eval(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            throw new UnexpectedValueTypeException();
        } else if (!(obj2 instanceof String)) {
            return null;
        } else {
            try {
                return Boolean.valueOf(obj2.toString().contains(obj.toString()));
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
