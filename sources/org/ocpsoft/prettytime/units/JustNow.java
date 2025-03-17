package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

public class JustNow extends ResourcesTimeUnit {
    public JustNow() {
        e(60000);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "JustNow";
    }
}
