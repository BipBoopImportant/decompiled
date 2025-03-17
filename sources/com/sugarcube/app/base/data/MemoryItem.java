package com.sugarcube.app.base.data;

import com.sugarcube.app.base.data.Item;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\tR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/app/base/data/MemoryItem;", "T", "Lcom/sugarcube/app/base/data/Item;", "item", "", "itemSize", "<init>", "(Ljava/lang/Object;J)V", "lastModified", "()J", "LXH/N;", "touch", "()V", "size", "Ljava/lang/Object;", "getItem", "()Ljava/lang/Object;", "J", "timestamp", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MemoryItem<T> implements Item {
    public static final int $stable = 8;
    private final T item;
    private final long itemSize;
    private long timestamp;

    public MemoryItem(T t10, long j10) {
        this.item = t10;
        this.itemSize = j10;
    }

    public final T getItem() {
        return this.item;
    }

    public long lastModified() {
        return this.timestamp;
    }

    public void release() {
        Item.DefaultImpls.release(this);
    }

    public long size() {
        return this.itemSize;
    }

    public void touch() {
        this.timestamp = Instant.now().toEpochMilli();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MemoryItem(Object obj, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? 0 : j10);
    }
}
