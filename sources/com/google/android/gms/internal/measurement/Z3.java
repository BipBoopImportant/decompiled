package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

final class Z3 {

    /* renamed from: a  reason: collision with root package name */
    private static volatile int f48841a = 100;

    static double a(byte[] bArr, int i10) {
        return Double.longBitsToDouble(u(bArr, i10));
    }

    static int b(int i10, byte[] bArr, int i11, int i12, Y3 y32) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                return t(bArr, i11, y32);
            }
            if (i13 == 1) {
                return i11 + 8;
            }
            if (i13 == 2) {
                return s(bArr, i11, y32) + y32.f48829a;
            }
            if (i13 == 3) {
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (i11 < i12) {
                    i11 = s(bArr, i11, y32);
                    i15 = y32.f48829a;
                    if (i15 == i14) {
                        break;
                    }
                    i11 = b(i15, bArr, i11, i12, y32);
                }
                if (i11 <= i12 && i15 == i14) {
                    return i11;
                }
                throw U4.e();
            } else if (i13 == 5) {
                return i11 + 4;
            } else {
                throw U4.b();
            }
        } else {
            throw U4.b();
        }
    }

    static int c(int i10, byte[] bArr, int i11, int i12, R4<?> r42, Y3 y32) {
        M4 m42 = (M4) r42;
        int s10 = s(bArr, i11, y32);
        m42.k(y32.f48829a);
        while (s10 < i12) {
            int s11 = s(bArr, s10, y32);
            if (i10 != y32.f48829a) {
                break;
            }
            s10 = s(bArr, s11, y32);
            m42.k(y32.f48829a);
        }
        return s10;
    }

    static int d(int i10, byte[] bArr, int i11, int i12, C7269c6 c6Var, Y3 y32) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int t10 = t(bArr, i11, y32);
                c6Var.e(i10, Long.valueOf(y32.f48830b));
                return t10;
            } else if (i13 == 1) {
                c6Var.e(i10, Long.valueOf(u(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int s10 = s(bArr, i11, y32);
                int i14 = y32.f48829a;
                if (i14 < 0) {
                    throw U4.d();
                } else if (i14 <= bArr.length - s10) {
                    if (i14 == 0) {
                        c6Var.e(i10, C7276d4.f48892b);
                    } else {
                        c6Var.e(i10, C7276d4.r(bArr, s10, i14));
                    }
                    return s10 + i14;
                } else {
                    throw U4.g();
                }
            } else if (i13 == 3) {
                C7269c6 l10 = C7269c6.l();
                int i15 = (i10 & -8) | 4;
                int i16 = y32.f48833e + 1;
                y32.f48833e = i16;
                n(i16);
                int i17 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int s11 = s(bArr, i11, y32);
                    int i18 = y32.f48829a;
                    i17 = i18;
                    if (i18 == i15) {
                        i11 = s11;
                        break;
                    }
                    int d10 = d(i17, bArr, s11, i12, l10, y32);
                    i17 = i18;
                    i11 = d10;
                }
                y32.f48833e--;
                if (i11 > i12 || i17 != i15) {
                    throw U4.e();
                }
                c6Var.e(i10, l10);
                return i11;
            } else if (i13 == 5) {
                c6Var.e(i10, Integer.valueOf(r(bArr, i11)));
                return i11 + 4;
            } else {
                throw U4.b();
            }
        } else {
            throw U4.b();
        }
    }

    static int e(int i10, byte[] bArr, int i11, int i12, Object obj, C7406s5 s5Var, Z5<C7269c6, C7269c6> z52, Y3 y32) {
        if (y32.f48832d.b(s5Var, i10 >>> 3) == null) {
            return d(i10, bArr, i11, i12, C7438w5.E(obj), y32);
        }
        L4.b bVar = (L4.b) obj;
        bVar.J();
        A4<L4.e> a42 = bVar.zzc;
        throw new NoSuchMethodError();
    }

    static int f(int i10, byte[] bArr, int i11, Y3 y32) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            y32.f48829a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            y32.f48829a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            y32.f48829a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            y32.f48829a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                y32.f48829a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int g(K5<?> k52, int i10, byte[] bArr, int i11, int i12, R4<Object> r42, Y3 y32) {
        int i13 = (i10 & -8) | 4;
        int h10 = h(k52, bArr, i11, i12, i13, y32);
        r42.add(y32.f48831c);
        while (h10 < i12) {
            int s10 = s(bArr, h10, y32);
            if (i10 != y32.f48829a) {
                break;
            }
            h10 = h(k52, bArr, s10, i12, i13, y32);
            r42.add(y32.f48831c);
        }
        return h10;
    }

    private static <T> int h(K5<T> k52, byte[] bArr, int i10, int i11, int i12, Y3 y32) {
        T zza = k52.zza();
        int j10 = j(zza, k52, bArr, i10, i11, i12, y32);
        k52.zzd(zza);
        y32.f48831c = zza;
        return j10;
    }

    static <T> int i(K5<T> k52, byte[] bArr, int i10, int i11, Y3 y32) {
        T zza = k52.zza();
        int k10 = k(zza, k52, bArr, i10, i11, y32);
        k52.zzd(zza);
        y32.f48831c = zza;
        return k10;
    }

    static <T> int j(Object obj, K5<T> k52, byte[] bArr, int i10, int i11, int i12, Y3 y32) {
        int i13 = y32.f48833e + 1;
        y32.f48833e = i13;
        n(i13);
        int i14 = ((C7438w5) k52).i(obj, bArr, i10, i11, i12, y32);
        y32.f48833e--;
        y32.f48831c = obj;
        return i14;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> int k(java.lang.Object r6, com.google.android.gms.internal.measurement.K5<T> r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.measurement.Y3 r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = f(r9, r8, r0, r11)
            int r9 = r11.f48829a
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x002d
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x002d
            int r10 = r11.f48833e
            int r10 = r10 + 1
            r11.f48833e = r10
            n(r10)
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.e(r1, r2, r3, r4, r5)
            int r7 = r11.f48833e
            int r7 = r7 + -1
            r11.f48833e = r7
            r11.f48831c = r6
            return r9
        L_0x002d:
            com.google.android.gms.internal.measurement.U4 r6 = com.google.android.gms.internal.measurement.U4.g()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Z3.k(java.lang.Object, com.google.android.gms.internal.measurement.K5, byte[], int, int, com.google.android.gms.internal.measurement.Y3):int");
    }

    static int l(byte[] bArr, int i10, Y3 y32) {
        int s10 = s(bArr, i10, y32);
        int i11 = y32.f48829a;
        if (i11 < 0) {
            throw U4.d();
        } else if (i11 > bArr.length - s10) {
            throw U4.g();
        } else if (i11 == 0) {
            y32.f48831c = C7276d4.f48892b;
            return s10;
        } else {
            y32.f48831c = C7276d4.r(bArr, s10, i11);
            return s10 + i11;
        }
    }

    static int m(byte[] bArr, int i10, R4<?> r42, Y3 y32) {
        M4 m42 = (M4) r42;
        int s10 = s(bArr, i10, y32);
        int i11 = y32.f48829a + s10;
        while (s10 < i11) {
            s10 = s(bArr, s10, y32);
            m42.k(y32.f48829a);
        }
        if (s10 == i11) {
            return s10;
        }
        throw U4.g();
    }

    private static void n(int i10) {
        if (i10 >= f48841a) {
            throw U4.f();
        }
    }

    static float o(byte[] bArr, int i10) {
        return Float.intBitsToFloat(r(bArr, i10));
    }

    static int p(K5<?> k52, int i10, byte[] bArr, int i11, int i12, R4<?> r42, Y3 y32) {
        int i13 = i(k52, bArr, i11, i12, y32);
        r42.add(y32.f48831c);
        while (i13 < i12) {
            int s10 = s(bArr, i13, y32);
            if (i10 != y32.f48829a) {
                break;
            }
            i13 = i(k52, bArr, s10, i12, y32);
            r42.add(y32.f48831c);
        }
        return i13;
    }

    static int q(byte[] bArr, int i10, Y3 y32) {
        int s10 = s(bArr, i10, y32);
        int i11 = y32.f48829a;
        if (i11 < 0) {
            throw U4.d();
        } else if (i11 == 0) {
            y32.f48831c = "";
            return s10;
        } else {
            y32.f48831c = C7305g6.d(bArr, s10, i11);
            return s10 + i11;
        }
    }

    static int r(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int s(byte[] bArr, int i10, Y3 y32) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return f(b10, bArr, i11, y32);
        }
        y32.f48829a = b10;
        return i11;
    }

    static int t(byte[] bArr, int i10, Y3 y32) {
        int i11 = i10 + 1;
        long j10 = (long) bArr[i10];
        if (j10 >= 0) {
            y32.f48830b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & Byte.MAX_VALUE)) << i13;
            int i15 = i14;
            b10 = b11;
            i12 = i15;
        }
        y32.f48830b = j11;
        return i12;
    }

    static long u(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }
}
