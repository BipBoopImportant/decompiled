package Jy;

import HJ.C15854t;
import Jy.o;
import KJ.C15985a;
import Nd.a;
import Nd.g;
import Nd.h;
import Op.C10850o;
import Op.a1;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"LJy/c;", "", "LNd/c;", "abTesting", "<init>", "(LNd/c;)V", "LOp/a1$a;", "d", "()LOp/a1$a;", "LJy/o$a;", "item", "c", "(LJy/o$a;)LOp/a1$a;", "a", "LNd/c;", "LNd/a$a;", "b", "LXH/o;", "()LNd/a$a;", "scanAndGoMarkAsCollected", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Nd.c f111400a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f111401b = C16825p.b(new b(this));

    public c(Nd.c cVar) {
        C17542s.j(cVar, "abTesting");
        this.f111400a = cVar;
    }

    private final a.C1042a b() {
        return (a.C1042a) this.f111401b.getValue();
    }

    private final a1.a d() {
        return b() instanceof h.b ? new a1.a(C15985a.b(C10850o.f.f85251a)) : new a1.a(C15985a.b(C10850o.h.f85258a));
    }

    /* access modifiers changed from: private */
    public static final h e(c cVar) {
        h hVar = (h) cVar.f111400a.c(g.f62014a, true);
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("A/B Test: Mark As Collected enabled: " + hVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = c.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        return hVar;
    }

    public final a1.a c(o.a aVar) {
        C17542s.j(aVar, "item");
        if (aVar instanceof o.a.c) {
            return d();
        }
        if (aVar instanceof o.a.e) {
            return new a1.a(C15985a.b(C10850o.c.f85245a));
        }
        if (aVar instanceof o.a.C2708a) {
            return null;
        }
        throw new t();
    }
}
