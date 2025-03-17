package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.F7;
import com.google.android.gms.internal.measurement.I7;
import java.util.List;

final class F2 implements I7 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2 f49623a;

    F2(C2 c22) {
        this.f49623a = c22;
    }

    public final void a(F7 f72, String str, List<String> list, boolean z10, boolean z11) {
        int i10 = H2.f49646a[f72.ordinal()];
        C7614i2 H10 = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? this.f49623a.f().H() : this.f49623a.f().I() : z10 ? this.f49623a.f().L() : !z11 ? this.f49623a.f().K() : this.f49623a.f().J() : z10 ? this.f49623a.f().G() : !z11 ? this.f49623a.f().F() : this.f49623a.f().E() : this.f49623a.f().D();
        int size = list.size();
        if (size == 1) {
            H10.b(str, list.get(0));
        } else if (size == 2) {
            H10.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            H10.a(str);
        } else {
            H10.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
