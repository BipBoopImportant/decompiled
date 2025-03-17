package androidx.viewpager.widget;

import I2.C4600b0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import u2.C6012a;

public class ViewPager extends ViewGroup {

    /* renamed from: A0  reason: collision with root package name */
    private static final Comparator<d> f44891A0 = new a();

    /* renamed from: B0  reason: collision with root package name */
    private static final Interpolator f44892B0 = new b();

    /* renamed from: C0  reason: collision with root package name */
    private static final i f44893C0 = new i();

    /* renamed from: z0  reason: collision with root package name */
    static final int[] f44894z0 = {16842931};

    /* renamed from: A  reason: collision with root package name */
    private int f44895A;

    /* renamed from: B  reason: collision with root package name */
    private float f44896B;

    /* renamed from: C  reason: collision with root package name */
    private float f44897C;

    /* renamed from: D  reason: collision with root package name */
    private float f44898D;

    /* renamed from: E  reason: collision with root package name */
    private float f44899E;

    /* renamed from: F  reason: collision with root package name */
    private int f44900F;

    /* renamed from: G  reason: collision with root package name */
    private VelocityTracker f44901G;

    /* renamed from: H  reason: collision with root package name */
    private int f44902H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f44903I;

    /* renamed from: J  reason: collision with root package name */
    private EdgeEffect f44904J;

    /* renamed from: K  reason: collision with root package name */
    private EdgeEffect f44905K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f44906L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f44907M;

    /* renamed from: N  reason: collision with root package name */
    private int f44908N;

    /* renamed from: O  reason: collision with root package name */
    private List<g> f44909O;

    /* renamed from: P  reason: collision with root package name */
    private g f44910P;

    /* renamed from: Q  reason: collision with root package name */
    private g f44911Q;

    /* renamed from: R  reason: collision with root package name */
    private List<f> f44912R;

    /* renamed from: S  reason: collision with root package name */
    private int f44913S;

    /* renamed from: T  reason: collision with root package name */
    private ArrayList<View> f44914T;

    /* renamed from: U  reason: collision with root package name */
    private final Runnable f44915U;

    /* renamed from: a  reason: collision with root package name */
    private int f44916a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<d> f44917b;

    /* renamed from: c  reason: collision with root package name */
    private final d f44918c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f44919d;

    /* renamed from: e  reason: collision with root package name */
    int f44920e;

    /* renamed from: f  reason: collision with root package name */
    private int f44921f;

    /* renamed from: g  reason: collision with root package name */
    private Parcelable f44922g;

    /* renamed from: h  reason: collision with root package name */
    private ClassLoader f44923h;

    /* renamed from: i  reason: collision with root package name */
    private Scroller f44924i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f44925j;

    /* renamed from: k  reason: collision with root package name */
    private int f44926k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f44927l;

    /* renamed from: m  reason: collision with root package name */
    private int f44928m;

    /* renamed from: n  reason: collision with root package name */
    private int f44929n;

    /* renamed from: o  reason: collision with root package name */
    private float f44930o;

    /* renamed from: p  reason: collision with root package name */
    private float f44931p;

    /* renamed from: q  reason: collision with root package name */
    private int f44932q;

    /* renamed from: r  reason: collision with root package name */
    private int f44933r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f44934s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f44935t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f44936u;

    /* renamed from: v  reason: collision with root package name */
    private int f44937v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f44938w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f44939x;

    /* renamed from: y  reason: collision with root package name */
    private int f44940y;

    /* renamed from: y0  reason: collision with root package name */
    private int f44941y0;

    /* renamed from: z  reason: collision with root package name */
    private int f44942z;

    static class a implements Comparator<d> {
        a() {
        }

        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return dVar.f44944b - dVar2.f44944b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        Object f44943a;

        /* renamed from: b  reason: collision with root package name */
        int f44944b;

        /* renamed from: c  reason: collision with root package name */
        boolean f44945c;

        /* renamed from: d  reason: collision with root package name */
        float f44946d;

        /* renamed from: e  reason: collision with root package name */
        float f44947e;

        d() {
        }
    }

    public interface f {
        void a(ViewPager viewPager, a aVar, a aVar2);
    }

    public interface g {
        void a(int i10, float f10, int i11);

        void b(int i10);

        void c(int i10);
    }

    public static class h extends O2.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f44954c;

        /* renamed from: d  reason: collision with root package name */
        Parcelable f44955d;

        /* renamed from: e  reason: collision with root package name */
        ClassLoader f44956e;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f44954c + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f44954c);
            parcel.writeParcelable(this.f44955d, i10);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f44954c = parcel.readInt();
            this.f44955d = parcel.readParcelable(classLoader);
            this.f44956e = classLoader;
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            e eVar = (e) view.getLayoutParams();
            e eVar2 = (e) view2.getLayoutParams();
            boolean z10 = eVar.f44948a;
            return z10 != eVar2.f44948a ? z10 ? 1 : -1 : eVar.f44952e - eVar2.f44952e;
        }
    }

    private void C(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private boolean D() {
        this.f44900F = -1;
        j();
        this.f44904J.onRelease();
        this.f44905K.onRelease();
        return this.f44904J.isFinished() || this.f44905K.isFinished();
    }

    private void E(int i10, boolean z10, int i11, boolean z11) {
        d o10 = o(i10);
        int clientWidth = o10 != null ? (int) (((float) getClientWidth()) * Math.max(this.f44930o, Math.min(o10.f44947e, this.f44931p))) : 0;
        if (z10) {
            I(clientWidth, 0, i11);
            if (z11) {
                g(i10);
                return;
            }
            return;
        }
        if (z11) {
            g(i10);
        }
        e(false);
        scrollTo(clientWidth, 0);
        v(clientWidth);
    }

    private void J() {
        if (this.f44913S != 0) {
            ArrayList<View> arrayList = this.f44914T;
            if (arrayList == null) {
                this.f44914T = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f44914T.add(getChildAt(i10));
            }
            Collections.sort(this.f44914T, f44893C0);
        }
    }

    private void e(boolean z10) {
        boolean z11 = this.f44941y0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f44924i.isFinished()) {
                this.f44924i.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f44924i.getCurrX();
                int currY = this.f44924i.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        v(currX);
                    }
                }
            }
        }
        this.f44936u = false;
        for (int i10 = 0; i10 < this.f44917b.size(); i10++) {
            d dVar = this.f44917b.get(i10);
            if (dVar.f44945c) {
                dVar.f44945c = false;
                z11 = true;
            }
        }
        if (!z11) {
            return;
        }
        if (z10) {
            C4600b0.g0(this, this.f44915U);
        } else {
            this.f44915U.run();
        }
    }

    private void f(int i10, float f10, int i11) {
        g gVar = this.f44910P;
        if (gVar != null) {
            gVar.a(i10, f10, i11);
        }
        List<g> list = this.f44909O;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar2 = this.f44909O.get(i12);
                if (gVar2 != null) {
                    gVar2.a(i10, f10, i11);
                }
            }
        }
        g gVar3 = this.f44911Q;
        if (gVar3 != null) {
            gVar3.a(i10, f10, i11);
        }
    }

    private void g(int i10) {
        g gVar = this.f44910P;
        if (gVar != null) {
            gVar.c(i10);
        }
        List<g> list = this.f44909O;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar2 = this.f44909O.get(i11);
                if (gVar2 != null) {
                    gVar2.c(i10);
                }
            }
        }
        g gVar3 = this.f44911Q;
        if (gVar3 != null) {
            gVar3.c(i10);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h(int i10) {
        g gVar = this.f44910P;
        if (gVar != null) {
            gVar.b(i10);
        }
        List<g> list = this.f44909O;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar2 = this.f44909O.get(i11);
                if (gVar2 != null) {
                    gVar2.b(i10);
                }
            }
        }
        g gVar3 = this.f44911Q;
        if (gVar3 != null) {
            gVar3.b(i10);
        }
    }

    private void j() {
        this.f44938w = false;
        this.f44939x = false;
        VelocityTracker velocityTracker = this.f44901G;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f44901G = null;
        }
    }

    private Rect l(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private d n() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f11 = clientWidth > 0 ? ((float) this.f44926k) / ((float) clientWidth) : 0.0f;
        int i11 = 0;
        d dVar = null;
        boolean z10 = true;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.f44917b.size()) {
            d dVar2 = this.f44917b.get(i11);
            if (z10 || dVar2.f44944b == (i10 = i12 + 1)) {
                f10 = dVar2.f44947e;
                float f13 = dVar2.f44946d + f10 + f11;
                if (!z10 && scrollX < f10) {
                    return dVar;
                }
                if (scrollX < f13 || i11 == this.f44917b.size() - 1) {
                    return dVar2;
                }
                i12 = dVar2.f44944b;
                f12 = dVar2.f44946d;
                i11++;
                z10 = false;
                dVar = dVar2;
            } else {
                d dVar3 = this.f44918c;
                dVar3.f44947e = f10 + f12 + f11;
                dVar3.f44944b = i10;
                throw null;
            }
        }
        return dVar;
    }

    private static boolean p(View view) {
        return view.getClass().getAnnotation(c.class) != null;
    }

    private boolean q(float f10, float f11) {
        return (f10 < ((float) this.f44942z) && f11 > 0.0f) || (f10 > ((float) (getWidth() - this.f44942z)) && f11 < 0.0f);
    }

    private void s(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f44900F) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f44896B = motionEvent.getX(i10);
            this.f44900F = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f44901G;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f44935t != z10) {
            this.f44935t = z10;
        }
    }

    private boolean v(int i10) {
        if (this.f44917b.size() != 0) {
            d n10 = n();
            int clientWidth = getClientWidth();
            int i11 = this.f44926k;
            int i12 = clientWidth + i11;
            float f10 = (float) clientWidth;
            int i13 = n10.f44944b;
            float f11 = ((((float) i10) / f10) - n10.f44947e) / (n10.f44946d + (((float) i11) / f10));
            this.f44907M = false;
            r(i13, f11, (int) (((float) i12) * f11));
            if (this.f44907M) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f44906L) {
            return false;
        } else {
            this.f44907M = false;
            r(0, 0.0f, 0);
            if (this.f44907M) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private boolean w(float f10) {
        this.f44896B = f10;
        getScrollX();
        getClientWidth();
        ArrayList<d> arrayList = this.f44917b;
        int i10 = this.f44917b.get(0).f44944b;
        int i11 = arrayList.get(arrayList.size() - 1).f44944b;
        throw null;
    }

    private void z(int i10, int i11, int i12, int i13) {
        if (i11 <= 0 || this.f44917b.isEmpty()) {
            d o10 = o(this.f44920e);
            int min = (int) ((o10 != null ? Math.min(o10.f44947e, this.f44931p) : 0.0f) * ((float) ((i10 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                e(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.f44924i.isFinished()) {
            this.f44924i.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i11 - getPaddingLeft()) - getPaddingRight()) + i13))) * ((float) (((i10 - getPaddingLeft()) - getPaddingRight()) + i12))), getScrollY());
        }
    }

    public void A(f fVar) {
        List<f> list = this.f44912R;
        if (list != null) {
            list.remove(fVar);
        }
    }

    public void B(g gVar) {
        List<g> list = this.f44909O;
        if (list != null) {
            list.remove(gVar);
        }
    }

    public void F(int i10, boolean z10) {
        this.f44936u = false;
        G(i10, z10, false);
    }

    /* access modifiers changed from: package-private */
    public void G(int i10, boolean z10, boolean z11) {
        H(i10, z10, z11, 0);
    }

    /* access modifiers changed from: package-private */
    public void H(int i10, boolean z10, boolean z11, int i11) {
        setScrollingCacheEnabled(false);
    }

    /* access modifiers changed from: package-private */
    public void I(int i10, int i11, int i12) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f44924i;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f44925j ? this.f44924i.getCurrX() : this.f44924i.getStartX();
            this.f44924i.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            e(false);
            x();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        float f10 = (float) (clientWidth / 2);
        float i16 = f10 + (i(Math.min(1.0f, (((float) Math.abs(i14)) * 1.0f) / ((float) clientWidth))) * f10);
        int abs = Math.abs(i12);
        if (abs > 0) {
            int min = Math.min(Math.round(Math.abs(i16 / ((float) abs)) * 1000.0f) * 4, 600);
            this.f44925j = false;
            this.f44924i.startScroll(i13, scrollY, i14, i15, min);
            C4600b0.f0(this);
            return;
        }
        throw null;
    }

    public void a(f fVar) {
        if (this.f44912R == null) {
            this.f44912R = new ArrayList();
        }
        this.f44912R.add(fVar);
    }

    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        d m10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (m10 = m(childAt)) != null && m10.f44944b == this.f44920e) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i11 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        d m10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (m10 = m(childAt)) != null && m10.f44944b == this.f44920e) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        e eVar = (e) layoutParams;
        boolean p10 = eVar.f44948a | p(view);
        eVar.f44948a = p10;
        if (!this.f44934s) {
            super.addView(view, i10, layoutParams);
        } else if (!p10) {
            eVar.f44951d = true;
            addViewInLayout(view, i10, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void b(g gVar) {
        if (this.f44909O == null) {
            this.f44909O = new ArrayList();
        }
        this.f44909O.add(gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x0063
        L_0x0009:
            if (r0 == 0) goto L_0x0063
            android.view.ViewParent r2 = r0.getParent()
        L_0x000f:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x001b
            if (r2 != r4) goto L_0x0016
            goto L_0x0063
        L_0x0016:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x000f
        L_0x001b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L_0x002f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0048
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x002f
        L_0x0048:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L_0x0007
        L_0x0063:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto L_0x00b3
            if (r1 == r0) goto L_0x00b3
            if (r5 != r3) goto L_0x0093
            android.graphics.Rect r2 = r4.f44919d
            android.graphics.Rect r2 = r4.l(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f44919d
            android.graphics.Rect r3 = r4.l(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L_0x008e
            if (r2 < r3) goto L_0x008e
            boolean r0 = r4.t()
            goto L_0x00ca
        L_0x008e:
            boolean r0 = r1.requestFocus()
            goto L_0x00ca
        L_0x0093:
            if (r5 != r2) goto L_0x00bf
            android.graphics.Rect r2 = r4.f44919d
            android.graphics.Rect r2 = r4.l(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f44919d
            android.graphics.Rect r3 = r4.l(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L_0x00ae
            if (r2 > r3) goto L_0x00ae
            boolean r0 = r4.u()
            goto L_0x00ca
        L_0x00ae:
            boolean r0 = r1.requestFocus()
            goto L_0x00ca
        L_0x00b3:
            if (r5 == r3) goto L_0x00c6
            r0 = 1
            if (r5 != r0) goto L_0x00b9
            goto L_0x00c6
        L_0x00b9:
            if (r5 == r2) goto L_0x00c1
            r0 = 2
            if (r5 != r0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            r0 = 0
            goto L_0x00ca
        L_0x00c1:
            boolean r0 = r4.u()
            goto L_0x00ca
        L_0x00c6:
            boolean r0 = r4.t()
        L_0x00ca:
            if (r0 == 0) goto L_0x00d3
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        L_0x00d3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    public boolean canScrollHorizontally(int i10) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f44925j = true;
        if (this.f44924i.isFinished() || !this.f44924i.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f44924i.getCurrX();
        int currY = this.f44924i.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!v(currX)) {
                this.f44924i.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C4600b0.f0(this);
    }

    /* access modifiers changed from: protected */
    public boolean d(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom()) {
                    if (d(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || k(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        d m10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (m10 = m(childAt)) != null && m10.f44944b == this.f44920e && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z10 = false;
        if (getOverScrollMode() != 0) {
            this.f44904J.finish();
            this.f44905K.finish();
        } else {
            if (!this.f44904J.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f44930o * ((float) width));
                this.f44904J.setSize(height, width);
                z10 = this.f44904J.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f44905K.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f44931p + 1.0f)) * ((float) width2));
                this.f44905K.setSize(height2, width2);
                z10 |= this.f44905K.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            C4600b0.f0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f44927l;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return null;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.f44913S == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((e) this.f44914T.get(i11).getLayoutParams()).f44953f;
    }

    public int getCurrentItem() {
        return this.f44920e;
    }

    public int getOffscreenPageLimit() {
        return this.f44937v;
    }

    public int getPageMargin() {
        return this.f44926k;
    }

    /* access modifiers changed from: package-private */
    public float i(float f10) {
        return (float) Math.sin((double) ((f10 - 0.5f) * 0.47123894f));
    }

    public boolean k(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? t() : c(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? u() : c(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return c(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return c(1);
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public d m(View view) {
        if (this.f44917b.size() <= 0) {
            return null;
        }
        Object obj = this.f44917b.get(0).f44943a;
        throw null;
    }

    /* access modifiers changed from: package-private */
    public d o(int i10) {
        for (int i11 = 0; i11 < this.f44917b.size(); i11++) {
            d dVar = this.f44917b.get(i11);
            if (dVar.f44944b == i10) {
                return dVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44906L = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f44915U);
        Scroller scroller = this.f44924i;
        if (scroller != null && !scroller.isFinished()) {
            this.f44924i.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f44926k > 0 && this.f44927l != null) {
            this.f44917b.size();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            D();
            return false;
        }
        if (action != 0) {
            if (this.f44938w) {
                return true;
            }
            if (this.f44939x) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.f44898D = x10;
            this.f44896B = x10;
            float y10 = motionEvent.getY();
            this.f44899E = y10;
            this.f44897C = y10;
            this.f44900F = motionEvent2.getPointerId(0);
            this.f44939x = false;
            this.f44925j = true;
            this.f44924i.computeScrollOffset();
            if (this.f44941y0 != 2 || Math.abs(this.f44924i.getFinalX() - this.f44924i.getCurrX()) <= this.f44902H) {
                e(false);
                this.f44938w = false;
            } else {
                this.f44924i.abortAnimation();
                this.f44936u = false;
                x();
                this.f44938w = true;
                C(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.f44900F;
            if (i10 != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i10);
                float x11 = motionEvent2.getX(findPointerIndex);
                float f10 = x11 - this.f44896B;
                float abs = Math.abs(f10);
                float y11 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y11 - this.f44899E);
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i11 != 0 && !q(this.f44896B, f10)) {
                    if (d(this, false, (int) f10, (int) x11, (int) y11)) {
                        this.f44896B = x11;
                        this.f44897C = y11;
                        this.f44939x = true;
                        return false;
                    }
                }
                int i12 = this.f44895A;
                if (abs > ((float) i12) && abs * 0.5f > abs2) {
                    this.f44938w = true;
                    C(true);
                    setScrollState(1);
                    float f11 = this.f44898D;
                    float f12 = (float) this.f44895A;
                    this.f44896B = i11 > 0 ? f11 + f12 : f11 - f12;
                    this.f44897C = y11;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i12)) {
                    this.f44939x = true;
                }
                if (this.f44938w && w(x11)) {
                    C4600b0.f0(this);
                }
            }
        } else if (action == 6) {
            s(motionEvent);
        }
        if (this.f44901G == null) {
            this.f44901G = VelocityTracker.obtain();
        }
        this.f44901G.addMovement(motionEvent2);
        return this.f44938w;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b8
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b4
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$e r12 = (androidx.viewpager.widget.ViewPager.e) r12
            boolean r14 = r12.f44948a
            if (r14 == 0) goto L_0x00b4
            int r12 = r12.f44949b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x0061
            r15 = 3
            if (r14 == r15) goto L_0x005b
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006e
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
        L_0x0055:
            r17 = r14
            r14 = r4
            r4 = r17
            goto L_0x006e
        L_0x005b:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006e
        L_0x0061:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
            goto L_0x0055
        L_0x006e:
            r15 = 16
            if (r12 == r15) goto L_0x0094
            r15 = 48
            if (r12 == r15) goto L_0x008e
            r15 = 80
            if (r12 == r15) goto L_0x007c
            r12 = r5
            goto L_0x00a1
        L_0x007c:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
        L_0x0088:
            r17 = r12
            r12 = r5
            r5 = r17
            goto L_0x00a1
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x00a1
        L_0x0094:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
            goto L_0x0088
        L_0x00a1:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b4:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b8:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00bb:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$e r9 = (androidx.viewpager.widget.ViewPager.e) r9
            boolean r10 = r9.f44948a
            if (r10 != 0) goto L_0x0105
            androidx.viewpager.widget.ViewPager$d r10 = r0.m(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f44947e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f44951d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f44951d = r14
            float r9 = r9.f44950c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00bb
        L_0x0108:
            r0.f44928m = r5
            int r3 = r3 - r7
            r0.f44929n = r3
            r0.f44908N = r11
            boolean r1 = r0.f44906L
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f44920e
            r2 = 0
            r0.E(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.f44906L = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        e eVar;
        e eVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f44942z = Math.min(measuredWidth / 10, this.f44940y);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = CatalogRepository.FETCH_FLAG_SDB;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (!(childAt.getVisibility() == 8 || (eVar2 = (e) childAt.getLayoutParams()) == null || !eVar2.f44948a)) {
                int i15 = eVar2.f44949b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (!(i16 == 3 || i16 == 5)) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = eVar2.width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = eVar2.height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f44932q = View.MeasureSpec.makeMeasureSpec(paddingLeft, CatalogRepository.FETCH_FLAG_SDB);
        this.f44933r = View.MeasureSpec.makeMeasureSpec(measuredHeight, CatalogRepository.FETCH_FLAG_SDB);
        this.f44934s = true;
        x();
        this.f44934s = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((eVar = (e) childAt2.getLayoutParams()) == null || !eVar.f44948a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * eVar.f44950c), CatalogRepository.FETCH_FLAG_SDB), this.f44933r);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        d m10;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i13 = 0;
            i11 = 1;
        } else {
            i13 = childCount - 1;
            i12 = -1;
            i11 = -1;
        }
        while (i13 != i12) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 0 && (m10 = m(childAt)) != null && m10.f44944b == this.f44920e && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i13 += i11;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        this.f44921f = hVar.f44954c;
        this.f44922g = hVar.f44955d;
        this.f44923h = hVar.f44956e;
    }

    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f44954c = this.f44920e;
        return hVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f44926k;
            z(i10, i12, i14, i14);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f44903I) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.f44908N
            r1 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L_0x001a:
            if (r6 >= r5) goto L_0x006b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$e r8 = (androidx.viewpager.widget.ViewPager.e) r8
            boolean r9 = r8.f44948a
            if (r9 != 0) goto L_0x002b
            goto L_0x0068
        L_0x002b:
            int r8 = r8.f44949b
            r8 = r8 & 7
            if (r8 == r1) goto L_0x004f
            r9 = 3
            if (r8 == r9) goto L_0x0049
            r9 = 5
            if (r8 == r9) goto L_0x0039
            r8 = r2
            goto L_0x005c
        L_0x0039:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L_0x0045:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L_0x005c
        L_0x0049:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L_0x005c
        L_0x004f:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L_0x0045
        L_0x005c:
            int r2 = r2 + r0
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L_0x0067
            r7.offsetLeftAndRight(r2)
        L_0x0067:
            r2 = r8
        L_0x0068:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x006b:
            r11.f(r12, r13, r14)
            r11.f44907M = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.r(int, float, int):void");
    }

    public void removeView(View view) {
        if (this.f44934s) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(a aVar) {
        this.f44916a = 0;
        List<f> list = this.f44912R;
        if (list != null && !list.isEmpty()) {
            int size = this.f44912R.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f44912R.get(i10).a(this, (a) null, aVar);
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.f44936u = false;
        G(i10, !this.f44906L, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to " + 1);
            i10 = 1;
        }
        if (i10 != this.f44937v) {
            this.f44937v = i10;
            x();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(g gVar) {
        this.f44910P = gVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f44926k;
        this.f44926k = i10;
        int width = getWidth();
        z(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f44927l = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i10) {
        if (this.f44941y0 != i10) {
            this.f44941y0 = i10;
            h(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        int i10 = this.f44920e;
        if (i10 <= 0) {
            return false;
        }
        F(i10 - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f44927l;
    }

    /* access modifiers changed from: package-private */
    public void x() {
        y(this.f44920e);
    }

    /* access modifiers changed from: package-private */
    public void y(int i10) {
        int i11 = this.f44920e;
        if (i11 != i10) {
            o(i11);
            this.f44920e = i10;
        }
        J();
    }

    public static class e extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f44948a;

        /* renamed from: b  reason: collision with root package name */
        public int f44949b;

        /* renamed from: c  reason: collision with root package name */
        float f44950c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        boolean f44951d;

        /* renamed from: e  reason: collision with root package name */
        int f44952e;

        /* renamed from: f  reason: collision with root package name */
        int f44953f;

        public e() {
            super(-1, -1);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f44894z0);
            this.f44949b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(C6012a.e(getContext(), i10));
    }
}
