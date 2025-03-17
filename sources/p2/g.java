package p2;

import h2.C5414d;
import java.util.ArrayList;
import p2.e;

public class g extends l {
    /* access modifiers changed from: private */

    /* renamed from: a1  reason: collision with root package name */
    public int f27523a1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: b1  reason: collision with root package name */
    public int f27524b1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: c1  reason: collision with root package name */
    public int f27525c1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: d1  reason: collision with root package name */
    public int f27526d1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: e1  reason: collision with root package name */
    public int f27527e1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: f1  reason: collision with root package name */
    public int f27528f1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: g1  reason: collision with root package name */
    public float f27529g1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: h1  reason: collision with root package name */
    public float f27530h1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: i1  reason: collision with root package name */
    public float f27531i1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: j1  reason: collision with root package name */
    public float f27532j1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: k1  reason: collision with root package name */
    public float f27533k1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: l1  reason: collision with root package name */
    public float f27534l1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: m1  reason: collision with root package name */
    public int f27535m1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: n1  reason: collision with root package name */
    public int f27536n1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: o1  reason: collision with root package name */
    public int f27537o1 = 2;
    /* access modifiers changed from: private */

    /* renamed from: p1  reason: collision with root package name */
    public int f27538p1 = 2;

    /* renamed from: q1  reason: collision with root package name */
    private int f27539q1 = 0;

    /* renamed from: r1  reason: collision with root package name */
    private int f27540r1 = -1;

    /* renamed from: s1  reason: collision with root package name */
    private int f27541s1 = 0;

    /* renamed from: t1  reason: collision with root package name */
    private ArrayList<a> f27542t1 = new ArrayList<>();

    /* renamed from: u1  reason: collision with root package name */
    private e[] f27543u1 = null;

    /* renamed from: v1  reason: collision with root package name */
    private e[] f27544v1 = null;

    /* renamed from: w1  reason: collision with root package name */
    private int[] f27545w1 = null;
    /* access modifiers changed from: private */

    /* renamed from: x1  reason: collision with root package name */
    public e[] f27546x1;
    /* access modifiers changed from: private */

    /* renamed from: y1  reason: collision with root package name */
    public int f27547y1 = 0;

    private class a {

        /* renamed from: a  reason: collision with root package name */
        private int f27548a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public e f27549b = null;

        /* renamed from: c  reason: collision with root package name */
        int f27550c = 0;

        /* renamed from: d  reason: collision with root package name */
        private d f27551d;

        /* renamed from: e  reason: collision with root package name */
        private d f27552e;

        /* renamed from: f  reason: collision with root package name */
        private d f27553f;

        /* renamed from: g  reason: collision with root package name */
        private d f27554g;

        /* renamed from: h  reason: collision with root package name */
        private int f27555h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f27556i = 0;

        /* renamed from: j  reason: collision with root package name */
        private int f27557j = 0;

        /* renamed from: k  reason: collision with root package name */
        private int f27558k = 0;

        /* renamed from: l  reason: collision with root package name */
        private int f27559l = 0;

        /* renamed from: m  reason: collision with root package name */
        private int f27560m = 0;

        /* renamed from: n  reason: collision with root package name */
        private int f27561n = 0;

        /* renamed from: o  reason: collision with root package name */
        private int f27562o = 0;

        /* renamed from: p  reason: collision with root package name */
        private int f27563p = 0;

        /* renamed from: q  reason: collision with root package name */
        private int f27564q = 0;

        a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f27548a = i10;
            this.f27551d = dVar;
            this.f27552e = dVar2;
            this.f27553f = dVar3;
            this.f27554g = dVar4;
            this.f27555h = g.this.D1();
            this.f27556i = g.this.F1();
            this.f27557j = g.this.E1();
            this.f27558k = g.this.C1();
            this.f27564q = i11;
        }

        private void h() {
            this.f27559l = 0;
            this.f27560m = 0;
            this.f27549b = null;
            this.f27550c = 0;
            int i10 = this.f27562o;
            int i11 = 0;
            while (i11 < i10 && this.f27561n + i11 < g.this.f27547y1) {
                e eVar = g.this.f27546x1[this.f27561n + i11];
                if (this.f27548a == 0) {
                    int Y10 = eVar.Y();
                    int T12 = g.this.f27535m1;
                    if (eVar.X() == 8) {
                        T12 = 0;
                    }
                    this.f27559l += Y10 + T12;
                    int g22 = g.this.o2(eVar, this.f27564q);
                    if (this.f27549b == null || this.f27550c < g22) {
                        this.f27549b = eVar;
                        this.f27550c = g22;
                        this.f27560m = g22;
                    }
                } else {
                    int f22 = g.this.p2(eVar, this.f27564q);
                    int g23 = g.this.o2(eVar, this.f27564q);
                    int U12 = g.this.f27536n1;
                    if (eVar.X() == 8) {
                        U12 = 0;
                    }
                    this.f27560m += g23 + U12;
                    if (this.f27549b == null || this.f27550c < f22) {
                        this.f27549b = eVar;
                        this.f27550c = f22;
                        this.f27559l = f22;
                    }
                }
                i11++;
            }
        }

        public void b(e eVar) {
            int i10 = 0;
            if (this.f27548a == 0) {
                int f22 = g.this.p2(eVar, this.f27564q);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    this.f27563p++;
                    f22 = 0;
                }
                int T12 = g.this.f27535m1;
                if (eVar.X() != 8) {
                    i10 = T12;
                }
                this.f27559l += f22 + i10;
                int g22 = g.this.o2(eVar, this.f27564q);
                if (this.f27549b == null || this.f27550c < g22) {
                    this.f27549b = eVar;
                    this.f27550c = g22;
                    this.f27560m = g22;
                }
            } else {
                int f23 = g.this.p2(eVar, this.f27564q);
                int g23 = g.this.o2(eVar, this.f27564q);
                if (eVar.V() == e.b.MATCH_CONSTRAINT) {
                    this.f27563p++;
                    g23 = 0;
                }
                int U12 = g.this.f27536n1;
                if (eVar.X() != 8) {
                    i10 = U12;
                }
                this.f27560m += g23 + i10;
                if (this.f27549b == null || this.f27550c < f23) {
                    this.f27549b = eVar;
                    this.f27550c = f23;
                    this.f27559l = f23;
                }
            }
            this.f27562o++;
        }

        public void c() {
            this.f27550c = 0;
            this.f27549b = null;
            this.f27559l = 0;
            this.f27560m = 0;
            this.f27561n = 0;
            this.f27562o = 0;
            this.f27563p = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f27562o
                r2 = 0
                r3 = r2
            L_0x0006:
                if (r3 >= r1) goto L_0x0027
                int r4 = r0.f27561n
                int r4 = r4 + r3
                p2.g r5 = p2.g.this
                int r5 = r5.f27547y1
                if (r4 < r5) goto L_0x0014
                goto L_0x0027
            L_0x0014:
                p2.g r4 = p2.g.this
                p2.e[] r4 = r4.f27546x1
                int r5 = r0.f27561n
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0024
                r4.w0()
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0027:
                if (r1 == 0) goto L_0x0383
                p2.e r3 = r0.f27549b
                if (r3 != 0) goto L_0x002f
                goto L_0x0383
            L_0x002f:
                if (r19 == 0) goto L_0x0035
                if (r18 != 0) goto L_0x0035
                r4 = 1
                goto L_0x0036
            L_0x0035:
                r4 = r2
            L_0x0036:
                r5 = -1
                r6 = r2
                r7 = r5
                r8 = r7
            L_0x003a:
                if (r6 >= r1) goto L_0x0069
                if (r17 == 0) goto L_0x0042
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0043
            L_0x0042:
                r9 = r6
            L_0x0043:
                int r10 = r0.f27561n
                int r10 = r10 + r9
                p2.g r11 = p2.g.this
                int r11 = r11.f27547y1
                if (r10 < r11) goto L_0x004f
                goto L_0x0069
            L_0x004f:
                p2.g r10 = p2.g.this
                p2.e[] r10 = r10.f27546x1
                int r11 = r0.f27561n
                int r11 = r11 + r9
                r9 = r10[r11]
                if (r9 == 0) goto L_0x0066
                int r9 = r9.X()
                if (r9 != 0) goto L_0x0066
                if (r7 != r5) goto L_0x0065
                r7 = r6
            L_0x0065:
                r8 = r6
            L_0x0066:
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0069:
                int r6 = r0.f27548a
                r9 = 0
                if (r6 != 0) goto L_0x020e
                p2.e r6 = r0.f27549b
                p2.g r10 = p2.g.this
                int r10 = r10.f27524b1
                r6.i1(r10)
                int r10 = r0.f27556i
                if (r18 <= 0) goto L_0x0084
                p2.g r11 = p2.g.this
                int r11 = r11.f27536n1
                int r10 = r10 + r11
            L_0x0084:
                p2.d r11 = r6.f27429P
                p2.d r12 = r0.f27552e
                r11.a(r12, r10)
                if (r19 == 0) goto L_0x0096
                p2.d r10 = r6.f27431R
                p2.d r11 = r0.f27554g
                int r12 = r0.f27558k
                r10.a(r11, r12)
            L_0x0096:
                if (r18 <= 0) goto L_0x00a3
                p2.d r10 = r0.f27552e
                p2.e r10 = r10.f27397d
                p2.d r10 = r10.f27431R
                p2.d r11 = r6.f27429P
                r10.a(r11, r2)
            L_0x00a3:
                p2.g r10 = p2.g.this
                int r10 = r10.f27538p1
                r11 = 3
                if (r10 != r11) goto L_0x00dd
                boolean r10 = r6.b0()
                if (r10 != 0) goto L_0x00dd
                r10 = r2
            L_0x00b3:
                if (r10 >= r1) goto L_0x00dd
                if (r17 == 0) goto L_0x00bb
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00bc
            L_0x00bb:
                r12 = r10
            L_0x00bc:
                int r13 = r0.f27561n
                int r13 = r13 + r12
                p2.g r14 = p2.g.this
                int r14 = r14.f27547y1
                if (r13 < r14) goto L_0x00c8
                goto L_0x00dd
            L_0x00c8:
                p2.g r13 = p2.g.this
                p2.e[] r13 = r13.f27546x1
                int r14 = r0.f27561n
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.b0()
                if (r13 == 0) goto L_0x00da
                goto L_0x00de
            L_0x00da:
                int r10 = r10 + 1
                goto L_0x00b3
            L_0x00dd:
                r12 = r6
            L_0x00de:
                r10 = r2
            L_0x00df:
                if (r10 >= r1) goto L_0x0383
                if (r17 == 0) goto L_0x00e7
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00e8
            L_0x00e7:
                r13 = r10
            L_0x00e8:
                int r14 = r0.f27561n
                int r14 = r14 + r13
                p2.g r15 = p2.g.this
                int r15 = r15.f27547y1
                if (r14 < r15) goto L_0x00f5
                goto L_0x0383
            L_0x00f5:
                p2.g r14 = p2.g.this
                p2.e[] r14 = r14.f27546x1
                int r15 = r0.f27561n
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r14 != 0) goto L_0x0106
                r14 = r9
                r9 = r11
                goto L_0x0208
            L_0x0106:
                if (r10 != 0) goto L_0x0111
                p2.d r15 = r14.f27428O
                p2.d r11 = r0.f27551d
                int r3 = r0.f27555h
                r14.k(r15, r11, r3)
            L_0x0111:
                if (r13 != 0) goto L_0x016f
                p2.g r3 = p2.g.this
                int r3 = r3.f27523a1
                r11 = 1065353216(0x3f800000, float:1.0)
                p2.g r13 = p2.g.this
                float r13 = r13.f27529g1
                if (r17 == 0) goto L_0x0125
                float r13 = r11 - r13
            L_0x0125:
                int r15 = r0.f27561n
                if (r15 != 0) goto L_0x0149
                p2.g r15 = p2.g.this
                int r15 = r15.f27525c1
                if (r15 == r5) goto L_0x0149
                p2.g r3 = p2.g.this
                int r3 = r3.f27525c1
                if (r17 == 0) goto L_0x0142
                p2.g r13 = p2.g.this
                float r13 = r13.f27531i1
            L_0x013f:
                float r11 = r11 - r13
            L_0x0140:
                r13 = r11
                goto L_0x0169
            L_0x0142:
                p2.g r11 = p2.g.this
                float r11 = r11.f27531i1
                goto L_0x0140
            L_0x0149:
                if (r19 == 0) goto L_0x0169
                p2.g r15 = p2.g.this
                int r15 = r15.f27527e1
                if (r15 == r5) goto L_0x0169
                p2.g r3 = p2.g.this
                int r3 = r3.f27527e1
                if (r17 == 0) goto L_0x0162
                p2.g r13 = p2.g.this
                float r13 = r13.f27533k1
                goto L_0x013f
            L_0x0162:
                p2.g r11 = p2.g.this
                float r11 = r11.f27533k1
                goto L_0x0140
            L_0x0169:
                r14.R0(r3)
                r14.Q0(r13)
            L_0x016f:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x017c
                p2.d r3 = r14.f27430Q
                p2.d r11 = r0.f27553f
                int r13 = r0.f27557j
                r14.k(r3, r11, r13)
            L_0x017c:
                if (r9 == 0) goto L_0x01a7
                p2.d r3 = r14.f27428O
                p2.d r11 = r9.f27430Q
                p2.g r13 = p2.g.this
                int r13 = r13.f27535m1
                r3.a(r11, r13)
                if (r10 != r7) goto L_0x0194
                p2.d r3 = r14.f27428O
                int r11 = r0.f27555h
                r3.u(r11)
            L_0x0194:
                p2.d r3 = r9.f27430Q
                p2.d r11 = r14.f27428O
                r3.a(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x01a7
                p2.d r3 = r9.f27430Q
                int r9 = r0.f27557j
                r3.u(r9)
            L_0x01a7:
                if (r14 == r6) goto L_0x0207
                p2.g r3 = p2.g.this
                int r3 = r3.f27538p1
                r9 = 3
                if (r3 != r9) goto L_0x01c8
                boolean r3 = r12.b0()
                if (r3 == 0) goto L_0x01c8
                if (r14 == r12) goto L_0x01c8
                boolean r3 = r14.b0()
                if (r3 == 0) goto L_0x01c8
                p2.d r3 = r14.f27432S
                p2.d r11 = r12.f27432S
                r3.a(r11, r2)
                goto L_0x0208
            L_0x01c8:
                p2.g r3 = p2.g.this
                int r3 = r3.f27538p1
                if (r3 == 0) goto L_0x01ff
                r11 = 1
                if (r3 == r11) goto L_0x01f7
                if (r4 == 0) goto L_0x01e8
                p2.d r3 = r14.f27429P
                p2.d r11 = r0.f27552e
                int r13 = r0.f27556i
                r3.a(r11, r13)
                p2.d r3 = r14.f27431R
                p2.d r11 = r0.f27554g
                int r13 = r0.f27558k
                r3.a(r11, r13)
                goto L_0x0208
            L_0x01e8:
                p2.d r3 = r14.f27429P
                p2.d r11 = r6.f27429P
                r3.a(r11, r2)
                p2.d r3 = r14.f27431R
                p2.d r11 = r6.f27431R
                r3.a(r11, r2)
                goto L_0x0208
            L_0x01f7:
                p2.d r3 = r14.f27431R
                p2.d r11 = r6.f27431R
                r3.a(r11, r2)
                goto L_0x0208
            L_0x01ff:
                p2.d r3 = r14.f27429P
                p2.d r11 = r6.f27429P
                r3.a(r11, r2)
                goto L_0x0208
            L_0x0207:
                r9 = 3
            L_0x0208:
                int r10 = r10 + 1
                r11 = r9
                r9 = r14
                goto L_0x00df
            L_0x020e:
                p2.e r3 = r0.f27549b
                p2.g r6 = p2.g.this
                int r6 = r6.f27523a1
                r3.R0(r6)
                int r6 = r0.f27555h
                if (r18 <= 0) goto L_0x0224
                p2.g r10 = p2.g.this
                int r10 = r10.f27535m1
                int r6 = r6 + r10
            L_0x0224:
                if (r17 == 0) goto L_0x0246
                p2.d r10 = r3.f27430Q
                p2.d r11 = r0.f27553f
                r10.a(r11, r6)
                if (r19 == 0) goto L_0x0238
                p2.d r6 = r3.f27428O
                p2.d r10 = r0.f27551d
                int r11 = r0.f27557j
                r6.a(r10, r11)
            L_0x0238:
                if (r18 <= 0) goto L_0x0265
                p2.d r6 = r0.f27553f
                p2.e r6 = r6.f27397d
                p2.d r6 = r6.f27428O
                p2.d r10 = r3.f27430Q
                r6.a(r10, r2)
                goto L_0x0265
            L_0x0246:
                p2.d r10 = r3.f27428O
                p2.d r11 = r0.f27551d
                r10.a(r11, r6)
                if (r19 == 0) goto L_0x0258
                p2.d r6 = r3.f27430Q
                p2.d r10 = r0.f27553f
                int r11 = r0.f27557j
                r6.a(r10, r11)
            L_0x0258:
                if (r18 <= 0) goto L_0x0265
                p2.d r6 = r0.f27551d
                p2.e r6 = r6.f27397d
                p2.d r6 = r6.f27430Q
                p2.d r10 = r3.f27428O
                r6.a(r10, r2)
            L_0x0265:
                r6 = r2
            L_0x0266:
                if (r6 >= r1) goto L_0x0383
                int r10 = r0.f27561n
                int r10 = r10 + r6
                p2.g r11 = p2.g.this
                int r11 = r11.f27547y1
                if (r10 < r11) goto L_0x0275
                goto L_0x0383
            L_0x0275:
                p2.g r10 = p2.g.this
                p2.e[] r10 = r10.f27546x1
                int r11 = r0.f27561n
                int r11 = r11 + r6
                r10 = r10[r11]
                if (r10 != 0) goto L_0x0285
                r12 = 1
                goto L_0x037f
            L_0x0285:
                if (r6 != 0) goto L_0x02d1
                p2.d r11 = r10.f27429P
                p2.d r12 = r0.f27552e
                int r13 = r0.f27556i
                r10.k(r11, r12, r13)
                p2.g r11 = p2.g.this
                int r11 = r11.f27524b1
                p2.g r12 = p2.g.this
                float r12 = r12.f27530h1
                int r13 = r0.f27561n
                if (r13 != 0) goto L_0x02b5
                p2.g r13 = p2.g.this
                int r13 = r13.f27526d1
                if (r13 == r5) goto L_0x02b5
                p2.g r11 = p2.g.this
                int r11 = r11.f27526d1
                p2.g r12 = p2.g.this
                float r12 = r12.f27532j1
                goto L_0x02cb
            L_0x02b5:
                if (r19 == 0) goto L_0x02cb
                p2.g r13 = p2.g.this
                int r13 = r13.f27528f1
                if (r13 == r5) goto L_0x02cb
                p2.g r11 = p2.g.this
                int r11 = r11.f27528f1
                p2.g r12 = p2.g.this
                float r12 = r12.f27534l1
            L_0x02cb:
                r10.i1(r11)
                r10.h1(r12)
            L_0x02d1:
                int r11 = r1 + -1
                if (r6 != r11) goto L_0x02de
                p2.d r11 = r10.f27431R
                p2.d r12 = r0.f27554g
                int r13 = r0.f27558k
                r10.k(r11, r12, r13)
            L_0x02de:
                if (r9 == 0) goto L_0x0309
                p2.d r11 = r10.f27429P
                p2.d r12 = r9.f27431R
                p2.g r13 = p2.g.this
                int r13 = r13.f27536n1
                r11.a(r12, r13)
                if (r6 != r7) goto L_0x02f6
                p2.d r11 = r10.f27429P
                int r12 = r0.f27556i
                r11.u(r12)
            L_0x02f6:
                p2.d r11 = r9.f27431R
                p2.d r12 = r10.f27429P
                r11.a(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r6 != r12) goto L_0x0309
                p2.d r9 = r9.f27431R
                int r11 = r0.f27558k
                r9.u(r11)
            L_0x0309:
                if (r10 == r3) goto L_0x033a
                r9 = 2
                if (r17 == 0) goto L_0x033c
                p2.g r11 = p2.g.this
                int r11 = r11.f27537o1
                if (r11 == 0) goto L_0x0333
                r12 = 1
                if (r11 == r12) goto L_0x032b
                if (r11 == r9) goto L_0x031c
                goto L_0x033a
            L_0x031c:
                p2.d r9 = r10.f27428O
                p2.d r11 = r3.f27428O
                r9.a(r11, r2)
                p2.d r9 = r10.f27430Q
                p2.d r11 = r3.f27430Q
                r9.a(r11, r2)
                goto L_0x033a
            L_0x032b:
                p2.d r9 = r10.f27428O
                p2.d r11 = r3.f27428O
                r9.a(r11, r2)
                goto L_0x033a
            L_0x0333:
                p2.d r9 = r10.f27430Q
                p2.d r11 = r3.f27430Q
                r9.a(r11, r2)
            L_0x033a:
                r12 = 1
                goto L_0x037e
            L_0x033c:
                p2.g r11 = p2.g.this
                int r11 = r11.f27537o1
                if (r11 == 0) goto L_0x0376
                r12 = 1
                if (r11 == r12) goto L_0x036e
                if (r11 == r9) goto L_0x034a
                goto L_0x037e
            L_0x034a:
                if (r4 == 0) goto L_0x035f
                p2.d r9 = r10.f27428O
                p2.d r11 = r0.f27551d
                int r13 = r0.f27555h
                r9.a(r11, r13)
                p2.d r9 = r10.f27430Q
                p2.d r11 = r0.f27553f
                int r13 = r0.f27557j
                r9.a(r11, r13)
                goto L_0x037e
            L_0x035f:
                p2.d r9 = r10.f27428O
                p2.d r11 = r3.f27428O
                r9.a(r11, r2)
                p2.d r9 = r10.f27430Q
                p2.d r11 = r3.f27430Q
                r9.a(r11, r2)
                goto L_0x037e
            L_0x036e:
                p2.d r9 = r10.f27430Q
                p2.d r11 = r3.f27430Q
                r9.a(r11, r2)
                goto L_0x037e
            L_0x0376:
                r12 = 1
                p2.d r9 = r10.f27428O
                p2.d r11 = r3.f27428O
                r9.a(r11, r2)
            L_0x037e:
                r9 = r10
            L_0x037f:
                int r6 = r6 + 1
                goto L_0x0266
            L_0x0383:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p2.g.a.d(boolean, int, boolean):void");
        }

        public int e() {
            return this.f27548a == 1 ? this.f27560m - g.this.f27536n1 : this.f27560m;
        }

        public int f() {
            return this.f27548a == 0 ? this.f27559l - g.this.f27535m1 : this.f27559l;
        }

        public void g(int i10) {
            int i11 = this.f27563p;
            if (i11 != 0) {
                int i12 = this.f27562o;
                int i13 = i10 / i11;
                int i14 = 0;
                while (i14 < i12 && this.f27561n + i14 < g.this.f27547y1) {
                    e eVar = g.this.f27546x1[this.f27561n + i14];
                    if (this.f27548a == 0) {
                        if (eVar != null && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f27484w == 0) {
                            g.this.H1(eVar, e.b.FIXED, i13, eVar.V(), eVar.x());
                        }
                    } else if (eVar != null && eVar.V() == e.b.MATCH_CONSTRAINT && eVar.f27486x == 0) {
                        g.this.H1(eVar, eVar.A(), eVar.Y(), e.b.FIXED, i13);
                    }
                    i14++;
                }
                h();
            }
        }

        public void i(int i10) {
            this.f27561n = i10;
        }

        public void j(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f27548a = i10;
            this.f27551d = dVar;
            this.f27552e = dVar2;
            this.f27553f = dVar3;
            this.f27554g = dVar4;
            this.f27555h = i11;
            this.f27556i = i12;
            this.f27557j = i13;
            this.f27558k = i14;
            this.f27564q = i15;
        }
    }

    private void n2(boolean z10) {
        e eVar;
        float f10;
        int i10;
        if (this.f27545w1 != null && this.f27544v1 != null && this.f27543u1 != null) {
            for (int i11 = 0; i11 < this.f27547y1; i11++) {
                this.f27546x1[i11].w0();
            }
            int[] iArr = this.f27545w1;
            int i12 = iArr[0];
            int i13 = iArr[1];
            float f11 = this.f27529g1;
            e eVar2 = null;
            int i14 = 0;
            while (i14 < i12) {
                if (z10) {
                    i10 = (i12 - i14) - 1;
                    f10 = 1.0f - this.f27529g1;
                } else {
                    f10 = f11;
                    i10 = i14;
                }
                e eVar3 = this.f27544v1[i10];
                if (!(eVar3 == null || eVar3.X() == 8)) {
                    if (i14 == 0) {
                        eVar3.k(eVar3.f27428O, this.f27428O, D1());
                        eVar3.R0(this.f27523a1);
                        eVar3.Q0(f10);
                    }
                    if (i14 == i12 - 1) {
                        eVar3.k(eVar3.f27430Q, this.f27430Q, E1());
                    }
                    if (i14 > 0 && eVar2 != null) {
                        eVar3.k(eVar3.f27428O, eVar2.f27430Q, this.f27535m1);
                        eVar2.k(eVar2.f27430Q, eVar3.f27428O, 0);
                    }
                    eVar2 = eVar3;
                }
                i14++;
                f11 = f10;
            }
            for (int i15 = 0; i15 < i13; i15++) {
                e eVar4 = this.f27543u1[i15];
                if (!(eVar4 == null || eVar4.X() == 8)) {
                    if (i15 == 0) {
                        eVar4.k(eVar4.f27429P, this.f27429P, F1());
                        eVar4.i1(this.f27524b1);
                        eVar4.h1(this.f27530h1);
                    }
                    if (i15 == i13 - 1) {
                        eVar4.k(eVar4.f27431R, this.f27431R, C1());
                    }
                    if (i15 > 0 && eVar2 != null) {
                        eVar4.k(eVar4.f27429P, eVar2.f27431R, this.f27536n1);
                        eVar2.k(eVar2.f27431R, eVar4.f27429P, 0);
                    }
                    eVar2 = eVar4;
                }
            }
            for (int i16 = 0; i16 < i12; i16++) {
                for (int i17 = 0; i17 < i13; i17++) {
                    int i18 = (i17 * i12) + i16;
                    if (this.f27541s1 == 1) {
                        i18 = (i16 * i13) + i17;
                    }
                    e[] eVarArr = this.f27546x1;
                    if (!(i18 >= eVarArr.length || (eVar = eVarArr[i18]) == null || eVar.X() == 8)) {
                        e eVar5 = this.f27544v1[i16];
                        e eVar6 = this.f27543u1[i17];
                        if (eVar != eVar5) {
                            eVar.k(eVar.f27428O, eVar5.f27428O, 0);
                            eVar.k(eVar.f27430Q, eVar5.f27430Q, 0);
                        }
                        if (eVar != eVar6) {
                            eVar.k(eVar.f27429P, eVar6.f27429P, 0);
                            eVar.k(eVar.f27431R, eVar6.f27431R, 0);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public int o2(e eVar, int i10) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.V() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f27486x;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f27412E * ((float) i10));
                if (i12 != eVar.x()) {
                    eVar.c1(true);
                    H1(eVar, eVar.A(), eVar.Y(), e.b.FIXED, i12);
                }
                return i12;
            } else if (i11 == 1) {
                return eVar.x();
            } else {
                if (i11 == 3) {
                    return (int) ((((float) eVar.Y()) * eVar.f27447d0) + 0.5f);
                }
            }
        }
        return eVar.x();
    }

    /* access modifiers changed from: private */
    public int p2(e eVar, int i10) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.A() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f27484w;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f27406B * ((float) i10));
                if (i12 != eVar.Y()) {
                    eVar.c1(true);
                    H1(eVar, e.b.FIXED, i12, eVar.V(), eVar.x());
                }
                return i12;
            } else if (i11 == 1) {
                return eVar.Y();
            } else {
                if (i11 == 3) {
                    return (int) ((((float) eVar.x()) * eVar.f27447d0) + 0.5f);
                }
            }
        }
        return eVar.Y();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005e  */
    private void q2(p2.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            r10 = this;
            r0 = 0
            if (r13 != 0) goto L_0x0026
            int r1 = r10.f27540r1
            if (r1 > 0) goto L_0x0023
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x000a:
            if (r2 >= r12) goto L_0x0023
            if (r2 <= 0) goto L_0x0011
            int r4 = r10.f27535m1
            int r3 = r3 + r4
        L_0x0011:
            r4 = r11[r2]
            if (r4 != 0) goto L_0x0016
            goto L_0x0020
        L_0x0016:
            int r4 = r10.p2(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            int r1 = r1 + 1
        L_0x0020:
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0023:
            r2 = r1
            r1 = r0
            goto L_0x0047
        L_0x0026:
            int r1 = r10.f27540r1
            if (r1 > 0) goto L_0x0046
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x002d:
            if (r2 >= r12) goto L_0x0046
            if (r2 <= 0) goto L_0x0034
            int r4 = r10.f27536n1
            int r3 = r3 + r4
        L_0x0034:
            r4 = r11[r2]
            if (r4 != 0) goto L_0x0039
            goto L_0x0043
        L_0x0039:
            int r4 = r10.o2(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x0041
            goto L_0x0046
        L_0x0041:
            int r1 = r1 + 1
        L_0x0043:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x0046:
            r2 = r0
        L_0x0047:
            int[] r3 = r10.f27545w1
            if (r3 != 0) goto L_0x0050
            r3 = 2
            int[] r3 = new int[r3]
            r10.f27545w1 = r3
        L_0x0050:
            r3 = 1
            if (r1 != 0) goto L_0x0055
            if (r13 == r3) goto L_0x0059
        L_0x0055:
            if (r2 != 0) goto L_0x005b
            if (r13 != 0) goto L_0x005b
        L_0x0059:
            r4 = r3
            goto L_0x005c
        L_0x005b:
            r4 = r0
        L_0x005c:
            if (r4 != 0) goto L_0x011d
            if (r13 != 0) goto L_0x006a
            float r1 = (float) r12
            float r5 = (float) r2
            float r1 = r1 / r5
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            int r1 = (int) r5
            goto L_0x0073
        L_0x006a:
            float r2 = (float) r12
            float r5 = (float) r1
            float r2 = r2 / r5
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
        L_0x0073:
            p2.e[] r5 = r10.f27544v1
            r6 = 0
            if (r5 == 0) goto L_0x0080
            int r7 = r5.length
            if (r7 >= r2) goto L_0x007c
            goto L_0x0080
        L_0x007c:
            java.util.Arrays.fill(r5, r6)
            goto L_0x0084
        L_0x0080:
            p2.e[] r5 = new p2.e[r2]
            r10.f27544v1 = r5
        L_0x0084:
            p2.e[] r5 = r10.f27543u1
            if (r5 == 0) goto L_0x0090
            int r7 = r5.length
            if (r7 >= r1) goto L_0x008c
            goto L_0x0090
        L_0x008c:
            java.util.Arrays.fill(r5, r6)
            goto L_0x0094
        L_0x0090:
            p2.e[] r5 = new p2.e[r1]
            r10.f27543u1 = r5
        L_0x0094:
            r5 = r0
        L_0x0095:
            if (r5 >= r2) goto L_0x00d9
            r6 = r0
        L_0x0098:
            if (r6 >= r1) goto L_0x00d6
            int r7 = r6 * r2
            int r7 = r7 + r5
            if (r13 != r3) goto L_0x00a2
            int r7 = r5 * r1
            int r7 = r7 + r6
        L_0x00a2:
            int r8 = r11.length
            if (r7 < r8) goto L_0x00a6
            goto L_0x00d3
        L_0x00a6:
            r7 = r11[r7]
            if (r7 != 0) goto L_0x00ab
            goto L_0x00d3
        L_0x00ab:
            int r8 = r10.p2(r7, r14)
            p2.e[] r9 = r10.f27544v1
            r9 = r9[r5]
            if (r9 == 0) goto L_0x00bb
            int r9 = r9.Y()
            if (r9 >= r8) goto L_0x00bf
        L_0x00bb:
            p2.e[] r8 = r10.f27544v1
            r8[r5] = r7
        L_0x00bf:
            int r8 = r10.o2(r7, r14)
            p2.e[] r9 = r10.f27543u1
            r9 = r9[r6]
            if (r9 == 0) goto L_0x00cf
            int r9 = r9.x()
            if (r9 >= r8) goto L_0x00d3
        L_0x00cf:
            p2.e[] r8 = r10.f27543u1
            r8[r6] = r7
        L_0x00d3:
            int r6 = r6 + 1
            goto L_0x0098
        L_0x00d6:
            int r5 = r5 + 1
            goto L_0x0095
        L_0x00d9:
            r5 = r0
            r6 = r5
        L_0x00db:
            if (r5 >= r2) goto L_0x00f0
            p2.e[] r7 = r10.f27544v1
            r7 = r7[r5]
            if (r7 == 0) goto L_0x00ed
            if (r5 <= 0) goto L_0x00e8
            int r8 = r10.f27535m1
            int r6 = r6 + r8
        L_0x00e8:
            int r7 = r10.p2(r7, r14)
            int r6 = r6 + r7
        L_0x00ed:
            int r5 = r5 + 1
            goto L_0x00db
        L_0x00f0:
            r5 = r0
            r7 = r5
        L_0x00f2:
            if (r5 >= r1) goto L_0x0107
            p2.e[] r8 = r10.f27543u1
            r8 = r8[r5]
            if (r8 == 0) goto L_0x0104
            if (r5 <= 0) goto L_0x00ff
            int r9 = r10.f27536n1
            int r7 = r7 + r9
        L_0x00ff:
            int r8 = r10.o2(r8, r14)
            int r7 = r7 + r8
        L_0x0104:
            int r5 = r5 + 1
            goto L_0x00f2
        L_0x0107:
            r15[r0] = r6
            r15[r3] = r7
            if (r13 != 0) goto L_0x0115
            if (r6 <= r14) goto L_0x0059
            if (r2 <= r3) goto L_0x0059
            int r2 = r2 + -1
            goto L_0x005c
        L_0x0115:
            if (r7 <= r14) goto L_0x0059
            if (r1 <= r3) goto L_0x0059
            int r1 = r1 + -1
            goto L_0x005c
        L_0x011d:
            int[] r11 = r10.f27545w1
            r11[r0] = r2
            r11[r3] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.g.q2(p2.e[], int, int, int, int[]):void");
    }

    private void r2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        d dVar;
        int i14;
        int i15;
        int i16;
        d dVar2;
        int i17;
        int i18;
        int i19 = i10;
        int i20 = i12;
        if (i19 != 0) {
            this.f27542t1.clear();
            a aVar = new a(i11, this.f27428O, this.f27429P, this.f27430Q, this.f27431R, i12);
            this.f27542t1.add(aVar);
            if (i11 == 0) {
                i13 = 0;
                int i21 = 0;
                int i22 = 0;
                while (i22 < i19) {
                    e eVar = eVarArr[i22];
                    int p22 = p2(eVar, i20);
                    if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                        i13++;
                    }
                    int i23 = i13;
                    boolean z10 = (i21 == i20 || (this.f27535m1 + i21) + p22 > i20) && aVar.f27549b != null;
                    if (!z10 && i22 > 0 && (i18 = this.f27540r1) > 0 && i22 % i18 == 0) {
                        z10 = true;
                    }
                    if (z10) {
                        aVar = new a(i11, this.f27428O, this.f27429P, this.f27430Q, this.f27431R, i12);
                        aVar.i(i22);
                        this.f27542t1.add(aVar);
                    } else if (i22 > 0) {
                        i21 += this.f27535m1 + p22;
                        aVar.b(eVar);
                        i22++;
                        i13 = i23;
                    }
                    i21 = p22;
                    aVar.b(eVar);
                    i22++;
                    i13 = i23;
                }
            } else {
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                while (i26 < i19) {
                    e eVar2 = eVarArr[i26];
                    int o22 = o2(eVar2, i20);
                    if (eVar2.V() == e.b.MATCH_CONSTRAINT) {
                        i13++;
                    }
                    int i27 = i13;
                    boolean z11 = (i25 == i20 || (this.f27536n1 + i25) + o22 > i20) && aVar.f27549b != null;
                    if (!z11 && i26 > 0 && (i17 = this.f27540r1) > 0 && i26 % i17 == 0) {
                        z11 = true;
                    }
                    if (z11) {
                        aVar = new a(i11, this.f27428O, this.f27429P, this.f27430Q, this.f27431R, i12);
                        aVar.i(i26);
                        this.f27542t1.add(aVar);
                    } else if (i26 > 0) {
                        i25 += this.f27536n1 + o22;
                        aVar.b(eVar2);
                        i26++;
                        i24 = i27;
                    }
                    i25 = o22;
                    aVar.b(eVar2);
                    i26++;
                    i24 = i27;
                }
            }
            int size = this.f27542t1.size();
            d dVar3 = this.f27428O;
            d dVar4 = this.f27429P;
            d dVar5 = this.f27430Q;
            d dVar6 = this.f27431R;
            int D12 = D1();
            int F12 = F1();
            int E12 = E1();
            int C12 = C1();
            e.b A10 = A();
            e.b bVar = e.b.WRAP_CONTENT;
            boolean z12 = A10 == bVar || V() == bVar;
            if (i13 > 0 && z12) {
                for (int i28 = 0; i28 < size; i28++) {
                    a aVar2 = this.f27542t1.get(i28);
                    if (i11 == 0) {
                        aVar2.g(i20 - aVar2.f());
                    } else {
                        aVar2.g(i20 - aVar2.e());
                    }
                }
            }
            int i29 = F12;
            int i30 = E12;
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            int i34 = D12;
            d dVar7 = dVar4;
            d dVar8 = dVar3;
            int i35 = C12;
            while (i33 < size) {
                a aVar3 = this.f27542t1.get(i33);
                if (i11 == 0) {
                    if (i33 < size - 1) {
                        dVar2 = this.f27542t1.get(i33 + 1).f27549b.f27429P;
                        i16 = 0;
                    } else {
                        dVar2 = this.f27431R;
                        i16 = C1();
                    }
                    d dVar9 = aVar3.f27549b.f27431R;
                    d dVar10 = dVar8;
                    d dVar11 = dVar8;
                    int i36 = i31;
                    d dVar12 = dVar7;
                    int i37 = i32;
                    d dVar13 = dVar5;
                    d dVar14 = dVar5;
                    i14 = i33;
                    aVar3.j(i11, dVar10, dVar12, dVar13, dVar2, i34, i29, i30, i16, i12);
                    int max = Math.max(i37, aVar3.f());
                    i31 = i36 + aVar3.e();
                    if (i14 > 0) {
                        i31 += this.f27536n1;
                    }
                    dVar8 = dVar11;
                    i32 = max;
                    i29 = 0;
                    dVar7 = dVar9;
                    dVar = dVar14;
                    int i38 = i16;
                    dVar6 = dVar2;
                    i35 = i38;
                } else {
                    d dVar15 = dVar8;
                    int i39 = i31;
                    int i40 = i32;
                    i14 = i33;
                    if (i14 < size - 1) {
                        dVar = this.f27542t1.get(i14 + 1).f27549b.f27428O;
                        i15 = 0;
                    } else {
                        dVar = this.f27430Q;
                        i15 = E1();
                    }
                    d dVar16 = aVar3.f27549b.f27430Q;
                    aVar3.j(i11, dVar15, dVar7, dVar, dVar6, i34, i29, i15, i35, i12);
                    i32 = i40 + aVar3.f();
                    int max2 = Math.max(i39, aVar3.e());
                    if (i14 > 0) {
                        i32 += this.f27535m1;
                    }
                    i31 = max2;
                    i34 = 0;
                    i30 = i15;
                    dVar8 = dVar16;
                }
                i33 = i14 + 1;
                int i41 = i12;
                dVar5 = dVar;
            }
            iArr[0] = i32;
            iArr[1] = i31;
        }
    }

    private void s2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        d dVar;
        int i14;
        int i15;
        int i16;
        d dVar2;
        int i17;
        int i18;
        int i19 = i10;
        int i20 = i12;
        if (i19 != 0) {
            this.f27542t1.clear();
            a aVar = new a(i11, this.f27428O, this.f27429P, this.f27430Q, this.f27431R, i12);
            this.f27542t1.add(aVar);
            if (i11 == 0) {
                int i21 = 0;
                i13 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i23 < i19) {
                    i21++;
                    e eVar = eVarArr[i23];
                    int p22 = p2(eVar, i20);
                    if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                        i13++;
                    }
                    int i24 = i13;
                    boolean z10 = (i22 == i20 || (this.f27535m1 + i22) + p22 > i20) && aVar.f27549b != null;
                    if (!z10 && i23 > 0 && (i18 = this.f27540r1) > 0 && i21 > i18) {
                        z10 = true;
                    }
                    if (z10) {
                        aVar = new a(i11, this.f27428O, this.f27429P, this.f27430Q, this.f27431R, i12);
                        aVar.i(i23);
                        this.f27542t1.add(aVar);
                        i22 = p22;
                        i21 = 1;
                    } else {
                        i22 = i23 > 0 ? i22 + this.f27535m1 + p22 : p22;
                    }
                    aVar.b(eVar);
                    i23++;
                    i13 = i24;
                }
            } else {
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                while (i28 < i19) {
                    i25++;
                    e eVar2 = eVarArr[i28];
                    int o22 = o2(eVar2, i20);
                    if (eVar2.V() == e.b.MATCH_CONSTRAINT) {
                        i13++;
                    }
                    int i29 = i13;
                    boolean z11 = (i27 == i20 || (this.f27536n1 + i27) + o22 > i20) && aVar.f27549b != null;
                    if (!z11 && i28 > 0 && (i17 = this.f27540r1) > 0 && i25 > i17) {
                        z11 = true;
                    }
                    if (z11) {
                        aVar = new a(i11, this.f27428O, this.f27429P, this.f27430Q, this.f27431R, i12);
                        aVar.i(i28);
                        this.f27542t1.add(aVar);
                        i27 = o22;
                        i25 = 1;
                    } else {
                        i27 = i28 > 0 ? i27 + this.f27536n1 + o22 : o22;
                    }
                    aVar.b(eVar2);
                    i28++;
                    i26 = i29;
                }
            }
            int size = this.f27542t1.size();
            d dVar3 = this.f27428O;
            d dVar4 = this.f27429P;
            d dVar5 = this.f27430Q;
            d dVar6 = this.f27431R;
            int D12 = D1();
            int F12 = F1();
            int E12 = E1();
            int C12 = C1();
            e.b A10 = A();
            e.b bVar = e.b.WRAP_CONTENT;
            boolean z12 = A10 == bVar || V() == bVar;
            if (i13 > 0 && z12) {
                for (int i30 = 0; i30 < size; i30++) {
                    a aVar2 = this.f27542t1.get(i30);
                    if (i11 == 0) {
                        aVar2.g(i20 - aVar2.f());
                    } else {
                        aVar2.g(i20 - aVar2.e());
                    }
                }
            }
            int i31 = F12;
            int i32 = E12;
            int i33 = 0;
            int i34 = 0;
            int i35 = 0;
            int i36 = D12;
            d dVar7 = dVar4;
            d dVar8 = dVar3;
            int i37 = C12;
            while (i35 < size) {
                a aVar3 = this.f27542t1.get(i35);
                if (i11 == 0) {
                    if (i35 < size - 1) {
                        dVar2 = this.f27542t1.get(i35 + 1).f27549b.f27429P;
                        i16 = 0;
                    } else {
                        dVar2 = this.f27431R;
                        i16 = C1();
                    }
                    d dVar9 = aVar3.f27549b.f27431R;
                    d dVar10 = dVar8;
                    d dVar11 = dVar8;
                    int i38 = i33;
                    d dVar12 = dVar7;
                    int i39 = i34;
                    d dVar13 = dVar5;
                    d dVar14 = dVar5;
                    i14 = i35;
                    aVar3.j(i11, dVar10, dVar12, dVar13, dVar2, i36, i31, i32, i16, i12);
                    int max = Math.max(i39, aVar3.f());
                    i33 = i38 + aVar3.e();
                    if (i14 > 0) {
                        i33 += this.f27536n1;
                    }
                    dVar8 = dVar11;
                    i34 = max;
                    i31 = 0;
                    dVar7 = dVar9;
                    dVar = dVar14;
                    int i40 = i16;
                    dVar6 = dVar2;
                    i37 = i40;
                } else {
                    d dVar15 = dVar8;
                    int i41 = i33;
                    int i42 = i34;
                    i14 = i35;
                    if (i14 < size - 1) {
                        dVar = this.f27542t1.get(i14 + 1).f27549b.f27428O;
                        i15 = 0;
                    } else {
                        dVar = this.f27430Q;
                        i15 = E1();
                    }
                    d dVar16 = aVar3.f27549b.f27430Q;
                    aVar3.j(i11, dVar15, dVar7, dVar, dVar6, i36, i31, i15, i37, i12);
                    i34 = i42 + aVar3.f();
                    int max2 = Math.max(i41, aVar3.e());
                    if (i14 > 0) {
                        i34 += this.f27535m1;
                    }
                    i33 = max2;
                    i36 = 0;
                    i32 = i15;
                    dVar8 = dVar16;
                }
                i35 = i14 + 1;
                int i43 = i12;
                dVar5 = dVar;
            }
            iArr[0] = i34;
            iArr[1] = i33;
        }
    }

    private void t2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        int i13 = i10;
        if (i13 != 0) {
            if (this.f27542t1.size() == 0) {
                aVar = new a(i11, this.f27428O, this.f27429P, this.f27430Q, this.f27431R, i12);
                this.f27542t1.add(aVar);
            } else {
                a aVar2 = this.f27542t1.get(0);
                aVar2.c();
                aVar = aVar2;
                aVar.j(i11, this.f27428O, this.f27429P, this.f27430Q, this.f27431R, D1(), F1(), E1(), C1(), i12);
            }
            for (int i14 = 0; i14 < i13; i14++) {
                aVar.b(eVarArr[i14]);
            }
            iArr[0] = aVar.f();
            iArr[1] = aVar.e();
        }
    }

    public void A2(int i10) {
        this.f27535m1 = i10;
    }

    public void B2(int i10) {
        this.f27523a1 = i10;
    }

    public void C2(float f10) {
        this.f27533k1 = f10;
    }

    public void D2(int i10) {
        this.f27527e1 = i10;
    }

    public void E2(float f10) {
        this.f27534l1 = f10;
    }

    public void F2(int i10) {
        this.f27528f1 = i10;
    }

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G1(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            int r0 = r6.f27576M0
            r11 = 0
            if (r0 <= 0) goto L_0x001c
            boolean r0 = r18.I1()
            if (r0 != 0) goto L_0x001c
            r6.L1(r11, r11)
            r6.K1(r11)
            return
        L_0x001c:
            int r12 = r18.D1()
            int r13 = r18.E1()
            int r14 = r18.F1()
            int r15 = r18.C1()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r12
            int r1 = r1 - r13
            int r2 = r6.f27541s1
            r4 = 1
            if (r2 != r4) goto L_0x003a
            int r1 = r10 - r14
            int r1 = r1 - r15
        L_0x003a:
            r16 = r1
            r1 = -1
            if (r2 != 0) goto L_0x004c
            int r2 = r6.f27523a1
            if (r2 != r1) goto L_0x0045
            r6.f27523a1 = r11
        L_0x0045:
            int r2 = r6.f27524b1
            if (r2 != r1) goto L_0x0058
            r6.f27524b1 = r11
            goto L_0x0058
        L_0x004c:
            int r2 = r6.f27523a1
            if (r2 != r1) goto L_0x0052
            r6.f27523a1 = r11
        L_0x0052:
            int r2 = r6.f27524b1
            if (r2 != r1) goto L_0x0058
            r6.f27524b1 = r11
        L_0x0058:
            p2.e[] r1 = r6.f27575L0
            r2 = r11
            r3 = r2
        L_0x005c:
            int r11 = r6.f27576M0
            r0 = 8
            if (r2 >= r11) goto L_0x0072
            p2.e[] r11 = r6.f27575L0
            r11 = r11[r2]
            int r11 = r11.X()
            if (r11 != r0) goto L_0x006e
            int r3 = r3 + 1
        L_0x006e:
            int r2 = r2 + 1
            r0 = 2
            goto L_0x005c
        L_0x0072:
            if (r3 <= 0) goto L_0x0091
            int r11 = r11 - r3
            p2.e[] r1 = new p2.e[r11]
            r2 = 0
            r3 = 0
        L_0x0079:
            int r11 = r6.f27576M0
            if (r2 >= r11) goto L_0x008f
            p2.e[] r11 = r6.f27575L0
            r11 = r11[r2]
            int r4 = r11.X()
            if (r4 == r0) goto L_0x008b
            r1[r3] = r11
            int r3 = r3 + 1
        L_0x008b:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x0079
        L_0x008f:
            r2 = r3
            goto L_0x0092
        L_0x0091:
            r2 = r11
        L_0x0092:
            r6.f27546x1 = r1
            r6.f27547y1 = r2
            int r0 = r6.f27539q1
            if (r0 == 0) goto L_0x00cf
            r4 = 1
            if (r0 == r4) goto L_0x00c2
            r3 = 2
            if (r0 == r3) goto L_0x00b5
            r3 = 3
            if (r0 == r3) goto L_0x00a8
            r11 = r4
            r17 = r5
        L_0x00a6:
            r0 = 0
            goto L_0x00dc
        L_0x00a8:
            int r3 = r6.f27541s1
            r0 = r18
            r11 = r4
            r4 = r16
            r17 = r5
            r0.s2(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00b5:
            r11 = r4
            r17 = r5
            int r3 = r6.f27541s1
            r0 = r18
            r4 = r16
            r0.q2(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00c2:
            r11 = r4
            r17 = r5
            int r3 = r6.f27541s1
            r0 = r18
            r4 = r16
            r0.r2(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00cf:
            r17 = r5
            r11 = 1
            int r3 = r6.f27541s1
            r0 = r18
            r4 = r16
            r0.t2(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00dc:
            r1 = r17[r0]
            int r1 = r1 + r12
            int r1 = r1 + r13
            r2 = r17[r11]
            int r2 = r2 + r14
            int r2 = r2 + r15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto L_0x00ec
            r1 = r8
            goto L_0x00f7
        L_0x00ec:
            if (r7 != r3) goto L_0x00f3
            int r1 = java.lang.Math.min(r1, r8)
            goto L_0x00f7
        L_0x00f3:
            if (r7 != 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r1 = r0
        L_0x00f7:
            if (r9 != r4) goto L_0x00fb
            r2 = r10
            goto L_0x0106
        L_0x00fb:
            if (r9 != r3) goto L_0x0102
            int r2 = java.lang.Math.min(r2, r10)
            goto L_0x0106
        L_0x0102:
            if (r9 != 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r2 = r0
        L_0x0106:
            r6.L1(r1, r2)
            r6.o1(r1)
            r6.P0(r2)
            int r1 = r6.f27576M0
            if (r1 <= 0) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r11 = r0
        L_0x0115:
            r6.K1(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.g.G1(int, int, int, int):void");
    }

    public void G2(int i10) {
        this.f27540r1 = i10;
    }

    public void H2(int i10) {
        this.f27541s1 = i10;
    }

    public void I2(int i10) {
        this.f27538p1 = i10;
    }

    public void J2(float f10) {
        this.f27530h1 = f10;
    }

    public void K2(int i10) {
        this.f27536n1 = i10;
    }

    public void L2(int i10) {
        this.f27524b1 = i10;
    }

    public void M2(int i10) {
        this.f27539q1 = i10;
    }

    public void g(C5414d dVar, boolean z10) {
        super.g(dVar, z10);
        boolean z11 = L() != null && ((f) L()).V1();
        int i10 = this.f27539q1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f27542t1.size();
                int i11 = 0;
                while (i11 < size) {
                    this.f27542t1.get(i11).d(z11, i11, i11 == size + -1);
                    i11++;
                }
            } else if (i10 == 2) {
                n2(z11);
            } else if (i10 == 3) {
                int size2 = this.f27542t1.size();
                int i12 = 0;
                while (i12 < size2) {
                    this.f27542t1.get(i12).d(z11, i12, i12 == size2 + -1);
                    i12++;
                }
            }
        } else if (this.f27542t1.size() > 0) {
            this.f27542t1.get(0).d(z11, 0, true);
        }
        K1(false);
    }

    public void u2(float f10) {
        this.f27531i1 = f10;
    }

    public void v2(int i10) {
        this.f27525c1 = i10;
    }

    public void w2(float f10) {
        this.f27532j1 = f10;
    }

    public void x2(int i10) {
        this.f27526d1 = i10;
    }

    public void y2(int i10) {
        this.f27537o1 = i10;
    }

    public void z2(float f10) {
        this.f27529g1 = f10;
    }
}
