package Pr;

import KJ.C15985a;
import Qr.b;
import XH.t;
import YH.C16877v;
import java.util.ArrayList;
import kotlin.Metadata;
import nF.C14850a;
import nF.C14851b;
import nF.C14853d;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LnF/b;", "LQr/b$c;", "g", "(LnF/b;)LQr/b$c;", "LnF/b$a;", "LQr/b$c$a;", "e", "(LnF/b$a;)LQr/b$c$a;", "LnF/b$b;", "LQr/b$c$b;", "f", "(LnF/b$b;)LQr/b$c$b;", "LnF/a;", "LQr/b$a;", "b", "(LnF/a;)LQr/b$a;", "LnF/d$b;", "LQr/b$b$a;", "c", "(LnF/d$b;)LQr/b$b$a;", "LnF/d$c;", "LQr/b$b$b;", "d", "(LnF/d$c;)LQr/b$b$b;", "geomagical-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    private static final b.a b(C14850a aVar) {
        b.C1772b d10;
        b.C1772b bVar;
        String c10 = aVar.c();
        String f10 = aVar.f();
        C14853d d11 = aVar.d();
        if (d11 instanceof C14853d.b) {
            d10 = c((C14853d.b) d11);
        } else if (d11 instanceof C14853d.c) {
            d10 = d((C14853d.c) d11);
        } else {
            throw new t();
        }
        b.C1772b bVar2 = d10;
        String a10 = aVar.a();
        C14853d b10 = aVar.b();
        if (b10 instanceof C14853d.b) {
            bVar = c((C14853d.b) b10);
        } else if (b10 instanceof C14853d.c) {
            bVar = d((C14853d.c) b10);
        } else if (b10 == null) {
            bVar = null;
        } else {
            throw new t();
        }
        return new b.a(c10, f10, bVar2, a10, bVar);
    }

    private static final b.C1772b.a c(C14853d.b bVar) {
        return new b.C1772b.a(bVar.f(), bVar.d(), bVar.e());
    }

    private static final b.C1772b.C1773b d(C14853d.c cVar) {
        return new b.C1772b.C1773b(cVar.f(), cVar.d(), cVar.e());
    }

    private static final b.c.a e(C14851b.a aVar) {
        b.C1772b bVar;
        C14853d a10 = aVar.a();
        if (a10 instanceof C14853d.c) {
            bVar = d((C14853d.c) a10);
        } else if (a10 instanceof C14853d.b) {
            bVar = c((C14853d.b) a10);
        } else {
            throw new t();
        }
        return new b.c.a(bVar);
    }

    private static final b.c.C1774b f(C14851b.C3193b bVar) {
        String b10 = bVar.b();
        String c10 = bVar.c();
        Iterable<C14850a> a10 = bVar.a();
        ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
        for (C14850a b11 : a10) {
            arrayList.add(b(b11));
        }
        return new b.c.C1774b(b10, c10, C15985a.h(arrayList));
    }

    /* access modifiers changed from: private */
    public static final b.c g(C14851b bVar) {
        if (bVar instanceof C14851b.a) {
            return e((C14851b.a) bVar);
        }
        if (bVar instanceof C14851b.C3193b) {
            return f((C14851b.C3193b) bVar);
        }
        throw new t();
    }
}
