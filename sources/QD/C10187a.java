package qd;

import java.nio.charset.Charset;
import java.util.Map;
import ld.C10008a;
import ld.C10009b;
import ld.C10010c;
import ld.g;
import od.C10105b;
import rd.e;
import rd.i;
import rd.j;
import rd.k;
import rd.l;
import rd.m;
import xd.C10385b;

/* renamed from: qd.a  reason: case insensitive filesystem */
public final class C10187a implements g {
    private static C10105b b(C10385b bVar, int i10, int i11) {
        C10105b bVar2;
        int e10 = bVar.e();
        int d10 = bVar.d();
        int max = Math.max(i10, e10);
        int max2 = Math.max(i11, d10);
        int min = Math.min(max / e10, max2 / d10);
        int i12 = (max - (e10 * min)) / 2;
        int i13 = (max2 - (d10 * min)) / 2;
        if (i11 < d10 || i10 < e10) {
            bVar2 = new C10105b(e10, d10);
            i12 = 0;
            i13 = 0;
        } else {
            bVar2 = new C10105b(i10, i11);
        }
        bVar2.b();
        int i14 = 0;
        while (i14 < d10) {
            int i15 = i12;
            int i16 = 0;
            while (i16 < e10) {
                if (bVar.b(i16, i14) == 1) {
                    bVar2.k(i15, i13, min, min);
                }
                i16++;
                i15 += min;
            }
            i14++;
            i13 += min;
        }
        return bVar2;
    }

    private static C10105b c(e eVar, l lVar, int i10, int i11) {
        int h10 = lVar.h();
        int g10 = lVar.g();
        C10385b bVar = new C10385b(lVar.j(), lVar.i());
        int i12 = 0;
        for (int i13 = 0; i13 < g10; i13++) {
            if (i13 % lVar.f76419e == 0) {
                int i14 = 0;
                for (int i15 = 0; i15 < lVar.j(); i15++) {
                    bVar.g(i14, i12, i15 % 2 == 0);
                    i14++;
                }
                i12++;
            }
            int i16 = 0;
            for (int i17 = 0; i17 < h10; i17++) {
                if (i17 % lVar.f76418d == 0) {
                    bVar.g(i16, i12, true);
                    i16++;
                }
                bVar.g(i16, i12, eVar.e(i17, i13));
                int i18 = i16 + 1;
                int i19 = lVar.f76418d;
                if (i17 % i19 == i19 - 1) {
                    bVar.g(i18, i12, i13 % 2 == 0);
                    i16 += 2;
                } else {
                    i16 = i18;
                }
            }
            int i20 = i12 + 1;
            int i21 = lVar.f76419e;
            if (i13 % i21 == i21 - 1) {
                int i22 = 0;
                for (int i23 = 0; i23 < lVar.j(); i23++) {
                    bVar.g(i22, i20, true);
                    i22++;
                }
                i12 += 2;
            } else {
                i12 = i20;
            }
        }
        return b(bVar, i10, i11);
    }

    public C10105b a(String str, C10008a aVar, int i10, int i11, Map<C10010c, ?> map) {
        C10009b bVar;
        C10009b bVar2;
        String str2;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != C10008a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got " + aVar);
        } else if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i10 + 'x' + i11);
        } else {
            m mVar = m.FORCE_NONE;
            Charset charset = null;
            if (map != null) {
                m mVar2 = (m) map.get(C10010c.DATA_MATRIX_SHAPE);
                if (mVar2 != null) {
                    mVar = mVar2;
                }
                bVar2 = (C10009b) map.get(C10010c.MIN_SIZE);
                if (bVar2 == null) {
                    bVar2 = null;
                }
                bVar = (C10009b) map.get(C10010c.MAX_SIZE);
                if (bVar == null) {
                    bVar = null;
                }
            } else {
                bVar2 = null;
                bVar = null;
            }
            boolean z10 = false;
            if (map != null) {
                C10010c cVar = C10010c.DATA_MATRIX_COMPACT;
                if (map.containsKey(cVar) && Boolean.parseBoolean(map.get(cVar).toString())) {
                    C10010c cVar2 = C10010c.GS1_FORMAT;
                    if (map.containsKey(cVar2) && Boolean.parseBoolean(map.get(cVar2).toString())) {
                        z10 = true;
                    }
                    C10010c cVar3 = C10010c.CHARACTER_SET;
                    if (map.containsKey(cVar3)) {
                        charset = Charset.forName(map.get(cVar3).toString());
                    }
                    str2 = k.h(str, charset, z10 ? 29 : -1, mVar);
                    l l10 = l.l(str2.length(), mVar, bVar2, bVar, true);
                    e eVar = new e(i.b(str2, l10), l10.h(), l10.g());
                    eVar.h();
                    return c(eVar, l10, i10, i11);
                }
            }
            if (map != null) {
                C10010c cVar4 = C10010c.FORCE_C40;
                if (map.containsKey(cVar4) && Boolean.parseBoolean(map.get(cVar4).toString())) {
                    z10 = true;
                }
            }
            str2 = j.b(str, mVar, bVar2, bVar, z10);
            l l102 = l.l(str2.length(), mVar, bVar2, bVar, true);
            e eVar2 = new e(i.b(str2, l102), l102.h(), l102.g());
            eVar2.h();
            return c(eVar2, l102, i10, i11);
        }
    }
}
