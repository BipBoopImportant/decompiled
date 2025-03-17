package Nz;

import Nz.c;
import Nz.d;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tf.C10253a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0014"}, d2 = {"LNz/b;", "LNz/a;", "Ltf/a;", "killSwitchRepository", "LRy/b;", "scanAndGoCapability", "<init>", "(Ltf/a;LRy/b;)V", "LXH/N;", "b", "()V", "LNz/d;", "c", "()LNz/d;", "LNz/c;", "request", "a", "(LNz/c;)LNz/d;", "Ltf/a;", "LRy/b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final C10253a f112746a;

    /* renamed from: b  reason: collision with root package name */
    private final Ry.b f112747b;

    public b(C10253a aVar, Ry.b bVar) {
        C17542s.j(aVar, "killSwitchRepository");
        C17542s.j(bVar, "scanAndGoCapability");
        this.f112746a = aVar;
        this.f112747b = bVar;
    }

    private final void b() {
        this.f112747b.i(true);
    }

    private final d c() {
        return this.f112746a.n() ? this.f112747b.h() ? d.b.a.f112752b : d.b.C2781b.f112753b : d.a.f112751b;
    }

    public d a(c cVar) {
        C17542s.j(cVar, "request");
        if (C17542s.e(cVar, c.a.f112748a)) {
            b();
        } else if (!C17542s.e(cVar, c.b.f112749a)) {
            throw new t();
        }
        return c();
    }
}
