package t4;

import N3.O;
import N3.r;
import java.util.Arrays;
import t3.B;
import t3.C5950a;
import t4.L;
import u3.e;

/* renamed from: t4.n  reason: case insensitive filesystem */
public final class C8789n implements C8788m {

    /* renamed from: q  reason: collision with root package name */
    private static final double[] f56342q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    private String f56343a;

    /* renamed from: b  reason: collision with root package name */
    private O f56344b;

    /* renamed from: c  reason: collision with root package name */
    private final N f56345c;

    /* renamed from: d  reason: collision with root package name */
    private final B f56346d;

    /* renamed from: e  reason: collision with root package name */
    private final w f56347e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f56348f;

    /* renamed from: g  reason: collision with root package name */
    private final a f56349g;

    /* renamed from: h  reason: collision with root package name */
    private long f56350h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f56351i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f56352j;

    /* renamed from: k  reason: collision with root package name */
    private long f56353k;

    /* renamed from: l  reason: collision with root package name */
    private long f56354l;

    /* renamed from: m  reason: collision with root package name */
    private long f56355m;

    /* renamed from: n  reason: collision with root package name */
    private long f56356n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f56357o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f56358p;

    /* renamed from: t4.n$a */
    private static final class a {

        /* renamed from: e  reason: collision with root package name */
        private static final byte[] f56359e = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f56360a;

        /* renamed from: b  reason: collision with root package name */
        public int f56361b;

        /* renamed from: c  reason: collision with root package name */
        public int f56362c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f56363d;

        public a(int i10) {
            this.f56363d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f56360a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f56363d;
                int length = bArr2.length;
                int i13 = this.f56361b;
                if (length < i13 + i12) {
                    this.f56363d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f56363d, this.f56361b, i12);
                this.f56361b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f56360a) {
                int i12 = this.f56361b - i11;
                this.f56361b = i12;
                if (this.f56362c == 0 && i10 == 181) {
                    this.f56362c = i12;
                } else {
                    this.f56360a = false;
                    return true;
                }
            } else if (i10 == 179) {
                this.f56360a = true;
            }
            byte[] bArr = f56359e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f56360a = false;
            this.f56361b = 0;
            this.f56362c = 0;
        }
    }

    public C8789n() {
        this((N) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<q3.C5807s, java.lang.Long> b(t4.C8789n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f56363d
            int r1 = r8.f56361b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            byte r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            byte r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            byte r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            byte r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L_0x003e
            r7 = 3
            if (r6 == r7) goto L_0x0038
            if (r6 == r1) goto L_0x0030
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0044
        L_0x0030:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L_0x0035:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L_0x0044
        L_0x0038:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L_0x0035
        L_0x003e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L_0x0035
        L_0x0044:
            q3.s$b r6 = new q3.s$b
            r6.<init>()
            q3.s$b r9 = r6.e0(r9)
            java.lang.String r6 = "video/mpeg2"
            q3.s$b r9 = r9.s0(r6)
            q3.s$b r9 = r9.x0(r2)
            q3.s$b r9 = r9.c0(r4)
            q3.s$b r9 = r9.o0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            q3.s$b r9 = r9.f0(r1)
            q3.s r9 = r9.M()
            byte r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0098
            double[] r2 = f56342q
            int r4 = r2.length
            if (r1 >= r4) goto L_0x0098
            r1 = r2[r1]
            int r8 = r8.f56362c
            int r8 = r8 + 9
            byte r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L_0x0090
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L_0x0090:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L_0x009a
        L_0x0098:
            r0 = 0
        L_0x009a:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.C8789n.b(t4.n$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(t3.B r21) {
        /*
            r20 = this;
            r0 = r20
            N3.O r1 = r0.f56344b
            t3.C5950a.i(r1)
            int r1 = r21.f()
            int r2 = r21.g()
            byte[] r3 = r21.e()
            long r4 = r0.f56350h
            int r6 = r21.a()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f56350h = r4
            N3.O r4 = r0.f56344b
            int r5 = r21.a()
            r6 = r21
            r4.a(r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f56348f
            int r4 = u3.e.e(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.f56352j
            if (r4 != 0) goto L_0x0039
            t4.n$a r4 = r0.f56349g
            r4.a(r3, r1, r2)
        L_0x0039:
            t4.w r4 = r0.f56347e
            if (r4 == 0) goto L_0x0040
            r4.a(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            byte[] r5 = r21.e()
            int r7 = r4 + 3
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f56352j
            r10 = 0
            r11 = 1
            if (r9 != 0) goto L_0x008a
            if (r8 <= 0) goto L_0x005a
            t4.n$a r9 = r0.f56349g
            r9.a(r3, r1, r4)
        L_0x005a:
            if (r8 >= 0) goto L_0x005e
            int r9 = -r8
            goto L_0x005f
        L_0x005e:
            r9 = r10
        L_0x005f:
            t4.n$a r12 = r0.f56349g
            boolean r9 = r12.b(r5, r9)
            if (r9 == 0) goto L_0x008a
            t4.n$a r9 = r0.f56349g
            java.lang.String r12 = r0.f56343a
            java.lang.Object r12 = t3.C5950a.e(r12)
            java.lang.String r12 = (java.lang.String) r12
            android.util.Pair r9 = b(r9, r12)
            N3.O r12 = r0.f56344b
            java.lang.Object r13 = r9.first
            q3.s r13 = (q3.C5807s) r13
            r12.e(r13)
            java.lang.Object r9 = r9.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            r0.f56353k = r12
            r0.f56352j = r11
        L_0x008a:
            t4.w r9 = r0.f56347e
            if (r9 == 0) goto L_0x00d9
            if (r8 <= 0) goto L_0x0095
            r9.a(r3, r1, r4)
            r1 = r10
            goto L_0x0096
        L_0x0095:
            int r1 = -r8
        L_0x0096:
            t4.w r8 = r0.f56347e
            boolean r1 = r8.b(r1)
            if (r1 == 0) goto L_0x00c6
            t4.w r1 = r0.f56347e
            byte[] r8 = r1.f56539d
            int r1 = r1.f56540e
            int r1 = u3.e.I(r8, r1)
            t3.B r8 = r0.f56346d
            java.lang.Object r8 = t3.N.i(r8)
            t3.B r8 = (t3.B) r8
            t4.w r9 = r0.f56347e
            byte[] r9 = r9.f56539d
            r8.U(r9, r1)
            t4.N r1 = r0.f56345c
            java.lang.Object r1 = t3.N.i(r1)
            t4.N r1 = (t4.N) r1
            long r8 = r0.f56356n
            t3.B r12 = r0.f56346d
            r1.a(r8, r12)
        L_0x00c6:
            r1 = 178(0xb2, float:2.5E-43)
            if (r5 != r1) goto L_0x00d9
            byte[] r1 = r21.e()
            int r8 = r4 + 2
            byte r1 = r1[r8]
            if (r1 != r11) goto L_0x00d9
            t4.w r1 = r0.f56347e
            r1.e(r5)
        L_0x00d9:
            if (r5 == 0) goto L_0x00e7
            r1 = 179(0xb3, float:2.51E-43)
            if (r5 != r1) goto L_0x00e0
            goto L_0x00e7
        L_0x00e0:
            r1 = 184(0xb8, float:2.58E-43)
            if (r5 != r1) goto L_0x0145
            r0.f56357o = r11
            goto L_0x0145
        L_0x00e7:
            int r1 = r2 - r4
            boolean r4 = r0.f56358p
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0112
            boolean r4 = r0.f56352j
            if (r4 == 0) goto L_0x0112
            long r13 = r0.f56356n
            int r4 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0112
            boolean r15 = r0.f56357o
            long r11 = r0.f56350h
            r19 = r5
            long r4 = r0.f56355m
            long r11 = r11 - r4
            int r4 = (int) r11
            int r16 = r4 - r1
            N3.O r12 = r0.f56344b
            r18 = 0
            r17 = r1
            r12.c(r13, r15, r16, r17, r18)
            goto L_0x0114
        L_0x0112:
            r19 = r5
        L_0x0114:
            boolean r4 = r0.f56351i
            if (r4 == 0) goto L_0x011f
            boolean r4 = r0.f56358p
            if (r4 == 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r1 = 1
            goto L_0x0140
        L_0x011f:
            long r4 = r0.f56350h
            long r11 = (long) r1
            long r4 = r4 - r11
            r0.f56355m = r4
            long r4 = r0.f56354l
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x012c
            goto L_0x0137
        L_0x012c:
            long r4 = r0.f56356n
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0136
            long r11 = r0.f56353k
            long r4 = r4 + r11
            goto L_0x0137
        L_0x0136:
            r4 = r8
        L_0x0137:
            r0.f56356n = r4
            r0.f56357o = r10
            r0.f56354l = r8
            r1 = 1
            r0.f56351i = r1
        L_0x0140:
            if (r19 != 0) goto L_0x0143
            r10 = r1
        L_0x0143:
            r0.f56358p = r10
        L_0x0145:
            r1 = r7
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.C8789n.a(t3.B):void");
    }

    public void c() {
        e.c(this.f56348f);
        this.f56349g.c();
        w wVar = this.f56347e;
        if (wVar != null) {
            wVar.d();
        }
        this.f56350h = 0;
        this.f56351i = false;
        this.f56354l = -9223372036854775807L;
        this.f56356n = -9223372036854775807L;
    }

    public void d(r rVar, L.d dVar) {
        dVar.a();
        this.f56343a = dVar.b();
        this.f56344b = rVar.t(dVar.c(), 2);
        N n10 = this.f56345c;
        if (n10 != null) {
            n10.b(rVar, dVar);
        }
    }

    public void e(boolean z10) {
        C5950a.i(this.f56344b);
        if (z10) {
            boolean z11 = this.f56357o;
            this.f56344b.c(this.f56356n, z11 ? 1 : 0, (int) (this.f56350h - this.f56355m), 0, (O.a) null);
        }
    }

    public void f(long j10, int i10) {
        this.f56354l = j10;
    }

    C8789n(N n10) {
        this.f56345c = n10;
        this.f56348f = new boolean[4];
        this.f56349g = new a(128);
        if (n10 != null) {
            this.f56347e = new w(178, 128);
            this.f56346d = new B();
        } else {
            this.f56347e = null;
            this.f56346d = null;
        }
        this.f56354l = -9223372036854775807L;
        this.f56356n = -9223372036854775807L;
    }
}
