package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.MenuPopupWindow;
import i.C5424d;
import i.C5427g;

final class n extends i implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, k, View.OnKeyListener {

    /* renamed from: v  reason: collision with root package name */
    private static final int f15900v = C5427g.f24019m;

    /* renamed from: b  reason: collision with root package name */
    private final Context f15901b;

    /* renamed from: c  reason: collision with root package name */
    private final f f15902c;

    /* renamed from: d  reason: collision with root package name */
    private final e f15903d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f15904e;

    /* renamed from: f  reason: collision with root package name */
    private final int f15905f;

    /* renamed from: g  reason: collision with root package name */
    private final int f15906g;

    /* renamed from: h  reason: collision with root package name */
    private final int f15907h;

    /* renamed from: i  reason: collision with root package name */
    final MenuPopupWindow f15908i;

    /* renamed from: j  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f15909j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f15910k = new b();

    /* renamed from: l  reason: collision with root package name */
    private PopupWindow.OnDismissListener f15911l;

    /* renamed from: m  reason: collision with root package name */
    private View f15912m;

    /* renamed from: n  reason: collision with root package name */
    View f15913n;

    /* renamed from: o  reason: collision with root package name */
    private k.a f15914o;

    /* renamed from: p  reason: collision with root package name */
    ViewTreeObserver f15915p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f15916q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f15917r;

    /* renamed from: s  reason: collision with root package name */
    private int f15918s;

    /* renamed from: t  reason: collision with root package name */
    private int f15919t = 0;

    /* renamed from: u  reason: collision with root package name */
    private boolean f15920u;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (n.this.b() && !n.this.f15908i.B()) {
                View view = n.this.f15913n;
                if (view == null || !view.isShown()) {
                    n.this.dismiss();
                } else {
                    n.this.f15908i.a();
                }
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = n.this.f15915p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    n.this.f15915p = view.getViewTreeObserver();
                }
                n nVar = n.this;
                nVar.f15915p.removeGlobalOnLayoutListener(nVar.f15909j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public n(Context context, f fVar, View view, int i10, int i11, boolean z10) {
        this.f15901b = context;
        this.f15902c = fVar;
        this.f15904e = z10;
        this.f15903d = new e(fVar, LayoutInflater.from(context), z10, f15900v);
        this.f15906g = i10;
        this.f15907h = i11;
        Resources resources = context.getResources();
        this.f15905f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5424d.f23924d));
        this.f15912m = view;
        this.f15908i = new MenuPopupWindow(context, (AttributeSet) null, i10, i11);
        fVar.c(this, context);
    }

    private boolean B() {
        View view;
        if (b()) {
            return true;
        }
        if (this.f15916q || (view = this.f15912m) == null) {
            return false;
        }
        this.f15913n = view;
        this.f15908i.K(this);
        this.f15908i.L(this);
        this.f15908i.J(true);
        View view2 = this.f15913n;
        boolean z10 = this.f15915p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f15915p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f15909j);
        }
        view2.addOnAttachStateChangeListener(this.f15910k);
        this.f15908i.D(view2);
        this.f15908i.G(this.f15919t);
        if (!this.f15917r) {
            this.f15918s = i.q(this.f15903d, (ViewGroup) null, this.f15901b, this.f15905f);
            this.f15917r = true;
        }
        this.f15908i.F(this.f15918s);
        this.f15908i.I(2);
        this.f15908i.H(o());
        this.f15908i.a();
        ListView p10 = this.f15908i.p();
        p10.setOnKeyListener(this);
        if (this.f15920u && this.f15902c.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f15901b).inflate(C5427g.f24018l, p10, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f15902c.z());
            }
            frameLayout.setEnabled(false);
            p10.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f15908i.n(this.f15903d);
        this.f15908i.a();
        return true;
    }

    public void a() {
        if (!B()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public boolean b() {
        return !this.f15916q && this.f15908i.b();
    }

    public void c(f fVar, boolean z10) {
        if (fVar == this.f15902c) {
            dismiss();
            k.a aVar = this.f15914o;
            if (aVar != null) {
                aVar.c(fVar, z10);
            }
        }
    }

    public void dismiss() {
        if (b()) {
            this.f15908i.dismiss();
        }
    }

    public void e(k.a aVar) {
        this.f15914o = aVar;
    }

    public void f(Parcelable parcelable) {
    }

    public boolean g(o oVar) {
        if (oVar.hasVisibleItems()) {
            j jVar = new j(this.f15901b, oVar, this.f15913n, this.f15904e, this.f15906g, this.f15907h);
            jVar.j(this.f15914o);
            jVar.g(i.z(oVar));
            jVar.i(this.f15911l);
            this.f15911l = null;
            this.f15902c.e(false);
            int d10 = this.f15908i.d();
            int m10 = this.f15908i.m();
            if ((Gravity.getAbsoluteGravity(this.f15919t, this.f15912m.getLayoutDirection()) & 7) == 5) {
                d10 += this.f15912m.getWidth();
            }
            if (jVar.n(d10, m10)) {
                k.a aVar = this.f15914o;
                if (aVar == null) {
                    return true;
                }
                aVar.d(oVar);
                return true;
            }
        }
        return false;
    }

    public Parcelable h() {
        return null;
    }

    public void i(boolean z10) {
        this.f15917r = false;
        e eVar = this.f15903d;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    public boolean j() {
        return false;
    }

    public void m(f fVar) {
    }

    public void onDismiss() {
        this.f15916q = true;
        this.f15902c.close();
        ViewTreeObserver viewTreeObserver = this.f15915p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f15915p = this.f15913n.getViewTreeObserver();
            }
            this.f15915p.removeGlobalOnLayoutListener(this.f15909j);
            this.f15915p = null;
        }
        this.f15913n.removeOnAttachStateChangeListener(this.f15910k);
        PopupWindow.OnDismissListener onDismissListener = this.f15911l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public ListView p() {
        return this.f15908i.p();
    }

    public void r(View view) {
        this.f15912m = view;
    }

    public void t(boolean z10) {
        this.f15903d.d(z10);
    }

    public void u(int i10) {
        this.f15919t = i10;
    }

    public void v(int i10) {
        this.f15908i.f(i10);
    }

    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.f15911l = onDismissListener;
    }

    public void x(boolean z10) {
        this.f15920u = z10;
    }

    public void y(int i10) {
        this.f15908i.j(i10);
    }
}
