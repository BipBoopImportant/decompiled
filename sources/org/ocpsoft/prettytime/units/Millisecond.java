package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

public class Millisecond extends ResourcesTimeUnit {
    public Millisecond() {
        f(1);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "Millisecond";
    }
}
