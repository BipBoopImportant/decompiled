package com.sugarcube.app.base.data.source;

import com.sugarcube.core.network.models.CompiledComposition;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.CompositionRequest;
import dI.C17164e;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/app/base/data/source/CompositionRemoteDataSource;", "Lcom/sugarcube/app/base/data/source/CompositionDataSource;", "Lcom/sugarcube/core/network/models/Composition;", "composition", "createComposition", "(Lcom/sugarcube/core/network/models/Composition;LdI/e;)Ljava/lang/Object;", "Ljava/util/UUID;", "compositionUuid", "Lcom/sugarcube/core/network/models/CompositionRequest;", "request", "updateComposition", "(Ljava/util/UUID;Lcom/sugarcube/core/network/models/CompositionRequest;LdI/e;)Ljava/lang/Object;", "sceneUuid", "", "fetchCompositions", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CompiledComposition;", "fetchCompiledComposition", "", "compositionId", "fetchComposition", "(ILdI/e;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CompositionRemoteDataSource extends CompositionDataSource {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object updateComposition$default(CompositionRemoteDataSource compositionRemoteDataSource, UUID uuid, CompositionRequest compositionRequest, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    compositionRequest = null;
                }
                return compositionRemoteDataSource.updateComposition(uuid, compositionRequest, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateComposition");
        }
    }

    Object createComposition(Composition composition, C17164e<? super Composition> eVar);

    Object fetchCompiledComposition(UUID uuid, C17164e<? super CompiledComposition> eVar);

    Object fetchComposition(int i10, C17164e<? super Composition> eVar);

    Object fetchCompositions(UUID uuid, C17164e<? super List<Composition>> eVar);

    Object updateComposition(UUID uuid, CompositionRequest compositionRequest, C17164e<? super Composition> eVar);
}
