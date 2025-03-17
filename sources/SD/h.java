package sd;

import java.util.Collection;
import java.util.Collections;
import ld.C10008a;

public class h extends n {
    private static int i(boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < 9; i12++) {
            boolean z10 = true;
            int i13 = i10 + i12;
            if (((1 << (8 - i12)) & i11) == 0) {
                z10 = false;
            }
            zArr[i13] = z10;
        }
        return 9;
    }

    private static int j(String str, int i10) {
        int i11 = 0;
        int i12 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i11 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i12;
            i12++;
            if (i12 > i10) {
                i12 = 1;
            }
        }
        return i11 % 47;
    }

    static String k(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length * 2);
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == 0) {
                sb2.append("bU");
            } else if (charAt <= 26) {
                sb2.append('a');
                sb2.append((char) (charAt + '@'));
            } else if (charAt <= 31) {
                sb2.append('b');
                sb2.append((char) (charAt + '&'));
            } else if (charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+') {
                sb2.append(charAt);
            } else if (charAt <= ',') {
                sb2.append('c');
                sb2.append((char) (charAt + ' '));
            } else if (charAt <= '9') {
                sb2.append(charAt);
            } else if (charAt == ':') {
                sb2.append("cZ");
            } else if (charAt <= '?') {
                sb2.append('b');
                sb2.append((char) (charAt + 11));
            } else if (charAt == '@') {
                sb2.append("bV");
            } else if (charAt <= 'Z') {
                sb2.append(charAt);
            } else if (charAt <= '_') {
                sb2.append('b');
                sb2.append((char) (charAt - 16));
            } else if (charAt == '`') {
                sb2.append("bW");
            } else if (charAt <= 'z') {
                sb2.append('d');
                sb2.append((char) (charAt - ' '));
            } else if (charAt <= 127) {
                sb2.append('b');
                sb2.append((char) (charAt - '+'));
            } else {
                throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
            }
        }
        return sb2.toString();
    }

    public boolean[] d(String str) {
        String k10 = k(str);
        int length = k10.length();
        if (length <= 80) {
            boolean[] zArr = new boolean[(((k10.length() + 4) * 9) + 1)];
            int i10 = i(zArr, 0, C10238g.f76518c);
            for (int i11 = 0; i11 < length; i11++) {
                i10 += i(zArr, i10, C10238g.f76517b["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(k10.charAt(i11))]);
            }
            int j10 = j(k10, 20);
            int[] iArr = C10238g.f76517b;
            int i12 = i10 + i(zArr, i10, iArr[j10]);
            int i13 = i12 + i(zArr, i12, iArr[j(k10 + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(j10), 15)]);
            zArr[i13 + i(zArr, i13, C10238g.f76518c)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got " + length);
    }

    /* access modifiers changed from: protected */
    public Collection<C10008a> g() {
        return Collections.singleton(C10008a.CODE_93);
    }
}
