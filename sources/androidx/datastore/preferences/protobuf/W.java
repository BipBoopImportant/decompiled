package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C5166t;
import androidx.datastore.preferences.protobuf.t0;
import java.util.Iterator;
import java.util.Map;

final class W<T> implements h0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final S f21287a;

    /* renamed from: b  reason: collision with root package name */
    private final o0<?, ?> f21288b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f21289c;

    /* renamed from: d  reason: collision with root package name */
    private final C5163p<?> f21290d;

    private W(o0<?, ?> o0Var, C5163p<?> pVar, S s10) {
        this.f21288b = o0Var;
        this.f21289c = pVar.e(s10);
        this.f21290d = pVar;
        this.f21287a = s10;
    }

    private <UT, UB> int d(o0<UT, UB> o0Var, T t10) {
        return o0Var.i(o0Var.g(t10));
    }

    private <UT, UB, ET extends C5166t.b<ET>> void k(o0<UT, UB> o0Var, C5163p<ET> pVar, T t10, g0 g0Var, C5162o oVar) {
        UB f10 = o0Var.f(t10);
        C5166t<ET> d10 = pVar.d(t10);
        do {
            try {
                if (g0Var.A() == Integer.MAX_VALUE) {
                    o0Var.o(t10, f10);
                    return;
                }
            } finally {
                o0Var.o(t10, f10);
            }
        } while (m(g0Var, oVar, pVar, d10, o0Var, f10));
    }

    static <T> W<T> l(o0<?, ?> o0Var, C5163p<?> pVar, S s10) {
        return new W<>(o0Var, pVar, s10);
    }

    private <UT, UB, ET extends C5166t.b<ET>> boolean m(g0 g0Var, C5162o oVar, C5163p<ET> pVar, C5166t<ET> tVar, o0<UT, UB> o0Var, UB ub2) {
        int a10 = g0Var.a();
        int i10 = 0;
        if (a10 == t0.f21445a) {
            Object obj = null;
            C5154g gVar = null;
            while (g0Var.A() != Integer.MAX_VALUE) {
                int a11 = g0Var.a();
                if (a11 == t0.f21447c) {
                    i10 = g0Var.h();
                    obj = pVar.b(oVar, this.f21287a, i10);
                } else if (a11 == t0.f21448d) {
                    if (obj != null) {
                        pVar.h(g0Var, obj, oVar, tVar);
                    } else {
                        gVar = g0Var.o();
                    }
                } else if (!g0Var.D()) {
                    break;
                }
            }
            if (g0Var.a() == t0.f21446b) {
                if (gVar != null) {
                    if (obj != null) {
                        pVar.i(gVar, obj, oVar, tVar);
                    } else {
                        o0Var.d(ub2, i10, gVar);
                    }
                }
                return true;
            }
            throw A.b();
        } else if (t0.b(a10) != 2) {
            return g0Var.D();
        } else {
            Object b10 = pVar.b(oVar, this.f21287a, t0.a(a10));
            if (b10 == null) {
                return o0Var.m(ub2, g0Var, 0);
            }
            pVar.h(g0Var, b10, oVar, tVar);
            return true;
        }
    }

    private <UT, UB> void n(o0<UT, UB> o0Var, T t10, u0 u0Var) {
        o0Var.s(o0Var.g(t10), u0Var);
    }

    public void a(T t10, T t11) {
        j0.G(this.f21288b, t10, t11);
        if (this.f21289c) {
            j0.E(this.f21290d, t10, t11);
        }
    }

    public int b(T t10) {
        int hashCode = this.f21288b.g(t10).hashCode();
        return this.f21289c ? (hashCode * 53) + this.f21290d.c(t10).hashCode() : hashCode;
    }

    public boolean c(T t10, T t11) {
        if (!this.f21288b.g(t10).equals(this.f21288b.g(t11))) {
            return false;
        }
        if (this.f21289c) {
            return this.f21290d.c(t10).equals(this.f21290d.c(t11));
        }
        return true;
    }

    public T e() {
        S s10 = this.f21287a;
        return s10 instanceof C5170x ? ((C5170x) s10).H() : s10.newBuilderForType().q();
    }

    public void f(T t10) {
        this.f21288b.j(t10);
        this.f21290d.f(t10);
    }

    public final boolean g(T t10) {
        return this.f21290d.c(t10).p();
    }

    public int h(T t10) {
        int d10 = d(this.f21288b, t10);
        return this.f21289c ? d10 + this.f21290d.c(t10).j() : d10;
    }

    public void i(T t10, g0 g0Var, C5162o oVar) {
        k(this.f21288b, this.f21290d, t10, g0Var, oVar);
    }

    public void j(T t10, u0 u0Var) {
        Iterator<Map.Entry<?, Object>> t11 = this.f21290d.c(t10).t();
        while (t11.hasNext()) {
            Map.Entry next = t11.next();
            C5166t.b bVar = (C5166t.b) next.getKey();
            if (bVar.g() != t0.c.MESSAGE || bVar.e() || bVar.i()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C.b) {
                u0Var.b(bVar.d(), ((C.b) next).a().e());
            } else {
                u0Var.b(bVar.d(), next.getValue());
            }
        }
        n(this.f21288b, t10, u0Var);
    }
}
