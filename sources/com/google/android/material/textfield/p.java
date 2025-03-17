package com.google.android.material.textfield;

import Ea.C9068b;
import Ea.C9071e;
import Ea.C9076j;
import Fa.C9081a;
import I2.C4600b0;
import J2.c;
import J2.t;
import Qa.C9242i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;

class p extends r {

    /* renamed from: s  reason: collision with root package name */
    private static final boolean f67499s = true;

    /* renamed from: e  reason: collision with root package name */
    private final int f67500e;

    /* renamed from: f  reason: collision with root package name */
    private final int f67501f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeInterpolator f67502g;

    /* renamed from: h  reason: collision with root package name */
    private AutoCompleteTextView f67503h;

    /* renamed from: i  reason: collision with root package name */
    private final View.OnClickListener f67504i = new l(this);

    /* renamed from: j  reason: collision with root package name */
    private final View.OnFocusChangeListener f67505j = new m(this);

    /* renamed from: k  reason: collision with root package name */
    private final c.a f67506k = new n(this);

    /* renamed from: l  reason: collision with root package name */
    private boolean f67507l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f67508m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f67509n;

    /* renamed from: o  reason: collision with root package name */
    private long f67510o = Long.MAX_VALUE;

    /* renamed from: p  reason: collision with root package name */
    private AccessibilityManager f67511p;

    /* renamed from: q  reason: collision with root package name */
    private ValueAnimator f67512q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f67513r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f67513r.start();
        }
    }

    p(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f67501f = C9242i.f(endCompoundLayout.getContext(), C9068b.f59308N, 67);
        this.f67500e = C9242i.f(endCompoundLayout.getContext(), C9068b.f59308N, 50);
        this.f67502g = C9242i.g(endCompoundLayout.getContext(), C9068b.f59313S, C9081a.f60371a);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f67502g);
        ofFloat.setDuration((long) i10);
        ofFloat.addUpdateListener(new i(this));
        return ofFloat;
    }

    private void F() {
        this.f67513r = E(this.f67501f, 0.0f, 1.0f);
        ValueAnimator E10 = E(this.f67500e, 1.0f, 0.0f);
        this.f67512q = E10;
        E10.addListener(new a());
    }

    private boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f67510o;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H() {
        boolean isPopupShowing = this.f67503h.isPopupShowing();
        O(isPopupShowing);
        this.f67508m = isPopupShowing;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        this.f67518d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        Q();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K(View view, boolean z10) {
        this.f67507l = z10;
        r();
        if (!z10) {
            O(false);
            this.f67508m = false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L(boolean z10) {
        AutoCompleteTextView autoCompleteTextView = this.f67503h;
        if (autoCompleteTextView != null && !q.a(autoCompleteTextView)) {
            C4600b0.z0(this.f67518d, z10 ? 2 : 1);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.f67508m = false;
            }
            Q();
            R();
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N() {
        R();
        O(false);
    }

    private void O(boolean z10) {
        if (this.f67509n != z10) {
            this.f67509n = z10;
            this.f67513r.cancel();
            this.f67512q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void P() {
        this.f67503h.setOnTouchListener(new j(this));
        if (f67499s) {
            this.f67503h.setOnDismissListener(new k(this));
        }
        this.f67503h.setThreshold(0);
    }

    private void Q() {
        if (this.f67503h != null) {
            if (G()) {
                this.f67508m = false;
            }
            if (!this.f67508m) {
                if (f67499s) {
                    O(!this.f67509n);
                } else {
                    this.f67509n = !this.f67509n;
                    r();
                }
                if (this.f67509n) {
                    this.f67503h.requestFocus();
                    this.f67503h.showDropDown();
                    return;
                }
                this.f67503h.dismissDropDown();
                return;
            }
            this.f67508m = false;
        }
    }

    private void R() {
        this.f67508m = true;
        this.f67510o = System.currentTimeMillis();
    }

    public void a(Editable editable) {
        if (this.f67511p.isTouchExplorationEnabled() && q.a(this.f67503h) && !this.f67518d.hasFocus()) {
            this.f67503h.dismissDropDown();
        }
        this.f67503h.post(new o(this));
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return C9076j.f59564g;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return f67499s ? C9071e.f59454i : C9071e.f59455j;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener e() {
        return this.f67505j;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return this.f67504i;
    }

    public c.a h() {
        return this.f67506k;
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i10) {
        return i10 != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f67507l;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f67509n;
    }

    public void n(EditText editText) {
        this.f67503h = D(editText);
        P();
        this.f67515a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f67511p.isTouchExplorationEnabled()) {
            C4600b0.z0(this.f67518d, 2);
        }
        this.f67515a.setEndIconVisible(true);
    }

    public void o(View view, t tVar) {
        if (!q.a(this.f67503h)) {
            tVar.i0(Spinner.class.getName());
        }
        if (tVar.S()) {
            tVar.w0((CharSequence) null);
        }
    }

    @SuppressLint({"WrongConstant"})
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (this.f67511p.isEnabled() && !q.a(this.f67503h)) {
            boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f67509n && !this.f67503h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z10) {
                Q();
                R();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        F();
        this.f67511p = (AccessibilityManager) this.f67517c.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.f67503h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            if (f67499s) {
                this.f67503h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
            }
        }
    }
}
