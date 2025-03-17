package hg;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lhg/J;", "", "Lhg/J$a;", "status", "", "requestedQuantity", "availableQuantity", "<init>", "(Lhg/J$a;ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhg/J$a;", "b", "()Lhg/J$a;", "I", "c", "Ljava/lang/Integer;", "getAvailableQuantity", "()Ljava/lang/Integer;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class J {

    /* renamed from: a  reason: collision with root package name */
    private final a f73605a;

    /* renamed from: b  reason: collision with root package name */
    private final int f73606b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f73607c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lhg/J$a;", "", "<init>", "(Ljava/lang/String;I)V", "AVAILABLE", "LIMITED", "UNAVAILABLE", "UNKNOWN", "NOT_ENABLED", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        AVAILABLE,
        LIMITED,
        UNAVAILABLE,
        UNKNOWN,
        NOT_ENABLED;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public J(a aVar, int i10, Integer num) {
        C17542s.j(aVar, "status");
        this.f73605a = aVar;
        this.f73606b = i10;
        this.f73607c = num;
    }

    public final int a() {
        return this.f73606b;
    }

    public final a b() {
        return this.f73605a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j10 = (J) obj;
        return this.f73605a == j10.f73605a && this.f73606b == j10.f73606b && C17542s.e(this.f73607c, j10.f73607c);
    }

    public int hashCode() {
        int hashCode = ((this.f73605a.hashCode() * 31) + Integer.hashCode(this.f73606b)) * 31;
        Integer num = this.f73607c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        a aVar = this.f73605a;
        int i10 = this.f73606b;
        Integer num = this.f73607c;
        return "ItemAvailability(status=" + aVar + ", requestedQuantity=" + i10 + ", availableQuantity=" + num + ")";
    }
}
