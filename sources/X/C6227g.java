package x;

import C.C4417z;
import H2.i;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;
import w.B;

/* renamed from: x.g  reason: case insensitive filesystem */
public final class C6227g {

    /* renamed from: a  reason: collision with root package name */
    private final a f31524a;

    /* renamed from: x.g$a */
    interface a {
        DynamicRangeProfiles a();

        Set<C4417z> b();

        Set<C4417z> c(C4417z zVar);
    }

    C6227g(a aVar) {
        this.f31524a = aVar;
    }

    public static C6227g a(B b10) {
        C6227g e10 = Build.VERSION.SDK_INT >= 33 ? e(C6226f.a(b10.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) : null;
        return e10 == null ? i.f31526a : e10;
    }

    public static C6227g e(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        i.j(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new C6227g(new h(dynamicRangeProfiles));
    }

    public Set<C4417z> b(C4417z zVar) {
        return this.f31524a.c(zVar);
    }

    public Set<C4417z> c() {
        return this.f31524a.b();
    }

    public DynamicRangeProfiles d() {
        i.j(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f31524a.a();
    }
}
