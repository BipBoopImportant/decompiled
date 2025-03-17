package L7;

import C7.i;
import C7.k;
import E7.v;
import Y7.l;
import android.graphics.Bitmap;

public final class C implements k<Bitmap, Bitmap> {

    private static final class a implements v<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f38365a;

        a(Bitmap bitmap) {
            this.f38365a = bitmap;
        }

        public int a() {
            return l.h(this.f38365a);
        }

        /* renamed from: b */
        public Bitmap get() {
            return this.f38365a;
        }

        public void c() {
        }

        public Class<Bitmap> d() {
            return Bitmap.class;
        }
    }

    /* renamed from: c */
    public v<Bitmap> a(Bitmap bitmap, int i10, int i11, i iVar) {
        return new a(bitmap);
    }

    /* renamed from: d */
    public boolean b(Bitmap bitmap, i iVar) {
        return true;
    }
}
