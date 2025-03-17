package TI;

import YH.C16877v;
import cJ.C17066c;
import kotlin.jvm.internal.C17542s;

public final class p {
    private static final boolean a(r rVar) {
        C17066c f10;
        C16494B b10 = (C16494B) C16877v.d1(rVar.j());
        j jVar = null;
        l type = b10 != null ? b10.getType() : null;
        if (type instanceof j) {
            jVar = (j) type;
        }
        if (jVar == null) {
            return false;
        }
        i e10 = jVar.e();
        return (e10 instanceof C16503g) && (f10 = ((C16503g) e10).f()) != null && C17542s.e(f10.a(), "java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r0.equals("toString") != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0.equals("hashCode") == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean b(TI.r r3) {
        /*
            cJ.f r0 = r3.getName()
            java.lang.String r0 = r0.b()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L_0x0033
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L_0x0025
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003b
            goto L_0x0044
        L_0x0025:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002e
            goto L_0x0044
        L_0x002e:
            boolean r3 = a(r3)
            goto L_0x0045
        L_0x0033:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0044
        L_0x003b:
            java.util.List r3 = r3.j()
            boolean r3 = r3.isEmpty()
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: TI.p.b(TI.r):boolean");
    }

    public static final boolean c(q qVar) {
        C17542s.j(qVar, "<this>");
        return qVar.Q().L() && (qVar instanceof r) && b((r) qVar);
    }
}
