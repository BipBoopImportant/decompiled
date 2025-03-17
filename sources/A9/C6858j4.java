package a9;

import A8.b;
import E8.c;
import F8.g;
import G8.h;
import QJ.C16340x0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import android.app.Application;
import androidx.lifecycle.C5221y;
import com.contentsquare.android.internal.core.telemetry.event.CustomEvent;
import dI.C17164e;
import dI.C17168i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.C17542s;
import org.json.JSONObject;

/* renamed from: a9.j4  reason: case insensitive filesystem */
public final class C6858j4 implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final B5 f42620a;

    /* renamed from: b  reason: collision with root package name */
    public final C5221y f42621b;

    /* renamed from: c  reason: collision with root package name */
    public final R4 f42622c;

    /* renamed from: d  reason: collision with root package name */
    public final P3 f42623d;

    /* renamed from: e  reason: collision with root package name */
    public final P3 f42624e;

    /* renamed from: f  reason: collision with root package name */
    public final C6821f f42625f;

    /* renamed from: g  reason: collision with root package name */
    public final U f42626g;

    /* renamed from: h  reason: collision with root package name */
    public final C6973y0 f42627h;

    /* renamed from: i  reason: collision with root package name */
    public final D8.c f42628i = new D8.c("TelemetryManager");

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f42629j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f42630k;

    /* renamed from: l  reason: collision with root package name */
    public long f42631l;

    /* renamed from: m  reason: collision with root package name */
    public Long f42632m;

    /* renamed from: n  reason: collision with root package name */
    public final Q f42633n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f42634o;

    /* renamed from: p  reason: collision with root package name */
    public final V8.a f42635p;

    /* renamed from: q  reason: collision with root package name */
    public int f42636q;

    /* renamed from: a9.j4$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42637a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                E8.b[] r0 = E8.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                E8.b r1 = E8.b.RAW_CONFIGURATION_AS_JSON     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                E8.b r1 = E8.b.FORGET_ME     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f42637a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a9.C6858j4.a.<clinit>():void");
        }
    }

    public C6858j4(Application application, c cVar, C5221y yVar, R4 r42, C6973y0 y0Var, g gVar, b bVar) {
        Application application2 = application;
        c cVar2 = cVar;
        C5221y yVar2 = yVar;
        R4 r43 = r42;
        C6973y0 y0Var2 = y0Var;
        g gVar2 = gVar;
        b bVar2 = bVar;
        B5 b52 = new B5();
        P3 p32 = new P3();
        P3 p33 = new P3();
        C6821f fVar = new C6821f();
        U u10 = new U(0);
        C8.a aVar = new C8.a();
        h hVar = new h();
        C17542s.j(application2, "application");
        C17542s.j(b52, "telemetryReportProcessor");
        C17542s.j(cVar2, "preferencesStore");
        C17542s.j(yVar2, "lifecycleOwner");
        C17542s.j(r43, "telemetryPolicy");
        C17542s.j(p32, "customEventCollector");
        C17542s.j(p33, "apiUsageCollector");
        C17542s.j(fVar, "timeCollector");
        C17542s.j(u10, "appLifeCycleEventCollector");
        C17542s.j(y0Var2, "staticCollector");
        C17542s.j(gVar2, "deviceInfo");
        C17542s.j(bVar2, "configuration");
        C17542s.j(aVar, "httpConnection");
        C17542s.j(hVar, "fileStorageUtil");
        this.f42620a = b52;
        this.f42621b = yVar2;
        this.f42622c = r43;
        this.f42623d = p32;
        this.f42624e = p33;
        this.f42625f = fVar;
        this.f42626g = u10;
        this.f42627h = y0Var2;
        ArrayList arrayList = new ArrayList();
        this.f42630k = arrayList;
        ArrayList arrayList2 = arrayList;
        this.f42631l = System.currentTimeMillis();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C17542s.i(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f42633n = S.a(C16340x0.c(newSingleThreadExecutor));
        this.f42634o = true;
        this.f42635p = new V8.a(this);
        this.f42636q = 2;
        try {
            cVar2.n(this);
            c(new H0(y0Var2));
            c(new X4(new C6835g5(C8.a.f33757b.a()), cVar2));
            c(new A3(p32, new V3(hVar, application2, "custom")));
            c(new R6(fVar, new C6820e6(application2, hVar)));
            c(new C6972y(u10, new V3(hVar, application2, "life_cycle")));
            c(new T3(p33, new V3(hVar, application2, "api_usage"), cVar2));
            C6920r3 r3Var = new C6920r3(aVar, gVar2, bVar2);
            C17542s.j(r3Var, "subscriber");
            ArrayList arrayList3 = arrayList2;
            if (!arrayList3.contains(r3Var)) {
                arrayList3.add(r3Var);
            }
        } catch (Throwable th2) {
            H1.a(this.f42628i, "Failed to initialize Telemetry service", th2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0145 A[LOOP:5: B:43:0x013f->B:45:0x0145, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x017d A[LOOP:6: B:47:0x0177->B:49:0x017d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0195 A[LOOP:7: B:51:0x018f->B:53:0x0195, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(a9.C6858j4 r13, java.lang.String r14, dI.C17164e r15) {
        /*
            r13.getClass()
            boolean r0 = r15 instanceof a9.A4
            if (r0 == 0) goto L_0x0016
            r0 = r15
            a9.A4 r0 = (a9.A4) r0
            int r1 = r0.f41917h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f41917h = r1
            goto L_0x001b
        L_0x0016:
            a9.A4 r0 = new a9.A4
            r0.<init>(r13, r15)
        L_0x001b:
            java.lang.Object r15 = r0.f41915f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f41917h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.String r13 = r0.f41913d
            a9.j4 r14 = r0.f41912c
            XH.y.b(r15)
            r8 = r13
            goto L_0x0087
        L_0x0034:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003c:
            java.util.Iterator r13 = r0.f41914e
            java.lang.String r14 = r0.f41913d
            a9.j4 r2 = r0.f41912c
            XH.y.b(r15)
            r15 = r14
            r14 = r2
            goto L_0x0055
        L_0x0048:
            XH.y.b(r15)
            java.util.ArrayList r15 = r13.f42629j
            java.util.Iterator r15 = r15.iterator()
            r12 = r14
            r14 = r13
            r13 = r15
            r15 = r12
        L_0x0055:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0071
            java.lang.Object r2 = r13.next()
            a9.j3 r2 = (a9.C6857j3) r2
            r0.f41912c = r14
            r0.f41913d = r15
            r0.f41914e = r13
            r0.f41917h = r4
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L_0x0055
            goto L_0x01a1
        L_0x0071:
            a9.B5 r13 = r14.f42620a
            java.util.ArrayList r2 = r14.f42629j
            r0.f41912c = r14
            r0.f41913d = r15
            r4 = 0
            r0.f41914e = r4
            r0.f41917h = r3
            java.lang.Object r13 = r13.a(r2, r0)
            if (r13 != r1) goto L_0x0086
            goto L_0x01a1
        L_0x0086:
            r8 = r15
        L_0x0087:
            java.lang.Long r13 = r14.f42632m
            if (r13 == 0) goto L_0x0090
            long r0 = r13.longValue()
            goto L_0x0094
        L_0x0090:
            long r0 = java.lang.System.currentTimeMillis()
        L_0x0094:
            a9.j5 r13 = new a9.j5
            a9.B5 r15 = r14.f42620a
            r15.getClass()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.util.ArrayList r4 = r15.f41932a
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r7 = YH.C16877v.y(r4, r6)
            r5.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x00b6:
            boolean r7 = r4.hasNext()
            java.lang.String r9 = "event.keys()"
            if (r7 == 0) goto L_0x00e5
            java.lang.Object r7 = r4.next()
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.util.Iterator r10 = r7.keys()
            kotlin.jvm.internal.C17542s.i(r10, r9)
        L_0x00cb:
            boolean r9 = r10.hasNext()
            if (r9 == 0) goto L_0x00df
            java.lang.Object r9 = r10.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r11 = r7.get(r9)
            r2.put(r9, r11)
            goto L_0x00cb
        L_0x00df:
            XH.N r7 = XH.C16807N.f139792a
            r5.add(r7)
            goto L_0x00b6
        L_0x00e5:
            XH.N r4 = XH.C16807N.f139792a
            java.lang.String r4 = "properties"
            r3.put(r4, r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.util.ArrayList r4 = r15.f41933b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = YH.C16877v.y(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x0100:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x012d
            java.lang.Object r6 = r4.next()
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.util.Iterator r7 = r6.keys()
            kotlin.jvm.internal.C17542s.i(r7, r9)
        L_0x0113:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0127
            java.lang.Object r10 = r7.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r6.get(r10)
            r2.put(r10, r11)
            goto L_0x0113
        L_0x0127:
            XH.N r6 = XH.C16807N.f139792a
            r5.add(r6)
            goto L_0x0100
        L_0x012d:
            XH.N r4 = XH.C16807N.f139792a
            java.lang.String r4 = "performance"
            r3.put(r4, r2)
            org.json.JSONObject r2 = r15.f41934c
            java.util.Iterator r2 = r2.keys()
            java.lang.String r4 = "networkEvent.keys()"
            kotlin.jvm.internal.C17542s.i(r2, r4)
        L_0x013f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0155
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            org.json.JSONObject r5 = r15.f41934c
            java.lang.Object r5 = r5.get(r4)
            r3.put(r4, r5)
            goto L_0x013f
        L_0x0155:
            org.json.JSONObject r2 = r15.f41935d
            java.lang.String r4 = "time"
            r3.put(r4, r2)
            org.json.JSONObject r2 = r15.f41936e
            java.lang.String r4 = "lifecycle"
            r3.put(r4, r2)
            org.json.JSONObject r15 = r15.f41937f
            java.lang.String r2 = "public"
            r3.put(r2, r15)
            long r4 = r14.f42631l
            r2 = r13
            r6 = r0
            r2.<init>(r3, r4, r6, r8)
            java.util.ArrayList r15 = r14.f42630k
            java.util.Iterator r15 = r15.iterator()
        L_0x0177:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0187
            java.lang.Object r2 = r15.next()
            a9.Z5 r2 = (a9.Z5) r2
            r2.b(r13)
            goto L_0x0177
        L_0x0187:
            r14.f42631l = r0
            java.util.ArrayList r13 = r14.f42629j
            java.util.Iterator r13 = r13.iterator()
        L_0x018f:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x019f
            java.lang.Object r14 = r13.next()
            a9.j3 r14 = (a9.C6857j3) r14
            r14.c()
            goto L_0x018f
        L_0x019f:
            XH.N r1 = XH.C16807N.f139792a
        L_0x01a1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6858j4.a(a9.j4, java.lang.String, dI.e):java.lang.Object");
    }

    public final void b() {
        try {
            if (((C6816e2) this.f42622c.f42249d.getValue()).b()) {
                e();
                return;
            }
            this.f42632m = Long.valueOf(System.currentTimeMillis());
            this.f42636q = 2;
            B5 b52 = this.f42620a;
            b52.f41932a.clear();
            b52.f41933b.clear();
            b52.f41934c = new JSONObject();
            b52.f41935d = new JSONObject();
            b52.f41936e = new JSONObject();
            b52.f41937f = new JSONObject();
            F0 unused = C16314k.d(this.f42633n, (C17168i) null, (T) null, new H4(this, (C17164e<? super H4>) null), 3, (Object) null);
            this.f42628i.f("Telemetry service stopped");
        } catch (Throwable th2) {
            H1.a(this.f42628i, "Failed to start Telemetry service", th2);
        }
    }

    public final void c(C6857j3 j3Var) {
        C17542s.j(j3Var, "collectorAgent");
        if (!this.f42629j.contains(j3Var)) {
            this.f42629j.add(j3Var);
        }
    }

    public final <T> void d(String str, T t10) {
        C17542s.j(str, "key");
        C17542s.j(t10, "value");
        this.f42623d.b(new CustomEvent(str, t10.toString()));
    }

    public final void e() {
        if (this.f42636q == 2) {
            this.f42636q = 1;
            this.f42631l = System.currentTimeMillis();
            this.f42632m = null;
            this.f42628i.f("Telemetry service started");
            Iterator it = this.f42629j.iterator();
            while (it.hasNext()) {
                ((C6857j3) it.next()).start();
            }
            this.f42621b.getLifecycle().c(this.f42635p);
            return;
        }
        ArrayList arrayList = this.f42629j;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((C6857j3) next).a() == 2) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ((C6857j3) it3.next()).start();
        }
    }

    public final void o(E8.b bVar) {
        C17542s.j(bVar, "key");
        int i10 = a.f42637a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            b();
        }
    }
}
