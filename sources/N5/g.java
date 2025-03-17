package N5;

import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5220x;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import kotlin.Metadata;

@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LN5/g;", "Landroidx/lifecycle/r;", "<init>", "()V", "Landroidx/lifecycle/x;", "observer", "LXH/N;", "c", "(Landroidx/lifecycle/x;)V", "g", "", "toString", "()Ljava/lang/String;", "N5/g$a", "LN5/g$a;", "owner", "Landroidx/lifecycle/r$b;", "d", "()Landroidx/lifecycle/r$b;", "currentState", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends r {

    /* renamed from: b  reason: collision with root package name */
    public static final g f38991b = new g();

    /* renamed from: c  reason: collision with root package name */
    private static final a f38992c = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"N5/g$a", "Landroidx/lifecycle/y;", "LN5/g;", "a", "()LN5/g;", "lifecycle", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements C5221y {
        a() {
        }

        /* renamed from: a */
        public g getLifecycle() {
            return g.f38991b;
        }
    }

    private g() {
    }

    public void c(C5220x xVar) {
        if (xVar instanceof C5205h) {
            C5205h hVar = (C5205h) xVar;
            a aVar = f38992c;
            hVar.c(aVar);
            hVar.onStart(aVar);
            hVar.onResume(aVar);
            return;
        }
        throw new IllegalArgumentException((xVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    public r.b d() {
        return r.b.RESUMED;
    }

    public void g(C5220x xVar) {
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
