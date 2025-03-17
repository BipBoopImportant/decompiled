package a9;

import E8.b;
import YH.g0;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import u8.C8886a;

public final class D6 {
    public static final boolean a(C8886a aVar, String str) {
        C17542s.j(str, "featureFlagName");
        if (aVar == null) {
            return false;
        }
        if (!aVar.f().b(b.DEVELOPER_OVERRIDE_FEATURE_FLAGS_ENABLED, false)) {
            return aVar.c().d(str);
        }
        Set<String> g10 = aVar.f().g(b.DEVELOPER_OVERRIDE_FEATURE_FLAGS_STATES, g0.d());
        if (g10 == null) {
            g10 = g0.d();
        }
        return g10.contains(str);
    }
}
