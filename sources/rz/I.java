package rz;

import com.ingka.ikea.app.base.ProductKey;
import com.ingka.ikea.core.model.product.ProductItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b3\u00104R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b;\u0010D\u001a\u0004\b.\u0010ER\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0006¢\u0006\f\n\u0004\bB\u0010/\u001a\u0004\bF\u00101R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0006¢\u0006\f\n\u0004\bG\u0010/\u001a\u0004\bH\u00101R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b9\u0010JR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bG\u0010MR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010&R\u0017\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bQ\u0010O\u001a\u0004\b5\u0010&R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bF\u0010R\u001a\u0004\bQ\u0010SR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b3\u0010T\u001a\u0004\bK\u0010UR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\b@\u0010XR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b7\u0010Y\u001a\u0004\bV\u0010ZR\u0017\u0010_\u001a\u00020[8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\bN\u0010^¨\u0006`"}, d2 = {"Lrz/I;", "", "", "Lrz/Q;", "backgroundImages", "Lrz/Y;", "stockStatus", "Lrz/V;", "variants", "Lrz/q;", "fullServeReminder", "Lrz/j;", "childItemNotice", "Lrz/s;", "itemAvailability", "Lrz/a;", "addToCartButton", "Lrz/S;", "salesOrders", "pickingList", "Lrz/i;", "childItemInfo", "Lrz/t;", "itemLocation", "", "price", "barcode", "Lrz/U;", "quantityLimits", "Lcom/ingka/ikea/core/model/product/ProductItem;", "productItem", "Lrz/v;", "extras", "Lrz/y;", "type", "<init>", "(Ljava/util/List;Lrz/Y;Lrz/V;Lrz/q;Lrz/j;Lrz/s;Lrz/a;Ljava/util/List;Ljava/util/List;Lrz/i;Lrz/t;Ljava/lang/String;Ljava/lang/String;Lrz/U;Lcom/ingka/ikea/core/model/product/ProductItem;Lrz/v;Lrz/y;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lrz/Y;", "o", "()Lrz/Y;", "c", "Lrz/V;", "q", "()Lrz/V;", "d", "Lrz/q;", "g", "()Lrz/q;", "e", "Lrz/j;", "()Lrz/j;", "f", "Lrz/s;", "h", "()Lrz/s;", "Lrz/a;", "()Lrz/a;", "n", "i", "j", "Lrz/i;", "()Lrz/i;", "k", "Lrz/t;", "()Lrz/t;", "l", "Ljava/lang/String;", "getPrice", "m", "Lrz/U;", "()Lrz/U;", "Lcom/ingka/ikea/core/model/product/ProductItem;", "()Lcom/ingka/ikea/core/model/product/ProductItem;", "p", "Lrz/v;", "()Lrz/v;", "Lrz/y;", "()Lrz/y;", "Lcom/ingka/ikea/app/base/ProductKey;", "r", "Lcom/ingka/ikea/app/base/ProductKey;", "()Lcom/ingka/ikea/app/base/ProductKey;", "productKey", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class I {

    /* renamed from: a  reason: collision with root package name */
    private final List<Q> f130735a;

    /* renamed from: b  reason: collision with root package name */
    private final Y f130736b;

    /* renamed from: c  reason: collision with root package name */
    private final V f130737c;

    /* renamed from: d  reason: collision with root package name */
    private final C15024q f130738d;

    /* renamed from: e  reason: collision with root package name */
    private final C15017j f130739e;

    /* renamed from: f  reason: collision with root package name */
    private final C15025s f130740f;

    /* renamed from: g  reason: collision with root package name */
    private final C15008a f130741g;

    /* renamed from: h  reason: collision with root package name */
    private final List<S> f130742h;

    /* renamed from: i  reason: collision with root package name */
    private final List<S> f130743i;

    /* renamed from: j  reason: collision with root package name */
    private final C15016i f130744j;

    /* renamed from: k  reason: collision with root package name */
    private final C15026t f130745k;

    /* renamed from: l  reason: collision with root package name */
    private final String f130746l;

    /* renamed from: m  reason: collision with root package name */
    private final String f130747m;

    /* renamed from: n  reason: collision with root package name */
    private final U f130748n;

    /* renamed from: o  reason: collision with root package name */
    private final ProductItem f130749o;

    /* renamed from: p  reason: collision with root package name */
    private final C15028v f130750p;

    /* renamed from: q  reason: collision with root package name */
    private final C15031y f130751q;

    /* renamed from: r  reason: collision with root package name */
    private final ProductKey f130752r;

    public I(List<Q> list, Y y10, V v10, C15024q qVar, C15017j jVar, C15025s sVar, C15008a aVar, List<S> list2, List<S> list3, C15016i iVar, C15026t tVar, String str, String str2, U u10, ProductItem productItem, C15028v vVar, C15031y yVar) {
        List<Q> list4 = list;
        Y y11 = y10;
        V v11 = v10;
        C15024q qVar2 = qVar;
        C15017j jVar2 = jVar;
        C15025s sVar2 = sVar;
        C15008a aVar2 = aVar;
        List<S> list5 = list2;
        List<S> list6 = list3;
        C15016i iVar2 = iVar;
        C15026t tVar2 = tVar;
        String str3 = str;
        String str4 = str2;
        U u11 = u10;
        C15028v vVar2 = vVar;
        C17542s.j(list4, "backgroundImages");
        C17542s.j(y11, "stockStatus");
        C17542s.j(v11, "variants");
        C17542s.j(qVar2, "fullServeReminder");
        C17542s.j(jVar2, "childItemNotice");
        C17542s.j(sVar2, "itemAvailability");
        C17542s.j(aVar2, "addToCartButton");
        C17542s.j(list5, "salesOrders");
        C17542s.j(list6, "pickingList");
        C17542s.j(iVar2, "childItemInfo");
        C17542s.j(tVar2, "itemLocation");
        C17542s.j(str3, "price");
        C17542s.j(str4, "barcode");
        C17542s.j(u11, "quantityLimits");
        C17542s.j(productItem, "productItem");
        C17542s.j(vVar, "extras");
        C17542s.j(yVar, "type");
        this.f130735a = list4;
        this.f130736b = y11;
        this.f130737c = v11;
        this.f130738d = qVar2;
        this.f130739e = jVar2;
        this.f130740f = sVar2;
        this.f130741g = aVar2;
        this.f130742h = list5;
        this.f130743i = list6;
        this.f130744j = iVar2;
        this.f130745k = tVar2;
        this.f130746l = str3;
        this.f130747m = str4;
        this.f130748n = u11;
        this.f130749o = productItem;
        this.f130750p = vVar;
        this.f130751q = yVar;
        this.f130752r = new ProductKey(productItem.f(), productItem.g());
    }

    public final C15008a a() {
        return this.f130741g;
    }

    public final List<Q> b() {
        return this.f130735a;
    }

    public final String c() {
        return this.f130747m;
    }

    public final C15016i d() {
        return this.f130744j;
    }

    public final C15017j e() {
        return this.f130739e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return C17542s.e(this.f130735a, i10.f130735a) && C17542s.e(this.f130736b, i10.f130736b) && C17542s.e(this.f130737c, i10.f130737c) && C17542s.e(this.f130738d, i10.f130738d) && C17542s.e(this.f130739e, i10.f130739e) && C17542s.e(this.f130740f, i10.f130740f) && C17542s.e(this.f130741g, i10.f130741g) && C17542s.e(this.f130742h, i10.f130742h) && C17542s.e(this.f130743i, i10.f130743i) && C17542s.e(this.f130744j, i10.f130744j) && C17542s.e(this.f130745k, i10.f130745k) && C17542s.e(this.f130746l, i10.f130746l) && C17542s.e(this.f130747m, i10.f130747m) && C17542s.e(this.f130748n, i10.f130748n) && C17542s.e(this.f130749o, i10.f130749o) && C17542s.e(this.f130750p, i10.f130750p) && this.f130751q == i10.f130751q;
    }

    public final C15028v f() {
        return this.f130750p;
    }

    public final C15024q g() {
        return this.f130738d;
    }

    public final C15025s h() {
        return this.f130740f;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.f130735a.hashCode() * 31) + this.f130736b.hashCode()) * 31) + this.f130737c.hashCode()) * 31) + this.f130738d.hashCode()) * 31) + this.f130739e.hashCode()) * 31) + this.f130740f.hashCode()) * 31) + this.f130741g.hashCode()) * 31) + this.f130742h.hashCode()) * 31) + this.f130743i.hashCode()) * 31) + this.f130744j.hashCode()) * 31) + this.f130745k.hashCode()) * 31) + this.f130746l.hashCode()) * 31) + this.f130747m.hashCode()) * 31) + this.f130748n.hashCode()) * 31) + this.f130749o.hashCode()) * 31) + this.f130750p.hashCode()) * 31) + this.f130751q.hashCode();
    }

    public final C15026t i() {
        return this.f130745k;
    }

    public final List<S> j() {
        return this.f130743i;
    }

    public final ProductItem k() {
        return this.f130749o;
    }

    public final ProductKey l() {
        return this.f130752r;
    }

    public final U m() {
        return this.f130748n;
    }

    public final List<S> n() {
        return this.f130742h;
    }

    public final Y o() {
        return this.f130736b;
    }

    public final C15031y p() {
        return this.f130751q;
    }

    public final V q() {
        return this.f130737c;
    }

    public String toString() {
        List<Q> list = this.f130735a;
        Y y10 = this.f130736b;
        V v10 = this.f130737c;
        C15024q qVar = this.f130738d;
        C15017j jVar = this.f130739e;
        C15025s sVar = this.f130740f;
        C15008a aVar = this.f130741g;
        List<S> list2 = this.f130742h;
        List<S> list3 = this.f130743i;
        C15016i iVar = this.f130744j;
        C15026t tVar = this.f130745k;
        String str = this.f130746l;
        String str2 = this.f130747m;
        U u10 = this.f130748n;
        ProductItem productItem = this.f130749o;
        C15028v vVar = this.f130750p;
        C15031y yVar = this.f130751q;
        return "ScanAndGoProduct(backgroundImages=" + list + ", stockStatus=" + y10 + ", variants=" + v10 + ", fullServeReminder=" + qVar + ", childItemNotice=" + jVar + ", itemAvailability=" + sVar + ", addToCartButton=" + aVar + ", salesOrders=" + list2 + ", pickingList=" + list3 + ", childItemInfo=" + iVar + ", itemLocation=" + tVar + ", price=" + str + ", barcode=" + str2 + ", quantityLimits=" + u10 + ", productItem=" + productItem + ", extras=" + vVar + ", type=" + yVar + ")";
    }
}
