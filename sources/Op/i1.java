package Op;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LOp/i1;", "", "Lkp/d;", "currencyConfig", "<init>", "(Lkp/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkp/d;", "()Lkp/d;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    private final C11522d f85196a;

    public i1(C11522d dVar) {
        C17542s.j(dVar, "currencyConfig");
        this.f85196a = dVar;
    }

    public final C11522d a() {
        return this.f85196a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && C17542s.e(this.f85196a, ((i1) obj).f85196a);
    }

    public int hashCode() {
        return this.f85196a.hashCode();
    }

    public String toString() {
        C11522d dVar = this.f85196a;
        return "StableCurrencyConfig(currencyConfig=" + dVar + ")";
    }
}
