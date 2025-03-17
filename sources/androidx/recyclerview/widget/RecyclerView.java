package androidx.recyclerview.widget;

import I2.C4597a;
import I2.C4600b0;
import I2.C4606e0;
import I2.C4625o;
import I2.C4627p;
import J2.b;
import J2.t;
import N2.a;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.widget.d;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.C7003a;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.z;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RecyclerView extends ViewGroup implements I2.D {

    /* renamed from: g1  reason: collision with root package name */
    static boolean f43688g1 = false;

    /* renamed from: h1  reason: collision with root package name */
    static boolean f43689h1 = false;

    /* renamed from: i1  reason: collision with root package name */
    private static final int[] f43690i1 = {16843830};

    /* renamed from: j1  reason: collision with root package name */
    private static final float f43691j1 = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: k1  reason: collision with root package name */
    static final boolean f43692k1 = false;

    /* renamed from: l1  reason: collision with root package name */
    static final boolean f43693l1 = true;

    /* renamed from: m1  reason: collision with root package name */
    static final boolean f43694m1 = true;

    /* renamed from: n1  reason: collision with root package name */
    private static final Class<?>[] f43695n1;

    /* renamed from: o1  reason: collision with root package name */
    static final Interpolator f43696o1 = new C6998c();

    /* renamed from: p1  reason: collision with root package name */
    static final D f43697p1 = new D();

    /* renamed from: A  reason: collision with root package name */
    private boolean f43698A;

    /* renamed from: A0  reason: collision with root package name */
    private t f43699A0;

    /* renamed from: B  reason: collision with root package name */
    private int f43700B;

    /* renamed from: B0  reason: collision with root package name */
    private final int f43701B0;

    /* renamed from: C  reason: collision with root package name */
    boolean f43702C;

    /* renamed from: C0  reason: collision with root package name */
    private final int f43703C0;

    /* renamed from: D  reason: collision with root package name */
    private final AccessibilityManager f43704D;

    /* renamed from: D0  reason: collision with root package name */
    float f43705D0;

    /* renamed from: E  reason: collision with root package name */
    private List<s> f43706E;

    /* renamed from: E0  reason: collision with root package name */
    float f43707E0;

    /* renamed from: F  reason: collision with root package name */
    boolean f43708F;

    /* renamed from: F0  reason: collision with root package name */
    private boolean f43709F0;

    /* renamed from: G  reason: collision with root package name */
    boolean f43710G;

    /* renamed from: G0  reason: collision with root package name */
    final F f43711G0;

    /* renamed from: H  reason: collision with root package name */
    private int f43712H;

    /* renamed from: H0  reason: collision with root package name */
    k f43713H0;

    /* renamed from: I  reason: collision with root package name */
    private int f43714I;

    /* renamed from: I0  reason: collision with root package name */
    k.b f43715I0;

    /* renamed from: J  reason: collision with root package name */
    private m f43716J;

    /* renamed from: J0  reason: collision with root package name */
    final C f43717J0;

    /* renamed from: K  reason: collision with root package name */
    private EdgeEffect f43718K;

    /* renamed from: K0  reason: collision with root package name */
    private v f43719K0;

    /* renamed from: L  reason: collision with root package name */
    private EdgeEffect f43720L;

    /* renamed from: L0  reason: collision with root package name */
    private List<v> f43721L0;

    /* renamed from: M  reason: collision with root package name */
    private EdgeEffect f43722M;

    /* renamed from: M0  reason: collision with root package name */
    boolean f43723M0;

    /* renamed from: N  reason: collision with root package name */
    private EdgeEffect f43724N;

    /* renamed from: N0  reason: collision with root package name */
    boolean f43725N0;

    /* renamed from: O  reason: collision with root package name */
    n f43726O;

    /* renamed from: O0  reason: collision with root package name */
    private n.b f43727O0;

    /* renamed from: P  reason: collision with root package name */
    private int f43728P;

    /* renamed from: P0  reason: collision with root package name */
    boolean f43729P0;

    /* renamed from: Q  reason: collision with root package name */
    private int f43730Q;

    /* renamed from: Q0  reason: collision with root package name */
    v f43731Q0;

    /* renamed from: R  reason: collision with root package name */
    private VelocityTracker f43732R;

    /* renamed from: R0  reason: collision with root package name */
    private l f43733R0;

    /* renamed from: S  reason: collision with root package name */
    private int f43734S;

    /* renamed from: S0  reason: collision with root package name */
    private final int[] f43735S0;

    /* renamed from: T  reason: collision with root package name */
    private int f43736T;

    /* renamed from: T0  reason: collision with root package name */
    private I2.E f43737T0;

    /* renamed from: U  reason: collision with root package name */
    private int f43738U;

    /* renamed from: U0  reason: collision with root package name */
    private final int[] f43739U0;

    /* renamed from: V0  reason: collision with root package name */
    private final int[] f43740V0;

    /* renamed from: W0  reason: collision with root package name */
    final int[] f43741W0;

    /* renamed from: X0  reason: collision with root package name */
    final List<G> f43742X0;

    /* renamed from: Y0  reason: collision with root package name */
    private Runnable f43743Y0;

    /* renamed from: Z0  reason: collision with root package name */
    private boolean f43744Z0;

    /* renamed from: a  reason: collision with root package name */
    private final float f43745a;

    /* renamed from: a1  reason: collision with root package name */
    private int f43746a1;

    /* renamed from: b  reason: collision with root package name */
    private final z f43747b;

    /* renamed from: b1  reason: collision with root package name */
    private int f43748b1;

    /* renamed from: c  reason: collision with root package name */
    final x f43749c;

    /* renamed from: c1  reason: collision with root package name */
    boolean f43750c1;

    /* renamed from: d  reason: collision with root package name */
    A f43751d;

    /* renamed from: d1  reason: collision with root package name */
    private final A.b f43752d1;

    /* renamed from: e  reason: collision with root package name */
    C7003a f43753e;

    /* renamed from: e1  reason: collision with root package name */
    private final C4627p f43754e1;

    /* renamed from: f  reason: collision with root package name */
    f f43755f;

    /* renamed from: f1  reason: collision with root package name */
    C4625o f43756f1;

    /* renamed from: g  reason: collision with root package name */
    final A f43757g;

    /* renamed from: h  reason: collision with root package name */
    boolean f43758h;

    /* renamed from: i  reason: collision with root package name */
    final Runnable f43759i;

    /* renamed from: j  reason: collision with root package name */
    final Rect f43760j;

    /* renamed from: k  reason: collision with root package name */
    private final Rect f43761k;

    /* renamed from: l  reason: collision with root package name */
    final RectF f43762l;

    /* renamed from: m  reason: collision with root package name */
    h f43763m;

    /* renamed from: n  reason: collision with root package name */
    q f43764n;

    /* renamed from: o  reason: collision with root package name */
    y f43765o;

    /* renamed from: p  reason: collision with root package name */
    final List<y> f43766p;

    /* renamed from: q  reason: collision with root package name */
    final ArrayList<p> f43767q;

    /* renamed from: r  reason: collision with root package name */
    private final ArrayList<u> f43768r;

    /* renamed from: s  reason: collision with root package name */
    private u f43769s;

    /* renamed from: t  reason: collision with root package name */
    boolean f43770t;

    /* renamed from: u  reason: collision with root package name */
    boolean f43771u;

    /* renamed from: v  reason: collision with root package name */
    boolean f43772v;

    /* renamed from: w  reason: collision with root package name */
    boolean f43773w;

    /* renamed from: x  reason: collision with root package name */
    private int f43774x;

    /* renamed from: y  reason: collision with root package name */
    boolean f43775y;

    /* renamed from: y0  reason: collision with root package name */
    private int f43776y0;

    /* renamed from: z  reason: collision with root package name */
    boolean f43777z;

    /* renamed from: z0  reason: collision with root package name */
    private int f43778z0;

    public static abstract class B {

        /* renamed from: a  reason: collision with root package name */
        private int f43780a = -1;

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView f43781b;

        /* renamed from: c  reason: collision with root package name */
        private q f43782c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f43783d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f43784e;

        /* renamed from: f  reason: collision with root package name */
        private View f43785f;

        /* renamed from: g  reason: collision with root package name */
        private final a f43786g = new a(0, 0);

        /* renamed from: h  reason: collision with root package name */
        private boolean f43787h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private int f43788a;

            /* renamed from: b  reason: collision with root package name */
            private int f43789b;

            /* renamed from: c  reason: collision with root package name */
            private int f43790c;

            /* renamed from: d  reason: collision with root package name */
            private int f43791d;

            /* renamed from: e  reason: collision with root package name */
            private Interpolator f43792e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f43793f;

            /* renamed from: g  reason: collision with root package name */
            private int f43794g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, (Interpolator) null);
            }

            private void e() {
                if (this.f43792e != null && this.f43790c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f43790c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            public boolean a() {
                return this.f43791d >= 0;
            }

            public void b(int i10) {
                this.f43791d = i10;
            }

            /* access modifiers changed from: package-private */
            public void c(RecyclerView recyclerView) {
                int i10 = this.f43791d;
                if (i10 >= 0) {
                    this.f43791d = -1;
                    recyclerView.H0(i10);
                    this.f43793f = false;
                } else if (this.f43793f) {
                    e();
                    recyclerView.f43711G0.e(this.f43788a, this.f43789b, this.f43790c, this.f43792e);
                    int i11 = this.f43794g + 1;
                    this.f43794g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f43793f = false;
                } else {
                    this.f43794g = 0;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f43788a = i10;
                this.f43789b = i11;
                this.f43790c = i12;
                this.f43792e = interpolator;
                this.f43793f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f43791d = -1;
                this.f43793f = false;
                this.f43794g = 0;
                this.f43788a = i10;
                this.f43789b = i11;
                this.f43790c = i12;
                this.f43792e = interpolator;
            }
        }

        public interface b {
            PointF h(int i10);
        }

        public PointF a(int i10) {
            q e10 = e();
            if (e10 instanceof b) {
                return ((b) e10).h(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f43781b.f43764n.e0(i10);
        }

        public int c() {
            return this.f43781b.f43764n.l0();
        }

        public int d(View view) {
            return this.f43781b.n0(view);
        }

        public q e() {
            return this.f43782c;
        }

        public int f() {
            return this.f43780a;
        }

        public boolean g() {
            return this.f43783d;
        }

        public boolean h() {
            return this.f43784e;
        }

        /* access modifiers changed from: protected */
        public void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        public void j(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f43781b;
            if (this.f43780a == -1 || recyclerView == null) {
                r();
            }
            if (this.f43783d && this.f43785f == null && this.f43782c != null && (a10 = a(this.f43780a)) != null) {
                float f10 = a10.x;
                if (!(f10 == 0.0f && a10.y == 0.0f)) {
                    recyclerView.v1((int) Math.signum(f10), (int) Math.signum(a10.y), (int[]) null);
                }
            }
            this.f43783d = false;
            View view = this.f43785f;
            if (view != null) {
                if (d(view) == this.f43780a) {
                    o(this.f43785f, recyclerView.f43717J0, this.f43786g);
                    this.f43786g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f43785f = null;
                }
            }
            if (this.f43784e) {
                l(i10, i11, recyclerView.f43717J0, this.f43786g);
                boolean a11 = this.f43786g.a();
                this.f43786g.c(recyclerView);
                if (a11 && this.f43784e) {
                    this.f43783d = true;
                    recyclerView.f43711G0.d();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void k(View view) {
            if (d(view) == f()) {
                this.f43785f = view;
                if (RecyclerView.f43689h1) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        /* access modifiers changed from: protected */
        public abstract void l(int i10, int i11, C c10, a aVar);

        /* access modifiers changed from: protected */
        public abstract void m();

        /* access modifiers changed from: protected */
        public abstract void n();

        /* access modifiers changed from: protected */
        public abstract void o(View view, C c10, a aVar);

        public void p(int i10) {
            this.f43780a = i10;
        }

        /* access modifiers changed from: package-private */
        public void q(RecyclerView recyclerView, q qVar) {
            recyclerView.f43711G0.f();
            if (this.f43787h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f43781b = recyclerView;
            this.f43782c = qVar;
            int i10 = this.f43780a;
            if (i10 != -1) {
                recyclerView.f43717J0.f43795a = i10;
                this.f43784e = true;
                this.f43783d = true;
                this.f43785f = b(f());
                m();
                this.f43781b.f43711G0.d();
                this.f43787h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        public final void r() {
            if (this.f43784e) {
                this.f43784e = false;
                n();
                this.f43781b.f43717J0.f43795a = -1;
                this.f43785f = null;
                this.f43780a = -1;
                this.f43783d = false;
                this.f43782c.E1(this);
                this.f43782c = null;
                this.f43781b = null;
            }
        }
    }

    public static class C {

        /* renamed from: a  reason: collision with root package name */
        int f43795a = -1;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<Object> f43796b;

        /* renamed from: c  reason: collision with root package name */
        int f43797c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f43798d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f43799e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f43800f = 0;

        /* renamed from: g  reason: collision with root package name */
        boolean f43801g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f43802h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f43803i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f43804j = false;

        /* renamed from: k  reason: collision with root package name */
        boolean f43805k = false;

        /* renamed from: l  reason: collision with root package name */
        boolean f43806l = false;

        /* renamed from: m  reason: collision with root package name */
        int f43807m;

        /* renamed from: n  reason: collision with root package name */
        long f43808n;

        /* renamed from: o  reason: collision with root package name */
        int f43809o;

        /* renamed from: p  reason: collision with root package name */
        int f43810p;

        /* renamed from: q  reason: collision with root package name */
        int f43811q;

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            if ((this.f43799e & i10) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f43799e));
            }
        }

        public int b() {
            return this.f43802h ? this.f43797c - this.f43798d : this.f43800f;
        }

        public int c() {
            return this.f43795a;
        }

        public boolean d() {
            return this.f43795a != -1;
        }

        public boolean e() {
            return this.f43802h;
        }

        /* access modifiers changed from: package-private */
        public void f(h hVar) {
            this.f43799e = 1;
            this.f43800f = hVar.getItemCount();
            this.f43802h = false;
            this.f43803i = false;
            this.f43804j = false;
        }

        public boolean g() {
            return this.f43806l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f43795a + ", mData=" + this.f43796b + ", mItemCount=" + this.f43800f + ", mIsMeasuring=" + this.f43804j + ", mPreviousLayoutItemCount=" + this.f43797c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f43798d + ", mStructureChanged=" + this.f43801g + ", mInPreLayout=" + this.f43802h + ", mRunSimpleAnimations=" + this.f43805k + ", mRunPredictiveAnimations=" + this.f43806l + '}';
        }
    }

    static class D extends m {
        D() {
        }

        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class E {
    }

    class F implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private int f43812a;

        /* renamed from: b  reason: collision with root package name */
        private int f43813b;

        /* renamed from: c  reason: collision with root package name */
        OverScroller f43814c;

        /* renamed from: d  reason: collision with root package name */
        Interpolator f43815d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f43816e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f43817f = false;

        F() {
            Interpolator interpolator = RecyclerView.f43696o1;
            this.f43815d = interpolator;
            this.f43814c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            boolean z10 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                abs = abs2;
            }
            return Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            C4600b0.g0(RecyclerView.this, this);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f43813b = 0;
            this.f43812a = 0;
            Interpolator interpolator = this.f43815d;
            Interpolator interpolator2 = RecyclerView.f43696o1;
            if (interpolator != interpolator2) {
                this.f43815d = interpolator2;
                this.f43814c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f43814c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f43816e) {
                this.f43817f = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f43696o1;
            }
            if (this.f43815d != interpolator) {
                this.f43815d = interpolator;
                this.f43814c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f43813b = 0;
            this.f43812a = 0;
            RecyclerView.this.setScrollState(2);
            this.f43814c.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f43814c.abortAnimation();
        }

        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f43764n == null) {
                f();
                return;
            }
            this.f43817f = false;
            this.f43816e = true;
            recyclerView.A();
            OverScroller overScroller = this.f43814c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f43812a;
                int i13 = currY - this.f43813b;
                this.f43812a = currX;
                this.f43813b = currY;
                int x10 = RecyclerView.this.x(i12);
                int z10 = RecyclerView.this.z(i13);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f43741W0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.L(x10, z10, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f43741W0;
                    x10 -= iArr2[0];
                    z10 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.w(x10, z10);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f43763m != null) {
                    int[] iArr3 = recyclerView3.f43741W0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.v1(x10, z10, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f43741W0;
                    i10 = iArr4[0];
                    i11 = iArr4[1];
                    x10 -= i10;
                    z10 -= i11;
                    B b10 = recyclerView4.f43764n.f43836g;
                    if (b10 != null && !b10.g() && b10.h()) {
                        int b11 = RecyclerView.this.f43717J0.b();
                        if (b11 == 0) {
                            b10.r();
                        } else if (b10.f() >= b11) {
                            b10.p(b11 - 1);
                            b10.j(i10, i11);
                        } else {
                            b10.j(i10, i11);
                        }
                    }
                } else {
                    i11 = 0;
                    i10 = 0;
                }
                if (!RecyclerView.this.f43767q.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f43741W0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.M(i10, i11, x10, z10, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f43741W0;
                int i14 = x10 - iArr6[0];
                int i15 = z10 - iArr6[1];
                if (!(i10 == 0 && i11 == 0)) {
                    recyclerView6.O(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z11 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                B b12 = RecyclerView.this.f43764n.f43836g;
                if ((b12 == null || !b12.g()) && z11) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.b(i16, currVelocity);
                    }
                    if (RecyclerView.f43694m1) {
                        RecyclerView.this.f43715I0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    k kVar = recyclerView7.f43713H0;
                    if (kVar != null) {
                        kVar.f(recyclerView7, i10, i11);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    k.a(RecyclerView.this, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            B b13 = RecyclerView.this.f43764n.f43836g;
            if (b13 != null && b13.g()) {
                b13.j(0, 0);
            }
            this.f43816e = false;
            if (this.f43817f) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.L1(1);
        }
    }

    public static abstract class G {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        h<? extends G> mBindingAdapter;
        int mFlags;
        boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        long mItemId = -1;
        int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads = null;
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        x mScrapContainer = null;
        G mShadowedHolder = null;
        G mShadowingHolder = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public G(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        /* access modifiers changed from: package-private */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: package-private */
        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: package-private */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C4600b0.P(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.k0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h<? extends G> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int k02;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (k02 = this.mOwnerRecyclerView.k0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, k02);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        /* access modifiers changed from: package-private */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: package-private */
        public boolean hasAnyOfTheFlags(int i10) {
            return (i10 & this.mFlags) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !C4600b0.P(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        /* access modifiers changed from: package-private */
        public boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((r) this.itemView.getLayoutParams()).f43856c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
            }
            recyclerView.y1(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.y1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        /* access modifiers changed from: package-private */
        public void resetInternal() {
            if (!RecyclerView.f43688g1 || !isTmpDetached()) {
                this.mFlags = 0;
                this.mPosition = -1;
                this.mOldPosition = -1;
                this.mItemId = -1;
                this.mPreLayoutPosition = -1;
                this.mIsRecyclableCount = 0;
                this.mShadowedHolder = null;
                this.mShadowingHolder = null;
                clearPayload();
                this.mWasImportantForAccessibilityBeforeHidden = 0;
                this.mPendingAccessibilityState = -1;
                RecyclerView.u(this);
                return;
            }
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }

        /* access modifiers changed from: package-private */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: package-private */
        public void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                if (!RecyclerView.f43688g1) {
                    Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                } else {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
            } else if (!z10 && i11 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i11 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.f43689h1) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z10 + ":" + this);
            }
        }

        /* access modifiers changed from: package-private */
        public void setScrapContainer(x xVar, boolean z10) {
            this.mScrapContainer = xVar;
            this.mInChangeScrap = z10;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            return (this.mFlags & FLAG_IGNORE) != 0;
        }

        /* access modifiers changed from: package-private */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* access modifiers changed from: package-private */
        public void unScrap() {
            this.mScrapContainer.O(this);
        }

        /* access modifiers changed from: package-private */
        public boolean wasReturnedFromScrap() {
            return (this.mFlags & FLAG_RETURNED_FROM_SCRAP) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a  reason: case insensitive filesystem */
    class C6996a implements Runnable {
        C6996a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f43773w && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f43770t) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f43777z) {
                    recyclerView2.f43775y = true;
                } else {
                    recyclerView2.A();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b  reason: case insensitive filesystem */
    class C6997b implements Runnable {
        C6997b() {
        }

        public void run() {
            n nVar = RecyclerView.this.f43726O;
            if (nVar != null) {
                nVar.runPendingAnimations();
            }
            RecyclerView.this.f43729P0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c  reason: case insensitive filesystem */
    class C6998c implements Interpolator {
        C6998c() {
        }

        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d  reason: case insensitive filesystem */
    class C6999d implements A.b {
        C6999d() {
        }

        public void a(G g10, n.c cVar, n.c cVar2) {
            RecyclerView.this.o(g10, cVar, cVar2);
        }

        public void b(G g10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f43764n.M1(g10.itemView, recyclerView.f43749c);
        }

        public void c(G g10, n.c cVar, n.c cVar2) {
            RecyclerView.this.f43749c.O(g10);
            RecyclerView.this.q(g10, cVar, cVar2);
        }

        public void d(G g10, n.c cVar, n.c cVar2) {
            g10.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f43708F) {
                if (recyclerView.f43726O.animateChange(g10, g10, cVar, cVar2)) {
                    RecyclerView.this.Y0();
                }
            } else if (recyclerView.f43726O.animatePersistence(g10, cVar, cVar2)) {
                RecyclerView.this.Y0();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e  reason: case insensitive filesystem */
    class C7000e implements C4627p {
        C7000e() {
        }

        public boolean a(float f10) {
            int i10;
            int i11;
            if (RecyclerView.this.f43764n.N()) {
                i11 = (int) f10;
                i10 = 0;
            } else if (RecyclerView.this.f43764n.M()) {
                i10 = (int) f10;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            RecyclerView.this.M1();
            return RecyclerView.this.j0(i10, i11);
        }

        public float b() {
            float f10;
            if (RecyclerView.this.f43764n.N()) {
                f10 = RecyclerView.this.f43707E0;
            } else if (!RecyclerView.this.f43764n.M()) {
                return 0.0f;
            } else {
                f10 = RecyclerView.this.f43705D0;
            }
            return -f10;
        }

        public void c() {
            RecyclerView.this.M1();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f  reason: case insensitive filesystem */
    class C7001f implements f.b {
        C7001f() {
        }

        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        public void b(View view) {
            G p02 = RecyclerView.p0(view);
            if (p02 != null) {
                p02.onEnteredHiddenState(RecyclerView.this);
            }
        }

        public int c() {
            return RecyclerView.this.getChildCount();
        }

        public G d(View view) {
            return RecyclerView.p0(view);
        }

        public void e(int i10) {
            View a10 = a(i10);
            if (a10 != null) {
                G p02 = RecyclerView.p0(a10);
                if (p02 != null) {
                    if (!p02.isTmpDetached() || p02.shouldIgnore()) {
                        if (RecyclerView.f43689h1) {
                            Log.d("RecyclerView", "tmpDetach " + p02);
                        }
                        p02.addFlags(256);
                    } else {
                        throw new IllegalArgumentException("called detach on an already detached child " + p02 + RecyclerView.this.V());
                    }
                }
            } else if (RecyclerView.f43688g1) {
                throw new IllegalArgumentException("No view at offset " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        public void f(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.E(view);
        }

        public void g() {
            int c10 = c();
            for (int i10 = 0; i10 < c10; i10++) {
                View a10 = a(i10);
                RecyclerView.this.F(a10);
                a10.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        public int h(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        public void i(View view) {
            G p02 = RecyclerView.p0(view);
            if (p02 != null) {
                p02.onLeftHiddenState(RecyclerView.this);
            }
        }

        public void j(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        public void k(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            G p02 = RecyclerView.p0(view);
            if (p02 != null) {
                if (p02.isTmpDetached() || p02.shouldIgnore()) {
                    if (RecyclerView.f43689h1) {
                        Log.d("RecyclerView", "reAttach " + p02);
                    }
                    p02.clearTmpDetachFlag();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + p02 + RecyclerView.this.V());
                }
            } else if (RecyclerView.f43688g1) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g  reason: case insensitive filesystem */
    class C7002g implements C7003a.C0751a {
        C7002g() {
        }

        public void a(int i10, int i11) {
            RecyclerView.this.O0(i10, i11);
            RecyclerView.this.f43723M0 = true;
        }

        public void b(C7003a.b bVar) {
            i(bVar);
        }

        public void c(C7003a.b bVar) {
            i(bVar);
        }

        public void d(int i10, int i11) {
            RecyclerView.this.P0(i10, i11, false);
            RecyclerView.this.f43723M0 = true;
        }

        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.O1(i10, i11, obj);
            RecyclerView.this.f43725N0 = true;
        }

        public G f(int i10) {
            G g02 = RecyclerView.this.g0(i10, true);
            if (g02 == null) {
                return null;
            }
            if (!RecyclerView.this.f43755f.n(g02.itemView)) {
                return g02;
            }
            if (RecyclerView.f43689h1) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        public void g(int i10, int i11) {
            RecyclerView.this.N0(i10, i11);
            RecyclerView.this.f43723M0 = true;
        }

        public void h(int i10, int i11) {
            RecyclerView.this.P0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f43723M0 = true;
            recyclerView.f43717J0.f43798d += i11;
        }

        /* access modifiers changed from: package-private */
        public void i(C7003a.b bVar) {
            int i10 = bVar.f43938a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f43764n.q1(recyclerView, bVar.f43939b, bVar.f43941d);
            } else if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f43764n.t1(recyclerView2, bVar.f43939b, bVar.f43941d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f43764n.v1(recyclerView3, bVar.f43939b, bVar.f43941d, bVar.f43940c);
            } else if (i10 == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f43764n.s1(recyclerView4, bVar.f43939b, bVar.f43941d, 1);
            }
        }
    }

    public static abstract class h<VH extends G> {
        private boolean mHasStableIds = false;
        private final i mObservable = new i();
        private a mStateRestorationPolicy = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh2, int i10) {
            boolean z10 = vh2.mBindingAdapter == null;
            if (z10) {
                vh2.mPosition = i10;
                if (hasStableIds()) {
                    vh2.mItemId = getItemId(i10);
                }
                vh2.setFlags(1, 519);
                if (D2.p.c()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", new Object[]{Integer.valueOf(vh2.mItemViewType)}));
                }
            }
            vh2.mBindingAdapter = this;
            if (RecyclerView.f43688g1) {
                if (vh2.itemView.getParent() == null && vh2.itemView.isAttachedToWindow() != vh2.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh2.isTmpDetached() + ", attached to window: " + vh2.itemView.isAttachedToWindow() + ", holder: " + vh2);
                } else if (vh2.itemView.getParent() == null && vh2.itemView.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh2);
                }
            }
            onBindViewHolder(vh2, i10, vh2.getUnmodifiedPayloads());
            if (z10) {
                vh2.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh2.itemView.getLayoutParams();
                if (layoutParams instanceof r) {
                    ((r) layoutParams).f43856c = true;
                }
                Trace.endSection();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean canRestoreState() {
            int ordinal = this.mStateRestorationPolicy.ordinal();
            return ordinal != 1 ? ordinal != 2 : getItemCount() > 0;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i10) {
            try {
                if (D2.p.c()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", new Object[]{Integer.valueOf(i10)}));
                }
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i10);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i10;
                    Trace.endSection();
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }

        public int findRelativeAdapterPositionIn(h<? extends G> hVar, G g10, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.f(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.g(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.g(i10, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh2, int i10);

        public void onBindViewHolder(VH vh2, int i10, List<Object> list) {
            onBindViewHolder(vh2, i10);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i10);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh2) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh2) {
        }

        public void onViewDetachedFromWindow(VH vh2) {
        }

        public void onViewRecycled(VH vh2) {
        }

        public void registerAdapterDataObserver(j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z10) {
            if (!hasObservers()) {
                this.mHasStableIds = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.e(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.e(i10, i11, obj);
        }
    }

    static class i extends Observable<j> {
        i() {
        }

        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((j) this.mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((j) this.mObservers.get(size)).e(i10, i11, 1);
            }
        }

        public void d(int i10, int i11) {
            e(i10, i11, (Object) null);
        }

        public void e(int i10, int i11, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((j) this.mObservers.get(size)).c(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((j) this.mObservers.get(size)).d(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((j) this.mObservers.get(size)).f(i10, i11);
            }
        }

        public void h() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((j) this.mObservers.get(size)).g();
            }
        }
    }

    public static abstract class j {
        public void a() {
        }

        public void b(int i10, int i11) {
        }

        public void c(int i10, int i11, Object obj) {
            b(i10, i11);
        }

        public void d(int i10, int i11) {
        }

        public void e(int i10, int i11, int i12) {
        }

        public void f(int i10, int i11) {
        }

        public void g() {
        }
    }

    private static final class k {
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    public interface l {
        int a(int i10, int i11);
    }

    public static class m {
        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView, int i10) {
            throw null;
        }
    }

    public static abstract class n {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private long mAddDuration = 120;
        private long mChangeDuration = 250;
        private ArrayList<a> mFinishedListeners = new ArrayList<>();
        private b mListener = null;
        private long mMoveDuration = 250;
        private long mRemoveDuration = 120;

        public interface a {
            void a();
        }

        interface b {
            void a(G g10);
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f43825a;

            /* renamed from: b  reason: collision with root package name */
            public int f43826b;

            /* renamed from: c  reason: collision with root package name */
            public int f43827c;

            /* renamed from: d  reason: collision with root package name */
            public int f43828d;

            public c a(G g10) {
                return b(g10, 0);
            }

            public c b(G g10, int i10) {
                View view = g10.itemView;
                this.f43825a = view.getLeft();
                this.f43826b = view.getTop();
                this.f43827c = view.getRight();
                this.f43828d = view.getBottom();
                return this;
            }
        }

        static int buildAdapterChangeFlagsForAnimations(G g10) {
            int i10 = g10.mFlags;
            int i11 = i10 & 14;
            if (g10.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i11;
            }
            int oldPosition = g10.getOldPosition();
            int absoluteAdapterPosition = g10.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i11 : i11 | FLAG_MOVED;
        }

        public abstract boolean animateAppearance(G g10, c cVar, c cVar2);

        public abstract boolean animateChange(G g10, G g11, c cVar, c cVar2);

        public abstract boolean animateDisappearance(G g10, c cVar, c cVar2);

        public abstract boolean animatePersistence(G g10, c cVar, c cVar2);

        public boolean canReuseUpdatedViewHolder(G g10) {
            return true;
        }

        public final void dispatchAnimationFinished(G g10) {
            onAnimationFinished(g10);
            b bVar = this.mListener;
            if (bVar != null) {
                bVar.a(g10);
            }
        }

        public final void dispatchAnimationStarted(G g10) {
            onAnimationStarted(g10);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.mFinishedListeners.get(i10).a();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(G g10);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(a aVar) {
            boolean isRunning = isRunning();
            if (aVar != null) {
                if (!isRunning) {
                    aVar.a();
                } else {
                    this.mFinishedListeners.add(aVar);
                }
            }
            return isRunning;
        }

        public c obtainHolderInfo() {
            return new c();
        }

        public void onAnimationFinished(G g10) {
        }

        public void onAnimationStarted(G g10) {
        }

        public c recordPostLayoutInformation(C c10, G g10) {
            return obtainHolderInfo().a(g10);
        }

        public c recordPreLayoutInformation(C c10, G g10, int i10, List<Object> list) {
            return obtainHolderInfo().a(g10);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j10) {
            this.mAddDuration = j10;
        }

        public void setChangeDuration(long j10) {
            this.mChangeDuration = j10;
        }

        /* access modifiers changed from: package-private */
        public void setListener(b bVar) {
            this.mListener = bVar;
        }

        public void setMoveDuration(long j10) {
            this.mMoveDuration = j10;
        }

        public void setRemoveDuration(long j10) {
            this.mRemoveDuration = j10;
        }

        public boolean canReuseUpdatedViewHolder(G g10, List<Object> list) {
            return canReuseUpdatedViewHolder(g10);
        }
    }

    private class o implements n.b {
        o() {
        }

        public void a(G g10) {
            g10.setIsRecyclable(true);
            if (g10.mShadowedHolder != null && g10.mShadowingHolder == null) {
                g10.mShadowedHolder = null;
            }
            g10.mShadowingHolder = null;
            if (!g10.shouldBeKeptAsChild() && !RecyclerView.this.j1(g10.itemView) && g10.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(g10.itemView, false);
            }
        }
    }

    public static abstract class p {
        @Deprecated
        public void f(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void g(Rect rect, View view, RecyclerView recyclerView, C c10) {
            f(rect, ((r) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, C c10) {
            h(canvas, recyclerView);
        }

        @Deprecated
        public void j(Canvas canvas, RecyclerView recyclerView) {
        }

        public void k(Canvas canvas, RecyclerView recyclerView, C c10) {
            j(canvas, recyclerView);
        }
    }

    public static abstract class q {

        /* renamed from: a  reason: collision with root package name */
        f f43830a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f43831b;

        /* renamed from: c  reason: collision with root package name */
        private final z.b f43832c;

        /* renamed from: d  reason: collision with root package name */
        private final z.b f43833d;

        /* renamed from: e  reason: collision with root package name */
        z f43834e;

        /* renamed from: f  reason: collision with root package name */
        z f43835f;

        /* renamed from: g  reason: collision with root package name */
        B f43836g;

        /* renamed from: h  reason: collision with root package name */
        boolean f43837h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f43838i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f43839j = false;

        /* renamed from: k  reason: collision with root package name */
        private boolean f43840k = true;

        /* renamed from: l  reason: collision with root package name */
        private boolean f43841l = true;

        /* renamed from: m  reason: collision with root package name */
        int f43842m;

        /* renamed from: n  reason: collision with root package name */
        boolean f43843n;

        /* renamed from: o  reason: collision with root package name */
        private int f43844o;

        /* renamed from: p  reason: collision with root package name */
        private int f43845p;

        /* renamed from: q  reason: collision with root package name */
        private int f43846q;

        /* renamed from: r  reason: collision with root package name */
        private int f43847r;

        class a implements z.b {
            a() {
            }

            public View a(int i10) {
                return q.this.k0(i10);
            }

            public int b(View view) {
                return q.this.s0(view) - ((r) view.getLayoutParams()).leftMargin;
            }

            public int c() {
                return q.this.t();
            }

            public int d() {
                return q.this.L0() - q.this.o();
            }

            public int e(View view) {
                return q.this.v0(view) + ((r) view.getLayoutParams()).rightMargin;
            }
        }

        class b implements z.b {
            b() {
            }

            public View a(int i10) {
                return q.this.k0(i10);
            }

            public int b(View view) {
                return q.this.w0(view) - ((r) view.getLayoutParams()).topMargin;
            }

            public int c() {
                return q.this.s();
            }

            public int d() {
                return q.this.y0() - q.this.c();
            }

            public int e(View view) {
                return q.this.q0(view) + ((r) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f43850a;

            /* renamed from: b  reason: collision with root package name */
            public int f43851b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f43852c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f43853d;
        }

        public q() {
            a aVar = new a();
            this.f43832c = aVar;
            b bVar = new b();
            this.f43833d = bVar;
            this.f43834e = new z(aVar);
            this.f43835f = new z(bVar);
        }

        public static d F0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M4.d.f38486a, i10, i11);
            dVar.f43850a = obtainStyledAttributes.getInt(M4.d.f38487b, 1);
            dVar.f43851b = obtainStyledAttributes.getInt(M4.d.f38497l, 1);
            dVar.f43852c = obtainStyledAttributes.getBoolean(M4.d.f38496k, false);
            dVar.f43853d = obtainStyledAttributes.getBoolean(M4.d.f38498m, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private void H(View view, int i10, boolean z10) {
            G p02 = RecyclerView.p0(view);
            if (z10 || p02.isRemoved()) {
                this.f43831b.f43757g.b(p02);
            } else {
                this.f43831b.f43757g.p(p02);
            }
            r rVar = (r) view.getLayoutParams();
            if (p02.wasReturnedFromScrap() || p02.isScrap()) {
                if (p02.isScrap()) {
                    p02.unScrap();
                } else {
                    p02.clearReturnedFromScrapFlag();
                }
                this.f43830a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f43831b) {
                int m10 = this.f43830a.m(view);
                if (i10 == -1) {
                    i10 = this.f43830a.g();
                }
                if (m10 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f43831b.indexOfChild(view) + this.f43831b.V());
                } else if (m10 != i10) {
                    this.f43831b.f43764n.a1(m10, i10);
                }
            } else {
                this.f43830a.a(view, i10, false);
                rVar.f43856c = true;
                B b10 = this.f43836g;
                if (b10 != null && b10.h()) {
                    this.f43836g.k(view);
                }
            }
            if (rVar.f43857d) {
                if (RecyclerView.f43689h1) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + rVar.f43854a);
                }
                p02.itemView.invalidate();
                rVar.f43857d = false;
            }
        }

        public static int P(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        private boolean Q0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int t10 = t();
            int s10 = s();
            int L02 = L0() - o();
            int y02 = y0() - c();
            Rect rect = this.f43831b.f43760j;
            r0(focusedChild, rect);
            return rect.left - i10 < L02 && rect.right - i10 > t10 && rect.top - i11 < y02 && rect.bottom - i11 > s10;
        }

        private static boolean V0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void V1(x xVar, int i10, View view) {
            G p02 = RecyclerView.p0(view);
            if (p02.shouldIgnore()) {
                if (RecyclerView.f43689h1) {
                    Log.d("RecyclerView", "ignoring view " + p02);
                }
            } else if (!p02.isInvalid() || p02.isRemoved() || this.f43831b.f43763m.hasStableIds()) {
                Z(i10);
                xVar.I(view);
                this.f43831b.f43757g.k(p02);
            } else {
                Q1(i10);
                xVar.H(p02);
            }
        }

        private void a0(int i10, View view) {
            this.f43830a.d(i10);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
            if (r5 == 1073741824) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m0(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001d
                if (r7 < 0) goto L_0x0012
            L_0x0010:
                r5 = r3
                goto L_0x0030
            L_0x0012:
                if (r7 != r1) goto L_0x001a
                if (r5 == r2) goto L_0x0022
                if (r5 == 0) goto L_0x001a
                if (r5 == r3) goto L_0x0022
            L_0x001a:
                r5 = r6
                r7 = r5
                goto L_0x0030
            L_0x001d:
                if (r7 < 0) goto L_0x0020
                goto L_0x0010
            L_0x0020:
                if (r7 != r1) goto L_0x0024
            L_0x0022:
                r7 = r4
                goto L_0x0030
            L_0x0024:
                if (r7 != r0) goto L_0x001a
                if (r5 == r2) goto L_0x002e
                if (r5 != r3) goto L_0x002b
                goto L_0x002e
            L_0x002b:
                r7 = r4
                r5 = r6
                goto L_0x0030
            L_0x002e:
                r7 = r4
                r5 = r2
            L_0x0030:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q.m0(int, int, int, int, boolean):int");
        }

        private int[] n0(View view, Rect rect) {
            int t10 = t();
            int s10 = s();
            int L02 = L0() - o();
            int y02 = y0() - c();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - t10;
            int min = Math.min(0, i10);
            int i11 = top - s10;
            int min2 = Math.min(0, i11);
            int i12 = width - L02;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - y02);
            if (A0() != 1) {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i12);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            return new int[]{max, min2};
        }

        public int A0() {
            return this.f43831b.getLayoutDirection();
        }

        public boolean A1(RecyclerView recyclerView, C c10, View view, View view2) {
            return z1(recyclerView, view, view2);
        }

        public int B() {
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView != null) {
                return C4600b0.E(recyclerView);
            }
            return 0;
        }

        public int B0(View view) {
            return ((r) view.getLayoutParams()).f43855b.left;
        }

        @SuppressLint({"UnknownNullness"})
        public void B1(Parcelable parcelable) {
        }

        public int C0() {
            return C4600b0.A(this.f43831b);
        }

        public Parcelable C1() {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void D(View view) {
            E(view, -1);
        }

        public int D0() {
            return C4600b0.B(this.f43831b);
        }

        public void D1(int i10) {
        }

        @SuppressLint({"UnknownNullness"})
        public void E(View view, int i10) {
            H(view, i10, true);
        }

        public int E0(View view) {
            return ((r) view.getLayoutParams()).a();
        }

        /* access modifiers changed from: package-private */
        public void E1(B b10) {
            if (this.f43836g == b10) {
                this.f43836g = null;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void F(View view) {
            G(view, -1);
        }

        /* access modifiers changed from: package-private */
        public boolean F1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f43831b;
            return G1(recyclerView.f43749c, recyclerView.f43717J0, i10, bundle);
        }

        @SuppressLint({"UnknownNullness"})
        public void G(View view, int i10) {
            H(view, i10, false);
        }

        public int G0(View view) {
            return ((r) view.getLayoutParams()).f43855b.right;
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x008f A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00cb  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00e4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean G1(androidx.recyclerview.widget.RecyclerView.x r11, androidx.recyclerview.widget.RecyclerView.C r12, int r13, android.os.Bundle r14) {
            /*
                r10 = this;
                androidx.recyclerview.widget.RecyclerView r11 = r10.f43831b
                r12 = 0
                if (r11 != 0) goto L_0x0006
                return r12
            L_0x0006:
                int r11 = r10.y0()
                int r0 = r10.L0()
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                androidx.recyclerview.widget.RecyclerView r2 = r10.f43831b
                android.graphics.Matrix r2 = r2.getMatrix()
                boolean r2 = r2.isIdentity()
                if (r2 == 0) goto L_0x002f
                androidx.recyclerview.widget.RecyclerView r2 = r10.f43831b
                boolean r2 = r2.getGlobalVisibleRect(r1)
                if (r2 == 0) goto L_0x002f
                int r11 = r1.height()
                int r0 = r1.width()
            L_0x002f:
                r1 = 8192(0x2000, float:1.14794E-41)
                r2 = 4096(0x1000, float:5.74E-42)
                r3 = 1
                if (r13 == r2) goto L_0x0067
                if (r13 == r1) goto L_0x003b
                r11 = r12
                r0 = r11
                goto L_0x008d
            L_0x003b:
                androidx.recyclerview.widget.RecyclerView r4 = r10.f43831b
                r5 = -1
                boolean r4 = r4.canScrollVertically(r5)
                if (r4 == 0) goto L_0x0050
                int r4 = r10.s()
                int r11 = r11 - r4
                int r4 = r10.c()
                int r11 = r11 - r4
                int r11 = -r11
                goto L_0x0051
            L_0x0050:
                r11 = r12
            L_0x0051:
                androidx.recyclerview.widget.RecyclerView r4 = r10.f43831b
                boolean r4 = r4.canScrollHorizontally(r5)
                if (r4 == 0) goto L_0x0065
                int r4 = r10.t()
                int r0 = r0 - r4
                int r4 = r10.o()
                int r0 = r0 - r4
                int r0 = -r0
                goto L_0x008d
            L_0x0065:
                r0 = r12
                goto L_0x008d
            L_0x0067:
                androidx.recyclerview.widget.RecyclerView r4 = r10.f43831b
                boolean r4 = r4.canScrollVertically(r3)
                if (r4 == 0) goto L_0x007a
                int r4 = r10.s()
                int r11 = r11 - r4
                int r4 = r10.c()
                int r11 = r11 - r4
                goto L_0x007b
            L_0x007a:
                r11 = r12
            L_0x007b:
                androidx.recyclerview.widget.RecyclerView r4 = r10.f43831b
                boolean r4 = r4.canScrollHorizontally(r3)
                if (r4 == 0) goto L_0x0065
                int r4 = r10.t()
                int r0 = r0 - r4
                int r4 = r10.o()
                int r0 = r0 - r4
            L_0x008d:
                if (r11 != 0) goto L_0x0092
                if (r0 != 0) goto L_0x0092
                return r12
            L_0x0092:
                r4 = 0
                r5 = 1065353216(0x3f800000, float:1.0)
                if (r14 == 0) goto L_0x00c2
                java.lang.String r6 = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT"
                float r14 = r14.getFloat(r6, r5)
                int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
                if (r6 >= 0) goto L_0x00c3
                boolean r11 = androidx.recyclerview.widget.RecyclerView.f43688g1
                if (r11 != 0) goto L_0x00a6
                return r12
            L_0x00a6:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value ("
                r12.append(r13)
                r12.append(r14)
                java.lang.String r13 = ")"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                throw r11
            L_0x00c2:
                r14 = r5
            L_0x00c3:
                r6 = 2139095040(0x7f800000, float:Infinity)
                int r6 = java.lang.Float.compare(r14, r6)
                if (r6 != 0) goto L_0x00e4
                androidx.recyclerview.widget.RecyclerView r11 = r10.f43831b
                androidx.recyclerview.widget.RecyclerView$h r14 = r11.f43763m
                if (r14 != 0) goto L_0x00d2
                return r12
            L_0x00d2:
                if (r13 == r2) goto L_0x00db
                if (r13 == r1) goto L_0x00d7
                goto L_0x00e3
            L_0x00d7:
                r11.F1(r12)
                goto L_0x00e3
            L_0x00db:
                int r12 = r14.getItemCount()
                int r12 = r12 - r3
                r11.F1(r12)
            L_0x00e3:
                return r3
            L_0x00e4:
                int r12 = java.lang.Float.compare(r5, r14)
                if (r12 == 0) goto L_0x00f6
                int r12 = java.lang.Float.compare(r4, r14)
                if (r12 == 0) goto L_0x00f6
                float r12 = (float) r0
                float r12 = r12 * r14
                int r0 = (int) r12
                float r11 = (float) r11
                float r11 = r11 * r14
                int r11 = (int) r11
            L_0x00f6:
                r6 = r11
                r5 = r0
                androidx.recyclerview.widget.RecyclerView r4 = r10.f43831b
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 1
                r7 = 0
                r4.E1(r5, r6, r7, r8, r9)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q.G1(androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$C, int, android.os.Bundle):boolean");
        }

        public int H0(x xVar, C c10) {
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView == null || recyclerView.f43763m == null || !N()) {
                return 1;
            }
            return this.f43831b.f43763m.getItemCount();
        }

        /* access modifiers changed from: package-private */
        public boolean H1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f43831b;
            return I1(recyclerView.f43749c, recyclerView.f43717J0, view, i10, bundle);
        }

        @SuppressLint({"UnknownNullness"})
        public void I(String str) {
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView != null) {
                recyclerView.r(str);
            }
        }

        public int I0(x xVar, C c10) {
            return 0;
        }

        public boolean I1(x xVar, C c10, View view, int i10, Bundle bundle) {
            return false;
        }

        public void J(View view, int i10) {
            K(view, i10, (r) view.getLayoutParams());
        }

        public int J0(View view) {
            return ((r) view.getLayoutParams()).f43855b.top;
        }

        public void J1() {
            for (int l02 = l0() - 1; l02 >= 0; l02--) {
                this.f43830a.q(l02);
            }
        }

        public void K(View view, int i10, r rVar) {
            G p02 = RecyclerView.p0(view);
            if (p02.isRemoved()) {
                this.f43831b.f43757g.b(p02);
            } else {
                this.f43831b.f43757g.p(p02);
            }
            this.f43830a.c(view, i10, rVar, p02.isRemoved());
        }

        public void K0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((r) view.getLayoutParams()).f43855b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f43831b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f43831b.f43762l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void K1(x xVar) {
            for (int l02 = l0() - 1; l02 >= 0; l02--) {
                if (!RecyclerView.p0(k0(l02)).shouldIgnore()) {
                    N1(l02, xVar);
                }
            }
        }

        public void L(View view, Rect rect) {
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.u0(view));
            }
        }

        public int L0() {
            return this.f43846q;
        }

        /* access modifiers changed from: package-private */
        public void L1(x xVar) {
            int j10 = xVar.j();
            for (int i10 = j10 - 1; i10 >= 0; i10--) {
                View n10 = xVar.n(i10);
                G p02 = RecyclerView.p0(n10);
                if (!p02.shouldIgnore()) {
                    p02.setIsRecyclable(false);
                    if (p02.isTmpDetached()) {
                        this.f43831b.removeDetachedView(n10, false);
                    }
                    n nVar = this.f43831b.f43726O;
                    if (nVar != null) {
                        nVar.endAnimation(p02);
                    }
                    p02.setIsRecyclable(true);
                    xVar.D(n10);
                }
            }
            xVar.e();
            if (j10 > 0) {
                this.f43831b.invalidate();
            }
        }

        public boolean M() {
            return false;
        }

        public int M0() {
            return this.f43844o;
        }

        public void M1(View view, x xVar) {
            P1(view);
            xVar.G(view);
        }

        public boolean N() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean N0() {
            int l02 = l0();
            for (int i10 = 0; i10 < l02; i10++) {
                ViewGroup.LayoutParams layoutParams = k0(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void N1(int i10, x xVar) {
            View k02 = k0(i10);
            Q1(i10);
            xVar.G(k02);
        }

        public boolean O(r rVar) {
            return rVar != null;
        }

        public boolean O0() {
            return this.f43838i;
        }

        public boolean O1(Runnable runnable) {
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public boolean P0() {
            return this.f43839j;
        }

        @SuppressLint({"UnknownNullness"})
        public void P1(View view) {
            this.f43830a.p(view);
        }

        @SuppressLint({"UnknownNullness"})
        public void Q(int i10, int i11, C c10, c cVar) {
        }

        public void Q1(int i10) {
            if (k0(i10) != null) {
                this.f43830a.q(i10);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void R(int i10, c cVar) {
        }

        public final boolean R0() {
            return this.f43841l;
        }

        public boolean R1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return S1(recyclerView, view, rect, z10, false);
        }

        public int S(C c10) {
            return 0;
        }

        public boolean S0(x xVar, C c10) {
            return false;
        }

        public boolean S1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] n02 = n0(view, rect);
            int i10 = n02[0];
            int i11 = n02[1];
            if ((z11 && !Q0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.B1(i10, i11);
            }
            return true;
        }

        public int T(C c10) {
            return 0;
        }

        public boolean T0() {
            return false;
        }

        public void T1() {
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int U(C c10) {
            return 0;
        }

        public boolean U0() {
            return this.f43840k;
        }

        public void U1() {
            this.f43837h = true;
        }

        public int V(C c10) {
            return 0;
        }

        public int W(C c10) {
            return 0;
        }

        public boolean W0() {
            B b10 = this.f43836g;
            return b10 != null && b10.h();
        }

        @SuppressLint({"UnknownNullness"})
        public int W1(int i10, x xVar, C c10) {
            return 0;
        }

        public int X(C c10) {
            return 0;
        }

        public boolean X0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f43834e.b(view, 24579) && this.f43835f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public void X1(int i10) {
            if (RecyclerView.f43689h1) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public void Y(x xVar) {
            for (int l02 = l0() - 1; l02 >= 0; l02--) {
                V1(xVar, l02, k0(l02));
            }
        }

        public void Y0(View view, int i10, int i11, int i12, int i13) {
            r rVar = (r) view.getLayoutParams();
            Rect rect = rVar.f43855b;
            view.layout(i10 + rect.left + rVar.leftMargin, i11 + rect.top + rVar.topMargin, (i12 - rect.right) - rVar.rightMargin, (i13 - rect.bottom) - rVar.bottomMargin);
        }

        @SuppressLint({"UnknownNullness"})
        public int Y1(int i10, x xVar, C c10) {
            return 0;
        }

        public void Z(int i10) {
            a0(i10, k0(i10));
        }

        public void Z0(View view, int i10, int i11) {
            r rVar = (r) view.getLayoutParams();
            Rect u02 = this.f43831b.u0(view);
            int i12 = i10 + u02.left + u02.right;
            int i13 = i11 + u02.top + u02.bottom;
            int m02 = m0(L0(), M0(), t() + o() + rVar.leftMargin + rVar.rightMargin + i12, rVar.width, M());
            int m03 = m0(y0(), z0(), s() + c() + rVar.topMargin + rVar.bottomMargin + i13, rVar.height, N());
            if (f2(view, m02, m03, rVar)) {
                view.measure(m02, m03);
            }
        }

        /* access modifiers changed from: package-private */
        public void Z1(RecyclerView recyclerView) {
            a2(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), CatalogRepository.FETCH_FLAG_SDB), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), CatalogRepository.FETCH_FLAG_SDB));
        }

        public int a() {
            RecyclerView recyclerView = this.f43831b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public void a1(int i10, int i11) {
            View k02 = k0(i10);
            if (k02 != null) {
                Z(i10);
                J(k02, i11);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f43831b.toString());
        }

        /* access modifiers changed from: package-private */
        public void a2(int i10, int i11) {
            this.f43846q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f43844o = mode;
            if (mode == 0 && !RecyclerView.f43693l1) {
                this.f43846q = 0;
            }
            this.f43847r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f43845p = mode2;
            if (mode2 == 0 && !RecyclerView.f43693l1) {
                this.f43847r = 0;
            }
        }

        /* access modifiers changed from: package-private */
        public void b0(RecyclerView recyclerView) {
            this.f43838i = true;
            f1(recyclerView);
        }

        public void b1(int i10) {
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView != null) {
                recyclerView.L0(i10);
            }
        }

        public void b2(int i10, int i11) {
            this.f43831b.setMeasuredDimension(i10, i11);
        }

        public int c() {
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void c0(RecyclerView recyclerView, x xVar) {
            this.f43838i = false;
            h1(recyclerView, xVar);
        }

        public void c1(int i10) {
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView != null) {
                recyclerView.M0(i10);
            }
        }

        public void c2(Rect rect, int i10, int i11) {
            b2(P(i10, rect.width() + t() + o(), D0()), P(i11, rect.height() + s() + c(), C0()));
        }

        public int d() {
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView != null) {
                return C4600b0.D(recyclerView);
            }
            return 0;
        }

        public View d0(View view) {
            View Y10;
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView == null || (Y10 = recyclerView.Y(view)) == null || this.f43830a.n(Y10)) {
                return null;
            }
            return Y10;
        }

        public void d1(h hVar, h hVar2) {
        }

        /* access modifiers changed from: package-private */
        public void d2(int i10, int i11) {
            int l02 = l0();
            if (l02 == 0) {
                this.f43831b.C(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < l02; i16++) {
                View k02 = k0(i16);
                Rect rect = this.f43831b.f43760j;
                r0(k02, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f43831b.f43760j.set(i15, i13, i12, i14);
            c2(this.f43831b.f43760j, i10, i11);
        }

        public View e0(int i10) {
            int l02 = l0();
            for (int i11 = 0; i11 < l02; i11++) {
                View k02 = k0(i11);
                G p02 = RecyclerView.p0(k02);
                if (p02 != null && p02.getLayoutPosition() == i10 && !p02.shouldIgnore() && (this.f43831b.f43717J0.e() || !p02.isRemoved())) {
                    return k02;
                }
            }
            return null;
        }

        public boolean e1(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e2(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f43831b = null;
                this.f43830a = null;
                this.f43846q = 0;
                this.f43847r = 0;
            } else {
                this.f43831b = recyclerView;
                this.f43830a = recyclerView.f43755f;
                this.f43846q = recyclerView.getWidth();
                this.f43847r = recyclerView.getHeight();
            }
            this.f43844o = CatalogRepository.FETCH_FLAG_SDB;
            this.f43845p = CatalogRepository.FETCH_FLAG_SDB;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract r f0();

        public void f1(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean f2(View view, int i10, int i11, r rVar) {
            return view.isLayoutRequested() || !this.f43840k || !V0(view.getWidth(), i10, rVar.width) || !V0(view.getHeight(), i11, rVar.height);
        }

        @SuppressLint({"UnknownNullness"})
        public r g0(Context context, AttributeSet attributeSet) {
            return new r(context, attributeSet);
        }

        @Deprecated
        public void g1(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean g2() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public r h0(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof r ? new r((r) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new r((ViewGroup.MarginLayoutParams) layoutParams) : new r(layoutParams);
        }

        @SuppressLint({"UnknownNullness"})
        public void h1(RecyclerView recyclerView, x xVar) {
            g1(recyclerView);
        }

        /* access modifiers changed from: package-private */
        public boolean h2(View view, int i10, int i11, r rVar) {
            return !this.f43840k || !V0(view.getMeasuredWidth(), i10, rVar.width) || !V0(view.getMeasuredHeight(), i11, rVar.height);
        }

        public int i0() {
            return -1;
        }

        public View i1(View view, int i10, x xVar, C c10) {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void i2(RecyclerView recyclerView, C c10, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int j0(View view) {
            return ((r) view.getLayoutParams()).f43855b.bottom;
        }

        public void j1(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f43831b;
            k1(recyclerView.f43749c, recyclerView.f43717J0, accessibilityEvent);
        }

        @SuppressLint({"UnknownNullness"})
        public void j2(B b10) {
            B b11 = this.f43836g;
            if (!(b11 == null || b10 == b11 || !b11.h())) {
                this.f43836g.r();
            }
            this.f43836g = b10;
            b10.q(this.f43831b, this);
        }

        public View k0(int i10) {
            f fVar = this.f43830a;
            if (fVar != null) {
                return fVar.f(i10);
            }
            return null;
        }

        public void k1(x xVar, C c10, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f43831b.canScrollVertically(-1) && !this.f43831b.canScrollHorizontally(-1) && !this.f43831b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                h hVar = this.f43831b.f43763m;
                if (hVar != null) {
                    accessibilityEvent.setItemCount(hVar.getItemCount());
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void k2() {
            B b10 = this.f43836g;
            if (b10 != null) {
                b10.r();
            }
        }

        public int l0() {
            f fVar = this.f43830a;
            if (fVar != null) {
                return fVar.g();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void l1(J2.t tVar) {
            RecyclerView recyclerView = this.f43831b;
            m1(recyclerView.f43749c, recyclerView.f43717J0, tVar);
        }

        public boolean l2() {
            return false;
        }

        public void m1(x xVar, C c10, J2.t tVar) {
            if (this.f43831b.canScrollVertically(-1) || this.f43831b.canScrollHorizontally(-1)) {
                tVar.a(8192);
                tVar.L0(true);
                tVar.u0(true);
            }
            if (this.f43831b.canScrollVertically(1) || this.f43831b.canScrollHorizontally(1)) {
                tVar.a(n.FLAG_APPEARED_IN_PRE_LAYOUT);
                tVar.L0(true);
                tVar.u0(true);
            }
            tVar.k0(t.e.b(H0(xVar, c10), p0(xVar, c10), S0(xVar, c10), I0(xVar, c10)));
        }

        /* access modifiers changed from: package-private */
        public void n1(View view, J2.t tVar) {
            G p02 = RecyclerView.p0(view);
            if (p02 != null && !p02.isRemoved() && !this.f43830a.n(p02.itemView)) {
                RecyclerView recyclerView = this.f43831b;
                o1(recyclerView.f43749c, recyclerView.f43717J0, view, tVar);
            }
        }

        public int o() {
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public boolean o0() {
            RecyclerView recyclerView = this.f43831b;
            return recyclerView != null && recyclerView.f43758h;
        }

        public void o1(x xVar, C c10, View view, J2.t tVar) {
            int i10 = 0;
            int E02 = N() ? E0(view) : 0;
            if (M()) {
                i10 = E0(view);
            }
            tVar.l0(t.f.a(E02, 1, i10, 1, false, false));
        }

        public int p0(x xVar, C c10) {
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView == null || recyclerView.f43763m == null || !M()) {
                return 1;
            }
            return this.f43831b.f43763m.getItemCount();
        }

        public View p1(View view, int i10) {
            return null;
        }

        public int q0(View view) {
            return view.getBottom() + j0(view);
        }

        public void q1(RecyclerView recyclerView, int i10, int i11) {
        }

        public void r0(View view, Rect rect) {
            RecyclerView.r0(view, rect);
        }

        public void r1(RecyclerView recyclerView) {
        }

        public int s() {
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int s0(View view) {
            return view.getLeft() - B0(view);
        }

        public void s1(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int t() {
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int t0(View view) {
            Rect rect = ((r) view.getLayoutParams()).f43855b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void t1(RecyclerView recyclerView, int i10, int i11) {
        }

        public int u0(View view) {
            Rect rect = ((r) view.getLayoutParams()).f43855b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void u1(RecyclerView recyclerView, int i10, int i11) {
        }

        public int v0(View view) {
            return view.getRight() + G0(view);
        }

        public void v1(RecyclerView recyclerView, int i10, int i11, Object obj) {
            u1(recyclerView, i10, i11);
        }

        public int w0(View view) {
            return view.getTop() - J0(view);
        }

        @SuppressLint({"UnknownNullness"})
        public void w1(x xVar, C c10) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public View x0() {
            View focusedChild;
            RecyclerView recyclerView = this.f43831b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f43830a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @SuppressLint({"UnknownNullness"})
        public void x1(C c10) {
        }

        public int y0() {
            return this.f43847r;
        }

        public void y1(x xVar, C c10, int i10, int i11) {
            this.f43831b.C(i10, i11);
        }

        public int z0() {
            return this.f43845p;
        }

        @Deprecated
        public boolean z1(RecyclerView recyclerView, View view, View view2) {
            return W0() || recyclerView.F0();
        }
    }

    public interface s {
        void b(View view);

        void d(View view);
    }

    public static abstract class t {
        public abstract boolean a(int i10, int i11);
    }

    public interface u {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z10);
    }

    public static abstract class v {
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        }

        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public static class w {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<a> f43858a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        int f43859b = 0;

        /* renamed from: c  reason: collision with root package name */
        Set<h<?>> f43860c = Collections.newSetFromMap(new IdentityHashMap());

        static class a {

            /* renamed from: a  reason: collision with root package name */
            final ArrayList<G> f43861a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            int f43862b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f43863c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f43864d = 0;

            a() {
            }
        }

        private a i(int i10) {
            a aVar = this.f43858a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f43858a.put(i10, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f43859b++;
        }

        /* access modifiers changed from: package-private */
        public void b(h<?> hVar) {
            this.f43860c.add(hVar);
        }

        public void c() {
            for (int i10 = 0; i10 < this.f43858a.size(); i10++) {
                a valueAt = this.f43858a.valueAt(i10);
                Iterator<G> it = valueAt.f43861a.iterator();
                while (it.hasNext()) {
                    N2.a.b(it.next().itemView);
                }
                valueAt.f43861a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f43859b--;
        }

        /* access modifiers changed from: package-private */
        public void e(h<?> hVar, boolean z10) {
            this.f43860c.remove(hVar);
            if (this.f43860c.size() == 0 && !z10) {
                for (int i10 = 0; i10 < this.f43858a.size(); i10++) {
                    SparseArray<a> sparseArray = this.f43858a;
                    ArrayList<G> arrayList = sparseArray.get(sparseArray.keyAt(i10)).f43861a;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        N2.a.b(arrayList.get(i11).itemView);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void f(int i10, long j10) {
            a i11 = i(i10);
            i11.f43864d = l(i11.f43864d, j10);
        }

        /* access modifiers changed from: package-private */
        public void g(int i10, long j10) {
            a i11 = i(i10);
            i11.f43863c = l(i11.f43863c, j10);
        }

        public G h(int i10) {
            a aVar = this.f43858a.get(i10);
            if (aVar == null || aVar.f43861a.isEmpty()) {
                return null;
            }
            ArrayList<G> arrayList = aVar.f43861a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void j(h<?> hVar, h<?> hVar2, boolean z10) {
            if (hVar != null) {
                d();
            }
            if (!z10 && this.f43859b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(G g10) {
            int itemViewType = g10.getItemViewType();
            ArrayList<G> arrayList = i(itemViewType).f43861a;
            if (this.f43858a.get(itemViewType).f43862b <= arrayList.size()) {
                N2.a.b(g10.itemView);
            } else if (!RecyclerView.f43688g1 || !arrayList.contains(g10)) {
                g10.resetInternal();
                arrayList.add(g10);
            } else {
                throw new IllegalArgumentException("this scrap item already exists");
            }
        }

        /* access modifiers changed from: package-private */
        public long l(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        /* access modifiers changed from: package-private */
        public boolean m(int i10, long j10, long j11) {
            long j12 = i(i10).f43864d;
            return j12 == 0 || j10 + j12 < j11;
        }

        /* access modifiers changed from: package-private */
        public boolean n(int i10, long j10, long j11) {
            long j12 = i(i10).f43863c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class x {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList<G> f43865a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<G> f43866b = null;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<G> f43867c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        private final List<G> f43868d;

        /* renamed from: e  reason: collision with root package name */
        private int f43869e;

        /* renamed from: f  reason: collision with root package name */
        int f43870f;

        /* renamed from: g  reason: collision with root package name */
        w f43871g;

        public x() {
            ArrayList<G> arrayList = new ArrayList<>();
            this.f43865a = arrayList;
            this.f43868d = Collections.unmodifiableList(arrayList);
            this.f43869e = 2;
            this.f43870f = 2;
        }

        private void B(h<?> hVar) {
            C(hVar, false);
        }

        private void C(h<?> hVar, boolean z10) {
            w wVar = this.f43871g;
            if (wVar != null) {
                wVar.e(hVar, z10);
            }
        }

        private boolean M(G g10, int i10, int i11, long j10) {
            g10.mBindingAdapter = null;
            g10.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = g10.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z10 = false;
            if (j10 != Long.MAX_VALUE && !this.f43871g.m(itemViewType, nanoTime, j10)) {
                return false;
            }
            if (g10.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(g10.itemView, recyclerView.getChildCount(), g10.itemView.getLayoutParams());
                z10 = true;
            }
            RecyclerView.this.f43763m.bindViewHolder(g10, i10);
            if (z10) {
                RecyclerView.this.detachViewFromParent(g10.itemView);
            }
            this.f43871g.f(g10.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(g10);
            if (RecyclerView.this.f43717J0.e()) {
                g10.mPreLayoutPosition = i11;
            }
            return true;
        }

        private void b(G g10) {
            if (RecyclerView.this.E0()) {
                View view = g10.itemView;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                v vVar = RecyclerView.this.f43731Q0;
                if (vVar != null) {
                    C4597a n10 = vVar.n();
                    if (n10 instanceof v.a) {
                        ((v.a) n10).o(view);
                    }
                    C4600b0.p0(view, n10);
                }
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private void r(G g10) {
            View view = g10.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.f43871g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f43763m != null && recyclerView.isAttachedToWindow()) {
                    this.f43871g.b(RecyclerView.this.f43763m);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void A() {
            for (int i10 = 0; i10 < this.f43867c.size(); i10++) {
                a.b(this.f43867c.get(i10).itemView);
            }
            B(RecyclerView.this.f43763m);
        }

        /* access modifiers changed from: package-private */
        public void D(View view) {
            G p02 = RecyclerView.p0(view);
            p02.mScrapContainer = null;
            p02.mInChangeScrap = false;
            p02.clearReturnedFromScrapFlag();
            H(p02);
        }

        /* access modifiers changed from: package-private */
        public void E() {
            for (int size = this.f43867c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f43867c.clear();
            if (RecyclerView.f43694m1) {
                RecyclerView.this.f43715I0.b();
            }
        }

        /* access modifiers changed from: package-private */
        public void F(int i10) {
            if (RecyclerView.f43689h1) {
                Log.d("RecyclerView", "Recycling cached view at index " + i10);
            }
            G g10 = this.f43867c.get(i10);
            if (RecyclerView.f43689h1) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + g10);
            }
            a(g10, true);
            this.f43867c.remove(i10);
        }

        public void G(View view) {
            G p02 = RecyclerView.p0(view);
            if (p02.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (p02.isScrap()) {
                p02.unScrap();
            } else if (p02.wasReturnedFromScrap()) {
                p02.clearReturnedFromScrapFlag();
            }
            H(p02);
            if (RecyclerView.this.f43726O != null && !p02.isRecyclable()) {
                RecyclerView.this.f43726O.endAnimation(p02);
            }
        }

        /* access modifiers changed from: package-private */
        public void H(G g10) {
            boolean z10;
            boolean z11 = false;
            boolean z12 = true;
            if (g10.isScrap() || g10.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(g10.isScrap());
                sb2.append(" isAttached:");
                if (g10.itemView.getParent() != null) {
                    z11 = true;
                }
                sb2.append(z11);
                sb2.append(RecyclerView.this.V());
                throw new IllegalArgumentException(sb2.toString());
            } else if (g10.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + g10 + RecyclerView.this.V());
            } else if (!g10.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = g10.doesTransientStatePreventRecycling();
                h hVar = RecyclerView.this.f43763m;
                boolean z13 = hVar != null && doesTransientStatePreventRecycling && hVar.onFailedToRecycleView(g10);
                if (!RecyclerView.f43688g1 || !this.f43867c.contains(g10)) {
                    if (z13 || g10.isRecyclable()) {
                        if (this.f43870f <= 0 || g10.hasAnyOfTheFlags(526)) {
                            z10 = false;
                        } else {
                            int size = this.f43867c.size();
                            if (size >= this.f43870f && size > 0) {
                                F(0);
                                size--;
                            }
                            if (RecyclerView.f43694m1 && size > 0 && !RecyclerView.this.f43715I0.d(g10.mPosition)) {
                                int i10 = size - 1;
                                while (i10 >= 0) {
                                    if (!RecyclerView.this.f43715I0.d(this.f43867c.get(i10).mPosition)) {
                                        break;
                                    }
                                    i10--;
                                }
                                size = i10 + 1;
                            }
                            this.f43867c.add(size, g10);
                            z10 = true;
                        }
                        if (!z10) {
                            a(g10, true);
                        } else {
                            z12 = false;
                        }
                        z11 = z10;
                    } else {
                        if (RecyclerView.f43689h1) {
                            Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.V());
                        }
                        z12 = false;
                    }
                    RecyclerView.this.f43757g.q(g10);
                    if (!z11 && !z12 && doesTransientStatePreventRecycling) {
                        a.b(g10.itemView);
                        g10.mBindingAdapter = null;
                        g10.mOwnerRecyclerView = null;
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("cached view received recycle internal? " + g10 + RecyclerView.this.V());
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.V());
            }
        }

        /* access modifiers changed from: package-private */
        public void I(View view) {
            G p02 = RecyclerView.p0(view);
            if (!p02.hasAnyOfTheFlags(12) && p02.isUpdated() && !RecyclerView.this.s(p02)) {
                if (this.f43866b == null) {
                    this.f43866b = new ArrayList<>();
                }
                p02.setScrapContainer(this, true);
                this.f43866b.add(p02);
            } else if (!p02.isInvalid() || p02.isRemoved() || RecyclerView.this.f43763m.hasStableIds()) {
                p02.setScrapContainer(this, false);
                this.f43865a.add(p02);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.V());
            }
        }

        /* access modifiers changed from: package-private */
        public void J(w wVar) {
            B(RecyclerView.this.f43763m);
            w wVar2 = this.f43871g;
            if (wVar2 != null) {
                wVar2.d();
            }
            this.f43871g = wVar;
            if (!(wVar == null || RecyclerView.this.getAdapter() == null)) {
                this.f43871g.a();
            }
            u();
        }

        /* access modifiers changed from: package-private */
        public void K(E e10) {
        }

        public void L(int i10) {
            this.f43869e = i10;
            P();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0175  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x019e  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x01a1  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x01fc  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x020a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.G N(int r19, boolean r20, long r21) {
            /*
                r18 = this;
                r6 = r18
                r3 = r19
                r0 = r20
                if (r3 < 0) goto L_0x022d
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$C r1 = r1.f43717J0
                int r1 = r1.b()
                if (r3 >= r1) goto L_0x022d
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$C r1 = r1.f43717J0
                boolean r1 = r1.e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$G r1 = r18.h(r19)
                if (r1 == 0) goto L_0x0028
                r4 = r7
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = r8
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$G r1 = r18.m(r19, r20)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.Q(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.addFlags(r5)
                boolean r5 = r1.isScrap()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.itemView
                r5.removeDetachedView(r9, r8)
                r1.unScrap()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.wasReturnedFromScrap()
                if (r5 == 0) goto L_0x0057
                r1.clearReturnedFromScrapFlag()
            L_0x0057:
                r6.H(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = r7
            L_0x005d:
                if (r1 != 0) goto L_0x011b
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f43753e
                int r5 = r5.m(r3)
                if (r5 < 0) goto L_0x011e
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f43763m
                int r9 = r9.getItemCount()
                if (r5 >= r9) goto L_0x011e
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f43763m
                int r9 = r9.getItemViewType(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r10 = r10.f43763m
                boolean r10 = r10.hasStableIds()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r1 = r1.f43763m
                long r10 = r1.getItemId(r5)
                androidx.recyclerview.widget.RecyclerView$G r1 = r6.l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.mPosition = r5
                r4 = r7
            L_0x0096:
                java.lang.String r0 = "RecyclerView"
                if (r1 != 0) goto L_0x00cb
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f43689h1
                if (r1 == 0) goto L_0x00b7
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r5 = "tryGetViewHolderForPositionByDeadline("
                r1.append(r5)
                r1.append(r3)
                java.lang.String r5 = ") fetching from shared pool"
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
            L_0x00b7:
                androidx.recyclerview.widget.RecyclerView$w r1 = r18.i()
                androidx.recyclerview.widget.RecyclerView$G r1 = r1.h(r9)
                if (r1 == 0) goto L_0x00cb
                r1.resetInternal()
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f43692k1
                if (r5 == 0) goto L_0x00cb
                r6.r(r1)
            L_0x00cb:
                if (r1 != 0) goto L_0x011b
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                long r16 = r1.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r1 = (r21 > r10 ? 1 : (r21 == r10 ? 0 : -1))
                if (r1 == 0) goto L_0x00ea
                androidx.recyclerview.widget.RecyclerView$w r10 = r6.f43871g
                r11 = r9
                r12 = r16
                r14 = r21
                boolean r1 = r10.n(r11, r12, r14)
                if (r1 != 0) goto L_0x00ea
                return r2
            L_0x00ea:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r2 = r1.f43763m
                androidx.recyclerview.widget.RecyclerView$G r1 = r2.createViewHolder(r1, r9)
                boolean r2 = androidx.recyclerview.widget.RecyclerView.f43694m1
                if (r2 == 0) goto L_0x0105
                android.view.View r2 = r1.itemView
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.c0(r2)
                if (r2 == 0) goto L_0x0105
                java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
                r5.<init>(r2)
                r1.mNestedRecyclerView = r5
            L_0x0105:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r2.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$w r2 = r6.f43871g
                long r10 = r10 - r16
                r2.g(r9, r10)
                boolean r2 = androidx.recyclerview.widget.RecyclerView.f43689h1
                if (r2 == 0) goto L_0x011b
                java.lang.String r2 = "tryGetViewHolderForPositionByDeadline created new ViewHolder"
                android.util.Log.d(r0, r2)
            L_0x011b:
                r9 = r1
                r10 = r4
                goto L_0x0156
            L_0x011e:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$C r2 = r2.f43717J0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.V()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0156:
                if (r10 == 0) goto L_0x018e
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$C r0 = r0.f43717J0
                boolean r0 = r0.e()
                if (r0 != 0) goto L_0x018e
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x018e
                r9.setFlags(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$C r0 = r0.f43717J0
                boolean r0 = r0.f43805k
                if (r0 == 0) goto L_0x018e
                int r0 = androidx.recyclerview.widget.RecyclerView.n.buildAdapterChangeFlagsForAnimations(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$n r2 = r1.f43726O
                androidx.recyclerview.widget.RecyclerView$C r1 = r1.f43717J0
                java.util.List r4 = r9.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$n$c r0 = r2.recordPreLayoutInformation(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.d1(r9, r0)
            L_0x018e:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$C r0 = r0.f43717J0
                boolean r0 = r0.e()
                if (r0 == 0) goto L_0x01a1
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x01a1
                r9.mPreLayoutPosition = r3
                goto L_0x01b4
            L_0x01a1:
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x01b6
                boolean r0 = r9.needsUpdate()
                if (r0 != 0) goto L_0x01b6
                boolean r0 = r9.isInvalid()
                if (r0 == 0) goto L_0x01b4
                goto L_0x01b6
            L_0x01b4:
                r0 = r8
                goto L_0x01f4
            L_0x01b6:
                boolean r0 = androidx.recyclerview.widget.RecyclerView.f43688g1
                if (r0 == 0) goto L_0x01e1
                boolean r0 = r9.isRemoved()
                if (r0 != 0) goto L_0x01c1
                goto L_0x01e1
            L_0x01c1:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Removed holder should be bound and it should come here only in pre-layout. Holder: "
                r1.append(r2)
                r1.append(r9)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.V()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x01e1:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f43753e
                int r2 = r0.m(r3)
                r0 = r18
                r1 = r9
                r3 = r19
                r4 = r21
                boolean r0 = r0.M(r1, r2, r3, r4)
            L_0x01f4:
                android.view.View r1 = r9.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x020a
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$r r1 = (androidx.recyclerview.widget.RecyclerView.r) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x0222
            L_0x020a:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0220
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$r r1 = (androidx.recyclerview.widget.RecyclerView.r) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x0222
            L_0x0220:
                androidx.recyclerview.widget.RecyclerView$r r1 = (androidx.recyclerview.widget.RecyclerView.r) r1
            L_0x0222:
                r1.f43854a = r9
                if (r10 == 0) goto L_0x0229
                if (r0 == 0) goto L_0x0229
                goto L_0x022a
            L_0x0229:
                r7 = r8
            L_0x022a:
                r1.f43857d = r7
                return r9
            L_0x022d:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$C r2 = r2.f43717J0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.V()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.x.N(int, boolean, long):androidx.recyclerview.widget.RecyclerView$G");
        }

        /* access modifiers changed from: package-private */
        public void O(G g10) {
            if (g10.mInChangeScrap) {
                this.f43866b.remove(g10);
            } else {
                this.f43865a.remove(g10);
            }
            g10.mScrapContainer = null;
            g10.mInChangeScrap = false;
            g10.clearReturnedFromScrapFlag();
        }

        /* access modifiers changed from: package-private */
        public void P() {
            q qVar = RecyclerView.this.f43764n;
            this.f43870f = this.f43869e + (qVar != null ? qVar.f43842m : 0);
            for (int size = this.f43867c.size() - 1; size >= 0 && this.f43867c.size() > this.f43870f; size--) {
                F(size);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean Q(G g10) {
            if (!g10.isRemoved()) {
                int i10 = g10.mPosition;
                if (i10 < 0 || i10 >= RecyclerView.this.f43763m.getItemCount()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + g10 + RecyclerView.this.V());
                } else if (!RecyclerView.this.f43717J0.e() && RecyclerView.this.f43763m.getItemViewType(g10.mPosition) != g10.getItemViewType()) {
                    return false;
                } else {
                    if (RecyclerView.this.f43763m.hasStableIds()) {
                        return g10.getItemId() == RecyclerView.this.f43763m.getItemId(g10.mPosition);
                    }
                    return true;
                }
            } else if (!RecyclerView.f43688g1 || RecyclerView.this.f43717J0.e()) {
                return RecyclerView.this.f43717J0.e();
            } else {
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.V());
            }
        }

        /* access modifiers changed from: package-private */
        public void R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f43867c.size() - 1; size >= 0; size--) {
                G g10 = this.f43867c.get(size);
                if (g10 != null && (i12 = g10.mPosition) >= i10 && i12 < i13) {
                    g10.addFlags(2);
                    F(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(G g10, boolean z10) {
            RecyclerView.u(g10);
            View view = g10.itemView;
            v vVar = RecyclerView.this.f43731Q0;
            if (vVar != null) {
                C4597a n10 = vVar.n();
                C4600b0.p0(view, n10 instanceof v.a ? ((v.a) n10).n(view) : null);
            }
            if (z10) {
                g(g10);
            }
            g10.mBindingAdapter = null;
            g10.mOwnerRecyclerView = null;
            i().k(g10);
        }

        public void c() {
            this.f43865a.clear();
            E();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            int size = this.f43867c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f43867c.get(i10).clearOldPosition();
            }
            int size2 = this.f43865a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f43865a.get(i11).clearOldPosition();
            }
            ArrayList<G> arrayList = this.f43866b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.f43866b.get(i12).clearOldPosition();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f43865a.clear();
            ArrayList<G> arrayList = this.f43866b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f43717J0.b()) {
                return !RecyclerView.this.f43717J0.e() ? i10 : RecyclerView.this.f43753e.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f43717J0.b() + RecyclerView.this.V());
        }

        /* access modifiers changed from: package-private */
        public void g(G g10) {
            y yVar = RecyclerView.this.f43765o;
            if (yVar != null) {
                yVar.a(g10);
            }
            int size = RecyclerView.this.f43766p.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.this.f43766p.get(i10).a(g10);
            }
            h hVar = RecyclerView.this.f43763m;
            if (hVar != null) {
                hVar.onViewRecycled(g10);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f43717J0 != null) {
                recyclerView.f43757g.q(g10);
            }
            if (RecyclerView.f43689h1) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + g10);
            }
        }

        /* access modifiers changed from: package-private */
        public G h(int i10) {
            int size;
            int m10;
            ArrayList<G> arrayList = this.f43866b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    G g10 = this.f43866b.get(i12);
                    if (g10.wasReturnedFromScrap() || g10.getLayoutPosition() != i10) {
                        i12++;
                    } else {
                        g10.addFlags(32);
                        return g10;
                    }
                }
                if (RecyclerView.this.f43763m.hasStableIds() && (m10 = RecyclerView.this.f43753e.m(i10)) > 0 && m10 < RecyclerView.this.f43763m.getItemCount()) {
                    long itemId = RecyclerView.this.f43763m.getItemId(m10);
                    while (i11 < size) {
                        G g11 = this.f43866b.get(i11);
                        if (g11.wasReturnedFromScrap() || g11.getItemId() != itemId) {
                            i11++;
                        } else {
                            g11.addFlags(32);
                            return g11;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public w i() {
            if (this.f43871g == null) {
                this.f43871g = new w();
                u();
            }
            return this.f43871g;
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return this.f43865a.size();
        }

        public List<G> k() {
            return this.f43868d;
        }

        /* access modifiers changed from: package-private */
        public G l(long j10, int i10, boolean z10) {
            for (int size = this.f43865a.size() - 1; size >= 0; size--) {
                G g10 = this.f43865a.get(size);
                if (g10.getItemId() == j10 && !g10.wasReturnedFromScrap()) {
                    if (i10 == g10.getItemViewType()) {
                        g10.addFlags(32);
                        if (g10.isRemoved() && !RecyclerView.this.f43717J0.e()) {
                            g10.setFlags(2, 14);
                        }
                        return g10;
                    } else if (!z10) {
                        this.f43865a.remove(size);
                        RecyclerView.this.removeDetachedView(g10.itemView, false);
                        D(g10.itemView);
                    }
                }
            }
            int size2 = this.f43867c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                G g11 = this.f43867c.get(size2);
                if (g11.getItemId() == j10 && !g11.isAttachedToTransitionOverlay()) {
                    if (i10 == g11.getItemViewType()) {
                        if (!z10) {
                            this.f43867c.remove(size2);
                        }
                        return g11;
                    } else if (!z10) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public G m(int i10, boolean z10) {
            View e10;
            int size = this.f43865a.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                G g10 = this.f43865a.get(i12);
                if (g10.wasReturnedFromScrap() || g10.getLayoutPosition() != i10 || g10.isInvalid() || (!RecyclerView.this.f43717J0.f43802h && g10.isRemoved())) {
                    i12++;
                } else {
                    g10.addFlags(32);
                    return g10;
                }
            }
            if (z10 || (e10 = RecyclerView.this.f43755f.e(i10)) == null) {
                int size2 = this.f43867c.size();
                while (i11 < size2) {
                    G g11 = this.f43867c.get(i11);
                    if (g11.isInvalid() || g11.getLayoutPosition() != i10 || g11.isAttachedToTransitionOverlay()) {
                        i11++;
                    } else {
                        if (!z10) {
                            this.f43867c.remove(i11);
                        }
                        if (RecyclerView.f43689h1) {
                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + g11);
                        }
                        return g11;
                    }
                }
                return null;
            }
            G p02 = RecyclerView.p0(e10);
            RecyclerView.this.f43755f.s(e10);
            int m10 = RecyclerView.this.f43755f.m(e10);
            if (m10 != -1) {
                RecyclerView.this.f43755f.d(m10);
                I(e10);
                p02.addFlags(8224);
                return p02;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + p02 + RecyclerView.this.V());
        }

        /* access modifiers changed from: package-private */
        public View n(int i10) {
            return this.f43865a.get(i10).itemView;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        /* access modifiers changed from: package-private */
        public View p(int i10, boolean z10) {
            return N(i10, z10, Long.MAX_VALUE).itemView;
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.f43867c.size();
            for (int i10 = 0; i10 < size; i10++) {
                r rVar = (r) this.f43867c.get(i10).itemView.getLayoutParams();
                if (rVar != null) {
                    rVar.f43856c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void t() {
            int size = this.f43867c.size();
            for (int i10 = 0; i10 < size; i10++) {
                G g10 = this.f43867c.get(i10);
                if (g10 != null) {
                    g10.addFlags(6);
                    g10.addChangePayload((Object) null);
                }
            }
            h hVar = RecyclerView.this.f43763m;
            if (hVar == null || !hVar.hasStableIds()) {
                E();
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i10, int i11) {
            int size = this.f43867c.size();
            for (int i12 = 0; i12 < size; i12++) {
                G g10 = this.f43867c.get(i12);
                if (g10 != null && g10.mPosition >= i10) {
                    if (RecyclerView.f43689h1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + g10 + " now at position " + (g10.mPosition + i11));
                    }
                    g10.offsetPosition(i11, false);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i14 = -1;
                i13 = i10;
                i12 = i11;
            } else {
                i14 = 1;
                i12 = i10;
                i13 = i11;
            }
            int size = this.f43867c.size();
            for (int i16 = 0; i16 < size; i16++) {
                G g10 = this.f43867c.get(i16);
                if (g10 != null && (i15 = g10.mPosition) >= i13 && i15 <= i12) {
                    if (i15 == i10) {
                        g10.offsetPosition(i11 - i10, false);
                    } else {
                        g10.offsetPosition(i14, false);
                    }
                    if (RecyclerView.f43689h1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i16 + " holder " + g10);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f43867c.size() - 1; size >= 0; size--) {
                G g10 = this.f43867c.get(size);
                if (g10 != null) {
                    int i13 = g10.mPosition;
                    if (i13 >= i12) {
                        if (RecyclerView.f43689h1) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + g10 + " now at position " + (g10.mPosition - i11));
                        }
                        g10.offsetPosition(-i11, z10);
                    } else if (i13 >= i10) {
                        g10.addFlags(8);
                        F(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void y(h<?> hVar, h<?> hVar2, boolean z10) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z10);
            u();
        }

        /* access modifiers changed from: package-private */
        public void z() {
            u();
        }
    }

    public interface y {
        void a(G g10);
    }

    private class z extends j {
        z() {
        }

        public void a() {
            RecyclerView.this.r((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f43717J0.f43801g = true;
            recyclerView.b1(true);
            if (!RecyclerView.this.f43753e.p()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.r((String) null);
            if (RecyclerView.this.f43753e.r(i10, i11, obj)) {
                h();
            }
        }

        public void d(int i10, int i11) {
            RecyclerView.this.r((String) null);
            if (RecyclerView.this.f43753e.s(i10, i11)) {
                h();
            }
        }

        public void e(int i10, int i11, int i12) {
            RecyclerView.this.r((String) null);
            if (RecyclerView.this.f43753e.t(i10, i11, i12)) {
                h();
            }
        }

        public void f(int i10, int i11) {
            RecyclerView.this.r((String) null);
            if (RecyclerView.this.f43753e.u(i10, i11)) {
                h();
            }
        }

        public void g() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f43751d != null && (hVar = recyclerView.f43763m) != null && hVar.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f43771u || !recyclerView.f43770t) {
                recyclerView.f43702C = true;
                recyclerView.requestLayout();
                return;
            }
            C4600b0.g0(recyclerView, recyclerView.f43759i);
        }
    }

    static {
        Class cls = Integer.TYPE;
        f43695n1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    @SuppressLint({"InlinedApi"})
    private void A0() {
        if (C4600b0.y(this) == 0) {
            C4600b0.B0(this, 8);
        }
    }

    private void B(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String t02 = t0(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(t02, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(q.class);
                    try {
                        constructor = asSubclass.getConstructor(f43695n1);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                    } catch (NoSuchMethodException e10) {
                        objArr = null;
                        constructor = asSubclass.getConstructor((Class[]) null);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((q) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e11) {
                    e11.initCause(e10);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + t02, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + t02, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + t02, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + t02, e14);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + t02, e15);
                } catch (ClassCastException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + t02, e16);
                }
            }
        }
    }

    private void B0() {
        this.f43755f = new f(new C7001f());
    }

    private boolean D(int i10, int i11) {
        b0(this.f43735S0);
        int[] iArr = this.f43735S0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private void G() {
        int i10 = this.f43700B;
        this.f43700B = 0;
        if (i10 != 0 && E0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(n.FLAG_MOVED);
            b.b(obtain, i10);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private boolean G0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || Y(view2) == null) {
            return false;
        }
        if (view == null || Y(view) == null) {
            return true;
        }
        this.f43760j.set(0, 0, view.getWidth(), view.getHeight());
        this.f43761k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f43760j);
        offsetDescendantRectToMyCoords(view2, this.f43761k);
        char c10 = 65535;
        int i12 = this.f43764n.A0() == 1 ? -1 : 1;
        Rect rect = this.f43760j;
        int i13 = rect.left;
        Rect rect2 = this.f43761k;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + V());
    }

    private void I() {
        boolean z10 = true;
        this.f43717J0.a(1);
        W(this.f43717J0);
        this.f43717J0.f43804j = false;
        G1();
        this.f43757g.f();
        S0();
        a1();
        s1();
        C c10 = this.f43717J0;
        if (!c10.f43805k || !this.f43725N0) {
            z10 = false;
        }
        c10.f43803i = z10;
        this.f43725N0 = false;
        this.f43723M0 = false;
        c10.f43802h = c10.f43806l;
        c10.f43800f = this.f43763m.getItemCount();
        b0(this.f43735S0);
        if (this.f43717J0.f43805k) {
            int g10 = this.f43755f.g();
            for (int i10 = 0; i10 < g10; i10++) {
                G p02 = p0(this.f43755f.f(i10));
                if (!p02.shouldIgnore() && (!p02.isInvalid() || this.f43763m.hasStableIds())) {
                    this.f43757g.e(p02, this.f43726O.recordPreLayoutInformation(this.f43717J0, p02, n.buildAdapterChangeFlagsForAnimations(p02), p02.getUnmodifiedPayloads()));
                    if (this.f43717J0.f43803i && p02.isUpdated() && !p02.isRemoved() && !p02.shouldIgnore() && !p02.isInvalid()) {
                        this.f43757g.c(l0(p02), p02);
                    }
                }
            }
        }
        if (this.f43717J0.f43806l) {
            t1();
            C c11 = this.f43717J0;
            boolean z11 = c11.f43801g;
            c11.f43801g = false;
            this.f43764n.w1(this.f43749c, c11);
            this.f43717J0.f43801g = z11;
            for (int i11 = 0; i11 < this.f43755f.g(); i11++) {
                G p03 = p0(this.f43755f.f(i11));
                if (!p03.shouldIgnore() && !this.f43757g.i(p03)) {
                    int buildAdapterChangeFlagsForAnimations = n.buildAdapterChangeFlagsForAnimations(p03);
                    boolean hasAnyOfTheFlags = p03.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        buildAdapterChangeFlagsForAnimations |= n.FLAG_APPEARED_IN_PRE_LAYOUT;
                    }
                    n.c recordPreLayoutInformation = this.f43726O.recordPreLayoutInformation(this.f43717J0, p03, buildAdapterChangeFlagsForAnimations, p03.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        d1(p03, recordPreLayoutInformation);
                    } else {
                        this.f43757g.a(p03, recordPreLayoutInformation);
                    }
                }
            }
            v();
        } else {
            v();
        }
        T0();
        K1(false);
        this.f43717J0.f43799e = 2;
    }

    private void I1(int i10) {
        boolean M10 = this.f43764n.M();
        if (this.f43764n.N()) {
            M10 |= true;
        }
        H1(M10 ? 1 : 0, i10);
    }

    private void J() {
        G1();
        S0();
        this.f43717J0.a(6);
        this.f43753e.j();
        this.f43717J0.f43800f = this.f43763m.getItemCount();
        this.f43717J0.f43798d = 0;
        if (this.f43751d != null && this.f43763m.canRestoreState()) {
            Parcelable parcelable = this.f43751d.f43779c;
            if (parcelable != null) {
                this.f43764n.B1(parcelable);
            }
            this.f43751d = null;
        }
        C c10 = this.f43717J0;
        c10.f43802h = false;
        this.f43764n.w1(this.f43749c, c10);
        C c11 = this.f43717J0;
        c11.f43801g = false;
        c11.f43805k = c11.f43805k && this.f43726O != null;
        c11.f43799e = 4;
        T0();
        K1(false);
    }

    private boolean J1(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f43718K;
        if (edgeEffect == null || d.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            d.d(this.f43718K, 0.0f, 1.0f - (motionEvent.getY() / ((float) getHeight())));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.f43722M;
        if (!(edgeEffect2 == null || d.b(edgeEffect2) == 0.0f || canScrollHorizontally(1))) {
            d.d(this.f43722M, 0.0f, motionEvent.getY() / ((float) getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.f43720L;
        if (!(edgeEffect3 == null || d.b(edgeEffect3) == 0.0f || canScrollVertically(-1))) {
            d.d(this.f43720L, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.f43724N;
        if (edgeEffect4 == null || d.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        d.d(this.f43724N, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    private void K() {
        this.f43717J0.a(4);
        G1();
        S0();
        C c10 = this.f43717J0;
        c10.f43799e = 1;
        if (c10.f43805k) {
            for (int g10 = this.f43755f.g() - 1; g10 >= 0; g10--) {
                G p02 = p0(this.f43755f.f(g10));
                if (!p02.shouldIgnore()) {
                    long l02 = l0(p02);
                    n.c recordPostLayoutInformation = this.f43726O.recordPostLayoutInformation(this.f43717J0, p02);
                    G g11 = this.f43757g.g(l02);
                    if (g11 == null || g11.shouldIgnore()) {
                        this.f43757g.d(p02, recordPostLayoutInformation);
                    } else {
                        boolean h10 = this.f43757g.h(g11);
                        boolean h11 = this.f43757g.h(p02);
                        if (!h10 || g11 != p02) {
                            n.c n10 = this.f43757g.n(g11);
                            this.f43757g.d(p02, recordPostLayoutInformation);
                            n.c m10 = this.f43757g.m(p02);
                            if (n10 == null) {
                                w0(l02, p02, g11);
                            } else {
                                p(g11, p02, n10, m10, h10, h11);
                            }
                        } else {
                            this.f43757g.d(p02, recordPostLayoutInformation);
                        }
                    }
                }
            }
            this.f43757g.o(this.f43752d1);
        }
        this.f43764n.L1(this.f43749c);
        C c11 = this.f43717J0;
        c11.f43797c = c11.f43800f;
        this.f43708F = false;
        this.f43710G = false;
        c11.f43805k = false;
        c11.f43806l = false;
        this.f43764n.f43837h = false;
        ArrayList<G> arrayList = this.f43749c.f43866b;
        if (arrayList != null) {
            arrayList.clear();
        }
        q qVar = this.f43764n;
        if (qVar.f43843n) {
            qVar.f43842m = 0;
            qVar.f43843n = false;
            this.f43749c.P();
        }
        this.f43764n.x1(this.f43717J0);
        T0();
        K1(false);
        this.f43757g.f();
        int[] iArr = this.f43735S0;
        if (D(iArr[0], iArr[1])) {
            O(0, 0);
        }
        e1();
        q1();
    }

    private void K0(int i10, int i11, MotionEvent motionEvent, int i12) {
        q qVar = this.f43764n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f43777z) {
            int[] iArr = this.f43741W0;
            int i13 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean M10 = qVar.M();
            boolean N10 = this.f43764n.N();
            boolean z10 = N10 ? M10 | true : M10;
            float height = motionEvent == null ? ((float) getHeight()) / 2.0f : motionEvent.getY();
            float width = motionEvent == null ? ((float) getWidth()) / 2.0f : motionEvent.getX();
            int g12 = i10 - g1(i10, height);
            int h12 = i11 - h1(i11, width);
            H1(z10 ? 1 : 0, i12);
            if (L(M10 ? g12 : 0, N10 ? h12 : 0, this.f43741W0, this.f43739U0, i12)) {
                int[] iArr2 = this.f43741W0;
                g12 -= iArr2[0];
                h12 -= iArr2[1];
            }
            int i14 = M10 ? g12 : 0;
            if (N10) {
                i13 = h12;
            }
            u1(i14, i13, motionEvent, i12);
            k kVar = this.f43713H0;
            if (!(kVar == null || (g12 == 0 && h12 == 0))) {
                kVar.f(this, g12, h12);
            }
            L1(i12);
        }
    }

    private void N1() {
        this.f43711G0.f();
        q qVar = this.f43764n;
        if (qVar != null) {
            qVar.k2();
        }
    }

    private boolean Q(MotionEvent motionEvent) {
        u uVar = this.f43769s;
        if (uVar != null) {
            uVar.a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f43769s = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return a0(motionEvent);
        }
    }

    private void V0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f43730Q) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f43730Q = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f43738U = x10;
            this.f43734S = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f43776y0 = y10;
            this.f43736T = y10;
        }
    }

    private boolean Z0() {
        return this.f43726O != null && this.f43764n.l2();
    }

    private boolean a0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f43768r.size();
        int i10 = 0;
        while (i10 < size) {
            u uVar = this.f43768r.get(i10);
            if (!uVar.c(this, motionEvent) || action == 3) {
                i10++;
            } else {
                this.f43769s = uVar;
                return true;
            }
        }
        return false;
    }

    private void a1() {
        boolean z10;
        if (this.f43708F) {
            this.f43753e.y();
            if (this.f43710G) {
                this.f43764n.r1(this);
            }
        }
        if (Z0()) {
            this.f43753e.w();
        } else {
            this.f43753e.j();
        }
        boolean z11 = true;
        boolean z12 = this.f43723M0 || this.f43725N0;
        this.f43717J0.f43805k = this.f43773w && this.f43726O != null && ((z10 = this.f43708F) || z12 || this.f43764n.f43837h) && (!z10 || this.f43763m.hasStableIds());
        C c10 = this.f43717J0;
        if (!c10.f43805k || !z12 || this.f43708F || !Z0()) {
            z11 = false;
        }
        c10.f43806l = z11;
    }

    private void b0(int[] iArr) {
        int g10 = this.f43755f.g();
        if (g10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < g10; i12++) {
            G p02 = p0(this.f43755f.f(i12));
            if (!p02.shouldIgnore()) {
                int layoutPosition = p02.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    static RecyclerView c0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView c02 = c0(viewGroup.getChildAt(i10));
            if (c02 != null) {
                return c02;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c1(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0021
            r6.S()
            android.widget.EdgeEffect r1 = r6.f43718K
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.d.d(r1, r4, r9)
        L_0x001f:
            r9 = r3
            goto L_0x003c
        L_0x0021:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x003b
            r6.T()
            android.widget.EdgeEffect r1 = r6.f43722M
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.d.d(r1, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            r6.U()
            android.widget.EdgeEffect r9 = r6.f43720L
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.d.d(r9, r1, r7)
            goto L_0x0072
        L_0x0056:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            r6.R()
            android.widget.EdgeEffect r9 = r6.f43724N
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.d.d(r9, r1, r2)
            goto L_0x0072
        L_0x0071:
            r3 = r9
        L_0x0072:
            if (r3 != 0) goto L_0x007c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            r6.postInvalidateOnAnimation()
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c1(float, float, float, float):void");
    }

    private View d0() {
        G e02;
        C c10 = this.f43717J0;
        int i10 = c10.f43807m;
        if (i10 == -1) {
            i10 = 0;
        }
        int b10 = c10.b();
        int i11 = i10;
        while (i11 < b10) {
            G e03 = e0(i11);
            if (e03 == null) {
                break;
            } else if (e03.itemView.hasFocusable()) {
                return e03.itemView;
            } else {
                i11++;
            }
        }
        int min = Math.min(b10, i10);
        while (true) {
            min--;
            if (min < 0 || (e02 = e0(min)) == null) {
                return null;
            }
            if (e02.itemView.hasFocusable()) {
                return e02.itemView;
            }
        }
    }

    private void e1() {
        View findViewById;
        if (this.f43709F0 && this.f43763m != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    if (!this.f43755f.n(getFocusedChild())) {
                        return;
                    }
                }
                View view = null;
                G f02 = (this.f43717J0.f43808n == -1 || !this.f43763m.hasStableIds()) ? null : f0(this.f43717J0.f43808n);
                if (f02 != null && !this.f43755f.n(f02.itemView) && f02.itemView.hasFocusable()) {
                    view = f02.itemView;
                } else if (this.f43755f.g() > 0) {
                    view = d0();
                }
                if (view != null) {
                    int i10 = this.f43717J0.f43809o;
                    if (!(((long) i10) == -1 || (findViewById = view.findViewById(i10)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void f1() {
        boolean z10;
        EdgeEffect edgeEffect = this.f43718K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.f43718K.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f43720L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.f43720L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f43722M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.f43722M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f43724N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.f43724N.isFinished();
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    private int g1(int i10, float f10) {
        float height = f10 / ((float) getHeight());
        float width = ((float) i10) / ((float) getWidth());
        EdgeEffect edgeEffect = this.f43718K;
        float f11 = 0.0f;
        if (edgeEffect == null || d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f43722M;
            if (!(edgeEffect2 == null || d.b(edgeEffect2) == 0.0f)) {
                if (canScrollHorizontally(1)) {
                    this.f43722M.onRelease();
                } else {
                    float d10 = d.d(this.f43722M, width, height);
                    if (d.b(this.f43722M) == 0.0f) {
                        this.f43722M.onRelease();
                    }
                    f11 = d10;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f43718K.onRelease();
            } else {
                float f12 = -d.d(this.f43718K, -width, 1.0f - height);
                if (d.b(this.f43718K) == 0.0f) {
                    this.f43718K.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * ((float) getWidth()));
    }

    private I2.E getScrollingChildHelper() {
        if (this.f43737T0 == null) {
            this.f43737T0 = new I2.E(this);
        }
        return this.f43737T0;
    }

    private int h1(int i10, float f10) {
        float width = f10 / ((float) getWidth());
        float height = ((float) i10) / ((float) getHeight());
        EdgeEffect edgeEffect = this.f43720L;
        float f11 = 0.0f;
        if (edgeEffect == null || d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f43724N;
            if (!(edgeEffect2 == null || d.b(edgeEffect2) == 0.0f)) {
                if (canScrollVertically(1)) {
                    this.f43724N.onRelease();
                } else {
                    float d10 = d.d(this.f43724N, height, 1.0f - width);
                    if (d.b(this.f43724N) == 0.0f) {
                        this.f43724N.onRelease();
                    }
                    f11 = d10;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f43720L.onRelease();
            } else {
                float f12 = -d.d(this.f43720L, -height, width);
                if (d.b(this.f43720L) == 0.0f) {
                    this.f43720L.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * ((float) getHeight()));
    }

    private void i(G g10) {
        View view = g10.itemView;
        boolean z10 = view.getParent() == this;
        this.f43749c.O(o0(view));
        if (g10.isTmpDetached()) {
            this.f43755f.c(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.f43755f.b(view, true);
        } else {
            this.f43755f.k(view);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00da A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean i0(int r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            androidx.recyclerview.widget.RecyclerView$q r0 = r6.f43764n
            r1 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r7 = "RecyclerView"
            java.lang.String r8 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r7, r8)
            return r1
        L_0x000d:
            boolean r2 = r6.f43777z
            if (r2 == 0) goto L_0x0012
            return r1
        L_0x0012:
            boolean r0 = r0.M()
            androidx.recyclerview.widget.RecyclerView$q r2 = r6.f43764n
            boolean r2 = r2.N()
            if (r0 == 0) goto L_0x0024
            int r3 = java.lang.Math.abs(r7)
            if (r3 >= r9) goto L_0x0025
        L_0x0024:
            r7 = r1
        L_0x0025:
            if (r2 == 0) goto L_0x002d
            int r3 = java.lang.Math.abs(r8)
            if (r3 >= r9) goto L_0x002e
        L_0x002d:
            r8 = r1
        L_0x002e:
            if (r7 != 0) goto L_0x0033
            if (r8 != 0) goto L_0x0033
            return r1
        L_0x0033:
            r9 = 0
            if (r7 == 0) goto L_0x0076
            android.widget.EdgeEffect r3 = r6.f43718K
            if (r3 == 0) goto L_0x0058
            float r3 = androidx.core.widget.d.b(r3)
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0058
            android.widget.EdgeEffect r3 = r6.f43718K
            int r4 = -r7
            int r5 = r6.getWidth()
            boolean r3 = r6.z1(r3, r4, r5)
            if (r3 == 0) goto L_0x0055
            android.widget.EdgeEffect r7 = r6.f43718K
            r7.onAbsorb(r4)
        L_0x0054:
            r7 = r1
        L_0x0055:
            r3 = r7
            r7 = r1
            goto L_0x0077
        L_0x0058:
            android.widget.EdgeEffect r3 = r6.f43722M
            if (r3 == 0) goto L_0x0076
            float r3 = androidx.core.widget.d.b(r3)
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0076
            android.widget.EdgeEffect r3 = r6.f43722M
            int r4 = r6.getWidth()
            boolean r3 = r6.z1(r3, r7, r4)
            if (r3 == 0) goto L_0x0055
            android.widget.EdgeEffect r3 = r6.f43722M
            r3.onAbsorb(r7)
            goto L_0x0054
        L_0x0076:
            r3 = r1
        L_0x0077:
            if (r8 == 0) goto L_0x00b8
            android.widget.EdgeEffect r4 = r6.f43720L
            if (r4 == 0) goto L_0x009a
            float r4 = androidx.core.widget.d.b(r4)
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x009a
            android.widget.EdgeEffect r9 = r6.f43720L
            int r4 = -r8
            int r5 = r6.getHeight()
            boolean r9 = r6.z1(r9, r4, r5)
            if (r9 == 0) goto L_0x0098
            android.widget.EdgeEffect r8 = r6.f43720L
            r8.onAbsorb(r4)
        L_0x0097:
            r8 = r1
        L_0x0098:
            r9 = r1
            goto L_0x00ba
        L_0x009a:
            android.widget.EdgeEffect r4 = r6.f43724N
            if (r4 == 0) goto L_0x00b8
            float r4 = androidx.core.widget.d.b(r4)
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x00b8
            android.widget.EdgeEffect r9 = r6.f43724N
            int r4 = r6.getHeight()
            boolean r9 = r6.z1(r9, r8, r4)
            if (r9 == 0) goto L_0x0098
            android.widget.EdgeEffect r9 = r6.f43724N
            r9.onAbsorb(r8)
            goto L_0x0097
        L_0x00b8:
            r9 = r8
            r8 = r1
        L_0x00ba:
            r4 = 1
            if (r3 != 0) goto L_0x00bf
            if (r8 == 0) goto L_0x00d8
        L_0x00bf:
            int r5 = -r10
            int r3 = java.lang.Math.min(r3, r10)
            int r3 = java.lang.Math.max(r5, r3)
            int r8 = java.lang.Math.min(r8, r10)
            int r8 = java.lang.Math.max(r5, r8)
            r6.I1(r4)
            androidx.recyclerview.widget.RecyclerView$F r5 = r6.f43711G0
            r5.b(r3, r8)
        L_0x00d8:
            if (r7 != 0) goto L_0x00e2
            if (r9 != 0) goto L_0x00e2
            if (r3 != 0) goto L_0x00e0
            if (r8 == 0) goto L_0x00e1
        L_0x00e0:
            r1 = r4
        L_0x00e1:
            return r1
        L_0x00e2:
            float r8 = (float) r7
            float r3 = (float) r9
            boolean r5 = r6.dispatchNestedPreFling(r8, r3)
            if (r5 != 0) goto L_0x011c
            if (r0 != 0) goto L_0x00f1
            if (r2 == 0) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            r0 = r1
            goto L_0x00f2
        L_0x00f1:
            r0 = r4
        L_0x00f2:
            r6.dispatchNestedFling(r8, r3, r0)
            androidx.recyclerview.widget.RecyclerView$t r8 = r6.f43699A0
            if (r8 == 0) goto L_0x0100
            boolean r8 = r8.a(r7, r9)
            if (r8 == 0) goto L_0x0100
            return r4
        L_0x0100:
            if (r0 == 0) goto L_0x011c
            r6.I1(r4)
            int r8 = -r10
            int r7 = java.lang.Math.min(r7, r10)
            int r7 = java.lang.Math.max(r8, r7)
            int r9 = java.lang.Math.min(r9, r10)
            int r8 = java.lang.Math.max(r8, r9)
            androidx.recyclerview.widget.RecyclerView$F r9 = r6.f43711G0
            r9.b(r7, r8)
            return r4
        L_0x011c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.i0(int, int, int, int):boolean");
    }

    private void p(G g10, G g11, n.c cVar, n.c cVar2, boolean z10, boolean z11) {
        g10.setIsRecyclable(false);
        if (z10) {
            i(g10);
        }
        if (g10 != g11) {
            if (z11) {
                i(g11);
            }
            g10.mShadowedHolder = g11;
            i(g10);
            this.f43749c.O(g10);
            g11.setIsRecyclable(false);
            g11.mShadowingHolder = g10;
        }
        if (this.f43726O.animateChange(g10, g11, cVar, cVar2)) {
            Y0();
        }
    }

    static G p0(View view) {
        if (view == null) {
            return null;
        }
        return ((r) view.getLayoutParams()).f43854a;
    }

    private void p1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f43760j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof r) {
            r rVar = (r) layoutParams;
            if (!rVar.f43856c) {
                Rect rect = rVar.f43855b;
                Rect rect2 = this.f43760j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f43760j);
            offsetRectIntoDescendantCoords(view, this.f43760j);
        }
        this.f43764n.S1(this, view, this.f43760j, !this.f43773w, view2 == null);
    }

    private void q1() {
        C c10 = this.f43717J0;
        c10.f43808n = -1;
        c10.f43807m = -1;
        c10.f43809o = -1;
    }

    static void r0(View view, Rect rect) {
        r rVar = (r) view.getLayoutParams();
        Rect rect2 = rVar.f43855b;
        rect.set((view.getLeft() - rect2.left) - rVar.leftMargin, (view.getTop() - rect2.top) - rVar.topMargin, view.getRight() + rect2.right + rVar.rightMargin, view.getBottom() + rect2.bottom + rVar.bottomMargin);
    }

    private void r1() {
        VelocityTracker velocityTracker = this.f43732R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        L1(0);
        f1();
    }

    private int s0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private void s1() {
        G g10 = null;
        View focusedChild = (!this.f43709F0 || !hasFocus() || this.f43763m == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            g10 = Z(focusedChild);
        }
        if (g10 == null) {
            q1();
            return;
        }
        this.f43717J0.f43808n = this.f43763m.hasStableIds() ? g10.getItemId() : -1;
        this.f43717J0.f43807m = this.f43708F ? -1 : g10.isRemoved() ? g10.mOldPosition : g10.getAbsoluteAdapterPosition();
        this.f43717J0.f43809o = s0(g10.itemView);
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        f43688g1 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        f43689h1 = z10;
    }

    private void t() {
        r1();
        setScrollState(0);
    }

    private String t0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    static void u(G g10) {
        WeakReference<RecyclerView> weakReference = g10.mNestedRecyclerView;
        if (weakReference != null) {
            View view = weakReference.get();
            while (view != null) {
                if (view != g10.itemView) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            g10.mNestedRecyclerView = null;
        }
    }

    private float v0(int i10) {
        double log = Math.log((double) ((((float) Math.abs(i10)) * 0.35f) / (this.f43745a * 0.015f)));
        float f10 = f43691j1;
        return (float) (((double) (this.f43745a * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * log));
    }

    private void w0(long j10, G g10, G g11) {
        int g12 = this.f43755f.g();
        for (int i10 = 0; i10 < g12; i10++) {
            G p02 = p0(this.f43755f.f(i10));
            if (p02 != g10 && l0(p02) == j10) {
                h hVar = this.f43763m;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + p02 + " \n View Holder 2:" + g10 + V());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + p02 + " \n View Holder 2:" + g10 + V());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + g11 + " cannot be found but it is necessary for " + g10 + V());
    }

    private void x1(h<?> hVar, boolean z10, boolean z11) {
        h hVar2 = this.f43763m;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.f43747b);
            this.f43763m.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            i1();
        }
        this.f43753e.y();
        h hVar3 = this.f43763m;
        this.f43763m = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f43747b);
            hVar.onAttachedToRecyclerView(this);
        }
        q qVar = this.f43764n;
        if (qVar != null) {
            qVar.d1(hVar3, this.f43763m);
        }
        this.f43749c.y(hVar3, this.f43763m, z10);
        this.f43717J0.f43801g = true;
    }

    private int y(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && d.b(edgeEffect) != 0.0f) {
            int round = Math.round((((float) (-i11)) / 4.0f) * d.d(edgeEffect, (((float) (-i10)) * 4.0f) / ((float) i11), 0.5f));
            if (round != i10) {
                edgeEffect.finish();
            }
            return i10 - round;
        } else if (i10 >= 0 || edgeEffect2 == null || d.b(edgeEffect2) == 0.0f) {
            return i10;
        } else {
            float f10 = (float) i11;
            int round2 = Math.round((f10 / 4.0f) * d.d(edgeEffect2, (((float) i10) * 4.0f) / f10, 0.5f));
            if (round2 != i10) {
                edgeEffect2.finish();
            }
            return i10 - round2;
        }
    }

    private boolean y0() {
        int g10 = this.f43755f.g();
        for (int i10 = 0; i10 < g10; i10++) {
            G p02 = p0(this.f43755f.f(i10));
            if (p02 != null && !p02.shouldIgnore() && p02.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private boolean z1(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return v0(-i10) < d.b(edgeEffect) * ((float) i11);
    }

    /* access modifiers changed from: package-private */
    public void A() {
        if (!this.f43773w || this.f43708F) {
            Trace.beginSection("RV FullInvalidate");
            H();
            Trace.endSection();
        } else if (this.f43753e.p()) {
            if (this.f43753e.o(4) && !this.f43753e.o(11)) {
                Trace.beginSection("RV PartialInvalidate");
                G1();
                S0();
                this.f43753e.w();
                if (!this.f43775y) {
                    if (y0()) {
                        H();
                    } else {
                        this.f43753e.i();
                    }
                }
                K1(true);
                T0();
                Trace.endSection();
            } else if (this.f43753e.p()) {
                Trace.beginSection("RV FullInvalidate");
                H();
                Trace.endSection();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean A1(AccessibilityEvent accessibilityEvent) {
        int i10 = 0;
        if (!F0()) {
            return false;
        }
        int a10 = accessibilityEvent != null ? b.a(accessibilityEvent) : 0;
        if (a10 != 0) {
            i10 = a10;
        }
        this.f43700B |= i10;
        return true;
    }

    public void B1(int i10, int i11) {
        C1(i10, i11, (Interpolator) null);
    }

    /* access modifiers changed from: package-private */
    public void C(int i10, int i11) {
        setMeasuredDimension(q.P(i10, getPaddingLeft() + getPaddingRight(), C4600b0.B(this)), q.P(i11, getPaddingTop() + getPaddingBottom(), C4600b0.A(this)));
    }

    /* access modifiers changed from: package-private */
    public void C0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + V());
        }
        Resources resources = getContext().getResources();
        new j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(M4.b.f38479a), resources.getDimensionPixelSize(M4.b.f38481c), resources.getDimensionPixelOffset(M4.b.f38480b));
    }

    public void C1(int i10, int i11, Interpolator interpolator) {
        D1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    /* access modifiers changed from: package-private */
    public void D0() {
        this.f43724N = null;
        this.f43720L = null;
        this.f43722M = null;
        this.f43718K = null;
    }

    public void D1(int i10, int i11, Interpolator interpolator, int i12) {
        E1(i10, i11, interpolator, i12, false);
    }

    /* access modifiers changed from: package-private */
    public void E(View view) {
        G p02 = p0(view);
        Q0(view);
        h hVar = this.f43763m;
        if (!(hVar == null || p02 == null)) {
            hVar.onViewAttachedToWindow(p02);
        }
        List<s> list = this.f43706E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f43706E.get(size).d(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean E0() {
        AccessibilityManager accessibilityManager = this.f43704D;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* access modifiers changed from: package-private */
    public void E1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        q qVar = this.f43764n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f43777z) {
            int i13 = 0;
            if (!qVar.M()) {
                i10 = 0;
            }
            if (!this.f43764n.N()) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                if (i12 == Integer.MIN_VALUE || i12 > 0) {
                    if (z10) {
                        if (i10 != 0) {
                            i13 = 1;
                        }
                        if (i11 != 0) {
                            i13 |= 2;
                        }
                        H1(i13, 1);
                    }
                    this.f43711G0.e(i10, i11, i12, interpolator);
                    return;
                }
                scrollBy(i10, i11);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void F(View view) {
        G p02 = p0(view);
        R0(view);
        h hVar = this.f43763m;
        if (!(hVar == null || p02 == null)) {
            hVar.onViewDetachedFromWindow(p02);
        }
        List<s> list = this.f43706E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f43706E.get(size).b(view);
            }
        }
    }

    public boolean F0() {
        return this.f43712H > 0;
    }

    public void F1(int i10) {
        if (!this.f43777z) {
            q qVar = this.f43764n;
            if (qVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                qVar.i2(this, this.f43717J0, i10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void G1() {
        int i10 = this.f43774x + 1;
        this.f43774x = i10;
        if (i10 == 1 && !this.f43777z) {
            this.f43775y = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        if (this.f43763m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f43764n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.f43717J0.f43804j = false;
            boolean z10 = this.f43744Z0 && !(this.f43746a1 == getWidth() && this.f43748b1 == getHeight());
            this.f43746a1 = 0;
            this.f43748b1 = 0;
            this.f43744Z0 = false;
            if (this.f43717J0.f43799e == 1) {
                I();
                this.f43764n.Z1(this);
                J();
            } else if (this.f43753e.q() || z10 || this.f43764n.L0() != getWidth() || this.f43764n.y0() != getHeight()) {
                this.f43764n.Z1(this);
                J();
            } else {
                this.f43764n.Z1(this);
            }
            K();
        }
    }

    /* access modifiers changed from: package-private */
    public void H0(int i10) {
        if (this.f43764n != null) {
            setScrollState(2);
            this.f43764n.X1(i10);
            awakenScrollBars();
        }
    }

    public boolean H1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void I0() {
        int j10 = this.f43755f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            ((r) this.f43755f.i(i10).getLayoutParams()).f43856c = true;
        }
        this.f43749c.s();
    }

    /* access modifiers changed from: package-private */
    public void J0() {
        int j10 = this.f43755f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            G p02 = p0(this.f43755f.i(i10));
            if (p02 != null && !p02.shouldIgnore()) {
                p02.addFlags(6);
            }
        }
        I0();
        this.f43749c.t();
    }

    /* access modifiers changed from: package-private */
    public void K1(boolean z10) {
        if (this.f43774x < 1) {
            if (!f43688g1) {
                this.f43774x = 1;
            } else {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + V());
            }
        }
        if (!z10 && !this.f43777z) {
            this.f43775y = false;
        }
        if (this.f43774x == 1) {
            if (z10 && this.f43775y && !this.f43777z && this.f43764n != null && this.f43763m != null) {
                H();
            }
            if (!this.f43777z) {
                this.f43775y = false;
            }
        }
        this.f43774x--;
    }

    public boolean L(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public void L0(int i10) {
        int g10 = this.f43755f.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.f43755f.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void L1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    public final void M(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void M0(int i10) {
        int g10 = this.f43755f.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.f43755f.f(i11).offsetTopAndBottom(i10);
        }
    }

    public void M1() {
        setScrollState(0);
        N1();
    }

    /* access modifiers changed from: package-private */
    public void N(int i10) {
        q qVar = this.f43764n;
        if (qVar != null) {
            qVar.D1(i10);
        }
        W0(i10);
        v vVar = this.f43719K0;
        if (vVar != null) {
            vVar.onScrollStateChanged(this, i10);
        }
        List<v> list = this.f43721L0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f43721L0.get(size).onScrollStateChanged(this, i10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void N0(int i10, int i11) {
        int j10 = this.f43755f.j();
        for (int i12 = 0; i12 < j10; i12++) {
            G p02 = p0(this.f43755f.i(i12));
            if (p02 != null && !p02.shouldIgnore() && p02.mPosition >= i10) {
                if (f43689h1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i12 + " holder " + p02 + " now at position " + (p02.mPosition + i11));
                }
                p02.offsetPosition(i11, false);
                this.f43717J0.f43801g = true;
            }
        }
        this.f43749c.v(i10, i11);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void O(int i10, int i11) {
        this.f43714I++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        X0(i10, i11);
        v vVar = this.f43719K0;
        if (vVar != null) {
            vVar.onScrolled(this, i10, i11);
        }
        List<v> list = this.f43721L0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f43721L0.get(size).onScrolled(this, i10, i11);
            }
        }
        this.f43714I--;
    }

    /* access modifiers changed from: package-private */
    public void O0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int j10 = this.f43755f.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < j10; i16++) {
            G p02 = p0(this.f43755f.i(i16));
            if (p02 != null && (i15 = p02.mPosition) >= i13 && i15 <= i12) {
                if (f43689h1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i16 + " holder " + p02);
                }
                if (p02.mPosition == i10) {
                    p02.offsetPosition(i11 - i10, false);
                } else {
                    p02.offsetPosition(i14, false);
                }
                this.f43717J0.f43801g = true;
            }
        }
        this.f43749c.w(i10, i11);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void O1(int i10, int i11, Object obj) {
        int i12;
        int j10 = this.f43755f.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < j10; i14++) {
            View i15 = this.f43755f.i(i14);
            G p02 = p0(i15);
            if (p02 != null && !p02.shouldIgnore() && (i12 = p02.mPosition) >= i10 && i12 < i13) {
                p02.addFlags(2);
                p02.addChangePayload(obj);
                ((r) i15.getLayoutParams()).f43856c = true;
            }
        }
        this.f43749c.R(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void P() {
        int i10;
        for (int size = this.f43742X0.size() - 1; size >= 0; size--) {
            G g10 = this.f43742X0.get(size);
            if (g10.itemView.getParent() == this && !g10.shouldIgnore() && (i10 = g10.mPendingAccessibilityState) != -1) {
                g10.itemView.setImportantForAccessibility(i10);
                g10.mPendingAccessibilityState = -1;
            }
        }
        this.f43742X0.clear();
    }

    /* access modifiers changed from: package-private */
    public void P0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int j10 = this.f43755f.j();
        for (int i13 = 0; i13 < j10; i13++) {
            G p02 = p0(this.f43755f.i(i13));
            if (p02 != null && !p02.shouldIgnore()) {
                int i14 = p02.mPosition;
                if (i14 >= i12) {
                    if (f43689h1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + p02 + " now at position " + (p02.mPosition - i11));
                    }
                    p02.offsetPosition(-i11, z10);
                    this.f43717J0.f43801g = true;
                } else if (i14 >= i10) {
                    if (f43689h1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + p02 + " now REMOVED");
                    }
                    p02.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.f43717J0.f43801g = true;
                }
            }
        }
        this.f43749c.x(i10, i11, z10);
        requestLayout();
    }

    public void Q0(View view) {
    }

    /* access modifiers changed from: package-private */
    public void R() {
        if (this.f43724N == null) {
            EdgeEffect a10 = this.f43716J.a(this, 3);
            this.f43724N = a10;
            if (this.f43758h) {
                a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a10.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void R0(View view) {
    }

    /* access modifiers changed from: package-private */
    public void S() {
        if (this.f43718K == null) {
            EdgeEffect a10 = this.f43716J.a(this, 0);
            this.f43718K = a10;
            if (this.f43758h) {
                a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a10.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void S0() {
        this.f43712H++;
    }

    /* access modifiers changed from: package-private */
    public void T() {
        if (this.f43722M == null) {
            EdgeEffect a10 = this.f43716J.a(this, 2);
            this.f43722M = a10;
            if (this.f43758h) {
                a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a10.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void T0() {
        U0(true);
    }

    /* access modifiers changed from: package-private */
    public void U() {
        if (this.f43720L == null) {
            EdgeEffect a10 = this.f43716J.a(this, 1);
            this.f43720L = a10;
            if (this.f43758h) {
                a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a10.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void U0(boolean z10) {
        int i10 = this.f43712H - 1;
        this.f43712H = i10;
        if (i10 >= 1) {
            return;
        }
        if (!f43688g1 || i10 >= 0) {
            this.f43712H = 0;
            if (z10) {
                G();
                P();
                return;
            }
            return;
        }
        throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + V());
    }

    /* access modifiers changed from: package-private */
    public String V() {
        return " " + super.toString() + ", adapter:" + this.f43763m + ", layout:" + this.f43764n + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public final void W(C c10) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f43711G0.f43814c;
            c10.f43810p = overScroller.getFinalX() - overScroller.getCurrX();
            c10.f43811q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        c10.f43810p = 0;
        c10.f43811q = 0;
    }

    public void W0(int i10) {
    }

    public View X(float f10, float f11) {
        for (int g10 = this.f43755f.g() - 1; g10 >= 0; g10--) {
            View f12 = this.f43755f.f(g10);
            float translationX = f12.getTranslationX();
            float translationY = f12.getTranslationY();
            if (f10 >= ((float) f12.getLeft()) + translationX && f10 <= ((float) f12.getRight()) + translationX && f11 >= ((float) f12.getTop()) + translationY && f11 <= ((float) f12.getBottom()) + translationY) {
                return f12;
            }
        }
        return null;
    }

    public void X0(int i10, int i11) {
    }

    public View Y(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void Y0() {
        if (!this.f43729P0 && this.f43770t) {
            C4600b0.g0(this, this.f43743Y0);
            this.f43729P0 = true;
        }
    }

    public G Z(View view) {
        View Y10 = Y(view);
        if (Y10 == null) {
            return null;
        }
        return o0(Y10);
    }

    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        q qVar = this.f43764n;
        if (qVar == null || !qVar.e1(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i10, int i11) {
        if (i10 < 0) {
            S();
            if (this.f43718K.isFinished()) {
                this.f43718K.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            T();
            if (this.f43722M.isFinished()) {
                this.f43722M.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            U();
            if (this.f43720L.isFinished()) {
                this.f43720L.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            R();
            if (this.f43724N.isFinished()) {
                this.f43724N.onAbsorb(i11);
            }
        }
        if (i10 != 0 || i11 != 0) {
            postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: package-private */
    public void b1(boolean z10) {
        this.f43710G = z10 | this.f43710G;
        this.f43708F = true;
        J0();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof r) && this.f43764n.O((r) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        q qVar = this.f43764n;
        if (qVar != null && qVar.M()) {
            return this.f43764n.S(this.f43717J0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        q qVar = this.f43764n;
        if (qVar != null && qVar.M()) {
            return this.f43764n.T(this.f43717J0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        q qVar = this.f43764n;
        if (qVar != null && qVar.M()) {
            return this.f43764n.U(this.f43717J0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        q qVar = this.f43764n;
        if (qVar != null && qVar.N()) {
            return this.f43764n.V(this.f43717J0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        q qVar = this.f43764n;
        if (qVar != null && qVar.N()) {
            return this.f43764n.W(this.f43717J0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        q qVar = this.f43764n;
        if (qVar != null && qVar.N()) {
            return this.f43764n.X(this.f43717J0);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void d1(G g10, n.c cVar) {
        g10.setFlags(0, 8192);
        if (this.f43717J0.f43803i && g10.isUpdated() && !g10.isRemoved() && !g10.shouldIgnore()) {
            this.f43757g.c(l0(g10), g10);
        }
        this.f43757g.e(g10, cVar);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        q layoutManager = getLayoutManager();
        int i10 = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.N()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    D1(0, measuredHeight, (Interpolator) null, Integer.MIN_VALUE);
                } else {
                    D1(0, -measuredHeight, (Interpolator) null, Integer.MIN_VALUE);
                }
                return true;
            } else if (keyCode == 122 || keyCode == 123) {
                boolean T02 = layoutManager.T0();
                if (keyCode == 122) {
                    if (T02) {
                        i10 = getAdapter().getItemCount();
                    }
                } else if (!T02) {
                    i10 = getAdapter().getItemCount();
                }
                F1(i10);
                return true;
            }
        } else if (layoutManager.M()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    D1(measuredWidth, 0, (Interpolator) null, Integer.MIN_VALUE);
                } else {
                    D1(-measuredWidth, 0, (Interpolator) null, Integer.MIN_VALUE);
                }
                return true;
            } else if (keyCode2 == 122 || keyCode2 == 123) {
                boolean T03 = layoutManager.T0();
                if (keyCode2 == 122) {
                    if (T03) {
                        i10 = getAdapter().getItemCount();
                    }
                } else if (!T03) {
                    i10 = getAdapter().getItemCount();
                }
                F1(i10);
                return true;
            }
        }
        return false;
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f43767q.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.f43767q.get(i10).k(canvas, this, this.f43717J0);
        }
        EdgeEffect edgeEffect = this.f43718K;
        boolean z12 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f43758h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f43718K;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f43720L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f43758h) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f43720L;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f43722M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f43758h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.f43722M;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f43724N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f43758h) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f43724N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.f43726O == null || this.f43767q.size() <= 0 || !this.f43726O.isRunning()) {
            z12 = z10;
        }
        if (z12) {
            postInvalidateOnAnimation();
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public G e0(int i10) {
        G g10 = null;
        if (this.f43708F) {
            return null;
        }
        int j10 = this.f43755f.j();
        for (int i11 = 0; i11 < j10; i11++) {
            G p02 = p0(this.f43755f.i(i11));
            if (p02 != null && !p02.isRemoved() && k0(p02) == i10) {
                if (!this.f43755f.n(p02.itemView)) {
                    return p02;
                }
                g10 = p02;
            }
        }
        return g10;
    }

    public G f0(long j10) {
        h hVar = this.f43763m;
        G g10 = null;
        if (hVar != null && hVar.hasStableIds()) {
            int j11 = this.f43755f.j();
            for (int i10 = 0; i10 < j11; i10++) {
                G p02 = p0(this.f43755f.i(i10));
                if (p02 != null && !p02.isRemoved() && p02.getItemId() == j10) {
                    if (!this.f43755f.n(p02.itemView)) {
                        return p02;
                    }
                    g10 = p02;
                }
            }
        }
        return g10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r8, int r9) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView$q r0 = r7.f43764n
            android.view.View r0 = r0.p1(r8, r9)
            if (r0 == 0) goto L_0x0009
            return r0
        L_0x0009:
            androidx.recyclerview.widget.RecyclerView$h r0 = r7.f43763m
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001f
            androidx.recyclerview.widget.RecyclerView$q r0 = r7.f43764n
            if (r0 == 0) goto L_0x001f
            boolean r0 = r7.F0()
            if (r0 != 0) goto L_0x001f
            boolean r0 = r7.f43777z
            if (r0 != 0) goto L_0x001f
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 0
            if (r0 == 0) goto L_0x008f
            r5 = 2
            if (r9 == r5) goto L_0x002c
            if (r9 != r1) goto L_0x008f
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$q r0 = r7.f43764n
            boolean r0 = r0.N()
            if (r0 == 0) goto L_0x0043
            if (r9 != r5) goto L_0x0039
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003b
        L_0x0039:
            r0 = 33
        L_0x003b:
            android.view.View r0 = r3.findNextFocus(r7, r8, r0)
            if (r0 != 0) goto L_0x0043
            r0 = r1
            goto L_0x0044
        L_0x0043:
            r0 = r2
        L_0x0044:
            if (r0 != 0) goto L_0x006f
            androidx.recyclerview.widget.RecyclerView$q r6 = r7.f43764n
            boolean r6 = r6.M()
            if (r6 == 0) goto L_0x006f
            androidx.recyclerview.widget.RecyclerView$q r0 = r7.f43764n
            int r0 = r0.A0()
            if (r0 != r1) goto L_0x0058
            r0 = r1
            goto L_0x0059
        L_0x0058:
            r0 = r2
        L_0x0059:
            if (r9 != r5) goto L_0x005d
            r5 = r1
            goto L_0x005e
        L_0x005d:
            r5 = r2
        L_0x005e:
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x0064
            r0 = 66
            goto L_0x0066
        L_0x0064:
            r0 = 17
        L_0x0066:
            android.view.View r0 = r3.findNextFocus(r7, r8, r0)
            if (r0 != 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r1 = r2
        L_0x006e:
            r0 = r1
        L_0x006f:
            if (r0 == 0) goto L_0x008a
            r7.A()
            android.view.View r0 = r7.Y(r8)
            if (r0 != 0) goto L_0x007b
            return r4
        L_0x007b:
            r7.G1()
            androidx.recyclerview.widget.RecyclerView$q r0 = r7.f43764n
            androidx.recyclerview.widget.RecyclerView$x r1 = r7.f43749c
            androidx.recyclerview.widget.RecyclerView$C r5 = r7.f43717J0
            r0.i1(r8, r9, r1, r5)
            r7.K1(r2)
        L_0x008a:
            android.view.View r0 = r3.findNextFocus(r7, r8, r9)
            goto L_0x00b3
        L_0x008f:
            android.view.View r1 = r3.findNextFocus(r7, r8, r9)
            if (r1 != 0) goto L_0x00b2
            if (r0 == 0) goto L_0x00b2
            r7.A()
            android.view.View r0 = r7.Y(r8)
            if (r0 != 0) goto L_0x00a1
            return r4
        L_0x00a1:
            r7.G1()
            androidx.recyclerview.widget.RecyclerView$q r0 = r7.f43764n
            androidx.recyclerview.widget.RecyclerView$x r1 = r7.f43749c
            androidx.recyclerview.widget.RecyclerView$C r3 = r7.f43717J0
            android.view.View r0 = r0.i1(r8, r9, r1, r3)
            r7.K1(r2)
            goto L_0x00b3
        L_0x00b2:
            r0 = r1
        L_0x00b3:
            if (r0 == 0) goto L_0x00ca
            boolean r1 = r0.hasFocusable()
            if (r1 != 0) goto L_0x00ca
            android.view.View r1 = r7.getFocusedChild()
            if (r1 != 0) goto L_0x00c6
            android.view.View r8 = super.focusSearch(r8, r9)
            return r8
        L_0x00c6:
            r7.p1(r0, r4)
            return r8
        L_0x00ca:
            boolean r1 = r7.G0(r8, r0, r9)
            if (r1 == 0) goto L_0x00d1
            goto L_0x00d5
        L_0x00d1:
            android.view.View r0 = super.focusSearch(r8, r9)
        L_0x00d5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* access modifiers changed from: package-private */
    public G g0(int i10, boolean z10) {
        int j10 = this.f43755f.j();
        G g10 = null;
        for (int i11 = 0; i11 < j10; i11++) {
            G p02 = p0(this.f43755f.i(i11));
            if (p02 != null && !p02.isRemoved()) {
                if (z10) {
                    if (p02.mPosition != i10) {
                        continue;
                    }
                } else if (p02.getLayoutPosition() != i10) {
                    continue;
                }
                if (!this.f43755f.n(p02.itemView)) {
                    return p02;
                }
                g10 = p02;
            }
        }
        return g10;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        q qVar = this.f43764n;
        if (qVar != null) {
            return qVar.f0();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        q qVar = this.f43764n;
        if (qVar != null) {
            return qVar.g0(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f43763m;
    }

    public int getBaseline() {
        q qVar = this.f43764n;
        return qVar != null ? qVar.i0() : super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i10, int i11) {
        l lVar = this.f43733R0;
        return lVar == null ? super.getChildDrawingOrder(i10, i11) : lVar.a(i10, i11);
    }

    public boolean getClipToPadding() {
        return this.f43758h;
    }

    public v getCompatAccessibilityDelegate() {
        return this.f43731Q0;
    }

    public m getEdgeEffectFactory() {
        return this.f43716J;
    }

    public n getItemAnimator() {
        return this.f43726O;
    }

    public int getItemDecorationCount() {
        return this.f43767q.size();
    }

    public q getLayoutManager() {
        return this.f43764n;
    }

    public int getMaxFlingVelocity() {
        return this.f43703C0;
    }

    public int getMinFlingVelocity() {
        return this.f43701B0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f43694m1) {
            return System.nanoTime();
        }
        return 0;
    }

    public t getOnFlingListener() {
        return this.f43699A0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f43709F0;
    }

    public w getRecycledViewPool() {
        return this.f43749c.i();
    }

    public int getScrollState() {
        return this.f43728P;
    }

    public boolean h0(int i10, int i11) {
        return i0(i10, i11, this.f43701B0, this.f43703C0);
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    /* access modifiers changed from: package-private */
    public void i1() {
        n nVar = this.f43726O;
        if (nVar != null) {
            nVar.endAnimations();
        }
        q qVar = this.f43764n;
        if (qVar != null) {
            qVar.K1(this.f43749c);
            this.f43764n.L1(this.f43749c);
        }
        this.f43749c.c();
    }

    public boolean isAttachedToWindow() {
        return this.f43770t;
    }

    public final boolean isLayoutSuppressed() {
        return this.f43777z;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(p pVar) {
        k(pVar, -1);
    }

    /* access modifiers changed from: package-private */
    public boolean j0(int i10, int i11) {
        return i0(i10, i11, 0, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public boolean j1(View view) {
        G1();
        boolean r10 = this.f43755f.r(view);
        if (r10) {
            G p02 = p0(view);
            this.f43749c.O(p02);
            this.f43749c.H(p02);
            if (f43689h1) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        K1(!r10);
        return r10;
    }

    public void k(p pVar, int i10) {
        q qVar = this.f43764n;
        if (qVar != null) {
            qVar.I("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f43767q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f43767q.add(pVar);
        } else {
            this.f43767q.add(i10, pVar);
        }
        I0();
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public int k0(G g10) {
        if (g10.hasAnyOfTheFlags(524) || !g10.isBound()) {
            return -1;
        }
        return this.f43753e.e(g10.mPosition);
    }

    public void k1(p pVar) {
        q qVar = this.f43764n;
        if (qVar != null) {
            qVar.I("Cannot remove item decoration during a scroll  or layout");
        }
        this.f43767q.remove(pVar);
        if (this.f43767q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        I0();
        requestLayout();
    }

    public void l(s sVar) {
        if (this.f43706E == null) {
            this.f43706E = new ArrayList();
        }
        this.f43706E.add(sVar);
    }

    /* access modifiers changed from: package-private */
    public long l0(G g10) {
        return this.f43763m.hasStableIds() ? g10.getItemId() : (long) g10.mPosition;
    }

    public void l1(s sVar) {
        List<s> list = this.f43706E;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public void m(u uVar) {
        this.f43768r.add(uVar);
    }

    public int m0(View view) {
        G p02 = p0(view);
        if (p02 != null) {
            return p02.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public void m1(u uVar) {
        this.f43768r.remove(uVar);
        if (this.f43769s == uVar) {
            this.f43769s = null;
        }
    }

    public void n(v vVar) {
        if (this.f43721L0 == null) {
            this.f43721L0 = new ArrayList();
        }
        this.f43721L0.add(vVar);
    }

    public int n0(View view) {
        G p02 = p0(view);
        if (p02 != null) {
            return p02.getLayoutPosition();
        }
        return -1;
    }

    public void n1(v vVar) {
        List<v> list = this.f43721L0;
        if (list != null) {
            list.remove(vVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void o(G g10, n.c cVar, n.c cVar2) {
        g10.setIsRecyclable(false);
        if (this.f43726O.animateAppearance(g10, cVar, cVar2)) {
            Y0();
        }
    }

    public G o0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return p0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* access modifiers changed from: package-private */
    public void o1() {
        G g10;
        int g11 = this.f43755f.g();
        for (int i10 = 0; i10 < g11; i10++) {
            View f10 = this.f43755f.f(i10);
            G o02 = o0(f10);
            if (!(o02 == null || (g10 = o02.mShadowingHolder) == null)) {
                View view = g10.itemView;
                int left = f10.getLeft();
                int top = f10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r1 >= 30.0f) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f43712H = r0
            r1 = 1
            r5.f43770t = r1
            boolean r2 = r5.f43773w
            if (r2 == 0) goto L_0x0014
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            r5.f43773w = r1
            androidx.recyclerview.widget.RecyclerView$x r1 = r5.f43749c
            r1.z()
            androidx.recyclerview.widget.RecyclerView$q r1 = r5.f43764n
            if (r1 == 0) goto L_0x0023
            r1.b0(r5)
        L_0x0023:
            r5.f43729P0 = r0
            boolean r0 = f43694m1
            if (r0 == 0) goto L_0x0066
            java.lang.ThreadLocal<androidx.recyclerview.widget.k> r0 = androidx.recyclerview.widget.k.f44084e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.k r1 = (androidx.recyclerview.widget.k) r1
            r5.f43713H0 = r1
            if (r1 != 0) goto L_0x0061
            androidx.recyclerview.widget.k r1 = new androidx.recyclerview.widget.k
            r1.<init>()
            r5.f43713H0 = r1
            android.view.Display r1 = I2.C4600b0.t(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x0053
            if (r1 == 0) goto L_0x0053
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0055:
            androidx.recyclerview.widget.k r2 = r5.f43713H0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f44088c = r3
            r0.set(r2)
        L_0x0061:
            androidx.recyclerview.widget.k r0 = r5.f43713H0
            r0.a(r5)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        k kVar;
        super.onDetachedFromWindow();
        n nVar = this.f43726O;
        if (nVar != null) {
            nVar.endAnimations();
        }
        M1();
        this.f43770t = false;
        q qVar = this.f43764n;
        if (qVar != null) {
            qVar.c0(this, this.f43749c);
        }
        this.f43742X0.clear();
        removeCallbacks(this.f43743Y0);
        this.f43757g.j();
        this.f43749c.A();
        a.c(this);
        if (f43694m1 && (kVar = this.f43713H0) != null) {
            kVar.j(this);
            this.f43713H0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f43767q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f43767q.get(i10).i(canvas, this, this.f43717J0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z10;
        float f10;
        int i10;
        if (this.f43764n != null && !this.f43777z && motionEvent.getAction() == 8) {
            float f11 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f12 = this.f43764n.N() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f43764n.M()) {
                    f11 = motionEvent.getAxisValue(10);
                }
                z10 = false;
                f10 = f11;
                f11 = f12;
                i10 = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i10 = 26;
                f10 = motionEvent.getAxisValue(26);
                if (this.f43764n.N()) {
                    float f13 = -f10;
                    f10 = 0.0f;
                    f11 = f13;
                } else if (!this.f43764n.M()) {
                    f10 = 0.0f;
                }
                z10 = this.f43750c1;
            } else {
                i10 = 0;
                z10 = false;
                f10 = 0.0f;
            }
            int i11 = (int) (f11 * this.f43707E0);
            int i12 = (int) (f10 * this.f43705D0);
            if (z10) {
                OverScroller overScroller = this.f43711G0.f43814c;
                E1(i12 + (overScroller.getFinalX() - overScroller.getCurrX()), i11 + (overScroller.getFinalY() - overScroller.getCurrY()), (Interpolator) null, Integer.MIN_VALUE, true);
            } else {
                K0(i12, i11, motionEvent, 1);
            }
            if (i10 != 0 && !z10) {
                this.f43756f1.g(motionEvent, i10);
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f43777z) {
            return false;
        }
        this.f43769s = null;
        if (a0(motionEvent)) {
            t();
            return true;
        }
        q qVar = this.f43764n;
        if (qVar == null) {
            return false;
        }
        boolean M10 = qVar.M();
        boolean N10 = this.f43764n.N();
        if (this.f43732R == null) {
            this.f43732R = VelocityTracker.obtain();
        }
        this.f43732R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f43698A) {
                this.f43698A = false;
            }
            this.f43730Q = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f43738U = x10;
            this.f43734S = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f43776y0 = y10;
            this.f43736T = y10;
            if (J1(motionEvent) || this.f43728P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                L1(1);
            }
            int[] iArr = this.f43740V0;
            iArr[1] = 0;
            iArr[0] = 0;
            I1(0);
        } else if (actionMasked == 1) {
            this.f43732R.clear();
            L1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f43730Q);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f43730Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f43728P != 1) {
                int i10 = x11 - this.f43734S;
                int i11 = y11 - this.f43736T;
                if (!M10 || Math.abs(i10) <= this.f43778z0) {
                    z10 = false;
                } else {
                    this.f43738U = x11;
                    z10 = true;
                }
                if (N10 && Math.abs(i11) > this.f43778z0) {
                    this.f43776y0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            t();
        } else if (actionMasked == 5) {
            this.f43730Q = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f43738U = x12;
            this.f43734S = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f43776y0 = y12;
            this.f43736T = y12;
        } else if (actionMasked == 6) {
            V0(motionEvent);
        }
        return this.f43728P == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Trace.beginSection("RV OnLayout");
        H();
        Trace.endSection();
        this.f43773w = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        q qVar = this.f43764n;
        if (qVar == null) {
            C(i10, i11);
            return;
        }
        boolean z10 = false;
        if (qVar.P0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f43764n.y1(this.f43749c, this.f43717J0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f43744Z0 = z10;
            if (!z10 && this.f43763m != null) {
                if (this.f43717J0.f43799e == 1) {
                    I();
                }
                this.f43764n.a2(i10, i11);
                this.f43717J0.f43804j = true;
                J();
                this.f43764n.d2(i10, i11);
                if (this.f43764n.g2()) {
                    this.f43764n.a2(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), CatalogRepository.FETCH_FLAG_SDB), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), CatalogRepository.FETCH_FLAG_SDB));
                    this.f43717J0.f43804j = true;
                    J();
                    this.f43764n.d2(i10, i11);
                }
                this.f43746a1 = getMeasuredWidth();
                this.f43748b1 = getMeasuredHeight();
            }
        } else if (this.f43771u) {
            this.f43764n.y1(this.f43749c, this.f43717J0, i10, i11);
        } else {
            if (this.f43702C) {
                G1();
                S0();
                a1();
                T0();
                C c10 = this.f43717J0;
                if (c10.f43806l) {
                    c10.f43802h = true;
                } else {
                    this.f43753e.j();
                    this.f43717J0.f43802h = false;
                }
                this.f43702C = false;
                K1(false);
            } else if (this.f43717J0.f43806l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            h hVar = this.f43763m;
            if (hVar != null) {
                this.f43717J0.f43800f = hVar.getItemCount();
            } else {
                this.f43717J0.f43800f = 0;
            }
            G1();
            this.f43764n.y1(this.f43749c, this.f43717J0, i10, i11);
            K1(false);
            this.f43717J0.f43802h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (F0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof A)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        A a10 = (A) parcelable;
        this.f43751d = a10;
        super.onRestoreInstanceState(a10.a());
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        A a10 = new A(super.onSaveInstanceState());
        A a11 = this.f43751d;
        if (a11 != null) {
            a10.b(a11);
        } else {
            q qVar = this.f43764n;
            if (qVar != null) {
                a10.f43779c = qVar.C1();
            } else {
                a10.f43779c = null;
            }
        }
        return a10;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            D0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f43777z
            r8 = 0
            if (r0 != 0) goto L_0x01eb
            boolean r0 = r6.f43698A
            if (r0 == 0) goto L_0x000f
            goto L_0x01eb
        L_0x000f:
            boolean r0 = r17.Q(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.t()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$q r0 = r6.f43764n
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.M()
            androidx.recyclerview.widget.RecyclerView$q r0 = r6.f43764n
            boolean r11 = r0.N()
            android.view.VelocityTracker r0 = r6.f43732R
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f43732R = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f43740V0
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f43740V0
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01c5
            if (r0 == r9) goto L_0x0184
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01e2
        L_0x0066:
            r17.V0(r18)
            goto L_0x01e2
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.f43730Q = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f43738U = r0
            r6.f43734S = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f43776y0 = r0
            r6.f43736T = r0
            goto L_0x01e2
        L_0x0087:
            r17.t()
            goto L_0x01e2
        L_0x008c:
            int r0 = r6.f43730Q
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.f43730Q
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.f43738U
            int r0 = r0 - r13
            int r1 = r6.f43776y0
            int r1 = r1 - r14
            int r2 = r6.f43728P
            if (r2 == r9) goto L_0x00fb
            if (r10 == 0) goto L_0x00df
            if (r0 <= 0) goto L_0x00d4
            int r2 = r6.f43778z0
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00db
        L_0x00d4:
            int r2 = r6.f43778z0
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00db:
            if (r0 == 0) goto L_0x00df
            r2 = r9
            goto L_0x00e0
        L_0x00df:
            r2 = r8
        L_0x00e0:
            if (r11 == 0) goto L_0x00f6
            if (r1 <= 0) goto L_0x00ec
            int r3 = r6.f43778z0
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f3
        L_0x00ec:
            int r3 = r6.f43778z0
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f3:
            if (r1 == 0) goto L_0x00f6
            r2 = r9
        L_0x00f6:
            if (r2 == 0) goto L_0x00fb
            r6.setScrollState(r9)
        L_0x00fb:
            int r2 = r6.f43728P
            if (r2 != r9) goto L_0x01e2
            int[] r2 = r6.f43741W0
            r2[r8] = r8
            r2[r9] = r8
            float r2 = r18.getY()
            int r2 = r6.g1(r0, r2)
            int r15 = r0 - r2
            float r0 = r18.getX()
            int r0 = r6.h1(r1, r0)
            int r16 = r1 - r0
            if (r10 == 0) goto L_0x011d
            r1 = r15
            goto L_0x011e
        L_0x011d:
            r1 = r8
        L_0x011e:
            if (r11 == 0) goto L_0x0123
            r2 = r16
            goto L_0x0124
        L_0x0123:
            r2 = r8
        L_0x0124:
            int[] r3 = r6.f43741W0
            int[] r4 = r6.f43739U0
            r5 = 0
            r0 = r17
            boolean r0 = r0.L(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0153
            int[] r0 = r6.f43741W0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f43740V0
            r1 = r0[r8]
            int[] r2 = r6.f43739U0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0153:
            r0 = r16
            int[] r1 = r6.f43739U0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f43738U = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f43776y0 = r14
            if (r10 == 0) goto L_0x0165
            r1 = r15
            goto L_0x0166
        L_0x0165:
            r1 = r8
        L_0x0166:
            if (r11 == 0) goto L_0x016a
            r2 = r0
            goto L_0x016b
        L_0x016a:
            r2 = r8
        L_0x016b:
            boolean r1 = r6.u1(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x0178
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0178:
            androidx.recyclerview.widget.k r1 = r6.f43713H0
            if (r1 == 0) goto L_0x01e2
            if (r15 != 0) goto L_0x0180
            if (r0 == 0) goto L_0x01e2
        L_0x0180:
            r1.f(r6, r15, r0)
            goto L_0x01e2
        L_0x0184:
            android.view.VelocityTracker r0 = r6.f43732R
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f43732R
            int r1 = r6.f43703C0
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            r0 = 0
            if (r10 == 0) goto L_0x01a0
            android.view.VelocityTracker r1 = r6.f43732R
            int r2 = r6.f43730Q
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x01a1
        L_0x01a0:
            r1 = r0
        L_0x01a1:
            if (r11 == 0) goto L_0x01ad
            android.view.VelocityTracker r2 = r6.f43732R
            int r3 = r6.f43730Q
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x01ae
        L_0x01ad:
            r2 = r0
        L_0x01ae:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01b6
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01be
        L_0x01b6:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.h0(r0, r1)
            if (r0 != 0) goto L_0x01c1
        L_0x01be:
            r6.setScrollState(r8)
        L_0x01c1:
            r17.r1()
            goto L_0x01e7
        L_0x01c5:
            int r0 = r7.getPointerId(r8)
            r6.f43730Q = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f43738U = r0
            r6.f43734S = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f43776y0 = r0
            r6.f43736T = r0
            r6.I1(r8)
        L_0x01e2:
            android.view.VelocityTracker r0 = r6.f43732R
            r0.addMovement(r12)
        L_0x01e7:
            r12.recycle()
            return r9
        L_0x01eb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void q(G g10, n.c cVar, n.c cVar2) {
        i(g10);
        g10.setIsRecyclable(false);
        if (this.f43726O.animateDisappearance(g10, cVar, cVar2)) {
            Y0();
        }
    }

    public void q0(View view, Rect rect) {
        r0(view, rect);
    }

    /* access modifiers changed from: package-private */
    public void r(String str) {
        if (F0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + V());
            }
            throw new IllegalStateException(str);
        } else if (this.f43714I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + V()));
        }
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z10) {
        G p02 = p0(view);
        if (p02 != null) {
            if (p02.isTmpDetached()) {
                p02.clearTmpDetachFlag();
            } else if (!p02.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + p02 + V());
            }
        } else if (f43688g1) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + V());
        }
        view.clearAnimation();
        F(view);
        super.removeDetachedView(view, z10);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f43764n.A1(this, this.f43717J0, view, view2) && view2 != null) {
            p1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f43764n.R1(this, view, rect, z10);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f43768r.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f43768r.get(i10).e(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void requestLayout() {
        if (this.f43774x != 0 || this.f43777z) {
            this.f43775y = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s(G g10) {
        n nVar = this.f43726O;
        return nVar == null || nVar.canReuseUpdatedViewHolder(g10, g10.getUnmodifiedPayloads());
    }

    public void scrollBy(int i10, int i11) {
        q qVar = this.f43764n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f43777z) {
            boolean M10 = qVar.M();
            boolean N10 = this.f43764n.N();
            if (M10 || N10) {
                if (!M10) {
                    i10 = 0;
                }
                if (!N10) {
                    i11 = 0;
                }
                u1(i10, i11, (MotionEvent) null, 0);
            }
        }
    }

    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!A1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(v vVar) {
        this.f43731Q0 = vVar;
        C4600b0.p0(this, vVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        x1(hVar, false, true);
        b1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(l lVar) {
        if (lVar != this.f43733R0) {
            setChildrenDrawingOrderEnabled(lVar != null);
        }
    }

    public void setClipToPadding(boolean z10) {
        if (z10 != this.f43758h) {
            D0();
        }
        this.f43758h = z10;
        super.setClipToPadding(z10);
        if (this.f43773w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(m mVar) {
        H2.i.g(mVar);
        this.f43716J = mVar;
        D0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f43771u = z10;
    }

    public void setItemAnimator(n nVar) {
        n nVar2 = this.f43726O;
        if (nVar2 != null) {
            nVar2.endAnimations();
            this.f43726O.setListener((n.b) null);
        }
        this.f43726O = nVar;
        if (nVar != null) {
            nVar.setListener(this.f43727O0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f43749c.L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(q qVar) {
        if (qVar != this.f43764n) {
            M1();
            if (this.f43764n != null) {
                n nVar = this.f43726O;
                if (nVar != null) {
                    nVar.endAnimations();
                }
                this.f43764n.K1(this.f43749c);
                this.f43764n.L1(this.f43749c);
                this.f43749c.c();
                if (this.f43770t) {
                    this.f43764n.c0(this, this.f43749c);
                }
                this.f43764n.e2((RecyclerView) null);
                this.f43764n = null;
            } else {
                this.f43749c.c();
            }
            this.f43755f.o();
            this.f43764n = qVar;
            if (qVar != null) {
                if (qVar.f43831b == null) {
                    qVar.e2(this);
                    if (this.f43770t) {
                        this.f43764n.b0(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + qVar + " is already attached to a RecyclerView:" + qVar.f43831b.V());
                }
            }
            this.f43749c.P();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(t tVar) {
        this.f43699A0 = tVar;
    }

    @Deprecated
    public void setOnScrollListener(v vVar) {
        this.f43719K0 = vVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f43709F0 = z10;
    }

    public void setRecycledViewPool(w wVar) {
        this.f43749c.J(wVar);
    }

    @Deprecated
    public void setRecyclerListener(y yVar) {
        this.f43765o = yVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i10) {
        if (i10 != this.f43728P) {
            if (f43689h1) {
                Log.d("RecyclerView", "setting scroll state to " + i10 + " from " + this.f43728P, new Exception());
            }
            this.f43728P = i10;
            if (i10 != 2) {
                N1();
            }
            N(i10);
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.f43778z0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f43778z0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(E e10) {
        this.f43749c.K(e10);
    }

    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    public final void suppressLayout(boolean z10) {
        if (z10 != this.f43777z) {
            r("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.f43777z = false;
                if (!(!this.f43775y || this.f43764n == null || this.f43763m == null)) {
                    requestLayout();
                }
                this.f43775y = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f43777z = true;
            this.f43698A = true;
            M1();
        }
    }

    /* access modifiers changed from: package-private */
    public void t1() {
        int j10 = this.f43755f.j();
        int i10 = 0;
        while (i10 < j10) {
            G p02 = p0(this.f43755f.i(i10));
            if (!f43688g1 || p02.mPosition != -1 || p02.isRemoved()) {
                if (!p02.shouldIgnore()) {
                    p02.saveOldPosition();
                }
                i10++;
            } else {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + V());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Rect u0(View view) {
        r rVar = (r) view.getLayoutParams();
        if (!rVar.f43856c) {
            return rVar.f43855b;
        }
        if (this.f43717J0.e() && (rVar.b() || rVar.d())) {
            return rVar.f43855b;
        }
        Rect rect = rVar.f43855b;
        rect.set(0, 0, 0, 0);
        int size = this.f43767q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f43760j.set(0, 0, 0, 0);
            this.f43767q.get(i10).g(this.f43760j, view, this, this.f43717J0);
            int i11 = rect.left;
            Rect rect2 = this.f43760j;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        rVar.f43856c = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    public boolean u1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i10;
        int i18 = i11;
        MotionEvent motionEvent2 = motionEvent;
        A();
        if (this.f43763m != null) {
            int[] iArr = this.f43741W0;
            iArr[0] = 0;
            iArr[1] = 0;
            v1(i17, i18, iArr);
            int[] iArr2 = this.f43741W0;
            int i19 = iArr2[0];
            int i20 = iArr2[1];
            i16 = i20;
            i15 = i19;
            i14 = i17 - i19;
            i13 = i18 - i20;
        } else {
            i16 = 0;
            i15 = 0;
            i14 = 0;
            i13 = 0;
        }
        if (!this.f43767q.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f43741W0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        M(i15, i16, i14, i13, this.f43739U0, i12, iArr3);
        int[] iArr4 = this.f43741W0;
        int i21 = iArr4[0];
        int i22 = i14 - i21;
        int i23 = iArr4[1];
        int i24 = i13 - i23;
        boolean z10 = (i21 == 0 && i23 == 0) ? false : true;
        int i25 = this.f43738U;
        int[] iArr5 = this.f43739U0;
        int i26 = iArr5[0];
        this.f43738U = i25 - i26;
        int i27 = this.f43776y0;
        int i28 = iArr5[1];
        this.f43776y0 = i27 - i28;
        int[] iArr6 = this.f43740V0;
        iArr6[0] = iArr6[0] + i26;
        iArr6[1] = iArr6[1] + i28;
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !I2.C.a(motionEvent2, 8194)) {
                c1(motionEvent.getX(), (float) i22, motionEvent.getY(), (float) i24);
                if (Build.VERSION.SDK_INT >= 31 && I2.C.a(motionEvent2, 4194304)) {
                    f1();
                }
            }
            w(i10, i11);
        }
        if (!(i15 == 0 && i16 == 0)) {
            O(i15, i16);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i15 == 0 && i16 == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        int j10 = this.f43755f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            G p02 = p0(this.f43755f.i(i10));
            if (!p02.shouldIgnore()) {
                p02.clearOldPosition();
            }
        }
        this.f43749c.d();
    }

    /* access modifiers changed from: package-private */
    public void v1(int i10, int i11, int[] iArr) {
        G1();
        S0();
        Trace.beginSection("RV Scroll");
        W(this.f43717J0);
        int W12 = i10 != 0 ? this.f43764n.W1(i10, this.f43749c, this.f43717J0) : 0;
        int Y12 = i11 != 0 ? this.f43764n.Y1(i11, this.f43749c, this.f43717J0) : 0;
        Trace.endSection();
        o1();
        T0();
        K1(false);
        if (iArr != null) {
            iArr[0] = W12;
            iArr[1] = Y12;
        }
    }

    /* access modifiers changed from: package-private */
    public void w(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.f43718K;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.f43718K.onRelease();
            z10 = this.f43718K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f43722M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f43722M.onRelease();
            z10 |= this.f43722M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f43720L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f43720L.onRelease();
            z10 |= this.f43720L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f43724N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f43724N.onRelease();
            z10 |= this.f43724N.isFinished();
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    public void w1(int i10) {
        if (!this.f43777z) {
            M1();
            q qVar = this.f43764n;
            if (qVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            qVar.X1(i10);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    public int x(int i10) {
        return y(i10, this.f43718K, this.f43722M, getWidth());
    }

    public boolean x0() {
        return !this.f43773w || this.f43708F || this.f43753e.p();
    }

    /* access modifiers changed from: package-private */
    public boolean y1(G g10, int i10) {
        if (F0()) {
            g10.mPendingAccessibilityState = i10;
            this.f43742X0.add(g10);
            return false;
        }
        g10.itemView.setImportantForAccessibility(i10);
        return true;
    }

    /* access modifiers changed from: package-private */
    public int z(int i10) {
        return y(i10, this.f43720L, this.f43724N, getHeight());
    }

    /* access modifiers changed from: package-private */
    public void z0() {
        this.f43753e = new C7003a(new C7002g());
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, M4.a.f38478a);
    }

    public static class A extends O2.a {
        public static final Parcelable.Creator<A> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        Parcelable f43779c;

        class a implements Parcelable.ClassLoaderCreator<A> {
            a() {
            }

            /* renamed from: a */
            public A createFromParcel(Parcel parcel) {
                return new A(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public A createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new A(parcel, classLoader);
            }

            /* renamed from: c */
            public A[] newArray(int i10) {
                return new A[i10];
            }
        }

        A(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f43779c = parcel.readParcelable(classLoader == null ? q.class.getClassLoader() : classLoader);
        }

        /* access modifiers changed from: package-private */
        public void b(A a10) {
            this.f43779c = a10.f43779c;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f43779c, 0);
        }

        A(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i11 = i10;
        this.f43747b = new z();
        this.f43749c = new x();
        this.f43757g = new A();
        this.f43759i = new C6996a();
        this.f43760j = new Rect();
        this.f43761k = new Rect();
        this.f43762l = new RectF();
        this.f43766p = new ArrayList();
        this.f43767q = new ArrayList<>();
        this.f43768r = new ArrayList<>();
        this.f43774x = 0;
        this.f43708F = false;
        this.f43710G = false;
        this.f43712H = 0;
        this.f43714I = 0;
        this.f43716J = f43697p1;
        this.f43726O = new g();
        this.f43728P = 0;
        this.f43730Q = -1;
        this.f43705D0 = Float.MIN_VALUE;
        this.f43707E0 = Float.MIN_VALUE;
        this.f43709F0 = true;
        this.f43711G0 = new F();
        this.f43715I0 = f43694m1 ? new k.b() : null;
        this.f43717J0 = new C();
        this.f43723M0 = false;
        this.f43725N0 = false;
        this.f43727O0 = new o();
        this.f43729P0 = false;
        this.f43735S0 = new int[2];
        this.f43739U0 = new int[2];
        this.f43740V0 = new int[2];
        this.f43741W0 = new int[2];
        this.f43742X0 = new ArrayList();
        this.f43743Y0 = new C6997b();
        this.f43746a1 = 0;
        this.f43748b1 = 0;
        this.f43752d1 = new C6999d();
        C7000e eVar = new C7000e();
        this.f43754e1 = eVar;
        this.f43756f1 = new C4625o(getContext(), eVar);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f43778z0 = viewConfiguration.getScaledTouchSlop();
        this.f43705D0 = C4606e0.e(viewConfiguration, context2);
        this.f43707E0 = C4606e0.h(viewConfiguration, context2);
        this.f43701B0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f43703C0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f43745a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f43726O.setListener(this.f43727O0);
        z0();
        B0();
        A0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f43704D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new v(this));
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, M4.d.f38486a, i11, 0);
        C4600b0.n0(this, context, M4.d.f38486a, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(M4.d.f38495j);
        if (obtainStyledAttributes.getInt(M4.d.f38489d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f43758h = obtainStyledAttributes.getBoolean(M4.d.f38488c, true);
        boolean z10 = obtainStyledAttributes.getBoolean(M4.d.f38490e, false);
        this.f43772v = z10;
        if (z10) {
            C0((StateListDrawable) obtainStyledAttributes.getDrawable(M4.d.f38493h), obtainStyledAttributes.getDrawable(M4.d.f38494i), (StateListDrawable) obtainStyledAttributes.getDrawable(M4.d.f38491f), obtainStyledAttributes.getDrawable(M4.d.f38492g));
        }
        obtainStyledAttributes.recycle();
        this.f43750c1 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        B(context, string, attributeSet, i10, 0);
        int[] iArr = f43690i1;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr, i11, 0);
        C4600b0.n0(this, context, iArr, attributeSet, obtainStyledAttributes2, i10, 0);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        a.h(this, true);
    }

    public static class r extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        G f43854a;

        /* renamed from: b  reason: collision with root package name */
        final Rect f43855b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        boolean f43856c = true;

        /* renamed from: d  reason: collision with root package name */
        boolean f43857d = false;

        public r(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int a() {
            return this.f43854a.getLayoutPosition();
        }

        public boolean b() {
            return this.f43854a.isUpdated();
        }

        public boolean c() {
            return this.f43854a.isRemoved();
        }

        public boolean d() {
            return this.f43854a.isInvalid();
        }

        public r(int i10, int i11) {
            super(i10, i11);
        }

        public r(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public r(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public r(r rVar) {
            super(rVar);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        q qVar = this.f43764n;
        if (qVar != null) {
            return qVar.h0(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }
}
