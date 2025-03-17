package androidx.drawerlayout.widget;

import I2.C0;
import I2.C4597a;
import I2.C4600b0;
import I2.C4632s;
import J2.t;
import J2.w;
import P2.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.sugarcube.app.base.data.source.CatalogRepository;
import com.sugarcube.decorate_engine.SceneLayout;
import java.util.ArrayList;
import java.util.List;
import u2.C6012a;
import y2.C6260a;

public class DrawerLayout extends ViewGroup {

    /* renamed from: L  reason: collision with root package name */
    private static final int[] f21474L = {16843828};

    /* renamed from: M  reason: collision with root package name */
    static final int[] f21475M = {16842931};

    /* renamed from: N  reason: collision with root package name */
    static final boolean f21476N = true;

    /* renamed from: O  reason: collision with root package name */
    private static final boolean f21477O = true;

    /* renamed from: P  reason: collision with root package name */
    private static boolean f21478P;

    /* renamed from: A  reason: collision with root package name */
    private CharSequence f21479A;

    /* renamed from: B  reason: collision with root package name */
    private Object f21480B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f21481C;

    /* renamed from: D  reason: collision with root package name */
    private Drawable f21482D;

    /* renamed from: E  reason: collision with root package name */
    private Drawable f21483E;

    /* renamed from: F  reason: collision with root package name */
    private Drawable f21484F;

    /* renamed from: G  reason: collision with root package name */
    private Drawable f21485G;

    /* renamed from: H  reason: collision with root package name */
    private final ArrayList<View> f21486H;

    /* renamed from: I  reason: collision with root package name */
    private Rect f21487I;

    /* renamed from: J  reason: collision with root package name */
    private Matrix f21488J;

    /* renamed from: K  reason: collision with root package name */
    private final w f21489K;

    /* renamed from: a  reason: collision with root package name */
    private final d f21490a;

    /* renamed from: b  reason: collision with root package name */
    private float f21491b;

    /* renamed from: c  reason: collision with root package name */
    private int f21492c;

    /* renamed from: d  reason: collision with root package name */
    private int f21493d;

    /* renamed from: e  reason: collision with root package name */
    private float f21494e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f21495f;

    /* renamed from: g  reason: collision with root package name */
    private final P2.c f21496g;

    /* renamed from: h  reason: collision with root package name */
    private final P2.c f21497h;

    /* renamed from: i  reason: collision with root package name */
    private final i f21498i;

    /* renamed from: j  reason: collision with root package name */
    private final i f21499j;

    /* renamed from: k  reason: collision with root package name */
    private int f21500k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f21501l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f21502m;

    /* renamed from: n  reason: collision with root package name */
    private int f21503n;

    /* renamed from: o  reason: collision with root package name */
    private int f21504o;

    /* renamed from: p  reason: collision with root package name */
    private int f21505p;

    /* renamed from: q  reason: collision with root package name */
    private int f21506q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f21507r;

    /* renamed from: s  reason: collision with root package name */
    private e f21508s;

    /* renamed from: t  reason: collision with root package name */
    private List<e> f21509t;

    /* renamed from: u  reason: collision with root package name */
    private float f21510u;

    /* renamed from: v  reason: collision with root package name */
    private float f21511v;

    /* renamed from: w  reason: collision with root package name */
    private Drawable f21512w;

    /* renamed from: x  reason: collision with root package name */
    private Drawable f21513x;

    /* renamed from: y  reason: collision with root package name */
    private Drawable f21514y;

    /* renamed from: z  reason: collision with root package name */
    private CharSequence f21515z;

    class a implements w {
        a() {
        }

        public boolean a(View view, w.a aVar) {
            if (!DrawerLayout.this.B(view) || DrawerLayout.this.p(view) == 2) {
                return false;
            }
            DrawerLayout.this.d(view);
            return true;
        }
    }

    class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).Q(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class c extends C4597a {

        /* renamed from: d  reason: collision with root package name */
        private final Rect f21518d = new Rect();

        c() {
        }

        private void n(t tVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.y(childAt)) {
                    tVar.c(childAt);
                }
            }
        }

        private void o(t tVar, t tVar2) {
            Rect rect = this.f21518d;
            tVar2.l(rect);
            tVar.f0(rect);
            tVar.Y0(tVar2.U());
            tVar.D0(tVar2.w());
            tVar.i0(tVar2.o());
            tVar.m0(tVar2.r());
            tVar.q0(tVar2.J());
            tVar.t0(tVar2.L());
            tVar.b0(tVar2.E());
            tVar.M0(tVar2.R());
            tVar.a(tVar2.i());
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence q10;
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View n10 = DrawerLayout.this.n();
            if (n10 == null || (q10 = DrawerLayout.this.q(DrawerLayout.this.r(n10))) == null) {
                return true;
            }
            text.add(q10);
            return true;
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        public void g(View view, t tVar) {
            if (DrawerLayout.f21476N) {
                super.g(view, tVar);
            } else {
                t W10 = t.W(tVar);
                super.g(view, W10);
                tVar.O0(view);
                ViewParent F10 = C4600b0.F(view);
                if (F10 instanceof View) {
                    tVar.F0((View) F10);
                }
                o(tVar, W10);
                W10.Z();
                n(tVar, (ViewGroup) view);
            }
            tVar.i0("androidx.drawerlayout.widget.DrawerLayout");
            tVar.s0(false);
            tVar.t0(false);
            tVar.a0(t.a.f8834e);
            tVar.a0(t.a.f8835f);
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f21476N || DrawerLayout.y(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class d extends C4597a {
        d() {
        }

        public void g(View view, t tVar) {
            super.g(view, tVar);
            if (!DrawerLayout.y(view)) {
                tVar.F0((View) null);
            }
        }
    }

    public interface e {
        void a(View view);

        void b(View view);

        void c(int i10);

        void d(View view, float f10);
    }

    public static abstract class h implements e {
        public void c(int i10) {
        }

        public void d(View view, float f10) {
        }
    }

    private class i extends c.C0179c {

        /* renamed from: a  reason: collision with root package name */
        private final int f21529a;

        /* renamed from: b  reason: collision with root package name */
        private P2.c f21530b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f21531c = new a();

        class a implements Runnable {
            a() {
            }

            public void run() {
                i.this.o();
            }
        }

        i(int i10) {
            this.f21529a = i10;
        }

        private void n() {
            int i10 = 3;
            if (this.f21529a == 3) {
                i10 = 5;
            }
            View l10 = DrawerLayout.this.l(i10);
            if (l10 != null) {
                DrawerLayout.this.d(l10);
            }
        }

        public int a(View view, int i10, int i11) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        public int d(View view) {
            if (DrawerLayout.this.C(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public void f(int i10, int i11) {
            View l10 = (i10 & 1) == 1 ? DrawerLayout.this.l(3) : DrawerLayout.this.l(5);
            if (l10 != null && DrawerLayout.this.p(l10) == 0) {
                this.f21530b.b(l10, i11);
            }
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f21531c, 160);
        }

        public void i(View view, int i10) {
            ((f) view.getLayoutParams()).f21522c = false;
            n();
        }

        public void j(int i10) {
            DrawerLayout.this.V(i10, this.f21530b.v());
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.c(view, 3) ? (float) (i10 + width) : (float) (DrawerLayout.this.getWidth() - i10)) / ((float) width);
            DrawerLayout.this.S(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        public void l(View view, float f10, float f11) {
            int i10;
            float s10 = DrawerLayout.this.s(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                i10 = (i11 > 0 || (i11 == 0 && s10 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && s10 > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f21530b.O(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        public boolean m(View view, int i10) {
            return DrawerLayout.this.C(view) && DrawerLayout.this.c(view, this.f21529a) && DrawerLayout.this.p(view) == 0;
        }

        /* access modifiers changed from: package-private */
        public void o() {
            View view;
            int i10;
            int x10 = this.f21530b.x();
            int i11 = 0;
            boolean z10 = this.f21529a == 3;
            if (z10) {
                view = DrawerLayout.this.l(3);
                if (view != null) {
                    i11 = -view.getWidth();
                }
                i10 = i11 + x10;
            } else {
                view = DrawerLayout.this.l(5);
                i10 = DrawerLayout.this.getWidth() - x10;
            }
            if (view == null) {
                return;
            }
            if (((z10 && view.getLeft() < i10) || (!z10 && view.getLeft() > i10)) && DrawerLayout.this.p(view) == 0) {
                this.f21530b.Q(view, i10, view.getTop());
                ((f) view.getLayoutParams()).f21522c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f21531c);
        }

        public void q(P2.c cVar) {
            this.f21530b = cVar;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        if (i10 < 29) {
            z10 = false;
        }
        f21478P = z10;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, X2.a.f14694a);
    }

    private boolean E(float f10, float f11, View view) {
        if (this.f21487I == null) {
            this.f21487I = new Rect();
        }
        view.getHitRect(this.f21487I);
        return this.f21487I.contains((int) f10, (int) f11);
    }

    private void G(Drawable drawable, int i10) {
        if (drawable != null && C6260a.h(drawable)) {
            C6260a.m(drawable, i10);
        }
    }

    private Drawable N() {
        int z10 = C4600b0.z(this);
        if (z10 == 0) {
            Drawable drawable = this.f21482D;
            if (drawable != null) {
                G(drawable, z10);
                return this.f21482D;
            }
        } else {
            Drawable drawable2 = this.f21483E;
            if (drawable2 != null) {
                G(drawable2, z10);
                return this.f21483E;
            }
        }
        return this.f21484F;
    }

    private Drawable O() {
        int z10 = C4600b0.z(this);
        if (z10 == 0) {
            Drawable drawable = this.f21483E;
            if (drawable != null) {
                G(drawable, z10);
                return this.f21483E;
            }
        } else {
            Drawable drawable2 = this.f21482D;
            if (drawable2 != null) {
                G(drawable2, z10);
                return this.f21482D;
            }
        }
        return this.f21485G;
    }

    private void P() {
        if (!f21477O) {
            this.f21513x = N();
            this.f21514y = O();
        }
    }

    private void T(View view) {
        t.a aVar = t.a.f8854y;
        C4600b0.i0(view, aVar.b());
        if (B(view) && p(view) != 2) {
            C4600b0.k0(view, aVar, (CharSequence) null, this.f21489K);
        }
    }

    private void U(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || C(childAt)) && (!z10 || childAt != view)) {
                C4600b0.z0(childAt, 4);
            } else {
                C4600b0.z0(childAt, 1);
            }
        }
    }

    private boolean k(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent t10 = t(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(t10);
            t10.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent t(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f21488J == null) {
                this.f21488J = new Matrix();
            }
            matrix.invert(this.f21488J);
            obtain.transform(this.f21488J);
        }
        return obtain;
    }

    static String u(int i10) {
        return (i10 & 3) == 3 ? "LEFT" : (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    private static boolean v(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean w() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((f) getChildAt(i10).getLayoutParams()).f21522c) {
                return true;
            }
        }
        return false;
    }

    private boolean x() {
        return n() != null;
    }

    static boolean y(View view) {
        return (C4600b0.x(view) == 4 || C4600b0.x(view) == 2) ? false : true;
    }

    public boolean A(int i10) {
        View l10 = l(i10);
        if (l10 != null) {
            return B(l10);
        }
        return false;
    }

    public boolean B(View view) {
        if (C(view)) {
            return (((f) view.getLayoutParams()).f21523d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    public boolean C(View view) {
        int b10 = C4632s.b(((f) view.getLayoutParams()).f21520a, C4600b0.z(view));
        return ((b10 & 3) == 0 && (b10 & 5) == 0) ? false : true;
    }

    public boolean D(View view) {
        if (C(view)) {
            return ((f) view.getLayoutParams()).f21521b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean F() {
        return A(8388611);
    }

    /* access modifiers changed from: package-private */
    public void H(View view, float f10) {
        float s10 = s(view);
        float width = (float) view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (s10 * width));
        if (!c(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        S(view, f10);
    }

    public void I(int i10) {
        J(i10, true);
    }

    public void J(int i10, boolean z10) {
        View l10 = l(i10);
        if (l10 != null) {
            L(l10, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + u(i10));
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z10) {
        if (C(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f21502m) {
                fVar.f21521b = 1.0f;
                fVar.f21523d = 1;
                U(view, true);
                T(view);
            } else if (z10) {
                fVar.f21523d |= 2;
                if (c(view, 3)) {
                    this.f21496g.Q(view, 0, view.getTop());
                } else {
                    this.f21497h.Q(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                H(view, 1.0f);
                V(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void M(e eVar) {
        List<e> list;
        if (eVar != null && (list = this.f21509t) != null) {
            list.remove(eVar);
        }
    }

    public void Q(Object obj, boolean z10) {
        this.f21480B = obj;
        this.f21481C = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void R(int i10, int i11) {
        View l10;
        int b10 = C4632s.b(i11, C4600b0.z(this));
        if (i11 == 3) {
            this.f21503n = i10;
        } else if (i11 == 5) {
            this.f21504o = i10;
        } else if (i11 == 8388611) {
            this.f21505p = i10;
        } else if (i11 == 8388613) {
            this.f21506q = i10;
        }
        if (i10 != 0) {
            (b10 == 3 ? this.f21496g : this.f21497h).a();
        }
        if (i10 == 1) {
            View l11 = l(b10);
            if (l11 != null) {
                d(l11);
            }
        } else if (i10 == 2 && (l10 = l(b10)) != null) {
            K(l10);
        }
    }

    /* access modifiers changed from: package-private */
    public void S(View view, float f10) {
        f fVar = (f) view.getLayoutParams();
        if (f10 != fVar.f21521b) {
            fVar.f21521b = f10;
            j(view, f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void V(int i10, View view) {
        int i11;
        int A10 = this.f21496g.A();
        int A11 = this.f21497h.A();
        if (A10 == 1 || A11 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (!(A10 == 2 || A11 == 2)) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((f) view.getLayoutParams()).f21521b;
            if (f10 == 0.0f) {
                h(view);
            } else if (f10 == 1.0f) {
                i(view);
            }
        }
        if (i11 != this.f21500k) {
            this.f21500k = i11;
            List<e> list = this.f21509t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f21509t.get(size).c(i11);
                }
            }
        }
    }

    public void a(e eVar) {
        if (eVar != null) {
            if (this.f21509t == null) {
                this.f21509t = new ArrayList();
            }
            this.f21509t.add(eVar);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z10 = false;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (!C(childAt)) {
                    this.f21486H.add(childAt);
                } else if (B(childAt)) {
                    childAt.addFocusables(arrayList, i10, i11);
                    z10 = true;
                }
            }
            if (!z10) {
                int size = this.f21486H.size();
                for (int i13 = 0; i13 < size; i13++) {
                    View view = this.f21486H.get(i13);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i10, i11);
                    }
                }
            }
            this.f21486H.clear();
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (m() != null || C(view)) {
            C4600b0.z0(view, 4);
        } else {
            C4600b0.z0(view, 1);
        }
        if (!f21476N) {
            C4600b0.p0(view, this.f21490a);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!this.f21507r) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f21507r = true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c(View view, int i10) {
        return (r(view) & i10) == i10;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            f10 = Math.max(f10, ((f) getChildAt(i10).getLayoutParams()).f21521b);
        }
        this.f21494e = f10;
        boolean m10 = this.f21496g.m(true);
        boolean m11 = this.f21497h.m(true);
        if (m10 || m11) {
            C4600b0.f0(this);
        }
    }

    public void d(View view) {
        e(view, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f21494e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (E(x10, y10, childAt) && !z(childAt) && k(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean z10 = z(view2);
        int width = getWidth();
        int save = canvas.save();
        int i10 = 0;
        if (z10) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view2 && childAt.getVisibility() == 0 && v(childAt) && C(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        float f10 = this.f21494e;
        if (f10 > 0.0f && z10) {
            int i13 = this.f21493d;
            this.f21495f.setColor((i13 & 16777215) | (((int) (((float) ((-16777216 & i13) >>> 24)) * f10)) << 24));
            canvas.drawRect((float) i10, 0.0f, (float) width, (float) getHeight(), this.f21495f);
        } else if (this.f21513x != null && c(view2, 3)) {
            int intrinsicWidth = this.f21513x.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f21496g.x()), 1.0f));
            this.f21513x.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f21513x.setAlpha((int) (max * 255.0f));
            this.f21513x.draw(canvas);
        } else if (this.f21514y != null && c(view2, 5)) {
            int intrinsicWidth2 = this.f21514y.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f21497h.x()), 1.0f));
            this.f21514y.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f21514y.setAlpha((int) (max2 * 255.0f));
            this.f21514y.draw(canvas);
        }
        return drawChild;
    }

    public void e(View view, boolean z10) {
        if (C(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f21502m) {
                fVar.f21521b = 0.0f;
                fVar.f21523d = 0;
            } else if (z10) {
                fVar.f21523d |= 4;
                if (c(view, 3)) {
                    this.f21496g.Q(view, -view.getWidth(), view.getTop());
                } else {
                    this.f21497h.Q(view, getWidth(), view.getTop());
                }
            } else {
                H(view, 0.0f);
                V(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void f() {
        g(false);
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z10) {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (C(childAt) && (!z10 || fVar.f21522c)) {
                z11 |= c(childAt, 3) ? this.f21496g.Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.f21497h.Q(childAt, getWidth(), childAt.getTop());
                fVar.f21522c = false;
            }
        }
        this.f21498i.p();
        this.f21499j.p();
        if (z11) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (f21477O) {
            return this.f21491b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f21512w;
    }

    /* access modifiers changed from: package-private */
    public void h(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f21523d & 1) == 1) {
            fVar.f21523d = 0;
            List<e> list = this.f21509t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f21509t.get(size).b(view);
                }
            }
            U(view, false);
            T(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f21523d & 1) == 0) {
            fVar.f21523d = 1;
            List<e> list = this.f21509t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f21509t.get(size).a(view);
                }
            }
            U(view, true);
            T(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(View view, float f10) {
        List<e> list = this.f21509t;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f21509t.get(size).d(view, f10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View l(int i10) {
        int b10 = C4632s.b(i10, C4600b0.z(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((r(childAt) & 7) == b10) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View m() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((f) childAt.getLayoutParams()).f21523d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View n() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (C(childAt) && D(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int o(int i10) {
        int z10 = C4600b0.z(this);
        if (i10 == 3) {
            int i11 = this.f21503n;
            if (i11 != 3) {
                return i11;
            }
            int i12 = z10 == 0 ? this.f21505p : this.f21506q;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        } else if (i10 == 5) {
            int i13 = this.f21504o;
            if (i13 != 3) {
                return i13;
            }
            int i14 = z10 == 0 ? this.f21506q : this.f21505p;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        } else if (i10 == 8388611) {
            int i15 = this.f21505p;
            if (i15 != 3) {
                return i15;
            }
            int i16 = z10 == 0 ? this.f21503n : this.f21504o;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        } else if (i10 != 8388613) {
            return 0;
        } else {
            int i17 = this.f21506q;
            if (i17 != 3) {
                return i17;
            }
            int i18 = z10 == 0 ? this.f21504o : this.f21503n;
            if (i18 != 3) {
                return i18;
            }
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21502m = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21502m = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f21481C && this.f21512w != null) {
            Object obj = this.f21480B;
            int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.f21512w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f21512w.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r7 = r6.f21496g.t((int) r0, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            P2.c r1 = r6.f21496g
            boolean r1 = r1.P(r7)
            P2.c r2 = r6.f21497h
            boolean r2 = r2.P(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0036
        L_0x001e:
            P2.c r7 = r6.f21496g
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L_0x0036
            androidx.drawerlayout.widget.DrawerLayout$i r7 = r6.f21498i
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$i r7 = r6.f21499j
            r7.p()
            goto L_0x0036
        L_0x0031:
            r6.g(r2)
            r6.f21507r = r3
        L_0x0036:
            r7 = r3
            goto L_0x0060
        L_0x0038:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f21510u = r0
            r6.f21511v = r7
            float r4 = r6.f21494e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            P2.c r4 = r6.f21496g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L_0x005d
            boolean r7 = r6.z(r7)
            if (r7 == 0) goto L_0x005d
            r7 = r2
            goto L_0x005e
        L_0x005d:
            r7 = r3
        L_0x005e:
            r6.f21507r = r3
        L_0x0060:
            if (r1 != 0) goto L_0x0070
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.w()
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.f21507r
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !x()) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View n10 = n();
        if (n10 != null && p(n10) == 0) {
            f();
        }
        return n10 != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z11 = true;
        this.f21501l = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z(childAt)) {
                    int i17 = fVar.leftMargin;
                    childAt.layout(i17, fVar.topMargin, childAt.getMeasuredWidth() + i17, fVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f11 = (float) measuredWidth;
                        i14 = (-measuredWidth) + ((int) (fVar.f21521b * f11));
                        f10 = ((float) (measuredWidth + i14)) / f11;
                    } else {
                        float f12 = (float) measuredWidth;
                        int i18 = i15 - ((int) (fVar.f21521b * f12));
                        f10 = ((float) (i15 - i18)) / f12;
                        i14 = i18;
                    }
                    boolean z12 = f10 != fVar.f21521b ? z11 : false;
                    int i19 = fVar.f21520a & 112;
                    if (i19 == 16) {
                        int i20 = i13 - i11;
                        int i21 = (i20 - measuredHeight) / 2;
                        int i22 = fVar.topMargin;
                        if (i21 < i22) {
                            i21 = i22;
                        } else {
                            int i23 = i21 + measuredHeight;
                            int i24 = fVar.bottomMargin;
                            if (i23 > i20 - i24) {
                                i21 = (i20 - i24) - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i21, measuredWidth + i14, measuredHeight + i21);
                    } else if (i19 != 80) {
                        int i25 = fVar.topMargin;
                        childAt.layout(i14, i25, measuredWidth + i14, measuredHeight + i25);
                    } else {
                        int i26 = i13 - i11;
                        childAt.layout(i14, (i26 - fVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i26 - fVar.bottomMargin);
                    }
                    if (z12) {
                        S(childAt, f10);
                    }
                    int i27 = fVar.f21521b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i27) {
                        childAt.setVisibility(i27);
                    }
                }
            }
            i16++;
            z11 = true;
        }
        if (f21478P && (rootWindowInsets = getRootWindowInsets()) != null) {
            x2.d i28 = C0.y(rootWindowInsets).i();
            P2.c cVar = this.f21496g;
            cVar.L(Math.max(cVar.w(), i28.f31836a));
            P2.c cVar2 = this.f21497h;
            cVar2.L(Math.max(cVar2.w(), i28.f31838c));
        }
        this.f21501l = false;
        this.f21502m = false;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        boolean z10 = this.f21480B != null && C4600b0.w(this);
        int z11 = C4600b0.z(this);
        int childCount = getChildCount();
        boolean z12 = false;
        boolean z13 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z10) {
                    int b10 = C4632s.b(fVar.f21520a, z11);
                    if (C4600b0.w(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.f21480B;
                        if (b10 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (b10 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.f21480B;
                        if (b10 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b10 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        fVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        fVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        fVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        fVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (z(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - fVar.leftMargin) - fVar.rightMargin, CatalogRepository.FETCH_FLAG_SDB), View.MeasureSpec.makeMeasureSpec((size2 - fVar.topMargin) - fVar.bottomMargin, CatalogRepository.FETCH_FLAG_SDB));
                } else if (C(childAt)) {
                    if (f21477O) {
                        float u10 = C4600b0.u(childAt);
                        float f10 = this.f21491b;
                        if (u10 != f10) {
                            C4600b0.x0(childAt, f10);
                        }
                    }
                    int r10 = r(childAt) & 7;
                    boolean z14 = r10 == 3;
                    if ((!z14 || !z12) && (z14 || !z13)) {
                        if (z14) {
                            z12 = true;
                        } else {
                            z13 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f21492c + fVar.leftMargin + fVar.rightMargin, fVar.width), ViewGroup.getChildMeasureSpec(i11, fVar.topMargin + fVar.bottomMargin, fVar.height));
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + u(r10) + " but this " + "DrawerLayout" + " already has a drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i13 = i10;
            int i14 = i11;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View l10;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        int i10 = gVar.f21524c;
        if (!(i10 == 0 || (l10 = l(i10)) == null)) {
            K(l10);
        }
        int i11 = gVar.f21525d;
        if (i11 != 3) {
            R(i11, 3);
        }
        int i12 = gVar.f21526e;
        if (i12 != 3) {
            R(i12, 5);
        }
        int i13 = gVar.f21527f;
        if (i13 != 3) {
            R(i13, 8388611);
        }
        int i14 = gVar.f21528g;
        if (i14 != 3) {
            R(i14, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i10) {
        P();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            f fVar = (f) getChildAt(i10).getLayoutParams();
            int i11 = fVar.f21523d;
            boolean z10 = true;
            boolean z11 = i11 == 1;
            if (i11 != 2) {
                z10 = false;
            }
            if (z11 || z10) {
                gVar.f21524c = fVar.f21520a;
            } else {
                i10++;
            }
        }
        gVar.f21525d = this.f21503n;
        gVar.f21526e = this.f21504o;
        gVar.f21527f = this.f21505p;
        gVar.f21528g = this.f21506q;
        return gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (p(r7) != 2) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            P2.c r0 = r6.f21496g
            r0.F(r7)
            P2.c r0 = r6.f21497h
            r0.F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005f
            if (r0 == r2) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006d
        L_0x001a:
            r6.g(r2)
            r6.f21507r = r1
            goto L_0x006d
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            P2.c r3 = r6.f21496g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L_0x005a
            boolean r3 = r6.z(r3)
            if (r3 == 0) goto L_0x005a
            float r3 = r6.f21510u
            float r0 = r0 - r3
            float r3 = r6.f21511v
            float r7 = r7 - r3
            P2.c r3 = r6.f21496g
            int r3 = r3.z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005a
            android.view.View r7 = r6.m()
            if (r7 == 0) goto L_0x005a
            int r7 = r6.p(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005b
        L_0x005a:
            r1 = r2
        L_0x005b:
            r6.g(r1)
            goto L_0x006d
        L_0x005f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f21510u = r0
            r6.f21511v = r7
            r6.f21507r = r1
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public int p(View view) {
        if (C(view)) {
            return o(((f) view.getLayoutParams()).f21520a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public CharSequence q(int i10) {
        int b10 = C4632s.b(i10, C4600b0.z(this));
        if (b10 == 3) {
            return this.f21515z;
        }
        if (b10 == 5) {
            return this.f21479A;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int r(View view) {
        return C4632s.b(((f) view.getLayoutParams()).f21520a, C4600b0.z(this));
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            g(true);
        }
    }

    public void requestLayout() {
        if (!this.f21501l) {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public float s(View view) {
        return ((f) view.getLayoutParams()).f21521b;
    }

    public void setDrawerElevation(float f10) {
        this.f21491b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (C(childAt)) {
                C4600b0.x0(childAt, this.f21491b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.f21508s;
        if (eVar2 != null) {
            M(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f21508s = eVar;
    }

    public void setDrawerLockMode(int i10) {
        R(i10, 3);
        R(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f21493d = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f21512w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.f21512w = new ColorDrawable(i10);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public boolean z(View view) {
        return ((f) view.getLayoutParams()).f21520a == 0;
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21490a = new d();
        this.f21493d = -1728053248;
        this.f21495f = new Paint();
        this.f21502m = true;
        this.f21503n = 3;
        this.f21504o = 3;
        this.f21505p = 3;
        this.f21506q = 3;
        this.f21482D = null;
        this.f21483E = null;
        this.f21484F = null;
        this.f21485G = null;
        this.f21489K = new a();
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f21492c = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        i iVar = new i(3);
        this.f21498i = iVar;
        i iVar2 = new i(5);
        this.f21499j = iVar2;
        P2.c n10 = P2.c.n(this, 1.0f, iVar);
        this.f21496g = n10;
        n10.M(1);
        n10.N(f11);
        iVar.q(n10);
        P2.c n11 = P2.c.n(this, 1.0f, iVar2);
        this.f21497h = n11;
        n11.M(2);
        n11.N(f11);
        iVar2.q(n11);
        setFocusableInTouchMode(true);
        C4600b0.z0(this, 1);
        C4600b0.p0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (C4600b0.w(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(SceneLayout.kCurrent3DVersion);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f21474L);
            try {
                this.f21512w = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, X2.c.f14697b, i10, 0);
        try {
            if (obtainStyledAttributes2.hasValue(X2.c.f14698c)) {
                this.f21491b = obtainStyledAttributes2.getDimension(X2.c.f14698c, 0.0f);
            } else {
                this.f21491b = getResources().getDimension(X2.b.f14695a);
            }
            obtainStyledAttributes2.recycle();
            this.f21486H = new ArrayList<>();
        } catch (Throwable th2) {
            obtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setStatusBarBackground(int i10) {
        this.f21512w = i10 != 0 ? C6012a.e(getContext(), i10) : null;
        invalidate();
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f21520a = 0;

        /* renamed from: b  reason: collision with root package name */
        float f21521b;

        /* renamed from: c  reason: collision with root package name */
        boolean f21522c;

        /* renamed from: d  reason: collision with root package name */
        int f21523d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f21475M);
            this.f21520a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f(int i10, int i11) {
            super(i10, i11);
        }

        public f(f fVar) {
            super(fVar);
            this.f21520a = fVar.f21520a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    protected static class g extends O2.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f21524c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f21525d;

        /* renamed from: e  reason: collision with root package name */
        int f21526e;

        /* renamed from: f  reason: collision with root package name */
        int f21527f;

        /* renamed from: g  reason: collision with root package name */
        int f21528g;

        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f21524c = parcel.readInt();
            this.f21525d = parcel.readInt();
            this.f21526e = parcel.readInt();
            this.f21527f = parcel.readInt();
            this.f21528g = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f21524c);
            parcel.writeInt(this.f21525d);
            parcel.writeInt(this.f21526e);
            parcel.writeInt(this.f21527f);
            parcel.writeInt(this.f21528g);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
