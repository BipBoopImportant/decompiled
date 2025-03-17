package q2;

import java.util.ArrayList;
import p2.C5756a;
import p2.e;
import p2.f;
import q2.b;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private static b.a f27797a = new b.a();

    /* renamed from: b  reason: collision with root package name */
    private static int f27798b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static int f27799c = 0;

    private static boolean a(int i10, e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b A10 = eVar.A();
        e.b V10 = eVar.V();
        f fVar = eVar.L() != null ? (f) eVar.L() : null;
        if (fVar != null) {
            e.b A11 = fVar.A();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            e.b V11 = fVar.V();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z10 = A10 == bVar5 || eVar.p0() || A10 == e.b.WRAP_CONTENT || (A10 == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f27484w == 0 && eVar.f27447d0 == 0.0f && eVar.c0(0)) || (A10 == bVar2 && eVar.f27484w == 1 && eVar.f0(0, eVar.Y()));
        boolean z11 = V10 == bVar5 || eVar.q0() || V10 == e.b.WRAP_CONTENT || (V10 == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f27486x == 0 && eVar.f27447d0 == 0.0f && eVar.c0(1)) || (V10 == bVar && eVar.f27486x == 1 && eVar.f0(1, eVar.x()));
        if (eVar.f27447d0 <= 0.0f || (!z10 && !z11)) {
            return z10 && z11;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        r11 = r12.f27430Q.f27399f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r11 = r12.f27428O.f27399f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(int r16, p2.e r17, q2.b.C0446b r18, boolean r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r17.i0()
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            int r3 = f27798b
            r4 = 1
            int r3 = r3 + r4
            f27798b = r3
            boolean r3 = r0 instanceof p2.f
            if (r3 != 0) goto L_0x002f
            boolean r3 = r17.o0()
            if (r3 == 0) goto L_0x002f
            int r3 = r16 + 1
            boolean r5 = a(r3, r0)
            if (r5 == 0) goto L_0x002f
            q2.b$a r5 = new q2.b$a
            r5.<init>()
            int r6 = q2.b.a.f27760k
            p2.f.Y1(r3, r0, r1, r5, r6)
        L_0x002f:
            p2.d$a r3 = p2.d.a.LEFT
            p2.d r3 = r0.o(r3)
            p2.d$a r5 = p2.d.a.RIGHT
            p2.d r5 = r0.o(r5)
            int r6 = r3.e()
            int r7 = r5.e()
            java.util.HashSet r8 = r3.d()
            r9 = 0
            r10 = 8
            if (r8 == 0) goto L_0x0131
            boolean r8 = r3.n()
            if (r8 == 0) goto L_0x0131
            java.util.HashSet r3 = r3.d()
            java.util.Iterator r3 = r3.iterator()
        L_0x005a:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0131
            java.lang.Object r8 = r3.next()
            p2.d r8 = (p2.d) r8
            p2.e r12 = r8.f27397d
            int r13 = r16 + 1
            boolean r14 = a(r13, r12)
            boolean r15 = r12.o0()
            if (r15 == 0) goto L_0x0080
            if (r14 == 0) goto L_0x0080
            q2.b$a r15 = new q2.b$a
            r15.<init>()
            int r11 = q2.b.a.f27760k
            p2.f.Y1(r13, r12, r1, r15, r11)
        L_0x0080:
            p2.d r11 = r12.f27428O
            if (r8 != r11) goto L_0x0090
            p2.d r11 = r12.f27430Q
            p2.d r11 = r11.f27399f
            if (r11 == 0) goto L_0x0090
            boolean r11 = r11.n()
            if (r11 != 0) goto L_0x00a0
        L_0x0090:
            p2.d r11 = r12.f27430Q
            if (r8 != r11) goto L_0x00a2
            p2.d r11 = r12.f27428O
            p2.d r11 = r11.f27399f
            if (r11 == 0) goto L_0x00a2
            boolean r11 = r11.n()
            if (r11 == 0) goto L_0x00a2
        L_0x00a0:
            r11 = r4
            goto L_0x00a3
        L_0x00a2:
            r11 = 0
        L_0x00a3:
            p2.e$b r15 = r12.A()
            p2.e$b r4 = p2.e.b.MATCH_CONSTRAINT
            if (r15 != r4) goto L_0x00e6
            if (r14 == 0) goto L_0x00ae
            goto L_0x00e6
        L_0x00ae:
            p2.e$b r8 = r12.A()
            if (r8 != r4) goto L_0x00ec
            int r4 = r12.f27404A
            if (r4 < 0) goto L_0x00ec
            int r4 = r12.f27490z
            if (r4 < 0) goto L_0x00ec
            int r4 = r12.X()
            if (r4 == r10) goto L_0x00ce
            int r4 = r12.f27484w
            if (r4 != 0) goto L_0x00ec
            float r4 = r12.v()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x00ec
        L_0x00ce:
            boolean r4 = r12.k0()
            if (r4 != 0) goto L_0x00ec
            boolean r4 = r12.n0()
            if (r4 != 0) goto L_0x00ec
            if (r11 == 0) goto L_0x00ec
            boolean r4 = r12.k0()
            if (r4 != 0) goto L_0x00ec
            e(r13, r0, r1, r12, r2)
            goto L_0x00ec
        L_0x00e6:
            boolean r4 = r12.o0()
            if (r4 == 0) goto L_0x00ef
        L_0x00ec:
            r4 = 1
            goto L_0x005a
        L_0x00ef:
            p2.d r4 = r12.f27428O
            if (r8 != r4) goto L_0x010a
            p2.d r14 = r12.f27430Q
            p2.d r14 = r14.f27399f
            if (r14 != 0) goto L_0x010a
            int r4 = r4.f()
            int r4 = r4 + r6
            int r8 = r12.Y()
            int r8 = r8 + r4
            r12.J0(r4, r8)
            b(r13, r12, r1, r2)
            goto L_0x00ec
        L_0x010a:
            p2.d r14 = r12.f27430Q
            if (r8 != r14) goto L_0x0125
            p2.d r4 = r4.f27399f
            if (r4 != 0) goto L_0x0125
            int r4 = r14.f()
            int r4 = r6 - r4
            int r8 = r12.Y()
            int r8 = r4 - r8
            r12.J0(r8, r4)
            b(r13, r12, r1, r2)
            goto L_0x00ec
        L_0x0125:
            if (r11 == 0) goto L_0x00ec
            boolean r4 = r12.k0()
            if (r4 != 0) goto L_0x00ec
            d(r13, r1, r12, r2)
            goto L_0x00ec
        L_0x0131:
            boolean r3 = r0 instanceof p2.h
            if (r3 == 0) goto L_0x0136
            return
        L_0x0136:
            java.util.HashSet r3 = r5.d()
            if (r3 == 0) goto L_0x0225
            boolean r3 = r5.n()
            if (r3 == 0) goto L_0x0225
            java.util.HashSet r3 = r5.d()
            java.util.Iterator r3 = r3.iterator()
        L_0x014a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0225
            java.lang.Object r4 = r3.next()
            p2.d r4 = (p2.d) r4
            p2.e r5 = r4.f27397d
            r6 = 1
            int r8 = r16 + 1
            boolean r11 = a(r8, r5)
            boolean r12 = r5.o0()
            if (r12 == 0) goto L_0x0171
            if (r11 == 0) goto L_0x0171
            q2.b$a r12 = new q2.b$a
            r12.<init>()
            int r13 = q2.b.a.f27760k
            p2.f.Y1(r8, r5, r1, r12, r13)
        L_0x0171:
            p2.d r12 = r5.f27428O
            if (r4 != r12) goto L_0x0181
            p2.d r12 = r5.f27430Q
            p2.d r12 = r12.f27399f
            if (r12 == 0) goto L_0x0181
            boolean r12 = r12.n()
            if (r12 != 0) goto L_0x0191
        L_0x0181:
            p2.d r12 = r5.f27430Q
            if (r4 != r12) goto L_0x0193
            p2.d r12 = r5.f27428O
            p2.d r12 = r12.f27399f
            if (r12 == 0) goto L_0x0193
            boolean r12 = r12.n()
            if (r12 == 0) goto L_0x0193
        L_0x0191:
            r12 = r6
            goto L_0x0194
        L_0x0193:
            r12 = 0
        L_0x0194:
            p2.e$b r13 = r5.A()
            p2.e$b r14 = p2.e.b.MATCH_CONSTRAINT
            if (r13 != r14) goto L_0x01d8
            if (r11 == 0) goto L_0x019f
            goto L_0x01d8
        L_0x019f:
            p2.e$b r4 = r5.A()
            if (r4 != r14) goto L_0x014a
            int r4 = r5.f27404A
            if (r4 < 0) goto L_0x014a
            int r4 = r5.f27490z
            if (r4 < 0) goto L_0x014a
            int r4 = r5.X()
            if (r4 == r10) goto L_0x01bf
            int r4 = r5.f27484w
            if (r4 != 0) goto L_0x014a
            float r4 = r5.v()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x014a
        L_0x01bf:
            boolean r4 = r5.k0()
            if (r4 != 0) goto L_0x014a
            boolean r4 = r5.n0()
            if (r4 != 0) goto L_0x014a
            if (r12 == 0) goto L_0x014a
            boolean r4 = r5.k0()
            if (r4 != 0) goto L_0x014a
            e(r8, r0, r1, r5, r2)
            goto L_0x014a
        L_0x01d8:
            boolean r11 = r5.o0()
            if (r11 == 0) goto L_0x01e0
            goto L_0x014a
        L_0x01e0:
            p2.d r11 = r5.f27428O
            if (r4 != r11) goto L_0x01fc
            p2.d r13 = r5.f27430Q
            p2.d r13 = r13.f27399f
            if (r13 != 0) goto L_0x01fc
            int r4 = r11.f()
            int r4 = r4 + r7
            int r11 = r5.Y()
            int r11 = r11 + r4
            r5.J0(r4, r11)
            b(r8, r5, r1, r2)
            goto L_0x014a
        L_0x01fc:
            p2.d r13 = r5.f27430Q
            if (r4 != r13) goto L_0x0218
            p2.d r4 = r11.f27399f
            if (r4 != 0) goto L_0x0218
            int r4 = r13.f()
            int r4 = r7 - r4
            int r11 = r5.Y()
            int r11 = r4 - r11
            r5.J0(r11, r4)
            b(r8, r5, r1, r2)
            goto L_0x014a
        L_0x0218:
            if (r12 == 0) goto L_0x014a
            boolean r4 = r5.k0()
            if (r4 != 0) goto L_0x014a
            d(r8, r1, r5, r2)
            goto L_0x014a
        L_0x0225:
            r17.s0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.h.b(int, p2.e, q2.b$b, boolean):void");
    }

    private static void c(int i10, C5756a aVar, b.C0446b bVar, int i11, boolean z10) {
        if (!aVar.x1()) {
            return;
        }
        if (i11 == 0) {
            b(i10 + 1, aVar, bVar, z10);
        } else {
            i(i10 + 1, aVar, bVar);
        }
    }

    private static void d(int i10, b.C0446b bVar, e eVar, boolean z10) {
        float y10 = eVar.y();
        int e10 = eVar.f27428O.f27399f.e();
        int e11 = eVar.f27430Q.f27399f.e();
        int f10 = eVar.f27428O.f() + e10;
        int f11 = e11 - eVar.f27430Q.f();
        if (e10 == e11) {
            y10 = 0.5f;
        } else {
            e10 = f10;
            e11 = f11;
        }
        int Y10 = eVar.Y();
        int i11 = (e11 - e10) - Y10;
        if (e10 > e11) {
            i11 = (e10 - e11) - Y10;
        }
        int i12 = ((int) (i11 > 0 ? (y10 * ((float) i11)) + 0.5f : y10 * ((float) i11))) + e10;
        int i13 = i12 + Y10;
        if (e10 > e11) {
            i13 = i12 - Y10;
        }
        eVar.J0(i12, i13);
        b(i10 + 1, eVar, bVar, z10);
    }

    private static void e(int i10, e eVar, b.C0446b bVar, e eVar2, boolean z10) {
        float y10 = eVar2.y();
        int e10 = eVar2.f27428O.f27399f.e() + eVar2.f27428O.f();
        int e11 = eVar2.f27430Q.f27399f.e() - eVar2.f27430Q.f();
        if (e11 >= e10) {
            int Y10 = eVar2.Y();
            if (eVar2.X() != 8) {
                int i11 = eVar2.f27484w;
                if (i11 == 2) {
                    Y10 = (int) (eVar2.y() * 0.5f * ((float) (eVar instanceof f ? eVar.Y() : eVar.L().Y())));
                } else if (i11 == 0) {
                    Y10 = e11 - e10;
                }
                Y10 = Math.max(eVar2.f27490z, Y10);
                int i12 = eVar2.f27404A;
                if (i12 > 0) {
                    Y10 = Math.min(i12, Y10);
                }
            }
            int i13 = e10 + ((int) ((y10 * ((float) ((e11 - e10) - Y10))) + 0.5f));
            eVar2.J0(i13, Y10 + i13);
            b(i10 + 1, eVar2, bVar, z10);
        }
    }

    private static void f(int i10, b.C0446b bVar, e eVar) {
        float T10 = eVar.T();
        int e10 = eVar.f27429P.f27399f.e();
        int e11 = eVar.f27431R.f27399f.e();
        int f10 = eVar.f27429P.f() + e10;
        int f11 = e11 - eVar.f27431R.f();
        if (e10 == e11) {
            T10 = 0.5f;
        } else {
            e10 = f10;
            e11 = f11;
        }
        int x10 = eVar.x();
        int i11 = (e11 - e10) - x10;
        if (e10 > e11) {
            i11 = (e10 - e11) - x10;
        }
        int i12 = (int) (i11 > 0 ? (T10 * ((float) i11)) + 0.5f : T10 * ((float) i11));
        int i13 = e10 + i12;
        int i14 = i13 + x10;
        if (e10 > e11) {
            i13 = e10 - i12;
            i14 = i13 - x10;
        }
        eVar.M0(i13, i14);
        i(i10 + 1, eVar, bVar);
    }

    private static void g(int i10, e eVar, b.C0446b bVar, e eVar2) {
        float T10 = eVar2.T();
        int e10 = eVar2.f27429P.f27399f.e() + eVar2.f27429P.f();
        int e11 = eVar2.f27431R.f27399f.e() - eVar2.f27431R.f();
        if (e11 >= e10) {
            int x10 = eVar2.x();
            if (eVar2.X() != 8) {
                int i11 = eVar2.f27486x;
                if (i11 == 2) {
                    x10 = (int) (T10 * 0.5f * ((float) (eVar instanceof f ? eVar.x() : eVar.L().x())));
                } else if (i11 == 0) {
                    x10 = e11 - e10;
                }
                x10 = Math.max(eVar2.f27408C, x10);
                int i12 = eVar2.f27410D;
                if (i12 > 0) {
                    x10 = Math.min(i12, x10);
                }
            }
            int i13 = e10 + ((int) ((T10 * ((float) ((e11 - e10) - x10))) + 0.5f));
            eVar2.M0(i13, x10 + i13);
            i(i10 + 1, eVar2, bVar);
        }
    }

    public static void h(f fVar, b.C0446b bVar) {
        e.b A10 = fVar.A();
        e.b V10 = fVar.V();
        f27798b = 0;
        f27799c = 0;
        fVar.x0();
        ArrayList<e> w12 = fVar.w1();
        int size = w12.size();
        for (int i10 = 0; i10 < size; i10++) {
            w12.get(i10).x0();
        }
        boolean V12 = fVar.V1();
        if (A10 == e.b.FIXED) {
            fVar.J0(0, fVar.Y());
        } else {
            fVar.K0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = w12.get(i11);
            if (eVar instanceof p2.h) {
                p2.h hVar = (p2.h) eVar;
                if (hVar.w1() == 1) {
                    if (hVar.x1() != -1) {
                        hVar.A1(hVar.x1());
                    } else if (hVar.y1() != -1 && fVar.p0()) {
                        hVar.A1(fVar.Y() - hVar.y1());
                    } else if (fVar.p0()) {
                        hVar.A1((int) ((hVar.z1() * ((float) fVar.Y())) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((eVar instanceof C5756a) && ((C5756a) eVar).B1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                e eVar2 = w12.get(i12);
                if (eVar2 instanceof p2.h) {
                    p2.h hVar2 = (p2.h) eVar2;
                    if (hVar2.w1() == 1) {
                        b(0, hVar2, bVar, V12);
                    }
                }
            }
        }
        b(0, fVar, bVar, V12);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                e eVar3 = w12.get(i13);
                if (eVar3 instanceof C5756a) {
                    C5756a aVar = (C5756a) eVar3;
                    if (aVar.B1() == 0) {
                        c(0, aVar, bVar, 0, V12);
                    }
                }
            }
        }
        if (V10 == e.b.FIXED) {
            fVar.M0(0, fVar.x());
        } else {
            fVar.L0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            e eVar4 = w12.get(i14);
            if (eVar4 instanceof p2.h) {
                p2.h hVar3 = (p2.h) eVar4;
                if (hVar3.w1() == 0) {
                    if (hVar3.x1() != -1) {
                        hVar3.A1(hVar3.x1());
                    } else if (hVar3.y1() != -1 && fVar.q0()) {
                        hVar3.A1(fVar.x() - hVar3.y1());
                    } else if (fVar.q0()) {
                        hVar3.A1((int) ((hVar3.z1() * ((float) fVar.x())) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((eVar4 instanceof C5756a) && ((C5756a) eVar4).B1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                e eVar5 = w12.get(i15);
                if (eVar5 instanceof p2.h) {
                    p2.h hVar4 = (p2.h) eVar5;
                    if (hVar4.w1() == 0) {
                        i(1, hVar4, bVar);
                    }
                }
            }
        }
        i(0, fVar, bVar);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                e eVar6 = w12.get(i16);
                if (eVar6 instanceof C5756a) {
                    C5756a aVar2 = (C5756a) eVar6;
                    if (aVar2.B1() == 1) {
                        c(0, aVar2, bVar, 1, V12);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            e eVar7 = w12.get(i17);
            if (eVar7.o0() && a(0, eVar7)) {
                f.Y1(0, eVar7, bVar, f27797a, b.a.f27760k);
                if (!(eVar7 instanceof p2.h)) {
                    b(0, eVar7, bVar, V12);
                    i(0, eVar7, bVar);
                } else if (((p2.h) eVar7).w1() == 0) {
                    i(0, eVar7, bVar);
                } else {
                    b(0, eVar7, bVar, V12);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        r14 = r11.f27431R.f27399f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        r14 = r11.f27429P.f27399f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void i(int r16, p2.e r17, q2.b.C0446b r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r17.r0()
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            int r2 = f27799c
            r3 = 1
            int r2 = r2 + r3
            f27799c = r2
            boolean r2 = r0 instanceof p2.f
            if (r2 != 0) goto L_0x002d
            boolean r2 = r17.o0()
            if (r2 == 0) goto L_0x002d
            int r2 = r16 + 1
            boolean r4 = a(r2, r0)
            if (r4 == 0) goto L_0x002d
            q2.b$a r4 = new q2.b$a
            r4.<init>()
            int r5 = q2.b.a.f27760k
            p2.f.Y1(r2, r0, r1, r4, r5)
        L_0x002d:
            p2.d$a r2 = p2.d.a.TOP
            p2.d r2 = r0.o(r2)
            p2.d$a r4 = p2.d.a.BOTTOM
            p2.d r4 = r0.o(r4)
            int r5 = r2.e()
            int r6 = r4.e()
            java.util.HashSet r7 = r2.d()
            r8 = 0
            r9 = 8
            if (r7 == 0) goto L_0x0132
            boolean r7 = r2.n()
            if (r7 == 0) goto L_0x0132
            java.util.HashSet r2 = r2.d()
            java.util.Iterator r2 = r2.iterator()
        L_0x0058:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0132
            java.lang.Object r7 = r2.next()
            p2.d r7 = (p2.d) r7
            p2.e r11 = r7.f27397d
            int r12 = r16 + 1
            boolean r13 = a(r12, r11)
            boolean r14 = r11.o0()
            if (r14 == 0) goto L_0x007e
            if (r13 == 0) goto L_0x007e
            q2.b$a r14 = new q2.b$a
            r14.<init>()
            int r15 = q2.b.a.f27760k
            p2.f.Y1(r12, r11, r1, r14, r15)
        L_0x007e:
            p2.d r14 = r11.f27429P
            if (r7 != r14) goto L_0x008e
            p2.d r14 = r11.f27431R
            p2.d r14 = r14.f27399f
            if (r14 == 0) goto L_0x008e
            boolean r14 = r14.n()
            if (r14 != 0) goto L_0x009e
        L_0x008e:
            p2.d r14 = r11.f27431R
            if (r7 != r14) goto L_0x00a0
            p2.d r14 = r11.f27429P
            p2.d r14 = r14.f27399f
            if (r14 == 0) goto L_0x00a0
            boolean r14 = r14.n()
            if (r14 == 0) goto L_0x00a0
        L_0x009e:
            r14 = r3
            goto L_0x00a1
        L_0x00a0:
            r14 = 0
        L_0x00a1:
            p2.e$b r15 = r11.V()
            p2.e$b r10 = p2.e.b.MATCH_CONSTRAINT
            if (r15 != r10) goto L_0x00e5
            if (r13 == 0) goto L_0x00ac
            goto L_0x00e5
        L_0x00ac:
            p2.e$b r7 = r11.V()
            if (r7 != r10) goto L_0x0058
            int r7 = r11.f27410D
            if (r7 < 0) goto L_0x0058
            int r7 = r11.f27408C
            if (r7 < 0) goto L_0x0058
            int r7 = r11.X()
            if (r7 == r9) goto L_0x00cc
            int r7 = r11.f27486x
            if (r7 != 0) goto L_0x0058
            float r7 = r11.v()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0058
        L_0x00cc:
            boolean r7 = r11.m0()
            if (r7 != 0) goto L_0x0058
            boolean r7 = r11.n0()
            if (r7 != 0) goto L_0x0058
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.m0()
            if (r7 != 0) goto L_0x0058
            g(r12, r0, r1, r11)
            goto L_0x0058
        L_0x00e5:
            boolean r10 = r11.o0()
            if (r10 == 0) goto L_0x00ed
            goto L_0x0058
        L_0x00ed:
            p2.d r10 = r11.f27429P
            if (r7 != r10) goto L_0x0109
            p2.d r13 = r11.f27431R
            p2.d r13 = r13.f27399f
            if (r13 != 0) goto L_0x0109
            int r7 = r10.f()
            int r7 = r7 + r5
            int r10 = r11.x()
            int r10 = r10 + r7
            r11.M0(r7, r10)
            i(r12, r11, r1)
            goto L_0x0058
        L_0x0109:
            p2.d r13 = r11.f27431R
            if (r7 != r13) goto L_0x0125
            p2.d r7 = r10.f27399f
            if (r7 != 0) goto L_0x0125
            int r7 = r13.f()
            int r7 = r5 - r7
            int r10 = r11.x()
            int r10 = r7 - r10
            r11.M0(r10, r7)
            i(r12, r11, r1)
            goto L_0x0058
        L_0x0125:
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.m0()
            if (r7 != 0) goto L_0x0058
            f(r12, r1, r11)
            goto L_0x0058
        L_0x0132:
            boolean r2 = r0 instanceof p2.h
            if (r2 == 0) goto L_0x0137
            return
        L_0x0137:
            java.util.HashSet r2 = r4.d()
            if (r2 == 0) goto L_0x0225
            boolean r2 = r4.n()
            if (r2 == 0) goto L_0x0225
            java.util.HashSet r2 = r4.d()
            java.util.Iterator r2 = r2.iterator()
        L_0x014b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0225
            java.lang.Object r4 = r2.next()
            p2.d r4 = (p2.d) r4
            p2.e r5 = r4.f27397d
            int r7 = r16 + 1
            boolean r10 = a(r7, r5)
            boolean r11 = r5.o0()
            if (r11 == 0) goto L_0x0171
            if (r10 == 0) goto L_0x0171
            q2.b$a r11 = new q2.b$a
            r11.<init>()
            int r12 = q2.b.a.f27760k
            p2.f.Y1(r7, r5, r1, r11, r12)
        L_0x0171:
            p2.d r11 = r5.f27429P
            if (r4 != r11) goto L_0x0181
            p2.d r11 = r5.f27431R
            p2.d r11 = r11.f27399f
            if (r11 == 0) goto L_0x0181
            boolean r11 = r11.n()
            if (r11 != 0) goto L_0x0191
        L_0x0181:
            p2.d r11 = r5.f27431R
            if (r4 != r11) goto L_0x0193
            p2.d r11 = r5.f27429P
            p2.d r11 = r11.f27399f
            if (r11 == 0) goto L_0x0193
            boolean r11 = r11.n()
            if (r11 == 0) goto L_0x0193
        L_0x0191:
            r11 = r3
            goto L_0x0194
        L_0x0193:
            r11 = 0
        L_0x0194:
            p2.e$b r12 = r5.V()
            p2.e$b r13 = p2.e.b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x01d8
            if (r10 == 0) goto L_0x019f
            goto L_0x01d8
        L_0x019f:
            p2.e$b r4 = r5.V()
            if (r4 != r13) goto L_0x014b
            int r4 = r5.f27410D
            if (r4 < 0) goto L_0x014b
            int r4 = r5.f27408C
            if (r4 < 0) goto L_0x014b
            int r4 = r5.X()
            if (r4 == r9) goto L_0x01bf
            int r4 = r5.f27486x
            if (r4 != 0) goto L_0x014b
            float r4 = r5.v()
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x014b
        L_0x01bf:
            boolean r4 = r5.m0()
            if (r4 != 0) goto L_0x014b
            boolean r4 = r5.n0()
            if (r4 != 0) goto L_0x014b
            if (r11 == 0) goto L_0x014b
            boolean r4 = r5.m0()
            if (r4 != 0) goto L_0x014b
            g(r7, r0, r1, r5)
            goto L_0x014b
        L_0x01d8:
            boolean r10 = r5.o0()
            if (r10 == 0) goto L_0x01e0
            goto L_0x014b
        L_0x01e0:
            p2.d r10 = r5.f27429P
            if (r4 != r10) goto L_0x01fc
            p2.d r12 = r5.f27431R
            p2.d r12 = r12.f27399f
            if (r12 != 0) goto L_0x01fc
            int r4 = r10.f()
            int r4 = r4 + r6
            int r10 = r5.x()
            int r10 = r10 + r4
            r5.M0(r4, r10)
            i(r7, r5, r1)
            goto L_0x014b
        L_0x01fc:
            p2.d r12 = r5.f27431R
            if (r4 != r12) goto L_0x0218
            p2.d r4 = r10.f27399f
            if (r4 != 0) goto L_0x0218
            int r4 = r12.f()
            int r4 = r6 - r4
            int r10 = r5.x()
            int r10 = r4 - r10
            r5.M0(r10, r4)
            i(r7, r5, r1)
            goto L_0x014b
        L_0x0218:
            if (r11 == 0) goto L_0x014b
            boolean r4 = r5.m0()
            if (r4 != 0) goto L_0x014b
            f(r7, r1, r5)
            goto L_0x014b
        L_0x0225:
            p2.d$a r2 = p2.d.a.BASELINE
            p2.d r2 = r0.o(r2)
            java.util.HashSet r4 = r2.d()
            if (r4 == 0) goto L_0x028a
            boolean r4 = r2.n()
            if (r4 == 0) goto L_0x028a
            int r4 = r2.e()
            java.util.HashSet r2 = r2.d()
            java.util.Iterator r2 = r2.iterator()
        L_0x0243:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x028a
            java.lang.Object r5 = r2.next()
            p2.d r5 = (p2.d) r5
            p2.e r6 = r5.f27397d
            int r7 = r16 + 1
            boolean r8 = a(r7, r6)
            boolean r9 = r6.o0()
            if (r9 == 0) goto L_0x0269
            if (r8 == 0) goto L_0x0269
            q2.b$a r9 = new q2.b$a
            r9.<init>()
            int r10 = q2.b.a.f27760k
            p2.f.Y1(r7, r6, r1, r9, r10)
        L_0x0269:
            p2.e$b r9 = r6.V()
            p2.e$b r10 = p2.e.b.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x0273
            if (r8 == 0) goto L_0x0243
        L_0x0273:
            boolean r8 = r6.o0()
            if (r8 == 0) goto L_0x027a
            goto L_0x0243
        L_0x027a:
            p2.d r8 = r6.f27432S
            if (r5 != r8) goto L_0x0243
            int r5 = r5.f()
            int r5 = r5 + r4
            r6.I0(r5)
            i(r7, r6, r1)
            goto L_0x0243
        L_0x028a:
            r17.t0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.h.i(int, p2.e, q2.b$b):void");
    }
}
