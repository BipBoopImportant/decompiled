package q3;

import android.net.Uri;
import java.util.Arrays;
import q3.w;
import t3.C5950a;
import t3.N;

/* renamed from: q3.b  reason: case insensitive filesystem */
public final class C5791b {

    /* renamed from: g  reason: collision with root package name */
    public static final C5791b f28078g = new C5791b((Object) null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h  reason: collision with root package name */
    private static final a f28079h = new a(0).i(0);

    /* renamed from: i  reason: collision with root package name */
    private static final String f28080i = N.A0(1);

    /* renamed from: j  reason: collision with root package name */
    private static final String f28081j = N.A0(2);

    /* renamed from: k  reason: collision with root package name */
    private static final String f28082k = N.A0(3);

    /* renamed from: l  reason: collision with root package name */
    private static final String f28083l = N.A0(4);

    /* renamed from: a  reason: collision with root package name */
    public final Object f28084a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28085b;

    /* renamed from: c  reason: collision with root package name */
    public final long f28086c;

    /* renamed from: d  reason: collision with root package name */
    public final long f28087d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28088e;

    /* renamed from: f  reason: collision with root package name */
    private final a[] f28089f;

    /* renamed from: q3.b$a */
    public static final class a {

        /* renamed from: j  reason: collision with root package name */
        private static final String f28090j = N.A0(0);

        /* renamed from: k  reason: collision with root package name */
        private static final String f28091k = N.A0(1);

        /* renamed from: l  reason: collision with root package name */
        private static final String f28092l = N.A0(2);

        /* renamed from: m  reason: collision with root package name */
        private static final String f28093m = N.A0(3);

        /* renamed from: n  reason: collision with root package name */
        private static final String f28094n = N.A0(4);

        /* renamed from: o  reason: collision with root package name */
        private static final String f28095o = N.A0(5);

        /* renamed from: p  reason: collision with root package name */
        private static final String f28096p = N.A0(6);

        /* renamed from: q  reason: collision with root package name */
        private static final String f28097q = N.A0(7);

        /* renamed from: r  reason: collision with root package name */
        static final String f28098r = N.A0(8);

        /* renamed from: a  reason: collision with root package name */
        public final long f28099a;

        /* renamed from: b  reason: collision with root package name */
        public final int f28100b;

        /* renamed from: c  reason: collision with root package name */
        public final int f28101c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public final Uri[] f28102d;

        /* renamed from: e  reason: collision with root package name */
        public final w[] f28103e;

        /* renamed from: f  reason: collision with root package name */
        public final int[] f28104f;

        /* renamed from: g  reason: collision with root package name */
        public final long[] f28105g;

        /* renamed from: h  reason: collision with root package name */
        public final long f28106h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f28107i;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new w[0], new long[0], 0, false);
        }

        private static long[] b(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        private static int[] c(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* access modifiers changed from: private */
        public boolean g() {
            return this.f28107i && this.f28099a == Long.MIN_VALUE && this.f28100b == -1;
        }

        public int d() {
            return e(-1);
        }

        public int e(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f28104f;
                if (i12 >= iArr.length || this.f28107i || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    return i12;
                }
                i12++;
            }
            return i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28099a == aVar.f28099a && this.f28100b == aVar.f28100b && this.f28101c == aVar.f28101c && Arrays.equals(this.f28103e, aVar.f28103e) && Arrays.equals(this.f28104f, aVar.f28104f) && Arrays.equals(this.f28105g, aVar.f28105g) && this.f28106h == aVar.f28106h && this.f28107i == aVar.f28107i;
        }

        public boolean f() {
            if (this.f28100b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f28100b; i10++) {
                int i11 = this.f28104f[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean h() {
            return this.f28100b == -1 || d() < this.f28100b;
        }

        public int hashCode() {
            long j10 = this.f28099a;
            long j11 = this.f28106h;
            return (((((((((((((this.f28100b * 31) + this.f28101c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f28103e)) * 31) + Arrays.hashCode(this.f28104f)) * 31) + Arrays.hashCode(this.f28105g)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f28107i ? 1 : 0);
        }

        public a i(int i10) {
            int[] c10 = c(this.f28104f, i10);
            long[] b10 = b(this.f28105g, i10);
            return new a(this.f28099a, i10, this.f28101c, c10, (w[]) Arrays.copyOf(this.f28103e, i10), b10, this.f28106h, this.f28107i);
        }

        private a(long j10, int i10, int i11, int[] iArr, w[] wVarArr, long[] jArr, long j11, boolean z10) {
            int i12 = 0;
            C5950a.a(iArr.length == wVarArr.length);
            this.f28099a = j10;
            this.f28100b = i10;
            this.f28101c = i11;
            this.f28104f = iArr;
            this.f28103e = wVarArr;
            this.f28105g = jArr;
            this.f28106h = j11;
            this.f28107i = z10;
            this.f28102d = new Uri[wVarArr.length];
            while (true) {
                Uri[] uriArr = this.f28102d;
                if (i12 < uriArr.length) {
                    w wVar = wVarArr[i12];
                    uriArr[i12] = wVar == null ? null : ((w.h) C5950a.e(wVar.f28319b)).f28411a;
                    i12++;
                } else {
                    return;
                }
            }
        }
    }

    private C5791b(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f28084a = obj;
        this.f28086c = j10;
        this.f28087d = j11;
        this.f28085b = aVarArr.length + i10;
        this.f28089f = aVarArr;
        this.f28088e = i10;
    }

    private boolean e(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        a a10 = a(i10);
        long j12 = a10.f28099a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || (a10.f28107i && a10.f28100b == -1) || j10 < j11 : j10 < j12;
    }

    public a a(int i10) {
        int i11 = this.f28088e;
        return i10 < i11 ? f28079h : this.f28089f[i10 - i11];
    }

    public int b(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = this.f28088e;
        while (i10 < this.f28085b && ((a(i10).f28099a != Long.MIN_VALUE && a(i10).f28099a <= j10) || !a(i10).h())) {
            i10++;
        }
        if (i10 < this.f28085b) {
            return i10;
        }
        return -1;
    }

    public int c(long j10, long j11) {
        int i10 = this.f28085b - 1;
        int i11 = i10 - (d(i10) ? 1 : 0);
        while (i11 >= 0 && e(j10, j11, i11)) {
            i11--;
        }
        if (i11 < 0 || !a(i11).f()) {
            return -1;
        }
        return i11;
    }

    public boolean d(int i10) {
        return i10 == this.f28085b - 1 && a(i10).g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5791b.class != obj.getClass()) {
            return false;
        }
        C5791b bVar = (C5791b) obj;
        return N.d(this.f28084a, bVar.f28084a) && this.f28085b == bVar.f28085b && this.f28086c == bVar.f28086c && this.f28087d == bVar.f28087d && this.f28088e == bVar.f28088e && Arrays.equals(this.f28089f, bVar.f28089f);
    }

    public int hashCode() {
        int i10 = this.f28085b * 31;
        Object obj = this.f28084a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f28086c)) * 31) + ((int) this.f28087d)) * 31) + this.f28088e) * 31) + Arrays.hashCode(this.f28089f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f28084a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f28086c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f28089f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f28089f[i10].f28099a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f28089f[i10].f28104f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f28089f[i10].f28104f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f28089f[i10].f28105g[i11]);
                sb2.append(')');
                if (i11 < this.f28089f[i10].f28104f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f28089f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
