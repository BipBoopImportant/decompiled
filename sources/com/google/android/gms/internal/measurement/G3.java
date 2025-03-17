package com.google.android.gms.internal.measurement;

import android.util.Log;

final class G3 extends B3<Long> {
    G3(K3 k32, String str, Long l10, boolean z10) {
        super(k32, str, l10);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final Long g(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String k10 = super.k();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid long value for " + k10 + ": " + valueOf);
        return null;
    }
}
