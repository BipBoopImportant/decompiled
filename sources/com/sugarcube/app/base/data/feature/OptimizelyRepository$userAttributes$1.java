package com.sugarcube.app.base.data.feature;

import QJ.Q;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "", "", "", "<anonymous>", "(LQJ/Q;)Ljava/util/Map;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.feature.OptimizelyRepository$userAttributes$1", f = "OptimizelyRepository.kt", l = {43}, m = "invokeSuspend")
final class OptimizelyRepository$userAttributes$1 extends l implements p<Q, C17164e<? super Map<String, Object>>, Object> {
    int label;
    final /* synthetic */ OptimizelyRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OptimizelyRepository$userAttributes$1(OptimizelyRepository optimizelyRepository, C17164e<? super OptimizelyRepository$userAttributes$1> eVar) {
        super(2, eVar);
        this.this$0 = optimizelyRepository;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new OptimizelyRepository$userAttributes$1(this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super Map<String, Object>> eVar) {
        return ((OptimizelyRepository$userAttributes$1) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            OptimizelyRepository optimizelyRepository = this.this$0;
            this.label = 1;
            obj = optimizelyRepository.buildAttributes(this);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            y.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
