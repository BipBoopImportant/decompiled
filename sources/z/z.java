package z;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.b;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.V;
import java.util.List;
import u.C5965a;

public class z {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f32347a;

    public z() {
        this.f32347a = b.b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public V a(V v10) {
        V.a aVar = new V.a();
        aVar.v(v10.k());
        for (C5019e0 f10 : v10.i()) {
            aVar.f(f10);
        }
        aVar.e(v10.g());
        C5965a.C0464a aVar2 = new C5965a.C0464a();
        aVar2.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(aVar2.b());
        return aVar.h();
    }

    public boolean b(List<CaptureRequest> list, boolean z10) {
        if (!this.f32347a || !z10) {
            return false;
        }
        for (CaptureRequest captureRequest : list) {
            Integer num = (Integer) captureRequest.get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
