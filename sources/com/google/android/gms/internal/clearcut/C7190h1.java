package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.h1  reason: case insensitive filesystem */
final class C7190h1 extends C7187g1 {
    C7190h1(int i10) {
        super(i10, (C7190h1) null);
    }

    public final void u() {
        if (!a()) {
            for (int i10 = 0; i10 < o(); i10++) {
                Map.Entry i11 = i(i10);
                if (((C7166a0) i11.getKey()).p()) {
                    i11.setValue(Collections.unmodifiableList((List) i11.getValue()));
                }
            }
            for (Map.Entry entry : p()) {
                if (((C7166a0) entry.getKey()).p()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.u();
    }
}
