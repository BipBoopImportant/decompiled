package sd;

import java.util.Collection;
import java.util.Collections;
import ld.C10008a;

/* renamed from: sd.f  reason: case insensitive filesystem */
public final class C10237f extends n {
    private static void i(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    private static String j(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt == '@') {
                        sb2.append("%V");
                    } else if (charAt == '`') {
                        sb2.append("%W");
                    } else if (!(charAt == '-' || charAt == '.')) {
                        if (charAt <= 26) {
                            sb2.append('$');
                            sb2.append((char) (charAt + '@'));
                        } else if (charAt < ' ') {
                            sb2.append('%');
                            sb2.append((char) (charAt + '&'));
                        } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                            sb2.append('/');
                            sb2.append((char) (charAt + ' '));
                        } else if (charAt <= '9') {
                            sb2.append((char) charAt);
                        } else if (charAt <= '?') {
                            sb2.append('%');
                            sb2.append((char) (charAt + 11));
                        } else if (charAt <= 'Z') {
                            sb2.append((char) charAt);
                        } else if (charAt <= '_') {
                            sb2.append('%');
                            sb2.append((char) (charAt - 16));
                        } else if (charAt <= 'z') {
                            sb2.append('+');
                            sb2.append((char) (charAt - ' '));
                        } else if (charAt <= 127) {
                            sb2.append('%');
                            sb2.append((char) (charAt - '+'));
                        } else {
                            throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i10) + "'");
                        }
                    }
                }
                sb2.append(charAt);
            } else {
                sb2.append("%U");
            }
        }
        return sb2.toString();
    }

    public boolean[] d(String str) {
        int length = str.length();
        if (length <= 80) {
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i10)) < 0) {
                    str = j(str);
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i10++;
                }
            }
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[((length * 13) + 25)];
            i(148, iArr);
            int b10 = n.b(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int b11 = b10 + n.b(zArr, b10, iArr2, false);
            for (int i11 = 0; i11 < length; i11++) {
                i(C10236e.f76515a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i11))], iArr);
                int b12 = b11 + n.b(zArr, b11, iArr, true);
                b11 = b12 + n.b(zArr, b12, iArr2, false);
            }
            i(148, iArr);
            n.b(zArr, b11, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
    }

    /* access modifiers changed from: protected */
    public Collection<C10008a> g() {
        return Collections.singleton(C10008a.CODE_39);
    }
}
