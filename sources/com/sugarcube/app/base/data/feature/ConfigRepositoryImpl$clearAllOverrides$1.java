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
@f(c = "com.sugarcube.app.base.data.feature.ConfigRepositoryImpl$clearAllOverrides$1", f = "ConfigRepository.kt", l = {327, 328}, m = "invokeSuspend")
final class ConfigRepositoryImpl$clearAllOverrides$1 extends l implements p<Q, C17164e<? super C16807N>, Object> {
    int label;
    final /* synthetic */ ConfigRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConfigRepositoryImpl$clearAllOverrides$1(ConfigRepositoryImpl configRepositoryImpl, C17164e<? super ConfigRepositoryImpl$clearAllOverrides$1> eVar) {
        super(2, eVar);
        this.this$0 = configRepositoryImpl;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new ConfigRepositoryImpl$clearAllOverrides$1(this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
        return ((ConfigRepositoryImpl$clearAllOverrides$1) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            this.this$0.overriddenValues.clear();
            IPreferencesDataStoreWrapper access$getOverrideDataStore$p = this.this$0.overrideDataStore;
            this.label = 1;
            if (access$getOverrideDataStore$p.clearAll(this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            y.b(obj);
        } else if (i10 == 2) {
            y.b(obj);
            return C16807N.f139792a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ConfigRepositoryImpl configRepositoryImpl = this.this$0;
        this.label = 2;
        if (configRepositoryImpl.emitAllCurrentFlows(this) == f10) {
            return f10;
        }
        return C16807N.f139792a;
    }
}
