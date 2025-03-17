package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

public class Week extends ResourcesTimeUnit {
    public Week() {
        f(604800000);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "Week";
    }
}
