package rz;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0019"}, d2 = {"Lrz/r;", "Ljava/io/Serializable;", "", "title", "", "discount", "coupon", "<init>", "(Ljava/lang/String;DLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "D", "()D", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final String f130884a;

    /* renamed from: b  reason: collision with root package name */
    private final double f130885b;

    /* renamed from: c  reason: collision with root package name */
    private final String f130886c;

    public r(String str, double d10, String str2) {
        C17542s.j(str, "title");
        this.f130884a = str;
        this.f130885b = d10;
        this.f130886c = str2;
    }

    public final String a() {
        return this.f130886c;
    }

    public final double b() {
        return this.f130885b;
    }

    public final String c() {
        return this.f130884a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return C17542s.e(this.f130884a, rVar.f130884a) && Double.compare(this.f130885b, rVar.f130885b) == 0 && C17542s.e(this.f130886c, rVar.f130886c);
    }

    public int hashCode() {
        int hashCode = ((this.f130884a.hashCode() * 31) + Double.hashCode(this.f130885b)) * 31;
        String str = this.f130886c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f130884a;
        double d10 = this.f130885b;
        String str2 = this.f130886c;
        return "IndividualDiscount(title=" + str + ", discount=" + d10 + ", coupon=" + str2 + ")";
    }
}
