package com.sugarcube.app.base.data.asset;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B3\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/sugarcube/app/base/data/asset/VideoAsset;", "", "filename", "", "group", "Lcom/sugarcube/app/base/data/asset/VideoGroup;", "md5", "baseUrl", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/sugarcube/app/base/data/asset/VideoGroup;Ljava/lang/String;Ljava/lang/String;)V", "getFilename", "()Ljava/lang/String;", "getGroup", "()Lcom/sugarcube/app/base/data/asset/VideoGroup;", "getMd5", "getBaseUrl", "LANDING_ENTRY_POINT", "LANDING_SHOWROOMS", "MEMBERSHIP_ENTRY_POINT", "CAPTURE_ICON_ALIGN", "CAPTURE_ICON_SNAP_LEFT", "CAPTURE_ICON_SNAP_RIGHT", "CAPTURE_ICON_SCAN", "HYBRID_TUTORIAL_STEP_1_V04", "HYBRID_TUTORIAL_STEP_2_V02", "HYBRID_TUTORIAL_STEP_3_V02", "HYBRID_TUTORIAL_STEP_4_V02", "HYBRID_TUTORIAL_STEP_3_1_V01", "HYBRID_UW_TUTORIAL_STEP_1_V01", "HYBRID_UW_TUTORIAL_STEP_2_V02", "HYBRID_UW_TUTORIAL_STEP_3_V02", "HYBRID_UW_TUTORIAL_STEP_4_V02", "HYBRID_UW_TUTORIAL_STEP_3_1_V01", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum VideoAsset {
    LANDING_ENTRY_POINT("landing_entry_point.mp4", r4, "96b48857147d75a8594100887de3d61a", (VideoGroup) null, 8, (String) null),
    LANDING_SHOWROOMS("landing_showrooms.mp4", r4, "cfe6fb531c5f5027383fff86f451b38e", (VideoGroup) null, 8, (String) null),
    MEMBERSHIP_ENTRY_POINT("membership_entry_point.webm", r4, "f800a6e6b01a689e7cd76044ffd4c53d", VideoAssetRepositoryKt.GM_ASSET_BASE_URL),
    CAPTURE_ICON_ALIGN("capture_icon_align.mp4", r10, "11c006dd763b96a69d3a6d74b42ec73c", (VideoGroup) null, 8, (String) null),
    CAPTURE_ICON_SNAP_LEFT("capture_icon_snap_left.mp4", r5, "1dca1e387e41e2ee14dfafc522d7fbf6", (VideoGroup) null, 8, (String) null),
    CAPTURE_ICON_SNAP_RIGHT("capture_icon_snap_right.mp4", r5, "378f15672f5039d8988b4301440fc53f", (VideoGroup) null, 8, (String) null),
    CAPTURE_ICON_SCAN("capture_icon_scan.mp4", r5, "f1cdcffba05f362952058321431d2d31", (VideoGroup) null, 8, (String) null),
    HYBRID_TUTORIAL_STEP_1_V04("hybrid_tutorial_step_1_v04.mp4", r10, "75b75cba4375f40ef993be24b1f20627", (VideoGroup) null, 8, (String) null),
    HYBRID_TUTORIAL_STEP_2_V02("hybrid_tutorial_step_2_v02.mp4", r5, "32295900b9b3990dcf26475a60ed7aa9", (VideoGroup) null, 8, (String) null),
    HYBRID_TUTORIAL_STEP_3_V02("hybrid_tutorial_step_3_v02.mp4", r5, "90d7fcf0eaaadbff6858c9ae2863a074", (VideoGroup) null, 8, (String) null),
    HYBRID_TUTORIAL_STEP_4_V02("hybrid_tutorial_step_4_v02.mp4", r5, "4911593370d2bda6c2948fa4fcfd3530", (VideoGroup) null, 8, (String) null),
    HYBRID_TUTORIAL_STEP_3_1_V01("GML006_TUT_FLOOR_SCAN_PT_B_v01.mp4", r5, "1aa9fd34e0aafa83d19221f3d5d265f7", VideoAssetRepositoryKt.GM_ASSET_BASE_URL),
    HYBRID_UW_TUTORIAL_STEP_1_V01("hybrid_uw_tutorial_step_1_v01.mp4", r10, "c1f1f6909932c53b7856633099cff93b", (VideoGroup) null, 8, (String) null),
    HYBRID_UW_TUTORIAL_STEP_2_V02("hybrid_uw_tutorial_step_2_v02.mp4", r5, "c4e52c603eb09f30960e496714ed02c5", (VideoGroup) null, 8, (String) null),
    HYBRID_UW_TUTORIAL_STEP_3_V02("hybrid_uw_tutorial_step_3_v02.mp4", r5, "c9884cf2c18f254755981804584ed23b", (VideoGroup) null, 8, (String) null),
    HYBRID_UW_TUTORIAL_STEP_4_V02("hybrid_uw_tutorial_step_4_v02.mp4", r5, "7c9f110ea53d9bf8066beb6948eb1bdc", (VideoGroup) null, 8, (String) null),
    HYBRID_UW_TUTORIAL_STEP_3_1_V01("GML006_TUT_FLOOR_SCAN_LS_B_v01.mp4", r5, "ab9f0612881ec20c87408181f95f6dda", VideoAssetRepositoryKt.GM_ASSET_BASE_URL);
    
    private final String baseUrl;
    private final String filename;
    private final VideoGroup group;
    private final String md5;

    static {
        VideoAsset[] $values;
        $ENTRIES = C17221b.a($values);
    }

    private VideoAsset(String str, VideoGroup videoGroup, String str2, String str3) {
        this.filename = str;
        this.group = videoGroup;
        this.md5 = str2;
        this.baseUrl = str3;
    }

    public static C17220a<VideoAsset> getEntries() {
        return $ENTRIES;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final VideoGroup getGroup() {
        return this.group;
    }

    public final String getMd5() {
        return this.md5;
    }
}
