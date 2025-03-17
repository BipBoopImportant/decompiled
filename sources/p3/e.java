package P3;

import N3.C6679q;
import N3.J;
import N3.K;
import N3.O;
import java.util.Arrays;
import t3.C5950a;
import t3.N;

final class e {

    /* renamed from: a  reason: collision with root package name */
    protected final O f39349a;

    /* renamed from: b  reason: collision with root package name */
    private final int f39350b;

    /* renamed from: c  reason: collision with root package name */
    private final int f39351c;

    /* renamed from: d  reason: collision with root package name */
    private final long f39352d;

    /* renamed from: e  reason: collision with root package name */
    private final int f39353e;

    /* renamed from: f  reason: collision with root package name */
    private int f39354f;

    /* renamed from: g  reason: collision with root package name */
    private int f39355g;

    /* renamed from: h  reason: collision with root package name */
    private int f39356h;

    /* renamed from: i  reason: collision with root package name */
    private int f39357i;

    /* renamed from: j  reason: collision with root package name */
    private int f39358j;

    /* renamed from: k  reason: collision with root package name */
    private long f39359k;

    /* renamed from: l  reason: collision with root package name */
    private long[] f39360l;

    /* renamed from: m  reason: collision with root package name */
    private int[] f39361m;

    public e(int i10, int i11, long j10, int i12, O o10) {
        boolean z10 = true;
        if (!(i11 == 1 || i11 == 2)) {
            z10 = false;
        }
        C5950a.a(z10);
        this.f39352d = j10;
        this.f39353e = i12;
        this.f39349a = o10;
        this.f39350b = d(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f39351c = i11 == 2 ? d(i10, 1650720768) : -1;
        this.f39359k = -1;
        this.f39360l = new long[512];
        this.f39361m = new int[512];
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f39352d * ((long) i10)) / ((long) this.f39353e);
    }

    private K h(int i10) {
        return new K(((long) this.f39361m[i10]) * g(), this.f39360l[i10]);
    }

    public void a() {
        this.f39356h++;
    }

    public void b(long j10, boolean z10) {
        if (this.f39359k == -1) {
            this.f39359k = j10;
        }
        if (z10) {
            if (this.f39358j == this.f39361m.length) {
                long[] jArr = this.f39360l;
                this.f39360l = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f39361m;
                this.f39361m = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f39360l;
            int i10 = this.f39358j;
            jArr2[i10] = j10;
            this.f39361m[i10] = this.f39357i;
            this.f39358j = i10 + 1;
        }
        this.f39357i++;
    }

    public void c() {
        this.f39360l = Arrays.copyOf(this.f39360l, this.f39358j);
        this.f39361m = Arrays.copyOf(this.f39361m, this.f39358j);
    }

    public long f() {
        return e(this.f39356h);
    }

    public long g() {
        return e(1);
    }

    public J.a i(long j10) {
        if (this.f39358j == 0) {
            return new J.a(new K(0, this.f39359k));
        }
        int g10 = (int) (j10 / g());
        int g11 = N.g(this.f39361m, g10, true, true);
        if (this.f39361m[g11] == g10) {
            return new J.a(h(g11));
        }
        K h10 = h(g11);
        int i10 = g11 + 1;
        return i10 < this.f39360l.length ? new J.a(h10, h(i10)) : new J.a(h10);
    }

    public boolean j(int i10) {
        return this.f39350b == i10 || this.f39351c == i10;
    }

    public boolean k() {
        return Arrays.binarySearch(this.f39361m, this.f39356h) >= 0;
    }

    public boolean l(C6679q qVar) {
        int i10 = this.f39355g;
        boolean z10 = false;
        int d10 = i10 - this.f39349a.d(qVar, i10, false);
        this.f39355g = d10;
        if (d10 == 0) {
            z10 = true;
        }
        if (z10) {
            if (this.f39354f > 0) {
                O o10 = this.f39349a;
                long f10 = f();
                boolean k10 = k();
                o10.c(f10, k10 ? 1 : 0, this.f39354f, 0, (O.a) null);
            }
            a();
        }
        return z10;
    }

    public void m(int i10) {
        this.f39354f = i10;
        this.f39355g = i10;
    }

    public void n(long j10) {
        if (this.f39358j == 0) {
            this.f39356h = 0;
            return;
        }
        this.f39356h = this.f39361m[N.h(this.f39360l, j10, true, true)];
    }
}
