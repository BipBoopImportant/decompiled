package com.sugarcube.core.network.models;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"toUploadProperties", "Lcom/sugarcube/core/network/models/UploadProperties;", "Lcom/sugarcube/core/network/models/SessionMeta;", "uploadV2", "", "workerId", "Ljava/util/UUID;", "(Lcom/sugarcube/core/network/models/SessionMeta;Ljava/lang/Boolean;Ljava/util/UUID;)Lcom/sugarcube/core/network/models/UploadProperties;", "network_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UploadModelsKt {
    public static final UploadProperties toUploadProperties(SessionMeta sessionMeta, Boolean bool, UUID uuid) {
        C17542s.j(sessionMeta, "<this>");
        return new UploadProperties(sessionMeta.getDataFormatVersion(), sessionMeta.getPlatform(), sessionMeta.getAppEnvironment(), sessionMeta.getAppPackageName(), sessionMeta.getAppVersion(), sessionMeta.getLibVersion(), sessionMeta.getOsVersion(), sessionMeta.getDeviceModel(), sessionMeta.getDeviceManufacturer(), sessionMeta.getCaptureTimestamp(), sessionMeta.getCaptureStrategy(), Boolean.valueOf(sessionMeta.getHasDepth()), Boolean.FALSE, Integer.valueOf(sessionMeta.getBatteryLevel()), sessionMeta.getPanoConfiguration(), sessionMeta.getScanConfiguration(), sessionMeta.getPrimaryImageCount(), sessionMeta.getPrimaryImageLens(), sessionMeta.getPrimaryImageOrientation(), sessionMeta.getScanOrientation(), sessionMeta.getRegion(), sessionMeta.getCaptureV2(), sessionMeta.getOwnVideo(), sessionMeta.getForceLandscape(), sessionMeta.getSwapRgb(), sessionMeta.getOptimizelyFlags(), bool, uuid);
    }

    public static /* synthetic */ UploadProperties toUploadProperties$default(SessionMeta sessionMeta, Boolean bool, UUID uuid, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = null;
        }
        if ((i10 & 2) != 0) {
            uuid = null;
        }
        return toUploadProperties(sessionMeta, bool, uuid);
    }
}
