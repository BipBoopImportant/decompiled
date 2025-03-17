package com.google.android.gms.internal.vision;

import java.util.List;
import java.util.Map;

final class F1 {
    static String a(A1 a12, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        c(a12, sb2, 0);
        return sb2.toString();
    }

    private static final String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e4, code lost:
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f7, code lost:
        if (((java.lang.Integer) r6).intValue() == 0) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0208, code lost:
        if (((java.lang.Float) r6).floatValue() == 0.0f) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021a, code lost:
        if (((java.lang.Double) r6).doubleValue() == 0.0d) goto L_0x01e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0252  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(com.google.android.gms.internal.vision.A1 r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L_0x001a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L_0x0049
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x026b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r3.startsWith(r7)
            r6 = 3
            if (r4 == 0) goto L_0x0065
            java.lang.String r4 = r3.substring(r6)
            goto L_0x0066
        L_0x0065:
            r4 = r3
        L_0x0066:
            java.lang.String r8 = "List"
            boolean r9 = r4.endsWith(r8)
            r10 = 1
            if (r9 == 0) goto L_0x00ca
            java.lang.String r9 = "OrBuilderList"
            boolean r9 = r4.endsWith(r9)
            if (r9 != 0) goto L_0x00ca
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x00ca
            java.lang.String r8 = r4.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r4.length()
            int r9 = r9 + -4
            java.lang.String r9 = r4.substring(r10, r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r11 = r9.length()
            if (r11 == 0) goto L_0x00a2
            java.lang.String r8 = r8.concat(r9)
            goto L_0x00a8
        L_0x00a2:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            r8 = r9
        L_0x00a8:
            java.lang.Object r9 = r0.get(r3)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00ca
            java.lang.Class r11 = r9.getReturnType()
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00ca
            java.lang.String r3 = b(r8)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.android.gms.internal.vision.Q0.p(r9, r13, r4)
            d(r14, r15, r3, r4)
            goto L_0x004d
        L_0x00ca:
            java.lang.String r8 = "Map"
            boolean r9 = r4.endsWith(r8)
            if (r9 == 0) goto L_0x0136
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x0136
            java.lang.String r8 = r4.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r4.length()
            int r9 = r9 - r6
            java.lang.String r6 = r4.substring(r10, r9)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r9 = r6.length()
            if (r9 == 0) goto L_0x00fc
            java.lang.String r6 = r8.concat(r6)
            goto L_0x0101
        L_0x00fc:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x0101:
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x0136
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0136
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L_0x0136
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L_0x0136
            java.lang.String r4 = b(r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = com.google.android.gms.internal.vision.Q0.p(r3, r13, r6)
            d(r14, r15, r4, r3)
            goto L_0x004d
        L_0x0136:
            int r3 = r4.length()
            java.lang.String r6 = "set"
            if (r3 == 0) goto L_0x0143
            java.lang.String r3 = r6.concat(r4)
            goto L_0x0148
        L_0x0143:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r6)
        L_0x0148:
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = "Bytes"
            boolean r3 = r4.endsWith(r3)
            if (r3 == 0) goto L_0x017c
            int r3 = r4.length()
            int r3 = r3 + -5
            java.lang.String r3 = r4.substring(r5, r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r6 = r3.length()
            if (r6 == 0) goto L_0x0171
            java.lang.String r3 = r7.concat(r3)
            goto L_0x0176
        L_0x0171:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r7)
        L_0x0176:
            boolean r3 = r0.containsKey(r3)
            if (r3 != 0) goto L_0x004d
        L_0x017c:
            java.lang.String r3 = r4.substring(r5, r10)
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = r4.substring(r10)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r8 = r6.length()
            if (r8 == 0) goto L_0x019b
            java.lang.String r3 = r3.concat(r6)
            goto L_0x01a1
        L_0x019b:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r3)
            r3 = r6
        L_0x01a1:
            int r6 = r4.length()
            if (r6 == 0) goto L_0x01ac
            java.lang.String r6 = r7.concat(r4)
            goto L_0x01b1
        L_0x01ac:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
        L_0x01b1:
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            int r8 = r4.length()
            java.lang.String r9 = "has"
            if (r8 == 0) goto L_0x01c4
            java.lang.String r4 = r9.concat(r4)
            goto L_0x01c9
        L_0x01c4:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r9)
        L_0x01c9:
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r6 == 0) goto L_0x004d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = com.google.android.gms.internal.vision.Q0.p(r6, r13, r8)
            if (r4 != 0) goto L_0x0254
            boolean r4 = r6 instanceof java.lang.Boolean
            if (r4 == 0) goto L_0x01ec
            r4 = r6
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x01e9
        L_0x01e6:
            r4 = r10
            goto L_0x024f
        L_0x01e9:
            r4 = r5
            goto L_0x024f
        L_0x01ec:
            boolean r4 = r6 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x01fa
            r4 = r6
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != 0) goto L_0x01e9
            goto L_0x01e6
        L_0x01fa:
            boolean r4 = r6 instanceof java.lang.Float
            if (r4 == 0) goto L_0x020b
            r4 = r6
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x01e9
            goto L_0x01e6
        L_0x020b:
            boolean r4 = r6 instanceof java.lang.Double
            if (r4 == 0) goto L_0x021d
            r4 = r6
            java.lang.Double r4 = (java.lang.Double) r4
            double r8 = r4.doubleValue()
            r11 = 0
            int r4 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x01e9
            goto L_0x01e6
        L_0x021d:
            boolean r4 = r6 instanceof java.lang.String
            if (r4 == 0) goto L_0x0228
            java.lang.String r4 = ""
            boolean r4 = r6.equals(r4)
            goto L_0x024f
        L_0x0228:
            boolean r4 = r6 instanceof com.google.android.gms.internal.vision.C7497i0
            if (r4 == 0) goto L_0x0233
            com.google.android.gms.internal.vision.i0 r4 = com.google.android.gms.internal.vision.C7497i0.f49335b
            boolean r4 = r6.equals(r4)
            goto L_0x024f
        L_0x0233:
            boolean r4 = r6 instanceof com.google.android.gms.internal.vision.A1
            if (r4 == 0) goto L_0x0241
            r4 = r6
            com.google.android.gms.internal.vision.A1 r4 = (com.google.android.gms.internal.vision.A1) r4
            com.google.android.gms.internal.vision.A1 r4 = r4.c()
            if (r6 != r4) goto L_0x01e9
            goto L_0x01e6
        L_0x0241:
            boolean r4 = r6 instanceof java.lang.Enum
            if (r4 == 0) goto L_0x01e9
            r4 = r6
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r4 = r4.ordinal()
            if (r4 != 0) goto L_0x01e9
            goto L_0x01e6
        L_0x024f:
            if (r4 != 0) goto L_0x0252
            goto L_0x0260
        L_0x0252:
            r10 = r5
            goto L_0x0260
        L_0x0254:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.android.gms.internal.vision.Q0.p(r4, r13, r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r10 = r4.booleanValue()
        L_0x0260:
            if (r10 == 0) goto L_0x004d
            java.lang.String r3 = b(r3)
            d(r14, r15, r3, r6)
            goto L_0x004d
        L_0x026b:
            boolean r0 = r13 instanceof com.google.android.gms.internal.vision.Q0.c
            if (r0 == 0) goto L_0x02ac
            r0 = r13
            com.google.android.gms.internal.vision.Q0$c r0 = (com.google.android.gms.internal.vision.Q0.c) r0
            com.google.android.gms.internal.vision.I0<com.google.android.gms.internal.vision.Q0$e> r0 = r0.zzc
            java.util.Iterator r0 = r0.o()
        L_0x0278:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02ac
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.vision.Q0$e r2 = (com.google.android.gms.internal.vision.Q0.e) r2
            int r2 = r2.f49248a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 13
            r3.<init>(r4)
            java.lang.String r4 = "["
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = "]"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.Object r1 = r1.getValue()
            d(r14, r15, r2, r1)
            goto L_0x0278
        L_0x02ac:
            com.google.android.gms.internal.vision.Q0 r13 = (com.google.android.gms.internal.vision.Q0) r13
            com.google.android.gms.internal.vision.m2 r13 = r13.zzb
            if (r13 == 0) goto L_0x02b5
            r13.f(r14, r15)
        L_0x02b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.F1.c(com.google.android.gms.internal.vision.A1, java.lang.StringBuilder, int):void");
    }

    static final void d(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object d10 : (List) obj) {
                d(sb2, i10, str, d10);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry d11 : ((Map) obj).entrySet()) {
                d(sb2, i10, str, d11);
            }
        } else {
            sb2.append(10);
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(C7487f2.a(C7497i0.p((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof C7497i0) {
                sb2.append(": \"");
                sb2.append(C7487f2.a((C7497i0) obj));
                sb2.append('\"');
            } else if (obj instanceof Q0) {
                sb2.append(" {");
                c((Q0) obj, sb2, i10 + 2);
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i13 = i10 + 2;
                d(sb2, i13, "key", entry.getKey());
                d(sb2, i13, "value", entry.getValue());
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj.toString());
            }
        }
    }
}
