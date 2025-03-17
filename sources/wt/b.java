package Wt;

import Il.a;
import aA.C13909a;
import am.h;
import ep.C11255a;
import ep.C11256b;
import jt.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LWt/b;", "LWt/a;", "Lam/h;", "timeProvider", "Lep/b;", "localizedDateTimeFormatter", "LIl/a;", "appConfigApi", "Lep/a;", "dateFormatPattern", "LaA/a;", "sessionManager", "<init>", "(Lam/h;Lep/b;LIl/a;Lep/a;LaA/a;)V", "Ljt/b;", "storeEvent", "LXt/a;", "b", "(Ljt/b;)LXt/a;", "", "currentTimeSlotId", "LSt/a;", "a", "(Ljt/b;Ljava/lang/String;)LSt/a;", "selectedTimeSlotId", "Ljt/b$f;", "c", "(Ljt/b;Ljava/lang/String;)Ljt/b$f;", "Lam/h;", "Lep/b;", "LIl/a;", "d", "Lep/a;", "e", "LaA/a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final h f89160a;

    /* renamed from: b  reason: collision with root package name */
    private final C11256b f89161b;

    /* renamed from: c  reason: collision with root package name */
    private final a f89162c;

    /* renamed from: d  reason: collision with root package name */
    private final C11255a f89163d;

    /* renamed from: e  reason: collision with root package name */
    private final C13909a f89164e;

    public b(h hVar, C11256b bVar, a aVar, C11255a aVar2, C13909a aVar3) {
        C17542s.j(hVar, "timeProvider");
        C17542s.j(bVar, "localizedDateTimeFormatter");
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(aVar2, "dateFormatPattern");
        C17542s.j(aVar3, "sessionManager");
        this.f89160a = hVar;
        this.f89161b = bVar;
        this.f89162c = aVar;
        this.f89163d = aVar2;
        this.f89164e = aVar3;
    }

    public St.a a(jt.b bVar, String str) {
        C17542s.j(bVar, "storeEvent");
        C17542s.j(str, "currentTimeSlotId");
        return c.l(bVar, this.f89161b, this.f89162c.s(), this.f89164e.isLoggedIn(), this.f89164e.i(), this.f89160a.d(), str, this.f89163d);
    }

    public Xt.a b(jt.b bVar) {
        C17542s.j(bVar, "storeEvent");
        return c.m(bVar, this.f89160a.d(), this.f89161b, this.f89162c.s());
    }

    public b.f c(jt.b bVar, String str) {
        C17542s.j(bVar, "storeEvent");
        return c.b(bVar, str, this.f89160a.d());
    }
}
