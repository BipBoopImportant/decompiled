package com.google.android.material.bottomsheet;

import Ea.C9068b;
import Ea.C9072f;
import Ea.C9074h;
import Ea.C9077k;
import I2.C0;
import I2.C4597a;
import I2.C4600b0;
import I2.C4626o0;
import I2.I;
import J2.t;
import La.C9138a;
import Qa.C9236c;
import Ua.C9286g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.p;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.v;
import com.google.ar.core.ImageMetadata;

public class a extends p {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f66160f;

    /* renamed from: g  reason: collision with root package name */
    private FrameLayout f66161g;

    /* renamed from: h  reason: collision with root package name */
    private CoordinatorLayout f66162h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public FrameLayout f66163i;

    /* renamed from: j  reason: collision with root package name */
    boolean f66164j;

    /* renamed from: k  reason: collision with root package name */
    boolean f66165k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f66166l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f66167m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public f f66168n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f66169o;

    /* renamed from: p  reason: collision with root package name */
    private C9236c f66170p;

    /* renamed from: q  reason: collision with root package name */
    private BottomSheetBehavior.g f66171q;

    /* renamed from: com.google.android.material.bottomsheet.a$a  reason: collision with other inner class name */
    class C1161a implements I {
        C1161a() {
        }

        public C0 a(View view, C0 c02) {
            if (a.this.f66168n != null) {
                a.this.f66160f.F0(a.this.f66168n);
            }
            if (c02 != null) {
                a aVar = a.this;
                f unused = aVar.f66168n = new f(aVar.f66163i, c02, (C1161a) null);
                a.this.f66168n.e(a.this.getWindow());
                a.this.f66160f.c0(a.this.f66168n);
            }
            return c02;
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f66165k && aVar.isShowing() && a.this.s()) {
                a.this.cancel();
            }
        }
    }

    class c extends C4597a {
        c() {
        }

        public void g(View view, t tVar) {
            super.g(view, tVar);
            if (a.this.f66165k) {
                tVar.a(ImageMetadata.SHADING_MODE);
                tVar.o0(true);
                return;
            }
            tVar.o0(false);
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                a aVar = a.this;
                if (aVar.f66165k) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i10, bundle);
        }
    }

    class d implements View.OnTouchListener {
        d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class e extends BottomSheetBehavior.g {
        e() {
        }

        public void b(View view, float f10) {
        }

        public void c(View view, int i10) {
            if (i10 == 5) {
                a.this.cancel();
            }
        }
    }

    private static class f extends BottomSheetBehavior.g {

        /* renamed from: a  reason: collision with root package name */
        private final Boolean f66177a;

        /* renamed from: b  reason: collision with root package name */
        private final C0 f66178b;

        /* renamed from: c  reason: collision with root package name */
        private Window f66179c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f66180d;

        /* synthetic */ f(View view, C0 c02, C1161a aVar) {
            this(view, c02);
        }

        private void d(View view) {
            if (view.getTop() < this.f66178b.m()) {
                Window window = this.f66179c;
                if (window != null) {
                    Boolean bool = this.f66177a;
                    com.google.android.material.internal.e.f(window, bool == null ? this.f66180d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f66178b.m() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                Window window2 = this.f66179c;
                if (window2 != null) {
                    com.google.android.material.internal.e.f(window2, this.f66180d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            d(view);
        }

        public void b(View view, float f10) {
            d(view);
        }

        public void c(View view, int i10) {
            d(view);
        }

        /* access modifiers changed from: package-private */
        public void e(Window window) {
            if (this.f66179c != window) {
                this.f66179c = window;
                if (window != null) {
                    this.f66180d = C4626o0.a(window, window.getDecorView()).b();
                }
            }
        }

        private f(View view, C0 c02) {
            ColorStateList colorStateList;
            this.f66178b = c02;
            C9286g t02 = BottomSheetBehavior.q0(view).t0();
            if (t02 != null) {
                colorStateList = t02.x();
            } else {
                colorStateList = C4600b0.r(view);
            }
            if (colorStateList != null) {
                this.f66177a = Boolean.valueOf(C9138a.h(colorStateList.getDefaultColor()));
                return;
            }
            Integer e10 = v.e(view);
            if (e10 != null) {
                this.f66177a = Boolean.valueOf(C9138a.h(e10.intValue()));
            } else {
                this.f66177a = null;
            }
        }
    }

    public a(Context context) {
        this(context, 0);
        this.f66169o = getContext().getTheme().obtainStyledAttributes(new int[]{C9068b.f59357v}).getBoolean(0, false);
    }

    private static int f(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C9068b.f59329e, typedValue, true) ? typedValue.resourceId : C9077k.f59597g;
    }

    private FrameLayout n() {
        if (this.f66161g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C9074h.f59517a, (ViewGroup) null);
            this.f66161g = frameLayout;
            this.f66162h = (CoordinatorLayout) frameLayout.findViewById(C9072f.f59487e);
            FrameLayout frameLayout2 = (FrameLayout) this.f66161g.findViewById(C9072f.f59488f);
            this.f66163i = frameLayout2;
            BottomSheetBehavior<FrameLayout> q02 = BottomSheetBehavior.q0(frameLayout2);
            this.f66160f = q02;
            q02.c0(this.f66171q);
            this.f66160f.P0(this.f66165k);
            this.f66170p = new C9236c(this.f66160f, this.f66163i);
        }
        return this.f66161g;
    }

    private void t() {
        C9236c cVar = this.f66170p;
        if (cVar != null) {
            if (this.f66165k) {
                cVar.c();
            } else {
                cVar.f();
            }
        }
    }

    private View u(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        n();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f66161g.findViewById(C9072f.f59487e);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, coordinatorLayout, false);
        }
        if (this.f66169o) {
            C4600b0.E0(this.f66163i, new C1161a());
        }
        this.f66163i.removeAllViews();
        if (layoutParams == null) {
            this.f66163i.addView(view);
        } else {
            this.f66163i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C9072f.f59481X).setOnClickListener(new b());
        C4600b0.p0(this.f66163i, new c());
        this.f66163i.setOnTouchListener(new d());
        return this.f66161g;
    }

    public void cancel() {
        BottomSheetBehavior<FrameLayout> o10 = o();
        if (!this.f66164j || o10.v0() == 5) {
            super.cancel();
        } else {
            o10.X0(5);
        }
    }

    public BottomSheetBehavior<FrameLayout> o() {
        if (this.f66160f == null) {
            n();
        }
        return this.f66160f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f66169o && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f66161g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f66162h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            C4626o0.b(window, !z10);
            f fVar = this.f66168n;
            if (fVar != null) {
                fVar.e(window);
            }
        }
        t();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public void onDetachedFromWindow() {
        f fVar = this.f66168n;
        if (fVar != null) {
            fVar.e((Window) null);
        }
        C9236c cVar = this.f66170p;
        if (cVar != null) {
            cVar.f();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f66160f;
        if (bottomSheetBehavior != null && bottomSheetBehavior.v0() == 5) {
            this.f66160f.X0(4);
        }
    }

    public boolean p() {
        return this.f66164j;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f66160f.F0(this.f66171q);
    }

    public void r(boolean z10) {
        this.f66164j = z10;
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        if (!this.f66167m) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f66166l = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f66167m = true;
        }
        return this.f66166l;
    }

    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f66165k != z10) {
            this.f66165k = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f66160f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.P0(z10);
            }
            if (getWindow() != null) {
                t();
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f66165k) {
            this.f66165k = true;
        }
        this.f66166l = z10;
        this.f66167m = true;
    }

    public void setContentView(int i10) {
        super.setContentView(u(i10, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(u(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(u(0, view, layoutParams));
    }

    public a(Context context, int i10) {
        super(context, f(context, i10));
        this.f66165k = true;
        this.f66166l = true;
        this.f66171q = new e();
        i(1);
        this.f66169o = getContext().getTheme().obtainStyledAttributes(new int[]{C9068b.f59357v}).getBoolean(0, false);
    }
}
