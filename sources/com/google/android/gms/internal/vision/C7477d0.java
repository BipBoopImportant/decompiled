package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.d0  reason: case insensitive filesystem */
final class C7477d0 {
    static int a(int i10, byte[] bArr, int i11, int i12, C7481e0 e0Var) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                return k(bArr, i11, e0Var);
            }
            if (i13 == 1) {
                return i11 + 8;
            }
            if (i13 == 2) {
                return i(bArr, i11, e0Var) + e0Var.f49310a;
            }
            if (i13 == 3) {
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (i11 < i12) {
                    i11 = i(bArr, i11, e0Var);
                    i15 = e0Var.f49310a;
                    if (i15 == i14) {
                        break;
                    }
                    i11 = a(i15, bArr, i11, i12, e0Var);
                }
                if (i11 <= i12 && i15 == i14) {
                    return i11;
                }
                throw Z0.e();
            } else if (i13 == 5) {
                return i11 + 4;
            } else {
                throw Z0.c();
            }
        } else {
            throw Z0.c();
        }
    }

    static int b(int i10, byte[] bArr, int i11, int i12, C7466a1<?> a1Var, C7481e0 e0Var) {
        S0 s02 = (S0) a1Var;
        int i13 = i(bArr, i11, e0Var);
        s02.j(e0Var.f49310a);
        while (i13 < i12) {
            int i14 = i(bArr, i13, e0Var);
            if (i10 != e0Var.f49310a) {
                break;
            }
            i13 = i(bArr, i14, e0Var);
            s02.j(e0Var.f49310a);
        }
        return i13;
    }

    static int c(int i10, byte[] bArr, int i11, int i12, C7515m2 m2Var, C7481e0 e0Var) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int k10 = k(bArr, i11, e0Var);
                m2Var.c(i10, Long.valueOf(e0Var.f49311b));
                return k10;
            } else if (i13 == 1) {
                m2Var.c(i10, Long.valueOf(l(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int i14 = i(bArr, i11, e0Var);
                int i15 = e0Var.f49310a;
                if (i15 < 0) {
                    throw Z0.b();
                } else if (i15 <= bArr.length - i14) {
                    if (i15 == 0) {
                        m2Var.c(i10, C7497i0.f49335b);
                    } else {
                        m2Var.c(i10, C7497i0.q(bArr, i14, i15));
                    }
                    return i14 + i15;
                } else {
                    throw Z0.a();
                }
            } else if (i13 == 3) {
                C7515m2 g10 = C7515m2.g();
                int i16 = (i10 & -8) | 4;
                int i17 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int i18 = i(bArr, i11, e0Var);
                    int i19 = e0Var.f49310a;
                    i17 = i19;
                    if (i19 == i16) {
                        i11 = i18;
                        break;
                    }
                    int c10 = c(i17, bArr, i18, i12, g10, e0Var);
                    i17 = i19;
                    i11 = c10;
                }
                if (i11 > i12 || i17 != i16) {
                    throw Z0.e();
                }
                m2Var.c(i10, g10);
                return i11;
            } else if (i13 == 5) {
                m2Var.c(i10, Integer.valueOf(h(bArr, i11)));
                return i11 + 4;
            } else {
                throw Z0.c();
            }
        } else {
            throw Z0.c();
        }
    }

    static int d(int i10, byte[] bArr, int i11, C7481e0 e0Var) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            e0Var.f49310a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            e0Var.f49310a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            e0Var.f49310a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            e0Var.f49310a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                e0Var.f49310a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int e(S1<?> s12, int i10, byte[] bArr, int i11, int i12, C7466a1<?> a1Var, C7481e0 e0Var) {
        int g10 = g(s12, bArr, i11, i12, e0Var);
        a1Var.add(e0Var.f49312c);
        while (g10 < i12) {
            int i13 = i(bArr, g10, e0Var);
            if (i10 != e0Var.f49310a) {
                break;
            }
            g10 = g(s12, bArr, i13, i12, e0Var);
            a1Var.add(e0Var.f49312c);
        }
        return g10;
    }

    static int f(S1 s12, byte[] bArr, int i10, int i11, int i12, C7481e0 e0Var) {
        E1 e12 = (E1) s12;
        Object zza = e12.zza();
        int k10 = e12.k(zza, bArr, i10, i11, i12, e0Var);
        e12.d(zza);
        e0Var.f49312c = zza;
        return k10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int g(com.google.android.gms.internal.vision.S1 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.vision.C7481e0 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = d(r8, r7, r0, r10)
            int r8 = r10.f49310a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zza()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.e(r1, r2, r3, r4, r5)
            r6.d(r9)
            r10.f49312c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.vision.Z0 r6 = com.google.android.gms.internal.vision.Z0.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C7477d0.g(com.google.android.gms.internal.vision.S1, byte[], int, int, com.google.android.gms.internal.vision.e0):int");
    }

    static int h(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int i(byte[] bArr, int i10, C7481e0 e0Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return d(b10, bArr, i11, e0Var);
        }
        e0Var.f49310a = b10;
        return i11;
    }

    static int j(byte[] bArr, int i10, C7466a1<?> a1Var, C7481e0 e0Var) {
        S0 s02 = (S0) a1Var;
        int i11 = i(bArr, i10, e0Var);
        int i12 = e0Var.f49310a + i11;
        while (i11 < i12) {
            i11 = i(bArr, i11, e0Var);
            s02.j(e0Var.f49310a);
        }
        if (i11 == i12) {
            return i11;
        }
        throw Z0.a();
    }

    static int k(byte[] bArr, int i10, C7481e0 e0Var) {
        int i11 = i10 + 1;
        long j10 = (long) bArr[i10];
        if (j10 >= 0) {
            e0Var.f49311b = j10;
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
        e0Var.f49311b = j11;
        return i12;
    }

    static long l(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    static double m(byte[] bArr, int i10) {
        return Double.longBitsToDouble(l(bArr, i10));
    }

    static int n(byte[] bArr, int i10, C7481e0 e0Var) {
        int i11 = i(bArr, i10, e0Var);
        int i12 = e0Var.f49310a;
        if (i12 < 0) {
            throw Z0.b();
        } else if (i12 == 0) {
            e0Var.f49312c = "";
            return i11;
        } else {
            e0Var.f49312c = new String(bArr, i11, i12, U0.f49276a);
            return i11 + i12;
        }
    }

    static float o(byte[] bArr, int i10) {
        return Float.intBitsToFloat(h(bArr, i10));
    }

    static int p(byte[] bArr, int i10, C7481e0 e0Var) {
        int i11 = i(bArr, i10, e0Var);
        int i12 = e0Var.f49310a;
        if (i12 < 0) {
            throw Z0.b();
        } else if (i12 == 0) {
            e0Var.f49312c = "";
            return i11;
        } else {
            e0Var.f49312c = t2.k(bArr, i11, i12);
            return i11 + i12;
        }
    }

    static int q(byte[] bArr, int i10, C7481e0 e0Var) {
        int i11 = i(bArr, i10, e0Var);
        int i12 = e0Var.f49310a;
        if (i12 < 0) {
            throw Z0.b();
        } else if (i12 > bArr.length - i11) {
            throw Z0.a();
        } else if (i12 == 0) {
            e0Var.f49312c = C7497i0.f49335b;
            return i11;
        } else {
            e0Var.f49312c = C7497i0.q(bArr, i11, i12);
            return i11 + i12;
        }
    }
}
