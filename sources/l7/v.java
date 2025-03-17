package L7;

import E7.r;
import Y7.k;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public final class v implements E7.v<BitmapDrawable>, r {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f38441a;

    /* renamed from: b  reason: collision with root package name */
    private final E7.v<Bitmap> f38442b;

    private v(Resources resources, E7.v<Bitmap> vVar) {
        this.f38441a = (Resources) k.d(resources);
        this.f38442b = (E7.v) k.d(vVar);
    }

    public static E7.v<BitmapDrawable> f(Resources resources, E7.v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new v(resources, vVar);
    }

    public int a() {
        return this.f38442b.a();
    }

    public void b() {
        E7.v<Bitmap> vVar = this.f38442b;
        if (vVar instanceof r) {
            ((r) vVar).b();
        }
    }

    public void c() {
        this.f38442b.c();
    }

    public Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    /* renamed from: e */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f38441a, this.f38442b.get());
    }
}
