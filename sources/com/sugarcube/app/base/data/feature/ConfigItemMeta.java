package com.sugarcube.app.base.data.feature;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItemMeta;", "", "localKey", "", "remoteFeatureKey", "remoteVariableKey", "moreInfo", "resetOnLogout", "", "group", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup;", "sortOrder", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/sugarcube/app/base/data/feature/ConfigItemGroup;I)V", "getLocalKey", "()Ljava/lang/String;", "getRemoteFeatureKey", "getRemoteVariableKey", "getMoreInfo", "getResetOnLogout", "()Z", "getGroup", "()Lcom/sugarcube/app/base/data/feature/ConfigItemGroup;", "getSortOrder", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfigItemMeta {
    public static final int $stable = 0;
    private final ConfigItemGroup group;
    private final String localKey;
    private final String moreInfo;
    private final String remoteFeatureKey;
    private final String remoteVariableKey;
    private final boolean resetOnLogout;
    private final int sortOrder;

    public ConfigItemMeta(String str, String str2, String str3, String str4, boolean z10, ConfigItemGroup configItemGroup, int i10) {
        C17542s.j(str, "localKey");
        this.localKey = str;
        this.remoteFeatureKey = str2;
        this.remoteVariableKey = str3;
        this.moreInfo = str4;
        this.resetOnLogout = z10;
        this.group = configItemGroup;
        this.sortOrder = i10;
    }

    public static /* synthetic */ ConfigItemMeta copy$default(ConfigItemMeta configItemMeta, String str, String str2, String str3, String str4, boolean z10, ConfigItemGroup configItemGroup, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = configItemMeta.localKey;
        }
        if ((i11 & 2) != 0) {
            str2 = configItemMeta.remoteFeatureKey;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = configItemMeta.remoteVariableKey;
        }
        String str6 = str3;
        if ((i11 & 8) != 0) {
            str4 = configItemMeta.moreInfo;
        }
        String str7 = str4;
        if ((i11 & 16) != 0) {
            z10 = configItemMeta.resetOnLogout;
        }
        boolean z11 = z10;
        if ((i11 & 32) != 0) {
            configItemGroup = configItemMeta.group;
        }
        ConfigItemGroup configItemGroup2 = configItemGroup;
        if ((i11 & 64) != 0) {
            i10 = configItemMeta.sortOrder;
        }
        return configItemMeta.copy(str, str5, str6, str7, z11, configItemGroup2, i10);
    }

    public final String component1() {
        return this.localKey;
    }

    public final String component2() {
        return this.remoteFeatureKey;
    }

    public final String component3() {
        return this.remoteVariableKey;
    }

    public final String component4() {
        return this.moreInfo;
    }

    public final boolean component5() {
        return this.resetOnLogout;
    }

    public final ConfigItemGroup component6() {
        return this.group;
    }

    public final int component7() {
        return this.sortOrder;
    }

    public final ConfigItemMeta copy(String str, String str2, String str3, String str4, boolean z10, ConfigItemGroup configItemGroup, int i10) {
        C17542s.j(str, "localKey");
        return new ConfigItemMeta(str, str2, str3, str4, z10, configItemGroup, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigItemMeta)) {
            return false;
        }
        ConfigItemMeta configItemMeta = (ConfigItemMeta) obj;
        return C17542s.e(this.localKey, configItemMeta.localKey) && C17542s.e(this.remoteFeatureKey, configItemMeta.remoteFeatureKey) && C17542s.e(this.remoteVariableKey, configItemMeta.remoteVariableKey) && C17542s.e(this.moreInfo, configItemMeta.moreInfo) && this.resetOnLogout == configItemMeta.resetOnLogout && C17542s.e(this.group, configItemMeta.group) && this.sortOrder == configItemMeta.sortOrder;
    }

    public final ConfigItemGroup getGroup() {
        return this.group;
    }

    public final String getLocalKey() {
        return this.localKey;
    }

    public final String getMoreInfo() {
        return this.moreInfo;
    }

    public final String getRemoteFeatureKey() {
        return this.remoteFeatureKey;
    }

    public final String getRemoteVariableKey() {
        return this.remoteVariableKey;
    }

    public final boolean getResetOnLogout() {
        return this.resetOnLogout;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    public int hashCode() {
        int hashCode = this.localKey.hashCode() * 31;
        String str = this.remoteFeatureKey;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.remoteVariableKey;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.moreInfo;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.resetOnLogout)) * 31;
        ConfigItemGroup configItemGroup = this.group;
        if (configItemGroup != null) {
            i10 = configItemGroup.hashCode();
        }
        return ((hashCode4 + i10) * 31) + Integer.hashCode(this.sortOrder);
    }

    public String toString() {
        String str = this.localKey;
        String str2 = this.remoteFeatureKey;
        String str3 = this.remoteVariableKey;
        String str4 = this.moreInfo;
        boolean z10 = this.resetOnLogout;
        ConfigItemGroup configItemGroup = this.group;
        int i10 = this.sortOrder;
        return "ConfigItemMeta(localKey=" + str + ", remoteFeatureKey=" + str2 + ", remoteVariableKey=" + str3 + ", moreInfo=" + str4 + ", resetOnLogout=" + z10 + ", group=" + configItemGroup + ", sortOrder=" + i10 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ConfigItemMeta(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, com.sugarcube.app.base.data.feature.ConfigItemGroup r12, int r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r0 = r14 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r8
        L_0x0008:
            r2 = r14 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r9
        L_0x000f:
            r3 = r14 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r10
        L_0x0016:
            r4 = r14 & 16
            if (r4 == 0) goto L_0x001c
            r4 = 0
            goto L_0x001d
        L_0x001c:
            r4 = r11
        L_0x001d:
            r5 = r14 & 32
            if (r5 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r12
        L_0x0023:
            r5 = r14 & 64
            if (r5 == 0) goto L_0x002b
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x002c
        L_0x002b:
            r5 = r13
        L_0x002c:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r1
            r15 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.feature.ConfigItemMeta.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.sugarcube.app.base.data.feature.ConfigItemGroup, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
