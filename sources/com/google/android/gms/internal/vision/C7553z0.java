package com.google.android.gms.internal.vision;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.z0  reason: case insensitive filesystem */
final class C7553z0 implements H2 {

    /* renamed from: a  reason: collision with root package name */
    private final C7547x0 f49421a;

    private C7553z0(C7547x0 x0Var) {
        C7547x0 x0Var2 = (C7547x0) U0.f(x0Var, "output");
        this.f49421a = x0Var2;
        x0Var2.f49415a = this;
    }

    public static C7553z0 J(C7547x0 x0Var) {
        C7553z0 z0Var = x0Var.f49415a;
        return z0Var != null ? z0Var : new C7553z0(x0Var);
    }

    public final void A(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f49421a.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C7547x0.o0(list.get(i13).intValue());
            }
            this.f49421a.O(i12);
            while (i11 < list.size()) {
                this.f49421a.O(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49421a.X(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void B(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f49421a.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C7547x0.r0(list.get(i13).longValue());
            }
            this.f49421a.O(i12);
            while (i11 < list.size()) {
                this.f49421a.Z(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49421a.Y(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void C(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f49421a.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C7547x0.i0(list.get(i13).longValue());
            }
            this.f49421a.O(i12);
            while (i11 < list.size()) {
                this.f49421a.t(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49421a.n(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void D(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f49421a.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C7547x0.A(list.get(i13).floatValue());
            }
            this.f49421a.O(i12);
            while (i11 < list.size()) {
                this.f49421a.i(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49421a.l(i10, list.get(i11).floatValue());
            i11++;
        }
    }

    public final <K, V> void E(int i10, C7542v1<K, V> v1Var, Map<K, V> map) {
        for (Map.Entry next : map.entrySet()) {
            this.f49421a.m(i10, 2);
            this.f49421a.O(C7533s1.a(v1Var, next.getKey(), next.getValue()));
            C7533s1.b(this.f49421a, v1Var, next.getKey(), next.getValue());
        }
    }

    public final void F(int i10, List<?> list, S1 s12) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            H(i10, list.get(i11), s12);
        }
    }

    public final void G(int i10, Object obj, S1 s12) {
        this.f49421a.q(i10, (A1) obj, s12);
    }

    public final void H(int i10, Object obj, S1 s12) {
        C7547x0 x0Var = this.f49421a;
        x0Var.m(i10, 3);
        s12.a((A1) obj, x0Var.f49415a);
        x0Var.m(i10, 4);
    }

    public final void I(int i10, List<?> list, S1 s12) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            G(i10, list.get(i11), s12);
        }
    }

    public final void a(int i10, long j10) {
        this.f49421a.Y(i10, j10);
    }

    public final void b(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f49421a.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C7547x0.k0(list.get(i13).intValue());
            }
            this.f49421a.O(i12);
            while (i11 < list.size()) {
                this.f49421a.j(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49421a.P(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void c(int i10) {
        this.f49421a.m(i10, 3);
    }

    public final void d(int i10) {
        this.f49421a.m(i10, 4);
    }

    public final void e(int i10, int i11) {
        this.f49421a.P(i10, i11);
    }

    public final void f(int i10, long j10) {
        this.f49421a.n(i10, j10);
    }

    public final void g(int i10, Object obj) {
        if (obj instanceof C7497i0) {
            this.f49421a.R(i10, (C7497i0) obj);
        } else {
            this.f49421a.p(i10, (A1) obj);
        }
    }

    public final void h(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f49421a.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C7547x0.w0(list.get(i13).intValue());
            }
            this.f49421a.O(i12);
            while (i11 < list.size()) {
                this.f49421a.e0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49421a.j0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void i(int i10, int i11) {
        this.f49421a.j0(i10, i11);
    }

    public final void j(int i10, long j10) {
        this.f49421a.n(i10, j10);
    }

    public final void k(int i10, double d10) {
        this.f49421a.k(i10, d10);
    }

    public final void l(int i10, float f10) {
        this.f49421a.l(i10, f10);
    }

    public final void m(int i10, int i11) {
        this.f49421a.f0(i10, i11);
    }

    public final void n(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f49421a.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C7547x0.n0(list.get(i13).longValue());
            }
            this.f49421a.O(i12);
            while (i11 < list.size()) {
                this.f49421a.S(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49421a.Q(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void o(int i10, boolean z10) {
        this.f49421a.s(i10, z10);
    }

    public final void p(int i10, int i11) {
        this.f49421a.P(i10, i11);
    }

    public final void q(int i10, long j10) {
        this.f49421a.Y(i10, j10);
    }

    public final void r(int i10, long j10) {
        this.f49421a.Q(i10, j10);
    }

    public final void s(int i10, C7497i0 i0Var) {
        this.f49421a.o(i10, i0Var);
    }

    public final void t(int i10, List<C7497i0> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f49421a.o(i10, list.get(i11));
        }
    }

    public final void u(int i10, int i11) {
        this.f49421a.j0(i10, i11);
    }

    public final void v(int i10, int i11) {
        this.f49421a.X(i10, i11);
    }

    public final void w(int i10, List<String> list) {
        int i11 = 0;
        if (list instanceof C7506k1) {
            C7506k1 k1Var = (C7506k1) list;
            while (i11 < list.size()) {
                Object d10 = k1Var.d(i11);
                if (d10 instanceof String) {
                    this.f49421a.r(i10, (String) d10);
                } else {
                    this.f49421a.o(i10, (C7497i0) d10);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49421a.r(i10, list.get(i11));
            i11++;
        }
    }

    public final void x(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f49421a.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C7547x0.B0(list.get(i13).intValue());
            }
            this.f49421a.O(i12);
            while (i11 < list.size()) {
                this.f49421a.j(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49421a.P(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void y(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f49421a.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C7547x0.v0(list.get(i13).longValue());
            }
            this.f49421a.O(i12);
            while (i11 < list.size()) {
                this.f49421a.Z(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49421a.Y(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void z(int i10, String str) {
        this.f49421a.r(i10, str);
    }

    public final int zza() {
        return G2.f49202a;
    }

    public final void zzc(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f49421a.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C7547x0.d0(list.get(i13).longValue());
            }
            this.f49421a.O(i12);
            while (i11 < list.size()) {
                this.f49421a.t(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49421a.n(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzg(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f49421a.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C7547x0.z(list.get(i13).doubleValue());
            }
            this.f49421a.O(i12);
            while (i11 < list.size()) {
                this.f49421a.h(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49421a.k(i10, list.get(i11).doubleValue());
            i11++;
        }
    }

    public final void zzi(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f49421a.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C7547x0.L(list.get(i13).booleanValue());
            }
            this.f49421a.O(i12);
            while (i11 < list.size()) {
                this.f49421a.y(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49421a.s(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    public final void zzk(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f49421a.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C7547x0.z0(list.get(i13).intValue());
            }
            this.f49421a.O(i12);
            while (i11 < list.size()) {
                this.f49421a.e0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49421a.j0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzm(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f49421a.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C7547x0.s0(list.get(i13).intValue());
            }
            this.f49421a.O(i12);
            while (i11 < list.size()) {
                this.f49421a.W(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49421a.f0(i10, list.get(i11).intValue());
            i11++;
        }
    }
}
