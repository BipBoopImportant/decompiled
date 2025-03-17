package com.google.android.material.bottomsheet;

import Ea.C9068b;
import Ea.C9070d;
import Ea.C9076j;
import Ea.C9077k;
import Ea.C9078l;
import I2.C0;
import I2.C4600b0;
import J2.t;
import J2.w;
import P2.c;
import Qa.C9235b;
import Qa.C9239f;
import Ua.C9286g;
import Ua.k;
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
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.activity.C4987b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.v;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements C9235b {

    /* renamed from: I0  reason: collision with root package name */
    private static final int f66076I0 = C9077k.f59600j;

    /* renamed from: A  reason: collision with root package name */
    private boolean f66077A;

    /* renamed from: A0  reason: collision with root package name */
    private VelocityTracker f66078A0;

    /* renamed from: B  reason: collision with root package name */
    private final BottomSheetBehavior<V>.defpackage.i f66079B = new i(this, (a) null);

    /* renamed from: B0  reason: collision with root package name */
    C9239f f66080B0;

    /* renamed from: C  reason: collision with root package name */
    private ValueAnimator f66081C;

    /* renamed from: C0  reason: collision with root package name */
    int f66082C0;

    /* renamed from: D  reason: collision with root package name */
    int f66083D;

    /* renamed from: D0  reason: collision with root package name */
    private int f66084D0 = -1;

    /* renamed from: E  reason: collision with root package name */
    int f66085E;

    /* renamed from: E0  reason: collision with root package name */
    boolean f66086E0;

    /* renamed from: F  reason: collision with root package name */
    int f66087F;

    /* renamed from: F0  reason: collision with root package name */
    private Map<View, Integer> f66088F0;

    /* renamed from: G  reason: collision with root package name */
    float f66089G = 0.5f;

    /* renamed from: G0  reason: collision with root package name */
    final SparseIntArray f66090G0 = new SparseIntArray();

    /* renamed from: H  reason: collision with root package name */
    int f66091H;

    /* renamed from: H0  reason: collision with root package name */
    private final c.C0179c f66092H0 = new e();

    /* renamed from: I  reason: collision with root package name */
    float f66093I = -1.0f;

    /* renamed from: J  reason: collision with root package name */
    boolean f66094J;
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public boolean f66095K;
    /* access modifiers changed from: private */

    /* renamed from: L  reason: collision with root package name */
    public boolean f66096L = true;

    /* renamed from: M  reason: collision with root package name */
    int f66097M = 4;

    /* renamed from: N  reason: collision with root package name */
    int f66098N = 4;

    /* renamed from: O  reason: collision with root package name */
    P2.c f66099O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f66100P;

    /* renamed from: Q  reason: collision with root package name */
    private int f66101Q;

    /* renamed from: R  reason: collision with root package name */
    private boolean f66102R;

    /* renamed from: S  reason: collision with root package name */
    private float f66103S = 0.1f;

    /* renamed from: T  reason: collision with root package name */
    private int f66104T;

    /* renamed from: U  reason: collision with root package name */
    int f66105U;

    /* renamed from: X  reason: collision with root package name */
    int f66106X;

    /* renamed from: Y  reason: collision with root package name */
    WeakReference<V> f66107Y;

    /* renamed from: Z  reason: collision with root package name */
    WeakReference<View> f66108Z;

    /* renamed from: a  reason: collision with root package name */
    private int f66109a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f66110b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f66111c = false;

    /* renamed from: d  reason: collision with root package name */
    private float f66112d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f66113e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f66114f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f66115g;

    /* renamed from: h  reason: collision with root package name */
    private int f66116h;

    /* renamed from: i  reason: collision with root package name */
    private int f66117i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public C9286g f66118j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f66119k;

    /* renamed from: l  reason: collision with root package name */
    private int f66120l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f66121m = -1;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f66122n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f66123o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f66124p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f66125q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public boolean f66126r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f66127s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public boolean f66128t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f66129u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public boolean f66130v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public int f66131w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public int f66132x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f66133y;

    /* renamed from: y0  reason: collision with root package name */
    WeakReference<View> f66134y0;

    /* renamed from: z  reason: collision with root package name */
    private k f66135z;

    /* renamed from: z0  reason: collision with root package name */
    private final ArrayList<g> f66136z0 = new ArrayList<>();

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f66137a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f66138b;

        a(View view, int i10) {
            this.f66137a = view;
            this.f66138b = i10;
        }

        public void run() {
            BottomSheetBehavior.this.f1(this.f66137a, this.f66138b, false);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.Y0(5);
            WeakReference<V> weakReference = BottomSheetBehavior.this.f66107Y;
            if (weakReference != null && weakReference.get() != null) {
                ((View) BottomSheetBehavior.this.f66107Y.get()).requestLayout();
            }
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f66118j != null) {
                BottomSheetBehavior.this.f66118j.c0(floatValue);
            }
        }
    }

    class d implements v.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f66142a;

        d(boolean z10) {
            this.f66142a = z10;
        }

        public C0 a(View view, C0 c02, v.d dVar) {
            boolean z10;
            int i10;
            int i11;
            int i12;
            x2.d f10 = c02.f(C0.l.h());
            x2.d f11 = c02.f(C0.l.e());
            int unused = BottomSheetBehavior.this.f66132x = f10.f31837b;
            boolean i13 = v.i(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f66124p) {
                int unused2 = BottomSheetBehavior.this.f66131w = c02.j();
                paddingBottom = dVar.f67031d + BottomSheetBehavior.this.f66131w;
            }
            if (BottomSheetBehavior.this.f66125q) {
                paddingLeft = (i13 ? dVar.f67030c : dVar.f67028a) + f10.f31836a;
            }
            if (BottomSheetBehavior.this.f66126r) {
                paddingRight = (i13 ? dVar.f67028a : dVar.f67030c) + f10.f31838c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z11 = true;
            if (!BottomSheetBehavior.this.f66128t || marginLayoutParams.leftMargin == (i12 = f10.f31836a)) {
                z10 = false;
            } else {
                marginLayoutParams.leftMargin = i12;
                z10 = true;
            }
            if (BottomSheetBehavior.this.f66129u && marginLayoutParams.rightMargin != (i11 = f10.f31838c)) {
                marginLayoutParams.rightMargin = i11;
                z10 = true;
            }
            if (!BottomSheetBehavior.this.f66130v || marginLayoutParams.topMargin == (i10 = f10.f31837b)) {
                z11 = z10;
            } else {
                marginLayoutParams.topMargin = i10;
            }
            if (z11) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f66142a) {
                int unused3 = BottomSheetBehavior.this.f66122n = f11.f31839d;
            }
            if (BottomSheetBehavior.this.f66124p || this.f66142a) {
                BottomSheetBehavior.this.k1(false);
            }
            return c02;
        }
    }

    class e extends c.C0179c {

        /* renamed from: a  reason: collision with root package name */
        private long f66144a;

        e() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f66106X + bottomSheetBehavior.s0()) / 2;
        }

        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        public int b(View view, int i10, int i11) {
            return B2.a.c(i10, BottomSheetBehavior.this.s0(), e(view));
        }

        public int e(View view) {
            return BottomSheetBehavior.this.j0() ? BottomSheetBehavior.this.f66106X : BottomSheetBehavior.this.f66091H;
        }

        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f66096L) {
                BottomSheetBehavior.this.Y0(1);
            }
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.o0(i11);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
            if (r9 > r7.f66145b.f66087F) goto L_0x012a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.f66145b.s0()) < java.lang.Math.abs(r8.getTop() - r7.f66145b.f66087F)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cf, code lost:
            if (r7.f66145b.d1() == false) goto L_0x012a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f1, code lost:
            if (java.lang.Math.abs(r9 - r7.f66145b.f66085E) < java.lang.Math.abs(r9 - r7.f66145b.f66091H)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x010d, code lost:
            if (r7.f66145b.d1() != false) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0127, code lost:
            if (r7.f66145b.d1() == false) goto L_0x012a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
            if (r10.a1(r0, (((float) r9) * 100.0f) / ((float) r10.f66106X)) != false) goto L_0x0010;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 6
                r3 = 3
                r4 = 4
                if (r1 >= 0) goto L_0x003f
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f66110b
                if (r9 == 0) goto L_0x0013
            L_0x0010:
                r2 = r3
                goto L_0x012a
            L_0x0013:
                int r9 = r8.getTop()
                long r0 = java.lang.System.currentTimeMillis()
                long r5 = r7.f66144a
                long r0 = r0 - r5
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.d1()
                if (r10 == 0) goto L_0x0037
                float r9 = (float) r9
                r10 = 1120403456(0x42c80000, float:100.0)
                float r9 = r9 * r10
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r2 = r10.f66106X
                float r2 = (float) r2
                float r9 = r9 / r2
                boolean r9 = r10.a1(r0, r9)
                if (r9 == 0) goto L_0x00ad
                goto L_0x0010
            L_0x0037:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f66087F
                if (r9 <= r10) goto L_0x0010
                goto L_0x012a
            L_0x003f:
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r1.f66094J
                if (r5 == 0) goto L_0x0094
                boolean r1 = r1.c1(r8, r10)
                if (r1 == 0) goto L_0x0094
                float r9 = java.lang.Math.abs(r9)
                float r0 = java.lang.Math.abs(r10)
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x0062
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f66113e
                float r9 = (float) r9
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 > 0) goto L_0x0068
            L_0x0062:
                boolean r9 = r7.n(r8)
                if (r9 == 0) goto L_0x006b
            L_0x0068:
                r2 = 5
                goto L_0x012a
            L_0x006b:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f66110b
                if (r9 == 0) goto L_0x0074
                goto L_0x0010
            L_0x0074:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.s0()
                int r9 = r9 - r10
                int r9 = java.lang.Math.abs(r9)
                int r10 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f66087F
                int r10 = r10 - r0
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x012a
                goto L_0x0010
            L_0x0094:
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00d2
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x00a5
                goto L_0x00d2
            L_0x00a5:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f66110b
                if (r9 == 0) goto L_0x00b0
            L_0x00ad:
                r2 = r4
                goto L_0x012a
            L_0x00b0:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f66087F
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f66091H
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00ad
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.d1()
                if (r9 == 0) goto L_0x012a
                goto L_0x00ad
            L_0x00d2:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.f66110b
                if (r10 == 0) goto L_0x00f5
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f66085E
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f66091H
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00ad
                goto L_0x0010
            L_0x00f5:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r10.f66087F
                if (r9 >= r0) goto L_0x0110
                int r10 = r10.f66091H
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x0107
                goto L_0x0010
            L_0x0107:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.d1()
                if (r9 == 0) goto L_0x012a
                goto L_0x00ad
            L_0x0110:
                int r10 = r9 - r0
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f66091H
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00ad
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.d1()
                if (r9 == 0) goto L_0x012a
                goto L_0x00ad
            L_0x012a:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r9.e1()
                r9.f1(r8, r2, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e.l(android.view.View, float, float):void");
        }

        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f66097M;
            if (i11 == 1 || bottomSheetBehavior.f66086E0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f66082C0 == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.f66134y0;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f66144a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f66107Y;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class f implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f66146a;

        f(int i10) {
            this.f66146a = i10;
        }

        public boolean a(View view, w.a aVar) {
            BottomSheetBehavior.this.X0(this.f66146a);
            return true;
        }
    }

    public static abstract class g {
        /* access modifiers changed from: package-private */
        public void a(View view) {
        }

        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);
    }

    public BottomSheetBehavior() {
    }

    private boolean D0(V v10) {
        ViewParent parent = v10.getParent();
        return parent != null && parent.isLayoutRequested() && C4600b0.R(v10);
    }

    private void G0(View view, t.a aVar, int i10) {
        C4600b0.k0(view, aVar, (CharSequence) null, l0(i10));
    }

    private void H0() {
        this.f66082C0 = -1;
        this.f66084D0 = -1;
        VelocityTracker velocityTracker = this.f66078A0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f66078A0 = null;
        }
    }

    private void I0(h hVar) {
        int i10 = this.f66109a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f66114f = hVar.f66149d;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f66110b = hVar.f66150e;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.f66094J = hVar.f66151f;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.f66095K = hVar.f66152g;
            }
        }
    }

    private void J0(V v10, Runnable runnable) {
        if (D0(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void Z0(View view) {
        boolean z10 = Build.VERSION.SDK_INT >= 29 && !A0() && !this.f66115g;
        if (this.f66124p || this.f66125q || this.f66126r || this.f66128t || this.f66129u || this.f66130v || z10) {
            v.c(view, new d(z10));
        }
    }

    private int b0(View view, int i10, int i11) {
        return C4600b0.c(view, view.getResources().getString(i10), l0(i11));
    }

    private boolean b1() {
        return this.f66099O != null && (this.f66096L || this.f66097M == 1);
    }

    private void d0() {
        int h02 = h0();
        if (this.f66110b) {
            this.f66091H = Math.max(this.f66106X - h02, this.f66085E);
        } else {
            this.f66091H = this.f66106X - h02;
        }
    }

    private float e0(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float a10 = (float) roundedCorner.getRadius();
            if (a10 > 0.0f && f10 > 0.0f) {
                return a10 / f10;
            }
        }
        return 0.0f;
    }

    private void f0() {
        this.f66087F = (int) (((float) this.f66106X) * (1.0f - this.f66089G));
    }

    /* access modifiers changed from: private */
    public void f1(View view, int i10, boolean z10) {
        int w02 = w0(i10);
        P2.c cVar = this.f66099O;
        if (cVar == null || (!z10 ? !cVar.Q(view, view.getLeft(), w02) : !cVar.O(view.getLeft(), w02))) {
            Y0(i10);
            return;
        }
        Y0(2);
        i1(i10, true);
        this.f66079B.c(i10);
    }

    private float g0() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.f66118j == null || (weakReference = this.f66107Y) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f66107Y.get();
        if (!y0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(e0(this.f66118j.J(), rootWindowInsets.getRoundedCorner(0)), e0(this.f66118j.K(), rootWindowInsets.getRoundedCorner(1)));
    }

    private void g1() {
        WeakReference<V> weakReference = this.f66107Y;
        if (weakReference != null) {
            h1((View) weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.f66108Z;
        if (weakReference2 != null) {
            h1(weakReference2.get(), 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = r3.f66122n;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int h0() {
        /*
            r3 = this;
            boolean r0 = r3.f66115g
            if (r0 == 0) goto L_0x001d
            int r0 = r3.f66116h
            int r1 = r3.f66106X
            int r2 = r3.f66105U
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.f66104T
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.f66131w
            int r0 = r0 + r1
            return r0
        L_0x001d:
            boolean r0 = r3.f66123o
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.f66124p
            if (r0 != 0) goto L_0x0033
            int r0 = r3.f66122n
            if (r0 <= 0) goto L_0x0033
            int r1 = r3.f66114f
            int r2 = r3.f66117i
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x0033:
            int r0 = r3.f66114f
            int r1 = r3.f66131w
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.h0():int");
    }

    private void h1(View view, int i10) {
        if (view != null) {
            k0(view, i10);
            int i11 = 6;
            if (!this.f66110b && this.f66097M != 6) {
                this.f66090G0.put(i10, b0(view, C9076j.f59558a, 6));
            }
            if (this.f66094J && C0() && this.f66097M != 5) {
                G0(view, t.a.f8854y, 5);
            }
            int i12 = this.f66097M;
            if (i12 == 3) {
                if (this.f66110b) {
                    i11 = 4;
                }
                G0(view, t.a.f8853x, i11);
            } else if (i12 == 4) {
                if (this.f66110b) {
                    i11 = 3;
                }
                G0(view, t.a.f8852w, i11);
            } else if (i12 == 6) {
                G0(view, t.a.f8853x, 4);
                G0(view, t.a.f8852w, 3);
            }
        }
    }

    private float i0(int i10) {
        float f10;
        float f11;
        int i11 = this.f66091H;
        if (i10 > i11 || i11 == s0()) {
            int i12 = this.f66091H;
            f10 = (float) (i12 - i10);
            f11 = (float) (this.f66106X - i12);
        } else {
            int i13 = this.f66091H;
            f10 = (float) (i13 - i10);
            f11 = (float) (i13 - s0());
        }
        return f10 / f11;
    }

    private void i1(int i10, boolean z10) {
        boolean z02;
        ValueAnimator valueAnimator;
        if (i10 != 2 && this.f66077A != (z02 = z0()) && this.f66118j != null) {
            this.f66077A = z02;
            float f10 = 1.0f;
            if (!z10 || (valueAnimator = this.f66081C) == null) {
                ValueAnimator valueAnimator2 = this.f66081C;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.f66081C.cancel();
                }
                C9286g gVar = this.f66118j;
                if (this.f66077A) {
                    f10 = g0();
                }
                gVar.c0(f10);
            } else if (valueAnimator.isRunning()) {
                this.f66081C.reverse();
            } else {
                float y10 = this.f66118j.y();
                if (z02) {
                    f10 = g0();
                }
                this.f66081C.setFloatValues(new float[]{y10, f10});
                this.f66081C.start();
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean j0() {
        return B0() && C0();
    }

    private void j1(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f66107Y;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z10) {
                    if (this.f66088F0 == null) {
                        this.f66088F0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i10 = 0; i10 < childCount; i10++) {
                    V childAt = coordinatorLayout.getChildAt(i10);
                    if (childAt != this.f66107Y.get()) {
                        if (z10) {
                            this.f66088F0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f66111c) {
                                C4600b0.z0(childAt, 4);
                            }
                        } else if (this.f66111c && (map = this.f66088F0) != null && map.containsKey(childAt)) {
                            C4600b0.z0(childAt, this.f66088F0.get(childAt).intValue());
                        }
                    }
                }
                if (!z10) {
                    this.f66088F0 = null;
                } else if (this.f66111c) {
                    ((View) this.f66107Y.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    private void k0(View view, int i10) {
        if (view != null) {
            C4600b0.i0(view, ImageMetadata.LENS_APERTURE);
            C4600b0.i0(view, 262144);
            C4600b0.i0(view, ImageMetadata.SHADING_MODE);
            int i11 = this.f66090G0.get(i10, -1);
            if (i11 != -1) {
                C4600b0.i0(view, i11);
                this.f66090G0.delete(i10);
            }
        }
    }

    /* access modifiers changed from: private */
    public void k1(boolean z10) {
        View view;
        if (this.f66107Y != null) {
            d0();
            if (this.f66097M == 4 && (view = (View) this.f66107Y.get()) != null) {
                if (z10) {
                    X0(4);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    private w l0(int i10) {
        return new f(i10);
    }

    private void m0(Context context) {
        if (this.f66135z != null) {
            C9286g gVar = new C9286g(this.f66135z);
            this.f66118j = gVar;
            gVar.Q(context);
            ColorStateList colorStateList = this.f66119k;
            if (colorStateList != null) {
                this.f66118j.b0(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f66118j.setTint(typedValue.data);
        }
    }

    private void n0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{g0(), 1.0f});
        this.f66081C = ofFloat;
        ofFloat.setDuration(500);
        this.f66081C.addUpdateListener(new c());
    }

    public static <V extends View> BottomSheetBehavior<V> q0(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) layoutParams).f();
            if (f10 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f10;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private int r0(int i10, int i11, int i12, int i13) {
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

    private int w0(int i10) {
        if (i10 == 3) {
            return s0();
        }
        if (i10 == 4) {
            return this.f66091H;
        }
        if (i10 == 5) {
            return this.f66106X;
        }
        if (i10 == 6) {
            return this.f66087F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float x0() {
        VelocityTracker velocityTracker = this.f66078A0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f66112d);
        return this.f66078A0.getYVelocity(this.f66082C0);
    }

    private boolean y0() {
        WeakReference<V> weakReference = this.f66107Y;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f66107Y.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private boolean z0() {
        return this.f66097M == 3 && (this.f66133y || y0());
    }

    public boolean A0() {
        return this.f66123o;
    }

    public void B(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.B(coordinatorLayout, v10, hVar.a());
        I0(hVar);
        int i10 = hVar.f66148c;
        if (i10 == 1 || i10 == 2) {
            this.f66097M = 4;
            this.f66098N = 4;
            return;
        }
        this.f66097M = i10;
        this.f66098N = i10;
    }

    public boolean B0() {
        return this.f66094J;
    }

    public Parcelable C(CoordinatorLayout coordinatorLayout, V v10) {
        return new h(super.C(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    public boolean C0() {
        return true;
    }

    public boolean E(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.f66101Q = 0;
        this.f66102R = false;
        return (i10 & 2) != 0;
    }

    public boolean E0() {
        return true;
    }

    public void F0(g gVar) {
        this.f66136z0.remove(gVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r4.getTop() <= r2.f66087F) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.f66085E) < java.lang.Math.abs(r3 - r2.f66091H)) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (d1() != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f66091H)) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.f66087F) < java.lang.Math.abs(r3 - r2.f66091H)) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.s0()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.Y0(r0)
            return
        L_0x000f:
            boolean r3 = r2.E0()
            if (r3 == 0) goto L_0x0024
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f66134y0
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x0023
            boolean r3 = r2.f66102R
            if (r3 != 0) goto L_0x0024
        L_0x0023:
            return
        L_0x0024:
            int r3 = r2.f66101Q
            r5 = 6
            if (r3 <= 0) goto L_0x0039
            boolean r3 = r2.f66110b
            if (r3 == 0) goto L_0x002f
            goto L_0x00aa
        L_0x002f:
            int r3 = r4.getTop()
            int r6 = r2.f66087F
            if (r3 <= r6) goto L_0x00aa
            goto L_0x00a9
        L_0x0039:
            boolean r3 = r2.f66094J
            if (r3 == 0) goto L_0x0049
            float r3 = r2.x0()
            boolean r3 = r2.c1(r4, r3)
            if (r3 == 0) goto L_0x0049
            r0 = 5
            goto L_0x00aa
        L_0x0049:
            int r3 = r2.f66101Q
            r6 = 4
            if (r3 != 0) goto L_0x008e
            int r3 = r4.getTop()
            boolean r1 = r2.f66110b
            if (r1 == 0) goto L_0x0068
            int r5 = r2.f66085E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f66091H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x0092
            goto L_0x00aa
        L_0x0068:
            int r1 = r2.f66087F
            if (r3 >= r1) goto L_0x007e
            int r1 = r2.f66091H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L_0x0077
            goto L_0x00aa
        L_0x0077:
            boolean r3 = r2.d1()
            if (r3 == 0) goto L_0x00a9
            goto L_0x0092
        L_0x007e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f66091H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
            goto L_0x00a9
        L_0x008e:
            boolean r3 = r2.f66110b
            if (r3 == 0) goto L_0x0094
        L_0x0092:
            r0 = r6
            goto L_0x00aa
        L_0x0094:
            int r3 = r4.getTop()
            int r0 = r2.f66087F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f66091H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
        L_0x00a9:
            r0 = r5
        L_0x00aa:
            r3 = 0
            r2.f1(r4, r0, r3)
            r2.f66102R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public boolean H(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f66097M == 1 && actionMasked == 0) {
            return true;
        }
        if (b1()) {
            this.f66099O.F(motionEvent);
        }
        if (actionMasked == 0) {
            H0();
        }
        if (this.f66078A0 == null) {
            this.f66078A0 = VelocityTracker.obtain();
        }
        this.f66078A0.addMovement(motionEvent);
        if (b1() && actionMasked == 2 && !this.f66100P && Math.abs(((float) this.f66084D0) - motionEvent.getY()) > ((float) this.f66099O.z())) {
            this.f66099O.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f66100P;
    }

    public void K0(boolean z10) {
        this.f66096L = z10;
    }

    public void L0(int i10) {
        if (i10 >= 0) {
            this.f66083D = i10;
            i1(this.f66097M, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void M0(boolean z10) {
        if (this.f66110b != z10) {
            this.f66110b = z10;
            if (this.f66107Y != null) {
                d0();
            }
            Y0((!this.f66110b || this.f66097M != 6) ? this.f66097M : 3);
            i1(this.f66097M, true);
            g1();
        }
    }

    public void N0(boolean z10) {
        this.f66123o = z10;
    }

    public void O0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f66089G = f10;
        if (this.f66107Y != null) {
            f0();
        }
    }

    public void P0(boolean z10) {
        if (this.f66094J != z10) {
            this.f66094J = z10;
            if (!z10 && this.f66097M == 5) {
                X0(4);
            }
            g1();
        }
    }

    public void Q0(int i10) {
        this.f66121m = i10;
    }

    public void R0(int i10) {
        this.f66120l = i10;
    }

    public void S0(int i10) {
        T0(i10, false);
    }

    public final void T0(int i10, boolean z10) {
        if (i10 == -1) {
            if (!this.f66115g) {
                this.f66115g = true;
            } else {
                return;
            }
        } else if (this.f66115g || this.f66114f != i10) {
            this.f66115g = false;
            this.f66114f = Math.max(0, i10);
        } else {
            return;
        }
        k1(z10);
    }

    public void U0(int i10) {
        this.f66109a = i10;
    }

    public void V0(int i10) {
        this.f66113e = i10;
    }

    public void W0(boolean z10) {
        this.f66095K = z10;
    }

    public void X0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        } else if (this.f66094J || i10 != 5) {
            int i11 = (i10 != 6 || !this.f66110b || w0(i10) > this.f66085E) ? i10 : 3;
            WeakReference<V> weakReference = this.f66107Y;
            if (weakReference == null || weakReference.get() == null) {
                Y0(i10);
                return;
            }
            View view = (View) this.f66107Y.get();
            J0(view, new a(view, i11));
        } else {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void Y0(int i10) {
        View view;
        if (this.f66097M != i10) {
            this.f66097M = i10;
            if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f66094J && i10 == 5)) {
                this.f66098N = i10;
            }
            WeakReference<V> weakReference = this.f66107Y;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i10 == 3) {
                    j1(true);
                } else if (i10 == 6 || i10 == 5 || i10 == 4) {
                    j1(false);
                }
                i1(i10, true);
                for (int i11 = 0; i11 < this.f66136z0.size(); i11++) {
                    this.f66136z0.get(i11).c(view, i10);
                }
                g1();
            }
        }
    }

    public void a() {
        C9239f fVar = this.f66080B0;
        if (fVar != null) {
            fVar.f();
        }
    }

    public boolean a1(long j10, float f10) {
        return false;
    }

    public void b(C4987b bVar) {
        C9239f fVar = this.f66080B0;
        if (fVar != null) {
            fVar.j(bVar);
        }
    }

    public void c(C4987b bVar) {
        C9239f fVar = this.f66080B0;
        if (fVar != null) {
            fVar.l(bVar);
        }
    }

    public void c0(g gVar) {
        if (!this.f66136z0.contains(gVar)) {
            this.f66136z0.add(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c1(View view, float f10) {
        if (this.f66095K) {
            return true;
        }
        if (!C0() || view.getTop() < this.f66091H) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f10 * this.f66103S)) - ((float) this.f66091H)) / ((float) h0()) > 0.5f;
    }

    public void d() {
        C9239f fVar = this.f66080B0;
        if (fVar != null) {
            C4987b c10 = fVar.c();
            int i10 = 4;
            if (c10 == null || Build.VERSION.SDK_INT < 34) {
                if (this.f66094J) {
                    i10 = 5;
                }
                X0(i10);
            } else if (this.f66094J) {
                this.f66080B0.h(c10, new b());
            } else {
                this.f66080B0.i(c10, (Animator.AnimatorListener) null);
                X0(4);
            }
        }
    }

    public boolean d1() {
        return false;
    }

    public boolean e1() {
        return true;
    }

    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f66107Y = null;
        this.f66099O = null;
        this.f66080B0 = null;
    }

    public void n() {
        super.n();
        this.f66107Y = null;
        this.f66099O = null;
        this.f66080B0 = null;
    }

    public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int i10;
        P2.c cVar;
        if (!v10.isShown() || !this.f66096L) {
            this.f66100P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            H0();
        }
        if (this.f66078A0 == null) {
            this.f66078A0 = VelocityTracker.obtain();
        }
        this.f66078A0.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f66084D0 = (int) motionEvent.getY();
            if (this.f66097M != 2) {
                WeakReference<View> weakReference = this.f66134y0;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.B(view2, x10, this.f66084D0)) {
                    this.f66082C0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f66086E0 = true;
                }
            }
            this.f66100P = this.f66082C0 == -1 && !coordinatorLayout.B(v10, x10, this.f66084D0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f66086E0 = false;
            this.f66082C0 = -1;
            if (this.f66100P) {
                this.f66100P = false;
                return false;
            }
        }
        if (!this.f66100P && (cVar = this.f66099O) != null && cVar.P(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f66134y0;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.f66100P && this.f66097M != 1 && !coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f66099O != null && (i10 = this.f66084D0) != -1 && Math.abs(((float) i10) - motionEvent.getY()) > ((float) this.f66099O.z());
    }

    /* access modifiers changed from: package-private */
    public void o0(int i10) {
        View view = (View) this.f66107Y.get();
        if (view != null && !this.f66136z0.isEmpty()) {
            float i02 = i0(i10);
            for (int i11 = 0; i11 < this.f66136z0.size(); i11++) {
                this.f66136z0.get(i11).b(view, i02);
            }
        }
    }

    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        if (C4600b0.w(coordinatorLayout) && !C4600b0.w(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.f66107Y == null) {
            this.f66116h = coordinatorLayout.getResources().getDimensionPixelSize(C9070d.f59400b);
            Z0(v10);
            C4600b0.M0(v10, new b(v10));
            this.f66107Y = new WeakReference<>(v10);
            this.f66080B0 = new C9239f(v10);
            C9286g gVar = this.f66118j;
            if (gVar != null) {
                C4600b0.t0(v10, gVar);
                C9286g gVar2 = this.f66118j;
                float f10 = this.f66093I;
                if (f10 == -1.0f) {
                    f10 = C4600b0.u(v10);
                }
                gVar2.a0(f10);
            } else {
                ColorStateList colorStateList = this.f66119k;
                if (colorStateList != null) {
                    C4600b0.u0(v10, colorStateList);
                }
            }
            g1();
            if (C4600b0.x(v10) == 0) {
                C4600b0.z0(v10, 1);
            }
        }
        if (this.f66099O == null) {
            this.f66099O = P2.c.o(coordinatorLayout, this.f66092H0);
        }
        int top = v10.getTop();
        coordinatorLayout.I(v10, i10);
        this.f66105U = coordinatorLayout.getWidth();
        this.f66106X = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.f66104T = height;
        int i11 = this.f66106X;
        int i12 = i11 - height;
        int i13 = this.f66132x;
        if (i12 < i13) {
            if (this.f66127s) {
                int i14 = this.f66121m;
                if (i14 != -1) {
                    i11 = Math.min(i11, i14);
                }
                this.f66104T = i11;
            } else {
                int i15 = i11 - i13;
                int i16 = this.f66121m;
                if (i16 != -1) {
                    i15 = Math.min(i15, i16);
                }
                this.f66104T = i15;
            }
        }
        this.f66085E = Math.max(0, this.f66106X - this.f66104T);
        f0();
        d0();
        int i17 = this.f66097M;
        if (i17 == 3) {
            C4600b0.Z(v10, s0());
        } else if (i17 == 6) {
            C4600b0.Z(v10, this.f66087F);
        } else if (this.f66094J && i17 == 5) {
            C4600b0.Z(v10, this.f66106X);
        } else if (i17 == 4) {
            C4600b0.Z(v10, this.f66091H);
        } else if (i17 == 1 || i17 == 2) {
            C4600b0.Z(v10, top - v10.getTop());
        }
        i1(this.f66097M, false);
        this.f66134y0 = new WeakReference<>(p0(v10));
        for (int i18 = 0; i18 < this.f66136z0.size(); i18++) {
            this.f66136z0.get(i18).a(v10);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public View p0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (C4600b0.T(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View p02 = p0(viewGroup.getChildAt(i10));
                if (p02 != null) {
                    return p02;
                }
            }
        }
        return null;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(r0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f66120l, marginLayoutParams.width), r0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f66121m, marginLayoutParams.height));
        return true;
    }

    public boolean s(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
        WeakReference<View> weakReference;
        if (!E0() || (weakReference = this.f66134y0) == null || view != weakReference.get()) {
            return false;
        }
        return this.f66097M != 3 || super.s(coordinatorLayout, v10, view, f10, f11);
    }

    public int s0() {
        if (this.f66110b) {
            return this.f66085E;
        }
        return Math.max(this.f66083D, this.f66127s ? 0 : this.f66132x);
    }

    /* access modifiers changed from: package-private */
    public C9286g t0() {
        return this.f66118j;
    }

    public void u(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 != 1) {
            WeakReference<View> weakReference = this.f66134y0;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (!E0() || view == view2) {
                int top = v10.getTop();
                int i13 = top - i11;
                if (i11 > 0) {
                    if (i13 < s0()) {
                        int s02 = top - s0();
                        iArr[1] = s02;
                        C4600b0.Z(v10, -s02);
                        Y0(3);
                    } else if (this.f66096L) {
                        iArr[1] = i11;
                        C4600b0.Z(v10, -i11);
                        Y0(1);
                    } else {
                        return;
                    }
                } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                    if (i13 > this.f66091H && !j0()) {
                        int i14 = top - this.f66091H;
                        iArr[1] = i14;
                        C4600b0.Z(v10, -i14);
                        Y0(4);
                    } else if (this.f66096L) {
                        iArr[1] = i11;
                        C4600b0.Z(v10, -i11);
                        Y0(1);
                    } else {
                        return;
                    }
                }
                o0(v10.getTop());
                this.f66101Q = i11;
                this.f66102R = true;
            }
        }
    }

    public int u0() {
        if (this.f66115g) {
            return -1;
        }
        return this.f66114f;
    }

    public int v0() {
        return this.f66097M;
    }

    public void x(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    private class i {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f66153a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f66154b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f66155c;

        class a implements Runnable {
            a() {
            }

            public void run() {
                boolean unused = i.this.f66154b = false;
                P2.c cVar = BottomSheetBehavior.this.f66099O;
                if (cVar == null || !cVar.m(true)) {
                    i iVar = i.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.f66097M == 2) {
                        bottomSheetBehavior.Y0(iVar.f66153a);
                        return;
                    }
                    return;
                }
                i iVar2 = i.this;
                iVar2.c(iVar2.f66153a);
            }
        }

        private i() {
            this.f66155c = new a();
        }

        /* access modifiers changed from: package-private */
        public void c(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f66107Y;
            if (weakReference != null && weakReference.get() != null) {
                this.f66153a = i10;
                if (!this.f66154b) {
                    C4600b0.g0((View) BottomSheetBehavior.this.f66107Y.get(), this.f66155c);
                    this.f66154b = true;
                }
            }
        }

        /* synthetic */ i(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    protected static class h extends O2.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        final int f66148c;

        /* renamed from: d  reason: collision with root package name */
        int f66149d;

        /* renamed from: e  reason: collision with root package name */
        boolean f66150e;

        /* renamed from: f  reason: collision with root package name */
        boolean f66151f;

        /* renamed from: g  reason: collision with root package name */
        boolean f66152g;

        class a implements Parcelable.ClassLoaderCreator<h> {
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
            this.f66148c = parcel.readInt();
            this.f66149d = parcel.readInt();
            boolean z10 = false;
            this.f66150e = parcel.readInt() == 1;
            this.f66151f = parcel.readInt() == 1;
            this.f66152g = parcel.readInt() == 1 ? true : z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f66148c);
            parcel.writeInt(this.f66149d);
            parcel.writeInt(this.f66150e ? 1 : 0);
            parcel.writeInt(this.f66151f ? 1 : 0);
            parcel.writeInt(this.f66152g ? 1 : 0);
        }

        public h(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f66148c = bottomSheetBehavior.f66097M;
            this.f66149d = bottomSheetBehavior.f66114f;
            this.f66150e = bottomSheetBehavior.f66110b;
            this.f66151f = bottomSheetBehavior.f66094J;
            this.f66152g = bottomSheetBehavior.f66095K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f66117i = context.getResources().getDimensionPixelSize(C9070d.f59429p0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9078l.f60001k0);
        if (obtainStyledAttributes.hasValue(C9078l.f60045o0)) {
            this.f66119k = Ra.c.a(context, obtainStyledAttributes, C9078l.f60045o0);
        }
        if (obtainStyledAttributes.hasValue(C9078l.f59684G0)) {
            this.f66135z = k.e(context, attributeSet, C9068b.f59331f, f66076I0).m();
        }
        m0(context);
        n0();
        this.f66093I = obtainStyledAttributes.getDimension(C9078l.f60034n0, -1.0f);
        if (obtainStyledAttributes.hasValue(C9078l.f60012l0)) {
            R0(obtainStyledAttributes.getDimensionPixelSize(C9078l.f60012l0, -1));
        }
        if (obtainStyledAttributes.hasValue(C9078l.f60023m0)) {
            Q0(obtainStyledAttributes.getDimensionPixelSize(C9078l.f60023m0, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(C9078l.f60111u0);
        if (peekValue == null || (i10 = peekValue.data) != -1) {
            S0(obtainStyledAttributes.getDimensionPixelSize(C9078l.f60111u0, -1));
        } else {
            S0(i10);
        }
        P0(obtainStyledAttributes.getBoolean(C9078l.f60100t0, false));
        N0(obtainStyledAttributes.getBoolean(C9078l.f60155y0, false));
        M0(obtainStyledAttributes.getBoolean(C9078l.f60078r0, true));
        W0(obtainStyledAttributes.getBoolean(C9078l.f60144x0, false));
        K0(obtainStyledAttributes.getBoolean(C9078l.f60056p0, true));
        U0(obtainStyledAttributes.getInt(C9078l.f60122v0, 0));
        O0(obtainStyledAttributes.getFloat(C9078l.f60089s0, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(C9078l.f60067q0);
        if (peekValue2 == null || peekValue2.type != 16) {
            L0(obtainStyledAttributes.getDimensionPixelOffset(C9078l.f60067q0, 0));
        } else {
            L0(peekValue2.data);
        }
        V0(obtainStyledAttributes.getInt(C9078l.f60133w0, 500));
        this.f66124p = obtainStyledAttributes.getBoolean(C9078l.f59640C0, false);
        this.f66125q = obtainStyledAttributes.getBoolean(C9078l.f59651D0, false);
        this.f66126r = obtainStyledAttributes.getBoolean(C9078l.f59662E0, false);
        this.f66127s = obtainStyledAttributes.getBoolean(C9078l.f59673F0, true);
        this.f66128t = obtainStyledAttributes.getBoolean(C9078l.f60166z0, false);
        this.f66129u = obtainStyledAttributes.getBoolean(C9078l.f59618A0, false);
        this.f66130v = obtainStyledAttributes.getBoolean(C9078l.f59629B0, false);
        this.f66133y = obtainStyledAttributes.getBoolean(C9078l.f59695H0, true);
        obtainStyledAttributes.recycle();
        this.f66112d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
