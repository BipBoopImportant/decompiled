package com.google.android.material.textfield;

import Ea.C9070d;
import Ea.C9072f;
import Ea.C9074h;
import Ea.C9078l;
import I2.C4600b0;
import I2.C4638v;
import J2.t;
import Ra.c;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.M;
import androidx.core.widget.i;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.v;

@SuppressLint({"ViewConstructor"})
class StartCompoundLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final TextInputLayout f67377a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f67378b;

    /* renamed from: c  reason: collision with root package name */
    private CharSequence f67379c;

    /* renamed from: d  reason: collision with root package name */
    private final CheckableImageButton f67380d;

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f67381e;

    /* renamed from: f  reason: collision with root package name */
    private PorterDuff.Mode f67382f;

    /* renamed from: g  reason: collision with root package name */
    private int f67383g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView.ScaleType f67384h;

    /* renamed from: i  reason: collision with root package name */
    private View.OnLongClickListener f67385i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f67386j;

    StartCompoundLayout(TextInputLayout textInputLayout, M m10) {
        super(textInputLayout.getContext());
        this.f67377a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C9074h.f59529m, this, false);
        this.f67380d = checkableImageButton;
        s.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f67378b = appCompatTextView;
        j(m10);
        i(m10);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void C() {
        int i10 = 8;
        int i11 = (this.f67379c == null || this.f67386j) ? 8 : 0;
        if (this.f67380d.getVisibility() == 0 || i11 == 0) {
            i10 = 0;
        }
        setVisibility(i10);
        this.f67378b.setVisibility(i11);
        this.f67377a.p0();
    }

    private void i(M m10) {
        this.f67378b.setVisibility(8);
        this.f67378b.setId(C9072f.f59479V);
        this.f67378b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C4600b0.r0(this.f67378b, 1);
        o(m10.n(C9078l.f60054o9, 0));
        if (m10.s(C9078l.f60065p9)) {
            p(m10.c(C9078l.f60065p9));
        }
        n(m10.p(C9078l.f60043n9));
    }

    private void j(M m10) {
        if (c.h(getContext())) {
            C4638v.c((ViewGroup.MarginLayoutParams) this.f67380d.getLayoutParams(), 0);
        }
        u((View.OnClickListener) null);
        v((View.OnLongClickListener) null);
        if (m10.s(C9078l.f60131v9)) {
            this.f67381e = c.b(getContext(), m10, C9078l.f60131v9);
        }
        if (m10.s(C9078l.f60142w9)) {
            this.f67382f = v.k(m10.k(C9078l.f60142w9, -1), (PorterDuff.Mode) null);
        }
        if (m10.s(C9078l.f60098s9)) {
            s(m10.g(C9078l.f60098s9));
            if (m10.s(C9078l.f60087r9)) {
                r(m10.p(C9078l.f60087r9));
            }
            q(m10.a(C9078l.f60076q9, true));
        }
        t(m10.f(C9078l.f60109t9, getResources().getDimensionPixelSize(C9070d.f59429p0)));
        if (m10.s(C9078l.f60120u9)) {
            w(s.b(m10.k(C9078l.f60120u9, -1)));
        }
    }

    /* access modifiers changed from: package-private */
    public void A(t tVar) {
        if (this.f67378b.getVisibility() == 0) {
            tVar.y0(this.f67378b);
            tVar.T0(this.f67378b);
            return;
        }
        tVar.T0(this.f67380d);
    }

    /* access modifiers changed from: package-private */
    public void B() {
        EditText editText = this.f67377a.f67441d;
        if (editText != null) {
            C4600b0.F0(this.f67378b, k() ? 0 : C4600b0.E(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C9070d.f59388Q), editText.getCompoundPaddingBottom());
        }
    }

    /* access modifiers changed from: package-private */
    public CharSequence a() {
        return this.f67379c;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f67378b.getTextColors();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return C4600b0.E(this) + C4600b0.E(this.f67378b) + (k() ? this.f67380d.getMeasuredWidth() + C4638v.a((ViewGroup.MarginLayoutParams) this.f67380d.getLayoutParams()) : 0);
    }

    /* access modifiers changed from: package-private */
    public TextView d() {
        return this.f67378b;
    }

    /* access modifiers changed from: package-private */
    public CharSequence e() {
        return this.f67380d.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public Drawable f() {
        return this.f67380d.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f67383g;
    }

    /* access modifiers changed from: package-private */
    public ImageView.ScaleType h() {
        return this.f67384h;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f67380d.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public void l(boolean z10) {
        this.f67386j = z10;
        C();
    }

    /* access modifiers changed from: package-private */
    public void m() {
        s.d(this.f67377a, this.f67380d, this.f67381e);
    }

    /* access modifiers changed from: package-private */
    public void n(CharSequence charSequence) {
        this.f67379c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f67378b.setText(charSequence);
        C();
    }

    /* access modifiers changed from: package-private */
    public void o(int i10) {
        i.p(this.f67378b, i10);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B();
    }

    /* access modifiers changed from: package-private */
    public void p(ColorStateList colorStateList) {
        this.f67378b.setTextColor(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z10) {
        this.f67380d.setCheckable(z10);
    }

    /* access modifiers changed from: package-private */
    public void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f67380d.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void s(Drawable drawable) {
        this.f67380d.setImageDrawable(drawable);
        if (drawable != null) {
            s.a(this.f67377a, this.f67380d, this.f67381e, this.f67382f);
            z(true);
            m();
            return;
        }
        z(false);
        u((View.OnClickListener) null);
        v((View.OnLongClickListener) null);
        r((CharSequence) null);
    }

    /* access modifiers changed from: package-private */
    public void t(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i10 != this.f67383g) {
            this.f67383g = i10;
            s.g(this.f67380d, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(View.OnClickListener onClickListener) {
        s.h(this.f67380d, onClickListener, this.f67385i);
    }

    /* access modifiers changed from: package-private */
    public void v(View.OnLongClickListener onLongClickListener) {
        this.f67385i = onLongClickListener;
        s.i(this.f67380d, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void w(ImageView.ScaleType scaleType) {
        this.f67384h = scaleType;
        s.j(this.f67380d, scaleType);
    }

    /* access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList) {
        if (this.f67381e != colorStateList) {
            this.f67381e = colorStateList;
            s.a(this.f67377a, this.f67380d, colorStateList, this.f67382f);
        }
    }

    /* access modifiers changed from: package-private */
    public void y(PorterDuff.Mode mode) {
        if (this.f67382f != mode) {
            this.f67382f = mode;
            s.a(this.f67377a, this.f67380d, this.f67381e, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void z(boolean z10) {
        if (k() != z10) {
            this.f67380d.setVisibility(z10 ? 0 : 8);
            B();
            C();
        }
    }
}
