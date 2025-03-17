package xn;

import Ae.e;
import Ae.g;
import Ae.j;
import Ae.q;
import De.a;
import HJ.C15854t;
import XH.C16796C;
import XH.t;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.analytics.Interaction$ContextComponent;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.i;
import mp.C11588a;
import on.C11686a;
import on.C11687b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import uq.C12078d;
import uq.g;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010\u001aJ\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010\u0018J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010\u0018J\u0017\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J/\u00108\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\t2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J'\u0010;\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0016¢\u0006\u0004\b;\u0010\u0011J\u001f\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\t2\u0006\u00104\u001a\u00020\tH\u0016¢\u0006\u0004\b=\u0010!J\u0017\u0010?\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\bA\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010CR\u0014\u0010E\u001a\u00020\t8\u0002XD¢\u0006\u0006\n\u0004\b)\u0010D¨\u0006F"}, d2 = {"Lxn/a;", "Lon/a;", "LAe/e;", "analytics", "Luq/d;", "episodAnalytics", "<init>", "(LAe/e;Luq/d;)V", "", "", "s", "(Z)Ljava/lang/String;", "listId", "componentValue", "type", "LXH/N;", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "itemNos", "e", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "categoryId", "o", "(Ljava/lang/String;)V", "n", "()V", "l", "sortBy", "k", "filterFormat", "filterValue", "p", "(Ljava/lang/String;Ljava/lang/String;)V", "itemNo", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "i", "(Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "a", "id", "c", "Lvn/g;", "selectedRowLayout", "r", "(Lvn/g;)V", "d", "Lmp/a;", "inspirationFeedItem", "b", "(Lmp/a;)V", "referenceMediaId", "plpId", "visualMessageId", "Lkp/i$a;", "imageType", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkp/i$a;)V", "actionHeaderId", "f", "storyId", "g", "enabled", "h", "(Z)V", "j", "LAe/e;", "Luq/d;", "Ljava/lang/String;", "plpContextScreen", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xn.a  reason: case insensitive filesystem */
public final class C12320a implements C11686a {

    /* renamed from: a  reason: collision with root package name */
    private final e f106065a;

    /* renamed from: b  reason: collision with root package name */
    private final C12078d f106066b;

    /* renamed from: c  reason: collision with root package name */
    private final String f106067c = "plp";

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xn.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C2520a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f106068a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f106069b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003b */
        static {
            /*
                vn.g[] r0 = vn.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                vn.g r2 = vn.g.MULTI     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                vn.g r3 = vn.g.SINGLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f106068a = r0
                kp.i$a[] r0 = kp.i.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kp.i$a r3 = kp.i.a.REGULAR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                kp.i$a r1 = kp.i.a.SHOPPABLE     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                kp.i$a r1 = kp.i.a.USER_CONTENT     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                kp.i$a r1 = kp.i.a.VIDEO     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                f106069b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xn.C12320a.C2520a.<clinit>():void");
        }
    }

    public C12320a(e eVar, C12078d dVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(dVar, "episodAnalytics");
        this.f106065a = eVar;
        this.f106066b = dVar;
    }

    private final String s(boolean z10) {
        return z10 ? "on" : "off";
    }

    public void a() {
        e.c.c(this.f106065a, j.ACTION_TAP.b(), (Map) null, Interaction$Component.VIEW_COLORS, (e.b) null, 10, (Object) null);
    }

    public void b(C11588a aVar) {
        C17542s.j(aVar, "inspirationFeedItem");
        C12078d dVar = this.f106066b;
        String f10 = aVar.f();
        Interaction$Component interaction$Component = Interaction$Component.NO_CONTENT_PLP;
        dVar.a(new g.i(f10, interaction$Component.getValue(), interaction$Component.getValue()));
    }

    public void c(String str) {
        C17542s.j(str, "id");
        g.a.c(this.f106065a, str, (String) null, (Map) null, Interaction$Component.CAMPAIGN_CAROUSEL, (e.b) null, 22, (Object) null);
    }

    public void d(String str) {
        C17542s.j(str, "itemNo");
        e.c.c(this.f106065a, j.ACTION_SWIPE.b(), X.p(C16796C.a("items", X.p(C16796C.a("item_id", str)))), Interaction$Component.CONTEXTUAL_IMAGE, (e.b) null, 8, (Object) null);
    }

    public void e(String str, List<String> list, String str2) {
        C17542s.j(str, "listId");
        C17542s.j(list, "itemNos");
        C17542s.j(str2, "type");
        e eVar = this.f106065a;
        Interaction$Component interaction$Component = Interaction$Component.PRODUCT_LISTING;
        g.a.d(eVar, str, list, interaction$Component.getValue(), interaction$Component, (Map) null, 16, (Object) null);
    }

    public void f(String str, String str2, String str3) {
        C17542s.j(str, "plpId");
        C17542s.j(str2, "visualMessageId");
        C17542s.j(str3, "actionHeaderId");
        g.a.b(this.f106065a, str3, (Map) null, Interaction$Component.ACTION_HEADER, new e.b(this.f106067c, str, (String) null, Interaction$ContextComponent.VISUAL_MESSAGE, str2, 4, (DefaultConstructorMarker) null), 2, (Object) null);
    }

    public void g(String str, String str2) {
        C17542s.j(str, "storyId");
        C17542s.j(str2, "plpId");
        e.c.b(this.f106065a, Interaction$Component.STORY_CAROUSEL, str, (Map) null, new e.b(this.f106067c, str2, (String) null, (Interaction$ContextComponent) null, (String) null, 28, (DefaultConstructorMarker) null), 4, (Object) null);
    }

    public void h(boolean z10) {
        e.c.b(this.f106065a, Interaction$Component.PLP_HOME_DELIVERY_TOGGLE, (String) null, X.f(C16796C.a("component_value", s(z10))), (e.b) null, 10, (Object) null);
    }

    public void i(String str, Interaction$Component interaction$Component) {
        C17542s.j(str, "itemNo");
        C17542s.j(interaction$Component, "component");
        g.a.a(this.f106065a, str, (Map) null, interaction$Component, (String) null, (e.b) null, 26, (Object) null);
    }

    public void j(boolean z10) {
        e.c.b(this.f106065a, Interaction$Component.PLP_IN_STORE_TOGGLE, (String) null, X.f(C16796C.a("component_value", s(z10))), (e.b) null, 10, (Object) null);
    }

    public void k(String str) {
        C17542s.j(str, "sortBy");
        e.c.b(this.f106065a, Interaction$Component.SORT_FILTER_MENU, (String) null, X.f(C16796C.a("component_value", str)), (e.b) null, 10, (Object) null);
    }

    public void l() {
        e.c.b(this.f106065a, Interaction$Component.SORT_FILTER_MENU, (String) null, X.f(C16796C.a("component_value", "clear_all")), (e.b) null, 10, (Object) null);
    }

    public void m(String str, String str2, String str3, i.a aVar) {
        q qVar;
        C17542s.j(str, "referenceMediaId");
        C17542s.j(str2, "plpId");
        C17542s.j(str3, "visualMessageId");
        C17542s.j(aVar, "imageType");
        int i10 = C2520a.f106069b[aVar.ordinal()];
        if (i10 == 1) {
            qVar = q.REGULAR;
        } else if (i10 == 2) {
            qVar = q.SHOPPABLE;
        } else if (i10 == 3) {
            qVar = q.VUGC;
        } else if (i10 == 4) {
            IllegalStateException illegalStateException = new IllegalStateException("Video should not be clickable.");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar : arrayList) {
                if (str4 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str4 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str6 = str4;
                if (str5 == null) {
                    String name = C12320a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str7 = str5;
                bVar.a(eVar, str7, false, illegalStateException, str6);
                str4 = str6;
                str5 = str7;
            }
            return;
        } else {
            throw new t();
        }
        g.a.c(this.f106065a, str, qVar.b(), (Map) null, Interaction$Component.IMAGE_CAROUSEL, new e.b(this.f106067c, str2, (String) null, Interaction$ContextComponent.VISUAL_MESSAGE, str3, 4, (DefaultConstructorMarker) null), 4, (Object) null);
    }

    public void n() {
        e.c.c(this.f106065a, j.ACTION_TAP.b(), (Map) null, Interaction$Component.PLP_BUYING_OPTION, (e.b) null, 10, (Object) null);
    }

    public void o(String str) {
        C17542s.j(str, "categoryId");
        g.a.c(this.f106065a, str, (String) null, (Map) null, Interaction$Component.CATEGORIES_CAROUSEL, (e.b) null, 22, (Object) null);
    }

    public void p(String str, String str2) {
        C17542s.j(str, "filterFormat");
        C17542s.j(str2, "filterValue");
        e eVar = this.f106065a;
        Interaction$Component interaction$Component = Interaction$Component.SORT_FILTER_MENU;
        e.c.b(eVar, interaction$Component, (String) null, X.f(C16796C.a("component_value", str + " | " + str2)), (e.b) null, 10, (Object) null);
    }

    public void q(String str, String str2, String str3) {
        C17542s.j(str, "listId");
        C17542s.j(str2, "componentValue");
        C17542s.j(str3, "type");
        Map f10 = (!C15854t.H(str2, Interaction$Component.SEARCH_BAR.getValue(), true) || C11687b.f100624a.a(str3) != C11687b.e.SEARCH_RESULTS) ? null : X.f(C16796C.a("component_value", "browse_search_bar"));
        e eVar = this.f106065a;
        for (T next : Interaction$Component.getEntries()) {
            if (C17542s.e(((Interaction$Component) next).getValue(), str2)) {
                eVar.b(str, f10, (a) next);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public void r(vn.g gVar) {
        String str;
        C17542s.j(gVar, "selectedRowLayout");
        int i10 = C2520a.f106068a[gVar.ordinal()];
        if (i10 == 1) {
            str = "grid_view";
        } else if (i10 == 2) {
            str = "single_view";
        } else {
            throw new t();
        }
        e.c.b(this.f106065a, Interaction$Component.VIEW_TOGGLE, (String) null, X.f(C16796C.a("component_value", str)), (e.b) null, 10, (Object) null);
    }
}
