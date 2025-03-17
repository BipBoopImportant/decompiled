package com.sugarcube.app.base.data.feature;

import QJ.Q;
import TJ.C16504A;
import TJ.C16509F;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.feature.ConfigRepositoryImpl$blockUntilRemoteDataInitialized$2", f = "ConfigRepository.kt", l = {233, 234}, m = "invokeSuspend")
final class ConfigRepositoryImpl$blockUntilRemoteDataInitialized$2 extends l implements p<Q, C17164e<? super C16807N>, Object> {
    int label;
    final /* synthetic */ ConfigRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConfigRepositoryImpl$blockUntilRemoteDataInitialized$2(ConfigRepositoryImpl configRepositoryImpl, C17164e<? super ConfigRepositoryImpl$blockUntilRemoteDataInitialized$2> eVar) {
        super(2, eVar);
        this.this$0 = configRepositoryImpl;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new ConfigRepositoryImpl$blockUntilRemoteDataInitialized$2(this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
        return ((ConfigRepositoryImpl$blockUntilRemoteDataInitialized$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            C16509F<C16807N> initialized = this.this$0.opt.getInitialized();
            this.label = 1;
            if (C16534i.B(initialized, this) == f10) {
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
        C16504A access$getRemoteDataSynced$p = this.this$0.remoteDataSynced;
        this.label = 2;
        if (C16534i.B(access$getRemoteDataSynced$p, this) == f10) {
            return f10;
        }
        return C16807N.f139792a;
    }
}
