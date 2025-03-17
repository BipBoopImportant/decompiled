package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b!\b\b\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003Jn\u0010)\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u000eHÖ\u0001J\t\u0010.\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u0006/"}, d2 = {"Lcom/sugarcube/core/network/models/SmartaPlacementRequest;", "", "placedFurniture", "", "Lcom/sugarcube/core/network/models/PlacedFurniture;", "name", "", "sceneId", "Ljava/util/UUID;", "isShared", "", "savedProperties", "Lcom/sugarcube/core/network/models/CompositionSavedProperties;", "localProductIdToPlace", "", "localItemNumberToPlace", "productIdMode", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/UUID;ZLcom/sugarcube/core/network/models/CompositionSavedProperties;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getPlacedFurniture", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getSceneId", "()Ljava/util/UUID;", "()Z", "getSavedProperties", "()Lcom/sugarcube/core/network/models/CompositionSavedProperties;", "getLocalProductIdToPlace", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLocalItemNumberToPlace", "getProductIdMode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/util/UUID;ZLcom/sugarcube/core/network/models/CompositionSavedProperties;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/sugarcube/core/network/models/SmartaPlacementRequest;", "equals", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class SmartaPlacementRequest {
    private final boolean isShared;
    private final String localItemNumberToPlace;
    private final Integer localProductIdToPlace;
    private final String name;
    private final List<PlacedFurniture> placedFurniture;
    private final String productIdMode;
    private final CompositionSavedProperties savedProperties;
    private final UUID sceneId;

    public SmartaPlacementRequest(List<PlacedFurniture> list, String str, UUID uuid, boolean z10, CompositionSavedProperties compositionSavedProperties, Integer num, String str2, String str3) {
        C17542s.j(list, "placedFurniture");
        C17542s.j(str3, "productIdMode");
        this.placedFurniture = list;
        this.name = str;
        this.sceneId = uuid;
        this.isShared = z10;
        this.savedProperties = compositionSavedProperties;
        this.localProductIdToPlace = num;
        this.localItemNumberToPlace = str2;
        this.productIdMode = str3;
    }

    public static /* synthetic */ SmartaPlacementRequest copy$default(SmartaPlacementRequest smartaPlacementRequest, List list, String str, UUID uuid, boolean z10, CompositionSavedProperties compositionSavedProperties, Integer num, String str2, String str3, int i10, Object obj) {
        SmartaPlacementRequest smartaPlacementRequest2 = smartaPlacementRequest;
        int i11 = i10;
        return smartaPlacementRequest.copy((i11 & 1) != 0 ? smartaPlacementRequest2.placedFurniture : list, (i11 & 2) != 0 ? smartaPlacementRequest2.name : str, (i11 & 4) != 0 ? smartaPlacementRequest2.sceneId : uuid, (i11 & 8) != 0 ? smartaPlacementRequest2.isShared : z10, (i11 & 16) != 0 ? smartaPlacementRequest2.savedProperties : compositionSavedProperties, (i11 & 32) != 0 ? smartaPlacementRequest2.localProductIdToPlace : num, (i11 & 64) != 0 ? smartaPlacementRequest2.localItemNumberToPlace : str2, (i11 & 128) != 0 ? smartaPlacementRequest2.productIdMode : str3);
    }

    public final List<PlacedFurniture> component1() {
        return this.placedFurniture;
    }

    public final String component2() {
        return this.name;
    }

    public final UUID component3() {
        return this.sceneId;
    }

    public final boolean component4() {
        return this.isShared;
    }

    public final CompositionSavedProperties component5() {
        return this.savedProperties;
    }

    public final Integer component6() {
        return this.localProductIdToPlace;
    }

    public final String component7() {
        return this.localItemNumberToPlace;
    }

    public final String component8() {
        return this.productIdMode;
    }

    public final SmartaPlacementRequest copy(List<PlacedFurniture> list, String str, UUID uuid, boolean z10, CompositionSavedProperties compositionSavedProperties, Integer num, String str2, String str3) {
        C17542s.j(list, "placedFurniture");
        String str4 = str3;
        C17542s.j(str4, "productIdMode");
        return new SmartaPlacementRequest(list, str, uuid, z10, compositionSavedProperties, num, str2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartaPlacementRequest)) {
            return false;
        }
        SmartaPlacementRequest smartaPlacementRequest = (SmartaPlacementRequest) obj;
        return C17542s.e(this.placedFurniture, smartaPlacementRequest.placedFurniture) && C17542s.e(this.name, smartaPlacementRequest.name) && C17542s.e(this.sceneId, smartaPlacementRequest.sceneId) && this.isShared == smartaPlacementRequest.isShared && C17542s.e(this.savedProperties, smartaPlacementRequest.savedProperties) && C17542s.e(this.localProductIdToPlace, smartaPlacementRequest.localProductIdToPlace) && C17542s.e(this.localItemNumberToPlace, smartaPlacementRequest.localItemNumberToPlace) && C17542s.e(this.productIdMode, smartaPlacementRequest.productIdMode);
    }

    public final String getLocalItemNumberToPlace() {
        return this.localItemNumberToPlace;
    }

    public final Integer getLocalProductIdToPlace() {
        return this.localProductIdToPlace;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PlacedFurniture> getPlacedFurniture() {
        return this.placedFurniture;
    }

    public final String getProductIdMode() {
        return this.productIdMode;
    }

    public final CompositionSavedProperties getSavedProperties() {
        return this.savedProperties;
    }

    public final UUID getSceneId() {
        return this.sceneId;
    }

    public int hashCode() {
        int hashCode = this.placedFurniture.hashCode() * 31;
        String str = this.name;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UUID uuid = this.sceneId;
        int hashCode3 = (((hashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31) + Boolean.hashCode(this.isShared)) * 31;
        CompositionSavedProperties compositionSavedProperties = this.savedProperties;
        int hashCode4 = (hashCode3 + (compositionSavedProperties == null ? 0 : compositionSavedProperties.hashCode())) * 31;
        Integer num = this.localProductIdToPlace;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.localItemNumberToPlace;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode5 + i10) * 31) + this.productIdMode.hashCode();
    }

    public final boolean isShared() {
        return this.isShared;
    }

    public String toString() {
        List<PlacedFurniture> list = this.placedFurniture;
        String str = this.name;
        UUID uuid = this.sceneId;
        boolean z10 = this.isShared;
        CompositionSavedProperties compositionSavedProperties = this.savedProperties;
        Integer num = this.localProductIdToPlace;
        String str2 = this.localItemNumberToPlace;
        String str3 = this.productIdMode;
        return "SmartaPlacementRequest(placedFurniture=" + list + ", name=" + str + ", sceneId=" + uuid + ", isShared=" + z10 + ", savedProperties=" + compositionSavedProperties + ", localProductIdToPlace=" + num + ", localItemNumberToPlace=" + str2 + ", productIdMode=" + str3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SmartaPlacementRequest(List list, String str, UUID uuid, boolean z10, CompositionSavedProperties compositionSavedProperties, Integer num, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, uuid, z10, compositionSavedProperties, (i10 & 32) != 0 ? null : num, str2, str3);
    }
}
