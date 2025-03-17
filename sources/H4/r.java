package h4;

import N3.C6679q;
import N3.N;
import t3.B;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f51591a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f51591a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static N b(C6679q qVar) {
        return c(qVar, true, false);
    }

    private static N c(C6679q qVar, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        int[] iArr;
        C6679q qVar2 = qVar;
        boolean z15 = z11;
        long length = qVar.getLength();
        long j10 = -1;
        int i11 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        long j11 = 4096;
        if (i11 != 0 && length <= 4096) {
            j11 = length;
        }
        int i12 = (int) j11;
        B b10 = new B(64);
        boolean z16 = false;
        int i13 = 0;
        boolean z17 = false;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            b10.S(8);
            if (!qVar2.d(b10.e(), z16 ? 1 : 0, 8, true)) {
                break;
            }
            long J10 = b10.J();
            int q10 = b10.q();
            if (J10 == 1) {
                qVar2.o(b10.e(), 8, 8);
                i10 = 16;
                b10.V(16);
                J10 = b10.A();
            } else {
                if (J10 == 0) {
                    long length2 = qVar.getLength();
                    if (length2 != j10) {
                        J10 = (length2 - qVar.h()) + ((long) 8);
                    }
                }
                i10 = 8;
            }
            long j12 = J10;
            long j13 = (long) i10;
            if (j12 < j13) {
                return new C7924a(q10, j12, i10);
            }
            i13 += i10;
            if (q10 == 1836019574) {
                i12 += (int) j12;
                if (i11 != 0 && ((long) i12) > length) {
                    i12 = (int) length;
                }
            } else if (q10 == 1836019558 || q10 == 1836475768) {
                z12 = true;
            } else {
                long j14 = length;
                if (q10 == 1835295092) {
                    z17 = true;
                }
                int i14 = i13;
                if ((((long) i13) + j12) - j13 >= ((long) i12)) {
                    z12 = false;
                    break;
                }
                int i15 = (int) (j12 - j13);
                i13 = i14 + i15;
                if (q10 != 1718909296) {
                    z13 = false;
                    if (i15 != 0) {
                        qVar2.i(i15);
                    }
                } else if (i15 < 8) {
                    return new C7924a(q10, (long) i15, 8);
                } else {
                    b10.S(i15);
                    z13 = false;
                    qVar2.o(b10.e(), 0, i15);
                    int q11 = b10.q();
                    if (a(q11, z15)) {
                        z17 = true;
                    }
                    b10.X(4);
                    int a10 = b10.a() / 4;
                    if (!z17 && a10 > 0) {
                        iArr = new int[a10];
                        int i16 = 0;
                        while (true) {
                            if (i16 >= a10) {
                                z14 = z17;
                                break;
                            }
                            int q12 = b10.q();
                            iArr[i16] = q12;
                            if (a(q12, z15)) {
                                z14 = true;
                                break;
                            }
                            i16++;
                        }
                    } else {
                        z14 = z17;
                        iArr = null;
                    }
                    if (!z14) {
                        return new w(q11, iArr);
                    }
                    z17 = z14;
                }
                z16 = z13;
                length = j14;
            }
            j10 = -1;
        }
        z12 = z16;
        if (!z17) {
            return n.f51578a;
        }
        if (z10 != z12) {
            return z12 ? i.f51537b : i.f51538c;
        }
        return null;
    }

    public static N d(C6679q qVar, boolean z10) {
        return c(qVar, false, z10);
    }
}
