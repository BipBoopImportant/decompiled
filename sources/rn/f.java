package Rn;

import Nn.F;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"LRn/f;", "", "", "paymentContextId", "orderNumber", "LRn/h;", "paymentResultStatus", "", "amountLeftToPay", "", "LNn/F;", "transactions", "<init>", "(Ljava/lang/String;Ljava/lang/String;LRn/h;DLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "LRn/h;", "d", "()LRn/h;", "D", "()D", "e", "Ljava/util/List;", "()Ljava/util/List;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f86892a;

    /* renamed from: b  reason: collision with root package name */
    private final String f86893b;

    /* renamed from: c  reason: collision with root package name */
    private final h f86894c;

    /* renamed from: d  reason: collision with root package name */
    private final double f86895d;

    /* renamed from: e  reason: collision with root package name */
    private final List<F> f86896e;

    public f(String str, String str2, h hVar, double d10, List<? extends F> list) {
        C17542s.j(str, "paymentContextId");
        C17542s.j(hVar, "paymentResultStatus");
        C17542s.j(list, "transactions");
        this.f86892a = str;
        this.f86893b = str2;
        this.f86894c = hVar;
        this.f86895d = d10;
        this.f86896e = list;
    }

    public final double a() {
        return this.f86895d;
    }

    public final String b() {
        return this.f86893b;
    }

    public final String c() {
        return this.f86892a;
    }

    public final h d() {
        return this.f86894c;
    }

    public final List<F> e() {
        return this.f86896e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return C17542s.e(this.f86892a, fVar.f86892a) && C17542s.e(this.f86893b, fVar.f86893b) && this.f86894c == fVar.f86894c && Double.compare(this.f86895d, fVar.f86895d) == 0 && C17542s.e(this.f86896e, fVar.f86896e);
    }

    public int hashCode() {
        int hashCode = this.f86892a.hashCode() * 31;
        String str = this.f86893b;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f86894c.hashCode()) * 31) + Double.hashCode(this.f86895d)) * 31) + this.f86896e.hashCode();
    }

    public String toString() {
        String str = this.f86892a;
        String str2 = this.f86893b;
        h hVar = this.f86894c;
        double d10 = this.f86895d;
        List<F> list = this.f86896e;
        return "PaymentResultHolder(paymentContextId=" + str + ", orderNumber=" + str2 + ", paymentResultStatus=" + hVar + ", amountLeftToPay=" + d10 + ", transactions=" + list + ")";
    }
}
