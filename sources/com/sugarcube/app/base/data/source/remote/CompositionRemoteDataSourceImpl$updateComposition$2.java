package com.sugarcube.app.base.data.source.remote;

import QJ.Q;
import QL.x;
import XH.C16807N;
import XH.y;
import android.util.Log;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.api.NetworkAPIs;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.CompositionRequest;
import dI.C17164e;
import eI.C17187b;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "Lcom/sugarcube/core/network/models/Composition;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(LQJ/Q;)Lcom/sugarcube/core/network/models/Composition;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl$updateComposition$2", f = "CompositionRemoteDataSourceImpl.kt", l = {83}, m = "invokeSuspend")
final class CompositionRemoteDataSourceImpl$updateComposition$2 extends l implements p<Q, C17164e<? super Composition>, Object> {
    final /* synthetic */ UUID $compositionUuid;
    final /* synthetic */ CompositionRequest $request;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ CompositionRemoteDataSourceImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CompositionRemoteDataSourceImpl$updateComposition$2(CompositionRequest compositionRequest, CompositionRemoteDataSourceImpl compositionRemoteDataSourceImpl, UUID uuid, C17164e<? super CompositionRemoteDataSourceImpl$updateComposition$2> eVar) {
        super(2, eVar);
        this.$request = compositionRequest;
        this.this$0 = compositionRemoteDataSourceImpl;
        this.$compositionUuid = uuid;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new CompositionRemoteDataSourceImpl$updateComposition$2(this.$request, this.this$0, this.$compositionUuid, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super Composition> eVar) {
        return ((CompositionRemoteDataSourceImpl$updateComposition$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        UUID uuid;
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            CompositionRequest compositionRequest = this.$request;
            if (compositionRequest == null) {
                return null;
            }
            CompositionRemoteDataSourceImpl compositionRemoteDataSourceImpl = this.this$0;
            UUID uuid2 = this.$compositionUuid;
            try {
                NetworkAPIs access$getNetworkAPIs = compositionRemoteDataSourceImpl.getNetworkAPIs();
                this.L$0 = compositionRequest;
                this.L$1 = compositionRequest;
                this.L$2 = compositionRemoteDataSourceImpl;
                this.L$3 = uuid2;
                this.L$4 = compositionRequest;
                this.I$0 = 0;
                this.label = 1;
                obj = access$getNetworkAPIs.putComposition(uuid2, compositionRequest, this);
                if (obj == f10) {
                    return f10;
                }
                uuid = uuid2;
            } catch (Throwable th2) {
                th = th2;
                uuid = uuid2;
                b.e(Log.e(AnyKt.SUGARCUBE_TAG, "Post composition update failed for " + uuid, th));
                return null;
            }
        } else if (i10 == 1) {
            CompositionRequest compositionRequest2 = (CompositionRequest) this.L$4;
            uuid = (UUID) this.L$3;
            CompositionRemoteDataSourceImpl compositionRemoteDataSourceImpl2 = (CompositionRemoteDataSourceImpl) this.L$2;
            CompositionRequest compositionRequest3 = (CompositionRequest) this.L$1;
            CompositionRequest compositionRequest4 = (CompositionRequest) this.L$0;
            try {
                y.b(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((x) obj).a();
    }
}
