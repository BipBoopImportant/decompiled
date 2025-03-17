package zv;

import Ae.e;
import Ae.f;
import Ae.g;
import Rv.l;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import YH.X;
import aA.C13909a;
import android.app.Activity;
import com.ingka.ikea.analytics.Interaction$Component;
import fI.C17221b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u0000 '2\u00020\u0001:\u0002#0B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0011\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0014\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\n*\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b'\u0010(J5\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0016¢\u0006\u0004\b*\u0010+J=\u0010,\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0010H\u0016¢\u0006\u0004\b2\u00101J\u001d\u00105\u001a\u00020\u00102\f\u00104\u001a\b\u0012\u0004\u0012\u00020\r03H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00108¨\u00069"}, d2 = {"Lzv/c;", "Lzv/b;", "LAe/e;", "analytics", "LaA/a;", "sessionManager", "<init>", "(LAe/e;LaA/a;)V", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "Lzv/c$a;", "appLocation", "", "", "", "customParams", "LXH/N;", "m", "(LAe/e;Lcom/ingka/ikea/analytics/Interaction$Component;Lzv/c$a;Ljava/util/Map;)V", "listId", "o", "(LAe/e;Lcom/ingka/ikea/analytics/Interaction$Component;Lzv/c$a;Ljava/util/Map;Ljava/lang/String;)V", "LRv/l;", "currentTab", "j", "(LRv/l;)Lzv/c$a;", "l", "", "k", "()Z", "hasFamilyPrivileges", "i", "(Ljava/lang/Boolean;)Ljava/lang/String;", "Lzv/d;", "screenName", "a", "(Lzv/d;)V", "from", "to", "c", "(LRv/l;LRv/l;)V", "tab", "d", "(LRv/l;Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/util/Map;)V", "e", "(LRv/l;Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/util/Map;)V", "f", "(Z)V", "b", "()V", "h", "", "itemNos", "g", "(Ljava/util/List;)V", "LAe/e;", "LaA/a;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final b f58654c = new b((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f58655d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e f58656a;

    /* renamed from: b  reason: collision with root package name */
    private final C13909a f58657b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lzv/c$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "PROFILE", "OVERVIEW", "YOUR_HOME", "SETTINGS", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum a {
        PROFILE("profile"),
        OVERVIEW("membership_space_overview"),
        YOUR_HOME("membership_space_your_home"),
        SETTINGS("membership_space_settings");
        
        private final String value;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(String str) {
            this.value = str;
        }

        public final String b() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzv/c$b;", "", "<init>", "()V", "", "ACCOUNT_TYPE", "Ljava/lang/String;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zv.c$c  reason: collision with other inner class name */
    public /* synthetic */ class C0956c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f58658a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Rv.l[] r0 = Rv.l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Rv.l r1 = Rv.l.Overview     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Rv.l r1 = Rv.l.YourHome     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Rv.l r1 = Rv.l.Settings     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f58658a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zv.c.C0956c.<clinit>():void");
        }
    }

    public c(e eVar, C13909a aVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(aVar, "sessionManager");
        this.f58656a = eVar;
        this.f58657b = aVar;
    }

    private final String i(Boolean bool) {
        return (bool == null || !bool.booleanValue()) ? "regular" : "family";
    }

    private final a j(l lVar) {
        return k() ? l(lVar) : a.PROFILE;
    }

    private final boolean k() {
        return this.f58657b.isLoggedIn();
    }

    private final a l(l lVar) {
        int i10 = C0956c.f58658a[lVar.ordinal()];
        if (i10 == 1) {
            return a.OVERVIEW;
        }
        if (i10 == 2) {
            return a.YOUR_HOME;
        }
        if (i10 == 3) {
            return a.SETTINGS;
        }
        throw new t();
    }

    private final void m(e eVar, Interaction$Component interaction$Component, a aVar, Map<String, ? extends Object> map) {
        Map c10 = X.c();
        c10.put("app_location", aVar.b());
        c10.putAll(map);
        C16807N n10 = C16807N.f139792a;
        e.c.b(eVar, interaction$Component, (String) null, X.b(c10), (e.b) null, 10, (Object) null);
    }

    static /* synthetic */ void n(c cVar, e eVar, Interaction$Component interaction$Component, a aVar, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = X.j();
        }
        cVar.m(eVar, interaction$Component, aVar, map);
    }

    private final void o(e eVar, Interaction$Component interaction$Component, a aVar, Map<String, ? extends Object> map, String str) {
        Map c10 = X.c();
        c10.put("app_location", aVar.b());
        c10.putAll(map);
        g.a.c(eVar, str, (String) null, X.b(c10), interaction$Component, (e.b) null, 18, (Object) null);
    }

    public void a(d dVar) {
        C17542s.j(dVar, "screenName");
        this.f58656a.e((Activity) null, dVar.b());
    }

    public void b() {
        f.a.a(this.f58656a, C9044a.PREFERRED_STORE_SAVE.b(), (Map) null, 2, (Object) null);
    }

    public void c(l lVar, l lVar2) {
        Interaction$Component interaction$Component;
        C17542s.j(lVar, "from");
        C17542s.j(lVar2, "to");
        if (k() && lVar != lVar2) {
            e eVar = this.f58656a;
            a l10 = l(lVar);
            int i10 = C0956c.f58658a[lVar2.ordinal()];
            if (i10 == 1) {
                interaction$Component = Interaction$Component.MEMBERSHIP_TAB_OVERVIEW;
            } else if (i10 == 2) {
                interaction$Component = Interaction$Component.MEMBERSHIP_TAB_LISTS;
            } else if (i10 == 3) {
                interaction$Component = Interaction$Component.MEMBERSHIP_TAB_SETTINGS;
            } else {
                throw new t();
            }
            n(this, eVar, interaction$Component, l10, (Map) null, 4, (Object) null);
        }
    }

    public void d(l lVar, Interaction$Component interaction$Component, Map<String, ? extends Object> map) {
        C17542s.j(lVar, "tab");
        C17542s.j(interaction$Component, "component");
        C17542s.j(map, "customParams");
        m(this.f58656a, interaction$Component, j(lVar), map);
    }

    public void e(l lVar, String str, Interaction$Component interaction$Component, Map<String, ? extends Object> map) {
        C17542s.j(lVar, "tab");
        C17542s.j(str, "listId");
        C17542s.j(interaction$Component, "component");
        C17542s.j(map, "customParams");
        o(this.f58656a, interaction$Component, j(lVar), map, str);
    }

    public void f(boolean z10) {
        this.f58656a.track(C9044a.LOGOUT.b(), X.f(C16796C.a("account_type", i(Boolean.valueOf(z10)))));
    }

    public void g(List<String> list) {
        C17542s.j(list, "itemNos");
        g.a.d(this.f58656a, "member_discounts", list, (String) null, Interaction$Component.CAROUSEL_MEMBER_DISCOUNTS, (Map) null, 16, (Object) null);
    }

    public void h() {
        e.c.b(this.f58656a, Interaction$Component.TAB_BAR, (String) null, X.f(C16796C.a("component_value", "membership")), (e.b) null, 10, (Object) null);
    }
}
