package N3;

import java.nio.ByteBuffer;
import q3.C5803n;
import q3.C5807s;
import t3.A;
import t3.B;
import t3.N;

/* renamed from: N3.b  reason: case insensitive filesystem */
public final class C6664b {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f38814a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f38815b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f38816c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f38817d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f38818e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f38819f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: N3.b$b  reason: collision with other inner class name */
    public static final class C0611b {

        /* renamed from: a  reason: collision with root package name */
        public final String f38820a;

        /* renamed from: b  reason: collision with root package name */
        public final int f38821b;

        /* renamed from: c  reason: collision with root package name */
        public final int f38822c;

        /* renamed from: d  reason: collision with root package name */
        public final int f38823d;

        /* renamed from: e  reason: collision with root package name */
        public final int f38824e;

        /* renamed from: f  reason: collision with root package name */
        public final int f38825f;

        /* renamed from: g  reason: collision with root package name */
        public final int f38826g;

        private C0611b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f38820a = str;
            this.f38821b = i10;
            this.f38823d = i11;
            this.f38822c = i12;
            this.f38824e = i13;
            this.f38825f = i14;
            this.f38826g = i15;
        }
    }

    private static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((N.P(byteBuffer, i10 + 4) & -2) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    private static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f38815b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f38819f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f38818e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static C5807s d(B b10, String str, String str2, C5803n nVar) {
        A a10 = new A();
        a10.m(b10);
        int i10 = f38815b[a10.h(2)];
        a10.r(8);
        int i11 = f38817d[a10.h(3)];
        if (a10.h(1) != 0) {
            i11++;
        }
        int i12 = f38818e[a10.h(5)] * 1000;
        a10.c();
        b10.W(a10.d());
        return new C5807s.b().e0(str).s0("audio/ac3").Q(i11).t0(i10).X(nVar).i0(str2).P(i12).n0(i12).M();
    }

    public static int e(ByteBuffer byteBuffer) {
        int i10 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f38814a[i10] * 256;
    }

    public static C0611b f(A a10) {
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        A a11 = a10;
        int e10 = a10.e();
        a11.r(40);
        boolean z10 = a11.h(5) > 10;
        a11.p(e10);
        int i22 = -1;
        if (z10) {
            a11.r(16);
            int h10 = a11.h(2);
            if (h10 == 0) {
                i22 = 0;
            } else if (h10 == 1) {
                i22 = 1;
            } else if (h10 == 2) {
                i22 = 2;
            }
            a11.r(3);
            int h11 = (a11.h(11) + 1) * 2;
            int h12 = a11.h(2);
            if (h12 == 3) {
                i18 = f38816c[a11.h(2)];
                i17 = 3;
                i16 = 6;
            } else {
                int h13 = a11.h(2);
                int i23 = f38814a[h13];
                i17 = h13;
                i18 = f38815b[h12];
                i16 = i23;
            }
            int i24 = i16 * 256;
            int a12 = a(h11, i18, i16);
            int h14 = a11.h(3);
            boolean g10 = a10.g();
            i10 = f38817d[h14] + (g10 ? 1 : 0);
            a11.r(10);
            if (a10.g()) {
                a11.r(8);
            }
            if (h14 == 0) {
                a11.r(5);
                if (a10.g()) {
                    a11.r(8);
                }
            }
            if (i22 == 1 && a10.g()) {
                a11.r(16);
            }
            if (a10.g()) {
                if (h14 > 2) {
                    a11.r(2);
                }
                if ((h14 & 1) == 0 || h14 <= 2) {
                    i20 = 6;
                } else {
                    i20 = 6;
                    a11.r(6);
                }
                if ((h14 & 4) != 0) {
                    a11.r(i20);
                }
                if (g10 && a10.g()) {
                    a11.r(5);
                }
                if (i22 == 0) {
                    if (a10.g()) {
                        i21 = 6;
                        a11.r(6);
                    } else {
                        i21 = 6;
                    }
                    if (h14 == 0 && a10.g()) {
                        a11.r(i21);
                    }
                    if (a10.g()) {
                        a11.r(i21);
                    }
                    int h15 = a11.h(2);
                    if (h15 == 1) {
                        a11.r(5);
                    } else if (h15 == 2) {
                        a11.r(12);
                    } else if (h15 == 3) {
                        int h16 = a11.h(5);
                        if (a10.g()) {
                            a11.r(5);
                            if (a10.g()) {
                                a11.r(4);
                            }
                            if (a10.g()) {
                                a11.r(4);
                            }
                            if (a10.g()) {
                                a11.r(4);
                            }
                            if (a10.g()) {
                                a11.r(4);
                            }
                            if (a10.g()) {
                                a11.r(4);
                            }
                            if (a10.g()) {
                                a11.r(4);
                            }
                            if (a10.g()) {
                                a11.r(4);
                            }
                            if (a10.g()) {
                                if (a10.g()) {
                                    a11.r(4);
                                }
                                if (a10.g()) {
                                    a11.r(4);
                                }
                            }
                        }
                        if (a10.g()) {
                            a11.r(5);
                            if (a10.g()) {
                                a11.r(7);
                                if (a10.g()) {
                                    a11.r(8);
                                }
                            }
                        }
                        a11.r((h16 + 2) * 8);
                        a10.c();
                    }
                    if (h14 < 2) {
                        if (a10.g()) {
                            a11.r(14);
                        }
                        if (h14 == 0 && a10.g()) {
                            a11.r(14);
                        }
                    }
                    if (a10.g()) {
                        if (i17 == 0) {
                            a11.r(5);
                        } else {
                            for (int i25 = 0; i25 < i16; i25++) {
                                if (a10.g()) {
                                    a11.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (a10.g()) {
                a11.r(5);
                if (h14 == 2) {
                    a11.r(4);
                }
                if (h14 >= 6) {
                    a11.r(2);
                }
                if (a10.g()) {
                    a11.r(8);
                }
                if (h14 == 0 && a10.g()) {
                    a11.r(8);
                }
                if (h12 < 3) {
                    a10.q();
                }
            }
            if (i22 == 0 && i17 != 3) {
                a10.q();
            }
            if (i22 != 2 || (i17 != 3 && !a10.g())) {
                i19 = 6;
            } else {
                i19 = 6;
                a11.r(6);
            }
            str = (a10.g() && a11.h(i19) == 1 && a11.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i11 = i22;
            i12 = i24;
            i14 = h11;
            i15 = i18;
            i13 = a12;
        } else {
            a11.r(32);
            int h17 = a11.h(2);
            String str2 = h17 == 3 ? null : "audio/ac3";
            int h18 = a11.h(6);
            int i26 = f38818e[h18 / 2] * 1000;
            int c10 = c(h17, h18);
            a11.r(8);
            int h19 = a11.h(3);
            if (!((h19 & 1) == 0 || h19 == 1)) {
                a11.r(2);
            }
            if ((h19 & 4) != 0) {
                a11.r(2);
            }
            if (h19 == 2) {
                a11.r(2);
            }
            int[] iArr = f38815b;
            int i27 = h17 < iArr.length ? iArr[h17] : -1;
            i10 = f38817d[h19] + (a10.g() ? 1 : 0);
            i11 = -1;
            str = str2;
            i12 = 1536;
            i13 = i26;
            i14 = c10;
            i15 = i27;
        }
        return new C0611b(str, i11, i10, i15, i14, i12, i13);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return c((b10 & 192) >> 6, b10 & 63);
    }

    public static C5807s h(B b10, String str, String str2, C5803n nVar) {
        String str3;
        A a10 = new A();
        a10.m(b10);
        int h10 = a10.h(13) * 1000;
        a10.r(3);
        int i10 = f38815b[a10.h(2)];
        a10.r(10);
        int i11 = f38817d[a10.h(3)];
        if (a10.h(1) != 0) {
            i11++;
        }
        a10.r(3);
        int h11 = a10.h(4);
        a10.r(1);
        if (h11 > 0) {
            a10.r(6);
            if (a10.h(1) != 0) {
                i11 += 2;
            }
            a10.r(1);
        }
        if (a10.b() > 7) {
            a10.r(7);
            if (a10.h(1) != 0) {
                str3 = "audio/eac3-joc";
                a10.c();
                b10.W(a10.d());
                return new C5807s.b().e0(str).s0(str3).Q(i11).t0(i10).X(nVar).i0(str2).n0(h10).M();
            }
        }
        str3 = "audio/eac3";
        a10.c();
        b10.W(a10.d());
        return new C5807s.b().e0(str).s0(str3).Q(i11).t0(i10).X(nVar).i0(str2).n0(h10).M();
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        boolean z10 = false;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                if ((b10 & 255) == 187) {
                    z10 = true;
                }
                return 40 << ((bArr[z10 ? (char) 9 : 8] >> 4) & 7);
            }
        }
        return 0;
    }
}
