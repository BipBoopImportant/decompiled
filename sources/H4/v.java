package h4;

import t3.C5950a;
import t3.N;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final s f51627a;

    /* renamed from: b  reason: collision with root package name */
    public final int f51628b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f51629c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f51630d;

    /* renamed from: e  reason: collision with root package name */
    public final int f51631e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f51632f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f51633g;

    /* renamed from: h  reason: collision with root package name */
    public final long f51634h;

    public v(s sVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10 = false;
        C5950a.a(iArr.length == jArr2.length);
        C5950a.a(jArr.length == jArr2.length);
        C5950a.a(iArr2.length == jArr2.length ? true : z10);
        this.f51627a = sVar;
        this.f51629c = jArr;
        this.f51630d = iArr;
        this.f51631e = i10;
        this.f51632f = jArr2;
        this.f51633g = iArr2;
        this.f51634h = j10;
        this.f51628b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int h10 = N.h(this.f51632f, j10, true, false); h10 >= 0; h10--) {
            if ((this.f51633g[h10] & 1) != 0) {
                return h10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int e10 = N.e(this.f51632f, j10, true, false); e10 < this.f51632f.length; e10++) {
            if ((this.f51633g[e10] & 1) != 0) {
                return e10;
            }
        }
        return -1;
    }
}
