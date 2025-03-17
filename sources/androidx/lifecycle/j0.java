package androidx.lifecycle;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0003R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/j0;", "", "<init>", "()V", "", "key", "Landroidx/lifecycle/f0;", "viewModel", "LXH/N;", "d", "(Ljava/lang/String;Landroidx/lifecycle/f0;)V", "b", "(Ljava/lang/String;)Landroidx/lifecycle/f0;", "", "c", "()Ljava/util/Set;", "a", "", "Ljava/util/Map;", "map", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, f0> f22303a = new LinkedHashMap();

    public final void a() {
        for (f0 clear$lifecycle_viewmodel_release : this.f22303a.values()) {
            clear$lifecycle_viewmodel_release.clear$lifecycle_viewmodel_release();
        }
        this.f22303a.clear();
    }

    public final f0 b(String str) {
        C17542s.j(str, "key");
        return this.f22303a.get(str);
    }

    public final Set<String> c() {
        return new HashSet(this.f22303a.keySet());
    }

    public final void d(String str, f0 f0Var) {
        C17542s.j(str, "key");
        C17542s.j(f0Var, "viewModel");
        f0 put = this.f22303a.put(str, f0Var);
        if (put != null) {
            put.clear$lifecycle_viewmodel_release();
        }
    }
}
