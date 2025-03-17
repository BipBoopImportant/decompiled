package androidx.coordinatorlayout.widget;

import I2.C0;
import I2.C4600b0;
import I2.C4632s;
import I2.F;
import I2.G;
import I2.H;
import I2.I;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.sugarcube.decorate_engine.SceneLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s2.C5929a;
import s2.C5930b;
import u2.C6012a;
import y2.C6260a;

public class CoordinatorLayout extends ViewGroup implements F, G {

    /* renamed from: u  reason: collision with root package name */
    static final String f20891u;

    /* renamed from: v  reason: collision with root package name */
    static final Class<?>[] f20892v = {Context.class, AttributeSet.class};

    /* renamed from: w  reason: collision with root package name */
    static final ThreadLocal<Map<String, Constructor<c>>> f20893w = new ThreadLocal<>();

    /* renamed from: x  reason: collision with root package name */
    static final Comparator<View> f20894x = new i();

    /* renamed from: y  reason: collision with root package name */
    private static final H2.f<Rect> f20895y = new H2.h(12);

    /* renamed from: a  reason: collision with root package name */
    private final List<View> f20896a;

    /* renamed from: b  reason: collision with root package name */
    private final b<View> f20897b;

    /* renamed from: c  reason: collision with root package name */
    private final List<View> f20898c;

    /* renamed from: d  reason: collision with root package name */
    private final List<View> f20899d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f20900e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f20901f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f20902g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f20903h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f20904i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f20905j;

    /* renamed from: k  reason: collision with root package name */
    private View f20906k;

    /* renamed from: l  reason: collision with root package name */
    private View f20907l;

    /* renamed from: m  reason: collision with root package name */
    private g f20908m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f20909n;

    /* renamed from: o  reason: collision with root package name */
    private C0 f20910o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f20911p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f20912q;

    /* renamed from: r  reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f20913r;

    /* renamed from: s  reason: collision with root package name */
    private I f20914s;

    /* renamed from: t  reason: collision with root package name */
    private final H f20915t;

    class a implements I {
        a() {
        }

        public C0 a(View view, C0 c02) {
            return CoordinatorLayout.this.W(c02);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        }

        public Parcelable C(CoordinatorLayout coordinatorLayout, V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean D(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
            return false;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                return D(coordinatorLayout, v10, view, view2, i10);
            }
            return false;
        }

        @Deprecated
        public void F(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public void G(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
            if (i10 == 0) {
                F(coordinatorLayout, v10, view);
            }
        }

        public boolean H(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v10) {
            return h(coordinatorLayout, v10) > 0.0f;
        }

        public boolean f(CoordinatorLayout coordinatorLayout, V v10, Rect rect) {
            return false;
        }

        public int g(CoordinatorLayout coordinatorLayout, V v10) {
            return -16777216;
        }

        public float h(CoordinatorLayout coordinatorLayout, V v10) {
            return 0.0f;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public C0 j(CoordinatorLayout coordinatorLayout, V v10, C0 c02) {
            return c02;
        }

        public void k(f fVar) {
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public void m(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public void n() {
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        public boolean q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean s(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr) {
        }

        public void u(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                t(coordinatorLayout, v10, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void v(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13) {
        }

        @Deprecated
        public void w(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                v(coordinatorLayout, v10, view, i10, i11, i12, i13);
            }
        }

        public void x(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            w(coordinatorLayout, v10, view, i10, i11, i12, i13, i14);
        }

        @Deprecated
        public void y(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
        }

        public void z(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                y(coordinatorLayout, v10, view, view2, i10);
            }
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f20913r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f20913r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float M10 = C4600b0.M(view);
            float M11 = C4600b0.M(view2);
            if (M10 > M11) {
                return -1;
            }
            return M10 < M11 ? 1 : 0;
        }
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f20891u = packageR != null ? packageR.getName() : null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5929a.f29003a);
    }

    private boolean A(View view) {
        return this.f20897b.j(view);
    }

    private void C(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect a10 = a();
        a10.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f20910o != null && C4600b0.w(this) && !C4600b0.w(view)) {
            a10.left += this.f20910o.k();
            a10.top += this.f20910o.m();
            a10.right -= this.f20910o.l();
            a10.bottom -= this.f20910o.j();
        }
        Rect a11 = a();
        C4632s.a(S(fVar.f20920c), view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i10);
        view.layout(a11.left, a11.top, a11.right, a11.bottom);
        O(a10);
        O(a11);
    }

    private void D(View view, View view2, int i10) {
        Rect a10 = a();
        Rect a11 = a();
        try {
            t(view2, a10);
            u(view, i10, a10, a11);
            view.layout(a11.left, a11.top, a11.right, a11.bottom);
        } finally {
            O(a10);
            O(a11);
        }
    }

    private void E(View view, int i10, int i11) {
        f fVar = (f) view.getLayoutParams();
        int b10 = C4632s.b(T(fVar.f20920c), i11);
        int i12 = b10 & 7;
        int i13 = b10 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int w10 = w(i10) - measuredWidth;
        if (i12 == 1) {
            w10 += measuredWidth / 2;
        } else if (i12 == 5) {
            w10 += measuredWidth;
        }
        int i14 = i13 != 16 ? i13 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(w10, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void F(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (C4600b0.S(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            Rect a10 = a();
            Rect a11 = a();
            a11.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f10 == null || !f10.f(this, view, a10)) {
                a10.set(a11);
            } else if (!a11.contains(a10)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a10.toShortString() + " | Bounds:" + a11.toShortString());
            }
            O(a11);
            if (a10.isEmpty()) {
                O(a10);
                return;
            }
            int b10 = C4632s.b(fVar.f20925h, i10);
            boolean z12 = true;
            if ((b10 & 48) != 48 || (i15 = (a10.top - fVar.topMargin) - fVar.f20927j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                V(view, i16 - i15);
                z10 = true;
            }
            if ((b10 & 80) == 80 && (height = ((getHeight() - a10.bottom) - fVar.bottomMargin) + fVar.f20927j) < (i14 = rect.bottom)) {
                V(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                V(view, 0);
            }
            if ((b10 & 3) != 3 || (i12 = (a10.left - fVar.leftMargin) - fVar.f20926i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                U(view, i13 - i12);
                z11 = true;
            }
            if ((b10 & 5) != 5 || (width = ((getWidth() - a10.right) - fVar.rightMargin) + fVar.f20926i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                U(view, width - i11);
            }
            if (!z12) {
                U(view, 0);
            }
            O(a10);
        }
    }

    static c K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f20891u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f20893w;
            Map map = threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f20892v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean L(MotionEvent motionEvent, int i10) {
        MotionEvent motionEvent2 = motionEvent;
        int i11 = i10;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f20898c;
        z(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z10 = false;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = list.get(i12);
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            if ((!z10 && !z11) || actionMasked == 0) {
                if (!z10 && f10 != null) {
                    if (i11 == 0) {
                        z10 = f10.o(this, view, motionEvent2);
                    } else if (i11 == 1) {
                        z10 = f10.H(this, view, motionEvent2);
                    }
                    if (z10) {
                        this.f20906k = view;
                    }
                }
                boolean c10 = fVar.c();
                boolean i13 = fVar.i(this, view);
                z11 = i13 && !c10;
                if (i13 && !z11) {
                    break;
                }
            } else if (f10 != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i11 == 0) {
                    f10.o(this, view, motionEvent3);
                } else if (i11 == 1) {
                    f10.H(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z10;
    }

    private void M() {
        this.f20896a.clear();
        this.f20897b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f y10 = y(childAt);
            y10.d(this, childAt);
            this.f20897b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (y10.b(this, childAt, childAt2)) {
                        if (!this.f20897b.d(childAt2)) {
                            this.f20897b.b(childAt2);
                        }
                        this.f20897b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f20896a.addAll(this.f20897b.i());
        Collections.reverse(this.f20896a);
    }

    private static void O(Rect rect) {
        rect.setEmpty();
        f20895y.a(rect);
    }

    private void Q(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (f10 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    f10.o(this, childAt, obtain);
                } else {
                    f10.H(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).m();
        }
        this.f20906k = null;
        this.f20903h = false;
    }

    private static int R(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int S(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int T(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void U(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f20926i;
        if (i11 != i10) {
            C4600b0.Y(view, i10 - i11);
            fVar.f20926i = i10;
        }
    }

    private void V(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f20927j;
        if (i11 != i10) {
            C4600b0.Z(view, i10 - i11);
            fVar.f20927j = i10;
        }
    }

    private void X() {
        if (C4600b0.w(this)) {
            if (this.f20914s == null) {
                this.f20914s = new a();
            }
            C4600b0.E0(this, this.f20914s);
            setSystemUiVisibility(SceneLayout.kCurrent3DVersion);
            return;
        }
        C4600b0.E0(this, (I) null);
    }

    private static Rect a() {
        Rect b10 = f20895y.b();
        return b10 == null ? new Rect() : b10;
    }

    private static int c(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    private void d(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - fVar.bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    private C0 e(C0 c02) {
        c f10;
        if (c02.q()) {
            return c02;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (C4600b0.w(childAt) && (f10 = ((f) childAt.getLayoutParams()).f()) != null) {
                c02 = f10.j(this, childAt, c02);
                if (c02.q()) {
                    break;
                }
            }
        }
        return c02;
    }

    private void v(View view, int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int b10 = C4632s.b(R(fVar.f20920c), i10);
        int b11 = C4632s.b(S(fVar.f20921d), i10);
        int i13 = b10 & 7;
        int i14 = b10 & 112;
        int i15 = b11 & 7;
        int i16 = b11 & 112;
        int width = i15 != 1 ? i15 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i16 != 16 ? i16 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i13 == 1) {
            width -= i11 / 2;
        } else if (i13 != 5) {
            width -= i11;
        }
        if (i14 == 16) {
            height -= i12 / 2;
        } else if (i14 != 80) {
            height -= i12;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    private int w(int i10) {
        int[] iArr = this.f20905j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
            return 0;
        }
    }

    private void z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = f20894x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public boolean B(View view, int i10, int i11) {
        Rect a10 = a();
        t(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            O(a10);
        }
    }

    /* access modifiers changed from: package-private */
    public void G(View view, int i10) {
        c f10;
        View view2 = view;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f20928k != null) {
            Rect a10 = a();
            Rect a11 = a();
            Rect a12 = a();
            t(fVar.f20928k, a10);
            boolean z10 = false;
            q(view2, false, a11);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i11 = measuredHeight;
            v(view, i10, a10, a12, fVar, measuredWidth, measuredHeight);
            if (!(a12.left == a11.left && a12.top == a11.top)) {
                z10 = true;
            }
            d(fVar, a12, measuredWidth, i11);
            int i12 = a12.left - a11.left;
            int i13 = a12.top - a11.top;
            if (i12 != 0) {
                C4600b0.Y(view2, i12);
            }
            if (i13 != 0) {
                C4600b0.Z(view2, i13);
            }
            if (z10 && (f10 = fVar.f()) != null) {
                f10.l(this, view2, fVar.f20928k);
            }
            O(a10);
            O(a11);
            O(a12);
        }
    }

    /* access modifiers changed from: package-private */
    public final void H(int i10) {
        boolean z10;
        int i11 = i10;
        int z11 = C4600b0.z(this);
        int size = this.f20896a.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        for (int i12 = 0; i12 < size; i12++) {
            View view = this.f20896a.get(i12);
            f fVar = (f) view.getLayoutParams();
            if (i11 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (fVar.f20929l == this.f20896a.get(i13)) {
                        G(view, z11);
                    }
                }
                q(view, true, a11);
                if (fVar.f20924g != 0 && !a11.isEmpty()) {
                    int b10 = C4632s.b(fVar.f20924g, z11);
                    int i14 = b10 & 112;
                    if (i14 == 48) {
                        a10.top = Math.max(a10.top, a11.bottom);
                    } else if (i14 == 80) {
                        a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                    }
                    int i15 = b10 & 7;
                    if (i15 == 3) {
                        a10.left = Math.max(a10.left, a11.right);
                    } else if (i15 == 5) {
                        a10.right = Math.max(a10.right, getWidth() - a11.left);
                    }
                }
                if (fVar.f20925h != 0 && view.getVisibility() == 0) {
                    F(view, a10, z11);
                }
                if (i11 != 2) {
                    x(view, a12);
                    if (!a12.equals(a11)) {
                        N(view, a11);
                    }
                }
                for (int i16 = i12 + 1; i16 < size; i16++) {
                    View view2 = this.f20896a.get(i16);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f10 = fVar2.f();
                    if (f10 != null && f10.i(this, view2, view)) {
                        if (i11 != 0 || !fVar2.g()) {
                            if (i11 != 2) {
                                z10 = f10.l(this, view2, view);
                            } else {
                                f10.m(this, view2, view);
                                z10 = true;
                            }
                            if (i11 == 1) {
                                fVar2.p(z10);
                            }
                        } else {
                            fVar2.k();
                        }
                    }
                }
            }
        }
        O(a10);
        O(a11);
        O(a12);
    }

    public void I(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.f20928k;
            if (view2 != null) {
                D(view, view2, i10);
                return;
            }
            int i11 = fVar.f20922e;
            if (i11 >= 0) {
                E(view, i11, i10);
            } else {
                C(view, i10);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public void J(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    /* access modifiers changed from: package-private */
    public void N(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    /* access modifiers changed from: package-private */
    public void P() {
        if (this.f20904i && this.f20908m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f20908m);
        }
        this.f20909n = false;
    }

    /* access modifiers changed from: package-private */
    public final C0 W(C0 c02) {
        if (H2.c.a(this.f20910o, c02)) {
            return c02;
        }
        this.f20910o = c02;
        boolean z10 = false;
        boolean z11 = c02 != null && c02.m() > 0;
        this.f20911p = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        C0 e10 = e(c02);
        requestLayout();
        return e10;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f20904i) {
            if (this.f20908m == null) {
                this.f20908m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f20908m);
        }
        this.f20909n = true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f20918a;
        if (cVar != null) {
            float h10 = cVar.h(this, view);
            if (h10 > 0.0f) {
                if (this.f20900e == null) {
                    this.f20900e = new Paint();
                }
                this.f20900e.setColor(fVar.f20918a.g(this, view));
                this.f20900e.setAlpha(c(Math.round(h10 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f20900e);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f20912q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void f(View view) {
        List g10 = this.f20897b.g(view);
        if (g10 != null && !g10.isEmpty()) {
            for (int i10 = 0; i10 < g10.size(); i10++) {
                View view2 = (View) g10.get(i10);
                c f10 = ((f) view2.getLayoutParams()).f();
                if (f10 != null) {
                    f10.l(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (A(getChildAt(i10))) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10 == this.f20909n) {
            return;
        }
        if (z10) {
            b();
        } else {
            P();
        }
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f20896a);
    }

    public final C0 getLastWindowInsets() {
        return this.f20910o;
    }

    public int getNestedScrollAxes() {
        return this.f20915t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f20912q;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    public void i(View view, View view2, int i10, int i11) {
        c f10;
        this.f20915t.c(view, view2, i10, i11);
        this.f20907l = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11) && (f10 = fVar.f()) != null) {
                f10.z(this, childAt, view, view2, i10, i11);
            }
        }
    }

    public void j(View view, int i10) {
        this.f20915t.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i10)) {
                c f10 = fVar.f();
                if (f10 != null) {
                    f10.G(this, childAt, view, i10);
                }
                fVar.l(i10);
                fVar.k();
            }
        }
        this.f20907l = null;
    }

    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        c f10;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                int i16 = i12;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i12) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.f20901f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.u(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f20901f;
                    i13 = i10 > 0 ? Math.max(i13, iArr3[0]) : Math.min(i13, iArr3[0]);
                    int[] iArr4 = this.f20901f;
                    i14 = i11 > 0 ? Math.max(i14, iArr4[1]) : Math.min(i14, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            H(1);
        }
    }

    /* renamed from: l */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c f10;
        boolean z10;
        int min;
        int childCount = getChildCount();
        boolean z11 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i14) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.f20901f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.x(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f20901f;
                    i15 = i12 > 0 ? Math.max(i15, iArr3[0]) : Math.min(i15, iArr3[0]);
                    if (i13 > 0) {
                        z10 = true;
                        min = Math.max(i16, this.f20901f[1]);
                    } else {
                        z10 = true;
                        min = Math.min(i16, this.f20901f[1]);
                    }
                    i16 = min;
                    z11 = z10;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z11) {
            H(1);
        }
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f20902g);
    }

    public boolean o(View view, View view2, int i10, int i11) {
        int i12 = i11;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f10 = fVar.f();
                if (f10 != null) {
                    boolean E10 = f10.E(this, childAt, view, view2, i10, i11);
                    z10 |= E10;
                    fVar.r(i12, E10);
                } else {
                    fVar.r(i12, false);
                }
            }
        }
        return z10;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.f20909n) {
            if (this.f20908m == null) {
                this.f20908m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f20908m);
        }
        if (this.f20910o == null && C4600b0.w(this)) {
            C4600b0.l0(this);
        }
        this.f20904i = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.f20909n && this.f20908m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f20908m);
        }
        View view = this.f20907l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f20904i = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f20911p && this.f20912q != null) {
            C0 c02 = this.f20910o;
            int m10 = c02 != null ? c02.m() : 0;
            if (m10 > 0) {
                this.f20912q.setBounds(0, 0, getWidth(), m10);
                this.f20912q.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean L10 = L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            Q(true);
        }
        return L10;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c f10;
        int z11 = C4600b0.z(this);
        int size = this.f20896a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f20896a.get(i14);
            if (view.getVisibility() != 8 && ((f10 = ((f) view.getLayoutParams()).f()) == null || !f10.p(this, view, z11))) {
                I(view, z11);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011c, code lost:
        if (r0.q(r30, r20, r11, r21, r23, 0) == false) goto L_0x012c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.M()
            r30.g()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = I2.C4600b0.z(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = r2
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            I2.C0 r3 = r7.f20910o
            if (r3 == 0) goto L_0x004b
            boolean r3 = I2.C4600b0.w(r30)
            if (r3 == 0) goto L_0x004b
            r19 = r2
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f20896a
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x0171
            java.util.List<android.view.View> r0 = r7.f20896a
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0169
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r1
            int r0 = r1.f20922e
            if (r0 < 0) goto L_0x00bc
            if (r13 == 0) goto L_0x00bc
            int r0 = r7.w(r0)
            int r11 = r1.f20920c
            int r11 = T(r11)
            int r11 = I2.C4632s.b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r11 = r0
            r21 = r2
            goto L_0x00c1
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00ba
            if (r12 == 0) goto L_0x00ba
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00c1
        L_0x00ba:
            r11 = 0
            goto L_0x00bf
        L_0x00bc:
            r22 = r2
            goto L_0x00ba
        L_0x00bf:
            r21 = r11
        L_0x00c1:
            if (r19 == 0) goto L_0x00f3
            boolean r0 = I2.C4600b0.w(r20)
            if (r0 != 0) goto L_0x00f3
            I2.C0 r0 = r7.f20910o
            int r0 = r0.k()
            I2.C0 r2 = r7.f20910o
            int r2 = r2.l()
            int r0 = r0 + r2
            I2.C0 r2 = r7.f20910o
            int r2 = r2.m()
            I2.C0 r11 = r7.f20910o
            int r11 = r11.j()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f7
        L_0x00f3:
            r11 = r31
            r23 = r32
        L_0x00f7:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f()
            if (r0 == 0) goto L_0x011f
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.q(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0139
            goto L_0x012c
        L_0x011f:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012c:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.J(r1, r2, r3, r4, r5)
        L_0x0139:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0169:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x0171:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c f12;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z11 |= f12.r(this, childAt, view, f10, f11, z10);
                }
            }
        }
        if (z11) {
            H(1);
        }
        return z11;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        c f12;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z10 |= f12.s(this, childAt, view, f10, f11);
                }
            }
        }
        return z10;
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray<Parcelable> sparseArray = hVar.f20937c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = y(childAt).f();
            if (!(id2 == -1 || f10 == null || (parcelable2 = sparseArray.get(id2)) == null)) {
                f10.B(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable C10;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (!(id2 == -1 || f10 == null || (C10 = f10.C(this, childAt)) == null)) {
                sparseArray.append(id2, C10);
            }
        }
        hVar.f20937c = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f20906k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0017
            boolean r3 = r0.L(r1, r4)
            if (r3 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r6 = r5
            goto L_0x002c
        L_0x0017:
            r3 = r5
        L_0x0018:
            android.view.View r6 = r0.f20906k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L_0x0015
            android.view.View r7 = r0.f20906k
            boolean r6 = r6.H(r0, r7, r1)
        L_0x002c:
            android.view.View r7 = r0.f20906k
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.Q(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void q(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> r(View view) {
        List<View> h10 = this.f20897b.h(view);
        this.f20899d.clear();
        if (h10 != null) {
            this.f20899d.addAll(h10);
        }
        return this.f20899d;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c f10 = ((f) view.getLayoutParams()).f();
        if (f10 == null || !f10.A(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f20903h) {
            Q(false);
            this.f20903h = true;
        }
    }

    public List<View> s(View view) {
        List g10 = this.f20897b.g(view);
        this.f20899d.clear();
        if (g10 != null) {
            this.f20899d.addAll(g10);
        }
        return this.f20899d;
    }

    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        X();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f20913r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f20912q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f20912q = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f20912q.setState(getDrawableState());
                }
                C6260a.m(this.f20912q, C4600b0.z(this));
                this.f20912q.setVisible(getVisibility() == 0, false);
                this.f20912q.setCallback(this);
            }
            C4600b0.f0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? C6012a.e(getContext(), i10) : null);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f20912q;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f20912q.setVisible(z10, false);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(View view, Rect rect) {
        c.a(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    public void u(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f20912q;
    }

    /* access modifiers changed from: package-private */
    public void x(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* access modifiers changed from: package-private */
    public f y(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f20919b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f20919b = true;
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o((c) dVar.value().getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                fVar.f20919b = true;
            }
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArray;
        this.f20896a = new ArrayList();
        this.f20897b = new b<>();
        this.f20898c = new ArrayList();
        this.f20899d = new ArrayList();
        this.f20901f = new int[2];
        this.f20902g = new int[2];
        this.f20915t = new H(this);
        if (i10 == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, s2.c.f29006b, 0, C5930b.f29004a);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, s2.c.f29006b, i10, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, s2.c.f29006b, attributeSet, typedArray, 0, C5930b.f29004a);
            } else {
                saveAttributeDataForStyleable(context, s2.c.f29006b, attributeSet, typedArray, i10, 0);
            }
        }
        int resourceId = typedArray.getResourceId(s2.c.f29007c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f20905j = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f20905j.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = this.f20905j;
                iArr[i11] = (int) (((float) iArr[i11]) * f10);
            }
        }
        this.f20912q = typedArray.getDrawable(s2.c.f29008d);
        typedArray.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
        if (C4600b0.x(this) == 0) {
            C4600b0.z0(this, 1);
        }
    }

    protected static class h extends O2.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        SparseArray<Parcelable> f20937c;

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

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f20937c = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f20937c.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f20937c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f20937c.keyAt(i11);
                parcelableArr[i11] = this.f20937c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        c f20918a;

        /* renamed from: b  reason: collision with root package name */
        boolean f20919b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f20920c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f20921d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f20922e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f20923f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f20924g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f20925h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f20926i;

        /* renamed from: j  reason: collision with root package name */
        int f20927j;

        /* renamed from: k  reason: collision with root package name */
        View f20928k;

        /* renamed from: l  reason: collision with root package name */
        View f20929l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f20930m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f20931n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f20932o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f20933p;

        /* renamed from: q  reason: collision with root package name */
        final Rect f20934q = new Rect();

        /* renamed from: r  reason: collision with root package name */
        Object f20935r;

        public f(int i10, int i11) {
            super(i10, i11);
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f20923f);
            this.f20928k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f20929l = null;
                            this.f20928k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f20929l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f20929l = null;
                    this.f20928k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f20929l = null;
                this.f20928k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f20923f) + " to anchor view " + view);
            }
        }

        private boolean s(View view, int i10) {
            int b10 = C4632s.b(((f) view.getLayoutParams()).f20924g, i10);
            return b10 != 0 && (C4632s.b(this.f20925h, i10) & b10) == b10;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f20928k.getId() != this.f20923f) {
                return false;
            }
            View view2 = this.f20928k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f20929l = null;
                    this.f20928k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f20929l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f20928k == null && this.f20923f != -1;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f20918a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f20929l
                if (r4 == r0) goto L_0x001b
                int r0 = I2.C4600b0.z(r2)
                boolean r0 = r1.s(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f20918a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.i(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.f.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            if (this.f20918a == null) {
                this.f20930m = false;
            }
            return this.f20930m;
        }

        /* access modifiers changed from: package-private */
        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f20923f == -1) {
                this.f20929l = null;
                this.f20928k = null;
                return null;
            }
            if (this.f20928k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f20928k;
        }

        public int e() {
            return this.f20923f;
        }

        public c f() {
            return this.f20918a;
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return this.f20933p;
        }

        /* access modifiers changed from: package-private */
        public Rect h() {
            return this.f20934q;
        }

        /* access modifiers changed from: package-private */
        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f20930m;
            if (z10) {
                return true;
            }
            c cVar = this.f20918a;
            boolean e10 = (cVar != null ? cVar.e(coordinatorLayout, view) : false) | z10;
            this.f20930m = e10;
            return e10;
        }

        /* access modifiers changed from: package-private */
        public boolean j(int i10) {
            if (i10 == 0) {
                return this.f20931n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f20932o;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            this.f20933p = false;
        }

        /* access modifiers changed from: package-private */
        public void l(int i10) {
            r(i10, false);
        }

        /* access modifiers changed from: package-private */
        public void m() {
            this.f20930m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f20918a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.n();
                }
                this.f20918a = cVar;
                this.f20935r = null;
                this.f20919b = true;
                if (cVar != null) {
                    cVar.k(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void p(boolean z10) {
            this.f20933p = z10;
        }

        /* access modifiers changed from: package-private */
        public void q(Rect rect) {
            this.f20934q.set(rect);
        }

        /* access modifiers changed from: package-private */
        public void r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f20931n = z10;
            } else if (i10 == 1) {
                this.f20932o = z10;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s2.c.f29009e);
            this.f20920c = obtainStyledAttributes.getInteger(s2.c.f29010f, 0);
            this.f20923f = obtainStyledAttributes.getResourceId(s2.c.f29011g, -1);
            this.f20921d = obtainStyledAttributes.getInteger(s2.c.f29012h, 0);
            this.f20922e = obtainStyledAttributes.getInteger(s2.c.f29016l, -1);
            this.f20924g = obtainStyledAttributes.getInt(s2.c.f29015k, 0);
            this.f20925h = obtainStyledAttributes.getInt(s2.c.f29014j, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(s2.c.f29013i);
            this.f20919b = hasValue;
            if (hasValue) {
                this.f20918a = CoordinatorLayout.K(context, attributeSet, obtainStyledAttributes.getString(s2.c.f29013i));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f20918a;
            if (cVar != null) {
                cVar.k(this);
            }
        }

        public f(f fVar) {
            super(fVar);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
