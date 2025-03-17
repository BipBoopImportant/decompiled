package S5;

import E5.g;
import O5.b;
import O5.h;
import O5.i;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import pI.C17752b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LS5/l;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap$Config;", "config", "", "b", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Z", "allowInexactSize", "LO5/i;", "size", "LO5/h;", "scale", "c", "(ZLandroid/graphics/Bitmap;LO5/i;LO5/h;)Z", "Landroid/graphics/drawable/Drawable;", "drawable", "a", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;LO5/i;LO5/h;Z)Landroid/graphics/Bitmap;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f39892a = new l();

    private l() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == a.e(config);
    }

    private final boolean c(boolean z10, Bitmap bitmap, i iVar, h hVar) {
        if (z10) {
            return true;
        }
        return g.c(bitmap.getWidth(), bitmap.getHeight(), b.a(iVar) ? bitmap.getWidth() : j.C(iVar.b(), hVar), b.a(iVar) ? bitmap.getHeight() : j.C(iVar.a(), hVar), hVar) == 1.0d;
    }

    public final Bitmap a(Drawable drawable, Bitmap.Config config, i iVar, h hVar, boolean z10) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z10, bitmap, iVar, hVar)) {
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int r10 = j.r(mutate);
        int i10 = 512;
        if (r10 <= 0) {
            r10 = 512;
        }
        int j10 = j.j(mutate);
        if (j10 > 0) {
            i10 = j10;
        }
        double c10 = g.c(r10, i10, b.a(iVar) ? r10 : j.C(iVar.b(), hVar), b.a(iVar) ? i10 : j.C(iVar.a(), hVar), hVar);
        int d10 = C17752b.d(((double) r10) * c10);
        int d11 = C17752b.d(c10 * ((double) i10));
        Bitmap createBitmap = Bitmap.createBitmap(d10, d11, a.e(config));
        Rect bounds = mutate.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        mutate.setBounds(0, 0, d10, d11);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i11, i12, i13, i14);
        return createBitmap;
    }
}
