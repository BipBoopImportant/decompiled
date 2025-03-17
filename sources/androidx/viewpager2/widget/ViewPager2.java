package androidx.viewpager2.widget;

import I2.C4600b0;
import J2.t;
import J2.w;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;

public final class ViewPager2 extends ViewGroup {

    /* renamed from: u  reason: collision with root package name */
    static boolean f44957u = true;

    /* renamed from: a  reason: collision with root package name */
    private final Rect f44958a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    private final Rect f44959b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private b f44960c = new b(3);

    /* renamed from: d  reason: collision with root package name */
    int f44961d;

    /* renamed from: e  reason: collision with root package name */
    boolean f44962e = false;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView.j f44963f = new a();

    /* renamed from: g  reason: collision with root package name */
    LinearLayoutManager f44964g;

    /* renamed from: h  reason: collision with root package name */
    private int f44965h = -1;

    /* renamed from: i  reason: collision with root package name */
    private Parcelable f44966i;

    /* renamed from: j  reason: collision with root package name */
    RecyclerView f44967j;

    /* renamed from: k  reason: collision with root package name */
    private u f44968k;

    /* renamed from: l  reason: collision with root package name */
    e f44969l;

    /* renamed from: m  reason: collision with root package name */
    private b f44970m;

    /* renamed from: n  reason: collision with root package name */
    private c f44971n;

    /* renamed from: o  reason: collision with root package name */
    private d f44972o;

    /* renamed from: p  reason: collision with root package name */
    private RecyclerView.n f44973p = null;

    /* renamed from: q  reason: collision with root package name */
    private boolean f44974q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f44975r = true;

    /* renamed from: s  reason: collision with root package name */
    private int f44976s = -1;

    /* renamed from: t  reason: collision with root package name */
    e f44977t;

    private class RecyclerViewImpl extends RecyclerView {
        RecyclerViewImpl(Context context) {
            super(context);
        }

        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f44977t.d() ? ViewPager2.this.f44977t.o() : super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f44961d);
            accessibilityEvent.setToIndex(ViewPager2.this.f44961d);
            ViewPager2.this.f44977t.p(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onTouchEvent(motionEvent);
        }
    }

    class a extends g {
        a() {
            super((a) null);
        }

        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f44962e = true;
            viewPager2.f44969l.l();
        }
    }

    class b extends i {
        b() {
        }

        public void a(int i10) {
            if (i10 == 0) {
                ViewPager2.this.o();
            }
        }

        public void c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f44961d != i10) {
                viewPager2.f44961d = i10;
                viewPager2.f44977t.r();
            }
        }
    }

    class c extends i {
        c() {
        }

        public void c(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f44967j.requestFocus(2);
            }
        }
    }

    class d implements RecyclerView.s {
        d() {
        }

        public void b(View view) {
        }

        public void d(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            if (rVar.width != -1 || rVar.height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    private abstract class e {
        private e() {
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean b(int i10) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean c(int i10, Bundle bundle) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(RecyclerView.h<?> hVar) {
        }

        /* access modifiers changed from: package-private */
        public void f(RecyclerView.h<?> hVar) {
        }

        /* access modifiers changed from: package-private */
        public String g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public void h(b bVar, RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* access modifiers changed from: package-private */
        public void j(t tVar) {
        }

        /* access modifiers changed from: package-private */
        public void k(View view, t tVar) {
        }

        /* access modifiers changed from: package-private */
        public boolean l(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public boolean m(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public void n() {
        }

        /* access modifiers changed from: package-private */
        public CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public void p(AccessibilityEvent accessibilityEvent) {
        }

        /* access modifiers changed from: package-private */
        public void q() {
        }

        /* access modifiers changed from: package-private */
        public void r() {
        }

        /* access modifiers changed from: package-private */
        public void s() {
        }

        /* access modifiers changed from: package-private */
        public void t() {
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }
    }

    class f extends e {
        f() {
            super(ViewPager2.this, (a) null);
        }

        public boolean b(int i10) {
            return (i10 == 8192 || i10 == 4096) && !ViewPager2.this.e();
        }

        public boolean d() {
            return true;
        }

        public void j(t tVar) {
            if (!ViewPager2.this.e()) {
                tVar.a0(t.a.f8847r);
                tVar.a0(t.a.f8846q);
                tVar.L0(false);
            }
        }

        public boolean l(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        public abstract void a();

        public final void b(int i10, int i11) {
            a();
        }

        public final void c(int i10, int i11, Object obj) {
            a();
        }

        public final void d(int i10, int i11) {
            a();
        }

        public final void e(int i10, int i11, int i12) {
            a();
        }

        public final void f(int i10, int i11) {
            a();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        public boolean G1(RecyclerView.x xVar, RecyclerView.C c10, int i10, Bundle bundle) {
            return ViewPager2.this.f44977t.b(i10) ? ViewPager2.this.f44977t.l(i10) : super.G1(xVar, c10, i10, bundle);
        }

        public boolean S1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }

        public void m1(RecyclerView.x xVar, RecyclerView.C c10, t tVar) {
            super.m1(xVar, c10, tVar);
            ViewPager2.this.f44977t.j(tVar);
        }

        /* access modifiers changed from: protected */
        public void m2(RecyclerView.C c10, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.m2(c10, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        public void o1(RecyclerView.x xVar, RecyclerView.C c10, View view, t tVar) {
            ViewPager2.this.f44977t.k(view, tVar);
        }
    }

    public static abstract class i {
        public void a(int i10) {
        }

        public void b(int i10, float f10, int i11) {
        }

        public void c(int i10) {
        }
    }

    class j extends e {

        /* renamed from: b  reason: collision with root package name */
        private final w f44986b = new a();

        /* renamed from: c  reason: collision with root package name */
        private final w f44987c = new b();

        /* renamed from: d  reason: collision with root package name */
        private RecyclerView.j f44988d;

        class a implements w {
            a() {
            }

            public boolean a(View view, w.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        class b implements w {
            b() {
            }

            public boolean a(View view, w.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        class c extends g {
            c() {
                super((a) null);
            }

            public void a() {
                j.this.y();
            }
        }

        j() {
            super(ViewPager2.this, (a) null);
        }

        private void u(t tVar) {
            int i10;
            int i11;
            if (ViewPager2.this.getAdapter() != null) {
                i10 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    i10 = ViewPager2.this.getAdapter().getItemCount();
                    i11 = 1;
                } else {
                    i11 = ViewPager2.this.getAdapter().getItemCount();
                }
            } else {
                i11 = 0;
                i10 = 0;
            }
            tVar.k0(t.e.b(i10, i11, false, 0));
        }

        private void v(View view, t tVar) {
            int i10 = 0;
            int E02 = ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f44964g.E0(view) : 0;
            if (ViewPager2.this.getOrientation() == 0) {
                i10 = ViewPager2.this.f44964g.E0(view);
            }
            tVar.l0(t.f.a(E02, 1, i10, 1, false, false));
        }

        private void w(t tVar) {
            int itemCount;
            RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && ViewPager2.this.e()) {
                if (ViewPager2.this.f44961d > 0) {
                    tVar.a(8192);
                }
                if (ViewPager2.this.f44961d < itemCount - 1) {
                    tVar.a(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
                }
                tVar.L0(true);
            }
        }

        public boolean a() {
            return true;
        }

        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        public void e(RecyclerView.h<?> hVar) {
            y();
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f44988d);
            }
        }

        public void f(RecyclerView.h<?> hVar) {
            if (hVar != null) {
                hVar.unregisterAdapterDataObserver(this.f44988d);
            }
        }

        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        public void h(b bVar, RecyclerView recyclerView) {
            recyclerView.setImportantForAccessibility(2);
            this.f44988d = new c();
            if (ViewPager2.this.getImportantForAccessibility() == 0) {
                ViewPager2.this.setImportantForAccessibility(1);
            }
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t a12 = t.a1(accessibilityNodeInfo);
            u(a12);
            w(a12);
        }

        /* access modifiers changed from: package-private */
        public void k(View view, t tVar) {
            v(view, tVar);
        }

        public boolean m(int i10, Bundle bundle) {
            if (c(i10, bundle)) {
                x(i10 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
                return true;
            }
            throw new IllegalStateException();
        }

        public void n() {
            y();
        }

        public void p(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        public void q() {
            y();
        }

        public void r() {
            y();
        }

        public void s() {
            y();
        }

        public void t() {
            y();
        }

        /* access modifiers changed from: package-private */
        public void x(int i10) {
            if (ViewPager2.this.e()) {
                ViewPager2.this.k(i10, true);
            }
        }

        /* access modifiers changed from: package-private */
        public void y() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = 16908360;
            C4600b0.i0(viewPager2, 16908360);
            C4600b0.i0(viewPager2, 16908361);
            C4600b0.i0(viewPager2, 16908358);
            C4600b0.i0(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null && (itemCount = ViewPager2.this.getAdapter().getItemCount()) != 0 && ViewPager2.this.e()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean d10 = ViewPager2.this.d();
                    int i11 = d10 ? 16908360 : 16908361;
                    if (d10) {
                        i10 = 16908361;
                    }
                    if (ViewPager2.this.f44961d < itemCount - 1) {
                        C4600b0.k0(viewPager2, new t.a(i11, (CharSequence) null), (CharSequence) null, this.f44986b);
                    }
                    if (ViewPager2.this.f44961d > 0) {
                        C4600b0.k0(viewPager2, new t.a(i10, (CharSequence) null), (CharSequence) null, this.f44987c);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.f44961d < itemCount - 1) {
                    C4600b0.k0(viewPager2, new t.a(16908359, (CharSequence) null), (CharSequence) null, this.f44986b);
                }
                if (ViewPager2.this.f44961d > 0) {
                    C4600b0.k0(viewPager2, new t.a(16908358, (CharSequence) null), (CharSequence) null, this.f44987c);
                }
            }
        }
    }

    public interface k {
    }

    private class l extends u {
        l() {
        }

        public View f(RecyclerView.q qVar) {
            if (ViewPager2.this.c()) {
                return null;
            }
            return super.f(qVar);
        }
    }

    private static class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final int f44997a;

        /* renamed from: b  reason: collision with root package name */
        private final RecyclerView f44998b;

        n(int i10, RecyclerView recyclerView) {
            this.f44997a = i10;
            this.f44998b = recyclerView;
        }

        public void run() {
            this.f44998b.F1(this.f44997a);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    private RecyclerView.s a() {
        return new d();
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.f44977t = f44957u ? new j() : new f();
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.f44967j = recyclerViewImpl;
        recyclerViewImpl.setId(View.generateViewId());
        this.f44967j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f44964g = hVar;
        this.f44967j.setLayoutManager(hVar);
        this.f44967j.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.f44967j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f44967j.l(a());
        e eVar = new e(this);
        this.f44969l = eVar;
        this.f44971n = new c(this, eVar, this.f44967j);
        l lVar = new l();
        this.f44968k = lVar;
        lVar.b(this.f44967j);
        this.f44967j.n(this.f44969l);
        b bVar = new b(3);
        this.f44970m = bVar;
        this.f44969l.o(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f44970m.d(bVar2);
        this.f44970m.d(cVar);
        this.f44977t.h(this.f44970m, this.f44967j);
        this.f44970m.d(this.f44960c);
        d dVar = new d(this.f44964g);
        this.f44972o = dVar;
        this.f44970m.d(dVar);
        RecyclerView recyclerView = this.f44967j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f44963f);
        }
    }

    private void i() {
        RecyclerView.h adapter;
        if (this.f44965h != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.f44966i;
            if (parcelable != null) {
                if (adapter instanceof Z4.c) {
                    ((Z4.c) adapter).a(parcelable);
                }
                this.f44966i = null;
            }
            int max = Math.max(0, Math.min(this.f44965h, adapter.getItemCount() - 1));
            this.f44961d = max;
            this.f44965h = -1;
            this.f44967j.w1(max);
            this.f44977t.n();
        }
    }

    private void l(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y4.a.f40820a);
        C4600b0.n0(this, context, Y4.a.f40820a, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(Y4.a.f40821b, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void m(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.unregisterAdapterDataObserver(this.f44963f);
        }
    }

    public boolean c() {
        return this.f44971n.a();
    }

    public boolean canScrollHorizontally(int i10) {
        return this.f44967j.canScrollHorizontally(i10);
    }

    public boolean canScrollVertically(int i10) {
        return this.f44967j.canScrollVertically(i10);
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f44964g.A0() == 1;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof m) {
            int i10 = ((m) parcelable).f44994a;
            sparseArray.put(this.f44967j.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f44975r;
    }

    public void g(i iVar) {
        this.f44960c.d(iVar);
    }

    public CharSequence getAccessibilityClassName() {
        return this.f44977t.a() ? this.f44977t.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f44967j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f44961d;
    }

    public int getItemDecorationCount() {
        return this.f44967j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f44976s;
    }

    public int getOrientation() {
        return this.f44964g.M2() == 1 ? 1 : 0;
    }

    /* access modifiers changed from: package-private */
    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f44967j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f44969l.h();
    }

    public void h() {
        this.f44972o.d();
    }

    public void j(int i10, boolean z10) {
        if (!c()) {
            k(i10, z10);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* access modifiers changed from: package-private */
    public void k(int i10, boolean z10) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f44965h != -1) {
                this.f44965h = Math.max(i10, 0);
            }
        } else if (adapter.getItemCount() > 0) {
            int min = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
            if (min != this.f44961d || !this.f44969l.j()) {
                int i11 = this.f44961d;
                if (min != i11 || !z10) {
                    double d10 = (double) i11;
                    this.f44961d = min;
                    this.f44977t.r();
                    if (!this.f44969l.j()) {
                        d10 = this.f44969l.g();
                    }
                    this.f44969l.m(min, z10);
                    if (!z10) {
                        this.f44967j.w1(min);
                        return;
                    }
                    double d11 = (double) min;
                    if (Math.abs(d11 - d10) > 3.0d) {
                        this.f44967j.w1(d11 > d10 ? min - 3 : min + 3);
                        RecyclerView recyclerView = this.f44967j;
                        recyclerView.post(new n(min, recyclerView));
                        return;
                    }
                    this.f44967j.F1(min);
                }
            }
        }
    }

    public void n(i iVar) {
        this.f44960c.e(iVar);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        u uVar = this.f44968k;
        if (uVar != null) {
            View f10 = uVar.f(this.f44964g);
            if (f10 != null) {
                int E02 = this.f44964g.E0(f10);
                if (E02 != this.f44961d && getScrollState() == 0) {
                    this.f44970m.c(E02);
                }
                this.f44962e = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f44977t.i(accessibilityNodeInfo);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f44967j.getMeasuredWidth();
        int measuredHeight = this.f44967j.getMeasuredHeight();
        this.f44958a.left = getPaddingLeft();
        this.f44958a.right = (i12 - i10) - getPaddingRight();
        this.f44958a.top = getPaddingTop();
        this.f44958a.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f44958a, this.f44959b);
        RecyclerView recyclerView = this.f44967j;
        Rect rect = this.f44959b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f44962e) {
            o();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        measureChild(this.f44967j, i10, i11);
        int measuredWidth = this.f44967j.getMeasuredWidth();
        int measuredHeight = this.f44967j.getMeasuredHeight();
        int measuredState = this.f44967j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        this.f44965h = mVar.f44995b;
        this.f44966i = mVar.f44996c;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f44994a = this.f44967j.getId();
        int i10 = this.f44965h;
        if (i10 == -1) {
            i10 = this.f44961d;
        }
        mVar.f44995b = i10;
        Parcelable parcelable = this.f44966i;
        if (parcelable != null) {
            mVar.f44996c = parcelable;
        } else {
            RecyclerView.h adapter = this.f44967j.getAdapter();
            if (adapter instanceof Z4.c) {
                mVar.f44996c = ((Z4.c) adapter).b();
            }
        }
        return mVar;
    }

    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f44977t.c(i10, bundle) ? this.f44977t.m(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f44967j.getAdapter();
        this.f44977t.f(adapter);
        m(adapter);
        this.f44967j.setAdapter(hVar);
        this.f44961d = 0;
        i();
        this.f44977t.e(hVar);
        f(hVar);
    }

    public void setCurrentItem(int i10) {
        j(i10, true);
    }

    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f44977t.q();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 >= 1 || i10 == -1) {
            this.f44976s = i10;
            this.f44967j.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i10) {
        this.f44964g.a3(i10);
        this.f44977t.s();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f44974q) {
                this.f44973p = this.f44967j.getItemAnimator();
                this.f44974q = true;
            }
            this.f44967j.setItemAnimator((RecyclerView.n) null);
        } else if (this.f44974q) {
            this.f44967j.setItemAnimator(this.f44973p);
            this.f44973p = null;
            this.f44974q = false;
        }
        this.f44972o.d();
        if (kVar != null) {
            this.f44972o.e(kVar);
            h();
        }
    }

    public void setUserInputEnabled(boolean z10) {
        this.f44975r = z10;
        this.f44977t.t();
    }

    static class m extends View.BaseSavedState {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f44994a;

        /* renamed from: b  reason: collision with root package name */
        int f44995b;

        /* renamed from: c  reason: collision with root package name */
        Parcelable f44996c;

        class a implements Parcelable.ClassLoaderCreator<m> {
            a() {
            }

            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            /* renamed from: c */
            public m[] newArray(int i10) {
                return new m[i10];
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f44994a = parcel.readInt();
            this.f44995b = parcel.readInt();
            this.f44996c = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f44994a);
            parcel.writeInt(this.f44995b);
            parcel.writeParcelable(this.f44996c, i10);
        }

        m(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
