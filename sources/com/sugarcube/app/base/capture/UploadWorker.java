package com.sugarcube.app.base.capture;

import KF.C13147a;
import KF.C13164r;
import LF.C13187c;
import OE.C13309a;
import OE.C13313e;
import OE.q;
import VE.C13760b;
import YE.C13867a;
import YE.C13868b;
import YE.e;
import android.content.Context;
import androidx.work.B;
import androidx.work.C7036e;
import androidx.work.C7037f;
import androidx.work.C7042k;
import androidx.work.C7056z;
import androidx.work.CoroutineWorker;
import androidx.work.S;
import androidx.work.WorkerParameters;
import com.sugarcube.app.base.data.AnalyticsManager;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.app.base.network.NetworkClient;
import com.sugarcube.core.network.models.SceneResponse;
import dI.C17164e;
import jI.C17423j;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\b\u0005*\u0002\u0001\b\u0007\u0018\u0000 \u00012\u00020\u0001:\u0001\u001dB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0014\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH@¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010K\u001a\u00020E8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0018\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010R\u001a\u00020L8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000b\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Y\u001a\u00020S8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bT\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010h\u001a\u00020b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\bc\u0010e\"\u0004\bf\u0010gR\"\u0010o\u001a\u00020i8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b]\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010v\u001a\u00020p8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b0\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010|\u001a\u00020w8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bN\u0010x\u001a\u0004\b[\u0010y\"\u0004\bz\u0010{R&\u0010\u0001\u001a\u00020}8\u0006@\u0006X.¢\u0006\u0015\n\u0004\b@\u0010~\u001a\u0005\b\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bk\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b8\u0010\u0001R\u001a\u0010\u0001\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b(\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\br\u0010\u0001R\u001a\u0010\u0001\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010\u0001R\u0017\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/sugarcube/app/base/capture/UploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ljava/util/UUID;", "uuid", "", "h", "(Ljava/util/UUID;)Z", "Lcom/sugarcube/core/network/models/SceneResponse;", "sceneResponse", "isSuccess", "", "message", "errorDetail", "LXH/N;", "v", "(Lcom/sugarcube/core/network/models/SceneResponse;ZLjava/lang/String;Ljava/lang/String;)V", "u", "()V", "g", "(Ljava/lang/String;)V", "Landroidx/work/x$a;", "doWork", "(LdI/e;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Landroidx/work/WorkerParameters;", "getParams", "()Landroidx/work/WorkerParameters;", "LOE/q;", "c", "LOE/q;", "r", "()LOE/q;", "setSugarcube", "(LOE/q;)V", "sugarcube", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "d", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "m", "()Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "setFirebaseInteractions", "(Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;)V", "firebaseInteractions", "Lcom/sugarcube/app/base/data/SceneRepository;", "e", "Lcom/sugarcube/app/base/data/SceneRepository;", "q", "()Lcom/sugarcube/app/base/data/SceneRepository;", "setSceneRepository", "(Lcom/sugarcube/app/base/data/SceneRepository;)V", "sceneRepository", "Lcom/sugarcube/app/base/network/NetworkClient;", "f", "Lcom/sugarcube/app/base/network/NetworkClient;", "o", "()Lcom/sugarcube/app/base/network/NetworkClient;", "setNetworkClient", "(Lcom/sugarcube/app/base/network/NetworkClient;)V", "networkClient", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "getAnalyticsManager", "()Lcom/sugarcube/app/base/data/AnalyticsManager;", "setAnalyticsManager", "(Lcom/sugarcube/app/base/data/AnalyticsManager;)V", "analyticsManager", "LOE/e;", "LOE/e;", "n", "()LOE/e;", "setInstallationConfig", "(LOE/e;)V", "installationConfig", "LOE/a;", "i", "LOE/a;", "()LOE/a;", "setAppEnvironment", "(LOE/a;)V", "appEnvironment", "LYE/a;", "j", "LYE/a;", "l", "()LYE/a;", "setEventLog", "(LYE/a;)V", "eventLog", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "k", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "()Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "setConfigRepository", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;)V", "configRepository", "LVE/b;", "LVE/b;", "p", "()LVE/b;", "setNetworkConfig", "(LVE/b;)V", "networkConfig", "LKF/r;", "LKF/r;", "t", "()LKF/r;", "setUploadVersion", "(LKF/r;)V", "uploadVersion", "LKF/a;", "LKF/a;", "()LKF/a;", "setCaptureFiles", "(LKF/a;)V", "captureFiles", "LLF/c;", "LLF/c;", "s", "()LLF/c;", "setUploadLogger", "(LLF/c;)V", "uploadLogger", "Ljava/lang/String;", "uuidStr", "Ljava/util/UUID;", "sceneUuid", "uploadUUID", "captureType", "captureStrategy", "Ljava/lang/Boolean;", "isResumable", "com/sugarcube/app/base/capture/UploadWorker$c", "Lcom/sugarcube/app/base/capture/UploadWorker$c;", "uploadListener", "w", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadWorker extends CoroutineWorker {

    /* renamed from: w  reason: collision with root package name */
    public static final a f122778w = new a((DefaultConstructorMarker) null);

    /* renamed from: x  reason: collision with root package name */
    public static final int f122779x = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f122780a;

    /* renamed from: b  reason: collision with root package name */
    private final WorkerParameters f122781b;

    /* renamed from: c  reason: collision with root package name */
    public q f122782c;

    /* renamed from: d  reason: collision with root package name */
    public FirebaseInteractions f122783d;

    /* renamed from: e  reason: collision with root package name */
    public SceneRepository f122784e;

    /* renamed from: f  reason: collision with root package name */
    public NetworkClient f122785f;

    /* renamed from: g  reason: collision with root package name */
    public AnalyticsManager f122786g;

    /* renamed from: h  reason: collision with root package name */
    public C13313e f122787h;

    /* renamed from: i  reason: collision with root package name */
    public C13309a f122788i;

    /* renamed from: j  reason: collision with root package name */
    public C13867a f122789j;

    /* renamed from: k  reason: collision with root package name */
    public ConfigRepository f122790k;

    /* renamed from: l  reason: collision with root package name */
    public C13760b f122791l;

    /* renamed from: m  reason: collision with root package name */
    public C13164r f122792m;

    /* renamed from: n  reason: collision with root package name */
    public C13147a f122793n;

    /* renamed from: o  reason: collision with root package name */
    public C13187c f122794o;

    /* renamed from: p  reason: collision with root package name */
    private String f122795p = "00000000-0000-0000-0000-000000000000";
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public UUID f122796q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public UUID f122797r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public String f122798s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public String f122799t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public Boolean f122800u;

    /* renamed from: v  reason: collision with root package name */
    private final c f122801v;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00168\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/sugarcube/app/base/capture/UploadWorker$a;", "", "<init>", "()V", "Ljava/util/UUID;", "uuid", "Landroid/content/Context;", "context", "c", "(Ljava/util/UUID;Landroid/content/Context;)Ljava/util/UUID;", "Landroidx/work/f;", "b", "(Ljava/util/UUID;)Landroidx/work/f;", "LXH/N;", "a", "(Landroid/content/Context;)V", "", "WORKER_TAG", "Ljava/lang/String;", "SCENE_UUID", "SCENE_ID", "PROGRESS", "", "MAX_UPLOAD_ATTEMPTS", "I", "MIN_UPLOAD_ATTEMPTS", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context) {
            C17542s.j(context, "context");
            S.f45094a.a(context).a("Sugarcube.UploadWorker");
        }

        public final C7037f b(UUID uuid) {
            C17542s.j(uuid, "uuid");
            C7037f.a aVar = new C7037f.a();
            aVar.i("sceneUuid", uuid.toString());
            return aVar.a();
        }

        public final UUID c(UUID uuid, Context context) {
            C17542s.j(uuid, "uuid");
            C17542s.j(context, "context");
            C7037f b10 = b(uuid);
            B b11 = (B) ((B.a) ((B.a) ((B.a) new B.a(UploadWorker.class).n(b10)).j(new C7036e.a().b(C7056z.CONNECTED).a())).a("Sugarcube.UploadWorker")).b();
            S a10 = S.f45094a.a(context);
            String uuid2 = uuid.toString();
            C17542s.i(uuid2, "toString(...)");
            a10.g(uuid2, C7042k.KEEP, b11);
            return b11.a();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.app.base.capture.UploadWorker", f = "UploadWorker.kt", l = {162, 237}, m = "doWork")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f122802c;

        /* renamed from: d  reason: collision with root package name */
        Object f122803d;

        /* renamed from: e  reason: collision with root package name */
        Object f122804e;

        /* renamed from: f  reason: collision with root package name */
        Object f122805f;

        /* renamed from: g  reason: collision with root package name */
        Object f122806g;

        /* renamed from: h  reason: collision with root package name */
        Object f122807h;

        /* renamed from: i  reason: collision with root package name */
        int f122808i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f122809j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ UploadWorker f122810k;

        /* renamed from: l  reason: collision with root package name */
        int f122811l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UploadWorker uploadWorker, C17164e<? super b> eVar) {
            super(eVar);
            this.f122810k = uploadWorker;
        }

        public final Object invokeSuspend(Object obj) {
            this.f122809j = obj;
            this.f122811l |= Integer.MIN_VALUE;
            return this.f122810k.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J1\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0006R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0006¨\u0006\u001c"}, d2 = {"com/sugarcube/app/base/capture/UploadWorker$c", "Lcom/sugarcube/app/base/capture/UploadProgressListener;", "", "total", "LXH/N;", "totalBytes", "(J)V", "newBytes", "writeBytes", "Ljava/util/UUID;", "uuid", "", "type", "strategy", "", "resumable", "uploadCreated", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "a", "J", "getTotalSize", "()J", "setTotalSize", "totalSize", "b", "getBytesWritten", "setBytesWritten", "bytesWritten", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements UploadProgressListener {

        /* renamed from: a  reason: collision with root package name */
        private long f122812a;

        /* renamed from: b  reason: collision with root package name */
        private long f122813b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UploadWorker f122814c;

        c(UploadWorker uploadWorker) {
            this.f122814c = uploadWorker;
        }

        public void totalBytes(long j10) {
            this.f122812a = j10;
        }

        public void uploadCreated(UUID uuid, String str, String str2, Boolean bool) {
            C17542s.j(uuid, "uuid");
            C17542s.j(str, "type");
            C17542s.j(str2, "strategy");
            this.f122814c.f122797r = uuid;
            this.f122814c.f122798s = str;
            this.f122814c.f122799t = str2;
            this.f122814c.q().setUploadId(this.f122814c.f122796q, uuid);
            this.f122814c.f122800u = bool;
        }

        public void writeBytes(long j10) {
            long j11 = this.f122813b + j10;
            this.f122813b = j11;
            int i10 = 100;
            int i11 = (int) ((j11 * ((long) 100)) / this.f122812a);
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 <= 100) {
                i10 = i11;
            }
            this.f122814c.setProgressAsync(new C7037f.a().g("progress", i10).a());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C17542s.j(context, "context");
        C17542s.j(workerParameters, "params");
        this.f122780a = context;
        this.f122781b = workerParameters;
        UUID fromString = UUID.fromString("00000000-0000-0000-0000-000000000000");
        C17542s.i(fromString, "fromString(...)");
        this.f122796q = fromString;
        this.f122798s = "";
        this.f122799t = "";
        this.f122801v = new c(this);
    }

    private final void g(String str) {
        C13868b.f118106a.b(str, e.Upload);
    }

    private final boolean h(UUID uuid) {
        return C17423j.r(j().e(uuid));
    }

    private final void u() {
        r().b().captureWarningUploadDelay(this.f122796q, "", (UUID) null, 0, this.f122797r, a.Companion.a(this.f122798s).b(), this.f122799t);
    }

    private final void v(SceneResponse sceneResponse, boolean z10, String str, String str2) {
        String str3;
        UUID uuid;
        Analytics b10 = r().b();
        UUID uuid2 = this.f122796q;
        if (sceneResponse == null || (str3 = sceneResponse.getName()) == null) {
            str3 = "";
        }
        String b11 = a.Companion.a(this.f122798s).b();
        String str4 = this.f122799t;
        UUID sceneUuid = sceneResponse != null ? sceneResponse.getSceneUuid() : null;
        int sceneId = sceneResponse != null ? sceneResponse.getSceneId() : 0;
        if (sceneResponse == null || (uuid = sceneResponse.getUpload()) == null) {
            uuid = this.f122797r;
        }
        b10.captureUploadEnd(uuid2, str3, b11, str4, sceneUuid, sceneId, uuid, z10, str == null ? "" : str, str2 == null ? "" : str2, this.f122800u);
    }

    static /* synthetic */ void w(UploadWorker uploadWorker, SceneResponse sceneResponse, boolean z10, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        uploadWorker.v(sceneResponse, z10, str, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: com.sugarcube.app.base.network.models.UploadFileException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: com.sugarcube.core.network.models.SceneResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: com.sugarcube.core.network.api.NetworkAPIs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: com.sugarcube.core.network.api.NetworkAPIs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: com.sugarcube.app.base.capture.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: com.sugarcube.core.network.models.SceneResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: com.sugarcube.core.network.api.NetworkAPIs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: com.sugarcube.app.base.capture.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: com.sugarcube.core.network.api.NetworkAPIs} */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0199 A[Catch:{ all -> 0x023a }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x023f A[Catch:{ all -> 0x023a }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doWork(dI.C17164e<? super androidx.work.C7054x.a> r28) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            boolean r0 = r2 instanceof com.sugarcube.app.base.capture.UploadWorker.b
            if (r0 == 0) goto L_0x0018
            r0 = r2
            com.sugarcube.app.base.capture.UploadWorker$b r0 = (com.sugarcube.app.base.capture.UploadWorker.b) r0
            int r3 = r0.f122811l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r0.f122811l = r3
        L_0x0016:
            r3 = r0
            goto L_0x001e
        L_0x0018:
            com.sugarcube.app.base.capture.UploadWorker$b r0 = new com.sugarcube.app.base.capture.UploadWorker$b
            r0.<init>(r1, r2)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r3.f122809j
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r3.f122811l
            java.lang.String r6 = " - exception "
            java.lang.String r7 = " ("
            java.lang.String r8 = "upload "
            r9 = 2
            java.lang.String r11 = ")"
            r12 = 0
            r13 = 1
            java.lang.String r14 = "Upload "
            if (r5 == 0) goto L_0x007c
            if (r5 == r13) goto L_0x0055
            if (r5 != r9) goto L_0x004d
            int r2 = r3.f122808i
            java.lang.Object r4 = r3.f122804e
            androidx.work.x$a r4 = (androidx.work.C7054x.a) r4
            java.lang.Object r5 = r3.f122803d
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r3 = r3.f122802c
            com.sugarcube.app.base.capture.UploadWorker r3 = (com.sugarcube.app.base.capture.UploadWorker) r3
            XH.y.b(r0)
            r7 = r13
            goto L_0x0379
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0055:
            java.lang.Object r2 = r3.f122807h
            com.sugarcube.app.base.capture.b r2 = (com.sugarcube.app.base.capture.b) r2
            java.lang.Object r5 = r3.f122806g
            com.sugarcube.core.network.api.NetworkAPIs r5 = (com.sugarcube.core.network.api.NetworkAPIs) r5
            java.lang.Object r15 = r3.f122805f
            com.sugarcube.app.base.data.database.Scene r15 = (com.sugarcube.app.base.data.database.Scene) r15
            java.lang.Object r15 = r3.f122804e
            androidx.work.x$a r15 = (androidx.work.C7054x.a) r15
            java.lang.Object r10 = r3.f122803d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r13 = r3.f122802c
            com.sugarcube.app.base.capture.UploadWorker r13 = (com.sugarcube.app.base.capture.UploadWorker) r13
            XH.y.b(r0)     // Catch:{ all -> 0x0077 }
            r26 = r10
            r10 = r2
            r2 = r26
            goto L_0x0166
        L_0x0077:
            r0 = move-exception
            r2 = r10
        L_0x0079:
            r10 = r0
            goto L_0x02ac
        L_0x007c:
            XH.y.b(r0)
            LF.c r16 = r27.s()
            r20 = 6
            r21 = 0
            java.lang.String r17 = "V1 Worker doWork"
            r18 = 0
            r19 = 0
            LF.C13187c.e(r16, r17, r18, r19, r20, r21)
            KF.r r0 = r27.t()
            boolean r0 = r0.b()
            java.lang.String r5 = "failure(...)"
            if (r0 == 0) goto L_0x00ad
            LF.c r0 = r27.s()
            java.lang.String r2 = "V1 Worker ran while UploadsV2 allowed!"
            LF.C13187c.j(r0, r2, r12, r9, r12)
            androidx.work.x$a r0 = androidx.work.C7054x.a.a()
            kotlin.jvm.internal.C17542s.i(r0, r5)
            return r0
        L_0x00ad:
            androidx.work.x$a r15 = androidx.work.C7054x.a.b()
            java.lang.String r0 = "retry(...)"
            kotlin.jvm.internal.C17542s.i(r15, r0)
            androidx.work.f r0 = r27.getInputData()
            java.lang.String r10 = "sceneUuid"
            java.lang.String r0 = r0.g(r10)
            if (r0 != 0) goto L_0x00ca
            androidx.work.x$a r0 = androidx.work.C7054x.a.a()
            kotlin.jvm.internal.C17542s.i(r0, r5)
            return r0
        L_0x00ca:
            r1.f122795p = r0
            java.util.UUID r0 = java.util.UUID.fromString(r0)     // Catch:{ all -> 0x0403 }
            r1.f122796q = r0     // Catch:{ all -> 0x0403 }
            java.lang.String r0 = r1.f122795p
            int r5 = r27.getRunAttemptCount()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            r10.append(r0)
            r10.append(r7)
            r10.append(r5)
            r10.append(r11)
            java.lang.String r0 = r10.toString()
            r1.g(r0)
            OE.q r0 = r27.r()
            com.sugarcube.app.base.data.analytics.Analytics r0 = r0.b()
            java.lang.String r5 = r1.f122795p
            androidx.work.WorkerParameters r10 = r1.f122781b
            java.util.UUID r10 = r10.c()
            int r13 = r27.getRunAttemptCount()
            r0.captureUploadDoWork(r5, r10, r13)
            com.sugarcube.app.base.data.SceneRepository r0 = r27.q()     // Catch:{ all -> 0x026f }
            java.util.UUID r5 = r1.f122796q     // Catch:{ all -> 0x026f }
            androidx.work.WorkerParameters r10 = r1.f122781b     // Catch:{ all -> 0x026f }
            java.util.UUID r10 = r10.c()     // Catch:{ all -> 0x026f }
            com.sugarcube.app.base.data.database.SceneState r13 = com.sugarcube.app.base.data.database.SceneState.UPLOADING     // Catch:{ all -> 0x026f }
            com.sugarcube.app.base.data.database.Scene r0 = r0.setWorkerId(r5, r10, r13)     // Catch:{ all -> 0x026f }
            if (r0 == 0) goto L_0x0273
            com.sugarcube.app.base.network.NetworkClient r5 = r27.o()     // Catch:{ all -> 0x026f }
            com.sugarcube.core.network.api.NetworkAPIs r5 = r5.api()     // Catch:{ all -> 0x026f }
            com.sugarcube.app.base.capture.b r10 = new com.sugarcube.app.base.capture.b     // Catch:{ all -> 0x026f }
            OE.q r17 = r27.r()     // Catch:{ all -> 0x026f }
            OE.e r18 = r27.n()     // Catch:{ all -> 0x026f }
            OE.a r19 = r27.i()     // Catch:{ all -> 0x026f }
            YE.a r20 = r27.l()     // Catch:{ all -> 0x026f }
            com.sugarcube.app.base.data.feature.ConfigRepository r21 = r27.k()     // Catch:{ all -> 0x026f }
            VE.b r22 = r27.p()     // Catch:{ all -> 0x026f }
            KF.a r23 = r27.j()     // Catch:{ all -> 0x026f }
            LF.c r24 = r27.s()     // Catch:{ all -> 0x026f }
            r16 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x026f }
            com.sugarcube.app.base.capture.UploadWorker$c r13 = r1.f122801v     // Catch:{ all -> 0x026f }
            r3.f122802c = r1     // Catch:{ all -> 0x026f }
            r3.f122803d = r2     // Catch:{ all -> 0x026f }
            r3.f122804e = r15     // Catch:{ all -> 0x026f }
            r3.f122805f = r0     // Catch:{ all -> 0x026f }
            r3.f122806g = r5     // Catch:{ all -> 0x026f }
            r3.f122807h = r10     // Catch:{ all -> 0x026f }
            r9 = 1
            r3.f122811l = r9     // Catch:{ all -> 0x026f }
            java.lang.Object r0 = r10.k(r0, r13, r5, r3)     // Catch:{ all -> 0x026f }
            if (r0 != r4) goto L_0x0165
            return r4
        L_0x0165:
            r13 = r1
        L_0x0166:
            com.sugarcube.core.network.models.SceneResponse r0 = (com.sugarcube.core.network.models.SceneResponse) r0     // Catch:{ all -> 0x026a }
            java.lang.String r9 = r13.f122795p     // Catch:{ all -> 0x026a }
            int r12 = r13.getRunAttemptCount()     // Catch:{ all -> 0x026a }
            r28 = r2
            r25 = r5
            if (r0 == 0) goto L_0x0176
            r2 = 1
            goto L_0x0177
        L_0x0176:
            r2 = 0
        L_0x0177:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x023a }
            r5.<init>()     // Catch:{ all -> 0x023a }
            r5.append(r8)     // Catch:{ all -> 0x023a }
            r5.append(r9)     // Catch:{ all -> 0x023a }
            r5.append(r7)     // Catch:{ all -> 0x023a }
            r5.append(r12)     // Catch:{ all -> 0x023a }
            java.lang.String r7 = ") - result="
            r5.append(r7)     // Catch:{ all -> 0x023a }
            r5.append(r2)     // Catch:{ all -> 0x023a }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x023a }
            r13.g(r2)     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x023f
            r22 = 12
            r23 = 0
            r19 = 1
            r20 = 0
            r21 = 0
            r17 = r13
            r18 = r0
            w(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x023a }
            java.lang.String r2 = "Sugarcube"
            java.lang.String r5 = r13.f122795p     // Catch:{ all -> 0x023a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x023a }
            r7.<init>()     // Catch:{ all -> 0x023a }
            r7.append(r14)     // Catch:{ all -> 0x023a }
            r7.append(r5)     // Catch:{ all -> 0x023a }
            java.lang.String r5 = " - response="
            r7.append(r5)     // Catch:{ all -> 0x023a }
            r7.append(r0)     // Catch:{ all -> 0x023a }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x023a }
            android.util.Log.d(r2, r5)     // Catch:{ all -> 0x023a }
            com.sugarcube.app.base.data.SceneRepository r2 = r13.q()     // Catch:{ all -> 0x023a }
            java.util.UUID r5 = r13.f122796q     // Catch:{ all -> 0x023a }
            com.sugarcube.app.base.data.database.SceneState r7 = com.sugarcube.app.base.data.database.SceneState.UPLOADED     // Catch:{ all -> 0x023a }
            r2.updateSceneState(r5, r7)     // Catch:{ all -> 0x023a }
            com.sugarcube.app.base.data.SceneRepository r2 = r13.q()     // Catch:{ all -> 0x023a }
            java.util.UUID r5 = r13.f122796q     // Catch:{ all -> 0x023a }
            r2.sceneUploaded(r5, r0)     // Catch:{ all -> 0x023a }
            androidx.work.f$a r2 = new androidx.work.f$a     // Catch:{ all -> 0x023a }
            r2.<init>()     // Catch:{ all -> 0x023a }
            java.lang.String r5 = "sceneId"
            int r7 = r0.getSceneId()     // Catch:{ all -> 0x023a }
            androidx.work.f$a r2 = r2.g(r5, r7)     // Catch:{ all -> 0x023a }
            androidx.work.f r2 = r2.a()     // Catch:{ all -> 0x023a }
            androidx.work.x$a r15 = androidx.work.C7054x.a.d(r2)     // Catch:{ all -> 0x023a }
            java.util.UUID r2 = r13.f122796q     // Catch:{ all -> 0x023a }
            boolean r2 = r13.h(r2)     // Catch:{ all -> 0x023a }
            java.util.UUID r5 = r13.f122796q     // Catch:{ all -> 0x023a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x023a }
            r7.<init>()     // Catch:{ all -> 0x023a }
            r7.append(r14)     // Catch:{ all -> 0x023a }
            r7.append(r5)     // Catch:{ all -> 0x023a }
            java.lang.String r5 = " - cleanup assets ("
            r7.append(r5)     // Catch:{ all -> 0x023a }
            r7.append(r2)     // Catch:{ all -> 0x023a }
            r7.append(r11)     // Catch:{ all -> 0x023a }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x023a }
            r13.g(r2)     // Catch:{ all -> 0x023a }
            com.sugarcube.app.base.capture.SceneSyncWorker$a r2 = com.sugarcube.app.base.capture.SceneSyncWorker.f122764f     // Catch:{ all -> 0x023a }
            android.content.Context r5 = r13.f122780a     // Catch:{ all -> 0x023a }
            java.util.UUID r2 = r2.b(r5)     // Catch:{ all -> 0x023a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x023a }
            r5.<init>()     // Catch:{ all -> 0x023a }
            java.lang.String r7 = "start scene sync worker - "
            r5.append(r7)     // Catch:{ all -> 0x023a }
            r5.append(r2)     // Catch:{ all -> 0x023a }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x023a }
            r13.g(r2)     // Catch:{ all -> 0x023a }
        L_0x0234:
            r2 = r28
            r5 = r25
            goto L_0x0348
        L_0x023a:
            r0 = move-exception
            r2 = r28
            goto L_0x0079
        L_0x023f:
            java.lang.String r20 = "No response received from the server."
            r22 = 8
            r23 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r17 = r13
            w(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x023a }
            java.lang.String r2 = r13.f122795p     // Catch:{ all -> 0x023a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x023a }
            r5.<init>()     // Catch:{ all -> 0x023a }
            r5.append(r14)     // Catch:{ all -> 0x023a }
            r5.append(r2)     // Catch:{ all -> 0x023a }
            java.lang.String r2 = " - no response"
            r5.append(r2)     // Catch:{ all -> 0x023a }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x023a }
            r13.g(r2)     // Catch:{ all -> 0x023a }
            goto L_0x0234
        L_0x026a:
            r0 = move-exception
            r28 = r2
            goto L_0x0079
        L_0x026f:
            r0 = move-exception
            r10 = r0
            r13 = r1
            goto L_0x02ac
        L_0x0273:
            java.util.UUID r0 = r1.f122796q     // Catch:{ all -> 0x026f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x026f }
            r5.<init>()     // Catch:{ all -> 0x026f }
            java.lang.String r7 = "scene not in db "
            r5.append(r7)     // Catch:{ all -> 0x026f }
            r5.append(r0)     // Catch:{ all -> 0x026f }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x026f }
            r1.g(r0)     // Catch:{ all -> 0x026f }
            KF.f r0 = new KF.f     // Catch:{ all -> 0x026f }
            java.util.UUID r5 = r1.f122796q     // Catch:{ all -> 0x026f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x026f }
            r7.<init>()     // Catch:{ all -> 0x026f }
            java.lang.String r8 = "scene not found in db "
            r7.append(r8)     // Catch:{ all -> 0x026f }
            r7.append(r5)     // Catch:{ all -> 0x026f }
            java.lang.String r18 = r7.toString()     // Catch:{ all -> 0x026f }
            r21 = 6
            r22 = 0
            r19 = 0
            r20 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x026f }
            throw r0     // Catch:{ all -> 0x026f }
        L_0x02ac:
            LF.c r0 = r13.s()
            java.lang.String r5 = "worker error"
            r0.g(r5, r10)
            boolean r0 = r10 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L_0x03ff
            boolean r0 = r10 instanceof com.sugarcube.app.base.network.models.UploadFileException
            java.lang.String r5 = "Upload exception: "
            java.lang.String r7 = "Unknown error"
            if (r0 == 0) goto L_0x02e6
            r0 = r10
            com.sugarcube.app.base.network.models.UploadFileException r0 = (com.sugarcube.app.base.network.models.UploadFileException) r0
            java.lang.String r8 = r0.getMessage()
            if (r8 != 0) goto L_0x02cb
            goto L_0x02cc
        L_0x02cb:
            r7 = r8
        L_0x02cc:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r7)
            java.lang.String r5 = r9.toString()
            java.lang.String r0 = r0.getDetailedMessage()
            r7 = 0
            r9 = 0
            r13.v(r9, r7, r5, r0)
            r0 = r8
            goto L_0x030a
        L_0x02e6:
            java.lang.String r0 = r10.getMessage()
            if (r0 != 0) goto L_0x02ed
            goto L_0x02ee
        L_0x02ed:
            r7 = r0
        L_0x02ee:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r7)
            java.lang.String r5 = r8.toString()
            java.lang.Class r7 = r10.getClass()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r8 = 0
            r9 = 0
            r13.v(r9, r8, r5, r7)
        L_0x030a:
            java.lang.String r5 = r13.f122795p
            java.lang.String r7 = r10.getMessage()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            r8.append(r5)
            r8.append(r6)
            r8.append(r7)
            java.lang.String r5 = r8.toString()
            r13.g(r5)
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r5 = r13.m()
            java.lang.String r6 = r13.f122795p
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r14)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.log(r6)
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r5 = r13.m()
            r5.recordException(r10)
            r5 = r10
        L_0x0348:
            androidx.work.x$a r6 = androidx.work.C7054x.a.b()
            boolean r6 = kotlin.jvm.internal.C17542s.e(r15, r6)
            if (r6 == 0) goto L_0x03e2
            int r6 = r13.getRunAttemptCount()
            r7 = 1
            int r6 = r6 + r7
            com.sugarcube.app.base.data.feature.ConfigRepository r8 = r13.k()
            com.sugarcube.app.base.data.feature.FeatureFlags$UseSingleUploadRetry r9 = com.sugarcube.app.base.data.feature.FeatureFlags.UseSingleUploadRetry.INSTANCE
            r3.f122802c = r13
            r3.f122803d = r2
            r3.f122804e = r15
            r3.f122805f = r5
            r3.f122806g = r10
            r3.f122807h = r0
            r3.f122808i = r6
            r2 = 2
            r3.f122811l = r2
            java.lang.Object r0 = r8.get(r9, r3)
            if (r0 != r4) goto L_0x0376
            return r4
        L_0x0376:
            r2 = r6
            r3 = r13
            r4 = r15
        L_0x0379:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0383
            r13 = r7
            goto L_0x0384
        L_0x0383:
            r13 = 5
        L_0x0384:
            if (r2 >= r13) goto L_0x03b3
            com.sugarcube.app.base.data.SceneRepository r0 = r3.q()
            java.util.UUID r5 = r3.f122796q
            com.sugarcube.app.base.data.database.SceneState r6 = com.sugarcube.app.base.data.database.SceneState.UPLOAD_PENDING
            r0.updateSceneState(r5, r6)
            java.lang.String r0 = r3.f122795p
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r14)
            r5.append(r0)
            java.lang.String r0 = " - retry later ("
            r5.append(r0)
            r5.append(r2)
            r5.append(r11)
            java.lang.String r0 = r5.toString()
            r3.g(r0)
            r13 = r3
            r15 = r4
            goto L_0x03e2
        L_0x03b3:
            androidx.work.x$a r15 = androidx.work.C7054x.a.a()
            com.sugarcube.app.base.data.SceneRepository r0 = r3.q()
            java.util.UUID r4 = r3.f122796q
            com.sugarcube.app.base.data.database.SceneState r5 = com.sugarcube.app.base.data.database.SceneState.UPLOAD_FAILED
            r0.updateSceneState(r4, r5)
            java.lang.String r0 = r3.f122795p
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            r4.append(r0)
            java.lang.String r0 = " - max retries ("
            r4.append(r0)
            r4.append(r2)
            r4.append(r11)
            java.lang.String r0 = r4.toString()
            r3.g(r0)
            r13 = r3
        L_0x03e2:
            LF.c r2 = r13.s()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "V1 Worker complete "
            r0.append(r3)
            r0.append(r15)
            java.lang.String r3 = r0.toString()
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            LF.C13187c.e(r2, r3, r4, r5, r6, r7)
            return r15
        L_0x03ff:
            r13.u()
            throw r10
        L_0x0403:
            r0 = move-exception
            java.lang.String r2 = r1.f122795p
            java.lang.String r3 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            r4.append(r2)
            r4.append(r6)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r1.g(r2)
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r2 = r27.m()
            java.lang.String r3 = r1.f122795p
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            r4.append(r3)
            java.lang.String r3 = " - parse error"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.log(r3)
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r2 = r27.m()
            r2.recordException(r0)
            androidx.work.x$a r0 = androidx.work.C7054x.a.a()
            kotlin.jvm.internal.C17542s.i(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.capture.UploadWorker.doWork(dI.e):java.lang.Object");
    }

    public final C13309a i() {
        C13309a aVar = this.f122788i;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("appEnvironment");
        return null;
    }

    public final C13147a j() {
        C13147a aVar = this.f122793n;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("captureFiles");
        return null;
    }

    public final ConfigRepository k() {
        ConfigRepository configRepository = this.f122790k;
        if (configRepository != null) {
            return configRepository;
        }
        C17542s.z("configRepository");
        return null;
    }

    public final C13867a l() {
        C13867a aVar = this.f122789j;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("eventLog");
        return null;
    }

    public final FirebaseInteractions m() {
        FirebaseInteractions firebaseInteractions = this.f122783d;
        if (firebaseInteractions != null) {
            return firebaseInteractions;
        }
        C17542s.z("firebaseInteractions");
        return null;
    }

    public final C13313e n() {
        C13313e eVar = this.f122787h;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("installationConfig");
        return null;
    }

    public final NetworkClient o() {
        NetworkClient networkClient = this.f122785f;
        if (networkClient != null) {
            return networkClient;
        }
        C17542s.z("networkClient");
        return null;
    }

    public final C13760b p() {
        C13760b bVar = this.f122791l;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("networkConfig");
        return null;
    }

    public final SceneRepository q() {
        SceneRepository sceneRepository = this.f122784e;
        if (sceneRepository != null) {
            return sceneRepository;
        }
        C17542s.z("sceneRepository");
        return null;
    }

    public final q r() {
        q qVar = this.f122782c;
        if (qVar != null) {
            return qVar;
        }
        C17542s.z("sugarcube");
        return null;
    }

    public final C13187c s() {
        C13187c cVar = this.f122794o;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("uploadLogger");
        return null;
    }

    public final C13164r t() {
        C13164r rVar = this.f122792m;
        if (rVar != null) {
            return rVar;
        }
        C17542s.z("uploadVersion");
        return null;
    }
}
