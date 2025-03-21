package com.sugarcube.decorate_engine;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/sugarcube/decorate_engine/EraserCounts;", "", "erasedCount", "", "erasableCount", "(II)V", "getErasableCount", "()I", "getErasedCount", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EraserCounts {
    private final int erasableCount;
    private final int erasedCount;

    public EraserCounts() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    public final int getErasableCount() {
        return this.erasableCount;
    }

    public final int getErasedCount() {
        return this.erasedCount;
    }

    public EraserCounts(int i10, int i11) {
        this.erasedCount = i10;
        this.erasableCount = i11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EraserCounts(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
