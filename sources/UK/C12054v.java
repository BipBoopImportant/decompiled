package uk;

import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import KJ.C15989e;
import Op.C10828d;
import Op.i1;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import pk.i;
import pk.j;
import pk.k;
import pk.l;
import pk.m;
import pk.n;
import pk.o;
import pk.p;
import pk.q;
import pk.r;
import pk.s;
import qx.C14957b;
import qx.c;
import zk.C12529b;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u000b\u0010\u0016R\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010*\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0014\u0010.\u001a\u00020+8BX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Luk/v;", "", "<init>", "()V", "LOp/i1;", "b", "LOp/i1;", "getEuroCurrencyConfig", "()LOp/i1;", "euroCurrencyConfig", "Lpk/i;", "c", "Lpk/i;", "getListProductItemWithoutChildItems", "()Lpk/i;", "listProductItemWithoutChildItems", "d", "getListProductItemWithChildItems", "listProductItemWithChildItems", "Lpk/s;", "e", "Lpk/s;", "()Lpk/s;", "statePopulated", "f", "stateEmptyList", "g", "stateLoading", "Lpk/s$o;", "h", "Lpk/s$o;", "getWayfindingProductData", "()Lpk/s$o;", "wayfindingProductData", "Lpk/l;", "i", "Lpk/l;", "getOnlineItemRegularPrice", "()Lpk/l;", "onlineItemRegularPrice", "j", "getOnlineItemFamilyPrice", "onlineItemFamilyPrice", "LOp/d$l$e;", "a", "()LOp/d$l$e;", "priceTag", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uk.v  reason: case insensitive filesystem */
public final class C12054v {

    /* renamed from: a  reason: collision with root package name */
    public static final C12054v f103777a;

    /* renamed from: b  reason: collision with root package name */
    private static final i1 f103778b;

    /* renamed from: c  reason: collision with root package name */
    private static final i f103779c;

    /* renamed from: d  reason: collision with root package name */
    private static final i f103780d;

    /* renamed from: e  reason: collision with root package name */
    private static final s f103781e;

    /* renamed from: f  reason: collision with root package name */
    private static final s f103782f;

    /* renamed from: g  reason: collision with root package name */
    private static final s f103783g;

    /* renamed from: h  reason: collision with root package name */
    private static final s.o f103784h = new s.o("12345", C12529b.a.SALES, "division", "123");

    /* renamed from: i  reason: collision with root package name */
    private static final l f103785i;

    /* renamed from: j  reason: collision with root package name */
    private static final l f103786j;

    /* renamed from: k  reason: collision with root package name */
    public static final int f103787k = 8;

    static {
        C12054v vVar = new C12054v();
        f103777a = vVar;
        C11522d.c cVar = C11522d.c.TOP;
        i1 i1Var = new i1(new C11522d("€", ".", "eur", "", "", ":", "", 2, false, (Double) null, cVar, C11522d.b.DOT, cVar, C11522d.a.LEADING, 1.0d, 512, (DefaultConstructorMarker) null));
        f103778b = i1Var;
        i1 i1Var2 = i1Var;
        i iVar = new i(new i.a(C13026h.c("Children's IKEA")), C15985a.b(new l("14679", "AFTONSPARV", "Rug, 133 cm", new p(34.99d, (List<? extends C13023e>) null, i1Var2, C10828d.k.NEW_PRODUCT, new C10828d.l.f(vVar.a()), (C13023e) null, (C10828d.c) null), (String) null, 1, 1, C15985a.a(), new l.a.d(C13026h.c("Running low: Only 6 available"), (String) null, (String) null, (String) null), false, true, C15985a.a(), false, "21 cms")));
        f103779c = iVar;
        i iVar2 = new i(new i.a(C13026h.c("Self-serve area")), C15985a.b(new l("12345", "BUSUNGE", "Wardrobe", new p(119.54d, (List<? extends C13023e>) null, i1Var2, C10828d.k.FAMILY_PRICE, new C10828d.l.b(C10828d.l.e.b(vVar.a(), (c) null, C14957b.a(100.0d, i1Var.a()), (List) null, (String) null, 13, (Object) null)), C13026h.c("Valid until 24 Mar 2024"), (C10828d.c) null), (String) null, 3, 3, C15985a.b(new l.b("12345", "PRODUCT NAME", "Description", 2, 1, new l.a.C2375a(C13026h.c("In stock: 10 available"), (String) null, (String) null, (String) null)), new l.b("67890", "PRODUCT NAME", "Description", 1, 2, new l.a.C2375a(C13026h.c("In stock: 10 available"), "123", "ME", (String) null))), new l.a.c(C13026h.c("Running low: Only 6 available"), true, true, C13026h.c("Expected back in stock in 3 years"), true, "145", "NE", (String) null), false, true, C15985a.a(), false, "21 cms")));
        f103780d = iVar2;
        k kVar = r1;
        k kVar2 = new k("Playroom", 2);
        n nVar = r1;
        n nVar2 = new n("IKEA Eindhoven", false);
        q.b bVar = r1;
        q.b bVar2 = new q.b(C15985a.b(iVar, iVar2));
        m mVar = r1;
        m mVar2 = new m(238.95d, Double.valueOf(2.0d), i1Var2, true, false);
        o oVar = r1;
        o oVar2 = new o("IKEA Eindhoven");
        f103781e = new s(kVar, true, false, (String) null, false, false, false, false, (C15989e) null, (j) null, nVar, bVar, mVar, oVar, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147468276, (DefaultConstructorMarker) null);
        k kVar3 = r1;
        k kVar4 = new k("Playroom", 0);
        f103782f = new s(kVar3, true, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147483636, (DefaultConstructorMarker) null);
        k kVar5 = r1;
        k kVar6 = new k("Playroom", 0);
        f103783g = new s(kVar5, true, true, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147483632, (DefaultConstructorMarker) null);
        p pVar = r1;
        p pVar2 = new p(29.99d, (List<? extends C13023e>) null, i1Var2, (C10828d.k) null, new C10828d.l.f(vVar.a()), (C13023e) null, (C10828d.c) null);
        f103785i = l.b((l) C16877v.w0(iVar.b()), "2", "FLISAT", "Toy storage with wheels", pVar, (String) null, 2, 0, (C15987c) null, (l.a) null, false, false, (C15987c) null, false, (String) null, 16320, (Object) null);
        p pVar3 = r1;
        p pVar4 = new p(21.99d, (List<? extends C13023e>) null, i1Var2, C10828d.k.NEW_LOWER_PRICE, new C10828d.l.c(vVar.a()), (C13023e) null, (C10828d.c) null);
        f103786j = l.b((l) C16877v.w0(iVar.b()), "4", "AFTONSPARV", "", pVar3, (String) null, 4, 0, (C15987c) null, (l.a) null, false, false, (C15987c) null, false, (String) null, 16320, (Object) null);
    }

    private C12054v() {
    }

    private final C10828d.l.e a() {
        return new C10828d.l.e((c) null, C14957b.a(42.0d, f103778b.a()), C15985a.a(), (String) null);
    }

    public final s b() {
        return f103782f;
    }

    public final s c() {
        return f103783g;
    }

    public final s d() {
        return f103781e;
    }
}
