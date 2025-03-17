package androidx.camera.camera2.internal.compat.quirk;

import C.C4391e0;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.camera.core.impl.N0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import w.B;
import w.U;

public class CamcorderProfileResolutionQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private final U f16618a;

    /* renamed from: b  reason: collision with root package name */
    private List<Size> f16619b = null;

    public CamcorderProfileResolutionQuirk(B b10) {
        this.f16618a = b10.b();
    }

    static boolean g(B b10) {
        Integer num = (Integer) b10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public List<Size> f() {
        if (this.f16619b == null) {
            Size[] c10 = this.f16618a.c(34);
            this.f16619b = c10 != null ? Arrays.asList((Size[]) c10.clone()) : Collections.emptyList();
            C4391e0.a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.f16619b);
        }
        return new ArrayList(this.f16619b);
    }
}
