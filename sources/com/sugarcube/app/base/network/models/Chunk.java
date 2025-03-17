package com.sugarcube.app.base.network.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/sugarcube/app/base/network/models/Chunk;", "", "index", "", "start", "", "end", "length", "<init>", "(IJJI)V", "getIndex", "()I", "getStart", "()J", "getEnd", "getLength", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Chunk {
    public static final int $stable = 0;
    private final long end;
    private final int index;
    private final int length;
    private final long start;

    public Chunk(int i10, long j10, long j11, int i11) {
        this.index = i10;
        this.start = j10;
        this.end = j11;
        this.length = i11;
    }

    public static /* synthetic */ Chunk copy$default(Chunk chunk, int i10, long j10, long j11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = chunk.index;
        }
        if ((i12 & 2) != 0) {
            j10 = chunk.start;
        }
        long j12 = j10;
        if ((i12 & 4) != 0) {
            j11 = chunk.end;
        }
        long j13 = j11;
        if ((i12 & 8) != 0) {
            i11 = chunk.length;
        }
        return chunk.copy(i10, j12, j13, i11);
    }

    public final int component1() {
        return this.index;
    }

    public final long component2() {
        return this.start;
    }

    public final long component3() {
        return this.end;
    }

    public final int component4() {
        return this.length;
    }

    public final Chunk copy(int i10, long j10, long j11, int i11) {
        return new Chunk(i10, j10, j11, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Chunk)) {
            return false;
        }
        Chunk chunk = (Chunk) obj;
        return this.index == chunk.index && this.start == chunk.start && this.end == chunk.end && this.length == chunk.length;
    }

    public final long getEnd() {
        return this.end;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getLength() {
        return this.length;
    }

    public final long getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.index) * 31) + Long.hashCode(this.start)) * 31) + Long.hashCode(this.end)) * 31) + Integer.hashCode(this.length);
    }

    public String toString() {
        int i10 = this.index;
        long j10 = this.start;
        long j11 = this.end;
        int i11 = this.length;
        return "Chunk(index=" + i10 + ", start=" + j10 + ", end=" + j11 + ", length=" + i11 + ")";
    }
}
