package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.v  reason: case insensitive filesystem */
final class C7229v {
    static int a(int i10, byte[] bArr, int i11, int i12, C7232w wVar) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                return g(bArr, i11, wVar);
            }
            if (i13 == 1) {
                return i11 + 8;
            }
            if (i13 == 2) {
                return e(bArr, i11, wVar) + wVar.f48493a;
            }
            if (i13 == 3) {
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (i11 < i12) {
                    i11 = e(bArr, i11, wVar);
                    i15 = wVar.f48493a;
                    if (i15 == i14) {
                        break;
                    }
                    i11 = a(i15, bArr, i11, i12, wVar);
                }
                if (i11 <= i12 && i15 == i14) {
                    return i11;
                }
                throw C7204m0.d();
            } else if (i13 == 5) {
                return i11 + 4;
            } else {
                throw C7204m0.b();
            }
        } else {
            throw C7204m0.b();
        }
    }

    static int b(int i10, byte[] bArr, int i11, int i12, C7201l0<?> l0Var, C7232w wVar) {
        C7189h0 h0Var = (C7189h0) l0Var;
        int e10 = e(bArr, i11, wVar);
        while (true) {
            h0Var.i(wVar.f48493a);
            if (e10 >= i12) {
                break;
            }
            int e11 = e(bArr, e10, wVar);
            if (i10 != wVar.f48493a) {
                break;
            }
            e10 = e(bArr, e11, wVar);
        }
        return e10;
    }

    static int c(int i10, byte[] bArr, int i11, int i12, C7234w1 w1Var, C7232w wVar) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int g10 = g(bArr, i11, wVar);
                w1Var.e(i10, Long.valueOf(wVar.f48494b));
                return g10;
            } else if (i13 == 1) {
                w1Var.e(i10, Long.valueOf(k(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int e10 = e(bArr, i11, wVar);
                int i14 = wVar.f48493a;
                w1Var.e(i10, i14 == 0 ? A.f48133b : A.r(bArr, e10, i14));
                return e10 + i14;
            } else if (i13 == 3) {
                C7234w1 i15 = C7234w1.i();
                int i16 = (i10 & -8) | 4;
                int i17 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int e11 = e(bArr, i11, wVar);
                    int i18 = wVar.f48493a;
                    i17 = i18;
                    if (i18 == i16) {
                        i11 = e11;
                        break;
                    }
                    int c10 = c(i17, bArr, e11, i12, i15, wVar);
                    i17 = i18;
                    i11 = c10;
                }
                if (i11 > i12 || i17 != i16) {
                    throw C7204m0.d();
                }
                w1Var.e(i10, i15);
                return i11;
            } else if (i13 == 5) {
                w1Var.e(i10, Integer.valueOf(h(bArr, i11)));
                return i11 + 4;
            } else {
                throw C7204m0.b();
            }
        } else {
            throw C7204m0.b();
        }
    }

    static int d(int i10, byte[] bArr, int i11, C7232w wVar) {
        int i12;
        int i13 = i10 & 127;
        int i14 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            i12 = b10 << 7;
        } else {
            int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
            int i16 = i11 + 2;
            byte b11 = bArr[i14];
            if (b11 >= 0) {
                wVar.f48493a = i15 | (b11 << 14);
                return i16;
            }
            i13 = i15 | ((b11 & Byte.MAX_VALUE) << 14);
            i14 = i11 + 3;
            byte b12 = bArr[i16];
            if (b12 >= 0) {
                i12 = b12 << 21;
            } else {
                int i17 = i13 | ((b12 & Byte.MAX_VALUE) << 21);
                int i18 = i11 + 4;
                byte b13 = bArr[i14];
                if (b13 >= 0) {
                    wVar.f48493a = i17 | (b13 << 28);
                    return i18;
                }
                int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
                while (true) {
                    int i20 = i18 + 1;
                    if (bArr[i18] >= 0) {
                        wVar.f48493a = i19;
                        return i20;
                    }
                    i18 = i20;
                }
            }
        }
        wVar.f48493a = i13 | i12;
        return i14;
    }

    static int e(byte[] bArr, int i10, C7232w wVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return d(b10, bArr, i11, wVar);
        }
        wVar.f48493a = b10;
        return i11;
    }

    static int f(byte[] bArr, int i10, C7201l0<?> l0Var, C7232w wVar) {
        C7189h0 h0Var = (C7189h0) l0Var;
        int e10 = e(bArr, i10, wVar);
        int i11 = wVar.f48493a + e10;
        while (e10 < i11) {
            e10 = e(bArr, e10, wVar);
            h0Var.i(wVar.f48493a);
        }
        if (e10 == i11) {
            return e10;
        }
        throw C7204m0.a();
    }

    static int g(byte[] bArr, int i10, C7232w wVar) {
        int i11 = i10 + 1;
        long j10 = (long) bArr[i10];
        if (j10 >= 0) {
            wVar.f48494b = j10;
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
        wVar.f48494b = j11;
        return i12;
    }

    static int h(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int i(byte[] bArr, int i10, C7232w wVar) {
        int e10 = e(bArr, i10, wVar);
        int i11 = wVar.f48493a;
        if (i11 == 0) {
            wVar.f48495c = "";
            return e10;
        }
        wVar.f48495c = new String(bArr, e10, i11, C7192i0.f48408a);
        return e10 + i11;
    }

    static int j(byte[] bArr, int i10, C7232w wVar) {
        int e10 = e(bArr, i10, wVar);
        int i11 = wVar.f48493a;
        if (i11 == 0) {
            wVar.f48495c = "";
            return e10;
        }
        int i12 = e10 + i11;
        if (E1.i(bArr, e10, i12)) {
            wVar.f48495c = new String(bArr, e10, i11, C7192i0.f48408a);
            return i12;
        }
        throw C7204m0.e();
    }

    static long k(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    static double l(byte[] bArr, int i10) {
        return Double.longBitsToDouble(k(bArr, i10));
    }

    static int m(byte[] bArr, int i10, C7232w wVar) {
        int e10 = e(bArr, i10, wVar);
        int i11 = wVar.f48493a;
        if (i11 == 0) {
            wVar.f48495c = A.f48133b;
            return e10;
        }
        wVar.f48495c = A.r(bArr, e10, i11);
        return e10 + i11;
    }

    static float n(byte[] bArr, int i10) {
        return Float.intBitsToFloat(h(bArr, i10));
    }
}
