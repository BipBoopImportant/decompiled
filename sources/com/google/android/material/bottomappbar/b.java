package com.google.android.material.bottomappbar;

import Ua.C9285f;
import Ua.m;

public class b extends C9285f implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private float f66070a;

    /* renamed from: b  reason: collision with root package name */
    private float f66071b;

    /* renamed from: c  reason: collision with root package name */
    private float f66072c;

    /* renamed from: d  reason: collision with root package name */
    private float f66073d;

    /* renamed from: e  reason: collision with root package name */
    private float f66074e;

    /* renamed from: f  reason: collision with root package name */
    private float f66075f;

    public void b(float f10, float f11, float f12, m mVar) {
        float f13;
        float f14;
        float f15 = f10;
        m mVar2 = mVar;
        float f16 = this.f66072c;
        if (f16 == 0.0f) {
            mVar2.m(f15, 0.0f);
            return;
        }
        float f17 = ((this.f66071b * 2.0f) + f16) / 2.0f;
        float f18 = f12 * this.f66070a;
        float f19 = f11 + this.f66074e;
        float f20 = (this.f66073d * f12) + ((1.0f - f12) * f17);
        if (f20 / f17 >= 1.0f) {
            mVar2.m(f15, 0.0f);
            return;
        }
        float f21 = this.f66075f;
        float f22 = f21 * f12;
        boolean z10 = f21 == -1.0f || Math.abs((f21 * 2.0f) - f16) < 0.1f;
        if (!z10) {
            f14 = 1.75f;
            f13 = 0.0f;
        } else {
            f13 = f20;
            f14 = 0.0f;
        }
        float f23 = f17 + f18;
        float f24 = f13 + f18;
        float sqrt = (float) Math.sqrt((double) ((f23 * f23) - (f24 * f24)));
        float f25 = f19 - sqrt;
        float f26 = f19 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f24)));
        float f27 = (90.0f - degrees) + f14;
        mVar2.m(f25, 0.0f);
        float f28 = f18 * 2.0f;
        float f29 = degrees;
        mVar.a(f25 - f18, 0.0f, f25 + f18, f28, 270.0f, degrees);
        if (z10) {
            mVar.a(f19 - f17, (-f17) - f13, f19 + f17, f17 - f13, 180.0f - f27, (f27 * 2.0f) - 180.0f);
        } else {
            float f30 = this.f66071b;
            float f31 = f22 * 2.0f;
            float f32 = f19 - f17;
            mVar.a(f32, -(f22 + f30), f32 + f30 + f31, f30 + f22, 180.0f - f27, ((f27 * 2.0f) - 180.0f) / 2.0f);
            float f33 = f19 + f17;
            float f34 = this.f66071b;
            mVar2.m(f33 - ((f34 / 2.0f) + f22), f34 + f22);
            float f35 = this.f66071b;
            mVar.a(f33 - (f31 + f35), -(f22 + f35), f33, f35 + f22, 90.0f, f27 - 0.049804688f);
        }
        mVar.a(f26 - f18, 0.0f, f26 + f18, f28, 270.0f - f29, f29);
        mVar2.m(f15, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f66073d;
    }

    public float d() {
        return this.f66075f;
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.f66071b;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.f66070a;
    }

    public float j() {
        return this.f66072c;
    }

    /* access modifiers changed from: package-private */
    public void k(float f10) {
        if (f10 >= 0.0f) {
            this.f66073d = f10;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void l(float f10) {
        this.f66075f = f10;
    }

    /* access modifiers changed from: package-private */
    public void m(float f10) {
        this.f66071b = f10;
    }

    /* access modifiers changed from: package-private */
    public void n(float f10) {
        this.f66070a = f10;
    }

    public void o(float f10) {
        this.f66072c = f10;
    }

    /* access modifiers changed from: package-private */
    public void p(float f10) {
        this.f66074e = f10;
    }
}
