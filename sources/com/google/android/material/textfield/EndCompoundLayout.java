package com.google.android.material.textfield;

import Ea.C9070d;
import Ea.C9072f;
import Ea.C9074h;
import Ea.C9076j;
import Ea.C9078l;
import I2.C4600b0;
import I2.C4638v;
import J2.c;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.M;
import androidx.core.widget.i;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.r;
import com.google.android.material.internal.v;
import com.google.android.material.textfield.TextInputLayout;
import j.C5443a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import y2.C6260a;

@SuppressLint({"ViewConstructor"})
class EndCompoundLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    final TextInputLayout f67335a;

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f67336b;

    /* renamed from: c  reason: collision with root package name */
    private final CheckableImageButton f67337c;

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f67338d;

    /* renamed from: e  reason: collision with root package name */
    private PorterDuff.Mode f67339e;

    /* renamed from: f  reason: collision with root package name */
    private View.OnLongClickListener f67340f;

    /* renamed from: g  reason: collision with root package name */
    private final CheckableImageButton f67341g;

    /* renamed from: h  reason: collision with root package name */
    private final d f67342h;

    /* renamed from: i  reason: collision with root package name */
    private int f67343i = 0;

    /* renamed from: j  reason: collision with root package name */
    private final LinkedHashSet<TextInputLayout.g> f67344j = new LinkedHashSet<>();

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f67345k;

    /* renamed from: l  reason: collision with root package name */
    private PorterDuff.Mode f67346l;

    /* renamed from: m  reason: collision with root package name */
    private int f67347m;

    /* renamed from: n  reason: collision with root package name */
    private ImageView.ScaleType f67348n;

    /* renamed from: o  reason: collision with root package name */
    private View.OnLongClickListener f67349o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f67350p;

    /* renamed from: q  reason: collision with root package name */
    private final TextView f67351q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f67352r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public EditText f67353s;

    /* renamed from: t  reason: collision with root package name */
    private final AccessibilityManager f67354t;

    /* renamed from: u  reason: collision with root package name */
    private c.a f67355u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final TextWatcher f67356v = new a();

    /* renamed from: w  reason: collision with root package name */
    private final TextInputLayout.f f67357w;

    class a extends r {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            EndCompoundLayout.this.m().a(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            EndCompoundLayout.this.m().b(charSequence, i10, i11, i12);
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        public void a(TextInputLayout textInputLayout) {
            if (EndCompoundLayout.this.f67353s != textInputLayout.getEditText()) {
                if (EndCompoundLayout.this.f67353s != null) {
                    EndCompoundLayout.this.f67353s.removeTextChangedListener(EndCompoundLayout.this.f67356v);
                    if (EndCompoundLayout.this.f67353s.getOnFocusChangeListener() == EndCompoundLayout.this.m().e()) {
                        EndCompoundLayout.this.f67353s.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                    }
                }
                EditText unused = EndCompoundLayout.this.f67353s = textInputLayout.getEditText();
                if (EndCompoundLayout.this.f67353s != null) {
                    EndCompoundLayout.this.f67353s.addTextChangedListener(EndCompoundLayout.this.f67356v);
                }
                EndCompoundLayout.this.m().n(EndCompoundLayout.this.f67353s);
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                endCompoundLayout.h0(endCompoundLayout.m());
            }
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        public void onViewAttachedToWindow(View view) {
            EndCompoundLayout.this.g();
        }

        public void onViewDetachedFromWindow(View view) {
            EndCompoundLayout.this.M();
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray<r> f67361a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        private final EndCompoundLayout f67362b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f67363c;

        /* renamed from: d  reason: collision with root package name */
        private final int f67364d;

        d(EndCompoundLayout endCompoundLayout, M m10) {
            this.f67362b = endCompoundLayout;
            this.f67363c = m10.n(C9078l.f59714I8, 0);
            this.f67364d = m10.n(C9078l.f59966g9, 0);
        }

        private r b(int i10) {
            if (i10 == -1) {
                return new g(this.f67362b);
            }
            if (i10 == 0) {
                return new u(this.f67362b);
            }
            if (i10 == 1) {
                return new w(this.f67362b, this.f67364d);
            }
            if (i10 == 2) {
                return new f(this.f67362b);
            }
            if (i10 == 3) {
                return new p(this.f67362b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        /* access modifiers changed from: package-private */
        public r c(int i10) {
            r rVar = this.f67361a.get(i10);
            if (rVar != null) {
                return rVar;
            }
            r b10 = b(i10);
            this.f67361a.append(i10, b10);
            return b10;
        }
    }

    EndCompoundLayout(TextInputLayout textInputLayout, M m10) {
        super(textInputLayout.getContext());
        b bVar = new b();
        this.f67357w = bVar;
        this.f67354t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f67335a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f67336b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton i10 = i(this, from, C9072f.f59474Q);
        this.f67337c = i10;
        CheckableImageButton i11 = i(frameLayout, from, C9072f.f59473P);
        this.f67341g = i11;
        this.f67342h = new d(this, m10);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f67351q = appCompatTextView;
        C(m10);
        B(m10);
        D(m10);
        frameLayout.addView(i11);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(i10);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(M m10) {
        if (!m10.s(C9078l.f59977h9)) {
            if (m10.s(C9078l.f59758M8)) {
                this.f67345k = Ra.c.b(getContext(), m10, C9078l.f59758M8);
            }
            if (m10.s(C9078l.f59769N8)) {
                this.f67346l = v.k(m10.k(C9078l.f59769N8, -1), (PorterDuff.Mode) null);
            }
        }
        if (m10.s(C9078l.f59736K8)) {
            U(m10.k(C9078l.f59736K8, 0));
            if (m10.s(C9078l.f59703H8)) {
                Q(m10.p(C9078l.f59703H8));
            }
            O(m10.a(C9078l.f59692G8, true));
        } else if (m10.s(C9078l.f59977h9)) {
            if (m10.s(C9078l.f59988i9)) {
                this.f67345k = Ra.c.b(getContext(), m10, C9078l.f59988i9);
            }
            if (m10.s(C9078l.f59999j9)) {
                this.f67346l = v.k(m10.k(C9078l.f59999j9, -1), (PorterDuff.Mode) null);
            }
            U(m10.a(C9078l.f59977h9, false) ? 1 : 0);
            Q(m10.p(C9078l.f59955f9));
        }
        T(m10.f(C9078l.f59725J8, getResources().getDimensionPixelSize(C9070d.f59429p0)));
        if (m10.s(C9078l.f59747L8)) {
            X(s.b(m10.k(C9078l.f59747L8, -1)));
        }
    }

    private void C(M m10) {
        if (m10.s(C9078l.f59819S8)) {
            this.f67338d = Ra.c.b(getContext(), m10, C9078l.f59819S8);
        }
        if (m10.s(C9078l.f59829T8)) {
            this.f67339e = v.k(m10.k(C9078l.f59829T8, -1), (PorterDuff.Mode) null);
        }
        if (m10.s(C9078l.f59809R8)) {
            c0(m10.g(C9078l.f59809R8));
        }
        this.f67337c.setContentDescription(getResources().getText(C9076j.f59563f));
        C4600b0.z0(this.f67337c, 2);
        this.f67337c.setClickable(false);
        this.f67337c.setPressable(false);
        this.f67337c.setFocusable(false);
    }

    private void D(M m10) {
        this.f67351q.setVisibility(8);
        this.f67351q.setId(C9072f.f59480W);
        this.f67351q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        C4600b0.r0(this.f67351q, 1);
        q0(m10.n(C9078l.f60164y9, 0));
        if (m10.s(C9078l.f60175z9)) {
            r0(m10.c(C9078l.f60175z9));
        }
        p0(m10.p(C9078l.f60153x9));
    }

    /* access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        c.a aVar = this.f67355u;
        if (aVar != null && (accessibilityManager = this.f67354t) != null) {
            J2.c.b(accessibilityManager, aVar);
        }
    }

    /* access modifiers changed from: private */
    public void g() {
        if (this.f67355u != null && this.f67354t != null && C4600b0.R(this)) {
            J2.c.a(this.f67354t, this.f67355u);
        }
    }

    /* access modifiers changed from: private */
    public void h0(r rVar) {
        if (this.f67353s != null) {
            if (rVar.e() != null) {
                this.f67353s.setOnFocusChangeListener(rVar.e());
            }
            if (rVar.g() != null) {
                this.f67341g.setOnFocusChangeListener(rVar.g());
            }
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C9074h.f59528l, viewGroup, false);
        checkableImageButton.setId(i10);
        s.e(checkableImageButton);
        if (Ra.c.h(getContext())) {
            C4638v.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i10) {
        Iterator<TextInputLayout.g> it = this.f67344j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f67335a, i10);
        }
    }

    private void s0(r rVar) {
        rVar.s();
        this.f67355u = rVar.h();
        g();
    }

    private int t(r rVar) {
        int a10 = this.f67342h.f67363c;
        return a10 == 0 ? rVar.d() : a10;
    }

    private void t0(r rVar) {
        M();
        this.f67355u = null;
        rVar.u();
    }

    private void u0(boolean z10) {
        if (!z10 || n() == null) {
            s.a(this.f67335a, this.f67341g, this.f67345k, this.f67346l);
            return;
        }
        Drawable mutate = C6260a.r(n()).mutate();
        C6260a.n(mutate, this.f67335a.getErrorCurrentTextColors());
        this.f67341g.setImageDrawable(mutate);
    }

    private void v0() {
        int i10 = 8;
        this.f67336b.setVisibility((this.f67341g.getVisibility() != 0 || G()) ? 8 : 0);
        boolean z10 = (this.f67350p == null || this.f67352r) ? true : false;
        if (F() || G() || !z10) {
            i10 = 0;
        }
        setVisibility(i10);
    }

    private void w0() {
        int i10 = 0;
        boolean z10 = s() != null && this.f67335a.N() && this.f67335a.e0();
        CheckableImageButton checkableImageButton = this.f67337c;
        if (!z10) {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        v0();
        x0();
        if (!A()) {
            this.f67335a.p0();
        }
    }

    private void y0() {
        int visibility = this.f67351q.getVisibility();
        boolean z10 = false;
        int i10 = (this.f67350p == null || this.f67352r) ? 8 : 0;
        if (visibility != i10) {
            r m10 = m();
            if (i10 == 0) {
                z10 = true;
            }
            m10.q(z10);
        }
        v0();
        this.f67351q.setVisibility(i10);
        this.f67335a.p0();
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f67343i != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return A() && this.f67341g.isChecked();
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        return this.f67336b.getVisibility() == 0 && this.f67341g.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return this.f67337c.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public void H(boolean z10) {
        this.f67352r = z10;
        y0();
    }

    /* access modifiers changed from: package-private */
    public void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f67335a.e0());
        }
    }

    /* access modifiers changed from: package-private */
    public void J() {
        s.d(this.f67335a, this.f67341g, this.f67345k);
    }

    /* access modifiers changed from: package-private */
    public void K() {
        s.d(this.f67335a, this.f67337c, this.f67338d);
    }

    /* access modifiers changed from: package-private */
    public void L(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean isChecked;
        r m10 = m();
        boolean z12 = true;
        if (!m10.l() || (isChecked = this.f67341g.isChecked()) == m10.m()) {
            z11 = false;
        } else {
            this.f67341g.setChecked(!isChecked);
            z11 = true;
        }
        if (!m10.j() || (isActivated = this.f67341g.isActivated()) == m10.k()) {
            z12 = z11;
        } else {
            N(!isActivated);
        }
        if (z10 || z12) {
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void N(boolean z10) {
        this.f67341g.setActivated(z10);
    }

    /* access modifiers changed from: package-private */
    public void O(boolean z10) {
        this.f67341g.setCheckable(z10);
    }

    /* access modifiers changed from: package-private */
    public void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    /* access modifiers changed from: package-private */
    public void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f67341g.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void R(int i10) {
        S(i10 != 0 ? C5443a.b(getContext(), i10) : null);
    }

    /* access modifiers changed from: package-private */
    public void S(Drawable drawable) {
        this.f67341g.setImageDrawable(drawable);
        if (drawable != null) {
            s.a(this.f67335a, this.f67341g, this.f67345k, this.f67346l);
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i10 != this.f67347m) {
            this.f67347m = i10;
            s.g(this.f67341g, i10);
            s.g(this.f67337c, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void U(int i10) {
        if (this.f67343i != i10) {
            t0(m());
            int i11 = this.f67343i;
            this.f67343i = i10;
            j(i11);
            a0(i10 != 0);
            r m10 = m();
            R(t(m10));
            P(m10.c());
            O(m10.l());
            if (m10.i(this.f67335a.getBoxBackgroundMode())) {
                s0(m10);
                V(m10.f());
                EditText editText = this.f67353s;
                if (editText != null) {
                    m10.n(editText);
                    h0(m10);
                }
                s.a(this.f67335a, this.f67341g, this.f67345k, this.f67346l);
                L(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + this.f67335a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void V(View.OnClickListener onClickListener) {
        s.h(this.f67341g, onClickListener, this.f67349o);
    }

    /* access modifiers changed from: package-private */
    public void W(View.OnLongClickListener onLongClickListener) {
        this.f67349o = onLongClickListener;
        s.i(this.f67341g, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void X(ImageView.ScaleType scaleType) {
        this.f67348n = scaleType;
        s.j(this.f67341g, scaleType);
        s.j(this.f67337c, scaleType);
    }

    /* access modifiers changed from: package-private */
    public void Y(ColorStateList colorStateList) {
        if (this.f67345k != colorStateList) {
            this.f67345k = colorStateList;
            s.a(this.f67335a, this.f67341g, colorStateList, this.f67346l);
        }
    }

    /* access modifiers changed from: package-private */
    public void Z(PorterDuff.Mode mode) {
        if (this.f67346l != mode) {
            this.f67346l = mode;
            s.a(this.f67335a, this.f67341g, this.f67345k, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void a0(boolean z10) {
        if (F() != z10) {
            this.f67341g.setVisibility(z10 ? 0 : 8);
            v0();
            x0();
            this.f67335a.p0();
        }
    }

    /* access modifiers changed from: package-private */
    public void b0(int i10) {
        c0(i10 != 0 ? C5443a.b(getContext(), i10) : null);
        K();
    }

    /* access modifiers changed from: package-private */
    public void c0(Drawable drawable) {
        this.f67337c.setImageDrawable(drawable);
        w0();
        s.a(this.f67335a, this.f67337c, this.f67338d, this.f67339e);
    }

    /* access modifiers changed from: package-private */
    public void d0(View.OnClickListener onClickListener) {
        s.h(this.f67337c, onClickListener, this.f67340f);
    }

    /* access modifiers changed from: package-private */
    public void e0(View.OnLongClickListener onLongClickListener) {
        this.f67340f = onLongClickListener;
        s.i(this.f67337c, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void f0(ColorStateList colorStateList) {
        if (this.f67338d != colorStateList) {
            this.f67338d = colorStateList;
            s.a(this.f67335a, this.f67337c, colorStateList, this.f67339e);
        }
    }

    /* access modifiers changed from: package-private */
    public void g0(PorterDuff.Mode mode) {
        if (this.f67339e != mode) {
            this.f67339e = mode;
            s.a(this.f67335a, this.f67337c, this.f67338d, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f67341g.performClick();
        this.f67341g.jumpDrawablesToCurrentState();
    }

    /* access modifiers changed from: package-private */
    public void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    /* access modifiers changed from: package-private */
    public void j0(CharSequence charSequence) {
        this.f67341g.setContentDescription(charSequence);
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton k() {
        if (G()) {
            return this.f67337c;
        }
        if (!A() || !F()) {
            return null;
        }
        return this.f67341g;
    }

    /* access modifiers changed from: package-private */
    public void k0(int i10) {
        l0(i10 != 0 ? C5443a.b(getContext(), i10) : null);
    }

    /* access modifiers changed from: package-private */
    public CharSequence l() {
        return this.f67341g.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public void l0(Drawable drawable) {
        this.f67341g.setImageDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public r m() {
        return this.f67342h.c(this.f67343i);
    }

    /* access modifiers changed from: package-private */
    public void m0(boolean z10) {
        if (z10 && this.f67343i != 1) {
            U(1);
        } else if (!z10) {
            U(0);
        }
    }

    /* access modifiers changed from: package-private */
    public Drawable n() {
        return this.f67341g.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public void n0(ColorStateList colorStateList) {
        this.f67345k = colorStateList;
        s.a(this.f67335a, this.f67341g, colorStateList, this.f67346l);
    }

    /* access modifiers changed from: package-private */
    public int o() {
        return this.f67347m;
    }

    /* access modifiers changed from: package-private */
    public void o0(PorterDuff.Mode mode) {
        this.f67346l = mode;
        s.a(this.f67335a, this.f67341g, this.f67345k, mode);
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return this.f67343i;
    }

    /* access modifiers changed from: package-private */
    public void p0(CharSequence charSequence) {
        this.f67350p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f67351q.setText(charSequence);
        y0();
    }

    /* access modifiers changed from: package-private */
    public ImageView.ScaleType q() {
        return this.f67348n;
    }

    /* access modifiers changed from: package-private */
    public void q0(int i10) {
        i.p(this.f67351q, i10);
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton r() {
        return this.f67341g;
    }

    /* access modifiers changed from: package-private */
    public void r0(ColorStateList colorStateList) {
        this.f67351q.setTextColor(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public Drawable s() {
        return this.f67337c.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public CharSequence u() {
        return this.f67341g.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public Drawable v() {
        return this.f67341g.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public CharSequence w() {
        return this.f67350p;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList x() {
        return this.f67351q.getTextColors();
    }

    /* access modifiers changed from: package-private */
    public void x0() {
        if (this.f67335a.f67441d != null) {
            C4600b0.F0(this.f67351q, getContext().getResources().getDimensionPixelSize(C9070d.f59388Q), this.f67335a.f67441d.getPaddingTop(), (F() || G()) ? 0 : C4600b0.D(this.f67335a.f67441d), this.f67335a.f67441d.getPaddingBottom());
        }
    }

    /* access modifiers changed from: package-private */
    public int y() {
        return C4600b0.D(this) + C4600b0.D(this.f67351q) + ((F() || G()) ? this.f67341g.getMeasuredWidth() + C4638v.b((ViewGroup.MarginLayoutParams) this.f67341g.getLayoutParams()) : 0);
    }

    /* access modifiers changed from: package-private */
    public TextView z() {
        return this.f67351q;
    }
}
