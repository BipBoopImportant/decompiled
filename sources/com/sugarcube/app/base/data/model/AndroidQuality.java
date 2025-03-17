package com.sugarcube.app.base.data.model;

import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.squareup.moshi.g;
import com.sugarcube.app.base.network.models.UploadKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\bA\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001Bù\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\r\u0012\b\b\u0002\u0010\u001b\u001a\u00020\r\u0012\b\b\u0002\u0010\u001c\u001a\u00020\r\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010'J\t\u0010E\u001a\u00020\u0007HÆ\u0003J\t\u0010F\u001a\u00020\u0007HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0007HÆ\u0003J\t\u0010I\u001a\u00020\rHÆ\u0003J\t\u0010J\u001a\u00020\rHÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0007HÆ\u0003J\t\u0010M\u001a\u00020\u0007HÆ\u0003J\t\u0010N\u001a\u00020\u0007HÆ\u0003J\t\u0010O\u001a\u00020\rHÆ\u0003J\t\u0010P\u001a\u00020\rHÆ\u0003J\t\u0010Q\u001a\u00020\u0016HÆ\u0003J\t\u0010R\u001a\u00020\u0016HÆ\u0003J\t\u0010S\u001a\u00020\u0016HÆ\u0003J\t\u0010T\u001a\u00020\u0016HÆ\u0003J\t\u0010U\u001a\u00020\rHÆ\u0003J\t\u0010V\u001a\u00020\rHÆ\u0003J\t\u0010W\u001a\u00020\rHÆ\u0003J\t\u0010X\u001a\u00020\u001eHÆ\u0003J\t\u0010Y\u001a\u00020\u001eHÆ\u0003J\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eHÆ\u0001¢\u0006\u0002\u0010[J\u0013\u0010\\\u001a\u00020\u00162\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020\u0007HÖ\u0001J\t\u0010_\u001a\u00020`HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b5\u0010/R\u0011\u0010\u0014\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b6\u0010/R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0017\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0011\u0010\u0018\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b:\u00108R\u0011\u0010\u0019\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b;\u00108R\u0011\u0010\u001a\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b<\u0010/R\u0011\u0010\u001b\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b=\u0010/R\u0011\u0010\u001c\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b>\u0010/R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u001f\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bA\u0010@¨\u0006a"}, d2 = {"Lcom/sugarcube/app/base/data/model/AndroidQuality;", "", "trackingRatios", "", "trackingStats", "", "frameCount", "", "framesWithLowIntensity", "framesWithNoPoints", "lowIntensityRange", "pointsTotal", "principalPointRatioX", "", "principalPointRatioY", "panoTrackingStats", "panoFrameCount", "panoFramesWithNoPoints", "panoPointsTotal", "panoPrincipalPointRatioX", "panoPrincipalPointRatioY", "poseAnchorEnabled", "", "poseAnchorCreated", "floorAnchorEnabled", "floorAnchorCreated", "onDrawMPF", "handleMPF", "handleEncodeMPF", "panoSize", "", "videoSize", "<init>", "([F[ILjava/lang/Integer;II[FIFF[IIIIFFZZZZFFFJJ)V", "getTrackingRatios", "()[F", "getTrackingStats", "()[I", "getFrameCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFramesWithLowIntensity", "()I", "getFramesWithNoPoints", "getLowIntensityRange", "getPointsTotal", "getPrincipalPointRatioX", "()F", "getPrincipalPointRatioY", "getPanoTrackingStats", "getPanoFrameCount", "getPanoFramesWithNoPoints", "getPanoPointsTotal", "getPanoPrincipalPointRatioX", "getPanoPrincipalPointRatioY", "getPoseAnchorEnabled", "()Z", "getPoseAnchorCreated", "getFloorAnchorEnabled", "getFloorAnchorCreated", "getOnDrawMPF", "getHandleMPF", "getHandleEncodeMPF", "getPanoSize", "()J", "getVideoSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "([F[ILjava/lang/Integer;II[FIFF[IIIIFFZZZZFFFJJ)Lcom/sugarcube/app/base/data/model/AndroidQuality;", "equals", "other", "hashCode", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class AndroidQuality {
    public static final int $stable = 8;
    private final boolean floorAnchorCreated;
    private final boolean floorAnchorEnabled;
    private final Integer frameCount;
    private final int framesWithLowIntensity;
    private final int framesWithNoPoints;
    private final float handleEncodeMPF;
    private final float handleMPF;
    private final float[] lowIntensityRange;
    private final float onDrawMPF;
    private final int panoFrameCount;
    private final int panoFramesWithNoPoints;
    private final int panoPointsTotal;
    private final float panoPrincipalPointRatioX;
    private final float panoPrincipalPointRatioY;
    private final long panoSize;
    private final int[] panoTrackingStats;
    private final int pointsTotal;
    private final boolean poseAnchorCreated;
    private final boolean poseAnchorEnabled;
    private final float principalPointRatioX;
    private final float principalPointRatioY;
    private final float[] trackingRatios;
    private final int[] trackingStats;
    private final long videoSize;

    public AndroidQuality() {
        this((float[]) null, (int[]) null, (Integer) null, 0, 0, (float[]) null, 0, 0.0f, 0.0f, (int[]) null, 0, 0, 0, 0.0f, 0.0f, false, false, false, false, 0.0f, 0.0f, 0.0f, 0, 0, 16777215, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AndroidQuality copy$default(AndroidQuality androidQuality, float[] fArr, int[] iArr, Integer num, int i10, int i11, float[] fArr2, int i12, float f10, float f11, int[] iArr2, int i13, int i14, int i15, float f12, float f13, boolean z10, boolean z11, boolean z12, boolean z13, float f14, float f15, float f16, long j10, long j11, int i16, Object obj) {
        AndroidQuality androidQuality2 = androidQuality;
        int i17 = i16;
        return androidQuality.copy((i17 & 1) != 0 ? androidQuality2.trackingRatios : fArr, (i17 & 2) != 0 ? androidQuality2.trackingStats : iArr, (i17 & 4) != 0 ? androidQuality2.frameCount : num, (i17 & 8) != 0 ? androidQuality2.framesWithLowIntensity : i10, (i17 & 16) != 0 ? androidQuality2.framesWithNoPoints : i11, (i17 & 32) != 0 ? androidQuality2.lowIntensityRange : fArr2, (i17 & 64) != 0 ? androidQuality2.pointsTotal : i12, (i17 & 128) != 0 ? androidQuality2.principalPointRatioX : f10, (i17 & 256) != 0 ? androidQuality2.principalPointRatioY : f11, (i17 & 512) != 0 ? androidQuality2.panoTrackingStats : iArr2, (i17 & 1024) != 0 ? androidQuality2.panoFrameCount : i13, (i17 & RecyclerView.n.FLAG_MOVED) != 0 ? androidQuality2.panoFramesWithNoPoints : i14, (i17 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? androidQuality2.panoPointsTotal : i15, (i17 & 8192) != 0 ? androidQuality2.panoPrincipalPointRatioX : f12, (i17 & 16384) != 0 ? androidQuality2.panoPrincipalPointRatioY : f13, (i17 & 32768) != 0 ? androidQuality2.poseAnchorEnabled : z10, (i17 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? androidQuality2.poseAnchorCreated : z11, (i17 & 131072) != 0 ? androidQuality2.floorAnchorEnabled : z12, (i17 & 262144) != 0 ? androidQuality2.floorAnchorCreated : z13, (i17 & ImageMetadata.LENS_APERTURE) != 0 ? androidQuality2.onDrawMPF : f14, (i17 & ImageMetadata.SHADING_MODE) != 0 ? androidQuality2.handleMPF : f15, (i17 & UploadKt.MAX_CHUNK_SIZE) != 0 ? androidQuality2.handleEncodeMPF : f16, (i17 & 4194304) != 0 ? androidQuality2.panoSize : j10, (i17 & 8388608) != 0 ? androidQuality2.videoSize : j11);
    }

    public final float[] component1() {
        return this.trackingRatios;
    }

    public final int[] component10() {
        return this.panoTrackingStats;
    }

    public final int component11() {
        return this.panoFrameCount;
    }

    public final int component12() {
        return this.panoFramesWithNoPoints;
    }

    public final int component13() {
        return this.panoPointsTotal;
    }

    public final float component14() {
        return this.panoPrincipalPointRatioX;
    }

    public final float component15() {
        return this.panoPrincipalPointRatioY;
    }

    public final boolean component16() {
        return this.poseAnchorEnabled;
    }

    public final boolean component17() {
        return this.poseAnchorCreated;
    }

    public final boolean component18() {
        return this.floorAnchorEnabled;
    }

    public final boolean component19() {
        return this.floorAnchorCreated;
    }

    public final int[] component2() {
        return this.trackingStats;
    }

    public final float component20() {
        return this.onDrawMPF;
    }

    public final float component21() {
        return this.handleMPF;
    }

    public final float component22() {
        return this.handleEncodeMPF;
    }

    public final long component23() {
        return this.panoSize;
    }

    public final long component24() {
        return this.videoSize;
    }

    public final Integer component3() {
        return this.frameCount;
    }

    public final int component4() {
        return this.framesWithLowIntensity;
    }

    public final int component5() {
        return this.framesWithNoPoints;
    }

    public final float[] component6() {
        return this.lowIntensityRange;
    }

    public final int component7() {
        return this.pointsTotal;
    }

    public final float component8() {
        return this.principalPointRatioX;
    }

    public final float component9() {
        return this.principalPointRatioY;
    }

    public final AndroidQuality copy(float[] fArr, int[] iArr, Integer num, int i10, int i11, float[] fArr2, int i12, float f10, float f11, int[] iArr2, int i13, int i14, int i15, float f12, float f13, boolean z10, boolean z11, boolean z12, boolean z13, float f14, float f15, float f16, long j10, long j11) {
        float[] fArr3 = fArr;
        C17542s.j(fArr3, "trackingRatios");
        C17542s.j(iArr, "trackingStats");
        C17542s.j(fArr2, "lowIntensityRange");
        C17542s.j(iArr2, "panoTrackingStats");
        return new AndroidQuality(fArr3, iArr, num, i10, i11, fArr2, i12, f10, f11, iArr2, i13, i14, i15, f12, f13, z10, z11, z12, z13, f14, f15, f16, j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidQuality)) {
            return false;
        }
        AndroidQuality androidQuality = (AndroidQuality) obj;
        return C17542s.e(this.trackingRatios, androidQuality.trackingRatios) && C17542s.e(this.trackingStats, androidQuality.trackingStats) && C17542s.e(this.frameCount, androidQuality.frameCount) && this.framesWithLowIntensity == androidQuality.framesWithLowIntensity && this.framesWithNoPoints == androidQuality.framesWithNoPoints && C17542s.e(this.lowIntensityRange, androidQuality.lowIntensityRange) && this.pointsTotal == androidQuality.pointsTotal && Float.compare(this.principalPointRatioX, androidQuality.principalPointRatioX) == 0 && Float.compare(this.principalPointRatioY, androidQuality.principalPointRatioY) == 0 && C17542s.e(this.panoTrackingStats, androidQuality.panoTrackingStats) && this.panoFrameCount == androidQuality.panoFrameCount && this.panoFramesWithNoPoints == androidQuality.panoFramesWithNoPoints && this.panoPointsTotal == androidQuality.panoPointsTotal && Float.compare(this.panoPrincipalPointRatioX, androidQuality.panoPrincipalPointRatioX) == 0 && Float.compare(this.panoPrincipalPointRatioY, androidQuality.panoPrincipalPointRatioY) == 0 && this.poseAnchorEnabled == androidQuality.poseAnchorEnabled && this.poseAnchorCreated == androidQuality.poseAnchorCreated && this.floorAnchorEnabled == androidQuality.floorAnchorEnabled && this.floorAnchorCreated == androidQuality.floorAnchorCreated && Float.compare(this.onDrawMPF, androidQuality.onDrawMPF) == 0 && Float.compare(this.handleMPF, androidQuality.handleMPF) == 0 && Float.compare(this.handleEncodeMPF, androidQuality.handleEncodeMPF) == 0 && this.panoSize == androidQuality.panoSize && this.videoSize == androidQuality.videoSize;
    }

    public final boolean getFloorAnchorCreated() {
        return this.floorAnchorCreated;
    }

    public final boolean getFloorAnchorEnabled() {
        return this.floorAnchorEnabled;
    }

    public final Integer getFrameCount() {
        return this.frameCount;
    }

    public final int getFramesWithLowIntensity() {
        return this.framesWithLowIntensity;
    }

    public final int getFramesWithNoPoints() {
        return this.framesWithNoPoints;
    }

    public final float getHandleEncodeMPF() {
        return this.handleEncodeMPF;
    }

    public final float getHandleMPF() {
        return this.handleMPF;
    }

    public final float[] getLowIntensityRange() {
        return this.lowIntensityRange;
    }

    public final float getOnDrawMPF() {
        return this.onDrawMPF;
    }

    public final int getPanoFrameCount() {
        return this.panoFrameCount;
    }

    public final int getPanoFramesWithNoPoints() {
        return this.panoFramesWithNoPoints;
    }

    public final int getPanoPointsTotal() {
        return this.panoPointsTotal;
    }

    public final float getPanoPrincipalPointRatioX() {
        return this.panoPrincipalPointRatioX;
    }

    public final float getPanoPrincipalPointRatioY() {
        return this.panoPrincipalPointRatioY;
    }

    public final long getPanoSize() {
        return this.panoSize;
    }

    public final int[] getPanoTrackingStats() {
        return this.panoTrackingStats;
    }

    public final int getPointsTotal() {
        return this.pointsTotal;
    }

    public final boolean getPoseAnchorCreated() {
        return this.poseAnchorCreated;
    }

    public final boolean getPoseAnchorEnabled() {
        return this.poseAnchorEnabled;
    }

    public final float getPrincipalPointRatioX() {
        return this.principalPointRatioX;
    }

    public final float getPrincipalPointRatioY() {
        return this.principalPointRatioY;
    }

    public final float[] getTrackingRatios() {
        return this.trackingRatios;
    }

    public final int[] getTrackingStats() {
        return this.trackingStats;
    }

    public final long getVideoSize() {
        return this.videoSize;
    }

    public int hashCode() {
        int hashCode = ((Arrays.hashCode(this.trackingRatios) * 31) + Arrays.hashCode(this.trackingStats)) * 31;
        Integer num = this.frameCount;
        return ((((((((((((((((((((((((((((((((((((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.framesWithLowIntensity)) * 31) + Integer.hashCode(this.framesWithNoPoints)) * 31) + Arrays.hashCode(this.lowIntensityRange)) * 31) + Integer.hashCode(this.pointsTotal)) * 31) + Float.hashCode(this.principalPointRatioX)) * 31) + Float.hashCode(this.principalPointRatioY)) * 31) + Arrays.hashCode(this.panoTrackingStats)) * 31) + Integer.hashCode(this.panoFrameCount)) * 31) + Integer.hashCode(this.panoFramesWithNoPoints)) * 31) + Integer.hashCode(this.panoPointsTotal)) * 31) + Float.hashCode(this.panoPrincipalPointRatioX)) * 31) + Float.hashCode(this.panoPrincipalPointRatioY)) * 31) + Boolean.hashCode(this.poseAnchorEnabled)) * 31) + Boolean.hashCode(this.poseAnchorCreated)) * 31) + Boolean.hashCode(this.floorAnchorEnabled)) * 31) + Boolean.hashCode(this.floorAnchorCreated)) * 31) + Float.hashCode(this.onDrawMPF)) * 31) + Float.hashCode(this.handleMPF)) * 31) + Float.hashCode(this.handleEncodeMPF)) * 31) + Long.hashCode(this.panoSize)) * 31) + Long.hashCode(this.videoSize);
    }

    public String toString() {
        String arrays = Arrays.toString(this.trackingRatios);
        String arrays2 = Arrays.toString(this.trackingStats);
        Integer num = this.frameCount;
        int i10 = this.framesWithLowIntensity;
        int i11 = this.framesWithNoPoints;
        String arrays3 = Arrays.toString(this.lowIntensityRange);
        int i12 = this.pointsTotal;
        float f10 = this.principalPointRatioX;
        float f11 = this.principalPointRatioY;
        String arrays4 = Arrays.toString(this.panoTrackingStats);
        int i13 = this.panoFrameCount;
        int i14 = this.panoFramesWithNoPoints;
        int i15 = this.panoPointsTotal;
        float f12 = this.panoPrincipalPointRatioX;
        float f13 = this.panoPrincipalPointRatioY;
        boolean z10 = this.poseAnchorEnabled;
        boolean z11 = this.poseAnchorCreated;
        boolean z12 = this.floorAnchorEnabled;
        boolean z13 = this.floorAnchorCreated;
        float f14 = this.onDrawMPF;
        float f15 = this.handleMPF;
        float f16 = f12;
        long j10 = this.panoSize;
        long j11 = this.videoSize;
        return "AndroidQuality(trackingRatios=" + arrays + ", trackingStats=" + arrays2 + ", frameCount=" + num + ", framesWithLowIntensity=" + i10 + ", framesWithNoPoints=" + i11 + ", lowIntensityRange=" + arrays3 + ", pointsTotal=" + i12 + ", principalPointRatioX=" + f10 + ", principalPointRatioY=" + f11 + ", panoTrackingStats=" + arrays4 + ", panoFrameCount=" + i13 + ", panoFramesWithNoPoints=" + i14 + ", panoPointsTotal=" + i15 + ", panoPrincipalPointRatioX=" + f16 + ", panoPrincipalPointRatioY=" + f13 + ", poseAnchorEnabled=" + z10 + ", poseAnchorCreated=" + z11 + ", floorAnchorEnabled=" + z12 + ", floorAnchorCreated=" + z13 + ", onDrawMPF=" + f14 + ", handleMPF=" + f15 + ", handleEncodeMPF=" + this.handleEncodeMPF + ", panoSize=" + j10 + ", videoSize=" + j11 + ")";
    }

    public AndroidQuality(float[] fArr, int[] iArr, Integer num, int i10, int i11, float[] fArr2, int i12, float f10, float f11, int[] iArr2, int i13, int i14, int i15, float f12, float f13, boolean z10, boolean z11, boolean z12, boolean z13, float f14, float f15, float f16, long j10, long j11) {
        int[] iArr3 = iArr2;
        C17542s.j(fArr, "trackingRatios");
        C17542s.j(iArr, "trackingStats");
        C17542s.j(fArr2, "lowIntensityRange");
        C17542s.j(iArr3, "panoTrackingStats");
        this.trackingRatios = fArr;
        this.trackingStats = iArr;
        this.frameCount = num;
        this.framesWithLowIntensity = i10;
        this.framesWithNoPoints = i11;
        this.lowIntensityRange = fArr2;
        this.pointsTotal = i12;
        this.principalPointRatioX = f10;
        this.principalPointRatioY = f11;
        this.panoTrackingStats = iArr3;
        this.panoFrameCount = i13;
        this.panoFramesWithNoPoints = i14;
        this.panoPointsTotal = i15;
        this.panoPrincipalPointRatioX = f12;
        this.panoPrincipalPointRatioY = f13;
        this.poseAnchorEnabled = z10;
        this.poseAnchorCreated = z11;
        this.floorAnchorEnabled = z12;
        this.floorAnchorCreated = z13;
        this.onDrawMPF = f14;
        this.handleMPF = f15;
        this.handleEncodeMPF = f16;
        this.panoSize = j10;
        this.videoSize = j11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AndroidQuality(float[] r29, int[] r30, java.lang.Integer r31, int r32, int r33, float[] r34, int r35, float r36, float r37, int[] r38, int r39, int r40, int r41, float r42, float r43, boolean r44, boolean r45, boolean r46, boolean r47, float r48, float r49, float r50, long r51, long r53, int r55, kotlin.jvm.internal.DefaultConstructorMarker r56) {
        /*
            r28 = this;
            r0 = r55
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000a
            float[] r1 = new float[r2]
            goto L_0x000c
        L_0x000a:
            r1 = r29
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0013
            int[] r3 = new int[r2]
            goto L_0x0015
        L_0x0013:
            r3 = r30
        L_0x0015:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001b
            r4 = 0
            goto L_0x001d
        L_0x001b:
            r4 = r31
        L_0x001d:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0023
            r5 = r2
            goto L_0x0025
        L_0x0023:
            r5 = r32
        L_0x0025:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002b
            r6 = r2
            goto L_0x002d
        L_0x002b:
            r6 = r33
        L_0x002d:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0034
            float[] r7 = new float[r2]
            goto L_0x0036
        L_0x0034:
            r7 = r34
        L_0x0036:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003c
            r8 = r2
            goto L_0x003e
        L_0x003c:
            r8 = r35
        L_0x003e:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0044
            r9 = 0
            goto L_0x0046
        L_0x0044:
            r9 = r36
        L_0x0046:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004c
            r11 = 0
            goto L_0x004e
        L_0x004c:
            r11 = r37
        L_0x004e:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0055
            int[] r12 = new int[r2]
            goto L_0x0057
        L_0x0055:
            r12 = r38
        L_0x0057:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005d
            r13 = r2
            goto L_0x005f
        L_0x005d:
            r13 = r39
        L_0x005f:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0065
            r14 = r2
            goto L_0x0067
        L_0x0065:
            r14 = r40
        L_0x0067:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006d
            r15 = r2
            goto L_0x006f
        L_0x006d:
            r15 = r41
        L_0x006f:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0075
            r2 = 0
            goto L_0x0077
        L_0x0075:
            r2 = r42
        L_0x0077:
            r10 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x007d
            r10 = 0
            goto L_0x007f
        L_0x007d:
            r10 = r43
        L_0x007f:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0089
            r16 = 0
            goto L_0x008b
        L_0x0089:
            r16 = r44
        L_0x008b:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0094
            r17 = 0
            goto L_0x0096
        L_0x0094:
            r17 = r45
        L_0x0096:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009f
            r18 = 0
            goto L_0x00a1
        L_0x009f:
            r18 = r46
        L_0x00a1:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00aa
            r19 = 0
            goto L_0x00ac
        L_0x00aa:
            r19 = r47
        L_0x00ac:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b5
            r20 = 0
            goto L_0x00b7
        L_0x00b5:
            r20 = r48
        L_0x00b7:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00c0
            r21 = 0
            goto L_0x00c2
        L_0x00c0:
            r21 = r49
        L_0x00c2:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00cb
            r22 = 0
            goto L_0x00cd
        L_0x00cb:
            r22 = r50
        L_0x00cd:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            r24 = 0
            if (r23 == 0) goto L_0x00d8
            r26 = r24
            goto L_0x00da
        L_0x00d8:
            r26 = r51
        L_0x00da:
            r23 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r23
            if (r0 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r24 = r53
        L_0x00e3:
            r29 = r28
            r30 = r1
            r31 = r3
            r32 = r4
            r33 = r5
            r34 = r6
            r35 = r7
            r36 = r8
            r37 = r9
            r38 = r11
            r39 = r12
            r40 = r13
            r41 = r14
            r42 = r15
            r43 = r2
            r44 = r10
            r45 = r16
            r46 = r17
            r47 = r18
            r48 = r19
            r49 = r20
            r50 = r21
            r51 = r22
            r52 = r26
            r54 = r24
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.model.AndroidQuality.<init>(float[], int[], java.lang.Integer, int, int, float[], int, float, float, int[], int, int, int, float, float, boolean, boolean, boolean, boolean, float, float, float, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
