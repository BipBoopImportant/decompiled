package vd;

import java.util.Map;
import ld.C10008a;
import ld.C10010c;
import ld.g;
import od.C10105b;
import wd.C10359a;
import xd.C10385b;
import xd.c;

/* renamed from: vd.a  reason: case insensitive filesystem */
public final class C10304a implements g {
    private static C10105b b(xd.g gVar, int i10, int i11, int i12) {
        C10385b a10 = gVar.a();
        if (a10 != null) {
            int e10 = a10.e();
            int d10 = a10.d();
            int i13 = i12 * 2;
            int i14 = e10 + i13;
            int i15 = i13 + d10;
            int max = Math.max(i10, i14);
            int max2 = Math.max(i11, i15);
            int min = Math.min(max / i14, max2 / i15);
            int i16 = (max - (e10 * min)) / 2;
            int i17 = (max2 - (d10 * min)) / 2;
            C10105b bVar = new C10105b(max, max2);
            int i18 = 0;
            while (i18 < d10) {
                int i19 = 0;
                int i20 = i16;
                while (i19 < e10) {
                    if (a10.b(i19, i18) == 1) {
                        bVar.k(i20, i17, min, min);
                    }
                    i19++;
                    i20 += min;
                }
                i18++;
                i17 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    public C10105b a(String str, C10008a aVar, int i10, int i11, Map<C10010c, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != C10008a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + aVar);
        } else if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        } else {
            C10359a aVar2 = C10359a.L;
            int i12 = 4;
            if (map != null) {
                C10010c cVar = C10010c.ERROR_CORRECTION;
                if (map.containsKey(cVar)) {
                    aVar2 = C10359a.valueOf(map.get(cVar).toString());
                }
                C10010c cVar2 = C10010c.MARGIN;
                if (map.containsKey(cVar2)) {
                    i12 = Integer.parseInt(map.get(cVar2).toString());
                }
            }
            return b(c.n(str, aVar2, map), i10, i11, i12);
        }
    }
}
