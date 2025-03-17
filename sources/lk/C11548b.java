package lk;

import Ae.e;
import Ae.g;
import Ae.j;
import EB.C12832d;
import FB.C12860a;
import QJ.Q;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.v;
import XH.y;
import YH.X;
import android.app.Activity;
import com.ingka.ikea.analytics.Interaction$Component;
import dI.C17164e;
import eI.C17187b;
import gB.C14501c;
import gB.C14502d;
import gB.C14507i;
import jB.C14613b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import pk.r;
import uk.A1;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001bB+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\u0012J\u000f\u0010'\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010\u0012J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b,\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u00100¨\u00061"}, d2 = {"Llk/b;", "Llk/a;", "LAe/e;", "analytics", "LFB/a;", "localStoreSelectionRepository", "LjB/b;", "shoppingListRepository", "LQJ/Q;", "appScope", "<init>", "(LAe/e;LFB/a;LjB/b;LQJ/Q;)V", "", "isEnabled", "LXH/N;", "c", "(Z)V", "d", "()V", "i", "", "listId", "f", "(Ljava/lang/String;)V", "k", "hasItems", "inStoreModeEnabled", "a", "(ZZ)V", "Lpk/r;", "mode", "e", "(Lpk/r;)V", "itemNo", "LDe/a;", "component", "g", "(Ljava/lang/String;LDe/a;)V", "h", "l", "Luk/A1;", "carouselAnalyticsData", "b", "(Luk/A1;)V", "j", "LAe/e;", "LFB/a;", "LjB/b;", "LQJ/Q;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lk.b  reason: case insensitive filesystem */
public final class C11548b implements C11547a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f99191e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f99192f = 8;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final e f99193a;

    /* renamed from: b  reason: collision with root package name */
    private final C12860a f99194b;

    /* renamed from: c  reason: collision with root package name */
    private final C14613b f99195c;

    /* renamed from: d  reason: collision with root package name */
    private final Q f99196d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Llk/b$a;", "", "<init>", "()V", "", "PRODUCT_MODAL_SHOWN", "Ljava/lang/String;", "POPULATED_LIST_IN_STORE_MODE_ON", "POPULATED_LIST_IN_STORE_MODE_OFF", "EMPTY_LIST", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lk.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LgB/i;", "items", "LXH/N;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.analytics.ShoppingListDetailsAnalyticsImpl$trackListTotal$1", f = "ShoppingListDetailsAnalytics.kt", l = {}, m = "invokeSuspend")
    /* renamed from: lk.b$b  reason: collision with other inner class name */
    static final class C2251b extends l implements p<List<? extends C14507i>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99197c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f99198d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C11548b f99199e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2251b(C11548b bVar, C17164e<? super C2251b> eVar) {
            super(2, eVar);
            this.f99199e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2251b bVar = new C2251b(this.f99199e, eVar);
            bVar.f99198d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(List<C14507i> list, C17164e<? super C16807N> eVar) {
            return ((C2251b) create(list, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C17187b.f();
            if (this.f99197c == 0) {
                y.b(obj);
                Iterable<C14507i> iterable = (List) this.f99198d;
                int i10 = 0;
                for (C14507i b10 : iterable) {
                    i10 += b10.b().a().g();
                }
                double d10 = 0.0d;
                for (C14507i iVar : iterable) {
                    Iterator it = iVar.b().b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((C14502d) obj2).d() == C14501c.FAMILY) {
                            break;
                        }
                    }
                    C14502d dVar = (C14502d) obj2;
                    d10 += (dVar != null ? dVar.c() : 0.0d) * ((double) iVar.b().a().g());
                }
                this.f99199e.f99193a.track(j.LIST_TOTAL.b(), X.m(C16796C.a("quantity", b.e(i10)), C16796C.a("family_price", b.c(d10))));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C11548b(e eVar, C12860a aVar, C14613b bVar, Q q10) {
        C17542s.j(eVar, "analytics");
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(q10, "appScope");
        this.f99193a = eVar;
        this.f99194b = aVar;
        this.f99195c = bVar;
        this.f99196d = q10;
    }

    public void a(boolean z10, boolean z11) {
        this.f99193a.e((Activity) null, z10 ? z11 ? "sl_populated_list_instore_mode_on" : "sl_populated_list_instore_mode_off" : "sl_empty_list");
    }

    public void b(A1 a12) {
        C17542s.j(a12, "carouselAnalyticsData");
        g.a.d(this.f99193a, a12.c(), a12.b(), "rec_panel", a12.a(), (Map) null, 16, (Object) null);
    }

    public void c(boolean z10) {
        String str = z10 ? "on" : "off";
        e eVar = this.f99193a;
        Interaction$Component interaction$Component = Interaction$Component.STORE_MODE_TOGGLE_FOR_SHOPPINGLIST;
        v a10 = C16796C.a("component_value", str);
        C12832d c10 = this.f99194b.c();
        e.c.b(eVar, interaction$Component, (String) null, X.m(a10, C16796C.a("store_id", c10 != null ? c10.e() : null)), (e.b) null, 10, (Object) null);
    }

    public void d() {
        e.c.b(this.f99193a, Interaction$Component.LOCAL_STORE_SELECTION, (String) null, X.m(C16796C.a("component_value", "change_store_button"), C16796C.a("app_location", Interaction$Component.SHOPPING_LIST_DETAILS.getValue())), (e.b) null, 10, (Object) null);
    }

    public void e(r rVar) {
        String str;
        C17542s.j(rVar, "mode");
        e eVar = this.f99193a;
        Interaction$Component interaction$Component = Interaction$Component.SHOPPING_LIST_DETAILS_INSPIRATION_TAB;
        C12832d c10 = this.f99194b.c();
        v a10 = C16796C.a("store_id", c10 != null ? c10.e() : null);
        if (C17542s.e(rVar, r.b.f101025a)) {
            str = "list";
        } else if (C17542s.e(rVar, r.a.f101024a)) {
            str = "inspiration";
        } else {
            throw new t();
        }
        e.c.b(eVar, interaction$Component, (String) null, X.m(a10, C16796C.a("component_value", str)), (e.b) null, 10, (Object) null);
    }

    public void f(String str) {
        C17542s.j(str, "listId");
        C16534i.M(C16534i.R(C16534i.e0(this.f99195c.q(str), 1), new C2251b(this, (C17164e<? super C2251b>) null)), this.f99196d);
    }

    public void g(String str, De.a aVar) {
        C17542s.j(str, "itemNo");
        C17542s.j(aVar, "component");
        g.a.a(this.f99193a, str, (Map) null, aVar, (String) null, (e.b) null, 26, (Object) null);
    }

    public void h() {
        e.c.b(this.f99193a, Interaction$Component.SHOPPING_LIST_DETAILS_INSPIRATION_ITEM_CAROUSEL, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }

    public void i() {
        e.c.b(this.f99193a, Interaction$Component.STORE_PAGE_OPEN, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }

    public void j(String str) {
        C17542s.j(str, "itemNo");
        e.c.b(this.f99193a, Interaction$Component.LOCAL_STORE_SELECTION, (String) null, X.m(C16796C.a("item_id", str), C16796C.a("component_value", "other_store_availability")), (e.b) null, 10, (Object) null);
    }

    public void k() {
        this.f99193a.e((Activity) null, "sl_open_list_item_modal");
    }

    public void l() {
        g.a.c(this.f99193a, "accessories", (String) null, (Map) null, Interaction$Component.SHOPPING_LIST_DETAILS_INSPIRATION_RECOMMENDATION, (e.b) null, 22, (Object) null);
    }
}
