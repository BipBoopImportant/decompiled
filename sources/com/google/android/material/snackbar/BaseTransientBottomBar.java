package com.google.android.material.snackbar;

import Ea.C9068b;
import Ea.C9070d;
import Ea.C9074h;
import Ea.C9078l;
import Fa.C9081a;
import I2.C0;
import I2.C4597a;
import I2.C4600b0;
import I2.I;
import J2.t;
import La.C9138a;
import Qa.C9242i;
import Ua.C9286g;
import Xa.C9359a;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.v;
import com.google.android.material.internal.w;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.d;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import y2.C6260a;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: A  reason: collision with root package name */
    private static final TimeInterpolator f67143A = C9081a.f60372b;

    /* renamed from: B  reason: collision with root package name */
    private static final TimeInterpolator f67144B = C9081a.f60371a;

    /* renamed from: C  reason: collision with root package name */
    private static final TimeInterpolator f67145C = C9081a.f60374d;

    /* renamed from: D  reason: collision with root package name */
    static final Handler f67146D = new Handler(Looper.getMainLooper(), new h());
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public static final boolean f67147E = false;

    /* renamed from: F  reason: collision with root package name */
    private static final int[] f67148F = {C9068b.f59320Z};
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public static final String f67149G = BaseTransientBottomBar.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f67150a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f67151b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f67152c;

    /* renamed from: d  reason: collision with root package name */
    private final TimeInterpolator f67153d;

    /* renamed from: e  reason: collision with root package name */
    private final TimeInterpolator f67154e;

    /* renamed from: f  reason: collision with root package name */
    private final TimeInterpolator f67155f;

    /* renamed from: g  reason: collision with root package name */
    private final ViewGroup f67156g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Context f67157h;

    /* renamed from: i  reason: collision with root package name */
    protected final SnackbarBaseLayout f67158i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final a f67159j;

    /* renamed from: k  reason: collision with root package name */
    private int f67160k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f67161l;

    /* renamed from: m  reason: collision with root package name */
    private q f67162m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f67163n = false;

    /* renamed from: o  reason: collision with root package name */
    private final Runnable f67164o = new i();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public int f67165p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public int f67166q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public int f67167r;

    /* renamed from: s  reason: collision with root package name */
    private int f67168s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public int f67169t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public int f67170u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f67171v;

    /* renamed from: w  reason: collision with root package name */
    private List<r<B>> f67172w;

    /* renamed from: x  reason: collision with root package name */
    private Behavior f67173x;

    /* renamed from: y  reason: collision with root package name */
    private final AccessibilityManager f67174y;

    /* renamed from: z  reason: collision with root package name */
    d.b f67175z = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: l  reason: collision with root package name */
        private final s f67176l = new s(this);

        /* access modifiers changed from: private */
        public void U(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f67176l.c(baseTransientBottomBar);
        }

        public boolean J(View view) {
            return this.f67176l.a(view);
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f67176l.b(coordinatorLayout, view, motionEvent);
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    protected static class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: l  reason: collision with root package name */
        private static final View.OnTouchListener f67177l = new a();

        /* renamed from: a  reason: collision with root package name */
        private BaseTransientBottomBar<?> f67178a;

        /* renamed from: b  reason: collision with root package name */
        Ua.k f67179b;

        /* renamed from: c  reason: collision with root package name */
        private int f67180c;

        /* renamed from: d  reason: collision with root package name */
        private final float f67181d;

        /* renamed from: e  reason: collision with root package name */
        private final float f67182e;

        /* renamed from: f  reason: collision with root package name */
        private final int f67183f;

        /* renamed from: g  reason: collision with root package name */
        private final int f67184g;

        /* renamed from: h  reason: collision with root package name */
        private ColorStateList f67185h;

        /* renamed from: i  reason: collision with root package name */
        private PorterDuff.Mode f67186i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public Rect f67187j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f67188k;

        class a implements View.OnTouchListener {
            a() {
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(C9359a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C9078l.f59837U6);
            if (obtainStyledAttributes.hasValue(C9078l.f59909b7)) {
                C4600b0.x0(this, (float) obtainStyledAttributes.getDimensionPixelSize(C9078l.f59909b7, 0));
            }
            this.f67180c = obtainStyledAttributes.getInt(C9078l.f59867X6, 0);
            if (obtainStyledAttributes.hasValue(C9078l.f59931d7) || obtainStyledAttributes.hasValue(C9078l.f59942e7)) {
                this.f67179b = Ua.k.e(context2, attributeSet, 0, 0).m();
            }
            this.f67181d = obtainStyledAttributes.getFloat(C9078l.f59877Y6, 1.0f);
            setBackgroundTintList(Ra.c.a(context2, obtainStyledAttributes, C9078l.f59887Z6));
            setBackgroundTintMode(v.k(obtainStyledAttributes.getInt(C9078l.f59898a7, -1), PorterDuff.Mode.SRC_IN));
            this.f67182e = obtainStyledAttributes.getFloat(C9078l.f59857W6, 1.0f);
            this.f67183f = obtainStyledAttributes.getDimensionPixelSize(C9078l.f59847V6, -1);
            this.f67184g = obtainStyledAttributes.getDimensionPixelSize(C9078l.f59920c7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f67177l);
            setFocusable(true);
            if (getBackground() == null) {
                C4600b0.t0(this, d());
            }
        }

        private Drawable d() {
            int k10 = C9138a.k(this, C9068b.f59352q, C9068b.f59345m, getBackgroundOverlayColorAlpha());
            Ua.k kVar = this.f67179b;
            Drawable j10 = kVar != null ? BaseTransientBottomBar.z(k10, kVar) : BaseTransientBottomBar.y(k10, getResources());
            if (this.f67185h == null) {
                return C6260a.r(j10);
            }
            Drawable r10 = C6260a.r(j10);
            C6260a.o(r10, this.f67185h);
            return r10;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f67187j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f67178a = baseTransientBottomBar;
        }

        /* access modifiers changed from: package-private */
        public void c(ViewGroup viewGroup) {
            this.f67188k = true;
            viewGroup.addView(this);
            this.f67188k = false;
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f67182e;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f67180c;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f67181d;
        }

        /* access modifiers changed from: package-private */
        public int getMaxInlineActionWidth() {
            return this.f67184g;
        }

        /* access modifiers changed from: package-private */
        public int getMaxWidth() {
            return this.f67183f;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f67178a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.Q();
            }
            C4600b0.l0(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f67178a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.R();
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f67178a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.S();
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i10, int i11) {
            int i12;
            super.onMeasure(i10, i11);
            if (this.f67183f > 0 && getMeasuredWidth() > (i12 = this.f67183f)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, CatalogRepository.FETCH_FLAG_SDB), i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i10) {
            this.f67180c = i10;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f67185h == null)) {
                drawable = C6260a.r(drawable.mutate());
                C6260a.o(drawable, this.f67185h);
                C6260a.p(drawable, this.f67186i);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f67185h = colorStateList;
            if (getBackground() != null) {
                Drawable r10 = C6260a.r(getBackground().mutate());
                C6260a.o(r10, colorStateList);
                C6260a.p(r10, this.f67186i);
                if (r10 != getBackground()) {
                    super.setBackgroundDrawable(r10);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f67186i = mode;
            if (getBackground() != null) {
                Drawable r10 = C6260a.r(getBackground().mutate());
                C6260a.p(r10, mode);
                if (r10 != getBackground()) {
                    super.setBackgroundDrawable(r10);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f67188k && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                e((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f67178a;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.i0();
                }
            }
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f67177l);
            super.setOnClickListener(onClickListener);
        }
    }

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f67189a;

        a(int i10) {
            this.f67189a = i10;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.T(this.f67189a);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f67158i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f67158i.setScaleX(floatValue);
            BaseTransientBottomBar.this.f67158i.setScaleY(floatValue);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.U();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f67159j.a(BaseTransientBottomBar.this.f67152c - BaseTransientBottomBar.this.f67150a, BaseTransientBottomBar.this.f67150a);
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private int f67194a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f67195b;

        e(int i10) {
            this.f67195b = i10;
            this.f67194a = i10;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f67147E) {
                C4600b0.Z(BaseTransientBottomBar.this.f67158i, intValue - this.f67194a);
            } else {
                BaseTransientBottomBar.this.f67158i.setTranslationY((float) intValue);
            }
            this.f67194a = intValue;
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f67197a;

        f(int i10) {
            this.f67197a = i10;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.T(this.f67197a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f67159j.b(0, BaseTransientBottomBar.this.f67151b);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private int f67199a = 0;

        g() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f67147E) {
                C4600b0.Z(BaseTransientBottomBar.this.f67158i, intValue - this.f67199a);
            } else {
                BaseTransientBottomBar.this.f67158i.setTranslationY((float) intValue);
            }
            this.f67199a = intValue;
        }
    }

    class h implements Handler.Callback {
        h() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).c0();
                return true;
            } else if (i10 != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).N(message.arg1);
                return true;
            }
        }
    }

    class i implements Runnable {
        i() {
        }

        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f67158i != null && baseTransientBottomBar.f67157h != null) {
                int height = (w.a(BaseTransientBottomBar.this.f67157h).height() - BaseTransientBottomBar.this.L()) + ((int) BaseTransientBottomBar.this.f67158i.getTranslationY());
                if (height >= BaseTransientBottomBar.this.f67169t) {
                    BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                    int unused = baseTransientBottomBar2.f67170u = baseTransientBottomBar2.f67169t;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f67158i.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f67149G, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
                int unused2 = baseTransientBottomBar3.f67170u = baseTransientBottomBar3.f67169t;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f67169t - height;
                BaseTransientBottomBar.this.f67158i.requestLayout();
            }
        }
    }

    class j implements I {
        j() {
        }

        public C0 a(View view, C0 c02) {
            int unused = BaseTransientBottomBar.this.f67165p = c02.j();
            int unused2 = BaseTransientBottomBar.this.f67166q = c02.k();
            int unused3 = BaseTransientBottomBar.this.f67167r = c02.l();
            BaseTransientBottomBar.this.i0();
            return c02;
        }
    }

    class k extends C4597a {
        k() {
        }

        public void g(View view, t tVar) {
            super.g(view, tVar);
            tVar.a(ImageMetadata.SHADING_MODE);
            tVar.o0(true);
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.j(view, i10, bundle);
            }
            BaseTransientBottomBar.this.A();
            return true;
        }
    }

    class l implements d.b {
        l() {
        }

        public void a() {
            Handler handler = BaseTransientBottomBar.f67146D;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        public void b(int i10) {
            Handler handler = BaseTransientBottomBar.f67146D;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }
    }

    class m implements Runnable {
        m() {
        }

        public void run() {
            BaseTransientBottomBar.this.T(3);
        }
    }

    class n implements SwipeDismissBehavior.c {
        n() {
        }

        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.B(0);
        }

        public void b(int i10) {
            if (i10 == 0) {
                d.c().k(BaseTransientBottomBar.this.f67175z);
            } else if (i10 == 1 || i10 == 2) {
                d.c().j(BaseTransientBottomBar.this.f67175z);
            }
        }
    }

    class o implements Runnable {
        o() {
        }

        public void run() {
            SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.f67158i;
            if (snackbarBaseLayout != null) {
                if (snackbarBaseLayout.getParent() != null) {
                    BaseTransientBottomBar.this.f67158i.setVisibility(0);
                }
                if (BaseTransientBottomBar.this.f67158i.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.e0();
                } else {
                    BaseTransientBottomBar.this.g0();
                }
            }
        }
    }

    class p extends AnimatorListenerAdapter {
        p() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.U();
        }
    }

    static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<BaseTransientBottomBar> f67209a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<View> f67210b;

        private q(BaseTransientBottomBar baseTransientBottomBar, View view) {
            this.f67209a = new WeakReference<>(baseTransientBottomBar);
            this.f67210b = new WeakReference<>(view);
        }

        static q a(BaseTransientBottomBar baseTransientBottomBar, View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (C4600b0.R(view)) {
                v.b(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        private boolean d() {
            if (this.f67209a.get() != null) {
                return false;
            }
            c();
            return true;
        }

        /* access modifiers changed from: package-private */
        public View b() {
            return this.f67210b.get();
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (this.f67210b.get() != null) {
                this.f67210b.get().removeOnAttachStateChangeListener(this);
                v.l(this.f67210b.get(), this);
            }
            this.f67210b.clear();
            this.f67209a.clear();
        }

        public void onGlobalLayout() {
            if (!d() && this.f67209a.get().f67163n) {
                this.f67209a.get().V();
            }
        }

        public void onViewAttachedToWindow(View view) {
            if (!d()) {
                v.b(view, this);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (!d()) {
                v.l(view, this);
            }
        }
    }

    public static abstract class r<B> {
        public void a(B b10, int i10) {
        }

        public void b(B b10) {
        }
    }

    public static class s {

        /* renamed from: a  reason: collision with root package name */
        private d.b f67211a;

        public s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.Q(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.R(0);
        }

        public boolean a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    d.c().k(this.f67211a);
                }
            } else if (coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                d.c().j(this.f67211a);
            }
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f67211a = baseTransientBottomBar.f67175z;
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f67156g = viewGroup;
            this.f67159j = aVar;
            this.f67157h = context;
            com.google.android.material.internal.s.a(context);
            SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(I(), viewGroup, false);
            this.f67158i = snackbarBaseLayout;
            snackbarBaseLayout.setBaseTransientBottomBar(this);
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                snackbarContentLayout.c(snackbarBaseLayout.getActionTextColorAlpha());
                snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
            }
            snackbarBaseLayout.addView(view);
            C4600b0.r0(snackbarBaseLayout, 1);
            C4600b0.z0(snackbarBaseLayout, 1);
            C4600b0.y0(snackbarBaseLayout, true);
            C4600b0.E0(snackbarBaseLayout, new j());
            C4600b0.p0(snackbarBaseLayout, new k());
            this.f67174y = (AccessibilityManager) context.getSystemService("accessibility");
            this.f67152c = C9242i.f(context, C9068b.f59302H, 250);
            this.f67150a = C9242i.f(context, C9068b.f59302H, 150);
            this.f67151b = C9242i.f(context, C9068b.f59303I, 75);
            this.f67153d = C9242i.g(context, C9068b.f59312R, f67144B);
            this.f67155f = C9242i.g(context, C9068b.f59312R, f67145C);
            this.f67154e = C9242i.g(context, C9068b.f59312R, f67143A);
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    private ValueAnimator C(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f67153d);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    private ValueAnimator H(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f67155f);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    private int J() {
        int height = this.f67158i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f67158i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: private */
    public int L() {
        int[] iArr = new int[2];
        this.f67158i.getLocationInWindow(iArr);
        return iArr[1] + this.f67158i.getHeight();
    }

    private boolean P() {
        ViewGroup.LayoutParams layoutParams = this.f67158i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    /* access modifiers changed from: private */
    public void V() {
        this.f67168s = x();
        i0();
    }

    private void Y(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f67173x;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = G();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).U(this);
        }
        swipeDismissBehavior.P(new n());
        fVar.o(swipeDismissBehavior);
        if (D() == null) {
            fVar.f20924g = 80;
        }
    }

    private boolean a0() {
        return this.f67169t > 0 && !this.f67161l && P();
    }

    private void d0() {
        if (Z()) {
            v();
            return;
        }
        if (this.f67158i.getParent() != null) {
            this.f67158i.setVisibility(0);
        }
        U();
    }

    /* access modifiers changed from: private */
    public void e0() {
        ValueAnimator C10 = C(0.0f, 1.0f);
        ValueAnimator H10 = H(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{C10, H10});
        animatorSet.setDuration((long) this.f67150a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void f0(int i10) {
        ValueAnimator C10 = C(1.0f, 0.0f);
        C10.setDuration((long) this.f67151b);
        C10.addListener(new a(i10));
        C10.start();
    }

    /* access modifiers changed from: private */
    public void g0() {
        int J10 = J();
        if (f67147E) {
            C4600b0.Z(this.f67158i, J10);
        } else {
            this.f67158i.setTranslationY((float) J10);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{J10, 0});
        valueAnimator.setInterpolator(this.f67154e);
        valueAnimator.setDuration((long) this.f67152c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(J10));
        valueAnimator.start();
    }

    private void h0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, J()});
        valueAnimator.setInterpolator(this.f67154e);
        valueAnimator.setDuration((long) this.f67152c);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* access modifiers changed from: private */
    public void i0() {
        ViewGroup.LayoutParams layoutParams = this.f67158i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(f67149G, "Unable to update margins because layout params are not MarginLayoutParams");
        } else if (this.f67158i.f67187j == null) {
            Log.w(f67149G, "Unable to update margins because original view margins are not set");
        } else if (this.f67158i.getParent() != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i10 = this.f67158i.f67187j.bottom + (D() != null ? this.f67168s : this.f67165p);
            int i11 = this.f67158i.f67187j.left + this.f67166q;
            int i12 = this.f67158i.f67187j.right + this.f67167r;
            int i13 = this.f67158i.f67187j.top;
            boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
            if (z10) {
                marginLayoutParams.bottomMargin = i10;
                marginLayoutParams.leftMargin = i11;
                marginLayoutParams.rightMargin = i12;
                marginLayoutParams.topMargin = i13;
                this.f67158i.requestLayout();
            }
            if ((z10 || this.f67170u != this.f67169t) && Build.VERSION.SDK_INT >= 29 && a0()) {
                this.f67158i.removeCallbacks(this.f67164o);
                this.f67158i.post(this.f67164o);
            }
        }
    }

    private void w(int i10) {
        if (this.f67158i.getAnimationMode() == 1) {
            f0(i10);
        } else {
            h0(i10);
        }
    }

    private int x() {
        if (D() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        D().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f67156g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f67156g.getHeight()) - i10;
    }

    /* access modifiers changed from: private */
    public static GradientDrawable y(int i10, Resources resources) {
        float dimension = resources.getDimension(C9070d.f59433r0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* access modifiers changed from: private */
    public static C9286g z(int i10, Ua.k kVar) {
        C9286g gVar = new C9286g(kVar);
        gVar.b0(ColorStateList.valueOf(i10));
        return gVar;
    }

    public void A() {
        B(3);
    }

    /* access modifiers changed from: protected */
    public void B(int i10) {
        d.c().b(this.f67175z, i10);
    }

    public View D() {
        q qVar = this.f67162m;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public Context E() {
        return this.f67157h;
    }

    public int F() {
        return this.f67160k;
    }

    /* access modifiers changed from: protected */
    public SwipeDismissBehavior<? extends View> G() {
        return new Behavior();
    }

    /* access modifiers changed from: protected */
    public int I() {
        return M() ? C9074h.f59512A : C9074h.f59518b;
    }

    public View K() {
        return this.f67158i;
    }

    /* access modifiers changed from: protected */
    public boolean M() {
        TypedArray obtainStyledAttributes = this.f67157h.obtainStyledAttributes(f67148F);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* access modifiers changed from: package-private */
    public final void N(int i10) {
        if (!Z() || this.f67158i.getVisibility() != 0) {
            T(i10);
        } else {
            w(i10);
        }
    }

    public boolean O() {
        return d.c().e(this.f67175z);
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.f67158i.getRootWindowInsets()) != null) {
            this.f67169t = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            i0();
        }
    }

    /* access modifiers changed from: package-private */
    public void R() {
        if (O()) {
            f67146D.post(new m());
        }
    }

    /* access modifiers changed from: package-private */
    public void S() {
        if (this.f67171v) {
            d0();
            this.f67171v = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void T(int i10) {
        d.c().h(this.f67175z);
        List<r<B>> list = this.f67172w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f67172w.get(size).a(this, i10);
            }
        }
        ViewParent parent = this.f67158i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f67158i);
        }
    }

    /* access modifiers changed from: package-private */
    public void U() {
        d.c().i(this.f67175z);
        List<r<B>> list = this.f67172w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f67172w.get(size).b(this);
            }
        }
    }

    public B W(View view) {
        q qVar = this.f67162m;
        if (qVar != null) {
            qVar.c();
        }
        this.f67162m = view == null ? null : q.a(this, view);
        return this;
    }

    public B X(int i10) {
        this.f67160k = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean Z() {
        AccessibilityManager accessibilityManager = this.f67174y;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void b0() {
        d.c().m(F(), this.f67175z);
    }

    /* access modifiers changed from: package-private */
    public final void c0() {
        if (this.f67158i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f67158i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                Y((CoordinatorLayout.f) layoutParams);
            }
            this.f67158i.c(this.f67156g);
            V();
            this.f67158i.setVisibility(4);
        }
        if (C4600b0.S(this.f67158i)) {
            d0();
        } else {
            this.f67171v = true;
        }
    }

    public B u(r<B> rVar) {
        if (rVar == null) {
            return this;
        }
        if (this.f67172w == null) {
            this.f67172w = new ArrayList();
        }
        this.f67172w.add(rVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        this.f67158i.post(new o());
    }
}
