package N3;

import Z3.C6738a;
import android.util.Base64;
import e4.C7784a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kb.C9967v;
import q3.z;
import t3.B;
import t3.N;
import t3.q;

public final class S {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f38792a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f38793b;

        /* renamed from: c  reason: collision with root package name */
        public final int f38794c;

        public a(String str, String[] strArr, int i10) {
            this.f38792a = str;
            this.f38793b = strArr;
            this.f38794c = i10;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f38795a;

        /* renamed from: b  reason: collision with root package name */
        public final int f38796b;

        /* renamed from: c  reason: collision with root package name */
        public final int f38797c;

        /* renamed from: d  reason: collision with root package name */
        public final int f38798d;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f38795a = z10;
            this.f38796b = i10;
            this.f38797c = i11;
            this.f38798d = i12;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f38799a;

        /* renamed from: b  reason: collision with root package name */
        public final int f38800b;

        /* renamed from: c  reason: collision with root package name */
        public final int f38801c;

        /* renamed from: d  reason: collision with root package name */
        public final int f38802d;

        /* renamed from: e  reason: collision with root package name */
        public final int f38803e;

        /* renamed from: f  reason: collision with root package name */
        public final int f38804f;

        /* renamed from: g  reason: collision with root package name */
        public final int f38805g;

        /* renamed from: h  reason: collision with root package name */
        public final int f38806h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f38807i;

        /* renamed from: j  reason: collision with root package name */
        public final byte[] f38808j;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f38799a = i10;
            this.f38800b = i11;
            this.f38801c = i12;
            this.f38802d = i13;
            this.f38803e = i14;
            this.f38804f = i15;
            this.f38805g = i16;
            this.f38806h = i17;
            this.f38807i = z10;
            this.f38808j = bArr;
        }
    }

    public static int[] a(int i10) {
        if (i10 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i10 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i10 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i10 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i10 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long c(long j10, long j11) {
        return (long) Math.floor(Math.pow((double) j10, 1.0d / ((double) j11)));
    }

    public static z d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] i12 = N.i1(str, "=");
            if (i12.length != 2) {
                q.h("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (i12[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C6738a.a(new B(Base64.decode(i12[1], 0))));
                } catch (RuntimeException e10) {
                    q.i("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new C7784a(i12[0], i12[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new z((List<? extends z.b>) arrayList);
    }

    public static C9967v<byte[]> e(byte[] bArr) {
        B b10 = new B(bArr);
        b10.X(1);
        int i10 = 0;
        while (b10.a() > 0 && b10.j() == 255) {
            i10 += 255;
            b10.X(1);
        }
        int H10 = i10 + b10.H();
        int i11 = 0;
        while (b10.a() > 0 && b10.j() == 255) {
            i11 += 255;
            b10.X(1);
        }
        int H11 = i11 + b10.H();
        byte[] bArr2 = new byte[H10];
        int f10 = b10.f();
        System.arraycopy(bArr, f10, bArr2, 0, H10);
        int i12 = f10 + H10 + H11;
        int length = bArr.length - i12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i12, bArr3, 0, length);
        return C9967v.G(bArr2, bArr3);
    }

    private static void f(Q q10) {
        int d10 = q10.d(6) + 1;
        for (int i10 = 0; i10 < d10; i10++) {
            int d11 = q10.d(16);
            if (d11 == 0) {
                q10.e(8);
                q10.e(16);
                q10.e(16);
                q10.e(6);
                q10.e(8);
                int d12 = q10.d(4) + 1;
                for (int i11 = 0; i11 < d12; i11++) {
                    q10.e(8);
                }
            } else if (d11 == 1) {
                int d13 = q10.d(5);
                int[] iArr = new int[d13];
                int i12 = -1;
                for (int i13 = 0; i13 < d13; i13++) {
                    int d14 = q10.d(4);
                    iArr[i13] = d14;
                    if (d14 > i12) {
                        i12 = d14;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = q10.d(3) + 1;
                    int d15 = q10.d(2);
                    if (d15 > 0) {
                        q10.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << d15); i16++) {
                        q10.e(8);
                    }
                }
                q10.e(2);
                int d16 = q10.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < d13; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        q10.e(d16);
                        i18++;
                    }
                }
            } else {
                throw q3.B.a("floor type greater than 1 not decodable: " + d11, (Throwable) null);
            }
        }
    }

    private static void g(int i10, Q q10) {
        int d10 = q10.d(6) + 1;
        for (int i11 = 0; i11 < d10; i11++) {
            int d11 = q10.d(16);
            if (d11 != 0) {
                q.c("VorbisUtil", "mapping type other than 0 not supported: " + d11);
            } else {
                int d12 = q10.c() ? q10.d(4) + 1 : 1;
                if (q10.c()) {
                    int d13 = q10.d(8) + 1;
                    for (int i12 = 0; i12 < d13; i12++) {
                        int i13 = i10 - 1;
                        q10.e(b(i13));
                        q10.e(b(i13));
                    }
                }
                if (q10.d(2) == 0) {
                    if (d12 > 1) {
                        for (int i14 = 0; i14 < i10; i14++) {
                            q10.e(4);
                        }
                    }
                    for (int i15 = 0; i15 < d12; i15++) {
                        q10.e(8);
                        q10.e(8);
                        q10.e(8);
                    }
                } else {
                    throw q3.B.a("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                }
            }
        }
    }

    private static b[] h(Q q10) {
        int d10 = q10.d(6) + 1;
        b[] bVarArr = new b[d10];
        for (int i10 = 0; i10 < d10; i10++) {
            bVarArr[i10] = new b(q10.c(), q10.d(16), q10.d(16), q10.d(8));
        }
        return bVarArr;
    }

    private static void i(Q q10) {
        int d10 = q10.d(6) + 1;
        int i10 = 0;
        while (i10 < d10) {
            if (q10.d(16) <= 2) {
                q10.e(24);
                q10.e(24);
                q10.e(24);
                int d11 = q10.d(6) + 1;
                q10.e(8);
                int[] iArr = new int[d11];
                for (int i11 = 0; i11 < d11; i11++) {
                    iArr[i11] = ((q10.c() ? q10.d(5) : 0) * 8) + q10.d(3);
                }
                for (int i12 = 0; i12 < d11; i12++) {
                    for (int i13 = 0; i13 < 8; i13++) {
                        if ((iArr[i12] & (1 << i13)) != 0) {
                            q10.e(8);
                        }
                    }
                }
                i10++;
            } else {
                throw q3.B.a("residueType greater than 2 is not decodable", (Throwable) null);
            }
        }
    }

    public static a j(B b10) {
        return k(b10, true, true);
    }

    public static a k(B b10, boolean z10, boolean z11) {
        if (z10) {
            o(3, b10, false);
        }
        String E10 = b10.E((int) b10.x());
        int length = E10.length();
        long x10 = b10.x();
        String[] strArr = new String[((int) x10)];
        int i10 = length + 15;
        for (int i11 = 0; ((long) i11) < x10; i11++) {
            String E11 = b10.E((int) b10.x());
            strArr[i11] = E11;
            i10 = i10 + 4 + E11.length();
        }
        if (!z11 || (b10.H() & 1) != 0) {
            return new a(E10, strArr, i10 + 1);
        }
        throw q3.B.a("framing bit expected to be set", (Throwable) null);
    }

    public static c l(B b10) {
        boolean z10 = true;
        o(1, b10, false);
        int y10 = b10.y();
        int H10 = b10.H();
        int y11 = b10.y();
        int u10 = b10.u();
        if (u10 <= 0) {
            u10 = -1;
        }
        int u11 = b10.u();
        if (u11 <= 0) {
            u11 = -1;
        }
        int u12 = b10.u();
        if (u12 <= 0) {
            u12 = -1;
        }
        int H11 = b10.H();
        int pow = (int) Math.pow(2.0d, (double) (H11 & 15));
        int pow2 = (int) Math.pow(2.0d, (double) ((H11 & 240) >> 4));
        if ((b10.H() & 1) <= 0) {
            z10 = false;
        }
        return new c(y10, H10, y11, u10, u11, u12, pow, pow2, z10, Arrays.copyOf(b10.e(), b10.g()));
    }

    public static b[] m(B b10, int i10) {
        int i11 = 0;
        o(5, b10, false);
        int H10 = b10.H() + 1;
        Q q10 = new Q(b10.e());
        q10.e(b10.f() * 8);
        for (int i12 = 0; i12 < H10; i12++) {
            n(q10);
        }
        int d10 = q10.d(6) + 1;
        while (i11 < d10) {
            if (q10.d(16) == 0) {
                i11++;
            } else {
                throw q3.B.a("placeholder of time domain transforms not zeroed out", (Throwable) null);
            }
        }
        f(q10);
        i(q10);
        g(i10, q10);
        b[] h10 = h(q10);
        if (q10.c()) {
            return h10;
        }
        throw q3.B.a("framing bit after modes not set as expected", (Throwable) null);
    }

    private static void n(Q q10) {
        if (q10.d(24) == 5653314) {
            int d10 = q10.d(16);
            int d11 = q10.d(24);
            int i10 = 0;
            if (!q10.c()) {
                boolean c10 = q10.c();
                while (i10 < d11) {
                    if (!c10) {
                        q10.e(5);
                    } else if (q10.c()) {
                        q10.e(5);
                    }
                    i10++;
                }
            } else {
                q10.e(5);
                while (i10 < d11) {
                    i10 += q10.d(b(d11 - i10));
                }
            }
            int d12 = q10.d(4);
            if (d12 > 2) {
                throw q3.B.a("lookup type greater than 2 not decodable: " + d12, (Throwable) null);
            } else if (d12 == 1 || d12 == 2) {
                q10.e(32);
                q10.e(32);
                int d13 = q10.d(4) + 1;
                q10.e(1);
                q10.e((int) ((d12 == 1 ? d10 != 0 ? c((long) d11, (long) d10) : 0 : ((long) d10) * ((long) d11)) * ((long) d13)));
            }
        } else {
            throw q3.B.a("expected code book to start with [0x56, 0x43, 0x42] at " + q10.b(), (Throwable) null);
        }
    }

    public static boolean o(int i10, B b10, boolean z10) {
        if (b10.a() < 7) {
            if (z10) {
                return false;
            }
            throw q3.B.a("too short header: " + b10.a(), (Throwable) null);
        } else if (b10.H() != i10) {
            if (z10) {
                return false;
            }
            throw q3.B.a("expected header type " + Integer.toHexString(i10), (Throwable) null);
        } else if (b10.H() == 118 && b10.H() == 111 && b10.H() == 114 && b10.H() == 98 && b10.H() == 105 && b10.H() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw q3.B.a("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
