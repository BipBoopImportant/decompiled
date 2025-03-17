package androidx.camera.video.internal.compat.quirk;

import C.C4391e0;
import Y.b;
import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.P0;
import androidx.camera.core.impl.R0;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile R0 f17083a;

    static {
        P0.b().c(H.a.a(), new b());
    }

    public static <T extends N0> T b(Class<T> cls) {
        return f17083a.b(cls);
    }

    public static R0 c() {
        return f17083a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(O0 o02) {
        f17083a = new R0(b.a(o02));
        C4391e0.a("DeviceQuirks", "video DeviceQuirks = " + R0.d(f17083a));
    }
}
