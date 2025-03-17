package androidx.work;

import androidx.lifecycle.F;
import androidx.work.C;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ob.C10101e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/work/D;", "Landroidx/work/C;", "Landroidx/lifecycle/F;", "Landroidx/work/C$b;", "state", "Lob/e;", "Landroidx/work/C$b$c;", "future", "<init>", "(Landroidx/lifecycle/F;Lob/e;)V", "getState", "()Landroidx/lifecycle/F;", "a", "()Lob/e;", "c", "Landroidx/lifecycle/F;", "d", "Lob/e;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class D implements C {

    /* renamed from: c  reason: collision with root package name */
    private final F<C.b> f45065c;

    /* renamed from: d  reason: collision with root package name */
    private final C10101e<C.b.c> f45066d;

    public D(F<C.b> f10, C10101e<C.b.c> eVar) {
        C17542s.j(f10, "state");
        C17542s.j(eVar, "future");
        this.f45065c = f10;
        this.f45066d = eVar;
    }

    public C10101e<C.b.c> a() {
        return this.f45066d;
    }

    public F<C.b> getState() {
        return this.f45065c;
    }
}
