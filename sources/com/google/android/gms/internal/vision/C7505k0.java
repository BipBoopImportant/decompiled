package com.google.android.gms.internal.vision;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.vision.k0  reason: case insensitive filesystem */
final class C7505k0 implements Comparator<C7497i0> {
    C7505k0() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C7497i0 i0Var = (C7497i0) obj;
        C7497i0 i0Var2 = (C7497i0) obj2;
        C7517n0 n0Var = (C7517n0) i0Var.iterator();
        C7517n0 n0Var2 = (C7517n0) i0Var2.iterator();
        while (n0Var.hasNext() && n0Var2.hasNext()) {
            int compare = Integer.compare(C7497i0.x(n0Var.zza()), C7497i0.x(n0Var2.zza()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(i0Var.i(), i0Var2.i());
    }
}
