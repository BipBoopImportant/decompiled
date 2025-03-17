package I2;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: I2.o0  reason: case insensitive filesystem */
public final class C4626o0 {

    /* renamed from: I2.o0$a */
    static class a {
        static void a(Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & -1793 : systemUiVisibility | 1792);
        }
    }

    /* renamed from: I2.o0$b */
    static class b {
        static void a(Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & -257 : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z10);
        }
    }

    /* renamed from: I2.o0$c */
    static class c {
        static void a(Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    public static b1 a(Window window, View view) {
        return new b1(window, view);
    }

    public static void b(Window window, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            c.a(window, z10);
        } else if (i10 >= 30) {
            b.a(window, z10);
        } else {
            a.a(window, z10);
        }
    }
}
