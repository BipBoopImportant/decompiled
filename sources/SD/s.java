package sd;

import java.util.Collection;
import java.util.Collections;
import ld.C10008a;
import ld.C10011d;

public final class s extends q {
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(r.c(str));
            } catch (C10011d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else if (length == 8) {
            try {
                if (!p.a(r.c(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (C10011d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got " + length);
        }
        n.c(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i10 = r.f76531g[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int b10 = n.b(zArr, 0, p.f76525a, true);
            for (int i11 = 1; i11 <= 6; i11++) {
                int digit2 = Character.digit(str.charAt(i11), 10);
                if (((i10 >> (6 - i11)) & 1) == 1) {
                    digit2 += 10;
                }
                b10 += n.b(zArr, b10, p.f76529e[digit2], false);
            }
            n.b(zArr, b10, p.f76527c, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }

    /* access modifiers changed from: protected */
    public Collection<C10008a> g() {
        return Collections.singleton(C10008a.UPC_E);
    }
}
