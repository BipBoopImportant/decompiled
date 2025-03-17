package t3;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import q3.C5798i;

public final class t {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, C5798i iVar) {
        if (iVar != null) {
            d(mediaFormat, "color-transfer", iVar.f28144c);
            d(mediaFormat, "color-standard", iVar.f28142a);
            d(mediaFormat, "color-range", iVar.f28143b);
            a(mediaFormat, "hdr-static-info", iVar.f28145d);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer("csd-" + i10, ByteBuffer.wrap(list.get(i10)));
        }
    }
}
