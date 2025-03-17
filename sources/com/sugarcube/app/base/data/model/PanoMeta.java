package com.sugarcube.app.base.data.model;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0002\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003HÆ\u0003J\u0011\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0003HÆ\u0003J©\u0002\u0010:\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0003HÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0004HÖ\u0001J\t\u0010?\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001a¨\u0006@"}, d2 = {"Lcom/sugarcube/app/base/data/model/PanoMeta;", "", "poseIndexes", "", "", "shutterSpeeds", "", "iso", "evOffsets", "lensPosition", "exposureBias", "whiteBalanceGains", "maxWhiteBalanceGain", "", "grayWorldWhiteBalanceGain", "whiteBalanceChromacity", "whiteBalanceTemperature", "aperture", "ambientIntensity", "ambientColorTemperature", "anchorPose", "states", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getPoseIndexes", "()Ljava/util/List;", "getShutterSpeeds", "getIso", "getEvOffsets", "getLensPosition", "getExposureBias", "getWhiteBalanceGains", "getMaxWhiteBalanceGain", "getGrayWorldWhiteBalanceGain", "getWhiteBalanceChromacity", "getWhiteBalanceTemperature", "getAperture", "getAmbientIntensity", "getAmbientColorTemperature", "getAnchorPose", "getStates", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "hashCode", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class PanoMeta {
    public static final int $stable = 8;
    private final List<Float> ambientColorTemperature;
    private final List<Float> ambientIntensity;
    private final List<float[]> anchorPose;
    private final List<Float> aperture;
    private final List<Float> evOffsets;
    private final List<Integer> exposureBias;
    private final List<float[]> grayWorldWhiteBalanceGain;
    private final List<Float> iso;
    private final List<Float> lensPosition;
    private final List<float[]> maxWhiteBalanceGain;
    private final List<Integer> poseIndexes;
    private final List<Float> shutterSpeeds;
    private final List<String> states;
    private final List<float[]> whiteBalanceChromacity;
    private final List<Integer> whiteBalanceGains;
    private final List<float[]> whiteBalanceTemperature;

    public PanoMeta(List<Integer> list, List<Float> list2, List<Float> list3, List<Float> list4, List<Float> list5, List<Integer> list6, List<Integer> list7, List<float[]> list8, List<float[]> list9, List<float[]> list10, List<float[]> list11, List<Float> list12, List<Float> list13, List<Float> list14, List<float[]> list15, List<String> list16) {
        List<Integer> list17 = list;
        List<Float> list18 = list2;
        List<Float> list19 = list3;
        List<Float> list20 = list4;
        List<Float> list21 = list5;
        List<Integer> list22 = list6;
        List<Integer> list23 = list7;
        List<float[]> list24 = list8;
        List<float[]> list25 = list9;
        List<float[]> list26 = list10;
        List<float[]> list27 = list11;
        List<Float> list28 = list12;
        List<Float> list29 = list13;
        List<Float> list30 = list14;
        C17542s.j(list17, "poseIndexes");
        C17542s.j(list18, "shutterSpeeds");
        C17542s.j(list19, "iso");
        C17542s.j(list20, "evOffsets");
        C17542s.j(list21, "lensPosition");
        C17542s.j(list22, "exposureBias");
        C17542s.j(list23, "whiteBalanceGains");
        C17542s.j(list24, "maxWhiteBalanceGain");
        C17542s.j(list25, "grayWorldWhiteBalanceGain");
        C17542s.j(list26, "whiteBalanceChromacity");
        C17542s.j(list27, "whiteBalanceTemperature");
        C17542s.j(list28, "aperture");
        C17542s.j(list29, "ambientIntensity");
        C17542s.j(list30, "ambientColorTemperature");
        C17542s.j(list15, "anchorPose");
        List<String> list31 = list16;
        C17542s.j(list31, "states");
        this.poseIndexes = list17;
        this.shutterSpeeds = list18;
        this.iso = list19;
        this.evOffsets = list20;
        this.lensPosition = list21;
        this.exposureBias = list22;
        this.whiteBalanceGains = list23;
        this.maxWhiteBalanceGain = list24;
        this.grayWorldWhiteBalanceGain = list25;
        this.whiteBalanceChromacity = list26;
        this.whiteBalanceTemperature = list27;
        this.aperture = list28;
        this.ambientIntensity = list29;
        this.ambientColorTemperature = list30;
        this.anchorPose = list15;
        this.states = list31;
    }

    public static /* synthetic */ PanoMeta copy$default(PanoMeta panoMeta, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, int i10, Object obj) {
        PanoMeta panoMeta2 = panoMeta;
        int i11 = i10;
        return panoMeta.copy((i11 & 1) != 0 ? panoMeta2.poseIndexes : list, (i11 & 2) != 0 ? panoMeta2.shutterSpeeds : list2, (i11 & 4) != 0 ? panoMeta2.iso : list3, (i11 & 8) != 0 ? panoMeta2.evOffsets : list4, (i11 & 16) != 0 ? panoMeta2.lensPosition : list5, (i11 & 32) != 0 ? panoMeta2.exposureBias : list6, (i11 & 64) != 0 ? panoMeta2.whiteBalanceGains : list7, (i11 & 128) != 0 ? panoMeta2.maxWhiteBalanceGain : list8, (i11 & 256) != 0 ? panoMeta2.grayWorldWhiteBalanceGain : list9, (i11 & 512) != 0 ? panoMeta2.whiteBalanceChromacity : list10, (i11 & 1024) != 0 ? panoMeta2.whiteBalanceTemperature : list11, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? panoMeta2.aperture : list12, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? panoMeta2.ambientIntensity : list13, (i11 & 8192) != 0 ? panoMeta2.ambientColorTemperature : list14, (i11 & 16384) != 0 ? panoMeta2.anchorPose : list15, (i11 & 32768) != 0 ? panoMeta2.states : list16);
    }

    public final List<Integer> component1() {
        return this.poseIndexes;
    }

    public final List<float[]> component10() {
        return this.whiteBalanceChromacity;
    }

    public final List<float[]> component11() {
        return this.whiteBalanceTemperature;
    }

    public final List<Float> component12() {
        return this.aperture;
    }

    public final List<Float> component13() {
        return this.ambientIntensity;
    }

    public final List<Float> component14() {
        return this.ambientColorTemperature;
    }

    public final List<float[]> component15() {
        return this.anchorPose;
    }

    public final List<String> component16() {
        return this.states;
    }

    public final List<Float> component2() {
        return this.shutterSpeeds;
    }

    public final List<Float> component3() {
        return this.iso;
    }

    public final List<Float> component4() {
        return this.evOffsets;
    }

    public final List<Float> component5() {
        return this.lensPosition;
    }

    public final List<Integer> component6() {
        return this.exposureBias;
    }

    public final List<Integer> component7() {
        return this.whiteBalanceGains;
    }

    public final List<float[]> component8() {
        return this.maxWhiteBalanceGain;
    }

    public final List<float[]> component9() {
        return this.grayWorldWhiteBalanceGain;
    }

    public final PanoMeta copy(List<Integer> list, List<Float> list2, List<Float> list3, List<Float> list4, List<Float> list5, List<Integer> list6, List<Integer> list7, List<float[]> list8, List<float[]> list9, List<float[]> list10, List<float[]> list11, List<Float> list12, List<Float> list13, List<Float> list14, List<float[]> list15, List<String> list16) {
        List<Integer> list17 = list;
        C17542s.j(list17, "poseIndexes");
        C17542s.j(list2, "shutterSpeeds");
        C17542s.j(list3, "iso");
        C17542s.j(list4, "evOffsets");
        C17542s.j(list5, "lensPosition");
        C17542s.j(list6, "exposureBias");
        C17542s.j(list7, "whiteBalanceGains");
        C17542s.j(list8, "maxWhiteBalanceGain");
        C17542s.j(list9, "grayWorldWhiteBalanceGain");
        C17542s.j(list10, "whiteBalanceChromacity");
        C17542s.j(list11, "whiteBalanceTemperature");
        C17542s.j(list12, "aperture");
        C17542s.j(list13, "ambientIntensity");
        C17542s.j(list14, "ambientColorTemperature");
        C17542s.j(list15, "anchorPose");
        C17542s.j(list16, "states");
        return new PanoMeta(list17, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, list16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanoMeta)) {
            return false;
        }
        PanoMeta panoMeta = (PanoMeta) obj;
        return C17542s.e(this.poseIndexes, panoMeta.poseIndexes) && C17542s.e(this.shutterSpeeds, panoMeta.shutterSpeeds) && C17542s.e(this.iso, panoMeta.iso) && C17542s.e(this.evOffsets, panoMeta.evOffsets) && C17542s.e(this.lensPosition, panoMeta.lensPosition) && C17542s.e(this.exposureBias, panoMeta.exposureBias) && C17542s.e(this.whiteBalanceGains, panoMeta.whiteBalanceGains) && C17542s.e(this.maxWhiteBalanceGain, panoMeta.maxWhiteBalanceGain) && C17542s.e(this.grayWorldWhiteBalanceGain, panoMeta.grayWorldWhiteBalanceGain) && C17542s.e(this.whiteBalanceChromacity, panoMeta.whiteBalanceChromacity) && C17542s.e(this.whiteBalanceTemperature, panoMeta.whiteBalanceTemperature) && C17542s.e(this.aperture, panoMeta.aperture) && C17542s.e(this.ambientIntensity, panoMeta.ambientIntensity) && C17542s.e(this.ambientColorTemperature, panoMeta.ambientColorTemperature) && C17542s.e(this.anchorPose, panoMeta.anchorPose) && C17542s.e(this.states, panoMeta.states);
    }

    public final List<Float> getAmbientColorTemperature() {
        return this.ambientColorTemperature;
    }

    public final List<Float> getAmbientIntensity() {
        return this.ambientIntensity;
    }

    public final List<float[]> getAnchorPose() {
        return this.anchorPose;
    }

    public final List<Float> getAperture() {
        return this.aperture;
    }

    public final List<Float> getEvOffsets() {
        return this.evOffsets;
    }

    public final List<Integer> getExposureBias() {
        return this.exposureBias;
    }

    public final List<float[]> getGrayWorldWhiteBalanceGain() {
        return this.grayWorldWhiteBalanceGain;
    }

    public final List<Float> getIso() {
        return this.iso;
    }

    public final List<Float> getLensPosition() {
        return this.lensPosition;
    }

    public final List<float[]> getMaxWhiteBalanceGain() {
        return this.maxWhiteBalanceGain;
    }

    public final List<Integer> getPoseIndexes() {
        return this.poseIndexes;
    }

    public final List<Float> getShutterSpeeds() {
        return this.shutterSpeeds;
    }

    public final List<String> getStates() {
        return this.states;
    }

    public final List<float[]> getWhiteBalanceChromacity() {
        return this.whiteBalanceChromacity;
    }

    public final List<Integer> getWhiteBalanceGains() {
        return this.whiteBalanceGains;
    }

    public final List<float[]> getWhiteBalanceTemperature() {
        return this.whiteBalanceTemperature;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.poseIndexes.hashCode() * 31) + this.shutterSpeeds.hashCode()) * 31) + this.iso.hashCode()) * 31) + this.evOffsets.hashCode()) * 31) + this.lensPosition.hashCode()) * 31) + this.exposureBias.hashCode()) * 31) + this.whiteBalanceGains.hashCode()) * 31) + this.maxWhiteBalanceGain.hashCode()) * 31) + this.grayWorldWhiteBalanceGain.hashCode()) * 31) + this.whiteBalanceChromacity.hashCode()) * 31) + this.whiteBalanceTemperature.hashCode()) * 31) + this.aperture.hashCode()) * 31) + this.ambientIntensity.hashCode()) * 31) + this.ambientColorTemperature.hashCode()) * 31) + this.anchorPose.hashCode()) * 31) + this.states.hashCode();
    }

    public String toString() {
        List<Integer> list = this.poseIndexes;
        List<Float> list2 = this.shutterSpeeds;
        List<Float> list3 = this.iso;
        List<Float> list4 = this.evOffsets;
        List<Float> list5 = this.lensPosition;
        List<Integer> list6 = this.exposureBias;
        List<Integer> list7 = this.whiteBalanceGains;
        List<float[]> list8 = this.maxWhiteBalanceGain;
        List<float[]> list9 = this.grayWorldWhiteBalanceGain;
        List<float[]> list10 = this.whiteBalanceChromacity;
        List<float[]> list11 = this.whiteBalanceTemperature;
        List<Float> list12 = this.aperture;
        List<Float> list13 = this.ambientIntensity;
        List<Float> list14 = this.ambientColorTemperature;
        List<float[]> list15 = this.anchorPose;
        List<String> list16 = this.states;
        return "PanoMeta(poseIndexes=" + list + ", shutterSpeeds=" + list2 + ", iso=" + list3 + ", evOffsets=" + list4 + ", lensPosition=" + list5 + ", exposureBias=" + list6 + ", whiteBalanceGains=" + list7 + ", maxWhiteBalanceGain=" + list8 + ", grayWorldWhiteBalanceGain=" + list9 + ", whiteBalanceChromacity=" + list10 + ", whiteBalanceTemperature=" + list11 + ", aperture=" + list12 + ", ambientIntensity=" + list13 + ", ambientColorTemperature=" + list14 + ", anchorPose=" + list15 + ", states=" + list16 + ")";
    }
}
