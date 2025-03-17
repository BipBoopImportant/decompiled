package DI;

import GJ.C15768k;
import XH.C16814e;
import YH.C16877v;
import cJ.C17066c;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

/* renamed from: DI.T  reason: case insensitive filesystem */
public final class C15548T implements C15550V {

    /* renamed from: a  reason: collision with root package name */
    private final Collection<C15544O> f133825a;

    public C15548T(Collection<? extends C15544O> collection) {
        C17542s.j(collection, "packageFragments");
        this.f133825a = collection;
    }

    /* access modifiers changed from: private */
    public static final C17066c f(C15544O o10) {
        C17542s.j(o10, "it");
        return o10.f();
    }

    /* access modifiers changed from: private */
    public static final boolean g(C17066c cVar, C17066c cVar2) {
        C17542s.j(cVar2, "it");
        return !cVar2.c() && C17542s.e(cVar2.d(), cVar);
    }

    public boolean a(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        Iterable<C15544O> iterable = this.f133825a;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (C15544O f10 : iterable) {
            if (C17542s.e(f10.f(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @C16814e
    public List<C15544O> b(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (Object next : this.f133825a) {
            if (C17542s.e(((C15544O) next).f(), cVar)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public void c(C17066c cVar, Collection<C15544O> collection) {
        C17542s.j(cVar, "fqName");
        C17542s.j(collection, "packageFragments");
        for (Object next : this.f133825a) {
            if (C17542s.e(((C15544O) next).f(), cVar)) {
                collection.add(next);
            }
        }
    }

    public Collection<C17066c> s(C17066c cVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(cVar, "fqName");
        C17542s.j(lVar, "nameFilter");
        return C15768k.a0(C15768k.H(C15768k.S(C16877v.h0(this.f133825a), C15546Q.f133823a), new C15547S(cVar)));
    }
}
