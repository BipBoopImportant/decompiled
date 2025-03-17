package q2;

import java.util.ArrayList;
import p2.d;
import p2.e;
import p2.h;
import p2.j;

public class i {
    public static o a(e eVar, int i10, ArrayList<o> arrayList, o oVar) {
        int w12;
        int i11 = i10 == 0 ? eVar.f27421I0 : eVar.f27423J0;
        int i12 = 0;
        if (i11 != -1 && (oVar == null || i11 != oVar.c())) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i13);
                if (oVar2.c() == i11) {
                    if (oVar != null) {
                        oVar.g(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i13++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof j) && (w12 = ((j) eVar).w1(i10)) != -1) {
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i14);
                    if (oVar3.c() == w12) {
                        oVar = oVar3;
                        break;
                    }
                    i14++;
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                d v12 = hVar.v1();
                if (hVar.w1() == 0) {
                    i12 = 1;
                }
                v12.c(i12, arrayList, oVar);
            }
            if (i10 == 0) {
                eVar.f27421I0 = oVar.c();
                eVar.f27428O.c(i10, arrayList, oVar);
                eVar.f27430Q.c(i10, arrayList, oVar);
            } else {
                eVar.f27423J0 = oVar.c();
                eVar.f27429P.c(i10, arrayList, oVar);
                eVar.f27432S.c(i10, arrayList, oVar);
                eVar.f27431R.c(i10, arrayList, oVar);
            }
            eVar.f27435V.c(i10, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = arrayList.get(i11);
            if (i10 == oVar.c()) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:175:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0392 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(p2.f r16, q2.b.C0446b r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.w1()
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L_0x000c:
            if (r4 >= r2) goto L_0x0033
            java.lang.Object r5 = r1.get(r4)
            p2.e r5 = (p2.e) r5
            p2.e$b r6 = r16.A()
            p2.e$b r7 = r16.V()
            p2.e$b r8 = r5.A()
            p2.e$b r9 = r5.V()
            boolean r6 = d(r6, r7, r8, r9)
            if (r6 != 0) goto L_0x002b
            return r3
        L_0x002b:
            boolean r5 = r5 instanceof p2.g
            if (r5 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0033:
            r5 = r3
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x003a:
            if (r5 >= r2) goto L_0x0113
            java.lang.Object r13 = r1.get(r5)
            p2.e r13 = (p2.e) r13
            p2.e$b r14 = r16.A()
            p2.e$b r15 = r16.V()
            p2.e$b r4 = r13.A()
            p2.e$b r12 = r13.V()
            boolean r4 = d(r14, r15, r4, r12)
            if (r4 != 0) goto L_0x0062
            q2.b$a r4 = r0.f27522p1
            int r12 = q2.b.a.f27760k
            r14 = r17
            p2.f.Y1(r3, r13, r14, r4, r12)
            goto L_0x0064
        L_0x0062:
            r14 = r17
        L_0x0064:
            boolean r4 = r13 instanceof p2.h
            if (r4 == 0) goto L_0x008c
            r12 = r13
            p2.h r12 = (p2.h) r12
            int r15 = r12.w1()
            if (r15 != 0) goto L_0x007b
            if (r8 != 0) goto L_0x0078
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0078:
            r8.add(r12)
        L_0x007b:
            int r15 = r12.w1()
            r3 = 1
            if (r15 != r3) goto L_0x008c
            if (r6 != 0) goto L_0x0089
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0089:
            r6.add(r12)
        L_0x008c:
            boolean r3 = r13 instanceof p2.j
            if (r3 == 0) goto L_0x00d0
            boolean r3 = r13 instanceof p2.C5756a
            if (r3 == 0) goto L_0x00b9
            r3 = r13
            p2.a r3 = (p2.C5756a) r3
            int r12 = r3.B1()
            if (r12 != 0) goto L_0x00a7
            if (r7 != 0) goto L_0x00a4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00a4:
            r7.add(r3)
        L_0x00a7:
            int r12 = r3.B1()
            r15 = 1
            if (r12 != r15) goto L_0x00d0
            if (r9 != 0) goto L_0x00b5
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00b5:
            r9.add(r3)
            goto L_0x00d0
        L_0x00b9:
            r3 = r13
            p2.j r3 = (p2.j) r3
            if (r7 != 0) goto L_0x00c3
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00c3:
            r7.add(r3)
            if (r9 != 0) goto L_0x00cd
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00cd:
            r9.add(r3)
        L_0x00d0:
            p2.d r3 = r13.f27428O
            p2.d r3 = r3.f27399f
            if (r3 != 0) goto L_0x00ec
            p2.d r3 = r13.f27430Q
            p2.d r3 = r3.f27399f
            if (r3 != 0) goto L_0x00ec
            if (r4 != 0) goto L_0x00ec
            boolean r3 = r13 instanceof p2.C5756a
            if (r3 != 0) goto L_0x00ec
            if (r10 != 0) goto L_0x00e9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x00e9:
            r10.add(r13)
        L_0x00ec:
            p2.d r3 = r13.f27429P
            p2.d r3 = r3.f27399f
            if (r3 != 0) goto L_0x010e
            p2.d r3 = r13.f27431R
            p2.d r3 = r3.f27399f
            if (r3 != 0) goto L_0x010e
            p2.d r3 = r13.f27432S
            p2.d r3 = r3.f27399f
            if (r3 != 0) goto L_0x010e
            if (r4 != 0) goto L_0x010e
            boolean r3 = r13 instanceof p2.C5756a
            if (r3 != 0) goto L_0x010e
            if (r11 != 0) goto L_0x010b
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x010b:
            r11.add(r13)
        L_0x010e:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x003a
        L_0x0113:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x0130
            java.util.Iterator r4 = r6.iterator()
        L_0x011e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0130
            java.lang.Object r5 = r4.next()
            p2.h r5 = (p2.h) r5
            r6 = 0
            r12 = 0
            a(r5, r6, r3, r12)
            goto L_0x011e
        L_0x0130:
            r6 = 0
            r12 = 0
            if (r7 == 0) goto L_0x0151
            java.util.Iterator r4 = r7.iterator()
        L_0x0138:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0151
            java.lang.Object r5 = r4.next()
            p2.j r5 = (p2.j) r5
            q2.o r7 = a(r5, r6, r3, r12)
            r5.v1(r3, r6, r7)
            r7.b(r3)
            r6 = 0
            r12 = 0
            goto L_0x0138
        L_0x0151:
            p2.d$a r4 = p2.d.a.LEFT
            p2.d r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0179
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0165:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0179
            java.lang.Object r5 = r4.next()
            p2.d r5 = (p2.d) r5
            p2.e r5 = r5.f27397d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x0165
        L_0x0179:
            p2.d$a r4 = p2.d.a.RIGHT
            p2.d r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x01a1
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x018d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01a1
            java.lang.Object r5 = r4.next()
            p2.d r5 = (p2.d) r5
            p2.e r5 = r5.f27397d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x018d
        L_0x01a1:
            p2.d$a r4 = p2.d.a.CENTER
            p2.d r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x01c9
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x01b5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01c9
            java.lang.Object r5 = r4.next()
            p2.d r5 = (p2.d) r5
            p2.e r5 = r5.f27397d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x01b5
        L_0x01c9:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01e1
            java.util.Iterator r4 = r10.iterator()
        L_0x01d1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01e1
            java.lang.Object r5 = r4.next()
            p2.e r5 = (p2.e) r5
            a(r5, r6, r3, r7)
            goto L_0x01d1
        L_0x01e1:
            if (r8 == 0) goto L_0x01f8
            java.util.Iterator r4 = r8.iterator()
        L_0x01e7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01f8
            java.lang.Object r5 = r4.next()
            p2.h r5 = (p2.h) r5
            r6 = 1
            a(r5, r6, r3, r7)
            goto L_0x01e7
        L_0x01f8:
            r6 = 1
            if (r9 == 0) goto L_0x0218
            java.util.Iterator r4 = r9.iterator()
        L_0x01ff:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0218
            java.lang.Object r5 = r4.next()
            p2.j r5 = (p2.j) r5
            q2.o r8 = a(r5, r6, r3, r7)
            r5.v1(r3, r6, r8)
            r8.b(r3)
            r6 = 1
            r7 = 0
            goto L_0x01ff
        L_0x0218:
            p2.d$a r4 = p2.d.a.TOP
            p2.d r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0240
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x022c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0240
            java.lang.Object r5 = r4.next()
            p2.d r5 = (p2.d) r5
            p2.e r5 = r5.f27397d
            r6 = 0
            r7 = 1
            a(r5, r7, r3, r6)
            goto L_0x022c
        L_0x0240:
            p2.d$a r4 = p2.d.a.BASELINE
            p2.d r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0268
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0254:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0268
            java.lang.Object r5 = r4.next()
            p2.d r5 = (p2.d) r5
            p2.e r5 = r5.f27397d
            r6 = 0
            r7 = 1
            a(r5, r7, r3, r6)
            goto L_0x0254
        L_0x0268:
            p2.d$a r4 = p2.d.a.BOTTOM
            p2.d r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0290
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x027c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0290
            java.lang.Object r5 = r4.next()
            p2.d r5 = (p2.d) r5
            p2.e r5 = r5.f27397d
            r6 = 0
            r7 = 1
            a(r5, r7, r3, r6)
            goto L_0x027c
        L_0x0290:
            p2.d$a r4 = p2.d.a.CENTER
            p2.d r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x02b8
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x02a4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02b8
            java.lang.Object r5 = r4.next()
            p2.d r5 = (p2.d) r5
            p2.e r5 = r5.f27397d
            r6 = 1
            r12 = 0
            a(r5, r6, r3, r12)
            goto L_0x02a4
        L_0x02b8:
            r6 = 1
            r12 = 0
            if (r11 == 0) goto L_0x02d0
            java.util.Iterator r4 = r11.iterator()
        L_0x02c0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02d0
            java.lang.Object r5 = r4.next()
            p2.e r5 = (p2.e) r5
            a(r5, r6, r3, r12)
            goto L_0x02c0
        L_0x02d0:
            r4 = 0
        L_0x02d1:
            if (r4 >= r2) goto L_0x02fd
            java.lang.Object r5 = r1.get(r4)
            p2.e r5 = (p2.e) r5
            boolean r6 = r5.u0()
            if (r6 == 0) goto L_0x02fa
            int r6 = r5.f27421I0
            q2.o r6 = b(r3, r6)
            int r5 = r5.f27423J0
            q2.o r5 = b(r3, r5)
            if (r6 == 0) goto L_0x02fa
            if (r5 == 0) goto L_0x02fa
            r7 = 0
            r6.g(r7, r5)
            r7 = 2
            r5.i(r7)
            r3.remove(r6)
        L_0x02fa:
            int r4 = r4 + 1
            goto L_0x02d1
        L_0x02fd:
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L_0x0306
            r1 = 0
            return r1
        L_0x0306:
            p2.e$b r1 = r16.A()
            p2.e$b r2 = p2.e.b.WRAP_CONTENT
            if (r1 != r2) goto L_0x0348
            java.util.Iterator r1 = r3.iterator()
            r2 = r12
            r6 = 0
        L_0x0314:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0339
            java.lang.Object r4 = r1.next()
            q2.o r4 = (q2.o) r4
            int r5 = r4.d()
            r7 = 1
            if (r5 != r7) goto L_0x0328
            goto L_0x0314
        L_0x0328:
            r5 = 0
            r4.h(r5)
            h2.d r7 = r16.Q1()
            int r7 = r4.f(r7, r5)
            if (r7 <= r6) goto L_0x0314
            r2 = r4
            r6 = r7
            goto L_0x0314
        L_0x0339:
            if (r2 == 0) goto L_0x0348
            p2.e$b r1 = p2.e.b.FIXED
            r0.T0(r1)
            r0.o1(r6)
            r1 = 1
            r2.h(r1)
            goto L_0x0349
        L_0x0348:
            r2 = r12
        L_0x0349:
            p2.e$b r1 = r16.V()
            p2.e$b r4 = p2.e.b.WRAP_CONTENT
            if (r1 != r4) goto L_0x038d
            java.util.Iterator r1 = r3.iterator()
            r3 = r12
            r6 = 0
        L_0x0357:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x037c
            java.lang.Object r4 = r1.next()
            q2.o r4 = (q2.o) r4
            int r5 = r4.d()
            if (r5 != 0) goto L_0x036a
            goto L_0x0357
        L_0x036a:
            r5 = 0
            r4.h(r5)
            h2.d r7 = r16.Q1()
            r8 = 1
            int r7 = r4.f(r7, r8)
            if (r7 <= r6) goto L_0x0357
            r3 = r4
            r6 = r7
            goto L_0x0357
        L_0x037c:
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L_0x038f
            p2.e$b r1 = p2.e.b.FIXED
            r0.k1(r1)
            r0.P0(r6)
            r3.h(r8)
            r4 = r3
            goto L_0x0390
        L_0x038d:
            r5 = 0
            r8 = 1
        L_0x038f:
            r4 = r12
        L_0x0390:
            if (r2 != 0) goto L_0x0397
            if (r4 == 0) goto L_0x0395
            goto L_0x0397
        L_0x0395:
            r3 = r5
            goto L_0x0398
        L_0x0397:
            r3 = r8
        L_0x0398:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.i.c(p2.f, q2.b$b):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = p2.e.b.WRAP_CONTENT;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(p2.e.b r5, p2.e.b r6, p2.e.b r7, p2.e.b r8) {
        /*
            p2.e$b r0 = p2.e.b.FIXED
            r1 = 1
            r2 = 0
            if (r7 == r0) goto L_0x0013
            p2.e$b r3 = p2.e.b.WRAP_CONTENT
            if (r7 == r3) goto L_0x0013
            p2.e$b r4 = p2.e.b.MATCH_PARENT
            if (r7 != r4) goto L_0x0011
            if (r5 == r3) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = r2
            goto L_0x0014
        L_0x0013:
            r5 = r1
        L_0x0014:
            if (r8 == r0) goto L_0x0023
            p2.e$b r7 = p2.e.b.WRAP_CONTENT
            if (r8 == r7) goto L_0x0023
            p2.e$b r0 = p2.e.b.MATCH_PARENT
            if (r8 != r0) goto L_0x0021
            if (r6 == r7) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r6 = r2
            goto L_0x0024
        L_0x0023:
            r6 = r1
        L_0x0024:
            if (r5 != 0) goto L_0x002a
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r2
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.i.d(p2.e$b, p2.e$b, p2.e$b, p2.e$b):boolean");
    }
}
