package Fa;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import h3.a;
import h3.b;
import h3.c;

/* renamed from: Fa.a  reason: case insensitive filesystem */
public class C9081a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f60371a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f60372b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f60373c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f60374d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f60375e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(int i10, int i11, float f10) {
        return i10 + Math.round(f10 * ((float) (i11 - i10)));
    }
}
