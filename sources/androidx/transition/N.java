package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

class N extends L {

    /* renamed from: g  reason: collision with root package name */
    private static boolean f44611g = true;

    static class a {
        static void a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    N() {
    }

    @SuppressLint({"NewApi"})
    public void f(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f44611g) {
            try {
                a.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f44611g = false;
            }
        }
    }
}
