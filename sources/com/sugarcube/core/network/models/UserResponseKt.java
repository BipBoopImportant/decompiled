package com.sugarcube.core.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"asLoggedInUser", "Lcom/sugarcube/core/network/models/LoggedInUser;", "Lcom/sugarcube/core/network/models/UserResponse;", "serverBaseURL", "", "authType", "Lcom/sugarcube/core/network/models/AuthType;", "network_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UserResponseKt {
    public static final LoggedInUser asLoggedInUser(UserResponse userResponse, String str, AuthType authType) {
        C17542s.j(userResponse, "<this>");
        C17542s.j(str, "serverBaseURL");
        C17542s.j(authType, "authType");
        Integer wid = userResponse.getWid();
        int intValue = wid != null ? wid.intValue() : 0;
        String email = userResponse.getEmail();
        if (email == null) {
            email = "";
        }
        return new LoggedInUser(intValue, email, str, authType, userResponse.isLoggedIn(), userResponse.getFeatureFlags(), userResponse.getMobileDevice(), (String) null, (String) null, (String) null, false, false, userResponse.getAcceptedKreativPrivacyPolicy(), userResponse.getAcceptedKreativPrivacyPolicyAt(), 3968, (DefaultConstructorMarker) null);
    }
}
