package ho;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "Lho/b;", "", "b", "(Ljava/util/List;)Z", "isInclTax", "", "a", "(Ljava/util/List;Z)Ljava/lang/Double;", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Number} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Double a(java.util.List<? extends ho.b> r6, boolean r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0010:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x002a
            java.lang.Object r1 = r6.next()
            ho.b r1 = (ho.b) r1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            java.lang.Double r1 = r1.e(r2)
            if (r1 == 0) goto L_0x0010
            r0.add(r1)
            goto L_0x0010
        L_0x002a:
            java.util.Iterator r6 = r0.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L_0x0036
            r6 = 0
            goto L_0x0063
        L_0x0036:
            java.lang.Object r7 = r6.next()
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L_0x0042
        L_0x0040:
            r6 = r7
            goto L_0x0063
        L_0x0042:
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L_0x0049:
            java.lang.Object r2 = r6.next()
            r3 = r2
            java.lang.Number r3 = (java.lang.Number) r3
            double r3 = r3.doubleValue()
            int r5 = java.lang.Double.compare(r0, r3)
            if (r5 <= 0) goto L_0x005c
            r7 = r2
            r0 = r3
        L_0x005c:
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L_0x0049
            goto L_0x0040
        L_0x0063:
            java.lang.Double r6 = (java.lang.Double) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ho.g.a(java.util.List, boolean):java.lang.Double");
    }

    public static final boolean b(List<? extends b> list) {
        C17542s.j(list, "<this>");
        Iterable<b> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (b h10 : iterable) {
            if (!h10.h()) {
                return false;
            }
        }
        return true;
    }
}
