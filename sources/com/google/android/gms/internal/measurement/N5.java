package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class N5 extends O5 {
    N5() {
        super();
    }

    public final void h() {
        if (!q()) {
            for (int i10 = 0; i10 < i(); i10++) {
                Map.Entry f10 = f(i10);
                if (((C4) f10.getKey()).h()) {
                    f10.setValue(Collections.unmodifiableList((List) f10.getValue()));
                }
            }
            for (Map.Entry entry : m()) {
                if (((C4) entry.getKey()).h()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.h();
    }
}
