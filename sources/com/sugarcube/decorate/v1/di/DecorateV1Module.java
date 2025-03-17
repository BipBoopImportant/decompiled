package com.sugarcube.decorate.v1.di;

import XF.C16785a;
import bG.C17033a;
import com.sugarcube.decorate.DesignStateManager;
import com.sugarcube.decorate.v1.internal.designpersistence.SceneTempStorage;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/decorate/v1/di/DecorateV1Module;", "", "LXF/a;", "impl", "Lcom/sugarcube/decorate/v1/internal/designpersistence/SceneTempStorage;", "bindSceneTempStorage", "(LXF/a;)Lcom/sugarcube/decorate/v1/internal/designpersistence/SceneTempStorage;", "LbG/a;", "Lcom/sugarcube/decorate/DesignStateManager;", "bindDesignStateManager", "(LbG/a;)Lcom/sugarcube/decorate/DesignStateManager;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DecorateV1Module {
    DesignStateManager bindDesignStateManager(C17033a aVar);

    SceneTempStorage bindSceneTempStorage(C16785a aVar);
}
