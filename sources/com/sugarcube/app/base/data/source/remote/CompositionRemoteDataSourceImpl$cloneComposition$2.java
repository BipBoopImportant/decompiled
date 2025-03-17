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
import com.sugarcube.core.network.models.CompositionSavedProperties;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lcom/sugarcube/core/network/models/Composition;", "<anonymous>", "(LQJ/Q;)Lcom/sugarcube/core/network/models/Composition;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl$cloneComposition$2", f = "CompositionRemoteDataSourceImpl.kt", l = {47}, m = "invokeSuspend")
final class CompositionRemoteDataSourceImpl$cloneComposition$2 extends l implements p<Q, C17164e<? super Composition>, Object> {
    final /* synthetic */ UUID $compositionUuid;
    final /* synthetic */ String $newName;
    int label;
    final /* synthetic */ CompositionRemoteDataSourceImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CompositionRemoteDataSourceImpl$cloneComposition$2(CompositionRemoteDataSourceImpl compositionRemoteDataSourceImpl, UUID uuid, String str, C17164e<? super CompositionRemoteDataSourceImpl$cloneComposition$2> eVar) {
        super(2, eVar);
        this.this$0 = compositionRemoteDataSourceImpl;
        this.$compositionUuid = uuid;
        this.$newName = str;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new CompositionRemoteDataSourceImpl$cloneComposition$2(this.this$0, this.$compositionUuid, this.$newName, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super Composition> eVar) {
        return ((CompositionRemoteDataSourceImpl$cloneComposition$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            NetworkAPIs access$getNetworkAPIs = this.this$0.getNetworkAPIs();
            UUID uuid = this.$compositionUuid;
            CompositionRequest compositionRequest = r5;
            CompositionRequest compositionRequest2 = new CompositionRequest((Integer) null, this.$newName, (Integer) null, (UUID) null, (List) null, (Boolean) null, (UUID) null, (String) null, (CompositionSavedProperties) null, 509, (DefaultConstructorMarker) null);
            this.label = 1;
            obj2 = access$getNetworkAPIs.cloneComposition(uuid, compositionRequest, this);
            if (obj2 == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            try {
                y.b(obj);
                obj2 = obj;
            } catch (Throwable th2) {
                UUID uuid2 = this.$compositionUuid;
                String str = this.$newName;
                Log.e(AnyKt.SUGARCUBE_TAG, "Cloning composition (" + uuid2 + " => " + str + ") failed", th2);
                return null;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (Composition) ((x) obj2).a();
    }
}
