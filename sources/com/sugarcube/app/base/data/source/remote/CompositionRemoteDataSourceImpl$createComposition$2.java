package com.sugarcube.app.base.data.source.remote;

import QJ.Q;
import QL.x;
import XH.C16807N;
import XH.y;
import android.util.Log;
import com.sugarcube.app.base.data.source.CompositionDataSourceKt;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.api.NetworkAPIs;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.CompositionRequest;
import dI.C17164e;
import eI.C17187b;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "Lcom/sugarcube/core/network/models/Composition;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(LQJ/Q;)Lcom/sugarcube/core/network/models/Composition;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl$createComposition$2", f = "CompositionRemoteDataSourceImpl.kt", l = {71}, m = "invokeSuspend")
final class CompositionRemoteDataSourceImpl$createComposition$2 extends l implements p<Q, C17164e<? super Composition>, Object> {
    final /* synthetic */ Composition $composition;
    Object L$0;
    int label;
    final /* synthetic */ CompositionRemoteDataSourceImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CompositionRemoteDataSourceImpl$createComposition$2(Composition composition, CompositionRemoteDataSourceImpl compositionRemoteDataSourceImpl, C17164e<? super CompositionRemoteDataSourceImpl$createComposition$2> eVar) {
        super(2, eVar);
        this.$composition = composition;
        this.this$0 = compositionRemoteDataSourceImpl;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new CompositionRemoteDataSourceImpl$createComposition$2(this.$composition, this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super Composition> eVar) {
        return ((CompositionRemoteDataSourceImpl$createComposition$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            CompositionRequest asRequest = CompositionDataSourceKt.asRequest(this.$composition);
            NetworkAPIs access$getNetworkAPIs = this.this$0.getNetworkAPIs();
            this.L$0 = asRequest;
            this.label = 1;
            obj = access$getNetworkAPIs.createComposition(asRequest, this);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            CompositionRequest compositionRequest = (CompositionRequest) this.L$0;
            try {
                y.b(obj);
            } catch (Throwable th2) {
                UUID compositionUuid = this.$composition.getCompositionUuid();
                Log.e(AnyKt.SUGARCUBE_TAG, "Create composition " + compositionUuid + " failed", th2);
                return null;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((x) obj).a();
    }
}
