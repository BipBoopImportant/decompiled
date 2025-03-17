package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

public class Second extends ResourcesTimeUnit {
    public Second() {
        f(1000);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "Second";
    }
}
