package ao;

import IC.C13023e;
import IC.C13026h;
import Nn.C10806i;
import Nn.C10813p;
import Nn.F;
import Oo.b;
import RC.m;
import Vg.a;
import XH.t;
import YH.C16877v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.k;
import rv.C11849b;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lao/f;", "Lao/e;", "LVg/a;", "getOrderSummaryUseCase", "LUg/a;", "checkoutPriceMapper", "<init>", "(LVg/a;LUg/a;)V", "LNn/i;", "", "LVg/a$a$f;", "b", "(LNn/i;)Ljava/util/List;", "LNn/F;", "transactions", "LNn/i$a;", "giftCards", "LVg/a$a$g;", "c", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "price", "", "showPriceEntriesExclVat", "LNn/p;", "deliveryServiceType", "LRC/m;", "a", "(LNn/i;ZLNn/p;Ljava/util/List;)LRC/m;", "LVg/a;", "LUg/a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ao.f  reason: case insensitive filesystem */
public final class C11077f implements C11076e {

    /* renamed from: a  reason: collision with root package name */
    private final a f90353a;

    /* renamed from: b  reason: collision with root package name */
    private final Ug.a f90354b;

    public C11077f(a aVar, Ug.a aVar2) {
        C17542s.j(aVar, "getOrderSummaryUseCase");
        C17542s.j(aVar2, "checkoutPriceMapper");
        this.f90353a = aVar;
        this.f90354b = aVar2;
    }

    private final List<a.C1128a.f> b(C10806i iVar) {
        List<k> j10 = iVar.j();
        if (j10 == null) {
            return C16877v.n();
        }
        Iterable<k> iterable = j10;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (k kVar : iterable) {
            arrayList.add(new a.C1128a.f(kVar.a(), kVar.b()));
        }
        return arrayList;
    }

    private final List<a.C1128a.g> c(List<? extends F> list, List<C10806i.a> list2) {
        Collection collection;
        C13023e eVar;
        if (list != null) {
            ArrayList<F> arrayList = new ArrayList<>();
            for (Object next : list) {
                F f10 = (F) next;
                if (f10.g() && !(f10 instanceof F.f)) {
                    if ((f10 instanceof F.a) || (f10 instanceof F.e) || (f10 instanceof F.b) || (f10 instanceof F.d) || (f10 instanceof F.g) || (f10 instanceof F.c)) {
                        arrayList.add(next);
                    } else {
                        throw new t();
                    }
                }
            }
            collection = new ArrayList(C16877v.y(arrayList, 10));
            for (F f11 : arrayList) {
                String d10 = f11.d();
                if (d10 == null || (eVar = C13026h.c(d10)) == null) {
                    eVar = C13026h.a(C11849b.f102233R2);
                }
                collection.add(new a.C1128a.g(eVar, f11.a()));
            }
        } else {
            collection = C16877v.n();
        }
        Iterable<C10806i.a> iterable = list2;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
        for (C10806i.a aVar : iterable) {
            arrayList2.add(new a.C1128a.g(C13026h.b(b.f84341C3, aVar.b()), aVar.d()));
        }
        return C16877v.V0(collection, arrayList2);
    }

    public m a(C10806i iVar, boolean z10, C10813p pVar, List<? extends F> list) {
        C17542s.j(iVar, "price");
        C17542s.j(pVar, "deliveryServiceType");
        C17542s.j(list, "transactions");
        return this.f90353a.a(this.f90354b.b(iVar, b(iVar), (a.C1128a.C1129a) null, z10, pVar), (C13023e) null, c(list, iVar.h()), new a.b(false, z10, true, false, false, false));
    }
}
