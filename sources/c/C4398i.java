package C;

import C.G0;
import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: C.i  reason: case insensitive filesystem */
final class C4398i extends G0.h {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f5354a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5355b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5356c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5357d;

    /* renamed from: e  reason: collision with root package name */
    private final Matrix f5358e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5359f;

    C4398i(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
        if (rect != null) {
            this.f5354a = rect;
            this.f5355b = i10;
            this.f5356c = i11;
            this.f5357d = z10;
            if (matrix != null) {
                this.f5358e = matrix;
                this.f5359f = z11;
                return;
            }
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        throw new NullPointerException("Null getCropRect");
    }

    public Rect a() {
        return this.f5354a;
    }

    public int b() {
        return this.f5355b;
    }

    public Matrix c() {
        return this.f5358e;
    }

    public int d() {
        return this.f5356c;
    }

    public boolean e() {
        return this.f5357d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G0.h)) {
            return false;
        }
        G0.h hVar = (G0.h) obj;
        return this.f5354a.equals(hVar.a()) && this.f5355b == hVar.b() && this.f5356c == hVar.d() && this.f5357d == hVar.e() && this.f5358e.equals(hVar.c()) && this.f5359f == hVar.f();
    }

    public boolean f() {
        return this.f5359f;
    }

    public int hashCode() {
        int i10 = 1237;
        int hashCode = (((((((((this.f5354a.hashCode() ^ 1000003) * 1000003) ^ this.f5355b) * 1000003) ^ this.f5356c) * 1000003) ^ (this.f5357d ? 1231 : 1237)) * 1000003) ^ this.f5358e.hashCode()) * 1000003;
        if (this.f5359f) {
            i10 = 1231;
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f5354a + ", getRotationDegrees=" + this.f5355b + ", getTargetRotation=" + this.f5356c + ", hasCameraTransform=" + this.f5357d + ", getSensorToBufferTransform=" + this.f5358e + ", isMirroring=" + this.f5359f + "}";
    }
}
