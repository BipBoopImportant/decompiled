package Wx;

import Ae.e;
import HJ.C15854t;
import Ux.b;
import XH.C16807N;
import Zx.c;
import Zx.d;
import aA.C13909a;
import am.C11070a;
import androidx.work.C7032a;
import androidx.work.C7036e;
import androidx.work.C7037f;
import androidx.work.C7042k;
import androidx.work.C7056z;
import androidx.work.H;
import com.ingka.ikea.pushnotification.impl.RegisterClientPushTokenWorker;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eE.C14397a;
import eE.C14400d;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import tf.C10253a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 12\u00020\u00012\u00020\u0002:\u0001!BQ\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001cH@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017H@¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010'R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010,R\u0014\u0010/\u001a\u00020-8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010.R\u0014\u00100\u001a\u00020-8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010.¨\u00062"}, d2 = {"LWx/b;", "LZx/c;", "LZx/d;", "Lcom/ingka/ikea/pushnotification/impl/repo/network/b;", "notificationRemoteDataSource", "LUx/b;", "firebaseIntegration", "LaA/a;", "sessionManager", "LXx/a;", "dataStore", "LAe/e;", "analytics", "Ltf/a;", "killSwitchRepository", "LeE/d;", "workScheduler", "LGo/a;", "clientIdentityProvider", "Lam/a;", "appApi", "<init>", "(Lcom/ingka/ikea/pushnotification/impl/repo/network/b;LUx/b;LaA/a;LXx/a;LAe/e;Ltf/a;LeE/d;LGo/a;Lam/a;)V", "LXH/N;", "i", "()V", "c", "b", "", "d", "(LdI/e;)Ljava/lang/Object;", "e", "f", "a", "Lcom/ingka/ikea/pushnotification/impl/repo/network/b;", "LUx/b;", "LaA/a;", "LXx/a;", "LAe/e;", "Ltf/a;", "g", "LeE/d;", "h", "LGo/a;", "Lam/a;", "", "()Z", "featureEnabled", "failedToRegister", "j", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements c, d {

    /* renamed from: j  reason: collision with root package name */
    public static final a f117729j = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final com.ingka.ikea.pushnotification.impl.repo.network.b f117730a;

    /* renamed from: b  reason: collision with root package name */
    private final Ux.b f117731b;

    /* renamed from: c  reason: collision with root package name */
    private final C13909a f117732c;

    /* renamed from: d  reason: collision with root package name */
    private final Xx.a f117733d;

    /* renamed from: e  reason: collision with root package name */
    private final e f117734e;

    /* renamed from: f  reason: collision with root package name */
    private final C10253a f117735f;

    /* renamed from: g  reason: collision with root package name */
    private final C14400d f117736g;

    /* renamed from: h  reason: collision with root package name */
    private final Go.a f117737h;

    /* renamed from: i  reason: collision with root package name */
    private final C11070a f117738i;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LWx/b$a;", "", "<init>", "()V", "", "REGISTER_FCM_TOKEN", "Ljava/lang/String;", "DEBUG", "RELEASE", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.pushnotification.impl.repo.PushNotificationRepositoryImpl", f = "PushNotificationRepositoryImpl.kt", l = {84, 94}, m = "registerClientToken")
    /* renamed from: Wx.b$b  reason: collision with other inner class name */
    static final class C2908b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f117739c;

        /* renamed from: d  reason: collision with root package name */
        Object f117740d;

        /* renamed from: e  reason: collision with root package name */
        Object f117741e;

        /* renamed from: f  reason: collision with root package name */
        Object f117742f;

        /* renamed from: g  reason: collision with root package name */
        Object f117743g;

        /* renamed from: h  reason: collision with root package name */
        Object f117744h;

        /* renamed from: i  reason: collision with root package name */
        int f117745i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f117746j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ b f117747k;

        /* renamed from: l  reason: collision with root package name */
        int f117748l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2908b(b bVar, C17164e<? super C2908b> eVar) {
            super(eVar);
            this.f117747k = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f117746j = obj;
            this.f117748l |= Integer.MIN_VALUE;
            return this.f117747k.e(this);
        }
    }

    public b(com.ingka.ikea.pushnotification.impl.repo.network.b bVar, Ux.b bVar2, C13909a aVar, Xx.a aVar2, e eVar, C10253a aVar3, C14400d dVar, Go.a aVar4, C11070a aVar5) {
        C17542s.j(bVar, "notificationRemoteDataSource");
        C17542s.j(bVar2, "firebaseIntegration");
        C17542s.j(aVar, "sessionManager");
        C17542s.j(aVar2, "dataStore");
        C17542s.j(eVar, "analytics");
        C17542s.j(aVar3, "killSwitchRepository");
        C17542s.j(dVar, "workScheduler");
        C17542s.j(aVar4, "clientIdentityProvider");
        C17542s.j(aVar5, "appApi");
        this.f117730a = bVar;
        this.f117731b = bVar2;
        this.f117732c = aVar;
        this.f117733d = aVar2;
        this.f117734e = eVar;
        this.f117735f = aVar3;
        this.f117736g = dVar;
        this.f117737h = aVar4;
        this.f117738i = aVar5;
    }

    private final void i() {
        this.f117736g.c("RegisterClientPushToken");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(b bVar, String str) {
        C17542s.j(str, "reason");
        e.c.a(bVar.f117734e, "RegisterFCMToken", Ae.d.EVENT_FAIL, str, (Map) null, 8, (Object) null);
        return C16807N.f139792a;
    }

    public boolean a() {
        return this.f117733d.a();
    }

    public void b() {
        i();
        this.f117733d.b(false);
        this.f117731b.b();
    }

    public void c() {
        if (g()) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Schedule register push token", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            C14400d.a.a(this.f117736g, P.b(RegisterClientPushTokenWorker.class), new C14397a("RegisterClientPushToken", (C7032a) null, 0, new C7036e.a().b(C7056z.CONNECTED).a(), 0, (C7037f) null, (H) null, 118, (DefaultConstructorMarker) null), (C7042k) null, 4, (Object) null);
            return;
        }
    }

    public Object d(C17164e<? super String> eVar) {
        return b.a.b(this.f117731b, (C17642l) null, eVar, 1, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(dI.C17164e<? super XH.C16807N> r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r1 instanceof Wx.b.C2908b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            Wx.b$b r2 = (Wx.b.C2908b) r2
            int r3 = r2.f117748l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f117748l = r3
            goto L_0x001c
        L_0x0017:
            Wx.b$b r2 = new Wx.b$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f117746j
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f117748l
            r6 = 0
            r7 = 1
            r8 = 2
            r9 = 0
            if (r5 == 0) goto L_0x005e
            if (r5 == r7) goto L_0x0052
            if (r5 != r8) goto L_0x004a
            java.lang.Object r1 = r2.f117744h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f117743g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f117742f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f117741e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f117740d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f117739c
            Wx.b r1 = (Wx.b) r1
            XH.y.b(r3)
            goto L_0x00b6
        L_0x004a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0052:
            java.lang.Object r1 = r2.f117740d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f117739c
            Wx.b r5 = (Wx.b) r5
            XH.y.b(r3)
            goto L_0x0085
        L_0x005e:
            XH.y.b(r3)
            aA.a r3 = r0.f117732c
            boolean r3 = r3.isLoggedIn()
            if (r3 == 0) goto L_0x0165
            Ae.e r3 = r0.f117734e
            java.lang.String r5 = "RegisterFCMToken"
            Ae.f.a.a(r3, r5, r9, r8, r9)
            Ux.b r3 = r0.f117731b
            Wx.a r5 = new Wx.a
            r5.<init>(r0)
            r2.f117739c = r0
            r2.f117740d = r1
            r2.f117748l = r7
            java.lang.Object r3 = r3.a(r5, r2)
            if (r3 != r4) goto L_0x0084
            return r4
        L_0x0084:
            r5 = r0
        L_0x0085:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x00bd
            am.a r7 = r5.f117738i
            boolean r7 = r7.b()
            if (r7 == 0) goto L_0x0094
            java.lang.String r7 = "debug"
            goto L_0x0096
        L_0x0094:
            java.lang.String r7 = "release"
        L_0x0096:
            com.ingka.ikea.pushnotification.impl.repo.network.b r9 = r5.f117730a
            Go.a r10 = r5.f117737h
            java.lang.String r10 = r10.c()
            r2.f117739c = r5
            r2.f117740d = r1
            r2.f117741e = r3
            r2.f117742f = r3
            r2.f117743g = r3
            r2.f117744h = r7
            r2.f117745i = r6
            r2.f117748l = r8
            java.lang.Object r1 = r9.a(r10, r3, r7, r2)
            if (r1 != r4) goto L_0x00b5
            return r4
        L_0x00b5:
            r1 = r5
        L_0x00b6:
            Xx.a r1 = r1.f117733d
            r1.b(r6)
            goto L_0x0165
        L_0x00bd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Could not fetch FCM token"
            r1.<init>(r2)
            qv.e r2 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00d7:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x00ee
            java.lang.Object r10 = r3.next()
            r11 = r10
            qv.b r11 = (qv.C11819b) r11
            boolean r11 = r11.b(r2, r6)
            if (r11 == 0) goto L_0x00d7
            r4.add(r10)
            goto L_0x00d7
        L_0x00ee:
            java.util.Iterator r3 = r4.iterator()
            r4 = r9
            r6 = r4
        L_0x00f4:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x0165
            java.lang.Object r10 = r3.next()
            qv.b r10 = (qv.C11819b) r10
            if (r4 != 0) goto L_0x010d
            java.lang.String r4 = qv.C11818a.a(r9, r1)
            if (r4 != 0) goto L_0x0109
            goto L_0x0165
        L_0x0109:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x010d:
            if (r6 != 0) goto L_0x015c
            java.lang.Class r6 = r5.getClass()
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r11 = 36
            java.lang.String r11 = HJ.C15854t.s1(r6, r11, r9, r8, r9)
            r12 = 46
            java.lang.String r11 = HJ.C15854t.o1(r11, r12, r9, r8, r9)
            int r12 = r11.length()
            if (r12 != 0) goto L_0x012d
            goto L_0x0133
        L_0x012d:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = HJ.C15854t.P0(r11, r6)
        L_0x0133:
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "main"
            boolean r11 = HJ.C15854t.b0(r11, r12, r7)
            if (r11 == 0) goto L_0x0146
            java.lang.String r11 = "m"
            goto L_0x0148
        L_0x0146:
            java.lang.String r11 = "b"
        L_0x0148:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = "|"
            r12.append(r11)
            r12.append(r6)
            java.lang.String r6 = r12.toString()
        L_0x015c:
            r13 = 0
            r11 = r2
            r12 = r6
            r14 = r1
            r15 = r4
            r10.a(r11, r12, r13, r14, r15)
            goto L_0x00f4
        L_0x0165:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Wx.b.e(dI.e):java.lang.Object");
    }

    public void f() {
        this.f117733d.b(true);
    }

    public boolean g() {
        return this.f117735f.g();
    }
}
