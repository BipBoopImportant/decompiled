package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

class L extends J {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f44610f = true;

    static class a {
        static void a(View view, int i10, int i11, int i12, int i13) {
            view.setLeftTopRightBottom(i10, i11, i12, i13);
        }
    }

    L() {
    }

    @SuppressLint({"NewApi"})
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f44610f) {
            try {
                a.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f44610f = false;
            }
        }
    }
}
