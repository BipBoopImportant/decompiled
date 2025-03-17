package ig;

import IC.C13023e;
import Il.a;
import Nn.C10803f;
import Nn.C10808k;
import Nn.C10812o;
import Nn.K;
import Nn.x;
import Qf.a;
import YH.C16877v;
import ep.C11256b;
import hg.s;
import ig.i;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qx.C14956a;
import rv.C11849b;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010!\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0013H\u0001¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010+¨\u0006,"}, d2 = {"Lig/j;", "Lig/i;", "LIl/a;", "appConfigApi", "Lep/b;", "dateFormatter", "LNn/x;", "checkoutRepository", "<init>", "(LIl/a;Lep/b;LNn/x;)V", "", "date", "Ljava/time/ZoneId;", "zoneId", "", "pattern", "d", "(JLjava/time/ZoneId;Ljava/lang/String;)Ljava/lang/String;", "checkoutId", "", "showPricesExclTax", "Lig/i$a;", "a", "(Ljava/lang/String;Z)Lig/i$a;", "", "LNn/o;", "services", "LQf/a$c;", "c", "(Ljava/util/List;Z)LQf/a$c;", "LNn/k;", "collectServices", "selectedId", "b", "(Ljava/util/List;ZLjava/lang/String;)LQf/a$c;", "", "price", "hasMultiplePrices", "LQf/a$c$a;", "f", "(DZ)LQf/a$c$a;", "LIl/a;", "Lep/b;", "LNn/x;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    private final a f74433a;

    /* renamed from: b  reason: collision with root package name */
    private final C11256b f74434b;

    /* renamed from: c  reason: collision with root package name */
    private final x f74435c;

    public j(a aVar, C11256b bVar, x xVar) {
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(bVar, "dateFormatter");
        C17542s.j(xVar, "checkoutRepository");
        this.f74433a = aVar;
        this.f74434b = bVar;
        this.f74435c = xVar;
    }

    private final String d(long j10, ZoneId zoneId, String str) {
        LocalDate localDate = Instant.ofEpochMilli(j10).atZone(zoneId).toLocalDate();
        C11256b bVar = this.f74434b;
        C17542s.g(localDate);
        return bVar.e(localDate, str);
    }

    static /* synthetic */ String e(j jVar, long j10, ZoneId zoneId, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        if ((i10 & 4) != 0) {
            str = "E, MMM d";
        }
        return jVar.d(j10, zoneId, str);
    }

    public i.a a(String str, boolean z10) {
        C17542s.j(str, "checkoutId");
        C10803f s10 = this.f74435c.s(str);
        String str2 = null;
        if (s10 == null) {
            return new i.a((a.c) null, (a.c) null, 3, (DefaultConstructorMarker) null);
        }
        a.c c10 = c(s10.f(), z10);
        List<C10808k> d10 = s10.d();
        K i10 = s10.i();
        if (i10 != null) {
            str2 = i10.f();
        }
        return new i.a(c10, b(d10, z10, str2));
    }

    public final a.c b(List<? extends C10808k> list, boolean z10, String str) {
        String str2;
        C17542s.j(list, "collectServices");
        ArrayList arrayList = new ArrayList();
        for (C10808k a10 : list) {
            C16877v.E(arrayList, a10.a());
        }
        C10812o a11 = s.a(arrayList, str);
        if (a11 == null) {
            a11 = s.c(arrayList);
        }
        a.c.C1072a aVar = null;
        if (a11 == null) {
            return null;
        }
        boolean f10 = s.f(arrayList);
        C10812o b10 = s.b(arrayList);
        if (b10 == null) {
            b10 = a11;
        }
        Long d10 = a11.d();
        if (d10 != null) {
            str2 = e(this, d10.longValue(), (ZoneId) null, (String) null, 6, (Object) null);
        } else {
            str2 = null;
        }
        Double d11 = s.d(b10, z10);
        if (d11 != null) {
            aVar = f(d11.doubleValue(), f10);
        }
        return new a.c(str2, aVar);
    }

    public final a.c c(List<? extends C10812o> list, boolean z10) {
        String str;
        C17542s.j(list, "services");
        boolean f10 = s.f(list);
        C10812o b10 = s.b(list);
        a.c.C1072a aVar = null;
        if (b10 == null) {
            return null;
        }
        Long d10 = b10.d();
        if (d10 != null) {
            str = e(this, d10.longValue(), (ZoneId) null, (String) null, 6, (Object) null);
        } else {
            str = null;
        }
        Double d11 = s.d(b10, z10);
        if (d11 != null) {
            aVar = f(d11.doubleValue(), f10);
        }
        return new a.c(str, aVar);
    }

    public final a.c.C1072a f(double d10, boolean z10) {
        if (!z10) {
            return d10 == 0.0d ? new a.c.C1072a.C1074c(new C13023e.d(C11849b.f102312k0, (List) null, 2, (DefaultConstructorMarker) null)) : new a.c.C1072a.b(d10, this.f74433a.s());
        }
        return new a.c.C1072a.C1073a(C14956a.f130484a.b(d10, this.f74433a.s()), C11849b.f102171C0);
    }
}
