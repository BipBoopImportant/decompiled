package androidx.lifecycle;

import P4.d;
import P4.f;
import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.i0;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l3.a;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B%\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0003\u0010\u000bJ/\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/lifecycle/a0;", "Landroidx/lifecycle/i0$e;", "Landroidx/lifecycle/i0$c;", "<init>", "()V", "Landroid/app/Application;", "application", "LP4/f;", "owner", "Landroid/os/Bundle;", "defaultArgs", "(Landroid/app/Application;LP4/f;Landroid/os/Bundle;)V", "Landroidx/lifecycle/f0;", "T", "Ljava/lang/Class;", "modelClass", "Ll3/a;", "extras", "create", "(Ljava/lang/Class;Ll3/a;)Landroidx/lifecycle/f0;", "", "key", "b", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/f0;", "(Ljava/lang/Class;)Landroidx/lifecycle/f0;", "viewModel", "LXH/N;", "a", "(Landroidx/lifecycle/f0;)V", "Landroid/app/Application;", "Landroidx/lifecycle/i0$c;", "factory", "c", "Landroid/os/Bundle;", "Landroidx/lifecycle/r;", "e", "Landroidx/lifecycle/r;", "lifecycle", "LP4/d;", "f", "LP4/d;", "savedStateRegistry", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a0 extends i0.e implements i0.c {

    /* renamed from: a  reason: collision with root package name */
    private Application f22233a;

    /* renamed from: b  reason: collision with root package name */
    private final i0.c f22234b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f22235c;

    /* renamed from: e  reason: collision with root package name */
    private r f22236e;

    /* renamed from: f  reason: collision with root package name */
    private d f22237f;

    public a0() {
        this.f22234b = new i0.a();
    }

    public void a(f0 f0Var) {
        C17542s.j(f0Var, "viewModel");
        if (this.f22236e != null) {
            d dVar = this.f22237f;
            C17542s.g(dVar);
            r rVar = this.f22236e;
            C17542s.g(rVar);
            C5213p.a(f0Var, dVar, rVar);
        }
    }

    public final <T extends f0> T b(String str, Class<T> cls) {
        T t10;
        Application application;
        C17542s.j(str, "key");
        C17542s.j(cls, "modelClass");
        r rVar = this.f22236e;
        if (rVar != null) {
            boolean isAssignableFrom = C5199b.class.isAssignableFrom(cls);
            Constructor<T> c10 = (!isAssignableFrom || this.f22233a == null) ? b0.c(cls, b0.f22239b) : b0.c(cls, b0.f22238a);
            if (c10 == null) {
                return this.f22233a != null ? this.f22234b.create(cls) : i0.d.f22300a.a().create(cls);
            }
            d dVar = this.f22237f;
            C17542s.g(dVar);
            W b10 = C5213p.b(dVar, rVar, str, this.f22235c);
            if (!isAssignableFrom || (application = this.f22233a) == null) {
                t10 = b0.d(cls, c10, b10.f());
            } else {
                C17542s.g(application);
                t10 = b0.d(cls, c10, application, b10.f());
            }
            t10.addCloseable("androidx.lifecycle.savedstate.vm.tag", b10);
            return t10;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public <T extends f0> T create(Class<T> cls, a aVar) {
        Constructor<T> constructor;
        C17542s.j(cls, "modelClass");
        C17542s.j(aVar, "extras");
        String str = (String) aVar.a(i0.d.f22302c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (aVar.a(X.f22221a) != null && aVar.a(X.f22222b) != null) {
            Application application = (Application) aVar.a(i0.a.f22296h);
            boolean isAssignableFrom = C5199b.class.isAssignableFrom(cls);
            if (!isAssignableFrom || application == null) {
                constructor = b0.c(cls, b0.f22239b);
            } else {
                constructor = b0.c(cls, b0.f22238a);
            }
            if (constructor == null) {
                return this.f22234b.create(cls, aVar);
            }
            if (!isAssignableFrom || application == null) {
                return b0.d(cls, constructor, X.b(aVar));
            }
            return b0.d(cls, constructor, application, X.b(aVar));
        } else if (this.f22236e != null) {
            return b(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    @SuppressLint({"LambdaLast"})
    public a0(Application application, f fVar, Bundle bundle) {
        i0.a aVar;
        C17542s.j(fVar, "owner");
        this.f22237f = fVar.getSavedStateRegistry();
        this.f22236e = fVar.getLifecycle();
        this.f22235c = bundle;
        this.f22233a = application;
        if (application != null) {
            aVar = i0.a.f22294f.a(application);
        } else {
            aVar = new i0.a();
        }
        this.f22234b = aVar;
    }

    public <T extends f0> T create(Class<T> cls) {
        C17542s.j(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
