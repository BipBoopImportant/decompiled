package com.sugarcube.core.network.models;

import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b!\b\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fHÆ\u0003Jh\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u000bHÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00060"}, d2 = {"Lcom/sugarcube/core/network/models/FurnitureGfxAttributes;", "", "artData", "Lcom/sugarcube/core/network/models/FurnitureArtData;", "legacyStackedPlane", "", "legacyRelativePosition", "Lcom/sugarcube/core/network/models/PosXYZ;", "parentId", "", "anchorCombinationIndex", "", "mirrorOptionEnabled", "", "additionalContacts", "", "<init>", "(Lcom/sugarcube/core/network/models/FurnitureArtData;Ljava/lang/String;Lcom/sugarcube/core/network/models/PosXYZ;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)V", "getArtData", "()Lcom/sugarcube/core/network/models/FurnitureArtData;", "getLegacyStackedPlane", "()Ljava/lang/String;", "getLegacyRelativePosition", "()Lcom/sugarcube/core/network/models/PosXYZ;", "getParentId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAnchorCombinationIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMirrorOptionEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAdditionalContacts", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/sugarcube/core/network/models/FurnitureArtData;Ljava/lang/String;Lcom/sugarcube/core/network/models/PosXYZ;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)Lcom/sugarcube/core/network/models/FurnitureGfxAttributes;", "equals", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class FurnitureGfxAttributes {
    private final List<Integer> additionalContacts;
    private final Integer anchorCombinationIndex;
    private final FurnitureArtData artData;
    private final PosXYZ legacyRelativePosition;
    private final String legacyStackedPlane;
    private final Boolean mirrorOptionEnabled;
    private final Long parentId;

    public FurnitureGfxAttributes() {
        this((FurnitureArtData) null, (String) null, (PosXYZ) null, (Long) null, (Integer) null, (Boolean) null, (List) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ FurnitureGfxAttributes copy$default(FurnitureGfxAttributes furnitureGfxAttributes, FurnitureArtData furnitureArtData, String str, PosXYZ posXYZ, Long l10, Integer num, Boolean bool, List<Integer> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            furnitureArtData = furnitureGfxAttributes.artData;
        }
        if ((i10 & 2) != 0) {
            str = furnitureGfxAttributes.legacyStackedPlane;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            posXYZ = furnitureGfxAttributes.legacyRelativePosition;
        }
        PosXYZ posXYZ2 = posXYZ;
        if ((i10 & 8) != 0) {
            l10 = furnitureGfxAttributes.parentId;
        }
        Long l11 = l10;
        if ((i10 & 16) != 0) {
            num = furnitureGfxAttributes.anchorCombinationIndex;
        }
        Integer num2 = num;
        if ((i10 & 32) != 0) {
            bool = furnitureGfxAttributes.mirrorOptionEnabled;
        }
        Boolean bool2 = bool;
        if ((i10 & 64) != 0) {
            list = furnitureGfxAttributes.additionalContacts;
        }
        return furnitureGfxAttributes.copy(furnitureArtData, str2, posXYZ2, l11, num2, bool2, list);
    }

    public final FurnitureArtData component1() {
        return this.artData;
    }

    public final String component2() {
        return this.legacyStackedPlane;
    }

    public final PosXYZ component3() {
        return this.legacyRelativePosition;
    }

    public final Long component4() {
        return this.parentId;
    }

    public final Integer component5() {
        return this.anchorCombinationIndex;
    }

    public final Boolean component6() {
        return this.mirrorOptionEnabled;
    }

    public final List<Integer> component7() {
        return this.additionalContacts;
    }

    public final FurnitureGfxAttributes copy(FurnitureArtData furnitureArtData, @e(name = "stackedPlane") String str, @e(name = "position") PosXYZ posXYZ, Long l10, Integer num, Boolean bool, List<Integer> list) {
        return new FurnitureGfxAttributes(furnitureArtData, str, posXYZ, l10, num, bool, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FurnitureGfxAttributes)) {
            return false;
        }
        FurnitureGfxAttributes furnitureGfxAttributes = (FurnitureGfxAttributes) obj;
        return C17542s.e(this.artData, furnitureGfxAttributes.artData) && C17542s.e(this.legacyStackedPlane, furnitureGfxAttributes.legacyStackedPlane) && C17542s.e(this.legacyRelativePosition, furnitureGfxAttributes.legacyRelativePosition) && C17542s.e(this.parentId, furnitureGfxAttributes.parentId) && C17542s.e(this.anchorCombinationIndex, furnitureGfxAttributes.anchorCombinationIndex) && C17542s.e(this.mirrorOptionEnabled, furnitureGfxAttributes.mirrorOptionEnabled) && C17542s.e(this.additionalContacts, furnitureGfxAttributes.additionalContacts);
    }

    public final List<Integer> getAdditionalContacts() {
        return this.additionalContacts;
    }

    public final Integer getAnchorCombinationIndex() {
        return this.anchorCombinationIndex;
    }

    public final FurnitureArtData getArtData() {
        return this.artData;
    }

    public final PosXYZ getLegacyRelativePosition() {
        return this.legacyRelativePosition;
    }

    public final String getLegacyStackedPlane() {
        return this.legacyStackedPlane;
    }

    public final Boolean getMirrorOptionEnabled() {
        return this.mirrorOptionEnabled;
    }

    public final Long getParentId() {
        return this.parentId;
    }

    public int hashCode() {
        FurnitureArtData furnitureArtData = this.artData;
        int i10 = 0;
        int hashCode = (furnitureArtData == null ? 0 : furnitureArtData.hashCode()) * 31;
        String str = this.legacyStackedPlane;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PosXYZ posXYZ = this.legacyRelativePosition;
        int hashCode3 = (hashCode2 + (posXYZ == null ? 0 : posXYZ.hashCode())) * 31;
        Long l10 = this.parentId;
        int hashCode4 = (hashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num = this.anchorCombinationIndex;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.mirrorOptionEnabled;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Integer> list = this.additionalContacts;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        FurnitureArtData furnitureArtData = this.artData;
        String str = this.legacyStackedPlane;
        PosXYZ posXYZ = this.legacyRelativePosition;
        Long l10 = this.parentId;
        Integer num = this.anchorCombinationIndex;
        Boolean bool = this.mirrorOptionEnabled;
        List<Integer> list = this.additionalContacts;
        return "FurnitureGfxAttributes(artData=" + furnitureArtData + ", legacyStackedPlane=" + str + ", legacyRelativePosition=" + posXYZ + ", parentId=" + l10 + ", anchorCombinationIndex=" + num + ", mirrorOptionEnabled=" + bool + ", additionalContacts=" + list + ")";
    }

    public FurnitureGfxAttributes(FurnitureArtData furnitureArtData, @e(name = "stackedPlane") String str, @e(name = "position") PosXYZ posXYZ, Long l10, Integer num, Boolean bool, List<Integer> list) {
        this.artData = furnitureArtData;
        this.legacyStackedPlane = str;
        this.legacyRelativePosition = posXYZ;
        this.parentId = l10;
        this.anchorCombinationIndex = num;
        this.mirrorOptionEnabled = bool;
        this.additionalContacts = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FurnitureGfxAttributes(com.sugarcube.core.network.models.FurnitureArtData r7, java.lang.String r8, com.sugarcube.core.network.models.PosXYZ r9, java.lang.Long r10, java.lang.Integer r11, java.lang.Boolean r12, java.util.List r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.FurnitureGfxAttributes.<init>(com.sugarcube.core.network.models.FurnitureArtData, java.lang.String, com.sugarcube.core.network.models.PosXYZ, java.lang.Long, java.lang.Integer, java.lang.Boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
