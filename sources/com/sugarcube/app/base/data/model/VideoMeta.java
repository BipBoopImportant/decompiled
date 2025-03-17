package com.sugarcube.app.base.data.model;

import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ja\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lcom/sugarcube/app/base/data/model/VideoMeta;", "", "startingVideoFrameIndex", "", "stoppingVideoFrameIndex", "videoTimeSecs", "", "droppedVideoFrames", "", "videoFramerateSkip", "sourceFrameSize", "Lcom/sugarcube/app/base/data/model/Dimension;", "capturedFrameSize", "ownVideoSpecs", "Lcom/sugarcube/app/base/data/model/OwnVideoSpecs;", "<init>", "(IIDLjava/util/List;ILcom/sugarcube/app/base/data/model/Dimension;Lcom/sugarcube/app/base/data/model/Dimension;Lcom/sugarcube/app/base/data/model/OwnVideoSpecs;)V", "getStartingVideoFrameIndex", "()I", "getStoppingVideoFrameIndex", "getVideoTimeSecs", "()D", "getDroppedVideoFrames", "()Ljava/util/List;", "getVideoFramerateSkip", "getSourceFrameSize", "()Lcom/sugarcube/app/base/data/model/Dimension;", "getCapturedFrameSize", "getOwnVideoSpecs", "()Lcom/sugarcube/app/base/data/model/OwnVideoSpecs;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class VideoMeta {
    public static final int $stable = 8;
    private final Dimension capturedFrameSize;
    private final List<Integer> droppedVideoFrames;
    private final OwnVideoSpecs ownVideoSpecs;
    private final Dimension sourceFrameSize;
    private final int startingVideoFrameIndex;
    private final int stoppingVideoFrameIndex;
    private final int videoFramerateSkip;
    private final double videoTimeSecs;

    public VideoMeta(int i10, int i11, double d10, List<Integer> list, int i12, Dimension dimension, Dimension dimension2, OwnVideoSpecs ownVideoSpecs2) {
        C17542s.j(list, "droppedVideoFrames");
        C17542s.j(dimension, "sourceFrameSize");
        C17542s.j(dimension2, "capturedFrameSize");
        this.startingVideoFrameIndex = i10;
        this.stoppingVideoFrameIndex = i11;
        this.videoTimeSecs = d10;
        this.droppedVideoFrames = list;
        this.videoFramerateSkip = i12;
        this.sourceFrameSize = dimension;
        this.capturedFrameSize = dimension2;
        this.ownVideoSpecs = ownVideoSpecs2;
    }

    public static /* synthetic */ VideoMeta copy$default(VideoMeta videoMeta, int i10, int i11, double d10, List list, int i12, Dimension dimension, Dimension dimension2, OwnVideoSpecs ownVideoSpecs2, int i13, Object obj) {
        VideoMeta videoMeta2 = videoMeta;
        int i14 = i13;
        return videoMeta.copy((i14 & 1) != 0 ? videoMeta2.startingVideoFrameIndex : i10, (i14 & 2) != 0 ? videoMeta2.stoppingVideoFrameIndex : i11, (i14 & 4) != 0 ? videoMeta2.videoTimeSecs : d10, (i14 & 8) != 0 ? videoMeta2.droppedVideoFrames : list, (i14 & 16) != 0 ? videoMeta2.videoFramerateSkip : i12, (i14 & 32) != 0 ? videoMeta2.sourceFrameSize : dimension, (i14 & 64) != 0 ? videoMeta2.capturedFrameSize : dimension2, (i14 & 128) != 0 ? videoMeta2.ownVideoSpecs : ownVideoSpecs2);
    }

    public final int component1() {
        return this.startingVideoFrameIndex;
    }

    public final int component2() {
        return this.stoppingVideoFrameIndex;
    }

    public final double component3() {
        return this.videoTimeSecs;
    }

    public final List<Integer> component4() {
        return this.droppedVideoFrames;
    }

    public final int component5() {
        return this.videoFramerateSkip;
    }

    public final Dimension component6() {
        return this.sourceFrameSize;
    }

    public final Dimension component7() {
        return this.capturedFrameSize;
    }

    public final OwnVideoSpecs component8() {
        return this.ownVideoSpecs;
    }

    public final VideoMeta copy(int i10, int i11, double d10, List<Integer> list, int i12, Dimension dimension, Dimension dimension2, OwnVideoSpecs ownVideoSpecs2) {
        List<Integer> list2 = list;
        C17542s.j(list2, "droppedVideoFrames");
        Dimension dimension3 = dimension;
        C17542s.j(dimension3, "sourceFrameSize");
        Dimension dimension4 = dimension2;
        C17542s.j(dimension4, "capturedFrameSize");
        return new VideoMeta(i10, i11, d10, list2, i12, dimension3, dimension4, ownVideoSpecs2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMeta)) {
            return false;
        }
        VideoMeta videoMeta = (VideoMeta) obj;
        return this.startingVideoFrameIndex == videoMeta.startingVideoFrameIndex && this.stoppingVideoFrameIndex == videoMeta.stoppingVideoFrameIndex && Double.compare(this.videoTimeSecs, videoMeta.videoTimeSecs) == 0 && C17542s.e(this.droppedVideoFrames, videoMeta.droppedVideoFrames) && this.videoFramerateSkip == videoMeta.videoFramerateSkip && C17542s.e(this.sourceFrameSize, videoMeta.sourceFrameSize) && C17542s.e(this.capturedFrameSize, videoMeta.capturedFrameSize) && C17542s.e(this.ownVideoSpecs, videoMeta.ownVideoSpecs);
    }

    public final Dimension getCapturedFrameSize() {
        return this.capturedFrameSize;
    }

    public final List<Integer> getDroppedVideoFrames() {
        return this.droppedVideoFrames;
    }

    public final OwnVideoSpecs getOwnVideoSpecs() {
        return this.ownVideoSpecs;
    }

    public final Dimension getSourceFrameSize() {
        return this.sourceFrameSize;
    }

    public final int getStartingVideoFrameIndex() {
        return this.startingVideoFrameIndex;
    }

    public final int getStoppingVideoFrameIndex() {
        return this.stoppingVideoFrameIndex;
    }

    public final int getVideoFramerateSkip() {
        return this.videoFramerateSkip;
    }

    public final double getVideoTimeSecs() {
        return this.videoTimeSecs;
    }

    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.startingVideoFrameIndex) * 31) + Integer.hashCode(this.stoppingVideoFrameIndex)) * 31) + Double.hashCode(this.videoTimeSecs)) * 31) + this.droppedVideoFrames.hashCode()) * 31) + Integer.hashCode(this.videoFramerateSkip)) * 31) + this.sourceFrameSize.hashCode()) * 31) + this.capturedFrameSize.hashCode()) * 31;
        OwnVideoSpecs ownVideoSpecs2 = this.ownVideoSpecs;
        return hashCode + (ownVideoSpecs2 == null ? 0 : ownVideoSpecs2.hashCode());
    }

    public String toString() {
        int i10 = this.startingVideoFrameIndex;
        int i11 = this.stoppingVideoFrameIndex;
        double d10 = this.videoTimeSecs;
        List<Integer> list = this.droppedVideoFrames;
        int i12 = this.videoFramerateSkip;
        Dimension dimension = this.sourceFrameSize;
        Dimension dimension2 = this.capturedFrameSize;
        OwnVideoSpecs ownVideoSpecs2 = this.ownVideoSpecs;
        return "VideoMeta(startingVideoFrameIndex=" + i10 + ", stoppingVideoFrameIndex=" + i11 + ", videoTimeSecs=" + d10 + ", droppedVideoFrames=" + list + ", videoFramerateSkip=" + i12 + ", sourceFrameSize=" + dimension + ", capturedFrameSize=" + dimension2 + ", ownVideoSpecs=" + ownVideoSpecs2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VideoMeta(int i10, int i11, double d10, List list, int i12, Dimension dimension, Dimension dimension2, OwnVideoSpecs ownVideoSpecs2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, d10, list, i12, dimension, dimension2, (i13 & 128) != 0 ? null : ownVideoSpecs2);
    }
}
