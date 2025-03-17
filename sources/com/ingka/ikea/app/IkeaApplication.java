package com.ingka.ikea.app;

import Ae.e;
import Ae.i;
import Bg.a;
import QJ.Q;
import Qg.c;
import Se.b;
import T5.C;
import T5.r;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.C7034c;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import dI.C17164e;
import dI.C17168i;
import gp.C11343b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import oC.C14873b;
import oe.C10113c;
import qv.d;
import sf.C10242c;
import tf.C10253a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0005J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010>\u001a\u0002088\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010G\u001a\b\u0012\u0004\u0012\u00020@0?8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010N\u001a\u00020H8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b#\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010T\u001a\u00020O8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b+\u0010P\u001a\u0004\bA\u0010Q\"\u0004\bR\u0010SR\"\u0010W\u001a\u00020O8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bJ\u0010P\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010SR\"\u0010^\u001a\u00020X8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bU\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010d\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\b_\u0010a\"\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020e8VX\u0002¢\u0006\f\n\u0004\b\u001b\u0010f\u001a\u0004\bg\u0010h¨\u0006j"}, d2 = {"Lcom/ingka/ikea/app/IkeaApplication;", "Landroid/app/Application;", "Landroidx/work/c$c;", "LT5/C$a;", "<init>", "()V", "LXH/N;", "g", "", "retailCode", "languageCode", "s", "(Ljava/lang/String;Ljava/lang/String;)V", "LQg/a;", "crashlytics", "r", "(LQg/a;)V", "onCreate", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "LT5/r;", "a", "(Landroid/content/Context;)LT5/r;", "Ltf/a;", "c", "Ltf/a;", "n", "()Ltf/a;", "setKillswitchRepository", "(Ltf/a;)V", "killswitchRepository", "LAe/e;", "d", "LAe/e;", "i", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "Lsf/c;", "e", "Lsf/c;", "j", "()Lsf/c;", "setAppUserDataRepository", "(Lsf/c;)V", "appUserDataRepository", "Lg3/a;", "f", "Lg3/a;", "q", "()Lg3/a;", "setWorkerFactory", "(Lg3/a;)V", "workerFactory", "LoC/b;", "LoC/b;", "o", "()LoC/b;", "setTaskScheduler", "(LoC/b;)V", "taskScheduler", "", "Lgp/b;", "h", "Ljava/util/Set;", "p", "()Ljava/util/Set;", "setTasks", "(Ljava/util/Set;)V", "tasks", "LSe/b;", "LSe/b;", "k", "()LSe/b;", "setApplicationAnalytics", "(LSe/b;)V", "applicationAnalytics", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()Landroid/app/Application$ActivityLifecycleCallbacks;", "setAdjustLifecycleCallbacks", "(Landroid/app/Application$ActivityLifecycleCallbacks;)V", "adjustLifecycleCallbacks", "l", "setEpisodLifecycleCallbacks", "episodLifecycleCallbacks", "Loe/c;", "Loe/c;", "getAdjustEngine", "()Loe/c;", "setAdjustEngine", "(Loe/c;)V", "adjustEngine", "m", "LT5/r;", "()LT5/r;", "setImageLoader", "(LT5/r;)V", "imageLoader", "Landroidx/work/c;", "LXH/o;", "b", "()Landroidx/work/c;", "workManagerConfiguration", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class IkeaApplication extends f implements C7034c.C0777c, C.a {

    /* renamed from: c  reason: collision with root package name */
    public C10253a f69947c;

    /* renamed from: d  reason: collision with root package name */
    public e f69948d;

    /* renamed from: e  reason: collision with root package name */
    public C10242c f69949e;

    /* renamed from: f  reason: collision with root package name */
    public g3.a f69950f;

    /* renamed from: g  reason: collision with root package name */
    public C14873b f69951g;

    /* renamed from: h  reason: collision with root package name */
    public Set<C11343b> f69952h;

    /* renamed from: i  reason: collision with root package name */
    public b f69953i;

    /* renamed from: j  reason: collision with root package name */
    public Application.ActivityLifecycleCallbacks f69954j;

    /* renamed from: k  reason: collision with root package name */
    public Application.ActivityLifecycleCallbacks f69955k;

    /* renamed from: l  reason: collision with root package name */
    public C10113c f69956l;

    /* renamed from: m  reason: collision with root package name */
    public r f69957m;

    /* renamed from: n  reason: collision with root package name */
    private final C16824o f69958n = C16825p.b(new g(this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.IkeaApplication$onCreate$1", f = "IkeaApplication.kt", l = {104}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f69959c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f69960d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ IkeaApplication f69961e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(IkeaApplication ikeaApplication, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f69961e = ikeaApplication;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f69961e, eVar);
            aVar.f69960d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x012b  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0139  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r13.f69959c
                r2 = 1
                if (r1 == 0) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                java.lang.Object r0 = r13.f69960d
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r14)
                goto L_0x0040
            L_0x0013:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x001b:
                XH.y.b(r14)
                java.lang.Object r14 = r13.f69960d
                QJ.Q r14 = (QJ.Q) r14
                java.lang.String r1 = "release"
                java.lang.String r3 = "NonMinifiedRelease"
                boolean r1 = HJ.C15854t.b0(r1, r3, r2)
                if (r1 != 0) goto L_0x011d
                ck.b r1 = new ck.b
                com.ingka.ikea.app.IkeaApplication r3 = r13.f69961e
                r1.<init>(r3)
                r13.f69960d = r14
                r13.f69959c = r2
                java.lang.Object r1 = r1.c(r13)
                if (r1 != r0) goto L_0x003e
                return r0
            L_0x003e:
                r0 = r14
                r14 = r1
            L_0x0040:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto L_0x011d
                ck.b r14 = new ck.b
                com.ingka.ikea.app.IkeaApplication r1 = r13.f69961e
                r14.<init>(r1)
                java.lang.String r14 = r14.b()
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Found emulator running release app: "
                r3.append(r4)
                r3.append(r14)
                java.lang.String r14 = r3.toString()
                r1.<init>(r14)
                qv.e r14 = qv.e.ERROR
                qv.d r3 = qv.d.f102012a
                java.util.List r3 = r3.a()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x007c:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x0094
                java.lang.Object r5 = r3.next()
                r6 = r5
                qv.b r6 = (qv.C11819b) r6
                r7 = 0
                boolean r6 = r6.b(r14, r7)
                if (r6 == 0) goto L_0x007c
                r4.add(r5)
                goto L_0x007c
            L_0x0094:
                java.util.Iterator r9 = r4.iterator()
                r10 = 0
                r3 = r10
                r4 = r3
            L_0x009b:
                boolean r5 = r9.hasNext()
                if (r5 == 0) goto L_0x0113
                java.lang.Object r5 = r9.next()
                qv.b r5 = (qv.C11819b) r5
                if (r3 != 0) goto L_0x00b5
                java.lang.String r3 = qv.C11818a.a(r10, r1)
                if (r3 != 0) goto L_0x00b1
                goto L_0x0113
            L_0x00b1:
                java.lang.String r3 = qv.C11820c.a(r3)
            L_0x00b5:
                r11 = r3
                if (r4 != 0) goto L_0x0106
                java.lang.Class r3 = r0.getClass()
                java.lang.String r3 = r3.getName()
                kotlin.jvm.internal.C17542s.g(r3)
                r4 = 36
                r6 = 2
                java.lang.String r4 = HJ.C15854t.s1(r3, r4, r10, r6, r10)
                r7 = 46
                java.lang.String r4 = HJ.C15854t.o1(r4, r7, r10, r6, r10)
                int r6 = r4.length()
                if (r6 != 0) goto L_0x00d7
                goto L_0x00dd
            L_0x00d7:
                java.lang.String r3 = "Kt"
                java.lang.String r3 = HJ.C15854t.P0(r4, r3)
            L_0x00dd:
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                java.lang.String r6 = "main"
                boolean r4 = HJ.C15854t.b0(r4, r6, r2)
                if (r4 == 0) goto L_0x00f0
                java.lang.String r4 = "m"
                goto L_0x00f2
            L_0x00f0:
                java.lang.String r4 = "b"
            L_0x00f2:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                java.lang.String r4 = "|"
                r6.append(r4)
                r6.append(r3)
                java.lang.String r4 = r6.toString()
            L_0x0106:
                r12 = r4
                r6 = 0
                r3 = r5
                r4 = r14
                r5 = r12
                r7 = r1
                r8 = r11
                r3.a(r4, r5, r6, r7, r8)
                r3 = r11
                r4 = r12
                goto L_0x009b
            L_0x0113:
                com.ingka.ikea.app.IkeaApplication r14 = r13.f69961e
                com.ingka.ikea.app.r r0 = new com.ingka.ikea.app.r
                r0.<init>()
                r14.registerActivityLifecycleCallbacks(r0)
            L_0x011d:
                com.ingka.ikea.app.IkeaApplication r14 = r13.f69961e
                sf.c r0 = r14.j()
                java.lang.String r0 = r0.c()
                java.lang.String r1 = ""
                if (r0 != 0) goto L_0x012c
                r0 = r1
            L_0x012c:
                com.ingka.ikea.app.IkeaApplication r2 = r13.f69961e
                sf.c r2 = r2.j()
                java.lang.String r2 = r2.a()
                if (r2 != 0) goto L_0x0139
                goto L_0x013a
            L_0x0139:
                r1 = r2
            L_0x013a:
                r14.s(r0, r1)
                com.ingka.ikea.app.IkeaApplication r14 = r13.f69961e
                oC.b r14 = r14.o()
                com.ingka.ikea.app.IkeaApplication r0 = r13.f69961e
                java.util.Set r0 = r0.p()
                r14.c(r0)
                com.ingka.ikea.app.IkeaApplication r14 = r13.f69961e
                Se.b r14 = r14.k()
                r14.a()
                XH.N r14 = XH.C16807N.f139792a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.IkeaApplication.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void g() {
        registerActivityLifecycleCallbacks(h());
        registerActivityLifecycleCallbacks(l());
    }

    private final void r(Qg.a aVar) {
        d.f102012a.b(new c(aVar), new Qg.e(aVar));
    }

    /* access modifiers changed from: private */
    public final void s(String str, String str2) {
        i h10 = i().h();
        h10.j(str).h(str2);
        i().c(h10.g());
    }

    /* access modifiers changed from: private */
    public static final C7034c t(IkeaApplication ikeaApplication) {
        return new C7034c.a().u(ikeaApplication.q()).a();
    }

    public r a(Context context) {
        C17542s.j(context, "context");
        return m();
    }

    public C7034c b() {
        return (C7034c) this.f69958n.getValue();
    }

    public final Application.ActivityLifecycleCallbacks h() {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f69954j;
        if (activityLifecycleCallbacks != null) {
            return activityLifecycleCallbacks;
        }
        C17542s.z("adjustLifecycleCallbacks");
        return null;
    }

    public final e i() {
        e eVar = this.f69948d;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public final C10242c j() {
        C10242c cVar = this.f69949e;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("appUserDataRepository");
        return null;
    }

    public final b k() {
        b bVar = this.f69953i;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("applicationAnalytics");
        return null;
    }

    public final Application.ActivityLifecycleCallbacks l() {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f69955k;
        if (activityLifecycleCallbacks != null) {
            return activityLifecycleCallbacks;
        }
        C17542s.z("episodLifecycleCallbacks");
        return null;
    }

    public final r m() {
        r rVar = this.f69957m;
        if (rVar != null) {
            return rVar;
        }
        C17542s.z("imageLoader");
        return null;
    }

    public final C10253a n() {
        C10253a aVar = this.f69947c;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("killswitchRepository");
        return null;
    }

    public final C14873b o() {
        C14873b bVar = this.f69951g;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("taskScheduler");
        return null;
    }

    public void onCreate() {
        FirebaseCrashlytics instance = FirebaseCrashlytics.getInstance();
        C17542s.i(instance, "getInstance(...)");
        r(Qg.d.b(instance));
        super.onCreate();
        g();
        Object unused = C16312j.b((C17168i) null, new a(this, (C17164e<? super a>) null), 1, (Object) null);
        a.C0963a aVar = Bg.a.f58907a;
        SharedPreferences a10 = G4.b.a(this);
        C17542s.i(a10, "getDefaultSharedPreferences(...)");
        aVar.b(a10, n());
    }

    public final Set<C11343b> p() {
        Set<C11343b> set = this.f69952h;
        if (set != null) {
            return set;
        }
        C17542s.z("tasks");
        return null;
    }

    public final g3.a q() {
        g3.a aVar = this.f69950f;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("workerFactory");
        return null;
    }
}
