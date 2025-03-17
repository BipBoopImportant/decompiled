package com.sugarcube.decorate.v2.internal.manager.engine;

import XH.C16807N;
import com.sugarcube.decorate_engine.SceneLayout;
import dI.C17164e;
import kG.C17495a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineSaveInteractions;", "", "LkG/a;", "sceneType", "Lcom/sugarcube/decorate_engine/SceneLayout;", "saveSceneLayout", "(LkG/a;LdI/e;)Ljava/lang/Object;", "", "isSavedCompositionGLTF", "LXH/N;", "saveCleanUp", "(ZLdI/e;)Ljava/lang/Object;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface EngineSaveInteractions {
    Object saveCleanUp(boolean z10, C17164e<? super C16807N> eVar);

    Object saveSceneLayout(C17495a aVar, C17164e<? super SceneLayout> eVar);
}
