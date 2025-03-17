package com.sugarcube.core.analytics.entities;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\b\b\u0018\u00002\u00020\u0001B­\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J´\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001fR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001b¨\u0006A"}, d2 = {"Lcom/sugarcube/core/analytics/entities/LoggedInUser;", "", "wid", "", "email", "", "server", "authMethod", "Lcom/sugarcube/core/analytics/entities/AuthType;", "isLoggedIn", "", "featureFlags", "", "mobileDevice", "Lcom/sugarcube/core/analytics/entities/MobileDevice;", "partyUid", "postalCode", "preferredStore", "hasScenes", "hasDesigns", "acceptedKreativPrivacyPolicy", "acceptedKreativPrivacyPolicyAt", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/sugarcube/core/analytics/entities/AuthType;ZLjava/util/Map;Lcom/sugarcube/core/analytics/entities/MobileDevice;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/String;)V", "getWid", "()I", "getEmail", "()Ljava/lang/String;", "getServer", "getAuthMethod", "()Lcom/sugarcube/core/analytics/entities/AuthType;", "()Z", "getFeatureFlags", "()Ljava/util/Map;", "getMobileDevice", "()Lcom/sugarcube/core/analytics/entities/MobileDevice;", "getPartyUid", "getPostalCode", "getPreferredStore", "getHasScenes", "getHasDesigns", "getAcceptedKreativPrivacyPolicy", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAcceptedKreativPrivacyPolicyAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/sugarcube/core/analytics/entities/AuthType;ZLjava/util/Map;Lcom/sugarcube/core/analytics/entities/MobileDevice;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/String;)Lcom/sugarcube/core/analytics/entities/LoggedInUser;", "equals", "other", "hashCode", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoggedInUser {
    private final Boolean acceptedKreativPrivacyPolicy;
    private final String acceptedKreativPrivacyPolicyAt;
    private final AuthType authMethod;
    private final String email;
    private final Map<String, Boolean> featureFlags;
    private final boolean hasDesigns;
    private final boolean hasScenes;
    private final boolean isLoggedIn;
    private final MobileDevice mobileDevice;
    private final String partyUid;
    private final String postalCode;
    private final String preferredStore;
    private final String server;
    private final int wid;

    public LoggedInUser() {
        this(0, (String) null, (String) null, (AuthType) null, false, (Map) null, (MobileDevice) null, (String) null, (String) null, (String) null, false, false, (Boolean) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LoggedInUser copy$default(LoggedInUser loggedInUser, int i10, String str, String str2, AuthType authType, boolean z10, Map map, MobileDevice mobileDevice2, String str3, String str4, String str5, boolean z11, boolean z12, Boolean bool, String str6, int i11, Object obj) {
        LoggedInUser loggedInUser2 = loggedInUser;
        int i12 = i11;
        return loggedInUser.copy((i12 & 1) != 0 ? loggedInUser2.wid : i10, (i12 & 2) != 0 ? loggedInUser2.email : str, (i12 & 4) != 0 ? loggedInUser2.server : str2, (i12 & 8) != 0 ? loggedInUser2.authMethod : authType, (i12 & 16) != 0 ? loggedInUser2.isLoggedIn : z10, (i12 & 32) != 0 ? loggedInUser2.featureFlags : map, (i12 & 64) != 0 ? loggedInUser2.mobileDevice : mobileDevice2, (i12 & 128) != 0 ? loggedInUser2.partyUid : str3, (i12 & 256) != 0 ? loggedInUser2.postalCode : str4, (i12 & 512) != 0 ? loggedInUser2.preferredStore : str5, (i12 & 1024) != 0 ? loggedInUser2.hasScenes : z11, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? loggedInUser2.hasDesigns : z12, (i12 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? loggedInUser2.acceptedKreativPrivacyPolicy : bool, (i12 & 8192) != 0 ? loggedInUser2.acceptedKreativPrivacyPolicyAt : str6);
    }

    public final int component1() {
        return this.wid;
    }

    public final String component10() {
        return this.preferredStore;
    }

    public final boolean component11() {
        return this.hasScenes;
    }

    public final boolean component12() {
        return this.hasDesigns;
    }

    public final Boolean component13() {
        return this.acceptedKreativPrivacyPolicy;
    }

    public final String component14() {
        return this.acceptedKreativPrivacyPolicyAt;
    }

    public final String component2() {
        return this.email;
    }

    public final String component3() {
        return this.server;
    }

    public final AuthType component4() {
        return this.authMethod;
    }

    public final boolean component5() {
        return this.isLoggedIn;
    }

    public final Map<String, Boolean> component6() {
        return this.featureFlags;
    }

    public final MobileDevice component7() {
        return this.mobileDevice;
    }

    public final String component8() {
        return this.partyUid;
    }

    public final String component9() {
        return this.postalCode;
    }

    public final LoggedInUser copy(int i10, String str, String str2, AuthType authType, boolean z10, Map<String, Boolean> map, MobileDevice mobileDevice2, String str3, String str4, String str5, boolean z11, boolean z12, Boolean bool, String str6) {
        String str7 = str;
        C17542s.j(str7, "email");
        String str8 = str2;
        C17542s.j(str8, "server");
        AuthType authType2 = authType;
        C17542s.j(authType2, "authMethod");
        return new LoggedInUser(i10, str7, str8, authType2, z10, map, mobileDevice2, str3, str4, str5, z11, z12, bool, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoggedInUser)) {
            return false;
        }
        LoggedInUser loggedInUser = (LoggedInUser) obj;
        return this.wid == loggedInUser.wid && C17542s.e(this.email, loggedInUser.email) && C17542s.e(this.server, loggedInUser.server) && this.authMethod == loggedInUser.authMethod && this.isLoggedIn == loggedInUser.isLoggedIn && C17542s.e(this.featureFlags, loggedInUser.featureFlags) && C17542s.e(this.mobileDevice, loggedInUser.mobileDevice) && C17542s.e(this.partyUid, loggedInUser.partyUid) && C17542s.e(this.postalCode, loggedInUser.postalCode) && C17542s.e(this.preferredStore, loggedInUser.preferredStore) && this.hasScenes == loggedInUser.hasScenes && this.hasDesigns == loggedInUser.hasDesigns && C17542s.e(this.acceptedKreativPrivacyPolicy, loggedInUser.acceptedKreativPrivacyPolicy) && C17542s.e(this.acceptedKreativPrivacyPolicyAt, loggedInUser.acceptedKreativPrivacyPolicyAt);
    }

    public final Boolean getAcceptedKreativPrivacyPolicy() {
        return this.acceptedKreativPrivacyPolicy;
    }

    public final String getAcceptedKreativPrivacyPolicyAt() {
        return this.acceptedKreativPrivacyPolicyAt;
    }

    public final AuthType getAuthMethod() {
        return this.authMethod;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Map<String, Boolean> getFeatureFlags() {
        return this.featureFlags;
    }

    public final boolean getHasDesigns() {
        return this.hasDesigns;
    }

    public final boolean getHasScenes() {
        return this.hasScenes;
    }

    public final MobileDevice getMobileDevice() {
        return this.mobileDevice;
    }

    public final String getPartyUid() {
        return this.partyUid;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getPreferredStore() {
        return this.preferredStore;
    }

    public final String getServer() {
        return this.server;
    }

    public final int getWid() {
        return this.wid;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.wid) * 31) + this.email.hashCode()) * 31) + this.server.hashCode()) * 31) + this.authMethod.hashCode()) * 31) + Boolean.hashCode(this.isLoggedIn)) * 31;
        Map<String, Boolean> map = this.featureFlags;
        int i10 = 0;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        MobileDevice mobileDevice2 = this.mobileDevice;
        int hashCode3 = (hashCode2 + (mobileDevice2 == null ? 0 : mobileDevice2.hashCode())) * 31;
        String str = this.partyUid;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.postalCode;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.preferredStore;
        int hashCode6 = (((((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.hasScenes)) * 31) + Boolean.hashCode(this.hasDesigns)) * 31;
        Boolean bool = this.acceptedKreativPrivacyPolicy;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.acceptedKreativPrivacyPolicyAt;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode7 + i10;
    }

    public final boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public String toString() {
        int i10 = this.wid;
        String str = this.email;
        String str2 = this.server;
        AuthType authType = this.authMethod;
        boolean z10 = this.isLoggedIn;
        Map<String, Boolean> map = this.featureFlags;
        MobileDevice mobileDevice2 = this.mobileDevice;
        String str3 = this.partyUid;
        String str4 = this.postalCode;
        String str5 = this.preferredStore;
        boolean z11 = this.hasScenes;
        boolean z12 = this.hasDesigns;
        Boolean bool = this.acceptedKreativPrivacyPolicy;
        String str6 = this.acceptedKreativPrivacyPolicyAt;
        return "LoggedInUser(wid=" + i10 + ", email=" + str + ", server=" + str2 + ", authMethod=" + authType + ", isLoggedIn=" + z10 + ", featureFlags=" + map + ", mobileDevice=" + mobileDevice2 + ", partyUid=" + str3 + ", postalCode=" + str4 + ", preferredStore=" + str5 + ", hasScenes=" + z11 + ", hasDesigns=" + z12 + ", acceptedKreativPrivacyPolicy=" + bool + ", acceptedKreativPrivacyPolicyAt=" + str6 + ")";
    }

    public LoggedInUser(int i10, String str, String str2, AuthType authType, boolean z10, Map<String, Boolean> map, MobileDevice mobileDevice2, String str3, String str4, String str5, boolean z11, boolean z12, Boolean bool, String str6) {
        C17542s.j(str, "email");
        C17542s.j(str2, "server");
        C17542s.j(authType, "authMethod");
        this.wid = i10;
        this.email = str;
        this.server = str2;
        this.authMethod = authType;
        this.isLoggedIn = z10;
        this.featureFlags = map;
        this.mobileDevice = mobileDevice2;
        this.partyUid = str3;
        this.postalCode = str4;
        this.preferredStore = str5;
        this.hasScenes = z11;
        this.hasDesigns = z12;
        this.acceptedKreativPrivacyPolicy = bool;
        this.acceptedKreativPrivacyPolicyAt = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LoggedInUser(int r16, java.lang.String r17, java.lang.String r18, com.sugarcube.core.analytics.entities.AuthType r19, boolean r20, java.util.Map r21, com.sugarcube.core.analytics.entities.MobileDevice r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26, boolean r27, java.lang.Boolean r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r15 = this;
            r0 = r30
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = -1
            goto L_0x000a
        L_0x0008:
            r1 = r16
        L_0x000a:
            r2 = r0 & 2
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0012
            r2 = r3
            goto L_0x0014
        L_0x0012:
            r2 = r17
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = r18
        L_0x001b:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0022
            com.sugarcube.core.analytics.entities.AuthType r4 = com.sugarcube.core.analytics.entities.AuthType.UNKNOWN
            goto L_0x0024
        L_0x0022:
            r4 = r19
        L_0x0024:
            r5 = r0 & 16
            r6 = 0
            if (r5 == 0) goto L_0x002b
            r5 = r6
            goto L_0x002d
        L_0x002b:
            r5 = r20
        L_0x002d:
            r7 = r0 & 32
            r8 = 0
            if (r7 == 0) goto L_0x0034
            r7 = r8
            goto L_0x0036
        L_0x0034:
            r7 = r21
        L_0x0036:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003c
            r9 = r8
            goto L_0x003e
        L_0x003c:
            r9 = r22
        L_0x003e:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0044
            r10 = r8
            goto L_0x0046
        L_0x0044:
            r10 = r23
        L_0x0046:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004c
            r11 = r8
            goto L_0x004e
        L_0x004c:
            r11 = r24
        L_0x004e:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0054
            r12 = r8
            goto L_0x0056
        L_0x0054:
            r12 = r25
        L_0x0056:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005c
            r13 = r6
            goto L_0x005e
        L_0x005c:
            r13 = r26
        L_0x005e:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r6 = r27
        L_0x0065:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x006b
            r14 = r8
            goto L_0x006d
        L_0x006b:
            r14 = r28
        L_0x006d:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r8 = r29
        L_0x0074:
            r16 = r15
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r7
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r6
            r29 = r14
            r30 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.analytics.entities.LoggedInUser.<init>(int, java.lang.String, java.lang.String, com.sugarcube.core.analytics.entities.AuthType, boolean, java.util.Map, com.sugarcube.core.analytics.entities.MobileDevice, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.Boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
