package Uc;

import android.content.ComponentCallbacks;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"LUc/j0;", "", "Landroid/content/ComponentCallbacks;", "componentCallbacks", "LUc/Z;", "lifecycleObserver", "<init>", "(Landroid/content/ComponentCallbacks;LUc/Z;)V", "a", "()Landroid/content/ComponentCallbacks;", "b", "()LUc/Z;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/ComponentCallbacks;", "getComponentCallbacks", "LUc/Z;", "getLifecycleObserver", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Uc.j0  reason: case insensitive filesystem */
final class C9310j0 {

    /* renamed from: a  reason: collision with root package name */
    private final ComponentCallbacks f64321a;

    /* renamed from: b  reason: collision with root package name */
    private final Z f64322b;

    public C9310j0(ComponentCallbacks componentCallbacks, Z z10) {
        C17542s.j(componentCallbacks, "componentCallbacks");
        C17542s.j(z10, "lifecycleObserver");
        this.f64321a = componentCallbacks;
        this.f64322b = z10;
    }

    public final ComponentCallbacks a() {
        return this.f64321a;
    }

    public final Z b() {
        return this.f64322b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9310j0)) {
            return false;
        }
        C9310j0 j0Var = (C9310j0) obj;
        return C17542s.e(this.f64321a, j0Var.f64321a) && C17542s.e(this.f64322b, j0Var.f64322b);
    }

    public int hashCode() {
        return (this.f64321a.hashCode() * 31) + this.f64322b.hashCode();
    }

    public String toString() {
        return "MapTagData(componentCallbacks=" + this.f64321a + ", lifecycleObserver=" + this.f64322b + ')';
    }
}
