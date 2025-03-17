package KF;

import QL.x;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.sugarcube.app.base.network.ApiResponse;
import com.sugarcube.app.base.network.NetworkClient;
import com.sugarcube.app.base.upload.IUploadApi;
import com.sugarcube.core.network.api.NetworkAPIs;
import com.sugarcube.core.network.models.CreateSceneRequest;
import com.sugarcube.core.network.models.CreateUploadSetRequest;
import com.sugarcube.core.network.models.SceneResponse;
import com.sugarcube.core.network.models.UpdateUploadSetRequest;
import com.sugarcube.core.network.models.UploadSetState;
import com.sugarcube.core.network.models.UploadURL;
import dI.C17164e;
import eI.C17187b;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010\r\u001a\u00020\u0014H@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LKF/d;", "Lcom/sugarcube/app/base/upload/IUploadApi;", "Lcom/sugarcube/app/base/network/NetworkClient;", "networkClient", "<init>", "(Lcom/sugarcube/app/base/network/NetworkClient;)V", "Ljava/util/UUID;", "uploadUUID", "Lcom/sugarcube/app/base/network/ApiResponse;", "Lcom/sugarcube/core/network/models/UploadSetState;", "getUploadSetState", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CreateUploadSetRequest;", "request", "createUploadSet", "(Lcom/sugarcube/core/network/models/CreateUploadSetRequest;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/UploadURL;", "updateUploadURL", "uploadNotify", "(Lcom/sugarcube/core/network/models/UploadURL;Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CreateSceneRequest;", "Lcom/sugarcube/core/network/models/SceneResponse;", "createScene", "(Lcom/sugarcube/core/network/models/CreateSceneRequest;LdI/e;)Ljava/lang/Object;", "a", "Lcom/sugarcube/app/base/network/NetworkClient;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: KF.d  reason: case insensitive filesystem */
public final class C13150d implements IUploadApi {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final NetworkClient f111654a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQL/x;", "Lcom/sugarcube/core/network/models/SceneResponse;", "<anonymous>", "()LQL/x;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.upload.UploadApi$createScene$2", f = "UploadApi.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: KF.d$a */
    static final class a extends l implements C17642l<C17164e<? super x<SceneResponse>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111655c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13150d f111656d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateSceneRequest f111657e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C13150d dVar, CreateSceneRequest createSceneRequest, C17164e<? super a> eVar) {
            super(1, eVar);
            this.f111656d = dVar;
            this.f111657e = createSceneRequest;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new a(this.f111656d, this.f111657e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super x<SceneResponse>> eVar) {
            return ((a) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f111655c;
            if (i10 == 0) {
                y.b(obj);
                NetworkAPIs api = this.f111656d.f111654a.api();
                CreateSceneRequest createSceneRequest = this.f111657e;
                this.f111655c = 1;
                obj = api.createScene(createSceneRequest, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQL/x;", "Lcom/sugarcube/core/network/models/UploadSetState;", "<anonymous>", "()LQL/x;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.upload.UploadApi$createUploadSet$2", f = "UploadApi.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: KF.d$b */
    static final class b extends l implements C17642l<C17164e<? super x<UploadSetState>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111658c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13150d f111659d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CreateUploadSetRequest f111660e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C13150d dVar, CreateUploadSetRequest createUploadSetRequest, C17164e<? super b> eVar) {
            super(1, eVar);
            this.f111659d = dVar;
            this.f111660e = createUploadSetRequest;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new b(this.f111659d, this.f111660e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super x<UploadSetState>> eVar) {
            return ((b) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f111658c;
            if (i10 == 0) {
                y.b(obj);
                NetworkAPIs api = this.f111659d.f111654a.api();
                CreateUploadSetRequest createUploadSetRequest = this.f111660e;
                this.f111658c = 1;
                obj = api.createUploadSet(createUploadSetRequest, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQL/x;", "Lcom/sugarcube/core/network/models/UploadSetState;", "<anonymous>", "()LQL/x;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.upload.UploadApi$getUploadSetState$2", f = "UploadApi.kt", l = {39}, m = "invokeSuspend")
    /* renamed from: KF.d$c */
    static final class c extends l implements C17642l<C17164e<? super x<UploadSetState>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111661c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13150d f111662d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UUID f111663e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C13150d dVar, UUID uuid, C17164e<? super c> eVar) {
            super(1, eVar);
            this.f111662d = dVar;
            this.f111663e = uuid;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new c(this.f111662d, this.f111663e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super x<UploadSetState>> eVar) {
            return ((c) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f111661c;
            if (i10 == 0) {
                y.b(obj);
                NetworkAPIs api = this.f111662d.f111654a.api();
                UUID uuid = this.f111663e;
                this.f111661c = 1;
                obj = api.getUploadSetState(uuid, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQL/x;", "Lcom/sugarcube/core/network/models/UploadSetState;", "<anonymous>", "()LQL/x;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.upload.UploadApi$uploadNotify$2", f = "UploadApi.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: KF.d$d  reason: collision with other inner class name */
    static final class C2724d extends l implements C17642l<C17164e<? super x<UploadSetState>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111664c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13150d f111665d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UUID f111666e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ UploadURL f111667f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2724d(C13150d dVar, UUID uuid, UploadURL uploadURL, C17164e<? super C2724d> eVar) {
            super(1, eVar);
            this.f111665d = dVar;
            this.f111666e = uuid;
            this.f111667f = uploadURL;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new C2724d(this.f111665d, this.f111666e, this.f111667f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super x<UploadSetState>> eVar) {
            return ((C2724d) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f111664c;
            if (i10 == 0) {
                y.b(obj);
                NetworkAPIs api = this.f111665d.f111654a.api();
                UUID uuid = this.f111666e;
                UpdateUploadSetRequest updateUploadSetRequest = new UpdateUploadSetRequest(C16877v.e(this.f111667f), (Integer) null, 2, (DefaultConstructorMarker) null);
                this.f111664c = 1;
                obj = api.uploadNotify(uuid, updateUploadSetRequest, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public C13150d(NetworkClient networkClient) {
        C17542s.j(networkClient, "networkClient");
        this.f111654a = networkClient;
    }

    public Object createScene(CreateSceneRequest createSceneRequest, C17164e<? super ApiResponse<SceneResponse>> eVar) {
        return ApiResponse.Companion.call(new a(this, createSceneRequest, (C17164e<? super a>) null), eVar);
    }

    public Object createUploadSet(CreateUploadSetRequest createUploadSetRequest, C17164e<? super ApiResponse<UploadSetState>> eVar) {
        return ApiResponse.Companion.call(new b(this, createUploadSetRequest, (C17164e<? super b>) null), eVar);
    }

    public Object getUploadSetState(UUID uuid, C17164e<? super ApiResponse<UploadSetState>> eVar) {
        return ApiResponse.Companion.call(new c(this, uuid, (C17164e<? super c>) null), eVar);
    }

    public Object uploadNotify(UploadURL uploadURL, UUID uuid, C17164e<? super ApiResponse<UploadSetState>> eVar) {
        return ApiResponse.Companion.call(new C2724d(this, uuid, uploadURL, (C17164e<? super C2724d>) null), eVar);
    }
}
