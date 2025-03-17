package GI;

import DI.C15538I;
import DI.C15551W;
import DI.C15566m;
import EJ.C15660a;
import YH.C16877v;
import YH.g0;
import cJ.C17066c;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nJ.C17648c;
import nJ.C17649d;
import nJ.C17657l;

/* renamed from: GI.P  reason: case insensitive filesystem */
public class C15722P extends C17657l {

    /* renamed from: b  reason: collision with root package name */
    private final C15538I f134555b;

    /* renamed from: c  reason: collision with root package name */
    private final C17066c f134556c;

    public C15722P(C15538I i10, C17066c cVar) {
        C17542s.j(i10, "moduleDescriptor");
        C17542s.j(cVar, "fqName");
        this.f134555b = i10;
        this.f134556c = cVar;
    }

    public Set<C17069f> f() {
        return g0.d();
    }

    public Collection<C15566m> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        if (!dVar.a(C17649d.f144823c.f())) {
            return C16877v.n();
        }
        if (this.f134556c.c() && dVar.l().contains(C17648c.b.f144822a)) {
            return C16877v.n();
        }
        Collection<C17066c> s10 = this.f134555b.s(this.f134556c, lVar);
        ArrayList arrayList = new ArrayList(s10.size());
        for (C17066c f10 : s10) {
            C17069f f11 = f10.f();
            if (lVar.invoke(f11).booleanValue()) {
                C15660a.a(arrayList, h(f11));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final C15551W h(C17069f fVar) {
        C17542s.j(fVar, "name");
        if (fVar.B()) {
            return null;
        }
        C15551W v02 = this.f134555b.v0(this.f134556c.b(fVar));
        if (v02.isEmpty()) {
            return null;
        }
        return v02;
    }

    public String toString() {
        return "subpackages of " + this.f134556c + " from " + this.f134555b;
    }
}
