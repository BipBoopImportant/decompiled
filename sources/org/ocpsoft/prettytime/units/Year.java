package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

public class Year extends ResourcesTimeUnit {
    public Year() {
        f(31556925960L);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "Year";
    }
}
