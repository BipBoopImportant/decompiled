package Ei;

import Hx.b;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15990f;
import Op.C10828d;
import Op.C10850o;
import Op.a1;
import Op.b1;
import YH.C16877v;
import ip.o;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import qx.C14957b;
import qx.c;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LHx/b;", "Lkp/d;", "currencyConfig", "", "isAddingToCart", "isOnlineSellable", "isAddToCartSupported", "familyAndRegularPriceSameSize", "LOp/a1;", "a", "(LHx/b;Lkp/d;ZLjava/lang/Boolean;ZZ)LOp/a1;", "purchasehistory-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ei.m  reason: case insensitive filesystem */
public final class C10692m {
    public static final a1 a(b bVar, C11522d dVar, boolean z10, Boolean bool, boolean z11, boolean z12) {
        C11522d dVar2 = dVar;
        Boolean bool2 = bool;
        C17542s.j(bVar, "<this>");
        C17542s.j(dVar2, "currencyConfig");
        a1.a aVar = (!z11 || !C17542s.e(bool2, Boolean.TRUE)) ? null : new a1.a(C15985a.b(new C10850o.a(z10, (C10850o.d) null, 2, (DefaultConstructorMarker) null)));
        b1.c cVar = new b1.c(C13026h.b(Oo.b.f84585a7, Integer.valueOf(bVar.e())));
        String b10 = bVar.b();
        String c10 = bVar.c();
        C15990f b11 = C15985a.b(new C10828d.m.b(new C10828d.C1720d(bVar.f(), (String) null)));
        String d10 = bVar.d();
        String a10 = bVar.a();
        if (a10 == null) {
            a10 = "";
        }
        String a11 = o.a(a10);
        Double g10 = bVar.g();
        return new a1(aVar, new C10828d(b10, c10, (C10828d.b) null, b11, new C10828d.h((C10828d.i) null, (C13023e) null, d10, a11, (C13023e) null, g10 != null ? new C10828d.l.f(new C10828d.l.e((c) null, C14957b.a(g10.doubleValue(), dVar2), C16877v.n(), (String) null)) : new C10828d.l.f(new C10828d.l.e((c) null, new c("-", (String) null), C16877v.n(), (String) null)), (C10828d.c) null, C15985a.a(), (String) null, 19, (DefaultConstructorMarker) null), C15985a.a(), C15985a.a(), C17542s.e(bool2, Boolean.TRUE)), dVar, cVar, false, true, z12);
    }
}
