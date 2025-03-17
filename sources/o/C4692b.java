package O;

import G.f;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.C5059z;

/* renamed from: O.b  reason: case insensitive filesystem */
final class C4692b<T> extends B<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f9599a;

    /* renamed from: b  reason: collision with root package name */
    private final f f9600b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9601c;

    /* renamed from: d  reason: collision with root package name */
    private final Size f9602d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f9603e;

    /* renamed from: f  reason: collision with root package name */
    private final int f9604f;

    /* renamed from: g  reason: collision with root package name */
    private final Matrix f9605g;

    /* renamed from: h  reason: collision with root package name */
    private final C5059z f9606h;

    C4692b(T t10, f fVar, int i10, Size size, Rect rect, int i11, Matrix matrix, C5059z zVar) {
        if (t10 != null) {
            this.f9599a = t10;
            this.f9600b = fVar;
            this.f9601c = i10;
            if (size != null) {
                this.f9602d = size;
                if (rect != null) {
                    this.f9603e = rect;
                    this.f9604f = i11;
                    if (matrix != null) {
                        this.f9605g = matrix;
                        if (zVar != null) {
                            this.f9606h = zVar;
                            return;
                        }
                        throw new NullPointerException("Null cameraCaptureResult");
                    }
                    throw new NullPointerException("Null sensorToBufferTransform");
                }
                throw new NullPointerException("Null cropRect");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null data");
    }

    public C5059z a() {
        return this.f9606h;
    }

    public Rect b() {
        return this.f9603e;
    }

    public T c() {
        return this.f9599a;
    }

    public f d() {
        return this.f9600b;
    }

    public int e() {
        return this.f9601c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f9600b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof O.B
            r2 = 0
            if (r1 == 0) goto L_0x006f
            O.B r5 = (O.B) r5
            T r1 = r4.f9599a
            java.lang.Object r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
            G.f r1 = r4.f9600b
            if (r1 != 0) goto L_0x0022
            G.f r1 = r5.d()
            if (r1 != 0) goto L_0x006d
            goto L_0x002c
        L_0x0022:
            G.f r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
        L_0x002c:
            int r1 = r4.f9601c
            int r3 = r5.e()
            if (r1 != r3) goto L_0x006d
            android.util.Size r1 = r4.f9602d
            android.util.Size r3 = r5.h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
            android.graphics.Rect r1 = r4.f9603e
            android.graphics.Rect r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
            int r1 = r4.f9604f
            int r3 = r5.f()
            if (r1 != r3) goto L_0x006d
            android.graphics.Matrix r1 = r4.f9605g
            android.graphics.Matrix r3 = r5.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
            androidx.camera.core.impl.z r1 = r4.f9606h
            androidx.camera.core.impl.z r5 = r5.a()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r0 = r2
        L_0x006e:
            return r0
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C4692b.equals(java.lang.Object):boolean");
    }

    public int f() {
        return this.f9604f;
    }

    public Matrix g() {
        return this.f9605g;
    }

    public Size h() {
        return this.f9602d;
    }

    public int hashCode() {
        int hashCode = (this.f9599a.hashCode() ^ 1000003) * 1000003;
        f fVar = this.f9600b;
        return ((((((((((((hashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003) ^ this.f9601c) * 1000003) ^ this.f9602d.hashCode()) * 1000003) ^ this.f9603e.hashCode()) * 1000003) ^ this.f9604f) * 1000003) ^ this.f9605g.hashCode()) * 1000003) ^ this.f9606h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f9599a + ", exif=" + this.f9600b + ", format=" + this.f9601c + ", size=" + this.f9602d + ", cropRect=" + this.f9603e + ", rotationDegrees=" + this.f9604f + ", sensorToBufferTransform=" + this.f9605g + ", cameraCaptureResult=" + this.f9606h + "}";
    }
}
