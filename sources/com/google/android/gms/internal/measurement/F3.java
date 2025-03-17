package com.google.android.gms.internal.measurement;

import android.util.Log;

final class F3 extends B3<Boolean> {
    F3(K3 k32, String str, Boolean bool, boolean z10) {
        super(k32, str, bool);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object g(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (Z2.f48839c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (Z2.f48840d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String k10 = super.k();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid boolean value for " + k10 + ": " + valueOf);
        return null;
    }
}
