package N3;

import N3.O;
import t3.B;
import t3.C5950a;
import t3.q;

/* renamed from: N3.f  reason: case insensitive filesystem */
public final class C6668f {
    public static void a(long j10, B b10, O[] oArr) {
        while (true) {
            boolean z10 = true;
            if (b10.a() > 1) {
                int c10 = c(b10);
                int c11 = c(b10);
                int f10 = b10.f() + c11;
                if (c11 == -1 || c11 > b10.a()) {
                    q.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    f10 = b10.g();
                } else if (c10 == 4 && c11 >= 8) {
                    int H10 = b10.H();
                    int P10 = b10.P();
                    int q10 = P10 == 49 ? b10.q() : 0;
                    int H11 = b10.H();
                    if (P10 == 47) {
                        b10.X(1);
                    }
                    boolean z11 = H10 == 181 && (P10 == 49 || P10 == 47) && H11 == 3;
                    if (P10 == 49) {
                        if (q10 != 1195456820) {
                            z10 = false;
                        }
                        z11 &= z10;
                    }
                    if (z11) {
                        b(j10, b10, oArr);
                    }
                }
                b10.W(f10);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, B b10, O[] oArr) {
        B b11 = b10;
        O[] oArr2 = oArr;
        int H10 = b10.H();
        if ((H10 & 64) != 0) {
            b11.X(1);
            int i10 = (H10 & 31) * 3;
            int f10 = b10.f();
            for (O o10 : oArr2) {
                b11.W(f10);
                o10.a(b11, i10);
                C5950a.g(j10 != -9223372036854775807L);
                o10.c(j10, 1, i10, 0, (O.a) null);
            }
        }
    }

    private static int c(B b10) {
        int i10 = 0;
        while (b10.a() != 0) {
            int H10 = b10.H();
            i10 += H10;
            if (H10 != 255) {
                return i10;
            }
        }
        return -1;
    }
}
