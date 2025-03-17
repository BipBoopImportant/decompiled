package r6;

import X5.C6723h;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import l6.f;
import l6.h;
import pI.C17752b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lr6/g;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap$Config;", "config", "", "b", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Z", "allowInexactSize", "Ll6/h;", "size", "Ll6/f;", "scale", "c", "(ZLandroid/graphics/Bitmap;Ll6/h;Ll6/f;)Z", "Landroid/graphics/drawable/Drawable;", "drawable", "a", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Ll6/h;Ll6/f;Z)Landroid/graphics/Bitmap;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f55698a = new g();

    private g() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == C8694b.e(config);
    }

    private final boolean c(boolean z10, Bitmap bitmap, h hVar, f fVar) {
        if (z10) {
            return true;
        }
        long b10 = C6723h.b(bitmap.getWidth(), bitmap.getHeight(), hVar, fVar, h.f54771d);
        return C6723h.d(bitmap.getWidth(), bitmap.getHeight(), p.c(b10), p.d(b10), fVar) == 1.0d;
    }

    public final Bitmap a(Drawable drawable, Bitmap.Config config, h hVar, f fVar, boolean z10) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z10, bitmap, hVar, fVar)) {
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int g10 = F.g(mutate);
        int i10 = 512;
        if (g10 <= 0) {
            g10 = 512;
        }
        int b10 = F.b(mutate);
        if (b10 > 0) {
            i10 = b10;
        }
        long b11 = C6723h.b(g10, i10, hVar, fVar, h.f54771d);
        double d10 = C6723h.d(g10, i10, p.c(b11), p.d(b11), fVar);
        int d11 = C17752b.d(((double) g10) * d10);
        int d12 = C17752b.d(d10 * ((double) i10));
        Bitmap createBitmap = Bitmap.createBitmap(d11, d12, C8694b.e(config));
        Rect bounds = mutate.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        mutate.setBounds(0, 0, d11, d12);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i11, i12, i13, i14);
        return createBitmap;
    }
}
