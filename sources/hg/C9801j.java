package hg;

import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15990f;
import Ln.d;
import Oo.b;
import Op.C10828d;
import Op.C10850o;
import Op.a1;
import Op.b1;
import YH.C16877v;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import qx.C14957b;
import qx.c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LLn/d;", "Lkp/d;", "currencyConfig", "", "showNotifyMeButton", "ongoingNotification", "familyAndRegularPriceSameSize", "", "requestedQuantity", "LOp/a1;", "a", "(LLn/d;Lkp/d;ZZZI)LOp/a1;", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: hg.j  reason: case insensitive filesystem */
public final class C9801j {
    public static final a1 a(d dVar, C11522d dVar2, boolean z10, boolean z11, boolean z12, int i10) {
        C11522d dVar3 = dVar2;
        C17542s.j(dVar, "<this>");
        C17542s.j(dVar3, "currencyConfig");
        String j10 = dVar.j();
        String k10 = dVar.k();
        String i11 = dVar.i().i();
        String h10 = dVar.i().h();
        String g10 = dVar.i().g();
        String e10 = dVar.i().e();
        double e11 = dVar.e();
        if (g10 != null) {
            h10 = String.format("%s, %s", Arrays.copyOf(new Object[]{h10, g10}, 2));
            C17542s.i(h10, "format(...)");
        }
        String str = h10;
        List c10 = C16877v.c();
        c10.add(C10850o.c.f85245a);
        if (z10) {
            boolean z13 = z11;
            c10.add(new C10850o.g(z13, C10850o.g.a.BUTTON, C10850o.d.Start));
        }
        a1.a aVar = new a1.a(C15985a.h(C16877v.a(c10)));
        C15990f b10 = C15985a.b(new C10828d.m.b(new C10828d.C1720d(e10, (String) null)));
        C15990f fVar = b10;
        C10828d.h hVar = new C10828d.h((C10828d.i) null, (C13023e) null, i11, str, (C13023e) null, new C10828d.l.f(new C10828d.l.e((c) null, C14957b.a(e11, dVar3), C16877v.n(), (String) null)), (C10828d.c) null, C15985a.a(), (String) null, 18, (DefaultConstructorMarker) null);
        return new a1(aVar, new C10828d(j10, k10, (C10828d.b) null, fVar, hVar, C15985a.a(), C15985a.a(), false), dVar2, new b1.c(C13026h.b(b.f84585a7, Integer.valueOf(i10))), true, true, z12);
    }
}
