package com.sugarcube.app.base.data.source.remote;

import QJ.Q;
import QL.x;
import XH.C16807N;
import XH.y;
import android.util.Log;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.api.NetworkAPIs;
import dI.C17164e;
import eI.C17187b;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl$deleteComposition$2", f = "CompositionRemoteDataSourceImpl.kt", l = {38}, m = "invokeSuspend")
final class CompositionRemoteDataSourceImpl$deleteComposition$2 extends l implements p<Q, C17164e<? super Boolean>, Object> {
    final /* synthetic */ UUID $compositionUuid;
    int label;
    final /* synthetic */ CompositionRemoteDataSourceImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CompositionRemoteDataSourceImpl$deleteComposition$2(CompositionRemoteDataSourceImpl compositionRemoteDataSourceImpl, UUID uuid, C17164e<? super CompositionRemoteDataSourceImpl$deleteComposition$2> eVar) {
        super(2, eVar);
        this.this$0 = compositionRemoteDataSourceImpl;
        this.$compositionUuid = uuid;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new CompositionRemoteDataSourceImpl$deleteComposition$2(this.this$0, this.$compositionUuid, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
        return ((CompositionRemoteDataSourceImpl$deleteComposition$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z10;
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            NetworkAPIs access$getNetworkAPIs = this.this$0.getNetworkAPIs();
            UUID uuid = this.$compositionUuid;
            this.label = 1;
            obj = access$getNetworkAPIs.deleteComposition(uuid, this);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            try {
                y.b(obj);
            } catch (Throwable th2) {
                UUID uuid2 = this.$compositionUuid;
                Log.e(AnyKt.SUGARCUBE_TAG, "Deleting composition (" + uuid2 + ") failed", th2);
                z10 = false;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z10 = ((x) obj).e();
        return b.a(z10);
    }
}
