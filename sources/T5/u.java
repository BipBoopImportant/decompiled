package T5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\n\u001a\u00020\u0000*\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u000e\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0006*\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0015\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016*\n\u0010\u0017\"\u00020\u00002\u00020\u0000*\n\u0010\u0019\"\u00020\u00182\u00020\u0018¨\u0006\u001a"}, d2 = {"Landroid/graphics/Bitmap;", "", "shareable", "LT5/a;", "b", "(Landroid/graphics/Bitmap;Z)LT5/a;", "LT5/n;", "", "width", "height", "e", "(LT5/n;II)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "config", "f", "(LT5/n;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "c", "(Landroid/graphics/drawable/Drawable;)LT5/n;", "Landroid/content/res/Resources;", "resources", "a", "(LT5/n;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;", "Bitmap", "Landroid/graphics/Canvas;", "Canvas", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {
    public static final Drawable a(n nVar, Resources resources) {
        return nVar instanceof C6705i ? ((C6705i) nVar).d() : nVar instanceof C6697a ? new BitmapDrawable(resources, ((C6697a) nVar).d()) : new o(nVar);
    }

    public static final C6697a b(Bitmap bitmap, boolean z10) {
        return new C6697a(bitmap, z10);
    }

    public static final n c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? d(((BitmapDrawable) drawable).getBitmap(), false, 1, (Object) null) : new C6705i(drawable, false);
    }

    public static /* synthetic */ C6697a d(Bitmap bitmap, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return b(bitmap, z10);
    }

    public static final Bitmap e(n nVar, int i10, int i11) {
        Bitmap.Config config = nVar instanceof C6697a ? ((C6697a) nVar).d().getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return f(nVar, i10, i11, config);
    }

    public static final Bitmap f(n nVar, int i10, int i11, Bitmap.Config config) {
        if (nVar instanceof C6697a) {
            C6697a aVar = (C6697a) nVar;
            if (aVar.d().getWidth() == i10 && aVar.d().getHeight() == i11 && aVar.d().getConfig() == config) {
                return aVar.d();
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
        nVar.c(new Canvas(createBitmap));
        return createBitmap;
    }

    public static /* synthetic */ Bitmap g(n nVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = nVar.getWidth();
        }
        if ((i12 & 2) != 0) {
            i11 = nVar.getHeight();
        }
        return e(nVar, i10, i11);
    }
}
