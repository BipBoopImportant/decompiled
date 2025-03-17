package N3;

import Z3.C6738a;
import java.util.Collections;
import java.util.List;
import q3.C5807s;
import q3.z;
import t3.A;
import t3.N;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final int f38941a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38942b;

    /* renamed from: c  reason: collision with root package name */
    public final int f38943c;

    /* renamed from: d  reason: collision with root package name */
    public final int f38944d;

    /* renamed from: e  reason: collision with root package name */
    public final int f38945e;

    /* renamed from: f  reason: collision with root package name */
    public final int f38946f;

    /* renamed from: g  reason: collision with root package name */
    public final int f38947g;

    /* renamed from: h  reason: collision with root package name */
    public final int f38948h;

    /* renamed from: i  reason: collision with root package name */
    public final int f38949i;

    /* renamed from: j  reason: collision with root package name */
    public final long f38950j;

    /* renamed from: k  reason: collision with root package name */
    public final a f38951k;

    /* renamed from: l  reason: collision with root package name */
    private final z f38952l;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f38953a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f38954b;

        public a(long[] jArr, long[] jArr2) {
            this.f38953a = jArr;
            this.f38954b = jArr2;
        }
    }

    public y(byte[] bArr, int i10) {
        A a10 = new A(bArr);
        a10.p(i10 * 8);
        this.f38941a = a10.h(16);
        this.f38942b = a10.h(16);
        this.f38943c = a10.h(24);
        this.f38944d = a10.h(24);
        int h10 = a10.h(20);
        this.f38945e = h10;
        this.f38946f = j(h10);
        this.f38947g = a10.h(3) + 1;
        int h11 = a10.h(5) + 1;
        this.f38948h = h11;
        this.f38949i = e(h11);
        this.f38950j = a10.j(36);
        this.f38951k = null;
        this.f38952l = null;
    }

    private static int e(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int j(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public y a(List<C6738a> list) {
        return new y(this.f38941a, this.f38942b, this.f38943c, this.f38944d, this.f38945e, this.f38947g, this.f38948h, this.f38950j, this.f38951k, h(new z((List<? extends z.b>) list)));
    }

    public y b(a aVar) {
        return new y(this.f38941a, this.f38942b, this.f38943c, this.f38944d, this.f38945e, this.f38947g, this.f38948h, this.f38950j, aVar, this.f38952l);
    }

    public y c(List<String> list) {
        return new y(this.f38941a, this.f38942b, this.f38943c, this.f38944d, this.f38945e, this.f38947g, this.f38948h, this.f38950j, this.f38951k, h(S.d(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f38944d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f38943c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f38941a;
            j10 = ((((i11 != this.f38942b || i11 <= 0) ? 4096 : (long) i11) * ((long) this.f38947g)) * ((long) this.f38948h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f38950j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f38945e);
    }

    public C5807s g(byte[] bArr, z zVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f38944d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new C5807s.b().s0("audio/flac").j0(i10).Q(this.f38947g).t0(this.f38945e).m0(N.f0(this.f38948h)).f0(Collections.singletonList(bArr)).l0(h(zVar)).M();
    }

    public z h(z zVar) {
        z zVar2 = this.f38952l;
        return zVar2 == null ? zVar : zVar2.b(zVar);
    }

    public long i(long j10) {
        return N.q((j10 * ((long) this.f38945e)) / 1000000, 0, this.f38950j - 1);
    }

    private y(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, z zVar) {
        this.f38941a = i10;
        this.f38942b = i11;
        this.f38943c = i12;
        this.f38944d = i13;
        this.f38945e = i14;
        this.f38946f = j(i14);
        this.f38947g = i15;
        this.f38948h = i16;
        this.f38949i = e(i16);
        this.f38950j = j10;
        this.f38951k = aVar;
        this.f38952l = zVar;
    }
}
