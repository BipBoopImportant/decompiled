package GI;

import DI.C15544O;
import DI.C15545P;
import DI.C15549U;
import DI.C15550V;
import XH.C16814e;
import YH.C16877v;
import cJ.C17066c;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

/* renamed from: GI.l  reason: case insensitive filesystem */
public final class C15742l implements C15550V {

    /* renamed from: a  reason: collision with root package name */
    private final List<C15545P> f134623a;

    /* renamed from: b  reason: collision with root package name */
    private final String f134624b;

    public C15742l(List<? extends C15545P> list, String str) {
        C17542s.j(list, "providers");
        C17542s.j(str, "debugName");
        this.f134623a = list;
        this.f134624b = str;
        list.size();
        C16877v.y1(list).size();
    }

    public boolean a(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        Iterable<C15545P> iterable = this.f134623a;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (C15545P b10 : iterable) {
            if (!C15549U.b(b10, cVar)) {
                return false;
            }
        }
        return true;
    }

    @C16814e
    public List<C15544O> b(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (C15545P a10 : this.f134623a) {
            C15549U.a(a10, cVar, arrayList);
        }
        return C16877v.t1(arrayList);
    }

    public void c(C17066c cVar, Collection<C15544O> collection) {
        C17542s.j(cVar, "fqName");
        C17542s.j(collection, "packageFragments");
        for (C15545P a10 : this.f134623a) {
            C15549U.a(a10, cVar, collection);
        }
    }

    public Collection<C17066c> s(C17066c cVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(cVar, "fqName");
        C17542s.j(lVar, "nameFilter");
        HashSet hashSet = new HashSet();
        for (C15545P s10 : this.f134623a) {
            hashSet.addAll(s10.s(cVar, lVar));
        }
        return hashSet;
    }

    public String toString() {
        return this.f134624b;
    }
}
