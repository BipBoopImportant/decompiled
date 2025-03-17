package com.sugarcube.app.base.data;

import IJ.C15906b;
import QJ.Q;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.SceneRepository$startRefresh$4", f = "SceneRepository.kt", l = {430}, m = "invokeSuspend")
final class SceneRepository$startRefresh$4 extends l implements p<Q, C17164e<? super C16807N>, Object> {
    final /* synthetic */ C15906b $minTimeBetweenRefresh;
    int label;
    final /* synthetic */ SceneRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SceneRepository$startRefresh$4(C15906b bVar, SceneRepository sceneRepository, C17164e<? super SceneRepository$startRefresh$4> eVar) {
        super(2, eVar);
        this.$minTimeBetweenRefresh = bVar;
        this.this$0 = sceneRepository;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new SceneRepository$startRefresh$4(this.$minTimeBetweenRefresh, this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
        return ((SceneRepository$startRefresh$4) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            if (this.$minTimeBetweenRefresh == null || System.currentTimeMillis() - this.this$0.lastRefreshTs > C15906b.K(this.$minTimeBetweenRefresh.f0())) {
                SceneRepository sceneRepository = this.this$0;
                this.label = 1;
                if (sceneRepository.doRefresh(this) == f10) {
                    return f10;
                }
            }
        } else if (i10 == 1) {
            y.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C16807N.f139792a;
    }
}
