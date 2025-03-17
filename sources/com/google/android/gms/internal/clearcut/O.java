package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C7186g0;
import java.util.List;
import java.util.Map;

final class O implements Q1 {

    /* renamed from: a  reason: collision with root package name */
    private final M f48227a;

    private O(M m10) {
        M m11 = (M) C7192i0.e(m10, "output");
        this.f48227a = m11;
        m11.f48210a = this;
    }

    public static O c(M m10) {
        O o10 = m10.f48210a;
        return o10 != null ? o10 : new O(m10);
    }

    public final void A(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f48227a.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += M.D0(list.get(i13).intValue());
            }
            this.f48227a.y0(i12);
            while (i11 < list.size()) {
                this.f48227a.y0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f48227a.b0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void B(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f48227a.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += M.p0(list.get(i13).longValue());
            }
            this.f48227a.y0(i12);
            while (i11 < list.size()) {
                this.f48227a.c0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f48227a.U(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void C(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f48227a.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += M.h0(list.get(i13).longValue());
            }
            this.f48227a.y0(i12);
            while (i11 < list.size()) {
                this.f48227a.L(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f48227a.l(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void D(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f48227a.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += M.x(list.get(i13).floatValue());
            }
            this.f48227a.y0(i12);
            while (i11 < list.size()) {
                this.f48227a.i(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f48227a.k(i10, list.get(i11).floatValue());
            i11++;
        }
    }

    public final void E(int i10, List<?> list, C7178d1 d1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            J(i10, list.get(i11), d1Var);
        }
    }

    public final void F(int i10, List<?> list, C7178d1 d1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            I(i10, list.get(i11), d1Var);
        }
    }

    public final void G(int i10) {
        this.f48227a.G(i10, 4);
    }

    public final void H(int i10, A a10) {
        this.f48227a.m(i10, a10);
    }

    public final void I(int i10, Object obj, C7178d1 d1Var) {
        this.f48227a.o(i10, (M0) obj, d1Var);
    }

    public final void J(int i10, Object obj, C7178d1 d1Var) {
        M m10 = this.f48227a;
        m10.G(i10, 3);
        d1Var.f((M0) obj, m10.f48210a);
        m10.G(i10, 4);
    }

    public final void K(int i10, long j10) {
        this.f48227a.U(i10, j10);
    }

    public final void L(int i10, long j10) {
        this.f48227a.l(i10, j10);
    }

    public final void M(int i10, int i11) {
        this.f48227a.T(i10, i11);
    }

    public final void N(int i10) {
        this.f48227a.G(i10, 3);
    }

    public final <K, V> void O(int i10, F0<K, V> f02, Map<K, V> map) {
        for (Map.Entry next : map.entrySet()) {
            this.f48227a.G(i10, 2);
            this.f48227a.y0(E0.a(f02, next.getKey(), next.getValue()));
            E0.b(this.f48227a, f02, next.getKey(), next.getValue());
        }
    }

    public final void P(int i10, int i11) {
        this.f48227a.i0(i10, i11);
    }

    public final void a(int i10, long j10) {
        this.f48227a.H(i10, j10);
    }

    public final void b(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f48227a.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += M.C0(list.get(i13).intValue());
            }
            this.f48227a.y0(i12);
            while (i11 < list.size()) {
                this.f48227a.x0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f48227a.T(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void e(int i10, int i11) {
        this.f48227a.T(i10, i11);
    }

    public final void f(int i10, long j10) {
        this.f48227a.U(i10, j10);
    }

    public final void g(int i10, Object obj) {
        if (obj instanceof A) {
            this.f48227a.I(i10, (A) obj);
        } else {
            this.f48227a.J(i10, (M0) obj);
        }
    }

    public final void h(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f48227a.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += M.F0(list.get(i13).intValue());
            }
            this.f48227a.y0(i12);
            while (i11 < list.size()) {
                this.f48227a.A0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f48227a.i0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void j(int i10, long j10) {
        this.f48227a.l(i10, j10);
    }

    public final void k(int i10, double d10) {
        this.f48227a.j(i10, d10);
    }

    public final void l(int i10, float f10) {
        this.f48227a.k(i10, f10);
    }

    public final void m(int i10, int i11) {
        this.f48227a.i0(i10, i11);
    }

    public final void n(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f48227a.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += M.l0(list.get(i13).longValue());
            }
            this.f48227a.y0(i12);
            while (i11 < list.size()) {
                this.f48227a.V(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f48227a.H(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final int s() {
        return C7186g0.e.f48392l;
    }

    public final void t(int i10, List<A> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f48227a.m(i10, list.get(i11));
        }
    }

    public final void u(int i10, int i11) {
        this.f48227a.b0(i10, i11);
    }

    public final void v(int i10, int i11) {
        this.f48227a.f0(i10, i11);
    }

    public final void w(int i10, List<String> list) {
        int i11 = 0;
        if (list instanceof C7230v0) {
            C7230v0 v0Var = (C7230v0) list;
            while (i11 < list.size()) {
                Object n10 = v0Var.n(i11);
                if (n10 instanceof String) {
                    this.f48227a.p(i10, (String) n10);
                } else {
                    this.f48227a.m(i10, (A) n10);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f48227a.p(i10, list.get(i11));
            i11++;
        }
    }

    public final void x(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f48227a.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += M.H0(list.get(i13).intValue());
            }
            this.f48227a.y0(i12);
            while (i11 < list.size()) {
                this.f48227a.x0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f48227a.T(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void y(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f48227a.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += M.s0(list.get(i13).longValue());
            }
            this.f48227a.y0(i12);
            while (i11 < list.size()) {
                this.f48227a.c0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f48227a.U(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void z(int i10, String str) {
        this.f48227a.p(i10, str);
    }

    public final void zzb(int i10, boolean z10) {
        this.f48227a.K(i10, z10);
    }

    public final void zzc(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f48227a.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += M.e0(list.get(i13).longValue());
            }
            this.f48227a.y0(i12);
            while (i11 < list.size()) {
                this.f48227a.L(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f48227a.l(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzg(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f48227a.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += M.w(list.get(i13).doubleValue());
            }
            this.f48227a.y0(i12);
            while (i11 < list.size()) {
                this.f48227a.h(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f48227a.j(i10, list.get(i11).doubleValue());
            i11++;
        }
    }

    public final void zzi(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f48227a.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += M.F(list.get(i13).booleanValue());
            }
            this.f48227a.y0(i12);
            while (i11 < list.size()) {
                this.f48227a.t(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f48227a.K(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    public final void zzk(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f48227a.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += M.G0(list.get(i13).intValue());
            }
            this.f48227a.y0(i12);
            while (i11 < list.size()) {
                this.f48227a.A0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f48227a.i0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzm(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f48227a.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += M.E0(list.get(i13).intValue());
            }
            this.f48227a.y0(i12);
            while (i11 < list.size()) {
                this.f48227a.z0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f48227a.f0(i10, list.get(i11).intValue());
            i11++;
        }
    }
}
