package p1;

import android.graphics.Bitmap;
import kotlin.Metadata;
import p1.K0;
import q1.C5776c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a:\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0007*\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroid/graphics/Bitmap;", "Lp1/J0;", "c", "(Landroid/graphics/Bitmap;)Lp1/J0;", "", "width", "height", "Lp1/K0;", "config", "", "hasAlpha", "Lq1/c;", "colorSpace", "a", "(IIIZLq1/c;)Lp1/J0;", "b", "(Lp1/J0;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "d", "(I)Landroid/graphics/Bitmap$Config;", "e", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class O {
    public static final J0 a(int i10, int i11, int i12, boolean z10, C5776c cVar) {
        d(i12);
        return new N(C5708b0.b(i10, i11, i12, z10, cVar));
    }

    public static final Bitmap b(J0 j02) {
        if (j02 instanceof N) {
            return ((N) j02).c();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final J0 c(Bitmap bitmap) {
        return new N(bitmap);
    }

    public static final Bitmap.Config d(int i10) {
        K0.a aVar = K0.f27217b;
        return K0.i(i10, aVar.b()) ? Bitmap.Config.ARGB_8888 : K0.i(i10, aVar.a()) ? Bitmap.Config.ALPHA_8 : K0.i(i10, aVar.e()) ? Bitmap.Config.RGB_565 : K0.i(i10, aVar.c()) ? Bitmap.Config.RGBA_F16 : K0.i(i10, aVar.d()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int e(Bitmap.Config config) {
        return config == Bitmap.Config.ALPHA_8 ? K0.f27217b.a() : config == Bitmap.Config.RGB_565 ? K0.f27217b.e() : config == Bitmap.Config.ARGB_4444 ? K0.f27217b.b() : config == Bitmap.Config.RGBA_F16 ? K0.f27217b.c() : config == Bitmap.Config.HARDWARE ? K0.f27217b.d() : K0.f27217b.b();
    }
}
