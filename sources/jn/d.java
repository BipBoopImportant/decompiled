package Jn;

import Fn.b;
import Fn.h;
import Fn.i;
import HJ.C15854t;
import YH.C16877v;
import com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.DiscountCodeRemoteModel;
import com.ingka.ikea.app.caasremote.models.GroupResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.ItemResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LJn/d;", "Lpp/c;", "LFn/b$b;", "Lcom/ingka/ikea/app/caasremote/models/CartResponseRemoteModel;", "LJn/p;", "responseToOnlineCartItemMapper", "LJn/v;", "userContextMapper", "LJn/e;", "totalPriceMapper", "LJn/h;", "discountCodeRemoteModelMapper", "<init>", "(LJn/p;LJn/v;LJn/e;LJn/h;)V", "remote", "b", "(Lcom/ingka/ikea/app/caasremote/models/CartResponseRemoteModel;)LFn/b$b;", "a", "LJn/p;", "LJn/v;", "c", "LJn/e;", "d", "LJn/h;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements C11769c<b.C1565b, CartResponseRemoteModel> {

    /* renamed from: a  reason: collision with root package name */
    private final p f82635a;

    /* renamed from: b  reason: collision with root package name */
    private final v f82636b;

    /* renamed from: c  reason: collision with root package name */
    private final e f82637c;

    /* renamed from: d  reason: collision with root package name */
    private final h f82638d;

    public d(p pVar, v vVar, e eVar, h hVar) {
        C17542s.j(pVar, "responseToOnlineCartItemMapper");
        C17542s.j(vVar, "userContextMapper");
        C17542s.j(eVar, "totalPriceMapper");
        C17542s.j(hVar, "discountCodeRemoteModelMapper");
        this.f82635a = pVar;
        this.f82636b = vVar;
        this.f82637c = eVar;
        this.f82638d = hVar;
    }

    /* renamed from: b */
    public b.C1565b a(CartResponseRemoteModel cartResponseRemoteModel) {
        boolean z10;
        CartResponseRemoteModel cartResponseRemoteModel2 = cartResponseRemoteModel;
        C17542s.j(cartResponseRemoteModel2, "remote");
        List<GroupResponseRemoteModel> f10 = cartResponseRemoteModel.f();
        h hVar = null;
        if (f10.size() > 1) {
            IllegalStateException illegalStateException = new IllegalStateException("Cart with multiple groups not supported in ONLINE profile");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = d.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalStateException, str3);
                str = str3;
                str2 = str4;
            }
        }
        String b10 = cartResponseRemoteModel.b();
        i b11 = this.f82636b.a(cartResponseRemoteModel2);
        ArrayList arrayList2 = new ArrayList();
        for (GroupResponseRemoteModel b12 : f10) {
            Iterable<ItemResponseRemoteModel> b13 = b12.b();
            ArrayList arrayList3 = new ArrayList(C16877v.y(b13, 10));
            for (ItemResponseRemoteModel b14 : b13) {
                arrayList3.add(this.f82635a.a(b14));
            }
            C16877v.E(arrayList2, arrayList3);
        }
        NullableCartResponsePriceRemoteModel g10 = cartResponseRemoteModel.g();
        if (g10 != null) {
            hVar = this.f82637c.a(g10);
        }
        h hVar2 = hVar;
        Iterable<DiscountCodeRemoteModel> d10 = cartResponseRemoteModel.d();
        ArrayList arrayList4 = new ArrayList(C16877v.y(d10, 10));
        for (DiscountCodeRemoteModel c10 : d10) {
            arrayList4.add(this.f82638d.a(c10));
        }
        Iterable d11 = cartResponseRemoteModel.d();
        if (!(d11 instanceof Collection) || !((Collection) d11).isEmpty()) {
            Iterator it = d11.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((DiscountCodeRemoteModel) it.next()).d() == com.ingka.ikea.app.caasremote.models.i.FAMILY_ONLY) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = false;
        return new b.C1565b(b10, b11, hVar2, arrayList2, arrayList4, z10);
    }
}
