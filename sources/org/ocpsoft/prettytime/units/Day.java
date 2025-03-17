package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

public class Day extends ResourcesTimeUnit {
    public Day() {
        f(86400000);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "Day";
    }
}
