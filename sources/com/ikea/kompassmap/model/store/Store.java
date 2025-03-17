package com.ikea.kompassmap.model.store;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ikea/kompassmap/model/store/Store;", "", "timestamp", "", "traceId", "data", "Lcom/ikea/kompassmap/model/store/StoreData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ikea/kompassmap/model/store/StoreData;)V", "getTimestamp", "()Ljava/lang/String;", "getTraceId", "getData", "()Lcom/ikea/kompassmap/model/store/StoreData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Store {
    public static final int $stable = 8;
    private final StoreData data;
    private final String timestamp;
    private final String traceId;

    public Store(String str, String str2, StoreData storeData) {
        C17542s.j(str, "timestamp");
        C17542s.j(str2, "traceId");
        C17542s.j(storeData, "data");
        this.timestamp = str;
        this.traceId = str2;
        this.data = storeData;
    }

    public static /* synthetic */ Store copy$default(Store store, String str, String str2, StoreData storeData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = store.timestamp;
        }
        if ((i10 & 2) != 0) {
            str2 = store.traceId;
        }
        if ((i10 & 4) != 0) {
            storeData = store.data;
        }
        return store.copy(str, str2, storeData);
    }

    public final String component1() {
        return this.timestamp;
    }

    public final String component2() {
        return this.traceId;
    }

    public final StoreData component3() {
        return this.data;
    }

    public final Store copy(String str, String str2, StoreData storeData) {
        C17542s.j(str, "timestamp");
        C17542s.j(str2, "traceId");
        C17542s.j(storeData, "data");
        return new Store(str, str2, storeData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Store)) {
            return false;
        }
        Store store = (Store) obj;
        return C17542s.e(this.timestamp, store.timestamp) && C17542s.e(this.traceId, store.traceId) && C17542s.e(this.data, store.data);
    }

    public final StoreData getData() {
        return this.data;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        return (((this.timestamp.hashCode() * 31) + this.traceId.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "Store(timestamp=" + this.timestamp + ", traceId=" + this.traceId + ", data=" + this.data + ')';
    }
}
