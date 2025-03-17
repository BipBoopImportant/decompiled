package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012.\b\u0002\u0010\u0004\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005j\u0002`\b\u0018\u00010\u0005j\u0004\u0018\u0001`\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ/\u0010\u0012\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005j\u0002`\b\u0018\u00010\u0005j\u0004\u0018\u0001`\tHÆ\u0003JJ\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032.\b\u0002\u0010\u0004\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005j\u0002`\b\u0018\u00010\u0005j\u0004\u0018\u0001`\tHÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR7\u0010\u0004\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005j\u0002`\b\u0018\u00010\u0005j\u0004\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/sugarcube/core/network/models/SalesDressedBedDataResponse;", "", "id", "", "data", "", "", "Lcom/sugarcube/core/network/models/CatalogItem;", "Lcom/sugarcube/core/network/models/CombinableMap;", "Lcom/sugarcube/core/network/models/SalesDressedBedData;", "<init>", "(Ljava/lang/Integer;Ljava/util/Map;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getData", "()Ljava/util/Map;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/Map;)Lcom/sugarcube/core/network/models/SalesDressedBedDataResponse;", "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class SalesDressedBedDataResponse {
    private final Map<String, Map<String, CatalogItem>> data;

    /* renamed from: id  reason: collision with root package name */
    private final Integer f126084id;

    public SalesDressedBedDataResponse() {
        this((Integer) null, (Map) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SalesDressedBedDataResponse copy$default(SalesDressedBedDataResponse salesDressedBedDataResponse, Integer num, Map<String, Map<String, CatalogItem>> map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = salesDressedBedDataResponse.f126084id;
        }
        if ((i10 & 2) != 0) {
            map = salesDressedBedDataResponse.data;
        }
        return salesDressedBedDataResponse.copy(num, map);
    }

    public final Integer component1() {
        return this.f126084id;
    }

    public final Map<String, Map<String, CatalogItem>> component2() {
        return this.data;
    }

    public final SalesDressedBedDataResponse copy(Integer num, Map<String, ? extends Map<String, CatalogItem>> map) {
        return new SalesDressedBedDataResponse(num, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SalesDressedBedDataResponse)) {
            return false;
        }
        SalesDressedBedDataResponse salesDressedBedDataResponse = (SalesDressedBedDataResponse) obj;
        return C17542s.e(this.f126084id, salesDressedBedDataResponse.f126084id) && C17542s.e(this.data, salesDressedBedDataResponse.data);
    }

    public final Map<String, Map<String, CatalogItem>> getData() {
        return this.data;
    }

    public final Integer getId() {
        return this.f126084id;
    }

    public int hashCode() {
        Integer num = this.f126084id;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Map<String, Map<String, CatalogItem>> map = this.data;
        if (map != null) {
            i10 = map.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        Integer num = this.f126084id;
        Map<String, Map<String, CatalogItem>> map = this.data;
        return "SalesDressedBedDataResponse(id=" + num + ", data=" + map + ")";
    }

    public SalesDressedBedDataResponse(Integer num, Map<String, ? extends Map<String, CatalogItem>> map) {
        this.f126084id = num;
        this.data = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SalesDressedBedDataResponse(Integer num, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? null : map);
    }
}
