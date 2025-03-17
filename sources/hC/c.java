package Hc;

import Kb.C9128c;
import Kb.C9129d;
import Kb.q;
import java.util.Iterator;
import java.util.Set;

public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    private final String f60743a;

    /* renamed from: b  reason: collision with root package name */
    private final d f60744b;

    c(Set<f> set, d dVar) {
        this.f60743a = e(set);
        this.f60744b = dVar;
    }

    public static C9128c<i> c() {
        return C9128c.e(i.class).b(q.o(f.class)).f(new b()).d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i d(C9129d dVar) {
        return new c(dVar.d(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public String a() {
        if (this.f60744b.b().isEmpty()) {
            return this.f60743a;
        }
        return this.f60743a + ' ' + e(this.f60744b.b());
    }
}
