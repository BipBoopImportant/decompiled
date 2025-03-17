package com.contentsquare.android.sdk;

import android.graphics.Point;
import android.graphics.Rect;

public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public final a f47282a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final Point f47283b = new Point();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f47284a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public float f47285b;
    }

    public final a a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        float f10;
        a aVar = this.f47282a;
        Rect rect = aVar.f47284a;
        rect.left = i10;
        rect.top = i11;
        int i18 = i10 + i12;
        rect.right = i18;
        int i19 = i11 + i13;
        rect.bottom = i19;
        boolean z11 = true;
        if (i10 < i14) {
            rect.left = i14;
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 < i15) {
            rect.top = i15;
            z10 = true;
        }
        int i20 = i14 + i16;
        if (i18 > i20) {
            rect.right = i20;
            z10 = true;
        }
        int i21 = i15 + i17;
        if (i19 > i21) {
            rect.bottom = i21;
        } else {
            z11 = z10;
        }
        if (z11) {
            int i22 = i12 * i13;
            int height = this.f47282a.f47284a.height() * rect.width();
            f10 = (i22 == 0 || height == 0) ? 1.0f : ((float) height) / ((float) i22);
        } else {
            f10 = 0.0f;
        }
        aVar.f47285b = f10;
        return this.f47282a;
    }
}
