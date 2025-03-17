package sd;

import java.util.Collection;
import java.util.Collections;
import ld.C10008a;
import ld.C10011d;

public final class k extends q {
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(str);
            } catch (C10011d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else if (length == 8) {
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (C10011d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got " + length);
        }
        n.c(str);
        boolean[] zArr = new boolean[67];
        int b10 = n.b(zArr, 0, p.f76525a, true);
        for (int i10 = 0; i10 <= 3; i10++) {
            b10 += n.b(zArr, b10, p.f76528d[Character.digit(str.charAt(i10), 10)], false);
        }
        int b11 = b10 + n.b(zArr, b10, p.f76526b, false);
        for (int i11 = 4; i11 <= 7; i11++) {
            b11 += n.b(zArr, b11, p.f76528d[Character.digit(str.charAt(i11), 10)], true);
        }
        n.b(zArr, b11, p.f76525a, true);
        return zArr;
    }

    /* access modifiers changed from: protected */
    public Collection<C10008a> g() {
        return Collections.singleton(C10008a.EAN_8);
    }
}
