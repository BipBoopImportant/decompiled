package Q7;

import C7.i;
import E7.v;
import F7.d;
import L7.f;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class c implements e<Drawable, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final d f39631a;

    /* renamed from: b  reason: collision with root package name */
    private final e<Bitmap, byte[]> f39632b;

    /* renamed from: c  reason: collision with root package name */
    private final e<P7.c, byte[]> f39633c;

    public c(d dVar, e<Bitmap, byte[]> eVar, e<P7.c, byte[]> eVar2) {
        this.f39631a = dVar;
        this.f39632b = eVar;
        this.f39633c = eVar2;
    }

    private static v<P7.c> b(v<Drawable> vVar) {
        return vVar;
    }

    public v<byte[]> a(v<Drawable> vVar, i iVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f39632b.a(f.f(((BitmapDrawable) drawable).getBitmap(), this.f39631a), iVar);
        }
        if (drawable instanceof P7.c) {
            return this.f39633c.a(b(vVar), iVar);
        }
        return null;
    }
}
