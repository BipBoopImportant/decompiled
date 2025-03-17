package V3;

import c4.C7090a;
import java.util.List;

/* renamed from: V3.c  reason: case insensitive filesystem */
final class C6709c {

    /* renamed from: a  reason: collision with root package name */
    public final long f40409a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f40410b;

    /* renamed from: V3.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f40411a;

        /* renamed from: b  reason: collision with root package name */
        public final String f40412b;

        /* renamed from: c  reason: collision with root package name */
        public final long f40413c;

        /* renamed from: d  reason: collision with root package name */
        public final long f40414d;

        public a(String str, String str2, long j10, long j11) {
            this.f40411a = str;
            this.f40412b = str2;
            this.f40413c = j10;
            this.f40414d = j11;
        }
    }

    public C6709c(long j10, List<a> list) {
        this.f40409a = j10;
        this.f40410b = list;
    }

    public C7090a a(long j10) {
        long j11;
        if (this.f40410b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f40410b.size() - 1; size >= 0; size--) {
            a aVar = this.f40410b.get(size);
            boolean equals = "video/mp4".equals(aVar.f40411a) | z10;
            if (size == 0) {
                j12 -= aVar.f40414d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f40413c;
            }
            long j17 = j12;
            j12 = j11;
            long j18 = j17;
            if (!equals || j12 == j18) {
                z10 = equals;
            } else {
                j16 = j18 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j18;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new C7090a(j13, j14, this.f40409a, j15, j16);
    }
}
