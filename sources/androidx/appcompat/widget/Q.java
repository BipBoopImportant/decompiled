package androidx.appcompat.widget;

import I2.C4600b0;
import I2.C4618k0;
import I2.C4622m0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.Toolbar;
import i.C5421a;
import i.C5425e;
import i.C5426f;
import i.C5428h;
import i.C5430j;
import j.C5443a;
import n.C5576a;

public class Q implements C5007t {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f16282a;

    /* renamed from: b  reason: collision with root package name */
    private int f16283b;

    /* renamed from: c  reason: collision with root package name */
    private View f16284c;

    /* renamed from: d  reason: collision with root package name */
    private View f16285d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f16286e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f16287f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f16288g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f16289h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f16290i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f16291j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f16292k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f16293l;

    /* renamed from: m  reason: collision with root package name */
    boolean f16294m;

    /* renamed from: n  reason: collision with root package name */
    private ActionMenuPresenter f16295n;

    /* renamed from: o  reason: collision with root package name */
    private int f16296o;

    /* renamed from: p  reason: collision with root package name */
    private int f16297p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f16298q;

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final C5576a f16299a;

        a() {
            this.f16299a = new C5576a(Q.this.f16282a.getContext(), 0, 16908332, 0, 0, Q.this.f16290i);
        }

        public void onClick(View view) {
            Q q10 = Q.this;
            Window.Callback callback = q10.f16293l;
            if (callback != null && q10.f16294m) {
                callback.onMenuItemSelected(0, this.f16299a);
            }
        }
    }

    class b extends C4622m0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f16301a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f16302b;

        b(int i10) {
            this.f16302b = i10;
        }

        public void a(View view) {
            this.f16301a = true;
        }

        public void b(View view) {
            if (!this.f16301a) {
                Q.this.f16282a.setVisibility(this.f16302b);
            }
        }

        public void c(View view) {
            Q.this.f16282a.setVisibility(0);
        }
    }

    public Q(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, C5428h.f24024a, C5425e.f23962n);
    }

    private void G(CharSequence charSequence) {
        this.f16290i = charSequence;
        if ((this.f16283b & 8) != 0) {
            this.f16282a.setTitle(charSequence);
            if (this.f16289h) {
                C4600b0.s0(this.f16282a.getRootView(), charSequence);
            }
        }
    }

    private void H() {
        if ((this.f16283b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f16292k)) {
            this.f16282a.setNavigationContentDescription(this.f16297p);
        } else {
            this.f16282a.setNavigationContentDescription(this.f16292k);
        }
    }

    private void I() {
        if ((this.f16283b & 4) != 0) {
            Toolbar toolbar = this.f16282a;
            Drawable drawable = this.f16288g;
            if (drawable == null) {
                drawable = this.f16298q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f16282a.setNavigationIcon((Drawable) null);
    }

    private void J() {
        Drawable drawable;
        int i10 = this.f16283b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) != 0) {
            drawable = this.f16287f;
            if (drawable == null) {
                drawable = this.f16286e;
            }
        } else {
            drawable = this.f16286e;
        }
        this.f16282a.setLogo(drawable);
    }

    private int z() {
        if (this.f16282a.getNavigationIcon() == null) {
            return 11;
        }
        this.f16298q = this.f16282a.getNavigationIcon();
        return 15;
    }

    public void A(View view) {
        View view2 = this.f16285d;
        if (!(view2 == null || (this.f16283b & 16) == 0)) {
            this.f16282a.removeView(view2);
        }
        this.f16285d = view;
        if (view != null && (this.f16283b & 16) != 0) {
            this.f16282a.addView(view);
        }
    }

    public void B(int i10) {
        if (i10 != this.f16297p) {
            this.f16297p = i10;
            if (TextUtils.isEmpty(this.f16282a.getNavigationContentDescription())) {
                o(this.f16297p);
            }
        }
    }

    public void C(Drawable drawable) {
        this.f16287f = drawable;
        J();
    }

    public void D(CharSequence charSequence) {
        this.f16292k = charSequence;
        H();
    }

    public void E(Drawable drawable) {
        this.f16288g = drawable;
        I();
    }

    public void F(CharSequence charSequence) {
        this.f16291j = charSequence;
        if ((this.f16283b & 8) != 0) {
            this.f16282a.setSubtitle(charSequence);
        }
    }

    public boolean a() {
        return this.f16282a.d();
    }

    public boolean b() {
        return this.f16282a.w();
    }

    public boolean c() {
        return this.f16282a.Q();
    }

    public void collapseActionView() {
        this.f16282a.e();
    }

    public void d(Menu menu, k.a aVar) {
        if (this.f16295n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f16282a.getContext());
            this.f16295n = actionMenuPresenter;
            actionMenuPresenter.r(C5426f.f23987g);
        }
        this.f16295n.e(aVar);
        this.f16282a.K((f) menu, this.f16295n);
    }

    public boolean e() {
        return this.f16282a.B();
    }

    public void f() {
        this.f16294m = true;
    }

    public boolean g() {
        return this.f16282a.A();
    }

    public Context getContext() {
        return this.f16282a.getContext();
    }

    public CharSequence getTitle() {
        return this.f16282a.getTitle();
    }

    public boolean h() {
        return this.f16282a.v();
    }

    public void i(int i10) {
        View view;
        int i11 = this.f16283b ^ i10;
        this.f16283b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i11 & 3) != 0) {
                J();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f16282a.setTitle(this.f16290i);
                    this.f16282a.setSubtitle(this.f16291j);
                } else {
                    this.f16282a.setTitle((CharSequence) null);
                    this.f16282a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f16285d) != null) {
                if ((i10 & 16) != 0) {
                    this.f16282a.addView(view);
                } else {
                    this.f16282a.removeView(view);
                }
            }
        }
    }

    public Menu j() {
        return this.f16282a.getMenu();
    }

    public int k() {
        return this.f16296o;
    }

    public C4618k0 l(int i10, long j10) {
        return C4600b0.e(this.f16282a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    public ViewGroup m() {
        return this.f16282a;
    }

    public void n(boolean z10) {
    }

    public void o(int i10) {
        D(i10 == 0 ? null : getContext().getString(i10));
    }

    public void p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void q(boolean z10) {
        this.f16282a.setCollapsible(z10);
    }

    public void r() {
        this.f16282a.f();
    }

    public void s(ScrollingTabContainerView scrollingTabContainerView) {
        Toolbar toolbar;
        View view = this.f16284c;
        if (view != null && view.getParent() == (toolbar = this.f16282a)) {
            toolbar.removeView(this.f16284c);
        }
        this.f16284c = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.f16296o == 2) {
            this.f16282a.addView(scrollingTabContainerView, 0);
            Toolbar.g gVar = (Toolbar.g) this.f16284c.getLayoutParams();
            gVar.width = -2;
            gVar.height = -2;
            gVar.f15537a = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    public void setIcon(int i10) {
        setIcon(i10 != 0 ? C5443a.b(getContext(), i10) : null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f16289h = true;
        G(charSequence);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f16293l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f16289h) {
            G(charSequence);
        }
    }

    public void t(int i10) {
        C(i10 != 0 ? C5443a.b(getContext(), i10) : null);
    }

    public void u(int i10) {
        E(i10 != 0 ? C5443a.b(getContext(), i10) : null);
    }

    public void v(k.a aVar, f.a aVar2) {
        this.f16282a.L(aVar, aVar2);
    }

    public void w(int i10) {
        this.f16282a.setVisibility(i10);
    }

    public int x() {
        return this.f16283b;
    }

    public void y() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public Q(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f16296o = 0;
        this.f16297p = 0;
        this.f16282a = toolbar;
        this.f16290i = toolbar.getTitle();
        this.f16291j = toolbar.getSubtitle();
        this.f16289h = this.f16290i != null;
        this.f16288g = toolbar.getNavigationIcon();
        M v10 = M.v(toolbar.getContext(), (AttributeSet) null, C5430j.f24145a, C5421a.f23888c, 0);
        this.f16298q = v10.g(C5430j.f24200l);
        if (z10) {
            CharSequence p10 = v10.p(C5430j.f24230r);
            if (!TextUtils.isEmpty(p10)) {
                setTitle(p10);
            }
            CharSequence p11 = v10.p(C5430j.f24220p);
            if (!TextUtils.isEmpty(p11)) {
                F(p11);
            }
            Drawable g10 = v10.g(C5430j.f24210n);
            if (g10 != null) {
                C(g10);
            }
            Drawable g11 = v10.g(C5430j.f24205m);
            if (g11 != null) {
                setIcon(g11);
            }
            if (this.f16288g == null && (drawable = this.f16298q) != null) {
                E(drawable);
            }
            i(v10.k(C5430j.f24180h, 0));
            int n10 = v10.n(C5430j.f24175g, 0);
            if (n10 != 0) {
                A(LayoutInflater.from(this.f16282a.getContext()).inflate(n10, this.f16282a, false));
                i(this.f16283b | 16);
            }
            int m10 = v10.m(C5430j.f24190j, 0);
            if (m10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f16282a.getLayoutParams();
                layoutParams.height = m10;
                this.f16282a.setLayoutParams(layoutParams);
            }
            int e10 = v10.e(C5430j.f24170f, -1);
            int e11 = v10.e(C5430j.f24165e, -1);
            if (e10 >= 0 || e11 >= 0) {
                this.f16282a.J(Math.max(e10, 0), Math.max(e11, 0));
            }
            int n11 = v10.n(C5430j.f24235s, 0);
            if (n11 != 0) {
                Toolbar toolbar2 = this.f16282a;
                toolbar2.N(toolbar2.getContext(), n11);
            }
            int n12 = v10.n(C5430j.f24225q, 0);
            if (n12 != 0) {
                Toolbar toolbar3 = this.f16282a;
                toolbar3.M(toolbar3.getContext(), n12);
            }
            int n13 = v10.n(C5430j.f24215o, 0);
            if (n13 != 0) {
                this.f16282a.setPopupTheme(n13);
            }
        } else {
            this.f16283b = z();
        }
        v10.x();
        B(i10);
        this.f16292k = this.f16282a.getNavigationContentDescription();
        this.f16282a.setNavigationOnClickListener(new a());
    }

    public void setIcon(Drawable drawable) {
        this.f16286e = drawable;
        J();
    }
}
