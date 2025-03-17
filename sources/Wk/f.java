package Wk;

import com.ingka.ikea.app.stockinfo.network.c;
import com.ingka.ikea.app.stockinfo.network.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b(\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b0\u0010\u0019R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b1\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b+\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b)\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b!\u0010\u0019R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b%\u0010\u0019R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0004¢\u0006\f\n\u0004\b0\u00106\u001a\u0004\b2\u00107R\u001a\u0010\u0014\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b5\u0010\u0019R\u001a\u0010\u0015\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010\u0019¨\u00068"}, d2 = {"LWk/f;", "", "", "dateCreated", "", "storeId", "itemNo", "itemType", "productLocation", "Lcom/ingka/ikea/app/stockinfo/network/d;", "statusCode", "stockText", "label", "heading", "title", "description", "aisle", "bin", "Lcom/ingka/ikea/app/stockinfo/network/c;", "salePoint", "stockQuantityDetails", "stockQuantityChecked", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/stockinfo/network/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/stockinfo/network/c;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "Ljava/lang/String;", "o", "f", "d", "g", "e", "i", "Lcom/ingka/ikea/app/stockinfo/network/d;", "k", "()Lcom/ingka/ikea/app/stockinfo/network/d;", "n", "h", "j", "p", "l", "m", "Lcom/ingka/ikea/app/stockinfo/network/c;", "()Lcom/ingka/ikea/app/stockinfo/network/c;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final long f88908a;

    /* renamed from: b  reason: collision with root package name */
    private final String f88909b;

    /* renamed from: c  reason: collision with root package name */
    private final String f88910c;

    /* renamed from: d  reason: collision with root package name */
    private final String f88911d;

    /* renamed from: e  reason: collision with root package name */
    private final String f88912e;

    /* renamed from: f  reason: collision with root package name */
    private final d f88913f;

    /* renamed from: g  reason: collision with root package name */
    private final String f88914g;

    /* renamed from: h  reason: collision with root package name */
    private final String f88915h;

    /* renamed from: i  reason: collision with root package name */
    private final String f88916i;

    /* renamed from: j  reason: collision with root package name */
    private final String f88917j;

    /* renamed from: k  reason: collision with root package name */
    private final String f88918k;

    /* renamed from: l  reason: collision with root package name */
    private final String f88919l;

    /* renamed from: m  reason: collision with root package name */
    private final String f88920m;

    /* renamed from: n  reason: collision with root package name */
    private final c f88921n;

    /* renamed from: o  reason: collision with root package name */
    private final String f88922o;

    /* renamed from: p  reason: collision with root package name */
    private final String f88923p;

    public f(long j10, String str, String str2, String str3, String str4, d dVar, String str5, String str6, String str7, String str8, String str9, String str10, String str11, c cVar, String str12, String str13) {
        String str14 = str2;
        String str15 = str3;
        d dVar2 = dVar;
        String str16 = str5;
        String str17 = str6;
        c cVar2 = cVar;
        String str18 = str12;
        String str19 = str13;
        C17542s.j(str, "storeId");
        C17542s.j(str14, "itemNo");
        C17542s.j(str15, "itemType");
        C17542s.j(dVar2, "statusCode");
        C17542s.j(str16, "stockText");
        C17542s.j(str17, "label");
        C17542s.j(cVar2, "salePoint");
        C17542s.j(str18, "stockQuantityDetails");
        C17542s.j(str19, "stockQuantityChecked");
        this.f88908a = j10;
        this.f88909b = str;
        this.f88910c = str14;
        this.f88911d = str15;
        this.f88912e = str4;
        this.f88913f = dVar2;
        this.f88914g = str16;
        this.f88915h = str17;
        this.f88916i = str7;
        this.f88917j = str8;
        this.f88918k = str9;
        this.f88919l = str10;
        this.f88920m = str11;
        this.f88921n = cVar2;
        this.f88922o = str18;
        this.f88923p = str19;
    }

    public final String a() {
        return this.f88919l;
    }

    public final String b() {
        return this.f88920m;
    }

    public final long c() {
        return this.f88908a;
    }

    public final String d() {
        return this.f88918k;
    }

    public final String e() {
        return this.f88916i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f88908a == fVar.f88908a && C17542s.e(this.f88909b, fVar.f88909b) && C17542s.e(this.f88910c, fVar.f88910c) && C17542s.e(this.f88911d, fVar.f88911d) && C17542s.e(this.f88912e, fVar.f88912e) && this.f88913f == fVar.f88913f && C17542s.e(this.f88914g, fVar.f88914g) && C17542s.e(this.f88915h, fVar.f88915h) && C17542s.e(this.f88916i, fVar.f88916i) && C17542s.e(this.f88917j, fVar.f88917j) && C17542s.e(this.f88918k, fVar.f88918k) && C17542s.e(this.f88919l, fVar.f88919l) && C17542s.e(this.f88920m, fVar.f88920m) && this.f88921n == fVar.f88921n && C17542s.e(this.f88922o, fVar.f88922o) && C17542s.e(this.f88923p, fVar.f88923p);
    }

    public final String f() {
        return this.f88910c;
    }

    public final String g() {
        return this.f88911d;
    }

    public final String h() {
        return this.f88915h;
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.f88908a) * 31) + this.f88909b.hashCode()) * 31) + this.f88910c.hashCode()) * 31) + this.f88911d.hashCode()) * 31;
        String str = this.f88912e;
        int i10 = 0;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f88913f.hashCode()) * 31) + this.f88914g.hashCode()) * 31) + this.f88915h.hashCode()) * 31;
        String str2 = this.f88916i;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f88917j;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f88918k;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f88919l;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f88920m;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return ((((((hashCode6 + i10) * 31) + this.f88921n.hashCode()) * 31) + this.f88922o.hashCode()) * 31) + this.f88923p.hashCode();
    }

    public final String i() {
        return this.f88912e;
    }

    public final c j() {
        return this.f88921n;
    }

    public final d k() {
        return this.f88913f;
    }

    public final String l() {
        return this.f88923p;
    }

    public final String m() {
        return this.f88922o;
    }

    public final String n() {
        return this.f88914g;
    }

    public final String o() {
        return this.f88909b;
    }

    public final String p() {
        return this.f88917j;
    }

    public String toString() {
        long j10 = this.f88908a;
        String str = this.f88909b;
        String str2 = this.f88910c;
        String str3 = this.f88911d;
        String str4 = this.f88912e;
        d dVar = this.f88913f;
        String str5 = this.f88914g;
        String str6 = this.f88915h;
        String str7 = this.f88916i;
        String str8 = this.f88917j;
        String str9 = this.f88918k;
        String str10 = this.f88919l;
        String str11 = this.f88920m;
        c cVar = this.f88921n;
        String str12 = this.f88922o;
        String str13 = this.f88923p;
        return "StockAvailabilityEntity(dateCreated=" + j10 + ", storeId=" + str + ", itemNo=" + str2 + ", itemType=" + str3 + ", productLocation=" + str4 + ", statusCode=" + dVar + ", stockText=" + str5 + ", label=" + str6 + ", heading=" + str7 + ", title=" + str8 + ", description=" + str9 + ", aisle=" + str10 + ", bin=" + str11 + ", salePoint=" + cVar + ", stockQuantityDetails=" + str12 + ", stockQuantityChecked=" + str13 + ")";
    }
}
