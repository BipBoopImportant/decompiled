package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class IncorrectJpegMetadataQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f17034a = new HashSet(Arrays.asList(new String[]{"A24"}));

    private boolean f(byte[] bArr) {
        byte b10;
        int i10 = 2;
        while (i10 + 4 <= bArr.length && (b10 = bArr[i10]) == -1) {
            if (b10 == -1 && bArr[i10 + 1] == -38) {
                return true;
            }
            i10 += (((bArr[i10 + 2] & 255) << 8) | (bArr[i10 + 3] & 255)) + 2;
        }
        return false;
    }

    private int g(byte[] bArr) {
        int i10 = 2;
        while (true) {
            int i11 = i10 + 1;
            if (i11 > bArr.length) {
                return -1;
            }
            if (bArr[i10] == -1 && bArr[i11] == -40) {
                return i10;
            }
            i10 = i11;
        }
    }

    private static boolean h() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f17034a.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    static boolean j() {
        return h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001d, code lost:
        r0 = g(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] i(androidx.camera.core.n r4) {
        /*
            r3 = this;
            androidx.camera.core.n$a[] r4 = r4.A1()
            r0 = 0
            r4 = r4[r0]
            java.nio.ByteBuffer r4 = r4.p()
            int r1 = r4.capacity()
            byte[] r1 = new byte[r1]
            r4.rewind()
            r4.get(r1)
            boolean r2 = r3.f(r1)
            if (r2 != 0) goto L_0x0026
            int r0 = r3.g(r1)
            r2 = -1
            if (r0 == r2) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            return r1
        L_0x0026:
            int r4 = r4.limit()
            byte[] r4 = java.util.Arrays.copyOfRange(r1, r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.i(androidx.camera.core.n):byte[]");
    }
}
