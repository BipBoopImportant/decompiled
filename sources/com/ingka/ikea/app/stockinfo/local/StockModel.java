package com.ingka.ikea.app.stockinfo.local;

import Wk.f;
import YH.C16877v;
import androidx.annotation.Keep;
import com.ingka.ikea.app.stockinfo.local.b;
import com.ingka.ikea.app.stockinfo.network.c;
import com.ingka.ikea.app.stockinfo.network.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import vf.C10307a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ`\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010\u001d¨\u00063"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/local/StockModel;", "", "", "storeId", "itemNo", "itemType", "productLocation", "Lcom/ingka/ikea/app/stockinfo/network/c;", "salePoint", "Lcom/ingka/ikea/app/stockinfo/local/Status;", "status", "", "Lcom/ingka/ikea/app/stockinfo/local/Location;", "locations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/stockinfo/network/c;Lcom/ingka/ikea/app/stockinfo/local/Status;Ljava/util/List;)V", "Lcom/ingka/ikea/app/stockinfo/local/a;", "convertToStockHolder", "()Lcom/ingka/ikea/app/stockinfo/local/a;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/ingka/ikea/app/stockinfo/network/c;", "component6", "()Lcom/ingka/ikea/app/stockinfo/local/Status;", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/stockinfo/network/c;Lcom/ingka/ikea/app/stockinfo/local/Status;Ljava/util/List;)Lcom/ingka/ikea/app/stockinfo/local/StockModel;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStoreId", "getItemNo", "getItemType", "getProductLocation", "Lcom/ingka/ikea/app/stockinfo/network/c;", "getSalePoint", "Lcom/ingka/ikea/app/stockinfo/local/Status;", "getStatus", "Ljava/util/List;", "getLocations", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Keep
public final class StockModel {
    private final String itemNo;
    private final String itemType;
    private final List<Location> locations;
    private final String productLocation;
    private final c salePoint;
    private final Status status;
    private final String storeId;

    public StockModel(String str, String str2, String str3, String str4, c cVar, Status status2, List<Location> list) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "itemNo");
        C17542s.j(str3, "itemType");
        C17542s.j(status2, "status");
        C17542s.j(list, "locations");
        this.storeId = str;
        this.itemNo = str2;
        this.itemType = str3;
        this.productLocation = str4;
        this.salePoint = cVar;
        this.status = status2;
        this.locations = list;
    }

    public static /* synthetic */ StockModel copy$default(StockModel stockModel, String str, String str2, String str3, String str4, c cVar, Status status2, List<Location> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stockModel.storeId;
        }
        if ((i10 & 2) != 0) {
            str2 = stockModel.itemNo;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = stockModel.itemType;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = stockModel.productLocation;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            cVar = stockModel.salePoint;
        }
        c cVar2 = cVar;
        if ((i10 & 32) != 0) {
            status2 = stockModel.status;
        }
        Status status3 = status2;
        if ((i10 & 64) != 0) {
            list = stockModel.locations;
        }
        return stockModel.copy(str, str5, str6, str7, cVar2, status3, list);
    }

    public final String component1() {
        return this.storeId;
    }

    public final String component2() {
        return this.itemNo;
    }

    public final String component3() {
        return this.itemType;
    }

    public final String component4() {
        return this.productLocation;
    }

    public final c component5() {
        return this.salePoint;
    }

    public final Status component6() {
        return this.status;
    }

    public final List<Location> component7() {
        return this.locations;
    }

    public final a convertToStockHolder() {
        Object obj;
        Item item;
        b.c cVar;
        b.a aVar;
        Object obj2;
        StockModel stockModel = this;
        c cVar2 = stockModel.salePoint;
        if (cVar2 == null) {
            cVar2 = c.OTHER;
        }
        c cVar3 = cVar2;
        Iterable<Location> iterable = stockModel.locations;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (Location items : iterable) {
            arrayList.add(items.getItems());
        }
        Iterator it = C16877v.A(arrayList).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(stockModel.itemNo, ((Item) obj).getItemNo())) {
                break;
            }
        }
        Item item2 = (Item) obj;
        if (item2 == null) {
            f fVar = r2;
            f fVar2 = new f(System.currentTimeMillis(), stockModel.storeId, stockModel.itemNo, stockModel.itemType, stockModel.productLocation, stockModel.status.getCode(), stockModel.status.getStockText(), stockModel.status.getLabel(), (String) null, (String) null, (String) null, (String) null, (String) null, cVar3, stockModel.status.getQuantityHtmlText(), stockModel.status.getTimestampText());
            item = item2;
            cVar = new b.c(fVar);
        } else {
            Iterator it2 = stockModel.locations.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((Location) obj2).getItems().contains(item2)) {
                    break;
                }
            }
            Location location = (Location) obj2;
            String heading = location != null ? location.getHeading() : null;
            long currentTimeMillis = System.currentTimeMillis();
            String str = stockModel.storeId;
            String str2 = stockModel.itemNo;
            String str3 = stockModel.itemType;
            String str4 = stockModel.productLocation;
            d code = stockModel.status.getCode();
            String stockText = stockModel.status.getStockText();
            String label = stockModel.status.getLabel();
            String title = item2.getTitle();
            String description = item2.getDescription();
            ShelfOrRack shelfOrRack = item2.getShelfOrRack();
            String aisle = shelfOrRack != null ? shelfOrRack.getAisle() : null;
            ShelfOrRack shelfOrRack2 = item2.getShelfOrRack();
            item = item2;
            f fVar3 = r2;
            f fVar4 = new f(currentTimeMillis, str, str2, str3, str4, code, stockText, label, heading, title, description, aisle, shelfOrRack2 != null ? shelfOrRack2.getBin() : null, cVar3, stockModel.status.getQuantityHtmlText(), stockModel.status.getTimestampText());
            cVar = new b.c(fVar3);
            stockModel = this;
        }
        Iterable<Location> iterable2 = stockModel.locations;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
        for (Location location2 : iterable2) {
            String heading2 = location2.getHeading();
            ArrayList arrayList3 = new ArrayList();
            for (Item item3 : location2.getItems()) {
                if (C17542s.e(item != null ? item.getItemNo() : null, item3.getItemNo())) {
                    aVar = null;
                } else {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    String str5 = stockModel.storeId;
                    String itemNo2 = item3.getItemNo();
                    String itemType2 = item3.getItemType();
                    if (itemType2 == null) {
                        itemType2 = C10307a.ART.b();
                    }
                    String str6 = itemType2;
                    String itemLocation = item3.getItemLocation();
                    String title2 = item3.getTitle();
                    String description2 = item3.getDescription();
                    ShelfOrRack shelfOrRack3 = item3.getShelfOrRack();
                    String aisle2 = shelfOrRack3 != null ? shelfOrRack3.getAisle() : null;
                    ShelfOrRack shelfOrRack4 = item3.getShelfOrRack();
                    aVar = new b.a(currentTimeMillis2, str5, itemNo2, str6, itemLocation, heading2, title2, description2, aisle2, shelfOrRack4 != null ? shelfOrRack4.getBin() : null);
                }
                if (aVar != null) {
                    arrayList3.add(aVar);
                }
            }
            arrayList2.add(arrayList3);
        }
        return new a(cVar, C16877v.A(arrayList2));
    }

    public final StockModel copy(String str, String str2, String str3, String str4, c cVar, Status status2, List<Location> list) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "itemNo");
        C17542s.j(str3, "itemType");
        C17542s.j(status2, "status");
        List<Location> list2 = list;
        C17542s.j(list2, "locations");
        return new StockModel(str, str2, str3, str4, cVar, status2, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockModel)) {
            return false;
        }
        StockModel stockModel = (StockModel) obj;
        return C17542s.e(this.storeId, stockModel.storeId) && C17542s.e(this.itemNo, stockModel.itemNo) && C17542s.e(this.itemType, stockModel.itemType) && C17542s.e(this.productLocation, stockModel.productLocation) && this.salePoint == stockModel.salePoint && C17542s.e(this.status, stockModel.status) && C17542s.e(this.locations, stockModel.locations);
    }

    public final String getItemNo() {
        return this.itemNo;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final List<Location> getLocations() {
        return this.locations;
    }

    public final String getProductLocation() {
        return this.productLocation;
    }

    public final c getSalePoint() {
        return this.salePoint;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getStoreId() {
        return this.storeId;
    }

    public int hashCode() {
        int hashCode = ((((this.storeId.hashCode() * 31) + this.itemNo.hashCode()) * 31) + this.itemType.hashCode()) * 31;
        String str = this.productLocation;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.salePoint;
        if (cVar != null) {
            i10 = cVar.hashCode();
        }
        return ((((hashCode2 + i10) * 31) + this.status.hashCode()) * 31) + this.locations.hashCode();
    }

    public String toString() {
        String str = this.storeId;
        String str2 = this.itemNo;
        String str3 = this.itemType;
        String str4 = this.productLocation;
        c cVar = this.salePoint;
        Status status2 = this.status;
        List<Location> list = this.locations;
        return "StockModel(storeId=" + str + ", itemNo=" + str2 + ", itemType=" + str3 + ", productLocation=" + str4 + ", salePoint=" + cVar + ", status=" + status2 + ", locations=" + list + ")";
    }
}
