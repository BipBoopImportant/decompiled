package WA;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b \u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001b\u0010&¨\u0006'"}, d2 = {"LWA/e;", "", "", "parentItemNo", "type", "", "price", "tax", "comparisonPrice", "Ljava/time/LocalDate;", "validUntil", "previousPrice", "lowestPreviousPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/time/LocalDate;Ljava/lang/Double;Ljava/lang/Double;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "g", "D", "e", "()D", "d", "f", "Ljava/time/LocalDate;", "h", "()Ljava/time/LocalDate;", "Ljava/lang/Double;", "()Ljava/lang/Double;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WA.e  reason: case insensitive filesystem */
public final class C13767e {

    /* renamed from: a  reason: collision with root package name */
    private final String f117471a;

    /* renamed from: b  reason: collision with root package name */
    private final String f117472b;

    /* renamed from: c  reason: collision with root package name */
    private final double f117473c;

    /* renamed from: d  reason: collision with root package name */
    private final double f117474d;

    /* renamed from: e  reason: collision with root package name */
    private final String f117475e;

    /* renamed from: f  reason: collision with root package name */
    private final LocalDate f117476f;

    /* renamed from: g  reason: collision with root package name */
    private final Double f117477g;

    /* renamed from: h  reason: collision with root package name */
    private final Double f117478h;

    public C13767e(String str, String str2, double d10, double d11, String str3, LocalDate localDate, Double d12, Double d13) {
        C17542s.j(str, "parentItemNo");
        C17542s.j(str2, "type");
        this.f117471a = str;
        this.f117472b = str2;
        this.f117473c = d10;
        this.f117474d = d11;
        this.f117475e = str3;
        this.f117476f = localDate;
        this.f117477g = d12;
        this.f117478h = d13;
    }

    public final String a() {
        return this.f117475e;
    }

    public final Double b() {
        return this.f117478h;
    }

    public final String c() {
        return this.f117471a;
    }

    public final Double d() {
        return this.f117477g;
    }

    public final double e() {
        return this.f117473c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13767e)) {
            return false;
        }
        C13767e eVar = (C13767e) obj;
        return C17542s.e(this.f117471a, eVar.f117471a) && C17542s.e(this.f117472b, eVar.f117472b) && Double.compare(this.f117473c, eVar.f117473c) == 0 && Double.compare(this.f117474d, eVar.f117474d) == 0 && C17542s.e(this.f117475e, eVar.f117475e) && C17542s.e(this.f117476f, eVar.f117476f) && C17542s.e(this.f117477g, eVar.f117477g) && C17542s.e(this.f117478h, eVar.f117478h);
    }

    public final double f() {
        return this.f117474d;
    }

    public final String g() {
        return this.f117472b;
    }

    public final LocalDate h() {
        return this.f117476f;
    }

    public int hashCode() {
        int hashCode = ((((((this.f117471a.hashCode() * 31) + this.f117472b.hashCode()) * 31) + Double.hashCode(this.f117473c)) * 31) + Double.hashCode(this.f117474d)) * 31;
        String str = this.f117475e;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.f117476f;
        int hashCode3 = (hashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Double d10 = this.f117477g;
        int hashCode4 = (hashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f117478h;
        if (d11 != null) {
            i10 = d11.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        String str = this.f117471a;
        String str2 = this.f117472b;
        double d10 = this.f117473c;
        double d11 = this.f117474d;
        String str3 = this.f117475e;
        LocalDate localDate = this.f117476f;
        Double d12 = this.f117477g;
        Double d13 = this.f117478h;
        return "SalesPricesEntity(parentItemNo=" + str + ", type=" + str2 + ", price=" + d10 + ", tax=" + d11 + ", comparisonPrice=" + str3 + ", validUntil=" + localDate + ", previousPrice=" + d12 + ", lowestPreviousPrice=" + d13 + ")";
    }
}
