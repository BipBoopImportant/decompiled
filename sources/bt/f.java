package bt;

import TJ.C16532g;
import XH.C16807N;
import dI.C17164e;
import dt.C11240a;
import dt.b;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018¨\u0006\u0019"}, d2 = {"Lbt/f;", "Lbt/e;", "Lbt/d;", "foodMobileRemoteDataSource", "Lbt/a;", "foodMobileLocalSource", "<init>", "(Lbt/d;Lbt/a;)V", "", "storeId", "Ldt/b;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Ldt/a;", "currentOrder", "LXH/N;", "d", "(Ldt/a;LdI/e;)Ljava/lang/Object;", "c", "(LdI/e;)Ljava/lang/Object;", "LTJ/g;", "a", "()LTJ/g;", "Lbt/d;", "Lbt/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final d f90699a;

    /* renamed from: b  reason: collision with root package name */
    private final C11126a f90700b;

    public f(d dVar, C11126a aVar) {
        C17542s.j(dVar, "foodMobileRemoteDataSource");
        C17542s.j(aVar, "foodMobileLocalSource");
        this.f90699a = dVar;
        this.f90700b = aVar;
    }

    public C16532g<C11240a> a() {
        return this.f90700b.a();
    }

    public Object b(String str, C17164e<? super b> eVar) {
        return this.f90699a.a(str, eVar);
    }

    public Object c(C17164e<? super C16807N> eVar) {
        Object c10 = this.f90700b.c(eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public Object d(C11240a aVar, C17164e<? super C16807N> eVar) {
        Object d10 = this.f90700b.d(aVar, eVar);
        return d10 == C17187b.f() ? d10 : C16807N.f139792a;
    }
}
