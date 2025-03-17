package L7;

import C7.i;
import C7.k;
import E7.v;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: L7.a  reason: case insensitive filesystem */
public class C6644a<DataType> implements k<DataType, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    private final k<DataType, Bitmap> f38377a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f38378b;

    public C6644a(Resources resources, k<DataType, Bitmap> kVar) {
        this.f38378b = (Resources) Y7.k.d(resources);
        this.f38377a = (k) Y7.k.d(kVar);
    }

    public v<BitmapDrawable> a(DataType datatype, int i10, int i11, i iVar) {
        return v.f(this.f38378b, this.f38377a.a(datatype, i10, i11, iVar));
    }

    public boolean b(DataType datatype, i iVar) {
        return this.f38377a.b(datatype, iVar);
    }
}
