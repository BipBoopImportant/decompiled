package androidx.appcompat.app;

import I2.C0;
import I2.C4600b0;
import I2.C4618k0;
import I2.C4620l0;
import I2.C4622m0;
import I2.C4634t;
import I2.C4636u;
import I2.I;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C4993e;
import androidx.appcompat.widget.C5006s;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.M;
import androidx.appcompat.widget.T;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.U;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import i.C5421a;
import i.C5423c;
import i.C5426f;
import i.C5427g;
import i.C5429i;
import i.C5430j;
import j.C5443a;
import j0.b0;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import u2.C6012a;
import w2.C6214h;

class AppCompatDelegateImpl extends g implements f.a, LayoutInflater.Factory2 {

    /* renamed from: J0  reason: collision with root package name */
    private static final b0<String, Integer> f15437J0 = new b0<>();

    /* renamed from: K0  reason: collision with root package name */
    private static final boolean f15438K0 = false;

    /* renamed from: L0  reason: collision with root package name */
    private static final int[] f15439L0 = {16842836};

    /* renamed from: M0  reason: collision with root package name */
    private static final boolean f15440M0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: A  reason: collision with root package name */
    private boolean f15441A;

    /* renamed from: A0  reason: collision with root package name */
    int f15442A0;

    /* renamed from: B  reason: collision with root package name */
    ViewGroup f15443B;

    /* renamed from: B0  reason: collision with root package name */
    private final Runnable f15444B0;

    /* renamed from: C  reason: collision with root package name */
    private TextView f15445C;

    /* renamed from: C0  reason: collision with root package name */
    private boolean f15446C0;

    /* renamed from: D  reason: collision with root package name */
    private View f15447D;

    /* renamed from: D0  reason: collision with root package name */
    private Rect f15448D0;

    /* renamed from: E  reason: collision with root package name */
    private boolean f15449E;

    /* renamed from: E0  reason: collision with root package name */
    private Rect f15450E0;

    /* renamed from: F  reason: collision with root package name */
    private boolean f15451F;

    /* renamed from: F0  reason: collision with root package name */
    private q f15452F0;

    /* renamed from: G  reason: collision with root package name */
    boolean f15453G;

    /* renamed from: G0  reason: collision with root package name */
    private s f15454G0;

    /* renamed from: H  reason: collision with root package name */
    boolean f15455H;

    /* renamed from: H0  reason: collision with root package name */
    private OnBackInvokedDispatcher f15456H0;

    /* renamed from: I  reason: collision with root package name */
    boolean f15457I;

    /* renamed from: I0  reason: collision with root package name */
    private OnBackInvokedCallback f15458I0;

    /* renamed from: J  reason: collision with root package name */
    boolean f15459J;

    /* renamed from: K  reason: collision with root package name */
    boolean f15460K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f15461L;

    /* renamed from: M  reason: collision with root package name */
    private r[] f15462M;

    /* renamed from: N  reason: collision with root package name */
    private r f15463N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f15464O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f15465P;

    /* renamed from: Q  reason: collision with root package name */
    private boolean f15466Q;

    /* renamed from: R  reason: collision with root package name */
    boolean f15467R;

    /* renamed from: S  reason: collision with root package name */
    private Configuration f15468S;

    /* renamed from: T  reason: collision with root package name */
    private int f15469T;

    /* renamed from: U  reason: collision with root package name */
    private int f15470U;

    /* renamed from: X  reason: collision with root package name */
    private int f15471X;

    /* renamed from: Y  reason: collision with root package name */
    private boolean f15472Y;

    /* renamed from: Z  reason: collision with root package name */
    private p f15473Z;

    /* renamed from: j  reason: collision with root package name */
    final Object f15474j;

    /* renamed from: k  reason: collision with root package name */
    final Context f15475k;

    /* renamed from: l  reason: collision with root package name */
    Window f15476l;

    /* renamed from: m  reason: collision with root package name */
    private n f15477m;

    /* renamed from: n  reason: collision with root package name */
    final d f15478n;

    /* renamed from: o  reason: collision with root package name */
    a f15479o;

    /* renamed from: p  reason: collision with root package name */
    MenuInflater f15480p;

    /* renamed from: q  reason: collision with root package name */
    private CharSequence f15481q;

    /* renamed from: r  reason: collision with root package name */
    private C5006s f15482r;

    /* renamed from: s  reason: collision with root package name */
    private h f15483s;

    /* renamed from: t  reason: collision with root package name */
    private s f15484t;

    /* renamed from: u  reason: collision with root package name */
    androidx.appcompat.view.b f15485u;

    /* renamed from: v  reason: collision with root package name */
    ActionBarContextView f15486v;

    /* renamed from: w  reason: collision with root package name */
    PopupWindow f15487w;

    /* renamed from: x  reason: collision with root package name */
    Runnable f15488x;

    /* renamed from: y  reason: collision with root package name */
    C4618k0 f15489y;

    /* renamed from: y0  reason: collision with root package name */
    private p f15490y0;

    /* renamed from: z  reason: collision with root package name */
    private boolean f15491z;

    /* renamed from: z0  reason: collision with root package name */
    boolean f15492z0;

    private class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.s0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.m0(0);
            return true;
        }

        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(C5443a.b(getContext(), i10));
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f15442A0 & 1) != 0) {
                appCompatDelegateImpl.t0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f15442A0 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                appCompatDelegateImpl2.t0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f15492z0 = false;
            appCompatDelegateImpl3.f15442A0 = 0;
        }
    }

    class b implements I {
        b() {
        }

        public C0 a(View view, C0 c02) {
            int m10 = c02.m();
            int p12 = AppCompatDelegateImpl.this.p1(c02, (Rect) null);
            if (m10 != p12) {
                c02 = c02.s(c02.k(), p12, c02.l(), c02.j());
            }
            return C4600b0.a0(view, c02);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        public void a() {
        }

        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.r0();
        }
    }

    class d implements Runnable {

        class a extends C4622m0 {
            a() {
            }

            public void b(View view) {
                AppCompatDelegateImpl.this.f15486v.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f15489y.h((C4620l0) null);
                AppCompatDelegateImpl.this.f15489y = null;
            }

            public void c(View view) {
                AppCompatDelegateImpl.this.f15486v.setVisibility(0);
            }
        }

        d() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f15487w.showAtLocation(appCompatDelegateImpl.f15486v, 55, 0, 0);
            AppCompatDelegateImpl.this.u0();
            if (AppCompatDelegateImpl.this.f1()) {
                AppCompatDelegateImpl.this.f15486v.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f15489y = C4600b0.e(appCompatDelegateImpl2.f15486v).b(1.0f);
                AppCompatDelegateImpl.this.f15489y.h(new a());
                return;
            }
            AppCompatDelegateImpl.this.f15486v.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f15486v.setVisibility(0);
        }
    }

    class e extends C4622m0 {
        e() {
        }

        public void b(View view) {
            AppCompatDelegateImpl.this.f15486v.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f15489y.h((C4620l0) null);
            AppCompatDelegateImpl.this.f15489y = null;
        }

        public void c(View view) {
            AppCompatDelegateImpl.this.f15486v.setVisibility(0);
            if (AppCompatDelegateImpl.this.f15486v.getParent() instanceof View) {
                C4600b0.l0((View) AppCompatDelegateImpl.this.f15486v.getParent());
            }
        }
    }

    private class f implements b {
        f() {
        }
    }

    interface g {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    private final class h implements k.a {
        h() {
        }

        public void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            AppCompatDelegateImpl.this.k0(fVar);
        }

        public boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback G02 = AppCompatDelegateImpl.this.G0();
            if (G02 == null) {
                return true;
            }
            G02.onMenuOpened(108, fVar);
            return true;
        }
    }

    class i implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f15502a;

        class a extends C4622m0 {
            a() {
            }

            public void b(View view) {
                AppCompatDelegateImpl.this.f15486v.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f15487w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f15486v.getParent() instanceof View) {
                    C4600b0.l0((View) AppCompatDelegateImpl.this.f15486v.getParent());
                }
                AppCompatDelegateImpl.this.f15486v.k();
                AppCompatDelegateImpl.this.f15489y.h((C4620l0) null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f15489y = null;
                C4600b0.l0(appCompatDelegateImpl2.f15443B);
            }
        }

        public i(b.a aVar) {
            this.f15502a = aVar;
        }

        public void a(androidx.appcompat.view.b bVar) {
            this.f15502a.a(bVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f15487w != null) {
                appCompatDelegateImpl.f15476l.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f15488x);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f15486v != null) {
                appCompatDelegateImpl2.u0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f15489y = C4600b0.e(appCompatDelegateImpl3.f15486v).b(0.0f);
                AppCompatDelegateImpl.this.f15489y.h(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            d dVar = appCompatDelegateImpl4.f15478n;
            if (dVar != null) {
                dVar.onSupportActionModeFinished(appCompatDelegateImpl4.f15485u);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f15485u = null;
            C4600b0.l0(appCompatDelegateImpl5.f15443B);
            AppCompatDelegateImpl.this.n1();
        }

        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f15502a.b(bVar, menu);
        }

        public boolean c(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f15502a.c(bVar, menuItem);
        }

        public boolean d(androidx.appcompat.view.b bVar, Menu menu) {
            C4600b0.l0(AppCompatDelegateImpl.this.f15443B);
            return this.f15502a.d(bVar, menu);
        }
    }

    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        static D2.j b(Configuration configuration) {
            return D2.j.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(D2.j jVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(jVar.g()));
        }

        static void d(Configuration configuration, D2.j jVar) {
            configuration.setLocales(LocaleList.forLanguageTags(jVar.g()));
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    static class m {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            n nVar = new n(appCompatDelegateImpl);
            j.a(obj).registerOnBackInvokedCallback(1000000, nVar);
            return nVar;
        }

        static void c(Object obj, Object obj2) {
            j.a(obj).unregisterOnBackInvokedCallback(i.a(obj2));
        }
    }

    class n extends WindowCallbackWrapper {

        /* renamed from: a  reason: collision with root package name */
        private g f15505a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f15506b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f15507c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f15508d;

        n(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        public boolean a(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f15507c = true;
                boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                this.f15507c = false;
                return dispatchKeyEvent;
            } catch (Throwable th2) {
                this.f15507c = false;
                throw th2;
            }
        }

        /* JADX INFO: finally extract failed */
        public void b(Window.Callback callback) {
            try {
                this.f15506b = true;
                callback.onContentChanged();
                this.f15506b = false;
            } catch (Throwable th2) {
                this.f15506b = false;
                throw th2;
            }
        }

        /* JADX INFO: finally extract failed */
        public void c(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f15508d = true;
                callback.onPanelClosed(i10, menu);
                this.f15508d = false;
            } catch (Throwable th2) {
                this.f15508d = false;
                throw th2;
            }
        }

        /* access modifiers changed from: package-private */
        public void d(g gVar) {
            this.f15505a = gVar;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f15507c ? getWrapped().dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.s0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.R0(keyEvent.getKeyCode(), keyEvent);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode e(ActionMode.Callback callback) {
            f.a aVar = new f.a(AppCompatDelegateImpl.this.f15475k, callback);
            androidx.appcompat.view.b a02 = AppCompatDelegateImpl.this.a0(aVar);
            if (a02 != null) {
                return aVar.e(a02);
            }
            return null;
        }

        public void onContentChanged() {
            if (this.f15506b) {
                getWrapped().onContentChanged();
            }
        }

        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r0.onCreatePanelView(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View onCreatePanelView(int r2) {
            /*
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl$g r0 = r1.f15505a
                if (r0 == 0) goto L_0x000b
                android.view.View r0 = r0.onCreatePanelView(r2)
                if (r0 == 0) goto L_0x000b
                return r0
            L_0x000b:
                android.view.View r2 = super.onCreatePanelView(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.n.onCreatePanelView(int):android.view.View");
        }

        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            AppCompatDelegateImpl.this.U0(i10);
            return true;
        }

        public void onPanelClosed(int i10, Menu menu) {
            if (this.f15508d) {
                getWrapped().onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            AppCompatDelegateImpl.this.V0(i10);
        }

        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar = menu instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) menu : null;
            if (i10 == 0 && fVar == null) {
                return false;
            }
            boolean z10 = true;
            if (fVar != null) {
                fVar.f0(true);
            }
            g gVar = this.f15505a;
            if (gVar == null || !gVar.a(i10)) {
                z10 = false;
            }
            if (!z10) {
                z10 = super.onPreparePanel(i10, view, menu);
            }
            if (fVar != null) {
                fVar.f0(false);
            }
            return z10;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.f fVar;
            r E02 = AppCompatDelegateImpl.this.E0(0, true);
            if (E02 == null || (fVar = E02.f15526j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, fVar, i10);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            if (!AppCompatDelegateImpl.this.M0() || i10 != 0) {
                return super.onWindowStartingActionMode(callback, i10);
            }
            return e(callback);
        }
    }

    private class o extends p {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f15510c;

        o(Context context) {
            super();
            this.f15510c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            return j.a(this.f15510c) ? 2 : 1;
        }

        public void d() {
            AppCompatDelegateImpl.this.h();
        }
    }

    abstract class p {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f15512a;

        class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        p() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.f15512a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f15475k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f15512a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract IntentFilter b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f15512a == null) {
                    this.f15512a = new a();
                }
                AppCompatDelegateImpl.this.f15475k.registerReceiver(this.f15512a, b10);
            }
        }
    }

    private class q extends p {

        /* renamed from: c  reason: collision with root package name */
        private final w f15515c;

        q(w wVar) {
            super();
            this.f15515c = wVar;
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            return this.f15515c.d() ? 2 : 1;
        }

        public void d() {
            AppCompatDelegateImpl.this.h();
        }
    }

    protected static final class r {

        /* renamed from: a  reason: collision with root package name */
        int f15517a;

        /* renamed from: b  reason: collision with root package name */
        int f15518b;

        /* renamed from: c  reason: collision with root package name */
        int f15519c;

        /* renamed from: d  reason: collision with root package name */
        int f15520d;

        /* renamed from: e  reason: collision with root package name */
        int f15521e;

        /* renamed from: f  reason: collision with root package name */
        int f15522f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f15523g;

        /* renamed from: h  reason: collision with root package name */
        View f15524h;

        /* renamed from: i  reason: collision with root package name */
        View f15525i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.f f15526j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.d f15527k;

        /* renamed from: l  reason: collision with root package name */
        Context f15528l;

        /* renamed from: m  reason: collision with root package name */
        boolean f15529m;

        /* renamed from: n  reason: collision with root package name */
        boolean f15530n;

        /* renamed from: o  reason: collision with root package name */
        boolean f15531o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f15532p;

        /* renamed from: q  reason: collision with root package name */
        boolean f15533q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f15534r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f15535s;

        r(int i10) {
            this.f15517a = i10;
        }

        /* access modifiers changed from: package-private */
        public androidx.appcompat.view.menu.l a(k.a aVar) {
            if (this.f15526j == null) {
                return null;
            }
            if (this.f15527k == null) {
                androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(this.f15528l, C5427g.f24016j);
                this.f15527k = dVar;
                dVar.e(aVar);
                this.f15526j.b(this.f15527k);
            }
            return this.f15527k.b(this.f15523g);
        }

        public boolean b() {
            if (this.f15524h == null) {
                return false;
            }
            if (this.f15525i != null) {
                return true;
            }
            return this.f15527k.a().getCount() > 0;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.d dVar;
            androidx.appcompat.view.menu.f fVar2 = this.f15526j;
            if (fVar != fVar2) {
                if (fVar2 != null) {
                    fVar2.R(this.f15527k);
                }
                this.f15526j = fVar;
                if (fVar != null && (dVar = this.f15527k) != null) {
                    fVar.b(dVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C5421a.f23886a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(C5421a.f23877G, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            } else {
                newTheme.applyStyle(C5429i.f24037a, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f15528l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C5430j.f24266y0);
            this.f15518b = obtainStyledAttributes.getResourceId(C5430j.f24046B0, 0);
            this.f15522f = obtainStyledAttributes.getResourceId(C5430j.f24041A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private final class s implements k.a {
        s() {
        }

        public void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            androidx.appcompat.view.menu.f F10 = fVar.F();
            boolean z11 = F10 != fVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z11) {
                fVar = F10;
            }
            r x02 = appCompatDelegateImpl.x0(fVar);
            if (x02 == null) {
                return;
            }
            if (z11) {
                AppCompatDelegateImpl.this.j0(x02.f15517a, x02, F10);
                AppCompatDelegateImpl.this.n0(x02, true);
                return;
            }
            AppCompatDelegateImpl.this.n0(x02, z10);
        }

        public boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback G02;
            if (fVar != fVar.F()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f15453G || (G02 = appCompatDelegateImpl.G0()) == null || AppCompatDelegateImpl.this.f15467R) {
                return true;
            }
            G02.onMenuOpened(108, fVar);
            return true;
        }
    }

    AppCompatDelegateImpl(Activity activity, d dVar) {
        this(activity, (Window) null, dVar, activity);
    }

    private int A0(Context context) {
        if (!this.f15472Y && (this.f15474j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f15474j.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f15471X = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f15471X = 0;
            }
        }
        this.f15472Y = true;
        return this.f15471X;
    }

    private p B0(Context context) {
        if (this.f15490y0 == null) {
            this.f15490y0 = new o(context);
        }
        return this.f15490y0;
    }

    private p C0(Context context) {
        if (this.f15473Z == null) {
            this.f15473Z = new q(w.a(context));
        }
        return this.f15473Z;
    }

    private void H0() {
        v0();
        if (this.f15453G && this.f15479o == null) {
            Object obj = this.f15474j;
            if (obj instanceof Activity) {
                this.f15479o = new x((Activity) this.f15474j, this.f15455H);
            } else if (obj instanceof Dialog) {
                this.f15479o = new x((Dialog) this.f15474j);
            }
            a aVar = this.f15479o;
            if (aVar != null) {
                aVar.s(this.f15446C0);
            }
        }
    }

    private boolean I0(r rVar) {
        View view = rVar.f15525i;
        if (view != null) {
            rVar.f15524h = view;
            return true;
        } else if (rVar.f15526j == null) {
            return false;
        } else {
            if (this.f15484t == null) {
                this.f15484t = new s();
            }
            View view2 = (View) rVar.a(this.f15484t);
            rVar.f15524h = view2;
            return view2 != null;
        }
    }

    private boolean J0(r rVar) {
        rVar.d(z0());
        rVar.f15523g = new ListMenuDecorView(rVar.f15528l);
        rVar.f15519c = 81;
        return true;
    }

    private boolean K0(r rVar) {
        Resources.Theme theme;
        Context context = this.f15475k;
        int i10 = rVar.f15517a;
        if ((i10 == 0 || i10 == 108) && this.f15482r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(C5421a.f23891f, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(C5421a.f23892g, typedValue, true);
            } else {
                theme2.resolveAttribute(C5421a.f23892g, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
        fVar.W(this);
        rVar.c(fVar);
        return true;
    }

    private void L0(int i10) {
        this.f15442A0 = (1 << i10) | this.f15442A0;
        if (!this.f15492z0) {
            C4600b0.g0(this.f15476l.getDecorView(), this.f15444B0);
            this.f15492z0 = true;
        }
    }

    private boolean Q0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        r E02 = E0(i10, true);
        if (!E02.f15531o) {
            return a1(E02, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean T0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f15485u
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$r r2 = r4.E0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.s r5 = r4.f15482r
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f15475k
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.s r5 = r4.f15482r
            boolean r5 = r5.e()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.f15467R
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.a1(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.s r5 = r4.f15482r
            boolean r0 = r5.c()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.s r5 = r4.f15482r
            boolean r0 = r5.b()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f15531o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f15530n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f15529m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f15534r
            if (r5 == 0) goto L_0x005b
            r2.f15529m = r1
            boolean r5 = r4.a1(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = r0
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.X0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = r1
            goto L_0x0068
        L_0x0064:
            r4.n0(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f15475k
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.T0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void X0(androidx.appcompat.app.AppCompatDelegateImpl.r r12, android.view.KeyEvent r13) {
        /*
            r11 = this;
            boolean r0 = r12.f15531o
            if (r0 != 0) goto L_0x00f3
            boolean r0 = r11.f15467R
            if (r0 == 0) goto L_0x000a
            goto L_0x00f3
        L_0x000a:
            int r0 = r12.f15517a
            if (r0 != 0) goto L_0x0020
            android.content.Context r0 = r11.f15475k
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r1 = 4
            if (r0 != r1) goto L_0x0020
            return
        L_0x0020:
            android.view.Window$Callback r0 = r11.G0()
            r1 = 1
            if (r0 == 0) goto L_0x0035
            int r2 = r12.f15517a
            androidx.appcompat.view.menu.f r3 = r12.f15526j
            boolean r0 = r0.onMenuOpened(r2, r3)
            if (r0 != 0) goto L_0x0035
            r11.n0(r12, r1)
            return
        L_0x0035:
            android.content.Context r0 = r11.f15475k
            java.lang.String r2 = "window"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0042
            return
        L_0x0042:
            boolean r13 = r11.a1(r12, r13)
            if (r13 != 0) goto L_0x0049
            return
        L_0x0049:
            android.view.ViewGroup r13 = r12.f15523g
            r2 = -2
            if (r13 == 0) goto L_0x0064
            boolean r3 = r12.f15533q
            if (r3 == 0) goto L_0x0053
            goto L_0x0064
        L_0x0053:
            android.view.View r13 = r12.f15525i
            if (r13 == 0) goto L_0x00c6
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            if (r13 == 0) goto L_0x00c6
            int r13 = r13.width
            r3 = -1
            if (r13 != r3) goto L_0x00c6
            r4 = r3
            goto L_0x00c7
        L_0x0064:
            if (r13 != 0) goto L_0x0071
            boolean r13 = r11.J0(r12)
            if (r13 == 0) goto L_0x0070
            android.view.ViewGroup r13 = r12.f15523g
            if (r13 != 0) goto L_0x0080
        L_0x0070:
            return
        L_0x0071:
            boolean r3 = r12.f15533q
            if (r3 == 0) goto L_0x0080
            int r13 = r13.getChildCount()
            if (r13 <= 0) goto L_0x0080
            android.view.ViewGroup r13 = r12.f15523g
            r13.removeAllViews()
        L_0x0080:
            boolean r13 = r11.I0(r12)
            if (r13 == 0) goto L_0x00f1
            boolean r13 = r12.b()
            if (r13 != 0) goto L_0x008d
            goto L_0x00f1
        L_0x008d:
            android.view.View r13 = r12.f15524h
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            if (r13 != 0) goto L_0x009a
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r2, r2)
        L_0x009a:
            int r3 = r12.f15518b
            android.view.ViewGroup r4 = r12.f15523g
            r4.setBackgroundResource(r3)
            android.view.View r3 = r12.f15524h
            android.view.ViewParent r3 = r3.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x00b2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r4 = r12.f15524h
            r3.removeView(r4)
        L_0x00b2:
            android.view.ViewGroup r3 = r12.f15523g
            android.view.View r4 = r12.f15524h
            r3.addView(r4, r13)
            android.view.View r13 = r12.f15524h
            boolean r13 = r13.hasFocus()
            if (r13 != 0) goto L_0x00c6
            android.view.View r13 = r12.f15524h
            r13.requestFocus()
        L_0x00c6:
            r4 = r2
        L_0x00c7:
            r13 = 0
            r12.f15530n = r13
            android.view.WindowManager$LayoutParams r13 = new android.view.WindowManager$LayoutParams
            int r6 = r12.f15520d
            int r7 = r12.f15521e
            r9 = 8519680(0x820000, float:1.1938615E-38)
            r10 = -3
            r5 = -2
            r8 = 1002(0x3ea, float:1.404E-42)
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            int r2 = r12.f15519c
            r13.gravity = r2
            int r2 = r12.f15522f
            r13.windowAnimations = r2
            android.view.ViewGroup r2 = r12.f15523g
            r0.addView(r2, r13)
            r12.f15531o = r1
            int r12 = r12.f15517a
            if (r12 != 0) goto L_0x00f0
            r11.n1()
        L_0x00f0:
            return
        L_0x00f1:
            r12.f15533q = r1
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.X0(androidx.appcompat.app.AppCompatDelegateImpl$r, android.view.KeyEvent):void");
    }

    private boolean Z0(r rVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.f fVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((rVar.f15529m || a1(rVar, keyEvent)) && (fVar = rVar.f15526j) != null) {
            z10 = fVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f15482r == null) {
            n0(rVar, true);
        }
        return z10;
    }

    private boolean a1(r rVar, KeyEvent keyEvent) {
        C5006s sVar;
        C5006s sVar2;
        C5006s sVar3;
        if (this.f15467R) {
            return false;
        }
        if (rVar.f15529m) {
            return true;
        }
        r rVar2 = this.f15463N;
        if (!(rVar2 == null || rVar2 == rVar)) {
            n0(rVar2, false);
        }
        Window.Callback G02 = G0();
        if (G02 != null) {
            rVar.f15525i = G02.onCreatePanelView(rVar.f15517a);
        }
        int i10 = rVar.f15517a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (sVar3 = this.f15482r) != null) {
            sVar3.f();
        }
        if (rVar.f15525i == null && (!z10 || !(Y0() instanceof u))) {
            androidx.appcompat.view.menu.f fVar = rVar.f15526j;
            if (fVar == null || rVar.f15534r) {
                if (fVar == null && (!K0(rVar) || rVar.f15526j == null)) {
                    return false;
                }
                if (z10 && this.f15482r != null) {
                    if (this.f15483s == null) {
                        this.f15483s = new h();
                    }
                    this.f15482r.d(rVar.f15526j, this.f15483s);
                }
                rVar.f15526j.i0();
                if (!G02.onCreatePanelMenu(rVar.f15517a, rVar.f15526j)) {
                    rVar.c((androidx.appcompat.view.menu.f) null);
                    if (z10 && (sVar2 = this.f15482r) != null) {
                        sVar2.d((Menu) null, this.f15483s);
                    }
                    return false;
                }
                rVar.f15534r = false;
            }
            rVar.f15526j.i0();
            Bundle bundle = rVar.f15535s;
            if (bundle != null) {
                rVar.f15526j.S(bundle);
                rVar.f15535s = null;
            }
            if (!G02.onPreparePanel(0, rVar.f15525i, rVar.f15526j)) {
                if (z10 && (sVar = this.f15482r) != null) {
                    sVar.d((Menu) null, this.f15483s);
                }
                rVar.f15526j.h0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            rVar.f15532p = z11;
            rVar.f15526j.setQwertyMode(z11);
            rVar.f15526j.h0();
        }
        rVar.f15529m = true;
        rVar.f15530n = false;
        this.f15463N = rVar;
        return true;
    }

    private void b1(boolean z10) {
        C5006s sVar = this.f15482r;
        if (sVar == null || !sVar.a() || (ViewConfiguration.get(this.f15475k).hasPermanentMenuKey() && !this.f15482r.g())) {
            r E02 = E0(0, true);
            E02.f15533q = true;
            n0(E02, false);
            X0(E02, (KeyEvent) null);
            return;
        }
        Window.Callback G02 = G0();
        if (this.f15482r.e() && z10) {
            this.f15482r.b();
            if (!this.f15467R) {
                G02.onPanelClosed(108, E0(0, true).f15526j);
            }
        } else if (G02 != null && !this.f15467R) {
            if (this.f15492z0 && (this.f15442A0 & 1) != 0) {
                this.f15476l.getDecorView().removeCallbacks(this.f15444B0);
                this.f15444B0.run();
            }
            r E03 = E0(0, true);
            androidx.appcompat.view.menu.f fVar = E03.f15526j;
            if (fVar != null && !E03.f15534r && G02.onPreparePanel(0, E03.f15525i, fVar)) {
                G02.onMenuOpened(108, E03.f15526j);
                this.f15482r.c();
            }
        }
    }

    private int c1(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i10 != 9) {
            return i10;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private boolean d0(boolean z10) {
        return e0(z10, true);
    }

    private boolean e0(boolean z10, boolean z11) {
        if (this.f15467R) {
            return false;
        }
        int i02 = i0();
        int N02 = N0(this.f15475k, i02);
        D2.j h02 = Build.VERSION.SDK_INT < 33 ? h0(this.f15475k) : null;
        if (!z11 && h02 != null) {
            h02 = D0(this.f15475k.getResources().getConfiguration());
        }
        boolean m12 = m1(N02, h02, z10);
        if (i02 == 0) {
            C0(this.f15475k).e();
        } else {
            p pVar = this.f15473Z;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (i02 == 3) {
            B0(this.f15475k).e();
        } else {
            p pVar2 = this.f15490y0;
            if (pVar2 != null) {
                pVar2.a();
            }
        }
        return m12;
    }

    private void f0() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f15443B.findViewById(16908290);
        View decorView = this.f15476l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f15475k.obtainStyledAttributes(C5430j.f24266y0);
        obtainStyledAttributes.getValue(C5430j.f24082K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C5430j.f24086L0, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C5430j.f24074I0)) {
            obtainStyledAttributes.getValue(C5430j.f24074I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C5430j.f24078J0)) {
            obtainStyledAttributes.getValue(C5430j.f24078J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C5430j.f24066G0)) {
            obtainStyledAttributes.getValue(C5430j.f24066G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C5430j.f24070H0)) {
            obtainStyledAttributes.getValue(C5430j.f24070H0, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void g0(Window window) {
        if (this.f15476l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof n)) {
                n nVar = new n(callback);
                this.f15477m = nVar;
                window.setCallback(nVar);
                M u10 = M.u(this.f15475k, (AttributeSet) null, f15439L0);
                Drawable h10 = u10.h(0);
                if (h10 != null) {
                    window.setBackgroundDrawable(h10);
                }
                u10.x();
                this.f15476l = window;
                if (Build.VERSION.SDK_INT >= 33 && this.f15456H0 == null) {
                    W((OnBackInvokedDispatcher) null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private boolean g1(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f15476l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int i0() {
        int i10 = this.f15469T;
        return i10 != -100 ? i10 : g.s();
    }

    private void j1() {
        if (this.f15441A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private AppCompatActivity k1() {
        Context context = this.f15475k;
        while (context != null) {
            if (!(context instanceof AppCompatActivity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (AppCompatActivity) context;
            }
        }
        return null;
    }

    private void l0() {
        p pVar = this.f15473Z;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.f15490y0;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    private void l1(Configuration configuration) {
        Activity activity = (Activity) this.f15474j;
        if (activity instanceof C5221y) {
            if (((C5221y) activity).getLifecycle().d().b(r.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.f15466Q && !this.f15467R) {
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1(int r10, D2.j r11, boolean r12) {
        /*
            r9 = this;
            android.content.Context r1 = r9.f15475k
            r4 = 0
            r5 = 0
            r0 = r9
            r2 = r10
            r3 = r11
            android.content.res.Configuration r0 = r0.o0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r9.f15475k
            int r1 = r9.A0(r1)
            android.content.res.Configuration r2 = r9.f15468S
            if (r2 != 0) goto L_0x001f
            android.content.Context r2 = r9.f15475k
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L_0x001f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            D2.j r2 = r9.D0(r2)
            r5 = 0
            if (r11 != 0) goto L_0x0030
            r6 = r5
            goto L_0x0034
        L_0x0030:
            D2.j r6 = r9.D0(r0)
        L_0x0034:
            r7 = 0
            if (r3 == r4) goto L_0x003a
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x003b
        L_0x003a:
            r3 = r7
        L_0x003b:
            if (r6 == 0) goto L_0x0045
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0045
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L_0x0045:
            int r2 = ~r1
            r2 = r2 & r3
            r8 = 1
            if (r2 == 0) goto L_0x008c
            if (r12 == 0) goto L_0x008c
            boolean r12 = r9.f15465P
            if (r12 == 0) goto L_0x008c
            boolean r12 = f15440M0
            if (r12 != 0) goto L_0x0058
            boolean r12 = r9.f15466Q
            if (r12 == 0) goto L_0x008c
        L_0x0058:
            java.lang.Object r12 = r9.f15474j
            boolean r2 = r12 instanceof android.app.Activity
            if (r2 == 0) goto L_0x008c
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r12 = r12.isChild()
            if (r12 != 0) goto L_0x008c
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r12 < r2) goto L_0x0083
            r12 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x0083
            java.lang.Object r12 = r9.f15474j
            android.app.Activity r12 = (android.app.Activity) r12
            android.view.Window r12 = r12.getWindow()
            android.view.View r12 = r12.getDecorView()
            int r0 = r0.getLayoutDirection()
            r12.setLayoutDirection(r0)
        L_0x0083:
            java.lang.Object r12 = r9.f15474j
            android.app.Activity r12 = (android.app.Activity) r12
            androidx.core.app.C5147b.v(r12)
            r12 = r8
            goto L_0x008d
        L_0x008c:
            r12 = r7
        L_0x008d:
            if (r12 != 0) goto L_0x009a
            if (r3 == 0) goto L_0x009a
            r12 = r3 & r1
            if (r12 != r3) goto L_0x0096
            r7 = r8
        L_0x0096:
            r9.o1(r4, r6, r7, r5)
            goto L_0x009b
        L_0x009a:
            r8 = r12
        L_0x009b:
            if (r8 == 0) goto L_0x00b7
            java.lang.Object r12 = r9.f15474j
            boolean r0 = r12 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto L_0x00b7
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x00ac
            androidx.appcompat.app.AppCompatActivity r12 = (androidx.appcompat.app.AppCompatActivity) r12
            r12.onNightModeChanged(r10)
        L_0x00ac:
            r10 = r3 & 4
            if (r10 == 0) goto L_0x00b7
            java.lang.Object r10 = r9.f15474j
            androidx.appcompat.app.AppCompatActivity r10 = (androidx.appcompat.app.AppCompatActivity) r10
            r10.onLocalesChanged(r11)
        L_0x00b7:
            if (r6 == 0) goto L_0x00ca
            android.content.Context r10 = r9.f15475k
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            D2.j r10 = r9.D0(r10)
            r9.e1(r10)
        L_0x00ca:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m1(int, D2.j, boolean):boolean");
    }

    private Configuration o0(Context context, int i10, D2.j jVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & -49);
        if (jVar != null) {
            d1(configuration2, jVar);
        }
        return configuration2;
    }

    private void o1(int i10, D2.j jVar, boolean z10, Configuration configuration) {
        Resources resources = this.f15475k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & -49);
        if (jVar != null) {
            d1(configuration2, jVar);
        }
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        int i11 = this.f15470U;
        if (i11 != 0) {
            this.f15475k.setTheme(i11);
            this.f15475k.getTheme().applyStyle(this.f15470U, true);
        }
        if (z10 && (this.f15474j instanceof Activity)) {
            l1(configuration2);
        }
    }

    private ViewGroup p0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f15475k.obtainStyledAttributes(C5430j.f24266y0);
        if (obtainStyledAttributes.hasValue(C5430j.f24054D0)) {
            if (obtainStyledAttributes.getBoolean(C5430j.f24090M0, false)) {
                P(1);
            } else if (obtainStyledAttributes.getBoolean(C5430j.f24054D0, false)) {
                P(108);
            }
            if (obtainStyledAttributes.getBoolean(C5430j.f24058E0, false)) {
                P(109);
            }
            if (obtainStyledAttributes.getBoolean(C5430j.f24062F0, false)) {
                P(10);
            }
            this.f15459J = obtainStyledAttributes.getBoolean(C5430j.f24271z0, false);
            obtainStyledAttributes.recycle();
            w0();
            this.f15476l.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f15475k);
            if (this.f15460K) {
                viewGroup = this.f15457I ? (ViewGroup) from.inflate(C5427g.f24021o, (ViewGroup) null) : (ViewGroup) from.inflate(C5427g.f24020n, (ViewGroup) null);
            } else if (this.f15459J) {
                viewGroup = (ViewGroup) from.inflate(C5427g.f24012f, (ViewGroup) null);
                this.f15455H = false;
                this.f15453G = false;
            } else if (this.f15453G) {
                TypedValue typedValue = new TypedValue();
                this.f15475k.getTheme().resolveAttribute(C5421a.f23891f, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f15475k, typedValue.resourceId) : this.f15475k).inflate(C5427g.f24022p, (ViewGroup) null);
                C5006s sVar = (C5006s) viewGroup.findViewById(C5426f.f23996p);
                this.f15482r = sVar;
                sVar.setWindowCallback(G0());
                if (this.f15455H) {
                    this.f15482r.h(109);
                }
                if (this.f15449E) {
                    this.f15482r.h(2);
                }
                if (this.f15451F) {
                    this.f15482r.h(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                C4600b0.E0(viewGroup, new b());
                if (this.f15482r == null) {
                    this.f15445C = (TextView) viewGroup.findViewById(C5426f.f23977C);
                }
                U.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C5426f.f23982b);
                ViewGroup viewGroup2 = (ViewGroup) this.f15476l.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f15476l.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f15453G + ", windowActionBarOverlay: " + this.f15455H + ", android:windowIsFloating: " + this.f15459J + ", windowActionModeOverlay: " + this.f15457I + ", windowNoTitle: " + this.f15460K + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void q1(View view) {
        view.setBackgroundColor((C4600b0.L(view) & 8192) != 0 ? C6012a.c(this.f15475k, C5423c.f23914b) : C6012a.c(this.f15475k, C5423c.f23913a));
    }

    private void v0() {
        if (!this.f15441A) {
            this.f15443B = p0();
            CharSequence F02 = F0();
            if (!TextUtils.isEmpty(F02)) {
                C5006s sVar = this.f15482r;
                if (sVar != null) {
                    sVar.setWindowTitle(F02);
                } else if (Y0() != null) {
                    Y0().B(F02);
                } else {
                    TextView textView = this.f15445C;
                    if (textView != null) {
                        textView.setText(F02);
                    }
                }
            }
            f0();
            W0(this.f15443B);
            this.f15441A = true;
            r E02 = E0(0, false);
            if (this.f15467R) {
                return;
            }
            if (E02 == null || E02.f15526j == null) {
                L0(108);
            }
        }
    }

    private void w0() {
        if (this.f15476l == null) {
            Object obj = this.f15474j;
            if (obj instanceof Activity) {
                g0(((Activity) obj).getWindow());
            }
        }
        if (this.f15476l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration y0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            k.a(configuration, configuration2, configuration3);
            int i14 = configuration.touchscreen;
            int i15 = configuration2.touchscreen;
            if (i14 != i15) {
                configuration3.touchscreen = i15;
            }
            int i16 = configuration.keyboard;
            int i17 = configuration2.keyboard;
            if (i16 != i17) {
                configuration3.keyboard = i17;
            }
            int i18 = configuration.keyboardHidden;
            int i19 = configuration2.keyboardHidden;
            if (i18 != i19) {
                configuration3.keyboardHidden = i19;
            }
            int i20 = configuration.navigation;
            int i21 = configuration2.navigation;
            if (i20 != i21) {
                configuration3.navigation = i21;
            }
            int i22 = configuration.navigationHidden;
            int i23 = configuration2.navigationHidden;
            if (i22 != i23) {
                configuration3.navigationHidden = i23;
            }
            int i24 = configuration.orientation;
            int i25 = configuration2.orientation;
            if (i24 != i25) {
                configuration3.orientation = i25;
            }
            int i26 = configuration.screenLayout & 15;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 15)) {
                configuration3.screenLayout |= i27 & 15;
            }
            int i28 = configuration.screenLayout & 192;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & 192)) {
                configuration3.screenLayout |= i29 & 192;
            }
            int i30 = configuration.screenLayout & 48;
            int i31 = configuration2.screenLayout;
            if (i30 != (i31 & 48)) {
                configuration3.screenLayout |= i31 & 48;
            }
            int i32 = configuration.screenLayout & 768;
            int i33 = configuration2.screenLayout;
            if (i32 != (i33 & 768)) {
                configuration3.screenLayout |= i33 & 768;
            }
            l.a(configuration, configuration2, configuration3);
            int i34 = configuration.uiMode & 15;
            int i35 = configuration2.uiMode;
            if (i34 != (i35 & 15)) {
                configuration3.uiMode |= i35 & 15;
            }
            int i36 = configuration.uiMode & 48;
            int i37 = configuration2.uiMode;
            if (i36 != (i37 & 48)) {
                configuration3.uiMode |= i37 & 48;
            }
            int i38 = configuration.screenWidthDp;
            int i39 = configuration2.screenWidthDp;
            if (i38 != i39) {
                configuration3.screenWidthDp = i39;
            }
            int i40 = configuration.screenHeightDp;
            int i41 = configuration2.screenHeightDp;
            if (i40 != i41) {
                configuration3.screenHeightDp = i41;
            }
            int i42 = configuration.smallestScreenWidthDp;
            int i43 = configuration2.smallestScreenWidthDp;
            if (i42 != i43) {
                configuration3.smallestScreenWidthDp = i43;
            }
            int i44 = configuration.densityDpi;
            int i45 = configuration2.densityDpi;
            if (i44 != i45) {
                configuration3.densityDpi = i45;
            }
        }
        return configuration3;
    }

    public void A() {
        LayoutInflater from = LayoutInflater.from(this.f15475k);
        if (from.getFactory() == null) {
            C4636u.a(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void B() {
        if (Y0() != null && !z().m()) {
            L0(0);
        }
    }

    /* access modifiers changed from: package-private */
    public D2.j D0(Configuration configuration) {
        return k.b(configuration);
    }

    /* access modifiers changed from: protected */
    public r E0(int i10, boolean z10) {
        r[] rVarArr = this.f15462M;
        if (rVarArr == null || rVarArr.length <= i10) {
            r[] rVarArr2 = new r[(i10 + 1)];
            if (rVarArr != null) {
                System.arraycopy(rVarArr, 0, rVarArr2, 0, rVarArr.length);
            }
            this.f15462M = rVarArr2;
            rVarArr = rVarArr2;
        }
        r rVar = rVarArr[i10];
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(i10);
        rVarArr[i10] = rVar2;
        return rVar2;
    }

    public void F(Configuration configuration) {
        a z10;
        if (this.f15453G && this.f15441A && (z10 = z()) != null) {
            z10.n(configuration);
        }
        C4993e.b().g(this.f15475k);
        this.f15468S = new Configuration(this.f15475k.getResources().getConfiguration());
        e0(false, false);
    }

    /* access modifiers changed from: package-private */
    public final CharSequence F0() {
        Object obj = this.f15474j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f15481q;
    }

    public void G(Bundle bundle) {
        String str;
        this.f15465P = true;
        d0(false);
        w0();
        Object obj = this.f15474j;
        if (obj instanceof Activity) {
            try {
                str = androidx.core.app.l.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                a Y02 = Y0();
                if (Y02 == null) {
                    this.f15446C0 = true;
                } else {
                    Y02.s(true);
                }
            }
            g.e(this);
        }
        this.f15468S = new Configuration(this.f15475k.getResources().getConfiguration());
        this.f15466Q = true;
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback G0() {
        return this.f15476l.getCallback();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void H() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f15474j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.g.N(r3)
        L_0x0009:
            boolean r0 = r3.f15492z0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f15476l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f15444B0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.f15467R = r0
            int r0 = r3.f15469T
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.f15474j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            j0.b0<java.lang.String, java.lang.Integer> r0 = f15437J0
            java.lang.Object r1 = r3.f15474j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f15469T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            j0.b0<java.lang.String, java.lang.Integer> r0 = f15437J0
            java.lang.Object r1 = r3.f15474j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            androidx.appcompat.app.a r0 = r3.f15479o
            if (r0 == 0) goto L_0x005b
            r0.o()
        L_0x005b:
            r3.l0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.H():void");
    }

    public void I(Bundle bundle) {
        v0();
    }

    public void J() {
        a z10 = z();
        if (z10 != null) {
            z10.z(true);
        }
    }

    public void K(Bundle bundle) {
    }

    public void L() {
        e0(true, false);
    }

    public void M() {
        a z10 = z();
        if (z10 != null) {
            z10.z(false);
        }
    }

    public boolean M0() {
        return this.f15491z;
    }

    /* access modifiers changed from: package-private */
    public int N0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (!(i10 == 1 || i10 == 2)) {
                    if (i10 == 3) {
                        return B0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return C0(context).c();
            }
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public boolean O0() {
        boolean z10 = this.f15464O;
        this.f15464O = false;
        r E02 = E0(0, false);
        if (E02 == null || !E02.f15531o) {
            androidx.appcompat.view.b bVar = this.f15485u;
            if (bVar != null) {
                bVar.c();
                return true;
            }
            a z11 = z();
            return z11 != null && z11.h();
        }
        if (!z10) {
            n0(E02, true);
        }
        return true;
    }

    public boolean P(int i10) {
        int c12 = c1(i10);
        if (this.f15460K && c12 == 108) {
            return false;
        }
        if (this.f15453G && c12 == 1) {
            this.f15453G = false;
        }
        if (c12 == 1) {
            j1();
            this.f15460K = true;
            return true;
        } else if (c12 == 2) {
            j1();
            this.f15449E = true;
            return true;
        } else if (c12 == 5) {
            j1();
            this.f15451F = true;
            return true;
        } else if (c12 == 10) {
            j1();
            this.f15457I = true;
            return true;
        } else if (c12 == 108) {
            j1();
            this.f15453G = true;
            return true;
        } else if (c12 != 109) {
            return this.f15476l.requestFeature(c12);
        } else {
            j1();
            this.f15455H = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean P0(int i10, KeyEvent keyEvent) {
        boolean z10 = true;
        if (i10 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z10 = false;
            }
            this.f15464O = z10;
        } else if (i10 == 82) {
            Q0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean R0(int i10, KeyEvent keyEvent) {
        a z10 = z();
        if (z10 != null && z10.p(i10, keyEvent)) {
            return true;
        }
        r rVar = this.f15463N;
        if (rVar == null || !Z0(rVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f15463N == null) {
                r E02 = E0(0, true);
                a1(E02, keyEvent);
                boolean Z02 = Z0(E02, keyEvent.getKeyCode(), keyEvent, 1);
                E02.f15529m = false;
                if (Z02) {
                    return true;
                }
            }
            return false;
        }
        r rVar2 = this.f15463N;
        if (rVar2 != null) {
            rVar2.f15530n = true;
        }
        return true;
    }

    public void S(int i10) {
        v0();
        ViewGroup viewGroup = (ViewGroup) this.f15443B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f15475k).inflate(i10, viewGroup);
        this.f15477m.b(this.f15476l.getCallback());
    }

    /* access modifiers changed from: package-private */
    public boolean S0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                T0(0, keyEvent);
                return true;
            }
        } else if (O0()) {
            return true;
        }
        return false;
    }

    public void T(View view) {
        v0();
        ViewGroup viewGroup = (ViewGroup) this.f15443B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f15477m.b(this.f15476l.getCallback());
    }

    public void U(View view, ViewGroup.LayoutParams layoutParams) {
        v0();
        ViewGroup viewGroup = (ViewGroup) this.f15443B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f15477m.b(this.f15476l.getCallback());
    }

    /* access modifiers changed from: package-private */
    public void U0(int i10) {
        a z10;
        if (i10 == 108 && (z10 = z()) != null) {
            z10.i(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void V0(int i10) {
        if (i10 == 108) {
            a z10 = z();
            if (z10 != null) {
                z10.i(false);
            }
        } else if (i10 == 0) {
            r E02 = E0(i10, true);
            if (E02.f15531o) {
                n0(E02, false);
            }
        }
    }

    public void W(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.W(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f15456H0;
        if (!(onBackInvokedDispatcher2 == null || (onBackInvokedCallback = this.f15458I0) == null)) {
            m.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f15458I0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f15474j;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f15456H0 = m.a((Activity) this.f15474j);
                n1();
            }
        }
        this.f15456H0 = onBackInvokedDispatcher;
        n1();
    }

    /* access modifiers changed from: package-private */
    public void W0(ViewGroup viewGroup) {
    }

    public void X(Toolbar toolbar) {
        if (this.f15474j instanceof Activity) {
            a z10 = z();
            if (!(z10 instanceof x)) {
                this.f15480p = null;
                if (z10 != null) {
                    z10.o();
                }
                this.f15479o = null;
                if (toolbar != null) {
                    u uVar = new u(toolbar, F0(), this.f15477m);
                    this.f15479o = uVar;
                    this.f15477m.d(uVar.f15577c);
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    this.f15477m.d((g) null);
                }
                B();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public void Y(int i10) {
        this.f15470U = i10;
    }

    /* access modifiers changed from: package-private */
    public final a Y0() {
        return this.f15479o;
    }

    public final void Z(CharSequence charSequence) {
        this.f15481q = charSequence;
        C5006s sVar = this.f15482r;
        if (sVar != null) {
            sVar.setWindowTitle(charSequence);
        } else if (Y0() != null) {
            Y0().B(charSequence);
        } else {
            TextView textView = this.f15445C;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        r x02;
        Window.Callback G02 = G0();
        if (G02 == null || this.f15467R || (x02 = x0(fVar.F())) == null) {
            return false;
        }
        return G02.onMenuItemSelected(x02.f15517a, menuItem);
    }

    public androidx.appcompat.view.b a0(b.a aVar) {
        d dVar;
        if (aVar != null) {
            androidx.appcompat.view.b bVar = this.f15485u;
            if (bVar != null) {
                bVar.c();
            }
            i iVar = new i(aVar);
            a z10 = z();
            if (z10 != null) {
                androidx.appcompat.view.b D10 = z10.D(iVar);
                this.f15485u = D10;
                if (!(D10 == null || (dVar = this.f15478n) == null)) {
                    dVar.onSupportActionModeStarted(D10);
                }
            }
            if (this.f15485u == null) {
                this.f15485u = i1(iVar);
            }
            n1();
            return this.f15485u;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public void b(androidx.appcompat.view.menu.f fVar) {
        b1(true);
    }

    /* access modifiers changed from: package-private */
    public void d1(Configuration configuration, D2.j jVar) {
        k.d(configuration, jVar);
    }

    /* access modifiers changed from: package-private */
    public void e1(D2.j jVar) {
        k.c(jVar);
    }

    public void f(View view, ViewGroup.LayoutParams layoutParams) {
        v0();
        ((ViewGroup) this.f15443B.findViewById(16908290)).addView(view, layoutParams);
        this.f15477m.b(this.f15476l.getCallback());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f15443B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f1() {
        /*
            r1 = this;
            boolean r0 = r1.f15441A
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f15443B
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isLaidOut()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.f1():boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        if (g.C(this.f15475k) && g.x() != null && !g.x().equals(g.y())) {
            k(this.f15475k);
        }
        return d0(true);
    }

    public boolean h() {
        return d0(true);
    }

    /* access modifiers changed from: package-private */
    public D2.j h0(Context context) {
        D2.j x10;
        if (Build.VERSION.SDK_INT >= 33 || (x10 = g.x()) == null) {
            return null;
        }
        D2.j D02 = D0(context.getApplicationContext().getResources().getConfiguration());
        D2.j b10 = t.b(x10, D02);
        return b10.e() ? D02 : b10;
    }

    /* access modifiers changed from: package-private */
    public boolean h1() {
        if (this.f15456H0 == null) {
            return false;
        }
        r E02 = E0(0, false);
        return (E02 != null && E02.f15531o) || this.f15485u != null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.appcompat.view.b i1(androidx.appcompat.view.b.a r8) {
        /*
            r7 = this;
            r7.u0()
            androidx.appcompat.view.b r0 = r7.f15485u
            if (r0 == 0) goto L_0x000a
            r0.c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatDelegateImpl.i
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.AppCompatDelegateImpl$i r0 = new androidx.appcompat.app.AppCompatDelegateImpl$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.d r0 = r7.f15478n
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f15467R
            if (r2 != 0) goto L_0x0022
            androidx.appcompat.view.b r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f15485u = r0
            goto L_0x015b
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f15486v
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f15459J
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f15475k
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = i.C5421a.f23891f
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f15475k
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            androidx.appcompat.view.d r4 = new androidx.appcompat.view.d
            android.content.Context r6 = r7.f15475k
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f15475k
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f15486v = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = i.C5421a.f23894i
            r5.<init>(r4, r1, r6)
            r7.f15487w = r5
            r6 = 2
            androidx.core.widget.h.b(r5, r6)
            android.widget.PopupWindow r5 = r7.f15487w
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f15486v
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f15487w
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = i.C5421a.f23887b
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f15486v
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f15487w
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.AppCompatDelegateImpl$d r0 = new androidx.appcompat.app.AppCompatDelegateImpl$d
            r0.<init>()
            r7.f15488x = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f15443B
            int r4 = i.C5426f.f23988h
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.z0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f15486v = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f15486v
            if (r0 == 0) goto L_0x015b
            r7.u0()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f15486v
            r0.k()
            androidx.appcompat.view.e r0 = new androidx.appcompat.view.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f15486v
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f15486v
            android.widget.PopupWindow r6 = r7.f15487w
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = r2
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.e()
            boolean r8 = r8.b(r0, r3)
            if (r8 == 0) goto L_0x0159
            r0.k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f15486v
            r8.h(r0)
            r7.f15485u = r0
            boolean r8 = r7.f1()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f15486v
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f15486v
            I2.k0 r8 = I2.C4600b0.e(r8)
            I2.k0 r8 = r8.b(r0)
            r7.f15489y = r8
            androidx.appcompat.app.AppCompatDelegateImpl$e r0 = new androidx.appcompat.app.AppCompatDelegateImpl$e
            r0.<init>()
            r8.h(r0)
            goto L_0x0149
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f15486v
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f15486v
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f15486v
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0149
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f15486v
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            I2.C4600b0.l0(r8)
        L_0x0149:
            android.widget.PopupWindow r8 = r7.f15487w
            if (r8 == 0) goto L_0x015b
            android.view.Window r8 = r7.f15476l
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f15488x
            r8.post(r0)
            goto L_0x015b
        L_0x0159:
            r7.f15485u = r1
        L_0x015b:
            androidx.appcompat.view.b r8 = r7.f15485u
            if (r8 == 0) goto L_0x0166
            androidx.appcompat.app.d r0 = r7.f15478n
            if (r0 == 0) goto L_0x0166
            r0.onSupportActionModeStarted(r8)
        L_0x0166:
            r7.n1()
            androidx.appcompat.view.b r8 = r7.f15485u
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.i1(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    /* access modifiers changed from: package-private */
    public void j0(int i10, r rVar, Menu menu) {
        if (menu == null) {
            if (rVar == null && i10 >= 0) {
                r[] rVarArr = this.f15462M;
                if (i10 < rVarArr.length) {
                    rVar = rVarArr[i10];
                }
            }
            if (rVar != null) {
                menu = rVar.f15526j;
            }
        }
        if ((rVar == null || rVar.f15531o) && !this.f15467R) {
            this.f15477m.c(this.f15476l.getCallback(), i10, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void k0(androidx.appcompat.view.menu.f fVar) {
        if (!this.f15461L) {
            this.f15461L = true;
            this.f15482r.l();
            Window.Callback G02 = G0();
            if (G02 != null && !this.f15467R) {
                G02.onPanelClosed(108, fVar);
            }
            this.f15461L = false;
        }
    }

    public Context m(Context context) {
        this.f15465P = true;
        int N02 = N0(context, i0());
        if (g.C(context)) {
            g.c0(context);
        }
        D2.j h02 = h0(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(o0(context, N02, h02, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(o0(context, N02, h02, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f15440M0) {
            return super.m(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration o02 = o0(context, N02, h02, !configuration2.equals(configuration3) ? y0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, C5429i.f24038b);
        dVar.a(o02);
        try {
            if (context.getTheme() != null) {
                C6214h.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.m(dVar);
    }

    /* access modifiers changed from: package-private */
    public void m0(int i10) {
        n0(E0(i10, true), true);
    }

    /* access modifiers changed from: package-private */
    public void n0(r rVar, boolean z10) {
        ViewGroup viewGroup;
        C5006s sVar;
        if (!z10 || rVar.f15517a != 0 || (sVar = this.f15482r) == null || !sVar.e()) {
            WindowManager windowManager = (WindowManager) this.f15475k.getSystemService("window");
            if (!(windowManager == null || !rVar.f15531o || (viewGroup = rVar.f15523g) == null)) {
                windowManager.removeView(viewGroup);
                if (z10) {
                    j0(rVar.f15517a, rVar, (Menu) null);
                }
            }
            rVar.f15529m = false;
            rVar.f15530n = false;
            rVar.f15531o = false;
            rVar.f15524h = null;
            rVar.f15533q = true;
            if (this.f15463N == rVar) {
                this.f15463N = null;
            }
            if (rVar.f15517a == 0) {
                n1();
                return;
            }
            return;
        }
        k0(rVar.f15526j);
    }

    /* access modifiers changed from: package-private */
    public void n1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean h12 = h1();
            if (h12 && this.f15458I0 == null) {
                this.f15458I0 = m.b(this.f15456H0, this);
            } else if (!h12 && (onBackInvokedCallback = this.f15458I0) != null) {
                m.c(this.f15456H0, onBackInvokedCallback);
                this.f15458I0 = null;
            }
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return q0(view, str, context, attributeSet);
    }

    public <T extends View> T p(int i10) {
        v0();
        return this.f15476l.findViewById(i10);
    }

    /* access modifiers changed from: package-private */
    public final int p1(C0 c02, Rect rect) {
        boolean z10;
        boolean z11;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i10;
        int i11 = 0;
        int m10 = c02 != null ? c02.m() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f15486v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f15486v.getLayoutParams();
            boolean z12 = true;
            if (this.f15486v.isShown()) {
                if (this.f15448D0 == null) {
                    this.f15448D0 = new Rect();
                    this.f15450E0 = new Rect();
                }
                Rect rect2 = this.f15448D0;
                Rect rect3 = this.f15450E0;
                if (c02 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c02.k(), c02.m(), c02.l(), c02.j());
                }
                U.a(this.f15443B, rect2, rect3);
                int i12 = rect2.top;
                int i13 = rect2.left;
                int i14 = rect2.right;
                C0 G10 = C4600b0.G(this.f15443B);
                int k10 = G10 == null ? 0 : G10.k();
                int l10 = G10 == null ? 0 : G10.l();
                if (marginLayoutParams2.topMargin == i12 && marginLayoutParams2.leftMargin == i13 && marginLayoutParams2.rightMargin == i14) {
                    z11 = false;
                } else {
                    marginLayoutParams2.topMargin = i12;
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    z11 = true;
                }
                if (i12 <= 0 || this.f15447D != null) {
                    View view = this.f15447D;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i10 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == k10 && marginLayoutParams.rightMargin == l10))) {
                        marginLayoutParams.height = i10;
                        marginLayoutParams.leftMargin = k10;
                        marginLayoutParams.rightMargin = l10;
                        this.f15447D.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f15475k);
                    this.f15447D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = k10;
                    layoutParams.rightMargin = l10;
                    this.f15443B.addView(this.f15447D, -1, layoutParams);
                }
                View view3 = this.f15447D;
                if (view3 == null) {
                    z12 = false;
                }
                if (z12 && view3.getVisibility() != 0) {
                    q1(this.f15447D);
                }
                if (!this.f15457I && z12) {
                    m10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.f15486v.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f15447D;
        if (view4 != null) {
            if (!z10) {
                i11 = 8;
            }
            view4.setVisibility(i11);
        }
        return m10;
    }

    public View q0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        if (this.f15452F0 == null) {
            TypedArray obtainStyledAttributes = this.f15475k.obtainStyledAttributes(C5430j.f24266y0);
            String string = obtainStyledAttributes.getString(C5430j.f24050C0);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f15452F0 = new q();
            } else {
                try {
                    this.f15452F0 = (q) this.f15475k.getClassLoader().loadClass(string).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f15452F0 = new q();
                }
            }
        }
        boolean z11 = f15438K0;
        boolean z12 = false;
        if (z11) {
            if (this.f15454G0 == null) {
                this.f15454G0 = new s();
            }
            if (this.f15454G0.a(attributeSet)) {
                z10 = true;
                return this.f15452F0.r(view, str, context, attributeSet, z10, z11, true, T.d());
            } else if (!(attributeSet instanceof XmlPullParser)) {
                z12 = g1((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z12 = true;
            }
        }
        z10 = z12;
        return this.f15452F0.r(view, str, context, attributeSet, z10, z11, true, T.d());
    }

    public Context r() {
        return this.f15475k;
    }

    /* access modifiers changed from: package-private */
    public void r0() {
        androidx.appcompat.view.menu.f fVar;
        C5006s sVar = this.f15482r;
        if (sVar != null) {
            sVar.l();
        }
        if (this.f15487w != null) {
            this.f15476l.getDecorView().removeCallbacks(this.f15488x);
            if (this.f15487w.isShowing()) {
                try {
                    this.f15487w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f15487w = null;
        }
        u0();
        r E02 = E0(0, false);
        if (E02 != null && (fVar = E02.f15526j) != null) {
            fVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f15474j;
        if (((obj instanceof C4634t.a) || (obj instanceof p)) && (decorView = this.f15476l.getDecorView()) != null && C4634t.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f15477m.a(this.f15476l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? P0(keyCode, keyEvent) : S0(keyCode, keyEvent);
    }

    public final b t() {
        return new f();
    }

    /* access modifiers changed from: package-private */
    public void t0(int i10) {
        r E02;
        r E03 = E0(i10, true);
        if (E03.f15526j != null) {
            Bundle bundle = new Bundle();
            E03.f15526j.U(bundle);
            if (bundle.size() > 0) {
                E03.f15535s = bundle;
            }
            E03.f15526j.i0();
            E03.f15526j.clear();
        }
        E03.f15534r = true;
        E03.f15533q = true;
        if ((i10 == 108 || i10 == 0) && this.f15482r != null && (E02 = E0(0, false)) != null) {
            E02.f15529m = false;
            a1(E02, (KeyEvent) null);
        }
    }

    public int u() {
        return this.f15469T;
    }

    /* access modifiers changed from: package-private */
    public void u0() {
        C4618k0 k0Var = this.f15489y;
        if (k0Var != null) {
            k0Var.c();
        }
    }

    public MenuInflater w() {
        if (this.f15480p == null) {
            H0();
            a aVar = this.f15479o;
            this.f15480p = new androidx.appcompat.view.g(aVar != null ? aVar.k() : this.f15475k);
        }
        return this.f15480p;
    }

    /* access modifiers changed from: package-private */
    public r x0(Menu menu) {
        r[] rVarArr = this.f15462M;
        int length = rVarArr != null ? rVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            r rVar = rVarArr[i10];
            if (rVar != null && rVar.f15526j == menu) {
                return rVar;
            }
        }
        return null;
    }

    public a z() {
        H0();
        return this.f15479o;
    }

    /* access modifiers changed from: package-private */
    public final Context z0() {
        a z10 = z();
        Context k10 = z10 != null ? z10.k() : null;
        return k10 == null ? this.f15475k : k10;
    }

    AppCompatDelegateImpl(Dialog dialog, d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = f15437J0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AppCompatDelegateImpl(android.content.Context r3, android.view.Window r4, androidx.appcompat.app.d r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f15489y = r0
            r0 = 1
            r2.f15491z = r0
            r0 = -100
            r2.f15469T = r0
            androidx.appcompat.app.AppCompatDelegateImpl$a r1 = new androidx.appcompat.app.AppCompatDelegateImpl$a
            r1.<init>()
            r2.f15444B0 = r1
            r2.f15475k = r3
            r2.f15478n = r5
            r2.f15474j = r6
            int r3 = r2.f15469T
            if (r3 != r0) goto L_0x0032
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.AppCompatActivity r3 = r2.k1()
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.g r3 = r3.getDelegate()
            int r3 = r3.u()
            r2.f15469T = r3
        L_0x0032:
            int r3 = r2.f15469T
            if (r3 != r0) goto L_0x0059
            j0.b0<java.lang.String, java.lang.Integer> r3 = f15437J0
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0059
            int r5 = r5.intValue()
            r2.f15469T = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r2.g0(r4)
        L_0x005e:
            androidx.appcompat.widget.C4993e.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.<init>(android.content.Context, android.view.Window, androidx.appcompat.app.d, java.lang.Object):void");
    }
}
