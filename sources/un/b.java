package un;

import com.ingka.ikea.core.model.KeyBenefits;
import com.ingka.ikea.core.model.product.ProductItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11520b;
import kp.l;
import vn.C12196a;
import vn.C12197b;
import vn.d;
import vn.e;
import vn.f;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b#\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\b-\u00106R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b7\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b&\u00108\u001a\u0004\b9\u0010:R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b7\u0010;\u001a\u0004\b1\u0010<R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b9\u0010=\u001a\u0004\b$\u0010>R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010\u001d¨\u0006A"}, d2 = {"Lun/b;", "", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "productList", "Lvn/b;", "facetsList", "", "showAvailabilityBanner", "Lcom/ingka/ikea/core/model/KeyBenefits;", "keyBenefits", "Lvn/f;", "metaInfo", "Lvn/d;", "header", "Lvn/a;", "subCategories", "Lkp/l;", "suggestions", "", "didYouMean", "Lvn/e;", "inspirationFeed", "Lkp/b;", "campaigns", "token", "<init>", "(Ljava/util/List;Ljava/util/List;ZLcom/ingka/ikea/core/model/KeyBenefits;Lvn/f;Lvn/d;Ljava/util/List;Lkp/l;Ljava/util/List;Lvn/e;Lkp/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "h", "()Ljava/util/List;", "b", "c", "Z", "i", "()Z", "d", "Lcom/ingka/ikea/core/model/KeyBenefits;", "f", "()Lcom/ingka/ikea/core/model/KeyBenefits;", "e", "Lvn/f;", "g", "()Lvn/f;", "Lvn/d;", "()Lvn/d;", "j", "Lkp/l;", "k", "()Lkp/l;", "Lvn/e;", "()Lvn/e;", "Lkp/b;", "()Lkp/b;", "l", "Ljava/lang/String;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<ProductItem> f103858a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C12197b> f103859b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f103860c;

    /* renamed from: d  reason: collision with root package name */
    private final KeyBenefits f103861d;

    /* renamed from: e  reason: collision with root package name */
    private final f f103862e;

    /* renamed from: f  reason: collision with root package name */
    private final d f103863f;

    /* renamed from: g  reason: collision with root package name */
    private final List<C12196a> f103864g;

    /* renamed from: h  reason: collision with root package name */
    private final l f103865h;

    /* renamed from: i  reason: collision with root package name */
    private final List<String> f103866i;

    /* renamed from: j  reason: collision with root package name */
    private final e f103867j;

    /* renamed from: k  reason: collision with root package name */
    private final C11520b f103868k;

    /* renamed from: l  reason: collision with root package name */
    private final String f103869l;

    public b(List<ProductItem> list, List<C12197b> list2, boolean z10, KeyBenefits keyBenefits, f fVar, d dVar, List<C12196a> list3, l lVar, List<String> list4, e eVar, C11520b bVar, String str) {
        C17542s.j(list, "productList");
        C17542s.j(list2, "facetsList");
        this.f103858a = list;
        this.f103859b = list2;
        this.f103860c = z10;
        this.f103861d = keyBenefits;
        this.f103862e = fVar;
        this.f103863f = dVar;
        this.f103864g = list3;
        this.f103865h = lVar;
        this.f103866i = list4;
        this.f103867j = eVar;
        this.f103868k = bVar;
        this.f103869l = str;
    }

    public final C11520b a() {
        return this.f103868k;
    }

    public final List<String> b() {
        return this.f103866i;
    }

    public final List<C12197b> c() {
        return this.f103859b;
    }

    public final d d() {
        return this.f103863f;
    }

    public final e e() {
        return this.f103867j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f103858a, bVar.f103858a) && C17542s.e(this.f103859b, bVar.f103859b) && this.f103860c == bVar.f103860c && C17542s.e(this.f103861d, bVar.f103861d) && C17542s.e(this.f103862e, bVar.f103862e) && C17542s.e(this.f103863f, bVar.f103863f) && C17542s.e(this.f103864g, bVar.f103864g) && C17542s.e(this.f103865h, bVar.f103865h) && C17542s.e(this.f103866i, bVar.f103866i) && C17542s.e(this.f103867j, bVar.f103867j) && C17542s.e(this.f103868k, bVar.f103868k) && C17542s.e(this.f103869l, bVar.f103869l);
    }

    public final KeyBenefits f() {
        return this.f103861d;
    }

    public final f g() {
        return this.f103862e;
    }

    public final List<ProductItem> h() {
        return this.f103858a;
    }

    public int hashCode() {
        int hashCode = ((((this.f103858a.hashCode() * 31) + this.f103859b.hashCode()) * 31) + Boolean.hashCode(this.f103860c)) * 31;
        KeyBenefits keyBenefits = this.f103861d;
        int i10 = 0;
        int hashCode2 = (hashCode + (keyBenefits == null ? 0 : keyBenefits.hashCode())) * 31;
        f fVar = this.f103862e;
        int hashCode3 = (hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        d dVar = this.f103863f;
        int hashCode4 = (hashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List<C12196a> list = this.f103864g;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        l lVar = this.f103865h;
        int hashCode6 = (hashCode5 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        List<String> list2 = this.f103866i;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        e eVar = this.f103867j;
        int hashCode8 = (hashCode7 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        C11520b bVar = this.f103868k;
        int hashCode9 = (hashCode8 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f103869l;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode9 + i10;
    }

    public final boolean i() {
        return this.f103860c;
    }

    public final List<C12196a> j() {
        return this.f103864g;
    }

    public final l k() {
        return this.f103865h;
    }

    public final String l() {
        return this.f103869l;
    }

    public String toString() {
        List<ProductItem> list = this.f103858a;
        List<C12197b> list2 = this.f103859b;
        boolean z10 = this.f103860c;
        KeyBenefits keyBenefits = this.f103861d;
        f fVar = this.f103862e;
        d dVar = this.f103863f;
        List<C12196a> list3 = this.f103864g;
        l lVar = this.f103865h;
        List<String> list4 = this.f103866i;
        e eVar = this.f103867j;
        C11520b bVar = this.f103868k;
        String str = this.f103869l;
        return "PlpDetails(productList=" + list + ", facetsList=" + list2 + ", showAvailabilityBanner=" + z10 + ", keyBenefits=" + keyBenefits + ", metaInfo=" + fVar + ", header=" + dVar + ", subCategories=" + list3 + ", suggestions=" + lVar + ", didYouMean=" + list4 + ", inspirationFeed=" + eVar + ", campaigns=" + bVar + ", token=" + str + ")";
    }
}
