package com.sugarcube.app.base.data;

import QJ.Q;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.sugarcube.app.base.data.database.SceneState;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.SceneRepository$hasPendingUploads$2", f = "SceneRepository.kt", l = {}, m = "invokeSuspend")
final class SceneRepository$hasPendingUploads$2 extends l implements p<Q, C17164e<? super Boolean>, Object> {
    int label;
    final /* synthetic */ SceneRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SceneRepository$hasPendingUploads$2(SceneRepository sceneRepository, C17164e<? super SceneRepository$hasPendingUploads$2> eVar) {
        super(2, eVar);
        this.this$0 = sceneRepository;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new SceneRepository$hasPendingUploads$2(this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
        return ((SceneRepository$hasPendingUploads$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        C17187b.f();
        if (this.label == 0) {
            y.b(obj);
            return b.a(!this.this$0.getDatabase().getDatabaseSceneDao().getWithEntitiesNow((List<? extends SceneState>) C16877v.h(SceneState.UPLOAD_PENDING)).isEmpty());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
