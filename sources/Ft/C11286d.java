package ft;

import TJ.C16532g;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lft/d;", "Lft/c;", "Lft/b;", "dataSource", "<init>", "(Lft/b;)V", "LTJ/g;", "", "b", "()LTJ/g;", "shown", "LXH/N;", "a", "(ZLdI/e;)Ljava/lang/Object;", "Lft/b;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ft.d  reason: case insensitive filesystem */
public final class C11286d implements C11285c {

    /* renamed from: a  reason: collision with root package name */
    private final C11284b f97526a;

    public C11286d(C11284b bVar) {
        C17542s.j(bVar, "dataSource");
        this.f97526a = bVar;
    }

    public Object a(boolean z10, C17164e<? super C16807N> eVar) {
        Object c10 = this.f97526a.c(z10, eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public C16532g<Boolean> b() {
        return this.f97526a.b();
    }
}
