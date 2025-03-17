package a9;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.C17542s;
import pI.C17752b;

/* renamed from: a9.f2  reason: case insensitive filesystem */
public final class C6824f2 {
    @SuppressLint({"NewApi"})

    /* renamed from: a  reason: collision with root package name */
    public final a f42549a;

    /* renamed from: a9.f2$a */
    public interface a {
        C6825f3<c> a(Window window, float f10);
    }

    /* renamed from: a9.f2$b */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final W1 f42550a;

        public b(W1 w12) {
            C17542s.j(w12, "pixelCopyInstantiable");
            this.f42550a = w12;
        }

        public static final void b(C6825f3 f3Var, c cVar, int i10) {
            C17542s.j(f3Var, "$screenCaptureDeferredResult");
            C17542s.j(cVar, "$screenCaptureResult");
            if (i10 == 0) {
                f3Var.b(cVar);
                return;
            }
            f3Var.c("PixelCopy capture failed: error " + i10);
        }

        public final C6825f3<c> a(Window window, float f10) {
            C17542s.j(window, "window");
            c cVar = new c();
            C6825f3<c> f3Var = new C6825f3<>();
            C17542s.j(window, "window");
            cVar.f42553c = window.getContext().getResources().getDisplayMetrics().density * f10;
            View decorView = window.getDecorView();
            C17542s.i(decorView, "window.decorView");
            cVar.f42551a.a(C17752b.e(((float) decorView.getWidth()) / cVar.f42553c), C17752b.e(((float) decorView.getHeight()) / cVar.f42553c));
            View decorView2 = window.getDecorView();
            C17542s.i(decorView2, "window.decorView");
            try {
                W1 w12 = this.f42550a;
                Bitmap bitmap = cVar.f42551a.f42915c;
                C6832g2 g2Var = new C6832g2(f3Var, cVar);
                Handler handler = decorView2.getHandler();
                w12.getClass();
                W1.b(window, bitmap, g2Var, handler);
            } catch (IllegalArgumentException e10) {
                f3Var.c("PixelCopy capture failed: window is not drawn yet. " + e10);
            }
            return f3Var;
        }
    }

    /* renamed from: a9.f2$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final C6957w0 f42551a = new C6957w0(1, 1);

        /* renamed from: b  reason: collision with root package name */
        public final C6957w0 f42552b = new C6957w0(1, 1);

        /* renamed from: c  reason: collision with root package name */
        public float f42553c;
    }

    public C6824f2() {
        W1 w12 = new W1();
        C17542s.j(w12, "pixelCopyInstantiable");
        this.f42549a = new b(w12);
    }
}
