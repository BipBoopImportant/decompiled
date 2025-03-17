package mh;

import Dr.c;
import HJ.C15854t;
import Hq.a;
import LD.C13183a;
import MB.C13194a;
import Nm.a;
import QA.C13349a;
import QA.C13352d;
import Rv.p;
import Rv.q;
import Vv.f;
import Vv.h;
import Vv.i;
import Vv.j;
import Vv.k;
import Vv.l;
import Vv.m;
import Vv.n;
import Vv.o;
import Vv.r;
import Vv.s;
import Vv.t;
import Vv.v;
import Yg.b;
import android.content.ActivityNotFoundException;
import bn.C11110a;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.ingka.ikea.store.datalayer.StorageType;
import com.sugarcube.core.logger.DslKt;
import cs.C11185a;
import gy.C14522a;
import iq.C11411a;
import iq.C11412b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import on.C11687b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rw.c;
import rx.C15004a;
import rx.C15005b;
import vi.C12127a;
import x4.C;
import x4.C8951o;
import zA.C15325a;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 d2\u00020\u0001:\u00013B±\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u001f\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010+\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020^8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020^8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010`¨\u0006e"}, d2 = {"Lmh/g;", "LVv/f;", "LRd/a;", "accountNavigation", "LNm/a;", "benefitsNavigation", "Lbn/a;", "bokaNavigation", "LEo/a;", "chromeTabsApi", "Liq/a;", "energyLabelNavigation", "LHq/a;", "familyRewardsNavigation", "LDr/c;", "geomagicalNavigation", "LYg/b;", "giftCardNavigation", "Lcs/a;", "homeProjectsNavigation", "LFs/a;", "inboxNavigation", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "listPickerNavigation", "LZw/a;", "pipNavigation", "Lon/b;", "plpNavigation", "Lrx/b;", "productConfiguratorNavigation", "LBx/b;", "profileNavigation", "Lvi/a;", "purchaseHistoryNavigation", "Lgy/a;", "regionSettingsNavigation", "LzA/a;", "settingsNavigation", "LQA/d;", "shoppingListNavigation", "LMB/a;", "storePickerNavigation", "LLD/a;", "walletNavigation", "<init>", "(LRd/a;LNm/a;Lbn/a;LEo/a;Liq/a;LHq/a;LDr/c;LYg/b;Lcs/a;LFs/a;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;LZw/a;Lon/b;Lrx/b;LBx/b;Lvi/a;Lgy/a;LzA/a;LQA/d;LMB/a;LLD/a;)V", "LVv/v;", "provider", "LVv/l;", "destination", "LXH/N;", "a", "(LVv/v;LVv/l;)V", "LRd/a;", "b", "LNm/a;", "c", "Lbn/a;", "d", "LEo/a;", "e", "Liq/a;", "f", "LHq/a;", "g", "LDr/c;", "h", "LYg/b;", "i", "Lcs/a;", "j", "LFs/a;", "k", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "l", "LZw/a;", "m", "Lon/b;", "n", "Lrx/b;", "o", "LBx/b;", "p", "Lvi/a;", "q", "Lgy/a;", "r", "LzA/a;", "s", "LQA/d;", "t", "LMB/a;", "u", "LLD/a;", "Lx4/C;", "v", "Lx4/C;", "fragmentTransitionNavOptions", "w", "modalTransitionNavOptions", "x", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements f {

    /* renamed from: x  reason: collision with root package name */
    public static final a f75432x = new a((DefaultConstructorMarker) null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f75433y = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Rd.a f75434a;

    /* renamed from: b  reason: collision with root package name */
    private final Nm.a f75435b;

    /* renamed from: c  reason: collision with root package name */
    private final C11110a f75436c;

    /* renamed from: d  reason: collision with root package name */
    private final Eo.a f75437d;

    /* renamed from: e  reason: collision with root package name */
    private final C11411a f75438e;

    /* renamed from: f  reason: collision with root package name */
    private final Hq.a f75439f;

    /* renamed from: g  reason: collision with root package name */
    private final c f75440g;

    /* renamed from: h  reason: collision with root package name */
    private final b f75441h;

    /* renamed from: i  reason: collision with root package name */
    private final C11185a f75442i;

    /* renamed from: j  reason: collision with root package name */
    private final Fs.a f75443j;

    /* renamed from: k  reason: collision with root package name */
    private final ListPickerNavigation f75444k;

    /* renamed from: l  reason: collision with root package name */
    private final Zw.a f75445l;

    /* renamed from: m  reason: collision with root package name */
    private final C11687b f75446m;

    /* renamed from: n  reason: collision with root package name */
    private final C15005b f75447n;

    /* renamed from: o  reason: collision with root package name */
    private final Bx.b f75448o;

    /* renamed from: p  reason: collision with root package name */
    private final C12127a f75449p;

    /* renamed from: q  reason: collision with root package name */
    private final C14522a f75450q;

    /* renamed from: r  reason: collision with root package name */
    private final C15325a f75451r;

    /* renamed from: s  reason: collision with root package name */
    private final C13352d f75452s;

    /* renamed from: t  reason: collision with root package name */
    private final C13194a f75453t;

    /* renamed from: u  reason: collision with root package name */
    private final C13183a f75454u;

    /* renamed from: v  reason: collision with root package name */
    private final C f75455v;

    /* renamed from: w  reason: collision with root package name */
    private final C f75456w;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmh/g$a;", "", "<init>", "()V", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(Rd.a aVar, Nm.a aVar2, C11110a aVar3, Eo.a aVar4, C11411a aVar5, Hq.a aVar6, c cVar, b bVar, C11185a aVar7, Fs.a aVar8, ListPickerNavigation listPickerNavigation, Zw.a aVar9, C11687b bVar2, C15005b bVar3, Bx.b bVar4, C12127a aVar10, C14522a aVar11, C15325a aVar12, C13352d dVar, C13194a aVar13, C13183a aVar14) {
        Rd.a aVar15 = aVar;
        Nm.a aVar16 = aVar2;
        C11110a aVar17 = aVar3;
        Eo.a aVar18 = aVar4;
        C11411a aVar19 = aVar5;
        Hq.a aVar20 = aVar6;
        c cVar2 = cVar;
        b bVar5 = bVar;
        C11185a aVar21 = aVar7;
        Fs.a aVar22 = aVar8;
        ListPickerNavigation listPickerNavigation2 = listPickerNavigation;
        Zw.a aVar23 = aVar9;
        C11687b bVar6 = bVar2;
        C15005b bVar7 = bVar3;
        C12127a aVar24 = aVar10;
        C17542s.j(aVar15, "accountNavigation");
        C17542s.j(aVar16, "benefitsNavigation");
        C17542s.j(aVar17, "bokaNavigation");
        C17542s.j(aVar18, "chromeTabsApi");
        C17542s.j(aVar19, "energyLabelNavigation");
        C17542s.j(aVar20, "familyRewardsNavigation");
        C17542s.j(cVar2, "geomagicalNavigation");
        C17542s.j(bVar5, "giftCardNavigation");
        C17542s.j(aVar21, "homeProjectsNavigation");
        C17542s.j(aVar22, "inboxNavigation");
        C17542s.j(listPickerNavigation2, "listPickerNavigation");
        C17542s.j(aVar23, "pipNavigation");
        C17542s.j(bVar6, "plpNavigation");
        C17542s.j(bVar7, "productConfiguratorNavigation");
        C17542s.j(bVar4, "profileNavigation");
        C17542s.j(aVar10, "purchaseHistoryNavigation");
        C17542s.j(aVar11, "regionSettingsNavigation");
        C17542s.j(aVar12, "settingsNavigation");
        C17542s.j(dVar, "shoppingListNavigation");
        C17542s.j(aVar13, "storePickerNavigation");
        C17542s.j(aVar14, "walletNavigation");
        this.f75434a = aVar15;
        this.f75435b = aVar16;
        this.f75436c = aVar17;
        this.f75437d = aVar18;
        this.f75438e = aVar19;
        this.f75439f = aVar20;
        this.f75440g = cVar2;
        this.f75441h = bVar5;
        this.f75442i = aVar21;
        this.f75443j = aVar22;
        this.f75444k = listPickerNavigation2;
        this.f75445l = aVar23;
        this.f75446m = bVar6;
        this.f75447n = bVar7;
        this.f75448o = bVar4;
        this.f75449p = aVar10;
        this.f75450q = aVar11;
        this.f75451r = aVar12;
        this.f75452s = dVar;
        this.f75453t = aVar13;
        this.f75454u = aVar14;
        c.a aVar25 = rw.c.f28698a;
        this.f75455v = aVar25.c().a();
        this.f75456w = aVar25.d().a();
    }

    public void a(v vVar, l lVar) {
        l lVar2 = lVar;
        C17542s.j(vVar, "provider");
        C17542s.j(lVar2, "destination");
        C8951o a10 = vVar.a();
        if (lVar2 instanceof Vv.g) {
            a.C1689a.a(this.f75435b, a10, ((Vv.g) lVar2).a(), (C) null, 4, (Object) null);
        } else if (lVar2 instanceof h) {
            a.C1689a.c(this.f75435b, a10, (C) null, 2, (Object) null);
        } else if (lVar2 instanceof i) {
            a.C1689a.b(this.f75435b, a10, (C) null, true, 2, (Object) null);
        } else if (lVar2 instanceof j) {
            this.f75436c.a(a10);
        } else if (lVar2 instanceof k) {
            k kVar = (k) lVar2;
            C12127a.C2488a.a(this.f75449p, a10, kVar.b(), kVar.a(), (String) null, (C) null, 24, (Object) null);
        } else if (lVar2 instanceof l.a) {
            this.f75437d.a(vVar.b(), ((l.a) lVar2).a());
        } else if (lVar2 instanceof l.b) {
            try {
                a10.Y(q.a(((l.b) lVar2).a()), this.f75455v);
            } catch (ActivityNotFoundException e10) {
                e eVar = e.ERROR;
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
                        String a11 = C11818a.a("No Activity found for intent with uri: " + p.d(((l.b) lVar2).a()), e10);
                        if (a11 != null) {
                            str = C11820c.a(a11);
                        } else {
                            return;
                        }
                    }
                    if (str2 == null) {
                        String name = g.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str3 = str2;
                    bVar.a(eVar, str3, false, e10, str);
                    str2 = str3;
                }
            }
        } else if (lVar2 instanceof l.c) {
            C11411a.C2225a.a(this.f75438e, a10, ((l.c) lVar2).a(), (C11412b) null, 4, (Object) null);
        } else if (lVar2 instanceof m) {
            this.f75439f.c(a10);
        } else if (lVar2 instanceof n) {
            this.f75439f.f(a10);
        } else if (lVar2 instanceof o) {
            this.f75439f.b(a10, ((o) lVar2).a(), "MembershipFragment-RewardDetails");
        } else if (lVar2 instanceof Vv.p) {
            a.C1594a.a(this.f75439f, a10, ((Vv.p) lVar2).a(), "MembershipFragment-UseReward", false, 8, (Object) null);
        } else if (lVar2 instanceof l.d) {
            l.d dVar = (l.d) lVar2;
            this.f75444k.a(a10, new ListPickerNavigation.Operation.AddOrRemove(dVar.b(), dVar.a(), 0, new ListPickerNavigation.Operation.Analytics(Interaction$Component.MEMBERSHIP, Ae.k.BUTTON), 4, (DefaultConstructorMarker) null), "MembershipFragment-ListPicker");
        } else if (lVar2 instanceof l.e) {
            this.f75445l.a(a10, ((l.e) lVar2).a(), Interaction$Component.MEMBERSHIP);
        } else if (lVar2 instanceof l.f) {
            C13194a.C2742a.a(this.f75453t, a10, ((l.f) lVar2).a() ? StorageType.PROFILE : StorageType.LOCAL, (String) null, false, (String) null, this.f75456w, 28, (Object) null);
        } else if (lVar2 instanceof l.g) {
            this.f75447n.h(a10, ((l.g) lVar2).a(), C15004a.LIST_CART_ACTIONS);
        } else if (lVar2 instanceof Vv.q) {
            C12127a.C2488a.b(this.f75449p, a10, (String) null, this.f75455v, 2, (Object) null);
        } else if (lVar2 instanceof r) {
            r rVar = (r) lVar2;
            this.f75449p.f(a10, rVar.a(), rVar.b(), (String) null, false, this.f75455v);
        } else if (lVar2 instanceof s) {
            C13352d.a.a(this.f75452s, a10, ((s) lVar2).a(), false, (C) null, 8, (Object) null);
        } else if (lVar2 instanceof t) {
            C13352d.a.b(this.f75452s, a10, C13349a.ONLINE, (C) null, 4, (Object) null);
        } else if (lVar2 == l.h.About) {
            this.f75448o.b(a10, this.f75455v);
        } else if (lVar2 == l.h.Addresses) {
            this.f75434a.c(a10, this.f75455v);
        } else if (lVar2 == l.h.ChangePassword) {
            this.f75434a.g(a10, this.f75455v);
        } else if (lVar2 == l.h.CommunicationPreferences) {
            this.f75434a.b(a10, this.f75455v);
        } else if (lVar2 == l.h.CustomerSupport) {
            this.f75448o.a(a10, this.f75455v);
        } else if (lVar2 == l.h.DataPreferences) {
            this.f75448o.d(a10, this.f75455v);
        } else if (lVar2 == l.h.DeleteAccount) {
            this.f75434a.i(a10, this.f75455v);
        } else if (lVar2 == l.h.FamilyCard) {
            this.f75454u.a(a10, this.f75456w);
        } else if (lVar2 == l.h.GiftCards) {
            this.f75441h.a(a10);
        } else if (lVar2 == l.h.HomeProjects) {
            this.f75442i.a(a10, this.f75455v);
        } else if (lVar2 == l.h.Inbox) {
            this.f75443j.e(a10, this.f75455v);
        } else if (lVar2 == l.h.Kreativ) {
            this.f75440g.a(a10, c.a.PROFILE);
        } else if (lVar2 == l.h.Language) {
            this.f75450q.b(a10);
        } else if (lVar2 == l.h.Login) {
            this.f75434a.d(vVar.b());
        } else if (lVar2 == l.h.MemberDiscounts) {
            C11687b.C2346b.b(this.f75446m, "family_price", (String) null, C11687b.e.CATEGORY, Interaction$Component.CAROUSEL_MEMBER_DISCOUNTS, a10, (List) null, (List) null, (String) null, 226, (Object) null);
        } else if (lVar2 == l.h.PolicesAndToC) {
            this.f75448o.c(a10, this.f75455v);
        } else if (lVar2 == l.h.ProfileDetails) {
            this.f75434a.h(a10, this.f75455v);
        } else if (lVar2 == l.h.Signup) {
            this.f75434a.e(vVar.b());
        } else if (lVar2 == l.h.Theme) {
            this.f75451r.a(a10, this.f75455v);
        } else if (lVar2 == l.h.Upgrade) {
            this.f75434a.f(a10);
        } else if (lVar2 == l.h.Wallet) {
            C13183a.C2735a.a(this.f75454u, a10, (C) null, 2, (Object) null);
        } else {
            throw new XH.t();
        }
    }
}
