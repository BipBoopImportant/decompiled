package com.optimizely.ab.config.audience.match;

public interface Match {
    Boolean eval(Object obj, Object obj2);
}
