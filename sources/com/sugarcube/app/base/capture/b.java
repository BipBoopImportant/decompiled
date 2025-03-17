package com.sugarcube.app.base.capture;

import KF.C13147a;
import LF.C13187c;
import OE.C13309a;
import OE.C13313e;
import OE.q;
import VE.C13760b;
import YE.C13867a;
import YE.C13868b;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.api.NetworkAPIs;
import com.sugarcube.core.network.models.CreateSceneRequest;
import com.sugarcube.core.network.models.UploadProperties;
import com.sugarcube.core.network.models.UploadSetState;
import com.sugarcube.core.network.models.UploadURL;
import dI.C17164e;
import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002LNBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013JJ\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH@¢\u0006\u0004\b!\u0010\"J>\u0010(\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020#2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00160%2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0014H@¢\u0006\u0004\b(\u0010)J\"\u0010+\u001a\u0004\u0018\u00010#2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH@¢\u0006\u0004\b+\u0010,JR\u00105\u001a\b\u0012\u0004\u0012\u00020#042\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u00100\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u00101\u001a\u00020\u001e2\n\b\u0002\u00103\u001a\u0004\u0018\u000102H@¢\u0006\u0004\b5\u00106J\u001f\u0010:\u001a\u0002092\u0006\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u0016H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010@\u001a\n ?*\u0004\u0018\u00010>0>2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u0002092\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\bB\u0010CJ*\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010E\u001a\u00020D2\u0006\u0010\u001d\u001a\u00020\u001cH@¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u0004\u0018\u00010\u00162\u0006\u0010I\u001a\u00020\u0016H\u0000¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010TR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010UR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010VR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u0010W¨\u0006X"}, d2 = {"Lcom/sugarcube/app/base/capture/b;", "", "LOE/q;", "sugarcube", "LOE/e;", "installationConfig", "LOE/a;", "appEnvironment", "LYE/a;", "eventLog", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "LVE/b;", "networkConfig", "LKF/a;", "files", "LLF/c;", "uploadLog", "<init>", "(LOE/q;LOE/e;LOE/a;LYE/a;Lcom/sugarcube/app/base/data/feature/ConfigRepository;LVE/b;LKF/a;LLF/c;)V", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "Ljava/io/File;", "logFile", "previewFile", "alignmentFile", "Ljava/util/UUID;", "uploadId", "Lcom/sugarcube/core/network/api/NetworkAPIs;", "networkAPIs", "", "resumable", "Lcom/sugarcube/app/base/capture/b$b;", "g", "(Lcom/sugarcube/app/base/data/database/Scene;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/util/UUID;Lcom/sugarcube/core/network/api/NetworkAPIs;ZLdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/UploadSetState;", "uploadResponse", "", "", "fileMap", "l", "(Lcom/sugarcube/core/network/models/UploadSetState;Ljava/util/Map;Lcom/sugarcube/core/network/api/NetworkAPIs;Lcom/sugarcube/app/base/data/database/Scene;LdI/e;)Ljava/lang/Object;", "uuid", "i", "(Ljava/util/UUID;Lcom/sugarcube/core/network/api/NetworkAPIs;LdI/e;)Ljava/lang/Object;", "", "Lcom/sugarcube/core/network/models/UploadURL;", "uploadURLs", "scenenUuid", "requestResumable", "Lcom/sugarcube/core/network/models/UploadProperties;", "uploadProperties", "LQL/x;", "h", "(Lcom/sugarcube/core/network/api/NetworkAPIs;Ljava/util/List;Ljava/util/UUID;Ljava/util/UUID;ZLcom/sugarcube/core/network/models/UploadProperties;LdI/e;)Ljava/lang/Object;", "source", "target", "LXH/N;", "f", "(Ljava/io/File;Ljava/io/File;)V", "Landroid/content/Context;", "appContext", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "m", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "e", "(Lcom/sugarcube/app/base/data/database/Scene;)V", "Lcom/sugarcube/app/base/capture/UploadProgressListener;", "uploadListener", "Lcom/sugarcube/core/network/models/SceneResponse;", "k", "(Lcom/sugarcube/app/base/data/database/Scene;Lcom/sugarcube/app/base/capture/UploadProgressListener;Lcom/sugarcube/core/network/api/NetworkAPIs;LdI/e;)Ljava/lang/Object;", "unzippedFile", "j", "(Ljava/io/File;)Ljava/io/File;", "a", "LOE/q;", "b", "LOE/e;", "c", "LOE/a;", "d", "LYE/a;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "LVE/b;", "LKF/a;", "LLF/c;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final a f122816i = new a((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f122817j = 8;

    /* renamed from: a  reason: collision with root package name */
    private final q f122818a;

    /* renamed from: b  reason: collision with root package name */
    private final C13313e f122819b;

    /* renamed from: c  reason: collision with root package name */
    private final C13309a f122820c;

    /* renamed from: d  reason: collision with root package name */
    private final C13867a f122821d;

    /* renamed from: e  reason: collision with root package name */
    private final ConfigRepository f122822e;

    /* renamed from: f  reason: collision with root package name */
    private final C13760b f122823f;

    /* renamed from: g  reason: collision with root package name */
    private final C13147a f122824g;

    /* renamed from: h  reason: collision with root package name */
    private final C13187c f122825h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/sugarcube/app/base/capture/b$a;", "", "<init>", "()V", "", "UPLOAD_SESSION_ID_FILE_NAME", "Ljava/lang/String;", "AUTOMATIC_LOG_FILE_NAME", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\rR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/sugarcube/app/base/capture/b$b;", "", "Lcom/sugarcube/core/network/models/UploadSetState;", "uploadSetApiState", "", "", "Ljava/io/File;", "fileMap", "Lcom/sugarcube/core/network/models/CreateSceneRequest;", "createSceneRequest", "<init>", "(Lcom/sugarcube/core/network/models/UploadSetState;Ljava/util/Map;Lcom/sugarcube/core/network/models/CreateSceneRequest;)V", "a", "()Lcom/sugarcube/core/network/models/UploadSetState;", "b", "()Ljava/util/Map;", "c", "()Lcom/sugarcube/core/network/models/CreateSceneRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sugarcube/core/network/models/UploadSetState;", "getUploadSetApiState", "Ljava/util/Map;", "getFileMap", "Lcom/sugarcube/core/network/models/CreateSceneRequest;", "getCreateSceneRequest", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.capture.b$b  reason: collision with other inner class name */
    public static final class C3025b {

        /* renamed from: a  reason: collision with root package name */
        private final UploadSetState f122826a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, File> f122827b;

        /* renamed from: c  reason: collision with root package name */
        private final CreateSceneRequest f122828c;

        public C3025b(UploadSetState uploadSetState, Map<String, ? extends File> map, CreateSceneRequest createSceneRequest) {
            C17542s.j(map, "fileMap");
            C17542s.j(createSceneRequest, "createSceneRequest");
            this.f122826a = uploadSetState;
            this.f122827b = map;
            this.f122828c = createSceneRequest;
        }

        public final UploadSetState a() {
            return this.f122826a;
        }

        public final Map<String, File> b() {
            return this.f122827b;
        }

        public final CreateSceneRequest c() {
            return this.f122828c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3025b)) {
                return false;
            }
            C3025b bVar = (C3025b) obj;
            return C17542s.e(this.f122826a, bVar.f122826a) && C17542s.e(this.f122827b, bVar.f122827b) && C17542s.e(this.f122828c, bVar.f122828c);
        }

        public int hashCode() {
            UploadSetState uploadSetState = this.f122826a;
            return ((((uploadSetState == null ? 0 : uploadSetState.hashCode()) * 31) + this.f122827b.hashCode()) * 31) + this.f122828c.hashCode();
        }

        public String toString() {
            UploadSetState uploadSetState = this.f122826a;
            Map<String, File> map = this.f122827b;
            CreateSceneRequest createSceneRequest = this.f122828c;
            return "UploadSet(uploadSetApiState=" + uploadSetState + ", fileMap=" + map + ", createSceneRequest=" + createSceneRequest + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.capture.Uploader", f = "Uploader.kt", l = {363}, m = "createUploadSet")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f122829c;

        /* renamed from: d  reason: collision with root package name */
        Object f122830d;

        /* renamed from: e  reason: collision with root package name */
        Object f122831e;

        /* renamed from: f  reason: collision with root package name */
        Object f122832f;

        /* renamed from: g  reason: collision with root package name */
        Object f122833g;

        /* renamed from: h  reason: collision with root package name */
        Object f122834h;

        /* renamed from: i  reason: collision with root package name */
        Object f122835i;

        /* renamed from: j  reason: collision with root package name */
        Object f122836j;

        /* renamed from: k  reason: collision with root package name */
        Object f122837k;

        /* renamed from: l  reason: collision with root package name */
        Object f122838l;

        /* renamed from: m  reason: collision with root package name */
        Object f122839m;

        /* renamed from: n  reason: collision with root package name */
        Object f122840n;

        /* renamed from: o  reason: collision with root package name */
        Object f122841o;

        /* renamed from: p  reason: collision with root package name */
        Object f122842p;

        /* renamed from: q  reason: collision with root package name */
        Object f122843q;

        /* renamed from: r  reason: collision with root package name */
        Object f122844r;

        /* renamed from: s  reason: collision with root package name */
        Object f122845s;

        /* renamed from: t  reason: collision with root package name */
        Object f122846t;

        /* renamed from: u  reason: collision with root package name */
        boolean f122847u;

        /* renamed from: v  reason: collision with root package name */
        int f122848v;

        /* renamed from: w  reason: collision with root package name */
        /* synthetic */ Object f122849w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ b f122850x;

        /* renamed from: y  reason: collision with root package name */
        int f122851y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f122850x = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f122849w = obj;
            this.f122851y |= Integer.MIN_VALUE;
            return this.f122850x.g((Scene) null, (File) null, (File) null, (File) null, (UUID) null, (NetworkAPIs) null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.capture.Uploader", f = "Uploader.kt", l = {605, 624}, m = "getOrCreateUpload")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f122852c;

        /* renamed from: d  reason: collision with root package name */
        Object f122853d;

        /* renamed from: e  reason: collision with root package name */
        Object f122854e;

        /* renamed from: f  reason: collision with root package name */
        Object f122855f;

        /* renamed from: g  reason: collision with root package name */
        Object f122856g;

        /* renamed from: h  reason: collision with root package name */
        Object f122857h;

        /* renamed from: i  reason: collision with root package name */
        Object f122858i;

        /* renamed from: j  reason: collision with root package name */
        Object f122859j;

        /* renamed from: k  reason: collision with root package name */
        Object f122860k;

        /* renamed from: l  reason: collision with root package name */
        boolean f122861l;

        /* renamed from: m  reason: collision with root package name */
        int f122862m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f122863n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ b f122864o;

        /* renamed from: p  reason: collision with root package name */
        int f122865p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f122864o = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f122863n = obj;
            this.f122865p |= Integer.MIN_VALUE;
            return this.f122864o.h((NetworkAPIs) null, (List<UploadURL>) null, (UUID) null, (UUID) null, false, (UploadProperties) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.capture.Uploader", f = "Uploader.kt", l = {591}, m = "getUploadSetState")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f122866c;

        /* renamed from: d  reason: collision with root package name */
        Object f122867d;

        /* renamed from: e  reason: collision with root package name */
        Object f122868e;

        /* renamed from: f  reason: collision with root package name */
        Object f122869f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f122870g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f122871h;

        /* renamed from: i  reason: collision with root package name */
        int f122872i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f122871h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f122870g = obj;
            this.f122872i |= Integer.MIN_VALUE;
            return this.f122871h.i((UUID) null, (NetworkAPIs) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.capture.Uploader", f = "Uploader.kt", l = {152, 185, 199, 201}, m = "upload")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: A  reason: collision with root package name */
        Object f122873A;

        /* renamed from: B  reason: collision with root package name */
        Object f122874B;

        /* renamed from: C  reason: collision with root package name */
        boolean f122875C;

        /* renamed from: D  reason: collision with root package name */
        int f122876D;

        /* renamed from: E  reason: collision with root package name */
        int f122877E;

        /* renamed from: F  reason: collision with root package name */
        int f122878F;

        /* renamed from: G  reason: collision with root package name */
        /* synthetic */ Object f122879G;

        /* renamed from: H  reason: collision with root package name */
        final /* synthetic */ b f122880H;

        /* renamed from: I  reason: collision with root package name */
        int f122881I;

        /* renamed from: c  reason: collision with root package name */
        Object f122882c;

        /* renamed from: d  reason: collision with root package name */
        Object f122883d;

        /* renamed from: e  reason: collision with root package name */
        Object f122884e;

        /* renamed from: f  reason: collision with root package name */
        Object f122885f;

        /* renamed from: g  reason: collision with root package name */
        Object f122886g;

        /* renamed from: h  reason: collision with root package name */
        Object f122887h;

        /* renamed from: i  reason: collision with root package name */
        Object f122888i;

        /* renamed from: j  reason: collision with root package name */
        Object f122889j;

        /* renamed from: k  reason: collision with root package name */
        Object f122890k;

        /* renamed from: l  reason: collision with root package name */
        Object f122891l;

        /* renamed from: m  reason: collision with root package name */
        Object f122892m;

        /* renamed from: n  reason: collision with root package name */
        Object f122893n;

        /* renamed from: o  reason: collision with root package name */
        Object f122894o;

        /* renamed from: p  reason: collision with root package name */
        Object f122895p;

        /* renamed from: q  reason: collision with root package name */
        Object f122896q;

        /* renamed from: r  reason: collision with root package name */
        Object f122897r;

        /* renamed from: s  reason: collision with root package name */
        Object f122898s;

        /* renamed from: t  reason: collision with root package name */
        Object f122899t;

        /* renamed from: u  reason: collision with root package name */
        Object f122900u;

        /* renamed from: v  reason: collision with root package name */
        Object f122901v;

        /* renamed from: w  reason: collision with root package name */
        Object f122902w;

        /* renamed from: x  reason: collision with root package name */
        Object f122903x;

        /* renamed from: y  reason: collision with root package name */
        Object f122904y;

        /* renamed from: z  reason: collision with root package name */
        Object f122905z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f122880H = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f122879G = obj;
            this.f122881I |= Integer.MIN_VALUE;
            return this.f122880H.k((Scene) null, (UploadProgressListener) null, (NetworkAPIs) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.capture.Uploader", f = "Uploader.kt", l = {540, 542, 555}, m = "uploadFiles")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: A  reason: collision with root package name */
        int f122906A;

        /* renamed from: c  reason: collision with root package name */
        Object f122907c;

        /* renamed from: d  reason: collision with root package name */
        Object f122908d;

        /* renamed from: e  reason: collision with root package name */
        Object f122909e;

        /* renamed from: f  reason: collision with root package name */
        Object f122910f;

        /* renamed from: g  reason: collision with root package name */
        Object f122911g;

        /* renamed from: h  reason: collision with root package name */
        Object f122912h;

        /* renamed from: i  reason: collision with root package name */
        Object f122913i;

        /* renamed from: j  reason: collision with root package name */
        Object f122914j;

        /* renamed from: k  reason: collision with root package name */
        Object f122915k;

        /* renamed from: l  reason: collision with root package name */
        Object f122916l;

        /* renamed from: m  reason: collision with root package name */
        Object f122917m;

        /* renamed from: n  reason: collision with root package name */
        Object f122918n;

        /* renamed from: o  reason: collision with root package name */
        Object f122919o;

        /* renamed from: p  reason: collision with root package name */
        Object f122920p;

        /* renamed from: q  reason: collision with root package name */
        Object f122921q;

        /* renamed from: r  reason: collision with root package name */
        Object f122922r;

        /* renamed from: s  reason: collision with root package name */
        Object f122923s;

        /* renamed from: t  reason: collision with root package name */
        Object f122924t;

        /* renamed from: u  reason: collision with root package name */
        Object f122925u;

        /* renamed from: v  reason: collision with root package name */
        int f122926v;

        /* renamed from: w  reason: collision with root package name */
        int f122927w;

        /* renamed from: x  reason: collision with root package name */
        int f122928x;

        /* renamed from: y  reason: collision with root package name */
        /* synthetic */ Object f122929y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ b f122930z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f122930z = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f122929y = obj;
            this.f122906A |= Integer.MIN_VALUE;
            return this.f122930z.l((UploadSetState) null, (Map<String, ? extends File>) null, (NetworkAPIs) null, (Scene) null, this);
        }
    }

    public b(q qVar, C13313e eVar, C13309a aVar, C13867a aVar2, ConfigRepository configRepository, C13760b bVar, C13147a aVar3, C13187c cVar) {
        C17542s.j(qVar, "sugarcube");
        C17542s.j(eVar, "installationConfig");
        C17542s.j(aVar, "appEnvironment");
        C17542s.j(aVar2, "eventLog");
        C17542s.j(configRepository, "configRepository");
        C17542s.j(bVar, "networkConfig");
        C17542s.j(aVar3, "files");
        C17542s.j(cVar, "uploadLog");
        this.f122818a = qVar;
        this.f122819b = eVar;
        this.f122820c = aVar;
        this.f122821d = aVar2;
        this.f122822e = configRepository;
        this.f122823f = bVar;
        this.f122824g = aVar3;
        this.f122825h = cVar;
    }

    private final void f(File file, File file2) {
        try {
            if (file.exists()) {
                Files.copy(file.toPath(), file2.toPath(), new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
            }
        } catch (Exception e10) {
            Log.e(AnyKt.SUGARCUBE_TAG, String.valueOf(file.getAbsolutePath()), e10);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x05a1  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x05a5  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(com.sugarcube.app.base.data.database.Scene r58, java.io.File r59, java.io.File r60, java.io.File r61, java.util.UUID r62, com.sugarcube.core.network.api.NetworkAPIs r63, boolean r64, dI.C17164e<? super com.sugarcube.app.base.capture.b.C3025b> r65) {
        /*
            r57 = this;
            r9 = r57
            r0 = r59
            r1 = r60
            r10 = r64
            r2 = r65
            boolean r3 = r2 instanceof com.sugarcube.app.base.capture.b.c
            if (r3 == 0) goto L_0x001e
            r3 = r2
            com.sugarcube.app.base.capture.b$c r3 = (com.sugarcube.app.base.capture.b.c) r3
            int r4 = r3.f122851y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001e
            int r4 = r4 - r5
            r3.f122851y = r4
        L_0x001c:
            r8 = r3
            goto L_0x0024
        L_0x001e:
            com.sugarcube.app.base.capture.b$c r3 = new com.sugarcube.app.base.capture.b$c
            r3.<init>(r9, r2)
            goto L_0x001c
        L_0x0024:
            java.lang.Object r3 = r8.f122849w
            java.lang.Object r11 = eI.C17187b.f()
            int r4 = r8.f122851y
            java.lang.String r12 = ")"
            r5 = 1
            if (r4 == 0) goto L_0x008f
            if (r4 != r5) goto L_0x0087
            boolean r0 = r8.f122847u
            java.lang.Object r1 = r8.f122846t
            com.sugarcube.core.network.models.SessionMeta r1 = (com.sugarcube.core.network.models.SessionMeta) r1
            java.lang.Object r2 = r8.f122845s
            com.sugarcube.core.network.models.SessionMeta r2 = (com.sugarcube.core.network.models.SessionMeta) r2
            java.lang.Object r2 = r8.f122844r
            com.sugarcube.core.network.models.SessionMeta r2 = (com.sugarcube.core.network.models.SessionMeta) r2
            java.lang.Object r2 = r8.f122843q
            kotlin.jvm.internal.O r2 = (kotlin.jvm.internal.O) r2
            java.lang.Object r4 = r8.f122842p
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r8.f122841o
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r8.f122840n
            kotlin.jvm.internal.O r4 = (kotlin.jvm.internal.O) r4
            java.lang.Object r5 = r8.f122839m
            kotlin.jvm.internal.O r5 = (kotlin.jvm.internal.O) r5
            java.lang.Object r5 = r8.f122838l
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = r8.f122837k
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r8.f122836j
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r8.f122835i
            com.sugarcube.core.network.api.NetworkAPIs r6 = (com.sugarcube.core.network.api.NetworkAPIs) r6
            java.lang.Object r6 = r8.f122834h
            java.util.UUID r6 = (java.util.UUID) r6
            java.lang.Object r6 = r8.f122833g
            java.io.File r6 = (java.io.File) r6
            java.lang.Object r6 = r8.f122832f
            java.io.File r6 = (java.io.File) r6
            java.lang.Object r6 = r8.f122831e
            java.io.File r6 = (java.io.File) r6
            java.lang.Object r6 = r8.f122830d
            com.sugarcube.app.base.data.database.Scene r6 = (com.sugarcube.app.base.data.database.Scene) r6
            java.lang.Object r7 = r8.f122829c
            com.sugarcube.app.base.capture.b r7 = (com.sugarcube.app.base.capture.b) r7
            XH.y.b(r3)
            r15 = r0
            r11 = r1
            r13 = r6
            r22 = r12
            goto L_0x047f
        L_0x0087:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x008f:
            XH.y.b(r3)
            LF.c r3 = r9.f122825h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "> createUploadSet (resumable="
            r4.append(r6)
            r4.append(r10)
            r4.append(r12)
            java.lang.String r17 = r4.toString()
            r20 = 6
            r21 = 0
            r18 = 0
            r19 = 0
            r16 = r3
            LF.C13187c.e(r16, r17, r18, r19, r20, r21)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            kotlin.jvm.internal.O r4 = new kotlin.jvm.internal.O
            r4.<init>()
            kotlin.jvm.internal.O r6 = new kotlin.jvm.internal.O
            r6.<init>()
            java.lang.String r5 = ""
            r6.f144348a = r5
            java.util.List r17 = r58.getMetadatas()
            java.lang.Iterable r17 = (java.lang.Iterable) r17
            java.util.Iterator r17 = r17.iterator()
        L_0x00d7:
            boolean r18 = r17.hasNext()
            java.lang.String r13 = "Info/"
            java.lang.String r14 = " "
            java.lang.String r15 = ": Add "
            if (r18 == 0) goto L_0x0208
            java.lang.Object r18 = r17.next()
            com.sugarcube.app.base.data.database.Metadata r18 = (com.sugarcube.app.base.data.database.Metadata) r18
            android.net.Uri r18 = r18.getUri()
            r22 = r12
            java.lang.String r12 = r18.getPath()
            if (r12 == 0) goto L_0x01f8
            r18 = r11
            java.io.File r11 = new java.io.File
            r11.<init>(r12)
            java.lang.String r12 = r11.getName()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r13)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r7.put(r10, r11)
            com.sugarcube.core.network.models.UploadURL r12 = new com.sugarcube.core.network.models.UploadURL
            r31 = 124(0x7c, float:1.74E-43)
            r32 = 0
            java.lang.String r13 = "application/json"
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r23 = r12
            r24 = r10
            r25 = r13
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r3.add(r12)
            YE.b r12 = YE.C13868b.f118106a
            java.util.UUID r2 = r58.getUuid()
            r23 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r8.append(r15)
            r8.append(r10)
            r8.append(r14)
            r8.append(r13)
            java.lang.String r2 = r8.toString()
            YE.e r8 = YE.e.Upload
            r12.b(r2, r8)
            java.lang.String r2 = "capture_meta.json"
            r13 = 2
            r14 = 0
            r15 = 0
            boolean r2 = HJ.C15854t.d0(r10, r2, r14, r13, r15)
            if (r2 == 0) goto L_0x0184
            java.lang.String r2 = PE.C13341c.i(r11)
            r6.f144348a = r2
            java.util.UUID r2 = r58.getUuid()
            T r10 = r6.f144348a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.String r2 = ": capture_meta sha256="
            r11.append(r2)
            r11.append(r10)
            java.lang.String r2 = r11.toString()
            r12.b(r2, r8)
            goto L_0x01f5
        L_0x0184:
            java.lang.String r2 = "session_meta.json"
            r13 = 2
            r14 = 0
            r15 = 0
            boolean r2 = HJ.C15854t.d0(r10, r2, r14, r13, r15)
            if (r2 == 0) goto L_0x01f5
            com.squareup.moshi.t$b r2 = new com.squareup.moshi.t$b
            r2.<init>()
            NE.b r10 = new NE.b
            r10.<init>()
            com.squareup.moshi.t$b r2 = r2.a(r10)
            com.squareup.moshi.t r2 = r2.d()
            WK.N r10 = WK.y.k(r11)
            WK.g r10 = WK.y.d(r10)
            com.squareup.moshi.k r10 = com.squareup.moshi.k.l(r10)
            java.lang.Class<com.sugarcube.core.network.models.SessionMeta> r11 = com.sugarcube.core.network.models.SessionMeta.class
            com.squareup.moshi.f r2 = r2.c(r11)     // Catch:{ all -> 0x01ec }
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r10)     // Catch:{ all -> 0x01ec }
            com.sugarcube.core.network.models.SessionMeta r2 = (com.sugarcube.core.network.models.SessionMeta) r2     // Catch:{ all -> 0x01ec }
            r11 = 0
            jI.C17416c.a(r10, r11)
            r4.f144348a = r2
            if (r2 == 0) goto L_0x01c4
            r2.getCaptureStrategy()
        L_0x01c4:
            java.util.UUID r2 = r58.getUuid()
            T r10 = r4.f144348a
            com.sugarcube.core.network.models.SessionMeta r10 = (com.sugarcube.core.network.models.SessionMeta) r10
            if (r10 == 0) goto L_0x01d3
            java.lang.String r10 = r10.getCaptureTimestamp()
            goto L_0x01d4
        L_0x01d3:
            r10 = 0
        L_0x01d4:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.String r2 = ": session meta loaded. "
            r11.append(r2)
            r11.append(r10)
            java.lang.String r2 = r11.toString()
            r12.b(r2, r8)
            goto L_0x01f5
        L_0x01ec:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x01ef }
        L_0x01ef:
            r0 = move-exception
            r2 = r0
            jI.C17416c.a(r10, r1)
            throw r2
        L_0x01f5:
            XH.N r2 = XH.C16807N.f139792a
            goto L_0x01fc
        L_0x01f8:
            r23 = r8
            r18 = r11
        L_0x01fc:
            r10 = r64
            r2 = r65
            r11 = r18
            r12 = r22
            r8 = r23
            goto L_0x00d7
        L_0x0208:
            r23 = r8
            r18 = r11
            r22 = r12
            java.util.List r2 = r58.getMedias()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0218:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0362
            java.lang.Object r8 = r2.next()
            com.sugarcube.app.base.data.database.Media r8 = (com.sugarcube.app.base.data.database.Media) r8
            android.net.Uri r10 = r8.getUri()
            java.lang.String r10 = r10.getPath()
            if (r10 == 0) goto L_0x0358
            com.sugarcube.app.base.data.database.MediaType r11 = r8.getType()
            com.sugarcube.app.base.data.database.MediaType r12 = com.sugarcube.app.base.data.database.MediaType.VIDEO
            if (r11 != r12) goto L_0x029a
            java.io.File r8 = new java.io.File
            r8.<init>(r10)
            java.lang.String r10 = r8.getName()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Video/"
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r7.put(r10, r8)
            com.sugarcube.core.network.models.UploadURL r8 = new com.sugarcube.core.network.models.UploadURL
            r32 = 124(0x7c, float:1.74E-43)
            r33 = 0
            java.lang.String r11 = "video/mp4"
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r24 = r8
            r25 = r10
            r26 = r11
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r3.add(r8)
            YE.b r8 = YE.C13868b.f118106a
            java.util.UUID r12 = r58.getUuid()
            r17 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r15)
            r2.append(r10)
            r2.append(r14)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            YE.e r10 = YE.e.Upload
            r8.b(r2, r10)
        L_0x0296:
            r24 = r6
            goto L_0x0355
        L_0x029a:
            r17 = r2
            com.sugarcube.app.base.data.database.MediaType r2 = r8.getType()
            com.sugarcube.app.base.data.database.MediaType r8 = com.sugarcube.app.base.data.database.MediaType.IMAGE
            if (r2 != r8) goto L_0x0296
            java.io.File r2 = new java.io.File
            r2.<init>(r10)
            java.lang.String r8 = r2.getName()
            java.lang.String r10 = "getName(...)"
            kotlin.jvm.internal.C17542s.i(r8, r10)
            java.lang.String r10 = "_0_"
            r24 = r6
            r6 = 0
            r11 = 2
            r12 = 0
            boolean r8 = HJ.C15854t.d0(r8, r10, r12, r11, r6)
            if (r8 == 0) goto L_0x02c2
            java.lang.String r6 = "Pano_0/"
            goto L_0x02c4
        L_0x02c2:
            java.lang.String r6 = "Pano_1/"
        L_0x02c4:
            java.lang.String r8 = r2.getName()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r8)
            java.lang.String r6 = r10.toString()
            java.lang.String r8 = jI.C17423j.s(r2)
            int r10 = r8.hashCode()
            switch(r10) {
                case 105441: goto L_0x0307;
                case 111145: goto L_0x02fb;
                case 3198682: goto L_0x02ef;
                case 3645340: goto L_0x02e3;
                default: goto L_0x02e2;
            }
        L_0x02e2:
            goto L_0x030f
        L_0x02e3:
            java.lang.String r10 = "webp"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x02ec
            goto L_0x030f
        L_0x02ec:
            java.lang.String r8 = "image/webp"
            goto L_0x0313
        L_0x02ef:
            java.lang.String r10 = "heif"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x02f8
            goto L_0x030f
        L_0x02f8:
            java.lang.String r8 = "image/heif"
            goto L_0x0313
        L_0x02fb:
            java.lang.String r10 = "png"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0304
            goto L_0x030f
        L_0x0304:
            java.lang.String r8 = "image/png"
            goto L_0x0313
        L_0x0307:
            java.lang.String r10 = "jpg"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0311
        L_0x030f:
            r8 = 0
            goto L_0x0313
        L_0x0311:
            java.lang.String r8 = "image/jpeg"
        L_0x0313:
            r7.put(r6, r2)
            com.sugarcube.core.network.models.UploadURL r2 = new com.sugarcube.core.network.models.UploadURL
            r33 = 124(0x7c, float:1.74E-43)
            r34 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r25 = r2
            r26 = r6
            r27 = r8
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3.add(r2)
            YE.b r2 = YE.C13868b.f118106a
            java.util.UUID r10 = r58.getUuid()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r15)
            r11.append(r6)
            r11.append(r14)
            r11.append(r8)
            java.lang.String r6 = r11.toString()
            YE.e r8 = YE.e.Upload
            r2.b(r6, r8)
        L_0x0355:
            XH.N r2 = XH.C16807N.f139792a
            goto L_0x035c
        L_0x0358:
            r17 = r2
            r24 = r6
        L_0x035c:
            r2 = r17
            r6 = r24
            goto L_0x0218
        L_0x0362:
            r24 = r6
            java.lang.String r2 = r59.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r13)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r7.put(r2, r0)
            com.sugarcube.core.network.models.UploadURL r6 = new com.sugarcube.core.network.models.UploadURL
            r33 = 124(0x7c, float:1.74E-43)
            r34 = 0
            java.lang.String r8 = "application/txt"
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r25 = r6
            r26 = r2
            r27 = r8
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3.add(r6)
            YE.b r6 = YE.C13868b.f118106a
            java.util.UUID r10 = r58.getUuid()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r15)
            r11.append(r2)
            r11.append(r14)
            r11.append(r8)
            java.lang.String r10 = r11.toString()
            YE.e r11 = YE.e.Upload
            r6.b(r10, r11)
            boolean r10 = r60.exists()
            if (r10 == 0) goto L_0x040b
            java.lang.String r10 = r60.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            r7.put(r10, r1)
            com.sugarcube.core.network.models.UploadURL r12 = new com.sugarcube.core.network.models.UploadURL
            r33 = 124(0x7c, float:1.74E-43)
            r34 = 0
            java.lang.String r13 = "image/jpeg"
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r25 = r12
            r26 = r10
            r27 = r13
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3.add(r12)
            java.util.UUID r12 = r58.getUuid()
            r17 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r12)
            r8.append(r15)
            r8.append(r10)
            r8.append(r14)
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            r6.b(r8, r11)
            goto L_0x040d
        L_0x040b:
            r17 = r8
        L_0x040d:
            r61.exists()
            kotlin.jvm.internal.O r10 = new kotlin.jvm.internal.O
            r10.<init>()
            r10.f144348a = r5
            T r5 = r4.f144348a
            r11 = r5
            com.sugarcube.core.network.models.SessionMeta r11 = (com.sugarcube.core.network.models.SessionMeta) r11
            if (r11 == 0) goto L_0x0570
            java.util.UUID r5 = r58.getUuid()
            r6 = 3
            r8 = 0
            com.sugarcube.core.network.models.UploadProperties r12 = com.sugarcube.core.network.models.UploadModelsKt.toUploadProperties$default(r11, r8, r8, r6, r8)
            r8 = r23
            r8.f122829c = r9
            r13 = r58
            r8.f122830d = r13
            r8.f122831e = r0
            r8.f122832f = r1
            r0 = r61
            r8.f122833g = r0
            r0 = r62
            r8.f122834h = r0
            r6 = r63
            r8.f122835i = r6
            r1 = r65
            r8.f122836j = r1
            r8.f122837k = r7
            r8.f122838l = r3
            r8.f122839m = r4
            r14 = r24
            r8.f122840n = r14
            r8.f122841o = r2
            r1 = r17
            r8.f122842p = r1
            r8.f122843q = r10
            r8.f122844r = r11
            r8.f122845s = r11
            r8.f122846t = r11
            r15 = r64
            r8.f122847u = r15
            r1 = 0
            r8.f122848v = r1
            r1 = 1
            r8.f122851y = r1
            r1 = r57
            r2 = r63
            r4 = r5
            r5 = r62
            r0 = r14
            r6 = r64
            r14 = r7
            r7 = r12
            java.lang.Object r3 = r1.h(r2, r3, r4, r5, r6, r7, r8)
            r1 = r18
            if (r3 != r1) goto L_0x047b
            return r1
        L_0x047b:
            r4 = r0
            r7 = r9
            r2 = r10
            r5 = r14
        L_0x047f:
            QL.x r3 = (QL.x) r3
            java.lang.Object r0 = r3.a()
            com.sugarcube.core.network.models.UploadSetState r0 = (com.sugarcube.core.network.models.UploadSetState) r0
            if (r0 == 0) goto L_0x052e
            YE.b r1 = YE.C13868b.f118106a
            java.util.UUID r2 = r13.getUuid()
            java.util.UUID r3 = r0.getUuid()
            java.lang.Boolean r6 = r0.getResumable()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            java.lang.String r2 = ": create upload "
            r8.append(r2)
            r8.append(r3)
            java.lang.String r2 = " (resumable="
            r8.append(r2)
            r8.append(r6)
            r2 = r22
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            YE.e r3 = YE.e.Upload
            r1.b(r2, r3)
            com.sugarcube.core.network.models.CreateSceneRequest$Companion r1 = com.sugarcube.core.network.models.CreateSceneRequest.Companion
            java.util.UUID r2 = r0.getUuid()
            java.lang.String r3 = r13.getName()
            com.sugarcube.core.network.models.RoomType r6 = r13.getRoomType()
            if (r6 != 0) goto L_0x04e6
            com.sugarcube.app.base.data.model.RoomTypeRenderer r6 = com.sugarcube.app.base.data.model.RoomTypeRenderer.INSTANCE
            OE.a r8 = r7.f122820c
            android.content.Context r8 = r8.a()
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r10 = "getResources(...)"
            kotlin.jvm.internal.C17542s.i(r8, r10)
            java.lang.String r10 = r13.getName()
            com.sugarcube.core.network.models.RoomType r6 = r6.getRoom(r8, r10)
        L_0x04e6:
            T r4 = r4.f144348a
            java.lang.String r4 = (java.lang.String) r4
            OE.e r8 = r7.f122819b
            java.lang.String r8 = r8.b()
            java.lang.String r10 = "com.ingka.ikea"
            r12 = 2
            r13 = 0
            r14 = 0
            boolean r8 = HJ.C15854t.W(r8, r10, r13, r12, r14)
            if (r8 == 0) goto L_0x04fe
            java.lang.String r15 = "ikea"
            goto L_0x04ff
        L_0x04fe:
            r15 = 0
        L_0x04ff:
            com.sugarcube.app.base.data.feature.ConfigRepository r7 = r7.f122822e
            com.sugarcube.app.base.data.feature.ConfigItems$CustomPipeline r8 = com.sugarcube.app.base.data.feature.ConfigItems.CustomPipeline.INSTANCE
            java.lang.Object r7 = r7.getBlocking(r8)
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x0511
            goto L_0x0512
        L_0x0511:
            r7 = 0
        L_0x0512:
            java.lang.String r7 = (java.lang.String) r7
            r58 = r1
            r59 = r2
            r60 = r3
            r61 = r6
            r62 = r11
            r63 = r4
            r64 = r15
            r65 = r7
            com.sugarcube.core.network.models.CreateSceneRequest r1 = r58.newInstance((java.util.UUID) r59, (java.lang.String) r60, (com.sugarcube.core.network.models.RoomType) r61, (com.sugarcube.core.network.models.SessionMeta) r62, (java.lang.String) r63, (java.lang.String) r64, (java.lang.String) r65)
            com.sugarcube.app.base.capture.b$b r2 = new com.sugarcube.app.base.capture.b$b
            r2.<init>(r0, r5, r1)
            return r2
        L_0x052e:
            GK.E r0 = r3.d()
            if (r0 == 0) goto L_0x053a
            java.lang.String r0 = r0.l()
            if (r0 != 0) goto L_0x053c
        L_0x053a:
            java.lang.String r0 = "getOrCreateUpload failed"
        L_0x053c:
            r2.f144348a = r0
            YE.b r0 = YE.C13868b.f118106a
            java.util.UUID r1 = r13.getUuid()
            int r3 = r3.b()
            T r4 = r2.f144348a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            java.lang.String r1 = ": create upload failed ("
            r6.append(r1)
            r6.append(r3)
            java.lang.String r1 = ") "
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = r6.toString()
            YE.e r3 = YE.e.Upload
            r0.b(r1, r3)
            XH.N r0 = XH.C16807N.f139792a
            r10 = r2
            r14 = r5
            goto L_0x0576
        L_0x0570:
            r13 = r58
            r15 = r64
            r14 = r7
            r7 = r9
        L_0x0576:
            YE.b r0 = YE.C13868b.f118106a
            java.util.UUID r1 = r13.getUuid()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ": create upload failed"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            YE.e r2 = YE.e.Upload
            r0.b(r1, r2)
            java.lang.String r0 = r13.getPipelineType()
            java.lang.String r1 = "ULTRAWIDE"
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 == 0) goto L_0x05a1
            java.lang.String r1 = "ULTRAWIDE_LANDSCAPE"
            goto L_0x05a3
        L_0x05a1:
            java.lang.String r1 = "HYBRID"
        L_0x05a3:
            if (r0 == 0) goto L_0x05aa
            java.lang.String r0 = "CAMPANO_ARSCAN_ARSTEP_ARSCAN"
        L_0x05a7:
            r26 = r0
            goto L_0x05ad
        L_0x05aa:
            java.lang.String r0 = "ARPANO_ARSCAN_ARSTEP_ARSCAN"
            goto L_0x05a7
        L_0x05ad:
            OE.q r0 = r7.f122818a
            com.sugarcube.app.base.data.analytics.Analytics r22 = r0.b()
            java.util.UUID r23 = r13.getUuid()
            java.lang.String r24 = r13.getName()
            com.sugarcube.app.base.capture.a$a r0 = com.sugarcube.app.base.capture.a.Companion
            com.sugarcube.app.base.capture.a r0 = r0.a(r1)
            java.lang.String r25 = r0.b()
            T r0 = r10.f144348a
            r31 = r0
            java.lang.String r31 = (java.lang.String) r31
            java.lang.Boolean r33 = kotlin.coroutines.jvm.internal.b.a(r15)
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            java.lang.String r32 = "createUploadSet"
            r22.captureUploadEnd(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            java.time.Instant r0 = java.time.Instant.now()
            r38 = r0
            com.sugarcube.core.network.models.SessionMeta$Companion r34 = com.sugarcube.core.network.models.SessionMeta.Companion
            OE.a r1 = r7.f122820c
            android.content.Context r35 = r1.a()
            OE.q r1 = r7.f122818a
            r36 = r1
            OE.e r1 = r7.f122819b
            r37 = r1
            kotlin.jvm.internal.C17542s.g(r0)
            r55 = 1048544(0xfffe0, float:1.469323E-39)
            r56 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            com.sugarcube.core.network.models.SessionMeta r35 = com.sugarcube.app.base.data.model.SessionMetaKt.newInstance$default(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            com.sugarcube.app.base.capture.b$b r1 = new com.sugarcube.app.base.capture.b$b
            com.sugarcube.core.network.models.CreateSceneRequest$Companion r34 = com.sugarcube.core.network.models.CreateSceneRequest.Companion
            r42 = 110(0x6e, float:1.54E-43)
            r36 = 0
            r37 = 0
            r38 = 0
            r40 = 0
            r39 = r0
            com.sugarcube.core.network.models.CreateSceneRequest r0 = com.sugarcube.core.network.models.CreateSceneRequest.Companion.newInstance$default((com.sugarcube.core.network.models.CreateSceneRequest.Companion) r34, (com.sugarcube.core.network.models.SessionMeta) r35, (java.util.UUID) r36, (java.lang.String) r37, (java.lang.String) r38, (java.time.Instant) r39, (java.lang.String) r40, (java.lang.String) r41, (int) r42, (java.lang.Object) r43)
            r2 = 0
            r1.<init>(r2, r14, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.capture.b.g(com.sugarcube.app.base.data.database.Scene, java.io.File, java.io.File, java.io.File, java.util.UUID, com.sugarcube.core.network.api.NetworkAPIs, boolean, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: dI.e<? super QL.x<com.sugarcube.core.network.models.UploadSetState>>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.sugarcube.core.network.models.UploadProperties} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.util.List<com.sugarcube.core.network.models.UploadURL>} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(com.sugarcube.core.network.api.NetworkAPIs r9, java.util.List<com.sugarcube.core.network.models.UploadURL> r10, java.util.UUID r11, java.util.UUID r12, boolean r13, com.sugarcube.core.network.models.UploadProperties r14, dI.C17164e<? super QL.x<com.sugarcube.core.network.models.UploadSetState>> r15) {
        /*
            r8 = this;
            boolean r0 = r15 instanceof com.sugarcube.app.base.capture.b.d
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.sugarcube.app.base.capture.b$d r0 = (com.sugarcube.app.base.capture.b.d) r0
            int r1 = r0.f122865p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f122865p = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.capture.b$d r0 = new com.sugarcube.app.base.capture.b$d
            r0.<init>(r8, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f122863n
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f122865p
            java.lang.String r4 = ")"
            r5 = 0
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x0083
            if (r3 == r7) goto L_0x0054
            if (r3 != r6) goto L_0x004c
            java.lang.Object r9 = r0.f122858i
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f122857h
            com.sugarcube.core.network.models.UploadProperties r9 = (com.sugarcube.core.network.models.UploadProperties) r9
            java.lang.Object r9 = r0.f122856g
            java.util.UUID r9 = (java.util.UUID) r9
            java.lang.Object r9 = r0.f122855f
            java.util.UUID r9 = (java.util.UUID) r9
            java.lang.Object r10 = r0.f122854e
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r0.f122853d
            com.sugarcube.core.network.api.NetworkAPIs r10 = (com.sugarcube.core.network.api.NetworkAPIs) r10
            java.lang.Object r10 = r0.f122852c
            com.sugarcube.app.base.capture.b r10 = (com.sugarcube.app.base.capture.b) r10
            XH.y.b(r1)
            goto L_0x011e
        L_0x004c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0054:
            boolean r13 = r0.f122861l
            java.lang.Object r9 = r0.f122860k
            java.util.UUID r9 = (java.util.UUID) r9
            java.lang.Object r9 = r0.f122859j
            java.util.UUID r9 = (java.util.UUID) r9
            java.lang.Object r9 = r0.f122858i
            r15 = r9
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r9 = r0.f122857h
            r14 = r9
            com.sugarcube.core.network.models.UploadProperties r14 = (com.sugarcube.core.network.models.UploadProperties) r14
            java.lang.Object r9 = r0.f122856g
            r12 = r9
            java.util.UUID r12 = (java.util.UUID) r12
            java.lang.Object r9 = r0.f122855f
            r11 = r9
            java.util.UUID r11 = (java.util.UUID) r11
            java.lang.Object r9 = r0.f122854e
            r10 = r9
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r9 = r0.f122853d
            com.sugarcube.core.network.api.NetworkAPIs r9 = (com.sugarcube.core.network.api.NetworkAPIs) r9
            java.lang.Object r3 = r0.f122852c
            com.sugarcube.app.base.capture.b r3 = (com.sugarcube.app.base.capture.b) r3
            XH.y.b(r1)
            goto L_0x00a9
        L_0x0083:
            XH.y.b(r1)
            if (r12 == 0) goto L_0x00fa
            r0.f122852c = r8
            r0.f122853d = r9
            r0.f122854e = r10
            r0.f122855f = r11
            r0.f122856g = r12
            r0.f122857h = r14
            r0.f122858i = r15
            r0.f122859j = r12
            r0.f122860k = r12
            r0.f122861l = r13
            r1 = 0
            r0.f122862m = r1
            r0.f122865p = r7
            java.lang.Object r1 = r9.getUploadSetState(r12, r0)
            if (r1 != r2) goto L_0x00a8
            return r2
        L_0x00a8:
            r3 = r8
        L_0x00a9:
            QL.x r1 = (QL.x) r1
            boolean r7 = r1.e()
            if (r7 == 0) goto L_0x00fb
            java.lang.Object r9 = r1.a()
            com.sugarcube.core.network.models.UploadSetState r9 = (com.sugarcube.core.network.models.UploadSetState) r9
            if (r9 == 0) goto L_0x00db
            java.util.List r10 = r9.getUrls()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x00c3:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x00d7
            java.lang.Object r12 = r10.next()
            com.sugarcube.core.network.models.UploadURL r12 = (com.sugarcube.core.network.models.UploadURL) r12
            java.lang.Boolean r13 = r9.getResumable()
            r12.setResumable(r13)
            goto L_0x00c3
        L_0x00d7:
            java.lang.Boolean r5 = r9.getResumable()
        L_0x00db:
            YE.b r9 = YE.C13868b.f118106a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            java.lang.String r11 = ": getUpload (resumable="
            r10.append(r11)
            r10.append(r5)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            YE.e r11 = YE.e.Upload
            r9.b(r10, r11)
            return r1
        L_0x00fa:
            r3 = r8
        L_0x00fb:
            com.sugarcube.core.network.models.CreateUploadSetRequest r1 = new com.sugarcube.core.network.models.CreateUploadSetRequest
            java.lang.String r7 = r11.toString()
            r1.<init>(r10, r7, r13, r14)
            r0.f122852c = r3
            r0.f122853d = r9
            r0.f122854e = r10
            r0.f122855f = r11
            r0.f122856g = r12
            r0.f122857h = r14
            r0.f122858i = r15
            r0.f122861l = r13
            r0.f122865p = r6
            java.lang.Object r1 = r9.createUploadSet(r1, r0)
            if (r1 != r2) goto L_0x011d
            return r2
        L_0x011d:
            r9 = r11
        L_0x011e:
            r10 = r1
            QL.x r10 = (QL.x) r10
            java.lang.Object r10 = r10.a()
            com.sugarcube.core.network.models.UploadSetState r10 = (com.sugarcube.core.network.models.UploadSetState) r10
            if (r10 == 0) goto L_0x014b
            java.util.List r11 = r10.getUrls()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x0133:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0147
            java.lang.Object r12 = r11.next()
            com.sugarcube.core.network.models.UploadURL r12 = (com.sugarcube.core.network.models.UploadURL) r12
            java.lang.Boolean r13 = r10.getResumable()
            r12.setResumable(r13)
            goto L_0x0133
        L_0x0147:
            java.lang.Boolean r5 = r10.getResumable()
        L_0x014b:
            YE.b r10 = YE.C13868b.f118106a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            java.lang.String r9 = ": createUpload (resumable="
            r11.append(r9)
            r11.append(r5)
            r11.append(r4)
            java.lang.String r9 = r11.toString()
            YE.e r11 = YE.e.Upload
            r10.b(r9, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.capture.b.h(com.sugarcube.core.network.api.NetworkAPIs, java.util.List, java.util.UUID, java.util.UUID, boolean, com.sugarcube.core.network.models.UploadProperties, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.util.UUID r6, com.sugarcube.core.network.api.NetworkAPIs r7, dI.C17164e<? super com.sugarcube.core.network.models.UploadSetState> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.sugarcube.app.base.capture.b.e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.sugarcube.app.base.capture.b$e r0 = (com.sugarcube.app.base.capture.b.e) r0
            int r1 = r0.f122872i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f122872i = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.capture.b$e r0 = new com.sugarcube.app.base.capture.b$e
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f122870g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f122872i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r6 = r0.f122869f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f122868e
            com.sugarcube.core.network.api.NetworkAPIs r6 = (com.sugarcube.core.network.api.NetworkAPIs) r6
            java.lang.Object r6 = r0.f122867d
            java.util.UUID r6 = (java.util.UUID) r6
            java.lang.Object r6 = r0.f122866c
            com.sugarcube.app.base.capture.b r6 = (com.sugarcube.app.base.capture.b) r6
            XH.y.b(r1)
            goto L_0x0055
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r1)
            r0.f122866c = r5
            r0.f122867d = r6
            r0.f122868e = r7
            r0.f122869f = r8
            r0.f122872i = r4
            java.lang.Object r1 = r7.getUploadSetState(r6, r0)
            if (r1 != r2) goto L_0x0055
            return r2
        L_0x0055:
            QL.x r1 = (QL.x) r1
            java.lang.Object r6 = r1.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.capture.b.i(java.util.UUID, com.sugarcube.core.network.api.NetworkAPIs, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: com.sugarcube.core.network.models.UploadSetState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: com.sugarcube.core.network.models.UploadSetState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: com.sugarcube.core.network.models.UploadURL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v34, resolved type: com.sugarcube.core.network.models.UploadURL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v35, resolved type: com.sugarcube.core.network.models.UploadURL} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x05be, code lost:
        if (r7.getCompleted() == true) goto L_0x05d3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x05b7  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x059d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(com.sugarcube.core.network.models.UploadSetState r32, java.util.Map<java.lang.String, ? extends java.io.File> r33, com.sugarcube.core.network.api.NetworkAPIs r34, com.sugarcube.app.base.data.database.Scene r35, dI.C17164e<? super com.sugarcube.core.network.models.UploadSetState> r36) {
        /*
            r31 = this;
            r1 = r31
            r0 = r36
            boolean r2 = r0 instanceof com.sugarcube.app.base.capture.b.g
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.sugarcube.app.base.capture.b$g r2 = (com.sugarcube.app.base.capture.b.g) r2
            int r3 = r2.f122906A
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f122906A = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.app.base.capture.b$g r2 = new com.sugarcube.app.base.capture.b$g
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f122929y
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f122906A
            r6 = 3
            java.lang.String r7 = " "
            r8 = 2
            r9 = 1
            if (r5 == 0) goto L_0x013f
            if (r5 == r9) goto L_0x00f4
            if (r5 == r8) goto L_0x00a4
            if (r5 != r6) goto L_0x009c
            int r0 = r2.f122926v
            java.lang.Object r5 = r2.f122925u
            XH.N r5 = (XH.C16807N) r5
            java.lang.Object r10 = r2.f122924t
            GK.z$a r10 = (GK.z.a) r10
            java.lang.Object r11 = r2.f122923s
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r11 = r2.f122922r
            kotlin.jvm.internal.O r11 = (kotlin.jvm.internal.O) r11
            java.lang.Object r12 = r2.f122921q
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r2.f122920p
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r2.f122919o
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r2.f122918n
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r2.f122917m
            com.sugarcube.core.network.models.UploadSetState r12 = (com.sugarcube.core.network.models.UploadSetState) r12
            java.lang.Object r12 = r2.f122916l
            GK.z r12 = (GK.z) r12
            java.lang.Object r13 = r2.f122915k
            kotlin.jvm.internal.O r13 = (kotlin.jvm.internal.O) r13
            java.lang.Object r14 = r2.f122914j
            java.lang.Integer r14 = (java.lang.Integer) r14
            java.lang.Object r15 = r2.f122913i
            java.util.UUID r15 = (java.util.UUID) r15
            java.lang.Object r6 = r2.f122912h
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r8 = r2.f122911g
            com.sugarcube.app.base.data.database.Scene r8 = (com.sugarcube.app.base.data.database.Scene) r8
            java.lang.Object r9 = r2.f122910f
            com.sugarcube.core.network.api.NetworkAPIs r9 = (com.sugarcube.core.network.api.NetworkAPIs) r9
            r32 = r0
            java.lang.Object r0 = r2.f122909e
            java.util.Map r0 = (java.util.Map) r0
            r33 = r0
            java.lang.Object r0 = r2.f122908d
            com.sugarcube.core.network.models.UploadSetState r0 = (com.sugarcube.core.network.models.UploadSetState) r0
            r34 = r0
            java.lang.Object r0 = r2.f122907c
            com.sugarcube.app.base.capture.b r0 = (com.sugarcube.app.base.capture.b) r0
            XH.y.b(r3)
            r1 = r0
            r0 = r4
            r21 = r5
            r4 = r11
            r17 = r15
            r11 = r32
            r5 = r3
            r15 = r9
            r3 = r2
            r9 = r7
            r7 = r14
            r14 = r33
            r2 = r34
            goto L_0x057e
        L_0x009c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x00a4:
            int r0 = r2.f122926v
            java.lang.Object r5 = r2.f122919o
            XH.N r5 = (XH.C16807N) r5
            java.lang.Object r6 = r2.f122918n
            GK.z$a r6 = (GK.z.a) r6
            java.lang.Object r8 = r2.f122916l
            GK.z r8 = (GK.z) r8
            java.lang.Object r9 = r2.f122915k
            kotlin.jvm.internal.O r9 = (kotlin.jvm.internal.O) r9
            java.lang.Object r10 = r2.f122914j
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r11 = r2.f122913i
            java.util.UUID r11 = (java.util.UUID) r11
            java.lang.Object r12 = r2.f122912h
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r13 = r2.f122911g
            com.sugarcube.app.base.data.database.Scene r13 = (com.sugarcube.app.base.data.database.Scene) r13
            java.lang.Object r14 = r2.f122910f
            com.sugarcube.core.network.api.NetworkAPIs r14 = (com.sugarcube.core.network.api.NetworkAPIs) r14
            java.lang.Object r15 = r2.f122909e
            java.util.Map r15 = (java.util.Map) r15
            r32 = r0
            java.lang.Object r0 = r2.f122908d
            com.sugarcube.core.network.models.UploadSetState r0 = (com.sugarcube.core.network.models.UploadSetState) r0
            r33 = r0
            java.lang.Object r0 = r2.f122907c
            com.sugarcube.app.base.capture.b r0 = (com.sugarcube.app.base.capture.b) r0
            XH.y.b(r3)
            r1 = r0
            r17 = r7
            r7 = r11
            r0 = r32
            r11 = r9
            r9 = r4
            r4 = r10
            r10 = r6
            r6 = r12
            r12 = r8
            r8 = r3
            r3 = r2
            r2 = r33
            r29 = r15
            r15 = r14
            r14 = r29
            goto L_0x042e
        L_0x00f4:
            int r0 = r2.f122926v
            java.lang.Object r5 = r2.f122919o
            XH.N r5 = (XH.C16807N) r5
            java.lang.Object r6 = r2.f122918n
            GK.z$a r6 = (GK.z.a) r6
            java.lang.Object r8 = r2.f122917m
            java.lang.Object r9 = r2.f122916l
            GK.z r9 = (GK.z) r9
            java.lang.Object r10 = r2.f122915k
            kotlin.jvm.internal.O r10 = (kotlin.jvm.internal.O) r10
            java.lang.Object r11 = r2.f122914j
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Object r12 = r2.f122913i
            java.util.UUID r12 = (java.util.UUID) r12
            java.lang.Object r13 = r2.f122912h
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r2.f122911g
            com.sugarcube.app.base.data.database.Scene r14 = (com.sugarcube.app.base.data.database.Scene) r14
            java.lang.Object r15 = r2.f122910f
            com.sugarcube.core.network.api.NetworkAPIs r15 = (com.sugarcube.core.network.api.NetworkAPIs) r15
            r32 = r0
            java.lang.Object r0 = r2.f122909e
            java.util.Map r0 = (java.util.Map) r0
            r33 = r0
            java.lang.Object r0 = r2.f122908d
            com.sugarcube.core.network.models.UploadSetState r0 = (com.sugarcube.core.network.models.UploadSetState) r0
            r34 = r0
            java.lang.Object r0 = r2.f122907c
            com.sugarcube.app.base.capture.b r0 = (com.sugarcube.app.base.capture.b) r0
            XH.y.b(r3)
            r1 = r34
            r17 = r7
            r3 = r12
            r7 = r32
            r12 = r9
            r9 = r4
            r4 = r14
            r14 = r33
            goto L_0x03f8
        L_0x013f:
            XH.y.b(r3)
            LF.c r3 = r1.f122825h
            r21 = 6
            r22 = 0
            java.lang.String r18 = "> uploadFiles"
            r19 = 0
            r20 = 0
            r17 = r3
            LF.C13187c.e(r17, r18, r19, r20, r21, r22)
            java.util.UUID r3 = r32.getUuid()
            java.lang.Integer r5 = r32.getUser()
            kotlin.jvm.internal.O r6 = new kotlin.jvm.internal.O
            r6.<init>()
            r8 = r32
            r6.f144348a = r8
            LF.c r9 = r1.f122825h
            r13 = 6
            r14 = 0
            java.lang.String r10 = "> uploadFiles"
            r11 = 0
            r12 = 0
            LF.C13187c.e(r9, r10, r11, r12, r13, r14)
            GK.z$a r9 = new GK.z$a
            r9.<init>()
            VK.a r10 = new VK.a
            r12 = 1
            r10.<init>(r11, r12, r11)
            VE.b r12 = r1.f122823f
            VE.a r12 = r12.b()
            VK.a$a r12 = r12.d()
            r10.d(r12)
            XH.N r12 = XH.C16807N.f139792a
            GK.z$a r13 = r9.a(r10)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MINUTES
            r17 = r12
            r11 = 10
            GK.z$a r11 = r13.e(r11, r14)
            r12 = 2
            GK.z$a r11 = r11.U(r12, r14)
            GK.z r11 = r11.c()
            java.util.List r12 = r32.getUrls()
            java.util.Iterator r12 = r12.iterator()
        L_0x01a9:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0387
            java.lang.Object r10 = r12.next()
            com.sugarcube.core.network.models.UploadURL r10 = (com.sugarcube.core.network.models.UploadURL) r10
            java.lang.Boolean r13 = r32.getResumable()
            r10.setResumable(r13)
            java.lang.String r13 = r10.getPath()
            java.lang.Boolean r14 = r10.isUploaded()
            r16 = 1
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.b.a(r16)
            boolean r14 = kotlin.jvm.internal.C17542s.e(r14, r15)
            if (r14 != 0) goto L_0x036c
            LF.c r14 = r1.f122825h
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "uploadFile >> "
            r15.append(r0)
            r15.append(r13)
            java.lang.String r19 = r15.toString()
            r22 = 6
            r23 = 0
            r20 = 0
            r21 = 0
            r18 = r14
            LF.C13187c.e(r18, r19, r20, r21, r22, r23)
            java.lang.String r0 = r10.getPath()
            r14 = r33
            java.lang.Object r0 = r14.get(r0)
            java.io.File r0 = (java.io.File) r0
            java.lang.String r15 = "uploadFile << "
            if (r0 == 0) goto L_0x0323
            r25 = r2
            YE.b r2 = YE.C13868b.f118106a
            r26 = r5
            java.lang.String r5 = r0.getPath()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            r27 = r9
            java.lang.String r9 = ": upload "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            YE.e r8 = YE.e.Upload
            r2.b(r5, r8)
            java.lang.Boolean r5 = r10.getResumable()
            r28 = r12
            r9 = 1
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.b.a(r9)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r12)
            if (r5 == 0) goto L_0x025c
            java.io.File r5 = new java.io.File
            java.lang.String r9 = r0.getAbsolutePath()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            java.lang.String r9 = ".zip"
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r5.<init>(r9)
            boolean r9 = r5.exists()
            if (r9 == 0) goto L_0x0257
            goto L_0x0260
        L_0x0257:
            java.io.File r5 = r1.j(r0)
            goto L_0x0260
        L_0x025c:
            java.io.File r5 = r1.j(r0)
        L_0x0260:
            if (r5 != 0) goto L_0x0263
            goto L_0x0264
        L_0x0263:
            r0 = r5
        L_0x0264:
            OE.a r9 = r1.f122820c     // Catch:{ all -> 0x029c }
            android.content.Context r9 = r9.a()     // Catch:{ all -> 0x029c }
            android.content.SharedPreferences r9 = r1.m(r9)     // Catch:{ all -> 0x029c }
            boolean r21 = kotlin.jvm.internal.C17542s.e(r0, r5)     // Catch:{ all -> 0x029c }
            kotlin.jvm.internal.C17542s.g(r9)     // Catch:{ all -> 0x029c }
            r18 = r10
            r19 = r11
            r20 = r0
            r22 = r35
            r23 = r9
            com.sugarcube.app.base.network.models.UploadFileResult r0 = com.sugarcube.app.base.network.models.UploadKt.upload(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x029c }
            boolean r12 = r0.getSuccess()     // Catch:{ all -> 0x029c }
            if (r12 != 0) goto L_0x030c
            GK.D r0 = r0.getLastApiResponse()     // Catch:{ all -> 0x029c }
            java.lang.String r4 = r10.getPath()     // Catch:{ all -> 0x029c }
            if (r0 == 0) goto L_0x029f
            int r10 = r0.g()     // Catch:{ all -> 0x029c }
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.b.e(r10)     // Catch:{ all -> 0x029c }
            goto L_0x02a0
        L_0x029c:
            r0 = move-exception
            goto L_0x0319
        L_0x029f:
            r10 = 0
        L_0x02a0:
            if (r0 == 0) goto L_0x02ad
            GK.E r11 = r0.c()     // Catch:{ all -> 0x029c }
            if (r11 == 0) goto L_0x02ad
            java.lang.String r11 = r11.l()     // Catch:{ all -> 0x029c }
            goto L_0x02ae
        L_0x02ad:
            r11 = 0
        L_0x02ae:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x029c }
            r12.<init>()     // Catch:{ all -> 0x029c }
            r12.append(r3)     // Catch:{ all -> 0x029c }
            java.lang.String r3 = ": upload file failed "
            r12.append(r3)     // Catch:{ all -> 0x029c }
            r12.append(r4)     // Catch:{ all -> 0x029c }
            r12.append(r7)     // Catch:{ all -> 0x029c }
            r12.append(r10)     // Catch:{ all -> 0x029c }
            r12.append(r7)     // Catch:{ all -> 0x029c }
            r12.append(r11)     // Catch:{ all -> 0x029c }
            java.lang.String r3 = r12.toString()     // Catch:{ all -> 0x029c }
            r2.b(r3, r8)     // Catch:{ all -> 0x029c }
            r2 = r35
            r1.e(r2)     // Catch:{ all -> 0x029c }
            java.util.UUID r2 = r35.getUuid()     // Catch:{ all -> 0x029c }
            com.sugarcube.app.base.network.models.UploadKt.clearGoogleSessionIds(r9, r2)     // Catch:{ all -> 0x029c }
            LF.c r2 = r1.f122825h     // Catch:{ all -> 0x029c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x029c }
            r3.<init>()     // Catch:{ all -> 0x029c }
            r3.append(r15)     // Catch:{ all -> 0x029c }
            r3.append(r13)     // Catch:{ all -> 0x029c }
            r3.append(r7)     // Catch:{ all -> 0x029c }
            r3.append(r0)     // Catch:{ all -> 0x029c }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x029c }
            r3 = 2
            r8 = 0
            LF.C13187c.h(r2, r0, r8, r3, r8)     // Catch:{ all -> 0x029c }
            LF.c r0 = r1.f122825h     // Catch:{ all -> 0x029c }
            java.lang.String r2 = "< uploadFiles"
            LF.C13187c.h(r0, r2, r8, r3, r8)     // Catch:{ all -> 0x029c }
            T r0 = r6.f144348a     // Catch:{ all -> 0x029c }
            if (r5 == 0) goto L_0x030b
            boolean r2 = r5.delete()
            kotlin.coroutines.jvm.internal.b.a(r2)
        L_0x030b:
            return r0
        L_0x030c:
            r2 = r35
            r8 = 0
            if (r5 == 0) goto L_0x034d
            boolean r0 = r5.delete()
            kotlin.coroutines.jvm.internal.b.a(r0)
            goto L_0x034d
        L_0x0319:
            if (r5 == 0) goto L_0x0322
            boolean r2 = r5.delete()
            kotlin.coroutines.jvm.internal.b.a(r2)
        L_0x0322:
            throw r0
        L_0x0323:
            r25 = r2
            r26 = r5
            r27 = r9
            r28 = r12
            r8 = 0
            r2 = r35
            YE.b r0 = YE.C13868b.f118106a
            java.lang.String r5 = r10.getPath()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            java.lang.String r12 = ": local file to upload not found "
            r9.append(r12)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            YE.e r9 = YE.e.Upload
            r0.b(r5, r9)
        L_0x034d:
            LF.c r0 = r1.f122825h
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r15)
            r5.append(r13)
            java.lang.String r19 = r5.toString()
            r22 = 6
            r23 = 0
            r20 = 0
            r21 = 0
            r18 = r0
            LF.C13187c.e(r18, r19, r20, r21, r22, r23)
            goto L_0x0379
        L_0x036c:
            r14 = r33
            r25 = r2
            r26 = r5
            r27 = r9
            r28 = r12
            r8 = 0
            r2 = r35
        L_0x0379:
            r8 = r32
            r0 = r36
            r2 = r25
            r5 = r26
            r9 = r27
            r12 = r28
            goto L_0x01a9
        L_0x0387:
            r14 = r33
            r25 = r2
            r26 = r5
            r27 = r9
            r2 = r35
            r0 = r32
            r5 = r36
            r18 = r4
            r13 = r6
            r12 = r11
            r9 = r17
            r8 = r25
            r15 = r26
            r6 = r1
            r1 = r3
            r17 = r7
            r11 = r10
            r10 = r27
            r7 = 1
            r3 = r2
            r2 = r34
        L_0x03aa:
            r4 = 4
            if (r7 >= r4) goto L_0x05d3
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r19 = r9
            r20 = r10
            r9 = 3
            long r9 = r4.toMillis(r9)
            r8.f122907c = r6
            r8.f122908d = r0
            r8.f122909e = r14
            r8.f122910f = r2
            r8.f122911g = r3
            r8.f122912h = r5
            r8.f122913i = r1
            r8.f122914j = r15
            r8.f122915k = r13
            r8.f122916l = r12
            r8.f122917m = r11
            r4 = r20
            r8.f122918n = r4
            r20 = r0
            r0 = r19
            r8.f122919o = r0
            r8.f122926v = r7
            r0 = 1
            r8.f122906A = r0
            java.lang.Object r0 = QJ.C16297b0.b(r9, r8)
            r9 = r18
            if (r0 != r9) goto L_0x03e7
            return r9
        L_0x03e7:
            r0 = r6
            r10 = r13
            r6 = r4
            r13 = r5
            r5 = r19
            r4 = r3
            r3 = r1
            r1 = r20
            r29 = r15
            r15 = r2
            r2 = r8
            r8 = r11
            r11 = r29
        L_0x03f8:
            r2.f122907c = r0
            r2.f122908d = r1
            r2.f122909e = r14
            r2.f122910f = r15
            r2.f122911g = r4
            r2.f122912h = r13
            r2.f122913i = r3
            r2.f122914j = r11
            r2.f122915k = r10
            r2.f122916l = r12
            r2.f122917m = r8
            r2.f122918n = r6
            r2.f122919o = r5
            r2.f122926v = r7
            r8 = 2
            r2.f122906A = r8
            java.lang.Object r8 = r15.getUploadSetState(r3, r2)
            if (r8 != r9) goto L_0x041e
            return r9
        L_0x041e:
            r29 = r1
            r1 = r0
            r0 = r7
            r7 = r3
            r3 = r2
            r2 = r29
            r30 = r13
            r13 = r4
            r4 = r11
            r11 = r10
            r10 = r6
            r6 = r30
        L_0x042e:
            QL.x r8 = (QL.x) r8
            java.lang.Object r8 = r8.a()
            com.sugarcube.core.network.models.UploadSetState r8 = (com.sugarcube.core.network.models.UploadSetState) r8
            if (r8 == 0) goto L_0x059d
            r18 = r9
            java.util.List r9 = r8.getUrls()
            if (r9 == 0) goto L_0x0591
            r19 = r9
            java.lang.Iterable r19 = (java.lang.Iterable) r19
            r20 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r21 = r5
            java.util.Iterator r5 = r19.iterator()
        L_0x0451:
            boolean r19 = r5.hasNext()
            r22 = r10
            if (r19 == 0) goto L_0x04f8
            java.lang.Object r10 = r5.next()
            r33 = r5
            r5 = r10
            com.sugarcube.core.network.models.UploadURL r5 = (com.sugarcube.core.network.models.UploadURL) r5
            r34 = r9
            java.lang.Boolean r9 = r5.isUploaded()
            r35 = r8
            r16 = 1
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r16)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r9, r8)
            if (r8 != 0) goto L_0x04a8
            YE.b r8 = YE.C13868b.f118106a
            java.lang.Boolean r9 = r5.isUploaded()
            r19 = r12
            java.lang.String r12 = r5.getPath()
            r23 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            r24 = r6
            java.lang.String r6 = ": isUploaded="
            r11.append(r6)
            r11.append(r9)
            r9 = r17
            r11.append(r9)
            r11.append(r12)
            java.lang.String r6 = r11.toString()
            YE.e r11 = YE.e.Upload
            r8.b(r6, r11)
            goto L_0x04b0
        L_0x04a8:
            r24 = r6
            r23 = r11
            r19 = r12
            r9 = r17
        L_0x04b0:
            java.lang.Boolean r6 = r5.isUploaded()
            r8 = 1
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r8)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r11)
            if (r6 == 0) goto L_0x04c7
            boolean r6 = r5.getCompleted()
            if (r6 != 0) goto L_0x04c7
            r12 = r8
            goto L_0x04c8
        L_0x04c7:
            r12 = 0
        L_0x04c8:
            r5.setCompleted(r8)
            OE.a r5 = r1.f122820c
            android.content.Context r5 = r5.a()
            android.content.SharedPreferences r5 = r1.m(r5)
            java.lang.String r6 = "uploadSharedPreferences(...)"
            kotlin.jvm.internal.C17542s.i(r5, r6)
            java.util.UUID r6 = r13.getUuid()
            com.sugarcube.app.base.network.models.UploadKt.clearGoogleSessionIds(r5, r6)
            if (r12 == 0) goto L_0x04e6
            r0.add(r10)
        L_0x04e6:
            r5 = r33
            r8 = r35
            r17 = r9
            r12 = r19
            r10 = r22
            r11 = r23
            r6 = r24
            r9 = r34
            goto L_0x0451
        L_0x04f8:
            r33 = r5
            r24 = r6
            r35 = r8
            r34 = r9
            r23 = r11
            r19 = r12
            r9 = r17
            YE.b r5 = YE.C13868b.f118106a
            int r6 = r0.size()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r10 = ": uploadNotify count="
            r8.append(r10)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            YE.e r8 = YE.e.Upload
            r5.b(r6, r8)
            com.sugarcube.core.network.models.UpdateUploadSetRequest r5 = new com.sugarcube.core.network.models.UpdateUploadSetRequest
            r5.<init>(r0, r4)
            r3.f122907c = r1
            r3.f122908d = r2
            r3.f122909e = r14
            r3.f122910f = r15
            r3.f122911g = r13
            r12 = r24
            r3.f122912h = r12
            r3.f122913i = r7
            r3.f122914j = r4
            r10 = r23
            r3.f122915k = r10
            r8 = r19
            r3.f122916l = r8
            r6 = r35
            r3.f122917m = r6
            r6 = r34
            r3.f122918n = r6
            r3.f122919o = r0
            r3.f122920p = r0
            r3.f122921q = r0
            r3.f122922r = r10
            r0 = r33
            r3.f122923s = r0
            r6 = r22
            r3.f122924t = r6
            r0 = r21
            r3.f122925u = r0
            r11 = r20
            r3.f122926v = r11
            r0 = 0
            r3.f122927w = r0
            r3.f122928x = r0
            r0 = 3
            r3.f122906A = r0
            java.lang.Object r5 = r15.uploadNotify(r7, r5, r3)
            r0 = r18
            if (r5 != r0) goto L_0x0575
            return r0
        L_0x0575:
            r17 = r7
            r7 = r4
            r4 = r10
            r10 = r6
            r6 = r12
            r12 = r8
            r8 = r13
            r13 = r4
        L_0x057e:
            QL.x r5 = (QL.x) r5
            java.lang.Object r5 = r5.a()
            r4.f144348a = r5
            r5 = r6
            r4 = r7
            r6 = r1
            r1 = r17
            r29 = r8
            r8 = r3
            r3 = r29
            goto L_0x05af
        L_0x0591:
            r21 = r5
            r8 = r12
            r9 = r17
            r12 = r6
            r6 = r10
            r10 = r11
            r11 = r0
            r0 = r18
            goto L_0x05a7
        L_0x059d:
            r21 = r5
            r8 = r12
            r12 = r6
            r6 = r10
            r10 = r11
            r11 = r0
            r0 = r9
            r9 = r17
        L_0x05a7:
            r5 = r12
            r12 = r8
            r8 = r3
            r3 = r13
            r13 = r10
            r10 = r6
            r6 = r1
            r1 = r7
        L_0x05af:
            T r7 = r13.f144348a
            com.sugarcube.core.network.models.UploadSetState r7 = (com.sugarcube.core.network.models.UploadSetState) r7
            r18 = r0
            if (r7 == 0) goto L_0x05c1
            boolean r0 = r7.getCompleted()
            r32 = r1
            r1 = 1
            if (r0 != r1) goto L_0x05c4
            goto L_0x05d3
        L_0x05c1:
            r32 = r1
            r1 = 1
        L_0x05c4:
            int r0 = r11 + 1
            r1 = r32
            r11 = r7
            r17 = r9
            r9 = r21
            r7 = r0
            r0 = r2
            r2 = r15
            r15 = r4
            goto L_0x03aa
        L_0x05d3:
            LF.c r0 = r6.f122825h
            r4 = 6
            r5 = 0
            java.lang.String r1 = "< uploadFiles"
            r2 = 0
            r3 = 0
            LF.C13187c.e(r0, r1, r2, r3, r4, r5)
            T r0 = r13.f144348a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.capture.b.l(com.sugarcube.core.network.models.UploadSetState, java.util.Map, com.sugarcube.core.network.api.NetworkAPIs, com.sugarcube.app.base.data.database.Scene, dI.e):java.lang.Object");
    }

    private final SharedPreferences m(Context context) {
        return context.getSharedPreferences("UPLOAD", 0);
    }

    public final void e(Scene scene) {
        C17542s.j(scene, "scene");
        File file = new File(this.f122824g.e(scene.getUuid()), "upload_id.txt");
        boolean delete = file.delete();
        C13868b bVar = C13868b.f118106a;
        UUID uuid = scene.getUuid();
        String path = file.getPath();
        bVar.b(uuid + ": delete(" + delete + ") " + path, YE.e.Upload);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        jI.C17416c.a(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File j(java.io.File r7) {
        /*
            r6 = this;
            java.lang.String r0 = "unzippedFile"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "json"
            java.lang.String r1 = "txt"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.Set r0 = YH.g0.h(r0)
            java.lang.String r1 = jI.C17423j.s(r7)
            boolean r0 = r0.contains(r1)
            r1 = 0
            if (r0 != 0) goto L_0x001d
            return r1
        L_0x001d:
            java.lang.String r0 = r7.getAbsolutePath()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ".zip"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r7)
            r2.<init>(r3)
            java.util.zip.GZIPOutputStream r7 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0071 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0071 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0071 }
            r4.<init>(r0)     // Catch:{ all -> 0x0071 }
            r3.<init>(r4)     // Catch:{ all -> 0x0071 }
            r7.<init>(r3)     // Catch:{ all -> 0x0071 }
            r3 = 2048(0x800, float:2.87E-42)
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x005a }
        L_0x004f:
            int r4 = r2.read(r3)     // Catch:{ all -> 0x005a }
            if (r4 <= 0) goto L_0x005c
            r5 = 0
            r7.write(r3, r5, r4)     // Catch:{ all -> 0x005a }
            goto L_0x004f
        L_0x005a:
            r0 = move-exception
            goto L_0x0073
        L_0x005c:
            XH.N r3 = XH.C16807N.f139792a     // Catch:{ all -> 0x005a }
            jI.C17416c.a(r7, r1)     // Catch:{ all -> 0x0071 }
            jI.C17416c.a(r2, r1)
            java.io.File r7 = new java.io.File
            r7.<init>(r0)
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x0070
            r1 = r7
        L_0x0070:
            return r1
        L_0x0071:
            r7 = move-exception
            goto L_0x0079
        L_0x0073:
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r1 = move-exception
            jI.C17416c.a(r7, r0)     // Catch:{ all -> 0x0071 }
            throw r1     // Catch:{ all -> 0x0071 }
        L_0x0079:
            throw r7     // Catch:{ all -> 0x007a }
        L_0x007a:
            r0 = move-exception
            jI.C17416c.a(r2, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.capture.b.j(java.io.File):java.io.File");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: com.sugarcube.core.network.models.UploadSetState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: com.sugarcube.core.network.models.UploadSetState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v11, resolved type: com.sugarcube.core.network.models.UploadSetState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v12, resolved type: com.sugarcube.core.network.models.UploadSetState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v13, resolved type: com.sugarcube.core.network.models.UploadSetState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v14, resolved type: com.sugarcube.core.network.models.UploadSetState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v8, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x077f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0814  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0817  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0696 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0697  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x06c9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0743  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0748  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0751  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0756  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x075f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(com.sugarcube.app.base.data.database.Scene r58, com.sugarcube.app.base.capture.UploadProgressListener r59, com.sugarcube.core.network.api.NetworkAPIs r60, dI.C17164e<? super com.sugarcube.core.network.models.SceneResponse> r61) {
        /*
            r57 = this;
            r10 = r57
            r11 = r61
            boolean r0 = r11 instanceof com.sugarcube.app.base.capture.b.f
            if (r0 == 0) goto L_0x0018
            r0 = r11
            com.sugarcube.app.base.capture.b$f r0 = (com.sugarcube.app.base.capture.b.f) r0
            int r1 = r0.f122881I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.f122881I = r1
        L_0x0016:
            r12 = r0
            goto L_0x001e
        L_0x0018:
            com.sugarcube.app.base.capture.b$f r0 = new com.sugarcube.app.base.capture.b$f
            r0.<init>(r10, r11)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r12.f122879G
            java.lang.Object r13 = eI.C17187b.f()
            int r1 = r12.f122881I
            java.lang.String r14 = ") "
            java.lang.String r15 = "HYBRID"
            r9 = 4
            r8 = 3
            r7 = 2
            r5 = 1
            if (r1 == 0) goto L_0x029c
            if (r1 == r5) goto L_0x0222
            if (r1 == r7) goto L_0x0170
            if (r1 == r8) goto L_0x00ae
            if (r1 != r9) goto L_0x00a6
            java.lang.Object r1 = r12.f122874B
            com.sugarcube.core.network.models.UploadSetState r1 = (com.sugarcube.core.network.models.UploadSetState) r1
            java.lang.Object r1 = r12.f122873A
            com.sugarcube.core.network.models.UploadSetState r1 = (com.sugarcube.core.network.models.UploadSetState) r1
            java.lang.Object r1 = r12.f122905z
            com.sugarcube.core.network.models.UploadSetState r1 = (com.sugarcube.core.network.models.UploadSetState) r1
            java.lang.Object r1 = r12.f122904y
            com.sugarcube.core.network.models.UploadSetState r1 = (com.sugarcube.core.network.models.UploadSetState) r1
            java.lang.Object r1 = r12.f122903x
            com.sugarcube.core.network.models.UploadSetState r1 = (com.sugarcube.core.network.models.UploadSetState) r1
            java.lang.Object r1 = r12.f122902w
            com.sugarcube.core.network.models.CreateSceneRequest r1 = (com.sugarcube.core.network.models.CreateSceneRequest) r1
            java.lang.Object r1 = r12.f122901v
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r12.f122900u
            com.sugarcube.core.network.models.UploadSetState r1 = (com.sugarcube.core.network.models.UploadSetState) r1
            java.lang.Object r2 = r12.f122899t
            com.sugarcube.app.base.capture.b$b r2 = (com.sugarcube.app.base.capture.b.C3025b) r2
            java.lang.Object r2 = r12.f122897r
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r2 = r12.f122896q
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r2 = r12.f122895p
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r2 = r12.f122894o
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r2 = r12.f122893n
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r2 = r12.f122892m
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r3 = r12.f122891l
            kotlin.jvm.internal.O r3 = (kotlin.jvm.internal.O) r3
            java.lang.Object r5 = r12.f122890k
            kotlin.jvm.internal.M r5 = (kotlin.jvm.internal.M) r5
            java.lang.Object r7 = r12.f122889j
            kotlin.jvm.internal.O r7 = (kotlin.jvm.internal.O) r7
            java.lang.Object r8 = r12.f122888i
            java.util.UUID r8 = (java.util.UUID) r8
            java.lang.Object r9 = r12.f122887h
            kotlin.jvm.internal.O r9 = (kotlin.jvm.internal.O) r9
            java.lang.Object r11 = r12.f122886g
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r12.f122885f
            com.sugarcube.core.network.api.NetworkAPIs r11 = (com.sugarcube.core.network.api.NetworkAPIs) r11
            java.lang.Object r11 = r12.f122884e
            com.sugarcube.app.base.capture.UploadProgressListener r11 = (com.sugarcube.app.base.capture.UploadProgressListener) r11
            java.lang.Object r11 = r12.f122883d
            com.sugarcube.app.base.data.database.Scene r11 = (com.sugarcube.app.base.data.database.Scene) r11
            java.lang.Object r12 = r12.f122882c
            com.sugarcube.app.base.capture.b r12 = (com.sugarcube.app.base.capture.b) r12
            XH.y.b(r0)
            r23 = r14
            r22 = r15
            r4 = 0
            goto L_0x0737
        L_0x00a6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x00ae:
            int r1 = r12.f122877E
            int r2 = r12.f122876D
            boolean r3 = r12.f122875C
            java.lang.Object r5 = r12.f122904y
            com.sugarcube.core.network.models.UploadSetState r5 = (com.sugarcube.core.network.models.UploadSetState) r5
            java.lang.Object r7 = r12.f122903x
            com.sugarcube.core.network.models.UploadSetState r7 = (com.sugarcube.core.network.models.UploadSetState) r7
            java.lang.Object r8 = r12.f122902w
            com.sugarcube.core.network.models.CreateSceneRequest r8 = (com.sugarcube.core.network.models.CreateSceneRequest) r8
            java.lang.Object r11 = r12.f122901v
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r6 = r12.f122900u
            com.sugarcube.core.network.models.UploadSetState r6 = (com.sugarcube.core.network.models.UploadSetState) r6
            java.lang.Object r9 = r12.f122899t
            com.sugarcube.app.base.capture.b$b r9 = (com.sugarcube.app.base.capture.b.C3025b) r9
            java.lang.Object r4 = r12.f122898s
            r58 = r1
            java.lang.Object r1 = r12.f122897r
            java.io.File r1 = (java.io.File) r1
            r59 = r1
            java.lang.Object r1 = r12.f122896q
            java.io.File r1 = (java.io.File) r1
            r60 = r1
            java.lang.Object r1 = r12.f122895p
            java.io.File r1 = (java.io.File) r1
            r61 = r1
            java.lang.Object r1 = r12.f122894o
            java.io.File r1 = (java.io.File) r1
            r19 = r1
            java.lang.Object r1 = r12.f122893n
            java.io.File r1 = (java.io.File) r1
            r20 = r1
            java.lang.Object r1 = r12.f122892m
            java.io.File r1 = (java.io.File) r1
            r21 = r1
            java.lang.Object r1 = r12.f122891l
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            r22 = r1
            java.lang.Object r1 = r12.f122890k
            kotlin.jvm.internal.M r1 = (kotlin.jvm.internal.M) r1
            r23 = r1
            java.lang.Object r1 = r12.f122889j
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            r24 = r1
            java.lang.Object r1 = r12.f122888i
            java.util.UUID r1 = (java.util.UUID) r1
            r25 = r1
            java.lang.Object r1 = r12.f122887h
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            r26 = r1
            java.lang.Object r1 = r12.f122886g
            dI.e r1 = (dI.C17164e) r1
            r27 = r1
            java.lang.Object r1 = r12.f122885f
            com.sugarcube.core.network.api.NetworkAPIs r1 = (com.sugarcube.core.network.api.NetworkAPIs) r1
            r28 = r1
            java.lang.Object r1 = r12.f122884e
            com.sugarcube.app.base.capture.UploadProgressListener r1 = (com.sugarcube.app.base.capture.UploadProgressListener) r1
            r29 = r1
            java.lang.Object r1 = r12.f122883d
            com.sugarcube.app.base.data.database.Scene r1 = (com.sugarcube.app.base.data.database.Scene) r1
            r30 = r1
            java.lang.Object r1 = r12.f122882c
            com.sugarcube.app.base.capture.b r1 = (com.sugarcube.app.base.capture.b) r1
            XH.y.b(r0)
            r16 = r58
            r17 = r2
            r49 = r7
            r50 = r8
            r51 = r9
            r52 = r11
            r11 = r21
            r10 = r24
            r8 = r25
            r9 = r26
            r2 = r29
            r7 = r30
            r26 = r59
            r25 = r4
            r21 = r6
            r24 = r13
            r4 = r19
            r13 = r27
            r27 = r60
            r6 = r1
            r19 = r3
            r3 = r20
            r1 = r28
            r20 = r5
            r5 = r61
            r53 = r23
            r23 = r14
            r14 = r53
            r54 = r22
            r22 = r15
            r15 = r54
            goto L_0x06c5
        L_0x0170:
            int r1 = r12.f122877E
            int r2 = r12.f122876D
            boolean r3 = r12.f122875C
            java.lang.Object r4 = r12.f122905z
            java.util.UUID r4 = (java.util.UUID) r4
            java.lang.Object r4 = r12.f122904y
            com.sugarcube.core.network.models.UploadSetState r4 = (com.sugarcube.core.network.models.UploadSetState) r4
            java.lang.Object r6 = r12.f122903x
            com.sugarcube.core.network.models.UploadSetState r6 = (com.sugarcube.core.network.models.UploadSetState) r6
            java.lang.Object r7 = r12.f122902w
            com.sugarcube.core.network.models.CreateSceneRequest r7 = (com.sugarcube.core.network.models.CreateSceneRequest) r7
            java.lang.Object r9 = r12.f122901v
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r11 = r12.f122900u
            com.sugarcube.core.network.models.UploadSetState r11 = (com.sugarcube.core.network.models.UploadSetState) r11
            java.lang.Object r8 = r12.f122899t
            com.sugarcube.app.base.capture.b$b r8 = (com.sugarcube.app.base.capture.b.C3025b) r8
            java.lang.Object r5 = r12.f122898s
            r21 = r1
            java.lang.Object r1 = r12.f122897r
            java.io.File r1 = (java.io.File) r1
            r58 = r1
            java.lang.Object r1 = r12.f122896q
            java.io.File r1 = (java.io.File) r1
            r59 = r1
            java.lang.Object r1 = r12.f122895p
            java.io.File r1 = (java.io.File) r1
            r60 = r1
            java.lang.Object r1 = r12.f122894o
            java.io.File r1 = (java.io.File) r1
            r61 = r1
            java.lang.Object r1 = r12.f122893n
            java.io.File r1 = (java.io.File) r1
            r22 = r1
            java.lang.Object r1 = r12.f122892m
            java.io.File r1 = (java.io.File) r1
            r23 = r1
            java.lang.Object r1 = r12.f122891l
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            r24 = r1
            java.lang.Object r1 = r12.f122890k
            kotlin.jvm.internal.M r1 = (kotlin.jvm.internal.M) r1
            r25 = r1
            java.lang.Object r1 = r12.f122889j
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            r26 = r1
            java.lang.Object r1 = r12.f122888i
            java.util.UUID r1 = (java.util.UUID) r1
            r27 = r1
            java.lang.Object r1 = r12.f122887h
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            r28 = r1
            java.lang.Object r1 = r12.f122886g
            dI.e r1 = (dI.C17164e) r1
            r29 = r1
            java.lang.Object r1 = r12.f122885f
            com.sugarcube.core.network.api.NetworkAPIs r1 = (com.sugarcube.core.network.api.NetworkAPIs) r1
            r30 = r1
            java.lang.Object r1 = r12.f122884e
            com.sugarcube.app.base.capture.UploadProgressListener r1 = (com.sugarcube.app.base.capture.UploadProgressListener) r1
            r31 = r1
            java.lang.Object r1 = r12.f122883d
            com.sugarcube.app.base.data.database.Scene r1 = (com.sugarcube.app.base.data.database.Scene) r1
            r32 = r1
            java.lang.Object r1 = r12.f122882c
            com.sugarcube.app.base.capture.b r1 = (com.sugarcube.app.base.capture.b) r1
            XH.y.b(r0)
            r10 = r59
            r20 = r61
            r16 = r9
            r17 = r11
            r19 = r22
            r11 = r30
            r9 = r8
            r22 = r15
            r30 = r26
            r26 = r60
            r15 = r6
            r8 = r7
            r7 = r21
            r21 = r25
            r25 = r58
            r6 = r2
            r2 = r13
            r13 = r29
            r29 = r1
            r1 = r27
            r53 = r23
            r23 = r14
            r14 = r53
            goto L_0x0571
        L_0x0222:
            boolean r1 = r12.f122875C
            java.lang.Object r2 = r12.f122897r
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r3 = r12.f122896q
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r4 = r12.f122895p
            java.io.File r4 = (java.io.File) r4
            java.lang.Object r5 = r12.f122894o
            java.io.File r5 = (java.io.File) r5
            java.lang.Object r6 = r12.f122893n
            java.io.File r6 = (java.io.File) r6
            java.lang.Object r8 = r12.f122892m
            java.io.File r8 = (java.io.File) r8
            java.lang.Object r9 = r12.f122891l
            kotlin.jvm.internal.O r9 = (kotlin.jvm.internal.O) r9
            java.lang.Object r11 = r12.f122890k
            kotlin.jvm.internal.M r11 = (kotlin.jvm.internal.M) r11
            java.lang.Object r7 = r12.f122889j
            kotlin.jvm.internal.O r7 = (kotlin.jvm.internal.O) r7
            r22 = r1
            java.lang.Object r1 = r12.f122888i
            java.util.UUID r1 = (java.util.UUID) r1
            r58 = r1
            java.lang.Object r1 = r12.f122887h
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            r59 = r1
            java.lang.Object r1 = r12.f122886g
            dI.e r1 = (dI.C17164e) r1
            r60 = r1
            java.lang.Object r1 = r12.f122885f
            com.sugarcube.core.network.api.NetworkAPIs r1 = (com.sugarcube.core.network.api.NetworkAPIs) r1
            r61 = r1
            java.lang.Object r1 = r12.f122884e
            com.sugarcube.app.base.capture.UploadProgressListener r1 = (com.sugarcube.app.base.capture.UploadProgressListener) r1
            r23 = r1
            java.lang.Object r1 = r12.f122883d
            com.sugarcube.app.base.data.database.Scene r1 = (com.sugarcube.app.base.data.database.Scene) r1
            r24 = r1
            java.lang.Object r1 = r12.f122882c
            com.sugarcube.app.base.capture.b r1 = (com.sugarcube.app.base.capture.b) r1
            XH.y.b(r0)
            r40 = r3
            r39 = r4
            r38 = r5
            r37 = r6
            r6 = r7
            r36 = r8
            r41 = r22
            r8 = r24
            r3 = r58
            r4 = r59
            r5 = r1
            r7 = r2
            r1 = r9
            r2 = r11
            r24 = r13
            r22 = r15
            r9 = r23
            r15 = 2
            r13 = r60
            r11 = r61
            r23 = r14
            r14 = r0
            goto L_0x0433
        L_0x029c:
            XH.y.b(r0)
            LF.c r0 = r10.f122825h
            r29 = 6
            r30 = 0
            java.lang.String r26 = "> upload"
            r27 = 0
            r28 = 0
            r25 = r0
            LF.C13187c.e(r25, r26, r27, r28, r29, r30)
            kotlin.jvm.internal.O r9 = new kotlin.jvm.internal.O
            r9.<init>()
            java.util.UUID r8 = r58.getUuid()
            kotlin.jvm.internal.O r7 = new kotlin.jvm.internal.O
            r7.<init>()
            kotlin.jvm.internal.M r6 = new kotlin.jvm.internal.M
            r6.<init>()
            kotlin.jvm.internal.O r5 = new kotlin.jvm.internal.O
            r5.<init>()
            KF.a r0 = r10.f122824g
            java.util.UUID r1 = r58.getUuid()
            java.io.File r4 = r0.e(r1)
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "pano_preview.jpg"
            r3.<init>(r4, r0)
            java.io.File r2 = new java.io.File
            java.lang.String r0 = "pano_alignment.jpg"
            r2.<init>(r4, r0)
            java.io.File r1 = new java.io.File
            java.lang.String r0 = "pano_alignment.heif"
            r1.<init>(r4, r0)
            r22 = r15
            java.io.File r15 = new java.io.File
            java.lang.String r0 = "automatic_log.txt"
            r15.<init>(r4, r0)
            r23 = r14
            java.io.File r14 = new java.io.File
            java.lang.String r0 = "upload_id.txt"
            r14.<init>(r4, r0)
            com.sugarcube.app.base.data.feature.ConfigRepository r0 = r10.f122822e
            r24 = r13
            com.sugarcube.app.base.data.feature.FeatureFlags$ResumableUploads r13 = com.sugarcube.app.base.data.feature.FeatureFlags.ResumableUploads.INSTANCE
            boolean r13 = r0.isEnabledBlocking(r13)
            YE.b r0 = YE.C13868b.f118106a
            r25 = r15
            java.lang.String r15 = r4.getPath()
            r26 = r1
            java.util.UUID r1 = r58.getUpload()
            r27 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r28 = r4
            java.lang.String r4 = ": upload "
            r3.append(r4)
            r3.append(r15)
            java.lang.String r4 = " resumable="
            r3.append(r4)
            r3.append(r13)
            java.lang.String r4 = " "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            YE.e r3 = YE.e.Upload
            r0.b(r1, r3)
            r1 = 1
            r4 = 0
            java.lang.String r15 = jI.C17423j.i(r14, r4, r1, r4)     // Catch:{ all -> 0x035c }
            java.lang.CharSequence r1 = HJ.C15854t.z1(r15)     // Catch:{ all -> 0x035c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x035c }
            if (r1 == 0) goto L_0x035f
            int r15 = r1.length()     // Catch:{ all -> 0x035c }
            if (r15 != 0) goto L_0x0355
            goto L_0x035f
        L_0x0355:
            java.util.UUID r15 = java.util.UUID.fromString(r1)     // Catch:{ all -> 0x035c }
            r7.f144348a = r15     // Catch:{ all -> 0x035c }
            goto L_0x035f
        L_0x035c:
            r0 = move-exception
            r1 = r0
            goto L_0x037d
        L_0x035f:
            T r15 = r7.f144348a     // Catch:{ all -> 0x035c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x035c }
            r4.<init>()     // Catch:{ all -> 0x035c }
            r4.append(r8)     // Catch:{ all -> 0x035c }
            r29 = r1
            java.lang.String r1 = ": resume upload "
            r4.append(r1)     // Catch:{ all -> 0x035c }
            r4.append(r15)     // Catch:{ all -> 0x035c }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x035c }
            r0.b(r1, r3)     // Catch:{ all -> 0x035c }
            r1 = r29
            goto L_0x039c
        L_0x037d:
            YE.b r0 = YE.C13868b.f118106a
            java.lang.String r3 = r1.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            java.lang.String r15 = ": no upload to resume "
            r4.append(r15)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            YE.e r4 = YE.e.Upload
            r0.b(r3, r4)
        L_0x039c:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x03a4
            r0 = r2
            goto L_0x03a6
        L_0x03a4:
            r0 = r26
        L_0x03a6:
            T r3 = r7.f144348a
            r15 = r3
            java.util.UUID r15 = (java.util.UUID) r15
            r12.f122882c = r10
            r4 = r58
            r12.f122883d = r4
            r3 = r59
            r12.f122884e = r3
            r10 = r60
            r12.f122885f = r10
            r12.f122886g = r11
            r12.f122887h = r9
            r12.f122888i = r8
            r12.f122889j = r7
            r12.f122890k = r6
            r12.f122891l = r5
            r4 = r28
            r12.f122892m = r4
            r3 = r27
            r12.f122893n = r3
            r12.f122894o = r2
            r27 = r2
            r2 = r26
            r12.f122895p = r2
            r10 = r25
            r12.f122896q = r10
            r12.f122897r = r14
            r12.f122898s = r1
            r12.f122875C = r13
            r1 = 1
            r12.f122881I = r1
            r20 = r1
            r25 = r2
            r1 = r57
            r26 = r27
            r2 = r58
            r27 = r3
            r3 = r10
            r18 = r4
            r28 = r10
            r10 = 0
            r4 = r27
            r20 = r5
            r5 = r0
            r16 = r6
            r6 = r15
            r21 = r7
            r15 = 2
            r7 = r60
            r19 = r8
            r8 = r13
            r17 = r9
            r9 = r12
            java.lang.Object r0 = r1.g(r2, r3, r4, r5, r6, r7, r8, r9)
            r7 = r24
            if (r0 != r7) goto L_0x0410
            return r7
        L_0x0410:
            r5 = r57
            r8 = r58
            r9 = r59
            r24 = r7
            r41 = r13
            r7 = r14
            r2 = r16
            r4 = r17
            r36 = r18
            r3 = r19
            r1 = r20
            r6 = r21
            r39 = r25
            r38 = r26
            r37 = r27
            r40 = r28
            r14 = r0
            r13 = r11
            r11 = r60
        L_0x0433:
            r10 = r14
            com.sugarcube.app.base.capture.b$b r10 = (com.sugarcube.app.base.capture.b.C3025b) r10
            com.sugarcube.core.network.models.UploadSetState r15 = r10.a()
            r58 = r14
            java.util.Map r14 = r10.b()
            r59 = r14
            com.sugarcube.core.network.models.CreateSceneRequest r14 = r10.c()
            if (r15 == 0) goto L_0x0817
            java.util.UUID r0 = r15.getUuid()
            r6.f144348a = r0
            java.util.UUID r0 = r15.getUuid()
            com.sugarcube.core.network.models.SessionMeta r16 = r14.getSessionMeta()
            java.lang.String r16 = r16.getPanoConfiguration()
            r60 = r10
            if (r16 != 0) goto L_0x0461
            r10 = r22
            goto L_0x0463
        L_0x0461:
            r10 = r16
        L_0x0463:
            com.sugarcube.core.network.models.SessionMeta r16 = r14.getSessionMeta()
            r61 = r14
            java.lang.String r14 = r16.getCaptureStrategy()
            r16 = r1
            java.lang.Boolean r1 = r15.getResumable()
            r9.uploadCreated(r0, r10, r14, r1)
            T r0 = r6.f144348a
            r1 = r0
            java.util.UUID r1 = (java.util.UUID) r1
            if (r1 == 0) goto L_0x04d2
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04ad }
            java.lang.String r10 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r0, r10)     // Catch:{ all -> 0x04ad }
            r10 = 2
            r14 = 0
            jI.C17423j.l(r7, r0, r14, r10, r14)     // Catch:{ all -> 0x04ad }
            YE.b r0 = YE.C13868b.f118106a     // Catch:{ all -> 0x04ad }
            T r10 = r6.f144348a     // Catch:{ all -> 0x04ad }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ad }
            r14.<init>()     // Catch:{ all -> 0x04ad }
            r14.append(r3)     // Catch:{ all -> 0x04ad }
            r17 = r1
            java.lang.String r1 = ": save upload "
            r14.append(r1)     // Catch:{ all -> 0x04ab }
            r14.append(r10)     // Catch:{ all -> 0x04ab }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x04ab }
            YE.e r10 = YE.e.Upload     // Catch:{ all -> 0x04ab }
            r0.b(r1, r10)     // Catch:{ all -> 0x04ab }
            goto L_0x04cf
        L_0x04ab:
            r0 = move-exception
            goto L_0x04b0
        L_0x04ad:
            r0 = move-exception
            r17 = r1
        L_0x04b0:
            YE.b r1 = YE.C13868b.f118106a
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            java.lang.String r14 = ": not able to save upload "
            r10.append(r14)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            YE.e r10 = YE.e.Upload
            r1.b(r0, r10)
        L_0x04cf:
            XH.N r0 = XH.C16807N.f139792a
            goto L_0x04d4
        L_0x04d2:
            r17 = r1
        L_0x04d4:
            YE.a r0 = r5.f122821d
            r10 = r40
            r0.b(r10)
            boolean r0 = r15.getCompleted()
            if (r0 != 0) goto L_0x05d6
            r12.f122882c = r5
            r12.f122883d = r8
            r12.f122884e = r9
            r12.f122885f = r11
            r12.f122886g = r13
            r12.f122887h = r4
            r12.f122888i = r3
            r12.f122889j = r6
            r12.f122890k = r2
            r1 = r16
            r12.f122891l = r1
            r14 = r36
            r12.f122892m = r14
            r16 = r9
            r9 = r37
            r12.f122893n = r9
            r19 = r9
            r9 = r38
            r12.f122894o = r9
            r20 = r9
            r9 = r39
            r12.f122895p = r9
            r12.f122896q = r10
            r12.f122897r = r7
            r25 = r7
            r7 = r58
            r12.f122898s = r7
            r7 = r60
            r12.f122899t = r7
            r12.f122900u = r15
            r7 = r59
            r12.f122901v = r7
            r26 = r9
            r9 = r61
            r12.f122902w = r9
            r12.f122903x = r15
            r12.f122904y = r15
            r27 = r1
            r1 = r17
            r12.f122905z = r1
            r1 = r41
            r12.f122875C = r1
            r9 = 0
            r12.f122876D = r9
            r12.f122877E = r9
            r9 = 2
            r12.f122881I = r9
            r17 = r1
            r9 = r27
            r1 = r5
            r21 = r2
            r2 = r15
            r27 = r3
            r3 = r7
            r28 = r4
            r4 = r11
            r29 = r5
            r5 = r8
            r30 = r6
            r6 = r12
            java.lang.Object r0 = r1.l(r2, r3, r4, r5, r6)
            r2 = r24
            if (r0 != r2) goto L_0x055a
            return r2
        L_0x055a:
            r5 = r58
            r32 = r8
            r24 = r9
            r4 = r15
            r31 = r16
            r3 = r17
            r1 = r27
            r6 = 0
            r9 = r60
            r8 = r61
            r16 = r7
            r17 = r4
            r7 = 0
        L_0x0571:
            com.sugarcube.core.network.models.UploadSetState r0 = (com.sugarcube.core.network.models.UploadSetState) r0
            r58 = r3
            if (r0 == 0) goto L_0x0583
            boolean r3 = r0.getCompleted()
            r59 = r4
            r4 = 1
            if (r3 != r4) goto L_0x0585
            r60 = r0
            goto L_0x059f
        L_0x0583:
            r59 = r4
        L_0x0585:
            YE.b r3 = YE.C13868b.f118106a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r60 = r0
            java.lang.String r0 = ": file upload not complete"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            YE.e r4 = YE.e.Upload
            r3.b(r0, r4)
        L_0x059f:
            r42 = r6
            r43 = r7
            r45 = r8
            r46 = r9
            r6 = r14
            r44 = r15
            r47 = r16
            r48 = r17
            r3 = r19
            r4 = r20
            r8 = r21
            r9 = r24
            r20 = r25
            r15 = r28
            r14 = r29
            r7 = r30
            r0 = r31
            r16 = r58
            r58 = r59
            r17 = r60
            r24 = r2
            r19 = r5
            r21 = r10
            r5 = r26
            r2 = r32
            r53 = r11
            r11 = r1
            r1 = r53
            goto L_0x0625
        L_0x05d6:
            r21 = r2
            r27 = r3
            r28 = r4
            r29 = r5
            r30 = r6
            r25 = r7
            r1 = r17
            r14 = r36
            r19 = r37
            r20 = r38
            r26 = r39
            r17 = r41
            r7 = r59
            r53 = r16
            r16 = r9
            r9 = r53
            r46 = r60
            r45 = r61
            r47 = r7
            r2 = r8
            r6 = r14
            r44 = r15
            r48 = r44
            r0 = r16
            r16 = r17
            r3 = r19
            r4 = r20
            r8 = r21
            r20 = r25
            r5 = r26
            r14 = r29
            r7 = r30
            r42 = 0
            r43 = 0
            r19 = r58
            r17 = r1
            r21 = r10
            r1 = r11
            r58 = r48
            r11 = r27
            r15 = r28
        L_0x0625:
            java.util.UUID r10 = r58.getUuid()
            r12.f122882c = r14
            r12.f122883d = r2
            r12.f122884e = r0
            r12.f122885f = r1
            r12.f122886g = r13
            r12.f122887h = r15
            r12.f122888i = r11
            r12.f122889j = r7
            r12.f122890k = r8
            r12.f122891l = r9
            r12.f122892m = r6
            r12.f122893n = r3
            r12.f122894o = r4
            r12.f122895p = r5
            r25 = r0
            r0 = r21
            r12.f122896q = r0
            r0 = r20
            r12.f122897r = r0
            r0 = r19
            r12.f122898s = r0
            r0 = r46
            r12.f122899t = r0
            r26 = r0
            r0 = r48
            r12.f122900u = r0
            r27 = r0
            r0 = r47
            r12.f122901v = r0
            r28 = r0
            r0 = r45
            r12.f122902w = r0
            r29 = r0
            r0 = r44
            r12.f122903x = r0
            r30 = r0
            r0 = r58
            r12.f122904y = r0
            r31 = r0
            r0 = r17
            r12.f122905z = r0
            r0 = r16
            r12.f122875C = r0
            r0 = r42
            r12.f122876D = r0
            r17 = r0
            r0 = r43
            r12.f122877E = r0
            r32 = r2
            r2 = 3
            r12.f122881I = r2
            java.lang.Object r2 = r14.i(r10, r1, r12)
            r10 = r24
            if (r2 != r10) goto L_0x0697
            return r10
        L_0x0697:
            r24 = r10
            r51 = r26
            r52 = r28
            r50 = r29
            r49 = r30
            r10 = r7
            r26 = r20
            r20 = r31
            r7 = r32
            r53 = r16
            r16 = r0
            r0 = r2
            r2 = r25
            r25 = r19
            r19 = r53
            r54 = r11
            r11 = r6
            r6 = r14
            r14 = r8
            r8 = r54
            r55 = r15
            r15 = r9
            r9 = r55
            r56 = r27
            r27 = r21
            r21 = r56
        L_0x06c5:
            com.sugarcube.core.network.models.UploadSetState r0 = (com.sugarcube.core.network.models.UploadSetState) r0
            if (r0 == 0) goto L_0x0814
            boolean r28 = r0.getCompleted()
            if (r28 == 0) goto L_0x0808
            r12.f122882c = r6
            r12.f122883d = r7
            r12.f122884e = r2
            r12.f122885f = r1
            r12.f122886g = r13
            r12.f122887h = r9
            r12.f122888i = r8
            r12.f122889j = r10
            r12.f122890k = r14
            r12.f122891l = r15
            r12.f122892m = r11
            r12.f122893n = r3
            r12.f122894o = r4
            r12.f122895p = r5
            r2 = r27
            r12.f122896q = r2
            r2 = r26
            r12.f122897r = r2
            r4 = r25
            r12.f122898s = r4
            r2 = r51
            r12.f122899t = r2
            r2 = r21
            r12.f122900u = r2
            r3 = r52
            r12.f122901v = r3
            r3 = r50
            r12.f122902w = r3
            r4 = r49
            r12.f122903x = r4
            r5 = r20
            r12.f122904y = r5
            r12.f122905z = r0
            r12.f122873A = r0
            r12.f122874B = r0
            r0 = r19
            r12.f122875C = r0
            r0 = r17
            r12.f122876D = r0
            r0 = r16
            r12.f122877E = r0
            r4 = 0
            r12.f122878F = r4
            r5 = 4
            r12.f122881I = r5
            java.lang.Object r0 = r1.createScene(r3, r12)
            r1 = r24
            if (r0 != r1) goto L_0x0730
            return r1
        L_0x0730:
            r1 = r2
            r12 = r6
            r2 = r11
            r5 = r14
            r3 = r15
            r11 = r7
            r7 = r10
        L_0x0737:
            QL.x r0 = (QL.x) r0
            java.lang.Object r6 = r0.a()
            r9.f144348a = r6
            com.sugarcube.core.network.models.SceneResponse r6 = (com.sugarcube.core.network.models.SceneResponse) r6
            if (r6 == 0) goto L_0x0748
            int r6 = r6.getSceneId()
            goto L_0x0749
        L_0x0748:
            r6 = r4
        L_0x0749:
            r5.f144346a = r6
            T r4 = r9.f144348a
            com.sugarcube.core.network.models.SceneResponse r4 = (com.sugarcube.core.network.models.SceneResponse) r4
            if (r4 == 0) goto L_0x0756
            java.util.UUID r4 = r4.getSceneUuid()
            goto L_0x0757
        L_0x0756:
            r4 = 0
        L_0x0757:
            r3.f144348a = r4
            boolean r4 = r0.e()
            if (r4 == 0) goto L_0x077f
            T r0 = r9.f144348a
            com.sugarcube.core.network.models.SceneResponse r0 = (com.sugarcube.core.network.models.SceneResponse) r0
            if (r0 == 0) goto L_0x077b
            java.io.File r1 = new java.io.File
            java.lang.String r4 = "mosaic.png"
            r1.<init>(r2, r4)
            KF.a r2 = r12.f122824g
            java.util.UUID r0 = r0.getSceneUuid()
            java.io.File r0 = r2.j(r0)
            r12.f(r1, r0)
            XH.N r0 = XH.C16807N.f139792a
        L_0x077b:
            r13 = r23
            goto L_0x0802
        L_0x077f:
            GK.E r2 = r0.d()
            if (r2 == 0) goto L_0x078b
            java.lang.String r2 = r2.l()
            if (r2 != 0) goto L_0x078d
        L_0x078b:
            java.lang.String r2 = "getUploadSetState failed"
        L_0x078d:
            YE.b r4 = YE.C13868b.f118106a
            int r0 = r0.b()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r10 = ": create scene failed ("
            r6.append(r10)
            r6.append(r0)
            r13 = r23
            r6.append(r13)
            r6.append(r2)
            java.lang.String r0 = r6.toString()
            YE.e r6 = YE.e.Upload
            r4.b(r0, r6)
            java.lang.String r0 = r11.getPipelineType()
            java.lang.String r4 = "ULTRAWIDE"
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r4)
            if (r0 == 0) goto L_0x07c3
            java.lang.String r15 = "ULTRAWIDE_LANDSCAPE"
            goto L_0x07c5
        L_0x07c3:
            r15 = r22
        L_0x07c5:
            if (r0 == 0) goto L_0x07cc
            java.lang.String r0 = "CAMPANO_ARSCAN_ARSTEP_ARSCAN"
        L_0x07c9:
            r28 = r0
            goto L_0x07cf
        L_0x07cc:
            java.lang.String r0 = "ARPANO_ARSCAN_ARSTEP_ARSCAN"
            goto L_0x07c9
        L_0x07cf:
            OE.q r0 = r12.f122818a
            com.sugarcube.app.base.data.analytics.Analytics r24 = r0.b()
            java.lang.String r26 = r11.getName()
            com.sugarcube.app.base.capture.a$a r0 = com.sugarcube.app.base.capture.a.Companion
            com.sugarcube.app.base.capture.a r0 = r0.a(r15)
            java.lang.String r27 = r0.b()
            T r0 = r3.f144348a
            r29 = r0
            java.util.UUID r29 = (java.util.UUID) r29
            int r0 = r5.f144346a
            T r4 = r7.f144348a
            r31 = r4
            java.util.UUID r31 = (java.util.UUID) r31
            java.lang.String r34 = "upload"
            java.lang.Boolean r35 = r1.getResumable()
            r32 = 0
            r25 = r8
            r30 = r0
            r33 = r2
            r24.captureUploadEnd(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x0802:
            r15 = r3
            r14 = r5
            r10 = r7
            r7 = r11
            r6 = r12
            goto L_0x080a
        L_0x0808:
            r13 = r23
        L_0x080a:
            XH.N r0 = XH.C16807N.f139792a
        L_0x080c:
            r5 = r6
            r3 = r8
            r4 = r9
            r6 = r10
            r2 = r14
            r1 = r15
            r8 = r7
            goto L_0x0824
        L_0x0814:
            r13 = r23
            goto L_0x080c
        L_0x0817:
            r9 = r1
            r21 = r2
            r27 = r3
            r28 = r4
            r29 = r5
            r30 = r6
            r13 = r23
        L_0x0824:
            YE.b r0 = YE.C13868b.f118106a
            T r6 = r6.f144348a
            T r1 = r1.f144348a
            int r2 = r2.f144346a
            java.lang.String r7 = r8.getName()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            java.lang.String r9 = ": upload done c="
            r8.append(r9)
            r8.append(r3)
            java.lang.String r3 = " u="
            r8.append(r3)
            r8.append(r6)
            java.lang.String r3 = " s="
            r8.append(r3)
            r8.append(r1)
            java.lang.String r1 = " ("
            r8.append(r1)
            r8.append(r2)
            r8.append(r13)
            r8.append(r7)
            java.lang.String r1 = r8.toString()
            YE.e r2 = YE.e.Upload
            r0.b(r1, r2)
            LF.c r6 = r5.f122825h
            r10 = 6
            r11 = 0
            java.lang.String r7 = "< upload"
            r8 = 0
            r9 = 0
            LF.C13187c.e(r6, r7, r8, r9, r10, r11)
            T r0 = r4.f144348a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.capture.b.k(com.sugarcube.app.base.data.database.Scene, com.sugarcube.app.base.capture.UploadProgressListener, com.sugarcube.core.network.api.NetworkAPIs, dI.e):java.lang.Object");
    }
}
