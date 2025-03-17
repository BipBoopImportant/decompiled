package com.sugarcube.app.base.network;

import GK.C15776D;
import GK.C15804w;
import QJ.Q;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LGK/D;", "<anonymous>", "(LQJ/Q;)LGK/D;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.network.AuthInterceptor$intercept$1", f = "AuthInterceptor.kt", l = {20}, m = "invokeSuspend")
final class AuthInterceptor$intercept$1 extends l implements p<Q, C17164e<? super C15776D>, Object> {
    final /* synthetic */ C15804w.a $chain;
    int label;
    final /* synthetic */ AuthInterceptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AuthInterceptor$intercept$1(AuthInterceptor authInterceptor, C15804w.a aVar, C17164e<? super AuthInterceptor$intercept$1> eVar) {
        super(2, eVar);
        this.this$0 = authInterceptor;
        this.$chain = aVar;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new AuthInterceptor$intercept$1(this.this$0, this.$chain, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super C15776D> eVar) {
        return ((AuthInterceptor$intercept$1) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            TokenStoreV2 access$getTokenStore$p = this.this$0.tokenStore;
            this.label = 1;
            obj = access$getTokenStore$p.isTokenValid(this);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            y.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            return this.this$0.hostAppInterceptor.intercept(this.$chain);
        }
        C15804w.a aVar = this.$chain;
        return aVar.b(aVar.t());
    }
}
