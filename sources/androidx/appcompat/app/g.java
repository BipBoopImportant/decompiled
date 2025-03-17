package androidx.appcompat.app;

import D2.j;
import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.T;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.f;
import j0.C5446b;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    static c f15543a = new c(new d());

    /* renamed from: b  reason: collision with root package name */
    private static int f15544b = -100;

    /* renamed from: c  reason: collision with root package name */
    private static j f15545c = null;

    /* renamed from: d  reason: collision with root package name */
    private static j f15546d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Boolean f15547e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f15548f = false;

    /* renamed from: g  reason: collision with root package name */
    private static final C5446b<WeakReference<g>> f15549g = new C5446b<>();

    /* renamed from: h  reason: collision with root package name */
    private static final Object f15550h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private static final Object f15551i = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    static class c implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Object f15552a = new Object();

        /* renamed from: b  reason: collision with root package name */
        final Queue<Runnable> f15553b = new ArrayDeque();

        /* renamed from: c  reason: collision with root package name */
        final Executor f15554c;

        /* renamed from: d  reason: collision with root package name */
        Runnable f15555d;

        c(Executor executor) {
            this.f15554c = executor;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                c();
            }
        }

        /* access modifiers changed from: protected */
        public void c() {
            synchronized (this.f15552a) {
                try {
                    Runnable poll = this.f15553b.poll();
                    this.f15555d = poll;
                    if (poll != null) {
                        this.f15554c.execute(poll);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void execute(Runnable runnable) {
            synchronized (this.f15552a) {
                try {
                    this.f15553b.add(new h(this, runnable));
                    if (this.f15555d == null) {
                        c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static class d implements Executor {
        d() {
        }

        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    g() {
    }

    static boolean C(Context context) {
        if (f15547e == null) {
            try {
                Bundle bundle = r.a(context).metaData;
                if (bundle != null) {
                    f15547e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f15547e = Boolean.FALSE;
            }
        }
        return f15547e.booleanValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void E(Context context) {
        b0(context);
        f15548f = true;
    }

    static void N(g gVar) {
        synchronized (f15550h) {
            O(gVar);
        }
    }

    private static void O(g gVar) {
        synchronized (f15550h) {
            try {
                Iterator<WeakReference<g>> it = f15549g.iterator();
                while (it.hasNext()) {
                    g gVar2 = (g) it.next().get();
                    if (gVar2 == gVar || gVar2 == null) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    public static void Q(j jVar) {
        Objects.requireNonNull(jVar);
        if (Build.VERSION.SDK_INT >= 33) {
            Object v10 = v();
            if (v10 != null) {
                b.b(v10, a.a(jVar.g()));
            }
        } else if (!jVar.equals(f15545c)) {
            synchronized (f15550h) {
                f15545c = jVar;
                j();
            }
        }
    }

    public static void R(boolean z10) {
        T.c(z10);
    }

    public static void V(int i10) {
        if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f15544b != i10) {
            f15544b = i10;
            i();
        }
    }

    static void b0(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (q().e()) {
                    String b10 = f.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(b10));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c0(android.content.Context r3) {
        /*
            boolean r0 = C(r3)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x001c
            boolean r0 = f15548f
            if (r0 != 0) goto L_0x0057
            androidx.appcompat.app.g$c r0 = f15543a
            androidx.appcompat.app.e r1 = new androidx.appcompat.app.e
            r1.<init>(r3)
            r0.execute(r1)
            goto L_0x0057
        L_0x001c:
            java.lang.Object r0 = f15551i
            monitor-enter(r0)
            D2.j r1 = f15545c     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0043
            D2.j r1 = f15546d     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0034
            java.lang.String r3 = androidx.core.app.f.b(r3)     // Catch:{ all -> 0x0032 }
            D2.j r3 = D2.j.b(r3)     // Catch:{ all -> 0x0032 }
            f15546d = r3     // Catch:{ all -> 0x0032 }
            goto L_0x0034
        L_0x0032:
            r3 = move-exception
            goto L_0x0058
        L_0x0034:
            D2.j r3 = f15546d     // Catch:{ all -> 0x0032 }
            boolean r3 = r3.e()     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x003e
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x003e:
            D2.j r3 = f15546d     // Catch:{ all -> 0x0032 }
            f15545c = r3     // Catch:{ all -> 0x0032 }
            goto L_0x0056
        L_0x0043:
            D2.j r2 = f15546d     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0056
            D2.j r1 = f15545c     // Catch:{ all -> 0x0032 }
            f15546d = r1     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = r1.g()     // Catch:{ all -> 0x0032 }
            androidx.core.app.f.a(r3, r1)     // Catch:{ all -> 0x0032 }
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
        L_0x0057:
            return
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.c0(android.content.Context):void");
    }

    static void e(g gVar) {
        synchronized (f15550h) {
            O(gVar);
            f15549g.add(new WeakReference(gVar));
        }
    }

    private static void i() {
        synchronized (f15550h) {
            try {
                Iterator<WeakReference<g>> it = f15549g.iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next().get();
                    if (gVar != null) {
                        gVar.h();
                    }
                }
            } finally {
            }
        }
    }

    private static void j() {
        Iterator<WeakReference<g>> it = f15549g.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next().get();
            if (gVar != null) {
                gVar.g();
            }
        }
    }

    public static g n(Activity activity, d dVar) {
        return new AppCompatDelegateImpl(activity, dVar);
    }

    public static g o(Dialog dialog, d dVar) {
        return new AppCompatDelegateImpl(dialog, dVar);
    }

    public static j q() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object v10 = v();
            if (v10 != null) {
                return j.h(b.a(v10));
            }
        } else {
            j jVar = f15545c;
            if (jVar != null) {
                return jVar;
            }
        }
        return j.d();
    }

    public static int s() {
        return f15544b;
    }

    static Object v() {
        Context r10;
        Iterator<WeakReference<g>> it = f15549g.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next().get();
            if (gVar != null && (r10 = gVar.r()) != null) {
                return r10.getSystemService("locale");
            }
        }
        return null;
    }

    static j x() {
        return f15545c;
    }

    static j y() {
        return f15546d;
    }

    public abstract void A();

    public abstract void B();

    public abstract void F(Configuration configuration);

    public abstract void G(Bundle bundle);

    public abstract void H();

    public abstract void I(Bundle bundle);

    public abstract void J();

    public abstract void K(Bundle bundle);

    public abstract void L();

    public abstract void M();

    public abstract boolean P(int i10);

    public abstract void S(int i10);

    public abstract void T(View view);

    public abstract void U(View view, ViewGroup.LayoutParams layoutParams);

    public void W(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void X(Toolbar toolbar);

    public void Y(int i10) {
    }

    public abstract void Z(CharSequence charSequence);

    public abstract androidx.appcompat.view.b a0(b.a aVar);

    public abstract void f(View view, ViewGroup.LayoutParams layoutParams);

    /* access modifiers changed from: package-private */
    public boolean g() {
        return false;
    }

    public abstract boolean h();

    /* access modifiers changed from: package-private */
    public void k(Context context) {
        f15543a.execute(new f(context));
    }

    @Deprecated
    public void l(Context context) {
    }

    public Context m(Context context) {
        l(context);
        return context;
    }

    public abstract <T extends View> T p(int i10);

    public Context r() {
        return null;
    }

    public abstract b t();

    public int u() {
        return -100;
    }

    public abstract MenuInflater w();

    public abstract a z();
}
