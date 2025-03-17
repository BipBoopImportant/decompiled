package ZA;

import WA.C13765c;
import WA.C13766d;
import WA.C13767e;
import WA.C13768f;
import WA.h;
import WA.i;
import YH.C16877v;
import gB.C14499a;
import gB.C14500b;
import gB.C14501c;
import gB.C14502d;
import gB.C14503e;
import gB.C14505g;
import gB.C14506h;
import gB.C14507i;
import gB.k;
import jB.C14613b;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001d\u001a\u00020\u0000*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010!\u001a\u00020 *\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LWA/h;", "LgB/g;", "f", "(LWA/h;)LgB/g;", "LWA/e;", "LgB/d;", "d", "(LWA/e;)LgB/d;", "", "value", "LgB/c;", "a", "(Ljava/lang/String;)LgB/c;", "LWA/d;", "LgB/b;", "c", "(LWA/d;)LgB/b;", "LWA/k;", "LgB/k;", "h", "(LWA/k;)LgB/k;", "LWA/f;", "LgB/e;", "e", "(LWA/f;)LgB/e;", "LjB/b$b;", "listId", "Ljava/time/Instant;", "createdAt", "b", "(LjB/b$b;Ljava/lang/String;Ljava/time/Instant;)LWA/h;", "LWA/i;", "LgB/i;", "g", "(LWA/i;)LgB/i;", "shoppinglist-datalayer-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZA.a  reason: case insensitive filesystem */
public final class C13871a {
    private static final C14501c a(String str) {
        C14501c cVar = C14501c.FAMILY;
        if (!C17542s.e(str, cVar.b())) {
            cVar = C14501c.REGULAR;
            if (!C17542s.e(str, cVar.b())) {
                cVar = C14501c.TRO;
                if (!C17542s.e(str, cVar.b())) {
                    cVar = C14501c.NLP;
                    if (!C17542s.e(str, cVar.b())) {
                        throw new IllegalArgumentException("getPriceTypeFromString: unknown price type: " + str);
                    }
                }
            }
        }
        return cVar;
    }

    public static final h b(C14613b.C3151b bVar, String str, Instant instant) {
        C14613b.C3151b bVar2 = bVar;
        C17542s.j(bVar, "<this>");
        C17542s.j(str, "listId");
        Instant instant2 = instant;
        C17542s.j(instant2, "createdAt");
        return new h(str, bVar.a(), "", bVar.b(), instant2, 1, false, false, false, false, C16877v.n(), (C13766d) null);
    }

    public static final C14500b c(C13766d dVar) {
        C17542s.j(dVar, "<this>");
        return new C14500b(dVar.f(), dVar.b(), dVar.e(), dVar.g(), dVar.h(), dVar.d(), dVar.a(), dVar.c());
    }

    public static final C14502d d(C13767e eVar) {
        C17542s.j(eVar, "<this>");
        return new C14502d(a(eVar.g()), eVar.e(), eVar.f(), eVar.a(), eVar.h(), eVar.d(), eVar.b());
    }

    public static final C14503e e(C13768f fVar) {
        C17542s.j(fVar, "<this>");
        return new C14503e(fVar.a(), fVar.b(), fVar.c());
    }

    public static final C14505g f(h hVar) {
        C17542s.j(hVar, "<this>");
        String d10 = hVar.d();
        String b10 = hVar.b();
        String c10 = hVar.c();
        int g10 = hVar.g();
        C13766d f10 = hVar.f();
        return new C14505g(d10, b10, c10, g10, f10 != null ? c(f10) : null, hVar.a(), hVar.h(), hVar.e(), hVar.k(), hVar.j(), hVar.l(), hVar.i());
    }

    public static final C14507i g(i iVar) {
        C17542s.j(iVar, "<this>");
        String d10 = iVar.b().d();
        String b10 = iVar.b().b();
        String c10 = iVar.b().c();
        int g10 = iVar.b().g();
        C13766d f10 = iVar.b().f();
        C14505g gVar = new C14505g(d10, b10, c10, g10, f10 != null ? c(f10) : null, iVar.b().a(), iVar.b().h(), iVar.b().e(), iVar.b().k(), iVar.b().j(), iVar.b().l(), iVar.b().i());
        Iterable<C13767e> c11 = iVar.c();
        ArrayList arrayList = new ArrayList(C16877v.y(c11, 10));
        for (C13767e d11 : c11) {
            arrayList.add(d(d11));
        }
        C14506h hVar = new C14506h(gVar, arrayList);
        Iterable<C13765c> a10 = iVar.a();
        ArrayList arrayList2 = new ArrayList(C16877v.y(a10, 10));
        for (C13765c cVar : a10) {
            String a11 = cVar.b().a();
            C13766d d12 = cVar.a().d();
            arrayList2.add(new C14499a(a11, d12 != null ? c(d12) : null, cVar.a().a(), cVar.a().e()));
        }
        return new C14507i(hVar, arrayList2);
    }

    public static final k h(WA.k kVar) {
        C17542s.j(kVar, "<this>");
        C14503e e10 = e(kVar.b());
        Iterable<h> a10 = kVar.a();
        ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
        for (h f10 : a10) {
            arrayList.add(f(f10));
        }
        return new k(e10, arrayList);
    }
}
