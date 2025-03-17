package com.sugarcube.app.base.data.feature;

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
@f(c = "com.sugarcube.app.base.data.feature.ConfigRepositoryImpl$getOrCreateFlowFor$1$1", f = "ConfigRepository.kt", l = {377}, m = "invokeSuspend")
final class ConfigRepositoryImpl$getOrCreateFlowFor$1$1 extends l implements p<Q, C17164e<? super C16807N>, Object> {
    final /* synthetic */ ConfigItem<?> $configItem;
    int label;
    final /* synthetic */ ConfigRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConfigRepositoryImpl$getOrCreateFlowFor$1$1(ConfigRepositoryImpl configRepositoryImpl, ConfigItem<?> configItem, C17164e<? super ConfigRepositoryImpl$getOrCreateFlowFor$1$1> eVar) {
        super(2, eVar);
        this.this$0 = configRepositoryImpl;
        this.$configItem = configItem;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new ConfigRepositoryImpl$getOrCreateFlowFor$1$1(this.this$0, this.$configItem, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
        return ((ConfigRepositoryImpl$getOrCreateFlowFor$1$1) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            ConfigRepositoryImpl configRepositoryImpl = this.this$0;
            ConfigItem<?> configItem = this.$configItem;
            this.label = 1;
            if (configRepositoryImpl.emitCurrentValue(configItem, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            y.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C16807N.f139792a;
    }
}
