package com.sugarcube.app.base.data.feature;

import com.sugarcube.app.base.data.feature.ConfigItem;
import com.sugarcube.app.base.data.feature.ConfigItemGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0018\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u001c"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems;", "", "<init>", "()V", "TestConfigItem", "PreferenceMigration1Complete", "CaptureFloorTimeoutLimit", "CaptureFloorMinimum", "CaptureQualityBadFramesThreshold", "CaptureVideoLengthMax", "JPEGPanoQuality", "VideoEncoderFPS", "VideoEncoderBitrate", "CustomPipeline", "UploadV2SetRetryCount", "UploadsV2CallDelayMs", "UploadsV2CallTimeoutSec", "CaptureTutorialProgress", "UserHasCompletedFirstCapture", "CaptureFeedbackPromptWasPresented", "FeedbackCaptureId", "FeedbackCaptureType", "UserHasPlacedItem", "NotificationPermissionRationalePresented", "SmartPlacementTimeoutLimit", "SmartaPlacementDebugMessage", "CatalogRecentSearchTerms", "DesignFeedbackWasPresented", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfigItems {
    public static final int $stable = 0;
    public static final ConfigItems INSTANCE = new ConfigItems();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$CaptureFeedbackPromptWasPresented;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$BooleanConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureFeedbackPromptWasPresented extends ConfigItem.BooleanConfigItem {
        public static final int $stable = 0;
        public static final CaptureFeedbackPromptWasPresented INSTANCE = new CaptureFeedbackPromptWasPresented();

        private CaptureFeedbackPromptWasPresented() {
            super(new ConfigItemMeta("capture_feedback_prompt_presented", (String) null, (String) null, (String) null, false, ConfigItemGroup.UserFlow.INSTANCE, 0, 94, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureFeedbackPromptWasPresented);
        }

        public int hashCode() {
            return -1358866828;
        }

        public String toString() {
            return "CaptureFeedbackPromptWasPresented";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$CaptureFloorMinimum;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$IntegerConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureFloorMinimum extends ConfigItem.IntegerConfigItem {
        public static final int $stable = 0;
        public static final CaptureFloorMinimum INSTANCE = new CaptureFloorMinimum();

        private CaptureFloorMinimum() {
            super(new ConfigItemMeta("capture_ar_init_min", (String) null, (String) null, "Capture AR Init minimum (secs)", false, ConfigItemGroup.Capture.INSTANCE, 13, 22, (DefaultConstructorMarker) null), new Integer(4), (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureFloorMinimum);
        }

        public int hashCode() {
            return 568517820;
        }

        public String toString() {
            return "CaptureFloorMinimum";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$CaptureFloorTimeoutLimit;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$IntegerConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureFloorTimeoutLimit extends ConfigItem.IntegerConfigItem {
        public static final int $stable = 0;
        public static final CaptureFloorTimeoutLimit INSTANCE = new CaptureFloorTimeoutLimit();

        private CaptureFloorTimeoutLimit() {
            super(new ConfigItemMeta("capture_ar_init_timeout", "enable_ar_init", "capture_ar_init_timeout", "Capture AR Init timeout (secs)", false, ConfigItemGroup.Capture.INSTANCE, 13, 16, (DefaultConstructorMarker) null), new Integer(6), (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureFloorTimeoutLimit);
        }

        public int hashCode() {
            return -575690004;
        }

        public String toString() {
            return "CaptureFloorTimeoutLimit";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$CaptureQualityBadFramesThreshold;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$DoubleConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureQualityBadFramesThreshold extends ConfigItem.DoubleConfigItem {
        public static final int $stable = 0;
        public static final CaptureQualityBadFramesThreshold INSTANCE = new CaptureQualityBadFramesThreshold();

        private CaptureQualityBadFramesThreshold() {
            super(new ConfigItemMeta("capture_bad_frames_threshold", "capture_quality_bad_frames", "capture_bad_frames_threshold", "Capture quality - bad frames threshold", false, ConfigItemGroup.Capture.INSTANCE, 18, 16, (DefaultConstructorMarker) null), 0.5d, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureQualityBadFramesThreshold);
        }

        public int hashCode() {
            return 1760928485;
        }

        public String toString() {
            return "CaptureQualityBadFramesThreshold";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$CaptureTutorialProgress;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$IntegerConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureTutorialProgress extends ConfigItem.IntegerConfigItem {
        public static final int $stable = 0;
        public static final CaptureTutorialProgress INSTANCE = new CaptureTutorialProgress();

        private CaptureTutorialProgress() {
            super(new ConfigItemMeta("capture_tutorial_progress", (String) null, (String) null, "user tutorial progress (step 1-4)", false, ConfigItemGroup.Capture.INSTANCE, 11, 22, (DefaultConstructorMarker) null), new Integer(0), (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureTutorialProgress);
        }

        public int hashCode() {
            return 931437829;
        }

        public String toString() {
            return "CaptureTutorialProgress";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$CaptureVideoLengthMax;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$IntegerConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureVideoLengthMax extends ConfigItem.IntegerConfigItem {
        public static final int $stable = 0;
        public static final CaptureVideoLengthMax INSTANCE = new CaptureVideoLengthMax();

        private CaptureVideoLengthMax() {
            super(new ConfigItemMeta("capture_video_max_length", "capture_video_length", "capture_video_length_max", "Capture video - max length in seconds", false, ConfigItemGroup.Capture.INSTANCE, 19, 16, (DefaultConstructorMarker) null), new Integer(180), (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureVideoLengthMax);
        }

        public int hashCode() {
            return 1305230909;
        }

        public String toString() {
            return "CaptureVideoLengthMax";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$CatalogRecentSearchTerms;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$StringConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CatalogRecentSearchTerms extends ConfigItem.StringConfigItem {
        public static final int $stable = 0;
        public static final CatalogRecentSearchTerms INSTANCE = new CatalogRecentSearchTerms();

        private CatalogRecentSearchTerms() {
            super(new ConfigItemMeta("catalog_recent_search_terms", (String) null, (String) null, "Catalog recent search terms", false, ConfigItemGroup.Decorate.INSTANCE, 0, 86, (DefaultConstructorMarker) null), "[]", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CatalogRecentSearchTerms);
        }

        public int hashCode() {
            return -2139942697;
        }

        public String toString() {
            return "CatalogRecentSearchTerms";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$CustomPipeline;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$StringConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CustomPipeline extends ConfigItem.StringConfigItem {
        public static final int $stable = 0;
        public static final CustomPipeline INSTANCE = new CustomPipeline();

        private CustomPipeline() {
            super(new ConfigItemMeta("custom_pipeline", (String) null, (String) null, (String) null, false, ConfigItemGroup.Capture.INSTANCE, 29, 30, (DefaultConstructorMarker) null), "", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CustomPipeline);
        }

        public int hashCode() {
            return 1267141823;
        }

        public String toString() {
            return "CustomPipeline";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$DesignFeedbackWasPresented;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$BooleanConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DesignFeedbackWasPresented extends ConfigItem.BooleanConfigItem {
        public static final int $stable = 0;
        public static final DesignFeedbackWasPresented INSTANCE = new DesignFeedbackWasPresented();

        private DesignFeedbackWasPresented() {
            super(new ConfigItemMeta("design_feedback_presented", (String) null, (String) null, (String) null, false, ConfigItemGroup.UserFlow.INSTANCE, 0, 94, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DesignFeedbackWasPresented);
        }

        public int hashCode() {
            return -70641088;
        }

        public String toString() {
            return "DesignFeedbackWasPresented";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$FeedbackCaptureId;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$StringConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FeedbackCaptureId extends ConfigItem.StringConfigItem {
        public static final int $stable = 0;
        public static final FeedbackCaptureId INSTANCE = new FeedbackCaptureId();

        private FeedbackCaptureId() {
            super(new ConfigItemMeta("feedback_capture_id", (String) null, (String) null, (String) null, true, ConfigItemGroup.UserFlow.INSTANCE, 0, 78, (DefaultConstructorMarker) null), "", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FeedbackCaptureId);
        }

        public int hashCode() {
            return -1112227344;
        }

        public String toString() {
            return "FeedbackCaptureId";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$FeedbackCaptureType;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$StringConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FeedbackCaptureType extends ConfigItem.StringConfigItem {
        public static final int $stable = 0;
        public static final FeedbackCaptureType INSTANCE = new FeedbackCaptureType();

        private FeedbackCaptureType() {
            super(new ConfigItemMeta("feedback_capture_type", (String) null, (String) null, (String) null, true, ConfigItemGroup.UserFlow.INSTANCE, 0, 78, (DefaultConstructorMarker) null), "", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FeedbackCaptureType);
        }

        public int hashCode() {
            return 596730575;
        }

        public String toString() {
            return "FeedbackCaptureType";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$JPEGPanoQuality;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$IntegerConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JPEGPanoQuality extends ConfigItem.IntegerConfigItem {
        public static final int $stable = 0;
        public static final JPEGPanoQuality INSTANCE = new JPEGPanoQuality();

        private JPEGPanoQuality() {
            super(new ConfigItemMeta("android_jpeg_pano_quality", "android_jpeg_pano_enabled", "android_jpeg_pano_quality", "Pano JPEG quality (60-100)", false, ConfigItemGroup.Capture.INSTANCE, 20, 16, (DefaultConstructorMarker) null), new Integer(90), (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof JPEGPanoQuality);
        }

        public int hashCode() {
            return -964504135;
        }

        public String toString() {
            return "JPEGPanoQuality";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$NotificationPermissionRationalePresented;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$BooleanConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NotificationPermissionRationalePresented extends ConfigItem.BooleanConfigItem {
        public static final int $stable = 0;
        public static final NotificationPermissionRationalePresented INSTANCE = new NotificationPermissionRationalePresented();

        private NotificationPermissionRationalePresented() {
            super(new ConfigItemMeta("notification_permission_rationale_presented", (String) null, (String) null, (String) null, true, ConfigItemGroup.UserFlow.INSTANCE, 0, 78, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotificationPermissionRationalePresented);
        }

        public int hashCode() {
            return 189121193;
        }

        public String toString() {
            return "NotificationPermissionRationalePresented";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$PreferenceMigration1Complete;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$BooleanConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PreferenceMigration1Complete extends ConfigItem.BooleanConfigItem {
        public static final int $stable = 0;
        public static final PreferenceMigration1Complete INSTANCE = new PreferenceMigration1Complete();

        private PreferenceMigration1Complete() {
            super(new ConfigItemMeta("preference_migration_1", (String) null, (String) null, (String) null, false, ConfigItemGroup.ConfigRepo.INSTANCE, 0, 94, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PreferenceMigration1Complete);
        }

        public int hashCode() {
            return -260935869;
        }

        public String toString() {
            return "PreferenceMigration1Complete";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$SmartPlacementTimeoutLimit;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$IntegerConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SmartPlacementTimeoutLimit extends ConfigItem.IntegerConfigItem {
        public static final int $stable = 0;
        public static final SmartPlacementTimeoutLimit INSTANCE = new SmartPlacementTimeoutLimit();

        private SmartPlacementTimeoutLimit() {
            super(new ConfigItemMeta("smart_placement_timeout", "enable_smart_placement", "intValue", "Smarta Placement request timeout (millis)", false, ConfigItemGroup.Decorate.INSTANCE, 0, 80, (DefaultConstructorMarker) null), new Integer(350), (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SmartPlacementTimeoutLimit);
        }

        public int hashCode() {
            return -1320723038;
        }

        public String toString() {
            return "SmartPlacementTimeoutLimit";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$SmartaPlacementDebugMessage;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$BooleanConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SmartaPlacementDebugMessage extends ConfigItem.BooleanConfigItem {
        public static final int $stable = 0;
        public static final SmartaPlacementDebugMessage INSTANCE = new SmartaPlacementDebugMessage();

        private SmartaPlacementDebugMessage() {
            super(new ConfigItemMeta("smarta_placement_debug_message", (String) null, (String) null, "Show Smarta Debug Message", false, ConfigItemGroup.Decorate.INSTANCE, 0, 86, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SmartaPlacementDebugMessage);
        }

        public int hashCode() {
            return -4266795;
        }

        public String toString() {
            return "SmartaPlacementDebugMessage";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$TestConfigItem;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$StringConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestConfigItem extends ConfigItem.StringConfigItem {
        public static final int $stable = 0;
        public static final TestConfigItem INSTANCE = new TestConfigItem();

        private TestConfigItem() {
            super(new ConfigItemMeta("test_config_item", "test_config_item", "test_config_item_variable", (String) null, false, ConfigItemGroup.ConfigRepo.INSTANCE, 0, 88, (DefaultConstructorMarker) null), "test", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TestConfigItem);
        }

        public int hashCode() {
            return 281380659;
        }

        public String toString() {
            return "TestConfigItem";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$UploadV2SetRetryCount;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$IntegerConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UploadV2SetRetryCount extends ConfigItem.IntegerConfigItem {
        public static final int $stable = 0;
        public static final UploadV2SetRetryCount INSTANCE = new UploadV2SetRetryCount();

        private UploadV2SetRetryCount() {
            super(new ConfigItemMeta("upload_set_retry_count", (String) null, (String) null, (String) null, false, ConfigItemGroup.Upload.INSTANCE, 46, 30, (DefaultConstructorMarker) null), new Integer(3), (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UploadV2SetRetryCount);
        }

        public int hashCode() {
            return 557889248;
        }

        public String toString() {
            return "UploadV2SetRetryCount";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$UploadsV2CallDelayMs;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$IntegerConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UploadsV2CallDelayMs extends ConfigItem.IntegerConfigItem {
        public static final int $stable = 0;
        public static final UploadsV2CallDelayMs INSTANCE = new UploadsV2CallDelayMs();

        private UploadsV2CallDelayMs() {
            super(new ConfigItemMeta("upload_v2_call_delay_ms", (String) null, (String) null, (String) null, false, ConfigItemGroup.Upload.INSTANCE, 47, 30, (DefaultConstructorMarker) null), new Integer(2000), (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UploadsV2CallDelayMs);
        }

        public int hashCode() {
            return 952373065;
        }

        public String toString() {
            return "UploadsV2CallDelayMs";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$UploadsV2CallTimeoutSec;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$IntegerConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UploadsV2CallTimeoutSec extends ConfigItem.IntegerConfigItem {
        public static final int $stable = 0;
        public static final UploadsV2CallTimeoutSec INSTANCE = new UploadsV2CallTimeoutSec();

        private UploadsV2CallTimeoutSec() {
            super(new ConfigItemMeta("upload_v2_call_timeout_sec", (String) null, (String) null, (String) null, false, ConfigItemGroup.Upload.INSTANCE, 48, 30, (DefaultConstructorMarker) null), new Integer(600), (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UploadsV2CallTimeoutSec);
        }

        public int hashCode() {
            return -1443457424;
        }

        public String toString() {
            return "UploadsV2CallTimeoutSec";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$UserHasCompletedFirstCapture;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$BooleanConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UserHasCompletedFirstCapture extends ConfigItem.BooleanConfigItem {
        public static final int $stable = 0;
        public static final UserHasCompletedFirstCapture INSTANCE = new UserHasCompletedFirstCapture();

        private UserHasCompletedFirstCapture() {
            super(new ConfigItemMeta("user_captured_scene", (String) null, (String) null, (String) null, true, ConfigItemGroup.UserFlow.INSTANCE, 0, 78, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UserHasCompletedFirstCapture);
        }

        public int hashCode() {
            return -1255471266;
        }

        public String toString() {
            return "UserHasCompletedFirstCapture";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$UserHasPlacedItem;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$BooleanConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UserHasPlacedItem extends ConfigItem.BooleanConfigItem {
        public static final int $stable = 0;
        public static final UserHasPlacedItem INSTANCE = new UserHasPlacedItem();

        private UserHasPlacedItem() {
            super(new ConfigItemMeta("user_has_placed_item", (String) null, (String) null, (String) null, true, ConfigItemGroup.UserFlow.INSTANCE, 0, 78, (DefaultConstructorMarker) null), false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UserHasPlacedItem);
        }

        public int hashCode() {
            return 1839963667;
        }

        public String toString() {
            return "UserHasPlacedItem";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$VideoEncoderBitrate;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$IntegerConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoEncoderBitrate extends ConfigItem.IntegerConfigItem {
        public static final int $stable = 0;
        public static final VideoEncoderBitrate INSTANCE = new VideoEncoderBitrate();

        private VideoEncoderBitrate() {
            super(new ConfigItemMeta("android_video_bitrate", "android_video_encoder_enabled", "android_video_bitrate", "Video encoding bitrate", false, ConfigItemGroup.Capture.INSTANCE, 23, 16, (DefaultConstructorMarker) null), new Integer(4000000), (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VideoEncoderBitrate);
        }

        public int hashCode() {
            return 746366976;
        }

        public String toString() {
            return "VideoEncoderBitrate";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItems$VideoEncoderFPS;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$IntegerConfigItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoEncoderFPS extends ConfigItem.IntegerConfigItem {
        public static final int $stable = 0;
        public static final VideoEncoderFPS INSTANCE = new VideoEncoderFPS();

        private VideoEncoderFPS() {
            super(new ConfigItemMeta("android_video_fps", "android_video_encoder_enabled", "android_video_fps", "Video encoding FPS (10,15,30)", false, ConfigItemGroup.Capture.INSTANCE, 23, 16, (DefaultConstructorMarker) null), new Integer(10), (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VideoEncoderFPS);
        }

        public int hashCode() {
            return 1534195452;
        }

        public String toString() {
            return "VideoEncoderFPS";
        }
    }

    private ConfigItems() {
    }
}
