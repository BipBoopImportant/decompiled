package I2;

import I2.C0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import t2.C5947e;

/* renamed from: I2.p0  reason: case insensitive filesystem */
public final class C4628p0 {

    /* renamed from: a  reason: collision with root package name */
    private e f8693a;

    /* renamed from: I2.p0$b */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        WindowInsets f8696a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8697b;

        public b(int i10) {
            this.f8697b = i10;
        }

        public final int b() {
            return this.f8697b;
        }

        public void c(C4628p0 p0Var) {
        }

        public void d(C4628p0 p0Var) {
        }

        public abstract C0 e(C0 c02, List<C4628p0> list);

        public a f(C4628p0 p0Var, a aVar) {
            return aVar;
        }
    }

    /* renamed from: I2.p0$c */
    private static class c extends e {

        /* renamed from: e  reason: collision with root package name */
        private static final Interpolator f8698e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f  reason: collision with root package name */
        private static final Interpolator f8699f = new h3.a();

        /* renamed from: g  reason: collision with root package name */
        private static final Interpolator f8700g = new DecelerateInterpolator();

        /* renamed from: I2.p0$c$a */
        private static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            final b f8701a;

            /* renamed from: b  reason: collision with root package name */
            private C0 f8702b;

            /* renamed from: I2.p0$c$a$a  reason: collision with other inner class name */
            class C0121a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C4628p0 f8703a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C0 f8704b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C0 f8705c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ int f8706d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ View f8707e;

                C0121a(C4628p0 p0Var, C0 c02, C0 c03, int i10, View view) {
                    this.f8703a = p0Var;
                    this.f8704b = c02;
                    this.f8705c = c03;
                    this.f8706d = i10;
                    this.f8707e = view;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f8703a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.f8707e, c.o(this.f8704b, this.f8705c, this.f8703a.b(), this.f8706d), Collections.singletonList(this.f8703a));
                }
            }

            /* renamed from: I2.p0$c$a$b */
            class b extends AnimatorListenerAdapter {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C4628p0 f8709a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ View f8710b;

                b(C4628p0 p0Var, View view) {
                    this.f8709a = p0Var;
                    this.f8710b = view;
                }

                public void onAnimationEnd(Animator animator) {
                    this.f8709a.e(1.0f);
                    c.i(this.f8710b, this.f8709a);
                }
            }

            /* renamed from: I2.p0$c$a$c  reason: collision with other inner class name */
            class C0122c implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ View f8712a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C4628p0 f8713b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a f8714c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ ValueAnimator f8715d;

                C0122c(View view, C4628p0 p0Var, a aVar, ValueAnimator valueAnimator) {
                    this.f8712a = view;
                    this.f8713b = p0Var;
                    this.f8714c = aVar;
                    this.f8715d = valueAnimator;
                }

                public void run() {
                    c.l(this.f8712a, this.f8713b, this.f8714c);
                    this.f8715d.start();
                }
            }

            a(View view, b bVar) {
                this.f8701a = bVar;
                C0 G10 = C4600b0.G(view);
                this.f8702b = G10 != null ? new C0.a(G10).a() : null;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                View view2 = view;
                WindowInsets windowInsets2 = windowInsets;
                if (!view.isLaidOut()) {
                    this.f8702b = C0.z(windowInsets2, view2);
                    return c.m(view, windowInsets);
                }
                C0 z10 = C0.z(windowInsets2, view2);
                if (this.f8702b == null) {
                    this.f8702b = C4600b0.G(view);
                }
                if (this.f8702b == null) {
                    this.f8702b = z10;
                    return c.m(view, windowInsets);
                }
                b n10 = c.n(view);
                if (n10 != null && Objects.equals(n10.f8696a, windowInsets2)) {
                    return c.m(view, windowInsets);
                }
                int e10 = c.e(z10, this.f8702b);
                if (e10 == 0) {
                    return c.m(view, windowInsets);
                }
                C0 c02 = this.f8702b;
                C4628p0 p0Var = new C4628p0(e10, c.g(e10, z10, c02), 160);
                p0Var.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(p0Var.a());
                a f10 = c.f(z10, c02, e10);
                c.j(view2, p0Var, windowInsets2, false);
                duration.addUpdateListener(new C0121a(p0Var, z10, c02, e10, view));
                duration.addListener(new b(p0Var, view2));
                L.a(view2, new C0122c(view, p0Var, f10, duration));
                this.f8702b = z10;
                return c.m(view, windowInsets);
            }
        }

        c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        @SuppressLint({"WrongConstant"})
        static int e(C0 c02, C0 c03) {
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if (!c02.f(i11).equals(c03.f(i11))) {
                    i10 |= i11;
                }
            }
            return i10;
        }

        static a f(C0 c02, C0 c03, int i10) {
            x2.d f10 = c02.f(i10);
            x2.d f11 = c03.f(i10);
            return new a(x2.d.b(Math.min(f10.f31836a, f11.f31836a), Math.min(f10.f31837b, f11.f31837b), Math.min(f10.f31838c, f11.f31838c), Math.min(f10.f31839d, f11.f31839d)), x2.d.b(Math.max(f10.f31836a, f11.f31836a), Math.max(f10.f31837b, f11.f31837b), Math.max(f10.f31838c, f11.f31838c), Math.max(f10.f31839d, f11.f31839d)));
        }

        static Interpolator g(int i10, C0 c02, C0 c03) {
            return (i10 & 8) != 0 ? c02.f(C0.l.c()).f31839d > c03.f(C0.l.c()).f31839d ? f8698e : f8699f : f8700g;
        }

        private static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        static void i(View view, C4628p0 p0Var) {
            b n10 = n(view);
            if (n10 != null) {
                n10.c(p0Var);
                if (n10.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), p0Var);
                }
            }
        }

        static void j(View view, C4628p0 p0Var, WindowInsets windowInsets, boolean z10) {
            b n10 = n(view);
            if (n10 != null) {
                n10.f8696a = windowInsets;
                if (!z10) {
                    n10.d(p0Var);
                    z10 = n10.b() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), p0Var, windowInsets, z10);
                }
            }
        }

        static void k(View view, C0 c02, List<C4628p0> list) {
            b n10 = n(view);
            if (n10 != null) {
                c02 = n10.e(c02, list);
                if (n10.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), c02, list);
                }
            }
        }

        static void l(View view, C4628p0 p0Var, a aVar) {
            b n10 = n(view);
            if (n10 != null) {
                n10.f(p0Var, aVar);
                if (n10.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), p0Var, aVar);
                }
            }
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(C5947e.f29350L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b n(View view) {
            Object tag = view.getTag(C5947e.f29357S);
            if (tag instanceof a) {
                return ((a) tag).f8701a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        static C0 o(C0 c02, C0 c03, float f10, int i10) {
            C0.a aVar = new C0.a(c02);
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    aVar.b(i11, c02.f(i11));
                } else {
                    x2.d f11 = c02.f(i11);
                    x2.d f12 = c03.f(i11);
                    float f13 = 1.0f - f10;
                    aVar.b(i11, C0.p(f11, (int) (((double) (((float) (f11.f31836a - f12.f31836a)) * f13)) + 0.5d), (int) (((double) (((float) (f11.f31837b - f12.f31837b)) * f13)) + 0.5d), (int) (((double) (((float) (f11.f31838c - f12.f31838c)) * f13)) + 0.5d), (int) (((double) (((float) (f11.f31839d - f12.f31839d)) * f13)) + 0.5d)));
                }
            }
            return aVar.a();
        }

        static void p(View view, b bVar) {
            Object tag = view.getTag(C5947e.f29350L);
            if (bVar == null) {
                view.setTag(C5947e.f29357S, (Object) null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener h10 = h(view, bVar);
            view.setTag(C5947e.f29357S, h10);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(h10);
            }
        }
    }

    /* renamed from: I2.p0$e */
    private static class e {

        /* renamed from: a  reason: collision with root package name */
        private final int f8722a;

        /* renamed from: b  reason: collision with root package name */
        private float f8723b;

        /* renamed from: c  reason: collision with root package name */
        private final Interpolator f8724c;

        /* renamed from: d  reason: collision with root package name */
        private final long f8725d;

        e(int i10, Interpolator interpolator, long j10) {
            this.f8722a = i10;
            this.f8724c = interpolator;
            this.f8725d = j10;
        }

        public long a() {
            return this.f8725d;
        }

        public float b() {
            Interpolator interpolator = this.f8724c;
            return interpolator != null ? interpolator.getInterpolation(this.f8723b) : this.f8723b;
        }

        public int c() {
            return this.f8722a;
        }

        public void d(float f10) {
            this.f8723b = f10;
        }
    }

    public C4628p0(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f8693a = new d(i10, interpolator, j10);
        } else {
            this.f8693a = new c(i10, interpolator, j10);
        }
    }

    static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    static C4628p0 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new C4628p0(windowInsetsAnimation);
    }

    public long a() {
        return this.f8693a.a();
    }

    public float b() {
        return this.f8693a.b();
    }

    public int c() {
        return this.f8693a.c();
    }

    public void e(float f10) {
        this.f8693a.d(f10);
    }

    /* renamed from: I2.p0$d */
    private static class d extends e {

        /* renamed from: e  reason: collision with root package name */
        private final WindowInsetsAnimation f8717e;

        /* renamed from: I2.p0$d$a */
        private static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a  reason: collision with root package name */
            private final b f8718a;

            /* renamed from: b  reason: collision with root package name */
            private List<C4628p0> f8719b;

            /* renamed from: c  reason: collision with root package name */
            private ArrayList<C4628p0> f8720c;

            /* renamed from: d  reason: collision with root package name */
            private final HashMap<WindowInsetsAnimation, C4628p0> f8721d = new HashMap<>();

            a(b bVar) {
                super(bVar.b());
                this.f8718a = bVar;
            }

            private C4628p0 a(WindowInsetsAnimation windowInsetsAnimation) {
                C4628p0 p0Var = this.f8721d.get(windowInsetsAnimation);
                if (p0Var != null) {
                    return p0Var;
                }
                C4628p0 f10 = C4628p0.f(windowInsetsAnimation);
                this.f8721d.put(windowInsetsAnimation, f10);
                return f10;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f8718a.c(a(windowInsetsAnimation));
                this.f8721d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f8718a.d(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<C4628p0> arrayList = this.f8720c;
                if (arrayList == null) {
                    ArrayList<C4628p0> arrayList2 = new ArrayList<>(list.size());
                    this.f8720c = arrayList2;
                    this.f8719b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a10 = A0.a(list.get(size));
                    C4628p0 a11 = a(a10);
                    a11.e(a10.getFraction());
                    this.f8720c.add(a11);
                }
                return this.f8718a.e(C0.y(windowInsets), this.f8719b).x();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f8718a.f(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, (Interpolator) null, 0);
            this.f8717e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            C4647z0.a();
            return C4645y0.a(aVar.a().f(), aVar.b().f());
        }

        public static x2.d f(WindowInsetsAnimation.Bounds bounds) {
            return x2.d.e(bounds.getUpperBound());
        }

        public static x2.d g(WindowInsetsAnimation.Bounds bounds) {
            return x2.d.e(bounds.getLowerBound());
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        public long a() {
            return this.f8717e.getDurationMillis();
        }

        public float b() {
            return this.f8717e.getInterpolatedFraction();
        }

        public int c() {
            return this.f8717e.getTypeMask();
        }

        public void d(float f10) {
            this.f8717e.setFraction(f10);
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(C4643x0.a(i10, interpolator, j10));
        }
    }

    /* renamed from: I2.p0$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final x2.d f8694a;

        /* renamed from: b  reason: collision with root package name */
        private final x2.d f8695b;

        public a(x2.d dVar, x2.d dVar2) {
            this.f8694a = dVar;
            this.f8695b = dVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public x2.d a() {
            return this.f8694a;
        }

        public x2.d b() {
            return this.f8695b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f8694a + " upper=" + this.f8695b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f8694a = d.g(bounds);
            this.f8695b = d.f(bounds);
        }
    }

    private C4628p0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (Interpolator) null, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f8693a = new d(windowInsetsAnimation);
        }
    }
}
