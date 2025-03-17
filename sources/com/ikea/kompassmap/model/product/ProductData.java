package com.ikea.kompassmap.model.product;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import org.maplibre.geojson.Feature;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003J]\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÇ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00100\u001a\u000201H×\u0001J\t\u00102\u001a\u00020\u000fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lcom/ikea/kompassmap/model/product/ProductData;", "", "classUnitKey", "Lcom/ikea/kompassmap/model/product/ClassUnitKey;", "itemKey", "Lcom/ikea/kompassmap/model/product/ItemKey;", "locations", "Lcom/ikea/kompassmap/model/product/Locations;", "communications", "Lcom/ikea/kompassmap/model/product/Communications;", "salesPrices", "Lcom/ikea/kompassmap/model/product/SalesPrices;", "availabilities", "Lcom/ikea/kompassmap/model/product/Availabilities;", "floor", "", "grid", "Lorg/maplibre/geojson/Feature;", "<init>", "(Lcom/ikea/kompassmap/model/product/ClassUnitKey;Lcom/ikea/kompassmap/model/product/ItemKey;Lcom/ikea/kompassmap/model/product/Locations;Lcom/ikea/kompassmap/model/product/Communications;Lcom/ikea/kompassmap/model/product/SalesPrices;Lcom/ikea/kompassmap/model/product/Availabilities;Ljava/lang/String;Lorg/maplibre/geojson/Feature;)V", "getClassUnitKey", "()Lcom/ikea/kompassmap/model/product/ClassUnitKey;", "getItemKey", "()Lcom/ikea/kompassmap/model/product/ItemKey;", "getLocations", "()Lcom/ikea/kompassmap/model/product/Locations;", "getCommunications", "()Lcom/ikea/kompassmap/model/product/Communications;", "getSalesPrices", "()Lcom/ikea/kompassmap/model/product/SalesPrices;", "getAvailabilities", "()Lcom/ikea/kompassmap/model/product/Availabilities;", "getFloor", "()Ljava/lang/String;", "getGrid", "()Lorg/maplibre/geojson/Feature;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductData {
    public static final int $stable = 8;
    private final Availabilities availabilities;
    private final ClassUnitKey classUnitKey;
    private final Communications communications;
    private final String floor;
    private final Feature grid;
    private final ItemKey itemKey;
    private final Locations locations;
    private final SalesPrices salesPrices;

    public ProductData(ClassUnitKey classUnitKey2, ItemKey itemKey2, Locations locations2, Communications communications2, SalesPrices salesPrices2, Availabilities availabilities2, String str, Feature feature) {
        C17542s.j(classUnitKey2, "classUnitKey");
        C17542s.j(itemKey2, "itemKey");
        C17542s.j(locations2, "locations");
        C17542s.j(communications2, "communications");
        C17542s.j(salesPrices2, "salesPrices");
        C17542s.j(availabilities2, "availabilities");
        this.classUnitKey = classUnitKey2;
        this.itemKey = itemKey2;
        this.locations = locations2;
        this.communications = communications2;
        this.salesPrices = salesPrices2;
        this.availabilities = availabilities2;
        this.floor = str;
        this.grid = feature;
    }

    public static /* synthetic */ ProductData copy$default(ProductData productData, ClassUnitKey classUnitKey2, ItemKey itemKey2, Locations locations2, Communications communications2, SalesPrices salesPrices2, Availabilities availabilities2, String str, Feature feature, int i10, Object obj) {
        ProductData productData2 = productData;
        int i11 = i10;
        return productData.copy((i11 & 1) != 0 ? productData2.classUnitKey : classUnitKey2, (i11 & 2) != 0 ? productData2.itemKey : itemKey2, (i11 & 4) != 0 ? productData2.locations : locations2, (i11 & 8) != 0 ? productData2.communications : communications2, (i11 & 16) != 0 ? productData2.salesPrices : salesPrices2, (i11 & 32) != 0 ? productData2.availabilities : availabilities2, (i11 & 64) != 0 ? productData2.floor : str, (i11 & 128) != 0 ? productData2.grid : feature);
    }

    public final ClassUnitKey component1() {
        return this.classUnitKey;
    }

    public final ItemKey component2() {
        return this.itemKey;
    }

    public final Locations component3() {
        return this.locations;
    }

    public final Communications component4() {
        return this.communications;
    }

    public final SalesPrices component5() {
        return this.salesPrices;
    }

    public final Availabilities component6() {
        return this.availabilities;
    }

    public final String component7() {
        return this.floor;
    }

    public final Feature component8() {
        return this.grid;
    }

    public final ProductData copy(ClassUnitKey classUnitKey2, ItemKey itemKey2, Locations locations2, Communications communications2, SalesPrices salesPrices2, Availabilities availabilities2, String str, Feature feature) {
        C17542s.j(classUnitKey2, "classUnitKey");
        C17542s.j(itemKey2, "itemKey");
        C17542s.j(locations2, "locations");
        C17542s.j(communications2, "communications");
        C17542s.j(salesPrices2, "salesPrices");
        Availabilities availabilities3 = availabilities2;
        C17542s.j(availabilities3, "availabilities");
        return new ProductData(classUnitKey2, itemKey2, locations2, communications2, salesPrices2, availabilities3, str, feature);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductData)) {
            return false;
        }
        ProductData productData = (ProductData) obj;
        return C17542s.e(this.classUnitKey, productData.classUnitKey) && C17542s.e(this.itemKey, productData.itemKey) && C17542s.e(this.locations, productData.locations) && C17542s.e(this.communications, productData.communications) && C17542s.e(this.salesPrices, productData.salesPrices) && C17542s.e(this.availabilities, productData.availabilities) && C17542s.e(this.floor, productData.floor) && C17542s.e(this.grid, productData.grid);
    }

    public final Availabilities getAvailabilities() {
        return this.availabilities;
    }

    public final ClassUnitKey getClassUnitKey() {
        return this.classUnitKey;
    }

    public final Communications getCommunications() {
        return this.communications;
    }

    public final String getFloor() {
        return this.floor;
    }

    public final Feature getGrid() {
        return this.grid;
    }

    public final ItemKey getItemKey() {
        return this.itemKey;
    }

    public final Locations getLocations() {
        return this.locations;
    }

    public final SalesPrices getSalesPrices() {
        return this.salesPrices;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.classUnitKey.hashCode() * 31) + this.itemKey.hashCode()) * 31) + this.locations.hashCode()) * 31) + this.communications.hashCode()) * 31) + this.salesPrices.hashCode()) * 31) + this.availabilities.hashCode()) * 31;
        String str = this.floor;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Feature feature = this.grid;
        if (feature != null) {
            i10 = feature.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "ProductData(classUnitKey=" + this.classUnitKey + ", itemKey=" + this.itemKey + ", locations=" + this.locations + ", communications=" + this.communications + ", salesPrices=" + this.salesPrices + ", availabilities=" + this.availabilities + ", floor=" + this.floor + ", grid=" + this.grid + ')';
    }
}
