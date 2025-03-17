package com.sugarcube.app.base.capture;

import KF.C13164r;
import android.content.Context;
import androidx.work.C7036e;
import androidx.work.C7041j;
import androidx.work.C7054x;
import androidx.work.C7056z;
import androidx.work.CoroutineWorker;
import androidx.work.I;
import androidx.work.S;
import androidx.work.WorkerParameters;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import dI.C17164e;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001\u0011B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/sugarcube/app/base/capture/SceneSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "firebaseInteractions", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "LKF/r;", "uploadVersion", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;Lcom/sugarcube/app/base/data/SceneRepository;LKF/r;)V", "Landroidx/work/x$a;", "doWork", "(LdI/e;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Landroidx/work/WorkerParameters;", "getParams", "()Landroidx/work/WorkerParameters;", "c", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "getFirebaseInteractions", "()Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "d", "Lcom/sugarcube/app/base/data/SceneRepository;", "getSceneRepository", "()Lcom/sugarcube/app/base/data/SceneRepository;", "e", "LKF/r;", "getUploadVersion", "()LKF/r;", "f", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SceneSyncWorker extends CoroutineWorker {

    /* renamed from: f  reason: collision with root package name */
    public static final a f122764f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f122765g = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f122766a;

    /* renamed from: b  reason: collision with root package name */
    private final WorkerParameters f122767b;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseInteractions f122768c;

    /* renamed from: d  reason: collision with root package name */
    private final SceneRepository f122769d;

    /* renamed from: e  reason: collision with root package name */
    private final C13164r f122770e;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/app/base/capture/SceneSyncWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/UUID;", "b", "(Landroid/content/Context;)Ljava/util/UUID;", "LXH/N;", "a", "(Landroid/content/Context;)V", "", "WORKER_TAG", "Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context) {
            C17542s.j(context, "context");
            S.f45094a.a(context).a("Sugarcube.UploadWorker");
        }

        public final UUID b(Context context) {
            C17542s.j(context, "context");
            I i10 = (I) ((I.a) ((I.a) new I.a((Class<? extends C7054x>) SceneSyncWorker.class, 900000, TimeUnit.MILLISECONDS).j(new C7036e.a().b(C7056z.CONNECTED).a())).a("Sugarcube.SyncWorker")).b();
            S.f45094a.a(context).f("Sugarcube.SyncWorker", C7041j.REPLACE, i10);
            return i10.a();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.app.base.capture.SceneSyncWorker", f = "SceneSyncWorker.kt", l = {40}, m = "doWork")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f122771c;

        /* renamed from: d  reason: collision with root package name */
        Object f122772d;

        /* renamed from: e  reason: collision with root package name */
        Object f122773e;

        /* renamed from: f  reason: collision with root package name */
        Object f122774f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f122775g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ SceneSyncWorker f122776h;

        /* renamed from: i  reason: collision with root package name */
        int f122777i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SceneSyncWorker sceneSyncWorker, C17164e<? super b> eVar) {
            super(eVar);
            this.f122776h = sceneSyncWorker;
        }

        public final Object invokeSuspend(Object obj) {
            this.f122775g = obj;
            this.f122777i |= Integer.MIN_VALUE;
            return this.f122776h.doWork(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SceneSyncWorker(Context context, WorkerParameters workerParameters, FirebaseInteractions firebaseInteractions, SceneRepository sceneRepository, C13164r rVar) {
        super(context, workerParameters);
        C17542s.j(context, "context");
        C17542s.j(workerParameters, "params");
        C17542s.j(firebaseInteractions, "firebaseInteractions");
        C17542s.j(sceneRepository, "sceneRepository");
        C17542s.j(rVar, "uploadVersion");
        this.f122766a = context;
        this.f122767b = workerParameters;
        this.f122768c = firebaseInteractions;
        this.f122769d = sceneRepository;
        this.f122770e = rVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c2 A[Catch:{ CancellationException -> 0x0040, all -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doWork(dI.C17164e<? super androidx.work.C7054x.a> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.sugarcube.app.base.capture.SceneSyncWorker.b
            if (r0 == 0) goto L_0x0014
            r0 = r12
            com.sugarcube.app.base.capture.SceneSyncWorker$b r0 = (com.sugarcube.app.base.capture.SceneSyncWorker.b) r0
            int r1 = r0.f122777i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f122777i = r1
        L_0x0012:
            r5 = r0
            goto L_0x001a
        L_0x0014:
            com.sugarcube.app.base.capture.SceneSyncWorker$b r0 = new com.sugarcube.app.base.capture.SceneSyncWorker$b
            r0.<init>(r11, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r5.f122775g
            java.lang.Object r8 = eI.C17187b.f()
            int r1 = r5.f122777i
            java.lang.String r9 = "sync scenes cancelled"
            r2 = 1
            if (r1 == 0) goto L_0x004b
            if (r1 != r2) goto L_0x0043
            java.lang.Object r12 = r5.f122774f
            androidx.work.x$a r12 = (androidx.work.C7054x.a) r12
            java.lang.Object r12 = r5.f122773e
            androidx.work.x$a r12 = (androidx.work.C7054x.a) r12
            java.lang.Object r1 = r5.f122772d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r5.f122771c
            com.sugarcube.app.base.capture.SceneSyncWorker r1 = (com.sugarcube.app.base.capture.SceneSyncWorker) r1
            XH.y.b(r0)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            goto L_0x009e
        L_0x003d:
            r0 = move-exception
            goto L_0x00d6
        L_0x0040:
            r12 = move-exception
            goto L_0x00ff
        L_0x0043:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x004b:
            XH.y.b(r0)
            androidx.work.x$a r0 = androidx.work.C7054x.a.b()
            java.lang.String r1 = "retry(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            YE.b r1 = YE.C13868b.f118106a
            int r3 = r11.getRunAttemptCount()
            androidx.work.WorkerParameters r4 = r11.f122767b
            java.util.UUID r4 = r4.c()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "sync scenes ("
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = ") "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            YE.e r4 = YE.e.Capture
            r1.b(r3, r4)
            com.sugarcube.app.base.data.SceneRepository r1 = r11.f122769d     // Catch:{ CancellationException -> 0x00d3, all -> 0x00cd }
            KF.r r4 = r11.f122770e     // Catch:{ CancellationException -> 0x00d3, all -> 0x00cd }
            r5.f122771c = r11     // Catch:{ CancellationException -> 0x00d3, all -> 0x00cd }
            r5.f122772d = r12     // Catch:{ CancellationException -> 0x00d3, all -> 0x00cd }
            r5.f122773e = r0     // Catch:{ CancellationException -> 0x00d3, all -> 0x00cd }
            r5.f122774f = r0     // Catch:{ CancellationException -> 0x00d3, all -> 0x00cd }
            r5.f122777i = r2     // Catch:{ CancellationException -> 0x00d3, all -> 0x00cd }
            r2 = 0
            r3 = 0
            r6 = 3
            r7 = 0
            java.lang.Object r12 = com.sugarcube.app.base.data.SceneRepository.m25startRefreshhhJSO8g$default(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ CancellationException -> 0x00d3, all -> 0x00cd }
            if (r12 != r8) goto L_0x009a
            return r8
        L_0x009a:
            r1 = r11
            r10 = r0
            r0 = r12
            r12 = r10
        L_0x009e:
            com.sugarcube.app.base.data.SceneRepository$SceneRepoStatus r0 = (com.sugarcube.app.base.data.SceneRepository.SceneRepoStatus) r0     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            boolean r0 = r0.hasPendingWork()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            YE.b r2 = YE.C13868b.f118106a     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r3.<init>()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.String r4 = "sync scenes - hasPending="
            r3.append(r4)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r3.append(r0)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.String r3 = r3.toString()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            YE.e r4 = YE.e.Capture     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r2.b(r3, r4)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            androidx.work.x$a r12 = androidx.work.C7054x.a.c()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            if (r0 != 0) goto L_0x00fe
            com.sugarcube.app.base.capture.SceneSyncWorker$a r0 = f122764f     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            android.content.Context r3 = r1.f122766a     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r0.a(r3)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r2.b(r9, r4)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            goto L_0x00fe
        L_0x00cd:
            r12 = move-exception
            r1 = r11
            r10 = r0
            r0 = r12
            r12 = r10
            goto L_0x00d6
        L_0x00d3:
            r12 = move-exception
            r1 = r11
            goto L_0x00ff
        L_0x00d6:
            YE.b r2 = YE.C13868b.f118106a
            java.lang.String r3 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "sync scenes - exception "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            YE.e r4 = YE.e.Capture
            r2.b(r3, r4)
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r2 = r1.f122768c
            java.lang.String r3 = "sync scenes"
            r2.log(r3)
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r1 = r1.f122768c
            r1.recordException(r0)
        L_0x00fe:
            return r12
        L_0x00ff:
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r0 = r1.f122768c
            r0.log(r9)
            YE.b r0 = YE.C13868b.f118106a
            java.lang.String r1 = r12.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "sync scenes - cancelled "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            YE.e r2 = YE.e.Capture
            r0.b(r1, r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.capture.SceneSyncWorker.doWork(dI.e):java.lang.Object");
    }
}
