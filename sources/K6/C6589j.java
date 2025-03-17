package K6;

import android.os.SystemClock;

/* renamed from: K6.j  reason: case insensitive filesystem */
public final class C6589j {
    public static long a(long j10, int i10) {
        long uptimeMillis = SystemClock.uptimeMillis();
        int i11 = (int) j10;
        int i12 = (int) (j10 >> 32);
        int i13 = 0;
        while (i13 < 16) {
            i13++;
            int i14 = i11;
            i11 = i12 ^ (((i10 << i13) | (i10 >>> (32 - i13))) ^ i11);
            i12 = i14;
        }
        long j11 = (((long) i12) << 32) | (((long) i11) & 4294967295L);
        C6595p.c("FeistelCipher", "FeistelCipherEncode-Time: " + (SystemClock.uptimeMillis() - uptimeMillis) + "ms", new Throwable[0]);
        return j11;
    }
}
