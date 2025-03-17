package Ua;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.v;

public class h {
    static C9283d a(int i10) {
        return i10 != 0 ? i10 != 1 ? b() : new C9284e() : new j();
    }

    static C9283d b() {
        return new j();
    }

    static C9285f c() {
        return new C9285f();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof C9286g) {
            ((C9286g) background).a0(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C9286g) {
            f(view, (C9286g) background);
        }
    }

    public static void f(View view, C9286g gVar) {
        if (gVar.S()) {
            gVar.e0(v.g(view));
        }
    }
}
