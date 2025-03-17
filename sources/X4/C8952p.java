package x4;

import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lx4/p;", "Landroidx/lifecycle/f0;", "Lx4/G;", "<init>", "()V", "", "backStackEntryId", "LXH/N;", "D", "(Ljava/lang/String;)V", "onCleared", "Landroidx/lifecycle/j0;", "d", "(Ljava/lang/String;)Landroidx/lifecycle/j0;", "toString", "()Ljava/lang/String;", "", "m", "Ljava/util/Map;", "viewModelStores", "n", "b", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x4.p  reason: case insensitive filesystem */
public final class C8952p extends f0 implements G {

    /* renamed from: n  reason: collision with root package name */
    public static final b f57613n = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final i0.c f57614o = new a();

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, j0> f57615m = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"x4/p$a", "Landroidx/lifecycle/i0$c;", "Landroidx/lifecycle/f0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/f0;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x4.p$a */
    public static final class a implements i0.c {
        a() {
        }

        public <T extends f0> T create(Class<T> cls) {
            C17542s.j(cls, "modelClass");
            return new C8952p();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lx4/p$b;", "", "<init>", "()V", "Landroidx/lifecycle/j0;", "viewModelStore", "Lx4/p;", "a", "(Landroidx/lifecycle/j0;)Lx4/p;", "Landroidx/lifecycle/i0$c;", "FACTORY", "Landroidx/lifecycle/i0$c;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x4.p$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C8952p a(j0 j0Var) {
            C17542s.j(j0Var, "viewModelStore");
            return (C8952p) new i0(j0Var, C8952p.f57614o, (l3.a) null, 4, (DefaultConstructorMarker) null).a(C8952p.class);
        }

        private b() {
        }
    }

    public final void D(String str) {
        C17542s.j(str, "backStackEntryId");
        j0 remove = this.f57615m.remove(str);
        if (remove != null) {
            remove.a();
        }
    }

    public j0 d(String str) {
        C17542s.j(str, "backStackEntryId");
        j0 j0Var = this.f57615m.get(str);
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0();
        this.f57615m.put(str, j0Var2);
        return j0Var2;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        for (j0 a10 : this.f57615m.values()) {
            a10.a();
        }
        this.f57615m.clear();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator<String> it = this.f57615m.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        C17542s.i(sb3, "sb.toString()");
        return sb3;
    }
}
