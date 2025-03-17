package m3;

import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.I0;
import U0.J0;
import U0.o1;
import androidx.lifecycle.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lm3/a;", "", "<init>", "()V", "Landroidx/lifecycle/k0;", "viewModelStoreOwner", "LU0/J0;", "b", "(Landroidx/lifecycle/k0;)LU0/J0;", "LU0/I0;", "LU0/I0;", "LocalViewModelStoreOwner", "a", "(LU0/m;I)Landroidx/lifecycle/k0;", "current", "lifecycle-viewmodel-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f26247a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final I0<k0> f26248b = C4910x.d((o1) null, C0419a.f26250c, 1, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f26249c = 0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: m3.a$a  reason: collision with other inner class name */
    static final class C0419a extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0419a f26250c = new C0419a();

        C0419a() {
            super(0);
        }

        /* renamed from: b */
        public final k0 invoke() {
            return null;
        }
    }

    private a() {
    }

    public final k0 a(C4889m mVar, int i10) {
        mVar.C(-584162872);
        if (C4895p.J()) {
            C4895p.S(-584162872, i10, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:38)");
        }
        k0 k0Var = (k0) mVar.Q(f26248b);
        if (k0Var == null) {
            k0Var = b.a(mVar, 0);
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.U();
        return k0Var;
    }

    public final J0<k0> b(k0 k0Var) {
        C17542s.j(k0Var, "viewModelStoreOwner");
        return f26248b.d(k0Var);
    }
}
