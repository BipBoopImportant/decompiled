package androidx.swiperefreshlayout.widget;

import I2.C4600b0;
import I2.D;
import I2.E;
import I2.F;
import I2.G;
import I2.H;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import com.sugarcube.app.base.data.source.CatalogRepository;
import u2.C6012a;

public class SwipeRefreshLayout extends ViewGroup implements G, F, D {

    /* renamed from: P  reason: collision with root package name */
    private static final String f44486P = "SwipeRefreshLayout";

    /* renamed from: Q  reason: collision with root package name */
    private static final int[] f44487Q = {16842766};

    /* renamed from: A  reason: collision with root package name */
    int f44488A;

    /* renamed from: B  reason: collision with root package name */
    int f44489B;

    /* renamed from: C  reason: collision with root package name */
    a f44490C;

    /* renamed from: D  reason: collision with root package name */
    private Animation f44491D;

    /* renamed from: E  reason: collision with root package name */
    private Animation f44492E;

    /* renamed from: F  reason: collision with root package name */
    private Animation f44493F;

    /* renamed from: G  reason: collision with root package name */
    private Animation f44494G;

    /* renamed from: H  reason: collision with root package name */
    private Animation f44495H;

    /* renamed from: I  reason: collision with root package name */
    boolean f44496I;

    /* renamed from: J  reason: collision with root package name */
    private int f44497J;

    /* renamed from: K  reason: collision with root package name */
    boolean f44498K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f44499L;

    /* renamed from: M  reason: collision with root package name */
    private Animation.AnimationListener f44500M = new a();

    /* renamed from: N  reason: collision with root package name */
    private final Animation f44501N = new f();

    /* renamed from: O  reason: collision with root package name */
    private final Animation f44502O = new g();

    /* renamed from: a  reason: collision with root package name */
    private View f44503a;

    /* renamed from: b  reason: collision with root package name */
    j f44504b;

    /* renamed from: c  reason: collision with root package name */
    boolean f44505c = false;

    /* renamed from: d  reason: collision with root package name */
    private int f44506d;

    /* renamed from: e  reason: collision with root package name */
    private float f44507e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private float f44508f;

    /* renamed from: g  reason: collision with root package name */
    private final H f44509g;

    /* renamed from: h  reason: collision with root package name */
    private final E f44510h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f44511i = new int[2];

    /* renamed from: j  reason: collision with root package name */
    private final int[] f44512j = new int[2];

    /* renamed from: k  reason: collision with root package name */
    private final int[] f44513k = new int[2];

    /* renamed from: l  reason: collision with root package name */
    private boolean f44514l;

    /* renamed from: m  reason: collision with root package name */
    private int f44515m;

    /* renamed from: n  reason: collision with root package name */
    int f44516n;

    /* renamed from: o  reason: collision with root package name */
    private float f44517o;

    /* renamed from: p  reason: collision with root package name */
    private float f44518p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f44519q;

    /* renamed from: r  reason: collision with root package name */
    private int f44520r = -1;

    /* renamed from: s  reason: collision with root package name */
    boolean f44521s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f44522t;

    /* renamed from: u  reason: collision with root package name */
    private final DecelerateInterpolator f44523u;

    /* renamed from: v  reason: collision with root package name */
    CircleImageView f44524v;

    /* renamed from: w  reason: collision with root package name */
    private int f44525w = -1;

    /* renamed from: x  reason: collision with root package name */
    protected int f44526x;

    /* renamed from: y  reason: collision with root package name */
    float f44527y;

    /* renamed from: z  reason: collision with root package name */
    protected int f44528z;

    class a implements Animation.AnimationListener {
        a() {
        }

        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f44505c) {
                swipeRefreshLayout.f44490C.setAlpha(255);
                SwipeRefreshLayout.this.f44490C.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f44496I && (jVar = swipeRefreshLayout2.f44504b) != null) {
                    jVar.a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f44516n = swipeRefreshLayout3.f44524v.getTop();
                return;
            }
            swipeRefreshLayout.r();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    class c extends Animation {
        c() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    class d extends Animation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f44532a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44533b;

        d(int i10, int i11) {
            this.f44532a = i10;
            this.f44533b = i11;
        }

        public void applyTransformation(float f10, Transformation transformation) {
            a aVar = SwipeRefreshLayout.this.f44490C;
            int i10 = this.f44532a;
            aVar.setAlpha((int) (((float) i10) + (((float) (this.f44533b - i10)) * f10)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f44521s) {
                swipeRefreshLayout.x((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = !swipeRefreshLayout.f44498K ? swipeRefreshLayout.f44488A - Math.abs(swipeRefreshLayout.f44528z) : swipeRefreshLayout.f44488A;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i10 = swipeRefreshLayout2.f44526x;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i10 + ((int) (((float) (abs - i10)) * f10))) - swipeRefreshLayout2.f44524v.getTop());
            SwipeRefreshLayout.this.f44490C.e(1.0f - f10);
        }
    }

    class g extends Animation {
        g() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.p(f10);
        }
    }

    class h extends Animation {
        h() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.f44527y;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.p(f10);
        }
    }

    public interface i {
    }

    public interface j {
        void a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44506d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f44515m = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f44523u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f44497J = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f44488A = i10;
        this.f44507e = (float) i10;
        this.f44509g = new H(this);
        this.f44510h = new E(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f44497J;
        this.f44516n = i11;
        this.f44528z = i11;
        p(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f44487Q);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.f44526x = i10;
        this.f44501N.reset();
        this.f44501N.setDuration(200);
        this.f44501N.setInterpolator(this.f44523u);
        if (animationListener != null) {
            this.f44524v.b(animationListener);
        }
        this.f44524v.clearAnimation();
        this.f44524v.startAnimation(this.f44501N);
    }

    private void b(int i10, Animation.AnimationListener animationListener) {
        if (this.f44521s) {
            y(i10, animationListener);
            return;
        }
        this.f44526x = i10;
        this.f44502O.reset();
        this.f44502O.setDuration(200);
        this.f44502O.setInterpolator(this.f44523u);
        if (animationListener != null) {
            this.f44524v.b(animationListener);
        }
        this.f44524v.clearAnimation();
        this.f44524v.startAnimation(this.f44502O);
    }

    private void d() {
        this.f44524v = new CircleImageView(getContext());
        a aVar = new a(getContext());
        this.f44490C = aVar;
        aVar.l(1);
        this.f44524v.setImageDrawable(this.f44490C);
        this.f44524v.setVisibility(8);
        addView(this.f44524v);
    }

    private void f() {
        if (this.f44503a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f44524v)) {
                    this.f44503a = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f10) {
        if (f10 > this.f44507e) {
            s(true, true);
            return;
        }
        this.f44505c = false;
        this.f44490C.j(0.0f, 0.0f);
        b(this.f44516n, !this.f44521s ? new e() : null);
        this.f44490C.d(false);
    }

    private boolean h(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    private void l(float f10) {
        this.f44490C.d(true);
        float min = Math.min(1.0f, Math.abs(f10 / this.f44507e));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.f44507e;
        int i10 = this.f44489B;
        if (i10 <= 0) {
            i10 = this.f44498K ? this.f44488A - this.f44528z : this.f44488A;
        }
        float f11 = (float) i10;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f11 * 2.0f) / f11) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.f44528z + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.f44524v.getVisibility() != 0) {
            this.f44524v.setVisibility(0);
        }
        if (!this.f44521s) {
            this.f44524v.setScaleX(1.0f);
            this.f44524v.setScaleY(1.0f);
        }
        if (this.f44521s) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f44507e));
        }
        if (f10 < this.f44507e) {
            if (this.f44490C.getAlpha() > 76 && !h(this.f44493F)) {
                w();
            }
        } else if (this.f44490C.getAlpha() < 255 && !h(this.f44494G)) {
            v();
        }
        this.f44490C.j(0.0f, Math.min(0.8f, max * 0.8f));
        this.f44490C.e(Math.min(1.0f, max));
        this.f44490C.g((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f44516n);
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f44520r) {
            this.f44520r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void s(boolean z10, boolean z11) {
        if (this.f44505c != z10) {
            this.f44496I = z11;
            f();
            this.f44505c = z10;
            if (z10) {
                a(this.f44516n, this.f44500M);
            } else {
                x(this.f44500M);
            }
        }
    }

    private void setColorViewAlpha(int i10) {
        this.f44524v.getBackground().setAlpha(i10);
        this.f44490C.setAlpha(i10);
    }

    private Animation t(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300);
        this.f44524v.b((Animation.AnimationListener) null);
        this.f44524v.clearAnimation();
        this.f44524v.startAnimation(dVar);
        return dVar;
    }

    private void u(float f10) {
        float f11 = this.f44518p;
        int i10 = this.f44506d;
        if (f10 - f11 > ((float) i10) && !this.f44519q) {
            this.f44517o = f11 + ((float) i10);
            this.f44519q = true;
            this.f44490C.setAlpha(76);
        }
    }

    private void v() {
        this.f44494G = t(this.f44490C.getAlpha(), 255);
    }

    private void w() {
        this.f44493F = t(this.f44490C.getAlpha(), 76);
    }

    private void y(int i10, Animation.AnimationListener animationListener) {
        this.f44526x = i10;
        this.f44527y = this.f44524v.getScaleX();
        h hVar = new h();
        this.f44495H = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.f44524v.b(animationListener);
        }
        this.f44524v.clearAnimation();
        this.f44524v.startAnimation(this.f44495H);
    }

    private void z(Animation.AnimationListener animationListener) {
        this.f44524v.setVisibility(0);
        this.f44490C.setAlpha(255);
        b bVar = new b();
        this.f44491D = bVar;
        bVar.setDuration((long) this.f44515m);
        if (animationListener != null) {
            this.f44524v.b(animationListener);
        }
        this.f44524v.clearAnimation();
        this.f44524v.startAnimation(this.f44491D);
    }

    public boolean c() {
        View view = this.f44503a;
        return view instanceof ListView ? androidx.core.widget.g.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f44510h.a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f44510h.b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f44510h.c(i10, i11, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f44510h.f(i10, i11, i12, i13, iArr);
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.f44510h.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f44525w;
        return i12 < 0 ? i11 : i11 == i10 + -1 ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    public int getNestedScrollAxes() {
        return this.f44509g.a();
    }

    public int getProgressCircleDiameter() {
        return this.f44497J;
    }

    public int getProgressViewEndOffset() {
        return this.f44488A;
    }

    public int getProgressViewStartOffset() {
        return this.f44528z;
    }

    public boolean hasNestedScrollingParent() {
        return this.f44510h.j();
    }

    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    public boolean isNestedScrollingEnabled() {
        return this.f44510h.l();
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

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 == 0) {
            int i15 = iArr[1];
            e(i10, i11, i12, i13, this.f44512j, i14, iArr);
            int i16 = i13 - (iArr[1] - i15);
            int i17 = i16 == 0 ? i13 + this.f44512j[1] : i16;
            if (i17 < 0 && !c()) {
                float abs = this.f44508f + ((float) Math.abs(i17));
                this.f44508f = abs;
                l(abs);
                iArr[1] = iArr[1] + i16;
            }
        }
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, i14, this.f44513k);
    }

    public boolean o(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f44522t && actionMasked == 0) {
            this.f44522t = false;
        }
        if (!isEnabled() || this.f44522t || c() || this.f44505c || this.f44514l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.f44520r;
                    if (i10 == -1) {
                        Log.e(f44486P, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    u(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        q(motionEvent);
                    }
                }
            }
            this.f44519q = false;
            this.f44520r = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f44528z - this.f44524v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f44520r = pointerId;
            this.f44519q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f44518p = motionEvent.getY(findPointerIndex2);
        }
        return this.f44519q;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f44503a == null) {
                f();
            }
            View view = this.f44503a;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f44524v.getMeasuredWidth();
                int measuredHeight2 = this.f44524v.getMeasuredHeight();
                int i14 = measuredWidth / 2;
                int i15 = measuredWidth2 / 2;
                int i16 = this.f44516n;
                this.f44524v.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f44503a == null) {
            f();
        }
        View view = this.f44503a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), CatalogRepository.FETCH_FLAG_SDB), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), CatalogRepository.FETCH_FLAG_SDB));
            this.f44524v.measure(View.MeasureSpec.makeMeasureSpec(this.f44497J, CatalogRepository.FETCH_FLAG_SDB), View.MeasureSpec.makeMeasureSpec(this.f44497J, CatalogRepository.FETCH_FLAG_SDB));
            this.f44525w = -1;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) == this.f44524v) {
                    this.f44525w = i12;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f44508f;
            if (f10 > 0.0f) {
                float f11 = (float) i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f44508f = 0.0f;
                } else {
                    this.f44508f = f10 - f11;
                    iArr[1] = i11;
                }
                l(this.f44508f);
            }
        }
        if (this.f44498K && i11 > 0 && this.f44508f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f44524v.setVisibility(8);
        }
        int[] iArr2 = this.f44511i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0, this.f44513k);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f44509g.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f44508f = 0.0f;
        this.f44514l = true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f44539a);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f44505c);
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return isEnabled() && !this.f44522t && !this.f44505c && (i10 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f44509g.d(view);
        this.f44514l = false;
        float f10 = this.f44508f;
        if (f10 > 0.0f) {
            g(f10);
            this.f44508f = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f44522t && actionMasked == 0) {
            this.f44522t = false;
        }
        if (!isEnabled() || this.f44522t || c() || this.f44505c || this.f44514l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f44520r = motionEvent.getPointerId(0);
            this.f44519q = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f44520r);
            if (findPointerIndex < 0) {
                Log.e(f44486P, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f44519q) {
                this.f44519q = false;
                g((motionEvent.getY(findPointerIndex) - this.f44517o) * 0.5f);
            }
            this.f44520r = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f44520r);
            if (findPointerIndex2 < 0) {
                Log.e(f44486P, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y10 = motionEvent.getY(findPointerIndex2);
            u(y10);
            if (this.f44519q) {
                float f10 = (y10 - this.f44517o) * 0.5f;
                if (f10 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                l(f10);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f44486P, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f44520r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                q(motionEvent);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p(float f10) {
        int i10 = this.f44526x;
        setTargetOffsetTopAndBottom((i10 + ((int) (((float) (this.f44528z - i10)) * f10))) - this.f44524v.getTop());
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f44524v.clearAnimation();
        this.f44490C.stop();
        this.f44524v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f44521s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f44528z - this.f44516n);
        }
        this.f44516n = this.f44524v.getTop();
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent;
        View view = this.f44503a;
        if (view == null || C4600b0.T(view)) {
            super.requestDisallowInterceptTouchEvent(z10);
        } else if (!this.f44499L && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f10) {
        this.f44524v.setScaleX(f10);
        this.f44524v.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.f44490C.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = C6012a.c(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f44507e = (float) i10;
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            r();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.f44499L = z10;
    }

    public void setNestedScrollingEnabled(boolean z10) {
        this.f44510h.m(z10);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.f44504b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f44524v.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(C6012a.c(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f44505c == z10) {
            s(z10, false);
            return;
        }
        this.f44505c = z10;
        setTargetOffsetTopAndBottom((!this.f44498K ? this.f44488A + this.f44528z : this.f44488A) - this.f44516n);
        this.f44496I = false;
        z(this.f44500M);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f44497J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f44497J = (int) (displayMetrics.density * 40.0f);
            }
            this.f44524v.setImageDrawable((Drawable) null);
            this.f44490C.l(i10);
            this.f44524v.setImageDrawable(this.f44490C);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.f44489B = i10;
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i10) {
        this.f44524v.bringToFront();
        C4600b0.Z(this.f44524v, i10);
        this.f44516n = this.f44524v.getTop();
    }

    public boolean startNestedScroll(int i10) {
        return this.f44510h.o(i10);
    }

    public void stopNestedScroll() {
        this.f44510h.q();
    }

    /* access modifiers changed from: package-private */
    public void x(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.f44492E = cVar;
        cVar.setDuration(150);
        this.f44524v.b(animationListener);
        this.f44524v.clearAnimation();
        this.f44524v.startAnimation(this.f44492E);
    }

    static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        final boolean f44539a;

        class a implements Parcelable.Creator<k> {
            a() {
            }

            /* renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            /* renamed from: b */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        k(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f44539a = z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f44539a ? (byte) 1 : 0);
        }

        k(Parcel parcel) {
            super(parcel);
            this.f44539a = parcel.readByte() != 0;
        }
    }
}
