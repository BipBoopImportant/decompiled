package p8;

import E1.N;
import G8.g;
import GJ.C15768k;
import HJ.C15854t;
import L1.b;
import L1.j;
import L1.k;
import L1.l;
import L1.m;
import L1.p;
import L1.s;
import YH.C16877v;
import android.graphics.Rect;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import m8.C8560a;
import m8.C8563d;
import nI.C17642l;
import o1.C5667g;
import o1.C5669i;
import q8.C8685a;
import w8.d;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0019\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u000b\u0010\t\u001a'\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"LL1/p;", "rootNode", "Lo1/g;", "targetCoordinates", "Lw8/d;", "c", "(LL1/p;Lo1/g;)Lw8/d;", "b", "d", "(LL1/p;)Lw8/d;", "node", "a", "", "LE1/N;", "modifierInfos", "Lp8/a;", "classNameResolver", "", "e", "(Ljava/util/List;Lp8/a;)Z", "compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    public static final class a extends C17544u implements C17642l<C8563d, p> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f55442c = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            C8563d dVar = (C8563d) obj;
            C17542s.j(dVar, "node");
            return dVar.c();
        }
    }

    public static final d a(p pVar) {
        C17542s.j(pVar, "node");
        l n10 = pVar.n();
        s sVar = s.f9010a;
        j jVar = (j) m.a(n10, sVar.I());
        l n11 = pVar.n();
        k kVar = k.f8953a;
        L1.a aVar = (L1.a) m.a(n11, kVar.t());
        C17642l lVar = null;
        nI.p pVar2 = aVar != null ? (nI.p) aVar.a() : null;
        if (jVar == null || pVar2 == null) {
            return null;
        }
        boolean f10 = f(pVar.p().r(), (C8638a) null, 2, (Object) null);
        b bVar = (b) m.a(pVar.n(), sVar.a());
        int max = Math.max(bVar != null ? bVar.a() : 0, f10 ? 1 : 0);
        L1.a aVar2 = (L1.a) m.a(pVar.n(), kVar.v());
        if (aVar2 != null) {
            lVar = (C17642l) aVar2.a();
        }
        C5669i j10 = pVar.j();
        Rect rect = new Rect((int) j10.o(), (int) j10.r(), (int) j10.p(), (int) j10.j());
        return (max != 1 || lVar == null) ? new q8.b(String.valueOf(pVar.p().q()), rect, jVar, pVar2) : new C8685a(lVar, pVar2, jVar, rect, t8.b.c(pVar));
    }

    private static final d b(p pVar, C5667g gVar) {
        if (gVar != null) {
            for (R a10 : C15768k.T(C16877v.h0(g.l(new C8560a().c(t8.b.c(pVar), gVar.v()))), a.f55442c)) {
                d a11 = a(a10);
                if (a11 != null) {
                    return a11;
                }
            }
        }
        return null;
    }

    public static final d c(p pVar, C5667g gVar) {
        C17542s.j(pVar, "rootNode");
        d b10 = b(pVar, gVar);
        return b10 == null ? d(pVar) : b10;
    }

    private static final d d(p pVar) {
        d a10 = a(pVar);
        if (a10 != null) {
            return a10;
        }
        for (p d10 : pVar.k()) {
            d d11 = d(d10);
            if (d11 != null) {
                return d11;
            }
        }
        return null;
    }

    public static final boolean e(List<N> list, C8638a aVar) {
        C17542s.j(list, "modifierInfos");
        C17542s.j(aVar, "classNameResolver");
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (N b10 : list) {
            if (C15854t.W((String) aVar.invoke(b10.b()), "LazyLayout", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean f(List list, C8638a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = new b();
        }
        return e(list, aVar);
    }
}
