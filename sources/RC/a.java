package Rc;

import java.util.TimeZone;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final TimeZone f63188a = TimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    private static int b(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt < '0' || charAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date c(java.lang.String r19, java.text.ParsePosition r20) {
        /*
            r1 = r19
            r2 = r20
            int r0 = r20.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            int r3 = r0 + 4
            int r4 = d(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r5 = 45
            boolean r6 = a(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r7 = 5
            if (r6 == 0) goto L_0x0019
            int r3 = r0 + 5
        L_0x0019:
            int r0 = r3 + 2
            int r6 = d(r1, r3, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            boolean r8 = a(r1, r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            if (r8 == 0) goto L_0x0027
            int r0 = r3 + 3
        L_0x0027:
            int r3 = r0 + 2
            int r8 = d(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r9 = 84
            boolean r9 = a(r1, r3, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r10 = 1
            r11 = 0
            if (r9 != 0) goto L_0x0054
            int r12 = r19.length()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            if (r12 > r3) goto L_0x0054
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            int r6 = r6 - r10
            r0.<init>(r4, r6, r8)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r0.setLenient(r11)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r2.setIndex(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.util.Date r0 = r0.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            return r0
        L_0x004e:
            r0 = move-exception
            goto L_0x01ce
        L_0x0051:
            r0 = move-exception
            goto L_0x01ce
        L_0x0054:
            r12 = 43
            r13 = 90
            r14 = 2
            if (r9 == 0) goto L_0x00d8
            int r3 = r0 + 3
            int r9 = r0 + 5
            int r3 = d(r1, r3, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r15 = 58
            boolean r16 = a(r1, r9, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            if (r16 == 0) goto L_0x006d
            int r9 = r0 + 6
        L_0x006d:
            int r0 = r9 + 2
            int r16 = d(r1, r9, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            boolean r15 = a(r1, r0, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            if (r15 == 0) goto L_0x007c
            int r9 = r9 + 3
            r0 = r9
        L_0x007c:
            int r9 = r19.length()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            if (r9 <= r0) goto L_0x00ce
            char r9 = r1.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            if (r9 == r13) goto L_0x00ce
            if (r9 == r12) goto L_0x00ce
            if (r9 == r5) goto L_0x00ce
            int r9 = r0 + 2
            int r15 = d(r1, r0, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r11 = 59
            if (r15 <= r11) goto L_0x009c
            r11 = 63
            if (r15 >= r11) goto L_0x009c
            r15 = 59
        L_0x009c:
            r11 = 46
            boolean r11 = a(r1, r9, r11)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            if (r11 == 0) goto L_0x00c8
            int r9 = r0 + 3
            int r11 = r0 + 4
            int r11 = b(r1, r11)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            int r0 = r0 + 6
            int r0 = java.lang.Math.min(r11, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            int r17 = d(r1, r9, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            int r0 = r0 - r9
            if (r0 == r10) goto L_0x00bf
            if (r0 == r14) goto L_0x00bc
            goto L_0x00c1
        L_0x00bc:
            int r17 = r17 * 10
            goto L_0x00c1
        L_0x00bf:
            int r17 = r17 * 100
        L_0x00c1:
            r0 = r3
            r3 = r11
            r9 = r16
            r11 = r17
            goto L_0x00dc
        L_0x00c8:
            r0 = r3
            r3 = r9
            r9 = r16
            r11 = 0
            goto L_0x00dc
        L_0x00ce:
            r9 = r16
            r11 = 0
            r15 = 0
            r18 = r3
            r3 = r0
            r0 = r18
            goto L_0x00dc
        L_0x00d8:
            r0 = 0
            r9 = 0
            r11 = 0
            r15 = 0
        L_0x00dc:
            int r14 = r19.length()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            if (r14 <= r3) goto L_0x01c6
            char r14 = r1.charAt(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            if (r14 != r13) goto L_0x00ed
            java.util.TimeZone r5 = f63188a     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            int r3 = r3 + r10
            goto L_0x0195
        L_0x00ed:
            if (r14 == r12) goto L_0x010e
            if (r14 != r5) goto L_0x00f2
            goto L_0x010e
        L_0x00f2:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r3.append(r14)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
        L_0x010e:
            java.lang.String r5 = r1.substring(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            int r12 = r5.length()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            if (r12 < r7) goto L_0x0119
            goto L_0x012a
        L_0x0119:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r12.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r12.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.lang.String r5 = "00"
            r12.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.lang.String r5 = r12.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
        L_0x012a:
            int r12 = r5.length()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            int r3 = r3 + r12
            java.lang.String r12 = "+0000"
            boolean r12 = r5.equals(r12)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            if (r12 != 0) goto L_0x0193
            java.lang.String r12 = "+00:00"
            boolean r12 = r5.equals(r12)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            if (r12 == 0) goto L_0x0140
            goto L_0x0193
        L_0x0140:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r12.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.lang.String r13 = "GMT"
            r12.append(r13)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r12.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.lang.String r5 = r12.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.util.TimeZone r12 = java.util.TimeZone.getTimeZone(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.lang.String r13 = r12.getID()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            boolean r14 = r13.equals(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            if (r14 != 0) goto L_0x0191
            java.lang.String r14 = ":"
            java.lang.String r7 = ""
            java.lang.String r7 = r13.replace(r14, r7)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            boolean r7 = r7.equals(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            if (r7 == 0) goto L_0x016e
            goto L_0x0191
        L_0x016e:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r3.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.lang.String r4 = r12.getID()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
        L_0x0191:
            r5 = r12
            goto L_0x0195
        L_0x0193:
            java.util.TimeZone r5 = f63188a     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
        L_0x0195:
            java.util.GregorianCalendar r7 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r7.<init>(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r5 = 0
            r7.setLenient(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r7.set(r10, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            int r6 = r6 - r10
            r4 = 2
            r7.set(r4, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r4 = 5
            r7.set(r4, r8)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r4 = 11
            r7.set(r4, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r0 = 12
            r7.set(r0, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r0 = 13
            r7.set(r0, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r0 = 14
            r7.set(r0, r11)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            r2.setIndex(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.util.Date r0 = r7.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            return r0
        L_0x01c6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0051, IllegalArgumentException -> 0x004e }
        L_0x01ce:
            if (r1 != 0) goto L_0x01d2
            r1 = 0
            goto L_0x01e6
        L_0x01d2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 34
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L_0x01e6:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01f2
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0210
        L_0x01f2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "("
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0210:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to parse date ["
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r20.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Rc.a.c(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int d(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int digit = Character.digit(str.charAt(i10), 10);
            if (digit >= 0) {
                i12 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int digit2 = Character.digit(str.charAt(i13), 10);
            if (digit2 >= 0) {
                i12 = (i12 * 10) - digit2;
                i13 = i14;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
        }
        return -i12;
    }
}
