package androidx.lifecycle;

import P4.d;
import P4.f;
import android.os.Bundle;
import androidx.lifecycle.i0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l3.a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0015J7\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0017\u001a\u00020\u0016H$¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\tH\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010$¨\u0006%"}, d2 = {"Landroidx/lifecycle/a;", "Landroidx/lifecycle/i0$e;", "Landroidx/lifecycle/i0$c;", "LP4/f;", "owner", "Landroid/os/Bundle;", "defaultArgs", "<init>", "(LP4/f;Landroid/os/Bundle;)V", "Landroidx/lifecycle/f0;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "b", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/f0;", "Ll3/a;", "extras", "create", "(Ljava/lang/Class;Ll3/a;)Landroidx/lifecycle/f0;", "(Ljava/lang/Class;)Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "handle", "c", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/U;)Landroidx/lifecycle/f0;", "viewModel", "LXH/N;", "a", "(Landroidx/lifecycle/f0;)V", "LP4/d;", "LP4/d;", "savedStateRegistry", "Landroidx/lifecycle/r;", "Landroidx/lifecycle/r;", "lifecycle", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.a  reason: case insensitive filesystem */
public abstract class C5198a extends i0.e implements i0.c {

    /* renamed from: a  reason: collision with root package name */
    private d f22230a;

    /* renamed from: b  reason: collision with root package name */
    private r f22231b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f22232c;

    public C5198a(f fVar, Bundle bundle) {
        C17542s.j(fVar, "owner");
        this.f22230a = fVar.getSavedStateRegistry();
        this.f22231b = fVar.getLifecycle();
        this.f22232c = bundle;
    }

    private final <T extends f0> T b(String str, Class<T> cls) {
        d dVar = this.f22230a;
        C17542s.g(dVar);
        r rVar = this.f22231b;
        C17542s.g(rVar);
        W b10 = C5213p.b(dVar, rVar, str, this.f22232c);
        T c10 = c(str, cls, b10.f());
        c10.addCloseable("androidx.lifecycle.savedstate.vm.tag", b10);
        return c10;
    }

    public void a(f0 f0Var) {
        C17542s.j(f0Var, "viewModel");
        d dVar = this.f22230a;
        if (dVar != null) {
            C17542s.g(dVar);
            r rVar = this.f22231b;
            C17542s.g(rVar);
            C5213p.a(f0Var, dVar, rVar);
        }
    }

    /* access modifiers changed from: protected */
    public abstract <T extends f0> T c(String str, Class<T> cls, U u10);

    public <T extends f0> T create(Class<T> cls, a aVar) {
        C17542s.j(cls, "modelClass");
        C17542s.j(aVar, "extras");
        String str = (String) aVar.a(i0.d.f22302c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (this.f22230a != null) {
            return b(str, cls);
        } else {
            return c(str, cls, X.b(aVar));
        }
    }

    public <T extends f0> T create(Class<T> cls) {
        C17542s.j(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else if (this.f22231b != null) {
            return b(canonicalName, cls);
        } else {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
