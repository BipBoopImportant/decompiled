package C;

import android.graphics.Matrix;
import androidx.camera.core.impl.g1;

/* renamed from: C.d  reason: case insensitive filesystem */
final class C4388d extends C4385b0 {

    /* renamed from: a  reason: collision with root package name */
    private final g1 f5316a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5317b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5318c;

    /* renamed from: d  reason: collision with root package name */
    private final Matrix f5319d;

    C4388d(g1 g1Var, long j10, int i10, Matrix matrix) {
        if (g1Var != null) {
            this.f5316a = g1Var;
            this.f5317b = j10;
            this.f5318c = i10;
            if (matrix != null) {
                this.f5319d = matrix;
                return;
            }
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        throw new NullPointerException("Null tagBundle");
    }

    public long a() {
        return this.f5317b;
    }

    public g1 b() {
        return this.f5316a;
    }

    public Matrix d() {
        return this.f5319d;
    }

    public int e() {
        return this.f5318c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4385b0)) {
            return false;
        }
        C4385b0 b0Var = (C4385b0) obj;
        return this.f5316a.equals(b0Var.b()) && this.f5317b == b0Var.a() && this.f5318c == b0Var.e() && this.f5319d.equals(b0Var.d());
    }

    public int hashCode() {
        long j10 = this.f5317b;
        return ((((((this.f5316a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f5318c) * 1000003) ^ this.f5319d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f5316a + ", timestamp=" + this.f5317b + ", rotationDegrees=" + this.f5318c + ", sensorToBufferTransformMatrix=" + this.f5319d + "}";
    }
}
