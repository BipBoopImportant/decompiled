package KF;

import LF.C13187c;
import QJ.Q;
import XH.C16807N;
import XH.y;
import com.sugarcube.app.base.data.ISceneRepository;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LKF/r;", "", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "Lcom/sugarcube/app/base/data/ISceneRepository;", "sceneRepository", "LKF/e;", "uploadDatabase", "LLF/c;", "logger", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/app/base/data/ISceneRepository;LKF/e;LLF/c;)V", "", "b", "()Z", "a", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "Lcom/sugarcube/app/base/data/ISceneRepository;", "c", "LKF/e;", "d", "LLF/c;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: KF.r  reason: case insensitive filesystem */
public final class C13164r {

    /* renamed from: a  reason: collision with root package name */
    private final ConfigRepository f111744a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ISceneRepository f111745b;

    /* renamed from: c  reason: collision with root package name */
    private final C13151e f111746c;

    /* renamed from: d  reason: collision with root package name */
    private final C13187c f111747d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.upload.UploadVersion$uploadV2Allowed$v1UploadsPending$1", f = "UploadVersion.kt", l = {51}, m = "invokeSuspend")
    /* renamed from: KF.r$a */
    static final class a extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111748c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13164r f111749d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C13164r rVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f111749d = rVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f111749d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f111748c;
            if (i10 == 0) {
                y.b(obj);
                ISceneRepository a10 = this.f111749d.f111745b;
                this.f111748c = 1;
                obj = a10.hasPendingUploads(this);
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

    public C13164r(ConfigRepository configRepository, ISceneRepository iSceneRepository, C13151e eVar, C13187c cVar) {
        C17542s.j(configRepository, "configRepository");
        C17542s.j(iSceneRepository, "sceneRepository");
        C17542s.j(eVar, "uploadDatabase");
        C17542s.j(cVar, "logger");
        this.f111744a = configRepository;
        this.f111745b = iSceneRepository;
        this.f111746c = eVar;
        this.f111747d = cVar;
    }

    public final boolean b() {
        if (!this.f111744a.isEnabledBlocking(FeatureFlags.UploadsV2.INSTANCE)) {
            return false;
        }
        if (!this.f111746c.getAllUploadSets().isEmpty() || !((Boolean) C16312j.b((C17168i) null, new a(this, (C17164e<? super a>) null), 1, (Object) null)).booleanValue()) {
            return true;
        }
        C13187c.e(this.f111747d, "V1 uploads still pending", (C13187c.a) null, (Throwable) null, 6, (Object) null);
        return false;
    }
}
