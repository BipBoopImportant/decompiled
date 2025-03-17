package com.google.android.material.textfield;

import Ea.C9068b;
import Ea.C9070d;
import Ea.C9072f;
import Fa.C9081a;
import Fa.C9082b;
import I2.C4600b0;
import Qa.C9242i;
import Ra.c;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.i;
import java.util.ArrayList;
import java.util.List;

final class t {

    /* renamed from: A  reason: collision with root package name */
    private ColorStateList f67519A;

    /* renamed from: B  reason: collision with root package name */
    private Typeface f67520B;

    /* renamed from: a  reason: collision with root package name */
    private final int f67521a;

    /* renamed from: b  reason: collision with root package name */
    private final int f67522b;

    /* renamed from: c  reason: collision with root package name */
    private final int f67523c;

    /* renamed from: d  reason: collision with root package name */
    private final TimeInterpolator f67524d;

    /* renamed from: e  reason: collision with root package name */
    private final TimeInterpolator f67525e;

    /* renamed from: f  reason: collision with root package name */
    private final TimeInterpolator f67526f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f67527g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f67528h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f67529i;

    /* renamed from: j  reason: collision with root package name */
    private int f67530j;

    /* renamed from: k  reason: collision with root package name */
    private FrameLayout f67531k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public Animator f67532l;

    /* renamed from: m  reason: collision with root package name */
    private final float f67533m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f67534n;

    /* renamed from: o  reason: collision with root package name */
    private int f67535o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f67536p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f67537q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public TextView f67538r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f67539s;

    /* renamed from: t  reason: collision with root package name */
    private int f67540t;

    /* renamed from: u  reason: collision with root package name */
    private int f67541u;

    /* renamed from: v  reason: collision with root package name */
    private ColorStateList f67542v;

    /* renamed from: w  reason: collision with root package name */
    private CharSequence f67543w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f67544x;

    /* renamed from: y  reason: collision with root package name */
    private TextView f67545y;

    /* renamed from: z  reason: collision with root package name */
    private int f67546z;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f67547a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f67548b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f67549c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f67550d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f67547a = i10;
            this.f67548b = textView;
            this.f67549c = i11;
            this.f67550d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = t.this.f67534n = this.f67547a;
            Animator unused2 = t.this.f67532l = null;
            TextView textView = this.f67548b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f67549c == 1 && t.this.f67538r != null) {
                    t.this.f67538r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f67550d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f67550d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f67550d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f67550d.setAlpha(0.0f);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = t.this.f67528h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f67527g = context;
        this.f67528h = textInputLayout;
        this.f67533m = (float) context.getResources().getDimensionPixelSize(C9070d.f59418k);
        this.f67521a = C9242i.f(context, C9068b.f59309O, 217);
        this.f67522b = C9242i.f(context, C9068b.f59305K, 167);
        this.f67523c = C9242i.f(context, C9068b.f59309O, 167);
        this.f67524d = C9242i.g(context, C9068b.f59311Q, C9081a.f60374d);
        int i10 = C9068b.f59311Q;
        TimeInterpolator timeInterpolator = C9081a.f60371a;
        this.f67525e = C9242i.g(context, i10, timeInterpolator);
        this.f67526f = C9242i.g(context, C9068b.f59313S, timeInterpolator);
    }

    private void D(int i10, int i11) {
        TextView m10;
        TextView m11;
        if (i10 != i11) {
            if (!(i11 == 0 || (m11 = m(i11)) == null)) {
                m11.setVisibility(0);
                m11.setAlpha(1.0f);
            }
            if (!(i10 == 0 || (m10 = m(i10)) == null)) {
                m10.setVisibility(4);
                if (i10 == 1) {
                    m10.setText((CharSequence) null);
                }
            }
            this.f67534n = i11;
        }
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        return C4600b0.S(this.f67528h) && this.f67528h.isEnabled() && (this.f67535o != this.f67534n || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private void S(int i10, int i11, boolean z10) {
        boolean z11 = z10;
        if (i10 != i11) {
            if (z11) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f67532l = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i12 = i10;
                int i13 = i11;
                i(arrayList2, this.f67544x, this.f67545y, 2, i12, i13);
                i(arrayList2, this.f67537q, this.f67538r, 1, i12, i13);
                C9082b.a(animatorSet, arrayList);
                animatorSet.addListener(new a(i11, m(i10), i10, m(i11)));
                animatorSet.start();
            } else {
                D(i10, i11);
            }
            this.f67528h.q0();
            this.f67528h.v0(z11);
            this.f67528h.B0();
        }
    }

    private boolean g() {
        return (this.f67529i == null || this.f67528h.getEditText() == null) ? false : true;
    }

    private void i(List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView != null && z10) {
            if (i10 == i12 || i10 == i11) {
                ObjectAnimator j10 = j(textView, i12 == i10);
                if (i10 == i12 && i11 != 0) {
                    j10.setStartDelay((long) this.f67523c);
                }
                list.add(j10);
                if (i12 == i10 && i11 != 0) {
                    ObjectAnimator k10 = k(textView);
                    k10.setStartDelay((long) this.f67523c);
                    list.add(k10);
                }
            }
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z10 ? 1.0f : 0.0f});
        ofFloat.setDuration((long) (z10 ? this.f67522b : this.f67523c));
        ofFloat.setInterpolator(z10 ? this.f67525e : this.f67526f);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f67533m, 0.0f});
        ofFloat.setDuration((long) this.f67521a);
        ofFloat.setInterpolator(this.f67524d);
        return ofFloat;
    }

    private TextView m(int i10) {
        if (i10 == 1) {
            return this.f67538r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f67545y;
    }

    private int v(boolean z10, int i10, int i11) {
        return z10 ? this.f67527g.getResources().getDimensionPixelSize(i10) : i11;
    }

    private boolean y(int i10) {
        return i10 == 1 && this.f67538r != null && !TextUtils.isEmpty(this.f67536p);
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f67537q;
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        return this.f67544x;
    }

    /* access modifiers changed from: package-private */
    public void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f67529i != null) {
            if (!z(i10) || (frameLayout = this.f67531k) == null) {
                this.f67529i.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i11 = this.f67530j - 1;
            this.f67530j = i11;
            O(this.f67529i, i11);
        }
    }

    /* access modifiers changed from: package-private */
    public void E(int i10) {
        this.f67540t = i10;
        TextView textView = this.f67538r;
        if (textView != null) {
            C4600b0.r0(textView, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void F(CharSequence charSequence) {
        this.f67539s = charSequence;
        TextView textView = this.f67538r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void G(boolean z10) {
        if (this.f67537q != z10) {
            h();
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f67527g);
                this.f67538r = appCompatTextView;
                appCompatTextView.setId(C9072f.f59476S);
                this.f67538r.setTextAlignment(5);
                Typeface typeface = this.f67520B;
                if (typeface != null) {
                    this.f67538r.setTypeface(typeface);
                }
                H(this.f67541u);
                I(this.f67542v);
                F(this.f67539s);
                E(this.f67540t);
                this.f67538r.setVisibility(4);
                e(this.f67538r, 0);
            } else {
                w();
                C(this.f67538r, 0);
                this.f67538r = null;
                this.f67528h.q0();
                this.f67528h.B0();
            }
            this.f67537q = z10;
        }
    }

    /* access modifiers changed from: package-private */
    public void H(int i10) {
        this.f67541u = i10;
        TextView textView = this.f67538r;
        if (textView != null) {
            this.f67528h.d0(textView, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void I(ColorStateList colorStateList) {
        this.f67542v = colorStateList;
        TextView textView = this.f67538r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void J(int i10) {
        this.f67546z = i10;
        TextView textView = this.f67545y;
        if (textView != null) {
            i.p(textView, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(boolean z10) {
        if (this.f67544x != z10) {
            h();
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f67527g);
                this.f67545y = appCompatTextView;
                appCompatTextView.setId(C9072f.f59477T);
                this.f67545y.setTextAlignment(5);
                Typeface typeface = this.f67520B;
                if (typeface != null) {
                    this.f67545y.setTypeface(typeface);
                }
                this.f67545y.setVisibility(4);
                C4600b0.r0(this.f67545y, 1);
                J(this.f67546z);
                L(this.f67519A);
                e(this.f67545y, 1);
                this.f67545y.setAccessibilityDelegate(new b());
            } else {
                x();
                C(this.f67545y, 1);
                this.f67545y = null;
                this.f67528h.q0();
                this.f67528h.B0();
            }
            this.f67544x = z10;
        }
    }

    /* access modifiers changed from: package-private */
    public void L(ColorStateList colorStateList) {
        this.f67519A = colorStateList;
        TextView textView = this.f67545y;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void N(Typeface typeface) {
        if (typeface != this.f67520B) {
            this.f67520B = typeface;
            M(this.f67538r, typeface);
            M(this.f67545y, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public void Q(CharSequence charSequence) {
        h();
        this.f67536p = charSequence;
        this.f67538r.setText(charSequence);
        int i10 = this.f67534n;
        if (i10 != 1) {
            this.f67535o = 1;
        }
        S(i10, this.f67535o, P(this.f67538r, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void R(CharSequence charSequence) {
        h();
        this.f67543w = charSequence;
        this.f67545y.setText(charSequence);
        int i10 = this.f67534n;
        if (i10 != 2) {
            this.f67535o = 2;
        }
        S(i10, this.f67535o, P(this.f67545y, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void e(TextView textView, int i10) {
        if (this.f67529i == null && this.f67531k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f67527g);
            this.f67529i = linearLayout;
            linearLayout.setOrientation(0);
            this.f67528h.addView(this.f67529i, -1, -2);
            this.f67531k = new FrameLayout(this.f67527g);
            this.f67529i.addView(this.f67531k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f67528h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f67531k.setVisibility(0);
            this.f67531k.addView(textView);
        } else {
            this.f67529i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f67529i.setVisibility(0);
        this.f67530j++;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (g()) {
            EditText editText = this.f67528h.getEditText();
            boolean h10 = c.h(this.f67527g);
            C4600b0.F0(this.f67529i, v(h10, C9070d.f59386O, C4600b0.E(editText)), v(h10, C9070d.f59387P, this.f67527g.getResources().getDimensionPixelSize(C9070d.f59385N)), v(h10, C9070d.f59386O, C4600b0.D(editText)), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Animator animator = this.f67532l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return y(this.f67535o);
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return this.f67540t;
    }

    /* access modifiers changed from: package-private */
    public CharSequence o() {
        return this.f67539s;
    }

    /* access modifiers changed from: package-private */
    public CharSequence p() {
        return this.f67536p;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        TextView textView = this.f67538r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList r() {
        TextView textView = this.f67538r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence s() {
        return this.f67543w;
    }

    /* access modifiers changed from: package-private */
    public View t() {
        return this.f67545y;
    }

    /* access modifiers changed from: package-private */
    public int u() {
        TextView textView = this.f67545y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.f67536p = null;
        h();
        if (this.f67534n == 1) {
            if (!this.f67544x || TextUtils.isEmpty(this.f67543w)) {
                this.f67535o = 0;
            } else {
                this.f67535o = 2;
            }
        }
        S(this.f67534n, this.f67535o, P(this.f67538r, ""));
    }

    /* access modifiers changed from: package-private */
    public void x() {
        h();
        int i10 = this.f67534n;
        if (i10 == 2) {
            this.f67535o = 0;
        }
        S(i10, this.f67535o, P(this.f67545y, ""));
    }

    /* access modifiers changed from: package-private */
    public boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
