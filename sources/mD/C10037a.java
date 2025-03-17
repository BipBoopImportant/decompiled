package md;

import java.nio.charset.Charset;
import java.util.Map;
import ld.C10008a;
import ld.C10010c;
import ld.g;
import nd.C10082a;
import nd.C10084c;
import od.C10105b;

/* renamed from: md.a  reason: case insensitive filesystem */
public final class C10037a implements g {
    private static C10105b b(String str, C10008a aVar, int i10, int i11, Charset charset, int i12, int i13) {
        if (aVar == C10008a.AZTEC) {
            return c(C10084c.d(str, i12, i13, charset), i10, i11);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got " + aVar);
    }

    private static C10105b c(C10082a aVar, int i10, int i11) {
        C10105b a10 = aVar.a();
        if (a10 != null) {
            int f10 = a10.f();
            int e10 = a10.e();
            int max = Math.max(i10, f10);
            int max2 = Math.max(i11, e10);
            int min = Math.min(max / f10, max2 / e10);
            int i12 = (max - (f10 * min)) / 2;
            int i13 = (max2 - (e10 * min)) / 2;
            C10105b bVar = new C10105b(max, max2);
            int i14 = 0;
            while (i14 < e10) {
                int i15 = 0;
                int i16 = i12;
                while (i15 < f10) {
                    if (a10.d(i15, i14)) {
                        bVar.k(i16, i13, min, min);
                    }
                    i15++;
                    i16 += min;
                }
                i14++;
                i13 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    public C10105b a(String str, C10008a aVar, int i10, int i11, Map<C10010c, ?> map) {
        Charset charset = null;
        int i12 = 33;
        int i13 = 0;
        if (map != null) {
            C10010c cVar = C10010c.CHARACTER_SET;
            if (map.containsKey(cVar)) {
                charset = Charset.forName(map.get(cVar).toString());
            }
            C10010c cVar2 = C10010c.ERROR_CORRECTION;
            if (map.containsKey(cVar2)) {
                i12 = Integer.parseInt(map.get(cVar2).toString());
            }
            C10010c cVar3 = C10010c.AZTEC_LAYERS;
            if (map.containsKey(cVar3)) {
                i13 = Integer.parseInt(map.get(cVar3).toString());
            }
        }
        return b(str, aVar, i10, i11, charset, i12, i13);
    }
}
