package N3;

import N3.J;
import java.util.Arrays;
import t3.N;

/* renamed from: N3.g  reason: case insensitive filesystem */
public final class C6669g implements J {

    /* renamed from: a  reason: collision with root package name */
    public final int f38874a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f38875b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f38876c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f38877d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f38878e;

    /* renamed from: f  reason: collision with root package name */
    private final long f38879f;

    public C6669g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f38875b = iArr;
        this.f38876c = jArr;
        this.f38877d = jArr2;
        this.f38878e = jArr3;
        int length = iArr.length;
        this.f38874a = length;
        if (length > 0) {
            this.f38879f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f38879f = 0;
        }
    }

    public int a(long j10) {
        return N.h(this.f38878e, j10, true, true);
    }

    public J.a c(long j10) {
        int a10 = a(j10);
        K k10 = new K(this.f38878e[a10], this.f38876c[a10]);
        if (k10.f38766a >= j10 || a10 == this.f38874a - 1) {
            return new J.a(k10);
        }
        int i10 = a10 + 1;
        return new J.a(k10, new K(this.f38878e[i10], this.f38876c[i10]));
    }

    public boolean f() {
        return true;
    }

    public long l() {
        return this.f38879f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f38874a + ", sizes=" + Arrays.toString(this.f38875b) + ", offsets=" + Arrays.toString(this.f38876c) + ", timeUs=" + Arrays.toString(this.f38878e) + ", durationsUs=" + Arrays.toString(this.f38877d) + ")";
    }
}
