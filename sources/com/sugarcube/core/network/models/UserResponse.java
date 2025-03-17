package com.sugarcube.core.network.models;

import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.squareup.moshi.g;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\bW\b\b\u0018\u00002\u00020\u0001Bó\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010U\u001a\u00020\nHÆ\u0003J\u0017\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\fHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010]\u001a\u00020\nHÆ\u0003J\t\u0010^\u001a\u00020\nHÆ\u0003J\t\u0010_\u001a\u00020\nHÆ\u0003J\t\u0010`\u001a\u00020\nHÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010JJ\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jú\u0001\u0010c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010dJ\u0013\u0010e\u001a\u00020\n2\b\u0010f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010g\u001a\u00020\u0003HÖ\u0001J\t\u0010h\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010,\"\u0004\b-\u0010.R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010#\"\u0004\b4\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010#\"\u0004\b6\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010#\"\u0004\b@\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010#\"\u0004\bB\u0010%R\u001a\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010,\"\u0004\bC\u0010.R\u001a\u0010\u0016\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010,\"\u0004\bD\u0010.R\u001a\u0010\u0017\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010,\"\u0004\bF\u0010.R\u001a\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010,\"\u0004\bH\u0010.R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010M\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010#\"\u0004\bO\u0010%¨\u0006i"}, d2 = {"Lcom/sugarcube/core/network/models/UserResponse;", "", "wid", "", "firstName", "", "lastName", "email", "profilePictureUrl", "isStaff", "", "featureFlags", "", "metricsId", "deviceId", "mobileDevice", "Lcom/sugarcube/core/network/models/MobileDevice;", "loginType", "", "lastCountry", "lastLanguage", "isFirstTime", "isLoggedIn", "emailVerified", "vip", "acceptedKreativPrivacyPolicy", "acceptedKreativPrivacyPolicyAt", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/sugarcube/core/network/models/MobileDevice;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Boolean;Ljava/lang/String;)V", "getWid", "()Ljava/lang/Integer;", "setWid", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", "getLastName", "setLastName", "getEmail", "setEmail", "getProfilePictureUrl", "setProfilePictureUrl", "()Z", "setStaff", "(Z)V", "getFeatureFlags", "()Ljava/util/Map;", "setFeatureFlags", "(Ljava/util/Map;)V", "getMetricsId", "setMetricsId", "getDeviceId", "setDeviceId", "getMobileDevice", "()Lcom/sugarcube/core/network/models/MobileDevice;", "setMobileDevice", "(Lcom/sugarcube/core/network/models/MobileDevice;)V", "getLoginType", "()Ljava/util/List;", "setLoginType", "(Ljava/util/List;)V", "getLastCountry", "setLastCountry", "getLastLanguage", "setLastLanguage", "setFirstTime", "setLoggedIn", "getEmailVerified", "setEmailVerified", "getVip", "setVip", "getAcceptedKreativPrivacyPolicy", "()Ljava/lang/Boolean;", "setAcceptedKreativPrivacyPolicy", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getAcceptedKreativPrivacyPolicyAt", "setAcceptedKreativPrivacyPolicyAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/sugarcube/core/network/models/MobileDevice;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Boolean;Ljava/lang/String;)Lcom/sugarcube/core/network/models/UserResponse;", "equals", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class UserResponse {
    private Boolean acceptedKreativPrivacyPolicy;
    private String acceptedKreativPrivacyPolicyAt;
    private String deviceId;
    private String email;
    private boolean emailVerified;
    private Map<String, Boolean> featureFlags;
    private String firstName;
    private boolean isFirstTime;
    private boolean isLoggedIn;
    private boolean isStaff;
    private String lastCountry;
    private String lastLanguage;
    private String lastName;
    private List<String> loginType;
    private String metricsId;
    private MobileDevice mobileDevice;
    private String profilePictureUrl;
    private boolean vip;
    private Integer wid;

    public UserResponse() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, false, (Map) null, (String) null, (String) null, (MobileDevice) null, (List) null, (String) null, (String) null, false, false, false, false, (Boolean) null, (String) null, 524287, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserResponse copy$default(UserResponse userResponse, Integer num, String str, String str2, String str3, String str4, boolean z10, Map map, String str5, String str6, MobileDevice mobileDevice2, List list, String str7, String str8, boolean z11, boolean z12, boolean z13, boolean z14, Boolean bool, String str9, int i10, Object obj) {
        UserResponse userResponse2 = userResponse;
        int i11 = i10;
        return userResponse.copy((i11 & 1) != 0 ? userResponse2.wid : num, (i11 & 2) != 0 ? userResponse2.firstName : str, (i11 & 4) != 0 ? userResponse2.lastName : str2, (i11 & 8) != 0 ? userResponse2.email : str3, (i11 & 16) != 0 ? userResponse2.profilePictureUrl : str4, (i11 & 32) != 0 ? userResponse2.isStaff : z10, (i11 & 64) != 0 ? userResponse2.featureFlags : map, (i11 & 128) != 0 ? userResponse2.metricsId : str5, (i11 & 256) != 0 ? userResponse2.deviceId : str6, (i11 & 512) != 0 ? userResponse2.mobileDevice : mobileDevice2, (i11 & 1024) != 0 ? userResponse2.loginType : list, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? userResponse2.lastCountry : str7, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? userResponse2.lastLanguage : str8, (i11 & 8192) != 0 ? userResponse2.isFirstTime : z11, (i11 & 16384) != 0 ? userResponse2.isLoggedIn : z12, (i11 & 32768) != 0 ? userResponse2.emailVerified : z13, (i11 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? userResponse2.vip : z14, (i11 & 131072) != 0 ? userResponse2.acceptedKreativPrivacyPolicy : bool, (i11 & 262144) != 0 ? userResponse2.acceptedKreativPrivacyPolicyAt : str9);
    }

    public final Integer component1() {
        return this.wid;
    }

    public final MobileDevice component10() {
        return this.mobileDevice;
    }

    public final List<String> component11() {
        return this.loginType;
    }

    public final String component12() {
        return this.lastCountry;
    }

    public final String component13() {
        return this.lastLanguage;
    }

    public final boolean component14() {
        return this.isFirstTime;
    }

    public final boolean component15() {
        return this.isLoggedIn;
    }

    public final boolean component16() {
        return this.emailVerified;
    }

    public final boolean component17() {
        return this.vip;
    }

    public final Boolean component18() {
        return this.acceptedKreativPrivacyPolicy;
    }

    public final String component19() {
        return this.acceptedKreativPrivacyPolicyAt;
    }

    public final String component2() {
        return this.firstName;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.email;
    }

    public final String component5() {
        return this.profilePictureUrl;
    }

    public final boolean component6() {
        return this.isStaff;
    }

    public final Map<String, Boolean> component7() {
        return this.featureFlags;
    }

    public final String component8() {
        return this.metricsId;
    }

    public final String component9() {
        return this.deviceId;
    }

    public final UserResponse copy(Integer num, String str, String str2, String str3, String str4, boolean z10, Map<String, Boolean> map, String str5, String str6, MobileDevice mobileDevice2, List<String> list, String str7, String str8, boolean z11, boolean z12, boolean z13, boolean z14, Boolean bool, String str9) {
        return new UserResponse(num, str, str2, str3, str4, z10, map, str5, str6, mobileDevice2, list, str7, str8, z11, z12, z13, z14, bool, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserResponse)) {
            return false;
        }
        UserResponse userResponse = (UserResponse) obj;
        return C17542s.e(this.wid, userResponse.wid) && C17542s.e(this.firstName, userResponse.firstName) && C17542s.e(this.lastName, userResponse.lastName) && C17542s.e(this.email, userResponse.email) && C17542s.e(this.profilePictureUrl, userResponse.profilePictureUrl) && this.isStaff == userResponse.isStaff && C17542s.e(this.featureFlags, userResponse.featureFlags) && C17542s.e(this.metricsId, userResponse.metricsId) && C17542s.e(this.deviceId, userResponse.deviceId) && C17542s.e(this.mobileDevice, userResponse.mobileDevice) && C17542s.e(this.loginType, userResponse.loginType) && C17542s.e(this.lastCountry, userResponse.lastCountry) && C17542s.e(this.lastLanguage, userResponse.lastLanguage) && this.isFirstTime == userResponse.isFirstTime && this.isLoggedIn == userResponse.isLoggedIn && this.emailVerified == userResponse.emailVerified && this.vip == userResponse.vip && C17542s.e(this.acceptedKreativPrivacyPolicy, userResponse.acceptedKreativPrivacyPolicy) && C17542s.e(this.acceptedKreativPrivacyPolicyAt, userResponse.acceptedKreativPrivacyPolicyAt);
    }

    public final Boolean getAcceptedKreativPrivacyPolicy() {
        return this.acceptedKreativPrivacyPolicy;
    }

    public final String getAcceptedKreativPrivacyPolicyAt() {
        return this.acceptedKreativPrivacyPolicyAt;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getEmailVerified() {
        return this.emailVerified;
    }

    public final Map<String, Boolean> getFeatureFlags() {
        return this.featureFlags;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastCountry() {
        return this.lastCountry;
    }

    public final String getLastLanguage() {
        return this.lastLanguage;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final List<String> getLoginType() {
        return this.loginType;
    }

    public final String getMetricsId() {
        return this.metricsId;
    }

    public final MobileDevice getMobileDevice() {
        return this.mobileDevice;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public final boolean getVip() {
        return this.vip;
    }

    public final Integer getWid() {
        return this.wid;
    }

    public int hashCode() {
        Integer num = this.wid;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.firstName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.profilePictureUrl;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.isStaff)) * 31;
        Map<String, Boolean> map = this.featureFlags;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str5 = this.metricsId;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deviceId;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        MobileDevice mobileDevice2 = this.mobileDevice;
        int hashCode9 = (hashCode8 + (mobileDevice2 == null ? 0 : mobileDevice2.hashCode())) * 31;
        List<String> list = this.loginType;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.lastCountry;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastLanguage;
        int hashCode12 = (((((((((hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31) + Boolean.hashCode(this.isFirstTime)) * 31) + Boolean.hashCode(this.isLoggedIn)) * 31) + Boolean.hashCode(this.emailVerified)) * 31) + Boolean.hashCode(this.vip)) * 31;
        Boolean bool = this.acceptedKreativPrivacyPolicy;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.acceptedKreativPrivacyPolicyAt;
        if (str9 != null) {
            i10 = str9.hashCode();
        }
        return hashCode13 + i10;
    }

    public final boolean isFirstTime() {
        return this.isFirstTime;
    }

    public final boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public final boolean isStaff() {
        return this.isStaff;
    }

    public final void setAcceptedKreativPrivacyPolicy(Boolean bool) {
        this.acceptedKreativPrivacyPolicy = bool;
    }

    public final void setAcceptedKreativPrivacyPolicyAt(String str) {
        this.acceptedKreativPrivacyPolicyAt = str;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setEmailVerified(boolean z10) {
        this.emailVerified = z10;
    }

    public final void setFeatureFlags(Map<String, Boolean> map) {
        this.featureFlags = map;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final void setFirstTime(boolean z10) {
        this.isFirstTime = z10;
    }

    public final void setLastCountry(String str) {
        this.lastCountry = str;
    }

    public final void setLastLanguage(String str) {
        this.lastLanguage = str;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final void setLoggedIn(boolean z10) {
        this.isLoggedIn = z10;
    }

    public final void setLoginType(List<String> list) {
        this.loginType = list;
    }

    public final void setMetricsId(String str) {
        this.metricsId = str;
    }

    public final void setMobileDevice(MobileDevice mobileDevice2) {
        this.mobileDevice = mobileDevice2;
    }

    public final void setProfilePictureUrl(String str) {
        this.profilePictureUrl = str;
    }

    public final void setStaff(boolean z10) {
        this.isStaff = z10;
    }

    public final void setVip(boolean z10) {
        this.vip = z10;
    }

    public final void setWid(Integer num) {
        this.wid = num;
    }

    public String toString() {
        Integer num = this.wid;
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.email;
        String str4 = this.profilePictureUrl;
        boolean z10 = this.isStaff;
        Map<String, Boolean> map = this.featureFlags;
        String str5 = this.metricsId;
        String str6 = this.deviceId;
        MobileDevice mobileDevice2 = this.mobileDevice;
        List<String> list = this.loginType;
        String str7 = this.lastCountry;
        String str8 = this.lastLanguage;
        boolean z11 = this.isFirstTime;
        boolean z12 = this.isLoggedIn;
        boolean z13 = this.emailVerified;
        boolean z14 = this.vip;
        Boolean bool = this.acceptedKreativPrivacyPolicy;
        String str9 = this.acceptedKreativPrivacyPolicyAt;
        return "UserResponse(wid=" + num + ", firstName=" + str + ", lastName=" + str2 + ", email=" + str3 + ", profilePictureUrl=" + str4 + ", isStaff=" + z10 + ", featureFlags=" + map + ", metricsId=" + str5 + ", deviceId=" + str6 + ", mobileDevice=" + mobileDevice2 + ", loginType=" + list + ", lastCountry=" + str7 + ", lastLanguage=" + str8 + ", isFirstTime=" + z11 + ", isLoggedIn=" + z12 + ", emailVerified=" + z13 + ", vip=" + z14 + ", acceptedKreativPrivacyPolicy=" + bool + ", acceptedKreativPrivacyPolicyAt=" + str9 + ")";
    }

    public UserResponse(Integer num, String str, String str2, String str3, String str4, boolean z10, Map<String, Boolean> map, String str5, String str6, MobileDevice mobileDevice2, List<String> list, String str7, String str8, boolean z11, boolean z12, boolean z13, boolean z14, Boolean bool, String str9) {
        this.wid = num;
        this.firstName = str;
        this.lastName = str2;
        this.email = str3;
        this.profilePictureUrl = str4;
        this.isStaff = z10;
        this.featureFlags = map;
        this.metricsId = str5;
        this.deviceId = str6;
        this.mobileDevice = mobileDevice2;
        this.loginType = list;
        this.lastCountry = str7;
        this.lastLanguage = str8;
        this.isFirstTime = z11;
        this.isLoggedIn = z12;
        this.emailVerified = z13;
        this.vip = z14;
        this.acceptedKreativPrivacyPolicy = bool;
        this.acceptedKreativPrivacyPolicyAt = str9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserResponse(java.lang.Integer r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26, java.util.Map r27, java.lang.String r28, java.lang.String r29, com.sugarcube.core.network.models.MobileDevice r30, java.util.List r31, java.lang.String r32, java.lang.String r33, boolean r34, boolean r35, boolean r36, boolean r37, java.lang.Boolean r38, java.lang.String r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r20 = this;
            r0 = r40
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r21
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r22
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r23
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r24
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r25
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r26
        L_0x0032:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0038
            r9 = 0
            goto L_0x003a
        L_0x0038:
            r9 = r27
        L_0x003a:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0040
            r10 = 0
            goto L_0x0042
        L_0x0040:
            r10 = r28
        L_0x0042:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0048
            r11 = 0
            goto L_0x004a
        L_0x0048:
            r11 = r29
        L_0x004a:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0050
            r12 = 0
            goto L_0x0052
        L_0x0050:
            r12 = r30
        L_0x0052:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0058
            r13 = 0
            goto L_0x005a
        L_0x0058:
            r13 = r31
        L_0x005a:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0060
            r14 = 0
            goto L_0x0062
        L_0x0060:
            r14 = r32
        L_0x0062:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0068
            r15 = 0
            goto L_0x006a
        L_0x0068:
            r15 = r33
        L_0x006a:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0070
            r2 = 0
            goto L_0x0072
        L_0x0070:
            r2 = r34
        L_0x0072:
            r8 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x0078
            r8 = 0
            goto L_0x007a
        L_0x0078:
            r8 = r35
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r36
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r37
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r38
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r19
            if (r0 == 0) goto L_0x00a4
            r0 = 0
            goto L_0x00a6
        L_0x00a4:
            r0 = r39
        L_0x00a6:
            r21 = r20
            r22 = r1
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r9
            r29 = r10
            r30 = r11
            r31 = r12
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r2
            r36 = r8
            r37 = r16
            r38 = r17
            r39 = r18
            r40 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.UserResponse.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.Map, java.lang.String, java.lang.String, com.sugarcube.core.network.models.MobileDevice, java.util.List, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, java.lang.Boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
