package V8;

import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import a9.C6858j4;
import a9.H1;
import a9.U;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import com.contentsquare.android.internal.core.telemetry.event.AppLifeCycleEvent;
import dI.C17164e;
import dI.C17168i;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV8/a;", "Landroidx/lifecycle/h;", "library_release"}, k = 1, mv = {1, 8, 0})
public final class a implements C5205h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6858j4 f40484a;

    @f(c = "com.contentsquare.android.internal.core.telemetry.processing.TelemetryManager$lifecycleObserver$1$onStop$1", f = "TelemetryManager.kt", l = {80, 84}, m = "invokeSuspend")
    /* renamed from: V8.a$a  reason: collision with other inner class name */
    public static final class C0668a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public Iterator f40485c;

        /* renamed from: d  reason: collision with root package name */
        public int f40486d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C6858j4 f40487e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0668a(C6858j4 j4Var, C17164e<? super C0668a> eVar) {
            super(2, eVar);
            this.f40487e = j4Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C0668a(this.f40487e, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            Q q10 = (Q) obj;
            return new C0668a(this.f40487e, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[Catch:{ all -> 0x0013 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0058 A[Catch:{ all -> 0x0013 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r5.f40486d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0024
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                XH.y.b(r6)     // Catch:{ all -> 0x0013 }
                goto L_0x008b
            L_0x0013:
                r6 = move-exception
                goto L_0x00b3
            L_0x0016:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001e:
                java.util.Iterator r1 = r5.f40485c
                XH.y.b(r6)     // Catch:{ all -> 0x0013 }
                goto L_0x002f
            L_0x0024:
                XH.y.b(r6)
                a9.j4 r6 = r5.f40487e     // Catch:{ all -> 0x0013 }
                java.util.ArrayList r6 = r6.f42629j     // Catch:{ all -> 0x0013 }
                java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0013 }
            L_0x002f:
                boolean r6 = r1.hasNext()     // Catch:{ all -> 0x0013 }
                if (r6 == 0) goto L_0x0046
                java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x0013 }
                a9.j3 r6 = (a9.C6857j3) r6     // Catch:{ all -> 0x0013 }
                r5.f40485c = r1     // Catch:{ all -> 0x0013 }
                r5.f40486d = r3     // Catch:{ all -> 0x0013 }
                java.lang.Object r6 = r6.a(r5)     // Catch:{ all -> 0x0013 }
                if (r6 != r0) goto L_0x002f
                return r0
            L_0x0046:
                a9.j4 r6 = r5.f40487e     // Catch:{ all -> 0x0013 }
                a9.R4 r6 = r6.f42622c     // Catch:{ all -> 0x0013 }
                XH.o r6 = r6.f42248c     // Catch:{ all -> 0x0013 }
                java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x0013 }
                a9.e2 r6 = (a9.C6816e2) r6     // Catch:{ all -> 0x0013 }
                boolean r6 = r6.b()     // Catch:{ all -> 0x0013 }
                if (r6 == 0) goto L_0x00bc
                a9.j4 r6 = r5.f40487e     // Catch:{ all -> 0x0013 }
                a9.R4 r6 = r6.f42622c     // Catch:{ all -> 0x0013 }
                XH.o r6 = r6.f42248c     // Catch:{ all -> 0x0013 }
                java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x0013 }
                a9.e2 r6 = (a9.C6816e2) r6     // Catch:{ all -> 0x0013 }
                int r6 = r6.a()     // Catch:{ all -> 0x0013 }
                r1 = 0
                switch(r6) {
                    case 1: goto L_0x007c;
                    case 2: goto L_0x0079;
                    case 3: goto L_0x0076;
                    case 4: goto L_0x0073;
                    case 5: goto L_0x0070;
                    case 6: goto L_0x006d;
                    default: goto L_0x006c;
                }     // Catch:{ all -> 0x0013 }
            L_0x006c:
                throw r1     // Catch:{ all -> 0x0013 }
            L_0x006d:
                java.lang.String r6 = "rejected"
                goto L_0x007e
            L_0x0070:
                java.lang.String r6 = "config"
                goto L_0x007e
            L_0x0073:
                java.lang.String r6 = "forced"
                goto L_0x007e
            L_0x0076:
                java.lang.String r6 = "fortnightly"
                goto L_0x007e
            L_0x0079:
                java.lang.String r6 = "update"
                goto L_0x007e
            L_0x007c:
                java.lang.String r6 = "install"
            L_0x007e:
                a9.j4 r4 = r5.f40487e     // Catch:{ all -> 0x0013 }
                r5.f40485c = r1     // Catch:{ all -> 0x0013 }
                r5.f40486d = r2     // Catch:{ all -> 0x0013 }
                java.lang.Object r6 = a9.C6858j4.a(r4, r6, r5)     // Catch:{ all -> 0x0013 }
                if (r6 != r0) goto L_0x008b
                return r0
            L_0x008b:
                a9.j4 r6 = r5.f40487e     // Catch:{ all -> 0x0013 }
                a9.R4 r6 = r6.f42622c     // Catch:{ all -> 0x0013 }
                E8.c r0 = r6.f42246a     // Catch:{ all -> 0x0013 }
                E8.b r1 = E8.b.TELEMETRY_IS_REPORT_SENT     // Catch:{ all -> 0x0013 }
                r0.h(r1, r3)     // Catch:{ all -> 0x0013 }
                E8.c r0 = r6.f42246a     // Catch:{ all -> 0x0013 }
                E8.b r1 = E8.b.TELEMETRY_LAST_REPORT_SENT_TIME_STAMP     // Catch:{ all -> 0x0013 }
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0013 }
                r0.k(r1, r2)     // Catch:{ all -> 0x0013 }
                E8.c r0 = r6.f42246a     // Catch:{ all -> 0x0013 }
                E8.b r1 = E8.b.TELEMETRY_CUSTOMER_APP_CODE_VERSION     // Catch:{ all -> 0x0013 }
                F8.g r6 = r6.f42247b     // Catch:{ all -> 0x0013 }
                G8.d r6 = r6.c()     // Catch:{ all -> 0x0013 }
                long r2 = r6.e()     // Catch:{ all -> 0x0013 }
                r0.k(r1, r2)     // Catch:{ all -> 0x0013 }
                goto L_0x00bc
            L_0x00b3:
                a9.j4 r0 = r5.f40487e
                D8.c r0 = r0.f42628i
                java.lang.String r1 = "Telemetry onStop life cycle event failed"
                a9.H1.a(r0, r1, r6)
            L_0x00bc:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: V8.a.C0668a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(C6858j4 j4Var) {
        this.f40484a = j4Var;
    }

    public final void c(C5221y yVar) {
        C17542s.j(yVar, "owner");
        try {
            U u10 = this.f40484a.f42626g;
            u10.getClass();
            u10.a(new AppLifeCycleEvent("start", 1));
        } catch (Throwable th2) {
            H1.a(this.f40484a.f42628i, "Telemetry onCreate life cycle event failed", th2);
        }
    }

    public final void onStart(C5221y yVar) {
        C17542s.j(yVar, "owner");
        try {
            C6858j4 j4Var = this.f40484a;
            if (j4Var.f42634o) {
                j4Var.f42634o = false;
                return;
            }
            j4Var.b();
            U u10 = this.f40484a.f42626g;
            u10.f42316c = u10.f42314a.invoke().longValue();
            u10.a(new AppLifeCycleEvent("foreground", 1));
        } catch (Throwable th2) {
            H1.a(this.f40484a.f42628i, "Telemetry onStart life cycle event failed", th2);
        }
    }

    public final void onStop(C5221y yVar) {
        C17542s.j(yVar, "owner");
        U u10 = this.f40484a.f42626g;
        u10.a(new AppLifeCycleEvent("duration", u10.f42314a.invoke().longValue() - u10.f42316c));
        u10.a(new AppLifeCycleEvent("background", 1));
        C6858j4 j4Var = this.f40484a;
        F0 unused = C16314k.d(j4Var.f42633n, (C17168i) null, (T) null, new C0668a(j4Var, (C17164e<? super C0668a>) null), 3, (Object) null);
    }
}
