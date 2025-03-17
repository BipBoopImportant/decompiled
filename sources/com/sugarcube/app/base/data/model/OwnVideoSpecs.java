package com.sugarcube.app.base.data.model;

import com.squareup.moshi.g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/sugarcube/app/base/data/model/OwnVideoSpecs;", "", "frameRate", "", "bitRate", "presentationTimeUs", "", "frameProcessCount", "frameDrainedCount", "<init>", "(IIJII)V", "getFrameRate", "()I", "getBitRate", "getPresentationTimeUs", "()J", "getFrameProcessCount", "getFrameDrainedCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class OwnVideoSpecs {
    public static final int $stable = 0;
    private final int bitRate;
    private final int frameDrainedCount;
    private final int frameProcessCount;
    private final int frameRate;
    private final long presentationTimeUs;

    public OwnVideoSpecs(int i10, int i11, long j10, int i12, int i13) {
        this.frameRate = i10;
        this.bitRate = i11;
        this.presentationTimeUs = j10;
        this.frameProcessCount = i12;
        this.frameDrainedCount = i13;
    }

    public static /* synthetic */ OwnVideoSpecs copy$default(OwnVideoSpecs ownVideoSpecs, int i10, int i11, long j10, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = ownVideoSpecs.frameRate;
        }
        if ((i14 & 2) != 0) {
            i11 = ownVideoSpecs.bitRate;
        }
        int i15 = i11;
        if ((i14 & 4) != 0) {
            j10 = ownVideoSpecs.presentationTimeUs;
        }
        long j11 = j10;
        if ((i14 & 8) != 0) {
            i12 = ownVideoSpecs.frameProcessCount;
        }
        int i16 = i12;
        if ((i14 & 16) != 0) {
            i13 = ownVideoSpecs.frameDrainedCount;
        }
        return ownVideoSpecs.copy(i10, i15, j11, i16, i13);
    }

    public final int component1() {
        return this.frameRate;
    }

    public final int component2() {
        return this.bitRate;
    }

    public final long component3() {
        return this.presentationTimeUs;
    }

    public final int component4() {
        return this.frameProcessCount;
    }

    public final int component5() {
        return this.frameDrainedCount;
    }

    public final OwnVideoSpecs copy(int i10, int i11, long j10, int i12, int i13) {
        return new OwnVideoSpecs(i10, i11, j10, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnVideoSpecs)) {
            return false;
        }
        OwnVideoSpecs ownVideoSpecs = (OwnVideoSpecs) obj;
        return this.frameRate == ownVideoSpecs.frameRate && this.bitRate == ownVideoSpecs.bitRate && this.presentationTimeUs == ownVideoSpecs.presentationTimeUs && this.frameProcessCount == ownVideoSpecs.frameProcessCount && this.frameDrainedCount == ownVideoSpecs.frameDrainedCount;
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final int getFrameDrainedCount() {
        return this.frameDrainedCount;
    }

    public final int getFrameProcessCount() {
        return this.frameProcessCount;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final long getPresentationTimeUs() {
        return this.presentationTimeUs;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.frameRate) * 31) + Integer.hashCode(this.bitRate)) * 31) + Long.hashCode(this.presentationTimeUs)) * 31) + Integer.hashCode(this.frameProcessCount)) * 31) + Integer.hashCode(this.frameDrainedCount);
    }

    public String toString() {
        int i10 = this.frameRate;
        int i11 = this.bitRate;
        long j10 = this.presentationTimeUs;
        int i12 = this.frameProcessCount;
        int i13 = this.frameDrainedCount;
        return "OwnVideoSpecs(frameRate=" + i10 + ", bitRate=" + i11 + ", presentationTimeUs=" + j10 + ", frameProcessCount=" + i12 + ", frameDrainedCount=" + i13 + ")";
    }
}
