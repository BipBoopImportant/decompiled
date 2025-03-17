package qx;

import HJ.C15854t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lqx/d;", "", "<init>", "()V", "Lkp/d;", "currency", "", "c", "(Lkp/d;)Ljava/lang/String;", "b", "toFormat", "currencySymbol", "price", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "a", "(DLkp/d;)Ljava/lang/String;", "formattedPrice", "", "noOfFraction", "decimalSymbol", "", "d", "(Ljava/lang/String;ILjava/lang/String;)Z", "count", "", "with", "e", "(IC)Ljava/lang/String;", "price_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f130488a = new d();

    private d() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0213, code lost:
        if (r1.d(r3, r2, r4) == false) goto L_0x0215;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0203  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(double r20, kp.C11522d r22) {
        /*
            java.lang.String r1 = "0"
            java.lang.String r2 = "#,###."
            java.lang.String r0 = "currency"
            r3 = r22
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r4 = ""
            java.lang.String r5 = "#"
            r7 = 0
            r8 = 0
            r9 = 2
            java.lang.String r0 = r22.g()     // Catch:{ Exception -> 0x0022 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0022 }
            if (r0 <= 0) goto L_0x0027
            java.lang.String r0 = r22.g()     // Catch:{ Exception -> 0x0022 }
            r10 = r0
            goto L_0x0028
        L_0x0022:
            r0 = move-exception
            r11 = r4
            r12 = r9
            goto L_0x00be
        L_0x0027:
            r10 = r4
        L_0x0028:
            java.lang.String r0 = r22.j()     // Catch:{ Exception -> 0x0038 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0038 }
            if (r0 <= 0) goto L_0x003e
            java.lang.String r0 = r22.j()     // Catch:{ Exception -> 0x0038 }
            r11 = r0
            goto L_0x003f
        L_0x0038:
            r0 = move-exception
            r11 = r4
        L_0x003a:
            r12 = r9
        L_0x003b:
            r4 = r10
            goto L_0x00be
        L_0x003e:
            r11 = r4
        L_0x003f:
            java.lang.String r0 = r22.i()     // Catch:{ Exception -> 0x004e }
            int r0 = r0.length()     // Catch:{ Exception -> 0x004e }
            if (r0 <= 0) goto L_0x0050
            java.lang.String r4 = r22.i()     // Catch:{ Exception -> 0x004e }
            goto L_0x0050
        L_0x004e:
            r0 = move-exception
            goto L_0x003a
        L_0x0050:
            java.lang.String r0 = "#,###"
            int r12 = r22.k()     // Catch:{ Exception -> 0x004e }
            if (r12 <= 0) goto L_0x0059
            r0 = r2
        L_0x0059:
            boolean r13 = r22.n()     // Catch:{ Exception -> 0x008e }
            if (r13 == 0) goto L_0x0060
            r5 = r1
        L_0x0060:
            qx.d r13 = f130488a     // Catch:{ Exception -> 0x008e }
            char r14 = r5.charAt(r7)     // Catch:{ Exception -> 0x008e }
            java.lang.String r13 = r13.e(r12, r14)     // Catch:{ Exception -> 0x008e }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008e }
            r14.<init>()     // Catch:{ Exception -> 0x008e }
            r14.append(r0)     // Catch:{ Exception -> 0x008e }
            r14.append(r13)     // Catch:{ Exception -> 0x008e }
            java.lang.String r0 = r14.toString()     // Catch:{ Exception -> 0x008e }
            java.text.DecimalFormatSymbols r13 = new java.text.DecimalFormatSymbols     // Catch:{ Exception -> 0x008e }
            java.util.Locale r14 = java.util.Locale.US     // Catch:{ Exception -> 0x008e }
            r13.<init>(r14)     // Catch:{ Exception -> 0x008e }
            int r14 = r10.length()     // Catch:{ Exception -> 0x008e }
            if (r14 <= 0) goto L_0x0090
            char r14 = r10.charAt(r7)     // Catch:{ Exception -> 0x008e }
            r13.setDecimalSeparator(r14)     // Catch:{ Exception -> 0x008e }
            goto L_0x0090
        L_0x008e:
            r0 = move-exception
            goto L_0x003b
        L_0x0090:
            int r14 = r4.length()     // Catch:{ Exception -> 0x008e }
            if (r14 <= 0) goto L_0x009d
            char r4 = r4.charAt(r7)     // Catch:{ Exception -> 0x008e }
            r13.setGroupingSeparator(r4)     // Catch:{ Exception -> 0x008e }
        L_0x009d:
            java.lang.String r4 = r22.l()     // Catch:{ Exception -> 0x008e }
            int r4 = r4.length()     // Catch:{ Exception -> 0x008e }
            if (r4 <= 0) goto L_0x00b2
            java.lang.String r3 = r22.l()     // Catch:{ Exception -> 0x008e }
            char r3 = r3.charAt(r7)     // Catch:{ Exception -> 0x008e }
            r13.setMinusSign(r3)     // Catch:{ Exception -> 0x008e }
        L_0x00b2:
            java.text.DecimalFormat r3 = new java.text.DecimalFormat     // Catch:{ Exception -> 0x008e }
            r3.<init>(r0, r13)     // Catch:{ Exception -> 0x008e }
            r5 = r20
            r4 = r10
        L_0x00ba:
            r0 = r11
            r2 = r12
            goto L_0x0190
        L_0x00be:
            qx.d r3 = f130488a
            qv.e r10 = qv.e.ERROR
            qv.d r13 = qv.d.f102012a
            java.util.List r13 = r13.a()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x00d3:
            boolean r15 = r13.hasNext()
            r7 = 0
            if (r15 == 0) goto L_0x00ec
            java.lang.Object r15 = r13.next()
            r6 = r15
            qv.b r6 = (qv.C11819b) r6
            boolean r6 = r6.b(r10, r7)
            if (r6 == 0) goto L_0x00ea
            r14.add(r15)
        L_0x00ea:
            r7 = 0
            goto L_0x00d3
        L_0x00ec:
            java.util.Iterator r6 = r14.iterator()
            r13 = r8
            r14 = r13
        L_0x00f2:
            boolean r15 = r6.hasNext()
            if (r15 == 0) goto L_0x0175
            java.lang.Object r15 = r6.next()
            qv.b r15 = (qv.C11819b) r15
            if (r13 != 0) goto L_0x010e
            java.lang.String r13 = "Unable to format price"
            java.lang.String r13 = qv.C11818a.a(r13, r0)
            if (r13 != 0) goto L_0x010a
            goto L_0x0175
        L_0x010a:
            java.lang.String r13 = qv.C11820c.a(r13)
        L_0x010e:
            r19 = r13
            if (r14 != 0) goto L_0x0160
            java.lang.Class r13 = r3.getClass()
            java.lang.String r13 = r13.getName()
            kotlin.jvm.internal.C17542s.g(r13)
            r14 = 36
            java.lang.String r14 = HJ.C15854t.s1(r13, r14, r8, r9, r8)
            r7 = 46
            java.lang.String r7 = HJ.C15854t.o1(r14, r7, r8, r9, r8)
            int r14 = r7.length()
            if (r14 != 0) goto L_0x0130
            goto L_0x0136
        L_0x0130:
            java.lang.String r13 = "Kt"
            java.lang.String r13 = HJ.C15854t.P0(r7, r13)
        L_0x0136:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r14 = "main"
            r8 = 1
            boolean r7 = HJ.C15854t.b0(r7, r14, r8)
            if (r7 == 0) goto L_0x014a
            java.lang.String r7 = "m"
            goto L_0x014c
        L_0x014a:
            java.lang.String r7 = "b"
        L_0x014c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "|"
            r8.append(r7)
            r8.append(r13)
            java.lang.String r14 = r8.toString()
        L_0x0160:
            r7 = r14
            r13 = r15
            r14 = r10
            r15 = r7
            r8 = 0
            r16 = r8
            r17 = r0
            r18 = r19
            r13.a(r14, r15, r16, r17, r18)
            r14 = r7
            r7 = r8
            r13 = r19
            r8 = 0
            goto L_0x00f2
        L_0x0175:
            java.text.DecimalFormat r3 = new java.text.DecimalFormat
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r5)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            r5 = r20
            goto L_0x00ba
        L_0x0190:
            java.lang.String r3 = r3.format(r5)
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x01fd
            kotlin.jvm.internal.C17542s.g(r3)
            r5 = 0
            r6 = 0
            boolean r5 = HJ.C15854t.d0(r3, r4, r5, r9, r6)
            if (r5 == 0) goto L_0x01fd
            kotlin.jvm.internal.C17542s.g(r3)
            kotlin.jvm.internal.C17542s.g(r3)
            r14 = 6
            r15 = 0
            r12 = 0
            r13 = 0
            r10 = r3
            r11 = r4
            int r5 = HJ.C15854t.z0(r10, r11, r12, r13, r14, r15)
            r6 = 1
            int r5 = r5 + r6
            java.lang.String r5 = r3.substring(r5)
            java.lang.String r6 = "substring(...)"
            kotlin.jvm.internal.C17542s.i(r5, r6)
            int r5 = r5.length()
            if (r5 >= r2) goto L_0x01df
            qx.d r6 = f130488a
            int r5 = r2 - r5
            r7 = 48
            java.lang.String r5 = r6.e(r5, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = r6.toString()
        L_0x01df:
            kotlin.jvm.internal.C17542s.g(r3)
            r14 = 6
            r15 = 0
            r12 = 0
            r13 = 0
            r10 = r3
            r11 = r4
            int r5 = HJ.C15854t.s0(r10, r11, r12, r13, r14, r15)
            if (r5 != 0) goto L_0x01fd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L_0x01fd:
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0224
            int r1 = r4.length()
            if (r1 != 0) goto L_0x020a
            goto L_0x0215
        L_0x020a:
            qx.d r1 = f130488a
            kotlin.jvm.internal.C17542s.g(r3)
            boolean r1 = r1.d(r3, r2, r4)
            if (r1 != 0) goto L_0x0224
        L_0x0215:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
        L_0x0224:
            kotlin.jvm.internal.C17542s.g(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qx.d.a(double, kp.d):java.lang.String");
    }

    public static final String b(C11522d dVar) {
        C17542s.j(dVar, "currency");
        String l10 = dVar.l();
        return l10.length() == 0 ? "- %s %s" : l10;
    }

    public static final String c(C11522d dVar) {
        C17542s.j(dVar, "currency");
        String m10 = dVar.m();
        return m10.length() == 0 ? "%s %s" : m10;
    }

    private final boolean d(String str, int i10, String str2) {
        int length = str.length() - (i10 + 1);
        if (str.length() == 0 || length < 0) {
            return false;
        }
        return str2.length() > 0 && str.charAt(length) == str2.charAt(0);
    }

    private final String e(int i10, char c10) {
        return i10 <= 0 ? "" : C15854t.P(new String(new char[i10]), 0, c10, false, 4, (Object) null);
    }

    public static final String f(String str, String str2, String str3) {
        C17542s.j(str, "toFormat");
        C17542s.j(str2, "currencySymbol");
        C17542s.j(str3, "price");
        return C15854t.Q(C15854t.Q(str, "%s", str2, false, 4, (Object) null), "%n", str3, false, 4, (Object) null);
    }
}
