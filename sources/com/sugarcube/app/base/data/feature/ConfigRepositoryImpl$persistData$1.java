package com.sugarcube.app.base.data.feature;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.feature.ConfigRepositoryImpl", f = "ConfigRepository.kt", l = {206, 207}, m = "persistData")
final class ConfigRepositoryImpl$persistData$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConfigRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConfigRepositoryImpl$persistData$1(ConfigRepositoryImpl configRepositoryImpl, C17164e<? super ConfigRepositoryImpl$persistData$1> eVar) {
        super(eVar);
        this.this$0 = configRepositoryImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.persistData((ConfigItem<?>) null, this);
    }
}
