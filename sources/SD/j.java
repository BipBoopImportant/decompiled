package sd;

import java.util.Collection;
import java.util.Collections;
import ld.C10008a;
import ld.C10011d;

public final class j extends q {
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + p.b(str);
            } catch (C10011d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else if (length == 13) {
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (C10011d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got " + length);
        }
        n.c(str);
        int i10 = i.f76519f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b10 = n.b(zArr, 0, p.f76525a, true);
        for (int i11 = 1; i11 <= 6; i11++) {
            int digit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                digit += 10;
            }
            b10 += n.b(zArr, b10, p.f76529e[digit], false);
        }
        int b11 = b10 + n.b(zArr, b10, p.f76526b, false);
        for (int i12 = 7; i12 <= 12; i12++) {
            b11 += n.b(zArr, b11, p.f76528d[Character.digit(str.charAt(i12), 10)], true);
        }
        n.b(zArr, b11, p.f76525a, true);
        return zArr;
    }

    /* access modifiers changed from: protected */
    public Collection<C10008a> g() {
        return Collections.singleton(C10008a.EAN_13);
    }
}
