package androidx.camera.view.internal.compat.quirk;

import C.C4391e0;
import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.P0;
import androidx.camera.core.impl.R0;
import g0.C5319a;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile R0 f17179a;

    static {
        P0.b().c(H.a.a(), new C5319a());
    }

    public static <T extends N0> T b(Class<T> cls) {
        return f17179a.b(cls);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(O0 o02) {
        f17179a = new R0(b.a(o02));
        C4391e0.a("DeviceQuirks", "view DeviceQuirks = " + R0.d(f17179a));
    }
}
