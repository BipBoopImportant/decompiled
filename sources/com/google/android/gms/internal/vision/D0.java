package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;
import java.util.List;
import java.util.Map;

final class D0 extends E0<Q0.e> {
    D0() {
    }

    /* access modifiers changed from: package-private */
    public final int a(Map.Entry<?, ?> entry) {
        return ((Q0.e) entry.getKey()).f49248a;
    }

    /* access modifiers changed from: package-private */
    public final I0<Q0.e> b(Object obj) {
        return ((Q0.c) obj).zzc;
    }

    /* access modifiers changed from: package-private */
    public final Object c(C0 c02, A1 a12, int i10) {
        return c02.a(a12, i10);
    }

    /* access modifiers changed from: package-private */
    public final void d(H2 h22, Map.Entry<?, ?> entry) {
        Q0.e eVar = (Q0.e) entry.getKey();
        if (eVar.f49250c) {
            switch (G0.f49197a[eVar.f49249b.ordinal()]) {
                case 1:
                    T1.l(eVar.f49248a, (List) entry.getValue(), h22, false);
                    return;
                case 2:
                    T1.y(eVar.f49248a, (List) entry.getValue(), h22, false);
                    return;
                case 3:
                    T1.C(eVar.f49248a, (List) entry.getValue(), h22, false);
                    return;
                case 4:
                    T1.G(eVar.f49248a, (List) entry.getValue(), h22, false);
                    return;
                case 5:
                    T1.T(eVar.f49248a, (List) entry.getValue(), h22, false);
                    return;
                case 6:
                    T1.N(eVar.f49248a, (List) entry.getValue(), h22, false);
                    return;
                case 7:
                    T1.a0(eVar.f49248a, (List) entry.getValue(), h22, false);
                    return;
                case 8:
                    T1.d0(eVar.f49248a, (List) entry.getValue(), h22, false);
                    return;
                case 9:
                    T1.W(eVar.f49248a, (List) entry.getValue(), h22, false);
                    return;
                case 10:
                    T1.b0(eVar.f49248a, (List) entry.getValue(), h22, false);
                    return;
                case 11:
                    T1.Q(eVar.f49248a, (List) entry.getValue(), h22, false);
                    return;
                case 12:
                    T1.Z(eVar.f49248a, (List) entry.getValue(), h22, false);
                    return;
                case 13:
                    T1.K(eVar.f49248a, (List) entry.getValue(), h22, false);
                    return;
                case 14:
                    T1.T(eVar.f49248a, (List) entry.getValue(), h22, false);
                    return;
                case 15:
                    T1.w(eVar.f49248a, (List) entry.getValue(), h22);
                    return;
                case 16:
                    T1.j(eVar.f49248a, (List) entry.getValue(), h22);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        T1.x(eVar.f49248a, (List) entry.getValue(), h22, N1.a().b(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        T1.k(eVar.f49248a, (List) entry.getValue(), h22, N1.a().b(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (G0.f49197a[eVar.f49249b.ordinal()]) {
                case 1:
                    h22.k(eVar.f49248a, ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    h22.l(eVar.f49248a, ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    h22.j(eVar.f49248a, ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    h22.f(eVar.f49248a, ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    h22.e(eVar.f49248a, ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    h22.q(eVar.f49248a, ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    h22.u(eVar.f49248a, ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    h22.o(eVar.f49248a, ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    h22.v(eVar.f49248a, ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    h22.i(eVar.f49248a, ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    h22.a(eVar.f49248a, ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    h22.m(eVar.f49248a, ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    h22.r(eVar.f49248a, ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    h22.e(eVar.f49248a, ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    h22.s(eVar.f49248a, (C7497i0) entry.getValue());
                    return;
                case 16:
                    h22.z(eVar.f49248a, (String) entry.getValue());
                    return;
                case 17:
                    h22.H(eVar.f49248a, entry.getValue(), N1.a().b(entry.getValue().getClass()));
                    return;
                case 18:
                    h22.G(eVar.f49248a, entry.getValue(), N1.a().b(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean e(A1 a12) {
        return a12 instanceof Q0.c;
    }

    /* access modifiers changed from: package-private */
    public final I0<Q0.e> f(Object obj) {
        return ((Q0.c) obj).x();
    }

    /* access modifiers changed from: package-private */
    public final void g(Object obj) {
        b(obj).i();
    }
}
