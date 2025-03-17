package I2;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.recyclerview.widget.RecyclerView;
import j0.b0;

public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    private final g f8644a;

    private static class a extends g {

        /* renamed from: a  reason: collision with root package name */
        protected final Window f8645a;

        /* renamed from: b  reason: collision with root package name */
        private final O f8646b;

        a(Window window, O o10) {
            this.f8645a = window;
            this.f8646b = o10;
        }

        private void g(int i10) {
            if (i10 == 1) {
                h(4);
            } else if (i10 == 2) {
                h(2);
            } else if (i10 == 8) {
                this.f8646b.a();
            }
        }

        private void j(int i10) {
            if (i10 == 1) {
                k(4);
                l(1024);
            } else if (i10 == 2) {
                k(2);
            } else if (i10 == 8) {
                this.f8646b.b();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    g(i11);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e(int i10) {
            this.f8645a.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                k(6144);
            } else if (i10 == 1) {
                k(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
                h(RecyclerView.n.FLAG_MOVED);
            } else if (i10 == 2) {
                k(RecyclerView.n.FLAG_MOVED);
                h(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
            }
        }

        /* access modifiers changed from: package-private */
        public void f(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    j(i11);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(int i10) {
            View decorView = this.f8645a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void i(int i10) {
            this.f8645a.addFlags(i10);
        }

        /* access modifiers changed from: protected */
        public void k(int i10) {
            View decorView = this.f8645a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void l(int i10) {
            this.f8645a.clearFlags(i10);
        }
    }

    private static class b extends a {
        b(Window window, O o10) {
            super(window, o10);
        }

        public boolean b() {
            return (this.f8645a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        public void d(boolean z10) {
            if (z10) {
                l(67108864);
                i(Integer.MIN_VALUE);
                h(8192);
                return;
            }
            k(8192);
        }
    }

    private static class c extends b {
        c(Window window, O o10) {
            super(window, o10);
        }

        public void c(boolean z10) {
            if (z10) {
                l(134217728);
                i(Integer.MIN_VALUE);
                h(16);
                return;
            }
            k(16);
        }
    }

    private static class e extends d {
        e(Window window, b1 b1Var, O o10) {
            super(window, b1Var, o10);
        }

        /* access modifiers changed from: package-private */
        public void e(int i10) {
            this.f8648b.setSystemBarsBehavior(i10);
        }

        e(WindowInsetsController windowInsetsController, b1 b1Var, O o10) {
            super(windowInsetsController, b1Var, o10);
        }
    }

    private static class f extends e {
        f(Window window, b1 b1Var, O o10) {
            super(window, b1Var, o10);
        }

        public boolean b() {
            return (d1.a(this.f8648b) & 8) != 0;
        }

        f(WindowInsetsController windowInsetsController, b1 b1Var, O o10) {
            super(windowInsetsController, b1Var, o10);
        }
    }

    private static class g {
        g() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void e(int i10) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void f(int i10) {
            throw null;
        }
    }

    @Deprecated
    private b1(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f8644a = new f(windowInsetsController, this, new O(windowInsetsController));
        } else {
            this.f8644a = new d(windowInsetsController, this, new O(windowInsetsController));
        }
    }

    @Deprecated
    public static b1 g(WindowInsetsController windowInsetsController) {
        return new b1(windowInsetsController);
    }

    public void a(int i10) {
        this.f8644a.a(i10);
    }

    public boolean b() {
        return this.f8644a.b();
    }

    public void c(boolean z10) {
        this.f8644a.c(z10);
    }

    public void d(boolean z10) {
        this.f8644a.d(z10);
    }

    public void e(int i10) {
        this.f8644a.e(i10);
    }

    public void f(int i10) {
        this.f8644a.f(i10);
    }

    private static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        final b1 f8647a;

        /* renamed from: b  reason: collision with root package name */
        final WindowInsetsController f8648b;

        /* renamed from: c  reason: collision with root package name */
        final O f8649c;

        /* renamed from: d  reason: collision with root package name */
        private final b0<Object, WindowInsetsController.OnControllableInsetsChangedListener> f8650d;

        /* renamed from: e  reason: collision with root package name */
        protected Window f8651e;

        d(Window window, b1 b1Var, O o10) {
            this(window.getInsetsController(), b1Var, o10);
            this.f8651e = window;
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            if ((i10 & 8) != 0) {
                this.f8649c.a();
            }
            this.f8648b.hide(i10 & -9);
        }

        public boolean b() {
            this.f8648b.setSystemBarsAppearance(0, 0);
            return (d1.a(this.f8648b) & 8) != 0;
        }

        public void c(boolean z10) {
            if (z10) {
                if (this.f8651e != null) {
                    g(16);
                }
                this.f8648b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f8651e != null) {
                h(16);
            }
            this.f8648b.setSystemBarsAppearance(0, 16);
        }

        public void d(boolean z10) {
            if (z10) {
                if (this.f8651e != null) {
                    g(8192);
                }
                this.f8648b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f8651e != null) {
                h(8192);
            }
            this.f8648b.setSystemBarsAppearance(0, 8);
        }

        /* access modifiers changed from: package-private */
        public void e(int i10) {
            Window window = this.f8651e;
            if (window != null) {
                window.getDecorView().setTag(356039078, Integer.valueOf(i10));
                if (i10 == 0) {
                    h(6144);
                } else if (i10 == 1) {
                    h(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
                    g(RecyclerView.n.FLAG_MOVED);
                } else if (i10 == 2) {
                    h(RecyclerView.n.FLAG_MOVED);
                    g(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
                }
            } else {
                this.f8648b.setSystemBarsBehavior(i10);
            }
        }

        /* access modifiers changed from: package-private */
        public void f(int i10) {
            if ((i10 & 8) != 0) {
                this.f8649c.b();
            }
            this.f8648b.show(i10 & -9);
        }

        /* access modifiers changed from: protected */
        public void g(int i10) {
            View decorView = this.f8651e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void h(int i10) {
            View decorView = this.f8651e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, b1 b1Var, O o10) {
            this.f8650d = new b0<>();
            this.f8648b = windowInsetsController;
            this.f8647a = b1Var;
            this.f8649c = o10;
        }
    }

    public b1(Window window, View view) {
        O o10 = new O(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f8644a = new f(window, this, o10);
        } else if (i10 >= 30) {
            this.f8644a = new d(window, this, o10);
        } else {
            this.f8644a = new c(window, o10);
        }
    }
}
