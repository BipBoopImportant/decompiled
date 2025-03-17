package e;

import XH.C16807N;
import androidx.core.app.d;
import g.C5314c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0004R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Le/a;", "I", "", "<init>", "()V", "input", "Landroidx/core/app/d;", "options", "LXH/N;", "a", "(Ljava/lang/Object;Landroidx/core/app/d;)V", "c", "Lg/c;", "Lg/c;", "getLauncher", "()Lg/c;", "b", "(Lg/c;)V", "launcher", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.a  reason: case insensitive filesystem */
public final class C5278a<I> {

    /* renamed from: a  reason: collision with root package name */
    private C5314c<I> f23142a;

    public final void a(I i10, d dVar) {
        C16807N n10;
        C5314c<I> cVar = this.f23142a;
        if (cVar != null) {
            cVar.b(i10, dVar);
            n10 = C16807N.f139792a;
        } else {
            n10 = null;
        }
        if (n10 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void b(C5314c<I> cVar) {
        this.f23142a = cVar;
    }

    public final void c() {
        C16807N n10;
        C5314c<I> cVar = this.f23142a;
        if (cVar != null) {
            cVar.c();
            n10 = C16807N.f139792a;
        } else {
            n10 = null;
        }
        if (n10 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
