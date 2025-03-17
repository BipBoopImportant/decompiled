package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

class D {

    /* renamed from: a  reason: collision with root package name */
    private static final G f44586a;

    /* renamed from: b  reason: collision with root package name */
    static final Property<View, Float> f44587b = new a(Float.class, "translationAlpha");

    /* renamed from: c  reason: collision with root package name */
    static final Property<View, Rect> f44588c = new b(Rect.class, "clipBounds");

    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(D.b(view));
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            D.e(view, f10.floatValue());
        }
    }

    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f44586a = new O();
        } else {
            f44586a = new N();
        }
    }

    static void a(View view) {
        f44586a.a(view);
    }

    static float b(View view) {
        return f44586a.b(view);
    }

    static void c(View view) {
        f44586a.c(view);
    }

    static void d(View view, int i10, int i11, int i12, int i13) {
        f44586a.d(view, i10, i11, i12, i13);
    }

    static void e(View view, float f10) {
        f44586a.e(view, f10);
    }

    static void f(View view, int i10) {
        f44586a.f(view, i10);
    }

    static void g(View view, Matrix matrix) {
        f44586a.g(view, matrix);
    }

    static void h(View view, Matrix matrix) {
        f44586a.h(view, matrix);
    }
}
