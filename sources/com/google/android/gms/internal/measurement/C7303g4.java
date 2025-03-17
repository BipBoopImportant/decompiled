package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.g4  reason: case insensitive filesystem */
final class C7303g4 implements Comparator<C7276d4> {
    C7303g4() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C7276d4 d4Var = (C7276d4) obj;
        C7276d4 d4Var2 = (C7276d4) obj2;
        C7339k4 k4Var = (C7339k4) d4Var.iterator();
        C7339k4 k4Var2 = (C7339k4) d4Var2.iterator();
        while (k4Var.hasNext() && k4Var2.hasNext()) {
            int compare = Integer.compare(C7276d4.j(k4Var.zza()), C7276d4.j(k4Var2.zza()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(d4Var.x(), d4Var2.x());
    }
}
