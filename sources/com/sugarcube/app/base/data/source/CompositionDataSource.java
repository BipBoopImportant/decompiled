package com.sugarcube.app.base.data.source;

import com.sugarcube.core.network.models.Composition;
import dI.C17164e;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\n\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sugarcube/app/base/data/source/CompositionDataSource;", "", "Ljava/util/UUID;", "compositionUuid", "", "deleteComposition", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "", "newName", "Lcom/sugarcube/core/network/models/Composition;", "cloneComposition", "(Ljava/util/UUID;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "composition", "(Lcom/sugarcube/core/network/models/Composition;LdI/e;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CompositionDataSource {
    Object cloneComposition(Composition composition, C17164e<? super Composition> eVar);

    Object cloneComposition(UUID uuid, String str, C17164e<? super Composition> eVar);

    Object deleteComposition(UUID uuid, C17164e<? super Boolean> eVar);
}
