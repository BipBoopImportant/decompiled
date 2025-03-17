package Q7;

import C7.i;
import E7.v;
import M7.b;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

public class a implements e<Bitmap, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap.CompressFormat f39628a;

    /* renamed from: b  reason: collision with root package name */
    private final int f39629b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public v<byte[]> a(v<Bitmap> vVar, i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.f39628a, this.f39629b, byteArrayOutputStream);
        vVar.c();
        return new b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f39628a = compressFormat;
        this.f39629b = i10;
    }
}
