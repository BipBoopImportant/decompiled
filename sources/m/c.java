package M;

import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.a;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final LargeJpegImageQuirk f9064a = ((LargeJpegImageQuirk) a.b(LargeJpegImageQuirk.class));

    public static int a(byte[] bArr) {
        byte b10;
        int i10 = 2;
        while (i10 + 4 <= bArr.length && (b10 = bArr[i10]) == -1) {
            int i11 = i10 + 2;
            byte b11 = ((bArr[i11] & 255) << 8) | (bArr[i10 + 3] & 255);
            if (b10 == -1 && bArr[i10 + 1] == -38) {
                while (true) {
                    int i12 = i11 + 2;
                    if (i12 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i11] == -1 && bArr[i11 + 1] == -39) {
                        return i12;
                    }
                    i11++;
                }
            } else {
                i10 += b11 + 2;
            }
        }
        return -1;
    }

    public int b(byte[] bArr) {
        LargeJpegImageQuirk largeJpegImageQuirk = this.f9064a;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.j(bArr)) {
            return bArr.length;
        }
        int a10 = a(bArr);
        return a10 != -1 ? a10 : bArr.length;
    }
}
