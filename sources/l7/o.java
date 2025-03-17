package L7;

import E7.v;
import F7.d;
import F7.e;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final d f38419a = new a();

    class a extends e {
        a() {
        }

        public void c(Bitmap bitmap) {
        }
    }

    static v<Bitmap> a(d dVar, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = b(dVar, current, i10, i11);
            z10 = true;
        } else {
            bitmap = null;
        }
        if (!z10) {
            dVar = f38419a;
        }
        return f.f(bitmap, dVar);
    }

    private static Bitmap b(d dVar, Drawable drawable, int i10, int i11) {
        if (i10 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i11 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i10 = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i11 = drawable.getIntrinsicHeight();
            }
            Lock h10 = B.h();
            h10.lock();
            Bitmap d10 = dVar.d(i10, i11, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(d10);
                drawable.setBounds(0, 0, i10, i11);
                drawable.draw(canvas);
                canvas.setBitmap((Bitmap) null);
                return d10;
            } finally {
                h10.unlock();
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
    }
}
