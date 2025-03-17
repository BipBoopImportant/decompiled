package rz;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\n¨\u0006\u0011"}, d2 = {"Lrz/B;", "", "", "salesOrderId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class B {

    /* renamed from: a  reason: collision with root package name */
    private final int f130705a;

    public B(int i10) {
        this.f130705a = i10;
    }

    public final int a() {
        return this.f130705a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && this.f130705a == ((B) obj).f130705a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f130705a);
    }

    public String toString() {
        int i10 = this.f130705a;
        return "ScanAndGoCheckoutSalesOrderDetails(salesOrderId=" + i10 + ")";
    }
}
