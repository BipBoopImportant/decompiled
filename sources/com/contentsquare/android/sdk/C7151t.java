package com.contentsquare.android.sdk;

import A8.b;
import E8.c;
import G8.v;
import QJ.F0;
import QJ.T;
import XH.C16807N;
import a9.C6789b;
import a9.K4;
import a9.M6;
import a9.V6;
import a9.W;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import com.contentsquare.android.sdk.S0;
import com.optimizely.ab.config.FeatureVariable;
import dI.C17164e;
import dI.C17168i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.t  reason: case insensitive filesystem */
public final class C7151t implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final V6 f47620a;

    /* renamed from: b  reason: collision with root package name */
    public final C7133k f47621b;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f47622c;

    /* renamed from: d  reason: collision with root package name */
    public final b f47623d;

    /* renamed from: e  reason: collision with root package name */
    public final c f47624e;

    /* renamed from: f  reason: collision with root package name */
    public final M6 f47625f;

    /* renamed from: g  reason: collision with root package name */
    public final C6789b f47626g;

    /* renamed from: h  reason: collision with root package name */
    public final D8.c f47627h = new D8.c("EventsProcessor");

    /* renamed from: i  reason: collision with root package name */
    public int f47628i = 100;

    /* renamed from: j  reason: collision with root package name */
    public S0 f47629j;

    /* renamed from: com.contentsquare.android.sdk.t$a */
    public static final class a extends C17544u implements C17642l<JSONObject, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ C7151t f47630c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C7151t tVar) {
            super(1);
            this.f47630c = tVar;
        }

        public final Object invoke(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C17542s.j(jSONObject, FeatureVariable.JSON_TYPE);
            this.f47630c.c(jSONObject);
            return C16807N.f139792a;
        }
    }

    public C7151t(V6 v62, C7133k kVar, ExecutorService executorService, O0 o02, b bVar, c cVar, M6 m62, C6789b bVar2) {
        C17542s.j(v62, "eventStorage");
        C17542s.j(kVar, "eventsBuildersFactory");
        C17542s.j(executorService, "threadExecutor");
        C17542s.j(o02, "analyticsPipeline");
        C17542s.j(bVar, "configuration");
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(m62, "eventSendingManager");
        C17542s.j(bVar2, "eventUrlGenerator");
        this.f47620a = v62;
        this.f47621b = kVar;
        this.f47622c = executorService;
        this.f47623d = bVar;
        this.f47624e = cVar;
        this.f47625f = m62;
        this.f47626g = bVar2;
        a aVar = new a(this);
        F0 f02 = o02.f47078g;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        o02.f47078g = null;
        o02.f47078g = C16314k.d(o02.f47074c, (C17168i) null, (T) null, new K4(o02, aVar, (C17164e) null), 3, (Object) null);
        cVar.n(this);
        d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        if (r8.getInt("ea") == 24) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e A[Catch:{ JSONException -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e A[Catch:{ JSONException -> 0x003e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(com.contentsquare.android.sdk.C7151t r7, org.json.JSONObject r8) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "$event"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            D8.c r0 = r7.f47627h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "processing event: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.f(r1)
            a9.V6 r0 = r7.f47620a
            monitor-enter(r0)
            java.lang.String r1 = "event"
            kotlin.jvm.internal.C17542s.j(r8, r1)     // Catch:{ all -> 0x003b }
            r0.h()     // Catch:{ all -> 0x003b }
            java.lang.String r1 = "sn"
            boolean r1 = r8.has(r1)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0052
            java.lang.String r1 = "sn"
            int r1 = r8.getInt(r1)     // Catch:{ JSONException -> 0x003e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x003e }
            goto L_0x0053
        L_0x003b:
            r7 = move-exception
            goto L_0x00c4
        L_0x003e:
            r1 = move-exception
            D8.c r2 = r0.f42358d     // Catch:{ all -> 0x003b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            java.lang.String r4 = "Error getting the session number for the event = "
            r3.<init>(r4)     // Catch:{ all -> 0x003b }
            r3.append(r8)     // Catch:{ all -> 0x003b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x003b }
            a9.H1.a(r2, r3, r1)     // Catch:{ all -> 0x003b }
        L_0x0052:
            r1 = 0
        L_0x0053:
            r2 = 1
            if (r1 == 0) goto L_0x006e
            int r3 = r0.f42362h     // Catch:{ all -> 0x003b }
            int r4 = r1.intValue()     // Catch:{ all -> 0x003b }
            if (r4 == r3) goto L_0x006e
            int r3 = r1.intValue()     // Catch:{ all -> 0x003b }
            int r1 = r1.intValue()     // Catch:{ all -> 0x003b }
            int r1 = r0.a(r1)     // Catch:{ all -> 0x003b }
            r0.e(r8, r3, r1)     // Catch:{ all -> 0x003b }
            goto L_0x007a
        L_0x006e:
            int r1 = r0.f42362h     // Catch:{ all -> 0x003b }
            int r3 = r0.f42361g     // Catch:{ all -> 0x003b }
            r0.e(r8, r1, r3)     // Catch:{ all -> 0x003b }
            int r1 = r0.f42363i     // Catch:{ all -> 0x003b }
            int r1 = r1 + r2
            r0.f42363i = r1     // Catch:{ all -> 0x003b }
        L_0x007a:
            monitor-exit(r0)
            E8.c r0 = r7.f47624e
            E8.b r1 = E8.b.LOCAL_LOG_VISUALIZER_MODE
            r3 = 0
            boolean r0 = r0.b(r1, r3)
            a9.V6 r1 = r7.f47620a
            int r1 = r1.f42363i
            int r4 = r7.f47628i
            if (r1 < r4) goto L_0x008e
            r1 = r2
            goto L_0x008f
        L_0x008e:
            r1 = r3
        L_0x008f:
            java.lang.String r4 = "ea"
            boolean r4 = r8.has(r4)     // Catch:{ JSONException -> 0x00a2 }
            if (r4 == 0) goto L_0x00a4
            java.lang.String r4 = "ea"
            int r8 = r8.getInt(r4)     // Catch:{ JSONException -> 0x00a2 }
            r4 = 24
            if (r8 != r4) goto L_0x00a4
            goto L_0x00ba
        L_0x00a2:
            r2 = move-exception
            goto L_0x00a6
        L_0x00a4:
            r2 = r3
            goto L_0x00ba
        L_0x00a6:
            D8.c r4 = r7.f47627h
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Error getting event action for the event "
            r5.<init>(r6)
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            a9.H1.a(r4, r8, r2)
            goto L_0x00a4
        L_0x00ba:
            if (r0 != 0) goto L_0x00c0
            if (r1 != 0) goto L_0x00c0
            if (r2 == 0) goto L_0x00c3
        L_0x00c0:
            r7.a()
        L_0x00c3:
            return
        L_0x00c4:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7151t.b(com.contentsquare.android.sdk.t, org.json.JSONObject):void");
    }

    public final void a() {
        S0 s02 = this.f47629j;
        if (s02 != null) {
            this.f47620a.c();
            C17542s.i(s02.f47142a.submit(new S0.a(s02)), "threadExecutor.submit(DispatchBucketsCallable())");
        }
    }

    public final void c(JSONObject jSONObject) {
        this.f47622c.submit(new W(this, jSONObject));
    }

    public final void d() {
        JsonConfig.ProjectConfiguration b10 = this.f47623d.b();
        if (b10 != null) {
            D8.c cVar = this.f47627h;
            cVar.f("Updating the configuration in EventsProcessor with collector endpoint: " + b10.j() + " and maxBucketSize: " + b10.d());
            String a10 = v.a(b10.j());
            S0 s02 = this.f47629j;
            if (s02 != null) {
                C17542s.j(a10, "collectorsEndpoint");
                s02.f47145d = a10;
            }
            if (this.f47629j == null) {
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                C17542s.i(newSingleThreadExecutor, "newSingleThreadExecutor()");
                this.f47629j = new S0(newSingleThreadExecutor, this.f47620a, new C8.a(), a10, this.f47621b, this.f47624e, this.f47625f, this.f47626g);
            }
            this.f47628i = b10.d();
        }
    }

    public final void o(E8.b bVar) {
        C17542s.j(bVar, "key");
        if (bVar == E8.b.RAW_CONFIGURATION_AS_JSON) {
            d();
        }
    }
}
