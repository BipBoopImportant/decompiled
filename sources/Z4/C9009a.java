package z4;

import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import f1.C5303e;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002XD¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lz4/a;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "handle", "<init>", "(Landroidx/lifecycle/U;)V", "LXH/N;", "onCleared", "()V", "", "m", "Ljava/lang/String;", "IdKey", "Ljava/util/UUID;", "n", "Ljava/util/UUID;", "C", "()Ljava/util/UUID;", "id", "Ljava/lang/ref/WeakReference;", "Lf1/e;", "o", "Ljava/lang/ref/WeakReference;", "D", "()Ljava/lang/ref/WeakReference;", "E", "(Ljava/lang/ref/WeakReference;)V", "saveableStateHolderRef", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: z4.a  reason: case insensitive filesystem */
public final class C9009a extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final String f58182m = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: n  reason: collision with root package name */
    private final UUID f58183n;

    /* renamed from: o  reason: collision with root package name */
    public WeakReference<C5303e> f58184o;

    public C9009a(U u10) {
        UUID uuid = (UUID) u10.f("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            u10.m("SaveableStateHolder_BackStackEntryKey", uuid);
        }
        this.f58183n = uuid;
    }

    public final UUID C() {
        return this.f58183n;
    }

    public final WeakReference<C5303e> D() {
        WeakReference<C5303e> weakReference = this.f58184o;
        if (weakReference != null) {
            return weakReference;
        }
        C17542s.z("saveableStateHolderRef");
        return null;
    }

    public final void E(WeakReference<C5303e> weakReference) {
        this.f58184o = weakReference;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        C5303e eVar = D().get();
        if (eVar != null) {
            eVar.c(this.f58183n);
        }
        D().clear();
    }
}
