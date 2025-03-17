package androidx.camera.camera2.internal.compat.quirk;

import C.C4391e0;
import H.a;
import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.P0;
import androidx.camera.core.impl.R0;
import y.C6245a;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile R0 f16650a;

    static {
        P0.b().c(a.a(), new C6245a());
    }

    public static <T extends N0> T b(Class<T> cls) {
        return f16650a.b(cls);
    }

    public static R0 c() {
        return f16650a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(O0 o02) {
        f16650a = new R0(c.a(o02));
        C4391e0.a("DeviceQuirks", "camera2 DeviceQuirks = " + R0.d(f16650a));
    }
}
