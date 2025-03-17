package com.sugarcube.decorate.v2.internal.manager.engine;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineMagicEraserInteractions;", "", "", "toggleMagicEraser", "()Z", "LXH/N;", "enableMagicEraser", "()V", "disableMagicEraser", "eraseAllErasableItems", "restoreAllErasableItems", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface EngineMagicEraserInteractions {
    void disableMagicEraser();

    void enableMagicEraser();

    void eraseAllErasableItems();

    void restoreAllErasableItems();

    boolean toggleMagicEraser();
}
