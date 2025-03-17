package q2;

import h2.C5414d;
import java.util.ArrayList;
import p2.d;
import p2.e;
import p2.f;
import p2.h;
import p2.i;
import p2.k;
import p2.l;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<e> f27757a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private a f27758b = new a();

    /* renamed from: c  reason: collision with root package name */
    private f f27759c;

    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static int f27760k = 0;

        /* renamed from: l  reason: collision with root package name */
        public static int f27761l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static int f27762m = 2;

        /* renamed from: a  reason: collision with root package name */
        public e.b f27763a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f27764b;

        /* renamed from: c  reason: collision with root package name */
        public int f27765c;

        /* renamed from: d  reason: collision with root package name */
        public int f27766d;

        /* renamed from: e  reason: collision with root package name */
        public int f27767e;

        /* renamed from: f  reason: collision with root package name */
        public int f27768f;

        /* renamed from: g  reason: collision with root package name */
        public int f27769g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f27770h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f27771i;

        /* renamed from: j  reason: collision with root package name */
        public int f27772j;
    }

    /* renamed from: q2.b$b  reason: collision with other inner class name */
    public interface C0446b {
        void a(e eVar, a aVar);

        void b();
    }

    public b(f fVar) {
        this.f27759c = fVar;
    }

    private boolean a(C0446b bVar, e eVar, int i10) {
        this.f27758b.f27763a = eVar.A();
        this.f27758b.f27764b = eVar.V();
        this.f27758b.f27765c = eVar.Y();
        this.f27758b.f27766d = eVar.x();
        a aVar = this.f27758b;
        aVar.f27771i = false;
        aVar.f27772j = i10;
        e.b bVar2 = aVar.f27763a;
        e.b bVar3 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f27764b == bVar3;
        boolean z12 = z10 && eVar.f27447d0 > 0.0f;
        boolean z13 = z11 && eVar.f27447d0 > 0.0f;
        if (z12 && eVar.f27488y[0] == 4) {
            aVar.f27763a = e.b.FIXED;
        }
        if (z13 && eVar.f27488y[1] == 4) {
            aVar.f27764b = e.b.FIXED;
        }
        bVar.a(eVar, aVar);
        eVar.o1(this.f27758b.f27767e);
        eVar.P0(this.f27758b.f27768f);
        eVar.O0(this.f27758b.f27770h);
        eVar.E0(this.f27758b.f27769g);
        a aVar2 = this.f27758b;
        aVar2.f27772j = a.f27760k;
        return aVar2.f27771i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r8 != r9) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        if (r5.f27447d0 <= 0.0f) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(p2.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<p2.e> r0 = r13.f27591L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.Z1(r1)
            q2.b$b r2 = r13.O1()
            r3 = 0
            r4 = r3
        L_0x0012:
            if (r4 >= r0) goto L_0x00a4
            java.util.ArrayList<p2.e> r5 = r13.f27591L0
            java.lang.Object r5 = r5.get(r4)
            p2.e r5 = (p2.e) r5
            boolean r6 = r5 instanceof p2.h
            if (r6 == 0) goto L_0x0022
            goto L_0x00a0
        L_0x0022:
            boolean r6 = r5 instanceof p2.C5756a
            if (r6 == 0) goto L_0x0028
            goto L_0x00a0
        L_0x0028:
            boolean r6 = r5.n0()
            if (r6 == 0) goto L_0x0030
            goto L_0x00a0
        L_0x0030:
            if (r1 == 0) goto L_0x0047
            q2.l r6 = r5.f27448e
            if (r6 == 0) goto L_0x0047
            q2.n r7 = r5.f27450f
            if (r7 == 0) goto L_0x0047
            q2.g r6 = r6.f27831e
            boolean r6 = r6.f27793j
            if (r6 == 0) goto L_0x0047
            q2.g r6 = r7.f27831e
            boolean r6 = r6.f27793j
            if (r6 == 0) goto L_0x0047
            goto L_0x00a0
        L_0x0047:
            p2.e$b r6 = r5.u(r3)
            r7 = 1
            p2.e$b r8 = r5.u(r7)
            p2.e$b r9 = p2.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0060
            int r10 = r5.f27484w
            if (r10 == r7) goto L_0x0060
            if (r8 != r9) goto L_0x0060
            int r10 = r5.f27486x
            if (r10 == r7) goto L_0x0060
            r10 = r7
            goto L_0x0061
        L_0x0060:
            r10 = r3
        L_0x0061:
            if (r10 != 0) goto L_0x0097
            boolean r11 = r13.Z1(r7)
            if (r11 == 0) goto L_0x0097
            boolean r11 = r5 instanceof p2.l
            if (r11 != 0) goto L_0x0097
            if (r6 != r9) goto L_0x007c
            int r11 = r5.f27484w
            if (r11 != 0) goto L_0x007c
            if (r8 == r9) goto L_0x007c
            boolean r11 = r5.k0()
            if (r11 != 0) goto L_0x007c
            r10 = r7
        L_0x007c:
            if (r8 != r9) goto L_0x008b
            int r11 = r5.f27486x
            if (r11 != 0) goto L_0x008b
            if (r6 == r9) goto L_0x008b
            boolean r11 = r5.k0()
            if (r11 != 0) goto L_0x008b
            r10 = r7
        L_0x008b:
            if (r6 == r9) goto L_0x008f
            if (r8 != r9) goto L_0x0097
        L_0x008f:
            float r6 = r5.f27447d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r7 = r10
        L_0x0098:
            if (r7 == 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            int r6 = q2.b.a.f27760k
            r12.a(r2, r5, r6)
        L_0x00a0:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00a4:
            r2.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.b.b(p2.f):void");
    }

    private void c(f fVar, String str, int i10, int i11, int i12) {
        fVar.getClass();
        int J10 = fVar.J();
        int I10 = fVar.I();
        fVar.e1(0);
        fVar.d1(0);
        fVar.o1(i11);
        fVar.P0(i12);
        fVar.e1(J10);
        fVar.d1(I10);
        this.f27759c.d2(i10);
        this.f27759c.x1();
    }

    public long d(f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19;
        boolean z10;
        boolean z11;
        int i20;
        f fVar2;
        boolean z12;
        int i21;
        boolean z13;
        int i22;
        int i23;
        boolean z14;
        b bVar = this;
        f fVar3 = fVar;
        int i24 = i10;
        int i25 = i13;
        int i26 = i15;
        C0446b O12 = fVar.O1();
        int size = fVar3.f27591L0.size();
        int Y10 = fVar.Y();
        int x10 = fVar.x();
        boolean b10 = k.b(i24, 128);
        int i27 = 1;
        boolean z15 = b10 || k.b(i24, 64);
        if (z15) {
            int i28 = 0;
            while (true) {
                if (i28 >= size) {
                    break;
                }
                e eVar = fVar3.f27591L0.get(i28);
                e.b A10 = eVar.A();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z16 = (A10 == bVar2) && (eVar.V() == bVar2) && eVar.v() > 0.0f;
                if ((!eVar.k0() || !z16) && ((!eVar.m0() || !z16) && !(eVar instanceof l) && !eVar.k0() && !eVar.m0())) {
                    i28++;
                }
            }
            z15 = false;
        }
        if (z15) {
            boolean z17 = C5414d.f23797s;
        }
        boolean z18 = z15 & ((i25 == 1073741824 && i26 == 1073741824) || b10);
        int i29 = 2;
        if (z18) {
            int min = Math.min(fVar.H(), i14);
            int min2 = Math.min(fVar.G(), i16);
            if (i25 == 1073741824 && fVar.Y() != min) {
                fVar3.o1(min);
                fVar.S1();
            }
            if (i26 == 1073741824 && fVar.x() != min2) {
                fVar3.P0(min2);
                fVar.S1();
            }
            if (i25 == 1073741824 && i26 == 1073741824) {
                z11 = fVar3.K1(b10);
                i19 = 2;
                z10 = false;
            } else {
                boolean L12 = fVar3.L1(b10);
                z10 = false;
                if (i25 == 1073741824) {
                    L12 &= fVar3.M1(b10, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i26 == 1073741824) {
                    z11 = fVar3.M1(b10, 1) & L12;
                    i19++;
                } else {
                    z11 = L12;
                }
            }
            if (z11) {
                fVar3.t1(i25 == 1073741824 ? true : z10, i26 == 1073741824 ? true : z10);
            }
        } else {
            z10 = false;
            z11 = false;
            i19 = 0;
        }
        if (z11 && i19 == 2) {
            return 0;
        }
        int P12 = fVar.P1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f27757a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, Y10, x10);
        }
        if (size2 > 0) {
            e.b A11 = fVar.A();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z19 = A11 == bVar3 ? true : z10;
            boolean z20 = fVar.V() == bVar3 ? true : z10;
            int max = Math.max(fVar.Y(), bVar.f27759c.J());
            int max2 = Math.max(fVar.x(), bVar.f27759c.I());
            int i30 = z10;
            boolean z21 = i30;
            while (i30 < size2) {
                e eVar2 = bVar.f27757a.get(i30);
                if (!(eVar2 instanceof l)) {
                    i22 = P12;
                    i23 = i27;
                } else {
                    int Y11 = eVar2.Y();
                    int x11 = eVar2.x();
                    boolean a10 = z21 | bVar.a(O12, eVar2, a.f27761l);
                    int Y12 = eVar2.Y();
                    i22 = P12;
                    int x12 = eVar2.x();
                    if (Y12 != Y11) {
                        eVar2.o1(Y12);
                        if (z19 && eVar2.N() > max) {
                            max = Math.max(max, eVar2.N() + eVar2.o(d.a.RIGHT).f());
                        }
                        z14 = true;
                    } else {
                        z14 = a10;
                    }
                    if (x12 != x11) {
                        eVar2.P0(x12);
                        if (z20 && eVar2.r() > max2) {
                            max2 = Math.max(max2, eVar2.r() + eVar2.o(d.a.BOTTOM).f());
                        }
                        z14 = true;
                    }
                    z21 = z14 | ((l) eVar2).J1();
                    i23 = 1;
                }
                i30 += i23;
                P12 = i22;
                i27 = i23;
                i29 = 2;
                f fVar4 = fVar;
            }
            int i31 = P12;
            int i32 = i29;
            int i33 = 0;
            while (i33 < i32) {
                int i34 = 0;
                while (i34 < size2) {
                    e eVar3 = bVar.f27757a.get(i34);
                    if ((!(eVar3 instanceof i) || (eVar3 instanceof l)) && !(eVar3 instanceof h) && eVar3.X() != 8 && ((!z18 || !eVar3.f27448e.f27831e.f27793j || !eVar3.f27450f.f27831e.f27793j) && !(eVar3 instanceof l))) {
                        int Y13 = eVar3.Y();
                        int x13 = eVar3.x();
                        int p10 = eVar3.p();
                        int i35 = a.f27761l;
                        z12 = z18;
                        if (i33 == 1) {
                            i35 = a.f27762m;
                        }
                        int Y14 = eVar3.Y();
                        boolean a11 = z21 | bVar.a(O12, eVar3, i35);
                        int x14 = eVar3.x();
                        if (Y14 != Y13) {
                            eVar3.o1(Y14);
                            if (z19 && eVar3.N() > max) {
                                max = Math.max(max, eVar3.N() + eVar3.o(d.a.RIGHT).f());
                            }
                            z13 = true;
                        } else {
                            z13 = a11;
                        }
                        if (x14 != x13) {
                            eVar3.P0(x14);
                            if (z20 && eVar3.r() > max2) {
                                max2 = Math.max(max2, eVar3.r() + eVar3.o(d.a.BOTTOM).f());
                            }
                            z13 = true;
                        }
                        if (!eVar3.b0() || p10 == eVar3.p()) {
                            z21 = z13;
                        } else {
                            i21 = 1;
                            z21 = 1;
                            i34 += i21;
                            bVar = this;
                            z18 = z12;
                        }
                    } else {
                        z12 = z18;
                    }
                    i21 = 1;
                    i34 += i21;
                    bVar = this;
                    z18 = z12;
                }
                boolean z22 = z18;
                if (z21 == 0) {
                    break;
                }
                i33++;
                c(fVar, "intermediate pass", i33, Y10, x10);
                i32 = 2;
                z21 = 0;
                bVar = this;
                z18 = z22;
            }
            fVar2 = fVar;
            i20 = i31;
        } else {
            fVar2 = fVar;
            i20 = P12;
        }
        fVar2.c2(i20);
        return 0;
    }

    public void e(f fVar) {
        this.f27757a.clear();
        int size = fVar.f27591L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = fVar.f27591L0.get(i10);
            e.b A10 = eVar.A();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (A10 == bVar || eVar.V() == bVar) {
                this.f27757a.add(eVar);
            }
        }
        fVar.S1();
    }
}
