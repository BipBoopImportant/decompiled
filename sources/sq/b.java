package Sq;

import Ae.e;
import Ae.j;
import Iq.a;
import XH.C16796C;
import XH.t;
import XH.v;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import fI.C17221b;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kr.f;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*¨\u0006+"}, d2 = {"LSq/b;", "LSq/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "id", "rewardType", "rewardCategory", "LXH/N;", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "questionId", "", "opened", "f", "(Ljava/lang/String;Z)V", "LIq/a;", "reward", "g", "(LIq/a;)V", "Lkr/f$c$a;", "type", "category", "c", "(Ljava/lang/String;Lkr/f$c$a;Ljava/lang/String;)V", "LIq/a$c;", "a", "(LIq/a$c;)V", "rewardId", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "", "responseCode", "b", "(Ljava/lang/String;I)V", "e", "()V", "balance", "h", "(I)V", "LAe/e;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final e f87317a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LSq/b$a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "AVAILABLE", "UNAVAILABLE", "CLAIMED", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum a {
        AVAILABLE("available"),
        UNAVAILABLE("unavailable"),
        CLAIMED("claimed");
        
        private final String rawValue;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(String str) {
            this.rawValue = str;
        }

        public final String b() {
            return this.rawValue;
        }
    }

    public b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f87317a = eVar;
    }

    private final void i(String str, String str2, String str3) {
        e eVar = this.f87317a;
        Interaction$Component interaction$Component = Interaction$Component.FAMILY_REWARDS_USE_FAMILY_REWARD;
        v a10 = C16796C.a("id", str);
        v a11 = C16796C.a("app_location", "profile_menu");
        v a12 = C16796C.a("component_value", str2);
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        C17542s.i(lowerCase, "toLowerCase(...)");
        e.c.b(eVar, interaction$Component, (String) null, X.m(a10, a11, a12, C16796C.a("type", lowerCase)), (e.b) null, 10, (Object) null);
    }

    public void a(a.c cVar) {
        String str;
        C17542s.j(cVar, "reward");
        if (cVar instanceof a.c.C1608c) {
            str = "online";
        } else if (cVar instanceof a.c.C1607a) {
            str = "instore";
        } else if (cVar instanceof a.c.b) {
            str = "store_online";
        } else {
            throw new t();
        }
        i(cVar.getId(), str, cVar.m());
    }

    public void b(String str, int i10) {
        C17542s.j(str, "rewardId");
        e.c.c(this.f87317a, j.ACTION_FAIL.b(), X.m(C16796C.a("id", str), C16796C.a("app_location", "profile_menu"), C16796C.a("reason_code", Integer.valueOf(i10))), Interaction$Component.FAMILY_REWARD_CLAIM, (e.b) null, 8, (Object) null);
    }

    public void c(String str, f.c.a aVar, String str2) {
        String str3;
        C17542s.j(str, "id");
        C17542s.j(aVar, "type");
        C17542s.j(str2, "category");
        if (aVar instanceof f.c.a.C2247a) {
            str3 = "instore";
        } else if (aVar instanceof f.c.a.C2248c) {
            str3 = "online";
        } else if (aVar instanceof f.c.a.b) {
            str3 = "store_online";
        } else {
            throw new t();
        }
        i(str, str3, str2);
    }

    public void d(String str, String str2) {
        C17542s.j(str, "rewardId");
        C17542s.j(str2, "rewardCategory");
        e eVar = this.f87317a;
        Interaction$Component interaction$Component = Interaction$Component.FAMILY_REWARD_CLAIM;
        v a10 = C16796C.a("id", str);
        v a11 = C16796C.a("app_location", "profile_menu");
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        C17542s.i(lowerCase, "toLowerCase(...)");
        e.c.b(eVar, interaction$Component, (String) null, X.m(a10, a11, C16796C.a("type", lowerCase)), (e.b) null, 10, (Object) null);
    }

    public void e() {
        e.c.b(this.f87317a, Interaction$Component.FAMILY_REWARDS_CLOSE_FAMILY_REWARDS, (String) null, X.f(C16796C.a("app_location", "profile_menu")), (e.b) null, 10, (Object) null);
    }

    public void f(String str, boolean z10) {
        C17542s.j(str, "questionId");
        if (z10) {
            e.c.b(this.f87317a, Interaction$Component.FAMILY_REWARDS_FAQ_OPEN, (String) null, X.m(C16796C.a("id", str), C16796C.a("app_location", "profile_menu")), (e.b) null, 10, (Object) null);
        }
    }

    public void g(Iq.a aVar) {
        String str;
        C17542s.j(aVar, "reward");
        String id2 = aVar.getId();
        String m10 = aVar.m();
        if (aVar instanceof a.b) {
            str = a.AVAILABLE.b();
        } else if (aVar instanceof a.d) {
            str = a.UNAVAILABLE.b();
        } else if (aVar instanceof a.c) {
            str = a.CLAIMED.b();
        } else {
            throw new t();
        }
        e eVar = this.f87317a;
        Interaction$Component interaction$Component = Interaction$Component.FAMILY_REWARDS_VIEW_FAMILY_REWARD;
        v a10 = C16796C.a("id", id2);
        v a11 = C16796C.a("app_location", "profile_menu");
        v a12 = C16796C.a("component_value", str);
        String lowerCase = m10.toLowerCase(Locale.ROOT);
        C17542s.i(lowerCase, "toLowerCase(...)");
        e.c.b(eVar, interaction$Component, (String) null, X.m(a10, a11, a12, C16796C.a("type", lowerCase)), (e.b) null, 10, (Object) null);
    }

    public void h(int i10) {
        e.c.c(this.f87317a, j.ACTION_TAP.b(), X.f(C16796C.a("component_value", Integer.valueOf(i10 > 0 ? 1 : 0))), Interaction$Component.FAMILY_REWARDS_HISTORY_OPEN, (e.b) null, 8, (Object) null);
    }
}
