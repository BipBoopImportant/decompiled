package com.sugarcube.core.network.models;

import com.sugarcube.core.analytics.entities.MobileDevice;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toDomainModel", "Lcom/sugarcube/core/analytics/entities/MobileDevice;", "Lcom/sugarcube/core/network/models/MobileDevice;", "network_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MobileDeviceKt {
    public static final MobileDevice toDomainModel(MobileDevice mobileDevice) {
        C17542s.j(mobileDevice, "<this>");
        return new MobileDevice(mobileDevice.getFcmToken(), mobileDevice.getAppEnv(), mobileDevice.getFcmProject(), mobileDevice.getUuid(), mobileDevice.getToken(), mobileDevice.getName(), mobileDevice.getCreatedAt(), mobileDevice.getLastModifiedTs(), mobileDevice.getPlatform());
    }
}
