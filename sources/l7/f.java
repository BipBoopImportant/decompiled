package L7;

import E7.r;
import E7.v;
import F7.d;
import Y7.k;
import Y7.l;
import android.graphics.Bitmap;

public class f implements v<Bitmap>, r {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f38385a;

    /* renamed from: b  reason: collision with root package name */
    private final d f38386b;

    public f(Bitmap bitmap, d dVar) {
        this.f38385a = (Bitmap) k.e(bitmap, "Bitmap must not be null");
        this.f38386b = (d) k.e(dVar, "BitmapPool must not be null");
    }

    public static f f(Bitmap bitmap, d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new f(bitmap, dVar);
    }

    public int a() {
        return l.h(this.f38385a);
    }

    public void b() {
        this.f38385a.prepareToDraw();
    }

    public void c() {
        this.f38386b.c(this.f38385a);
    }

    public Class<Bitmap> d() {
        return Bitmap.class;
    }

    /* renamed from: e */
    public Bitmap get() {
        return this.f38385a;
    }
}
