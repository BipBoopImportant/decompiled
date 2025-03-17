package hb;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.f;
import hb.m;
import ib.C9832a;
import s.C5823b;
import s.C5826e;
import s.C5828g;
import s.C5829h;

public class l {

    /* renamed from: i  reason: collision with root package name */
    public static final a f73535i = new g();

    /* renamed from: j  reason: collision with root package name */
    public static final a f73536j = new h();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f73537a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f73538b;

    /* renamed from: c  reason: collision with root package name */
    private final int f73539c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f73540d;

    /* renamed from: e  reason: collision with root package name */
    private b f73541e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public f f73542f;

    /* renamed from: g  reason: collision with root package name */
    private C5826e f73543g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f73544h;

    public interface a {
        void a(Context context, C5829h hVar, String str, Runnable runnable);
    }

    private class b extends e {

        /* renamed from: b  reason: collision with root package name */
        private Runnable f73545b;

        /* renamed from: c  reason: collision with root package name */
        private Runnable f73546c;

        b(androidx.browser.customtabs.b bVar) {
        }

        /* access modifiers changed from: private */
        public void d(Runnable runnable, Runnable runnable2) {
            this.f73545b = runnable;
            this.f73546c = runnable2;
        }

        public void a(ComponentName componentName, c cVar) {
            Runnable runnable;
            Runnable runnable2;
            if (!C9767a.c(l.this.f73537a.getPackageManager(), l.this.f73538b)) {
                cVar.h(0);
            }
            try {
                l lVar = l.this;
                f unused = lVar.f73542f = cVar.f((androidx.browser.customtabs.b) null, lVar.f73540d);
                if (l.this.f73542f == null || (runnable2 = this.f73545b) == null) {
                    if (l.this.f73542f == null && (runnable = this.f73546c) != null) {
                        runnable.run();
                    }
                    this.f73545b = null;
                    this.f73546c = null;
                }
                runnable2.run();
                this.f73545b = null;
                this.f73546c = null;
            } catch (RuntimeException e10) {
                Log.w("TwaLauncher", e10);
                this.f73546c.run();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            f unused = l.this.f73542f = null;
        }
    }

    public l(Context context) {
        this(context, (String) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(a aVar, C5829h hVar, Runnable runnable) {
        aVar.a(this.f73537a, hVar, this.f73538b, runnable);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void o(Context context, C5829h hVar, String str, Runnable runnable) {
        d b10 = hVar.b();
        if (str != null) {
            b10.f16598a.setPackage(str);
        }
        if (b.a(context.getPackageManager())) {
            b10.f16598a.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        }
        b10.a(context, hVar.c());
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void p(Context context, C5829h hVar, String str, Runnable runnable) {
        context.startActivity(n.h(context, hVar.c(), d.c(context)));
        if (runnable != null) {
            runnable.run();
        }
    }

    private void r(C5829h hVar, androidx.browser.customtabs.b bVar, C9832a aVar, Runnable runnable, a aVar2) {
        if (aVar != null) {
            aVar.a(this.f73538b, hVar);
        }
        i iVar = new i(this, hVar, aVar, runnable);
        if (this.f73542f != null) {
            iVar.run();
            return;
        }
        j jVar = new j(this, aVar2, hVar, runnable);
        if (this.f73541e == null) {
            this.f73541e = new b(bVar);
        }
        this.f73541e.d(iVar, jVar);
        c.b(this.f73537a, this.f73538b, this.f73541e);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void l(C5829h hVar, C9832a aVar, Runnable runnable) {
        f fVar = this.f73542f;
        if (fVar == null) {
            throw new IllegalStateException("mSession is null in launchWhenSessionEstablished");
        } else if (aVar != null) {
            aVar.b(hVar, fVar, new k(this, hVar, runnable));
        } else {
            n(hVar, runnable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void n(C5829h hVar, Runnable runnable) {
        if (!this.f73544h && this.f73542f != null) {
            Log.d("TwaLauncher", "Launching Trusted Web Activity.");
            C5828g a10 = hVar.a(this.f73542f);
            c.a(a10.a(), this.f73537a);
            a10.c(this.f73537a);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void k() {
        if (!this.f73544h) {
            b bVar = this.f73541e;
            if (bVar != null) {
                this.f73537a.unbindService(bVar);
            }
            this.f73537a = null;
            this.f73544h = true;
        }
    }

    public void q(C5829h hVar, androidx.browser.customtabs.b bVar, C9832a aVar, Runnable runnable, a aVar2) {
        if (!this.f73544h) {
            if (this.f73539c == 0) {
                r(hVar, bVar, aVar, runnable, aVar2);
            } else {
                aVar2.a(this.f73537a, hVar, this.f73538b, runnable);
            }
            if (!b.a(this.f73537a.getPackageManager())) {
                this.f73543g.a(C5823b.a(this.f73538b, this.f73537a.getPackageManager()));
                return;
            }
            return;
        }
        throw new IllegalStateException("TwaLauncher already destroyed");
    }

    public l(Context context, String str) {
        this(context, str, 96375, new f(context));
    }

    public l(Context context, String str, int i10, C5826e eVar) {
        this.f73537a = context;
        this.f73540d = i10;
        this.f73543g = eVar;
        if (str == null) {
            m.a b10 = m.b(context.getPackageManager());
            this.f73538b = b10.f73550b;
            this.f73539c = b10.f73549a;
            return;
        }
        this.f73538b = str;
        this.f73539c = 0;
    }
}
