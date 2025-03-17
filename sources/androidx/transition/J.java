package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

class J extends G {

    /* renamed from: d  reason: collision with root package name */
    private static boolean f44608d = true;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f44609e = true;

    static class a {
        static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    J() {
    }

    @SuppressLint({"NewApi"})
    public void g(View view, Matrix matrix) {
        if (f44608d) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f44608d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f44609e) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f44609e = false;
            }
        }
    }
}
