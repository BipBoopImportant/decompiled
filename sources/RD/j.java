package rd;

import java.util.Arrays;
import ld.C10009b;

public final class j {
    public static int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = i10;
        while (i11 < length && f(charSequence.charAt(i11))) {
            i11++;
        }
        return i11 - i10;
    }

    public static String b(String str, m mVar, C10009b bVar, C10009b bVar2, boolean z10) {
        c cVar = new c();
        int i10 = 0;
        g[] gVarArr = {new C10215a(), cVar, new n(), new o(), new f(), new b()};
        h hVar = new h(str);
        hVar.n(mVar);
        hVar.l(bVar, bVar2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.r(236);
            hVar.m(2);
            hVar.f76390f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.r(237);
            hVar.m(2);
            hVar.f76390f += 7;
        }
        if (z10) {
            cVar.d(hVar);
            i10 = hVar.e();
            hVar.j();
        }
        while (hVar.i()) {
            gVarArr[i10].a(hVar);
            if (hVar.e() >= 0) {
                i10 = hVar.e();
                hVar.j();
            }
        }
        int a10 = hVar.a();
        hVar.p();
        int a11 = hVar.g().a();
        if (!(a10 >= a11 || i10 == 0 || i10 == 5 || i10 == 4)) {
            hVar.r(254);
        }
        StringBuilder b10 = hVar.b();
        if (b10.length() < a11) {
            b10.append(129);
        }
        while (b10.length() < a11) {
            b10.append(r(b10.length() + 1));
        }
        return hVar.b().toString();
    }

    private static int c(float[] fArr, int[] iArr, int i10, byte[] bArr) {
        for (int i11 = 0; i11 < 6; i11++) {
            int ceil = (int) Math.ceil((double) fArr[i11]);
            iArr[i11] = ceil;
            if (i10 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i10 = ceil;
            }
            if (i10 == ceil) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    private static int d(byte[] bArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 += bArr[i11];
        }
        return i10;
    }

    static void e(char c10) {
        String hexString = Integer.toHexString(c10);
        throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    static boolean f(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    static boolean g(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    static boolean h(char c10) {
        return c10 == ' ' || (c10 >= '0' && c10 <= '9') || (c10 >= 'A' && c10 <= 'Z');
    }

    static boolean i(char c10) {
        return c10 >= ' ' && c10 <= '^';
    }

    static boolean j(char c10) {
        return c10 == ' ' || (c10 >= '0' && c10 <= '9') || (c10 >= 'a' && c10 <= 'z');
    }

    static boolean k(char c10) {
        return m(c10) || c10 == ' ' || (c10 >= '0' && c10 <= '9') || (c10 >= 'A' && c10 <= 'Z');
    }

    private static boolean l(char c10) {
        return false;
    }

    private static boolean m(char c10) {
        return c10 == 13 || c10 == '*' || c10 == '>';
    }

    static int n(CharSequence charSequence, int i10, int i11) {
        int o10 = o(charSequence, i10, i11);
        if (i11 == 3 && o10 == 3) {
            int min = Math.min(i10 + 3, charSequence.length());
            while (i10 < min) {
                if (!k(charSequence.charAt(i10))) {
                    return 0;
                }
                i10++;
            }
        } else if (i11 == 4 && o10 == 4) {
            int min2 = Math.min(i10 + 4, charSequence.length());
            while (i10 < min2) {
                if (!i(charSequence.charAt(i10))) {
                    return 0;
                }
                i10++;
            }
        }
        return o10;
    }

    static int o(CharSequence charSequence, int i10, int i11) {
        float[] fArr;
        int i12;
        int i13;
        int i14;
        int i15;
        CharSequence charSequence2 = charSequence;
        int i16 = i10;
        if (i16 >= charSequence.length()) {
            return i11;
        }
        float f10 = 2.0f;
        int i17 = 5;
        int i18 = 2;
        int i19 = 4;
        int i20 = 3;
        if (i11 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i11] = 0.0f;
        }
        byte[] bArr = new byte[6];
        int[] iArr = new int[6];
        int i21 = 0;
        while (true) {
            int i22 = i16 + i21;
            if (i22 == charSequence.length()) {
                Arrays.fill(bArr, (byte) 0);
                Arrays.fill(iArr, 0);
                int c10 = c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int d10 = d(bArr);
                if (iArr[0] == c10) {
                    return 0;
                }
                if (d10 == 1) {
                    if (bArr[i17] > 0) {
                        return i17;
                    }
                    if (bArr[i19] > 0) {
                        return i19;
                    }
                    if (bArr[i18] > 0) {
                        return i18;
                    }
                    if (bArr[i20] > 0) {
                        return i20;
                    }
                }
                return 1;
            }
            char charAt = charSequence2.charAt(i22);
            i21++;
            if (f(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (g(charAt)) {
                float ceil = (float) Math.ceil((double) fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + f10;
            } else {
                float ceil2 = (float) Math.ceil((double) fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (h(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (j(charAt)) {
                fArr[i18] = fArr[i18] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[i18] = fArr[i18] + 2.6666667f;
            } else {
                fArr[i18] = fArr[i18] + 1.3333334f;
            }
            if (k(charAt)) {
                fArr[i20] = fArr[i20] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[i20] = fArr[i20] + 4.3333335f;
            } else {
                fArr[i20] = fArr[i20] + 3.3333333f;
            }
            if (i(charAt)) {
                fArr[i19] = fArr[i19] + 0.75f;
            } else if (g(charAt)) {
                fArr[i19] = fArr[i19] + 4.25f;
            } else {
                fArr[i19] = fArr[i19] + 3.25f;
            }
            if (l(charAt)) {
                i12 = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                i12 = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i21 >= i19) {
                Arrays.fill(bArr, (byte) 0);
                Arrays.fill(iArr, 0);
                c(fArr, iArr, Integer.MAX_VALUE, bArr);
                if (iArr[0] < q(iArr[i12], iArr[1], iArr[i18], iArr[i20], iArr[i19])) {
                    return 0;
                }
                int i23 = iArr[i12];
                if (i23 < iArr[0] || i23 + 1 < p(iArr[1], iArr[2], iArr[3], iArr[i19])) {
                    return 5;
                }
                if (iArr[i19] + 1 < q(iArr[5], iArr[1], iArr[2], iArr[3], iArr[0])) {
                    return i19;
                }
                if (iArr[2] + 1 < q(iArr[5], iArr[1], iArr[i19], iArr[3], iArr[0])) {
                    return 2;
                }
                if (iArr[3] + 1 < q(iArr[5], iArr[1], iArr[4], iArr[2], iArr[0])) {
                    return 3;
                }
                i14 = 4;
                i13 = 2;
                if (iArr[1] + 1 < p(iArr[0], iArr[5], iArr[4], iArr[2])) {
                    int i24 = iArr[1];
                    int i25 = iArr[3];
                    if (i24 < i25) {
                        return 1;
                    }
                    if (i24 == i25) {
                        for (int i26 = i16 + i21 + 1; i26 < charSequence.length(); i26++) {
                            char charAt2 = charSequence2.charAt(i26);
                            if (m(charAt2)) {
                                return 3;
                            }
                            if (!k(charAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                    i15 = 3;
                } else {
                    i15 = 3;
                }
                i17 = 5;
            } else {
                i17 = i12;
                i14 = i19;
                i15 = i20;
                i13 = i18;
            }
            i19 = i14;
            i18 = i13;
            i20 = i15;
            f10 = 2.0f;
        }
    }

    private static int p(int i10, int i11, int i12, int i13) {
        return Math.min(i10, Math.min(i11, Math.min(i12, i13)));
    }

    private static int q(int i10, int i11, int i12, int i13, int i14) {
        return Math.min(p(i10, i11, i12, i13), i14);
    }

    private static char r(int i10) {
        int i11 = (i10 * 149) % 253;
        int i12 = i11 + 130;
        if (i12 > 254) {
            i12 = i11 - 124;
        }
        return (char) i12;
    }
}
