package com.sugarcube.app.base.data.source.remote;

import QJ.Q;
import QL.x;
import XH.C16807N;
import XH.y;
import com.sugarcube.core.network.api.SmartaApiService;
import com.sugarcube.core.network.models.SmartaPlacementRequest;
import com.sugarcube.core.network.models.SmartaPlacementResponse;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "LQL/x;", "Lcom/sugarcube/core/network/models/SmartaPlacementResponse;", "<anonymous>", "(LQJ/Q;)LQL/x;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.source.remote.SmartaRepositoryImpl$postSmartaPlacement$response$1", f = "SmartaRepositoryImpl.kt", l = {31}, m = "invokeSuspend")
final class SmartaRepositoryImpl$postSmartaPlacement$response$1 extends l implements p<Q, C17164e<? super x<SmartaPlacementResponse>>, Object> {
    final /* synthetic */ SmartaPlacementRequest $smartaPlacementRequest;
    int label;
    final /* synthetic */ SmartaRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SmartaRepositoryImpl$postSmartaPlacement$response$1(SmartaRepositoryImpl smartaRepositoryImpl, SmartaPlacementRequest smartaPlacementRequest, C17164e<? super SmartaRepositoryImpl$postSmartaPlacement$response$1> eVar) {
        super(2, eVar);
        this.this$0 = smartaRepositoryImpl;
        this.$smartaPlacementRequest = smartaPlacementRequest;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new SmartaRepositoryImpl$postSmartaPlacement$response$1(this.this$0, this.$smartaPlacementRequest, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super x<SmartaPlacementResponse>> eVar) {
        return ((SmartaRepositoryImpl$postSmartaPlacement$response$1) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            SmartaApiService access$getSmartaAPI$p = this.this$0.smartaAPI;
            SmartaPlacementRequest smartaPlacementRequest = this.$smartaPlacementRequest;
            this.label = 1;
            obj = access$getSmartaAPI$p.postSmartaPlacement(smartaPlacementRequest, this);
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
