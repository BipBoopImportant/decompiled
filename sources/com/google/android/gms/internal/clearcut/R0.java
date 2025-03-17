package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

final class R0<T> implements C7178d1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final M0 f48251a;

    /* renamed from: b  reason: collision with root package name */
    private final C7231v1<?, ?> f48252b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f48253c;

    /* renamed from: d  reason: collision with root package name */
    private final T<?> f48254d;

    private R0(C7231v1<?, ?> v1Var, T<?> t10, M0 m02) {
        this.f48252b = v1Var;
        this.f48253c = t10.g(m02);
        this.f48254d = t10;
        this.f48251a = m02;
    }

    static <T> R0<T> a(C7231v1<?, ?> v1Var, T<?> t10, M0 m02) {
        return new R0<>(v1Var, t10, m02);
    }

    public final int b(T t10) {
        int hashCode = this.f48252b.k(t10).hashCode();
        return this.f48253c ? (hashCode * 53) + this.f48254d.b(t10).hashCode() : hashCode;
    }

    public final boolean c(T t10, T t11) {
        if (!this.f48252b.k(t10).equals(this.f48252b.k(t11))) {
            return false;
        }
        if (this.f48253c) {
            return this.f48254d.b(t10).equals(this.f48254d.b(t11));
        }
        return true;
    }

    public final void d(T t10) {
        this.f48252b.d(t10);
        this.f48254d.f(t10);
    }

    public final T e() {
        return this.f48251a.w().B();
    }

    public final void f(T t10, Q1 q12) {
        Iterator<Map.Entry<?, Object>> e10 = this.f48254d.b(t10).e();
        while (e10.hasNext()) {
            Map.Entry next = e10.next();
            C7166a0 a0Var = (C7166a0) next.getKey();
            if (a0Var.l() != P1.MESSAGE || a0Var.p() || a0Var.k()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            q12.g(a0Var.zzc(), next instanceof C7218r0 ? ((C7218r0) next).a().d() : next.getValue());
        }
        C7231v1<?, ?> v1Var = this.f48252b;
        v1Var.e(v1Var.k(t10), q12);
    }

    public final boolean g(T t10) {
        return this.f48254d.b(t10).d();
    }

    public final void h(T t10, T t11) {
        C7184f1.i(this.f48252b, t10, t11);
        if (this.f48253c) {
            C7184f1.g(this.f48254d, t10, t11);
        }
    }

    public final int i(T t10) {
        C7231v1<?, ?> v1Var = this.f48252b;
        int l10 = v1Var.l(v1Var.k(t10));
        return this.f48253c ? l10 + this.f48254d.b(t10).m() : l10;
    }

    public final void j(T t10, byte[] bArr, int i10, int i11, C7232w wVar) {
        C7186g0 g0Var = (C7186g0) t10;
        C7234w1 w1Var = g0Var.zzjp;
        if (w1Var == C7234w1.h()) {
            w1Var = C7234w1.i();
            g0Var.zzjp = w1Var;
        }
        C7234w1 w1Var2 = w1Var;
        while (i10 < i11) {
            int e10 = C7229v.e(bArr, i10, wVar);
            int i12 = wVar.f48493a;
            if (i12 != 11) {
                i10 = (i12 & 7) == 2 ? C7229v.c(i12, bArr, e10, i11, w1Var2, wVar) : C7229v.a(i12, bArr, e10, i11, wVar);
            } else {
                int i13 = 0;
                A a10 = null;
                while (e10 < i11) {
                    e10 = C7229v.e(bArr, e10, wVar);
                    int i14 = wVar.f48493a;
                    int i15 = i14 >>> 3;
                    int i16 = i14 & 7;
                    if (i15 != 2) {
                        if (i15 == 3 && i16 == 2) {
                            e10 = C7229v.m(bArr, e10, wVar);
                            a10 = (A) wVar.f48495c;
                        }
                    } else if (i16 == 0) {
                        e10 = C7229v.e(bArr, e10, wVar);
                        i13 = wVar.f48493a;
                    }
                    if (i14 == 12) {
                        break;
                    }
                    e10 = C7229v.a(i14, bArr, e10, i11, wVar);
                }
                if (a10 != null) {
                    w1Var2.e((i13 << 3) | 2, a10);
                }
                i10 = e10;
            }
        }
        if (i10 != i11) {
            throw C7204m0.d();
        }
    }
}
