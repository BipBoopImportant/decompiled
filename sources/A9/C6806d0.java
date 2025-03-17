package a9;

import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.d0  reason: case insensitive filesystem */
public final class C6806d0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f42497a = new ArrayList();

    public final synchronized List<C6921r4> a() {
        List<C6921r4> t12;
        t12 = C16877v.t1(this.f42497a);
        this.f42497a.clear();
        return t12;
    }

    public final synchronized void b(C6921r4 r4Var) {
        C17542s.j(r4Var, "event");
        this.f42497a.add(r4Var);
    }
}
