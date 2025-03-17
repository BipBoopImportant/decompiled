package com.google.android.gms.internal.measurement;

import android.util.Log;

final class I3 extends B3<Double> {
    I3(K3 k32, String str, Double d10, boolean z10) {
        super(k32, str, d10);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final Double g(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String k10 = super.k();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid double value for " + k10 + ": " + valueOf);
        return null;
    }
}
