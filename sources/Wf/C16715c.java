package WF;

import android.net.Uri;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.core.network.models.ProductBuyingOption;
import com.sugarcube.core.network.models.StockLevel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lF.C14768a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 (2\u00020\u0001:\u0001\u0019BS\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u001d\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u0019\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"LWF/c;", "", "", "Landroid/net/Uri;", "images", "", "name", "description", "LlF/a;", "price", "Lcom/sugarcube/core/network/models/StockLevel;", "deliveryStock", "clickCollectStock", "inStoreStock", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LlF/a;Lcom/sugarcube/core/network/models/StockLevel;Lcom/sugarcube/core/network/models/StockLevel;Lcom/sugarcube/core/network/models/StockLevel;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Ljava/lang/String;", "e", "c", "LlF/a;", "f", "()LlF/a;", "Lcom/sugarcube/core/network/models/StockLevel;", "()Lcom/sugarcube/core/network/models/StockLevel;", "g", "getInStoreStock", "h", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WF.c  reason: case insensitive filesystem */
public final class C16715c {

    /* renamed from: h  reason: collision with root package name */
    public static final a f139439h = new a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f139440i = 8;

    /* renamed from: a  reason: collision with root package name */
    private final List<Uri> f139441a;

    /* renamed from: b  reason: collision with root package name */
    private final String f139442b;

    /* renamed from: c  reason: collision with root package name */
    private final String f139443c;

    /* renamed from: d  reason: collision with root package name */
    private final C14768a f139444d;

    /* renamed from: e  reason: collision with root package name */
    private final StockLevel f139445e;

    /* renamed from: f  reason: collision with root package name */
    private final StockLevel f139446f;

    /* renamed from: g  reason: collision with root package name */
    private final StockLevel f139447g;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LWF/c$a;", "", "<init>", "()V", "Lcom/sugarcube/core/network/models/CatalogItem;", "catalogItem", "", "country", "language", "LWF/c;", "a", "(Lcom/sugarcube/core/network/models/CatalogItem;Ljava/lang/String;Ljava/lang/String;)LWF/c;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WF.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16715c a(CatalogItem catalogItem, String str, String str2) {
            C17542s.j(catalogItem, "catalogItem");
            C17542s.j(str, PlaceTypes.COUNTRY);
            C17542s.j(str2, "language");
            String priceNumeral = catalogItem.getPriceNumeral();
            StockLevel stockLevel = null;
            if (priceNumeral == null) {
                return null;
            }
            List<Uri> imageUrls = catalogItem.getImageUrls();
            String name = catalogItem.getName();
            String description = catalogItem.getDescription();
            C14768a aVar = new C14768a(priceNumeral, str, str2, false, false, 24, (DefaultConstructorMarker) null);
            ProductBuyingOption buyingOption = catalogItem.getBuyingOption();
            StockLevel homeDeliveryStockLevel = buyingOption != null ? buyingOption.getHomeDeliveryStockLevel() : null;
            ProductBuyingOption buyingOption2 = catalogItem.getBuyingOption();
            if (buyingOption2 != null) {
                stockLevel = buyingOption2.getCashCarryStockLevel();
            }
            return new C16715c(imageUrls, name, description, aVar, homeDeliveryStockLevel, stockLevel, C17542s.e(catalogItem.getAvailableForHomeDelivery(), Boolean.TRUE) ? StockLevel.IN_STOCK : StockLevel.OUT_OF_STOCK);
        }

        private a() {
        }
    }

    public C16715c(List<? extends Uri> list, String str, String str2, C14768a aVar, StockLevel stockLevel, StockLevel stockLevel2, StockLevel stockLevel3) {
        this.f139441a = list;
        this.f139442b = str;
        this.f139443c = str2;
        this.f139444d = aVar;
        this.f139445e = stockLevel;
        this.f139446f = stockLevel2;
        this.f139447g = stockLevel3;
    }

    public final StockLevel a() {
        return this.f139446f;
    }

    public final StockLevel b() {
        return this.f139445e;
    }

    public final String c() {
        return this.f139443c;
    }

    public final List<Uri> d() {
        return this.f139441a;
    }

    public final String e() {
        return this.f139442b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16715c)) {
            return false;
        }
        C16715c cVar = (C16715c) obj;
        return C17542s.e(this.f139441a, cVar.f139441a) && C17542s.e(this.f139442b, cVar.f139442b) && C17542s.e(this.f139443c, cVar.f139443c) && C17542s.e(this.f139444d, cVar.f139444d) && this.f139445e == cVar.f139445e && this.f139446f == cVar.f139446f && this.f139447g == cVar.f139447g;
    }

    public final C14768a f() {
        return this.f139444d;
    }

    public int hashCode() {
        List<Uri> list = this.f139441a;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f139442b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f139443c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C14768a aVar = this.f139444d;
        int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        StockLevel stockLevel = this.f139445e;
        int hashCode5 = (hashCode4 + (stockLevel == null ? 0 : stockLevel.hashCode())) * 31;
        StockLevel stockLevel2 = this.f139446f;
        int hashCode6 = (hashCode5 + (stockLevel2 == null ? 0 : stockLevel2.hashCode())) * 31;
        StockLevel stockLevel3 = this.f139447g;
        if (stockLevel3 != null) {
            i10 = stockLevel3.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        List<Uri> list = this.f139441a;
        String str = this.f139442b;
        String str2 = this.f139443c;
        C14768a aVar = this.f139444d;
        StockLevel stockLevel = this.f139445e;
        StockLevel stockLevel2 = this.f139446f;
        StockLevel stockLevel3 = this.f139447g;
        return "ProductInformation(images=" + list + ", name=" + str + ", description=" + str2 + ", price=" + aVar + ", deliveryStock=" + stockLevel + ", clickCollectStock=" + stockLevel2 + ", inStoreStock=" + stockLevel3 + ")";
    }
}
