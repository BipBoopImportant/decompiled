package com.sugarcube.app.base.data.source.remote;

import QJ.Q;
import QL.x;
import XH.C16807N;
import XH.y;
import android.util.Log;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.api.NetworkAPIs;
import com.sugarcube.core.network.models.QuickFilter;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001¢\u0006\u0002\b\u0003*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "", "Lcom/sugarcube/core/network/models/QuickFilter;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.source.remote.QuickFilterRemoteDataSourceImpl$getAllQuickFilters$2", f = "QuickFilterRemoteDataSourceImpl.kt", l = {29}, m = "invokeSuspend")
final class QuickFilterRemoteDataSourceImpl$getAllQuickFilters$2 extends l implements p<Q, C17164e<? super List<? extends QuickFilter>>, Object> {
    int label;
    final /* synthetic */ QuickFilterRemoteDataSourceImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    QuickFilterRemoteDataSourceImpl$getAllQuickFilters$2(QuickFilterRemoteDataSourceImpl quickFilterRemoteDataSourceImpl, C17164e<? super QuickFilterRemoteDataSourceImpl$getAllQuickFilters$2> eVar) {
        super(2, eVar);
        this.this$0 = quickFilterRemoteDataSourceImpl;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new QuickFilterRemoteDataSourceImpl$getAllQuickFilters$2(this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super List<QuickFilter>> eVar) {
        return ((QuickFilterRemoteDataSourceImpl$getAllQuickFilters$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            NetworkAPIs access$getNetworkAPIs = this.this$0.getNetworkAPIs();
            this.label = 1;
            obj = NetworkAPIs.DefaultImpls.getQuickFilters$default(access$getNetworkAPIs, (String) null, (String) null, (RoomType) null, this, 7, (Object) null);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            try {
                y.b(obj);
            } catch (Throwable th2) {
                Log.e(AnyKt.SUGARCUBE_TAG, "Getting quick filters failed", th2);
                return null;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((x) obj).a();
    }
}
