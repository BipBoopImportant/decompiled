package com.google.android.material.sidesheet;

import Ea.C9076j;
import Ea.C9077k;
import Ea.C9078l;
import Fa.C9081a;
import I2.C4600b0;
import I2.C4632s;
import J2.t;
import J2.w;
import P2.c;
import Qa.C9235b;
import Qa.C9241h;
import Ua.C9286g;
import Ua.k;
import Va.C9342a;
import Va.C9343b;
import Va.C9344c;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C4987b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;

public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements C9235b {

    /* renamed from: A  reason: collision with root package name */
    private static final int f67106A = C9077k.f59609s;

    /* renamed from: z  reason: collision with root package name */
    private static final int f67107z = C9076j.f59557N;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public d f67108a;

    /* renamed from: b  reason: collision with root package name */
    private float f67109b;

    /* renamed from: c  reason: collision with root package name */
    private C9286g f67110c;

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f67111d;

    /* renamed from: e  reason: collision with root package name */
    private k f67112e;

    /* renamed from: f  reason: collision with root package name */
    private final SideSheetBehavior<V>.defpackage.d f67113f = new d();

    /* renamed from: g  reason: collision with root package name */
    private float f67114g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f67115h = true;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f67116i = 5;

    /* renamed from: j  reason: collision with root package name */
    private int f67117j = 5;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public P2.c f67118k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f67119l;

    /* renamed from: m  reason: collision with root package name */
    private float f67120m = 0.1f;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f67121n;

    /* renamed from: o  reason: collision with root package name */
    private int f67122o;

    /* renamed from: p  reason: collision with root package name */
    private int f67123p;

    /* renamed from: q  reason: collision with root package name */
    private int f67124q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public WeakReference<V> f67125r;

    /* renamed from: s  reason: collision with root package name */
    private WeakReference<View> f67126s;

    /* renamed from: t  reason: collision with root package name */
    private int f67127t = -1;

    /* renamed from: u  reason: collision with root package name */
    private VelocityTracker f67128u;

    /* renamed from: v  reason: collision with root package name */
    private C9241h f67129v;

    /* renamed from: w  reason: collision with root package name */
    private int f67130w;

    /* renamed from: x  reason: collision with root package name */
    private final Set<g> f67131x = new LinkedHashSet();

    /* renamed from: y  reason: collision with root package name */
    private final c.C0179c f67132y = new a();

    class a extends c.C0179c {
        a() {
        }

        public int a(View view, int i10, int i11) {
            return B2.a.c(i10, SideSheetBehavior.this.f67108a.g(), SideSheetBehavior.this.f67108a.f());
        }

        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        public int d(View view) {
            return SideSheetBehavior.this.f67121n + SideSheetBehavior.this.k0();
        }

        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f67115h) {
                SideSheetBehavior.this.J0(1);
            }
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View f02 = SideSheetBehavior.this.f0();
            if (!(f02 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) f02.getLayoutParams()) == null)) {
                SideSheetBehavior.this.f67108a.p(marginLayoutParams, view.getLeft(), view.getRight());
                f02.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i10);
        }

        public void l(View view, float f10, float f11) {
            int Q10 = SideSheetBehavior.this.W(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.O0(view, Q10, sideSheetBehavior.N0());
        }

        public boolean m(View view, int i10) {
            return (SideSheetBehavior.this.f67116i == 1 || SideSheetBehavior.this.f67125r == null || SideSheetBehavior.this.f67125r.get() != view) ? false : true;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.J0(5);
            if (SideSheetBehavior.this.f67125r != null && SideSheetBehavior.this.f67125r.get() != null) {
                ((View) SideSheetBehavior.this.f67125r.get()).requestLayout();
            }
        }
    }

    class d {

        /* renamed from: a  reason: collision with root package name */
        private int f67136a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f67137b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f67138c = new f(this);

        d() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f67137b = false;
            if (SideSheetBehavior.this.f67118k != null && SideSheetBehavior.this.f67118k.m(true)) {
                b(this.f67136a);
            } else if (SideSheetBehavior.this.f67116i == 2) {
                SideSheetBehavior.this.J0(this.f67136a);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            if (SideSheetBehavior.this.f67125r != null && SideSheetBehavior.this.f67125r.get() != null) {
                this.f67136a = i10;
                if (!this.f67137b) {
                    C4600b0.g0((View) SideSheetBehavior.this.f67125r.get(), this.f67138c);
                    this.f67137b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
    }

    private void A0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View findViewById;
        if (this.f67126s == null && (i10 = this.f67127t) != -1 && (findViewById = coordinatorLayout.findViewById(i10)) != null) {
            this.f67126s = new WeakReference<>(findViewById);
        }
    }

    private void B0(V v10, t.a aVar, int i10) {
        C4600b0.k0(v10, aVar, (CharSequence) null, Y(i10));
    }

    private void C0() {
        VelocityTracker velocityTracker = this.f67128u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f67128u = null;
        }
    }

    private void D0(V v10, Runnable runnable) {
        if (v0(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void G0(int i10) {
        d dVar = this.f67108a;
        if (dVar != null && dVar.j() == i10) {
            return;
        }
        if (i10 == 0) {
            this.f67108a = new b(this);
            if (this.f67112e != null && !s0()) {
                k.b v10 = this.f67112e.v();
                v10.E(0.0f).w(0.0f);
                R0(v10.m());
            }
        } else if (i10 == 1) {
            this.f67108a = new a(this);
            if (this.f67112e != null && !r0()) {
                k.b v11 = this.f67112e.v();
                v11.A(0.0f).s(0.0f);
                R0(v11.m());
            }
        } else {
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be " + 0 + " or " + 1 + ".");
        }
    }

    private void H0(V v10, int i10) {
        G0(C4632s.b(((CoordinatorLayout.f) v10.getLayoutParams()).f20920c, i10) == 3 ? 1 : 0);
    }

    private boolean K0() {
        return this.f67118k != null && (this.f67115h || this.f67116i == 1);
    }

    private boolean M0(V v10) {
        return (v10.isShown() || C4600b0.o(v10) != null) && this.f67115h;
    }

    /* access modifiers changed from: private */
    public void O0(View view, int i10, boolean z10) {
        if (w0(view, i10, z10)) {
            J0(2);
            this.f67113f.b(i10);
            return;
        }
        J0(i10);
    }

    private void P0() {
        View view;
        WeakReference<V> weakReference = this.f67125r;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C4600b0.i0(view, 262144);
            C4600b0.i0(view, ImageMetadata.SHADING_MODE);
            if (this.f67116i != 5) {
                B0(view, t.a.f8854y, 5);
            }
            if (this.f67116i != 3) {
                B0(view, t.a.f8852w, 3);
            }
        }
    }

    private void Q0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.f67125r;
        if (weakReference != null && weakReference.get() != null) {
            View view = (View) this.f67125r.get();
            View f02 = f0();
            if (f02 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) f02.getLayoutParams()) != null) {
                this.f67108a.o(marginLayoutParams, (int) ((((float) this.f67121n) * view.getScaleX()) + ((float) this.f67124q)));
                f02.requestLayout();
            }
        }
    }

    private void R0(k kVar) {
        C9286g gVar = this.f67110c;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
    }

    private void S0(View view) {
        int i10 = this.f67116i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private int U(int i10, V v10) {
        int i11 = this.f67116i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f67108a.h(v10);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f67108a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f67116i);
    }

    private float V(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    /* access modifiers changed from: private */
    public int W(View view, float f10, float f11) {
        if (u0(f10)) {
            return 3;
        }
        if (L0(view, f10)) {
            if (!this.f67108a.m(f10, f11) && !this.f67108a.l(view)) {
                return 3;
            }
        } else if (f10 == 0.0f || !e.a(f10, f11)) {
            int left = view.getLeft();
            if (Math.abs(left - g0()) < Math.abs(left - this.f67108a.e())) {
                return 3;
            }
        }
        return 5;
    }

    private void X() {
        WeakReference<View> weakReference = this.f67126s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f67126s = null;
    }

    private w Y(int i10) {
        return new C9342a(this, i10);
    }

    private void Z(Context context) {
        if (this.f67112e != null) {
            C9286g gVar = new C9286g(this.f67112e);
            this.f67110c = gVar;
            gVar.Q(context);
            ColorStateList colorStateList = this.f67111d;
            if (colorStateList != null) {
                this.f67110c.b0(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f67110c.setTint(typedValue.data);
        }
    }

    /* access modifiers changed from: private */
    public void a0(View view, int i10) {
        if (!this.f67131x.isEmpty()) {
            float b10 = this.f67108a.b(i10);
            for (g b11 : this.f67131x) {
                b11.b(view, b10);
            }
        }
    }

    private void b0(View view) {
        if (C4600b0.o(view) == null) {
            C4600b0.s0(view, view.getResources().getString(f67107z));
        }
    }

    private int c0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), CatalogRepository.FETCH_FLAG_SDB);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private ValueAnimator.AnimatorUpdateListener e0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View f02 = f0();
        if (f02 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) f02.getLayoutParams()) == null) {
            return null;
        }
        return new C9344c(this, marginLayoutParams, this.f67108a.c(marginLayoutParams), f02);
    }

    private int h0() {
        d dVar = this.f67108a;
        return (dVar == null || dVar.j() == 0) ? 5 : 3;
    }

    private CoordinatorLayout.f q0() {
        View view;
        WeakReference<V> weakReference = this.f67125r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) view.getLayoutParams();
    }

    private boolean r0() {
        CoordinatorLayout.f q02 = q0();
        return q02 != null && q02.leftMargin > 0;
    }

    private boolean s0() {
        CoordinatorLayout.f q02 = q0();
        return q02 != null && q02.rightMargin > 0;
    }

    private boolean t0(MotionEvent motionEvent) {
        return K0() && V((float) this.f67130w, motionEvent.getX()) > ((float) this.f67118k.z());
    }

    private boolean u0(float f10) {
        return this.f67108a.k(f10);
    }

    private boolean v0(V v10) {
        ViewParent parent = v10.getParent();
        return parent != null && parent.isLayoutRequested() && C4600b0.R(v10);
    }

    private boolean w0(View view, int i10, boolean z10) {
        int l02 = l0(i10);
        P2.c p02 = p0();
        return p02 != null && (!z10 ? p02.Q(view, l02, view.getTop()) : p02.O(l02, view.getTop()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean x0(int i10, View view, w.a aVar) {
        I0(i10);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y0(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view, ValueAnimator valueAnimator) {
        this.f67108a.o(marginLayoutParams, C9081a.c(i10, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z0(int i10) {
        View view = (View) this.f67125r.get();
        if (view != null) {
            O0(view, i10, false);
        }
    }

    public void B(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        c cVar = (c) parcelable;
        if (cVar.a() != null) {
            super.B(coordinatorLayout, v10, cVar.a());
        }
        int i10 = cVar.f67135c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f67116i = i10;
        this.f67117j = i10;
    }

    public Parcelable C(CoordinatorLayout coordinatorLayout, V v10) {
        return new c(super.C(coordinatorLayout, v10), (SideSheetBehavior<?>) this);
    }

    public void E0(int i10) {
        this.f67127t = i10;
        X();
        WeakReference<V> weakReference = this.f67125r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i10 != -1 && C4600b0.S(view)) {
                view.requestLayout();
            }
        }
    }

    public void F0(boolean z10) {
        this.f67115h = z10;
    }

    public boolean H(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f67116i == 1 && actionMasked == 0) {
            return true;
        }
        if (K0()) {
            this.f67118k.F(motionEvent);
        }
        if (actionMasked == 0) {
            C0();
        }
        if (this.f67128u == null) {
            this.f67128u = VelocityTracker.obtain();
        }
        this.f67128u.addMovement(motionEvent);
        if (K0() && actionMasked == 2 && !this.f67119l && t0(motionEvent)) {
            this.f67118k.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f67119l;
    }

    public void I0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference<V> weakReference = this.f67125r;
        if (weakReference == null || weakReference.get() == null) {
            J0(i10);
        } else {
            D0((View) this.f67125r.get(), new C9343b(this, i10));
        }
    }

    /* access modifiers changed from: package-private */
    public void J0(int i10) {
        View view;
        if (this.f67116i != i10) {
            this.f67116i = i10;
            if (i10 == 3 || i10 == 5) {
                this.f67117j = i10;
            }
            WeakReference<V> weakReference = this.f67125r;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                S0(view);
                for (g a10 : this.f67131x) {
                    a10.a(view, i10);
                }
                P0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean L0(View view, float f10) {
        return this.f67108a.n(view, f10);
    }

    public boolean N0() {
        return true;
    }

    public void a() {
        C9241h hVar = this.f67129v;
        if (hVar != null) {
            hVar.f();
        }
    }

    public void b(C4987b bVar) {
        C9241h hVar = this.f67129v;
        if (hVar != null) {
            hVar.j(bVar);
        }
    }

    public void c(C4987b bVar) {
        C9241h hVar = this.f67129v;
        if (hVar != null) {
            hVar.l(bVar, h0());
            Q0();
        }
    }

    public void d() {
        C9241h hVar = this.f67129v;
        if (hVar != null) {
            C4987b c10 = hVar.c();
            if (c10 == null || Build.VERSION.SDK_INT < 34) {
                I0(5);
            } else {
                this.f67129v.h(c10, h0(), new b(), e0());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int d0() {
        return this.f67121n;
    }

    public View f0() {
        WeakReference<View> weakReference = this.f67126s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.f67108a.d();
    }

    public float i0() {
        return this.f67120m;
    }

    /* access modifiers changed from: package-private */
    public float j0() {
        return 0.5f;
    }

    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f67125r = null;
        this.f67118k = null;
        this.f67129v = null;
    }

    /* access modifiers changed from: package-private */
    public int k0() {
        return this.f67124q;
    }

    /* access modifiers changed from: package-private */
    public int l0(int i10) {
        if (i10 == 3) {
            return g0();
        }
        if (i10 == 5) {
            return this.f67108a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    /* access modifiers changed from: package-private */
    public int m0() {
        return this.f67123p;
    }

    public void n() {
        super.n();
        this.f67125r = null;
        this.f67118k = null;
        this.f67129v = null;
    }

    /* access modifiers changed from: package-private */
    public int n0() {
        return this.f67122o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r3 = r2.f67118k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean o(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.MotionEvent r5) {
        /*
            r2 = this;
            boolean r3 = r2.M0(r4)
            r4 = 1
            r0 = 0
            if (r3 != 0) goto L_0x000b
            r2.f67119l = r4
            return r0
        L_0x000b:
            int r3 = r5.getActionMasked()
            if (r3 != 0) goto L_0x0014
            r2.C0()
        L_0x0014:
            android.view.VelocityTracker r1 = r2.f67128u
            if (r1 != 0) goto L_0x001e
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r2.f67128u = r1
        L_0x001e:
            android.view.VelocityTracker r1 = r2.f67128u
            r1.addMovement(r5)
            if (r3 == 0) goto L_0x0032
            if (r3 == r4) goto L_0x002b
            r1 = 3
            if (r3 == r1) goto L_0x002b
            goto L_0x0039
        L_0x002b:
            boolean r3 = r2.f67119l
            if (r3 == 0) goto L_0x0039
            r2.f67119l = r0
            return r0
        L_0x0032:
            float r3 = r5.getX()
            int r3 = (int) r3
            r2.f67130w = r3
        L_0x0039:
            boolean r3 = r2.f67119l
            if (r3 != 0) goto L_0x0048
            P2.c r3 = r2.f67118k
            if (r3 == 0) goto L_0x0048
            boolean r3 = r3.P(r5)
            if (r3 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r4 = r0
        L_0x0049:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.o(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public int o0() {
        return 500;
    }

    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        if (C4600b0.w(coordinatorLayout) && !C4600b0.w(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.f67125r == null) {
            this.f67125r = new WeakReference<>(v10);
            this.f67129v = new C9241h(v10);
            C9286g gVar = this.f67110c;
            if (gVar != null) {
                C4600b0.t0(v10, gVar);
                C9286g gVar2 = this.f67110c;
                float f10 = this.f67114g;
                if (f10 == -1.0f) {
                    f10 = C4600b0.u(v10);
                }
                gVar2.a0(f10);
            } else {
                ColorStateList colorStateList = this.f67111d;
                if (colorStateList != null) {
                    C4600b0.u0(v10, colorStateList);
                }
            }
            S0(v10);
            P0();
            if (C4600b0.x(v10) == 0) {
                C4600b0.z0(v10, 1);
            }
            b0(v10);
        }
        H0(v10, i10);
        if (this.f67118k == null) {
            this.f67118k = P2.c.o(coordinatorLayout, this.f67132y);
        }
        int h10 = this.f67108a.h(v10);
        coordinatorLayout.I(v10, i10);
        this.f67122o = coordinatorLayout.getWidth();
        this.f67123p = this.f67108a.i(coordinatorLayout);
        this.f67121n = v10.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        this.f67124q = marginLayoutParams != null ? this.f67108a.a(marginLayoutParams) : 0;
        C4600b0.Y(v10, U(h10, v10));
        A0(coordinatorLayout);
        for (c next : this.f67131x) {
            if (next instanceof g) {
                ((g) next).c(v10);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public P2.c p0() {
        return this.f67118k;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(c0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), c0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    protected static class c extends O2.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        final int f67135c;

        class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            /* renamed from: c */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f67135c = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f67135c);
        }

        public c(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f67135c = sideSheetBehavior.f67116i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9078l.f59756M6);
        if (obtainStyledAttributes.hasValue(C9078l.f59777O6)) {
            this.f67111d = Ra.c.a(context, obtainStyledAttributes, C9078l.f59777O6);
        }
        if (obtainStyledAttributes.hasValue(C9078l.f59807R6)) {
            this.f67112e = k.e(context, attributeSet, 0, f67106A).m();
        }
        if (obtainStyledAttributes.hasValue(C9078l.f59797Q6)) {
            E0(obtainStyledAttributes.getResourceId(C9078l.f59797Q6, -1));
        }
        Z(context);
        this.f67114g = obtainStyledAttributes.getDimension(C9078l.f59767N6, -1.0f);
        F0(obtainStyledAttributes.getBoolean(C9078l.f59787P6, true));
        obtainStyledAttributes.recycle();
        this.f67109b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
