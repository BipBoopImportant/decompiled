package nb;

import jb.l;

/* renamed from: nb.i  reason: case insensitive filesystem */
public final class C10079i {
    public static byte a(long j10) {
        l.g((j10 >> 8) == 0, "out of range: %s", j10);
        return (byte) ((int) j10);
    }

    public static int b(byte b10) {
        return b10 & 255;
    }
}
