package L7;

import C7.k;
import E7.v;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

public final class i implements k<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final C6648e f38388a = new C6648e();

    /* renamed from: c */
    public v<Bitmap> a(ByteBuffer byteBuffer, int i10, int i11, C7.i iVar) {
        return this.f38388a.c(ImageDecoder.createSource(byteBuffer), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean b(ByteBuffer byteBuffer, C7.i iVar) {
        return true;
    }
}
