package com.google.ar.core;

import com.google.ar.core.annotations.UsedByNative;
import java.util.Locale;

@UsedByNative("session_jni_wrapper.cc")
class Quaternion {

    /* renamed from: a  reason: collision with root package name */
    public static final Quaternion f67701a = new Quaternion();
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: w  reason: collision with root package name */
    private float f67702w = 1.0f;
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: x  reason: collision with root package name */
    private float f67703x = 0.0f;
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: y  reason: collision with root package name */
    private float f67704y = 0.0f;
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: z  reason: collision with root package name */
    private float f67705z = 0.0f;

    public Quaternion() {
        a(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public static Quaternion i(Quaternion quaternion, Quaternion quaternion2, float f10) {
        Quaternion quaternion3 = new Quaternion();
        float f11 = (quaternion.f67703x * quaternion2.f67703x) + (quaternion.f67704y * quaternion2.f67704y) + (quaternion.f67705z * quaternion2.f67705z) + (quaternion.f67702w * quaternion2.f67702w);
        if (f11 < 0.0f) {
            Quaternion quaternion4 = new Quaternion(quaternion2);
            f11 = -f11;
            quaternion4.f67703x = -quaternion4.f67703x;
            quaternion4.f67704y = -quaternion4.f67704y;
            quaternion4.f67705z = -quaternion4.f67705z;
            quaternion4.f67702w = -quaternion4.f67702w;
            quaternion2 = quaternion4;
        }
        float f12 = 1.0f - f10;
        float acos = (float) Math.acos((double) f11);
        float sqrt = (float) Math.sqrt((double) (1.0f - (f11 * f11)));
        if (((double) Math.abs(sqrt)) > 0.001d) {
            float f13 = 1.0f / sqrt;
            f10 = ((float) Math.sin((double) (f10 * acos))) * f13;
            f12 = ((float) Math.sin((double) (f12 * acos))) * f13;
        }
        float f14 = (quaternion.f67703x * f12) + (quaternion2.f67703x * f10);
        quaternion3.f67703x = f14;
        float f15 = (quaternion.f67704y * f12) + (quaternion2.f67704y * f10);
        quaternion3.f67704y = f15;
        float f16 = (quaternion.f67705z * f12) + (quaternion2.f67705z * f10);
        quaternion3.f67705z = f16;
        float f17 = (f12 * quaternion.f67702w) + (f10 * quaternion2.f67702w);
        quaternion3.f67702w = f17;
        float sqrt2 = (float) (1.0d / Math.sqrt((double) ((((f14 * f14) + (f15 * f15)) + (f16 * f16)) + (f17 * f17))));
        quaternion3.f67703x *= sqrt2;
        quaternion3.f67704y *= sqrt2;
        quaternion3.f67705z *= sqrt2;
        quaternion3.f67702w *= sqrt2;
        return quaternion3;
    }

    public static void j(Quaternion quaternion, float[] fArr, int i10, float[] fArr2, int i11) {
        Quaternion quaternion2 = quaternion;
        float f10 = fArr[i10];
        float f11 = fArr[i10 + 1];
        float f12 = fArr[i10 + 2];
        float f13 = quaternion2.f67703x;
        float f14 = quaternion2.f67704y;
        float f15 = quaternion2.f67705z;
        float f16 = quaternion2.f67702w;
        float f17 = f14 * f12;
        float f18 = f15 * f11;
        float f19 = f16 * f11;
        float f20 = f15 * f10;
        float f21 = f13 * f12;
        float f22 = f16 * f12;
        float f23 = f13 * f11;
        float f24 = f14 * f10;
        float f25 = -f13;
        float f26 = f11 * f14;
        float f27 = f12 * f15;
        float f28 = ((f16 * f10) + f17) - f18;
        float f29 = -f15;
        float f30 = -f14;
        float f31 = (f22 + f23) - f24;
        float f32 = (f19 + f20) - f21;
        float f33 = ((f10 * f25) - f26) - f27;
        fArr2[i11] = (((f28 * f16) + (f33 * f25)) + (f32 * f29)) - (f31 * f30);
        fArr2[i11 + 1] = (((f32 * f16) + (f33 * f30)) + (f31 * f25)) - (f28 * f29);
        fArr2[i11 + 2] = (((f31 * f16) + (f33 * f29)) + (f28 * f30)) - (f32 * f25);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        this.f67703x = f10;
        this.f67704y = f11;
        this.f67705z = f12;
        this.f67702w = f13;
    }

    public final float b() {
        return this.f67703x;
    }

    public final float c() {
        return this.f67704y;
    }

    public final float d() {
        return this.f67705z;
    }

    public final float e() {
        return this.f67702w;
    }

    public final void f(float[] fArr, int i10) {
        fArr[i10] = this.f67703x;
        fArr[i10 + 1] = this.f67704y;
        fArr[i10 + 2] = this.f67705z;
        fArr[i10 + 3] = this.f67702w;
    }

    public final Quaternion g() {
        return new Quaternion(-this.f67703x, -this.f67704y, -this.f67705z, this.f67702w);
    }

    public final Quaternion h(Quaternion quaternion) {
        Quaternion quaternion2 = new Quaternion();
        float f10 = this.f67703x;
        float f11 = quaternion.f67702w;
        float f12 = this.f67704y;
        float f13 = quaternion.f67705z;
        float f14 = this.f67705z;
        float f15 = quaternion.f67704y;
        float f16 = this.f67702w;
        quaternion2.f67703x = (((f10 * f11) + (f12 * f13)) - (f14 * f15)) + (quaternion.f67703x * f16);
        float f17 = this.f67703x;
        float f18 = -f17;
        float f19 = quaternion.f67703x;
        quaternion2.f67704y = (f18 * f13) + (f12 * f11) + (f14 * f19) + (f15 * f16);
        float f20 = quaternion.f67704y;
        float f21 = this.f67704y;
        quaternion2.f67705z = ((f17 * f20) - (f21 * f19)) + (f14 * f11) + (f13 * f16);
        quaternion2.f67702w = (((f18 * f19) - (f21 * f20)) - (this.f67705z * quaternion.f67705z)) + (f16 * f11);
        return quaternion2;
    }

    public final void k(float[] fArr, int i10) {
        float f10 = this.f67703x;
        float f11 = this.f67704y;
        float f12 = this.f67705z;
        float f13 = this.f67702w;
        float f14 = (f10 * f10) + (f11 * f11) + (f12 * f12) + (f13 * f13);
        float f15 = 0.0f;
        if (f14 > 0.0f) {
            f15 = 2.0f / f14;
        }
        float f16 = f10 * f15;
        float f17 = f11 * f15;
        float f18 = f15 * f12;
        float f19 = f13 * f16;
        float f20 = f13 * f17;
        float f21 = f13 * f18;
        float f22 = f16 * f10;
        float f23 = f10 * f17;
        float f24 = f10 * f18;
        float f25 = f17 * f11;
        float f26 = f11 * f18;
        float f27 = f12 * f18;
        fArr[i10] = 1.0f - (f25 + f27);
        fArr[i10 + 4] = f23 - f21;
        fArr[i10 + 8] = f24 + f20;
        fArr[i10 + 1] = f23 + f21;
        fArr[i10 + 5] = 1.0f - (f27 + f22);
        fArr[i10 + 9] = f26 - f19;
        fArr[i10 + 2] = f24 - f20;
        fArr[i10 + 6] = f26 + f19;
        fArr[i10 + 10] = 1.0f - (f22 + f25);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "[%.3f, %.3f, %.3f, %.3f]", new Object[]{Float.valueOf(this.f67703x), Float.valueOf(this.f67704y), Float.valueOf(this.f67705z), Float.valueOf(this.f67702w)});
    }

    @UsedByNative("session_jni_wrapper.cc")
    public Quaternion(float f10, float f11, float f12, float f13) {
        a(f10, f11, f12, f13);
    }

    public Quaternion(Quaternion quaternion) {
        a(quaternion.f67703x, quaternion.f67704y, quaternion.f67705z, quaternion.f67702w);
    }
}
