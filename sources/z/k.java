package z;

import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.b;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private final ExtraCroppingQuirk f32323a;

    public k() {
        this((ExtraCroppingQuirk) b.b(ExtraCroppingQuirk.class));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r0 = r0.f(androidx.camera.core.impl.e1.b.PRIV);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Size a(android.util.Size r5) {
        /*
            r4 = this;
            androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk r0 = r4.f32323a
            if (r0 != 0) goto L_0x0005
            return r5
        L_0x0005:
            androidx.camera.core.impl.e1$b r1 = androidx.camera.core.impl.e1.b.PRIV
            android.util.Size r0 = r0.f(r1)
            if (r0 != 0) goto L_0x000e
            return r5
        L_0x000e:
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            int r1 = r1 * r2
            int r2 = r5.getWidth()
            int r3 = r5.getHeight()
            int r2 = r2 * r3
            if (r1 <= r2) goto L_0x0023
            r5 = r0
        L_0x0023:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.k.a(android.util.Size):android.util.Size");
    }

    k(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f32323a = extraCroppingQuirk;
    }
}
