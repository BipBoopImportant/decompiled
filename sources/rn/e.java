package Rn;

import Nn.C10806i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"LRn/e;", "", "", "orderNumber", "paymentContextId", "", "amountLeftToPay", "", "LNn/i$a;", "giftCardHolders", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "D", "()D", "Ljava/util/List;", "()Ljava/util/List;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f86888a;

    /* renamed from: b  reason: collision with root package name */
    private final String f86889b;

    /* renamed from: c  reason: collision with root package name */
    private final double f86890c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C10806i.a> f86891d;

    public e(String str, String str2, double d10, List<C10806i.a> list) {
        C17542s.j(str2, "paymentContextId");
        C17542s.j(list, "giftCardHolders");
        this.f86888a = str;
        this.f86889b = str2;
        this.f86890c = d10;
        this.f86891d = list;
    }

    public final double a() {
        return this.f86890c;
    }

    public final List<C10806i.a> b() {
        return this.f86891d;
    }

    public final String c() {
        return this.f86888a;
    }

    public final String d() {
        return this.f86889b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f86888a, eVar.f86888a) && C17542s.e(this.f86889b, eVar.f86889b) && Double.compare(this.f86890c, eVar.f86890c) == 0 && C17542s.e(this.f86891d, eVar.f86891d);
    }

    public int hashCode() {
        String str = this.f86888a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.f86889b.hashCode()) * 31) + Double.hashCode(this.f86890c)) * 31) + this.f86891d.hashCode();
    }

    public String toString() {
        String str = this.f86888a;
        String str2 = this.f86889b;
        double d10 = this.f86890c;
        List<C10806i.a> list = this.f86891d;
        return "PaymentContext(orderNumber=" + str + ", paymentContextId=" + str2 + ", amountLeftToPay=" + d10 + ", giftCardHolders=" + list + ")";
    }
}
