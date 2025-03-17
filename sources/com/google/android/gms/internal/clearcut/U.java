package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C7186g0;
import java.util.Map;

final class U extends T<C7186g0.d> {
    U() {
    }

    /* access modifiers changed from: package-private */
    public final int a(Map.Entry<?, ?> entry) {
        return ((C7186g0.d) entry.getKey()).f48379a;
    }

    /* access modifiers changed from: package-private */
    public final X<C7186g0.d> b(Object obj) {
        return ((C7186g0.c) obj).zzjv;
    }

    /* access modifiers changed from: package-private */
    public final void c(Q1 q12, Map.Entry<?, ?> entry) {
        C7186g0.d dVar = (C7186g0.d) entry.getKey();
        switch (V.f48267a[dVar.f48380b.ordinal()]) {
            case 1:
                q12.k(dVar.f48379a, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                q12.l(dVar.f48379a, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                q12.L(dVar.f48379a, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                q12.j(dVar.f48379a, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                q12.e(dVar.f48379a, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                q12.f(dVar.f48379a, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                q12.m(dVar.f48379a, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                q12.zzb(dVar.f48379a, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                q12.u(dVar.f48379a, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                q12.P(dVar.f48379a, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                q12.K(dVar.f48379a, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                q12.v(dVar.f48379a, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                q12.a(dVar.f48379a, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                q12.e(dVar.f48379a, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                q12.H(dVar.f48379a, (A) entry.getValue());
                return;
            case 16:
                q12.z(dVar.f48379a, (String) entry.getValue());
                return;
            case 17:
                q12.J(dVar.f48379a, entry.getValue(), Y0.a().b(entry.getValue().getClass()));
                return;
            case 18:
                q12.I(dVar.f48379a, entry.getValue(), Y0.a().b(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(Object obj, X<C7186g0.d> x10) {
        ((C7186g0.c) obj).zzjv = x10;
    }

    /* access modifiers changed from: package-private */
    public final X<C7186g0.d> e(Object obj) {
        X<C7186g0.d> b10 = b(obj);
        if (!b10.c()) {
            return b10;
        }
        X<C7186g0.d> x10 = (X) b10.clone();
        d(obj, x10);
        return x10;
    }

    /* access modifiers changed from: package-private */
    public final void f(Object obj) {
        b(obj).t();
    }

    /* access modifiers changed from: package-private */
    public final boolean g(M0 m02) {
        return m02 instanceof C7186g0.c;
    }
}
