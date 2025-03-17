package C4;

import D2.d;
import XH.C16796C;
import android.os.Bundle;
import androidx.lifecycle.U;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.F;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0013"}, d2 = {"LC4/k;", "LC4/a;", "Landroidx/lifecycle/U;", "handle", "", "", "Lx4/F;", "typeMap", "<init>", "(Landroidx/lifecycle/U;Ljava/util/Map;)V", "key", "", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "", "a", "(Ljava/lang/String;)Z", "Landroidx/lifecycle/U;", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class k extends a {

    /* renamed from: a  reason: collision with root package name */
    private final U f33726a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, F<?>> f33727b;

    public k(U u10, Map<String, ? extends F<?>> map) {
        C17542s.j(u10, "handle");
        C17542s.j(map, "typeMap");
        this.f33726a = u10;
        this.f33727b = map;
    }

    public boolean a(String str) {
        C17542s.j(str, "key");
        return this.f33726a.e(str);
    }

    public Object b(String str) {
        C17542s.j(str, "key");
        Bundle b10 = d.b(C16796C.a(str, this.f33726a.f(str)));
        F<?> f10 = this.f33727b.get(str);
        if (f10 != null) {
            return f10.a(b10, str);
        }
        throw new IllegalStateException(("Failed to find type for " + str + " when decoding " + this.f33726a).toString());
    }
}
