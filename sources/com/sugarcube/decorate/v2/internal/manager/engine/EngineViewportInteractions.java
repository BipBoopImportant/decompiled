package com.sugarcube.decorate.v2.internal.manager.engine;

import RF.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineViewportInteractions;", "", "LRF/j;", "getInitialViewport", "()LRF/j;", "getCurrentViewport", "viewport", "LXH/N;", "setViewport", "(LRF/j;)V", "restorePreviousViewport", "()V", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface EngineViewportInteractions {
    j getCurrentViewport();

    j getInitialViewport();

    void restorePreviousViewport();

    void setViewport(j jVar);
}
