package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

class G {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f44605a = true;

    /* renamed from: b  reason: collision with root package name */
    private static Field f44606b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f44607c;

    static class a {
        static float a(View view) {
            return view.getTransitionAlpha();
        }

        static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    G() {
    }

    public void a(View view) {
    }

    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (f44605a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f44605a = false;
            }
        }
        return view.getAlpha();
    }

    public void c(View view) {
    }

    @SuppressLint({"BanUncheckedReflection"})
    public void d(View view, int i10, int i11, int i12, int i13) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public void e(View view, float f10) {
        if (f44605a) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f44605a = false;
            }
        }
        view.setAlpha(f10);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void f(View view, int i10) {
        if (!f44607c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f44606b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f44607c = true;
        }
        Field field = f44606b;
        if (field != null) {
            try {
                f44606b.setInt(view, i10 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void g(View view, Matrix matrix) {
        throw null;
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }
}
