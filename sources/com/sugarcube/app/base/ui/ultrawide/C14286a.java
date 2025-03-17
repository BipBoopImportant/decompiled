package com.sugarcube.app.base.ui.ultrawide;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import com.google.ar.core.CameraIntrinsics;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0010B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000e¨\u0006!"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/a;", "", "", "fx", "fy", "cx", "cy", "s", "<init>", "(FFFFF)V", "", "h", "()[F", "b", "()F", "c", "a", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "f", "g", "d", "e", "getS", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.sugarcube.app.base.ui.ultrawide.a  reason: case insensitive filesystem */
public final class C14286a {

    /* renamed from: f  reason: collision with root package name */
    public static final C3073a f125581f = new C3073a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final float f125582a;

    /* renamed from: b  reason: collision with root package name */
    private final float f125583b;

    /* renamed from: c  reason: collision with root package name */
    private final float f125584c;

    /* renamed from: d  reason: collision with root package name */
    private final float f125585d;

    /* renamed from: e  reason: collision with root package name */
    private final float f125586e;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/a$a;", "", "<init>", "()V", "Lcom/google/ar/core/CameraIntrinsics;", "cameraIntrinsics", "Lcom/sugarcube/app/base/ui/ultrawide/a;", "c", "(Lcom/google/ar/core/CameraIntrinsics;)Lcom/sugarcube/app/base/ui/ultrawide/a;", "Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", "Landroid/util/Size;", "imageSize", "", "zoom", "a", "(Landroid/hardware/camera2/CameraCharacteristics;Landroid/util/Size;F)Lcom/sugarcube/app/base/ui/ultrawide/a;", "angrad", "d", "(F)F", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.ultrawide.a$a  reason: collision with other inner class name */
    public static final class C3073a {
        public /* synthetic */ C3073a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C14286a b(C3073a aVar, CameraCharacteristics cameraCharacteristics, Size size, float f10, int i10, Object obj) {
            if ((i10 & 2) != 0 && (size = (Size) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE)) == null) {
                size = new Size(0, 0);
            }
            if ((i10 & 4) != 0) {
                f10 = 1.0f;
            }
            return aVar.a(cameraCharacteristics, size, f10);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
            if (r4 > 0.1f) goto L_0x0087;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
            if (r4 > 0.1f) goto L_0x009a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00a7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.sugarcube.app.base.ui.ultrawide.C14286a a(android.hardware.camera2.CameraCharacteristics r18, android.util.Size r19, float r20) {
            /*
                r17 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                java.lang.String r3 = "characteristics"
                kotlin.jvm.internal.C17542s.j(r0, r3)
                java.lang.String r3 = "imageSize"
                kotlin.jvm.internal.C17542s.j(r1, r3)
                android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_INTRINSIC_CALIBRATION
                java.lang.Object r3 = r0.get(r3)
                float[] r3 = (float[]) r3
                r4 = 0
                if (r3 != 0) goto L_0x001d
                float[] r3 = new float[r4]
            L_0x001d:
                android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS
                java.lang.Object r5 = r0.get(r5)
                float[] r5 = (float[]) r5
                if (r5 != 0) goto L_0x0029
                float[] r5 = new float[r4]
            L_0x0029:
                android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE
                java.lang.Object r0 = r0.get(r6)
                android.util.SizeF r0 = (android.util.SizeF) r0
                r6 = 0
                if (r0 != 0) goto L_0x0039
                android.util.SizeF r0 = new android.util.SizeF
                r0.<init>(r6, r6)
            L_0x0039:
                int r7 = r5.length
                if (r7 <= 0) goto L_0x003f
                r7 = r5[r4]
                goto L_0x0040
            L_0x003f:
                r7 = r6
            L_0x0040:
                float r8 = r7 * r2
                int r9 = r19.getWidth()
                float r9 = (float) r9
                float r8 = r8 * r9
                float r9 = r0.getWidth()
                float r8 = r8 / r9
                int r9 = r3.length
                r10 = 1036831949(0x3dcccccd, float:0.1)
                if (r9 <= 0) goto L_0x005b
                r4 = r3[r4]
                int r9 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x005b
                float r8 = r4 * r2
            L_0x005b:
                r12 = r8
                int r4 = r5.length
                r8 = 1
                if (r4 <= r8) goto L_0x0062
                r7 = r5[r8]
            L_0x0062:
                float r7 = r7 * r2
                int r4 = r19.getHeight()
                float r4 = (float) r4
                float r7 = r7 * r4
                float r4 = r0.getHeight()
                float r7 = r7 / r4
                int r4 = r3.length
                if (r4 <= r8) goto L_0x007a
                r4 = r3[r8]
                int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r8 <= 0) goto L_0x007a
                float r4 = r4 * r2
                r13 = r4
                goto L_0x007b
            L_0x007a:
                r13 = r7
            L_0x007b:
                int r4 = r3.length
                r7 = 1073741824(0x40000000, float:2.0)
                r8 = 2
                if (r4 <= r8) goto L_0x0089
                r4 = r3[r8]
                int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r8 <= 0) goto L_0x0089
            L_0x0087:
                r14 = r4
                goto L_0x0090
            L_0x0089:
                int r4 = r19.getWidth()
                float r4 = (float) r4
                float r4 = r4 / r7
                goto L_0x0087
            L_0x0090:
                int r4 = r3.length
                r8 = 3
                if (r4 <= r8) goto L_0x009c
                r4 = r3[r8]
                int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r8 <= 0) goto L_0x009c
            L_0x009a:
                r15 = r4
                goto L_0x00a3
            L_0x009c:
                int r4 = r19.getHeight()
                float r4 = (float) r4
                float r4 = r4 / r7
                goto L_0x009a
            L_0x00a3:
                int r4 = r3.length
                r7 = 4
                if (r4 <= r7) goto L_0x00a9
                r6 = r3[r7]
            L_0x00a9:
                r16 = r6
                com.sugarcube.app.base.ui.ultrawide.a r4 = new com.sugarcube.app.base.ui.ultrawide.a
                r11 = r4
                r11.<init>(r12, r13, r14, r15, r16)
                java.lang.String r3 = java.util.Arrays.toString(r3)
                java.lang.String r6 = "toString(...)"
                kotlin.jvm.internal.C17542s.i(r3, r6)
                java.lang.String r5 = java.util.Arrays.toString(r5)
                kotlin.jvm.internal.C17542s.i(r5, r6)
                float r6 = r0.getWidth()
                float r0 = r0.getHeight()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "CaptureIntrinsics.fromCameraCharacteristics("
                r7.append(r8)
                r7.append(r1)
                java.lang.String r1 = ","
                r7.append(r1)
                r7.append(r2)
                java.lang.String r2 = ") "
                r7.append(r2)
                r7.append(r3)
                java.lang.String r2 = " "
                r7.append(r2)
                r7.append(r5)
                java.lang.String r2 = " ["
                r7.append(r2)
                r7.append(r6)
                r7.append(r1)
                r7.append(r0)
                java.lang.String r0 = "] -> "
                r7.append(r0)
                r7.append(r4)
                java.lang.String r0 = r7.toString()
                java.lang.String r1 = "Sugarcube"
                android.util.Log.d(r1, r0)
                YE.b r1 = YE.C13868b.f118106a
                YE.e r2 = YE.e.Capture
                r1.b(r0, r2)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.C14286a.C3073a.a(android.hardware.camera2.CameraCharacteristics, android.util.Size, float):com.sugarcube.app.base.ui.ultrawide.a");
        }

        public final C14286a c(CameraIntrinsics cameraIntrinsics) {
            C17542s.j(cameraIntrinsics, "cameraIntrinsics");
            return new C14286a(cameraIntrinsics.getFocalLength()[0], cameraIntrinsics.getFocalLength()[1], cameraIntrinsics.getPrincipalPoint()[0], cameraIntrinsics.getPrincipalPoint()[1], 0.0f, 16, (DefaultConstructorMarker) null);
        }

        public final float d(float f10) {
            return (float) Math.toDegrees((double) f10);
        }

        private C3073a() {
        }
    }

    public C14286a() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, (DefaultConstructorMarker) null);
    }

    public final float[] a() {
        return new float[]{b(), c()};
    }

    public final float b() {
        return f125581f.d((float) Math.atan2((double) this.f125584c, (double) this.f125582a)) * ((float) 2);
    }

    public final float c() {
        return f125581f.d((float) Math.atan2((double) this.f125585d, (double) this.f125583b)) * ((float) 2);
    }

    public final float d() {
        return this.f125584c;
    }

    public final float e() {
        return this.f125585d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14286a)) {
            return false;
        }
        C14286a aVar = (C14286a) obj;
        return Float.compare(this.f125582a, aVar.f125582a) == 0 && Float.compare(this.f125583b, aVar.f125583b) == 0 && Float.compare(this.f125584c, aVar.f125584c) == 0 && Float.compare(this.f125585d, aVar.f125585d) == 0 && Float.compare(this.f125586e, aVar.f125586e) == 0;
    }

    public final float f() {
        return this.f125582a;
    }

    public final float g() {
        return this.f125583b;
    }

    public final float[] h() {
        return new float[]{this.f125582a, this.f125586e, this.f125584c, 0.0f, this.f125583b, this.f125585d, 0.0f, 0.0f, 1.0f};
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.f125582a) * 31) + Float.hashCode(this.f125583b)) * 31) + Float.hashCode(this.f125584c)) * 31) + Float.hashCode(this.f125585d)) * 31) + Float.hashCode(this.f125586e);
    }

    public String toString() {
        float f10 = this.f125582a;
        float f11 = this.f125583b;
        float f12 = this.f125584c;
        float f13 = this.f125585d;
        float f14 = this.f125586e;
        return "[" + f10 + "," + f11 + "," + f12 + "," + f13 + "," + f14 + "]";
    }

    public C14286a(float f10, float f11, float f12, float f13, float f14) {
        this.f125582a = f10;
        this.f125583b = f11;
        this.f125584c = f12;
        this.f125585d = f13;
        this.f125586e = f14;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C14286a(float r5, float r6, float r7, float r8, float r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.C14286a.<init>(float, float, float, float, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
