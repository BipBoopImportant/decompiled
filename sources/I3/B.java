package I3;

import G3.k0;
import I3.z;
import java.util.Arrays;
import java.util.List;
import kb.C9967v;
import q3.K;
import q3.N;

public final class B {
    public static N a(z.a aVar, C6552A[] aArr) {
        List[] listArr = new List[aArr.length];
        for (int i10 = 0; i10 < aArr.length; i10++) {
            C6552A a10 = aArr[i10];
            listArr[i10] = a10 != null ? C9967v.F(a10) : C9967v.E();
        }
        return b(aVar, listArr);
    }

    public static N b(z.a aVar, List<? extends C6552A>[] listArr) {
        boolean z10;
        z.a aVar2 = aVar;
        C9967v.a aVar3 = new C9967v.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            k0 f10 = aVar2.f(i10);
            List<? extends C6552A> list = listArr[i10];
            for (int i11 = 0; i11 < f10.f35939a; i11++) {
                K b10 = f10.b(i11);
                boolean z11 = aVar2.a(i10, i11, false) != 0;
                int i12 = b10.f27943a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < b10.f27943a; i13++) {
                    iArr[i13] = aVar2.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        C6552A a10 = (C6552A) list.get(i14);
                        if (a10.h().equals(b10) && a10.g(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar3.a(new N.a(b10, z11, iArr, zArr));
            }
        }
        k0 h10 = aVar.h();
        for (int i15 = 0; i15 < h10.f35939a; i15++) {
            K b11 = h10.b(i15);
            int[] iArr2 = new int[b11.f27943a];
            Arrays.fill(iArr2, 0);
            aVar3.a(new N.a(b11, false, iArr2, new boolean[b11.f27943a]));
        }
        return new N(aVar3.k());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r1 != r3) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point c(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x000f
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L_0x0008
            r1 = r0
            goto L_0x0009
        L_0x0008:
            r1 = r3
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            r3 = r0
        L_0x000c:
            if (r1 == r3) goto L_0x000f
            goto L_0x0012
        L_0x000f:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0012:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0022
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = t3.N.k(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0022:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = t3.N.k(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.B.c(boolean, int, int, int, int):android.graphics.Point");
    }
}
