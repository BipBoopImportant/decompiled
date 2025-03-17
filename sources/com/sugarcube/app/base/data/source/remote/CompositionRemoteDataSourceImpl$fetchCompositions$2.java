package com.sugarcube.app.base.data.source.remote;

import QJ.Q;
import QL.x;
import XH.C16807N;
import XH.y;
import android.util.Log;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.api.NetworkAPIs;
import com.sugarcube.core.network.models.Composition;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.O;
import nI.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "Lcom/sugarcube/core/network/models/Composition;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl$fetchCompositions$2", f = "CompositionRemoteDataSourceImpl.kt", l = {99}, m = "invokeSuspend")
final class CompositionRemoteDataSourceImpl$fetchCompositions$2 extends l implements p<Q, C17164e<? super List<? extends Composition>>, Object> {
    final /* synthetic */ UUID $sceneUuid;
    Object L$0;
    int label;
    final /* synthetic */ CompositionRemoteDataSourceImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CompositionRemoteDataSourceImpl$fetchCompositions$2(CompositionRemoteDataSourceImpl compositionRemoteDataSourceImpl, UUID uuid, C17164e<? super CompositionRemoteDataSourceImpl$fetchCompositions$2> eVar) {
        super(2, eVar);
        this.this$0 = compositionRemoteDataSourceImpl;
        this.$sceneUuid = uuid;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new CompositionRemoteDataSourceImpl$fetchCompositions$2(this.this$0, this.$sceneUuid, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super List<Composition>> eVar) {
        return ((CompositionRemoteDataSourceImpl$fetchCompositions$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        O o10;
        Throwable th2;
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            O o11 = new O();
            try {
                NetworkAPIs access$getNetworkAPIs = this.this$0.getNetworkAPIs();
                UUID uuid = this.$sceneUuid;
                this.L$0 = o11;
                this.label = 1;
                Object fetchCompositionList$default = NetworkAPIs.DefaultImpls.fetchCompositionList$default(access$getNetworkAPIs, uuid, (String) null, (String) null, this, 6, (Object) null);
                if (fetchCompositionList$default == f10) {
                    return f10;
                }
                o10 = o11;
                obj = fetchCompositionList$default;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                o10 = o11;
                th2 = th4;
                Log.e(AnyKt.SUGARCUBE_TAG, "Could not fetch compositions", th2);
                return o10.f144348a;
            }
        } else if (i10 == 1) {
            o10 = (O) this.L$0;
            try {
                y.b(obj);
            } catch (Throwable th5) {
                th2 = th5;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        T t10 = (List) ((x) obj).a();
        if (t10 != null) {
            o10.f144348a = t10;
        }
        return o10.f144348a;
    }
}
