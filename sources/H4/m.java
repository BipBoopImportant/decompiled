package h4;

import N3.C6656B;
import N3.C6665c;
import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.J;
import N3.N;
import N3.O;
import N3.P;
import N3.r;
import N3.u;
import c4.C7090a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import k4.s;
import k4.t;
import kb.C9967v;
import q3.C5803n;
import q3.C5807s;
import q3.z;
import t3.B;
import t3.C5950a;
import u3.b;
import u3.e;

public final class m implements C6678p, J {
    @Deprecated

    /* renamed from: G  reason: collision with root package name */
    public static final u f51540G = new l();

    /* renamed from: A  reason: collision with root package name */
    private a[] f51541A;

    /* renamed from: B  reason: collision with root package name */
    private long[][] f51542B;

    /* renamed from: C  reason: collision with root package name */
    private int f51543C;

    /* renamed from: D  reason: collision with root package name */
    private long f51544D;

    /* renamed from: E  reason: collision with root package name */
    private int f51545E;

    /* renamed from: F  reason: collision with root package name */
    private C7090a f51546F;

    /* renamed from: a  reason: collision with root package name */
    private final s.a f51547a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51548b;

    /* renamed from: c  reason: collision with root package name */
    private final B f51549c;

    /* renamed from: d  reason: collision with root package name */
    private final B f51550d;

    /* renamed from: e  reason: collision with root package name */
    private final B f51551e;

    /* renamed from: f  reason: collision with root package name */
    private final B f51552f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque<b.C0471b> f51553g;

    /* renamed from: h  reason: collision with root package name */
    private final p f51554h;

    /* renamed from: i  reason: collision with root package name */
    private final List<z.b> f51555i;

    /* renamed from: j  reason: collision with root package name */
    private C9967v<N> f51556j;

    /* renamed from: k  reason: collision with root package name */
    private int f51557k;

    /* renamed from: l  reason: collision with root package name */
    private int f51558l;

    /* renamed from: m  reason: collision with root package name */
    private long f51559m;

    /* renamed from: n  reason: collision with root package name */
    private int f51560n;

    /* renamed from: o  reason: collision with root package name */
    private B f51561o;

    /* renamed from: p  reason: collision with root package name */
    private int f51562p;

    /* renamed from: q  reason: collision with root package name */
    private int f51563q;

    /* renamed from: r  reason: collision with root package name */
    private int f51564r;

    /* renamed from: s  reason: collision with root package name */
    private int f51565s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f51566t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f51567u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f51568v;

    /* renamed from: w  reason: collision with root package name */
    private long f51569w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f51570x;

    /* renamed from: y  reason: collision with root package name */
    private long f51571y;

    /* renamed from: z  reason: collision with root package name */
    private r f51572z;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final s f51573a;

        /* renamed from: b  reason: collision with root package name */
        public final v f51574b;

        /* renamed from: c  reason: collision with root package name */
        public final O f51575c;

        /* renamed from: d  reason: collision with root package name */
        public final P f51576d;

        /* renamed from: e  reason: collision with root package name */
        public int f51577e;

        public a(s sVar, v vVar, O o10) {
            this.f51573a = sVar;
            this.f51574b = vVar;
            this.f51575c = o10;
            this.f51576d = "audio/true-hd".equals(sVar.f51598g.f28244o) ? new P() : null;
        }
    }

    @Deprecated
    public m() {
        this(s.a.f54127a, 16);
    }

    private void A(C6679q qVar) {
        this.f51551e.S(8);
        qVar.o(this.f51551e.e(), 0, 8);
        C7925b.e(this.f51551e);
        qVar.k(this.f51551e.f());
        qVar.f();
    }

    private void B(long j10) {
        while (!this.f51553g.isEmpty() && this.f51553g.peek().f30067b == j10) {
            b.C0471b pop = this.f51553g.pop();
            if (pop.f30066a == 1836019574) {
                E(pop);
                this.f51553g.clear();
                if (!this.f51568v) {
                    this.f51557k = 2;
                }
            } else if (!this.f51553g.isEmpty()) {
                this.f51553g.peek().b(pop);
            }
        }
        if (this.f51557k != 2) {
            q();
        }
    }

    private void C() {
        z zVar;
        if (this.f51545E == 2 && (this.f51548b & 2) != 0) {
            O t10 = this.f51572z.t(0, 4);
            if (this.f51546F == null) {
                zVar = null;
            } else {
                zVar = new z(this.f51546F);
            }
            t10.e(new C5807s.b().l0(zVar).M());
            this.f51572z.r();
            this.f51572z.n(new J.b(-9223372036854775807L));
        }
    }

    private static int D(B b10) {
        b10.W(8);
        int o10 = o(b10.q());
        if (o10 != 0) {
            return o10;
        }
        b10.X(4);
        while (b10.a() > 0) {
            int o11 = o(b10.q());
            if (o11 != 0) {
                return o11;
            }
        }
        return 0;
    }

    private void E(b.C0471b bVar) {
        List list;
        z zVar;
        z zVar2;
        int i10;
        List<v> list2;
        z zVar3;
        ArrayList arrayList;
        z zVar4;
        int i11;
        ArrayList arrayList2;
        z zVar5;
        int i12;
        b.C0471b bVar2 = bVar;
        b.C0471b d10 = bVar2.d(1835365473);
        List arrayList3 = new ArrayList();
        if (d10 != null) {
            z q10 = C7925b.q(d10);
            if (this.f51570x) {
                C5950a.i(q10);
                z(q10);
                arrayList3 = r(q10);
            } else if (M(q10)) {
                this.f51568v = true;
                return;
            }
            zVar = q10;
            list = arrayList3;
        } else {
            list = arrayList3;
            zVar = null;
        }
        ArrayList arrayList4 = new ArrayList();
        boolean z10 = this.f51545E == 1;
        C6656B b10 = new C6656B();
        b.c e10 = bVar2.e(1969517665);
        if (e10 != null) {
            z E10 = C7925b.E(e10);
            b10.c(E10);
            zVar2 = E10;
        } else {
            zVar2 = null;
        }
        z zVar6 = new z(C7925b.s(((b.c) C5950a.e(bVar2.e(1836476516))).f30070b));
        z zVar7 = zVar2;
        List<v> D10 = C7925b.D(bVar, b10, -9223372036854775807L, (C5803n) null, (this.f51548b & 1) != 0, z10, new k());
        if (this.f51570x) {
            C5950a.h(list.size() == D10.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of editable video tracks (%d)", new Object[]{Integer.valueOf(list.size()), Integer.valueOf(D10.size())}));
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = -1;
        long j10 = -9223372036854775807L;
        while (i14 < D10.size()) {
            v vVar = D10.get(i14);
            if (vVar.f51628b == 0) {
                list2 = D10;
                i10 = i13;
                zVar3 = zVar6;
                zVar4 = zVar;
                arrayList = arrayList4;
                i11 = 1;
            } else {
                s sVar = vVar.f51627a;
                z zVar8 = zVar6;
                zVar4 = zVar;
                long j11 = sVar.f51596e;
                if (j11 == -9223372036854775807L) {
                    j11 = vVar.f51634h;
                }
                list2 = D10;
                long max = Math.max(j10, j11);
                i10 = i13 + 1;
                a aVar = new a(sVar, vVar, this.f51572z.t(i13, sVar.f51593b));
                int i16 = "audio/true-hd".equals(sVar.f51598g.f28244o) ? vVar.f51631e * 16 : vVar.f51631e + 30;
                C5807s.b b11 = sVar.f51598g.b();
                b11.j0(i16);
                if (sVar.f51593b == 2) {
                    C5807s sVar2 = sVar.f51598g;
                    int i17 = sVar2.f28235f;
                    arrayList2 = arrayList4;
                    if ((this.f51548b & 8) != 0) {
                        i17 |= i15 == -1 ? 1 : 2;
                    }
                    if (sVar2.f28253x == -1.0f && j11 > 0 && (i12 = vVar.f51628b) > 0) {
                        b11.a0(((float) i12) / (((float) j11) / 1000000.0f));
                    }
                    if (this.f51570x) {
                        i17 |= 32768;
                        b11.O(((Integer) list.get(i14)).intValue());
                    }
                    b11.q0(i17);
                } else {
                    arrayList2 = arrayList4;
                }
                j.l(sVar.f51593b, b10, b11);
                int i18 = sVar.f51593b;
                if (this.f51555i.isEmpty()) {
                    zVar3 = zVar8;
                    zVar5 = null;
                } else {
                    zVar5 = new z((List<? extends z.b>) this.f51555i);
                    zVar3 = zVar8;
                }
                j.m(i18, zVar4, b11, zVar5, zVar7, zVar3);
                aVar.f51575c.e(b11.M());
                if (sVar.f51593b == 2) {
                    if (i15 == -1) {
                        i15 = arrayList2.size();
                    }
                }
                arrayList = arrayList2;
                arrayList.add(aVar);
                j10 = max;
                i11 = 1;
            }
            i14 += i11;
            zVar = zVar4;
            arrayList4 = arrayList;
            zVar6 = zVar3;
            D10 = list2;
            i13 = i10;
        }
        this.f51543C = i15;
        this.f51544D = j10;
        a[] aVarArr = (a[]) arrayList4.toArray(new a[0]);
        this.f51541A = aVarArr;
        this.f51542B = p(aVarArr);
        this.f51572z.r();
        this.f51572z.n(this);
    }

    private void F(long j10) {
        if (this.f51558l == 1836086884) {
            int i10 = this.f51560n;
            this.f51546F = new C7090a(0, j10, -9223372036854775807L, j10 + ((long) i10), this.f51559m - ((long) i10));
        }
    }

    private boolean G(C6679q qVar) {
        b.C0471b peek;
        if (this.f51560n == 0) {
            if (!qVar.g(this.f51552f.e(), 0, 8, true)) {
                C();
                return false;
            }
            this.f51560n = 8;
            this.f51552f.W(0);
            this.f51559m = this.f51552f.J();
            this.f51558l = this.f51552f.q();
        }
        long j10 = this.f51559m;
        if (j10 == 1) {
            qVar.readFully(this.f51552f.e(), 8, 8);
            this.f51560n += 8;
            this.f51559m = this.f51552f.O();
        } else if (j10 == 0) {
            long length = qVar.getLength();
            if (length == -1 && (peek = this.f51553g.peek()) != null) {
                length = peek.f30067b;
            }
            if (length != -1) {
                this.f51559m = (length - qVar.getPosition()) + ((long) this.f51560n);
            }
        }
        if (this.f51559m >= ((long) this.f51560n)) {
            if (K(this.f51558l)) {
                long position = qVar.getPosition();
                long j11 = this.f51559m;
                int i10 = this.f51560n;
                long j12 = (position + j11) - ((long) i10);
                if (j11 != ((long) i10) && this.f51558l == 1835365473) {
                    A(qVar);
                }
                this.f51553g.push(new b.C0471b(this.f51558l, j12));
                if (this.f51559m == ((long) this.f51560n)) {
                    B(j12);
                } else {
                    q();
                }
            } else if (L(this.f51558l)) {
                C5950a.g(this.f51560n == 8);
                C5950a.g(this.f51559m <= 2147483647L);
                B b10 = new B((int) this.f51559m);
                System.arraycopy(this.f51552f.e(), 0, b10.e(), 0, 8);
                this.f51561o = b10;
                this.f51557k = 1;
            } else {
                F(qVar.getPosition() - ((long) this.f51560n));
                this.f51561o = null;
                this.f51557k = 1;
            }
            return true;
        }
        throw q3.B.c("Atom size less than header length (unsupported).");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean H(N3.C6679q r10, N3.I r11) {
        /*
            r9 = this;
            long r0 = r9.f51559m
            int r2 = r9.f51560n
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            t3.B r4 = r9.f51561o
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0046
            byte[] r7 = r4.e()
            int r8 = r9.f51560n
            int r0 = (int) r0
            r10.readFully(r7, r8, r0)
            int r10 = r9.f51558l
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r0) goto L_0x002b
            r9.f51567u = r5
            int r10 = D(r4)
            r9.f51545E = r10
            goto L_0x005e
        L_0x002b:
            java.util.ArrayDeque<u3.b$b> r10 = r9.f51553g
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x005e
            java.util.ArrayDeque<u3.b$b> r10 = r9.f51553g
            java.lang.Object r10 = r10.peek()
            u3.b$b r10 = (u3.b.C0471b) r10
            u3.b$c r0 = new u3.b$c
            int r1 = r9.f51558l
            r0.<init>(r1, r4)
            r10.c(r0)
            goto L_0x005e
        L_0x0046:
            boolean r4 = r9.f51567u
            if (r4 != 0) goto L_0x0053
            int r4 = r9.f51558l
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r4 != r7) goto L_0x0053
            r9.f51545E = r5
        L_0x0053:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0060
            int r0 = (int) r0
            r10.k(r0)
        L_0x005e:
            r10 = r6
            goto L_0x0068
        L_0x0060:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.f38760a = r7
            r10 = r5
        L_0x0068:
            r9.B(r2)
            boolean r0 = r9.f51568v
            if (r0 == 0) goto L_0x0078
            r9.f51570x = r5
            long r0 = r9.f51569w
            r11.f38760a = r0
            r9.f51568v = r6
            r10 = r5
        L_0x0078:
            if (r10 == 0) goto L_0x0080
            int r10 = r9.f51557k
            r11 = 2
            if (r10 == r11) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r5 = r6
        L_0x0081:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.m.H(N3.q, N3.I):boolean");
    }

    private int I(C6679q qVar, I i10) {
        int i11;
        I i12;
        boolean z10;
        C6679q qVar2 = qVar;
        long position = qVar.getPosition();
        if (this.f51562p == -1) {
            int v10 = v(position);
            this.f51562p = v10;
            if (v10 == -1) {
                return -1;
            }
        }
        a aVar = this.f51541A[this.f51562p];
        O o10 = aVar.f51575c;
        int i13 = aVar.f51577e;
        v vVar = aVar.f51574b;
        long j10 = vVar.f51629c[i13] + this.f51571y;
        int i14 = vVar.f51630d[i13];
        P p10 = aVar.f51576d;
        long j11 = (j10 - position) + ((long) this.f51563q);
        if (j11 < 0) {
            i11 = 1;
            i12 = i10;
        } else if (j11 >= 262144) {
            i12 = i10;
            i11 = 1;
        } else {
            if (aVar.f51573a.f51599h == 1) {
                j11 += 8;
                i14 -= 8;
            }
            qVar2.k((int) j11);
            if (!Objects.equals(aVar.f51573a.f51598g.f28244o, "video/avc")) {
                this.f51566t = true;
            }
            s sVar = aVar.f51573a;
            if (sVar.f51602k == 0) {
                if ("audio/ac4".equals(sVar.f51598g.f28244o)) {
                    if (this.f51564r == 0) {
                        C6665c.a(i14, this.f51551e);
                        o10.a(this.f51551e, 7);
                        this.f51564r += 7;
                    }
                    i14 += 7;
                } else if (p10 != null) {
                    p10.d(qVar2);
                }
                while (true) {
                    int i15 = this.f51564r;
                    if (i15 >= i14) {
                        break;
                    }
                    int d10 = o10.d(qVar2, i14 - i15, false);
                    this.f51563q += d10;
                    this.f51564r += d10;
                    this.f51565s -= d10;
                }
            } else {
                byte[] e10 = this.f51550d.e();
                e10[0] = 0;
                e10[1] = 0;
                e10[2] = 0;
                int i16 = aVar.f51573a.f51602k;
                int i17 = i16 + 1;
                int i18 = 4;
                int i19 = 4 - i16;
                while (this.f51564r < i14) {
                    int i20 = this.f51565s;
                    if (i20 == 0) {
                        qVar2.readFully(e10, i19, i17);
                        this.f51563q += i17;
                        this.f51550d.W(0);
                        int q10 = this.f51550d.q();
                        if (q10 >= 1) {
                            this.f51565s = q10 - 1;
                            this.f51549c.W(0);
                            o10.a(this.f51549c, i18);
                            o10.a(this.f51550d, 1);
                            this.f51564r += 5;
                            i14 += i19;
                            if (!this.f51566t && e.k(e10[i18])) {
                                this.f51566t = true;
                            }
                        } else {
                            throw q3.B.a("Invalid NAL length", (Throwable) null);
                        }
                    } else {
                        int d11 = o10.d(qVar2, i20, false);
                        this.f51563q += d11;
                        this.f51564r += d11;
                        this.f51565s -= d11;
                        i18 = 4;
                    }
                }
            }
            int i21 = i14;
            v vVar2 = aVar.f51574b;
            long j12 = vVar2.f51632f[i13];
            int i22 = vVar2.f51633g[i13];
            if (!this.f51566t) {
                i22 |= 67108864;
            }
            if (p10 != null) {
                int i23 = i21;
                z10 = true;
                P p11 = p10;
                p10.c(o10, j12, i22, i23, 0, (O.a) null);
                if (i13 + 1 == aVar.f51574b.f51628b) {
                    p11.a(o10, (O.a) null);
                }
            } else {
                z10 = true;
                o10.c(j12, i22, i21, 0, (O.a) null);
            }
            aVar.f51577e++;
            this.f51562p = -1;
            this.f51563q = 0;
            this.f51564r = 0;
            this.f51565s = 0;
            this.f51566t = (this.f51548b & 32) == 0 ? z10 : false;
            return 0;
        }
        i12.f38760a = j10;
        return i11;
    }

    private int J(C6679q qVar, I i10) {
        int c10 = this.f51554h.c(qVar, i10, this.f51555i);
        if (c10 == 1 && i10.f38760a == 0) {
            q();
        }
        return c10;
    }

    private static boolean K(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473 || i10 == 1701082724;
    }

    private static boolean L(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private boolean M(z zVar) {
        u3.a a10;
        if (!(zVar == null || (this.f51548b & 64) == 0 || (a10 = j.a(zVar, "editable.tracks.offset")) == null)) {
            long O10 = new B(a10.f30063b).O();
            if (O10 > 0) {
                this.f51569w = O10;
                return true;
            }
        }
        return false;
    }

    private void N(a aVar, long j10) {
        v vVar = aVar.f51574b;
        int a10 = vVar.a(j10);
        if (a10 == -1) {
            a10 = vVar.b(j10);
        }
        aVar.f51577e = a10;
    }

    private static int o(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] p(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f51574b.f51628b];
            jArr2[i10] = aVarArr[i10].f51574b.f51632f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            v vVar = aVarArr[i12].f51574b;
            j10 += (long) vVar.f51630d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = vVar.f51632f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void q() {
        this.f51557k = 0;
        this.f51560n = 0;
    }

    private List<Integer> r(z zVar) {
        List<Integer> a10 = ((u3.a) C5950a.i(j.a(zVar, "editable.tracks.map"))).a();
        ArrayList arrayList = new ArrayList(a10.size());
        for (int i10 = 0; i10 < a10.size(); i10++) {
            int intValue = a10.get(i10).intValue();
            int i11 = 1;
            if (intValue != 0) {
                if (intValue != 1) {
                    i11 = 3;
                    if (intValue != 2) {
                        i11 = intValue != 3 ? 0 : 4;
                    }
                } else {
                    i11 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    private static int u(v vVar, long j10) {
        int a10 = vVar.a(j10);
        return a10 == -1 ? vVar.b(j10) : a10;
    }

    private int v(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f51541A;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f51577e;
            v vVar = aVar.f51574b;
            if (i13 != vVar.f51628b) {
                long j14 = vVar.f51629c[i13];
                long j15 = ((long[][]) t3.N.i(this.f51542B))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ s w(s sVar) {
        return sVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C6678p[] x() {
        return new C6678p[]{new m(s.a.f54127a, 16)};
    }

    private static long y(v vVar, long j10, long j11) {
        int u10 = u(vVar, j10);
        return u10 == -1 ? j11 : Math.min(vVar.f51629c[u10], j11);
    }

    private void z(z zVar) {
        u3.a a10 = j.a(zVar, "editable.tracks.samples.location");
        if (a10 != null && a10.f30063b[0] == 0) {
            this.f51571y = this.f51569w + 16;
        }
    }

    public void a(long j10, long j11) {
        this.f51553g.clear();
        this.f51560n = 0;
        this.f51562p = -1;
        this.f51563q = 0;
        this.f51564r = 0;
        this.f51565s = 0;
        this.f51566t = (this.f51548b & 32) == 0;
        if (j10 != 0) {
            for (a aVar : this.f51541A) {
                N(aVar, j11);
                P p10 = aVar.f51576d;
                if (p10 != null) {
                    p10.b();
                }
            }
        } else if (this.f51557k != 3) {
            q();
        } else {
            this.f51554h.g();
            this.f51555i.clear();
        }
    }

    public void b(r rVar) {
        if ((this.f51548b & 16) == 0) {
            rVar = new t(rVar, this.f51547a);
        }
        this.f51572z = rVar;
    }

    public J.a c(long j10) {
        return s(j10, -1);
    }

    public boolean f() {
        return true;
    }

    public boolean h(C6679q qVar) {
        N d10 = r.d(qVar, (this.f51548b & 2) != 0);
        this.f51556j = d10 != null ? C9967v.F(d10) : C9967v.E();
        return d10 == null;
    }

    public int j(C6679q qVar, I i10) {
        while (true) {
            int i11 = this.f51557k;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return I(qVar, i10);
                    }
                    if (i11 == 3) {
                        return J(qVar, i10);
                    }
                    throw new IllegalStateException();
                } else if (H(qVar, i10)) {
                    return 1;
                }
            } else if (!G(qVar)) {
                return -1;
            }
        }
    }

    public long l() {
        return this.f51544D;
    }

    public void release() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public N3.J.a s(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            h4.m$a[] r4 = r0.f51541A
            int r5 = r4.length
            if (r5 != 0) goto L_0x0013
            N3.J$a r1 = new N3.J$a
            N3.K r2 = N3.K.f38765c
            r1.<init>(r2)
            return r1
        L_0x0013:
            r5 = -1
            if (r3 == r5) goto L_0x0018
            r6 = r3
            goto L_0x001a
        L_0x0018:
            int r6 = r0.f51543C
        L_0x001a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L_0x0058
            r4 = r4[r6]
            h4.v r4 = r4.f51574b
            int r6 = u(r4, r1)
            if (r6 != r5) goto L_0x0035
            N3.J$a r1 = new N3.J$a
            N3.K r2 = N3.K.f38765c
            r1.<init>(r2)
            return r1
        L_0x0035:
            long[] r11 = r4.f51632f
            r12 = r11[r6]
            long[] r11 = r4.f51629c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L_0x005e
            int r11 = r4.f51628b
            int r11 = r11 + -1
            if (r6 >= r11) goto L_0x005e
            int r1 = r4.b(r1)
            if (r1 == r5) goto L_0x005e
            if (r1 == r6) goto L_0x005e
            long[] r2 = r4.f51632f
            r9 = r2[r1]
            long[] r2 = r4.f51629c
            r1 = r2[r1]
            goto L_0x0060
        L_0x0058:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L_0x005e:
            r1 = r9
            r9 = r7
        L_0x0060:
            if (r3 != r5) goto L_0x0080
            r3 = 0
        L_0x0063:
            h4.m$a[] r4 = r0.f51541A
            int r5 = r4.length
            if (r3 >= r5) goto L_0x0080
            int r5 = r0.f51543C
            if (r3 == r5) goto L_0x007d
            r4 = r4[r3]
            h4.v r4 = r4.f51574b
            long r5 = y(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x007c
            long r1 = y(r4, r9, r1)
        L_0x007c:
            r14 = r5
        L_0x007d:
            int r3 = r3 + 1
            goto L_0x0063
        L_0x0080:
            N3.K r3 = new N3.K
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x008f
            N3.J$a r1 = new N3.J$a
            r1.<init>(r3)
            return r1
        L_0x008f:
            N3.K r4 = new N3.K
            r4.<init>(r9, r1)
            N3.J$a r1 = new N3.J$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.m.s(long, int):N3.J$a");
    }

    /* renamed from: t */
    public C9967v<N> i() {
        return this.f51556j;
    }

    public m(s.a aVar, int i10) {
        this.f51547a = aVar;
        this.f51548b = i10;
        this.f51556j = C9967v.E();
        boolean z10 = false;
        this.f51557k = (i10 & 4) != 0 ? 3 : 0;
        this.f51554h = new p();
        this.f51555i = new ArrayList();
        this.f51552f = new B(16);
        this.f51553g = new ArrayDeque<>();
        this.f51549c = new B(e.f30076a);
        this.f51550d = new B(5);
        this.f51551e = new B();
        this.f51562p = -1;
        this.f51572z = r.f38935b0;
        this.f51541A = new a[0];
        this.f51566t = (i10 & 32) == 0 ? true : z10;
    }
}
