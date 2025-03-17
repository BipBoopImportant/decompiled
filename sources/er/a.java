package Er;

import Dr.b;
import com.sugarcube.app.base.DeviceCompatibility;
import com.sugarcube.app.base.data.AnalyticsManager;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0013\u0010\u001f¨\u0006!"}, d2 = {"LEr/a;", "Lgp/b;", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "analyticsManager", "LDr/b;", "integration", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "Lcom/sugarcube/app/base/DeviceCompatibility;", "deviceCompatibility", "LFr/a;", "geomagicalInterceptor", "<init>", "(Lcom/sugarcube/app/base/data/AnalyticsManager;LDr/b;Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/app/base/DeviceCompatibility;LFr/a;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "LDr/b;", "c", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "d", "Lcom/sugarcube/app/base/DeviceCompatibility;", "e", "LFr/a;", "Lgp/e;", "f", "Lgp/e;", "()Lgp/e;", "taskId", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final AnalyticsManager f80754a;

    /* renamed from: b  reason: collision with root package name */
    private final b f80755b;

    /* renamed from: c  reason: collision with root package name */
    private final ConfigRepository f80756c;

    /* renamed from: d  reason: collision with root package name */
    private final DeviceCompatibility f80757d;

    /* renamed from: e  reason: collision with root package name */
    private final Fr.a f80758e;

    /* renamed from: f  reason: collision with root package name */
    private final C11346e f80759f = C11346e.FETCH_CONFIG;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.geomagical.impl.FetchConfigTask", f = "FetchConfigTask.kt", l = {31, 33, 34}, m = "execute")
    /* renamed from: Er.a$a  reason: collision with other inner class name */
    static final class C1541a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f80760c;

        /* renamed from: d  reason: collision with root package name */
        Object f80761d;

        /* renamed from: e  reason: collision with root package name */
        Object f80762e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f80763f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f80764g;

        /* renamed from: h  reason: collision with root package name */
        int f80765h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1541a(a aVar, C17164e<? super C1541a> eVar) {
            super(eVar);
            this.f80764g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f80763f = obj;
            this.f80765h |= Integer.MIN_VALUE;
            return this.f80764g.b((Object) null, this);
        }
    }

    public a(AnalyticsManager analyticsManager, b bVar, ConfigRepository configRepository, DeviceCompatibility deviceCompatibility, Fr.a aVar) {
        C17542s.j(analyticsManager, "analyticsManager");
        C17542s.j(bVar, "integration");
        C17542s.j(configRepository, "configRepository");
        C17542s.j(deviceCompatibility, "deviceCompatibility");
        C17542s.j(aVar, "geomagicalInterceptor");
        this.f80754a = analyticsManager;
        this.f80755b = bVar;
        this.f80756c = configRepository;
        this.f80757d = deviceCompatibility;
        this.f80758e = aVar;
    }

    public C11346e a() {
        return this.f80759f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: dI.e<? super java.lang.Boolean>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r9, dI.C17164e<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof Er.a.C1541a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            Er.a$a r0 = (Er.a.C1541a) r0
            int r1 = r0.f80765h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f80765h = r1
            goto L_0x0018
        L_0x0013:
            Er.a$a r0 = new Er.a$a
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f80763f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f80765h
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0060
            if (r3 == r6) goto L_0x0051
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r9 = r0.f80762e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f80760c
            Er.a r9 = (Er.a) r9
            XH.y.b(r1)
            goto L_0x00a7
        L_0x0038:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0040:
            java.lang.Object r9 = r0.f80762e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r10 = r0.f80761d
            java.lang.Object r3 = r0.f80760c
            Er.a r3 = (Er.a) r3
            XH.y.b(r1)
            r1 = r10
            r10 = r9
        L_0x004f:
            r9 = r3
            goto L_0x0096
        L_0x0051:
            java.lang.Object r9 = r0.f80762e
            r10 = r9
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r9 = r0.f80761d
            java.lang.Object r3 = r0.f80760c
            Er.a r3 = (Er.a) r3
            XH.y.b(r1)
            goto L_0x0079
        L_0x0060:
            XH.y.b(r1)
            Dr.b r1 = r8.f80755b
            TJ.g r1 = r1.isEnabled()
            r0.f80760c = r8
            r0.f80761d = r9
            r0.f80762e = r10
            r0.f80765h = r6
            java.lang.Object r1 = TJ.C16534i.D(r1, r0)
            if (r1 != r2) goto L_0x0078
            return r2
        L_0x0078:
            r3 = r8
        L_0x0079:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r6)
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r7)
            if (r1 == 0) goto L_0x00ae
            com.sugarcube.app.base.DeviceCompatibility r1 = r3.f80757d
            r0.f80760c = r3
            r0.f80761d = r9
            r0.f80762e = r10
            r0.f80765h = r5
            java.lang.Object r1 = r1.updateCompatibility(r0)
            if (r1 != r2) goto L_0x0094
            return r2
        L_0x0094:
            r1 = r9
            goto L_0x004f
        L_0x0096:
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r9.f80756c
            r0.f80760c = r9
            r0.f80761d = r1
            r0.f80762e = r10
            r0.f80765h = r4
            java.lang.Object r10 = r3.blockUntilInitialized(r0)
            if (r10 != r2) goto L_0x00a7
            return r2
        L_0x00a7:
            com.sugarcube.app.base.data.AnalyticsManager r10 = r9.f80754a
            Fr.a r9 = r9.f80758e
            r10.addEngine(r9)
        L_0x00ae:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Er.a.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
