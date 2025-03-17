package com.optimizely.ab.config.audience.match;

class DefaultMatchForLegacyAttributes implements Match {
    DefaultMatchForLegacyAttributes() {
    }

    public Boolean eval(Object obj, Object obj2) {
        if (obj instanceof String) {
            return obj2 == null ? Boolean.FALSE : Boolean.valueOf(obj.toString().equals(obj2.toString()));
        }
        throw new UnexpectedValueTypeException();
    }
}
