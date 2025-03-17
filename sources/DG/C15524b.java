package DG;

import EG.C15589b;
import FG.k;
import FG.p;
import TJ.C16505B;
import android.net.Uri;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.network.models.CatalogItemVariants;
import com.sugarcube.core.network.models.ProductBuyingOption;
import com.sugarcube.core.network.models.StockLevel;
import com.sugarcube.core.network.models.VariantCategory;
import fI.C17221b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lF.C14768a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\b\b\u0018\u0000 H2\u00020\u0001:\u0002&#B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u0006\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b0\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b+\u0010\u001dR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b/\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010$\u001a\u0004\b5\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u00106\u001a\u0004\b1\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b4\u0010>R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b&\u0010AR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b#\u0010DR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b(\u0010G¨\u0006I"}, d2 = {"LDG/b;", "", "", "country", "language", "", "isLoading", "isFavorited", "itemName", "itemDescription", "", "Landroid/net/Uri;", "itemImages", "itemSize", "LlF/a;", "price", "", "warningMessage", "LFG/k;", "variantState", "LEG/b$c;", "deliveryStock", "LEG/b$b;", "clickCollectStock", "LEG/b$d;", "inStoreStock", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;LlF/a;Ljava/lang/Integer;LFG/k;LEG/b$c;LEG/b$b;LEG/b$d;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCountry", "b", "getLanguage", "c", "Z", "()Z", "d", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "e", "f", "g", "Ljava/util/List;", "()Ljava/util/List;", "h", "getItemSize", "LlF/a;", "()LlF/a;", "j", "Ljava/lang/Integer;", "getWarningMessage", "()Ljava/lang/Integer;", "k", "LFG/k;", "()LFG/k;", "l", "LEG/b$c;", "()LEG/b$c;", "m", "LEG/b$b;", "()LEG/b$b;", "n", "LEG/b$d;", "()LEG/b$d;", "o", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: DG.b  reason: case insensitive filesystem */
public final class C15524b {

    /* renamed from: o  reason: collision with root package name */
    public static final a f133674o = new a((DefaultConstructorMarker) null);

    /* renamed from: p  reason: collision with root package name */
    public static final int f133675p = 8;

    /* renamed from: a  reason: collision with root package name */
    private final String f133676a;

    /* renamed from: b  reason: collision with root package name */
    private final String f133677b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f133678c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f133679d;

    /* renamed from: e  reason: collision with root package name */
    private final String f133680e;

    /* renamed from: f  reason: collision with root package name */
    private final String f133681f;

    /* renamed from: g  reason: collision with root package name */
    private final List<Uri> f133682g;

    /* renamed from: h  reason: collision with root package name */
    private final String f133683h;

    /* renamed from: i  reason: collision with root package name */
    private final C14768a f133684i;

    /* renamed from: j  reason: collision with root package name */
    private final Integer f133685j;

    /* renamed from: k  reason: collision with root package name */
    private final k f133686k;

    /* renamed from: l  reason: collision with root package name */
    private final C15589b.c f133687l;

    /* renamed from: m  reason: collision with root package name */
    private final C15589b.C3298b f133688m;

    /* renamed from: n  reason: collision with root package name */
    private final C15589b.d f133689n;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0012\u001a\u00020\u0011*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LDG/b$a;", "", "<init>", "()V", "LTJ/B;", "LDG/b;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "Lcom/sugarcube/core/network/models/CatalogItemVariants;", "variants", "", "postalCode", "location", "country", "language", "", "isFavorited", "LXH/N;", "a", "(LTJ/B;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/core/network/models/CatalogItemVariants;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: DG.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(C16505B<C15524b> b10, CachedCatalogItem cachedCatalogItem, CatalogItemVariants catalogItemVariants, String str, String str2, String str3, String str4, Boolean bool) {
            String str5;
            StockLevel stockLevel;
            C16505B<C15524b> b11 = b10;
            CachedCatalogItem cachedCatalogItem2 = cachedCatalogItem;
            String str6 = str2;
            C17542s.j(b11, "<this>");
            C17542s.j(str3, PlaceTypes.COUNTRY);
            C17542s.j(str4, "language");
            if (cachedCatalogItem2 != null && catalogItemVariants != null) {
                List<VariantCategory> categories = catalogItemVariants.getCategories();
                StockLevel stockLevel2 = null;
                k a10 = categories != null ? p.f134368b.a(categories, cachedCatalogItem2) : null;
                String name = cachedCatalogItem.getName();
                String description = cachedCatalogItem.getCatalogItem().getDescription();
                List<Uri> imageUrls = cachedCatalogItem.getCatalogItem().getImageUrls();
                String priceNumeral = cachedCatalogItem.getCatalogItem().getPriceNumeral();
                if (priceNumeral == null) {
                    priceNumeral = "0.00";
                }
                C14768a aVar = new C14768a(priceNumeral, str3, str4, false, true, 8, (DefaultConstructorMarker) null);
                ProductBuyingOption buyingOption = cachedCatalogItem.getCatalogItem().getBuyingOption();
                if (buyingOption != null) {
                    stockLevel = buyingOption.getHomeDeliveryStockLevel();
                    str5 = str;
                } else {
                    str5 = str;
                    stockLevel = null;
                }
                C15589b.c cVar = new C15589b.c(stockLevel, str5);
                ProductBuyingOption buyingOption2 = cachedCatalogItem.getCatalogItem().getBuyingOption();
                if (buyingOption2 != null) {
                    stockLevel2 = buyingOption2.getCashCarryStockLevel();
                }
                b11.setValue(new C15524b(str3, str4, false, bool, name, description, imageUrls, (String) null, aVar, (Integer) null, a10, cVar, new C15589b.C3298b(stockLevel2, str6), new C15589b.d(C17542s.e(cachedCatalogItem.getCatalogItem().getAvailableForHomeDelivery(), Boolean.TRUE) ? StockLevel.IN_STOCK : StockLevel.OUT_OF_STOCK, str6)));
            }
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LDG/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "REVIEWS", "SIZE", "MORE_INFO", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: DG.b$b  reason: collision with other inner class name */
    public enum C3294b {
        REVIEWS,
        SIZE,
        MORE_INFO;

        static {
            C3294b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public C15524b(String str, String str2, boolean z10, Boolean bool, String str3, String str4, List<? extends Uri> list, String str5, C14768a aVar, Integer num, k kVar, C15589b.c cVar, C15589b.C3298b bVar, C15589b.d dVar) {
        C17542s.j(str, PlaceTypes.COUNTRY);
        C17542s.j(str2, "language");
        C17542s.j(str3, "itemName");
        C17542s.j(aVar, "price");
        this.f133676a = str;
        this.f133677b = str2;
        this.f133678c = z10;
        this.f133679d = bool;
        this.f133680e = str3;
        this.f133681f = str4;
        this.f133682g = list;
        this.f133683h = str5;
        this.f133684i = aVar;
        this.f133685j = num;
        this.f133686k = kVar;
        this.f133687l = cVar;
        this.f133688m = bVar;
        this.f133689n = dVar;
    }

    public final C15589b.C3298b a() {
        return this.f133688m;
    }

    public final C15589b.c b() {
        return this.f133687l;
    }

    public final C15589b.d c() {
        return this.f133689n;
    }

    public final String d() {
        return this.f133681f;
    }

    public final List<Uri> e() {
        return this.f133682g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15524b)) {
            return false;
        }
        C15524b bVar = (C15524b) obj;
        return C17542s.e(this.f133676a, bVar.f133676a) && C17542s.e(this.f133677b, bVar.f133677b) && this.f133678c == bVar.f133678c && C17542s.e(this.f133679d, bVar.f133679d) && C17542s.e(this.f133680e, bVar.f133680e) && C17542s.e(this.f133681f, bVar.f133681f) && C17542s.e(this.f133682g, bVar.f133682g) && C17542s.e(this.f133683h, bVar.f133683h) && C17542s.e(this.f133684i, bVar.f133684i) && C17542s.e(this.f133685j, bVar.f133685j) && C17542s.e(this.f133686k, bVar.f133686k) && C17542s.e(this.f133687l, bVar.f133687l) && C17542s.e(this.f133688m, bVar.f133688m) && C17542s.e(this.f133689n, bVar.f133689n);
    }

    public final String f() {
        return this.f133680e;
    }

    public final C14768a g() {
        return this.f133684i;
    }

    public final k h() {
        return this.f133686k;
    }

    public int hashCode() {
        int hashCode = ((((this.f133676a.hashCode() * 31) + this.f133677b.hashCode()) * 31) + Boolean.hashCode(this.f133678c)) * 31;
        Boolean bool = this.f133679d;
        int i10 = 0;
        int hashCode2 = (((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.f133680e.hashCode()) * 31;
        String str = this.f133681f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Uri> list = this.f133682g;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f133683h;
        int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f133684i.hashCode()) * 31;
        Integer num = this.f133685j;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        k kVar = this.f133686k;
        int hashCode7 = (hashCode6 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        C15589b.c cVar = this.f133687l;
        int hashCode8 = (hashCode7 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C15589b.C3298b bVar = this.f133688m;
        int hashCode9 = (hashCode8 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C15589b.d dVar = this.f133689n;
        if (dVar != null) {
            i10 = dVar.hashCode();
        }
        return hashCode9 + i10;
    }

    public final Boolean i() {
        return this.f133679d;
    }

    public String toString() {
        String str = this.f133676a;
        String str2 = this.f133677b;
        boolean z10 = this.f133678c;
        Boolean bool = this.f133679d;
        String str3 = this.f133680e;
        String str4 = this.f133681f;
        List<Uri> list = this.f133682g;
        String str5 = this.f133683h;
        C14768a aVar = this.f133684i;
        Integer num = this.f133685j;
        k kVar = this.f133686k;
        C15589b.c cVar = this.f133687l;
        C15589b.C3298b bVar = this.f133688m;
        C15589b.d dVar = this.f133689n;
        return "ProductInfoDrawerContentUIState(country=" + str + ", language=" + str2 + ", isLoading=" + z10 + ", isFavorited=" + bool + ", itemName=" + str3 + ", itemDescription=" + str4 + ", itemImages=" + list + ", itemSize=" + str5 + ", price=" + aVar + ", warningMessage=" + num + ", variantState=" + kVar + ", deliveryStock=" + cVar + ", clickCollectStock=" + bVar + ", inStoreStock=" + dVar + ")";
    }
}
