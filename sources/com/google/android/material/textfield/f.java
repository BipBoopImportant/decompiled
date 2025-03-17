package com.google.android.material.textfield;

import Ea.C9068b;
import Ea.C9071e;
import Ea.C9076j;
import Fa.C9081a;
import Qa.C9242i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

class f extends r {

    /* renamed from: e  reason: collision with root package name */
    private final int f67479e;

    /* renamed from: f  reason: collision with root package name */
    private final int f67480f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeInterpolator f67481g;

    /* renamed from: h  reason: collision with root package name */
    private final TimeInterpolator f67482h;

    /* renamed from: i  reason: collision with root package name */
    private EditText f67483i;

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f67484j = new a(this);

    /* renamed from: k  reason: collision with root package name */
    private final View.OnFocusChangeListener f67485k = new b(this);

    /* renamed from: l  reason: collision with root package name */
    private AnimatorSet f67486l;

    /* renamed from: m  reason: collision with root package name */
    private ValueAnimator f67487m;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationStart(Animator animator) {
            f.this.f67516b.a0(true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            f.this.f67516b.a0(false);
        }
    }

    f(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f67479e = C9242i.f(endCompoundLayout.getContext(), C9068b.f59308N, 100);
        this.f67480f = C9242i.f(endCompoundLayout.getContext(), C9068b.f59308N, 150);
        this.f67481g = C9242i.g(endCompoundLayout.getContext(), C9068b.f59313S, C9081a.f60371a);
        this.f67482h = C9242i.g(endCompoundLayout.getContext(), C9068b.f59312R, C9081a.f60374d);
    }

    private void A(boolean z10) {
        boolean z11 = this.f67516b.F() == z10;
        if (z10 && !this.f67486l.isRunning()) {
            this.f67487m.cancel();
            this.f67486l.start();
            if (z11) {
                this.f67486l.end();
            }
        } else if (!z10) {
            this.f67486l.cancel();
            this.f67487m.start();
            if (z11) {
                this.f67487m.end();
            }
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f67481g);
        ofFloat.setDuration((long) this.f67479e);
        ofFloat.addUpdateListener(new c(this));
        return ofFloat;
    }

    private ValueAnimator C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.f67482h);
        ofFloat.setDuration((long) this.f67480f);
        ofFloat.addUpdateListener(new e(this));
        return ofFloat;
    }

    private void D() {
        ValueAnimator C10 = C();
        ValueAnimator B10 = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f67486l = animatorSet;
        animatorSet.playTogether(new Animator[]{C10, B10});
        this.f67486l.addListener(new a());
        ValueAnimator B11 = B(1.0f, 0.0f);
        this.f67487m = B11;
        B11.addListener(new b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(ValueAnimator valueAnimator) {
        this.f67518d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f67518d.setScaleX(floatValue);
        this.f67518d.setScaleY(floatValue);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        EditText editText = this.f67483i;
        if (editText != null) {
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            r();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(View view, boolean z10) {
        A(J());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I() {
        A(true);
    }

    private boolean J() {
        EditText editText = this.f67483i;
        return editText != null && (editText.hasFocus() || this.f67518d.hasFocus()) && this.f67483i.getText().length() > 0;
    }

    /* access modifiers changed from: package-private */
    public void a(Editable editable) {
        if (this.f67516b.w() == null) {
            A(J());
        }
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return C9076j.f59562e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return C9071e.f59456k;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener e() {
        return this.f67485k;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return this.f67484j;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener g() {
        return this.f67485k;
    }

    public void n(EditText editText) {
        this.f67483i = editText;
        this.f67515a.setEndIconVisible(J());
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z10) {
        if (this.f67516b.w() != null) {
            A(z10);
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        D();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        EditText editText = this.f67483i;
        if (editText != null) {
            editText.post(new d(this));
        }
    }
}
