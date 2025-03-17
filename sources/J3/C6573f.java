package J3;

import J3.C6569b;
import java.util.Arrays;
import t3.C5950a;
import t3.N;

/* renamed from: J3.f  reason: case insensitive filesystem */
public final class C6573f implements C6569b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37260a;

    /* renamed from: b  reason: collision with root package name */
    private final int f37261b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f37262c;

    /* renamed from: d  reason: collision with root package name */
    private int f37263d;

    /* renamed from: e  reason: collision with root package name */
    private int f37264e;

    /* renamed from: f  reason: collision with root package name */
    private int f37265f;

    /* renamed from: g  reason: collision with root package name */
    private C6568a[] f37266g;

    public C6573f(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public synchronized void a(C6569b.a aVar) {
        while (aVar != null) {
            try {
                C6568a[] aVarArr = this.f37266g;
                int i10 = this.f37265f;
                this.f37265f = i10 + 1;
                aVarArr[i10] = aVar.a();
                this.f37264e--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        notifyAll();
    }

    public synchronized C6568a b() {
        C6568a aVar;
        try {
            this.f37264e++;
            int i10 = this.f37265f;
            if (i10 > 0) {
                C6568a[] aVarArr = this.f37266g;
                int i11 = i10 - 1;
                this.f37265f = i11;
                aVar = (C6568a) C5950a.e(aVarArr[i11]);
                this.f37266g[this.f37265f] = null;
            } else {
                aVar = new C6568a(new byte[this.f37261b], 0);
                int i12 = this.f37264e;
                C6568a[] aVarArr2 = this.f37266g;
                if (i12 > aVarArr2.length) {
                    this.f37266g = (C6568a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return aVar;
    }

    public synchronized void c(C6568a aVar) {
        C6568a[] aVarArr = this.f37266g;
        int i10 = this.f37265f;
        this.f37265f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f37264e--;
        notifyAll();
    }

    public synchronized void d() {
        try {
            int i10 = 0;
            int max = Math.max(0, N.k(this.f37263d, this.f37261b) - this.f37264e);
            int i11 = this.f37265f;
            if (max < i11) {
                if (this.f37262c != null) {
                    int i12 = i11 - 1;
                    while (i10 <= i12) {
                        C6568a aVar = (C6568a) C5950a.e(this.f37266g[i10]);
                        if (aVar.f37250a == this.f37262c) {
                            i10++;
                        } else {
                            C6568a aVar2 = (C6568a) C5950a.e(this.f37266g[i12]);
                            if (aVar2.f37250a != this.f37262c) {
                                i12--;
                            } else {
                                C6568a[] aVarArr = this.f37266g;
                                aVarArr[i10] = aVar2;
                                aVarArr[i12] = aVar;
                                i12--;
                                i10++;
                            }
                        }
                    }
                    max = Math.max(max, i10);
                    if (max >= this.f37265f) {
                        return;
                    }
                }
                Arrays.fill(this.f37266g, max, this.f37265f, (Object) null);
                this.f37265f = max;
            }
        } finally {
            while (true) {
            }
        }
    }

    public int e() {
        return this.f37261b;
    }

    public synchronized int f() {
        return this.f37264e * this.f37261b;
    }

    public synchronized void g() {
        if (this.f37260a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f37263d;
        this.f37263d = i10;
        if (z10) {
            d();
        }
    }

    public C6573f(boolean z10, int i10, int i11) {
        boolean z11 = true;
        C5950a.a(i10 > 0);
        C5950a.a(i11 < 0 ? false : z11);
        this.f37260a = z10;
        this.f37261b = i10;
        this.f37265f = i11;
        this.f37266g = new C6568a[(i11 + 100)];
        if (i11 > 0) {
            this.f37262c = new byte[(i11 * i10)];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f37266g[i12] = new C6568a(this.f37262c, i12 * i10);
            }
            return;
        }
        this.f37262c = null;
    }
}
