package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.t4  reason: case insensitive filesystem */
final class C7413t4 implements C7399r6 {

    /* renamed from: a  reason: collision with root package name */
    private final C7405s4 f49081a;

    private C7413t4(C7405s4 s4Var) {
        C7405s4 s4Var2 = (C7405s4) O4.f(s4Var, "output");
        this.f49081a = s4Var2;
        s4Var2.f49068a = this;
    }

    public static C7413t4 J(C7405s4 s4Var) {
        C7413t4 t4Var = s4Var.f49068a;
        return t4Var != null ? t4Var : new C7413t4(s4Var);
    }

    public final void A(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (list instanceof C7313h5) {
            C7313h5 h5Var = (C7313h5) list;
            if (z10) {
                this.f49081a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < h5Var.size(); i13++) {
                    i12 += C7405s4.W(h5Var.d(i13));
                }
                this.f49081a.B0(i12);
                while (i11 < h5Var.size()) {
                    this.f49081a.n0(h5Var.d(i11));
                    i11++;
                }
                return;
            }
            while (i11 < h5Var.size()) {
                this.f49081a.m0(i10, h5Var.d(i11));
                i11++;
            }
        } else if (z10) {
            this.f49081a.A0(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += C7405s4.W(list.get(i15).longValue());
            }
            this.f49081a.B0(i14);
            while (i11 < list.size()) {
                this.f49081a.n0(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f49081a.m0(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public final void B(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (list instanceof C7313h5) {
            C7313h5 h5Var = (C7313h5) list;
            if (z10) {
                this.f49081a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < h5Var.size(); i13++) {
                    i12 += C7405s4.p(h5Var.d(i13));
                }
                this.f49081a.B0(i12);
                while (i11 < h5Var.size()) {
                    this.f49081a.n0(h5Var.d(i11));
                    i11++;
                }
                return;
            }
            while (i11 < h5Var.size()) {
                this.f49081a.m0(i10, h5Var.d(i11));
                i11++;
            }
        } else if (z10) {
            this.f49081a.A0(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += C7405s4.p(list.get(i15).longValue());
            }
            this.f49081a.B0(i14);
            while (i11 < list.size()) {
                this.f49081a.n0(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f49081a.m0(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public final void C(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof M4) {
            M4 m42 = (M4) list;
            if (z10) {
                this.f49081a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < m42.size(); i13++) {
                    i12 += C7405s4.z(m42.i(i13));
                }
                this.f49081a.B0(i12);
                while (i11 < m42.size()) {
                    this.f49081a.s0(m42.i(i11));
                    i11++;
                }
                return;
            }
            while (i11 < m42.size()) {
                this.f49081a.p0(i10, m42.i(i11));
                i11++;
            }
        } else if (z10) {
            this.f49081a.A0(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += C7405s4.z(list.get(i15).intValue());
            }
            this.f49081a.B0(i14);
            while (i11 < list.size()) {
                this.f49081a.s0(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f49081a.p0(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void D(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (list instanceof H4) {
            H4 h42 = (H4) list;
            if (z10) {
                this.f49081a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < h42.size(); i13++) {
                    i12 += C7405s4.d(h42.j(i13));
                }
                this.f49081a.B0(i12);
                while (i11 < h42.size()) {
                    this.f49081a.K(h42.j(i11));
                    i11++;
                }
                return;
            }
            while (i11 < h42.size()) {
                this.f49081a.M(i10, h42.j(i11));
                i11++;
            }
        } else if (z10) {
            this.f49081a.A0(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += C7405s4.d(list.get(i15).floatValue());
            }
            this.f49081a.B0(i14);
            while (i11 < list.size()) {
                this.f49081a.K(list.get(i11).floatValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f49081a.M(i10, list.get(i11).floatValue());
                i11++;
            }
        }
    }

    public final void E(int i10, List<?> list, K5 k52) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            G(i10, list.get(i11), k52);
        }
    }

    public final void F(int i10, Object obj, K5 k52) {
        C7405s4 s4Var = this.f49081a;
        s4Var.A0(i10, 3);
        k52.d((C7406s5) obj, s4Var.f49068a);
        s4Var.A0(i10, 4);
    }

    public final void G(int i10, Object obj, K5 k52) {
        this.f49081a.Y(i10, (C7406s5) obj, k52);
    }

    public final void H(int i10, List<?> list, K5 k52) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            F(i10, list.get(i11), k52);
        }
    }

    public final void I(int i10, C7276d4 d4Var) {
        this.f49081a.X(i10, d4Var);
    }

    public final void a(int i10, long j10) {
        this.f49081a.u0(i10, j10);
    }

    public final void b(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (list instanceof C7258b4) {
            C7258b4 b4Var = (C7258b4) list;
            if (z10) {
                this.f49081a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < b4Var.size(); i13++) {
                    i12 += C7405s4.v(b4Var.j(i13));
                }
                this.f49081a.B0(i12);
                while (i11 < b4Var.size()) {
                    this.f49081a.S(b4Var.j(i11));
                    i11++;
                }
                return;
            }
            while (i11 < b4Var.size()) {
                this.f49081a.P(i10, b4Var.j(i11));
                i11++;
            }
        } else if (z10) {
            this.f49081a.A0(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += C7405s4.v(list.get(i15).booleanValue());
            }
            this.f49081a.B0(i14);
            while (i11 < list.size()) {
                this.f49081a.S(list.get(i11).booleanValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f49081a.P(i10, list.get(i11).booleanValue());
                i11++;
            }
        }
    }

    @Deprecated
    public final void c(int i10) {
        this.f49081a.A0(i10, 4);
    }

    @Deprecated
    public final void d(int i10) {
        this.f49081a.A0(i10, 3);
    }

    public final void e(int i10, int i11) {
        this.f49081a.t0(i10, i11);
    }

    public final void f(int i10, long j10) {
        this.f49081a.m0(i10, j10);
    }

    public final void g(int i10, Object obj) {
        if (obj instanceof C7276d4) {
            this.f49081a.f0(i10, (C7276d4) obj);
        } else {
            this.f49081a.N(i10, (C7406s5) obj);
        }
    }

    public final void h(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (list instanceof C7437w4) {
            C7437w4 w4Var = (C7437w4) list;
            if (z10) {
                this.f49081a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < w4Var.size(); i13++) {
                    i12 += C7405s4.c(w4Var.j(i13));
                }
                this.f49081a.B0(i12);
                while (i11 < w4Var.size()) {
                    this.f49081a.J(w4Var.j(i11));
                    i11++;
                }
                return;
            }
            while (i11 < w4Var.size()) {
                this.f49081a.L(i10, w4Var.j(i11));
                i11++;
            }
        } else if (z10) {
            this.f49081a.A0(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += C7405s4.c(list.get(i15).doubleValue());
            }
            this.f49081a.B0(i14);
            while (i11 < list.size()) {
                this.f49081a.J(list.get(i11).doubleValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f49081a.L(i10, list.get(i11).doubleValue());
                i11++;
            }
        }
    }

    public final void i(int i10, int i11) {
        this.f49081a.t0(i10, i11);
    }

    public final void j(int i10, long j10) {
        this.f49081a.m0(i10, j10);
    }

    public final void k(int i10, double d10) {
        this.f49081a.L(i10, d10);
    }

    public final void l(int i10, float f10) {
        this.f49081a.M(i10, f10);
    }

    public final void m(int i10, int i11) {
        this.f49081a.C0(i10, i11);
    }

    public final void n(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (list instanceof C7313h5) {
            C7313h5 h5Var = (C7313h5) list;
            if (z10) {
                this.f49081a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < h5Var.size(); i13++) {
                    i12 += C7405s4.j0(h5Var.d(i13));
                }
                this.f49081a.B0(i12);
                while (i11 < h5Var.size()) {
                    this.f49081a.v0(h5Var.d(i11));
                    i11++;
                }
                return;
            }
            while (i11 < h5Var.size()) {
                this.f49081a.u0(i10, h5Var.d(i11));
                i11++;
            }
        } else if (z10) {
            this.f49081a.A0(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += C7405s4.j0(list.get(i15).longValue());
            }
            this.f49081a.B0(i14);
            while (i11 < list.size()) {
                this.f49081a.v0(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f49081a.u0(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public final void o(int i10, boolean z10) {
        this.f49081a.P(i10, z10);
    }

    public final void p(int i10, int i11) {
        this.f49081a.p0(i10, i11);
    }

    public final void q(int i10, long j10) {
        this.f49081a.q0(i10, j10);
    }

    public final void r(int i10, long j10) {
        this.f49081a.u0(i10, j10);
    }

    public final <K, V> void s(int i10, C7367n5<K, V> n5Var, Map<K, V> map) {
        for (Map.Entry next : map.entrySet()) {
            this.f49081a.A0(i10, 2);
            this.f49081a.B0(C7340k5.a(n5Var, next.getKey(), next.getValue()));
            C7340k5.b(this.f49081a, n5Var, next.getKey(), next.getValue());
        }
    }

    public final void t(int i10, List<String> list) {
        int i11 = 0;
        if (list instanceof C7268c5) {
            C7268c5 c5Var = (C7268c5) list;
            while (i11 < list.size()) {
                Object c10 = c5Var.c(i11);
                if (c10 instanceof String) {
                    this.f49081a.O(i10, (String) c10);
                } else {
                    this.f49081a.X(i10, (C7276d4) c10);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f49081a.O(i10, list.get(i11));
            i11++;
        }
    }

    public final void u(int i10, int i11) {
        this.f49081a.p0(i10, i11);
    }

    public final void v(int i10, int i11) {
        this.f49081a.y0(i10, i11);
    }

    public final void w(int i10, List<C7276d4> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f49081a.X(i10, list.get(i11));
        }
    }

    public final void x(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (list instanceof C7313h5) {
            C7313h5 h5Var = (C7313h5) list;
            if (z10) {
                this.f49081a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < h5Var.size(); i13++) {
                    i12 += C7405s4.F(h5Var.d(i13));
                }
                this.f49081a.B0(i12);
                while (i11 < h5Var.size()) {
                    this.f49081a.v0(h5Var.d(i11));
                    i11++;
                }
                return;
            }
            while (i11 < h5Var.size()) {
                this.f49081a.u0(i10, h5Var.d(i11));
                i11++;
            }
        } else if (z10) {
            this.f49081a.A0(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += C7405s4.F(list.get(i15).longValue());
            }
            this.f49081a.B0(i14);
            while (i11 < list.size()) {
                this.f49081a.v0(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f49081a.u0(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public final void y(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (list instanceof C7313h5) {
            C7313h5 h5Var = (C7313h5) list;
            if (z10) {
                this.f49081a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < h5Var.size(); i13++) {
                    i12 += C7405s4.e0(h5Var.d(i13));
                }
                this.f49081a.B0(i12);
                while (i11 < h5Var.size()) {
                    this.f49081a.r0(h5Var.d(i11));
                    i11++;
                }
                return;
            }
            while (i11 < h5Var.size()) {
                this.f49081a.q0(i10, h5Var.d(i11));
                i11++;
            }
        } else if (z10) {
            this.f49081a.A0(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += C7405s4.e0(list.get(i15).longValue());
            }
            this.f49081a.B0(i14);
            while (i11 < list.size()) {
                this.f49081a.r0(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f49081a.q0(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public final void z(int i10, String str) {
        this.f49081a.O(i10, str);
    }

    public final int zza() {
        return 1;
    }

    public final void zzc(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof M4) {
            M4 m42 = (M4) list;
            if (z10) {
                this.f49081a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < m42.size(); i13++) {
                    i12 += C7405s4.e(m42.i(i13));
                }
                this.f49081a.B0(i12);
                while (i11 < m42.size()) {
                    this.f49081a.x0(m42.i(i11));
                    i11++;
                }
                return;
            }
            while (i11 < m42.size()) {
                this.f49081a.t0(i10, m42.i(i11));
                i11++;
            }
        } else if (z10) {
            this.f49081a.A0(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += C7405s4.e(list.get(i15).intValue());
            }
            this.f49081a.B0(i14);
            while (i11 < list.size()) {
                this.f49081a.x0(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f49081a.t0(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void zzg(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof M4) {
            M4 m42 = (M4) list;
            if (z10) {
                this.f49081a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < m42.size(); i13++) {
                    i12 += C7405s4.T(m42.i(i13));
                }
                this.f49081a.B0(i12);
                while (i11 < m42.size()) {
                    this.f49081a.x0(m42.i(i11));
                    i11++;
                }
                return;
            }
            while (i11 < m42.size()) {
                this.f49081a.t0(i10, m42.i(i11));
                i11++;
            }
        } else if (z10) {
            this.f49081a.A0(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += C7405s4.T(list.get(i15).intValue());
            }
            this.f49081a.B0(i14);
            while (i11 < list.size()) {
                this.f49081a.x0(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f49081a.t0(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void zzi(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof M4) {
            M4 m42 = (M4) list;
            if (z10) {
                this.f49081a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < m42.size(); i13++) {
                    i12 += C7405s4.b0(m42.i(i13));
                }
                this.f49081a.B0(i12);
                while (i11 < m42.size()) {
                    this.f49081a.s0(m42.i(i11));
                    i11++;
                }
                return;
            }
            while (i11 < m42.size()) {
                this.f49081a.p0(i10, m42.i(i11));
                i11++;
            }
        } else if (z10) {
            this.f49081a.A0(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += C7405s4.b0(list.get(i15).intValue());
            }
            this.f49081a.B0(i14);
            while (i11 < list.size()) {
                this.f49081a.s0(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f49081a.p0(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void zzk(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof M4) {
            M4 m42 = (M4) list;
            if (z10) {
                this.f49081a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < m42.size(); i13++) {
                    i12 += C7405s4.g0(m42.i(i13));
                }
                this.f49081a.B0(i12);
                while (i11 < m42.size()) {
                    this.f49081a.z0(m42.i(i11));
                    i11++;
                }
                return;
            }
            while (i11 < m42.size()) {
                this.f49081a.y0(i10, m42.i(i11));
                i11++;
            }
        } else if (z10) {
            this.f49081a.A0(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += C7405s4.g0(list.get(i15).intValue());
            }
            this.f49081a.B0(i14);
            while (i11 < list.size()) {
                this.f49081a.z0(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f49081a.y0(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void zzm(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof M4) {
            M4 m42 = (M4) list;
            if (z10) {
                this.f49081a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < m42.size(); i13++) {
                    i12 += C7405s4.o0(m42.i(i13));
                }
                this.f49081a.B0(i12);
                while (i11 < m42.size()) {
                    this.f49081a.B0(m42.i(i11));
                    i11++;
                }
                return;
            }
            while (i11 < m42.size()) {
                this.f49081a.C0(i10, m42.i(i11));
                i11++;
            }
        } else if (z10) {
            this.f49081a.A0(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += C7405s4.o0(list.get(i15).intValue());
            }
            this.f49081a.B0(i14);
            while (i11 < list.size()) {
                this.f49081a.B0(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f49081a.C0(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }
}
