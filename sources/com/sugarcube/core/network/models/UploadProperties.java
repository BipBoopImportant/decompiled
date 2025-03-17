package com.sugarcube.core.network.models;

import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.squareup.moshi.g;
import com.sugarcube.app.base.network.models.UploadKt;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bH\b\b\u0018\u00002\u00020\u0001B¥\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000f\u0012\b\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010T\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010U\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010^\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010_\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010`\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00102J\u0011\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001fHÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00102J\u000b\u0010c\u001a\u0004\u0018\u00010\"HÆ\u0003Jä\u0002\u0010d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"HÆ\u0001¢\u0006\u0002\u0010eJ\u0013\u0010f\u001a\u00020\u000f2\b\u0010g\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010h\u001a\u00020\u0012HÖ\u0001J\t\u0010i\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u00103\u001a\u0004\b4\u00102R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00107\u001a\u0004\b:\u00106R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010&R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010&R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u00103\u001a\u0004\b?\u00102R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u00103\u001a\u0004\b@\u00102R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u00103\u001a\u0004\bA\u00102R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u00103\u001a\u0004\bB\u00102R\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0015\u0010 \u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u00103\u001a\u0004\bE\u00102R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bF\u0010G¨\u0006j"}, d2 = {"Lcom/sugarcube/core/network/models/UploadProperties;", "", "dataFormatVersion", "", "platform", "appEnvironment", "appPackageName", "appVersion", "libVersion", "osVersion", "deviceModel", "deviceManufacturer", "captureTimestamp", "captureStrategy", "hasDepth", "", "ultraDepth", "batteryLevel", "", "panoConfiguration", "scanConfiguration", "primaryImageCount", "primaryImageLens", "primaryImageOrientation", "scanOrientation", "region", "captureV2", "ownVideo", "forceLandscape", "swapRgb", "optimizelyFlags", "", "uploadV2", "workerId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/UUID;)V", "getDataFormatVersion", "()Ljava/lang/String;", "getPlatform", "getAppEnvironment", "getAppPackageName", "getAppVersion", "getLibVersion", "getOsVersion", "getDeviceModel", "getDeviceManufacturer", "getCaptureTimestamp", "getCaptureStrategy", "getHasDepth", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUltraDepth", "getBatteryLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPanoConfiguration", "getScanConfiguration", "getPrimaryImageCount", "getPrimaryImageLens", "getPrimaryImageOrientation", "getScanOrientation", "getRegion", "getCaptureV2", "getOwnVideo", "getForceLandscape", "getSwapRgb", "getOptimizelyFlags", "()Ljava/util/List;", "getUploadV2", "getWorkerId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/UUID;)Lcom/sugarcube/core/network/models/UploadProperties;", "equals", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class UploadProperties {
    private final String appEnvironment;
    private final String appPackageName;
    private final String appVersion;
    private final Integer batteryLevel;
    private final String captureStrategy;
    private final String captureTimestamp;
    private final Boolean captureV2;
    private final String dataFormatVersion;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final Boolean forceLandscape;
    private final Boolean hasDepth;
    private final String libVersion;
    private final List<String> optimizelyFlags;
    private final String osVersion;
    private final Boolean ownVideo;
    private final String panoConfiguration;
    private final String platform;
    private final Integer primaryImageCount;
    private final String primaryImageLens;
    private final String primaryImageOrientation;
    private final String region;
    private final String scanConfiguration;
    private final String scanOrientation;
    private final Boolean swapRgb;
    private final Boolean ultraDepth;
    private final Boolean uploadV2;
    private final UUID workerId;

    public UploadProperties(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, Boolean bool2, Integer num, String str12, String str13, Integer num2, String str14, String str15, String str16, String str17, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, List<String> list, Boolean bool7, UUID uuid) {
        this.dataFormatVersion = str;
        this.platform = str2;
        this.appEnvironment = str3;
        this.appPackageName = str4;
        this.appVersion = str5;
        this.libVersion = str6;
        this.osVersion = str7;
        this.deviceModel = str8;
        this.deviceManufacturer = str9;
        this.captureTimestamp = str10;
        this.captureStrategy = str11;
        this.hasDepth = bool;
        this.ultraDepth = bool2;
        this.batteryLevel = num;
        this.panoConfiguration = str12;
        this.scanConfiguration = str13;
        this.primaryImageCount = num2;
        this.primaryImageLens = str14;
        this.primaryImageOrientation = str15;
        this.scanOrientation = str16;
        this.region = str17;
        this.captureV2 = bool3;
        this.ownVideo = bool4;
        this.forceLandscape = bool5;
        this.swapRgb = bool6;
        this.optimizelyFlags = list;
        this.uploadV2 = bool7;
        this.workerId = uuid;
    }

    public static /* synthetic */ UploadProperties copy$default(UploadProperties uploadProperties, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, Boolean bool2, Integer num, String str12, String str13, Integer num2, String str14, String str15, String str16, String str17, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, List list, Boolean bool7, UUID uuid, int i10, Object obj) {
        UploadProperties uploadProperties2 = uploadProperties;
        int i11 = i10;
        return uploadProperties.copy((i11 & 1) != 0 ? uploadProperties2.dataFormatVersion : str, (i11 & 2) != 0 ? uploadProperties2.platform : str2, (i11 & 4) != 0 ? uploadProperties2.appEnvironment : str3, (i11 & 8) != 0 ? uploadProperties2.appPackageName : str4, (i11 & 16) != 0 ? uploadProperties2.appVersion : str5, (i11 & 32) != 0 ? uploadProperties2.libVersion : str6, (i11 & 64) != 0 ? uploadProperties2.osVersion : str7, (i11 & 128) != 0 ? uploadProperties2.deviceModel : str8, (i11 & 256) != 0 ? uploadProperties2.deviceManufacturer : str9, (i11 & 512) != 0 ? uploadProperties2.captureTimestamp : str10, (i11 & 1024) != 0 ? uploadProperties2.captureStrategy : str11, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? uploadProperties2.hasDepth : bool, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? uploadProperties2.ultraDepth : bool2, (i11 & 8192) != 0 ? uploadProperties2.batteryLevel : num, (i11 & 16384) != 0 ? uploadProperties2.panoConfiguration : str12, (i11 & 32768) != 0 ? uploadProperties2.scanConfiguration : str13, (i11 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? uploadProperties2.primaryImageCount : num2, (i11 & 131072) != 0 ? uploadProperties2.primaryImageLens : str14, (i11 & 262144) != 0 ? uploadProperties2.primaryImageOrientation : str15, (i11 & ImageMetadata.LENS_APERTURE) != 0 ? uploadProperties2.scanOrientation : str16, (i11 & ImageMetadata.SHADING_MODE) != 0 ? uploadProperties2.region : str17, (i11 & UploadKt.MAX_CHUNK_SIZE) != 0 ? uploadProperties2.captureV2 : bool3, (i11 & 4194304) != 0 ? uploadProperties2.ownVideo : bool4, (i11 & 8388608) != 0 ? uploadProperties2.forceLandscape : bool5, (i11 & 16777216) != 0 ? uploadProperties2.swapRgb : bool6, (i11 & 33554432) != 0 ? uploadProperties2.optimizelyFlags : list, (i11 & 67108864) != 0 ? uploadProperties2.uploadV2 : bool7, (i11 & 134217728) != 0 ? uploadProperties2.workerId : uuid);
    }

    public final String component1() {
        return this.dataFormatVersion;
    }

    public final String component10() {
        return this.captureTimestamp;
    }

    public final String component11() {
        return this.captureStrategy;
    }

    public final Boolean component12() {
        return this.hasDepth;
    }

    public final Boolean component13() {
        return this.ultraDepth;
    }

    public final Integer component14() {
        return this.batteryLevel;
    }

    public final String component15() {
        return this.panoConfiguration;
    }

    public final String component16() {
        return this.scanConfiguration;
    }

    public final Integer component17() {
        return this.primaryImageCount;
    }

    public final String component18() {
        return this.primaryImageLens;
    }

    public final String component19() {
        return this.primaryImageOrientation;
    }

    public final String component2() {
        return this.platform;
    }

    public final String component20() {
        return this.scanOrientation;
    }

    public final String component21() {
        return this.region;
    }

    public final Boolean component22() {
        return this.captureV2;
    }

    public final Boolean component23() {
        return this.ownVideo;
    }

    public final Boolean component24() {
        return this.forceLandscape;
    }

    public final Boolean component25() {
        return this.swapRgb;
    }

    public final List<String> component26() {
        return this.optimizelyFlags;
    }

    public final Boolean component27() {
        return this.uploadV2;
    }

    public final UUID component28() {
        return this.workerId;
    }

    public final String component3() {
        return this.appEnvironment;
    }

    public final String component4() {
        return this.appPackageName;
    }

    public final String component5() {
        return this.appVersion;
    }

    public final String component6() {
        return this.libVersion;
    }

    public final String component7() {
        return this.osVersion;
    }

    public final String component8() {
        return this.deviceModel;
    }

    public final String component9() {
        return this.deviceManufacturer;
    }

    public final UploadProperties copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, Boolean bool2, Integer num, String str12, String str13, Integer num2, String str14, String str15, String str16, String str17, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, List<String> list, Boolean bool7, UUID uuid) {
        return new UploadProperties(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, bool, bool2, num, str12, str13, num2, str14, str15, str16, str17, bool3, bool4, bool5, bool6, list, bool7, uuid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadProperties)) {
            return false;
        }
        UploadProperties uploadProperties = (UploadProperties) obj;
        return C17542s.e(this.dataFormatVersion, uploadProperties.dataFormatVersion) && C17542s.e(this.platform, uploadProperties.platform) && C17542s.e(this.appEnvironment, uploadProperties.appEnvironment) && C17542s.e(this.appPackageName, uploadProperties.appPackageName) && C17542s.e(this.appVersion, uploadProperties.appVersion) && C17542s.e(this.libVersion, uploadProperties.libVersion) && C17542s.e(this.osVersion, uploadProperties.osVersion) && C17542s.e(this.deviceModel, uploadProperties.deviceModel) && C17542s.e(this.deviceManufacturer, uploadProperties.deviceManufacturer) && C17542s.e(this.captureTimestamp, uploadProperties.captureTimestamp) && C17542s.e(this.captureStrategy, uploadProperties.captureStrategy) && C17542s.e(this.hasDepth, uploadProperties.hasDepth) && C17542s.e(this.ultraDepth, uploadProperties.ultraDepth) && C17542s.e(this.batteryLevel, uploadProperties.batteryLevel) && C17542s.e(this.panoConfiguration, uploadProperties.panoConfiguration) && C17542s.e(this.scanConfiguration, uploadProperties.scanConfiguration) && C17542s.e(this.primaryImageCount, uploadProperties.primaryImageCount) && C17542s.e(this.primaryImageLens, uploadProperties.primaryImageLens) && C17542s.e(this.primaryImageOrientation, uploadProperties.primaryImageOrientation) && C17542s.e(this.scanOrientation, uploadProperties.scanOrientation) && C17542s.e(this.region, uploadProperties.region) && C17542s.e(this.captureV2, uploadProperties.captureV2) && C17542s.e(this.ownVideo, uploadProperties.ownVideo) && C17542s.e(this.forceLandscape, uploadProperties.forceLandscape) && C17542s.e(this.swapRgb, uploadProperties.swapRgb) && C17542s.e(this.optimizelyFlags, uploadProperties.optimizelyFlags) && C17542s.e(this.uploadV2, uploadProperties.uploadV2) && C17542s.e(this.workerId, uploadProperties.workerId);
    }

    public final String getAppEnvironment() {
        return this.appEnvironment;
    }

    public final String getAppPackageName() {
        return this.appPackageName;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final Integer getBatteryLevel() {
        return this.batteryLevel;
    }

    public final String getCaptureStrategy() {
        return this.captureStrategy;
    }

    public final String getCaptureTimestamp() {
        return this.captureTimestamp;
    }

    public final Boolean getCaptureV2() {
        return this.captureV2;
    }

    public final String getDataFormatVersion() {
        return this.dataFormatVersion;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final Boolean getForceLandscape() {
        return this.forceLandscape;
    }

    public final Boolean getHasDepth() {
        return this.hasDepth;
    }

    public final String getLibVersion() {
        return this.libVersion;
    }

    public final List<String> getOptimizelyFlags() {
        return this.optimizelyFlags;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final Boolean getOwnVideo() {
        return this.ownVideo;
    }

    public final String getPanoConfiguration() {
        return this.panoConfiguration;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final Integer getPrimaryImageCount() {
        return this.primaryImageCount;
    }

    public final String getPrimaryImageLens() {
        return this.primaryImageLens;
    }

    public final String getPrimaryImageOrientation() {
        return this.primaryImageOrientation;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getScanConfiguration() {
        return this.scanConfiguration;
    }

    public final String getScanOrientation() {
        return this.scanOrientation;
    }

    public final Boolean getSwapRgb() {
        return this.swapRgb;
    }

    public final Boolean getUltraDepth() {
        return this.ultraDepth;
    }

    public final Boolean getUploadV2() {
        return this.uploadV2;
    }

    public final UUID getWorkerId() {
        return this.workerId;
    }

    public int hashCode() {
        String str = this.dataFormatVersion;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.platform;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appEnvironment;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appPackageName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appVersion;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.libVersion;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.osVersion;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deviceModel;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.deviceManufacturer;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.captureTimestamp;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.captureStrategy;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool = this.hasDepth;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.ultraDepth;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.batteryLevel;
        int hashCode14 = (hashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        String str12 = this.panoConfiguration;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.scanConfiguration;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num2 = this.primaryImageCount;
        int hashCode17 = (hashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str14 = this.primaryImageLens;
        int hashCode18 = (hashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.primaryImageOrientation;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.scanOrientation;
        int hashCode20 = (hashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.region;
        int hashCode21 = (hashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Boolean bool3 = this.captureV2;
        int hashCode22 = (hashCode21 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.ownVideo;
        int hashCode23 = (hashCode22 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.forceLandscape;
        int hashCode24 = (hashCode23 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.swapRgb;
        int hashCode25 = (hashCode24 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        List<String> list = this.optimizelyFlags;
        int hashCode26 = (hashCode25 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool7 = this.uploadV2;
        int hashCode27 = (hashCode26 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        UUID uuid = this.workerId;
        if (uuid != null) {
            i10 = uuid.hashCode();
        }
        return hashCode27 + i10;
    }

    public String toString() {
        String str = this.dataFormatVersion;
        String str2 = this.platform;
        String str3 = this.appEnvironment;
        String str4 = this.appPackageName;
        String str5 = this.appVersion;
        String str6 = this.libVersion;
        String str7 = this.osVersion;
        String str8 = this.deviceModel;
        String str9 = this.deviceManufacturer;
        String str10 = this.captureTimestamp;
        String str11 = this.captureStrategy;
        Boolean bool = this.hasDepth;
        Boolean bool2 = this.ultraDepth;
        Integer num = this.batteryLevel;
        String str12 = this.panoConfiguration;
        String str13 = this.scanConfiguration;
        Integer num2 = this.primaryImageCount;
        String str14 = this.primaryImageLens;
        String str15 = this.primaryImageOrientation;
        String str16 = this.scanOrientation;
        String str17 = this.region;
        Boolean bool3 = this.captureV2;
        Boolean bool4 = this.ownVideo;
        Boolean bool5 = this.forceLandscape;
        Boolean bool6 = this.swapRgb;
        List<String> list = this.optimizelyFlags;
        Boolean bool7 = this.uploadV2;
        UUID uuid = this.workerId;
        return "UploadProperties(dataFormatVersion=" + str + ", platform=" + str2 + ", appEnvironment=" + str3 + ", appPackageName=" + str4 + ", appVersion=" + str5 + ", libVersion=" + str6 + ", osVersion=" + str7 + ", deviceModel=" + str8 + ", deviceManufacturer=" + str9 + ", captureTimestamp=" + str10 + ", captureStrategy=" + str11 + ", hasDepth=" + bool + ", ultraDepth=" + bool2 + ", batteryLevel=" + num + ", panoConfiguration=" + str12 + ", scanConfiguration=" + str13 + ", primaryImageCount=" + num2 + ", primaryImageLens=" + str14 + ", primaryImageOrientation=" + str15 + ", scanOrientation=" + str16 + ", region=" + str17 + ", captureV2=" + bool3 + ", ownVideo=" + bool4 + ", forceLandscape=" + bool5 + ", swapRgb=" + bool6 + ", optimizelyFlags=" + list + ", uploadV2=" + bool7 + ", workerId=" + uuid + ")";
    }
}
