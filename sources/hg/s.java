package hg;

import Nn.C10811n;
import Nn.C10812o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\u001a\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\r\u0010\u0003\u001a\u0019\u0010\u000e\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "LNn/o;", "b", "(Ljava/util/List;)LNn/o;", "", "id", "a", "(Ljava/util/List;Ljava/lang/String;)LNn/o;", "", "exclTax", "", "d", "(LNn/o;Z)Ljava/lang/Double;", "c", "f", "(Ljava/util/List;)Z", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s {
    public static final C10812o a(List<? extends C10812o> list, String str) {
        Object obj;
        C17542s.j(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((C10812o) obj).h(), str)) {
                break;
            }
        }
        return (C10812o) obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: Nn.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Nn.C10812o b(java.util.List<? extends Nn.C10812o> r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0010:
            boolean r1 = r12.hasNext()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x002e
            java.lang.Object r1 = r12.next()
            r5 = r1
            Nn.o r5 = (Nn.C10812o) r5
            java.lang.Double r2 = e(r5, r3, r2, r4)
            if (r2 == 0) goto L_0x0010
            boolean r2 = r5 instanceof Nn.C10812o.a
            if (r2 == 0) goto L_0x0010
            r0.add(r1)
            goto L_0x0010
        L_0x002e:
            java.util.Iterator r12 = r0.iterator()
            boolean r0 = r12.hasNext()
            if (r0 != 0) goto L_0x0039
            goto L_0x007b
        L_0x0039:
            java.lang.Object r0 = r12.next()
            boolean r1 = r12.hasNext()
            if (r1 != 0) goto L_0x0045
        L_0x0043:
            r4 = r0
            goto L_0x007b
        L_0x0045:
            r1 = r0
            Nn.o r1 = (Nn.C10812o) r1
            java.lang.Double r1 = e(r1, r3, r2, r4)
            r5 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            if (r1 == 0) goto L_0x0058
            double r7 = r1.doubleValue()
            goto L_0x0059
        L_0x0058:
            r7 = r5
        L_0x0059:
            java.lang.Object r1 = r12.next()
            r9 = r1
            Nn.o r9 = (Nn.C10812o) r9
            java.lang.Double r9 = e(r9, r3, r2, r4)
            if (r9 == 0) goto L_0x006b
            double r9 = r9.doubleValue()
            goto L_0x006c
        L_0x006b:
            r9 = r5
        L_0x006c:
            int r11 = java.lang.Double.compare(r7, r9)
            if (r11 <= 0) goto L_0x0074
            r0 = r1
            r7 = r9
        L_0x0074:
            boolean r1 = r12.hasNext()
            if (r1 != 0) goto L_0x0059
            goto L_0x0043
        L_0x007b:
            Nn.o r4 = (Nn.C10812o) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.s.b(java.util.List):Nn.o");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: Nn.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Nn.C10812o c(java.util.List<? extends Nn.C10812o> r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0010:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r9.next()
            r2 = r1
            Nn.o r2 = (Nn.C10812o) r2
            java.lang.Long r2 = r2.d()
            if (r2 == 0) goto L_0x0010
            long r2 = r2.longValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0010
            r0.add(r1)
            goto L_0x0010
        L_0x0031:
            java.util.Iterator r9 = r0.iterator()
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L_0x003d
            r9 = 0
            goto L_0x007d
        L_0x003d:
            java.lang.Object r0 = r9.next()
            boolean r1 = r9.hasNext()
            if (r1 != 0) goto L_0x0049
        L_0x0047:
            r9 = r0
            goto L_0x007d
        L_0x0049:
            r1 = r0
            Nn.o r1 = (Nn.C10812o) r1
            java.lang.Long r1 = r1.d()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L_0x005c
            long r4 = r1.longValue()
            goto L_0x005d
        L_0x005c:
            r4 = r2
        L_0x005d:
            java.lang.Object r1 = r9.next()
            r6 = r1
            Nn.o r6 = (Nn.C10812o) r6
            java.lang.Long r6 = r6.d()
            if (r6 == 0) goto L_0x006f
            long r6 = r6.longValue()
            goto L_0x0070
        L_0x006f:
            r6 = r2
        L_0x0070:
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0076
            r0 = r1
            r4 = r6
        L_0x0076:
            boolean r1 = r9.hasNext()
            if (r1 != 0) goto L_0x005d
            goto L_0x0047
        L_0x007d:
            Nn.o r9 = (Nn.C10812o) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.s.c(java.util.List):Nn.o");
    }

    public static final Double d(C10812o oVar, boolean z10) {
        C17542s.j(oVar, "<this>");
        Double b10 = oVar.l().b();
        if (b10 != null) {
            return b10;
        }
        C10811n g10 = oVar.g();
        if (g10 != null) {
            return g10.c(Boolean.valueOf(!z10));
        }
        return null;
    }

    public static /* synthetic */ Double e(C10812o oVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return d(oVar, z10);
    }

    public static final boolean f(List<? extends C10812o> list) {
        C17542s.j(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            Double e10 = e((C10812o) next, false, 1, (Object) null);
            Object obj = linkedHashMap.get(e10);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(e10, obj);
            }
            ((List) obj).add(next);
        }
        return linkedHashMap.size() > 1;
    }
}
