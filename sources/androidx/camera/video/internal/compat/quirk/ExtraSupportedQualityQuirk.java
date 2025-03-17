package androidx.camera.video.internal.compat.quirk;

import Z.c;
import a0.i0;
import a0.k0;
import android.os.Build;
import android.util.Range;
import androidx.camera.core.impl.C5029j0;
import androidx.camera.core.impl.C5031k0;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.N0;
import java.util.Collections;
import java.util.Map;
import q.C5759a;

public class ExtraSupportedQualityQuirk implements N0 {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r7 = r7.b(1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.Integer, androidx.camera.core.impl.C5031k0> g(androidx.camera.core.impl.I r6, androidx.camera.core.impl.C5029j0 r7, q.C5759a<a0.i0, a0.k0> r8) {
        /*
            r5 = this;
            java.lang.String r0 = "1"
            java.lang.String r6 = r6.d()
            boolean r6 = r0.equals(r6)
            r0 = 0
            if (r6 == 0) goto L_0x006a
            r6 = 4
            boolean r1 = r7.a(r6)
            if (r1 == 0) goto L_0x0015
            goto L_0x006a
        L_0x0015:
            r1 = 1
            androidx.camera.core.impl.k0 r7 = r7.b(r1)
            androidx.camera.core.impl.k0$c r2 = b0.C5253c.b(r7)
            if (r2 != 0) goto L_0x0021
            return r0
        L_0x0021:
            android.util.Range r8 = h(r2, r8)
            android.util.Size r0 = N.d.f9160d
            androidx.camera.core.impl.k0$c r8 = b0.C5253c.a(r2, r0, r8)
            int r3 = r7.a()
            int r4 = r7.e()
            java.util.List r7 = r7.f()
            java.util.List r8 = java.util.Collections.singletonList(r8)
            androidx.camera.core.impl.k0$b r7 = androidx.camera.core.impl.C5031k0.b.h(r3, r4, r7, r8)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.put(r6, r7)
            android.util.Size r6 = new android.util.Size
            int r3 = r2.k()
            int r2 = r2.h()
            r6.<init>(r3, r2)
            int r0 = N.d.c(r0)
            int r6 = N.d.c(r6)
            if (r0 <= r6) goto L_0x0069
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r8.put(r6, r7)
        L_0x0069:
            return r8
        L_0x006a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk.g(androidx.camera.core.impl.I, androidx.camera.core.impl.j0, q.a):java.util.Map");
    }

    private static Range<Integer> h(C5031k0.c cVar, C5759a<i0, k0> aVar) {
        k0 apply = aVar.apply(c.f(cVar));
        return apply != null ? apply.g() : V.i0.f14456b;
    }

    private static boolean i() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    static boolean j() {
        return i();
    }

    public Map<Integer, C5031k0> f(I i10, C5029j0 j0Var, C5759a<i0, k0> aVar) {
        return i() ? g(i10, j0Var, aVar) : Collections.emptyMap();
    }
}
