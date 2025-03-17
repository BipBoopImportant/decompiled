package com.ikea.kompassmap.model.store;

import com.ikea.kompassmap.model.store.map.Platform;
import com.ikea.kompassmap.model.store.map.StoreMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006HÆ\u0003Ja\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006HÇ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010'\u001a\u00020(H×\u0001J\t\u0010)\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006*"}, d2 = {"Lcom/ikea/kompassmap/model/store/StoreData;", "", "id", "", "storeNo", "platforms", "", "Lcom/ikea/kompassmap/model/store/map/Platform;", "displayName", "map", "Lcom/ikea/kompassmap/model/store/map/StoreMap;", "mapMetadata", "Lcom/ikea/kompassmap/model/store/MapMetadata;", "frequentlyAskedPointsOfInterest", "Lcom/ikea/kompassmap/model/store/FrequentlyAskedPointsOfInterest;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/ikea/kompassmap/model/store/map/StoreMap;Lcom/ikea/kompassmap/model/store/MapMetadata;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getStoreNo", "getPlatforms", "()Ljava/util/List;", "getDisplayName", "getMap", "()Lcom/ikea/kompassmap/model/store/map/StoreMap;", "getMapMetadata", "()Lcom/ikea/kompassmap/model/store/MapMetadata;", "getFrequentlyAskedPointsOfInterest", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StoreData {
    public static final int $stable = 8;
    private final String displayName;
    private final List<FrequentlyAskedPointsOfInterest> frequentlyAskedPointsOfInterest;

    /* renamed from: id  reason: collision with root package name */
    private final String f69450id;
    private final StoreMap map;
    private final MapMetadata mapMetadata;
    private final List<Platform> platforms;
    private final String storeNo;

    public StoreData(String str, String str2, List<Platform> list, String str3, StoreMap storeMap, MapMetadata mapMetadata2, List<FrequentlyAskedPointsOfInterest> list2) {
        C17542s.j(str, "id");
        C17542s.j(str2, "storeNo");
        C17542s.j(list, "platforms");
        C17542s.j(str3, "displayName");
        this.f69450id = str;
        this.storeNo = str2;
        this.platforms = list;
        this.displayName = str3;
        this.map = storeMap;
        this.mapMetadata = mapMetadata2;
        this.frequentlyAskedPointsOfInterest = list2;
    }

    public static /* synthetic */ StoreData copy$default(StoreData storeData, String str, String str2, List<Platform> list, String str3, StoreMap storeMap, MapMetadata mapMetadata2, List<FrequentlyAskedPointsOfInterest> list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = storeData.f69450id;
        }
        if ((i10 & 2) != 0) {
            str2 = storeData.storeNo;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            list = storeData.platforms;
        }
        List<Platform> list3 = list;
        if ((i10 & 8) != 0) {
            str3 = storeData.displayName;
        }
        String str5 = str3;
        if ((i10 & 16) != 0) {
            storeMap = storeData.map;
        }
        StoreMap storeMap2 = storeMap;
        if ((i10 & 32) != 0) {
            mapMetadata2 = storeData.mapMetadata;
        }
        MapMetadata mapMetadata3 = mapMetadata2;
        if ((i10 & 64) != 0) {
            list2 = storeData.frequentlyAskedPointsOfInterest;
        }
        return storeData.copy(str, str4, list3, str5, storeMap2, mapMetadata3, list2);
    }

    public final String component1() {
        return this.f69450id;
    }

    public final String component2() {
        return this.storeNo;
    }

    public final List<Platform> component3() {
        return this.platforms;
    }

    public final String component4() {
        return this.displayName;
    }

    public final StoreMap component5() {
        return this.map;
    }

    public final MapMetadata component6() {
        return this.mapMetadata;
    }

    public final List<FrequentlyAskedPointsOfInterest> component7() {
        return this.frequentlyAskedPointsOfInterest;
    }

    public final StoreData copy(String str, String str2, List<Platform> list, String str3, StoreMap storeMap, MapMetadata mapMetadata2, List<FrequentlyAskedPointsOfInterest> list2) {
        C17542s.j(str, "id");
        C17542s.j(str2, "storeNo");
        C17542s.j(list, "platforms");
        C17542s.j(str3, "displayName");
        return new StoreData(str, str2, list, str3, storeMap, mapMetadata2, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreData)) {
            return false;
        }
        StoreData storeData = (StoreData) obj;
        return C17542s.e(this.f69450id, storeData.f69450id) && C17542s.e(this.storeNo, storeData.storeNo) && C17542s.e(this.platforms, storeData.platforms) && C17542s.e(this.displayName, storeData.displayName) && C17542s.e(this.map, storeData.map) && C17542s.e(this.mapMetadata, storeData.mapMetadata) && C17542s.e(this.frequentlyAskedPointsOfInterest, storeData.frequentlyAskedPointsOfInterest);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<FrequentlyAskedPointsOfInterest> getFrequentlyAskedPointsOfInterest() {
        return this.frequentlyAskedPointsOfInterest;
    }

    public final String getId() {
        return this.f69450id;
    }

    public final StoreMap getMap() {
        return this.map;
    }

    public final MapMetadata getMapMetadata() {
        return this.mapMetadata;
    }

    public final List<Platform> getPlatforms() {
        return this.platforms;
    }

    public final String getStoreNo() {
        return this.storeNo;
    }

    public int hashCode() {
        int hashCode = ((((((this.f69450id.hashCode() * 31) + this.storeNo.hashCode()) * 31) + this.platforms.hashCode()) * 31) + this.displayName.hashCode()) * 31;
        StoreMap storeMap = this.map;
        int i10 = 0;
        int hashCode2 = (hashCode + (storeMap == null ? 0 : storeMap.hashCode())) * 31;
        MapMetadata mapMetadata2 = this.mapMetadata;
        int hashCode3 = (hashCode2 + (mapMetadata2 == null ? 0 : mapMetadata2.hashCode())) * 31;
        List<FrequentlyAskedPointsOfInterest> list = this.frequentlyAskedPointsOfInterest;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "StoreData(id=" + this.f69450id + ", storeNo=" + this.storeNo + ", platforms=" + this.platforms + ", displayName=" + this.displayName + ", map=" + this.map + ", mapMetadata=" + this.mapMetadata + ", frequentlyAskedPointsOfInterest=" + this.frequentlyAskedPointsOfInterest + ')';
    }
}
