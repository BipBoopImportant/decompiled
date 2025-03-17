package M;

import androidx.camera.core.impl.R0;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.n;
import java.nio.ByteBuffer;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final IncorrectJpegMetadataQuirk f9065a;

    public d(R0 r02) {
        this.f9065a = (IncorrectJpegMetadataQuirk) r02.b(IncorrectJpegMetadataQuirk.class);
    }

    public byte[] a(n nVar) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f9065a;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.i(nVar);
        }
        ByteBuffer p10 = nVar.A1()[0].p();
        byte[] bArr = new byte[p10.capacity()];
        p10.rewind();
        p10.get(bArr);
        return bArr;
    }
}
