package TA;

import Ae.e;
import Ae.k;
import HJ.C15854t;
import Nd.c;
import SA.C13560a;
import XH.C16796C;
import XH.C16807N;
import YH.X;
import android.os.Bundle;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ne.C10089a;
import ne.C10090b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import uq.C12078d;
import uq.g;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0017\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"LTA/e;", "LSA/a;", "LAe/e;", "analytics", "LNd/c;", "abTesting", "Lne/a;", "adjustTracker", "Luq/d;", "episodAnalytics", "<init>", "(LAe/e;LNd/c;Lne/a;Luq/d;)V", "", "itemNo", "", "quantity", "LDe/a;", "component", "LAe/k;", "actionType", "LXH/N;", "c", "(Ljava/lang/String;ILDe/a;LAe/k;)V", "e", "b", "()V", "a", "d", "(Ljava/lang/String;)V", "LAe/e;", "LNd/c;", "Lne/a;", "Luq/d;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TA.e  reason: case insensitive filesystem */
public final class C13675e implements C13560a {

    /* renamed from: a  reason: collision with root package name */
    private final e f116651a;

    /* renamed from: b  reason: collision with root package name */
    private final c f116652b;

    /* renamed from: c  reason: collision with root package name */
    private final C10089a f116653c;

    /* renamed from: d  reason: collision with root package name */
    private final C12078d f116654d;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0007\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0007R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00198\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"LTA/e$a;", "Lne/b;", "", "itemId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "getItemId", "f", "b", "debugToken", "g", "c", "releaseToken", "", "h", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "callbackParameters", "i", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TA.e$a */
    private static final class a extends C10090b {

        /* renamed from: i  reason: collision with root package name */
        public static final C2854a f116655i = new C2854a((DefaultConstructorMarker) null);

        /* renamed from: e  reason: collision with root package name */
        private final String f116656e;

        /* renamed from: f  reason: collision with root package name */
        private final String f116657f = "gkfi77";

        /* renamed from: g  reason: collision with root package name */
        private final String f116658g = "tcl24k";

        /* renamed from: h  reason: collision with root package name */
        private final Map<String, String> f116659h;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LTA/e$a$a;", "", "<init>", "()V", "", "DEBUG_TOKEN", "Ljava/lang/String;", "RELEASE_TOKEN", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: TA.e$a$a  reason: collision with other inner class name */
        public static final class C2854a {
            public /* synthetic */ C2854a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C2854a() {
            }
        }

        public a(String str) {
            C17542s.j(str, "itemId");
            this.f116656e = str;
            this.f116659h = X.f(C16796C.a("item_id", str));
        }

        public Map<String, String> a() {
            return this.f116659h;
        }

        public String b() {
            return this.f116657f;
        }

        public String c() {
            return this.f116658g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f116656e, ((a) obj).f116656e);
        }

        public int hashCode() {
            return this.f116656e.hashCode();
        }

        public String toString() {
            String str = this.f116656e;
            return "AddToShoppingListAdjustEvent(itemId=" + str + ")";
        }
    }

    public C13675e(e eVar, c cVar, C10089a aVar, C12078d dVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(cVar, "abTesting");
        C17542s.j(aVar, "adjustTracker");
        C17542s.j(dVar, "episodAnalytics");
        this.f116651a = eVar;
        this.f116652b = cVar;
        this.f116653c = aVar;
        this.f116654d = dVar;
    }

    public void a() {
        this.f116651a.track(C13676f.DELETE_LIST.b(), (Map<String, ? extends Object>) null);
    }

    public void b() {
        this.f116651a.track(C13676f.CREATE_LIST.b(), (Map<String, ? extends Object>) null);
    }

    public void c(String str, int i10, De.a aVar, k kVar) {
        String str2 = str;
        C17542s.j(str2, "itemNo");
        C17542s.j(aVar, "component");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, true)) {
                arrayList.add(next);
            }
        }
        String str3 = null;
        String str4 = null;
        for (C11819b bVar : arrayList) {
            if (str3 == null) {
                String a10 = C11818a.a("Track add to list, item id: " + str2, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            String str5 = str3;
            if (str4 == null) {
                String name = C13675e.class.getName();
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
        Map p10 = X.p(C16796C.a("items", new Bundle[]{D2.d.b(C16796C.a("item_id", str2), C16796C.a("quantity", Integer.valueOf(i10)))}), C16796C.a("quantity", Integer.valueOf(i10)), C16796C.a("component", aVar.getValue()));
        if (kVar != null) {
            p10.put("action_type", kVar.b());
        }
        this.f116651a.track("add_to_wishlist", p10);
        c.a.a(this.f116652b, "add_to_wishlist", (Map) null, (Map) null, 6, (Object) null);
        this.f116653c.a(new a(str2));
        this.f116654d.a(new g.b(str2, i10, aVar.getValue()));
    }

    public void d(String str) {
        C17542s.j(str, "itemNo");
        this.f116651a.track(C13676f.UPSELL_ADD.b(), X.f(C16796C.a("item_id", str)));
    }

    public void e(String str, int i10, De.a aVar, k kVar) {
        C17542s.j(str, "itemNo");
        C17542s.j(aVar, "component");
        e eVar = this.f116651a;
        String b10 = C13676f.REMOVED.b();
        Map c10 = X.c();
        c10.put("item_id", str);
        c10.put("quantity", Long.valueOf((long) i10));
        c10.put("component", aVar.getValue());
        if (kVar != null) {
            c10.put("action_type", kVar.b());
        }
        C16807N n10 = C16807N.f139792a;
        eVar.track(b10, X.b(c10));
        this.f116654d.a(new g.h(str, i10, aVar.getValue()));
    }
}
