package com.sugarcube.app.base.data;

import QJ.Q;
import XH.C16807N;
import XH.y;
import android.util.Log;
import androidx.work.Q;
import androidx.work.S;
import com.sugarcube.app.base.capture.UploadWorker;
import com.sugarcube.app.base.capture.a;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.database.SceneState;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import eI.C17187b;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.SceneRepository$scheduleForUpload$2", f = "SceneRepository.kt", l = {335}, m = "invokeSuspend")
final class SceneRepository$scheduleForUpload$2 extends l implements p<Q, C17164e<? super C16807N>, Object> {
    final /* synthetic */ Scene $scene;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ SceneRepository this$0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.work.Q$c[] r0 = androidx.work.Q.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.work.Q$c r1 = androidx.work.Q.c.FAILED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.work.Q$c r1 = androidx.work.Q.c.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.work.Q$c r1 = androidx.work.Q.c.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.work.Q$c r1 = androidx.work.Q.c.ENQUEUED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.SceneRepository$scheduleForUpload$2.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SceneRepository$scheduleForUpload$2(Scene scene, SceneRepository sceneRepository, C17164e<? super SceneRepository$scheduleForUpload$2> eVar) {
        super(2, eVar);
        this.$scene = scene;
        this.this$0 = sceneRepository;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new SceneRepository$scheduleForUpload$2(this.$scene, this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
        return ((SceneRepository$scheduleForUpload$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        O o10;
        String str2;
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            UUID uuid = this.$scene.getUuid();
            UUID workerId = this.$scene.getWorkerId();
            String name = this.$scene.getState().name();
            Log.d(AnyKt.SUGARCUBE_TAG, "Capture.Upload.Schedule uuid=" + uuid + ",workerId=" + workerId + ",state=" + name);
            O o11 = new O();
            T workerId2 = this.$scene.getWorkerId();
            o11.f144348a = workerId2;
            if (workerId2 != null) {
                SceneRepository sceneRepository = this.this$0;
                Scene scene = this.$scene;
                S a10 = S.f45094a.a(sceneRepository.appContext);
                androidx.work.Q q10 = a10.j(workerId2).get();
                if (q10 != null) {
                    T t10 = o11.f144348a;
                    Q.c b10 = q10.b();
                    int a11 = q10.a();
                    Log.d(AnyKt.SUGARCUBE_TAG, "workerId[" + t10 + "] state=" + b10 + ",runAttemptCount=" + a11);
                    int i11 = WhenMappings.$EnumSwitchMapping$0[q10.b().ordinal()];
                    if (i11 == 1 || i11 == 2 || i11 == 3) {
                        if (sceneRepository.setWorkerId(scene.getUuid(), (UUID) null, scene.getState()) != null) {
                            o11.f144348a = null;
                        }
                    } else if (i11 == 4 && scene.getState() == SceneState.UPLOAD_PENDING) {
                        a10.c(workerId2);
                        o11.f144348a = null;
                    }
                }
            }
            if (this.this$0.userRepo.isLoggedIn().getValue().booleanValue() && o11.f144348a == null && this.$scene.getState() != SceneState.UPLOAD_FAILED) {
                boolean e10 = C17542s.e(this.$scene.getPipelineType(), "ULTRAWIDE");
                String str3 = e10 ? "ULTRAWIDE_LANDSCAPE" : "HYBRID";
                str = e10 ? "CAMPANO_ARSCAN_ARSTEP_ARSCAN" : "ARPANO_ARSCAN_ARSTEP_ARSCAN";
                SceneRepository sceneRepository2 = this.this$0;
                this.L$0 = o11;
                this.L$1 = str3;
                this.L$2 = str;
                this.Z$0 = e10;
                this.label = 1;
                Object access$allowCapturesToUpload = sceneRepository2.allowCapturesToUpload(this);
                if (access$allowCapturesToUpload == f10) {
                    return f10;
                }
                o10 = o11;
                obj = access$allowCapturesToUpload;
                str2 = str3;
            }
            return C16807N.f139792a;
        } else if (i10 == 1) {
            str2 = (String) this.L$1;
            o10 = (O) this.L$0;
            y.b(obj);
            str = (String) this.L$2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!((Boolean) obj).booleanValue()) {
            return C16807N.f139792a;
        }
        Analytics b11 = this.this$0.getSugarcube().b();
        UUID uuid2 = this.$scene.getUuid();
        String name2 = this.$scene.getName();
        a.C3024a aVar = a.Companion;
        b11.captureUploadStart(uuid2, name2, aVar.a(str2).b(), str);
        o10.f144348a = UploadWorker.f122778w.c(this.$scene.getUuid(), this.this$0.appContext);
        this.this$0.setWorkerId(this.$scene.getUuid(), (UUID) o10.f144348a, SceneState.UPLOAD_PENDING);
        this.this$0.getSugarcube().b().captureUploadQueueWork(this.$scene.getUuid(), this.$scene.getName(), aVar.a(str2).b(), str, (UUID) o10.f144348a);
        return C16807N.f139792a;
    }
}
