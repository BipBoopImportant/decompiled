package rz;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lrz/z;", "", "", "barcode", "", "quantity", "inclTax", "exclTax", "<init>", "(Ljava/lang/String;DDLjava/lang/Double;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "D", "getQuantity", "()D", "c", "d", "Ljava/lang/Double;", "getExclTax", "()Ljava/lang/Double;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rz.z  reason: case insensitive filesystem */
public final class C15032z {

    /* renamed from: a  reason: collision with root package name */
    private final String f130922a;

    /* renamed from: b  reason: collision with root package name */
    private final double f130923b;

    /* renamed from: c  reason: collision with root package name */
    private final double f130924c;

    /* renamed from: d  reason: collision with root package name */
    private final Double f130925d;

    public C15032z(String str, double d10, double d11, Double d12) {
        C17542s.j(str, "barcode");
        this.f130922a = str;
        this.f130923b = d10;
        this.f130924c = d11;
        this.f130925d = d12;
    }

    public final String a() {
        return this.f130922a;
    }

    public final double b() {
        return this.f130924c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15032z)) {
            return false;
        }
        C15032z zVar = (C15032z) obj;
        return C17542s.e(this.f130922a, zVar.f130922a) && Double.compare(this.f130923b, zVar.f130923b) == 0 && Double.compare(this.f130924c, zVar.f130924c) == 0 && C17542s.e(this.f130925d, zVar.f130925d);
    }

    public int hashCode() {
        int hashCode = ((((this.f130922a.hashCode() * 31) + Double.hashCode(this.f130923b)) * 31) + Double.hashCode(this.f130924c)) * 31;
        Double d10 = this.f130925d;
        return hashCode + (d10 == null ? 0 : d10.hashCode());
    }

    public String toString() {
        String str = this.f130922a;
        double d10 = this.f130923b;
        double d11 = this.f130924c;
        Double d12 = this.f130925d;
        return "ScanAndGoBagProduct(barcode=" + str + ", quantity=" + d10 + ", inclTax=" + d11 + ", exclTax=" + d12 + ")";
    }
}
