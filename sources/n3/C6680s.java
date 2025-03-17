package N3;

import java.io.EOFException;
import q3.B;

/* renamed from: N3.s  reason: case insensitive filesystem */
public final class C6680s {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw B.a(str, (Throwable) null);
        }
    }

    public static boolean b(C6679q qVar, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return qVar.d(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(C6679q qVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int j10 = qVar.j(bArr, i10 + i12, i11 - i12);
            if (j10 == -1) {
                break;
            }
            i12 += j10;
        }
        return i12;
    }

    public static boolean d(C6679q qVar, byte[] bArr, int i10, int i11) {
        try {
            qVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(C6679q qVar, int i10) {
        try {
            qVar.k(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
