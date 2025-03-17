package com.sugarcube.app.base.data;

import QJ.Q;
import XH.C16807N;
import XH.y;
import YE.C13868b;
import YE.e;
import com.sugarcube.app.base.capture.UploadWorker;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.SceneRepository$clearCache$2", f = "SceneRepository.kt", l = {}, m = "invokeSuspend")
final class SceneRepository$clearCache$2 extends l implements p<Q, C17164e<? super C16807N>, Object> {
    int label;
    final /* synthetic */ SceneRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SceneRepository$clearCache$2(SceneRepository sceneRepository, C17164e<? super SceneRepository$clearCache$2> eVar) {
        super(2, eVar);
        this.this$0 = sceneRepository;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new SceneRepository$clearCache$2(this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
        return ((SceneRepository$clearCache$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        C17187b.f();
        if (this.label == 0) {
            y.b(obj);
            C13868b.f118106a.b("clear scene cache", e.Gallery);
            this.this$0.getDatabase().getDatabaseSceneDao().deleteAllScenesNotInState(new ArrayList());
            UploadWorker.f122778w.a(this.this$0.appContext);
            return C16807N.f139792a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
