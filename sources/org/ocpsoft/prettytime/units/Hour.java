package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

public class Hour extends ResourcesTimeUnit {
    public Hour() {
        f(3600000);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "Hour";
    }
}
