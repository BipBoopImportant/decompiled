package androidx.appcompat.app;

import H2.i;
import I2.C4600b0;
import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.C5007t;
import androidx.appcompat.widget.Q;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

class u extends a {

    /* renamed from: a  reason: collision with root package name */
    final C5007t f15575a;

    /* renamed from: b  reason: collision with root package name */
    final Window.Callback f15576b;

    /* renamed from: c  reason: collision with root package name */
    final AppCompatDelegateImpl.g f15577c;

    /* renamed from: d  reason: collision with root package name */
    boolean f15578d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15579e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15580f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<a.b> f15581g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f15582h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final Toolbar.h f15583i;

    class a implements Runnable {
        a() {
        }

        public void run() {
            u.this.F();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return u.this.f15576b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements k.a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f15586a;

        c() {
        }

        public void c(f fVar, boolean z10) {
            if (!this.f15586a) {
                this.f15586a = true;
                u.this.f15575a.r();
                u.this.f15576b.onPanelClosed(108, fVar);
                this.f15586a = false;
            }
        }

        public boolean d(f fVar) {
            u.this.f15576b.onMenuOpened(108, fVar);
            return true;
        }
    }

    private final class d implements f.a {
        d() {
        }

        public boolean a(f fVar, MenuItem menuItem) {
            return false;
        }

        public void b(f fVar) {
            if (u.this.f15575a.e()) {
                u.this.f15576b.onPanelClosed(108, fVar);
            } else if (u.this.f15576b.onPreparePanel(0, (View) null, fVar)) {
                u.this.f15576b.onMenuOpened(108, fVar);
            }
        }
    }

    private class e implements AppCompatDelegateImpl.g {
        e() {
        }

        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            u uVar = u.this;
            if (uVar.f15578d) {
                return false;
            }
            uVar.f15575a.f();
            u.this.f15578d = true;
            return false;
        }

        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(u.this.f15575a.getContext());
            }
            return null;
        }
    }

    u(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f15583i = bVar;
        i.g(toolbar);
        Q q10 = new Q(toolbar, false);
        this.f15575a = q10;
        this.f15576b = (Window.Callback) i.g(callback);
        q10.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        q10.setWindowTitle(charSequence);
        this.f15577c = new e();
    }

    private Menu E() {
        if (!this.f15579e) {
            this.f15575a.v(new c(), new d());
            this.f15579e = true;
        }
        return this.f15575a.j();
    }

    public void A(CharSequence charSequence) {
        this.f15575a.setTitle(charSequence);
    }

    public void B(CharSequence charSequence) {
        this.f15575a.setWindowTitle(charSequence);
    }

    public void C() {
        this.f15575a.w(0);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void F() {
        /*
            r5 = this;
            android.view.Menu r0 = r5.E()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.f
            r2 = 0
            if (r1 == 0) goto L_0x000d
            r1 = r0
            androidx.appcompat.view.menu.f r1 = (androidx.appcompat.view.menu.f) r1
            goto L_0x000e
        L_0x000d:
            r1 = r2
        L_0x000e:
            if (r1 == 0) goto L_0x0013
            r1.i0()
        L_0x0013:
            r0.clear()     // Catch:{ all -> 0x0028 }
            android.view.Window$Callback r3 = r5.f15576b     // Catch:{ all -> 0x0028 }
            r4 = 0
            boolean r3 = r3.onCreatePanelMenu(r4, r0)     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x002a
            android.view.Window$Callback r3 = r5.f15576b     // Catch:{ all -> 0x0028 }
            boolean r2 = r3.onPreparePanel(r4, r2, r0)     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x002d
            goto L_0x002a
        L_0x0028:
            r0 = move-exception
            goto L_0x0033
        L_0x002a:
            r0.clear()     // Catch:{ all -> 0x0028 }
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.h0()
        L_0x0032:
            return
        L_0x0033:
            if (r1 == 0) goto L_0x0038
            r1.h0()
        L_0x0038:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.u.F():void");
    }

    public void G(int i10, int i11) {
        this.f15575a.i((i10 & i11) | ((~i11) & this.f15575a.x()));
    }

    public boolean g() {
        return this.f15575a.b();
    }

    public boolean h() {
        if (!this.f15575a.h()) {
            return false;
        }
        this.f15575a.collapseActionView();
        return true;
    }

    public void i(boolean z10) {
        if (z10 != this.f15580f) {
            this.f15580f = z10;
            int size = this.f15581g.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f15581g.get(i10).a(z10);
            }
        }
    }

    public int j() {
        return this.f15575a.x();
    }

    public Context k() {
        return this.f15575a.getContext();
    }

    public void l() {
        this.f15575a.w(8);
    }

    public boolean m() {
        this.f15575a.m().removeCallbacks(this.f15582h);
        C4600b0.g0(this.f15575a.m(), this.f15582h);
        return true;
    }

    public void n(Configuration configuration) {
        super.n(configuration);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.f15575a.m().removeCallbacks(this.f15582h);
    }

    public boolean p(int i10, KeyEvent keyEvent) {
        Menu E10 = E();
        if (E10 == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        E10.setQwertyMode(z10);
        return E10.performShortcut(i10, keyEvent, 0);
    }

    public boolean q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            r();
        }
        return true;
    }

    public boolean r() {
        return this.f15575a.c();
    }

    public void s(boolean z10) {
    }

    public void t(boolean z10) {
        G(z10 ? 4 : 0, 4);
    }

    public void u(boolean z10) {
        G(z10 ? 2 : 0, 2);
    }

    public void v(boolean z10) {
        G(z10 ? 8 : 0, 8);
    }

    public void w(int i10) {
        this.f15575a.o(i10);
    }

    public void x(int i10) {
        this.f15575a.u(i10);
    }

    public void y(boolean z10) {
    }

    public void z(boolean z10) {
    }
}
