package nd;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import od.C10104a;
import od.C10105b;
import pd.C10135a;
import pd.c;

/* renamed from: nd.c  reason: case insensitive filesystem */
public final class C10084c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f75533a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int[] a(C10104a aVar, int i10, int i11) {
        int[] iArr = new int[i11];
        int j10 = aVar.j() / i10;
        for (int i12 = 0; i12 < j10; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 |= aVar.f((i12 * i10) + i14) ? 1 << ((i10 - i14) - 1) : 0;
            }
            iArr[i12] = i13;
        }
        return iArr;
    }

    private static void b(C10105b bVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 > i15) {
                    break;
                }
                bVar.j(i14, i13);
                bVar.j(i14, i15);
                bVar.j(i13, i14);
                bVar.j(i15, i14);
                i14++;
            }
        }
        int i16 = i10 - i11;
        bVar.j(i16, i16);
        int i17 = i16 + 1;
        bVar.j(i17, i16);
        bVar.j(i16, i17);
        int i18 = i10 + i11;
        bVar.j(i18, i16);
        bVar.j(i18, i17);
        bVar.j(i18, i18 - 1);
    }

    private static void c(C10105b bVar, boolean z10, int i10, C10104a aVar) {
        int i11 = i10 / 2;
        int i12 = 0;
        if (z10) {
            while (i12 < 7) {
                int i13 = (i11 - 3) + i12;
                if (aVar.f(i12)) {
                    bVar.j(i13, i11 - 5);
                }
                if (aVar.f(i12 + 7)) {
                    bVar.j(i11 + 5, i13);
                }
                if (aVar.f(20 - i12)) {
                    bVar.j(i13, i11 + 5);
                }
                if (aVar.f(27 - i12)) {
                    bVar.j(i11 - 5, i13);
                }
                i12++;
            }
            return;
        }
        while (i12 < 10) {
            int i14 = (i11 - 5) + i12 + (i12 / 5);
            if (aVar.f(i12)) {
                bVar.j(i14, i11 - 7);
            }
            if (aVar.f(i12 + 10)) {
                bVar.j(i11 + 7, i14);
            }
            if (aVar.f(29 - i12)) {
                bVar.j(i14, i11 + 7);
            }
            if (aVar.f(39 - i12)) {
                bVar.j(i11 - 7, i14);
            }
            i12++;
        }
    }

    public static C10082a d(String str, int i10, int i11, Charset charset) {
        return e(str.getBytes(charset != null ? charset : StandardCharsets.ISO_8859_1), i10, i11, charset);
    }

    public static C10082a e(byte[] bArr, int i10, int i11, Charset charset) {
        int i12;
        int i13;
        int i14;
        boolean z10;
        C10104a aVar;
        int i15;
        C10104a a10 = new C10085d(bArr, charset).a();
        int j10 = ((a10.j() * i10) / 100) + 11;
        int j11 = a10.j() + j10;
        int i16 = 32;
        int i17 = 4;
        boolean z11 = true;
        if (i11 != 0) {
            z10 = i11 < 0;
            i13 = Math.abs(i11);
            if (z10) {
                i16 = 4;
            }
            if (i13 <= i16) {
                i14 = j(i13, z10);
                i12 = f75533a[i13];
                int i18 = i14 - (i14 % i12);
                aVar = i(a10, i12);
                if (aVar.j() + j10 > i18) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                } else if (z10 && aVar.j() > i12 * 64) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i11)}));
            }
        } else {
            C10104a aVar2 = null;
            int i19 = 0;
            int i20 = 0;
            while (i19 <= 32) {
                boolean z12 = i19 <= 3 ? z11 : false;
                int i21 = z12 ? i19 + 1 : i19;
                int j12 = j(i21, z12);
                if (j11 <= j12) {
                    if (aVar2 == null || i20 != f75533a[i21]) {
                        int i22 = f75533a[i21];
                        i20 = i22;
                        aVar2 = i(a10, i22);
                    }
                    int i23 = j12 - (j12 % i20);
                    if ((!z12 || aVar2.j() <= i20 * 64) && aVar2.j() + j10 <= i23) {
                        aVar = aVar2;
                        i12 = i20;
                        z10 = z12;
                        i13 = i21;
                        i14 = j12;
                    }
                }
                i19++;
                z11 = z11;
                i17 = 4;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        C10104a f10 = f(aVar, i14, i12);
        int j13 = aVar.j() / i12;
        C10104a g10 = g(z10, i13, j13);
        int i24 = (z10 ? 11 : 14) + (i13 * 4);
        int[] iArr = new int[i24];
        int i25 = 2;
        if (z10) {
            for (int i26 = 0; i26 < i24; i26++) {
                iArr[i26] = i26;
            }
            i15 = i24;
        } else {
            int i27 = i24 / 2;
            i15 = i24 + 1 + (((i27 - 1) / 15) * 2);
            int i28 = i15 / 2;
            for (int i29 = 0; i29 < i27; i29++) {
                int i30 = (i29 / 15) + i29;
                iArr[(i27 - i29) - 1] = (i28 - i30) - 1;
                iArr[i27 + i29] = i30 + i28 + (z11 ? 1 : 0);
            }
        }
        C10105b bVar = new C10105b(i15);
        int i31 = 0;
        int i32 = 0;
        while (i31 < i13) {
            int i33 = ((i13 - i31) * i17) + (z10 ? 9 : 12);
            int i34 = 0;
            while (i34 < i33) {
                int i35 = i34 * 2;
                int i36 = 0;
                while (i36 < i25) {
                    if (f10.f(i32 + i35 + i36)) {
                        int i37 = i31 * 2;
                        bVar.j(iArr[i37 + i36], iArr[i37 + i34]);
                    }
                    if (f10.f((i33 * 2) + i32 + i35 + i36)) {
                        int i38 = i31 * 2;
                        bVar.j(iArr[i38 + i34], iArr[((i24 - 1) - i38) - i36]);
                    }
                    if (f10.f((i33 * 4) + i32 + i35 + i36)) {
                        int i39 = (i24 - 1) - (i31 * 2);
                        bVar.j(iArr[i39 - i36], iArr[i39 - i34]);
                    }
                    if (f10.f((i33 * 6) + i32 + i35 + i36)) {
                        int i40 = i31 * 2;
                        bVar.j(iArr[((i24 - 1) - i40) - i34], iArr[i40 + i36]);
                    }
                    i36++;
                    i25 = 2;
                }
                i34++;
                i25 = 2;
            }
            i32 += i33 * 8;
            i31++;
            i17 = 4;
            i25 = 2;
        }
        c(bVar, z10, i15, g10);
        if (z10) {
            b(bVar, i15 / 2, 5);
        } else {
            int i41 = i15 / 2;
            b(bVar, i41, 7);
            int i42 = 0;
            int i43 = 0;
            while (i43 < (i24 / 2) - 1) {
                for (int i44 = i41 & 1; i44 < i15; i44 += 2) {
                    int i45 = i41 - i42;
                    bVar.j(i45, i44);
                    int i46 = i41 + i42;
                    bVar.j(i46, i44);
                    bVar.j(i44, i45);
                    bVar.j(i44, i46);
                }
                i43 += 15;
                i42 += 16;
            }
        }
        C10082a aVar3 = new C10082a();
        aVar3.c(z10);
        aVar3.f(i15);
        aVar3.d(i13);
        aVar3.b(j13);
        aVar3.e(bVar);
        return aVar3;
    }

    private static C10104a f(C10104a aVar, int i10, int i11) {
        c cVar = new c(h(i11));
        int i12 = i10 / i11;
        int[] a10 = a(aVar, i11, i12);
        cVar.b(a10, i12 - (aVar.j() / i11));
        C10104a aVar2 = new C10104a();
        aVar2.c(0, i10 % i11);
        for (int c10 : a10) {
            aVar2.c(c10, i11);
        }
        return aVar2;
    }

    static C10104a g(boolean z10, int i10, int i11) {
        C10104a aVar = new C10104a();
        if (z10) {
            aVar.c(i10 - 1, 2);
            aVar.c(i11 - 1, 6);
            return f(aVar, 28, 4);
        }
        aVar.c(i10 - 1, 5);
        aVar.c(i11 - 1, 11);
        return f(aVar, 40, 4);
    }

    private static C10135a h(int i10) {
        if (i10 == 4) {
            return C10135a.f75837k;
        }
        if (i10 == 6) {
            return C10135a.f75836j;
        }
        if (i10 == 8) {
            return C10135a.f75840n;
        }
        if (i10 == 10) {
            return C10135a.f75835i;
        }
        if (i10 == 12) {
            return C10135a.f75834h;
        }
        throw new IllegalArgumentException("Unsupported word size " + i10);
    }

    static C10104a i(C10104a aVar, int i10) {
        C10104a aVar2 = new C10104a();
        int j10 = aVar.j();
        int i11 = (1 << i10) - 2;
        int i12 = 0;
        while (i12 < j10) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = i12 + i14;
                if (i15 >= j10 || aVar.f(i15)) {
                    i13 |= 1 << ((i10 - 1) - i14);
                }
            }
            int i16 = i13 & i11;
            if (i16 == i11) {
                aVar2.c(i16, i10);
            } else if (i16 == 0) {
                aVar2.c(i13 | 1, i10);
            } else {
                aVar2.c(i13, i10);
                i12 += i10;
            }
            i12--;
            i12 += i10;
        }
        return aVar2;
    }

    private static int j(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 * 16)) * i10;
    }
}
