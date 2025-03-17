package z;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.internal.compat.quirk.b;
import androidx.camera.core.impl.X0;
import u.C5965a;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public static final Rational f32330a = new Rational(16, 9);

    private static boolean a(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    public static void b(Size size, X0.b bVar) {
        if (((PreviewPixelHDRnetQuirk) b.b(PreviewPixelHDRnetQuirk.class)) != null && !a(size, f32330a)) {
            C5965a.C0464a aVar = new C5965a.C0464a();
            aVar.f(CaptureRequest.TONEMAP_MODE, 2);
            bVar.g(aVar.b());
        }
    }
}
