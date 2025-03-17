package com.sugarcube.app.base.data.feature;

import YH.C16870n;
import YH.C16877v;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import uI.C18055d;
import vI.C18192e;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u0001\u0007\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItem;", "T", "", "meta", "Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;", "defaultValue", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;Ljava/lang/Object;)V", "getMeta", "()Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;", "getDefaultValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "FeatureFlag", "BooleanConfigItem", "IntegerConfigItem", "DoubleConfigItem", "StringConfigItem", "StringListConfigItem", "ObjectListValue", "ObjectListConfigItem", "Lcom/sugarcube/app/base/data/feature/ConfigItem$BooleanConfigItem;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$DoubleConfigItem;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$IntegerConfigItem;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$ObjectListConfigItem;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$StringConfigItem;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$StringListConfigItem;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ConfigItem<T> {
    public static final int $stable = 0;
    private final T defaultValue;
    private final ConfigItemMeta meta;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0001\b\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItem$BooleanConfigItem;", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "", "meta", "Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;", "defaultValue", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;Z)V", "Lcom/sugarcube/app/base/data/feature/ConfigItems$CaptureFeedbackPromptWasPresented;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$DesignFeedbackWasPresented;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$NotificationPermissionRationalePresented;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$PreferenceMigration1Complete;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$SmartaPlacementDebugMessage;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$UserHasCompletedFirstCapture;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$UserHasPlacedItem;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$PreserveDesignState;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class BooleanConfigItem extends ConfigItem<Boolean> {
        public static final int $stable = 0;

        public /* synthetic */ BooleanConfigItem(ConfigItemMeta configItemMeta, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(configItemMeta, z10);
        }

        private BooleanConfigItem(ConfigItemMeta configItemMeta, boolean z10) {
            super(configItemMeta, Boolean.valueOf(z10), (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0001\u0001\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItem$DoubleConfigItem;", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "", "meta", "Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;", "defaultValue", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;D)V", "Lcom/sugarcube/app/base/data/feature/ConfigItems$CaptureQualityBadFramesThreshold;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class DoubleConfigItem extends ConfigItem<Double> {
        public static final int $stable = 0;

        public /* synthetic */ DoubleConfigItem(ConfigItemMeta configItemMeta, double d10, DefaultConstructorMarker defaultConstructorMarker) {
            this(configItemMeta, d10);
        }

        private DoubleConfigItem(ConfigItemMeta configItemMeta, double d10) {
            super(configItemMeta, Double.valueOf(d10), (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u00010\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01234567¨\u00068"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItem$FeatureFlag;", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "", "meta", "Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;", "defaultValue", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;Z)V", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureAndDesignBlacklisted;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureArInitFlag;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureArInitStepFlag;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureBlacklisted;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureFailNoPoints;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureQualityBadFramesFlag;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureUseAnchorsFlag;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureV2Enabled;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$CaptureVideoLengthFlag;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$CarouselEntryPoint;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$DesignBlacklisted;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$DisableDesignsInShowrooms;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableDecorationV2;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableDuplicateItems;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableDynamicQuality;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableFavorites;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableGLTFCompositions;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableGLTFScenes;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableHelaWallColorPicker;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableNewCompositionLoader;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableNewModelLoader;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableNewMultiViewTonemap;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableNewSceneLoader;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableNewSingleViewTonemap;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnablePrivacyCheckbox;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableSmartPlacementHela;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableSmartPlacementWallMount;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableSmartProductRecommendations;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$EnableStackablesSmartPlacement;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$ForceLandscapeEnabled;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$HybridCampanoMode;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$ImageFormatJPEGEnabled;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$Kreativ;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$ResumableUploads;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$ShowPlanes;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$ShowPoints;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$SkipTutorial;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$SmartPlacementSupport;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$SmartPlacementSupportOwnRoom;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$SwapRgbEnabled;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$UltrawideEnabled;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$UpgradeWall;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$UploadV1TestFakeSceneRepo;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$UploadsV2;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$UploadsV2InjectDelays;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$UploadsV2Offline;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$UseSingleUploadRetry;", "Lcom/sugarcube/app/base/data/feature/FeatureFlags$VideoEncoderEnabled;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class FeatureFlag extends ConfigItem<Boolean> {
        public static final int $stable = 0;

        public /* synthetic */ FeatureFlag(ConfigItemMeta configItemMeta, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(configItemMeta, z10);
        }

        private FeatureFlag(ConfigItemMeta configItemMeta, boolean z10) {
            super(configItemMeta, Boolean.valueOf(z10), (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0001\u000b\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItem$IntegerConfigItem;", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "Ljava/lang/Integer;", "meta", "Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;", "defaultValue", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;Ljava/lang/Integer;)V", "Lcom/sugarcube/app/base/data/feature/ConfigItems$CaptureFloorMinimum;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$CaptureFloorTimeoutLimit;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$CaptureTutorialProgress;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$CaptureVideoLengthMax;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$JPEGPanoQuality;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$SmartPlacementTimeoutLimit;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$UploadV2SetRetryCount;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$UploadsV2CallDelayMs;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$UploadsV2CallTimeoutSec;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$VideoEncoderBitrate;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$VideoEncoderFPS;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class IntegerConfigItem extends ConfigItem<Integer> {
        public static final int $stable = 0;

        public /* synthetic */ IntegerConfigItem(ConfigItemMeta configItemMeta, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(configItemMeta, num);
        }

        private IntegerConfigItem(ConfigItemMeta configItemMeta, Integer num) {
            super(configItemMeta, num, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b7\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItem$ObjectListConfigItem;", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$ObjectListValue;", "Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;", "meta", "defaultValue", "LuI/d;", "rootClass", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;Lcom/sugarcube/app/base/data/feature/ConfigItem$ObjectListValue;LuI/d;)V", "", "findAllObjects", "(LuI/d;)Ljava/util/List;", "possibleConfigObjects", "()Ljava/util/List;", "LuI/d;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ObjectListConfigItem extends ConfigItem<ObjectListValue> {
        public static final int $stable = 8;
        private final C18055d<? extends ObjectListValue> rootClass;

        public /* synthetic */ ObjectListConfigItem(ConfigItemMeta configItemMeta, ObjectListValue objectListValue, C18055d dVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(configItemMeta, objectListValue, dVar);
        }

        private final List<ObjectListValue> findAllObjects(C18055d<? extends ObjectListValue> dVar) {
            ObjectListValue objectListValue = (ObjectListValue) dVar.p();
            if (objectListValue != null) {
                return C16877v.e(objectListValue);
            }
            ArrayList arrayList = new ArrayList();
            for (C18055d findAllObjects : dVar.m()) {
                C16877v.E(arrayList, findAllObjects(findAllObjects));
            }
            return arrayList;
        }

        public final List<ObjectListValue> possibleConfigObjects() {
            try {
                if (!C18192e.h(this.rootClass, P.b(Enum.class))) {
                    return findAllObjects(this.rootClass);
                }
                Object[] enumConstants = getDefaultValue().getClass().getEnumConstants();
                C17542s.h(enumConstants, "null cannot be cast to non-null type kotlin.Array<kotlin.Enum<*>>");
                List<ObjectListValue> c12 = C16870n.c1((Enum[]) enumConstants);
                C17542s.h(c12, "null cannot be cast to non-null type kotlin.collections.List<com.sugarcube.app.base.data.feature.ConfigItem.ObjectListValue>");
                return c12;
            } catch (Exception unused) {
                Log.e("ConfigItem", "Failed to read ConfigObject values");
                return C16877v.n();
            }
        }

        private ObjectListConfigItem(ConfigItemMeta configItemMeta, ObjectListValue objectListValue, C18055d<? extends ObjectListValue> dVar) {
            super(configItemMeta, objectListValue, (DefaultConstructorMarker) null);
            this.rootClass = dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItem$ObjectListValue;", "", "name", "", "getName", "()Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ObjectListValue {
        String getName();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItem$StringConfigItem;", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "", "meta", "Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;", "defaultValue", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;Ljava/lang/String;)V", "Lcom/sugarcube/app/base/data/feature/ConfigItems$CatalogRecentSearchTerms;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$CustomPipeline;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$FeedbackCaptureId;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$FeedbackCaptureType;", "Lcom/sugarcube/app/base/data/feature/ConfigItems$TestConfigItem;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class StringConfigItem extends ConfigItem<String> {
        public static final int $stable = 0;

        public /* synthetic */ StringConfigItem(ConfigItemMeta configItemMeta, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(configItemMeta, str);
        }

        private StringConfigItem(ConfigItemMeta configItemMeta, String str) {
            super(configItemMeta, str, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b7\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItem$StringListConfigItem;", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "", "meta", "Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;", "defaultValue", "possibleValues", "", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;Ljava/lang/String;Ljava/util/List;)V", "getPossibleValues", "()Ljava/util/List;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class StringListConfigItem extends ConfigItem<String> {
        public static final int $stable = 8;
        private final List<String> possibleValues;

        public /* synthetic */ StringListConfigItem(ConfigItemMeta configItemMeta, String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(configItemMeta, str, list);
        }

        public final List<String> getPossibleValues() {
            return this.possibleValues;
        }

        private StringListConfigItem(ConfigItemMeta configItemMeta, String str, List<String> list) {
            super(configItemMeta, str, (DefaultConstructorMarker) null);
            this.possibleValues = list;
        }
    }

    public /* synthetic */ ConfigItem(ConfigItemMeta configItemMeta, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(configItemMeta, obj);
    }

    public final T getDefaultValue() {
        return this.defaultValue;
    }

    public final ConfigItemMeta getMeta() {
        return this.meta;
    }

    private ConfigItem(ConfigItemMeta configItemMeta, T t10) {
        this.meta = configItemMeta;
        this.defaultValue = t10;
    }
}
