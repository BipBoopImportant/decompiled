package Rl;

import com.ingka.ikea.appconfig.model.GiftCardConfiguration;
import com.ingka.ikea.appconfig.model.MapServiceData;
import com.ingka.ikea.appconfig.model.PostalCodePickerConfig;
import com.ingka.ikea.appconfig.model.RemoteMedia;
import com.ingka.ikea.appconfig.model.UrlConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b.\b\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0014\u0012\u0006\u0010 \u001a\u00020\u0014\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000e¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010&R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b0\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b2\u00105R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b3\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b6\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b@\u0010FR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b1\u0010E\u001a\u0004\bD\u0010FR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b/\u0010M\u001a\u0004\bK\u0010NR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010.\u001a\u0004\bG\u0010&R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bO\u0010QR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b9\u0010A\u001a\u0004\bR\u0010CR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b<\u0010TR\u0017\u0010\u001f\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\b7\u0010JR\u0017\u0010 \u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bB\u0010H\u001a\u0004\b;\u0010JR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000e8\u0006¢\u0006\f\n\u0004\bI\u0010A\u001a\u0004\b-\u0010C¨\u0006U"}, d2 = {"LRl/e;", "", "", "marketCode", "languageCode", "calendar", "Lkp/d;", "currency", "dateFormat", "LRl/h;", "price", "emptyListCarouselData", "LRl/g;", "measurementSystem", "", "Lcom/ingka/ikea/appconfig/model/UrlConfig;", "urls", "LRl/a;", "hostedLoginPage", "hostedSignUpPage", "", "isSignUpHlp", "showEnergyLabelCartList", "Lcom/ingka/ikea/appconfig/model/MapServiceData;", "mapServiceData", "legalInformationFooter", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "postalCodePickerConfig", "searchHints", "Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration;", "giftCardConfiguration", "extendedAnalyticsTrackingEnabled", "familyAndRegularPriceSameSize", "Lcom/ingka/ikea/appconfig/model/RemoteMedia;", "assets", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkp/d;Ljava/lang/String;LRl/h;Ljava/lang/String;LRl/g;Ljava/util/List;LRl/a;LRl/a;ZZLcom/ingka/ikea/appconfig/model/MapServiceData;Ljava/lang/String;Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;Ljava/util/List;Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration;ZZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "n", "b", "k", "c", "d", "Lkp/d;", "()Lkp/d;", "e", "f", "LRl/h;", "q", "()LRl/h;", "g", "h", "LRl/g;", "o", "()LRl/g;", "i", "Ljava/util/List;", "t", "()Ljava/util/List;", "j", "LRl/a;", "()LRl/a;", "l", "Z", "u", "()Z", "m", "s", "Lcom/ingka/ikea/appconfig/model/MapServiceData;", "()Lcom/ingka/ikea/appconfig/model/MapServiceData;", "p", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "()Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "r", "Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration;", "()Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f86550a;

    /* renamed from: b  reason: collision with root package name */
    private final String f86551b;

    /* renamed from: c  reason: collision with root package name */
    private final String f86552c;

    /* renamed from: d  reason: collision with root package name */
    private final C11522d f86553d;

    /* renamed from: e  reason: collision with root package name */
    private final String f86554e;

    /* renamed from: f  reason: collision with root package name */
    private final h f86555f;

    /* renamed from: g  reason: collision with root package name */
    private final String f86556g;

    /* renamed from: h  reason: collision with root package name */
    private final g f86557h;

    /* renamed from: i  reason: collision with root package name */
    private final List<UrlConfig> f86558i;

    /* renamed from: j  reason: collision with root package name */
    private final a f86559j;

    /* renamed from: k  reason: collision with root package name */
    private final a f86560k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f86561l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f86562m;

    /* renamed from: n  reason: collision with root package name */
    private final MapServiceData f86563n;

    /* renamed from: o  reason: collision with root package name */
    private final String f86564o;

    /* renamed from: p  reason: collision with root package name */
    private final PostalCodePickerConfig f86565p;

    /* renamed from: q  reason: collision with root package name */
    private final List<String> f86566q;

    /* renamed from: r  reason: collision with root package name */
    private final GiftCardConfiguration f86567r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f86568s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f86569t;

    /* renamed from: u  reason: collision with root package name */
    private final List<RemoteMedia> f86570u;

    public e(String str, String str2, String str3, C11522d dVar, String str4, h hVar, String str5, g gVar, List<UrlConfig> list, a aVar, a aVar2, boolean z10, boolean z11, MapServiceData mapServiceData, String str6, PostalCodePickerConfig postalCodePickerConfig, List<String> list2, GiftCardConfiguration giftCardConfiguration, boolean z12, boolean z13, List<RemoteMedia> list3) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        C11522d dVar2 = dVar;
        String str10 = str4;
        h hVar2 = hVar;
        String str11 = str5;
        g gVar2 = gVar;
        List<UrlConfig> list4 = list;
        a aVar3 = aVar;
        a aVar4 = aVar2;
        PostalCodePickerConfig postalCodePickerConfig2 = postalCodePickerConfig;
        List<String> list5 = list2;
        List<RemoteMedia> list6 = list3;
        C17542s.j(str7, "marketCode");
        C17542s.j(str8, "languageCode");
        C17542s.j(str9, "calendar");
        C17542s.j(dVar2, "currency");
        C17542s.j(str10, "dateFormat");
        C17542s.j(hVar2, "price");
        C17542s.j(str11, "emptyListCarouselData");
        C17542s.j(gVar2, "measurementSystem");
        C17542s.j(list4, "urls");
        C17542s.j(aVar3, "hostedLoginPage");
        C17542s.j(aVar4, "hostedSignUpPage");
        C17542s.j(postalCodePickerConfig2, "postalCodePickerConfig");
        C17542s.j(list5, "searchHints");
        C17542s.j(list6, "assets");
        this.f86550a = str7;
        this.f86551b = str8;
        this.f86552c = str9;
        this.f86553d = dVar2;
        this.f86554e = str10;
        this.f86555f = hVar2;
        this.f86556g = str11;
        this.f86557h = gVar2;
        this.f86558i = list4;
        this.f86559j = aVar3;
        this.f86560k = aVar4;
        this.f86561l = z10;
        this.f86562m = z11;
        this.f86563n = mapServiceData;
        this.f86564o = str6;
        this.f86565p = postalCodePickerConfig2;
        this.f86566q = list5;
        this.f86567r = giftCardConfiguration;
        this.f86568s = z12;
        this.f86569t = z13;
        this.f86570u = list6;
    }

    public final List<RemoteMedia> a() {
        return this.f86570u;
    }

    public final String b() {
        return this.f86552c;
    }

    public final C11522d c() {
        return this.f86553d;
    }

    public final String d() {
        return this.f86554e;
    }

    public final String e() {
        return this.f86556g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f86550a, eVar.f86550a) && C17542s.e(this.f86551b, eVar.f86551b) && C17542s.e(this.f86552c, eVar.f86552c) && C17542s.e(this.f86553d, eVar.f86553d) && C17542s.e(this.f86554e, eVar.f86554e) && C17542s.e(this.f86555f, eVar.f86555f) && C17542s.e(this.f86556g, eVar.f86556g) && this.f86557h == eVar.f86557h && C17542s.e(this.f86558i, eVar.f86558i) && C17542s.e(this.f86559j, eVar.f86559j) && C17542s.e(this.f86560k, eVar.f86560k) && this.f86561l == eVar.f86561l && this.f86562m == eVar.f86562m && C17542s.e(this.f86563n, eVar.f86563n) && C17542s.e(this.f86564o, eVar.f86564o) && C17542s.e(this.f86565p, eVar.f86565p) && C17542s.e(this.f86566q, eVar.f86566q) && C17542s.e(this.f86567r, eVar.f86567r) && this.f86568s == eVar.f86568s && this.f86569t == eVar.f86569t && C17542s.e(this.f86570u, eVar.f86570u);
    }

    public final boolean f() {
        return this.f86568s;
    }

    public final boolean g() {
        return this.f86569t;
    }

    public final GiftCardConfiguration h() {
        return this.f86567r;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((this.f86550a.hashCode() * 31) + this.f86551b.hashCode()) * 31) + this.f86552c.hashCode()) * 31) + this.f86553d.hashCode()) * 31) + this.f86554e.hashCode()) * 31) + this.f86555f.hashCode()) * 31) + this.f86556g.hashCode()) * 31) + this.f86557h.hashCode()) * 31) + this.f86558i.hashCode()) * 31) + this.f86559j.hashCode()) * 31) + this.f86560k.hashCode()) * 31) + Boolean.hashCode(this.f86561l)) * 31) + Boolean.hashCode(this.f86562m)) * 31;
        MapServiceData mapServiceData = this.f86563n;
        int i10 = 0;
        int hashCode2 = (hashCode + (mapServiceData == null ? 0 : mapServiceData.hashCode())) * 31;
        String str = this.f86564o;
        int hashCode3 = (((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f86565p.hashCode()) * 31) + this.f86566q.hashCode()) * 31;
        GiftCardConfiguration giftCardConfiguration = this.f86567r;
        if (giftCardConfiguration != null) {
            i10 = giftCardConfiguration.hashCode();
        }
        return ((((((hashCode3 + i10) * 31) + Boolean.hashCode(this.f86568s)) * 31) + Boolean.hashCode(this.f86569t)) * 31) + this.f86570u.hashCode();
    }

    public final a i() {
        return this.f86559j;
    }

    public final a j() {
        return this.f86560k;
    }

    public final String k() {
        return this.f86551b;
    }

    public final String l() {
        return this.f86564o;
    }

    public final MapServiceData m() {
        return this.f86563n;
    }

    public final String n() {
        return this.f86550a;
    }

    public final g o() {
        return this.f86557h;
    }

    public final PostalCodePickerConfig p() {
        return this.f86565p;
    }

    public final h q() {
        return this.f86555f;
    }

    public final List<String> r() {
        return this.f86566q;
    }

    public final boolean s() {
        return this.f86562m;
    }

    public final List<UrlConfig> t() {
        return this.f86558i;
    }

    public String toString() {
        String str = this.f86550a;
        String str2 = this.f86551b;
        String str3 = this.f86552c;
        C11522d dVar = this.f86553d;
        String str4 = this.f86554e;
        h hVar = this.f86555f;
        String str5 = this.f86556g;
        g gVar = this.f86557h;
        List<UrlConfig> list = this.f86558i;
        a aVar = this.f86559j;
        a aVar2 = this.f86560k;
        boolean z10 = this.f86561l;
        boolean z11 = this.f86562m;
        MapServiceData mapServiceData = this.f86563n;
        String str6 = this.f86564o;
        PostalCodePickerConfig postalCodePickerConfig = this.f86565p;
        List<String> list2 = this.f86566q;
        GiftCardConfiguration giftCardConfiguration = this.f86567r;
        boolean z12 = this.f86568s;
        boolean z13 = this.f86569t;
        List<RemoteMedia> list3 = this.f86570u;
        return "MarketConfig(marketCode=" + str + ", languageCode=" + str2 + ", calendar=" + str3 + ", currency=" + dVar + ", dateFormat=" + str4 + ", price=" + hVar + ", emptyListCarouselData=" + str5 + ", measurementSystem=" + gVar + ", urls=" + list + ", hostedLoginPage=" + aVar + ", hostedSignUpPage=" + aVar2 + ", isSignUpHlp=" + z10 + ", showEnergyLabelCartList=" + z11 + ", mapServiceData=" + mapServiceData + ", legalInformationFooter=" + str6 + ", postalCodePickerConfig=" + postalCodePickerConfig + ", searchHints=" + list2 + ", giftCardConfiguration=" + giftCardConfiguration + ", extendedAnalyticsTrackingEnabled=" + z12 + ", familyAndRegularPriceSameSize=" + z13 + ", assets=" + list3 + ")";
    }

    public final boolean u() {
        return this.f86561l;
    }
}
