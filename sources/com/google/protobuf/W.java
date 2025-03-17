package com.google.protobuf;

import com.google.protobuf.C9587u;
import com.google.protobuf.D;
import com.google.protobuf.u0;
import java.util.Iterator;
import java.util.Map;

final class W<T> implements h0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final S f69257a;

    /* renamed from: b  reason: collision with root package name */
    private final o0<?, ?> f69258b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f69259c;

    /* renamed from: d  reason: collision with root package name */
    private final C9584q<?> f69260d;

    private W(o0<?, ?> o0Var, C9584q<?> qVar, S s10) {
        this.f69258b = o0Var;
        this.f69259c = qVar.e(s10);
        this.f69260d = qVar;
        this.f69257a = s10;
    }

    private <UT, UB> int k(o0<UT, UB> o0Var, T t10) {
        return o0Var.i(o0Var.g(t10));
    }

    private <UT, UB, ET extends C9587u.b<ET>> void l(o0<UT, UB> o0Var, C9584q<ET> qVar, T t10, g0 g0Var, C9583p pVar) {
        UB f10 = o0Var.f(t10);
        C9587u<ET> d10 = qVar.d(t10);
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

    static <T> W<T> m(o0<?, ?> o0Var, C9584q<?> qVar, S s10) {
        return new W<>(o0Var, qVar, s10);
    }

    private <UT, UB, ET extends C9587u.b<ET>> boolean n(g0 g0Var, C9583p pVar, C9584q<ET> qVar, C9587u<ET> uVar, o0<UT, UB> o0Var, UB ub2) {
        int a10 = g0Var.a();
        if (a10 == u0.f69415a) {
            Object obj = null;
            int i10 = 0;
            C9575h hVar = null;
            while (g0Var.A() != Integer.MAX_VALUE) {
                int a11 = g0Var.a();
                if (a11 == u0.f69417c) {
                    i10 = g0Var.h();
                    obj = qVar.b(pVar, this.f69257a, i10);
                } else if (a11 == u0.f69418d) {
                    if (obj != null) {
                        qVar.h(g0Var, obj, pVar, uVar);
                    } else {
                        hVar = g0Var.o();
                    }
                } else if (!g0Var.D()) {
                    break;
                }
            }
            if (g0Var.a() == u0.f69416b) {
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
            Object b10 = qVar.b(pVar, this.f69257a, u0.a(a10));
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
        j0.G(this.f69258b, t10, t11);
        if (this.f69259c) {
            j0.E(this.f69260d, t10, t11);
        }
    }

    public int b(T t10) {
        int hashCode = this.f69258b.g(t10).hashCode();
        return this.f69259c ? (hashCode * 53) + this.f69260d.c(t10).hashCode() : hashCode;
    }

    public boolean c(T t10, T t11) {
        if (!this.f69258b.g(t10).equals(this.f69258b.g(t11))) {
            return false;
        }
        if (this.f69259c) {
            return this.f69260d.c(t10).equals(this.f69260d.c(t11));
        }
        return true;
    }

    public void d(T t10, v0 v0Var) {
        Iterator<Map.Entry<?, Object>> t11 = this.f69260d.c(t10).t();
        while (t11.hasNext()) {
            Map.Entry next = t11.next();
            C9587u.b bVar = (C9587u.b) next.getKey();
            if (bVar.g() != u0.c.MESSAGE || bVar.e() || bVar.i()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof D.b) {
                v0Var.b(bVar.d(), ((D.b) next).a().e());
            } else {
                v0Var.b(bVar.d(), next.getValue());
            }
        }
        o(this.f69258b, t10, v0Var);
    }

    public T e() {
        S s10 = this.f69257a;
        return s10 instanceof GeneratedMessageLite ? ((GeneratedMessageLite) s10).newMutableInstance() : s10.newBuilderForType().q();
    }

    public void f(T t10) {
        this.f69258b.j(t10);
        this.f69260d.f(t10);
    }

    public final boolean g(T t10) {
        return this.f69260d.c(t10).p();
    }

    public int h(T t10) {
        int k10 = k(this.f69258b, t10);
        return this.f69259c ? k10 + this.f69260d.c(t10).j() : k10;
    }

    public void i(T t10, g0 g0Var, C9583p pVar) {
        l(this.f69258b, this.f69260d, t10, g0Var, pVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.protobuf.GeneratedMessageLite$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(T r11, byte[] r12, int r13, int r14, com.google.protobuf.C9572e.b r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            com.google.protobuf.p0 r1 = r0.unknownFields
            com.google.protobuf.p0 r2 = com.google.protobuf.p0.c()
            if (r1 != r2) goto L_0x0011
            com.google.protobuf.p0 r1 = com.google.protobuf.p0.k()
            r0.unknownFields = r1
        L_0x0011:
            com.google.protobuf.GeneratedMessageLite$c r11 = (com.google.protobuf.GeneratedMessageLite.c) r11
            com.google.protobuf.u r11 = r11.h()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00d7
            int r4 = com.google.protobuf.C9572e.I(r12, r13, r15)
            int r13 = r15.f69272a
            int r3 = com.google.protobuf.u0.f69415a
            r5 = 2
            if (r13 == r3) goto L_0x006b
            int r3 = com.google.protobuf.u0.b(r13)
            if (r3 != r5) goto L_0x0066
            com.google.protobuf.q<?> r2 = r10.f69260d
            com.google.protobuf.p r3 = r15.f69275d
            com.google.protobuf.S r5 = r10.f69257a
            int r6 = com.google.protobuf.u0.a(r13)
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.GeneratedMessageLite$e r8 = (com.google.protobuf.GeneratedMessageLite.e) r8
            if (r8 == 0) goto L_0x005c
            com.google.protobuf.d0 r13 = com.google.protobuf.d0.a()
            com.google.protobuf.S r2 = r8.b()
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.h0 r13 = r13.c(r2)
            int r13 = com.google.protobuf.C9572e.p(r13, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$d r2 = r8.f69214b
            java.lang.Object r3 = r15.f69274c
            r11.y(r2, r3)
        L_0x005a:
            r2 = r8
            goto L_0x0019
        L_0x005c:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.C9572e.G(r2, r3, r4, r5, r6, r7)
            goto L_0x005a
        L_0x0066:
            int r13 = com.google.protobuf.C9572e.P(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x006b:
            r13 = 0
            r3 = r0
        L_0x006d:
            if (r4 >= r14) goto L_0x00cb
            int r4 = com.google.protobuf.C9572e.I(r12, r4, r15)
            int r6 = r15.f69272a
            int r7 = com.google.protobuf.u0.a(r6)
            int r8 = com.google.protobuf.u0.b(r6)
            if (r7 == r5) goto L_0x00ac
            r9 = 3
            if (r7 == r9) goto L_0x0083
            goto L_0x00c1
        L_0x0083:
            if (r2 == 0) goto L_0x00a1
            com.google.protobuf.d0 r6 = com.google.protobuf.d0.a()
            com.google.protobuf.S r7 = r2.b()
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.h0 r6 = r6.c(r7)
            int r4 = com.google.protobuf.C9572e.p(r6, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$d r6 = r2.f69214b
            java.lang.Object r7 = r15.f69274c
            r11.y(r6, r7)
            goto L_0x006d
        L_0x00a1:
            if (r8 != r5) goto L_0x00c1
            int r4 = com.google.protobuf.C9572e.b(r12, r4, r15)
            java.lang.Object r3 = r15.f69274c
            com.google.protobuf.h r3 = (com.google.protobuf.C9575h) r3
            goto L_0x006d
        L_0x00ac:
            if (r8 != 0) goto L_0x00c1
            int r4 = com.google.protobuf.C9572e.I(r12, r4, r15)
            int r13 = r15.f69272a
            com.google.protobuf.q<?> r2 = r10.f69260d
            com.google.protobuf.p r6 = r15.f69275d
            com.google.protobuf.S r7 = r10.f69257a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            com.google.protobuf.GeneratedMessageLite$e r2 = (com.google.protobuf.GeneratedMessageLite.e) r2
            goto L_0x006d
        L_0x00c1:
            int r7 = com.google.protobuf.u0.f69416b
            if (r6 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r4 = com.google.protobuf.C9572e.P(r6, r12, r4, r14, r15)
            goto L_0x006d
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            int r13 = com.google.protobuf.u0.c(r13, r5)
            r1.n(r13, r3)
        L_0x00d4:
            r13 = r4
            goto L_0x0019
        L_0x00d7:
            if (r13 != r14) goto L_0x00da
            return
        L_0x00da:
            com.google.protobuf.B r11 = com.google.protobuf.B.h()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.W.j(java.lang.Object, byte[], int, int, com.google.protobuf.e$b):void");
    }
}
