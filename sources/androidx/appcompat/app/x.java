package androidx.appcompat.app;

import I2.C4600b0;
import I2.C4618k0;
import I2.C4620l0;
import I2.C4622m0;
import I2.C4624n0;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.b;
import androidx.appcompat.view.g;
import androidx.appcompat.view.h;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C5007t;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import i.C5421a;
import i.C5426f;
import i.C5430j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class x extends a implements ActionBarOverlayLayout.d {

    /* renamed from: E  reason: collision with root package name */
    private static final Interpolator f15600E = new AccelerateInterpolator();

    /* renamed from: F  reason: collision with root package name */
    private static final Interpolator f15601F = new DecelerateInterpolator();

    /* renamed from: A  reason: collision with root package name */
    boolean f15602A;

    /* renamed from: B  reason: collision with root package name */
    final C4620l0 f15603B = new a();

    /* renamed from: C  reason: collision with root package name */
    final C4620l0 f15604C = new b();

    /* renamed from: D  reason: collision with root package name */
    final C4624n0 f15605D = new c();

    /* renamed from: a  reason: collision with root package name */
    Context f15606a;

    /* renamed from: b  reason: collision with root package name */
    private Context f15607b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f15608c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarOverlayLayout f15609d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f15610e;

    /* renamed from: f  reason: collision with root package name */
    C5007t f15611f;

    /* renamed from: g  reason: collision with root package name */
    ActionBarContextView f15612g;

    /* renamed from: h  reason: collision with root package name */
    View f15613h;

    /* renamed from: i  reason: collision with root package name */
    ScrollingTabContainerView f15614i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<Object> f15615j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private int f15616k = -1;

    /* renamed from: l  reason: collision with root package name */
    private boolean f15617l;

    /* renamed from: m  reason: collision with root package name */
    d f15618m;

    /* renamed from: n  reason: collision with root package name */
    androidx.appcompat.view.b f15619n;

    /* renamed from: o  reason: collision with root package name */
    b.a f15620o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f15621p;

    /* renamed from: q  reason: collision with root package name */
    private ArrayList<a.b> f15622q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    private boolean f15623r;

    /* renamed from: s  reason: collision with root package name */
    private int f15624s = 0;

    /* renamed from: t  reason: collision with root package name */
    boolean f15625t = true;

    /* renamed from: u  reason: collision with root package name */
    boolean f15626u;

    /* renamed from: v  reason: collision with root package name */
    boolean f15627v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f15628w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f15629x = true;

    /* renamed from: y  reason: collision with root package name */
    h f15630y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f15631z;

    class a extends C4622m0 {
        a() {
        }

        public void b(View view) {
            View view2;
            x xVar = x.this;
            if (xVar.f15625t && (view2 = xVar.f15613h) != null) {
                view2.setTranslationY(0.0f);
                x.this.f15610e.setTranslationY(0.0f);
            }
            x.this.f15610e.setVisibility(8);
            x.this.f15610e.setTransitioning(false);
            x xVar2 = x.this;
            xVar2.f15630y = null;
            xVar2.G();
            ActionBarOverlayLayout actionBarOverlayLayout = x.this.f15609d;
            if (actionBarOverlayLayout != null) {
                C4600b0.l0(actionBarOverlayLayout);
            }
        }
    }

    class b extends C4622m0 {
        b() {
        }

        public void b(View view) {
            x xVar = x.this;
            xVar.f15630y = null;
            xVar.f15610e.requestLayout();
        }
    }

    class c implements C4624n0 {
        c() {
        }

        public void a(View view) {
            ((View) x.this.f15610e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements f.a {

        /* renamed from: c  reason: collision with root package name */
        private final Context f15635c;

        /* renamed from: d  reason: collision with root package name */
        private final f f15636d;

        /* renamed from: e  reason: collision with root package name */
        private b.a f15637e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference<View> f15638f;

        public d(Context context, b.a aVar) {
            this.f15635c = context;
            this.f15637e = aVar;
            f X10 = new f(context).X(1);
            this.f15636d = X10;
            X10.W(this);
        }

        public boolean a(f fVar, MenuItem menuItem) {
            b.a aVar = this.f15637e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        public void b(f fVar) {
            if (this.f15637e != null) {
                k();
                x.this.f15612g.l();
            }
        }

        public void c() {
            x xVar = x.this;
            if (xVar.f15618m == this) {
                if (!x.F(xVar.f15626u, xVar.f15627v, false)) {
                    x xVar2 = x.this;
                    xVar2.f15619n = this;
                    xVar2.f15620o = this.f15637e;
                } else {
                    this.f15637e.a(this);
                }
                this.f15637e = null;
                x.this.E(false);
                x.this.f15612g.g();
                x xVar3 = x.this;
                xVar3.f15609d.setHideOnContentScrollEnabled(xVar3.f15602A);
                x.this.f15618m = null;
            }
        }

        public View d() {
            WeakReference<View> weakReference = this.f15638f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.f15636d;
        }

        public MenuInflater f() {
            return new g(this.f15635c);
        }

        public CharSequence g() {
            return x.this.f15612g.getSubtitle();
        }

        public CharSequence i() {
            return x.this.f15612g.getTitle();
        }

        public void k() {
            if (x.this.f15618m == this) {
                this.f15636d.i0();
                try {
                    this.f15637e.d(this, this.f15636d);
                } finally {
                    this.f15636d.h0();
                }
            }
        }

        public boolean l() {
            return x.this.f15612g.j();
        }

        public void m(View view) {
            x.this.f15612g.setCustomView(view);
            this.f15638f = new WeakReference<>(view);
        }

        public void n(int i10) {
            o(x.this.f15606a.getResources().getString(i10));
        }

        public void o(CharSequence charSequence) {
            x.this.f15612g.setSubtitle(charSequence);
        }

        public void q(int i10) {
            r(x.this.f15606a.getResources().getString(i10));
        }

        public void r(CharSequence charSequence) {
            x.this.f15612g.setTitle(charSequence);
        }

        public void s(boolean z10) {
            super.s(z10);
            x.this.f15612g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f15636d.i0();
            try {
                return this.f15637e.b(this, this.f15636d);
            } finally {
                this.f15636d.h0();
            }
        }
    }

    public x(Activity activity, boolean z10) {
        this.f15608c = activity;
        View decorView = activity.getWindow().getDecorView();
        M(decorView);
        if (!z10) {
            this.f15613h = decorView.findViewById(16908290);
        }
    }

    static boolean F(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return !z10 && !z11;
    }

    private C5007t J(View view) {
        if (view instanceof C5007t) {
            return (C5007t) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    private void L() {
        if (this.f15628w) {
            this.f15628w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f15609d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            T(false);
        }
    }

    private void M(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C5426f.f23996p);
        this.f15609d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f15611f = J(view.findViewById(C5426f.f23981a));
        this.f15612g = (ActionBarContextView) view.findViewById(C5426f.f23986f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C5426f.f23983c);
        this.f15610e = actionBarContainer;
        C5007t tVar = this.f15611f;
        if (tVar == null || this.f15612g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f15606a = tVar.getContext();
        boolean z10 = (this.f15611f.x() & 4) != 0;
        if (z10) {
            this.f15617l = true;
        }
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(this.f15606a);
        y(b10.a() || z10);
        P(b10.g());
        TypedArray obtainStyledAttributes = this.f15606a.obtainStyledAttributes((AttributeSet) null, C5430j.f24145a, C5421a.f23888c, 0);
        if (obtainStyledAttributes.getBoolean(C5430j.f24195k, false)) {
            Q(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C5430j.f24185i, 0);
        if (dimensionPixelSize != 0) {
            O((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void P(boolean z10) {
        this.f15623r = z10;
        if (!z10) {
            this.f15611f.s((ScrollingTabContainerView) null);
            this.f15610e.setTabContainer(this.f15614i);
        } else {
            this.f15610e.setTabContainer((ScrollingTabContainerView) null);
            this.f15611f.s(this.f15614i);
        }
        boolean z11 = true;
        boolean z12 = K() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f15614i;
        if (scrollingTabContainerView != null) {
            if (z12) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f15609d;
                if (actionBarOverlayLayout != null) {
                    C4600b0.l0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f15611f.q(!this.f15623r && z12);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f15609d;
        if (this.f15623r || !z12) {
            z11 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z11);
    }

    private boolean R() {
        return this.f15610e.isLaidOut();
    }

    private void S() {
        if (!this.f15628w) {
            this.f15628w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f15609d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            T(false);
        }
    }

    private void T(boolean z10) {
        if (F(this.f15626u, this.f15627v, this.f15628w)) {
            if (!this.f15629x) {
                this.f15629x = true;
                I(z10);
            }
        } else if (this.f15629x) {
            this.f15629x = false;
            H(z10);
        }
    }

    public void A(CharSequence charSequence) {
        this.f15611f.setTitle(charSequence);
    }

    public void B(CharSequence charSequence) {
        this.f15611f.setWindowTitle(charSequence);
    }

    public void C() {
        if (this.f15626u) {
            this.f15626u = false;
            T(false);
        }
    }

    public androidx.appcompat.view.b D(b.a aVar) {
        d dVar = this.f15618m;
        if (dVar != null) {
            dVar.c();
        }
        this.f15609d.setHideOnContentScrollEnabled(false);
        this.f15612g.k();
        d dVar2 = new d(this.f15612g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f15618m = dVar2;
        dVar2.k();
        this.f15612g.h(dVar2);
        E(true);
        return dVar2;
    }

    public void E(boolean z10) {
        C4618k0 k0Var;
        C4618k0 k0Var2;
        if (z10) {
            S();
        } else {
            L();
        }
        if (R()) {
            if (z10) {
                k0Var = this.f15611f.l(4, 100);
                k0Var2 = this.f15612g.f(0, 200);
            } else {
                k0Var2 = this.f15611f.l(0, 200);
                k0Var = this.f15612g.f(8, 100);
            }
            h hVar = new h();
            hVar.d(k0Var, k0Var2);
            hVar.h();
        } else if (z10) {
            this.f15611f.w(4);
            this.f15612g.setVisibility(0);
        } else {
            this.f15611f.w(0);
            this.f15612g.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public void G() {
        b.a aVar = this.f15620o;
        if (aVar != null) {
            aVar.a(this.f15619n);
            this.f15619n = null;
            this.f15620o = null;
        }
    }

    public void H(boolean z10) {
        View view;
        h hVar = this.f15630y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f15624s != 0 || (!this.f15631z && !z10)) {
            this.f15603B.b((View) null);
            return;
        }
        this.f15610e.setAlpha(1.0f);
        this.f15610e.setTransitioning(true);
        h hVar2 = new h();
        float f10 = (float) (-this.f15610e.getHeight());
        if (z10) {
            int[] iArr = {0, 0};
            this.f15610e.getLocationInWindow(iArr);
            f10 -= (float) iArr[1];
        }
        C4618k0 m10 = C4600b0.e(this.f15610e).m(f10);
        m10.k(this.f15605D);
        hVar2.c(m10);
        if (this.f15625t && (view = this.f15613h) != null) {
            hVar2.c(C4600b0.e(view).m(f10));
        }
        hVar2.f(f15600E);
        hVar2.e(250);
        hVar2.g(this.f15603B);
        this.f15630y = hVar2;
        hVar2.h();
    }

    public void I(boolean z10) {
        View view;
        View view2;
        h hVar = this.f15630y;
        if (hVar != null) {
            hVar.a();
        }
        this.f15610e.setVisibility(0);
        if (this.f15624s != 0 || (!this.f15631z && !z10)) {
            this.f15610e.setAlpha(1.0f);
            this.f15610e.setTranslationY(0.0f);
            if (this.f15625t && (view = this.f15613h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f15604C.b((View) null);
        } else {
            this.f15610e.setTranslationY(0.0f);
            float f10 = (float) (-this.f15610e.getHeight());
            if (z10) {
                int[] iArr = {0, 0};
                this.f15610e.getLocationInWindow(iArr);
                f10 -= (float) iArr[1];
            }
            this.f15610e.setTranslationY(f10);
            h hVar2 = new h();
            C4618k0 m10 = C4600b0.e(this.f15610e).m(0.0f);
            m10.k(this.f15605D);
            hVar2.c(m10);
            if (this.f15625t && (view2 = this.f15613h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(C4600b0.e(this.f15613h).m(0.0f));
            }
            hVar2.f(f15601F);
            hVar2.e(250);
            hVar2.g(this.f15604C);
            this.f15630y = hVar2;
            hVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f15609d;
        if (actionBarOverlayLayout != null) {
            C4600b0.l0(actionBarOverlayLayout);
        }
    }

    public int K() {
        return this.f15611f.k();
    }

    public void N(int i10, int i11) {
        int x10 = this.f15611f.x();
        if ((i11 & 4) != 0) {
            this.f15617l = true;
        }
        this.f15611f.i((i10 & i11) | ((~i11) & x10));
    }

    public void O(float f10) {
        C4600b0.x0(this.f15610e, f10);
    }

    public void Q(boolean z10) {
        if (!z10 || this.f15609d.x()) {
            this.f15602A = z10;
            this.f15609d.setHideOnContentScrollEnabled(z10);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void a() {
        if (this.f15627v) {
            this.f15627v = false;
            T(true);
        }
    }

    public void b(int i10) {
        this.f15624s = i10;
    }

    public void c() {
    }

    public void d(boolean z10) {
        this.f15625t = z10;
    }

    public void e() {
        if (!this.f15627v) {
            this.f15627v = true;
            T(true);
        }
    }

    public void f() {
        h hVar = this.f15630y;
        if (hVar != null) {
            hVar.a();
            this.f15630y = null;
        }
    }

    public boolean h() {
        C5007t tVar = this.f15611f;
        if (tVar == null || !tVar.h()) {
            return false;
        }
        this.f15611f.collapseActionView();
        return true;
    }

    public void i(boolean z10) {
        if (z10 != this.f15621p) {
            this.f15621p = z10;
            int size = this.f15622q.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f15622q.get(i10).a(z10);
            }
        }
    }

    public int j() {
        return this.f15611f.x();
    }

    public Context k() {
        if (this.f15607b == null) {
            TypedValue typedValue = new TypedValue();
            this.f15606a.getTheme().resolveAttribute(C5421a.f23892g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f15607b = new ContextThemeWrapper(this.f15606a, i10);
            } else {
                this.f15607b = this.f15606a;
            }
        }
        return this.f15607b;
    }

    public void l() {
        if (!this.f15626u) {
            this.f15626u = true;
            T(false);
        }
    }

    public void n(Configuration configuration) {
        P(androidx.appcompat.view.a.b(this.f15606a).g());
    }

    public boolean p(int i10, KeyEvent keyEvent) {
        Menu e10;
        d dVar = this.f15618m;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        e10.setQwertyMode(z10);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    public void s(boolean z10) {
        if (!this.f15617l) {
            t(z10);
        }
    }

    public void t(boolean z10) {
        N(z10 ? 4 : 0, 4);
    }

    public void u(boolean z10) {
        N(z10 ? 2 : 0, 2);
    }

    public void v(boolean z10) {
        N(z10 ? 8 : 0, 8);
    }

    public void w(int i10) {
        this.f15611f.o(i10);
    }

    public void x(int i10) {
        this.f15611f.u(i10);
    }

    public void y(boolean z10) {
        this.f15611f.n(z10);
    }

    public void z(boolean z10) {
        h hVar;
        this.f15631z = z10;
        if (!z10 && (hVar = this.f15630y) != null) {
            hVar.a();
        }
    }

    public x(Dialog dialog) {
        M(dialog.getWindow().getDecorView());
    }
}
