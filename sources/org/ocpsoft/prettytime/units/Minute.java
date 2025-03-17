package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

public class Minute extends ResourcesTimeUnit {
    public Minute() {
        f(60000);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "Minute";
    }
}
