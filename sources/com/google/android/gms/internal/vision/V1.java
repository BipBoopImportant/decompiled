package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class V1 extends W1 {
    V1(int i10) {
        super(i10, (V1) null);
    }

    public final void f() {
        if (!l()) {
            for (int i10 = 0; i10 < m(); i10++) {
                Map.Entry k10 = k(i10);
                if (((K0) k10.getKey()).zzd()) {
                    k10.setValue(Collections.unmodifiableList((List) k10.getValue()));
                }
            }
            for (Map.Entry entry : p()) {
                if (((K0) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.f();
    }
}
