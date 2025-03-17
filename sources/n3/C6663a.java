package N3;

import d9.M;
import q3.B;
import t3.A;
import t3.q;

/* renamed from: N3.a  reason: case insensitive filesystem */
public final class C6663a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f38809a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f38810b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: N3.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f38811a;

        /* renamed from: b  reason: collision with root package name */
        public final int f38812b;

        /* renamed from: c  reason: collision with root package name */
        public final String f38813c;

        private b(int i10, int i11, String str) {
            this.f38811a = i10;
            this.f38812b = i11;
            this.f38813c = str;
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    private static int b(A a10) {
        int h10 = a10.h(5);
        return h10 == 31 ? a10.h(6) + 32 : h10;
    }

    private static int c(A a10) {
        int h10 = a10.h(4);
        if (h10 == 15) {
            if (a10.b() >= 24) {
                return a10.h(24);
            }
            throw B.a("AAC header insufficient data", (Throwable) null);
        } else if (h10 < 13) {
            return f38809a[h10];
        } else {
            throw B.a("AAC header wrong Sampling Frequency Index", (Throwable) null);
        }
    }

    public static b d(A a10, boolean z10) {
        int b10 = b(a10);
        int c10 = c(a10);
        int h10 = a10.h(4);
        String str = "mp4a.40." + b10;
        if (b10 == 5 || b10 == 29) {
            c10 = c(a10);
            b10 = b(a10);
            if (b10 == 22) {
                h10 = a10.h(4);
            }
        }
        if (z10) {
            if (!(b10 == 1 || b10 == 2 || b10 == 3 || b10 == 4 || b10 == 6 || b10 == 7 || b10 == 17)) {
                switch (b10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                        break;
                    default:
                        throw B.c("Unsupported audio object type: " + b10);
                }
            }
            f(a10, b10, h10);
            switch (b10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                    int h11 = a10.h(2);
                    if (h11 == 2 || h11 == 3) {
                        throw B.c("Unsupported epConfig: " + h11);
                    }
            }
        }
        int i10 = f38810b[h10];
        if (i10 != -1) {
            return new b(c10, i10, str);
        }
        throw B.a((String) null, (Throwable) null);
    }

    public static b e(byte[] bArr) {
        return d(new A(bArr), false);
    }

    private static void f(A a10, int i10, int i11) {
        if (a10.g()) {
            q.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (a10.g()) {
            a10.r(14);
        }
        boolean g10 = a10.g();
        if (i11 != 0) {
            if (i10 == 6 || i10 == 20) {
                a10.r(3);
            }
            if (g10) {
                if (i10 == 22) {
                    a10.r(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    a10.r(3);
                }
                a10.r(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
