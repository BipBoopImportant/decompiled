package HJ;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "", "t", "(Ljava/lang/String;)Ljava/lang/Integer;", "radix", "u", "(Ljava/lang/String;I)Ljava/lang/Integer;", "", "v", "(Ljava/lang/String;)Ljava/lang/Long;", "w", "(Ljava/lang/String;I)Ljava/lang/Long;", "input", "", "s", "(Ljava/lang/String;)Ljava/lang/Void;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* renamed from: HJ.E  reason: case insensitive filesystem */
class C15824E extends C15823D {
    public static final Void s(String str) {
        C17542s.j(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static Integer t(String str) {
        C17542s.j(str, "<this>");
        return u(str, 10);
    }

    public static final Integer u(String str, int i10) {
        int i11;
        boolean z10;
        int i12;
        C17542s.j(str, "<this>");
        C15835a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char charAt = str.charAt(0);
        int i14 = -2147483647;
        if (C17542s.l(charAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z10 = false;
            } else if (charAt != '-') {
                return null;
            } else {
                i14 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int b10 = C15836b.b(str.charAt(i11), i10);
            if (b10 < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / i10))) || (i12 = i13 * i10) < i14 + b10) {
                return null;
            }
            i13 = i12 - b10;
            i11++;
        }
        return z10 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }

    public static Long v(String str) {
        C17542s.j(str, "<this>");
        return w(str, 10);
    }

    public static final Long w(String str, int i10) {
        boolean z10;
        String str2 = str;
        int i11 = i10;
        C17542s.j(str2, "<this>");
        C15835a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str2.charAt(0);
        long j10 = -9223372036854775807L;
        if (C17542s.l(charAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z10 = false;
                i12 = 1;
            } else if (charAt != '-') {
                return null;
            } else {
                j10 = Long.MIN_VALUE;
                i12 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = -256204778801521550L;
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i12 < length) {
            int b10 = C15836b.b(str2.charAt(i12), i11);
            if (b10 < 0) {
                return null;
            }
            if (j12 < j13) {
                if (j13 == j11) {
                    j13 = j10 / ((long) i11);
                    if (j12 < j13) {
                    }
                }
                return null;
            }
            long j14 = j12 * ((long) i11);
            long j15 = (long) b10;
            if (j14 < j10 + j15) {
                return null;
            }
            j12 = j14 - j15;
            i12++;
            j11 = -256204778801521550L;
        }
        return z10 ? Long.valueOf(j12) : Long.valueOf(-j12);
    }
}
