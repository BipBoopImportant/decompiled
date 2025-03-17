package Pt;

import Ae.e;
import Ae.j;
import It.C10749l;
import Pt.a;
import XH.C16796C;
import XH.t;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LPt/b;", "LPt/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "storeId", "eventId", "LPt/a$a;", "location", "LXH/N;", "d", "(Ljava/lang/String;Ljava/lang/String;LPt/a$a;)V", "LIt/l$h$a;", "origin", "b", "(Ljava/lang/String;LIt/l$h$a;)V", "f", "()V", "h", "(Ljava/lang/String;)V", "e", "", "isSuccess", "g", "(Ljava/lang/String;Z)V", "isConfirmationStep", "c", "a", "LAe/e;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final e f85796a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f85797a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                It.l$h$a[] r0 = It.C10749l.h.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                It.l$h$a r1 = It.C10749l.h.a.SECTION_HEADER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                It.l$h$a r1 = It.C10749l.h.a.LAST_CARD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                It.l$h$a r1 = It.C10749l.h.a.SHORTCUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f85797a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Pt.b.a.<clinit>():void");
        }
    }

    public b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f85796a = eVar;
    }

    public void a(String str, boolean z10) {
        C17542s.j(str, "storeId");
        e.c.c(this.f85796a, z10 ? j.ACTION_SUCCESS.b() : j.ACTION_FAIL.b(), X.f(C16796C.a("store_id", str)), Interaction$Component.CANCEL_STORE_EVENT, (e.b) null, 8, (Object) null);
    }

    public void b(String str, C10749l.h.a aVar) {
        Interaction$Component interaction$Component;
        C17542s.j(str, "storeId");
        C17542s.j(aVar, "origin");
        int i10 = a.f85797a[aVar.ordinal()];
        if (i10 == 1) {
            interaction$Component = Interaction$Component.SECTION_HEADER_STORE_EVENT;
        } else if (i10 == 2) {
            interaction$Component = Interaction$Component.CAROUSEL_LAST_CARD_STORE_EVENT;
        } else if (i10 == 3) {
            interaction$Component = null;
        } else {
            throw new t();
        }
        Interaction$Component interaction$Component2 = interaction$Component;
        if (interaction$Component2 != null) {
            e.c.b(this.f85796a, interaction$Component2, (String) null, X.m(C16796C.a("store_id", str), C16796C.a("app_location", a.C1743a.CAROUSEL_INSTORE_PAGE.b())), (e.b) null, 10, (Object) null);
        }
    }

    public void c(String str, boolean z10) {
        C17542s.j(str, "storeId");
        e.c.b(this.f85796a, Interaction$Component.CANCEL_STORE_EVENT, (String) null, X.m(C16796C.a("store_id", str), C16796C.a("component_value", z10 ? "cancel_confirm" : "cancel_start")), (e.b) null, 10, (Object) null);
    }

    public void d(String str, String str2, a.C1743a aVar) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "eventId");
        C17542s.j(aVar, "location");
        e.c.b(this.f85796a, Interaction$Component.STORE_EVENT_CARD, (String) null, X.m(C16796C.a("store_id", str), C16796C.a("component_value", str2), C16796C.a("app_location", aVar.b())), (e.b) null, 10, (Object) null);
    }

    public void e(String str) {
        C17542s.j(str, "storeId");
        e.c.b(this.f85796a, Interaction$Component.STORE_EVENT_REGISTER, (String) null, X.m(C16796C.a("store_id", str), C16796C.a("component_value", "last_step_registration_flow")), (e.b) null, 10, (Object) null);
    }

    public void f() {
        e.c.b(this.f85796a, Interaction$Component.LOGIN_BUTTON, (String) null, X.f(C16796C.a("app_location", a.C1743a.STORE_EVENT.b())), (e.b) null, 10, (Object) null);
    }

    public void g(String str, boolean z10) {
        C17542s.j(str, "storeId");
        e.c.c(this.f85796a, z10 ? j.ACTION_SUCCESS.b() : j.ACTION_FAIL.b(), X.f(C16796C.a("store_id", str)), Interaction$Component.STORE_EVENT_REGISTER, (e.b) null, 8, (Object) null);
    }

    public void h(String str) {
        C17542s.j(str, "storeId");
        e.c.b(this.f85796a, Interaction$Component.STORE_EVENT_REGISTER, (String) null, X.m(C16796C.a("store_id", str), C16796C.a("component_value", "step1_registration_flow")), (e.b) null, 10, (Object) null);
    }
}
