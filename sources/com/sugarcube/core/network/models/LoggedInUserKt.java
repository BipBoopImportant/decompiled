package com.sugarcube.core.network.models;

import com.sugarcube.core.analytics.entities.AuthType;
import com.sugarcube.core.analytics.entities.LoggedInUser;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, d2 = {"toDomainModel", "Lcom/sugarcube/core/analytics/entities/AuthType;", "Lcom/sugarcube/core/network/models/AuthType;", "Lcom/sugarcube/core/analytics/entities/LoggedInUser;", "Lcom/sugarcube/core/network/models/LoggedInUser;", "network_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LoggedInUserKt {
    public static final AuthType toDomainModel(AuthType authType) {
        C17542s.j(authType, "<this>");
        return AuthType.valueOf(authType.name());
    }

    public static final LoggedInUser toDomainModel(LoggedInUser loggedInUser) {
        C17542s.j(loggedInUser, "<this>");
        int wid = loggedInUser.getWid();
        String email = loggedInUser.getEmail();
        String server = loggedInUser.getServer();
        AuthType domainModel = toDomainModel(loggedInUser.getAuthMethod());
        boolean isLoggedIn = loggedInUser.isLoggedIn();
        Map<String, Boolean> featureFlags = loggedInUser.getFeatureFlags();
        MobileDevice mobileDevice = loggedInUser.getMobileDevice();
        return new LoggedInUser(wid, email, server, domainModel, isLoggedIn, featureFlags, mobileDevice != null ? MobileDeviceKt.toDomainModel(mobileDevice) : null, loggedInUser.getPartyUid(), loggedInUser.getPostalCode(), loggedInUser.getPreferredStore(), loggedInUser.getHasScenes(), loggedInUser.getHasDesigns(), loggedInUser.getAcceptedKreativPrivacyPolicy(), loggedInUser.getAcceptedKreativPrivacyPolicyAt());
    }
}
