package C;

import C.v0;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.J;

/* renamed from: C.f  reason: case insensitive filesystem */
final class C4392f extends v0.a {

    /* renamed from: a  reason: collision with root package name */
    private final Size f5338a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f5339b;

    /* renamed from: c  reason: collision with root package name */
    private final J f5340c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5341d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5342e;

    C4392f(Size size, Rect rect, J j10, int i10, boolean z10) {
        if (size != null) {
            this.f5338a = size;
            if (rect != null) {
                this.f5339b = rect;
                this.f5340c = j10;
                this.f5341d = i10;
                this.f5342e = z10;
                return;
            }
            throw new NullPointerException("Null inputCropRect");
        }
        throw new NullPointerException("Null inputSize");
    }

    public J a() {
        return this.f5340c;
    }

    public Rect b() {
        return this.f5339b;
    }

    public Size c() {
        return this.f5338a;
    }

    public boolean d() {
        return this.f5342e;
    }

    public int e() {
        return this.f5341d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f5340c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof C.v0.a
            r2 = 0
            if (r1 == 0) goto L_0x004b
            C.v0$a r5 = (C.v0.a) r5
            android.util.Size r1 = r4.f5338a
            android.util.Size r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            android.graphics.Rect r1 = r4.f5339b
            android.graphics.Rect r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            androidx.camera.core.impl.J r1 = r4.f5340c
            if (r1 != 0) goto L_0x002e
            androidx.camera.core.impl.J r1 = r5.a()
            if (r1 != 0) goto L_0x0049
            goto L_0x0038
        L_0x002e:
            androidx.camera.core.impl.J r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
        L_0x0038:
            int r1 = r4.f5341d
            int r3 = r5.e()
            if (r1 != r3) goto L_0x0049
            boolean r1 = r4.f5342e
            boolean r5 = r5.d()
            if (r1 != r5) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = r2
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: C.C4392f.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (((this.f5338a.hashCode() ^ 1000003) * 1000003) ^ this.f5339b.hashCode()) * 1000003;
        J j10 = this.f5340c;
        return ((((hashCode ^ (j10 == null ? 0 : j10.hashCode())) * 1000003) ^ this.f5341d) * 1000003) ^ (this.f5342e ? 1231 : 1237);
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f5338a + ", inputCropRect=" + this.f5339b + ", cameraInternal=" + this.f5340c + ", rotationDegrees=" + this.f5341d + ", mirroring=" + this.f5342e + "}";
    }
}
