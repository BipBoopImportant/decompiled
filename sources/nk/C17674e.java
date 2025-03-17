package nK;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5704J;
import p1.K0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0016\u0010\t\u001a\u00020\u0005*\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroid/graphics/Bitmap;", "from", "LnK/d;", "a", "(Landroid/graphics/Bitmap;)LnK/d;", "Landroid/graphics/Bitmap$Config;", "Lp1/K0;", "c", "(Landroid/graphics/Bitmap$Config;)I", "b", "(I)Landroid/graphics/Bitmap$Config;", "sub-sampling-image_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: nK.e  reason: case insensitive filesystem */
public final class C17674e {
    public static final C17673d a(Bitmap bitmap) {
        C17542s.j(bitmap, "from");
        ColorSpace colorSpace = bitmap.getColorSpace();
        Bitmap.Config config = bitmap.getConfig();
        C17542s.i(config, "getConfig(...)");
        return new C17673d(c(config), colorSpace != null ? C5704J.b(colorSpace) : null, colorSpace, (DefaultConstructorMarker) null);
    }

    public static final Bitmap.Config b(int i10) {
        K0.a aVar = K0.f27217b;
        return K0.i(i10, aVar.d()) ? Bitmap.Config.HARDWARE : K0.i(i10, aVar.c()) ? Bitmap.Config.RGBA_F16 : K0.i(i10, aVar.b()) ? Bitmap.Config.ARGB_8888 : K0.i(i10, aVar.e()) ? Bitmap.Config.RGB_565 : K0.i(i10, aVar.a()) ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888;
    }

    private static final int c(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE ? K0.f27217b.d() : config == Bitmap.Config.RGBA_F16 ? K0.f27217b.c() : config == Bitmap.Config.ARGB_8888 ? K0.f27217b.b() : config == Bitmap.Config.RGB_565 ? K0.f27217b.e() : config == Bitmap.Config.ALPHA_8 ? K0.f27217b.a() : K0.f27217b.b();
    }
}
