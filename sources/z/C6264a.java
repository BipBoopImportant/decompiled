package z;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.impl.R0;
import androidx.camera.core.impl.X;
import u.C5965a;

/* renamed from: z.a  reason: case insensitive filesystem */
public class C6264a {

    /* renamed from: a  reason: collision with root package name */
    private final Range<Integer> f32313a;

    public C6264a(R0 r02) {
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) r02.b(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.f32313a = null;
        } else {
            this.f32313a = aeFpsRangeLegacyQuirk.g();
        }
    }

    public void a(C5965a.C0464a aVar) {
        Range<Integer> range = this.f32313a;
        if (range != null) {
            aVar.g(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range, X.c.REQUIRED);
        }
    }
}
