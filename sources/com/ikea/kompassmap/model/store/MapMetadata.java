package com.ikea.kompassmap.model.store;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ikea/kompassmap/model/store/MapMetadata;", "", "status", "", "changesLastSaved", "", "<init>", "(Ljava/lang/String;J)V", "getStatus", "()Ljava/lang/String;", "getChangesLastSaved", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MapMetadata {
    public static final int $stable = 0;
    private final long changesLastSaved;
    private final String status;

    public MapMetadata(String str, long j10) {
        C17542s.j(str, "status");
        this.status = str;
        this.changesLastSaved = j10;
    }

    public static /* synthetic */ MapMetadata copy$default(MapMetadata mapMetadata, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mapMetadata.status;
        }
        if ((i10 & 2) != 0) {
            j10 = mapMetadata.changesLastSaved;
        }
        return mapMetadata.copy(str, j10);
    }

    public final String component1() {
        return this.status;
    }

    public final long component2() {
        return this.changesLastSaved;
    }

    public final MapMetadata copy(String str, long j10) {
        C17542s.j(str, "status");
        return new MapMetadata(str, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapMetadata)) {
            return false;
        }
        MapMetadata mapMetadata = (MapMetadata) obj;
        return C17542s.e(this.status, mapMetadata.status) && this.changesLastSaved == mapMetadata.changesLastSaved;
    }

    public final long getChangesLastSaved() {
        return this.changesLastSaved;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + Long.hashCode(this.changesLastSaved);
    }

    public String toString() {
        return "MapMetadata(status=" + this.status + ", changesLastSaved=" + this.changesLastSaved + ')';
    }
}
