package td;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import ld.C10008a;
import ld.C10010c;
import ld.g;
import od.C10105b;
import ud.C10265c;
import ud.C10266d;
import ud.C10267e;

/* renamed from: td.a  reason: case insensitive filesystem */
public final class C10250a implements g {
    private static C10105b b(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        C10105b bVar = new C10105b(bArr[0].length + i11, bArr.length + i11);
        bVar.b();
        int e10 = (bVar.e() - i10) - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            byte[] bArr2 = bArr[i12];
            for (int i13 = 0; i13 < bArr[0].length; i13++) {
                if (bArr2[i13] == 1) {
                    bVar.j(i13 + i10, e10);
                }
            }
            i12++;
            e10--;
        }
        return bVar;
    }

    private static C10105b c(C10267e eVar, String str, int i10, int i11, int i12, int i13, boolean z10) {
        boolean z11;
        eVar.e(str, i10, z10);
        byte[][] b10 = eVar.f().b(1, 4);
        if ((i12 > i11) != (b10[0].length < b10.length)) {
            b10 = d(b10);
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(i11 / b10[0].length, i12 / b10.length);
        if (min <= 1) {
            return b(b10, i13);
        }
        byte[][] b11 = eVar.f().b(min, min * 4);
        if (z11) {
            b11 = d(b11);
        }
        return b(b11, i13);
    }

    private static byte[][] d(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length2 = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length2] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    public C10105b a(String str, C10008a aVar, int i10, int i11, Map<C10010c, ?> map) {
        if (aVar == C10008a.PDF_417) {
            C10267e eVar = new C10267e();
            boolean z10 = false;
            int i12 = 30;
            int i13 = 2;
            if (map != null) {
                C10010c cVar = C10010c.PDF417_COMPACT;
                if (map.containsKey(cVar)) {
                    eVar.h(Boolean.parseBoolean(map.get(cVar).toString()));
                }
                C10010c cVar2 = C10010c.PDF417_COMPACTION;
                if (map.containsKey(cVar2)) {
                    eVar.i(C10265c.valueOf(map.get(cVar2).toString()));
                }
                C10010c cVar3 = C10010c.PDF417_DIMENSIONS;
                if (map.containsKey(cVar3)) {
                    C10266d dVar = (C10266d) map.get(cVar3);
                    eVar.j(dVar.a(), dVar.c(), dVar.b(), dVar.d());
                }
                C10010c cVar4 = C10010c.MARGIN;
                if (map.containsKey(cVar4)) {
                    i12 = Integer.parseInt(map.get(cVar4).toString());
                }
                C10010c cVar5 = C10010c.ERROR_CORRECTION;
                if (map.containsKey(cVar5)) {
                    i13 = Integer.parseInt(map.get(cVar5).toString());
                }
                C10010c cVar6 = C10010c.CHARACTER_SET;
                if (map.containsKey(cVar6)) {
                    eVar.k(Charset.forName(map.get(cVar6).toString()));
                }
                C10010c cVar7 = C10010c.PDF417_AUTO_ECI;
                if (map.containsKey(cVar7) && Boolean.parseBoolean(map.get(cVar7).toString())) {
                    z10 = true;
                }
            }
            int i14 = i13;
            return c(eVar, str, i14, i10, i11, i12, z10);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got " + aVar);
    }
}
