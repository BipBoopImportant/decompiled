package bB;

import gB.C14501c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b\u001f\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001b\u0010$¨\u0006%"}, d2 = {"LbB/d;", "", "LgB/c;", "type", "", "price", "tax", "", "comparisonPrice", "validToDate", "previousPrice", "lowestPreviousPrice", "<init>", "(LgB/c;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LgB/c;", "f", "()LgB/c;", "b", "D", "d", "()D", "c", "e", "Ljava/lang/String;", "g", "Ljava/lang/Double;", "()Ljava/lang/Double;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final C14501c f118888a;

    /* renamed from: b  reason: collision with root package name */
    private final double f118889b;

    /* renamed from: c  reason: collision with root package name */
    private final double f118890c;

    /* renamed from: d  reason: collision with root package name */
    private final String f118891d;

    /* renamed from: e  reason: collision with root package name */
    private final String f118892e;

    /* renamed from: f  reason: collision with root package name */
    private final Double f118893f;

    /* renamed from: g  reason: collision with root package name */
    private final Double f118894g;

    public d(C14501c cVar, double d10, double d11, String str, String str2, Double d12, Double d13) {
        C17542s.j(cVar, "type");
        this.f118888a = cVar;
        this.f118889b = d10;
        this.f118890c = d11;
        this.f118891d = str;
        this.f118892e = str2;
        this.f118893f = d12;
        this.f118894g = d13;
    }

    public final String a() {
        return this.f118891d;
    }

    public final Double b() {
        return this.f118894g;
    }

    public final Double c() {
        return this.f118893f;
    }

    public final double d() {
        return this.f118889b;
    }

    public final double e() {
        return this.f118890c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f118888a == dVar.f118888a && Double.compare(this.f118889b, dVar.f118889b) == 0 && Double.compare(this.f118890c, dVar.f118890c) == 0 && C17542s.e(this.f118891d, dVar.f118891d) && C17542s.e(this.f118892e, dVar.f118892e) && C17542s.e(this.f118893f, dVar.f118893f) && C17542s.e(this.f118894g, dVar.f118894g);
    }

    public final C14501c f() {
        return this.f118888a;
    }

    public final String g() {
        return this.f118892e;
    }

    public int hashCode() {
        int hashCode = ((((this.f118888a.hashCode() * 31) + Double.hashCode(this.f118889b)) * 31) + Double.hashCode(this.f118890c)) * 31;
        String str = this.f118891d;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f118892e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d10 = this.f118893f;
        int hashCode4 = (hashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f118894g;
        if (d11 != null) {
            i10 = d11.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        C14501c cVar = this.f118888a;
        double d10 = this.f118889b;
        double d11 = this.f118890c;
        String str = this.f118891d;
        String str2 = this.f118892e;
        Double d12 = this.f118893f;
        Double d13 = this.f118894g;
        return "SalesPricesRemoteModel(type=" + cVar + ", price=" + d10 + ", tax=" + d11 + ", comparisonPrice=" + str + ", validToDate=" + str2 + ", previousPrice=" + d12 + ", lowestPreviousPrice=" + d13 + ")";
    }
}
