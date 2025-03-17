package com.sugarcube.app.base.network;

import com.sugarcube.app.base.network.ApiResponse;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import nI.C17642l;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.network.ApiResponse$Companion", f = "ApiResponse.kt", l = {23}, m = "call")
final class ApiResponse$Companion$call$1<T> extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ApiResponse.Companion this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ApiResponse$Companion$call$1(ApiResponse.Companion companion, C17164e<? super ApiResponse$Companion$call$1> eVar) {
        super(eVar);
        this.this$0 = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.call((C17642l) null, this);
    }
}
