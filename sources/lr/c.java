package Lr;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LLr/c;", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "<init>", "()V", "", "getFCMToken", "(LdI/e;)Ljava/lang/Object;", "getProjectId", "()Ljava/lang/String;", "message", "LXH/N;", "log", "(Ljava/lang/String;)V", "", "throwable", "recordException", "(Ljava/lang/Throwable;)V", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements FirebaseInteractions {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.geomagical.impl.sugarcube.interactions.GeomagicalFirebaseInteractions", f = "GeomagicalFirebaseInteractions.kt", l = {20}, m = "getFCMToken")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f83334c;

        /* renamed from: d  reason: collision with root package name */
        Object f83335d;

        /* renamed from: e  reason: collision with root package name */
        Object f83336e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f83337f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f83338g;

        /* renamed from: h  reason: collision with root package name */
        int f83339h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f83338g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f83337f = obj;
            this.f83339h |= Integer.MIN_VALUE;
            return this.f83338g.getFCMToken(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getFCMToken(dI.C17164e<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Lr.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Lr.c$a r0 = (Lr.c.a) r0
            int r1 = r0.f83339h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f83339h = r1
            goto L_0x0018
        L_0x0013:
            Lr.c$a r0 = new Lr.c$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f83337f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f83339h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f83336e
            xa.l r6 = (xa.C8971l) r6
            java.lang.Object r6 = r0.f83335d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f83334c
            Lr.c r6 = (Lr.c) r6
            XH.y.b(r1)
            goto L_0x005c
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            com.google.firebase.messaging.FirebaseMessaging r1 = com.google.firebase.messaging.FirebaseMessaging.q()
            xa.l r1 = r1.t()
            java.lang.String r3 = "getToken(...)"
            kotlin.jvm.internal.C17542s.i(r1, r3)
            r0.f83334c = r5
            r0.f83335d = r6
            r0.f83336e = r1
            r0.f83339h = r4
            java.lang.Object r1 = cK.C17078d.g(r1, r0)
            if (r1 != r2) goto L_0x005c
            return r2
        L_0x005c:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.C17542s.i(r1, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Lr.c.getFCMToken(dI.e):java.lang.Object");
    }

    public String getProjectId() {
        String e10 = Fb.f.l().n().e();
        return e10 == null ? "" : e10;
    }

    public void log(String str) {
        C17542s.j(str, "message");
        FirebaseCrashlytics.getInstance().log(str);
    }

    public void recordException(Throwable th2) {
        C17542s.j(th2, "throwable");
        FirebaseCrashlytics.getInstance().recordException(th2);
    }
}
