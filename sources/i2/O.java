package I2;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class O {

    /* renamed from: a  reason: collision with root package name */
    private final c f8605a;

    private static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private final View f8606a;

        a(View view) {
            this.f8606a = view;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            View view = this.f8606a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f8606a.getWindowToken(), 0);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            View view = this.f8606a;
            if (view != null) {
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = view.getRootView().findFocus();
                }
                if (view == null) {
                    view = this.f8606a.getRootView().findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new N(view));
                }
            }
        }
    }

    private static class c {
        c() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            throw null;
        }
    }

    public O(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f8605a = new b(view);
        } else {
            this.f8605a = new a(view);
        }
    }

    public void a() {
        this.f8605a.a();
    }

    public void b() {
        this.f8605a.b();
    }

    private static class b extends a {

        /* renamed from: b  reason: collision with root package name */
        private View f8607b;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsetsController f8608c;

        b(View view) {
            super(view);
            this.f8607b = view;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void f(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i10) {
            atomicBoolean.set((i10 & 8) != 0);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f8608c;
            if (windowInsetsController == null) {
                View view2 = this.f8607b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                W w10 = new W(atomicBoolean);
                windowInsetsController.addOnControllableInsetsChangedListener(w10);
                if (!atomicBoolean.get() && (view = this.f8607b) != null) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f8607b.getWindowToken(), 0);
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(w10);
                windowInsetsController.hide(WindowInsets.Type.ime());
                return;
            }
            super.a();
        }

        /* access modifiers changed from: package-private */
        public void b() {
            View view = this.f8607b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f8608c;
            if (windowInsetsController == null) {
                View view2 = this.f8607b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }

        b(WindowInsetsController windowInsetsController) {
            super((View) null);
            this.f8608c = windowInsetsController;
        }
    }

    @Deprecated
    O(WindowInsetsController windowInsetsController) {
        this.f8605a = new b(windowInsetsController);
    }
}
