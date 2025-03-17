package a9;

/* renamed from: a9.y2  reason: case insensitive filesystem */
public final class C6975y2 {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        if ((r10 + r12) <= (r9 + r2)) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(com.contentsquare.android.sdk.C7153u r14, boolean r15) {
        /*
            java.lang.String r0 = "node"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.util.List<com.contentsquare.android.sdk.u> r0 = r14.f47641c
            if (r0 != 0) goto L_0x0013
            com.contentsquare.android.sdk.u r15 = new com.contentsquare.android.sdk.u
            r15.<init>(r14)
            java.util.List r14 = YH.C16877v.e(r15)
            return r14
        L_0x0013:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001c:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r0.next()
            com.contentsquare.android.sdk.u r2 = (com.contentsquare.android.sdk.C7153u) r2
            java.util.List r2 = a(r2, r3)
            r1.addAll(r2)
            goto L_0x001c
        L_0x0031:
            r0 = r3
            r2 = r0
        L_0x0033:
            if (r15 != 0) goto L_0x00a0
            int r4 = r1.size()
            if (r0 >= r4) goto L_0x00a0
            if (r2 != 0) goto L_0x00a0
            java.lang.Object r2 = r1.get(r0)
            com.contentsquare.android.sdk.u r2 = (com.contentsquare.android.sdk.C7153u) r2
            org.json.JSONObject r4 = r14.f47644f
            org.json.JSONObject r2 = r2.f47644f
            java.lang.String r5 = "height"
            java.lang.String r6 = "width"
            if (r4 == 0) goto L_0x0081
            if (r2 != 0) goto L_0x0050
            goto L_0x0081
        L_0x0050:
            java.lang.String r7 = "x"
            int r8 = r4.optInt(r7)
            java.lang.String r9 = "y"
            int r10 = r4.optInt(r9)
            int r11 = r4.optInt(r6)
            int r12 = r4.optInt(r5)
            int r7 = r2.optInt(r7)
            int r9 = r2.optInt(r9)
            int r13 = r2.optInt(r6)
            int r2 = r2.optInt(r5)
            if (r8 < r7) goto L_0x0081
            if (r10 < r9) goto L_0x0081
            int r8 = r8 + r11
            int r7 = r7 + r13
            if (r8 > r7) goto L_0x0081
            int r10 = r10 + r12
            int r9 = r9 + r2
            if (r10 > r9) goto L_0x0081
            goto L_0x009a
        L_0x0081:
            if (r4 == 0) goto L_0x0090
            int r2 = r4.optInt(r6)
            if (r2 == 0) goto L_0x009a
            int r2 = r4.optInt(r5)
            if (r2 != 0) goto L_0x0090
            goto L_0x009a
        L_0x0090:
            if (r4 == 0) goto L_0x009c
            java.lang.String r2 = "visibility"
            boolean r2 = r4.optBoolean(r2)
            if (r2 != 0) goto L_0x009c
        L_0x009a:
            r2 = 1
            goto L_0x009d
        L_0x009c:
            r2 = r3
        L_0x009d:
            int r0 = r0 + 1
            goto L_0x0033
        L_0x00a0:
            if (r2 == 0) goto L_0x00a3
            goto L_0x00ae
        L_0x00a3:
            com.contentsquare.android.sdk.u r15 = new com.contentsquare.android.sdk.u
            r15.<init>(r14)
            r15.f47641c = r1
            java.util.List r1 = YH.C16877v.e(r15)
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6975y2.a(com.contentsquare.android.sdk.u, boolean):java.util.List");
    }
}
