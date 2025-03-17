package t4;

import N3.O;
import N3.r;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import q3.C5798i;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t3.C5954e;
import t3.N;
import t4.L;
import u3.e;
import u3.f;

public final class p implements C8788m {

    /* renamed from: a  reason: collision with root package name */
    private final G f56390a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f56391b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f56392c;

    /* renamed from: d  reason: collision with root package name */
    private final w f56393d = new w(7, 128);

    /* renamed from: e  reason: collision with root package name */
    private final w f56394e = new w(8, 128);

    /* renamed from: f  reason: collision with root package name */
    private final w f56395f = new w(6, 128);

    /* renamed from: g  reason: collision with root package name */
    private long f56396g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f56397h = new boolean[3];

    /* renamed from: i  reason: collision with root package name */
    private String f56398i;

    /* renamed from: j  reason: collision with root package name */
    private O f56399j;

    /* renamed from: k  reason: collision with root package name */
    private b f56400k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f56401l;

    /* renamed from: m  reason: collision with root package name */
    private long f56402m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    private boolean f56403n;

    /* renamed from: o  reason: collision with root package name */
    private final B f56404o = new B();

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final O f56405a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f56406b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f56407c;

        /* renamed from: d  reason: collision with root package name */
        private final SparseArray<e.m> f56408d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        private final SparseArray<e.l> f56409e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        private final f f56410f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f56411g;

        /* renamed from: h  reason: collision with root package name */
        private int f56412h;

        /* renamed from: i  reason: collision with root package name */
        private int f56413i;

        /* renamed from: j  reason: collision with root package name */
        private long f56414j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f56415k;

        /* renamed from: l  reason: collision with root package name */
        private long f56416l;

        /* renamed from: m  reason: collision with root package name */
        private a f56417m = new a();

        /* renamed from: n  reason: collision with root package name */
        private a f56418n = new a();

        /* renamed from: o  reason: collision with root package name */
        private boolean f56419o;

        /* renamed from: p  reason: collision with root package name */
        private long f56420p;

        /* renamed from: q  reason: collision with root package name */
        private long f56421q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f56422r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f56423s;

        private static final class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f56424a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f56425b;

            /* renamed from: c  reason: collision with root package name */
            private e.m f56426c;

            /* renamed from: d  reason: collision with root package name */
            private int f56427d;

            /* renamed from: e  reason: collision with root package name */
            private int f56428e;

            /* renamed from: f  reason: collision with root package name */
            private int f56429f;

            /* renamed from: g  reason: collision with root package name */
            private int f56430g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f56431h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f56432i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f56433j;

            /* renamed from: k  reason: collision with root package name */
            private boolean f56434k;

            /* renamed from: l  reason: collision with root package name */
            private int f56435l;

            /* renamed from: m  reason: collision with root package name */
            private int f56436m;

            /* renamed from: n  reason: collision with root package name */
            private int f56437n;

            /* renamed from: o  reason: collision with root package name */
            private int f56438o;

            /* renamed from: p  reason: collision with root package name */
            private int f56439p;

            private a() {
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
                r4 = r6.f56427d;
                r5 = r7.f56427d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
                r0 = r0.f30148n;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:0x006c, code lost:
                r0 = r6.f56434k;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean c(t4.p.b.a r7) {
                /*
                    r6 = this;
                    boolean r0 = r6.f56424a
                    r1 = 0
                    if (r0 != 0) goto L_0x0006
                    return r1
                L_0x0006:
                    boolean r0 = r7.f56424a
                    r2 = 1
                    if (r0 != 0) goto L_0x000c
                    return r2
                L_0x000c:
                    u3.e$m r0 = r6.f56426c
                    java.lang.Object r0 = t3.C5950a.i(r0)
                    u3.e$m r0 = (u3.e.m) r0
                    u3.e$m r3 = r7.f56426c
                    java.lang.Object r3 = t3.C5950a.i(r3)
                    u3.e$m r3 = (u3.e.m) r3
                    int r4 = r6.f56429f
                    int r5 = r7.f56429f
                    if (r4 != r5) goto L_0x007a
                    int r4 = r6.f56430g
                    int r5 = r7.f56430g
                    if (r4 != r5) goto L_0x007a
                    boolean r4 = r6.f56431h
                    boolean r5 = r7.f56431h
                    if (r4 != r5) goto L_0x007a
                    boolean r4 = r6.f56432i
                    if (r4 == 0) goto L_0x003c
                    boolean r4 = r7.f56432i
                    if (r4 == 0) goto L_0x003c
                    boolean r4 = r6.f56433j
                    boolean r5 = r7.f56433j
                    if (r4 != r5) goto L_0x007a
                L_0x003c:
                    int r4 = r6.f56427d
                    int r5 = r7.f56427d
                    if (r4 == r5) goto L_0x0046
                    if (r4 == 0) goto L_0x007a
                    if (r5 == 0) goto L_0x007a
                L_0x0046:
                    int r0 = r0.f30148n
                    if (r0 != 0) goto L_0x005a
                    int r4 = r3.f30148n
                    if (r4 != 0) goto L_0x005a
                    int r4 = r6.f56436m
                    int r5 = r7.f56436m
                    if (r4 != r5) goto L_0x007a
                    int r4 = r6.f56437n
                    int r5 = r7.f56437n
                    if (r4 != r5) goto L_0x007a
                L_0x005a:
                    if (r0 != r2) goto L_0x006c
                    int r0 = r3.f30148n
                    if (r0 != r2) goto L_0x006c
                    int r0 = r6.f56438o
                    int r3 = r7.f56438o
                    if (r0 != r3) goto L_0x007a
                    int r0 = r6.f56439p
                    int r3 = r7.f56439p
                    if (r0 != r3) goto L_0x007a
                L_0x006c:
                    boolean r0 = r6.f56434k
                    boolean r3 = r7.f56434k
                    if (r0 != r3) goto L_0x007a
                    if (r0 == 0) goto L_0x007b
                    int r0 = r6.f56435l
                    int r7 = r7.f56435l
                    if (r0 == r7) goto L_0x007b
                L_0x007a:
                    r1 = r2
                L_0x007b:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: t4.p.b.a.c(t4.p$b$a):boolean");
            }

            public void b() {
                this.f56425b = false;
                this.f56424a = false;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r0 = r2.f56428e;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean d() {
                /*
                    r2 = this;
                    boolean r0 = r2.f56425b
                    if (r0 == 0) goto L_0x000e
                    int r0 = r2.f56428e
                    r1 = 7
                    if (r0 == r1) goto L_0x000c
                    r1 = 2
                    if (r0 != r1) goto L_0x000e
                L_0x000c:
                    r0 = 1
                    goto L_0x000f
                L_0x000e:
                    r0 = 0
                L_0x000f:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: t4.p.b.a.d():boolean");
            }

            public void e(e.m mVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f56426c = mVar;
                this.f56427d = i10;
                this.f56428e = i11;
                this.f56429f = i12;
                this.f56430g = i13;
                this.f56431h = z10;
                this.f56432i = z11;
                this.f56433j = z12;
                this.f56434k = z13;
                this.f56435l = i14;
                this.f56436m = i15;
                this.f56437n = i16;
                this.f56438o = i17;
                this.f56439p = i18;
                this.f56424a = true;
                this.f56425b = true;
            }

            public void f(int i10) {
                this.f56428e = i10;
                this.f56425b = true;
            }
        }

        public b(O o10, boolean z10, boolean z11) {
            this.f56405a = o10;
            this.f56406b = z10;
            this.f56407c = z11;
            byte[] bArr = new byte[128];
            this.f56411g = bArr;
            this.f56410f = new f(bArr, 0, 0);
            h();
        }

        private void e(int i10) {
            long j10 = this.f56421q;
            if (j10 != -9223372036854775807L) {
                boolean z10 = this.f56422r;
                this.f56405a.c(j10, z10 ? 1 : 0, (int) (this.f56414j - this.f56420p), i10, (O.a) null);
            }
        }

        private void i() {
            boolean d10 = this.f56406b ? this.f56418n.d() : this.f56423s;
            boolean z10 = this.f56422r;
            int i10 = this.f56413i;
            boolean z11 = true;
            if (i10 != 5 && (!d10 || i10 != 1)) {
                z11 = false;
            }
            this.f56422r = z10 | z11;
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x0100  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0103  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0107  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0119  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0157  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(byte[] r24, int r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.f56415k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.f56411g
                int r4 = r3.length
                int r5 = r0.f56412h
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L_0x001d
                int r5 = r5 + r2
                int r5 = r5 * r7
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f56411g = r3
            L_0x001d:
                byte[] r3 = r0.f56411g
                int r4 = r0.f56412h
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f56412h
                int r1 = r1 + r2
                r0.f56412h = r1
                u3.f r2 = r0.f56410f
                byte[] r3 = r0.f56411g
                r4 = 0
                r2.j(r3, r4, r1)
                u3.f r1 = r0.f56410f
                r2 = 8
                boolean r1 = r1.c(r2)
                if (r1 != 0) goto L_0x003e
                return
            L_0x003e:
                u3.f r1 = r0.f56410f
                r1.l()
                u3.f r1 = r0.f56410f
                int r10 = r1.f(r7)
                u3.f r1 = r0.f56410f
                r2 = 5
                r1.m(r2)
                u3.f r1 = r0.f56410f
                boolean r1 = r1.d()
                if (r1 != 0) goto L_0x0058
                return
            L_0x0058:
                u3.f r1 = r0.f56410f
                r1.i()
                u3.f r1 = r0.f56410f
                boolean r1 = r1.d()
                if (r1 != 0) goto L_0x0066
                return
            L_0x0066:
                u3.f r1 = r0.f56410f
                int r11 = r1.i()
                boolean r1 = r0.f56407c
                if (r1 != 0) goto L_0x0078
                r0.f56415k = r4
                t4.p$b$a r1 = r0.f56418n
                r1.f(r11)
                return
            L_0x0078:
                u3.f r1 = r0.f56410f
                boolean r1 = r1.d()
                if (r1 != 0) goto L_0x0081
                return
            L_0x0081:
                u3.f r1 = r0.f56410f
                int r13 = r1.i()
                android.util.SparseArray<u3.e$l> r1 = r0.f56409e
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0092
                r0.f56415k = r4
                return
            L_0x0092:
                android.util.SparseArray<u3.e$l> r1 = r0.f56409e
                java.lang.Object r1 = r1.get(r13)
                u3.e$l r1 = (u3.e.l) r1
                android.util.SparseArray<u3.e$m> r3 = r0.f56408d
                int r5 = r1.f30133b
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                u3.e$m r9 = (u3.e.m) r9
                boolean r3 = r9.f30145k
                if (r3 == 0) goto L_0x00b7
                u3.f r3 = r0.f56410f
                boolean r3 = r3.c(r7)
                if (r3 != 0) goto L_0x00b2
                return
            L_0x00b2:
                u3.f r3 = r0.f56410f
                r3.m(r7)
            L_0x00b7:
                u3.f r3 = r0.f56410f
                int r5 = r9.f30147m
                boolean r3 = r3.c(r5)
                if (r3 != 0) goto L_0x00c2
                return
            L_0x00c2:
                u3.f r3 = r0.f56410f
                int r5 = r9.f30147m
                int r12 = r3.f(r5)
                boolean r3 = r9.f30146l
                r5 = 1
                if (r3 != 0) goto L_0x00f9
                u3.f r3 = r0.f56410f
                boolean r3 = r3.c(r5)
                if (r3 != 0) goto L_0x00d8
                return
            L_0x00d8:
                u3.f r3 = r0.f56410f
                boolean r3 = r3.e()
                if (r3 == 0) goto L_0x00f4
                u3.f r6 = r0.f56410f
                boolean r6 = r6.c(r5)
                if (r6 != 0) goto L_0x00e9
                return
            L_0x00e9:
                u3.f r6 = r0.f56410f
                boolean r6 = r6.e()
                r14 = r3
                r15 = r5
                r16 = r6
                goto L_0x00fc
            L_0x00f4:
                r14 = r3
                r15 = r4
            L_0x00f6:
                r16 = r15
                goto L_0x00fc
            L_0x00f9:
                r14 = r4
                r15 = r14
                goto L_0x00f6
            L_0x00fc:
                int r3 = r0.f56413i
                if (r3 != r2) goto L_0x0103
                r17 = r5
                goto L_0x0105
            L_0x0103:
                r17 = r4
            L_0x0105:
                if (r17 == 0) goto L_0x0119
                u3.f r2 = r0.f56410f
                boolean r2 = r2.d()
                if (r2 != 0) goto L_0x0110
                return
            L_0x0110:
                u3.f r2 = r0.f56410f
                int r2 = r2.i()
                r18 = r2
                goto L_0x011b
            L_0x0119:
                r18 = r4
            L_0x011b:
                int r2 = r9.f30148n
                if (r2 != 0) goto L_0x0157
                u3.f r2 = r0.f56410f
                int r3 = r9.f30149o
                boolean r2 = r2.c(r3)
                if (r2 != 0) goto L_0x012a
                return
            L_0x012a:
                u3.f r2 = r0.f56410f
                int r3 = r9.f30149o
                int r2 = r2.f(r3)
                boolean r1 = r1.f30134c
                if (r1 == 0) goto L_0x0150
                if (r14 != 0) goto L_0x0150
                u3.f r1 = r0.f56410f
                boolean r1 = r1.d()
                if (r1 != 0) goto L_0x0141
                return
            L_0x0141:
                u3.f r1 = r0.f56410f
                int r1 = r1.h()
                r20 = r1
                r19 = r2
                r21 = r4
            L_0x014d:
                r22 = r21
                goto L_0x0198
            L_0x0150:
                r19 = r2
                r20 = r4
            L_0x0154:
                r21 = r20
                goto L_0x014d
            L_0x0157:
                if (r2 != r5) goto L_0x0193
                boolean r2 = r9.f30150p
                if (r2 != 0) goto L_0x0193
                u3.f r2 = r0.f56410f
                boolean r2 = r2.d()
                if (r2 != 0) goto L_0x0166
                return
            L_0x0166:
                u3.f r2 = r0.f56410f
                int r2 = r2.h()
                boolean r1 = r1.f30134c
                if (r1 == 0) goto L_0x018a
                if (r14 != 0) goto L_0x018a
                u3.f r1 = r0.f56410f
                boolean r1 = r1.d()
                if (r1 != 0) goto L_0x017b
                return
            L_0x017b:
                u3.f r1 = r0.f56410f
                int r1 = r1.h()
                r22 = r1
                r21 = r2
                r19 = r4
                r20 = r19
                goto L_0x0198
            L_0x018a:
                r21 = r2
                r19 = r4
                r20 = r19
                r22 = r20
                goto L_0x0198
            L_0x0193:
                r19 = r4
                r20 = r19
                goto L_0x0154
            L_0x0198:
                t4.p$b$a r8 = r0.f56418n
                r8.e(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.f56415k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t4.p.b.a(byte[], int, int):void");
        }

        public void b(long j10) {
            i();
            this.f56414j = j10;
            e(0);
            this.f56419o = false;
        }

        public boolean c(long j10, int i10, boolean z10) {
            if (this.f56413i == 9 || (this.f56407c && this.f56418n.c(this.f56417m))) {
                if (z10 && this.f56419o) {
                    e(i10 + ((int) (j10 - this.f56414j)));
                }
                this.f56420p = this.f56414j;
                this.f56421q = this.f56416l;
                this.f56422r = false;
                this.f56419o = true;
            }
            i();
            return this.f56422r;
        }

        public boolean d() {
            return this.f56407c;
        }

        public void f(e.l lVar) {
            this.f56409e.append(lVar.f30132a, lVar);
        }

        public void g(e.m mVar) {
            this.f56408d.append(mVar.f30138d, mVar);
        }

        public void h() {
            this.f56415k = false;
            this.f56419o = false;
            this.f56418n.b();
        }

        public void j(long j10, int i10, long j11, boolean z10) {
            this.f56413i = i10;
            this.f56416l = j11;
            this.f56414j = j10;
            this.f56423s = z10;
            if (!this.f56406b || i10 != 1) {
                if (!this.f56407c) {
                    return;
                }
                if (!(i10 == 5 || i10 == 1 || i10 == 2)) {
                    return;
                }
            }
            a aVar = this.f56417m;
            this.f56417m = this.f56418n;
            this.f56418n = aVar;
            aVar.b();
            this.f56412h = 0;
            this.f56415k = true;
        }
    }

    public p(G g10, boolean z10, boolean z11) {
        this.f56390a = g10;
        this.f56391b = z10;
        this.f56392c = z11;
    }

    private void b() {
        C5950a.i(this.f56399j);
        N.i(this.f56400k);
    }

    private void g(long j10, int i10, int i11, long j11) {
        if (!this.f56401l || this.f56400k.d()) {
            this.f56393d.b(i11);
            this.f56394e.b(i11);
            if (!this.f56401l) {
                if (this.f56393d.c() && this.f56394e.c()) {
                    ArrayList arrayList = new ArrayList();
                    w wVar = this.f56393d;
                    arrayList.add(Arrays.copyOf(wVar.f56539d, wVar.f56540e));
                    w wVar2 = this.f56394e;
                    arrayList.add(Arrays.copyOf(wVar2.f56539d, wVar2.f56540e));
                    w wVar3 = this.f56393d;
                    e.m z10 = e.z(wVar3.f56539d, 3, wVar3.f56540e);
                    w wVar4 = this.f56394e;
                    e.l x10 = e.x(wVar4.f56539d, 3, wVar4.f56540e);
                    this.f56399j.e(new C5807s.b().e0(this.f56398i).s0("video/avc").R(C5954e.d(z10.f30135a, z10.f30136b, z10.f30137c)).x0(z10.f30140f).c0(z10.f30141g).S(new C5798i.b().d(z10.f30151q).c(z10.f30152r).e(z10.f30153s).g(z10.f30143i + 8).b(z10.f30144j + 8).a()).o0(z10.f30142h).f0(arrayList).k0(z10.f30154t).M());
                    this.f56401l = true;
                    this.f56390a.f(z10.f30154t);
                    this.f56400k.g(z10);
                    this.f56400k.f(x10);
                    this.f56393d.d();
                    this.f56394e.d();
                }
            } else if (this.f56393d.c()) {
                w wVar5 = this.f56393d;
                e.m z11 = e.z(wVar5.f56539d, 3, wVar5.f56540e);
                this.f56390a.f(z11.f30154t);
                this.f56400k.g(z11);
                this.f56393d.d();
            } else if (this.f56394e.c()) {
                w wVar6 = this.f56394e;
                this.f56400k.f(e.x(wVar6.f56539d, 3, wVar6.f56540e));
                this.f56394e.d();
            }
        }
        if (this.f56395f.b(i11)) {
            w wVar7 = this.f56395f;
            this.f56404o.U(this.f56395f.f56539d, e.I(wVar7.f56539d, wVar7.f56540e));
            this.f56404o.W(4);
            this.f56390a.b(j11, this.f56404o);
        }
        if (this.f56400k.c(j10, i10, this.f56401l)) {
            this.f56403n = false;
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f56401l || this.f56400k.d()) {
            this.f56393d.a(bArr, i10, i11);
            this.f56394e.a(bArr, i10, i11);
        }
        this.f56395f.a(bArr, i10, i11);
        this.f56400k.a(bArr, i10, i11);
    }

    private void i(long j10, int i10, long j11) {
        if (!this.f56401l || this.f56400k.d()) {
            this.f56393d.e(i10);
            this.f56394e.e(i10);
        }
        this.f56395f.e(i10);
        this.f56400k.j(j10, i10, j11, this.f56403n);
    }

    public void a(B b10) {
        b();
        int f10 = b10.f();
        int g10 = b10.g();
        byte[] e10 = b10.e();
        this.f56396g += (long) b10.a();
        this.f56399j.a(b10, b10.a());
        while (true) {
            int e11 = e.e(e10, f10, g10, this.f56397h);
            if (e11 == g10) {
                h(e10, f10, g10);
                return;
            }
            int j10 = e.j(e10, e11);
            int i10 = e11 - f10;
            if (i10 > 0) {
                h(e10, f10, e11);
            }
            int i11 = g10 - e11;
            long j11 = this.f56396g - ((long) i11);
            g(j11, i11, i10 < 0 ? -i10 : 0, this.f56402m);
            i(j11, j10, this.f56402m);
            f10 = e11 + 3;
        }
    }

    public void c() {
        this.f56396g = 0;
        this.f56403n = false;
        this.f56402m = -9223372036854775807L;
        e.c(this.f56397h);
        this.f56393d.d();
        this.f56394e.d();
        this.f56395f.d();
        this.f56390a.d();
        b bVar = this.f56400k;
        if (bVar != null) {
            bVar.h();
        }
    }

    public void d(r rVar, L.d dVar) {
        dVar.a();
        this.f56398i = dVar.b();
        O t10 = rVar.t(dVar.c(), 2);
        this.f56399j = t10;
        this.f56400k = new b(t10, this.f56391b, this.f56392c);
        this.f56390a.c(rVar, dVar);
    }

    public void e(boolean z10) {
        b();
        if (z10) {
            this.f56390a.d();
            this.f56400k.b(this.f56396g);
        }
    }

    public void f(long j10, int i10) {
        this.f56402m = j10;
        this.f56403n |= (i10 & 2) != 0;
    }
}
