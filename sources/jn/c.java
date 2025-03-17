package Jn;

import Fn.b;
import Fn.h;
import Fn.i;
import YH.C16877v;
import com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.DiscountCodeRemoteModel;
import com.ingka.ikea.app.caasremote.models.GroupResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.ItemResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LJn/c;", "Lpp/c;", "LFn/b$a;", "Lcom/ingka/ikea/app/caasremote/models/CartResponseRemoteModel;", "LJn/o;", "itemMapper", "LJn/v;", "userContextMapper", "LJn/e;", "totalPriceMapper", "LJn/h;", "discountCodeRemoteModelMapper", "<init>", "(LJn/o;LJn/v;LJn/e;LJn/h;)V", "remote", "b", "(Lcom/ingka/ikea/app/caasremote/models/CartResponseRemoteModel;)LFn/b$a;", "a", "LJn/o;", "LJn/v;", "c", "LJn/e;", "d", "LJn/h;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements C11769c<b.a, CartResponseRemoteModel> {

    /* renamed from: a  reason: collision with root package name */
    private final o f82631a;

    /* renamed from: b  reason: collision with root package name */
    private final v f82632b;

    /* renamed from: c  reason: collision with root package name */
    private final e f82633c;

    /* renamed from: d  reason: collision with root package name */
    private final h f82634d;

    public c(o oVar, v vVar, e eVar, h hVar) {
        C17542s.j(oVar, "itemMapper");
        C17542s.j(vVar, "userContextMapper");
        C17542s.j(eVar, "totalPriceMapper");
        C17542s.j(hVar, "discountCodeRemoteModelMapper");
        this.f82631a = oVar;
        this.f82632b = vVar;
        this.f82633c = eVar;
        this.f82634d = hVar;
    }

    /* renamed from: b */
    public b.a a(CartResponseRemoteModel cartResponseRemoteModel) {
        C17542s.j(cartResponseRemoteModel, "remote");
        String b10 = cartResponseRemoteModel.b();
        i b11 = this.f82632b.a(cartResponseRemoteModel);
        ArrayList arrayList = new ArrayList();
        for (GroupResponseRemoteModel b12 : cartResponseRemoteModel.f()) {
            Iterable<ItemResponseRemoteModel> b13 = b12.b();
            ArrayList arrayList2 = new ArrayList(C16877v.y(b13, 10));
            for (ItemResponseRemoteModel b14 : b13) {
                arrayList2.add(this.f82631a.a(b14));
            }
            C16877v.E(arrayList, arrayList2);
        }
        NullableCartResponsePriceRemoteModel g10 = cartResponseRemoteModel.g();
        h f10 = g10 != null ? this.f82633c.a(g10) : null;
        Iterable<DiscountCodeRemoteModel> d10 = cartResponseRemoteModel.d();
        ArrayList arrayList3 = new ArrayList(C16877v.y(d10, 10));
        for (DiscountCodeRemoteModel c10 : d10) {
            arrayList3.add(this.f82634d.a(c10));
        }
        return new b.a(b10, b11, f10, arrayList, arrayList3);
    }
}
