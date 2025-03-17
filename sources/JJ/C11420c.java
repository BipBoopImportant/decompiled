package jj;

import YH.C16877v;
import ip.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15015h;
import rz.C15016i;
import rz.C15031y;
import rz.I;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrz/I;", "", "b", "(Lrz/I;)Z", "a", "", "Lrz/h;", "c", "(Lrz/I;)Ljava/util/List;", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jj.c  reason: case insensitive filesystem */
public final class C11420c {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (r1 != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r6.k().j() != false) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0093 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(rz.I r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            rz.y r0 = rz.C15031y.CASH_AND_CARRY
            rz.y r1 = rz.C15031y.FULL_SERVE
            rz.y r2 = rz.C15031y.SELF_SERVE
            rz.y r3 = rz.C15031y.COMBINATION
            rz.y[] r0 = new rz.C15031y[]{r0, r1, r2, r3}
            java.util.List r0 = YH.C16877v.q(r0)
            rz.y r1 = r6.p()
            r2 = 1
            r4 = 0
            if (r1 != r3) goto L_0x0074
            rz.i r1 = r6.d()
            boolean r3 = r1 instanceof rz.C15016i.a
            if (r3 == 0) goto L_0x0028
            rz.i$a r1 = (rz.C15016i.a) r1
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            if (r1 == 0) goto L_0x0036
            java.util.List r3 = r1.a()
            if (r3 == 0) goto L_0x0036
            boolean r3 = r3.isEmpty()
            goto L_0x0037
        L_0x0036:
            r3 = r4
        L_0x0037:
            if (r1 == 0) goto L_0x006b
            java.util.List r1 = r1.b()
            if (r1 == 0) goto L_0x006b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r5 = r1 instanceof java.util.Collection
            if (r5 == 0) goto L_0x004f
            r5 = r1
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x004f
            goto L_0x006b
        L_0x004f:
            java.util.Iterator r1 = r1.iterator()
        L_0x0053:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x006b
            java.lang.Object r5 = r1.next()
            rz.h r5 = (rz.C15015h) r5
            rz.w r5 = r5.e()
            boolean r5 = r5.h()
            if (r5 == 0) goto L_0x0053
            r1 = r2
            goto L_0x006c
        L_0x006b:
            r1 = r4
        L_0x006c:
            if (r3 == 0) goto L_0x0072
            if (r1 == 0) goto L_0x0072
        L_0x0070:
            r1 = r2
            goto L_0x0089
        L_0x0072:
            r1 = r4
            goto L_0x0089
        L_0x0074:
            rz.U r1 = r6.m()
            int r1 = r1.a()
            if (r1 > 0) goto L_0x0072
            com.ingka.ikea.core.model.product.ProductItem r1 = r6.k()
            boolean r1 = r1.j()
            if (r1 == 0) goto L_0x0072
            goto L_0x0070
        L_0x0089:
            rz.y r6 = r6.p()
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L_0x0096
            if (r1 == 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r2 = r4
        L_0x0097:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.C11420c.a(rz.I):boolean");
    }

    public static final boolean b(I i10) {
        C17542s.j(i10, "<this>");
        return C16877v.q(C15031y.CASH_AND_CARRY, C15031y.FULL_SERVE, C15031y.SELF_SERVE).contains(i10.p()) && (i10.m().a() <= 0);
    }

    public static final List<C15015h> c(I i10) {
        C15016i d10 = i10 != null ? i10.d() : null;
        if (!(d10 instanceof C15016i.a)) {
            return C16877v.n();
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : ((C15016i.a) d10).a()) {
            C15015h hVar = (C15015h) next;
            Integer g10 = hVar.g();
            Integer d11 = hVar.d();
            if (i.b(g10, d11 != null ? d11.intValue() : 0)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
