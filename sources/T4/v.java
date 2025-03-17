package t4;

import androidx.recyclerview.widget.RecyclerView;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import mb.C10032c;
import mb.C10033d;
import q3.B;
import t3.A;
import t3.C5950a;

final class v {

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f56529a;

        /* renamed from: b  reason: collision with root package name */
        public long f56530b;

        /* renamed from: c  reason: collision with root package name */
        public int f56531c;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f56532a;

        /* renamed from: b  reason: collision with root package name */
        public final int f56533b;

        /* renamed from: c  reason: collision with root package name */
        public final int f56534c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f56535d;

        private c(int i10, int i11, int i12, byte[] bArr) {
            this.f56532a = i10;
            this.f56533b = i11;
            this.f56534c = i12;
            this.f56535d = bArr;
        }
    }

    private static int a(int i10) {
        if (i10 == 0) {
            return 768;
        }
        if (i10 == 1) {
            return 1024;
        }
        if (i10 == 2 || i10 == 3) {
            return RecyclerView.n.FLAG_MOVED;
        }
        if (i10 == 4) {
            return RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
        }
        throw B.c("Unsupported coreSbrFrameLengthIndex " + i10);
    }

    private static double b(int i10) {
        switch (i10) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw B.c("Unsupported sampling rate " + i10);
        }
    }

    private static int c(int i10) {
        switch (i10) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                return 19200;
            case BuildConfig.MIN_SDK_VERSION /*24*/:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
            default:
                throw B.c("Unsupported sampling rate index " + i10);
        }
    }

    private static int d(int i10) {
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                if (i10 == 4) {
                    return 1;
                }
                throw B.c("Unsupported coreSbrFrameLengthIndex " + i10);
            }
        }
        return i11;
    }

    public static boolean e(int i10) {
        return (i10 & 16777215) == 12583333;
    }

    public static int f(A a10) {
        if (!a10.g()) {
            return 0;
        }
        a10.r(2);
        return a10.h(13);
    }

    public static boolean g(A a10, b bVar) {
        a10.d();
        int k10 = k(a10, 3, 8, 8);
        bVar.f56529a = k10;
        if (k10 == -1) {
            return false;
        }
        long l10 = l(a10, 2, 8, 32);
        bVar.f56530b = l10;
        if (l10 == -1) {
            return false;
        }
        if (l10 <= 16) {
            if (l10 == 0) {
                int i10 = bVar.f56529a;
                if (i10 == 1) {
                    throw B.a("Mpegh3daConfig packet with invalid packet label 0", (Throwable) null);
                } else if (i10 == 2) {
                    throw B.a("Mpegh3daFrame packet with invalid packet label 0", (Throwable) null);
                } else if (i10 == 17) {
                    throw B.a("AudioTruncation packet with invalid packet label 0", (Throwable) null);
                }
            }
            int k11 = k(a10, 11, 24, 24);
            bVar.f56531c = k11;
            return k11 != -1;
        }
        throw B.c("Contains sub-stream with an invalid packet label " + bVar.f56530b);
    }

    public static c h(A a10) {
        int h10 = a10.h(8);
        int h11 = a10.h(5);
        int h12 = h11 == 31 ? a10.h(24) : c(h11);
        int h13 = a10.h(3);
        int a11 = a(h13);
        int d10 = d(h13);
        a10.r(2);
        p(a10);
        m(a10, j(a10), d10);
        byte[] bArr = null;
        if (a10.g()) {
            int k10 = k(a10, 2, 4, 8) + 1;
            for (int i10 = 0; i10 < k10; i10++) {
                int k11 = k(a10, 4, 8, 16);
                int k12 = k(a10, 4, 8, 16);
                if (k11 == 7) {
                    int h14 = a10.h(4) + 1;
                    a10.r(4);
                    byte[] bArr2 = new byte[h14];
                    for (int i11 = 0; i11 < h14; i11++) {
                        bArr2[i11] = (byte) a10.h(8);
                    }
                    bArr = bArr2;
                } else {
                    a10.r(k12 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double b10 = b(h12);
        return new c(h10, (int) (((double) h12) * b10), (int) (((double) a11) * b10), bArr3);
    }

    private static boolean i(A a10) {
        a10.r(3);
        boolean g10 = a10.g();
        if (g10) {
            a10.r(13);
        }
        return g10;
    }

    private static int j(A a10) {
        int h10 = a10.h(5);
        int i10 = 0;
        for (int i11 = 0; i11 < h10 + 1; i11++) {
            int h11 = a10.h(3);
            i10 += k(a10, 5, 8, 16) + 1;
            if ((h11 == 0 || h11 == 2) && a10.g()) {
                p(a10);
            }
        }
        return i10;
    }

    private static int k(A a10, int i10, int i11, int i12) {
        C5950a.a(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        C10032c.a(C10032c.a(i13, i14), 1 << i12);
        if (a10.b() < i10) {
            return -1;
        }
        int h10 = a10.h(i10);
        if (h10 != i13) {
            return h10;
        }
        if (a10.b() < i11) {
            return -1;
        }
        int h11 = a10.h(i11);
        int i15 = h10 + h11;
        if (h11 != i14) {
            return i15;
        }
        if (a10.b() < i12) {
            return -1;
        }
        return i15 + a10.h(i12);
    }

    private static long l(A a10, int i10, int i11, int i12) {
        C5950a.a(Math.max(Math.max(i10, i11), i12) <= 63);
        long j10 = (1 << i10) - 1;
        long j11 = (1 << i11) - 1;
        C10033d.a(C10033d.a(j10, j11), 1 << i12);
        if (a10.b() < i10) {
            return -1;
        }
        long j12 = a10.j(i10);
        if (j12 != j10) {
            return j12;
        }
        if (a10.b() < i11) {
            return -1;
        }
        long j13 = a10.j(i11);
        long j14 = j12 + j13;
        if (j13 != j11) {
            return j14;
        }
        if (a10.b() < i12) {
            return -1;
        }
        return j14 + a10.j(i12);
    }

    private static void m(A a10, int i10, int i11) {
        int i12;
        int k10 = k(a10, 4, 8, 16) + 1;
        a10.q();
        for (int i13 = 0; i13 < k10; i13++) {
            int h10 = a10.h(2);
            if (h10 == 0) {
                i(a10);
                if (i11 > 0) {
                    o(a10);
                }
            } else if (h10 == 1) {
                if (i(a10)) {
                    a10.q();
                }
                if (i11 > 0) {
                    o(a10);
                    i12 = a10.h(2);
                } else {
                    i12 = 0;
                }
                if (i12 > 0) {
                    a10.r(6);
                    int h11 = a10.h(2);
                    a10.r(4);
                    if (a10.g()) {
                        a10.r(5);
                    }
                    if (i12 == 2 || i12 == 3) {
                        a10.r(6);
                    }
                    if (h11 == 2) {
                        a10.q();
                    }
                }
                int floor = ((int) Math.floor(Math.log((double) (i10 - 1)) / Math.log(2.0d))) + 1;
                int h12 = a10.h(2);
                if (h12 > 0 && a10.g()) {
                    a10.r(floor);
                }
                if (a10.g()) {
                    a10.r(floor);
                }
                if (i11 == 0 && h12 == 0) {
                    a10.q();
                }
            } else if (h10 == 3) {
                k(a10, 4, 8, 16);
                int k11 = k(a10, 4, 8, 16);
                if (a10.g()) {
                    k(a10, 8, 16, 0);
                }
                a10.q();
                if (k11 > 0) {
                    a10.r(k11 * 8);
                }
            }
        }
    }

    private static void n(A a10, int i10) {
        int i11;
        boolean g10 = a10.g();
        int i12 = 5;
        int i13 = g10 ? 1 : 5;
        if (g10) {
            i12 = 7;
        }
        int i14 = g10 ? 8 : 6;
        int i15 = 0;
        while (i15 < i10) {
            if (a10.g()) {
                a10.r(7);
                i11 = 0;
            } else {
                if (a10.h(2) == 3 && a10.h(i12) * i13 != 0) {
                    a10.q();
                }
                i11 = a10.h(i14) * i13;
                if (!(i11 == 0 || i11 == 180)) {
                    a10.q();
                }
                a10.q();
            }
            if (!(i11 == 0 || i11 == 180 || !a10.g())) {
                i15++;
            }
            i15++;
        }
    }

    private static void o(A a10) {
        a10.r(3);
        a10.r(8);
        boolean g10 = a10.g();
        boolean g11 = a10.g();
        if (g10) {
            a10.r(5);
        }
        if (g11) {
            a10.r(6);
        }
    }

    private static void p(A a10) {
        int h10 = a10.h(2);
        if (h10 == 0) {
            a10.r(6);
            return;
        }
        int k10 = k(a10, 5, 8, 16) + 1;
        if (h10 == 1) {
            a10.r(k10 * 7);
        } else if (h10 == 2) {
            n(a10, k10);
        }
    }
}
