package com.google.android.gms.measurement.internal;

import K9.C6620s;
import com.google.android.gms.internal.measurement.W1;
import com.google.android.gms.internal.measurement.Y1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.measurement.internal.b  reason: case insensitive filesystem */
abstract class C7562b {

    /* renamed from: a  reason: collision with root package name */
    String f50055a;

    /* renamed from: b  reason: collision with root package name */
    int f50056b;

    /* renamed from: c  reason: collision with root package name */
    Boolean f50057c;

    /* renamed from: d  reason: collision with root package name */
    Boolean f50058d;

    /* renamed from: e  reason: collision with root package name */
    Long f50059e;

    /* renamed from: f  reason: collision with root package name */
    Long f50060f;

    C7562b(String str, int i10) {
        this.f50055a = str;
        this.f50056b = i10;
    }

    static Boolean b(double d10, W1 w12) {
        try {
            return h(new BigDecimal(d10), w12, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j10, W1 w12) {
        try {
            return h(new BigDecimal(j10), w12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean d(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    static Boolean e(String str, W1 w12) {
        if (!N5.e0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), w12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, Y1.a aVar, boolean z10, String str2, List<String> list, String str3, C7607h2 h2Var) {
        if (str == null) {
            return null;
        }
        if (aVar == Y1.a.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && aVar != Y1.a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (X5.f49994a[aVar.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z10 ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (h2Var != null) {
                        h2Var.J().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    static Boolean g(String str, Y1 y12, C7607h2 h2Var) {
        List<String> list;
        C6620s.l(y12);
        if (str == null || !y12.R() || y12.J() == Y1.a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        Y1.a J10 = y12.J();
        Y1.a aVar = Y1.a.IN_LIST;
        if (J10 == aVar) {
            if (y12.m() == 0) {
                return null;
            }
        } else if (!y12.Q()) {
            return null;
        }
        Y1.a J11 = y12.J();
        boolean O10 = y12.O();
        String M10 = (O10 || J11 == Y1.a.REGEXP || J11 == aVar) ? y12.M() : y12.M().toUpperCase(Locale.ENGLISH);
        if (y12.m() == 0) {
            list = null;
        } else {
            List<String> N10 = y12.N();
            if (!O10) {
                ArrayList arrayList = new ArrayList(N10.size());
                for (String upperCase : N10) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                N10 = Collections.unmodifiableList(arrayList);
            }
            list = N10;
        }
        return f(str, J11, O10, M10, list, J11 == Y1.a.REGEXP ? M10 : null, h2Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r3 != null) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean h(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.W1 r9, double r10) {
        /*
            K9.C6620s.l(r9)
            boolean r0 = r9.Q()
            r1 = 0
            if (r0 == 0) goto L_0x0114
            com.google.android.gms.internal.measurement.W1$a r0 = r9.J()
            com.google.android.gms.internal.measurement.W1$a r2 = com.google.android.gms.internal.measurement.W1.a.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x0114
        L_0x0014:
            com.google.android.gms.internal.measurement.W1$a r0 = r9.J()
            com.google.android.gms.internal.measurement.W1$a r2 = com.google.android.gms.internal.measurement.W1.a.BETWEEN
            if (r0 != r2) goto L_0x0029
            boolean r0 = r9.U()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r9.T()
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r9.R()
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            com.google.android.gms.internal.measurement.W1$a r0 = r9.J()
            com.google.android.gms.internal.measurement.W1$a r3 = r9.J()
            if (r3 != r2) goto L_0x0065
            java.lang.String r3 = r9.O()
            boolean r3 = com.google.android.gms.measurement.internal.N5.e0(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.String r3 = r9.N()
            boolean r3 = com.google.android.gms.measurement.internal.N5.e0(r3)
            if (r3 != 0) goto L_0x004f
            goto L_0x0064
        L_0x004f:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0064 }
            java.lang.String r4 = r9.O()     // Catch:{ NumberFormatException -> 0x0064 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0064 }
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0064 }
            java.lang.String r9 = r9.N()     // Catch:{ NumberFormatException -> 0x0064 }
            r4.<init>(r9)     // Catch:{ NumberFormatException -> 0x0064 }
            r9 = r3
            r3 = r1
            goto L_0x007b
        L_0x0064:
            return r1
        L_0x0065:
            java.lang.String r3 = r9.M()
            boolean r3 = com.google.android.gms.measurement.internal.N5.e0(r3)
            if (r3 != 0) goto L_0x0070
            return r1
        L_0x0070:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0114 }
            java.lang.String r9 = r9.M()     // Catch:{ NumberFormatException -> 0x0114 }
            r3.<init>(r9)     // Catch:{ NumberFormatException -> 0x0114 }
            r9 = r1
            r4 = r9
        L_0x007b:
            if (r0 != r2) goto L_0x0080
            if (r9 != 0) goto L_0x0082
            return r1
        L_0x0080:
            if (r3 == 0) goto L_0x0114
        L_0x0082:
            int[] r2 = com.google.android.gms.measurement.internal.X5.f49995b
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 0
            r5 = 1
            if (r0 == r5) goto L_0x0106
            r6 = 2
            if (r0 == r6) goto L_0x00f8
            r7 = 3
            if (r0 == r7) goto L_0x00ae
            r10 = 4
            if (r0 == r10) goto L_0x0099
            goto L_0x0114
        L_0x0099:
            if (r9 != 0) goto L_0x009c
            return r1
        L_0x009c:
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto L_0x00a9
            int r8 = r8.compareTo(r4)
            if (r8 > 0) goto L_0x00a9
            r2 = r5
        L_0x00a9:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00ae:
            if (r3 == 0) goto L_0x0114
            r0 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00ec
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r0)
            java.math.BigDecimal r9 = r3.subtract(r9)
            int r9 = r8.compareTo(r9)
            if (r9 <= 0) goto L_0x00e7
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r10)
            java.math.BigDecimal r9 = r3.add(r9)
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x00e7
            r2 = r5
        L_0x00e7:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00ec:
            int r8 = r8.compareTo(r3)
            if (r8 != 0) goto L_0x00f3
            r2 = r5
        L_0x00f3:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00f8:
            if (r3 == 0) goto L_0x0114
            int r8 = r8.compareTo(r3)
            if (r8 <= 0) goto L_0x0101
            r2 = r5
        L_0x0101:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0106:
            if (r3 == 0) goto L_0x0114
            int r8 = r8.compareTo(r3)
            if (r8 >= 0) goto L_0x010f
            r2 = r5
        L_0x010f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0114:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7562b.h(java.math.BigDecimal, com.google.android.gms.internal.measurement.W1, double):java.lang.Boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    /* access modifiers changed from: package-private */
    public abstract boolean i();

    /* access modifiers changed from: package-private */
    public abstract boolean j();
}
