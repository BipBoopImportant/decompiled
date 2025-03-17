package androidx.camera.core.internal.compat.quirk;

import C.C4391e0;
import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.P0;
import androidx.camera.core.impl.R0;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile R0 f17038a;

    static {
        P0.b().c(H.a.a(), new L.a());
    }

    public static <T extends N0> T b(Class<T> cls) {
        return f17038a.b(cls);
    }

    public static R0 c() {
        return f17038a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(O0 o02) {
        f17038a = new R0(b.a(o02));
        C4391e0.a("DeviceQuirks", "core DeviceQuirks = " + R0.d(f17038a));
    }
}
