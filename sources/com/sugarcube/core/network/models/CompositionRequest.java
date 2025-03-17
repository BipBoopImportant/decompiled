package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\b\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0012\u0010\u0016J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0003HÖ\u0001J\t\u00109\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b\f\u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0011\u0010*\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006:"}, d2 = {"Lcom/sugarcube/core/network/models/CompositionRequest;", "", "compositionId", "", "name", "", "sceneId", "uuid", "Ljava/util/UUID;", "placedFurniture", "", "Lcom/sugarcube/core/network/models/PlacedFurniture;", "isShared", "", "sceneUuid", "baseImageData", "savedProperties", "Lcom/sugarcube/core/network/models/CompositionSavedProperties;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/UUID;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/UUID;Ljava/lang/String;Lcom/sugarcube/core/network/models/CompositionSavedProperties;)V", "comp", "Lcom/sugarcube/core/network/models/Composition;", "(Lcom/sugarcube/core/network/models/Composition;)V", "getCompositionId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getSceneId", "getUuid", "()Ljava/util/UUID;", "getPlacedFurniture", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSceneUuid", "getBaseImageData", "getSavedProperties", "()Lcom/sugarcube/core/network/models/CompositionSavedProperties;", "isLegacy2D", "()Z", "is3D", "isEmptyOr3D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/UUID;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/UUID;Ljava/lang/String;Lcom/sugarcube/core/network/models/CompositionSavedProperties;)Lcom/sugarcube/core/network/models/CompositionRequest;", "equals", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CompositionRequest {
    private final String baseImageData;
    private final Integer compositionId;
    private final Boolean isShared;
    private final String name;
    private final List<PlacedFurniture> placedFurniture;
    private final CompositionSavedProperties savedProperties;
    private final Integer sceneId;
    private final UUID sceneUuid;
    private final UUID uuid;

    public CompositionRequest() {
        this((Integer) null, (String) null, (Integer) null, (UUID) null, (List) null, (Boolean) null, (UUID) null, (String) null, (CompositionSavedProperties) null, 511, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CompositionRequest copy$default(CompositionRequest compositionRequest, Integer num, String str, Integer num2, UUID uuid2, List list, Boolean bool, UUID uuid3, String str2, CompositionSavedProperties compositionSavedProperties, int i10, Object obj) {
        CompositionRequest compositionRequest2 = compositionRequest;
        int i11 = i10;
        return compositionRequest.copy((i11 & 1) != 0 ? compositionRequest2.compositionId : num, (i11 & 2) != 0 ? compositionRequest2.name : str, (i11 & 4) != 0 ? compositionRequest2.sceneId : num2, (i11 & 8) != 0 ? compositionRequest2.uuid : uuid2, (i11 & 16) != 0 ? compositionRequest2.placedFurniture : list, (i11 & 32) != 0 ? compositionRequest2.isShared : bool, (i11 & 64) != 0 ? compositionRequest2.sceneUuid : uuid3, (i11 & 128) != 0 ? compositionRequest2.baseImageData : str2, (i11 & 256) != 0 ? compositionRequest2.savedProperties : compositionSavedProperties);
    }

    public final Integer component1() {
        return this.compositionId;
    }

    public final String component2() {
        return this.name;
    }

    public final Integer component3() {
        return this.sceneId;
    }

    public final UUID component4() {
        return this.uuid;
    }

    public final List<PlacedFurniture> component5() {
        return this.placedFurniture;
    }

    public final Boolean component6() {
        return this.isShared;
    }

    public final UUID component7() {
        return this.sceneUuid;
    }

    public final String component8() {
        return this.baseImageData;
    }

    public final CompositionSavedProperties component9() {
        return this.savedProperties;
    }

    public final CompositionRequest copy(Integer num, String str, Integer num2, UUID uuid2, List<PlacedFurniture> list, Boolean bool, UUID uuid3, String str2, CompositionSavedProperties compositionSavedProperties) {
        return new CompositionRequest(num, str, num2, uuid2, list, bool, uuid3, str2, compositionSavedProperties);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositionRequest)) {
            return false;
        }
        CompositionRequest compositionRequest = (CompositionRequest) obj;
        return C17542s.e(this.compositionId, compositionRequest.compositionId) && C17542s.e(this.name, compositionRequest.name) && C17542s.e(this.sceneId, compositionRequest.sceneId) && C17542s.e(this.uuid, compositionRequest.uuid) && C17542s.e(this.placedFurniture, compositionRequest.placedFurniture) && C17542s.e(this.isShared, compositionRequest.isShared) && C17542s.e(this.sceneUuid, compositionRequest.sceneUuid) && C17542s.e(this.baseImageData, compositionRequest.baseImageData) && C17542s.e(this.savedProperties, compositionRequest.savedProperties);
    }

    public final String getBaseImageData() {
        return this.baseImageData;
    }

    public final Integer getCompositionId() {
        return this.compositionId;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PlacedFurniture> getPlacedFurniture() {
        return this.placedFurniture;
    }

    public final CompositionSavedProperties getSavedProperties() {
        return this.savedProperties;
    }

    public final Integer getSceneId() {
        return this.sceneId;
    }

    public final UUID getSceneUuid() {
        return this.sceneUuid;
    }

    public final UUID getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        Integer num = this.compositionId;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.sceneId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UUID uuid2 = this.uuid;
        int hashCode4 = (hashCode3 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        List<PlacedFurniture> list = this.placedFurniture;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isShared;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        UUID uuid3 = this.sceneUuid;
        int hashCode7 = (hashCode6 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31;
        String str2 = this.baseImageData;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CompositionSavedProperties compositionSavedProperties = this.savedProperties;
        if (compositionSavedProperties != null) {
            i10 = compositionSavedProperties.hashCode();
        }
        return hashCode8 + i10;
    }

    public final boolean is3D() {
        List<PlacedFurniture> list = this.placedFurniture;
        return list != null && !list.isEmpty() && list.get(0).is3D();
    }

    public final boolean isEmptyOr3D() {
        List<PlacedFurniture> list = this.placedFurniture;
        return (list != null && list.isEmpty()) || is3D();
    }

    public final boolean isLegacy2D() {
        List<PlacedFurniture> list = this.placedFurniture;
        return list != null && !list.isEmpty() && list.get(0).isLegacy2D();
    }

    public final Boolean isShared() {
        return this.isShared;
    }

    public String toString() {
        Integer num = this.compositionId;
        String str = this.name;
        Integer num2 = this.sceneId;
        UUID uuid2 = this.uuid;
        List<PlacedFurniture> list = this.placedFurniture;
        Boolean bool = this.isShared;
        UUID uuid3 = this.sceneUuid;
        String str2 = this.baseImageData;
        CompositionSavedProperties compositionSavedProperties = this.savedProperties;
        return "CompositionRequest(compositionId=" + num + ", name=" + str + ", sceneId=" + num2 + ", uuid=" + uuid2 + ", placedFurniture=" + list + ", isShared=" + bool + ", sceneUuid=" + uuid3 + ", baseImageData=" + str2 + ", savedProperties=" + compositionSavedProperties + ")";
    }

    public CompositionRequest(Integer num, String str, Integer num2, UUID uuid2, List<PlacedFurniture> list, Boolean bool, UUID uuid3, String str2, CompositionSavedProperties compositionSavedProperties) {
        this.compositionId = num;
        this.name = str;
        this.sceneId = num2;
        this.uuid = uuid2;
        this.placedFurniture = list;
        this.isShared = bool;
        this.sceneUuid = uuid3;
        this.baseImageData = str2;
        this.savedProperties = compositionSavedProperties;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CompositionRequest(java.lang.Integer r11, java.lang.String r12, java.lang.Integer r13, java.util.UUID r14, java.util.List r15, java.lang.Boolean r16, java.util.UUID r17, java.lang.String r18, com.sugarcube.core.network.models.CompositionSavedProperties r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003c
            r9 = r2
            goto L_0x003e
        L_0x003c:
            r9 = r18
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = r19
        L_0x0045:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.CompositionRequest.<init>(java.lang.Integer, java.lang.String, java.lang.Integer, java.util.UUID, java.util.List, java.lang.Boolean, java.util.UUID, java.lang.String, com.sugarcube.core.network.models.CompositionSavedProperties, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CompositionRequest(com.sugarcube.core.network.models.Composition r31) {
        /*
            r30 = this;
            java.lang.String r0 = "comp"
            r1 = r31
            kotlin.jvm.internal.C17542s.j(r1, r0)
            int r0 = r31.getCompositionId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = r31.getName()
            int r0 = r31.getSceneId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.util.UUID r5 = r31.getCompositionUuid()
            java.util.List r0 = r31.getPlacedFurnitureSet()
            r6 = 0
            if (r0 == 0) goto L_0x0064
            int r7 = r0.size()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r7)
            r9 = 0
        L_0x0030:
            if (r9 >= r7) goto L_0x0065
            java.lang.Object r10 = r0.get(r9)
            r11 = r10
            com.sugarcube.core.network.models.PlacedFurniture r11 = (com.sugarcube.core.network.models.PlacedFurniture) r11
            r28 = 64511(0xfbff, float:9.0399E-41)
            r29 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            com.sugarcube.core.network.models.PlacedFurniture r10 = com.sugarcube.core.network.models.PlacedFurniture.copy$default(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r8.add(r10)
            int r9 = r9 + 1
            goto L_0x0030
        L_0x0064:
            r8 = r6
        L_0x0065:
            boolean r0 = r31.isShared()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            java.util.UUID r0 = r31.getSceneUuid()
            java.lang.String r9 = r31.getBaseImageData()
            com.sugarcube.core.network.models.CompositionSavedProperties r10 = r31.getSavedProperties()
            if (r10 == 0) goto L_0x0090
            r19 = 255(0xff, float:3.57E-43)
            r20 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            com.sugarcube.core.network.models.CompositionSavedProperties r1 = com.sugarcube.core.network.models.CompositionSavedProperties.copy$default(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r10 = r1
            goto L_0x0091
        L_0x0090:
            r10 = r6
        L_0x0091:
            r1 = r30
            r6 = r8
            r8 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.CompositionRequest.<init>(com.sugarcube.core.network.models.Composition):void");
    }
}
