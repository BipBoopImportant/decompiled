package C4;

import android.os.Bundle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.F;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0013"}, d2 = {"LC4/b;", "LC4/a;", "Landroid/os/Bundle;", "bundle", "", "", "Lx4/F;", "typeMap", "<init>", "(Landroid/os/Bundle;Ljava/util/Map;)V", "key", "", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "", "a", "(Ljava/lang/String;)Z", "Landroid/os/Bundle;", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f33685a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, F<?>> f33686b;

    public b(Bundle bundle, Map<String, ? extends F<?>> map) {
        C17542s.j(bundle, "bundle");
        C17542s.j(map, "typeMap");
        this.f33685a = bundle;
        this.f33686b = map;
    }

    public boolean a(String str) {
        C17542s.j(str, "key");
        return this.f33685a.containsKey(str);
    }

    public Object b(String str) {
        C17542s.j(str, "key");
        F f10 = this.f33686b.get(str);
        if (f10 != null) {
            return f10.a(this.f33685a, str);
        }
        return null;
    }
}
