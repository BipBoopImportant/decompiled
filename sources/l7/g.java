package L7;

import C7.m;
import E7.v;
import F7.d;
import Y7.l;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.b;

public abstract class g implements m<Bitmap> {
    public final v<Bitmap> a(Context context, v<Bitmap> vVar, int i10, int i11) {
        if (l.u(i10, i11)) {
            d f10 = b.c(context).f();
            Bitmap bitmap = vVar.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c10 = c(f10, bitmap, i10, i11);
            return bitmap.equals(c10) ? vVar : f.f(c10, f10);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* access modifiers changed from: protected */
    public abstract Bitmap c(d dVar, Bitmap bitmap, int i10, int i11);
}
