package androidx.appcompat.widget;

import I2.C0;
import I2.C4600b0;
import I2.F;
import I2.G;
import I2.H;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.k;
import i.C5421a;
import i.C5426f;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C5006s, F, G {

    /* renamed from: G  reason: collision with root package name */
    static final int[] f15972G = {C5421a.f23887b, 16842841};

    /* renamed from: H  reason: collision with root package name */
    private static final C0 f15973H = new C0.a().d(x2.d.b(0, 1, 0, 1)).a();

    /* renamed from: I  reason: collision with root package name */
    private static final Rect f15974I = new Rect();

    /* renamed from: A  reason: collision with root package name */
    ViewPropertyAnimator f15975A;

    /* renamed from: B  reason: collision with root package name */
    final AnimatorListenerAdapter f15976B;

    /* renamed from: C  reason: collision with root package name */
    private final Runnable f15977C;

    /* renamed from: D  reason: collision with root package name */
    private final Runnable f15978D;

    /* renamed from: E  reason: collision with root package name */
    private final H f15979E;

    /* renamed from: F  reason: collision with root package name */
    private final NoSystemUiLayoutFlagView f15980F;

    /* renamed from: a  reason: collision with root package name */
    private int f15981a;

    /* renamed from: b  reason: collision with root package name */
    private int f15982b = 0;

    /* renamed from: c  reason: collision with root package name */
    private ContentFrameLayout f15983c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarContainer f15984d;

    /* renamed from: e  reason: collision with root package name */
    private C5007t f15985e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f15986f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15987g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15988h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15989i;

    /* renamed from: j  reason: collision with root package name */
    boolean f15990j;

    /* renamed from: k  reason: collision with root package name */
    private int f15991k;

    /* renamed from: l  reason: collision with root package name */
    private int f15992l;

    /* renamed from: m  reason: collision with root package name */
    private final Rect f15993m = new Rect();

    /* renamed from: n  reason: collision with root package name */
    private final Rect f15994n = new Rect();

    /* renamed from: o  reason: collision with root package name */
    private final Rect f15995o = new Rect();

    /* renamed from: p  reason: collision with root package name */
    private final Rect f15996p = new Rect();

    /* renamed from: q  reason: collision with root package name */
    private final Rect f15997q = new Rect();

    /* renamed from: r  reason: collision with root package name */
    private final Rect f15998r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    private final Rect f15999s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    private final Rect f16000t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    private C0 f16001u;

    /* renamed from: v  reason: collision with root package name */
    private C0 f16002v;

    /* renamed from: w  reason: collision with root package name */
    private C0 f16003w;

    /* renamed from: x  reason: collision with root package name */
    private C0 f16004x;

    /* renamed from: y  reason: collision with root package name */
    private d f16005y;

    /* renamed from: z  reason: collision with root package name */
    private OverScroller f16006z;

    private static final class NoSystemUiLayoutFlagView extends View {
        NoSystemUiLayoutFlagView(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f15975A = null;
            actionBarOverlayLayout.f15990j = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f15975A = null;
            actionBarOverlayLayout.f15990j = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f15975A = actionBarOverlayLayout.f15984d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f15976B);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f15975A = actionBarOverlayLayout.f15984d.animate().translationY((float) (-ActionBarOverlayLayout.this.f15984d.getHeight())).setListener(ActionBarOverlayLayout.this.f15976B);
        }
    }

    public interface d {
        void a();

        void b(int i10);

        void c();

        void d(boolean z10);

        void e();

        void f();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0 c02 = C0.f8564b;
        this.f16001u = c02;
        this.f16002v = c02;
        this.f16003w = c02;
        this.f16004x = c02;
        this.f15976B = new a();
        this.f15977C = new b();
        this.f15978D = new c();
        w(context);
        this.f15979E = new H(this);
        NoSystemUiLayoutFlagView noSystemUiLayoutFlagView = new NoSystemUiLayoutFlagView(context);
        this.f15980F = noSystemUiLayoutFlagView;
        addView(noSystemUiLayoutFlagView);
    }

    private void B() {
        v();
        this.f15977C.run();
    }

    private boolean C(float f10) {
        this.f16006z.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f16006z.getFinalY() > this.f15984d.getHeight();
    }

    private void p() {
        v();
        this.f15978D.run();
    }

    private boolean q(View view, Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        int i10;
        int i11;
        int i12;
        int i13;
        e eVar = (e) view.getLayoutParams();
        if (!z10 || eVar.leftMargin == (i13 = rect.left)) {
            z14 = false;
        } else {
            eVar.leftMargin = i13;
            z14 = true;
        }
        if (z11 && eVar.topMargin != (i12 = rect.top)) {
            eVar.topMargin = i12;
            z14 = true;
        }
        if (z13 && eVar.rightMargin != (i11 = rect.right)) {
            eVar.rightMargin = i11;
            z14 = true;
        }
        if (!z12 || eVar.bottomMargin == (i10 = rect.bottom)) {
            return z14;
        }
        eVar.bottomMargin = i10;
        return true;
    }

    private boolean r() {
        C4600b0.f(this.f15980F, f15973H, this.f15996p);
        return !this.f15996p.equals(f15974I);
    }

    private C5007t u(View view) {
        if (view instanceof C5007t) {
            return (C5007t) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void w(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f15972G);
        boolean z10 = false;
        this.f15981a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f15986f = drawable;
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        obtainStyledAttributes.recycle();
        this.f16006z = new OverScroller(context);
    }

    private void y() {
        v();
        postDelayed(this.f15978D, 600);
    }

    private void z() {
        v();
        postDelayed(this.f15977C, 600);
    }

    /* access modifiers changed from: package-private */
    public void A() {
        if (this.f15983c == null) {
            this.f15983c = (ContentFrameLayout) findViewById(C5426f.f23982b);
            this.f15984d = (ActionBarContainer) findViewById(C5426f.f23983c);
            this.f15985e = u(findViewById(C5426f.f23981a));
        }
    }

    public boolean a() {
        A();
        return this.f15985e.a();
    }

    public boolean b() {
        A();
        return this.f15985e.b();
    }

    public boolean c() {
        A();
        return this.f15985e.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void d(Menu menu, k.a aVar) {
        A();
        this.f15985e.d(menu, aVar);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f15986f != null) {
            int bottom = this.f15984d.getVisibility() == 0 ? (int) (((float) this.f15984d.getBottom()) + this.f15984d.getTranslationY() + 0.5f) : 0;
            this.f15986f.setBounds(0, bottom, getWidth(), this.f15986f.getIntrinsicHeight() + bottom);
            this.f15986f.draw(canvas);
        }
    }

    public boolean e() {
        A();
        return this.f15985e.e();
    }

    public void f() {
        A();
        this.f15985e.f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public boolean g() {
        A();
        return this.f15985e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f15984d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f15979E.a();
    }

    public CharSequence getTitle() {
        A();
        return this.f15985e.getTitle();
    }

    public void h(int i10) {
        A();
        if (i10 == 2) {
            this.f15985e.p();
        } else if (i10 == 5) {
            this.f15985e.y();
        } else if (i10 == 109) {
            setOverlayMode(true);
        }
    }

    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    public void l() {
        A();
        this.f15985e.r();
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        A();
        C0 z10 = C0.z(windowInsets, this);
        boolean q10 = q(this.f15984d, new Rect(z10.k(), z10.m(), z10.l(), z10.j()), true, true, false, true);
        C4600b0.f(this, z10, this.f15993m);
        Rect rect = this.f15993m;
        C0 o10 = z10.o(rect.left, rect.top, rect.right, rect.bottom);
        this.f16001u = o10;
        boolean z11 = true;
        if (!this.f16002v.equals(o10)) {
            this.f16002v = this.f16001u;
            q10 = true;
        }
        if (!this.f15994n.equals(this.f15993m)) {
            this.f15994n.set(this.f15993m);
        } else {
            z11 = q10;
        }
        if (z11) {
            requestLayout();
        }
        return z10.a().c().b().x();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        C4600b0.l0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = eVar.leftMargin + paddingLeft;
                int i16 = eVar.topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        A();
        measureChildWithMargins(this.f15984d, i10, 0, i11, 0);
        e eVar = (e) this.f15984d.getLayoutParams();
        int max = Math.max(0, this.f15984d.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f15984d.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f15984d.getMeasuredState());
        boolean z10 = (C4600b0.L(this) & 256) != 0;
        if (z10) {
            i12 = this.f15981a;
            if (this.f15988h && this.f15984d.getTabContainer() != null) {
                i12 += this.f15981a;
            }
        } else {
            i12 = this.f15984d.getVisibility() != 8 ? this.f15984d.getMeasuredHeight() : 0;
        }
        this.f15995o.set(this.f15993m);
        this.f16003w = this.f16001u;
        if (this.f15987g || z10 || !r()) {
            this.f16003w = new C0.a(this.f16003w).d(x2.d.b(this.f16003w.k(), this.f16003w.m() + i12, this.f16003w.l(), this.f16003w.j())).a();
        } else {
            Rect rect = this.f15995o;
            rect.top += i12;
            rect.bottom = rect.bottom;
            this.f16003w = this.f16003w.o(0, i12, 0, 0);
        }
        q(this.f15983c, this.f15995o, true, true, true, true);
        if (!this.f16004x.equals(this.f16003w)) {
            C0 c02 = this.f16003w;
            this.f16004x = c02;
            C4600b0.g(this.f15983c, c02);
        }
        measureChildWithMargins(this.f15983c, i10, 0, i11, 0);
        e eVar2 = (e) this.f15983c.getLayoutParams();
        int max3 = Math.max(max, this.f15983c.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f15983c.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f15983c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f15989i || !z10) {
            return false;
        }
        if (C(f11)) {
            p();
        } else {
            B();
        }
        this.f15990j = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f15991k + i11;
        this.f15991k = i14;
        setActionBarHideOffset(i14);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f15979E.b(view, view2, i10);
        this.f15991k = getActionBarHideOffset();
        v();
        d dVar = this.f16005y;
        if (dVar != null) {
            dVar.f();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f15984d.getVisibility() != 0) {
            return false;
        }
        return this.f15989i;
    }

    public void onStopNestedScroll(View view) {
        if (this.f15989i && !this.f15990j) {
            if (this.f15991k <= this.f15984d.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.f16005y;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        A();
        int i11 = this.f15992l ^ i10;
        this.f15992l = i10;
        boolean z10 = false;
        boolean z11 = (i10 & 4) == 0;
        if ((i10 & 256) != 0) {
            z10 = true;
        }
        d dVar = this.f16005y;
        if (dVar != null) {
            dVar.d(!z10);
            if (z11 || !z10) {
                this.f16005y.a();
            } else {
                this.f16005y.e();
            }
        }
        if ((i11 & 256) != 0 && this.f16005y != null) {
            C4600b0.l0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f15982b = i10;
        d dVar = this.f16005y;
        if (dVar != null) {
            dVar.b(i10);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int i10) {
        v();
        this.f15984d.setTranslationY((float) (-Math.max(0, Math.min(i10, this.f15984d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f16005y = dVar;
        if (getWindowToken() != null) {
            this.f16005y.b(this.f15982b);
            int i10 = this.f15992l;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                C4600b0.l0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f15988h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f15989i) {
            this.f15989i = z10;
            if (!z10) {
                v();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        A();
        this.f15985e.setIcon(i10);
    }

    public void setLogo(int i10) {
        A();
        this.f15985e.t(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f15987g = z10;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    public void setWindowCallback(Window.Callback callback) {
        A();
        this.f15985e.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.f15985e.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* access modifiers changed from: package-private */
    public void v() {
        removeCallbacks(this.f15977C);
        removeCallbacks(this.f15978D);
        ViewPropertyAnimator viewPropertyAnimator = this.f15975A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean x() {
        return this.f15987g;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A();
        this.f15985e.setIcon(drawable);
    }
}
