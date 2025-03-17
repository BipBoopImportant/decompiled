package com.sugarcube.app.base.data;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\b"}, d2 = {"Lcom/sugarcube/app/base/data/SceneRepoModule;", "", "bindSceneRepository", "Lcom/sugarcube/app/base/data/ISceneRepository;", "impl", "Lcom/sugarcube/app/base/data/SceneRepository;", "bindShowroomRepository", "Lcom/sugarcube/app/base/data/ShowroomRepository;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SceneRepoModule {
    ISceneRepository bindSceneRepository(SceneRepository sceneRepository);

    ShowroomRepository bindShowroomRepository(SceneRepository sceneRepository);
}
