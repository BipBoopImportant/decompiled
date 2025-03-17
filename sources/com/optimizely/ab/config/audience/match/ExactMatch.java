package com.optimizely.ab.config.audience.match;

import FE.C12869a;

class ExactMatch implements Match {
    ExactMatch() {
    }

    public Boolean eval(Object obj, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (C12869a.a(obj2)) {
            if (!C12869a.a(obj)) {
                return null;
            }
            return Boolean.valueOf(NumberComparator.compareUnsafe(obj2, obj) == 0);
        } else if (!(obj instanceof String) && !(obj instanceof Boolean)) {
            throw new UnexpectedValueTypeException();
        } else if (obj2.getClass() != obj.getClass()) {
            return null;
        } else {
            return Boolean.valueOf(obj.equals(obj2));
        }
    }
}
