package com.sugarcube.core.network.models;

import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.data.source.CatalogRepository;
import com.sugarcube.app.base.network.models.UploadKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\bP\b\b\u0018\u0000 s2\u00020\u0001:\u0001sB¥\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010$¢\u0006\u0004\b%\u0010&J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u000fHÆ\u0003J\t\u0010Z\u001a\u00020\u0011HÆ\u0003J\t\u0010[\u001a\u00020\u0011HÆ\u0003J\t\u0010\\\u001a\u00020\u0011HÆ\u0003J\t\u0010]\u001a\u00020\u0011HÆ\u0003J\t\u0010^\u001a\u00020\u0011HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010>J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010FJ\u0010\u0010h\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010FJ\u0010\u0010i\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010FJ\u0010\u0010j\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010FJ\u0010\u0010k\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010$HÆ\u0003Jê\u0002\u0010m\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010$HÆ\u0001¢\u0006\u0002\u0010nJ\u0013\u0010o\u001a\u00020\u000f2\b\u0010p\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010q\u001a\u00020\u0011HÖ\u0001J\t\u0010r\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0011\u0010\u0013\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b8\u00106R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b9\u00106R\u0011\u0010\u0015\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b:\u00106R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010(R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010(R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010(R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010(R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010(R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010G\u001a\u0004\bE\u0010FR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010G\u001a\u0004\bH\u0010FR\u0015\u0010 \u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010G\u001a\u0004\bI\u0010FR\u0015\u0010!\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010G\u001a\u0004\bJ\u0010FR\u0015\u0010\"\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010G\u001a\u0004\bK\u0010FR\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bL\u0010M¨\u0006t"}, d2 = {"Lcom/sugarcube/core/network/models/SessionMeta;", "", "dataFormatVersion", "", "platform", "appEnvironment", "appPackageName", "appVersion", "libVersion", "osVersion", "deviceModel", "captureTimestamp", "captureStrategy", "hybridMode", "hasDepth", "", "timeToFirstARInit", "", "ARLimitedTrackingEventCount", "translationWarningEventCount", "superinitEndFrame", "batteryLevel", "panoConfiguration", "scanConfiguration", "primaryImageCount", "primaryImageLens", "primaryImageOrientation", "scanOrientation", "deviceManufacturer", "region", "captureV2", "ownVideo", "forceLandscape", "swapRgb", "imageFormatJPEG", "optimizelyFlags", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "getDataFormatVersion", "()Ljava/lang/String;", "getPlatform", "getAppEnvironment", "getAppPackageName", "getAppVersion", "getLibVersion", "getOsVersion", "getDeviceModel", "getCaptureTimestamp", "getCaptureStrategy", "getHybridMode", "getHasDepth", "()Z", "getTimeToFirstARInit", "()I", "getARLimitedTrackingEventCount", "getTranslationWarningEventCount", "getSuperinitEndFrame", "getBatteryLevel", "getPanoConfiguration", "getScanConfiguration", "getPrimaryImageCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrimaryImageLens", "getPrimaryImageOrientation", "getScanOrientation", "getDeviceManufacturer", "getRegion", "getCaptureV2", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOwnVideo", "getForceLandscape", "getSwapRgb", "getImageFormatJPEG", "getOptimizelyFlags", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/sugarcube/core/network/models/SessionMeta;", "equals", "other", "hashCode", "toString", "Companion", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SessionMeta {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String DATE_FORMAT_VERSION = "0.0.15";
    public static final String DATE_FORMAT_VERSION_CAPTURE_V2 = "0.0.19";
    public static final String DATE_FORMAT_VERSION_HYBRID = "0.0.18";
    private final int ARLimitedTrackingEventCount;
    private final String appEnvironment;
    private final String appPackageName;
    private final String appVersion;
    private final int batteryLevel;
    private final String captureStrategy;
    private final String captureTimestamp;
    private final Boolean captureV2;
    private final String dataFormatVersion;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final Boolean forceLandscape;
    private final boolean hasDepth;
    private final String hybridMode;
    private final Boolean imageFormatJPEG;
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
    private final int superinitEndFrame;
    private final Boolean swapRgb;
    private final int timeToFirstARInit;
    private final int translationWarningEventCount;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/sugarcube/core/network/models/SessionMeta$Companion;", "", "<init>", "()V", "DATE_FORMAT_VERSION", "", "DATE_FORMAT_VERSION_HYBRID", "DATE_FORMAT_VERSION_CAPTURE_V2", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SessionMeta(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z10, int i10, int i11, int i12, int i13, int i14, String str12, String str13, Integer num, String str14, String str15, String str16, String str17, String str18, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List<String> list) {
        String str19 = str5;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        String str23 = str9;
        String str24 = str10;
        C17542s.j(str, "dataFormatVersion");
        C17542s.j(str2, "platform");
        C17542s.j(str4, "appPackageName");
        C17542s.j(str19, "appVersion");
        C17542s.j(str20, "libVersion");
        C17542s.j(str21, "osVersion");
        C17542s.j(str22, "deviceModel");
        C17542s.j(str23, "captureTimestamp");
        C17542s.j(str24, "captureStrategy");
        this.dataFormatVersion = str;
        this.platform = str2;
        this.appEnvironment = str3;
        this.appPackageName = str4;
        this.appVersion = str19;
        this.libVersion = str20;
        this.osVersion = str21;
        this.deviceModel = str22;
        this.captureTimestamp = str23;
        this.captureStrategy = str24;
        this.hybridMode = str11;
        this.hasDepth = z10;
        this.timeToFirstARInit = i10;
        this.ARLimitedTrackingEventCount = i11;
        this.translationWarningEventCount = i12;
        this.superinitEndFrame = i13;
        this.batteryLevel = i14;
        this.panoConfiguration = str12;
        this.scanConfiguration = str13;
        this.primaryImageCount = num;
        this.primaryImageLens = str14;
        this.primaryImageOrientation = str15;
        this.scanOrientation = str16;
        this.deviceManufacturer = str17;
        this.region = str18;
        this.captureV2 = bool;
        this.ownVideo = bool2;
        this.forceLandscape = bool3;
        this.swapRgb = bool4;
        this.imageFormatJPEG = bool5;
        this.optimizelyFlags = list;
    }

    public static /* synthetic */ SessionMeta copy$default(SessionMeta sessionMeta, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z10, int i10, int i11, int i12, int i13, int i14, String str12, String str13, Integer num, String str14, String str15, String str16, String str17, String str18, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List list, int i15, Object obj) {
        SessionMeta sessionMeta2 = sessionMeta;
        int i16 = i15;
        return sessionMeta.copy((i16 & 1) != 0 ? sessionMeta2.dataFormatVersion : str, (i16 & 2) != 0 ? sessionMeta2.platform : str2, (i16 & 4) != 0 ? sessionMeta2.appEnvironment : str3, (i16 & 8) != 0 ? sessionMeta2.appPackageName : str4, (i16 & 16) != 0 ? sessionMeta2.appVersion : str5, (i16 & 32) != 0 ? sessionMeta2.libVersion : str6, (i16 & 64) != 0 ? sessionMeta2.osVersion : str7, (i16 & 128) != 0 ? sessionMeta2.deviceModel : str8, (i16 & 256) != 0 ? sessionMeta2.captureTimestamp : str9, (i16 & 512) != 0 ? sessionMeta2.captureStrategy : str10, (i16 & 1024) != 0 ? sessionMeta2.hybridMode : str11, (i16 & RecyclerView.n.FLAG_MOVED) != 0 ? sessionMeta2.hasDepth : z10, (i16 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? sessionMeta2.timeToFirstARInit : i10, (i16 & 8192) != 0 ? sessionMeta2.ARLimitedTrackingEventCount : i11, (i16 & 16384) != 0 ? sessionMeta2.translationWarningEventCount : i12, (i16 & 32768) != 0 ? sessionMeta2.superinitEndFrame : i13, (i16 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? sessionMeta2.batteryLevel : i14, (i16 & 131072) != 0 ? sessionMeta2.panoConfiguration : str12, (i16 & 262144) != 0 ? sessionMeta2.scanConfiguration : str13, (i16 & ImageMetadata.LENS_APERTURE) != 0 ? sessionMeta2.primaryImageCount : num, (i16 & ImageMetadata.SHADING_MODE) != 0 ? sessionMeta2.primaryImageLens : str14, (i16 & UploadKt.MAX_CHUNK_SIZE) != 0 ? sessionMeta2.primaryImageOrientation : str15, (i16 & 4194304) != 0 ? sessionMeta2.scanOrientation : str16, (i16 & 8388608) != 0 ? sessionMeta2.deviceManufacturer : str17, (i16 & 16777216) != 0 ? sessionMeta2.region : str18, (i16 & 33554432) != 0 ? sessionMeta2.captureV2 : bool, (i16 & 67108864) != 0 ? sessionMeta2.ownVideo : bool2, (i16 & 134217728) != 0 ? sessionMeta2.forceLandscape : bool3, (i16 & 268435456) != 0 ? sessionMeta2.swapRgb : bool4, (i16 & 536870912) != 0 ? sessionMeta2.imageFormatJPEG : bool5, (i16 & CatalogRepository.FETCH_FLAG_SDB) != 0 ? sessionMeta2.optimizelyFlags : list);
    }

    public final String component1() {
        return this.dataFormatVersion;
    }

    public final String component10() {
        return this.captureStrategy;
    }

    public final String component11() {
        return this.hybridMode;
    }

    public final boolean component12() {
        return this.hasDepth;
    }

    public final int component13() {
        return this.timeToFirstARInit;
    }

    public final int component14() {
        return this.ARLimitedTrackingEventCount;
    }

    public final int component15() {
        return this.translationWarningEventCount;
    }

    public final int component16() {
        return this.superinitEndFrame;
    }

    public final int component17() {
        return this.batteryLevel;
    }

    public final String component18() {
        return this.panoConfiguration;
    }

    public final String component19() {
        return this.scanConfiguration;
    }

    public final String component2() {
        return this.platform;
    }

    public final Integer component20() {
        return this.primaryImageCount;
    }

    public final String component21() {
        return this.primaryImageLens;
    }

    public final String component22() {
        return this.primaryImageOrientation;
    }

    public final String component23() {
        return this.scanOrientation;
    }

    public final String component24() {
        return this.deviceManufacturer;
    }

    public final String component25() {
        return this.region;
    }

    public final Boolean component26() {
        return this.captureV2;
    }

    public final Boolean component27() {
        return this.ownVideo;
    }

    public final Boolean component28() {
        return this.forceLandscape;
    }

    public final Boolean component29() {
        return this.swapRgb;
    }

    public final String component3() {
        return this.appEnvironment;
    }

    public final Boolean component30() {
        return this.imageFormatJPEG;
    }

    public final List<String> component31() {
        return this.optimizelyFlags;
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
        return this.captureTimestamp;
    }

    public final SessionMeta copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z10, int i10, int i11, int i12, int i13, int i14, String str12, String str13, Integer num, String str14, String str15, String str16, String str17, String str18, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List<String> list) {
        String str19 = str;
        C17542s.j(str19, "dataFormatVersion");
        C17542s.j(str2, "platform");
        C17542s.j(str4, "appPackageName");
        C17542s.j(str5, "appVersion");
        C17542s.j(str6, "libVersion");
        C17542s.j(str7, "osVersion");
        C17542s.j(str8, "deviceModel");
        C17542s.j(str9, "captureTimestamp");
        C17542s.j(str10, "captureStrategy");
        return new SessionMeta(str19, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z10, i10, i11, i12, i13, i14, str12, str13, num, str14, str15, str16, str17, str18, bool, bool2, bool3, bool4, bool5, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionMeta)) {
            return false;
        }
        SessionMeta sessionMeta = (SessionMeta) obj;
        return C17542s.e(this.dataFormatVersion, sessionMeta.dataFormatVersion) && C17542s.e(this.platform, sessionMeta.platform) && C17542s.e(this.appEnvironment, sessionMeta.appEnvironment) && C17542s.e(this.appPackageName, sessionMeta.appPackageName) && C17542s.e(this.appVersion, sessionMeta.appVersion) && C17542s.e(this.libVersion, sessionMeta.libVersion) && C17542s.e(this.osVersion, sessionMeta.osVersion) && C17542s.e(this.deviceModel, sessionMeta.deviceModel) && C17542s.e(this.captureTimestamp, sessionMeta.captureTimestamp) && C17542s.e(this.captureStrategy, sessionMeta.captureStrategy) && C17542s.e(this.hybridMode, sessionMeta.hybridMode) && this.hasDepth == sessionMeta.hasDepth && this.timeToFirstARInit == sessionMeta.timeToFirstARInit && this.ARLimitedTrackingEventCount == sessionMeta.ARLimitedTrackingEventCount && this.translationWarningEventCount == sessionMeta.translationWarningEventCount && this.superinitEndFrame == sessionMeta.superinitEndFrame && this.batteryLevel == sessionMeta.batteryLevel && C17542s.e(this.panoConfiguration, sessionMeta.panoConfiguration) && C17542s.e(this.scanConfiguration, sessionMeta.scanConfiguration) && C17542s.e(this.primaryImageCount, sessionMeta.primaryImageCount) && C17542s.e(this.primaryImageLens, sessionMeta.primaryImageLens) && C17542s.e(this.primaryImageOrientation, sessionMeta.primaryImageOrientation) && C17542s.e(this.scanOrientation, sessionMeta.scanOrientation) && C17542s.e(this.deviceManufacturer, sessionMeta.deviceManufacturer) && C17542s.e(this.region, sessionMeta.region) && C17542s.e(this.captureV2, sessionMeta.captureV2) && C17542s.e(this.ownVideo, sessionMeta.ownVideo) && C17542s.e(this.forceLandscape, sessionMeta.forceLandscape) && C17542s.e(this.swapRgb, sessionMeta.swapRgb) && C17542s.e(this.imageFormatJPEG, sessionMeta.imageFormatJPEG) && C17542s.e(this.optimizelyFlags, sessionMeta.optimizelyFlags);
    }

    public final int getARLimitedTrackingEventCount() {
        return this.ARLimitedTrackingEventCount;
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

    public final int getBatteryLevel() {
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

    public final boolean getHasDepth() {
        return this.hasDepth;
    }

    public final String getHybridMode() {
        return this.hybridMode;
    }

    public final Boolean getImageFormatJPEG() {
        return this.imageFormatJPEG;
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

    public final int getSuperinitEndFrame() {
        return this.superinitEndFrame;
    }

    public final Boolean getSwapRgb() {
        return this.swapRgb;
    }

    public final int getTimeToFirstARInit() {
        return this.timeToFirstARInit;
    }

    public final int getTranslationWarningEventCount() {
        return this.translationWarningEventCount;
    }

    public int hashCode() {
        int hashCode = ((this.dataFormatVersion.hashCode() * 31) + this.platform.hashCode()) * 31;
        String str = this.appEnvironment;
        int i10 = 0;
        int hashCode2 = (((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.appPackageName.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.libVersion.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.captureTimestamp.hashCode()) * 31) + this.captureStrategy.hashCode()) * 31;
        String str2 = this.hybridMode;
        int hashCode3 = (((((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.hasDepth)) * 31) + Integer.hashCode(this.timeToFirstARInit)) * 31) + Integer.hashCode(this.ARLimitedTrackingEventCount)) * 31) + Integer.hashCode(this.translationWarningEventCount)) * 31) + Integer.hashCode(this.superinitEndFrame)) * 31) + Integer.hashCode(this.batteryLevel)) * 31;
        String str3 = this.panoConfiguration;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scanConfiguration;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.primaryImageCount;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.primaryImageLens;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.primaryImageOrientation;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.scanOrientation;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deviceManufacturer;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.region;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.captureV2;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.ownVideo;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.forceLandscape;
        int hashCode14 = (hashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.swapRgb;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.imageFormatJPEG;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        List<String> list = this.optimizelyFlags;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode16 + i10;
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
        String str9 = this.captureTimestamp;
        String str10 = this.captureStrategy;
        String str11 = this.hybridMode;
        boolean z10 = this.hasDepth;
        int i10 = this.timeToFirstARInit;
        int i11 = this.ARLimitedTrackingEventCount;
        int i12 = this.translationWarningEventCount;
        int i13 = this.superinitEndFrame;
        int i14 = this.batteryLevel;
        String str12 = this.panoConfiguration;
        String str13 = this.scanConfiguration;
        Integer num = this.primaryImageCount;
        String str14 = this.primaryImageLens;
        String str15 = this.primaryImageOrientation;
        String str16 = this.scanOrientation;
        String str17 = this.deviceManufacturer;
        String str18 = this.region;
        Boolean bool = this.captureV2;
        Boolean bool2 = this.ownVideo;
        Boolean bool3 = this.forceLandscape;
        Boolean bool4 = this.swapRgb;
        Boolean bool5 = this.imageFormatJPEG;
        List<String> list = this.optimizelyFlags;
        return "SessionMeta(dataFormatVersion=" + str + ", platform=" + str2 + ", appEnvironment=" + str3 + ", appPackageName=" + str4 + ", appVersion=" + str5 + ", libVersion=" + str6 + ", osVersion=" + str7 + ", deviceModel=" + str8 + ", captureTimestamp=" + str9 + ", captureStrategy=" + str10 + ", hybridMode=" + str11 + ", hasDepth=" + z10 + ", timeToFirstARInit=" + i10 + ", ARLimitedTrackingEventCount=" + i11 + ", translationWarningEventCount=" + i12 + ", superinitEndFrame=" + i13 + ", batteryLevel=" + i14 + ", panoConfiguration=" + str12 + ", scanConfiguration=" + str13 + ", primaryImageCount=" + num + ", primaryImageLens=" + str14 + ", primaryImageOrientation=" + str15 + ", scanOrientation=" + str16 + ", deviceManufacturer=" + str17 + ", region=" + str18 + ", captureV2=" + bool + ", ownVideo=" + bool2 + ", forceLandscape=" + bool3 + ", swapRgb=" + bool4 + ", imageFormatJPEG=" + bool5 + ", optimizelyFlags=" + list + ")";
    }
}
