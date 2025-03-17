package com.sugarcube.decorate.v1.internal.designpersistence;

import XH.C16807N;
import com.sugarcube.decorate.v1.internal.domain.DesignState;
import dI.C17164e;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\r\u0010\u0007J\"\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/designpersistence/SceneTempStorage;", "", "Ljava/util/UUID;", "sceneUuid", "compositionUuid", "", "hasSavedState", "(Ljava/util/UUID;Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/decorate/v1/internal/domain/DesignState;", "obj", "LXH/N;", "saveObject", "(Lcom/sugarcube/decorate/v1/internal/domain/DesignState;LdI/e;)Ljava/lang/Object;", "loadObject", "cleanUp", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SceneTempStorage {
    Object cleanUp(UUID uuid, UUID uuid2, C17164e<? super C16807N> eVar);

    Object hasSavedState(UUID uuid, UUID uuid2, C17164e<? super Boolean> eVar);

    Object loadObject(UUID uuid, UUID uuid2, C17164e<? super DesignState> eVar);

    Object saveObject(DesignState designState, C17164e<? super C16807N> eVar);
}
