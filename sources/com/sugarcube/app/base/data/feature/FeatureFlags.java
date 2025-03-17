package com.sugarcube.app.base.data.feature;

import com.sugarcube.app.base.data.feature.ConfigItem;
import com.sugarcube.app.base.data.feature.ConfigItemGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b4\bÇ\u0002\u0018\u00002\u00020\u0001:1\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01234B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u00065"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags;", "", "<init>", "()V", "UpgradeWall", "UploadV1TestFakeSceneRepo", "ResumableUploads", "UploadsV2", "UploadsV2Offline", "UseSingleUploadRetry", "UploadsV2InjectDelays", "EnableGLTFScenes", "EnableGLTFCompositions", "EnableNewModelLoader", "EnableNewSceneLoader", "EnableNewMultiViewTonemap", "EnableNewSingleViewTonemap", "EnableNewCompositionLoader", "EnableDynamicQuality", "SkipTutorial", "CaptureUseAnchorsFlag", "CaptureArInitFlag", "CaptureArInitStepFlag", "UltrawideEnabled", "ShowPoints", "ShowPlanes", "CaptureFailNoPoints", "CaptureQualityBadFramesFlag", "CaptureVideoLengthFlag", "CaptureV2Enabled", "VideoEncoderEnabled", "ImageFormatJPEGEnabled", "ForceLandscapeEnabled", "SwapRgbEnabled", "HybridCampanoMode", "Kreativ", "CaptureAndDesignBlacklisted", "CaptureBlacklisted", "DesignBlacklisted", "EnablePrivacyCheckbox", "EnableSmartProductRecommendations", "EnableDuplicateItems", "PreserveDesignState", "SmartPlacementSupport", "SmartPlacementSupportOwnRoom", "EnableStackablesSmartPlacement", "EnableSmartPlacementWallMount", "EnableSmartPlacementHela", "EnableDecorationV2", "DisableDesignsInShowrooms", "EnableFavorites", "EnableHelaWallColorPicker", "CarouselEntryPoint", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FeatureFlags {
    public static final int $stable = 0;
    public static final FeatureFlags INSTANCE = new FeatureFlags();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureAndDesignBlacklisted;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureAndDesignBlacklisted extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final CaptureAndDesignBlacklisted INSTANCE = new CaptureAndDesignBlacklisted();

        private CaptureAndDesignBlacklisted() {
            super(new ConfigItemMeta("capture_and_design_blacklist", "capture_and_design_blacklist", (String) null, "Design and Capture Blacklisted", false, ConfigItemGroup.Blacklists.INSTANCE, 0, 84, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureAndDesignBlacklisted);
        }

        public int hashCode() {
            return -1265794580;
        }

        public String toString() {
            return "CaptureAndDesignBlacklisted";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureArInitFlag;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureArInitFlag extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final CaptureArInitFlag INSTANCE = new CaptureArInitFlag();

        private CaptureArInitFlag() {
            super(new ConfigItemMeta("capture_ar_init_flag", "enable_ar_init", (String) null, "Enable AR Init (Pose & Floor Anchors)", false, ConfigItemGroup.Capture.INSTANCE, 13, 20, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureArInitFlag);
        }

        public int hashCode() {
            return -1082914990;
        }

        public String toString() {
            return "CaptureArInitFlag";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureArInitStepFlag;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureArInitStepFlag extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final CaptureArInitStepFlag INSTANCE = new CaptureArInitStepFlag();

        private CaptureArInitStepFlag() {
            super(new ConfigItemMeta("capture_ar_init_step_flag", (String) null, (String) null, "Enable AR Init Step", false, ConfigItemGroup.Capture.INSTANCE, 13, 22, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureArInitStepFlag);
        }

        public int hashCode() {
            return 1102108990;
        }

        public String toString() {
            return "CaptureArInitStepFlag";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureBlacklisted;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureBlacklisted extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final CaptureBlacklisted INSTANCE = new CaptureBlacklisted();

        private CaptureBlacklisted() {
            super(new ConfigItemMeta("android_capture_blacklisted", "android_capture_blacklisted", (String) null, "Capture Blacklisted", false, ConfigItemGroup.Blacklists.INSTANCE, 0, 84, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureBlacklisted);
        }

        public int hashCode() {
            return -670251081;
        }

        public String toString() {
            return "CaptureBlacklisted";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureFailNoPoints;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureFailNoPoints extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final CaptureFailNoPoints INSTANCE = new CaptureFailNoPoints();

        private CaptureFailNoPoints() {
            super(new ConfigItemMeta("android_capture_fail_no_points", "android_capture_fail_no_points", (String) null, "Fail captures with no points", false, ConfigItemGroup.Capture.INSTANCE, 17, 20, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureFailNoPoints);
        }

        public int hashCode() {
            return 1786560871;
        }

        public String toString() {
            return "CaptureFailNoPoints";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureQualityBadFramesFlag;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureQualityBadFramesFlag extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final CaptureQualityBadFramesFlag INSTANCE = new CaptureQualityBadFramesFlag();

        private CaptureQualityBadFramesFlag() {
            super(new ConfigItemMeta("capture_bad_frames_flag", "capture_quality_bad_frames", (String) null, "Capture quality - bad frames threshold", false, ConfigItemGroup.Capture.INSTANCE, 18, 20, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureQualityBadFramesFlag);
        }

        public int hashCode() {
            return 650616189;
        }

        public String toString() {
            return "CaptureQualityBadFramesFlag";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureUseAnchorsFlag;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureUseAnchorsFlag extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final CaptureUseAnchorsFlag INSTANCE = new CaptureUseAnchorsFlag();

        private CaptureUseAnchorsFlag() {
            super(new ConfigItemMeta("android_pose_anchor_enabled", "android_pose_anchor_enabled", (String) null, "Enable pose anchor", false, ConfigItemGroup.Capture.INSTANCE, 12, 20, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureUseAnchorsFlag);
        }

        public int hashCode() {
            return 16313800;
        }

        public String toString() {
            return "CaptureUseAnchorsFlag";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureV2Enabled;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureV2Enabled extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final CaptureV2Enabled INSTANCE = new CaptureV2Enabled();

        private CaptureV2Enabled() {
            super(new ConfigItemMeta("android_capture_v2", "android_capture_v2", (String) null, "Enable Capture v2", false, ConfigItemGroup.Capture.INSTANCE, 22, 20, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureV2Enabled);
        }

        public int hashCode() {
            return -687175392;
        }

        public String toString() {
            return "CaptureV2Enabled";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureVideoLengthFlag;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureVideoLengthFlag extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final CaptureVideoLengthFlag INSTANCE = new CaptureVideoLengthFlag();

        private CaptureVideoLengthFlag() {
            super(new ConfigItemMeta("capture_video_length_flag", "capture_video_length", (String) null, "Fail captures with video over max", false, ConfigItemGroup.Capture.INSTANCE, 19, 20, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureVideoLengthFlag);
        }

        public int hashCode() {
            return 118091272;
        }

        public String toString() {
            return "CaptureVideoLengthFlag";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$CarouselEntryPoint;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CarouselEntryPoint extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final CarouselEntryPoint INSTANCE = new CarouselEntryPoint();

        private CarouselEntryPoint() {
            super(new ConfigItemMeta("carousel_entry_point", "carousel_entry_point", (String) null, "Enable carousel entry point", false, (ConfigItemGroup) null, 0, 116, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CarouselEntryPoint);
        }

        public int hashCode() {
            return -213547489;
        }

        public String toString() {
            return "CarouselEntryPoint";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$DesignBlacklisted;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DesignBlacklisted extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final DesignBlacklisted INSTANCE = new DesignBlacklisted();

        private DesignBlacklisted() {
            super(new ConfigItemMeta("android_design_blacklisted", "android_design_blacklisted", (String) null, "Design Blacklisted", false, ConfigItemGroup.Blacklists.INSTANCE, 0, 84, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DesignBlacklisted);
        }

        public int hashCode() {
            return -1932973731;
        }

        public String toString() {
            return "DesignBlacklisted";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$DisableDesignsInShowrooms;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DisableDesignsInShowrooms extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final DisableDesignsInShowrooms INSTANCE = new DisableDesignsInShowrooms();

        private DisableDesignsInShowrooms() {
            super(new ConfigItemMeta("disable_designs_in_showrooms", "disable_designs_in_showrooms", (String) null, "Disable Designs in Showrooms", false, ConfigItemGroup.Decorate.INSTANCE, 0, 84, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DisableDesignsInShowrooms);
        }

        public int hashCode() {
            return 860222024;
        }

        public String toString() {
            return "DisableDesignsInShowrooms";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableDecorationV2;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableDecorationV2 extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableDecorationV2 INSTANCE = new EnableDecorationV2();

        private EnableDecorationV2() {
            super(new ConfigItemMeta("enable_decoration_ui_v2", "enable_decoration_ui_v2", (String) null, "Enable Decoration V2 (refactor + UI)", false, ConfigItemGroup.Decorate.INSTANCE, 0, 84, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableDecorationV2);
        }

        public int hashCode() {
            return -658288432;
        }

        public String toString() {
            return "EnableDecorationV2";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableDuplicateItems;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableDuplicateItems extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableDuplicateItems INSTANCE = new EnableDuplicateItems();

        private EnableDuplicateItems() {
            super(new ConfigItemMeta("enable_item_duplicate", "enable_item_duplicate", (String) null, "Enable feature to duplicate items", false, ConfigItemGroup.Decorate.INSTANCE, 0, 84, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableDuplicateItems);
        }

        public int hashCode() {
            return 1372635641;
        }

        public String toString() {
            return "EnableDuplicateItems";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableDynamicQuality;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableDynamicQuality extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableDynamicQuality INSTANCE = new EnableDynamicQuality();

        private EnableDynamicQuality() {
            super(new ConfigItemMeta("enable_dynamic_quality", "enable_dynamic_quality", (String) null, (String) null, false, ConfigItemGroup.Decorate.INSTANCE, 7, 28, (DefaultConstructorMarker) null), true, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableDynamicQuality);
        }

        public int hashCode() {
            return -1840599996;
        }

        public String toString() {
            return "EnableDynamicQuality";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableFavorites;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableFavorites extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableFavorites INSTANCE = new EnableFavorites();

        private EnableFavorites() {
            super(new ConfigItemMeta("enable_add_to_favorites", "enable_add_to_favorites", (String) null, "Enable add to favorites", false, ConfigItemGroup.Decorate.INSTANCE, 0, 84, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableFavorites);
        }

        public int hashCode() {
            return -1327464621;
        }

        public String toString() {
            return "EnableFavorites";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableGLTFCompositions;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableGLTFCompositions extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableGLTFCompositions INSTANCE = new EnableGLTFCompositions();

        private EnableGLTFCompositions() {
            super(new ConfigItemMeta("enable_gltf_compositions", "enable_gltf_compositions", (String) null, (String) null, false, ConfigItemGroup.Decorate.INSTANCE, 1, 28, (DefaultConstructorMarker) null), true, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableGLTFCompositions);
        }

        public int hashCode() {
            return -388245724;
        }

        public String toString() {
            return "EnableGLTFCompositions";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableGLTFScenes;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableGLTFScenes extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableGLTFScenes INSTANCE = new EnableGLTFScenes();

        private EnableGLTFScenes() {
            super(new ConfigItemMeta("enable_gltf_scenes", "enable_gltf_scenes", (String) null, (String) null, false, ConfigItemGroup.Decorate.INSTANCE, 2, 28, (DefaultConstructorMarker) null), true, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableGLTFScenes);
        }

        public int hashCode() {
            return -1143810878;
        }

        public String toString() {
            return "EnableGLTFScenes";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableHelaWallColorPicker;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableHelaWallColorPicker extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableHelaWallColorPicker INSTANCE = new EnableHelaWallColorPicker();

        private EnableHelaWallColorPicker() {
            super(new ConfigItemMeta("enable_wall_color_picker", "enable_wall_color_picker", (String) null, "Enable Hela Wall Color Picker", false, ConfigItemGroup.Decorate.INSTANCE, 0, 84, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableHelaWallColorPicker);
        }

        public int hashCode() {
            return -220452335;
        }

        public String toString() {
            return "EnableHelaWallColorPicker";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableNewCompositionLoader;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableNewCompositionLoader extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableNewCompositionLoader INSTANCE = new EnableNewCompositionLoader();

        private EnableNewCompositionLoader() {
            super(new ConfigItemMeta("enable_new_composition_loader", "enable_new_composition_loader", (String) null, (String) null, false, ConfigItemGroup.Decorate.INSTANCE, 6, 28, (DefaultConstructorMarker) null), true, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableNewCompositionLoader);
        }

        public int hashCode() {
            return 1793719841;
        }

        public String toString() {
            return "EnableNewCompositionLoader";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableNewModelLoader;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableNewModelLoader extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableNewModelLoader INSTANCE = new EnableNewModelLoader();

        private EnableNewModelLoader() {
            super(new ConfigItemMeta("enable_new_model_loader", "enable_new_model_loader", (String) null, (String) null, false, ConfigItemGroup.Decorate.INSTANCE, 4, 28, (DefaultConstructorMarker) null), true, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableNewModelLoader);
        }

        public int hashCode() {
            return -2010532000;
        }

        public String toString() {
            return "EnableNewModelLoader";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableNewMultiViewTonemap;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableNewMultiViewTonemap extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableNewMultiViewTonemap INSTANCE = new EnableNewMultiViewTonemap();

        private EnableNewMultiViewTonemap() {
            super(new ConfigItemMeta("enable_new_multi_view_tonemap", "enable_new_multi_view_tonemap", (String) null, (String) null, false, ConfigItemGroup.Decorate.INSTANCE, 6, 28, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableNewMultiViewTonemap);
        }

        public int hashCode() {
            return -1130318584;
        }

        public String toString() {
            return "EnableNewMultiViewTonemap";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableNewSceneLoader;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableNewSceneLoader extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableNewSceneLoader INSTANCE = new EnableNewSceneLoader();

        private EnableNewSceneLoader() {
            super(new ConfigItemMeta("enable_new_scene_loader", "enable_new_scene_loader", (String) null, (String) null, false, ConfigItemGroup.Decorate.INSTANCE, 5, 28, (DefaultConstructorMarker) null), true, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableNewSceneLoader);
        }

        public int hashCode() {
            return 1526201987;
        }

        public String toString() {
            return "EnableNewSceneLoader";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableNewSingleViewTonemap;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableNewSingleViewTonemap extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableNewSingleViewTonemap INSTANCE = new EnableNewSingleViewTonemap();

        private EnableNewSingleViewTonemap() {
            super(new ConfigItemMeta("enable_new_single_view_tonemap", "enable_new_single_view_tonemap", (String) null, (String) null, false, ConfigItemGroup.Decorate.INSTANCE, 6, 28, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableNewSingleViewTonemap);
        }

        public int hashCode() {
            return -1676812639;
        }

        public String toString() {
            return "EnableNewSingleViewTonemap";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnablePrivacyCheckbox;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnablePrivacyCheckbox extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnablePrivacyCheckbox INSTANCE = new EnablePrivacyCheckbox();

        private EnablePrivacyCheckbox() {
            super(new ConfigItemMeta("enable_privacy_checkbox", "enable_privacy_checkbox", (String) null, "Enable Privacy Checkbox", false, (ConfigItemGroup) null, 0, 116, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnablePrivacyCheckbox);
        }

        public int hashCode() {
            return 1795883879;
        }

        public String toString() {
            return "EnablePrivacyCheckbox";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableSmartPlacementHela;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableSmartPlacementHela extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableSmartPlacementHela INSTANCE = new EnableSmartPlacementHela();

        private EnableSmartPlacementHela() {
            super(new ConfigItemMeta("enable_smart_placement_with_hela", "enable_smart_placement_with_hela", (String) null, "Smarta + Hela support", false, ConfigItemGroup.Decorate.INSTANCE, 0, 84, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableSmartPlacementHela);
        }

        public int hashCode() {
            return 1009789682;
        }

        public String toString() {
            return "EnableSmartPlacementHela";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableSmartPlacementWallMount;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableSmartPlacementWallMount extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableSmartPlacementWallMount INSTANCE = new EnableSmartPlacementWallMount();

        private EnableSmartPlacementWallMount() {
            super(new ConfigItemMeta("enable_smart_placement_wall_mount", "enable_smart_placement_wall_mount", (String) null, "Enable Wall Mounted Smart Placement", false, ConfigItemGroup.Decorate.INSTANCE, 0, 84, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableSmartPlacementWallMount);
        }

        public int hashCode() {
            return 1375945903;
        }

        public String toString() {
            return "EnableSmartPlacementWallMount";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableSmartProductRecommendations;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableSmartProductRecommendations extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableSmartProductRecommendations INSTANCE = new EnableSmartProductRecommendations();

        private EnableSmartProductRecommendations() {
            super(new ConfigItemMeta("enable_goeswellwith", "enable_goeswellwith", (String) null, "Smart product recommendations support", false, ConfigItemGroup.Decorate.INSTANCE, 0, 84, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableSmartProductRecommendations);
        }

        public int hashCode() {
            return 1993435664;
        }

        public String toString() {
            return "EnableSmartProductRecommendations";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableStackablesSmartPlacement;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnableStackablesSmartPlacement extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final EnableStackablesSmartPlacement INSTANCE = new EnableStackablesSmartPlacement();

        private EnableStackablesSmartPlacement() {
            super(new ConfigItemMeta("enable_smart_placement_stackables", "enable_smart_placement_stackables", (String) null, "Enable Stackables Smart Placement", false, ConfigItemGroup.Decorate.INSTANCE, 0, 84, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableStackablesSmartPlacement);
        }

        public int hashCode() {
            return -607775279;
        }

        public String toString() {
            return "EnableStackablesSmartPlacement";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$ForceLandscapeEnabled;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ForceLandscapeEnabled extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final ForceLandscapeEnabled INSTANCE = new ForceLandscapeEnabled();

        private ForceLandscapeEnabled() {
            super(new ConfigItemMeta("android_force_landscape_enabled", "android_force_landscape_enabled", (String) null, "Force Landscape for UW Room Selection", false, ConfigItemGroup.Capture.INSTANCE, 23, 20, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ForceLandscapeEnabled);
        }

        public int hashCode() {
            return -348963568;
        }

        public String toString() {
            return "ForceLandscapeEnabled";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$HybridCampanoMode;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HybridCampanoMode extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final HybridCampanoMode INSTANCE = new HybridCampanoMode();

        private HybridCampanoMode() {
            super(new ConfigItemMeta("hybrid_campano", (String) null, (String) null, "Hybrid CAMPANO mode", false, ConfigItemGroup.Capture.INSTANCE, 29, 22, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof HybridCampanoMode);
        }

        public int hashCode() {
            return 976583911;
        }

        public String toString() {
            return "HybridCampanoMode";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$ImageFormatJPEGEnabled;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImageFormatJPEGEnabled extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final ImageFormatJPEGEnabled INSTANCE = new ImageFormatJPEGEnabled();

        private ImageFormatJPEGEnabled() {
            super(new ConfigItemMeta("android_image_format_jpeg", "android_image_format_jpeg", (String) null, "Enable Capture ImageFormat.JPEG", false, ConfigItemGroup.Capture.INSTANCE, 23, 20, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ImageFormatJPEGEnabled);
        }

        public int hashCode() {
            return 1292069160;
        }

        public String toString() {
            return "ImageFormatJPEGEnabled";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$Kreativ;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Kreativ extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final Kreativ INSTANCE = new Kreativ();

        private Kreativ() {
            super(new ConfigItemMeta("android_ikea_kreativ", "android_ikea_kreativ", "Enable Kreativ", "When true, allow markets that are not enabled to access our features", false, ConfigItemGroup.Blacklists.INSTANCE, 0, 80, (DefaultConstructorMarker) null), true, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Kreativ);
        }

        public int hashCode() {
            return -1121148995;
        }

        public String toString() {
            return "Kreativ";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$PreserveDesignState;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$BooleanConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PreserveDesignState extends ConfigItem.BooleanConfigItem {
        public static final int $stable = 0;
        public static final PreserveDesignState INSTANCE = new PreserveDesignState();

        private PreserveDesignState() {
            super(new ConfigItemMeta("enable_design_persistence", (String) null, (String) null, "Enable preserving design state on activity configuration changes", false, ConfigItemGroup.Decorate.INSTANCE, 0, 86, (DefaultConstructorMarker) null), true, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PreserveDesignState);
        }

        public int hashCode() {
            return -1770017978;
        }

        public String toString() {
            return "PreserveDesignState";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$ResumableUploads;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResumableUploads extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final ResumableUploads INSTANCE = new ResumableUploads();

        private ResumableUploads() {
            super(new ConfigItemMeta("android_resumable_uploads_enabled", "android_resumable_uploads_enabled", (String) null, "Enables Resumeable Upload", false, ConfigItemGroup.Upload.INSTANCE, 41, 20, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ResumableUploads);
        }

        public int hashCode() {
            return -827139519;
        }

        public String toString() {
            return "ResumableUploads";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$ShowPlanes;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowPlanes extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final ShowPlanes INSTANCE = new ShowPlanes();

        private ShowPlanes() {
            super(new ConfigItemMeta("arc_planes", (String) null, (String) null, "Show ARCore Plane", false, ConfigItemGroup.Capture.INSTANCE, 16, 22, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowPlanes);
        }

        public int hashCode() {
            return -1596398507;
        }

        public String toString() {
            return "ShowPlanes";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$ShowPoints;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowPoints extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final ShowPoints INSTANCE = new ShowPoints();

        private ShowPoints() {
            super(new ConfigItemMeta("arc_points", (String) null, (String) null, "Show ARCore Points", false, ConfigItemGroup.Capture.INSTANCE, 15, 22, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowPoints);
        }

        public int hashCode() {
            return -1593389151;
        }

        public String toString() {
            return "ShowPoints";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$SkipTutorial;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SkipTutorial extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final SkipTutorial INSTANCE = new SkipTutorial();

        private SkipTutorial() {
            super(new ConfigItemMeta("allow_tutorial_skipping", (String) null, (String) null, "Allow Tutorial Skipping", false, ConfigItemGroup.Capture.INSTANCE, 11, 22, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SkipTutorial);
        }

        public int hashCode() {
            return 1633963806;
        }

        public String toString() {
            return "SkipTutorial";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$SmartPlacementSupport;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SmartPlacementSupport extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final SmartPlacementSupport INSTANCE = new SmartPlacementSupport();

        private SmartPlacementSupport() {
            super(new ConfigItemMeta("enable_smart_placement", "enable_smart_placement", (String) null, "Enable Smarta smart placement support for showrooms", false, ConfigItemGroup.Decorate.INSTANCE, 0, 84, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SmartPlacementSupport);
        }

        public int hashCode() {
            return 1731984658;
        }

        public String toString() {
            return "SmartPlacementSupport";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$SmartPlacementSupportOwnRoom;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SmartPlacementSupportOwnRoom extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final SmartPlacementSupportOwnRoom INSTANCE = new SmartPlacementSupportOwnRoom();

        private SmartPlacementSupportOwnRoom() {
            super(new ConfigItemMeta("enable_smart_placement_own_room", "enable_smart_placement_own_room", (String) null, "Enable Smarta smart placement support for own rooms only", false, ConfigItemGroup.Decorate.INSTANCE, 0, 84, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SmartPlacementSupportOwnRoom);
        }

        public int hashCode() {
            return 199529487;
        }

        public String toString() {
            return "SmartPlacementSupportOwnRoom";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$SwapRgbEnabled;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SwapRgbEnabled extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final SwapRgbEnabled INSTANCE = new SwapRgbEnabled();

        private SwapRgbEnabled() {
            super(new ConfigItemMeta("android_swap_rgb", "android_swap_rgb", (String) null, "Swap Rgb enabled", false, ConfigItemGroup.Capture.INSTANCE, 24, 20, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SwapRgbEnabled);
        }

        public int hashCode() {
            return -2097893240;
        }

        public String toString() {
            return "SwapRgbEnabled";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$UltrawideEnabled;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UltrawideEnabled extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final UltrawideEnabled INSTANCE = new UltrawideEnabled();

        private UltrawideEnabled() {
            super(new ConfigItemMeta("android_ultrawide_enabled", "android_ultrawide_enabled", (String) null, "Enable Ultrawide (depends on device support)", false, ConfigItemGroup.Capture.INSTANCE, 14, 20, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UltrawideEnabled);
        }

        public int hashCode() {
            return 662775395;
        }

        public String toString() {
            return "UltrawideEnabled";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$UpgradeWall;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpgradeWall extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final UpgradeWall INSTANCE = new UpgradeWall();

        private UpgradeWall() {
            super(new ConfigItemMeta("android_upgrade_wall", "android_upgrade_wall", (String) null, (String) null, false, (ConfigItemGroup) null, 0, 124, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UpgradeWall);
        }

        public int hashCode() {
            return 312492229;
        }

        public String toString() {
            return "UpgradeWall";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$UploadV1TestFakeSceneRepo;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UploadV1TestFakeSceneRepo extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final UploadV1TestFakeSceneRepo INSTANCE = new UploadV1TestFakeSceneRepo();

        private UploadV1TestFakeSceneRepo() {
            super(new ConfigItemMeta("upload_v1_test_fake_scene_repo", (String) null, (String) null, "When running tests against UploadsV1, use a fake SceneRepository to avoid populating bad data", false, ConfigItemGroup.Upload.INSTANCE, 40, 22, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UploadV1TestFakeSceneRepo);
        }

        public int hashCode() {
            return -957931942;
        }

        public String toString() {
            return "UploadV1TestFakeSceneRepo";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$UploadsV2;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UploadsV2 extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final UploadsV2 INSTANCE = new UploadsV2();

        private UploadsV2() {
            super(new ConfigItemMeta("android_uploads_2", "android_uploads_2", (String) null, "Enables Upload V2 code", false, ConfigItemGroup.Upload.INSTANCE, 42, 20, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UploadsV2);
        }

        public int hashCode() {
            return -1467018451;
        }

        public String toString() {
            return "UploadsV2";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$UploadsV2InjectDelays;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UploadsV2InjectDelays extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final UploadsV2InjectDelays INSTANCE = new UploadsV2InjectDelays();

        private UploadsV2InjectDelays() {
            super(new ConfigItemMeta("android_uploads_inject_delays", (String) null, (String) null, "Upload Client - simulate delays", false, ConfigItemGroup.Upload.INSTANCE, 45, 22, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UploadsV2InjectDelays);
        }

        public int hashCode() {
            return 1612376078;
        }

        public String toString() {
            return "UploadsV2InjectDelays";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$UploadsV2Offline;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UploadsV2Offline extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final UploadsV2Offline INSTANCE = new UploadsV2Offline();

        private UploadsV2Offline() {
            super(new ConfigItemMeta("android_uploads_offline", (String) null, (String) null, "Upload Client - simulate offline", false, ConfigItemGroup.Upload.INSTANCE, 43, 22, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UploadsV2Offline);
        }

        public int hashCode() {
            return 1751455222;
        }

        public String toString() {
            return "UploadsV2Offline";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$UseSingleUploadRetry;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UseSingleUploadRetry extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final UseSingleUploadRetry INSTANCE = new UseSingleUploadRetry();

        private UseSingleUploadRetry() {
            super(new ConfigItemMeta("use_single_upload_retry", (String) null, (String) null, "Use Single Upload Retry", false, ConfigItemGroup.Upload.INSTANCE, 44, 22, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UseSingleUploadRetry);
        }

        public int hashCode() {
            return 445076761;
        }

        public String toString() {
            return "UseSingleUploadRetry";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/FeatureFlags$VideoEncoderEnabled;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoEncoderEnabled extends ConfigItem.FeatureFlag {
        public static final int $stable = 0;
        public static final VideoEncoderEnabled INSTANCE = new VideoEncoderEnabled();

        private VideoEncoderEnabled() {
            super(new ConfigItemMeta("android_video_encoder_enabled", "android_video_encoder_enabled", (String) null, "Enable Video AvcEncoder", false, ConfigItemGroup.Capture.INSTANCE, 23, 20, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VideoEncoderEnabled);
        }

        public int hashCode() {
            return -1219906657;
        }

        public String toString() {
            return "VideoEncoderEnabled";
        }
    }

    private FeatureFlags() {
    }
}
