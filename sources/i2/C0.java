package I2;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class C0 {

    /* renamed from: b  reason: collision with root package name */
    public static final C0 f8564b;

    /* renamed from: a  reason: collision with root package name */
    private final k f8565a;

    private static class d extends c {
        d() {
        }

        /* access modifiers changed from: package-private */
        public void c(int i10, x2.d dVar) {
            WindowInsets.Builder unused = this.f8573c.setInsets(m.a(i10), dVar.f());
        }

        d(C0 c02) {
            super(c02);
        }
    }

    private static class e {

        /* renamed from: a  reason: collision with root package name */
        private final C0 f8574a;

        /* renamed from: b  reason: collision with root package name */
        x2.d[] f8575b;

        e() {
            this(new C0((C0) null));
        }

        /* access modifiers changed from: protected */
        public final void a() {
            x2.d[] dVarArr = this.f8575b;
            if (dVarArr != null) {
                x2.d dVar = dVarArr[l.d(1)];
                x2.d dVar2 = this.f8575b[l.d(2)];
                if (dVar2 == null) {
                    dVar2 = this.f8574a.f(2);
                }
                if (dVar == null) {
                    dVar = this.f8574a.f(1);
                }
                g(x2.d.a(dVar, dVar2));
                x2.d dVar3 = this.f8575b[l.d(16)];
                if (dVar3 != null) {
                    f(dVar3);
                }
                x2.d dVar4 = this.f8575b[l.d(32)];
                if (dVar4 != null) {
                    d(dVar4);
                }
                x2.d dVar5 = this.f8575b[l.d(64)];
                if (dVar5 != null) {
                    h(dVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public C0 b() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void c(int i10, x2.d dVar) {
            if (this.f8575b == null) {
                this.f8575b = new x2.d[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f8575b[l.d(i11)] = dVar;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(x2.d dVar) {
        }

        /* access modifiers changed from: package-private */
        public void e(x2.d dVar) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void f(x2.d dVar) {
        }

        /* access modifiers changed from: package-private */
        public void g(x2.d dVar) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void h(x2.d dVar) {
        }

        e(C0 c02) {
            this.f8574a = c02;
        }
    }

    private static class h extends g {
        h(C0 c02, WindowInsets windowInsets) {
            super(c02, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public C0 a() {
            return C0.y(this.f8581c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f8581c, hVar.f8581c) && Objects.equals(this.f8585g, hVar.f8585g);
        }

        /* access modifiers changed from: package-private */
        public r f() {
            return r.f(this.f8581c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f8581c.hashCode();
        }

        h(C0 c02, h hVar) {
            super(c02, (g) hVar);
        }
    }

    private static class j extends i {

        /* renamed from: q  reason: collision with root package name */
        static final C0 f8590q = C0.y(WindowInsets.CONSUMED);

        j(C0 c02, WindowInsets windowInsets) {
            super(c02, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public final void d(View view) {
        }

        public x2.d g(int i10) {
            return x2.d.e(this.f8581c.getInsets(m.a(i10)));
        }

        public x2.d h(int i10) {
            return x2.d.e(this.f8581c.getInsetsIgnoringVisibility(m.a(i10)));
        }

        public boolean q(int i10) {
            return this.f8581c.isVisible(m.a(i10));
        }

        j(C0 c02, j jVar) {
            super(c02, (i) jVar);
        }
    }

    private static class k {

        /* renamed from: b  reason: collision with root package name */
        static final C0 f8591b = new a().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        final C0 f8592a;

        k(C0 c02) {
            this.f8592a = c02;
        }

        /* access modifiers changed from: package-private */
        public C0 a() {
            return this.f8592a;
        }

        /* access modifiers changed from: package-private */
        public C0 b() {
            return this.f8592a;
        }

        /* access modifiers changed from: package-private */
        public C0 c() {
            return this.f8592a;
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
        }

        /* access modifiers changed from: package-private */
        public void e(C0 c02) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return p() == kVar.p() && o() == kVar.o() && H2.c.a(l(), kVar.l()) && H2.c.a(j(), kVar.j()) && H2.c.a(f(), kVar.f());
        }

        /* access modifiers changed from: package-private */
        public r f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public x2.d g(int i10) {
            return x2.d.f31835e;
        }

        /* access modifiers changed from: package-private */
        public x2.d h(int i10) {
            if ((i10 & 8) == 0) {
                return x2.d.f31835e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return H2.c.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        /* access modifiers changed from: package-private */
        public x2.d i() {
            return l();
        }

        /* access modifiers changed from: package-private */
        public x2.d j() {
            return x2.d.f31835e;
        }

        /* access modifiers changed from: package-private */
        public x2.d k() {
            return l();
        }

        /* access modifiers changed from: package-private */
        public x2.d l() {
            return x2.d.f31835e;
        }

        /* access modifiers changed from: package-private */
        public x2.d m() {
            return l();
        }

        /* access modifiers changed from: package-private */
        public C0 n(int i10, int i11, int i12, int i13) {
            return f8591b;
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean p() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean q(int i10) {
            return true;
        }

        public void r(x2.d[] dVarArr) {
        }

        /* access modifiers changed from: package-private */
        public void s(x2.d dVar) {
        }

        /* access modifiers changed from: package-private */
        public void t(C0 c02) {
        }

        public void u(x2.d dVar) {
        }
    }

    public static final class l {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        static int d(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 7;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    private static final class m {
        static int a(int i10) {
            int a10;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        a10 = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        a10 = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        a10 = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        a10 = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        a10 = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        a10 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        a10 = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        a10 = WindowInsets.Type.displayCutout();
                    }
                    i11 |= a10;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f8564b = j.f8590q;
        } else {
            f8564b = k.f8591b;
        }
    }

    private C0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f8565a = new j(this, windowInsets);
        } else if (i10 >= 29) {
            this.f8565a = new i(this, windowInsets);
        } else if (i10 >= 28) {
            this.f8565a = new h(this, windowInsets);
        } else {
            this.f8565a = new g(this, windowInsets);
        }
    }

    static x2.d p(x2.d dVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, dVar.f31836a - i10);
        int max2 = Math.max(0, dVar.f31837b - i11);
        int max3 = Math.max(0, dVar.f31838c - i12);
        int max4 = Math.max(0, dVar.f31839d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? dVar : x2.d.b(max, max2, max3, max4);
    }

    public static C0 y(WindowInsets windowInsets) {
        return z(windowInsets, (View) null);
    }

    public static C0 z(WindowInsets windowInsets, View view) {
        C0 c02 = new C0((WindowInsets) H2.i.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c02.v(C4600b0.G(view));
            c02.d(view.getRootView());
        }
        return c02;
    }

    @Deprecated
    public C0 a() {
        return this.f8565a.a();
    }

    @Deprecated
    public C0 b() {
        return this.f8565a.b();
    }

    @Deprecated
    public C0 c() {
        return this.f8565a.c();
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        this.f8565a.d(view);
    }

    public r e() {
        return this.f8565a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        return H2.c.a(this.f8565a, ((C0) obj).f8565a);
    }

    public x2.d f(int i10) {
        return this.f8565a.g(i10);
    }

    public x2.d g(int i10) {
        return this.f8565a.h(i10);
    }

    @Deprecated
    public x2.d h() {
        return this.f8565a.j();
    }

    public int hashCode() {
        k kVar = this.f8565a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    @Deprecated
    public x2.d i() {
        return this.f8565a.k();
    }

    @Deprecated
    public int j() {
        return this.f8565a.l().f31839d;
    }

    @Deprecated
    public int k() {
        return this.f8565a.l().f31836a;
    }

    @Deprecated
    public int l() {
        return this.f8565a.l().f31838c;
    }

    @Deprecated
    public int m() {
        return this.f8565a.l().f31837b;
    }

    @Deprecated
    public boolean n() {
        return !this.f8565a.l().equals(x2.d.f31835e);
    }

    public C0 o(int i10, int i11, int i12, int i13) {
        return this.f8565a.n(i10, i11, i12, i13);
    }

    public boolean q() {
        return this.f8565a.o();
    }

    public boolean r(int i10) {
        return this.f8565a.q(i10);
    }

    @Deprecated
    public C0 s(int i10, int i11, int i12, int i13) {
        return new a(this).d(x2.d.b(i10, i11, i12, i13)).a();
    }

    /* access modifiers changed from: package-private */
    public void t(x2.d[] dVarArr) {
        this.f8565a.r(dVarArr);
    }

    /* access modifiers changed from: package-private */
    public void u(x2.d dVar) {
        this.f8565a.s(dVar);
    }

    /* access modifiers changed from: package-private */
    public void v(C0 c02) {
        this.f8565a.t(c02);
    }

    /* access modifiers changed from: package-private */
    public void w(x2.d dVar) {
        this.f8565a.u(dVar);
    }

    public WindowInsets x() {
        k kVar = this.f8565a;
        if (kVar instanceof f) {
            return ((f) kVar).f8581c;
        }
        return null;
    }

    private static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        private static Field f8567e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f8568f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor<WindowInsets> f8569g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f8570h = false;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsets f8571c;

        /* renamed from: d  reason: collision with root package name */
        private x2.d f8572d;

        b() {
            this.f8571c = i();
        }

        private static WindowInsets i() {
            Class<WindowInsets> cls = WindowInsets.class;
            if (!f8568f) {
                try {
                    f8567e = cls.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f8568f = true;
            }
            Field field = f8567e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f8570h) {
                try {
                    f8569g = cls.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f8570h = true;
            }
            Constructor<WindowInsets> constructor = f8569g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public C0 b() {
            a();
            C0 y10 = C0.y(this.f8571c);
            y10.t(this.f8575b);
            y10.w(this.f8572d);
            return y10;
        }

        /* access modifiers changed from: package-private */
        public void e(x2.d dVar) {
            this.f8572d = dVar;
        }

        /* access modifiers changed from: package-private */
        public void g(x2.d dVar) {
            WindowInsets windowInsets = this.f8571c;
            if (windowInsets != null) {
                this.f8571c = windowInsets.replaceSystemWindowInsets(dVar.f31836a, dVar.f31837b, dVar.f31838c, dVar.f31839d);
            }
        }

        b(C0 c02) {
            super(c02);
            this.f8571c = c02.x();
        }
    }

    private static class c extends e {

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets.Builder f8573c;

        c() {
            this.f8573c = F2.e.a();
        }

        /* access modifiers changed from: package-private */
        public C0 b() {
            a();
            C0 y10 = C0.y(this.f8573c.build());
            y10.t(this.f8575b);
            return y10;
        }

        /* access modifiers changed from: package-private */
        public void d(x2.d dVar) {
            WindowInsets.Builder unused = this.f8573c.setMandatorySystemGestureInsets(dVar.f());
        }

        /* access modifiers changed from: package-private */
        public void e(x2.d dVar) {
            WindowInsets.Builder unused = this.f8573c.setStableInsets(dVar.f());
        }

        /* access modifiers changed from: package-private */
        public void f(x2.d dVar) {
            WindowInsets.Builder unused = this.f8573c.setSystemGestureInsets(dVar.f());
        }

        /* access modifiers changed from: package-private */
        public void g(x2.d dVar) {
            WindowInsets.Builder unused = this.f8573c.setSystemWindowInsets(dVar.f());
        }

        /* access modifiers changed from: package-private */
        public void h(x2.d dVar) {
            WindowInsets.Builder unused = this.f8573c.setTappableElementInsets(dVar.f());
        }

        c(C0 c02) {
            super(c02);
            WindowInsets.Builder builder;
            WindowInsets x10 = c02.x();
            if (x10 != null) {
                builder = I0.a(x10);
            } else {
                builder = F2.e.a();
            }
            this.f8573c = builder;
        }
    }

    private static class g extends f {

        /* renamed from: m  reason: collision with root package name */
        private x2.d f8586m = null;

        g(C0 c02, WindowInsets windowInsets) {
            super(c02, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public C0 b() {
            return C0.y(this.f8581c.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        public C0 c() {
            return C0.y(this.f8581c.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        public final x2.d j() {
            if (this.f8586m == null) {
                this.f8586m = x2.d.b(this.f8581c.getStableInsetLeft(), this.f8581c.getStableInsetTop(), this.f8581c.getStableInsetRight(), this.f8581c.getStableInsetBottom());
            }
            return this.f8586m;
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return this.f8581c.isConsumed();
        }

        public void u(x2.d dVar) {
            this.f8586m = dVar;
        }

        g(C0 c02, g gVar) {
            super(c02, (f) gVar);
            this.f8586m = gVar.f8586m;
        }
    }

    private static class f extends k {

        /* renamed from: h  reason: collision with root package name */
        private static boolean f8576h = false;

        /* renamed from: i  reason: collision with root package name */
        private static Method f8577i;

        /* renamed from: j  reason: collision with root package name */
        private static Class<?> f8578j;

        /* renamed from: k  reason: collision with root package name */
        private static Field f8579k;

        /* renamed from: l  reason: collision with root package name */
        private static Field f8580l;

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets f8581c;

        /* renamed from: d  reason: collision with root package name */
        private x2.d[] f8582d;

        /* renamed from: e  reason: collision with root package name */
        private x2.d f8583e;

        /* renamed from: f  reason: collision with root package name */
        private C0 f8584f;

        /* renamed from: g  reason: collision with root package name */
        x2.d f8585g;

        f(C0 c02, WindowInsets windowInsets) {
            super(c02);
            this.f8583e = null;
            this.f8581c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                f8577i = View.class.getDeclaredMethod("getViewRootImpl", (Class[]) null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f8578j = cls;
                f8579k = cls.getDeclaredField("mVisibleInsets");
                f8580l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f8579k.setAccessible(true);
                f8580l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f8576h = true;
        }

        @SuppressLint({"WrongConstant"})
        private x2.d v(int i10, boolean z10) {
            x2.d dVar = x2.d.f31835e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    dVar = x2.d.a(dVar, w(i11, z10));
                }
            }
            return dVar;
        }

        private x2.d x() {
            C0 c02 = this.f8584f;
            return c02 != null ? c02.h() : x2.d.f31835e;
        }

        private x2.d y(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f8576h) {
                    A();
                }
                Method method = f8577i;
                if (!(method == null || f8578j == null || f8579k == null)) {
                    try {
                        Object invoke = method.invoke(view, (Object[]) null);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f8579k.get(f8580l.get(invoke));
                        if (rect != null) {
                            return x2.d.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            x2.d y10 = y(view);
            if (y10 == null) {
                y10 = x2.d.f31835e;
            }
            s(y10);
        }

        /* access modifiers changed from: package-private */
        public void e(C0 c02) {
            c02.v(this.f8584f);
            c02.u(this.f8585g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f8585g, ((f) obj).f8585g);
        }

        public x2.d g(int i10) {
            return v(i10, false);
        }

        public x2.d h(int i10) {
            return v(i10, true);
        }

        /* access modifiers changed from: package-private */
        public final x2.d l() {
            if (this.f8583e == null) {
                this.f8583e = x2.d.b(this.f8581c.getSystemWindowInsetLeft(), this.f8581c.getSystemWindowInsetTop(), this.f8581c.getSystemWindowInsetRight(), this.f8581c.getSystemWindowInsetBottom());
            }
            return this.f8583e;
        }

        /* access modifiers changed from: package-private */
        public C0 n(int i10, int i11, int i12, int i13) {
            a aVar = new a(C0.y(this.f8581c));
            aVar.d(C0.p(l(), i10, i11, i12, i13));
            aVar.c(C0.p(j(), i10, i11, i12, i13));
            return aVar.a();
        }

        /* access modifiers changed from: package-private */
        public boolean p() {
            return this.f8581c.isRound();
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean q(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !z(i11)) {
                    return false;
                }
            }
            return true;
        }

        public void r(x2.d[] dVarArr) {
            this.f8582d = dVarArr;
        }

        /* access modifiers changed from: package-private */
        public void s(x2.d dVar) {
            this.f8585g = dVar;
        }

        /* access modifiers changed from: package-private */
        public void t(C0 c02) {
            this.f8584f = c02;
        }

        /* access modifiers changed from: protected */
        public x2.d w(int i10, boolean z10) {
            int i11;
            if (i10 == 1) {
                return z10 ? x2.d.b(0, Math.max(x().f31837b, l().f31837b), 0, 0) : x2.d.b(0, l().f31837b, 0, 0);
            }
            x2.d dVar = null;
            if (i10 != 2) {
                if (i10 == 8) {
                    x2.d[] dVarArr = this.f8582d;
                    if (dVarArr != null) {
                        dVar = dVarArr[l.d(8)];
                    }
                    if (dVar != null) {
                        return dVar;
                    }
                    x2.d l10 = l();
                    x2.d x10 = x();
                    int i12 = l10.f31839d;
                    if (i12 > x10.f31839d) {
                        return x2.d.b(0, 0, 0, i12);
                    }
                    x2.d dVar2 = this.f8585g;
                    return (dVar2 == null || dVar2.equals(x2.d.f31835e) || (i11 = this.f8585g.f31839d) <= x10.f31839d) ? x2.d.f31835e : x2.d.b(0, 0, 0, i11);
                } else if (i10 == 16) {
                    return k();
                } else {
                    if (i10 == 32) {
                        return i();
                    }
                    if (i10 == 64) {
                        return m();
                    }
                    if (i10 != 128) {
                        return x2.d.f31835e;
                    }
                    C0 c02 = this.f8584f;
                    r e10 = c02 != null ? c02.e() : f();
                    return e10 != null ? x2.d.b(e10.b(), e10.d(), e10.c(), e10.a()) : x2.d.f31835e;
                }
            } else if (z10) {
                x2.d x11 = x();
                x2.d j10 = j();
                return x2.d.b(Math.max(x11.f31836a, j10.f31836a), 0, Math.max(x11.f31838c, j10.f31838c), Math.max(x11.f31839d, j10.f31839d));
            } else {
                x2.d l11 = l();
                C0 c03 = this.f8584f;
                if (c03 != null) {
                    dVar = c03.h();
                }
                int i13 = l11.f31839d;
                if (dVar != null) {
                    i13 = Math.min(i13, dVar.f31839d);
                }
                return x2.d.b(l11.f31836a, 0, l11.f31838c, i13);
            }
        }

        /* access modifiers changed from: protected */
        public boolean z(int i10) {
            if (!(i10 == 1 || i10 == 2)) {
                if (i10 == 4) {
                    return false;
                }
                if (!(i10 == 8 || i10 == 128)) {
                    return true;
                }
            }
            return !w(i10, false).equals(x2.d.f31835e);
        }

        f(C0 c02, f fVar) {
            this(c02, new WindowInsets(fVar.f8581c));
        }
    }

    private static class i extends h {

        /* renamed from: n  reason: collision with root package name */
        private x2.d f8587n = null;

        /* renamed from: o  reason: collision with root package name */
        private x2.d f8588o = null;

        /* renamed from: p  reason: collision with root package name */
        private x2.d f8589p = null;

        i(C0 c02, WindowInsets windowInsets) {
            super(c02, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public x2.d i() {
            if (this.f8588o == null) {
                this.f8588o = x2.d.e(this.f8581c.getMandatorySystemGestureInsets());
            }
            return this.f8588o;
        }

        /* access modifiers changed from: package-private */
        public x2.d k() {
            if (this.f8587n == null) {
                this.f8587n = x2.d.e(this.f8581c.getSystemGestureInsets());
            }
            return this.f8587n;
        }

        /* access modifiers changed from: package-private */
        public x2.d m() {
            if (this.f8589p == null) {
                this.f8589p = x2.d.e(this.f8581c.getTappableElementInsets());
            }
            return this.f8589p;
        }

        /* access modifiers changed from: package-private */
        public C0 n(int i10, int i11, int i12, int i13) {
            return C0.y(this.f8581c.inset(i10, i11, i12, i13));
        }

        public void u(x2.d dVar) {
        }

        i(C0 c02, i iVar) {
            super(c02, (h) iVar);
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final e f8566a;

        public a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f8566a = new d();
            } else if (i10 >= 29) {
                this.f8566a = new c();
            } else {
                this.f8566a = new b();
            }
        }

        public C0 a() {
            return this.f8566a.b();
        }

        public a b(int i10, x2.d dVar) {
            this.f8566a.c(i10, dVar);
            return this;
        }

        @Deprecated
        public a c(x2.d dVar) {
            this.f8566a.e(dVar);
            return this;
        }

        @Deprecated
        public a d(x2.d dVar) {
            this.f8566a.g(dVar);
            return this;
        }

        public a(C0 c02) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f8566a = new d(c02);
            } else if (i10 >= 29) {
                this.f8566a = new c(c02);
            } else {
                this.f8566a = new b(c02);
            }
        }
    }

    public C0(C0 c02) {
        if (c02 != null) {
            k kVar = c02.f8565a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (kVar instanceof j)) {
                this.f8565a = new j(this, (j) kVar);
            } else if (i10 >= 29 && (kVar instanceof i)) {
                this.f8565a = new i(this, (i) kVar);
            } else if (i10 >= 28 && (kVar instanceof h)) {
                this.f8565a = new h(this, (h) kVar);
            } else if (kVar instanceof g) {
                this.f8565a = new g(this, (g) kVar);
            } else if (kVar instanceof f) {
                this.f8565a = new f(this, (f) kVar);
            } else {
                this.f8565a = new k(this);
            }
            kVar.e(this);
            return;
        }
        this.f8565a = new k(this);
    }
}
