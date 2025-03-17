package AI;

import AI.C15435p;
import YH.C16877v;
import cJ.C17065b;
import cJ.C17066c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: AI.d  reason: case insensitive filesystem */
public final class C15423d {

    /* renamed from: a  reason: collision with root package name */
    public static final C15423d f132979a = new C15423d();

    /* renamed from: b  reason: collision with root package name */
    private static final Set<C17065b> f132980b;

    static {
        Iterable<C15432m> iterable = C15432m.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C15432m c10 : iterable) {
            arrayList.add(C15435p.c(c10));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C17065b.a aVar = C17065b.f141241d;
        for (C17066c c11 : C16877v.W0(C16877v.W0(C16877v.W0(arrayList, C15435p.a.f133104h.m()), C15435p.a.f133108j.m()), C15435p.a.f133126s.m())) {
            linkedHashSet.add(aVar.c(c11));
        }
        f132980b = linkedHashSet;
    }

    private C15423d() {
    }

    public final Set<C17065b> a() {
        return f132980b;
    }

    public final Set<C17065b> b() {
        return f132980b;
    }
}
