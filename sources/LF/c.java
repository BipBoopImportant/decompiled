package Lf;

import Ae.e;
import Ae.g;
import Ae.j;
import Ae.k;
import HJ.C15854t;
import Ln.d;
import Nd.c;
import XH.C16796C;
import XH.t;
import YH.C16877v;
import YH.X;
import android.os.Bundle;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import fI.C17221b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sf.C10243d;
import uq.C12078d;
import uq.g;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001:\u0001'B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JI\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010#\u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010&J-\u0010+\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u00112\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b-\u0010&J\u000f\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b.\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u00101¨\u00062"}, d2 = {"LLf/c;", "LLf/b;", "LAe/e;", "analytics", "Luq/d;", "episodAnalytics", "LNd/c;", "abTesting", "<init>", "(LAe/e;Luq/d;LNd/c;)V", "Lsf/d;", "option", "", "hasUnavailableItems", "LXH/N;", "h", "(Lsf/d;Z)V", "", "productNumber", "", "quantity", "", "value", "currencyCode", "LAe/k;", "actionType", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "componentValue", "e", "(Ljava/lang/String;IDLjava/lang/String;LAe/k;Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;)V", "", "LLn/d;", "itemHolders", "totalValue", "b", "(Ljava/util/List;DLjava/lang/String;)V", "d", "()V", "a", "c", "listId", "itemNos", "g", "(Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "f", "i", "LAe/e;", "Luq/d;", "LNd/c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final e f61654a;

    /* renamed from: b  reason: collision with root package name */
    private final C12078d f61655b;

    /* renamed from: c  reason: collision with root package name */
    private final Nd.c f61656c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LLf/c$a;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "UNAVAILABLE_ITEMS", "FAMILY_PROMOTION", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum a {
        UNAVAILABLE_ITEMS("unavailable_items"),
        FAMILY_PROMOTION("family_promotion");
        
        private final String key;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(String str) {
            this.key = str;
        }

        public final String b() {
            return this.key;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f61657a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                sf.d[] r0 = sf.C10243d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                sf.d r1 = sf.C10243d.HOME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                sf.d r1 = sf.C10243d.CLICK_AND_COLLECT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f61657a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Lf.c.b.<clinit>():void");
        }
    }

    public c(e eVar, C12078d dVar, Nd.c cVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(dVar, "episodAnalytics");
        C17542s.j(cVar, "abTesting");
        this.f61654a = eVar;
        this.f61655b = dVar;
        this.f61656c = cVar;
    }

    public void a() {
        e.c.b(this.f61654a, Interaction$Component.LOGIN_BUTTON, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }

    public void b(List<d> list, double d10, String str) {
        List<d> list2 = list;
        String str2 = str;
        C17542s.j(list, "itemHolders");
        C17542s.j(str2, "currencyCode");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, true)) {
                arrayList.add(next);
            }
        }
        String str3 = null;
        String str4 = null;
        for (C11819b bVar : arrayList) {
            if (str3 == null) {
                String a10 = C11818a.a("Track view cart", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            String str5 = str3;
            if (str4 == null) {
                String name = c.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str6 = str4;
            bVar.a(eVar, str6, true, (Throwable) null, str5);
            str3 = str5;
            str4 = str6;
        }
        Iterable<d> iterable = list2;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
        int i10 = 0;
        for (d dVar : iterable) {
            i10 += dVar.l();
            arrayList2.add(D2.d.b(C16796C.a("quantity", Integer.valueOf(dVar.l())), C16796C.a("item_id", dVar.j())));
        }
        this.f61654a.track("view_cart", X.m(C16796C.a("quantity", Integer.valueOf(i10)), C16796C.a("value", Double.valueOf(d10)), C16796C.a("currency", str2), C16796C.a("items", (Bundle[]) arrayList2.toArray(new Bundle[0])), C16796C.a("component", "online")));
    }

    public void c() {
        e.c.b(this.f61654a, Interaction$Component.SIGN_UP_BUTTON, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }

    public void d() {
        this.f61654a.track(a.FAMILY_PROMOTION.b(), X.f(C16796C.a("object_type", "link")));
    }

    public void e(String str, int i10, double d10, String str2, k kVar, Interaction$Component interaction$Component, String str3) {
        C17542s.j(str, "productNumber");
        C17542s.j(str2, "currencyCode");
        C17542s.j(kVar, "actionType");
        C17542s.j(interaction$Component, "component");
        Map c10 = X.c();
        c10.put("quantity", Integer.valueOf(i10));
        c10.put("value", Double.valueOf(d10));
        c10.put("currency", str2);
        c10.put("action_type", kVar.b());
        c10.put("component", interaction$Component.getValue());
        if (str3 != null) {
            Serializable serializable = (Serializable) c10.put("component_value", str3);
        }
        c10.put("items", new Bundle[]{D2.d.b(C16796C.a("item_id", str), C16796C.a("quantity", Integer.valueOf(i10)))});
        Map b10 = X.b(c10);
        this.f61655b.a(new g.C2481g(str, i10, interaction$Component.getValue()));
        this.f61654a.track("remove_from_cart", b10);
    }

    public void f() {
        e.c.b(this.f61654a, Interaction$Component.REMOTE_SALES_CART_MENU_ICON, (String) null, (Map) null, (e.b) null, 14, (Object) null);
        c.a.a(this.f61656c, "remote_sales_cart_menu_icon", (Map) null, (Map) null, 6, (Object) null);
    }

    public void g(String str, List<String> list, Interaction$Component interaction$Component) {
        C17542s.j(str, "listId");
        C17542s.j(list, "itemNos");
        C17542s.j(interaction$Component, "component");
        g.a.d(this.f61654a, str, list, "rec_panel", interaction$Component, (Map) null, 16, (Object) null);
    }

    public void h(C10243d dVar, boolean z10) {
        Rg.c cVar;
        C17542s.j(dVar, "option");
        int i10 = b.f61657a[dVar.ordinal()];
        if (i10 == 1) {
            cVar = Rg.c.HOME;
        } else if (i10 == 2) {
            cVar = Rg.c.CLICK_COLLECT_STORE;
        } else {
            throw new t();
        }
        e eVar = this.f61654a;
        String b10 = j.ACTION_VIEWED.b();
        Interaction$Component interaction$Component = Interaction$Component.CART_DELIVERY_OPTION;
        e.c.c(eVar, b10, X.f(C16796C.a("component_value", cVar.b())), interaction$Component, (e.b) null, 8, (Object) null);
        if (z10) {
            e.c.c(this.f61654a, a.UNAVAILABLE_ITEMS.b(), X.f(C16796C.a("component_value", cVar.b())), interaction$Component, (e.b) null, 8, (Object) null);
        }
    }

    public void i() {
        e.c.b(this.f61654a, Interaction$Component.REMOTE_SALES_SHEET_DIAL, (String) null, (Map) null, (e.b) null, 14, (Object) null);
        c.a.a(this.f61656c, "remote_sales_sheet_dial", (Map) null, (Map) null, 6, (Object) null);
    }
}
