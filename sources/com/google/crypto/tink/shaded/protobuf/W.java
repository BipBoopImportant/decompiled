package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C9537u;
import com.google.crypto.tink.shaded.protobuf.D;
import com.google.crypto.tink.shaded.protobuf.u0;
import java.util.Iterator;
import java.util.Map;

final class W<T> implements h0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final S f67958a;

    /* renamed from: b  reason: collision with root package name */
    private final o0<?, ?> f67959b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f67960c;

    /* renamed from: d  reason: collision with root package name */
    private final C9534q<?> f67961d;

    private W(o0<?, ?> o0Var, C9534q<?> qVar, S s10) {
        this.f67959b = o0Var;
        this.f67960c = qVar.e(s10);
        this.f67961d = qVar;
        this.f67958a = s10;
    }

    private <UT, UB> int k(o0<UT, UB> o0Var, T t10) {
        return o0Var.i(o0Var.g(t10));
    }

    private <UT, UB, ET extends C9537u.b<ET>> void l(o0<UT, UB> o0Var, C9534q<ET> qVar, T t10, g0 g0Var, C9533p pVar) {
        UB f10 = o0Var.f(t10);
        C9537u<ET> d10 = qVar.d(t10);
        do {
            try {
                if (g0Var.A() == Integer.MAX_VALUE) {
                    o0Var.o(t10, f10);
                    return;
                }
            } finally {
                o0Var.o(t10, f10);
            }
        } while (n(g0Var, pVar, qVar, d10, o0Var, f10));
    }

    static <T> W<T> m(o0<?, ?> o0Var, C9534q<?> qVar, S s10) {
        return new W<>(o0Var, qVar, s10);
    }

    private <UT, UB, ET extends C9537u.b<ET>> boolean n(g0 g0Var, C9533p pVar, C9534q<ET> qVar, C9537u<ET> uVar, o0<UT, UB> o0Var, UB ub2) {
        int a10 = g0Var.a();
        if (a10 == u0.f68124a) {
            Object obj = null;
            int i10 = 0;
            C9525h hVar = null;
            while (g0Var.A() != Integer.MAX_VALUE) {
                int a11 = g0Var.a();
                if (a11 == u0.f68126c) {
                    i10 = g0Var.h();
                    obj = qVar.b(pVar, this.f67958a, i10);
                } else if (a11 == u0.f68127d) {
                    if (obj != null) {
                        qVar.h(g0Var, obj, pVar, uVar);
                    } else {
                        hVar = g0Var.o();
                    }
                } else if (!g0Var.D()) {
                    break;
                }
            }
            if (g0Var.a() == u0.f68125b) {
                if (hVar != null) {
                    if (obj != null) {
                        qVar.i(hVar, obj, pVar, uVar);
                    } else {
                        o0Var.d(ub2, i10, hVar);
                    }
                }
                return true;
            }
            throw B.b();
        } else if (u0.b(a10) != 2) {
            return g0Var.D();
        } else {
            Object b10 = qVar.b(pVar, this.f67958a, u0.a(a10));
            if (b10 == null) {
                return o0Var.m(ub2, g0Var);
            }
            qVar.h(g0Var, b10, pVar, uVar);
            return true;
        }
    }

    private <UT, UB> void o(o0<UT, UB> o0Var, T t10, v0 v0Var) {
        o0Var.s(o0Var.g(t10), v0Var);
    }

    public void a(T t10, T t11) {
        j0.G(this.f67959b, t10, t11);
        if (this.f67960c) {
            j0.E(this.f67961d, t10, t11);
        }
    }

    public int b(T t10) {
        int hashCode = this.f67959b.g(t10).hashCode();
        return this.f67960c ? (hashCode * 53) + this.f67961d.c(t10).hashCode() : hashCode;
    }

    public boolean c(T t10, T t11) {
        if (!this.f67959b.g(t10).equals(this.f67959b.g(t11))) {
            return false;
        }
        if (this.f67960c) {
            return this.f67961d.c(t10).equals(this.f67961d.c(t11));
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.crypto.tink.shaded.protobuf.y$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(T r11, byte[] r12, int r13, int r14, com.google.crypto.tink.shaded.protobuf.C9522e.b r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.crypto.tink.shaded.protobuf.y r0 = (com.google.crypto.tink.shaded.protobuf.C9541y) r0
            com.google.crypto.tink.shaded.protobuf.p0 r1 = r0.unknownFields
            com.google.crypto.tink.shaded.protobuf.p0 r2 = com.google.crypto.tink.shaded.protobuf.p0.c()
            if (r1 != r2) goto L_0x0011
            com.google.crypto.tink.shaded.protobuf.p0 r1 = com.google.crypto.tink.shaded.protobuf.p0.k()
            r0.unknownFields = r1
        L_0x0011:
            com.google.crypto.tink.shaded.protobuf.y$c r11 = (com.google.crypto.tink.shaded.protobuf.C9541y.c) r11
            com.google.crypto.tink.shaded.protobuf.u r11 = r11.Q()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00d7
            int r4 = com.google.crypto.tink.shaded.protobuf.C9522e.I(r12, r13, r15)
            int r13 = r15.f67973a
            int r3 = com.google.crypto.tink.shaded.protobuf.u0.f68124a
            r5 = 2
            if (r13 == r3) goto L_0x006b
            int r3 = com.google.crypto.tink.shaded.protobuf.u0.b(r13)
            if (r3 != r5) goto L_0x0066
            com.google.crypto.tink.shaded.protobuf.q<?> r2 = r10.f67961d
            com.google.crypto.tink.shaded.protobuf.p r3 = r15.f67976d
            com.google.crypto.tink.shaded.protobuf.S r5 = r10.f67958a
            int r6 = com.google.crypto.tink.shaded.protobuf.u0.a(r13)
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            com.google.crypto.tink.shaded.protobuf.y$e r8 = (com.google.crypto.tink.shaded.protobuf.C9541y.e) r8
            if (r8 == 0) goto L_0x005c
            com.google.crypto.tink.shaded.protobuf.d0 r13 = com.google.crypto.tink.shaded.protobuf.d0.a()
            com.google.crypto.tink.shaded.protobuf.S r2 = r8.b()
            java.lang.Class r2 = r2.getClass()
            com.google.crypto.tink.shaded.protobuf.h0 r13 = r13.c(r2)
            int r13 = com.google.crypto.tink.shaded.protobuf.C9522e.p(r13, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.y$d r2 = r8.f68144b
            java.lang.Object r3 = r15.f67975c
            r11.x(r2, r3)
        L_0x005a:
            r2 = r8
            goto L_0x0019
        L_0x005c:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.crypto.tink.shaded.protobuf.C9522e.G(r2, r3, r4, r5, r6, r7)
            goto L_0x005a
        L_0x0066:
            int r13 = com.google.crypto.tink.shaded.protobuf.C9522e.P(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x006b:
            r13 = 0
            r3 = r0
        L_0x006d:
            if (r4 >= r14) goto L_0x00cb
            int r4 = com.google.crypto.tink.shaded.protobuf.C9522e.I(r12, r4, r15)
            int r6 = r15.f67973a
            int r7 = com.google.crypto.tink.shaded.protobuf.u0.a(r6)
            int r8 = com.google.crypto.tink.shaded.protobuf.u0.b(r6)
            if (r7 == r5) goto L_0x00ac
            r9 = 3
            if (r7 == r9) goto L_0x0083
            goto L_0x00c1
        L_0x0083:
            if (r2 == 0) goto L_0x00a1
            com.google.crypto.tink.shaded.protobuf.d0 r6 = com.google.crypto.tink.shaded.protobuf.d0.a()
            com.google.crypto.tink.shaded.protobuf.S r7 = r2.b()
            java.lang.Class r7 = r7.getClass()
            com.google.crypto.tink.shaded.protobuf.h0 r6 = r6.c(r7)
            int r4 = com.google.crypto.tink.shaded.protobuf.C9522e.p(r6, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.y$d r6 = r2.f68144b
            java.lang.Object r7 = r15.f67975c
            r11.x(r6, r7)
            goto L_0x006d
        L_0x00a1:
            if (r8 != r5) goto L_0x00c1
            int r4 = com.google.crypto.tink.shaded.protobuf.C9522e.b(r12, r4, r15)
            java.lang.Object r3 = r15.f67975c
            com.google.crypto.tink.shaded.protobuf.h r3 = (com.google.crypto.tink.shaded.protobuf.C9525h) r3
            goto L_0x006d
        L_0x00ac:
            if (r8 != 0) goto L_0x00c1
            int r4 = com.google.crypto.tink.shaded.protobuf.C9522e.I(r12, r4, r15)
            int r13 = r15.f67973a
            com.google.crypto.tink.shaded.protobuf.q<?> r2 = r10.f67961d
            com.google.crypto.tink.shaded.protobuf.p r6 = r15.f67976d
            com.google.crypto.tink.shaded.protobuf.S r7 = r10.f67958a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            com.google.crypto.tink.shaded.protobuf.y$e r2 = (com.google.crypto.tink.shaded.protobuf.C9541y.e) r2
            goto L_0x006d
        L_0x00c1:
            int r7 = com.google.crypto.tink.shaded.protobuf.u0.f68125b
            if (r6 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r4 = com.google.crypto.tink.shaded.protobuf.C9522e.P(r6, r12, r4, r14, r15)
            goto L_0x006d
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            int r13 = com.google.crypto.tink.shaded.protobuf.u0.c(r13, r5)
            r1.n(r13, r3)
        L_0x00d4:
            r13 = r4
            goto L_0x0019
        L_0x00d7:
            if (r13 != r14) goto L_0x00da
            return
        L_0x00da:
            com.google.crypto.tink.shaded.protobuf.B r11 = com.google.crypto.tink.shaded.protobuf.B.h()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.W.d(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):void");
    }

    public T e() {
        S s10 = this.f67958a;
        return s10 instanceof C9541y ? ((C9541y) s10).G() : s10.newBuilderForType().q();
    }

    public void f(T t10) {
        this.f67959b.j(t10);
        this.f67961d.f(t10);
    }

    public final boolean g(T t10) {
        return this.f67961d.c(t10).o();
    }

    public int h(T t10) {
        int k10 = k(this.f67959b, t10);
        return this.f67960c ? k10 + this.f67961d.c(t10).j() : k10;
    }

    public void i(T t10, g0 g0Var, C9533p pVar) {
        l(this.f67959b, this.f67961d, t10, g0Var, pVar);
    }

    public void j(T t10, v0 v0Var) {
        Iterator<Map.Entry<?, Object>> s10 = this.f67961d.c(t10).s();
        while (s10.hasNext()) {
            Map.Entry next = s10.next();
            C9537u.b bVar = (C9537u.b) next.getKey();
            if (bVar.g() != u0.c.MESSAGE || bVar.e() || bVar.i()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof D.b) {
                v0Var.b(bVar.d(), ((D.b) next).a().e());
            } else {
                v0Var.b(bVar.d(), next.getValue());
            }
        }
        o(this.f67959b, t10, v0Var);
    }
}
