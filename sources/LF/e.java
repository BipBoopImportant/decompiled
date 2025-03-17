package Lf;

import Ae.d;
import Ae.e;
import HJ.C15854t;
import Lf.d;
import Nd.c;
import XH.C16796C;
import YH.C16877v;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ne.C10089a;
import ne.C10090b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import uq.C12078d;
import uq.g;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0017B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0014\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LLf/e;", "LLf/d;", "LAe/e;", "analytics", "LNd/c;", "abTesting", "Lne/a;", "adjustTracker", "Luq/d;", "episodAnalytics", "<init>", "(LAe/e;LNd/c;Lne/a;Luq/d;)V", "", "LLf/d$a;", "items", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "", "componentValue", "LXH/N;", "b", "(Ljava/util/List;Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;)V", "reasonCode", "a", "(Ljava/lang/String;)V", "LAe/e;", "LNd/c;", "c", "Lne/a;", "d", "Luq/d;", "e", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f61660e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f61661f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Ae.e f61662a;

    /* renamed from: b  reason: collision with root package name */
    private final c f61663b;

    /* renamed from: c  reason: collision with root package name */
    private final C10089a f61664c;

    /* renamed from: d  reason: collision with root package name */
    private final C12078d f61665d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LLf/e$a;", "", "<init>", "()V", "", "HARD_CODED_ITEM_CATEGORY", "Ljava/lang/String;", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0007\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0007R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00198\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"LLf/e$a$a;", "Lne/b;", "", "productNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "getProductNumber", "f", "b", "debugToken", "g", "c", "releaseToken", "", "h", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "callbackParameters", "i", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Lf.e$a$a  reason: collision with other inner class name */
        private static final class C1026a extends C10090b {

            /* renamed from: i  reason: collision with root package name */
            public static final C1027a f61666i = new C1027a((DefaultConstructorMarker) null);

            /* renamed from: e  reason: collision with root package name */
            private final String f61667e;

            /* renamed from: f  reason: collision with root package name */
            private final String f61668f = "omtr9v";

            /* renamed from: g  reason: collision with root package name */
            private final String f61669g = "tbaa4d";

            /* renamed from: h  reason: collision with root package name */
            private final Map<String, String> f61670h;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LLf/e$a$a$a;", "", "<init>", "()V", "", "DEBUG_TOKEN", "Ljava/lang/String;", "RELEASE_TOKEN", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Lf.e$a$a$a  reason: collision with other inner class name */
            public static final class C1027a {
                public /* synthetic */ C1027a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C1027a() {
                }
            }

            public C1026a(String str) {
                C17542s.j(str, "productNumber");
                this.f61667e = str;
                this.f61670h = X.f(C16796C.a("item_id", str));
            }

            public Map<String, String> a() {
                return this.f61670h;
            }

            public String b() {
                return this.f61668f;
            }

            public String c() {
                return this.f61669g;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1026a) && C17542s.e(this.f61667e, ((C1026a) obj).f61667e);
            }

            public int hashCode() {
                return this.f61667e.hashCode();
            }

            public String toString() {
                String str = this.f61667e;
                return "AddToCartAdjustEvent(productNumber=" + str + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(Ae.e eVar, c cVar, C10089a aVar, C12078d dVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(cVar, "abTesting");
        C17542s.j(aVar, "adjustTracker");
        C17542s.j(dVar, "episodAnalytics");
        this.f61662a = eVar;
        this.f61663b = cVar;
        this.f61664c = aVar;
        this.f61665d = dVar;
    }

    public void a(String str) {
        e.c.a(this.f61662a, "add_to_cart", d.SYS_ERROR, str, (Map) null, 8, (Object) null);
    }

    public void b(List<d.a> list, Interaction$Component interaction$Component, String str) {
        List<d.a> list2 = list;
        String str2 = str;
        C17542s.j(list2, "items");
        C17542s.j(interaction$Component, "component");
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
                String a10 = C11818a.a("Track add to cart, items: " + list2, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            String str5 = str3;
            if (str4 == null) {
                String name = e.class.getName();
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
        Iterable<d.a> iterable = list2;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
        for (d.a aVar : iterable) {
            String a11 = aVar.a();
            arrayList2.add(D2.d.b(C16796C.a("item_id", a11), C16796C.a("item_name", a11), C16796C.a("item_category", "Category"), C16796C.a("quantity", Integer.valueOf(aVar.b()))));
        }
        Map p10 = X.p(C16796C.a("items", new ArrayList(arrayList2)), C16796C.a("component", interaction$Component.getValue()));
        if (str2 != null) {
            p10.put("component_value", str2);
        }
        this.f61662a.track("add_to_cart", p10);
        c.a.a(this.f61663b, "add_to_cart", (Map) null, (Map) null, 6, (Object) null);
        for (d.a aVar2 : iterable) {
            this.f61664c.a(new a.C1026a(aVar2.a()));
            this.f61665d.a(new g.a(aVar2.a(), aVar2.b(), interaction$Component.getValue()));
        }
    }
}
