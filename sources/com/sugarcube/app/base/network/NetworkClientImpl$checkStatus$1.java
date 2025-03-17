package com.sugarcube.app.base.network;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.network.NetworkClientImpl", f = "NetworkClient.kt", l = {124}, m = "checkStatus")
final class NetworkClientImpl$checkStatus$1 extends d {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NetworkClientImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NetworkClientImpl$checkStatus$1(NetworkClientImpl networkClientImpl, C17164e<? super NetworkClientImpl$checkStatus$1> eVar) {
        super(eVar);
        this.this$0 = networkClientImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.checkStatus(0, (Boolean) null, this);
    }
}
