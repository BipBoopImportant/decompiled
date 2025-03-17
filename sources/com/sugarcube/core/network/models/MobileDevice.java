package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006*"}, d2 = {"Lcom/sugarcube/core/network/models/MobileDevice;", "", "fcmToken", "", "appEnv", "fcmProject", "uuid", "token", "name", "createdAt", "Ljava/time/Instant;", "lastModifiedTs", "platform", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;Ljava/time/Instant;Ljava/lang/String;)V", "getFcmToken", "()Ljava/lang/String;", "getAppEnv", "getFcmProject", "getUuid", "getToken", "getName", "getCreatedAt", "()Ljava/time/Instant;", "getLastModifiedTs", "getPlatform", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class MobileDevice {
    private final String appEnv;
    private final Instant createdAt;
    private final String fcmProject;
    private final String fcmToken;
    private final Instant lastModifiedTs;
    private final String name;
    private final String platform;
    private final String token;
    private final String uuid;

    public MobileDevice(String str, String str2, String str3, String str4, String str5, String str6, Instant instant, Instant instant2, String str7) {
        C17542s.j(str6, "name");
        C17542s.j(instant, "createdAt");
        C17542s.j(instant2, "lastModifiedTs");
        this.fcmToken = str;
        this.appEnv = str2;
        this.fcmProject = str3;
        this.uuid = str4;
        this.token = str5;
        this.name = str6;
        this.createdAt = instant;
        this.lastModifiedTs = instant2;
        this.platform = str7;
    }

    public static /* synthetic */ MobileDevice copy$default(MobileDevice mobileDevice, String str, String str2, String str3, String str4, String str5, String str6, Instant instant, Instant instant2, String str7, int i10, Object obj) {
        MobileDevice mobileDevice2 = mobileDevice;
        int i11 = i10;
        return mobileDevice.copy((i11 & 1) != 0 ? mobileDevice2.fcmToken : str, (i11 & 2) != 0 ? mobileDevice2.appEnv : str2, (i11 & 4) != 0 ? mobileDevice2.fcmProject : str3, (i11 & 8) != 0 ? mobileDevice2.uuid : str4, (i11 & 16) != 0 ? mobileDevice2.token : str5, (i11 & 32) != 0 ? mobileDevice2.name : str6, (i11 & 64) != 0 ? mobileDevice2.createdAt : instant, (i11 & 128) != 0 ? mobileDevice2.lastModifiedTs : instant2, (i11 & 256) != 0 ? mobileDevice2.platform : str7);
    }

    public final String component1() {
        return this.fcmToken;
    }

    public final String component2() {
        return this.appEnv;
    }

    public final String component3() {
        return this.fcmProject;
    }

    public final String component4() {
        return this.uuid;
    }

    public final String component5() {
        return this.token;
    }

    public final String component6() {
        return this.name;
    }

    public final Instant component7() {
        return this.createdAt;
    }

    public final Instant component8() {
        return this.lastModifiedTs;
    }

    public final String component9() {
        return this.platform;
    }

    public final MobileDevice copy(String str, String str2, String str3, String str4, String str5, String str6, Instant instant, Instant instant2, String str7) {
        String str8 = str6;
        C17542s.j(str8, "name");
        Instant instant3 = instant;
        C17542s.j(instant3, "createdAt");
        Instant instant4 = instant2;
        C17542s.j(instant4, "lastModifiedTs");
        return new MobileDevice(str, str2, str3, str4, str5, str8, instant3, instant4, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileDevice)) {
            return false;
        }
        MobileDevice mobileDevice = (MobileDevice) obj;
        return C17542s.e(this.fcmToken, mobileDevice.fcmToken) && C17542s.e(this.appEnv, mobileDevice.appEnv) && C17542s.e(this.fcmProject, mobileDevice.fcmProject) && C17542s.e(this.uuid, mobileDevice.uuid) && C17542s.e(this.token, mobileDevice.token) && C17542s.e(this.name, mobileDevice.name) && C17542s.e(this.createdAt, mobileDevice.createdAt) && C17542s.e(this.lastModifiedTs, mobileDevice.lastModifiedTs) && C17542s.e(this.platform, mobileDevice.platform);
    }

    public final String getAppEnv() {
        return this.appEnv;
    }

    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    public final String getFcmProject() {
        return this.fcmProject;
    }

    public final String getFcmToken() {
        return this.fcmToken;
    }

    public final Instant getLastModifiedTs() {
        return this.lastModifiedTs;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        String str = this.fcmToken;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appEnv;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fcmProject;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.uuid;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.token;
        int hashCode5 = (((((((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.name.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.lastModifiedTs.hashCode()) * 31;
        String str6 = this.platform;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        String str = this.fcmToken;
        String str2 = this.appEnv;
        String str3 = this.fcmProject;
        String str4 = this.uuid;
        String str5 = this.token;
        String str6 = this.name;
        Instant instant = this.createdAt;
        Instant instant2 = this.lastModifiedTs;
        String str7 = this.platform;
        return "MobileDevice(fcmToken=" + str + ", appEnv=" + str2 + ", fcmProject=" + str3 + ", uuid=" + str4 + ", token=" + str5 + ", name=" + str6 + ", createdAt=" + instant + ", lastModifiedTs=" + instant2 + ", platform=" + str7 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MobileDevice(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.time.Instant r20, java.time.Instant r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r17
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r18
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0031
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " - "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r9 = r1
            goto L_0x0033
        L_0x0031:
            r9 = r19
        L_0x0033:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x003d
            java.time.Instant r1 = java.time.Instant.now()
            r10 = r1
            goto L_0x003f
        L_0x003d:
            r10 = r20
        L_0x003f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0049
            java.time.Instant r1 = java.time.Instant.now()
            r11 = r1
            goto L_0x004b
        L_0x0049:
            r11 = r21
        L_0x004b:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = "android"
            r12 = r0
            goto L_0x0055
        L_0x0053:
            r12 = r22
        L_0x0055:
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.MobileDevice.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.time.Instant, java.time.Instant, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
