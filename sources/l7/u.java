package L7;

import C7.i;
import C7.k;
import E7.v;
import Y7.a;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;

public final class u implements k<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final C6648e f38440a = new C6648e();

    /* renamed from: c */
    public v<Bitmap> a(InputStream inputStream, int i10, int i11, i iVar) {
        return this.f38440a.c(ImageDecoder.createSource(a.b(inputStream)), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean b(InputStream inputStream, i iVar) {
        return true;
    }
}
