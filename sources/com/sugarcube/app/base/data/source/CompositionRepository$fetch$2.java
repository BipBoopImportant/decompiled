package com.sugarcube.app.base.data.source;

import QJ.Q;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.sugarcube.core.network.models.Composition;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "Lcom/sugarcube/core/network/models/Composition;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.source.CompositionRepository$fetch$2", f = "CompositionRepository.kt", l = {28}, m = "invokeSuspend")
final class CompositionRepository$fetch$2 extends l implements p<Q, C17164e<? super List<Composition>>, Object> {
    final /* synthetic */ UUID $sceneUuid;
    int label;
    final /* synthetic */ CompositionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CompositionRepository$fetch$2(CompositionRepository compositionRepository, UUID uuid, C17164e<? super CompositionRepository$fetch$2> eVar) {
        super(2, eVar);
        this.this$0 = compositionRepository;
        this.$sceneUuid = uuid;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new CompositionRepository$fetch$2(this.this$0, this.$sceneUuid, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super List<Composition>> eVar) {
        return ((CompositionRepository$fetch$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            if (!this.this$0.userRepo.isLoggedIn().getValue().booleanValue()) {
                return null;
            }
            CompositionRemoteDataSource remoteSource = this.this$0.getRemoteSource();
            UUID uuid = this.$sceneUuid;
            this.label = 1;
            obj = remoteSource.fetchCompositions(uuid, this);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            y.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj;
        if (list != null) {
            return C16877v.w1(list);
        }
        return null;
    }
}
