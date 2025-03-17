package L7;

import C7.i;
import C7.k;
import E7.v;
import F7.d;
import F7.e;
import K7.b;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* renamed from: L7.e  reason: case insensitive filesystem */
public final class C6648e implements k<ImageDecoder.Source, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final d f38384a = new e();

    public /* bridge */ /* synthetic */ v a(Object obj, int i10, int i11, i iVar) {
        return c(C6647d.a(obj), i10, i11, iVar);
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj, i iVar) {
        return d(C6647d.a(obj), iVar);
    }

    public v<Bitmap> c(ImageDecoder.Source source, int i10, int i11, i iVar) {
        Bitmap a10 = ImageDecoder.decodeBitmap(source, new b(i10, i11, iVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + a10.getWidth() + "x" + a10.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new f(a10, this.f38384a);
    }

    public boolean d(ImageDecoder.Source source, i iVar) {
        return true;
    }
}
