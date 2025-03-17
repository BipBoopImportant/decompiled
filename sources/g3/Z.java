package G3;

import C3.C6422m;
import C3.t;
import C3.u;
import J3.C6569b;
import N3.O;
import com.sugarcube.app.base.data.source.CatalogRepository;
import q3.A;
import q3.C5799j;
import q3.C5803n;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t3.N;
import y3.f;
import z3.D;

public class Z implements O {

    /* renamed from: A  reason: collision with root package name */
    private C5807s f35783A;

    /* renamed from: B  reason: collision with root package name */
    private C5807s f35784B;

    /* renamed from: C  reason: collision with root package name */
    private long f35785C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f35786D = true;

    /* renamed from: E  reason: collision with root package name */
    private boolean f35787E;

    /* renamed from: F  reason: collision with root package name */
    private long f35788F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f35789G;

    /* renamed from: a  reason: collision with root package name */
    private final X f35790a;

    /* renamed from: b  reason: collision with root package name */
    private final b f35791b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final g0<c> f35792c = new g0<>(new Y());

    /* renamed from: d  reason: collision with root package name */
    private final u f35793d;

    /* renamed from: e  reason: collision with root package name */
    private final t.a f35794e;

    /* renamed from: f  reason: collision with root package name */
    private d f35795f;

    /* renamed from: g  reason: collision with root package name */
    private C5807s f35796g;

    /* renamed from: h  reason: collision with root package name */
    private C6422m f35797h;

    /* renamed from: i  reason: collision with root package name */
    private int f35798i = 1000;

    /* renamed from: j  reason: collision with root package name */
    private long[] f35799j = new long[1000];

    /* renamed from: k  reason: collision with root package name */
    private long[] f35800k = new long[1000];

    /* renamed from: l  reason: collision with root package name */
    private int[] f35801l = new int[1000];

    /* renamed from: m  reason: collision with root package name */
    private int[] f35802m = new int[1000];

    /* renamed from: n  reason: collision with root package name */
    private long[] f35803n = new long[1000];

    /* renamed from: o  reason: collision with root package name */
    private O.a[] f35804o = new O.a[1000];

    /* renamed from: p  reason: collision with root package name */
    private int f35805p;

    /* renamed from: q  reason: collision with root package name */
    private int f35806q;

    /* renamed from: r  reason: collision with root package name */
    private int f35807r;

    /* renamed from: s  reason: collision with root package name */
    private int f35808s;

    /* renamed from: t  reason: collision with root package name */
    private long f35809t = Long.MIN_VALUE;

    /* renamed from: u  reason: collision with root package name */
    private long f35810u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    private long f35811v = Long.MIN_VALUE;

    /* renamed from: w  reason: collision with root package name */
    private boolean f35812w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f35813x = true;

    /* renamed from: y  reason: collision with root package name */
    private boolean f35814y = true;

    /* renamed from: z  reason: collision with root package name */
    private boolean f35815z;

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f35816a;

        /* renamed from: b  reason: collision with root package name */
        public long f35817b;

        /* renamed from: c  reason: collision with root package name */
        public O.a f35818c;

        b() {
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final C5807s f35819a;

        /* renamed from: b  reason: collision with root package name */
        public final u.b f35820b;

        private c(C5807s sVar, u.b bVar) {
            this.f35819a = sVar;
            this.f35820b = bVar;
        }
    }

    public interface d {
        void f(C5807s sVar);
    }

    protected Z(C6569b bVar, u uVar, t.a aVar) {
        this.f35793d = uVar;
        this.f35794e = aVar;
        this.f35790a = new X(bVar);
    }

    private boolean D() {
        return this.f35808s != this.f35805p;
    }

    private boolean H(int i10) {
        C6422m mVar = this.f35797h;
        return mVar == null || mVar.getState() == 4 || ((this.f35802m[i10] & CatalogRepository.FETCH_FLAG_SDB) == 0 && this.f35797h.d());
    }

    private void J(C5807s sVar, D d10) {
        C5807s sVar2 = this.f35796g;
        boolean z10 = sVar2 == null;
        C5803n nVar = sVar2 == null ? null : sVar2.f28248s;
        this.f35796g = sVar;
        C5803n nVar2 = sVar.f28248s;
        u uVar = this.f35793d;
        d10.f32383b = uVar != null ? sVar.c(uVar.g(sVar)) : sVar;
        d10.f32382a = this.f35797h;
        if (this.f35793d != null) {
            if (z10 || !N.d(nVar, nVar2)) {
                C6422m mVar = this.f35797h;
                C6422m e10 = this.f35793d.e(this.f35794e, sVar);
                this.f35797h = e10;
                d10.f32382a = e10;
                if (mVar != null) {
                    mVar.c(this.f35794e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int K(z3.D r6, y3.f r7, boolean r8, boolean r9, G3.Z.b r10) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r7.f32280e = r0     // Catch:{ all -> 0x001f }
            boolean r0 = r5.D()     // Catch:{ all -> 0x001f }
            r1 = -4
            r2 = -3
            r3 = -5
            if (r0 != 0) goto L_0x0039
            if (r9 != 0) goto L_0x002f
            boolean r9 = r5.f35812w     // Catch:{ all -> 0x001f }
            if (r9 == 0) goto L_0x0014
            goto L_0x002f
        L_0x0014:
            q3.s r7 = r5.f35784B     // Catch:{ all -> 0x001f }
            if (r7 == 0) goto L_0x002d
            if (r8 != 0) goto L_0x0022
            q3.s r8 = r5.f35796g     // Catch:{ all -> 0x001f }
            if (r7 == r8) goto L_0x002d
            goto L_0x0022
        L_0x001f:
            r6 = move-exception
            goto L_0x0097
        L_0x0022:
            java.lang.Object r7 = t3.C5950a.e(r7)     // Catch:{ all -> 0x001f }
            q3.s r7 = (q3.C5807s) r7     // Catch:{ all -> 0x001f }
            r5.J(r7, r6)     // Catch:{ all -> 0x001f }
            monitor-exit(r5)
            return r3
        L_0x002d:
            monitor-exit(r5)
            return r2
        L_0x002f:
            r6 = 4
            r7.I(r6)     // Catch:{ all -> 0x001f }
            r8 = -9223372036854775808
            r7.f32281f = r8     // Catch:{ all -> 0x001f }
            monitor-exit(r5)
            return r1
        L_0x0039:
            G3.g0<G3.Z$c> r0 = r5.f35792c     // Catch:{ all -> 0x001f }
            int r4 = r5.y()     // Catch:{ all -> 0x001f }
            java.lang.Object r0 = r0.e(r4)     // Catch:{ all -> 0x001f }
            G3.Z$c r0 = (G3.Z.c) r0     // Catch:{ all -> 0x001f }
            q3.s r0 = r0.f35819a     // Catch:{ all -> 0x001f }
            if (r8 != 0) goto L_0x0092
            q3.s r8 = r5.f35796g     // Catch:{ all -> 0x001f }
            if (r0 == r8) goto L_0x004e
            goto L_0x0092
        L_0x004e:
            int r6 = r5.f35808s     // Catch:{ all -> 0x001f }
            int r6 = r5.z(r6)     // Catch:{ all -> 0x001f }
            boolean r8 = r5.H(r6)     // Catch:{ all -> 0x001f }
            r0 = 1
            if (r8 != 0) goto L_0x005f
            r7.f32280e = r0     // Catch:{ all -> 0x001f }
            monitor-exit(r5)
            return r2
        L_0x005f:
            int[] r8 = r5.f35802m     // Catch:{ all -> 0x001f }
            r8 = r8[r6]     // Catch:{ all -> 0x001f }
            r7.I(r8)     // Catch:{ all -> 0x001f }
            int r8 = r5.f35808s     // Catch:{ all -> 0x001f }
            int r2 = r5.f35805p     // Catch:{ all -> 0x001f }
            int r2 = r2 - r0
            if (r8 != r2) goto L_0x0078
            if (r9 != 0) goto L_0x0073
            boolean r8 = r5.f35812w     // Catch:{ all -> 0x001f }
            if (r8 == 0) goto L_0x0078
        L_0x0073:
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            r7.n(r8)     // Catch:{ all -> 0x001f }
        L_0x0078:
            long[] r8 = r5.f35803n     // Catch:{ all -> 0x001f }
            r2 = r8[r6]     // Catch:{ all -> 0x001f }
            r7.f32281f = r2     // Catch:{ all -> 0x001f }
            int[] r7 = r5.f35801l     // Catch:{ all -> 0x001f }
            r7 = r7[r6]     // Catch:{ all -> 0x001f }
            r10.f35816a = r7     // Catch:{ all -> 0x001f }
            long[] r7 = r5.f35800k     // Catch:{ all -> 0x001f }
            r8 = r7[r6]     // Catch:{ all -> 0x001f }
            r10.f35817b = r8     // Catch:{ all -> 0x001f }
            N3.O$a[] r7 = r5.f35804o     // Catch:{ all -> 0x001f }
            r6 = r7[r6]     // Catch:{ all -> 0x001f }
            r10.f35818c = r6     // Catch:{ all -> 0x001f }
            monitor-exit(r5)
            return r1
        L_0x0092:
            r5.J(r0, r6)     // Catch:{ all -> 0x001f }
            monitor-exit(r5)
            return r3
        L_0x0097:
            monitor-exit(r5)     // Catch:{ all -> 0x001f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.Z.K(z3.D, y3.f, boolean, boolean, G3.Z$b):int");
    }

    private void O() {
        C6422m mVar = this.f35797h;
        if (mVar != null) {
            mVar.c(this.f35794e);
            this.f35797h = null;
            this.f35796g = null;
        }
    }

    private synchronized void R() {
        this.f35808s = 0;
        this.f35790a.n();
    }

    private synchronized boolean V(C5807s sVar) {
        try {
            this.f35814y = false;
            if (N.d(sVar, this.f35784B)) {
                return false;
            }
            if (this.f35792c.g() || !this.f35792c.f().f35819a.equals(sVar)) {
                this.f35784B = sVar;
            } else {
                this.f35784B = this.f35792c.f().f35819a;
            }
            boolean z10 = this.f35786D;
            C5807s sVar2 = this.f35784B;
            this.f35786D = z10 & A.a(sVar2.f28244o, sVar2.f28240k);
            this.f35787E = false;
            return true;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean h(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f35805p     // Catch:{ all -> 0x0010 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0012
            long r3 = r5.f35810u     // Catch:{ all -> 0x0010 }
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x000e
            r1 = r2
        L_0x000e:
            monitor-exit(r5)
            return r1
        L_0x0010:
            r6 = move-exception
            goto L_0x0028
        L_0x0012:
            long r3 = r5.w()     // Catch:{ all -> 0x0010 }
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x001c
            monitor-exit(r5)
            return r1
        L_0x001c:
            int r6 = r5.j(r6)     // Catch:{ all -> 0x0010 }
            int r7 = r5.f35806q     // Catch:{ all -> 0x0010 }
            int r7 = r7 + r6
            r5.q(r7)     // Catch:{ all -> 0x0010 }
            monitor-exit(r5)
            return r2
        L_0x0028:
            monitor-exit(r5)     // Catch:{ all -> 0x0010 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.Z.h(long):boolean");
    }

    private synchronized void i(long j10, int i10, long j11, int i11, O.a aVar) {
        try {
            int i12 = this.f35805p;
            if (i12 > 0) {
                int z10 = z(i12 - 1);
                C5950a.a(this.f35800k[z10] + ((long) this.f35801l[z10]) <= j11);
            }
            this.f35812w = (536870912 & i10) != 0;
            this.f35811v = Math.max(this.f35811v, j10);
            int z11 = z(this.f35805p);
            this.f35803n[z11] = j10;
            this.f35800k[z11] = j11;
            this.f35801l[z11] = i11;
            this.f35802m[z11] = i10;
            this.f35804o[z11] = aVar;
            this.f35799j[z11] = this.f35785C;
            if (this.f35792c.g() || !this.f35792c.f().f35819a.equals(this.f35784B)) {
                C5807s sVar = (C5807s) C5950a.e(this.f35784B);
                u uVar = this.f35793d;
                this.f35792c.a(C(), new c(sVar, uVar != null ? uVar.f(this.f35794e, sVar) : u.b.f33683a));
            }
            int i13 = this.f35805p + 1;
            this.f35805p = i13;
            int i14 = this.f35798i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                O.a[] aVarArr = new O.a[i15];
                int i16 = this.f35807r;
                int i17 = i14 - i16;
                System.arraycopy(this.f35800k, i16, jArr2, 0, i17);
                System.arraycopy(this.f35803n, this.f35807r, jArr3, 0, i17);
                System.arraycopy(this.f35802m, this.f35807r, iArr, 0, i17);
                System.arraycopy(this.f35801l, this.f35807r, iArr2, 0, i17);
                System.arraycopy(this.f35804o, this.f35807r, aVarArr, 0, i17);
                System.arraycopy(this.f35799j, this.f35807r, jArr, 0, i17);
                int i18 = this.f35807r;
                System.arraycopy(this.f35800k, 0, jArr2, i17, i18);
                System.arraycopy(this.f35803n, 0, jArr3, i17, i18);
                System.arraycopy(this.f35802m, 0, iArr, i17, i18);
                System.arraycopy(this.f35801l, 0, iArr2, i17, i18);
                System.arraycopy(this.f35804o, 0, aVarArr, i17, i18);
                System.arraycopy(this.f35799j, 0, jArr, i17, i18);
                this.f35800k = jArr2;
                this.f35803n = jArr3;
                this.f35802m = iArr;
                this.f35801l = iArr2;
                this.f35804o = aVarArr;
                this.f35799j = jArr;
                this.f35807r = 0;
                this.f35798i = i15;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    private int j(long j10) {
        int i10 = this.f35805p;
        int z10 = z(i10 - 1);
        while (i10 > this.f35808s && this.f35803n[z10] >= j10) {
            i10--;
            z10--;
            if (z10 == -1) {
                z10 = this.f35798i - 1;
            }
        }
        return i10;
    }

    public static Z k(C6569b bVar, u uVar, t.a aVar) {
        return new Z(bVar, (u) C5950a.e(uVar), (t.a) C5950a.e(aVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long l(long r11, boolean r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.f35805p     // Catch:{ all -> 0x001c }
            r1 = -1
            if (r0 == 0) goto L_0x0030
            long[] r3 = r10.f35803n     // Catch:{ all -> 0x001c }
            int r5 = r10.f35807r     // Catch:{ all -> 0x001c }
            r6 = r3[r5]     // Catch:{ all -> 0x001c }
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0012
            goto L_0x0030
        L_0x0012:
            if (r14 == 0) goto L_0x001a
            int r14 = r10.f35808s     // Catch:{ all -> 0x001c }
            if (r14 == r0) goto L_0x001a
            int r0 = r14 + 1
        L_0x001a:
            r6 = r0
            goto L_0x001e
        L_0x001c:
            r11 = move-exception
            goto L_0x0032
        L_0x001e:
            r4 = r10
            r7 = r11
            r9 = r13
            int r11 = r4.s(r5, r6, r7, r9)     // Catch:{ all -> 0x001c }
            r12 = -1
            if (r11 != r12) goto L_0x002a
            monitor-exit(r10)
            return r1
        L_0x002a:
            long r11 = r10.n(r11)     // Catch:{ all -> 0x001c }
            monitor-exit(r10)
            return r11
        L_0x0030:
            monitor-exit(r10)
            return r1
        L_0x0032:
            monitor-exit(r10)     // Catch:{ all -> 0x001c }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.Z.l(long, boolean, boolean):long");
    }

    private synchronized long m() {
        int i10 = this.f35805p;
        if (i10 == 0) {
            return -1;
        }
        return n(i10);
    }

    private long n(int i10) {
        this.f35810u = Math.max(this.f35810u, x(i10));
        this.f35805p -= i10;
        int i11 = this.f35806q + i10;
        this.f35806q = i11;
        int i12 = this.f35807r + i10;
        this.f35807r = i12;
        int i13 = this.f35798i;
        if (i12 >= i13) {
            this.f35807r = i12 - i13;
        }
        int i14 = this.f35808s - i10;
        this.f35808s = i14;
        if (i14 < 0) {
            this.f35808s = 0;
        }
        this.f35792c.d(i11);
        if (this.f35805p != 0) {
            return this.f35800k[this.f35807r];
        }
        int i15 = this.f35807r;
        if (i15 == 0) {
            i15 = this.f35798i;
        }
        int i16 = i15 - 1;
        return this.f35800k[i16] + ((long) this.f35801l[i16]);
    }

    private long q(int i10) {
        int C10 = C() - i10;
        boolean z10 = false;
        C5950a.a(C10 >= 0 && C10 <= this.f35805p - this.f35808s);
        int i11 = this.f35805p - C10;
        this.f35805p = i11;
        this.f35811v = Math.max(this.f35810u, x(i11));
        if (C10 == 0 && this.f35812w) {
            z10 = true;
        }
        this.f35812w = z10;
        this.f35792c.c(i10);
        int i12 = this.f35805p;
        if (i12 == 0) {
            return 0;
        }
        int z11 = z(i12 - 1);
        return this.f35800k[z11] + ((long) this.f35801l[z11]);
    }

    private int r(int i10, int i11, long j10, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f35803n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f35798i) {
                i10 = 0;
            }
        }
        if (z10) {
            return i11;
        }
        return -1;
    }

    private int s(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f35803n[i10];
            if (j11 > j10) {
                return i12;
            }
            if (!z10 || (this.f35802m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f35798i) {
                i10 = 0;
            }
        }
        return i12;
    }

    private long x(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int z10 = z(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f35803n[z10]);
            if ((this.f35802m[z10] & 1) != 0) {
                break;
            }
            z10--;
            if (z10 == -1) {
                z10 = this.f35798i - 1;
            }
        }
        return j10;
    }

    private int z(int i10) {
        int i11 = this.f35807r + i10;
        int i12 = this.f35798i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int A(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f35808s     // Catch:{ all -> 0x0026 }
            int r2 = r8.z(r0)     // Catch:{ all -> 0x0026 }
            boolean r0 = r8.D()     // Catch:{ all -> 0x0026 }
            r7 = 0
            if (r0 == 0) goto L_0x003c
            long[] r0 = r8.f35803n     // Catch:{ all -> 0x0026 }
            r3 = r0[r2]     // Catch:{ all -> 0x0026 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003c
        L_0x0017:
            long r0 = r8.f35811v     // Catch:{ all -> 0x0026 }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            if (r11 == 0) goto L_0x0028
            int r9 = r8.f35805p     // Catch:{ all -> 0x0026 }
            int r10 = r8.f35808s     // Catch:{ all -> 0x0026 }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0026:
            r9 = move-exception
            goto L_0x003e
        L_0x0028:
            int r11 = r8.f35805p     // Catch:{ all -> 0x0026 }
            int r0 = r8.f35808s     // Catch:{ all -> 0x0026 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.s(r2, r3, r4, r6)     // Catch:{ all -> 0x0026 }
            r10 = -1
            if (r9 != r10) goto L_0x003a
            monitor-exit(r8)
            return r7
        L_0x003a:
            monitor-exit(r8)
            return r9
        L_0x003c:
            monitor-exit(r8)
            return r7
        L_0x003e:
            monitor-exit(r8)     // Catch:{ all -> 0x0026 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.Z.A(long, boolean):int");
    }

    public final synchronized C5807s B() {
        return this.f35814y ? null : this.f35784B;
    }

    public final int C() {
        return this.f35806q + this.f35805p;
    }

    public final synchronized boolean E() {
        return this.f35812w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean F(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.D()     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r0 != 0) goto L_0x001c
            if (r3 != 0) goto L_0x001a
            boolean r3 = r2.f35812w     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x001a
            q3.s r3 = r2.f35784B     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0019
            q3.s r0 = r2.f35796g     // Catch:{ all -> 0x0017 }
            if (r3 == r0) goto L_0x0019
            goto L_0x001a
        L_0x0017:
            r3 = move-exception
            goto L_0x003c
        L_0x0019:
            r1 = 0
        L_0x001a:
            monitor-exit(r2)
            return r1
        L_0x001c:
            G3.g0<G3.Z$c> r3 = r2.f35792c     // Catch:{ all -> 0x0017 }
            int r0 = r2.y()     // Catch:{ all -> 0x0017 }
            java.lang.Object r3 = r3.e(r0)     // Catch:{ all -> 0x0017 }
            G3.Z$c r3 = (G3.Z.c) r3     // Catch:{ all -> 0x0017 }
            q3.s r3 = r3.f35819a     // Catch:{ all -> 0x0017 }
            q3.s r0 = r2.f35796g     // Catch:{ all -> 0x0017 }
            if (r3 == r0) goto L_0x0030
            monitor-exit(r2)
            return r1
        L_0x0030:
            int r3 = r2.f35808s     // Catch:{ all -> 0x0017 }
            int r3 = r2.z(r3)     // Catch:{ all -> 0x0017 }
            boolean r3 = r2.H(r3)     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return r3
        L_0x003c:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.Z.F(boolean):boolean");
    }

    public void I() {
        C6422m mVar = this.f35797h;
        if (mVar != null && mVar.getState() == 1) {
            throw ((C6422m.a) C5950a.e(this.f35797h.f()));
        }
    }

    public void L() {
        p();
        O();
    }

    public int M(D d10, f fVar, int i10, boolean z10) {
        boolean z11 = false;
        int K10 = K(d10, fVar, (i10 & 2) != 0, z10, this.f35791b);
        if (K10 == -4 && !fVar.D()) {
            if ((i10 & 1) != 0) {
                z11 = true;
            }
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f35790a.e(fVar, this.f35791b);
                } else {
                    this.f35790a.l(fVar, this.f35791b);
                }
            }
            if (!z11) {
                this.f35808s++;
            }
        }
        return K10;
    }

    public void N() {
        Q(true);
        O();
    }

    public final void P() {
        Q(false);
    }

    public void Q(boolean z10) {
        this.f35790a.m();
        this.f35805p = 0;
        this.f35806q = 0;
        this.f35807r = 0;
        this.f35808s = 0;
        this.f35813x = true;
        this.f35809t = Long.MIN_VALUE;
        this.f35810u = Long.MIN_VALUE;
        this.f35811v = Long.MIN_VALUE;
        this.f35812w = false;
        this.f35792c.b();
        if (z10) {
            this.f35783A = null;
            this.f35784B = null;
            this.f35814y = true;
            this.f35786D = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean S(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.R()     // Catch:{ all -> 0x0018 }
            int r0 = r3.f35806q     // Catch:{ all -> 0x0018 }
            if (r4 < r0) goto L_0x001a
            int r1 = r3.f35805p     // Catch:{ all -> 0x0018 }
            int r1 = r1 + r0
            if (r4 <= r1) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            r1 = -9223372036854775808
            r3.f35809t = r1     // Catch:{ all -> 0x0018 }
            int r4 = r4 - r0
            r3.f35808s = r4     // Catch:{ all -> 0x0018 }
            monitor-exit(r3)
            r4 = 1
            return r4
        L_0x0018:
            r4 = move-exception
            goto L_0x001d
        L_0x001a:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x001d:
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.Z.S(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean T(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.R()     // Catch:{ all -> 0x0034 }
            int r0 = r8.f35808s     // Catch:{ all -> 0x0034 }
            int r2 = r8.z(r0)     // Catch:{ all -> 0x0034 }
            boolean r0 = r8.D()     // Catch:{ all -> 0x0034 }
            r7 = 0
            if (r0 == 0) goto L_0x0052
            long[] r0 = r8.f35803n     // Catch:{ all -> 0x0034 }
            r3 = r0[r2]     // Catch:{ all -> 0x0034 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0052
            long r0 = r8.f35811v     // Catch:{ all -> 0x0034 }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            if (r11 != 0) goto L_0x0022
            goto L_0x0052
        L_0x0022:
            boolean r0 = r8.f35786D     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0036
            int r0 = r8.f35805p     // Catch:{ all -> 0x0034 }
            int r1 = r8.f35808s     // Catch:{ all -> 0x0034 }
            int r3 = r0 - r1
            r1 = r8
            r4 = r9
            r6 = r11
            int r11 = r1.r(r2, r3, r4, r6)     // Catch:{ all -> 0x0034 }
            goto L_0x0043
        L_0x0034:
            r9 = move-exception
            goto L_0x0054
        L_0x0036:
            int r11 = r8.f35805p     // Catch:{ all -> 0x0034 }
            int r0 = r8.f35808s     // Catch:{ all -> 0x0034 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.s(r2, r3, r4, r6)     // Catch:{ all -> 0x0034 }
        L_0x0043:
            r0 = -1
            if (r11 != r0) goto L_0x0048
            monitor-exit(r8)
            return r7
        L_0x0048:
            r8.f35809t = r9     // Catch:{ all -> 0x0034 }
            int r9 = r8.f35808s     // Catch:{ all -> 0x0034 }
            int r9 = r9 + r11
            r8.f35808s = r9     // Catch:{ all -> 0x0034 }
            monitor-exit(r8)
            r9 = 1
            return r9
        L_0x0052:
            monitor-exit(r8)
            return r7
        L_0x0054:
            monitor-exit(r8)     // Catch:{ all -> 0x0034 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.Z.T(long, boolean):boolean");
    }

    public final void U(long j10) {
        this.f35809t = j10;
    }

    public final void W(d dVar) {
        this.f35795f = dVar;
    }

    public final synchronized void X(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f35808s + i10 <= this.f35805p) {
                    z10 = true;
                    C5950a.a(z10);
                    this.f35808s += i10;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        z10 = false;
        C5950a.a(z10);
        this.f35808s += i10;
    }

    public final void b(B b10, int i10, int i11) {
        this.f35790a.p(b10, i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(long r12, int r14, int r15, int r16, N3.O.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f35815z
            if (r0 == 0) goto L_0x0010
            q3.s r0 = r8.f35783A
            java.lang.Object r0 = t3.C5950a.i(r0)
            q3.s r0 = (q3.C5807s) r0
            r11.e(r0)
        L_0x0010:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            r3 = r2
            goto L_0x0019
        L_0x0018:
            r3 = r1
        L_0x0019:
            boolean r4 = r8.f35813x
            if (r4 == 0) goto L_0x0022
            if (r3 != 0) goto L_0x0020
            return
        L_0x0020:
            r8.f35813x = r1
        L_0x0022:
            long r4 = r8.f35788F
            long r4 = r4 + r12
            boolean r6 = r8.f35786D
            if (r6 == 0) goto L_0x0054
            long r6 = r8.f35809t
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0030
            return
        L_0x0030:
            if (r0 != 0) goto L_0x0054
            boolean r0 = r8.f35787E
            if (r0 != 0) goto L_0x0050
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            q3.s r6 = r8.f35784B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            t3.q.h(r6, r0)
            r8.f35787E = r2
        L_0x0050:
            r0 = r14 | 1
            r6 = r0
            goto L_0x0055
        L_0x0054:
            r6 = r14
        L_0x0055:
            boolean r0 = r8.f35789G
            if (r0 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0065
            boolean r0 = r11.h(r4)
            if (r0 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r8.f35789G = r1
            goto L_0x0066
        L_0x0065:
            return
        L_0x0066:
            G3.X r0 = r8.f35790a
            long r0 = r0.d()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.Z.c(long, int, int, int, N3.O$a):void");
    }

    public final void e(C5807s sVar) {
        C5807s t10 = t(sVar);
        this.f35815z = false;
        this.f35783A = sVar;
        boolean V10 = V(t10);
        d dVar = this.f35795f;
        if (dVar != null && V10) {
            dVar.f(t10);
        }
    }

    public final int f(C5799j jVar, int i10, boolean z10, int i11) {
        return this.f35790a.o(jVar, i10, z10);
    }

    public final void o(long j10, boolean z10, boolean z11) {
        this.f35790a.b(l(j10, z10, z11));
    }

    public final void p() {
        this.f35790a.b(m());
    }

    /* access modifiers changed from: protected */
    public C5807s t(C5807s sVar) {
        return (this.f35788F == 0 || sVar.f28249t == Long.MAX_VALUE) ? sVar : sVar.b().w0(sVar.f28249t + this.f35788F).M();
    }

    public final int u() {
        return this.f35806q;
    }

    public final synchronized long v() {
        return this.f35811v;
    }

    public final synchronized long w() {
        return Math.max(this.f35810u, x(this.f35808s));
    }

    public final int y() {
        return this.f35806q + this.f35808s;
    }
}
