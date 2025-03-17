package E;

import C.U;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.C5040p;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: E.h  reason: case insensitive filesystem */
final class C4425h extends f0 {

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5632b;

    /* renamed from: c  reason: collision with root package name */
    private final U.e f5633c;

    /* renamed from: d  reason: collision with root package name */
    private final U.f f5634d;

    /* renamed from: e  reason: collision with root package name */
    private final U.g f5635e;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f5636f;

    /* renamed from: g  reason: collision with root package name */
    private final Matrix f5637g;

    /* renamed from: h  reason: collision with root package name */
    private final int f5638h;

    /* renamed from: i  reason: collision with root package name */
    private final int f5639i;

    /* renamed from: j  reason: collision with root package name */
    private final int f5640j;

    /* renamed from: k  reason: collision with root package name */
    private final List<C5040p> f5641k;

    C4425h(Executor executor, U.e eVar, U.f fVar, U.g gVar, Rect rect, Matrix matrix, int i10, int i11, int i12, List<C5040p> list) {
        if (executor != null) {
            this.f5632b = executor;
            this.f5633c = eVar;
            this.f5634d = fVar;
            this.f5635e = gVar;
            if (rect != null) {
                this.f5636f = rect;
                if (matrix != null) {
                    this.f5637g = matrix;
                    this.f5638h = i10;
                    this.f5639i = i11;
                    this.f5640j = i12;
                    if (list != null) {
                        this.f5641k = list;
                        return;
                    }
                    throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
                }
                throw new NullPointerException("Null sensorToBufferTransform");
            }
            throw new NullPointerException("Null cropRect");
        }
        throw new NullPointerException("Null appExecutor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f5634d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f5635e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f5633c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof E.f0
            r2 = 0
            if (r1 == 0) goto L_0x0095
            E.f0 r5 = (E.f0) r5
            java.util.concurrent.Executor r1 = r4.f5632b
            java.util.concurrent.Executor r3 = r5.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0093
            C.U$e r1 = r4.f5633c
            if (r1 != 0) goto L_0x0022
            C.U$e r1 = r5.j()
            if (r1 != 0) goto L_0x0093
            goto L_0x002c
        L_0x0022:
            C.U$e r3 = r5.j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0093
        L_0x002c:
            C.U$f r1 = r4.f5634d
            if (r1 != 0) goto L_0x0037
            C.U$f r1 = r5.l()
            if (r1 != 0) goto L_0x0093
            goto L_0x0041
        L_0x0037:
            C.U$f r3 = r5.l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0093
        L_0x0041:
            C.U$g r1 = r4.f5635e
            if (r1 != 0) goto L_0x004c
            C.U$g r1 = r5.m()
            if (r1 != 0) goto L_0x0093
            goto L_0x0056
        L_0x004c:
            C.U$g r3 = r5.m()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0093
        L_0x0056:
            android.graphics.Rect r1 = r4.f5636f
            android.graphics.Rect r3 = r5.i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0093
            android.graphics.Matrix r1 = r4.f5637g
            android.graphics.Matrix r3 = r5.o()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0093
            int r1 = r4.f5638h
            int r3 = r5.n()
            if (r1 != r3) goto L_0x0093
            int r1 = r4.f5639i
            int r3 = r5.k()
            if (r1 != r3) goto L_0x0093
            int r1 = r4.f5640j
            int r3 = r5.h()
            if (r1 != r3) goto L_0x0093
            java.util.List<androidx.camera.core.impl.p> r1 = r4.f5641k
            java.util.List r5 = r5.p()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r0 = r2
        L_0x0094:
            return r0
        L_0x0095:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E.C4425h.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: package-private */
    public Executor g() {
        return this.f5632b;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f5640j;
    }

    public int hashCode() {
        int hashCode = (this.f5632b.hashCode() ^ 1000003) * 1000003;
        U.e eVar = this.f5633c;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        U.f fVar = this.f5634d;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        U.g gVar = this.f5635e;
        if (gVar != null) {
            i10 = gVar.hashCode();
        }
        return ((((((((((((hashCode3 ^ i10) * 1000003) ^ this.f5636f.hashCode()) * 1000003) ^ this.f5637g.hashCode()) * 1000003) ^ this.f5638h) * 1000003) ^ this.f5639i) * 1000003) ^ this.f5640j) * 1000003) ^ this.f5641k.hashCode();
    }

    /* access modifiers changed from: package-private */
    public Rect i() {
        return this.f5636f;
    }

    public U.e j() {
        return this.f5633c;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f5639i;
    }

    public U.f l() {
        return this.f5634d;
    }

    /* access modifiers changed from: package-private */
    public U.g m() {
        return this.f5635e;
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return this.f5638h;
    }

    /* access modifiers changed from: package-private */
    public Matrix o() {
        return this.f5637g;
    }

    /* access modifiers changed from: package-private */
    public List<C5040p> p() {
        return this.f5641k;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f5632b + ", inMemoryCallback=" + this.f5633c + ", onDiskCallback=" + this.f5634d + ", outputFileOptions=" + this.f5635e + ", cropRect=" + this.f5636f + ", sensorToBufferTransform=" + this.f5637g + ", rotationDegrees=" + this.f5638h + ", jpegQuality=" + this.f5639i + ", captureMode=" + this.f5640j + ", sessionConfigCameraCaptureCallbacks=" + this.f5641k + "}";
    }
}
