package Qb;

import Fb.f;
import Nb.l;
import Ob.a;
import Pb.b;
import Sb.p;
import Wb.g;
import Yb.j;
import Zb.c;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import xa.C8971l;

/* renamed from: Qb.z  reason: case insensitive filesystem */
public class C9267z {

    /* renamed from: a  reason: collision with root package name */
    private final Context f63049a;

    /* renamed from: b  reason: collision with root package name */
    private final f f63050b;

    /* renamed from: c  reason: collision with root package name */
    private final F f63051c;

    /* renamed from: d  reason: collision with root package name */
    private final P f63052d = new P();

    /* renamed from: e  reason: collision with root package name */
    private final long f63053e = System.currentTimeMillis();

    /* renamed from: f  reason: collision with root package name */
    private A f63054f;

    /* renamed from: g  reason: collision with root package name */
    private A f63055g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f63056h;

    /* renamed from: i  reason: collision with root package name */
    private C9258p f63057i;

    /* renamed from: j  reason: collision with root package name */
    private final K f63058j;

    /* renamed from: k  reason: collision with root package name */
    private final g f63059k;

    /* renamed from: l  reason: collision with root package name */
    public final b f63060l;

    /* renamed from: m  reason: collision with root package name */
    private final a f63061m;

    /* renamed from: n  reason: collision with root package name */
    private final C9255m f63062n;

    /* renamed from: o  reason: collision with root package name */
    private final Nb.a f63063o;

    /* renamed from: p  reason: collision with root package name */
    private final l f63064p;

    /* renamed from: q  reason: collision with root package name */
    private final Rb.f f63065q;

    public C9267z(f fVar, K k10, Nb.a aVar, F f10, b bVar, a aVar2, g gVar, C9255m mVar, l lVar, Rb.f fVar2) {
        this.f63050b = fVar;
        this.f63051c = f10;
        this.f63049a = fVar.k();
        this.f63058j = k10;
        this.f63063o = aVar;
        this.f63060l = bVar;
        this.f63061m = aVar2;
        this.f63059k = gVar;
        this.f63062n = mVar;
        this.f63064p = lVar;
        this.f63065q = fVar2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A(String str) {
        this.f63057i.Y(str);
    }

    private void i() {
        try {
            this.f63056h = Boolean.TRUE.equals((Boolean) this.f63065q.f63181a.c().submit(new C9262u(this)).get(3, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f63056h = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void v(j jVar) {
        Rb.f.c();
        E();
        try {
            this.f63060l.a(new C9265x(this));
            this.f63057i.U();
            if (jVar.b().f64900b.f64907a) {
                if (!this.f63057i.A(jVar)) {
                    Nb.g.f().k("Previous sessions could not be finalized.");
                }
                this.f63057i.Z(jVar.a());
                D();
                return;
            }
            Nb.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
            throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
        } catch (Exception e10) {
            Nb.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
        } catch (Throwable th2) {
            D();
            throw th2;
        }
    }

    private void p(j jVar) {
        Future<?> submit = this.f63065q.f63181a.c().submit(new C9264w(this, jVar));
        Nb.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Nb.g.f().e("Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            Nb.g.f().e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Nb.g.f().e("Crashlytics timed out during initialization.", e12);
        }
    }

    public static String q() {
        return "19.4.0";
    }

    static boolean r(String str, boolean z10) {
        if (!z10) {
            Nb.g.f().i("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean t() {
        return Boolean.valueOf(this.f63057i.t());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(long j10, String str) {
        this.f63057i.d0(j10, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(long j10, String str) {
        this.f63065q.f63182b.f(new C9266y(this, j10, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(Throwable th2, Map map) {
        this.f63057i.c0(Thread.currentThread(), th2, map);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z(String str, String str2) {
        this.f63057i.W(str, str2);
    }

    public void B(String str) {
        this.f63065q.f63181a.f(new C9263v(this, System.currentTimeMillis() - this.f63053e, str));
    }

    public void C(Throwable th2, Map<String, String> map) {
        this.f63065q.f63181a.f(new C9261t(this, th2, map));
    }

    /* access modifiers changed from: package-private */
    public void D() {
        Rb.f.c();
        try {
            if (!this.f63054f.d()) {
                Nb.g.f().k("Initialization marker file was not properly removed.");
            }
        } catch (Exception e10) {
            Nb.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void E() {
        Rb.f.c();
        this.f63054f.a();
        Nb.g.f().i("Initialization marker file was created.");
    }

    public boolean F(C9243a aVar, j jVar) {
        j jVar2 = jVar;
        if (r(aVar.f62951b, C9251i.i(this.f63049a, "com.crashlytics.RequireBuildId", true))) {
            String c10 = new C9250h().c();
            try {
                this.f63055g = new A("crash_marker", this.f63059k);
                this.f63054f = new A("initialization_marker", this.f63059k);
                p pVar = new p(c10, this.f63059k, this.f63065q);
                Sb.f fVar = new Sb.f(this.f63059k);
                Zb.a aVar2 = new Zb.a(1024, new c(10));
                this.f63064p.c(pVar);
                Context context = this.f63049a;
                K k10 = this.f63058j;
                g gVar = this.f63059k;
                P p10 = this.f63052d;
                C9255m mVar = this.f63062n;
                C9255m mVar2 = mVar;
                P p11 = p10;
                p pVar2 = pVar;
                b0 j10 = b0.j(context, k10, gVar, aVar, fVar, pVar, aVar2, jVar, p11, mVar2, this.f63065q);
                Context context2 = this.f63049a;
                K k11 = this.f63058j;
                F f10 = this.f63051c;
                g gVar2 = this.f63059k;
                A a10 = this.f63055g;
                this.f63057i = new C9258p(context2, k11, f10, gVar2, a10, aVar, pVar2, fVar, j10, this.f63063o, this.f63061m, this.f63062n, this.f63065q);
                boolean m10 = m();
                i();
                this.f63057i.y(c10, Thread.getDefaultUncaughtExceptionHandler(), jVar2);
                if (!m10 || !C9251i.d(this.f63049a)) {
                    Nb.g.f().b("Successfully configured exception handler.");
                    return true;
                }
                Nb.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                p(jVar2);
                return false;
            } catch (Exception e10) {
                Nb.g.f().e("Crashlytics was not started due to an exception during initialization", e10);
                this.f63057i = null;
                return false;
            }
        } else {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
    }

    public C8971l<Void> G() {
        return this.f63057i.V();
    }

    public void H(Boolean bool) {
        this.f63051c.h(bool);
    }

    public void I(String str, String str2) {
        this.f63065q.f63181a.f(new C9260s(this, str, str2));
    }

    public void J(String str) {
        this.f63065q.f63181a.f(new r(this, str));
    }

    public C8971l<Boolean> j() {
        return this.f63057i.n();
    }

    public C8971l<Void> k() {
        return this.f63057i.s();
    }

    public boolean l() {
        return this.f63056h;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f63054f.c();
    }

    public C8971l<Void> o(j jVar) {
        return this.f63065q.f63181a.f(new C9259q(this, jVar));
    }

    public boolean s() {
        return this.f63051c.d();
    }
}
