package com.sugarcube.app.base.data.feature;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.feature.OptimizelyRepository", f = "OptimizelyRepository.kt", l = {129}, m = "buildAttributes")
final class OptimizelyRepository$buildAttributes$1 extends d {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OptimizelyRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OptimizelyRepository$buildAttributes$1(OptimizelyRepository optimizelyRepository, C17164e<? super OptimizelyRepository$buildAttributes$1> eVar) {
        super(eVar);
        this.this$0 = optimizelyRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.buildAttributes(this);
    }
}
