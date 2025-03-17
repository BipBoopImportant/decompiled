package androidx.lifecycle;

import P4.d;
import XH.C16824o;
import XH.C16825p;
import android.os.Bundle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/Y;", "LP4/d$c;", "LP4/d;", "savedStateRegistry", "Landroidx/lifecycle/k0;", "viewModelStoreOwner", "<init>", "(LP4/d;Landroidx/lifecycle/k0;)V", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;", "LXH/N;", "d", "()V", "", "key", "a", "(Ljava/lang/String;)Landroid/os/Bundle;", "LP4/d;", "", "Z", "restored", "c", "Landroid/os/Bundle;", "restoredState", "Landroidx/lifecycle/Z;", "LXH/o;", "()Landroidx/lifecycle/Z;", "viewModel", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Y implements d.c {

    /* renamed from: a  reason: collision with root package name */
    private final d f22224a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f22225b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f22226c;

    /* renamed from: d  reason: collision with root package name */
    private final C16824o f22227d;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/Z;", "b", "()Landroidx/lifecycle/Z;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<Z> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k0 f22228c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k0 k0Var) {
            super(0);
            this.f22228c = k0Var;
        }

        /* renamed from: b */
        public final Z invoke() {
            return X.e(this.f22228c);
        }
    }

    public Y(d dVar, k0 k0Var) {
        C17542s.j(dVar, "savedStateRegistry");
        C17542s.j(k0Var, "viewModelStoreOwner");
        this.f22224a = dVar;
        this.f22227d = C16825p.b(new a(k0Var));
    }

    private final Z c() {
        return (Z) this.f22227d.getValue();
    }

    public final Bundle a(String str) {
        C17542s.j(str, "key");
        d();
        Bundle bundle = this.f22226c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f22226c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f22226c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f22226c = null;
        }
        return bundle2;
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f22226c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry next : c().C().entrySet()) {
            String str = (String) next.getKey();
            Bundle b10 = ((U) next.getValue()).k().b();
            if (!C17542s.e(b10, Bundle.EMPTY)) {
                bundle.putBundle(str, b10);
            }
        }
        this.f22225b = false;
        return bundle;
    }

    public final void d() {
        if (!this.f22225b) {
            Bundle b10 = this.f22224a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f22226c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (b10 != null) {
                bundle.putAll(b10);
            }
            this.f22226c = bundle;
            this.f22225b = true;
            c();
        }
    }
}
