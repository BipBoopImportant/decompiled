package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

public class Millennium extends ResourcesTimeUnit {
    public Millennium() {
        f(31556926000000L);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "Millennium";
    }
}
