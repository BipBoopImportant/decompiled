package androidx.lifecycle;

import P4.d;
import P4.f;
import android.os.Bundle;
import androidx.lifecycle.i0;
import androidx.lifecycle.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l3.a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00128\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00128\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013\"\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u001e\u001a\u00020\u001b*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LP4/f;", "Landroidx/lifecycle/k0;", "T", "LXH/N;", "c", "(LP4/f;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/U;", "a", "(LP4/f;Landroidx/lifecycle/k0;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/U;", "Ll3/a;", "b", "(Ll3/a;)Landroidx/lifecycle/U;", "Ll3/a$b;", "Ll3/a$b;", "SAVED_STATE_REGISTRY_OWNER_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/Z;", "e", "(Landroidx/lifecycle/k0;)Landroidx/lifecycle/Z;", "savedStateHandlesVM", "Landroidx/lifecycle/Y;", "d", "(LP4/f;)Landroidx/lifecycle/Y;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class X {

    /* renamed from: a  reason: collision with root package name */
    public static final a.b<f> f22221a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a.b<k0> f22222b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a.b<Bundle> f22223c = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/X$a", "Ll3/a$b;", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements a.b<Bundle> {
        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/X$b", "Ll3/a$b;", "LP4/f;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements a.b<f> {
        b() {
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/X$c", "Ll3/a$b;", "Landroidx/lifecycle/k0;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements a.b<k0> {
        c() {
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/lifecycle/X$d", "Landroidx/lifecycle/i0$c;", "Landroidx/lifecycle/f0;", "T", "Ljava/lang/Class;", "modelClass", "Ll3/a;", "extras", "create", "(Ljava/lang/Class;Ll3/a;)Landroidx/lifecycle/f0;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements i0.c {
        d() {
        }

        public <T extends f0> T create(Class<T> cls, l3.a aVar) {
            C17542s.j(cls, "modelClass");
            C17542s.j(aVar, "extras");
            return new Z();
        }
    }

    private static final U a(f fVar, k0 k0Var, String str, Bundle bundle) {
        Y d10 = d(fVar);
        Z e10 = e(k0Var);
        U u10 = e10.C().get(str);
        if (u10 != null) {
            return u10;
        }
        U a10 = U.f22208f.a(d10.a(str), bundle);
        e10.C().put(str, a10);
        return a10;
    }

    public static final U b(l3.a aVar) {
        C17542s.j(aVar, "<this>");
        f fVar = (f) aVar.a(f22221a);
        if (fVar != null) {
            k0 k0Var = (k0) aVar.a(f22222b);
            if (k0Var != null) {
                Bundle bundle = (Bundle) aVar.a(f22223c);
                String str = (String) aVar.a(i0.d.f22302c);
                if (str != null) {
                    return a(fVar, k0Var, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final <T extends f & k0> void c(T t10) {
        C17542s.j(t10, "<this>");
        r.b d10 = t10.getLifecycle().d();
        if (d10 != r.b.INITIALIZED && d10 != r.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (t10.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            Y y10 = new Y(t10.getSavedStateRegistry(), (k0) t10);
            t10.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", y10);
            t10.getLifecycle().c(new V(y10));
        }
    }

    public static final Y d(f fVar) {
        C17542s.j(fVar, "<this>");
        d.c c10 = fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Y y10 = c10 instanceof Y ? (Y) c10 : null;
        if (y10 != null) {
            return y10;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final Z e(k0 k0Var) {
        C17542s.j(k0Var, "<this>");
        return (Z) new i0(k0Var, (i0.c) new d()).b("androidx.lifecycle.internal.SavedStateHandlesVM", Z.class);
    }
}
