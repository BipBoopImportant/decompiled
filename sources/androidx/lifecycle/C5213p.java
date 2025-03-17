package androidx.lifecycle;

import P4.d;
import P4.f;
import android.os.Bundle;
import androidx.lifecycle.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/p;", "", "<init>", "()V", "LP4/d;", "registry", "Landroidx/lifecycle/r;", "lifecycle", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/W;", "b", "(LP4/d;Landroidx/lifecycle/r;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/W;", "Landroidx/lifecycle/f0;", "viewModel", "LXH/N;", "a", "(Landroidx/lifecycle/f0;LP4/d;Landroidx/lifecycle/r;)V", "c", "(LP4/d;Landroidx/lifecycle/r;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.p  reason: case insensitive filesystem */
public final class C5213p {

    /* renamed from: a  reason: collision with root package name */
    public static final C5213p f22334a = new C5213p();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/p$a;", "LP4/d$a;", "<init>", "()V", "LP4/f;", "owner", "LXH/N;", "a", "(LP4/f;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.p$a */
    public static final class a implements d.a {
        public void a(f fVar) {
            C17542s.j(fVar, "owner");
            if (fVar instanceof k0) {
                j0 viewModelStore = ((k0) fVar).getViewModelStore();
                d savedStateRegistry = fVar.getSavedStateRegistry();
                for (String b10 : viewModelStore.c()) {
                    f0 b11 = viewModelStore.b(b10);
                    C17542s.g(b11);
                    C5213p.a(b11, savedStateRegistry, fVar.getLifecycle());
                }
                if (!viewModelStore.c().isEmpty()) {
                    savedStateRegistry.i(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/lifecycle/p$b", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "LXH/N;", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.p$b */
    public static final class b implements C5218v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f22335a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f22336b;

        b(r rVar, d dVar) {
            this.f22335a = rVar;
            this.f22336b = dVar;
        }

        public void e(C5221y yVar, r.a aVar) {
            C17542s.j(yVar, "source");
            C17542s.j(aVar, "event");
            if (aVar == r.a.ON_START) {
                this.f22335a.g(this);
                this.f22336b.i(a.class);
            }
        }
    }

    private C5213p() {
    }

    public static final void a(f0 f0Var, d dVar, r rVar) {
        C17542s.j(f0Var, "viewModel");
        C17542s.j(dVar, "registry");
        C17542s.j(rVar, "lifecycle");
        W w10 = (W) f0Var.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (w10 != null && !w10.g()) {
            w10.d(dVar, rVar);
            f22334a.c(dVar, rVar);
        }
    }

    public static final W b(d dVar, r rVar, String str, Bundle bundle) {
        C17542s.j(dVar, "registry");
        C17542s.j(rVar, "lifecycle");
        C17542s.g(str);
        W w10 = new W(str, U.f22208f.a(dVar.b(str), bundle));
        w10.d(dVar, rVar);
        f22334a.c(dVar, rVar);
        return w10;
    }

    private final void c(d dVar, r rVar) {
        r.b d10 = rVar.d();
        if (d10 == r.b.INITIALIZED || d10.b(r.b.STARTED)) {
            dVar.i(a.class);
        } else {
            rVar.c(new b(rVar, dVar));
        }
    }
}
