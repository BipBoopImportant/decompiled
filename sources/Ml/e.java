package Ml;

import Rl.a;
import Rl.g;
import Rl.h;
import com.ingka.ikea.appconfig.model.GiftCardConfiguration;
import com.ingka.ikea.appconfig.model.MapServiceData;
import com.ingka.ikea.appconfig.model.PostalCodePickerConfig;
import com.ingka.ikea.appconfig.model.RemoteMedia;
import com.ingka.ikea.appconfig.model.UrlConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b.\b\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0014\u0012\u0006\u0010 \u001a\u00020\u0014\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000e¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010&R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010&R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b0\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b2\u00105R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b3\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b6\u0010&R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b@\u0010FR\u001a\u0010\u0013\u001a\u00020\u00118\u0006X\u0004¢\u0006\f\n\u0004\b1\u0010E\u001a\u0004\bD\u0010FR\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\u0016\u001a\u00020\u00148\u0006X\u0004¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\f\n\u0004\b/\u0010M\u001a\u0004\bK\u0010NR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b>\u0010.\u001a\u0004\bG\u0010&R\u001a\u0010\u001b\u001a\u00020\u001a8\u0006X\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bO\u0010QR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006X\u0004¢\u0006\f\n\u0004\b9\u0010A\u001a\u0004\bR\u0010CR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b<\u0010TR\u001a\u0010\u001f\u001a\u00020\u00148\u0006X\u0004¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\b7\u0010JR\u001a\u0010 \u001a\u00020\u00148\u0006X\u0004¢\u0006\f\n\u0004\bB\u0010H\u001a\u0004\b;\u0010JR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000e8\u0006X\u0004¢\u0006\f\n\u0004\bI\u0010A\u001a\u0004\b-\u0010C¨\u0006U"}, d2 = {"LMl/e;", "", "", "marketCode", "languageCode", "calendar", "LMl/a;", "currency", "dateFormat", "LRl/h;", "price", "emptyListCarouselData", "LRl/g;", "measurementSystem", "", "Lcom/ingka/ikea/appconfig/model/UrlConfig;", "urls", "LRl/a;", "hlp", "hlpSignUp", "", "isSignUpHlp", "showEnergyLabelCartList", "Lcom/ingka/ikea/appconfig/model/MapServiceData;", "mapServiceData", "legalInformationFooter", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "postalCodePickerConfig", "searchHints", "Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration;", "giftCardConfiguration", "extendedAnalyticsTrackingEnabled", "familyAndRegularPriceSameSize", "Lcom/ingka/ikea/appconfig/model/RemoteMedia;", "assets", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LMl/a;Ljava/lang/String;LRl/h;Ljava/lang/String;LRl/g;Ljava/util/List;LRl/a;LRl/a;ZZLcom/ingka/ikea/appconfig/model/MapServiceData;Ljava/lang/String;Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;Ljava/util/List;Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration;ZZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "n", "b", "k", "c", "d", "LMl/a;", "()LMl/a;", "e", "f", "LRl/h;", "q", "()LRl/h;", "g", "h", "LRl/g;", "o", "()LRl/g;", "i", "Ljava/util/List;", "t", "()Ljava/util/List;", "j", "LRl/a;", "()LRl/a;", "l", "Z", "u", "()Z", "m", "s", "Lcom/ingka/ikea/appconfig/model/MapServiceData;", "()Lcom/ingka/ikea/appconfig/model/MapServiceData;", "p", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "()Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "r", "Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration;", "()Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f83456a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83457b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83458c;

    /* renamed from: d  reason: collision with root package name */
    private final a f83459d;

    /* renamed from: e  reason: collision with root package name */
    private final String f83460e;

    /* renamed from: f  reason: collision with root package name */
    private final h f83461f;

    /* renamed from: g  reason: collision with root package name */
    private final String f83462g;

    /* renamed from: h  reason: collision with root package name */
    private final g f83463h;

    /* renamed from: i  reason: collision with root package name */
    private final List<UrlConfig> f83464i;

    /* renamed from: j  reason: collision with root package name */
    private final a f83465j;

    /* renamed from: k  reason: collision with root package name */
    private final a f83466k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f83467l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f83468m;

    /* renamed from: n  reason: collision with root package name */
    private final MapServiceData f83469n;

    /* renamed from: o  reason: collision with root package name */
    private final String f83470o;

    /* renamed from: p  reason: collision with root package name */
    private final PostalCodePickerConfig f83471p;

    /* renamed from: q  reason: collision with root package name */
    private final List<String> f83472q;

    /* renamed from: r  reason: collision with root package name */
    private final GiftCardConfiguration f83473r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f83474s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f83475t;

    /* renamed from: u  reason: collision with root package name */
    private final List<RemoteMedia> f83476u;

    public e(String str, String str2, String str3, a aVar, String str4, h hVar, String str5, g gVar, List<UrlConfig> list, a aVar2, a aVar3, boolean z10, boolean z11, MapServiceData mapServiceData, String str6, PostalCodePickerConfig postalCodePickerConfig, List<String> list2, GiftCardConfiguration giftCardConfiguration, boolean z12, boolean z13, List<RemoteMedia> list3) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        a aVar4 = aVar;
        String str10 = str4;
        h hVar2 = hVar;
        String str11 = str5;
        g gVar2 = gVar;
        List<UrlConfig> list4 = list;
        a aVar5 = aVar2;
        a aVar6 = aVar3;
        PostalCodePickerConfig postalCodePickerConfig2 = postalCodePickerConfig;
        List<String> list5 = list2;
        C17542s.j(str7, "marketCode");
        C17542s.j(str8, "languageCode");
        C17542s.j(str9, "calendar");
        C17542s.j(aVar4, "currency");
        C17542s.j(str10, "dateFormat");
        C17542s.j(hVar2, "price");
        C17542s.j(str11, "emptyListCarouselData");
        C17542s.j(gVar2, "measurementSystem");
        C17542s.j(list4, "urls");
        C17542s.j(aVar5, "hlp");
        C17542s.j(aVar6, "hlpSignUp");
        C17542s.j(postalCodePickerConfig2, "postalCodePickerConfig");
        C17542s.j(list5, "searchHints");
        this.f83456a = str7;
        this.f83457b = str8;
        this.f83458c = str9;
        this.f83459d = aVar4;
        this.f83460e = str10;
        this.f83461f = hVar2;
        this.f83462g = str11;
        this.f83463h = gVar2;
        this.f83464i = list4;
        this.f83465j = aVar5;
        this.f83466k = aVar6;
        this.f83467l = z10;
        this.f83468m = z11;
        this.f83469n = mapServiceData;
        this.f83470o = str6;
        this.f83471p = postalCodePickerConfig2;
        this.f83472q = list5;
        this.f83473r = giftCardConfiguration;
        this.f83474s = z12;
        this.f83475t = z13;
        this.f83476u = list3;
    }

    public final List<RemoteMedia> a() {
        return this.f83476u;
    }

    public final String b() {
        return this.f83458c;
    }

    public final a c() {
        return this.f83459d;
    }

    public final String d() {
        return this.f83460e;
    }

    public final String e() {
        return this.f83462g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f83456a, eVar.f83456a) && C17542s.e(this.f83457b, eVar.f83457b) && C17542s.e(this.f83458c, eVar.f83458c) && C17542s.e(this.f83459d, eVar.f83459d) && C17542s.e(this.f83460e, eVar.f83460e) && C17542s.e(this.f83461f, eVar.f83461f) && C17542s.e(this.f83462g, eVar.f83462g) && this.f83463h == eVar.f83463h && C17542s.e(this.f83464i, eVar.f83464i) && C17542s.e(this.f83465j, eVar.f83465j) && C17542s.e(this.f83466k, eVar.f83466k) && this.f83467l == eVar.f83467l && this.f83468m == eVar.f83468m && C17542s.e(this.f83469n, eVar.f83469n) && C17542s.e(this.f83470o, eVar.f83470o) && C17542s.e(this.f83471p, eVar.f83471p) && C17542s.e(this.f83472q, eVar.f83472q) && C17542s.e(this.f83473r, eVar.f83473r) && this.f83474s == eVar.f83474s && this.f83475t == eVar.f83475t && C17542s.e(this.f83476u, eVar.f83476u);
    }

    public final boolean f() {
        return this.f83474s;
    }

    public final boolean g() {
        return this.f83475t;
    }

    public final GiftCardConfiguration h() {
        return this.f83473r;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((this.f83456a.hashCode() * 31) + this.f83457b.hashCode()) * 31) + this.f83458c.hashCode()) * 31) + this.f83459d.hashCode()) * 31) + this.f83460e.hashCode()) * 31) + this.f83461f.hashCode()) * 31) + this.f83462g.hashCode()) * 31) + this.f83463h.hashCode()) * 31) + this.f83464i.hashCode()) * 31) + this.f83465j.hashCode()) * 31) + this.f83466k.hashCode()) * 31) + Boolean.hashCode(this.f83467l)) * 31) + Boolean.hashCode(this.f83468m)) * 31;
        MapServiceData mapServiceData = this.f83469n;
        int i10 = 0;
        int hashCode2 = (hashCode + (mapServiceData == null ? 0 : mapServiceData.hashCode())) * 31;
        String str = this.f83470o;
        int hashCode3 = (((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f83471p.hashCode()) * 31) + this.f83472q.hashCode()) * 31;
        GiftCardConfiguration giftCardConfiguration = this.f83473r;
        int hashCode4 = (((((hashCode3 + (giftCardConfiguration == null ? 0 : giftCardConfiguration.hashCode())) * 31) + Boolean.hashCode(this.f83474s)) * 31) + Boolean.hashCode(this.f83475t)) * 31;
        List<RemoteMedia> list = this.f83476u;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode4 + i10;
    }

    public final a i() {
        return this.f83465j;
    }

    public final a j() {
        return this.f83466k;
    }

    public final String k() {
        return this.f83457b;
    }

    public final String l() {
        return this.f83470o;
    }

    public final MapServiceData m() {
        return this.f83469n;
    }

    public final String n() {
        return this.f83456a;
    }

    public final g o() {
        return this.f83463h;
    }

    public final PostalCodePickerConfig p() {
        return this.f83471p;
    }

    public final h q() {
        return this.f83461f;
    }

    public final List<String> r() {
        return this.f83472q;
    }

    public final boolean s() {
        return this.f83468m;
    }

    public final List<UrlConfig> t() {
        return this.f83464i;
    }

    public String toString() {
        String str = this.f83456a;
        String str2 = this.f83457b;
        String str3 = this.f83458c;
        a aVar = this.f83459d;
        String str4 = this.f83460e;
        h hVar = this.f83461f;
        String str5 = this.f83462g;
        g gVar = this.f83463h;
        List<UrlConfig> list = this.f83464i;
        a aVar2 = this.f83465j;
        a aVar3 = this.f83466k;
        boolean z10 = this.f83467l;
        boolean z11 = this.f83468m;
        MapServiceData mapServiceData = this.f83469n;
        String str6 = this.f83470o;
        PostalCodePickerConfig postalCodePickerConfig = this.f83471p;
        List<String> list2 = this.f83472q;
        GiftCardConfiguration giftCardConfiguration = this.f83473r;
        boolean z12 = this.f83474s;
        boolean z13 = this.f83475t;
        List<RemoteMedia> list3 = this.f83476u;
        return "MarketConfigEntity(marketCode=" + str + ", languageCode=" + str2 + ", calendar=" + str3 + ", currency=" + aVar + ", dateFormat=" + str4 + ", price=" + hVar + ", emptyListCarouselData=" + str5 + ", measurementSystem=" + gVar + ", urls=" + list + ", hlp=" + aVar2 + ", hlpSignUp=" + aVar3 + ", isSignUpHlp=" + z10 + ", showEnergyLabelCartList=" + z11 + ", mapServiceData=" + mapServiceData + ", legalInformationFooter=" + str6 + ", postalCodePickerConfig=" + postalCodePickerConfig + ", searchHints=" + list2 + ", giftCardConfiguration=" + giftCardConfiguration + ", extendedAnalyticsTrackingEnabled=" + z12 + ", familyAndRegularPriceSameSize=" + z13 + ", assets=" + list3 + ")";
    }

    public final boolean u() {
        return this.f83467l;
    }
}
