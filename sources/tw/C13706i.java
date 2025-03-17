package Tw;

import Lw.C13188a;
import Nn.C10805h;
import Nn.D;
import Qw.C13472e0;
import XH.t;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LNn/D;", "", "LQw/e0$b;", "b", "(LNn/D;)Ljava/util/List;", "", "LNn/h;", "c", "(Ljava/lang/Throwable;)LNn/h;", "onlinepayment-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tw.i  reason: case insensitive filesystem */
public final class C13706i {
    public static final List<C13472e0.b> b(D d10) {
        C17542s.j(d10, "<this>");
        if (d10 instanceof D.b) {
            D.b bVar = (D.b) d10;
            Iterable<String> g10 = bVar.g();
            List<C13472e0.b> arrayList = new ArrayList<>(C16877v.y(g10, 10));
            for (String bVar2 : g10) {
                arrayList.add(new C13472e0.b.C2821b(bVar2, bVar.b()));
            }
            if (arrayList.isEmpty()) {
                arrayList = C16877v.e(new C13472e0.b.a(C18146a.f148234S4, bVar.b(), false));
            }
            return arrayList;
        } else if (d10 instanceof D.c) {
            return C16877v.e(new C13472e0.b.a(C13188a.f111928a, ((D.c) d10).b(), false));
        } else {
            if (d10 instanceof D.d) {
                D.d dVar = (D.d) d10;
                Iterable<String> g11 = dVar.g();
                ArrayList arrayList2 = new ArrayList(C16877v.y(g11, 10));
                for (String bVar3 : g11) {
                    arrayList2.add(new C13472e0.b.C2821b(bVar3, dVar.b()));
                }
                return arrayList2;
            } else if (d10 instanceof D.e) {
                return C16877v.n();
            } else {
                if (d10 instanceof D.g) {
                    D.g gVar = (D.g) d10;
                    Iterable<String> h10 = gVar.h();
                    ArrayList arrayList3 = new ArrayList(C16877v.y(h10, 10));
                    for (String bVar4 : h10) {
                        arrayList3.add(new C13472e0.b.C2821b(bVar4, gVar.b()));
                    }
                    return arrayList3;
                } else if (d10 instanceof D.h) {
                    D.h hVar = (D.h) d10;
                    Iterable<String> h11 = hVar.h();
                    ArrayList arrayList4 = new ArrayList(C16877v.y(h11, 10));
                    for (String bVar5 : h11) {
                        arrayList4.add(new C13472e0.b.C2821b(bVar5, hVar.b()));
                    }
                    return arrayList4;
                } else {
                    throw new t();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final C10805h c(Throwable th2) {
        C10805h hVar = th2 instanceof C10805h ? (C10805h) th2 : null;
        return hVar == null ? C10805h.e.f84074a : hVar;
    }
}
