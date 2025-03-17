package com.google.android.material.internal;

import I2.C0;
import I2.C4600b0;
import I2.I;
import I2.b1;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import u2.C6012a;

public class v {

    class a implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f67026a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f67027b;

        a(c cVar, d dVar) {
            this.f67026a = cVar;
            this.f67027b = dVar;
        }

        public C0 a(View view, C0 c02) {
            return this.f67026a.a(view, c02, new d(this.f67027b));
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C4600b0.l0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        C0 a(View view, C0 c02, d dVar);
    }

    public static void b(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void c(View view, c cVar) {
        C4600b0.E0(view, new a(cVar, new d(C4600b0.E(view), view.getPaddingTop(), C4600b0.D(view), view.getPaddingBottom())));
        n(view);
    }

    public static float d(Context context, int i10) {
        return TypedValue.applyDimension(1, (float) i10, context.getResources().getDisplayMetrics());
    }

    public static Integer e(View view) {
        ColorStateList f10 = com.google.android.material.drawable.d.f(view.getBackground());
        if (f10 != null) {
            return Integer.valueOf(f10.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager f(View view) {
        return (InputMethodManager) C6012a.j(view.getContext(), InputMethodManager.class);
    }

    public static float g(View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f10 += C4600b0.u((View) parent);
        }
        return f10;
    }

    public static void h(View view, boolean z10) {
        b1 K10;
        if (!z10 || (K10 = C4600b0.K(view)) == null) {
            InputMethodManager f10 = f(view);
            if (f10 != null) {
                f10.hideSoftInputFromWindow(view.getWindowToken(), 0);
                return;
            }
            return;
        }
        K10.a(C0.l.c());
    }

    public static boolean i(View view) {
        return C4600b0.z(view) == 1;
    }

    public static PorterDuff.Mode k(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void l(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            m(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void m(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void n(View view) {
        if (C4600b0.R(view)) {
            C4600b0.l0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void o(View view, boolean z10) {
        view.requestFocus();
        view.post(new u(view, z10));
    }

    public static void p(View view, boolean z10) {
        b1 K10;
        if (!z10 || (K10 = C4600b0.K(view)) == null) {
            f(view).showSoftInput(view, 1);
        } else {
            K10.f(C0.l.c());
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f67028a;

        /* renamed from: b  reason: collision with root package name */
        public int f67029b;

        /* renamed from: c  reason: collision with root package name */
        public int f67030c;

        /* renamed from: d  reason: collision with root package name */
        public int f67031d;

        public d(int i10, int i11, int i12, int i13) {
            this.f67028a = i10;
            this.f67029b = i11;
            this.f67030c = i12;
            this.f67031d = i13;
        }

        public d(d dVar) {
            this.f67028a = dVar.f67028a;
            this.f67029b = dVar.f67029b;
            this.f67030c = dVar.f67030c;
            this.f67031d = dVar.f67031d;
        }
    }
}
