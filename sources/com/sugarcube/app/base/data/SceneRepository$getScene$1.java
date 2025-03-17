package com.sugarcube.app.base.data;

import dI.C17164e;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.SceneRepository", f = "SceneRepository.kt", l = {384, 384}, m = "getScene")
final class SceneRepository$getScene$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SceneRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SceneRepository$getScene$1(SceneRepository sceneRepository, C17164e<? super SceneRepository$getScene$1> eVar) {
        super(eVar);
        this.this$0 = sceneRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getScene((UUID) null, this);
    }
}
