package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

public class Month extends ResourcesTimeUnit {
    public Month() {
        f(2629743830L);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "Month";
    }
}
