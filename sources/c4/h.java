package C4;

import android.os.Bundle;
import androidx.lifecycle.U;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import x4.F;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "Lkotlinx/serialization/KSerializer;", "Landroid/os/Bundle;", "bundle", "", "", "Lx4/F;", "typeMap", "a", "(Lkotlinx/serialization/KSerializer;Landroid/os/Bundle;Ljava/util/Map;)Ljava/lang/Object;", "Landroidx/lifecycle/U;", "handle", "b", "(Lkotlinx/serialization/KSerializer;Landroidx/lifecycle/U;Ljava/util/Map;)Ljava/lang/Object;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {
    public static final <T> T a(KSerializer<T> kSerializer, Bundle bundle, Map<String, ? extends F<?>> map) {
        C17542s.j(kSerializer, "<this>");
        C17542s.j(bundle, "bundle");
        C17542s.j(map, "typeMap");
        return new g(bundle, map).L(kSerializer);
    }

    public static final <T> T b(KSerializer<T> kSerializer, U u10, Map<String, ? extends F<?>> map) {
        C17542s.j(kSerializer, "<this>");
        C17542s.j(u10, "handle");
        C17542s.j(map, "typeMap");
        return new g(u10, map).L(kSerializer);
    }
}
