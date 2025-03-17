package K6;

/* renamed from: K6.n  reason: case insensitive filesystem */
public final class C6593n {
    static String a(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char charAt = str.charAt(i10);
            int i12 = 1;
            while (i11 < length && charAt == str.charAt(i11)) {
                i12++;
                i11++;
            }
            if (i12 > 1) {
                sb2.append(String.valueOf(i12));
            }
            sb2.append(charAt);
            i10 = i11;
        }
        return sb2.toString();
    }
}
