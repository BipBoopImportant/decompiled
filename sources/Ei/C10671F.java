package Ei;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a7\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004*\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "", "", "LHx/h;", "", "a", "(Ljava/util/Map;)Ljava/util/Map;", "purchasehistory-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ei.F  reason: case insensitive filesystem */
public final class C10671F {
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x004d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map<java.lang.String, java.util.List<Hx.h>> a(java.util.Map<java.lang.String, java.util.List<Hx.h>> r18) {
        /*
            r1 = r18
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.util.Set r0 = r18.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000f:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = YH.C16877v.y0(r2)
            Hx.h r2 = (Hx.h) r2
            if (r2 == 0) goto L_0x002f
            java.lang.String r2 = r2.b()
            goto L_0x0030
        L_0x002f:
            r2 = r3
        L_0x0030:
            if (r2 == 0) goto L_0x000f
            goto L_0x0034
        L_0x0033:
            r2 = r3
        L_0x0034:
            if (r2 != 0) goto L_0x0037
            return r1
        L_0x0037:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.util.Locale r0 = java.util.Locale.US
            r4.<init>(r2, r0)
            java.util.Set r0 = r18.keySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r5 = r0.iterator()
        L_0x004d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0135
            java.lang.Object r0 = r5.next()
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.util.Date r0 = r4.parse(r6)     // Catch:{ ParseException -> 0x006a }
            if (r0 == 0) goto L_0x012d
            long r7 = r0.getTime()     // Catch:{ ParseException -> 0x006a }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ ParseException -> 0x006a }
            goto L_0x012e
        L_0x006a:
            r0 = move-exception
            qv.e r13 = qv.e.ERROR
            qv.d r7 = qv.d.f102012a
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x007e:
            boolean r9 = r7.hasNext()
            r14 = 0
            if (r9 == 0) goto L_0x0096
            java.lang.Object r9 = r7.next()
            r10 = r9
            qv.b r10 = (qv.C11819b) r10
            boolean r10 = r10.b(r13, r14)
            if (r10 == 0) goto L_0x007e
            r8.add(r9)
            goto L_0x007e
        L_0x0096:
            java.util.Iterator r15 = r8.iterator()
            r7 = r3
            r8 = r7
        L_0x009c:
            boolean r9 = r15.hasNext()
            if (r9 == 0) goto L_0x012d
            java.lang.Object r9 = r15.next()
            qv.b r9 = (qv.C11819b) r9
            if (r7 != 0) goto L_0x00c7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "Could not parse date "
            r7.append(r10)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = qv.C11818a.a(r7, r0)
            if (r7 != 0) goto L_0x00c3
            goto L_0x012d
        L_0x00c3:
            java.lang.String r7 = qv.C11820c.a(r7)
        L_0x00c7:
            r16 = r7
            if (r8 != 0) goto L_0x011a
            java.lang.Class r7 = r18.getClass()
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r8 = 36
            r10 = 2
            java.lang.String r8 = HJ.C15854t.s1(r7, r8, r3, r10, r3)
            r11 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r11, r3, r10, r3)
            int r10 = r8.length()
            if (r10 != 0) goto L_0x00ea
            goto L_0x00f0
        L_0x00ea:
            java.lang.String r7 = "Kt"
            java.lang.String r7 = HJ.C15854t.P0(r8, r7)
        L_0x00f0:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r10 = "main"
            r11 = 1
            boolean r8 = HJ.C15854t.b0(r8, r10, r11)
            if (r8 == 0) goto L_0x0104
            java.lang.String r8 = "m"
            goto L_0x0106
        L_0x0104:
            java.lang.String r8 = "b"
        L_0x0106:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            java.lang.String r8 = "|"
            r10.append(r8)
            r10.append(r7)
            java.lang.String r8 = r10.toString()
        L_0x011a:
            r17 = r8
            r7 = r9
            r8 = r13
            r9 = r17
            r10 = r14
            r11 = r0
            r12 = r16
            r7.a(r8, r9, r10, r11, r12)
            r7 = r16
            r8 = r17
            goto L_0x009c
        L_0x012d:
            r0 = r3
        L_0x012e:
            if (r0 == 0) goto L_0x004d
            r2.add(r0)
            goto L_0x004d
        L_0x0135:
            java.util.Iterator r0 = r2.iterator()
            boolean r5 = r0.hasNext()
            if (r5 != 0) goto L_0x0141
            r5 = r3
            goto L_0x0174
        L_0x0141:
            java.lang.Object r5 = r0.next()
            boolean r6 = r0.hasNext()
            if (r6 != 0) goto L_0x014c
            goto L_0x0174
        L_0x014c:
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
        L_0x0157:
            java.lang.Object r7 = r0.next()
            r8 = r7
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            int r9 = r6.compareTo(r8)
            if (r9 <= 0) goto L_0x016e
            r5 = r7
            r6 = r8
        L_0x016e:
            boolean r7 = r0.hasNext()
            if (r7 != 0) goto L_0x0157
        L_0x0174:
            java.lang.Long r5 = (java.lang.Long) r5
            java.util.Iterator r0 = r2.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L_0x0181
            goto L_0x01ab
        L_0x0181:
            java.lang.Object r2 = r0.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L_0x018f:
            r3 = r2
        L_0x0190:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01ab
            java.lang.Object r2 = r0.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r6 = r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            int r6 = r3.compareTo(r2)
            if (r6 >= 0) goto L_0x0190
            goto L_0x018f
        L_0x01ab:
            if (r5 == 0) goto L_0x01ec
            if (r3 != 0) goto L_0x01b0
            goto L_0x01ec
        L_0x01b0:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            long r2 = r3.longValue()
            long r6 = r5.longValue()
            long r2 = r2 - r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r0.convert(r2, r6)
            r6 = 0
        L_0x01c3:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ec
            java.util.Date r0 = new java.util.Date
            long r8 = r5.longValue()
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.DAYS
            long r10 = r10.toMillis(r6)
            long r8 = r8 + r10
            r0.<init>(r8)
            java.lang.String r0 = r4.format(r0)
            java.lang.Object r8 = r1.get(r0)
            if (r8 != 0) goto L_0x01e8
            java.util.List r8 = YH.C16877v.n()
            r1.put(r0, r8)
        L_0x01e8:
            r8 = 1
            long r6 = r6 + r8
            goto L_0x01c3
        L_0x01ec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ei.C10671F.a(java.util.Map):java.util.Map");
    }
}
