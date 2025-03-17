package androidx.appcompat.view.menu;

import I2.C4632s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.C;
import androidx.appcompat.widget.MenuPopupWindow;
import i.C5424d;
import i.C5427g;
import java.util.ArrayList;
import java.util.List;

final class c extends i implements k, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B  reason: collision with root package name */
    private static final int f15767B = C5427g.f24011e;

    /* renamed from: A  reason: collision with root package name */
    boolean f15768A;

    /* renamed from: b  reason: collision with root package name */
    private final Context f15769b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15770c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15771d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15772e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f15773f;

    /* renamed from: g  reason: collision with root package name */
    final Handler f15774g;

    /* renamed from: h  reason: collision with root package name */
    private final List<f> f15775h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    final List<d> f15776i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f15777j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f15778k = new b();

    /* renamed from: l  reason: collision with root package name */
    private final C f15779l = new C0227c();

    /* renamed from: m  reason: collision with root package name */
    private int f15780m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f15781n = 0;

    /* renamed from: o  reason: collision with root package name */
    private View f15782o;

    /* renamed from: p  reason: collision with root package name */
    View f15783p;

    /* renamed from: q  reason: collision with root package name */
    private int f15784q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f15785r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f15786s;

    /* renamed from: t  reason: collision with root package name */
    private int f15787t;

    /* renamed from: u  reason: collision with root package name */
    private int f15788u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f15789v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f15790w;

    /* renamed from: x  reason: collision with root package name */
    private k.a f15791x;

    /* renamed from: y  reason: collision with root package name */
    ViewTreeObserver f15792y;

    /* renamed from: z  reason: collision with root package name */
    private PopupWindow.OnDismissListener f15793z;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (c.this.b() && c.this.f15776i.size() > 0 && !c.this.f15776i.get(0).f15801a.B()) {
                View view = c.this.f15783p;
                if (view == null || !view.isShown()) {
                    c.this.dismiss();
                    return;
                }
                for (d dVar : c.this.f15776i) {
                    dVar.f15801a.a();
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
            ViewTreeObserver viewTreeObserver = c.this.f15792y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    c.this.f15792y = view.getViewTreeObserver();
                }
                c cVar = c.this;
                cVar.f15792y.removeGlobalOnLayoutListener(cVar.f15777j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.c$c  reason: collision with other inner class name */
    class C0227c implements C {

        /* renamed from: androidx.appcompat.view.menu.c$c$a */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f15797a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MenuItem f15798b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ f f15799c;

            a(d dVar, MenuItem menuItem, f fVar) {
                this.f15797a = dVar;
                this.f15798b = menuItem;
                this.f15799c = fVar;
            }

            public void run() {
                d dVar = this.f15797a;
                if (dVar != null) {
                    c.this.f15768A = true;
                    dVar.f15802b.e(false);
                    c.this.f15768A = false;
                }
                if (this.f15798b.isEnabled() && this.f15798b.hasSubMenu()) {
                    this.f15799c.O(this.f15798b, 4);
                }
            }
        }

        C0227c() {
        }

        public void e(f fVar, MenuItem menuItem) {
            d dVar = null;
            c.this.f15774g.removeCallbacksAndMessages((Object) null);
            int size = c.this.f15776i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (fVar == c.this.f15776i.get(i10).f15802b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 != -1) {
                int i11 = i10 + 1;
                if (i11 < c.this.f15776i.size()) {
                    dVar = c.this.f15776i.get(i11);
                }
                c.this.f15774g.postAtTime(new a(dVar, menuItem, fVar), fVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void o(f fVar, MenuItem menuItem) {
            c.this.f15774g.removeCallbacksAndMessages(fVar);
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        public final MenuPopupWindow f15801a;

        /* renamed from: b  reason: collision with root package name */
        public final f f15802b;

        /* renamed from: c  reason: collision with root package name */
        public final int f15803c;

        public d(MenuPopupWindow menuPopupWindow, f fVar, int i10) {
            this.f15801a = menuPopupWindow;
            this.f15802b = fVar;
            this.f15803c = i10;
        }

        public ListView a() {
            return this.f15801a.p();
        }
    }

    public c(Context context, View view, int i10, int i11, boolean z10) {
        this.f15769b = context;
        this.f15782o = view;
        this.f15771d = i10;
        this.f15772e = i11;
        this.f15773f = z10;
        this.f15789v = false;
        this.f15784q = F();
        Resources resources = context.getResources();
        this.f15770c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5424d.f23924d));
        this.f15774g = new Handler();
    }

    private MenuPopupWindow B() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f15769b, (AttributeSet) null, this.f15771d, this.f15772e);
        menuPopupWindow.U(this.f15779l);
        menuPopupWindow.L(this);
        menuPopupWindow.K(this);
        menuPopupWindow.D(this.f15782o);
        menuPopupWindow.G(this.f15781n);
        menuPopupWindow.J(true);
        menuPopupWindow.I(2);
        return menuPopupWindow;
    }

    private int C(f fVar) {
        int size = this.f15776i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (fVar == this.f15776i.get(i10).f15802b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem D(f fVar, f fVar2) {
        int size = fVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = fVar.getItem(i10);
            if (item.hasSubMenu() && fVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View E(d dVar, f fVar) {
        int i10;
        e eVar;
        int firstVisiblePosition;
        MenuItem D10 = D(dVar.f15802b, fVar);
        if (D10 == null) {
            return null;
        }
        ListView a10 = dVar.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            eVar = (e) headerViewListAdapter.getWrappedAdapter();
        } else {
            eVar = (e) adapter;
            i10 = 0;
        }
        int count = eVar.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            } else if (D10 == eVar.getItem(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int F() {
        return this.f15782o.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int G(int i10) {
        List<d> list = this.f15776i;
        ListView a10 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f15783p.getWindowVisibleDisplayFrame(rect);
        return this.f15784q == 1 ? (iArr[0] + a10.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void H(f fVar) {
        View view;
        d dVar;
        LayoutInflater from = LayoutInflater.from(this.f15769b);
        e eVar = new e(fVar, from, this.f15773f, f15767B);
        if (!b() && this.f15789v) {
            eVar.d(true);
        } else if (b()) {
            eVar.d(i.z(fVar));
        }
        int q10 = i.q(eVar, (ViewGroup) null, this.f15769b, this.f15770c);
        MenuPopupWindow B10 = B();
        B10.n(eVar);
        B10.F(q10);
        B10.G(this.f15781n);
        if (this.f15776i.size() > 0) {
            List<d> list = this.f15776i;
            dVar = list.get(list.size() - 1);
            view = E(dVar, fVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            B10.V(false);
            B10.S((Object) null);
            int G10 = G(q10);
            boolean z10 = G10 == 1;
            this.f15784q = G10;
            B10.D(view);
            if ((this.f15781n & 5) != 5) {
                q10 = z10 ? view.getWidth() : 0 - q10;
            } else if (!z10) {
                q10 = 0 - view.getWidth();
            }
            B10.f(q10);
            B10.N(true);
            B10.j(0);
        } else {
            if (this.f15785r) {
                B10.f(this.f15787t);
            }
            if (this.f15786s) {
                B10.j(this.f15788u);
            }
            B10.H(o());
        }
        this.f15776i.add(new d(B10, fVar, this.f15784q));
        B10.a();
        ListView p10 = B10.p();
        p10.setOnKeyListener(this);
        if (dVar == null && this.f15790w && fVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C5427g.f24018l, p10, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(fVar.z());
            p10.addHeaderView(frameLayout, (Object) null, false);
            B10.a();
        }
    }

    public void a() {
        if (!b()) {
            for (f H10 : this.f15775h) {
                H(H10);
            }
            this.f15775h.clear();
            View view = this.f15782o;
            this.f15783p = view;
            if (view != null) {
                boolean z10 = this.f15792y == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f15792y = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f15777j);
                }
                this.f15783p.addOnAttachStateChangeListener(this.f15778k);
            }
        }
    }

    public boolean b() {
        return this.f15776i.size() > 0 && this.f15776i.get(0).f15801a.b();
    }

    public void c(f fVar, boolean z10) {
        int C10 = C(fVar);
        if (C10 >= 0) {
            int i10 = C10 + 1;
            if (i10 < this.f15776i.size()) {
                this.f15776i.get(i10).f15802b.e(false);
            }
            d remove = this.f15776i.remove(C10);
            remove.f15802b.R(this);
            if (this.f15768A) {
                remove.f15801a.T((Object) null);
                remove.f15801a.E(0);
            }
            remove.f15801a.dismiss();
            int size = this.f15776i.size();
            if (size > 0) {
                this.f15784q = this.f15776i.get(size - 1).f15803c;
            } else {
                this.f15784q = F();
            }
            if (size == 0) {
                dismiss();
                k.a aVar = this.f15791x;
                if (aVar != null) {
                    aVar.c(fVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f15792y;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f15792y.removeGlobalOnLayoutListener(this.f15777j);
                    }
                    this.f15792y = null;
                }
                this.f15783p.removeOnAttachStateChangeListener(this.f15778k);
                this.f15793z.onDismiss();
            } else if (z10) {
                this.f15776i.get(0).f15802b.e(false);
            }
        }
    }

    public void dismiss() {
        int size = this.f15776i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f15776i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f15801a.b()) {
                    dVar.f15801a.dismiss();
                }
            }
        }
    }

    public void e(k.a aVar) {
        this.f15791x = aVar;
    }

    public void f(Parcelable parcelable) {
    }

    public boolean g(o oVar) {
        for (d next : this.f15776i) {
            if (oVar == next.f15802b) {
                next.a().requestFocus();
                return true;
            }
        }
        if (!oVar.hasVisibleItems()) {
            return false;
        }
        m(oVar);
        k.a aVar = this.f15791x;
        if (aVar != null) {
            aVar.d(oVar);
        }
        return true;
    }

    public Parcelable h() {
        return null;
    }

    public void i(boolean z10) {
        for (d a10 : this.f15776i) {
            i.A(a10.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public boolean j() {
        return false;
    }

    public void m(f fVar) {
        fVar.c(this, this.f15769b);
        if (b()) {
            H(fVar);
        } else {
            this.f15775h.add(fVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean n() {
        return false;
    }

    public void onDismiss() {
        d dVar;
        int size = this.f15776i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f15776i.get(i10);
            if (!dVar.f15801a.b()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f15802b.e(false);
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
        if (this.f15776i.isEmpty()) {
            return null;
        }
        List<d> list = this.f15776i;
        return list.get(list.size() - 1).a();
    }

    public void r(View view) {
        if (this.f15782o != view) {
            this.f15782o = view;
            this.f15781n = C4632s.b(this.f15780m, view.getLayoutDirection());
        }
    }

    public void t(boolean z10) {
        this.f15789v = z10;
    }

    public void u(int i10) {
        if (this.f15780m != i10) {
            this.f15780m = i10;
            this.f15781n = C4632s.b(i10, this.f15782o.getLayoutDirection());
        }
    }

    public void v(int i10) {
        this.f15785r = true;
        this.f15787t = i10;
    }

    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.f15793z = onDismissListener;
    }

    public void x(boolean z10) {
        this.f15790w = z10;
    }

    public void y(int i10) {
        this.f15786s = true;
        this.f15788u = i10;
    }
}
