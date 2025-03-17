package com.sugarcube.app.base.data.feature;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.feature.ConfigRepositoryImpl", f = "ConfigRepository.kt", l = {338, 338}, m = "emitCurrentValue")
final class ConfigRepositoryImpl$emitCurrentValue$1<T> extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConfigRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConfigRepositoryImpl$emitCurrentValue$1(ConfigRepositoryImpl configRepositoryImpl, C17164e<? super ConfigRepositoryImpl$emitCurrentValue$1> eVar) {
        super(eVar);
        this.this$0 = configRepositoryImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emitCurrentValue((ConfigItem) null, this);
    }
}
