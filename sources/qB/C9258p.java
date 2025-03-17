package Qb;

import Nb.h;
import Qb.D;
import Rb.f;
import Sb.p;
import Tb.F;
import Tb.G;
import Wb.g;
import Yb.j;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import xa.C8970k;
import xa.C8971l;
import xa.C8972m;
import xa.C8974o;

/* renamed from: Qb.p  reason: case insensitive filesystem */
class C9258p {

    /* renamed from: t  reason: collision with root package name */
    static final FilenameFilter f62994t = new C9257o();

    /* renamed from: a  reason: collision with root package name */
    private final Context f62995a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final F f62996b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final A f62997c;

    /* renamed from: d  reason: collision with root package name */
    private final p f62998d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final f f62999e;

    /* renamed from: f  reason: collision with root package name */
    private final K f63000f;

    /* renamed from: g  reason: collision with root package name */
    private final g f63001g;

    /* renamed from: h  reason: collision with root package name */
    private final C9243a f63002h;

    /* renamed from: i  reason: collision with root package name */
    private final Sb.f f63003i;

    /* renamed from: j  reason: collision with root package name */
    private final Nb.a f63004j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final Ob.a f63005k;

    /* renamed from: l  reason: collision with root package name */
    private final C9255m f63006l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final b0 f63007m;

    /* renamed from: n  reason: collision with root package name */
    private D f63008n;

    /* renamed from: o  reason: collision with root package name */
    private j f63009o = null;

    /* renamed from: p  reason: collision with root package name */
    final C8972m<Boolean> f63010p = new C8972m<>();

    /* renamed from: q  reason: collision with root package name */
    final C8972m<Boolean> f63011q = new C8972m<>();

    /* renamed from: r  reason: collision with root package name */
    final C8972m<Void> f63012r = new C8972m<>();

    /* renamed from: s  reason: collision with root package name */
    final AtomicBoolean f63013s = new AtomicBoolean(false);

    /* renamed from: Qb.p$a */
    class a implements D.a {
        a() {
        }

        public void a(j jVar, Thread thread, Throwable th2) {
            C9258p.this.I(jVar, thread, th2);
        }
    }

    /* renamed from: Qb.p$b */
    class b implements Callable<C8971l<Void>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f63015a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f63016b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Thread f63017c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f63018d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f63019e;

        /* renamed from: Qb.p$b$a */
        class a implements C8970k<Yb.d, Void> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f63021a;

            a(String str) {
                this.f63021a = str;
            }

            /* renamed from: a */
            public C8971l<Void> then(Yb.d dVar) {
                String str = null;
                if (dVar == null) {
                    Nb.g.f().k("Received null app settings, cannot send reports at crash time.");
                    return C8974o.f(null);
                }
                C8971l l10 = C9258p.this.P();
                b0 g10 = C9258p.this.f63007m;
                Rb.e eVar = C9258p.this.f62999e.f63181a;
                if (b.this.f63019e) {
                    str = this.f63021a;
                }
                return C8974o.h(l10, g10.B(eVar, str));
            }
        }

        b(long j10, Throwable th2, Thread thread, j jVar, boolean z10) {
            this.f63015a = j10;
            this.f63016b = th2;
            this.f63017c = thread;
            this.f63018d = jVar;
            this.f63019e = z10;
        }

        /* renamed from: a */
        public C8971l<Void> call() {
            long c10 = C9258p.G(this.f63015a);
            String d10 = C9258p.this.C();
            if (d10 == null) {
                Nb.g.f().d("Tried to write a fatal exception while no session was open.");
                return C8974o.f(null);
            }
            C9258p.this.f62997c.a();
            C9258p.this.f63007m.w(this.f63016b, this.f63017c, d10, c10);
            C9258p.this.x(this.f63015a);
            C9258p.this.u(this.f63018d);
            C9258p.this.w(new C9250h().c(), Boolean.valueOf(this.f63019e));
            return !C9258p.this.f62996b.d() ? C8974o.f(null) : this.f63018d.a().r(C9258p.this.f62999e.f63181a, new a(d10));
        }
    }

    /* renamed from: Qb.p$c */
    class c implements C8970k<Void, Boolean> {
        c() {
        }

        /* renamed from: a */
        public C8971l<Boolean> then(Void voidR) {
            return C8974o.f(Boolean.TRUE);
        }
    }

    /* renamed from: Qb.p$d */
    class d implements C8970k<Boolean, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8971l f63024a;

        /* renamed from: Qb.p$d$a */
        class a implements C8970k<Yb.d, Void> {
            a() {
            }

            /* renamed from: a */
            public C8971l<Void> then(Yb.d dVar) {
                if (dVar == null) {
                    Nb.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return C8974o.f(null);
                }
                C8971l unused = C9258p.this.P();
                C9258p.this.f63007m.A(C9258p.this.f62999e.f63181a);
                C9258p.this.f63012r.e(null);
                return C8974o.f(null);
            }
        }

        d(C8971l lVar) {
            this.f63024a = lVar;
        }

        /* renamed from: a */
        public C8971l<Void> then(Boolean bool) {
            if (!bool.booleanValue()) {
                Nb.g.f().i("Deleting cached crash reports...");
                C9258p.r(C9258p.this.N());
                C9258p.this.f63007m.z();
                C9258p.this.f63012r.e(null);
                return C8974o.f(null);
            }
            Nb.g.f().b("Sending cached crash reports...");
            C9258p.this.f62996b.c(bool.booleanValue());
            return this.f63024a.r(C9258p.this.f62999e.f63181a, new a());
        }
    }

    /* renamed from: Qb.p$e */
    class e implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f63027a;

        e(long j10) {
            this.f63027a = j10;
        }

        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f63027a);
            C9258p.this.f63005k.a("_ae", bundle);
            return null;
        }
    }

    C9258p(Context context, K k10, F f10, g gVar, A a10, C9243a aVar, p pVar, Sb.f fVar, b0 b0Var, Nb.a aVar2, Ob.a aVar3, C9255m mVar, f fVar2) {
        this.f62995a = context;
        this.f63000f = k10;
        this.f62996b = f10;
        this.f63001g = gVar;
        this.f62997c = a10;
        this.f63002h = aVar;
        this.f62998d = pVar;
        this.f63003i = fVar;
        this.f63004j = aVar2;
        this.f63005k = aVar3;
        this.f63006l = mVar;
        this.f63007m = b0Var;
        this.f62999e = fVar2;
    }

    private static boolean B() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public String C() {
        SortedSet<String> s10 = this.f63007m.s();
        if (!s10.isEmpty()) {
            return s10.first();
        }
        return null;
    }

    private static long D() {
        return G(System.currentTimeMillis());
    }

    static List<N> E(h hVar, String str, g gVar, byte[] bArr) {
        File q10 = gVar.q(str, "user-data");
        File q11 = gVar.q(str, "keys");
        File q12 = gVar.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C9249g("logs_file", "logs", bArr));
        arrayList.add(new I("crash_meta_file", "metadata", hVar.d()));
        arrayList.add(new I("session_meta_file", "session", hVar.g()));
        arrayList.add(new I("app_meta_file", "app", hVar.e()));
        arrayList.add(new I("device_meta_file", "device", hVar.a()));
        arrayList.add(new I("os_meta_file", "os", hVar.f()));
        arrayList.add(R(hVar));
        arrayList.add(new I("user_meta_file", "user", q10));
        arrayList.add(new I("keys_file", "keys", q11));
        arrayList.add(new I("rollouts_file", "rollouts", q12));
        return arrayList;
    }

    private InputStream F(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            Nb.g.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        Nb.g.f().g("No version control information found");
        return null;
    }

    /* access modifiers changed from: private */
    public static long G(long j10) {
        return j10 / 1000;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L(String str) {
        w(str, Boolean.FALSE);
    }

    private C8971l<Void> O(long j10) {
        if (B()) {
            Nb.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return C8974o.f(null);
        }
        Nb.g.f().b("Logging app exception event to Firebase Analytics");
        return C8974o.c(new ScheduledThreadPoolExecutor(1), new e(j10));
    }

    /* access modifiers changed from: private */
    public C8971l<Void> P() {
        ArrayList arrayList = new ArrayList();
        for (File next : N()) {
            try {
                arrayList.add(O(Long.parseLong(next.getName().substring(3))));
            } catch (NumberFormatException unused) {
                Nb.g f10 = Nb.g.f();
                f10.k("Could not parse app exception timestamp from file " + next.getName());
            }
            next.delete();
        }
        return C8974o.g(arrayList);
    }

    private static boolean Q(String str, File file, F.a aVar) {
        if (file == null || !file.exists()) {
            Nb.g f10 = Nb.g.f();
            f10.k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            Nb.g f11 = Nb.g.f();
            f11.g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static N R(h hVar) {
        File c10 = hVar.c();
        if (c10 != null && c10.exists()) {
            return new I("minidump_file", "minidump", c10);
        }
        return new C9249g("minidump_file", "minidump", new byte[]{0});
    }

    private static byte[] T(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private C8971l<Boolean> a0() {
        if (this.f62996b.d()) {
            Nb.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f63010p.e(Boolean.FALSE);
            return C8974o.f(Boolean.TRUE);
        }
        Nb.g.f().b("Automatic data collection is disabled.");
        Nb.g.f().i("Notifying that unsent reports are available.");
        this.f63010p.e(Boolean.TRUE);
        C8971l<TContinuationResult> s10 = this.f62996b.j().s(new c());
        Nb.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return Rb.b.c(s10, this.f63011q.a());
    }

    private void b0(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            List a10 = ((ActivityManager) this.f62995a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
            if (a10.size() != 0) {
                this.f63007m.y(str, a10, new Sb.f(this.f63001g, str), p.m(str, this.f63001g, this.f62999e));
                return;
            }
            Nb.g f10 = Nb.g.f();
            f10.i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        Nb.g f11 = Nb.g.f();
        f11.i("ANR feature enabled, but device is API " + i10);
    }

    private static G.a o(K k10, C9243a aVar) {
        return G.a.b(k10.f(), aVar.f62955f, aVar.f62956g, k10.a().c(), G.b(aVar.f62953d).j(), aVar.f62957h);
    }

    private static G.b p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return G.b.c(C9251i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C9251i.b(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), C9251i.w(), C9251i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static G.c q() {
        return G.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C9251i.x());
    }

    /* access modifiers changed from: private */
    public static void r(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void v(boolean r4, Yb.j r5, boolean r6) {
        /*
            r3 = this;
            Rb.f.c()
            java.util.ArrayList r0 = new java.util.ArrayList
            Qb.b0 r1 = r3.f63007m
            java.util.SortedSet r1 = r1.s()
            r0.<init>(r1)
            int r1 = r0.size()
            if (r1 > r4) goto L_0x001e
            Nb.g r4 = Nb.g.f()
            java.lang.String r5 = "No open sessions to be closed."
            r4.i(r5)
            return
        L_0x001e:
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r6 == 0) goto L_0x0034
            Yb.d r5 = r5.b()
            Yb.d$a r5 = r5.f64900b
            boolean r5 = r5.f64908b
            if (r5 == 0) goto L_0x0034
            r3.b0(r1)
            goto L_0x003d
        L_0x0034:
            Nb.g r5 = Nb.g.f()
            java.lang.String r2 = "ANR feature disabled."
            r5.i(r2)
        L_0x003d:
            if (r6 == 0) goto L_0x004a
            Nb.a r5 = r3.f63004j
            boolean r5 = r5.d(r1)
            if (r5 == 0) goto L_0x004a
            r3.z(r1)
        L_0x004a:
            if (r4 == 0) goto L_0x0054
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x005b
        L_0x0054:
            Qb.m r4 = r3.f63006l
            r5 = 0
            r4.e(r5)
            r4 = r5
        L_0x005b:
            Qb.b0 r5 = r3.f63007m
            long r0 = D()
            r5.m(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Qb.C9258p.v(boolean, Yb.j, boolean):void");
    }

    /* access modifiers changed from: private */
    public void w(String str, Boolean bool) {
        long D10 = D();
        Nb.g f10 = Nb.g.f();
        f10.b("Opening a new session with ID " + str);
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{C9267z.q()});
        G.a o10 = o(this.f63000f, this.f63002h);
        G.c q10 = q();
        G.b p10 = p(this.f62995a);
        this.f63004j.c(str, format, D10, G.b(o10, q10, p10));
        if (bool.booleanValue() && str != null) {
            this.f62998d.r(str);
        }
        this.f63003i.e(str);
        this.f63006l.e(str);
        this.f63007m.t(str, D10);
    }

    /* access modifiers changed from: private */
    public void x(long j10) {
        try {
            g gVar = this.f63001g;
            if (!gVar.g(".ae" + j10).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            Nb.g.f().l("Could not create app exception marker file.", e10);
        }
    }

    private void z(String str) {
        Nb.g f10 = Nb.g.f();
        f10.i("Finalizing native report for session " + str);
        h a10 = this.f63004j.a(str);
        File c10 = a10.c();
        F.a b10 = a10.b();
        if (Q(str, c10, b10)) {
            Nb.g.f().k("No native core present");
            return;
        }
        long lastModified = c10.lastModified();
        Sb.f fVar = new Sb.f(this.f63001g, str);
        File k10 = this.f63001g.k(str);
        if (!k10.isDirectory()) {
            Nb.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        x(lastModified);
        List<N> E10 = E(a10, str, this.f63001g, fVar.b());
        O.b(k10, E10);
        Nb.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f63007m.l(str, E10, b10);
        fVar.a();
    }

    /* access modifiers changed from: package-private */
    public boolean A(j jVar) {
        f.c();
        if (K()) {
            Nb.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Nb.g.f().i("Finalizing previously open sessions.");
        try {
            v(true, jVar, true);
            Nb.g.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            Nb.g.f().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public String H() {
        InputStream F10 = F("META-INF/version-control-info.textproto");
        if (F10 == null) {
            return null;
        }
        Nb.g.f().b("Read version control info");
        return Base64.encodeToString(T(F10), 0);
    }

    /* access modifiers changed from: package-private */
    public void I(j jVar, Thread thread, Throwable th2) {
        J(jVar, thread, th2, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized void J(j jVar, Thread thread, Throwable th2, boolean z10) {
        Nb.g f10 = Nb.g.f();
        f10.b("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
        C8971l g10 = this.f62999e.f63181a.g(new b(System.currentTimeMillis(), th2, thread, jVar, z10));
        if (!z10) {
            try {
                e0.b(g10);
            } catch (TimeoutException unused) {
                Nb.g.f().d("Cannot send reports. Timed out while fetching settings.");
            } catch (Exception e10) {
                Nb.g.f().e("Error handling uncaught exception", e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean K() {
        D d10 = this.f63008n;
        return d10 != null && d10.a();
    }

    /* access modifiers changed from: package-private */
    public List<File> N() {
        return this.f63001g.h(f62994t);
    }

    /* access modifiers changed from: package-private */
    public void S(String str) {
        this.f62999e.f63181a.f(new C9256n(this, str));
    }

    /* access modifiers changed from: package-private */
    public void U() {
        try {
            String H10 = H();
            if (H10 != null) {
                X("com.crashlytics.version-control-info", H10);
                Nb.g.f().g("Saved version control info");
            }
        } catch (IOException e10) {
            Nb.g.f().l("Unable to save version control info", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public C8971l<Void> V() {
        this.f63011q.e(Boolean.TRUE);
        return this.f63012r.a();
    }

    /* access modifiers changed from: package-private */
    public void W(String str, String str2) {
        try {
            this.f62998d.p(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f62995a;
            if (context == null || !C9251i.u(context)) {
                Nb.g.f().d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e10;
        }
    }

    /* access modifiers changed from: package-private */
    public void X(String str, String str2) {
        try {
            this.f62998d.q(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f62995a;
            if (context == null || !C9251i.u(context)) {
                Nb.g.f().d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e10;
        }
    }

    /* access modifiers changed from: package-private */
    public void Y(String str) {
        this.f62998d.s(str);
    }

    /* access modifiers changed from: package-private */
    public void Z(C8971l<Yb.d> lVar) {
        if (!this.f63007m.p()) {
            Nb.g.f().i("No crash reports are available to be sent.");
            this.f63010p.e(Boolean.FALSE);
            return;
        }
        Nb.g.f().i("Crash reports are available to be sent.");
        a0().r(this.f62999e.f63181a, new d(lVar));
    }

    /* access modifiers changed from: package-private */
    public void c0(Thread thread, Throwable th2, Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!K()) {
            long G10 = G(currentTimeMillis);
            String C10 = C();
            if (C10 == null) {
                Nb.g.f().k("Tried to write a non-fatal exception while no session was open.");
                return;
            }
            this.f63007m.x(th2, thread, new Sb.c(C10, G10, map));
        }
    }

    /* access modifiers changed from: package-private */
    public void d0(long j10, String str) {
        if (!K()) {
            this.f63003i.g(j10, str);
        }
    }

    /* access modifiers changed from: package-private */
    public C8971l<Boolean> n() {
        if (this.f63013s.compareAndSet(false, true)) {
            return this.f63010p.a();
        }
        Nb.g.f().k("checkForUnsentReports should only be called once per execution.");
        return C8974o.f(Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    public C8971l<Void> s() {
        this.f63011q.e(Boolean.FALSE);
        return this.f63012r.a();
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        f.c();
        if (!this.f62997c.c()) {
            String C10 = C();
            return C10 != null && this.f63004j.d(C10);
        }
        Nb.g.f().i("Found previous crash marker.");
        this.f62997c.d();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void u(j jVar) {
        v(false, jVar, false);
    }

    /* access modifiers changed from: package-private */
    public void y(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, j jVar) {
        this.f63009o = jVar;
        S(str);
        D d10 = new D(new a(), jVar, uncaughtExceptionHandler, this.f63004j);
        this.f63008n = d10;
        Thread.setDefaultUncaughtExceptionHandler(d10);
    }
}
