package androidx.core.widget;

import I2.C;
import I2.C4597a;
import I2.C4600b0;
import I2.C4625o;
import I2.C4627p;
import I2.D;
import I2.E;
import I2.G;
import I2.H;
import J2.t;
import J2.v;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.util.ArrayList;
import t2.C5943a;

public class NestedScrollView extends FrameLayout implements G, D {

    /* renamed from: D  reason: collision with root package name */
    private static final float f21167D = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: E  reason: collision with root package name */
    private static final a f21168E = new a();

    /* renamed from: F  reason: collision with root package name */
    private static final int[] f21169F = {16843130};

    /* renamed from: A  reason: collision with root package name */
    private e f21170A;

    /* renamed from: B  reason: collision with root package name */
    final d f21171B;

    /* renamed from: C  reason: collision with root package name */
    C4625o f21172C;

    /* renamed from: a  reason: collision with root package name */
    private final float f21173a;

    /* renamed from: b  reason: collision with root package name */
    private long f21174b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f21175c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f21176d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f21177e;

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f21178f;

    /* renamed from: g  reason: collision with root package name */
    private int f21179g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f21180h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f21181i;

    /* renamed from: j  reason: collision with root package name */
    private View f21182j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f21183k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f21184l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f21185m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f21186n;

    /* renamed from: o  reason: collision with root package name */
    private int f21187o;

    /* renamed from: p  reason: collision with root package name */
    private int f21188p;

    /* renamed from: q  reason: collision with root package name */
    private int f21189q;

    /* renamed from: r  reason: collision with root package name */
    private int f21190r;

    /* renamed from: s  reason: collision with root package name */
    private final int[] f21191s;

    /* renamed from: t  reason: collision with root package name */
    private final int[] f21192t;

    /* renamed from: u  reason: collision with root package name */
    private int f21193u;

    /* renamed from: v  reason: collision with root package name */
    private int f21194v;

    /* renamed from: w  reason: collision with root package name */
    private f f21195w;

    /* renamed from: x  reason: collision with root package name */
    private final H f21196x;

    /* renamed from: y  reason: collision with root package name */
    private final E f21197y;

    /* renamed from: z  reason: collision with root package name */
    private float f21198z;

    static class a extends C4597a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            v.a(accessibilityEvent, nestedScrollView.getScrollX());
            v.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void g(View view, t tVar) {
            int scrollRange;
            super.g(view, tVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            tVar.i0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                tVar.L0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    tVar.b(t.a.f8847r);
                    tVar.b(t.a.f8814C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    tVar.b(t.a.f8846q);
                    tVar.b(t.a.f8816E);
                }
            }
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, max, true);
                    return true;
                } else if (i10 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, min, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    private static final class c {
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    class d implements C4627p {
        d() {
        }

        public boolean a(float f10) {
            if (f10 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f10);
            return true;
        }

        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        public void c() {
            NestedScrollView.this.f21176d.abortAnimation();
        }
    }

    public interface e {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f21200a;

        class a implements Parcelable.Creator<f> {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            /* renamed from: b */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f21200a + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f21200a);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f21200a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5943a.f29331c);
    }

    private void A() {
        VelocityTracker velocityTracker = this.f21184l;
        if (velocityTracker == null) {
            this.f21184l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void B() {
        this.f21176d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f21187o = viewConfiguration.getScaledTouchSlop();
        this.f21188p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f21189q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void C() {
        if (this.f21184l == null) {
            this.f21184l = VelocityTracker.obtain();
        }
    }

    private void D(int i10, int i11) {
        this.f21179g = i10;
        this.f21190r = i11;
        X(2, 0);
    }

    private boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    private static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    private boolean G(View view, int i10, int i11) {
        view.getDrawingRect(this.f21175c);
        offsetDescendantRectToMyCoords(view, this.f21175c);
        return this.f21175c.bottom + i10 >= getScrollY() && this.f21175c.top - i10 <= getScrollY() + i11;
    }

    private void H(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f21197y.e(0, scrollY2, 0, i10 - scrollY2, (int[]) null, i11, iArr);
    }

    private void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f21190r) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f21179g = (int) motionEvent.getY(i10);
            this.f21190r = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f21184l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void L() {
        VelocityTracker velocityTracker = this.f21184l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f21184l = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int M(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f21177e
            float r0 = androidx.core.widget.d.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f21177e
            float r4 = -r4
            float r4 = androidx.core.widget.d.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f21177e
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f21177e
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0054
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f21178f
            float r0 = androidx.core.widget.d.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            android.widget.EdgeEffect r0 = r3.f21178f
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.d.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f21178f
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f21178f
            r5.onRelease()
            goto L_0x002f
        L_0x0054:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0063
            r3.invalidate()
        L_0x0063:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.M(int, float):int");
    }

    private void N(boolean z10) {
        if (z10) {
            X(2, 1);
        } else {
            Z(1);
        }
        this.f21194v = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean O(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View u10 = u(z11, i11, i12);
        if (u10 == null) {
            u10 = this;
        }
        if (i11 < scrollY || i12 > i13) {
            P(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (u10 != findFocus()) {
            u10.requestFocus(i10);
        }
        return z10;
    }

    private int P(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        VelocityTracker velocityTracker;
        int i15 = i11;
        int i16 = i12;
        if (i16 == 1) {
            X(2, i16);
        }
        boolean z11 = false;
        if (l(0, i10, this.f21192t, this.f21191s, i12)) {
            i14 = i10 - this.f21192t[1];
            i13 = this.f21191s[1];
        } else {
            i14 = i10;
            i13 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = d() && !z10;
        int i17 = scrollRange;
        boolean z13 = J(0, i14, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i16);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f21192t;
        iArr[1] = 0;
        p(0, scrollY2, 0, i14 - scrollY2, this.f21191s, i12, iArr);
        int i18 = i13 + this.f21191s[1];
        int i19 = i14 - this.f21192t[1];
        int i20 = scrollY + i19;
        if (i20 < 0) {
            if (z12) {
                d.d(this.f21177e, ((float) (-i19)) / ((float) getHeight()), ((float) i15) / ((float) getWidth()));
                if (!this.f21178f.isFinished()) {
                    this.f21178f.onRelease();
                }
            }
        } else if (i20 > i17 && z12) {
            d.d(this.f21178f, ((float) i19) / ((float) getHeight()), 1.0f - (((float) i15) / ((float) getWidth())));
            if (!this.f21177e.isFinished()) {
                this.f21177e.onRelease();
            }
        }
        if (!this.f21177e.isFinished() || !this.f21178f.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            z11 = z13;
        }
        if (z11 && i16 == 0 && (velocityTracker = this.f21184l) != null) {
            velocityTracker.clear();
        }
        if (i16 == 1) {
            Z(i16);
            this.f21177e.onRelease();
            this.f21178f.onRelease();
        }
        return i18;
    }

    private void Q(View view) {
        view.getDrawingRect(this.f21175c);
        offsetDescendantRectToMyCoords(view, this.f21175c);
        int g10 = g(this.f21175c);
        if (g10 != 0) {
            scrollBy(0, g10);
        }
    }

    private boolean R(Rect rect, boolean z10) {
        int g10 = g(rect);
        boolean z11 = g10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, g10);
            } else {
                T(0, g10);
            }
        }
        return z11;
    }

    private boolean S(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return x(-i10) < d.b(edgeEffect) * ((float) getHeight());
    }

    private void U(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f21174b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f21176d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i12);
                N(z10);
            } else {
                if (!this.f21176d.isFinished()) {
                    a();
                }
                scrollBy(i10, i11);
            }
            this.f21174b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private boolean Y(MotionEvent motionEvent) {
        boolean z10;
        if (d.b(this.f21177e) != 0.0f) {
            d.d(this.f21177e, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z10 = true;
        } else {
            z10 = false;
        }
        if (d.b(this.f21178f) == 0.0f) {
            return z10;
        }
        d.d(this.f21178f, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    private void a() {
        this.f21176d.abortAnimation();
        Z(1);
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int f(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private void q(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f21186n) {
            T(0, i10);
        } else {
            scrollBy(0, i10);
        }
    }

    private boolean r(int i10) {
        if (d.b(this.f21177e) != 0.0f) {
            if (S(this.f21177e, i10)) {
                this.f21177e.onAbsorb(i10);
            } else {
                v(-i10);
            }
        } else if (d.b(this.f21178f) == 0.0f) {
            return false;
        } else {
            int i11 = -i10;
            if (S(this.f21178f, i11)) {
                this.f21178f.onAbsorb(i11);
            } else {
                v(i11);
            }
        }
        return true;
    }

    private void s() {
        this.f21190r = -1;
        this.f21183k = false;
        L();
        Z(0);
        this.f21177e.onRelease();
        this.f21178f.onRelease();
    }

    private View u(boolean z10, int i10, int i11) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else if (!z13) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private float x(int i10) {
        double log = Math.log((double) ((((float) Math.abs(i10)) * 0.35f) / (this.f21173a * 0.015f)));
        float f10 = f21167D;
        return (float) (((double) (this.f21173a * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * log));
    }

    private boolean z(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
    }

    /* access modifiers changed from: package-private */
    public boolean J(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i18 = i12 + i10;
        int i19 = !z15 ? 0 : i16;
        int i20 = i13 + i11;
        int i21 = !z16 ? 0 : i17;
        int i22 = -i19;
        int i23 = i19 + i14;
        int i24 = -i21;
        int i25 = i21 + i15;
        if (i18 > i23) {
            i18 = i23;
            z11 = true;
        } else if (i18 < i22) {
            z11 = true;
            i18 = i22;
        } else {
            z11 = false;
        }
        if (i20 > i25) {
            i20 = i25;
            z12 = true;
        } else if (i20 < i24) {
            z12 = true;
            i20 = i24;
        } else {
            z12 = false;
        }
        if (z12 && !y(1)) {
            this.f21176d.springBack(i18, i20, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i18, i20, z11, z12);
        return z11 || z12;
    }

    public boolean K(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f21175c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f21175c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f21175c.top = getScrollY() - height;
            Rect rect2 = this.f21175c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f21175c;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return O(i10, i11, i12);
    }

    public final void T(int i10, int i11) {
        U(i10, i11, 250, false);
    }

    /* access modifiers changed from: package-private */
    public void V(int i10, int i11, int i12, boolean z10) {
        U(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    /* access modifiers changed from: package-private */
    public void W(int i10, int i11, boolean z10) {
        V(i10, i11, 250, z10);
    }

    public boolean X(int i10, int i11) {
        return this.f21197y.p(i10, i11);
    }

    public void Z(int i10) {
        this.f21197y.r(i10);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean c(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !G(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f21175c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f21175c);
            P(g(this.f21175c), 0, 1, true);
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && E(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f21176d.isFinished()) {
            this.f21176d.computeScrollOffset();
            int currY = this.f21176d.getCurrY();
            int h10 = h(currY - this.f21194v);
            this.f21194v = currY;
            int[] iArr = this.f21192t;
            iArr[1] = 0;
            l(0, h10, iArr, (int[]) null, 1);
            int i10 = h10 - this.f21192t[1];
            int scrollRange = getScrollRange();
            if (D2.a.b()) {
                c.a(this, Math.abs(this.f21176d.getCurrVelocity()));
            }
            if (i10 != 0) {
                int scrollY = getScrollY();
                J(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i11 = i10 - scrollY2;
                int[] iArr2 = this.f21192t;
                iArr2[1] = 0;
                p(0, scrollY2, 0, i11, this.f21191s, 1, iArr2);
                i10 = i11 - this.f21192t[1];
            }
            if (i10 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (this.f21177e.isFinished()) {
                            this.f21177e.onAbsorb((int) this.f21176d.getCurrVelocity());
                        }
                    } else if (this.f21178f.isFinished()) {
                        this.f21178f.onAbsorb((int) this.f21176d.getCurrVelocity());
                    }
                }
                a();
            }
            if (!this.f21176d.isFinished()) {
                postInvalidateOnAnimation();
            } else {
                Z(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f21197y.a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f21197y.b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return l(i10, i11, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f21197y.f(i10, i11, i12, i13, iArr);
    }

    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f21177e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i10 = getPaddingLeft();
            } else {
                i10 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i10, (float) min);
            this.f21177e.setSize(width, height);
            if (this.f21177e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (!this.f21178f.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i11 = getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i11 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f21178f.setSize(width2, height2);
            if (this.f21178f.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: protected */
    public int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        } else if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f21196x.a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: package-private */
    public float getVerticalScrollFactorCompat() {
        if (this.f21198z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f21198z = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f21198z;
    }

    /* access modifiers changed from: package-private */
    public int h(int i10) {
        int height = getHeight();
        if (i10 > 0 && d.b(this.f21177e) != 0.0f) {
            int round = Math.round((((float) (-height)) / 4.0f) * d.d(this.f21177e, (((float) (-i10)) * 4.0f) / ((float) height), 0.5f));
            if (round != i10) {
                this.f21177e.finish();
            }
            return i10 - round;
        } else if (i10 >= 0 || d.b(this.f21178f) == 0.0f) {
            return i10;
        } else {
            float f10 = (float) height;
            int round2 = Math.round((f10 / 4.0f) * d.d(this.f21178f, (((float) i10) * 4.0f) / f10, 0.5f));
            if (round2 != i10) {
                this.f21178f.finish();
            }
            return i10 - round2;
        }
    }

    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    public void i(View view, View view2, int i10, int i11) {
        this.f21196x.c(view, view2, i10, i11);
        X(2, i11);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f21197y.l();
    }

    public void j(View view, int i10) {
        this.f21196x.e(view, i10);
        Z(i10);
    }

    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        l(i10, i11, iArr, (int[]) null, i12);
    }

    public boolean l(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f21197y.d(i10, i11, iArr, iArr2, i12);
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        H(i13, i14, iArr);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        H(i13, i14, (int[]) null);
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21181i = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        int i11;
        if (motionEvent.getAction() == 8 && !this.f21183k) {
            if (C.a(motionEvent, 2)) {
                i11 = 9;
                f10 = motionEvent.getAxisValue(9);
                i10 = (int) motionEvent.getX();
            } else if (C.a(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i10 = getWidth() / 2;
                i11 = 26;
                f10 = axisValue;
            } else {
                i11 = 0;
                i10 = 0;
                f10 = 0.0f;
            }
            if (f10 != 0.0f) {
                P(-((int) (f10 * getVerticalScrollFactorCompat())), i10, 1, C.a(motionEvent, 8194));
                if (i11 != 0) {
                    this.f21172C.g(motionEvent, i11);
                }
                return true;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f21183k) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.f21190r;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f21179g) > this.f21187o && (2 & getNestedScrollAxes()) == 0) {
                                this.f21183k = true;
                                this.f21179g = y10;
                                C();
                                this.f21184l.addMovement(motionEvent);
                                this.f21193u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        I(motionEvent);
                    }
                }
            }
            this.f21183k = false;
            this.f21190r = -1;
            L();
            if (this.f21176d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            Z(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (!z((int) motionEvent.getX(), y11)) {
                if (!Y(motionEvent) && this.f21176d.isFinished()) {
                    z10 = false;
                }
                this.f21183k = z10;
                L();
            } else {
                this.f21179g = y11;
                this.f21190r = motionEvent.getPointerId(0);
                A();
                this.f21184l.addMovement(motionEvent);
                this.f21176d.computeScrollOffset();
                if (!Y(motionEvent) && this.f21176d.isFinished()) {
                    z10 = false;
                }
                this.f21183k = z10;
                X(2, 0);
            }
        }
        return this.f21183k;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f21180h = false;
        View view = this.f21182j;
        if (view != null && F(view, this)) {
            Q(this.f21182j);
        }
        this.f21182j = null;
        if (!this.f21181i) {
            if (this.f21195w != null) {
                scrollTo(getScrollX(), this.f21195w.f21200a);
                this.f21195w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int f10 = f(scrollY, paddingTop, i14);
            if (f10 != scrollY) {
                scrollTo(getScrollX(), f10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f21181i = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f21185m && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, CatalogRepository.FETCH_FLAG_SDB));
            }
        }
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        v((int) f11);
        return true;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        H(i13, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, (View) null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (findNextFocus != null && !E(findNextFocus)) {
            return findNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.f21195w = fVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f21200a = getScrollY();
        return fVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        e eVar = this.f21170A;
        if (eVar != null) {
            eVar.a(this, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && G(findFocus, 0, i13)) {
            findFocus.getDrawingRect(this.f21175c);
            offsetDescendantRectToMyCoords(findFocus, this.f21175c);
            q(g(this.f21175c));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f21193u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.f21193u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f21184l;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f21189q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f21190r);
                if (Math.abs(yVelocity) >= this.f21188p) {
                    if (!r(yVelocity)) {
                        int i10 = -yVelocity;
                        float f10 = (float) i10;
                        if (!dispatchNestedPreFling(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            v(i10);
                        }
                    }
                } else if (this.f21176d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f21190r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f21190r + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(findPointerIndex);
                    int i11 = this.f21179g - y10;
                    int M10 = i11 - M(i11, motionEvent.getX(findPointerIndex));
                    if (!this.f21183k && Math.abs(M10) > this.f21187o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f21183k = true;
                        M10 = M10 > 0 ? M10 - this.f21187o : M10 + this.f21187o;
                    }
                    if (this.f21183k) {
                        int P10 = P(M10, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f21179g = y10 - P10;
                        this.f21193u += P10;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f21183k && getChildCount() > 0 && this.f21176d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f21179g = (int) motionEvent.getY(actionIndex);
                this.f21190r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.f21179g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f21190r));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f21183k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f21176d.isFinished()) {
                a();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f21184l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void p(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f21197y.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f21180h) {
            Q(view2);
        } else {
            this.f21182j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return R(rect, z10);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void requestLayout() {
        this.f21180h = true;
        super.requestLayout();
    }

    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int f10 = f(i10, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int f11 = f(i11, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (f10 != getScrollX() || f11 != getScrollY()) {
                super.scrollTo(f10, f11);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f21185m) {
            this.f21185m = z10;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z10) {
        this.f21197y.m(z10);
    }

    public void setOnScrollChangeListener(e eVar) {
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f21186n = z10;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i10) {
        return X(i10, 0);
    }

    public void stopNestedScroll() {
        Z(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.f21175c.setEmpty();
        int i10 = 130;
        if (!e()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? w(33) : c(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? w(130) : c(130);
            }
            if (keyCode == 62) {
                if (keyEvent.isShiftPressed()) {
                    i10 = 33;
                }
                K(i10);
                return false;
            } else if (keyCode == 92) {
                return w(33);
            } else {
                if (keyCode == 93) {
                    return w(130);
                }
                if (keyCode == 122) {
                    K(33);
                    return false;
                } else if (keyCode != 123) {
                    return false;
                } else {
                    K(130);
                    return false;
                }
            }
        }
    }

    public void v(int i10) {
        if (getChildCount() > 0) {
            this.f21176d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            N(true);
            if (D2.a.b()) {
                c.a(this, Math.abs(this.f21176d.getCurrVelocity()));
            }
        }
    }

    public boolean w(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f21175c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f21175c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f21175c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f21175c;
        return O(i10, rect3.top, rect3.bottom);
    }

    public boolean y(int i10) {
        return this.f21197y.k(i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21175c = new Rect();
        this.f21180h = true;
        this.f21181i = false;
        this.f21182j = null;
        this.f21183k = false;
        this.f21186n = true;
        this.f21190r = -1;
        this.f21191s = new int[2];
        this.f21192t = new int[2];
        d dVar = new d();
        this.f21171B = dVar;
        this.f21172C = new C4625o(getContext(), dVar);
        this.f21177e = d.a(context, attributeSet);
        this.f21178f = d.a(context, attributeSet);
        this.f21173a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f21169F, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f21196x = new H(this);
        this.f21197y = new E(this);
        setNestedScrollingEnabled(true);
        C4600b0.p0(this, f21168E);
    }

    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
