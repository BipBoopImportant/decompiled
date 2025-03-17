package Iw;

import Dw.C12792a;
import Dw.c;
import Dw.e;
import Fw.d;
import YH.C16877v;
import am.h;
import com.ingka.ikea.core.model.product.ProductItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u0017"}, d2 = {"LIw/a;", "", "LIw/b;", "pickupStatusMapper", "Lam/h;", "timeProvider", "<init>", "(LIw/b;Lam/h;)V", "LDw/e;", "timeSlot", "LFw/d;", "c", "(LDw/e;)LFw/d;", "onGoingOrdersEntity", "LDw/a;", "b", "(LFw/d;)LDw/a;", "", "list", "a", "(Ljava/util/List;)Ljava/util/List;", "LIw/b;", "Lam/h;", "ongoinginstoreordersrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Iw.a  reason: case insensitive filesystem */
public final class C13034a {

    /* renamed from: a  reason: collision with root package name */
    private final b f110965a;

    /* renamed from: b  reason: collision with root package name */
    private final h f110966b;

    public C13034a(b bVar, h hVar) {
        C17542s.j(bVar, "pickupStatusMapper");
        C17542s.j(hVar, "timeProvider");
        this.f110965a = bVar;
        this.f110966b = hVar;
    }

    public final List<C12792a> a(List<d> list) {
        C17542s.j(list, "list");
        ArrayList arrayList = new ArrayList();
        for (d b10 : list) {
            C12792a b11 = b(b10);
            if (b11 != null) {
                arrayList.add(b11);
            }
        }
        return arrayList;
    }

    public final C12792a b(d dVar) {
        C17542s.j(dVar, "onGoingOrdersEntity");
        String d10 = dVar.d();
        if (d10 == null) {
            return null;
        }
        long h10 = dVar.h();
        String f10 = dVar.f();
        e.a aVar = new e.a(dVar.e(), dVar.a());
        c a10 = this.f110965a.a(dVar.b());
        List<ProductItem> c10 = dVar.c();
        if (c10 == null) {
            c10 = C16877v.n();
        }
        return new C12792a(d10, h10, new e(f10, a10, aVar, c10), dVar.g());
    }

    public final d c(e eVar) {
        C17542s.j(eVar, "timeSlot");
        return new d(eVar.e(), (String) null, eVar.f().b(), eVar.f().a(), eVar.c().j(), this.f110966b.c(), (List) null, (Double) null, 192, (DefaultConstructorMarker) null);
    }
}
