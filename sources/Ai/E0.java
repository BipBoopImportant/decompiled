package Ai;

import Al.d;
import D4.C6447v;
import D4.C6448w;
import D4.M;
import Ei.C10687h;
import Ei.C10696q;
import Ei.C10702w;
import Hx.c;
import Hx.f;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import Oo.b;
import Op.C10832f;
import RC.m;
import RC.n;
import TJ.C16532g;
import TJ.C16534i;
import YH.C16877v;
import YH.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qx.c;
import tI.C17974j;
import uK.C18146a;
import zi.C12518a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R#\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040'0&8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u000b\u0010*R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"LAi/E0;", "", "<init>", "()V", "LEi/w;", "b", "LEi/w;", "()LEi/w;", "purchaseHistoryItemSummary", "", "LHx/b;", "c", "Ljava/util/List;", "a", "()Ljava/util/List;", "purchaseHistoryArticles", "LRC/m;", "d", "LRC/m;", "getOrderSummaryUiState", "()LRC/m;", "orderSummaryUiState", "LEi/q;", "e", "LEi/q;", "getPurchaseHistoryDetails", "()LEi/q;", "purchaseHistoryDetails", "LEi/q$a;", "f", "LEi/q$a;", "getDeliveryMethod", "()LEi/q$a;", "deliveryMethod", "LD4/w;", "g", "LD4/w;", "LOAD_STATES_NOT_LOADING", "LTJ/g;", "LD4/M;", "h", "LTJ/g;", "()LTJ/g;", "purchaseHistoryPagingData", "LEi/h$b$a;", "i", "LEi/h$b$a;", "getOrderLookupUiState", "()LEi/h$b$a;", "orderLookupUiState", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class E0 {

    /* renamed from: a  reason: collision with root package name */
    public static final E0 f78445a = new E0();

    /* renamed from: b  reason: collision with root package name */
    private static final C10702w f78446b = new C10702w("order id", f.ORDER, C13026h.c("date"), "123.0 kr", false, C13026h.a(b.f84524U6), "location", C15985a.a());

    /* renamed from: c  reason: collision with root package name */
    private static final List<Hx.b> f78447c;

    /* renamed from: d  reason: collision with root package name */
    private static final m f78448d;

    /* renamed from: e  reason: collision with root package name */
    private static final C10696q f78449e;

    /* renamed from: f  reason: collision with root package name */
    private static final C10696q.a f78450f;

    /* renamed from: g  reason: collision with root package name */
    private static final C6448w f78451g = new C6448w(new C6447v.c(true), new C6447v.c(true), new C6447v.c(true));

    /* renamed from: h  reason: collision with root package name */
    private static final C16532g<M<C10702w>> f78452h;

    /* renamed from: i  reason: collision with root package name */
    private static final C10687h.b.a f78453i = new C10687h.b.a(C13026h.c("Some Title"), C13026h.c("Some description"), (C10687h.b.a.C1525a) null, false, (C13023e) null, false, (C10687h.b.c) null, 124, (DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f78454j = 8;

    static {
        C17974j jVar = new C17974j(1, 5);
        ArrayList arrayList = new ArrayList(C16877v.y(jVar, 10));
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            int c10 = ((U) it).c();
            arrayList.add(new Hx.b(String.valueOf(c10), "ART", "Name " + c10, "Description " + c10, c10, "some url", Double.valueOf((double) c10)));
        }
        f78447c = arrayList;
        m mVar = new m((C13023e) null, new m.c((C13023e) null, (String) null, C16877v.e(new m.c.a(C13026h.c("Subtotal"), "100 kr")), 2, (DefaultConstructorMarker) null), new m.c((C13023e) null, (String) null, C16877v.e(new m.c.a(C13026h.c("Delivery"), "20 kr")), 2, (DefaultConstructorMarker) null), (m.c) null, (m.c) null, (m.c) null, new m.d(C13026h.c("Total price"), new n.a(new c("120", "0"), C10832f.f85163a.a()), C16877v.q(new m.c.a(C13026h.a(b.f84466O8), "100 kr"), new m.c.a(C13026h.a(b.f84631e9), "20 kr"))), (C13023e) null, (m.b) null, (C13023e) null, (m.c) null, (m.a) null, 256, (DefaultConstructorMarker) null);
        f78448d = mVar;
        f78449e = new C10696q("order id", c.e.CANCELLED, f.ORDER, C15985a.a(), C15985a.h(C16877v.k1(arrayList, 1)), C15985a.a(), "14 mar. 2022, 16:09", "ONLINE", mVar, C15985a.a());
        f78450f = new C10696q.a("delivery method id", (C12518a) null, new C10696q.a.C1531a(C18146a.f148385c3, new C13023e.b("Delivery 1"), (C13023e) null, (C13023e) null, (C13023e) null), C16877v.e(new C10696q.a.c(d.ACTIVE, new C13023e.b("Some status"), new C13023e.b("Some message"), (C15987c) null, 8, (DefaultConstructorMarker) null)), (C10696q.a.b) null, C16877v.k1(arrayList, 1), (C10696q.a.d) null);
        M.d dVar = M.f34127e;
        C17974j jVar2 = new C17974j(1, 4);
        ArrayList arrayList2 = new ArrayList(C16877v.y(jVar2, 10));
        Iterator it2 = jVar2.iterator();
        while (it2.hasNext()) {
            int c11 = ((U) it2).c();
            arrayList2.add(C10702w.b(f78446b, (String) null, (f) null, C13026h.c("Some date " + c11), c11 + " kr", c11 == 1, (C13023e) null, "IKEA store " + c11, (C15987c) null, 163, (Object) null));
        }
        f78452h = C16534i.J(M.d.b(dVar, arrayList2, f78451g, (C6448w) null, 4, (Object) null));
    }

    private E0() {
    }

    public final List<Hx.b> a() {
        return f78447c;
    }

    public final C10702w b() {
        return f78446b;
    }

    public final C16532g<M<C10702w>> c() {
        return f78452h;
    }
}
