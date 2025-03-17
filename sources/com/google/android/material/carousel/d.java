package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private float f66316a;

    /* renamed from: b  reason: collision with root package name */
    private float f66317b;

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    static float b(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public float c() {
        return this.f66317b;
    }

    public float d() {
        return this.f66316a;
    }

    /* access modifiers changed from: package-private */
    public void e(Context context) {
        float f10 = this.f66316a;
        if (f10 <= 0.0f) {
            f10 = e.h(context);
        }
        this.f66316a = f10;
        float f11 = this.f66317b;
        if (f11 <= 0.0f) {
            f11 = e.g(context);
        }
        this.f66317b = f11;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public abstract f g(b bVar, View view);

    /* access modifiers changed from: package-private */
    public abstract boolean h(b bVar, int i10);
}
