package Ov;

import IC.C13023e;
import IC.C13026h;
import Pv.r;
import Pv.s;
import Rv.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yv.C9008m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"LOv/a;", "", "<init>", "()V", "", "orderNumber", "liteId", "LIC/e;", "body", "title", "LPv/r;", "c", "(Ljava/lang/String;Ljava/lang/String;LIC/e;LIC/e;)LPv/r;", "b", "LPv/r;", "()LPv/r;", "upgrade", "a", "takeATour", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f39315a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final r f39316b;

    /* renamed from: c  reason: collision with root package name */
    private static final r f39317c;

    static {
        s.b bVar = s.b.f39559a;
        f39316b = new r(bVar, C13026h.a(C9008m.f58130C), C13026h.a(C9008m.f58129B), "https://shop.static.ingka.ikea.com/contextual-cards/membership-upgrade.png", c.a.g.Upgrade, false, 32, (DefaultConstructorMarker) null);
        f39317c = new r(bVar, C13026h.a(C9008m.f58128A), C13026h.a(C9008m.f58181z), "https://shop.static.ingka.ikea.com/contextual-cards/membership-takeatour.png", c.a.g.TakeATour, false, 32, (DefaultConstructorMarker) null);
    }

    private a() {
    }

    public final r a() {
        return f39317c;
    }

    public final r b() {
        return f39316b;
    }

    public final r c(String str, String str2, C13023e eVar, C13023e eVar2) {
        C17542s.j(str, "orderNumber");
        C17542s.j(str2, "liteId");
        C17542s.j(eVar, "body");
        C17542s.j(eVar2, "title");
        return new r(s.a.f39557a, eVar2, eVar, "https://shop.static.ingka.ikea.com/contextual-cards/your-appointment.png", new c.a.d(str, str2), false, 32, (DefaultConstructorMarker) null);
    }
}
