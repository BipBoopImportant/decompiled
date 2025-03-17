package com.sugarcube.app.base.data.feature;

import QJ.Q;
import TJ.C16504A;
import XH.C16807N;
import XH.y;
import android.util.Log;
import dI.C17164e;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.feature.OptimizelyRepository$initialize$2$1", f = "OptimizelyRepository.kt", l = {66, 68}, m = "invokeSuspend")
final class OptimizelyRepository$initialize$2$1 extends l implements p<Q, C17164e<? super C16807N>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OptimizelyRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OptimizelyRepository$initialize$2$1(OptimizelyRepository optimizelyRepository, C17164e<? super OptimizelyRepository$initialize$2$1> eVar) {
        super(2, eVar);
        this.this$0 = optimizelyRepository;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new OptimizelyRepository$initialize$2$1(this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
        return ((OptimizelyRepository$initialize$2$1) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        OptimizelyRepository optimizelyRepository;
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            optimizelyRepository = this.this$0;
            this.L$0 = optimizelyRepository;
            this.label = 1;
            obj = optimizelyRepository.buildAttributes(this);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            optimizelyRepository = (OptimizelyRepository) this.L$0;
            y.b(obj);
        } else if (i10 == 2) {
            OptimizelyRepository optimizelyRepository2 = (OptimizelyRepository) this.L$0;
            y.b(obj);
            return C16807N.f139792a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        optimizelyRepository.userAttributes = (Map) obj;
        Log.d("Optimizely", "initialized");
        C16504A access$get_initialized$p = this.this$0._initialized;
        C16807N n10 = C16807N.f139792a;
        this.L$0 = optimizelyRepository;
        this.L$1 = obj;
        this.label = 2;
        if (access$get_initialized$p.emit(n10, this) == f10) {
            return f10;
        }
        return C16807N.f139792a;
    }
}
