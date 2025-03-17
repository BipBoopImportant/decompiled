package Yf;

import IC.C13023e;
import IC.C13026h;
import Iq.a;
import KJ.C15985a;
import KJ.C15987c;
import Ln.c;
import Of.C9227y;
import Of.I1;
import YH.C16877v;
import dg.C9625a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\b*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\f\u001a\u00020\b*\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\n\u001a'\u0010\u000f\u001a\u00020\u000e*\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ldg/a$a;", "", "cartUpdatingRewardWithCode", "LOf/y;", "d", "(Ldg/a$a;Ljava/lang/String;)LOf/y;", "LIq/a$c$d;", "discountCode", "", "b", "(LIq/a$c$d;Ljava/lang/String;)Z", "updatingRewardWithCode", "c", "appliedDiscountCode", "LIC/e;", "a", "(LIq/a$c$d;Ljava/lang/String;Ljava/lang/String;)LIC/e;", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    private static final C13023e a(a.c.d dVar, String str, String str2) {
        boolean b10 = b(dVar, str);
        return b10 ? C13026h.a(Oo.b.f84647g3) : (!c(dVar, str2) || b10) ? C13026h.a(Oo.b.f84560Y2) : C13026h.a(Oo.b.f84570Z2);
    }

    private static final boolean b(a.c.d dVar, String str) {
        return C17542s.e(str, dVar.c());
    }

    private static final boolean c(a.c.d dVar, String str) {
        return C17542s.e(str, dVar.c());
    }

    public static final C9227y d(C9625a.C1240a aVar, String str) {
        boolean z10;
        String a10;
        C15987c<a.c.d> b10;
        C17542s.j(aVar, "<this>");
        C15987c<a.c.d> b11 = aVar.b();
        ArrayList arrayList = new ArrayList(C16877v.y(b11, 10));
        Iterator<T> it = b11.iterator();
        while (true) {
            z10 = true;
            if (!it.hasNext()) {
                break;
            }
            a.c.d dVar = (a.c.d) it.next();
            c a11 = aVar.a();
            String str2 = null;
            boolean b12 = b(dVar, a11 != null ? a11.a() : null);
            boolean c10 = c(dVar, str);
            c a12 = aVar.a();
            boolean z11 = ((a12 != null ? a12.a() : null) == null || b12) && !c10;
            c a13 = aVar.a();
            if (a13 != null) {
                str2 = a13.a();
            }
            arrayList.add(new I1.a(dVar, z11, a(dVar, str2, str), c10, b12));
        }
        C15987c h10 = C15985a.h(arrayList);
        c a14 = aVar.a();
        c a15 = aVar.a();
        if (a15 != null && (a10 = a15.a()) != null && ((b10 = aVar.b()) == null || !b10.isEmpty())) {
            Iterator<T> it2 = b10.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (C17542s.e(((a.c.d) it2.next()).c(), a10)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = false;
        return new C9227y(h10, a14, str, z10, false, 16, (DefaultConstructorMarker) null);
    }
}
