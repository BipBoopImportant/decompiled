package gB;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001c\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b\u0018\u0010(¨\u0006*"}, d2 = {"LgB/d;", "", "LgB/c;", "type", "", "price", "tax", "", "comparisonPrice", "Ljava/time/LocalDate;", "validUntil", "previousPrice", "lowestPreviousPrice", "<init>", "(LgB/c;DDLjava/lang/String;Ljava/time/LocalDate;Ljava/lang/Double;Ljava/lang/Double;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LgB/c;", "d", "()LgB/c;", "b", "D", "c", "()D", "getTax", "Ljava/lang/String;", "getComparisonPrice", "e", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "f", "Ljava/lang/Double;", "()Ljava/lang/Double;", "g", "shoppinglist-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gB.d  reason: case insensitive filesystem */
public final class C14502d {

    /* renamed from: a  reason: collision with root package name */
    private final C14501c f127265a;

    /* renamed from: b  reason: collision with root package name */
    private final double f127266b;

    /* renamed from: c  reason: collision with root package name */
    private final double f127267c;

    /* renamed from: d  reason: collision with root package name */
    private final String f127268d;

    /* renamed from: e  reason: collision with root package name */
    private final LocalDate f127269e;

    /* renamed from: f  reason: collision with root package name */
    private final Double f127270f;

    /* renamed from: g  reason: collision with root package name */
    private final Double f127271g;

    public C14502d(C14501c cVar, double d10, double d11, String str, LocalDate localDate, Double d12, Double d13) {
        C17542s.j(cVar, "type");
        this.f127265a = cVar;
        this.f127266b = d10;
        this.f127267c = d11;
        this.f127268d = str;
        this.f127269e = localDate;
        this.f127270f = d12;
        this.f127271g = d13;
    }

    public final Double a() {
        return this.f127271g;
    }

    public final Double b() {
        return this.f127270f;
    }

    public final double c() {
        return this.f127266b;
    }

    public final C14501c d() {
        return this.f127265a;
    }

    public final LocalDate e() {
        return this.f127269e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14502d)) {
            return false;
        }
        C14502d dVar = (C14502d) obj;
        return this.f127265a == dVar.f127265a && Double.compare(this.f127266b, dVar.f127266b) == 0 && Double.compare(this.f127267c, dVar.f127267c) == 0 && C17542s.e(this.f127268d, dVar.f127268d) && C17542s.e(this.f127269e, dVar.f127269e) && C17542s.e(this.f127270f, dVar.f127270f) && C17542s.e(this.f127271g, dVar.f127271g);
    }

    public int hashCode() {
        int hashCode = ((((this.f127265a.hashCode() * 31) + Double.hashCode(this.f127266b)) * 31) + Double.hashCode(this.f127267c)) * 31;
        String str = this.f127268d;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.f127269e;
        int hashCode3 = (hashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Double d10 = this.f127270f;
        int hashCode4 = (hashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f127271g;
        if (d11 != null) {
            i10 = d11.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        C14501c cVar = this.f127265a;
        double d10 = this.f127266b;
        double d11 = this.f127267c;
        String str = this.f127268d;
        LocalDate localDate = this.f127269e;
        Double d12 = this.f127270f;
        Double d13 = this.f127271g;
        return "SalesPrices(type=" + cVar + ", price=" + d10 + ", tax=" + d11 + ", comparisonPrice=" + str + ", validUntil=" + localDate + ", previousPrice=" + d12 + ", lowestPreviousPrice=" + d13 + ")";
    }
}
