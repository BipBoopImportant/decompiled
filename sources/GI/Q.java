package gi;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\r¨\u0006\u001a"}, d2 = {"Lgi/Q;", "Ljava/io/Serializable;", "", "itemNo", "", "rating", "", "numberReviewers", "<init>", "(Ljava/lang/String;FI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "F", "c", "()F", "I", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Q implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final String f73335a;

    /* renamed from: b  reason: collision with root package name */
    private final float f73336b;

    /* renamed from: c  reason: collision with root package name */
    private final int f73337c;

    public Q(String str, float f10, int i10) {
        C17542s.j(str, "itemNo");
        this.f73335a = str;
        this.f73336b = f10;
        this.f73337c = i10;
    }

    public final String a() {
        return this.f73335a;
    }

    public final int b() {
        return this.f73337c;
    }

    public final float c() {
        return this.f73336b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return C17542s.e(this.f73335a, q10.f73335a) && Float.compare(this.f73336b, q10.f73336b) == 0 && this.f73337c == q10.f73337c;
    }

    public int hashCode() {
        return (((this.f73335a.hashCode() * 31) + Float.hashCode(this.f73336b)) * 31) + Integer.hashCode(this.f73337c);
    }

    public String toString() {
        String str = this.f73335a;
        float f10 = this.f73336b;
        int i10 = this.f73337c;
        return "ReviewsModel(itemNo=" + str + ", rating=" + f10 + ", numberReviewers=" + i10 + ")";
    }
}
