package com.sugarcube.decorate;

import RF.k;
import XH.C16807N;
import com.sugarcube.decorate.internal.shared.IDecorateEngine;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import dI.C17164e;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\t\u0010\nJV\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\f2\"\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010`\u0011H¦@¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u00020\bH&¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H¦@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/sugarcube/decorate/DesignStateManager;", "", "", "isPreserveFeatureEnabled", "(LdI/e;)Ljava/lang/Object;", "Ljava/util/UUID;", "sceneUuid", "compositionUuid", "LXH/N;", "cleanUpTemporaryDesignState", "(Ljava/util/UUID;Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "isNewComposition", "Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "engine", "Ljava/util/HashMap;", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "LRF/k;", "Lkotlin/collections/HashMap;", "models", "updateDesignState", "(ZLjava/util/UUID;Ljava/util/UUID;Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;Ljava/util/HashMap;LdI/e;)Ljava/lang/Object;", "canBeRestored", "stop", "()V", "Lcom/sugarcube/decorate/TemporaryDesignStateListener;", "restoreListener", "initialize", "(ZLjava/util/UUID;Ljava/util/UUID;Lcom/sugarcube/decorate/TemporaryDesignStateListener;LdI/e;)Ljava/lang/Object;", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DesignStateManager {
    Object canBeRestored(UUID uuid, UUID uuid2, C17164e<? super Boolean> eVar);

    Object cleanUpTemporaryDesignState(UUID uuid, UUID uuid2, C17164e<? super C16807N> eVar);

    Object initialize(boolean z10, UUID uuid, UUID uuid2, TemporaryDesignStateListener temporaryDesignStateListener, C17164e<? super C16807N> eVar);

    Object isPreserveFeatureEnabled(C17164e<? super Boolean> eVar);

    void stop();

    Object updateDesignState(boolean z10, UUID uuid, UUID uuid2, IDecorateEngine iDecorateEngine, HashMap<ObjectInstanceId, k> hashMap, C17164e<? super C16807N> eVar);
}
