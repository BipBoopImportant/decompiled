package com.sugarcube.app.base.data.source.remote;

import com.sugarcube.core.network.models.SmartaPlacementRequest;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.source.remote.SmartaRepositoryImpl", f = "SmartaRepositoryImpl.kt", l = {28, 30}, m = "postSmartaPlacement")
final class SmartaRepositoryImpl$postSmartaPlacement$1 extends d {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SmartaRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SmartaRepositoryImpl$postSmartaPlacement$1(SmartaRepositoryImpl smartaRepositoryImpl, C17164e<? super SmartaRepositoryImpl$postSmartaPlacement$1> eVar) {
        super(eVar);
        this.this$0 = smartaRepositoryImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.postSmartaPlacement((SmartaPlacementRequest) null, this);
    }
}
