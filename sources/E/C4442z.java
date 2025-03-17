package E;

import C.V;
import G.f;
import G.q;
import O.A;
import O.B;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;
import java.util.Objects;

/* renamed from: E.z  reason: case insensitive filesystem */
final class C4442z implements A<B<byte[]>, B<Bitmap>> {
    C4442z() {
    }

    private Bitmap b(byte[] bArr, Rect rect) {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e10) {
            throw new V(1, "Failed to decode JPEG.", e10);
        }
    }

    /* renamed from: a */
    public B<Bitmap> apply(B<byte[]> b10) {
        Rect b11 = b10.b();
        Bitmap b12 = b(b10.c(), b11);
        f d10 = b10.d();
        Objects.requireNonNull(d10);
        return B.j(b12, d10, new Rect(0, 0, b12.getWidth(), b12.getHeight()), b10.f(), q.v(b10.g(), b11), b10.a());
    }
}
