package Qv;

import Dr.d;
import Rv.c;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LQv/a;", "", "<init>", "()V", "LDr/d$a;", "action", "LRv/c$a;", "a", "(LDr/d$a;)LRv/c$a;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f39645a = new a();

    private a() {
    }

    public final c.a a(d.a aVar) {
        C17542s.j(aVar, "action");
        String uri = aVar.a().toString();
        C17542s.i(uri, "toString(...)");
        if (aVar instanceof d.a.C1510a) {
            return new c.a.C0643c.C0644a.C0645a(uri);
        }
        if (aVar instanceof d.a.c) {
            return new c.a.C0643c.C0644a.C0646c(uri);
        }
        if (aVar instanceof d.a.b) {
            return new c.a.C0643c.C0644a.b(uri);
        }
        if (aVar instanceof d.a.C1511d) {
            return new c.a.C0643c.C0644a.d(uri);
        }
        throw new t();
    }
}
