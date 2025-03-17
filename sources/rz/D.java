package rz;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lrz/D;", "", "", "couponCode", "", "validated", "Lrz/W;", "skippedCoupon", "<init>", "(Ljava/lang/String;ZLrz/W;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "Lrz/W;", "()Lrz/W;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class D {

    /* renamed from: a  reason: collision with root package name */
    private final String f130718a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f130719b;

    /* renamed from: c  reason: collision with root package name */
    private final W f130720c;

    public D(String str, boolean z10, W w10) {
        C17542s.j(str, "couponCode");
        this.f130718a = str;
        this.f130719b = z10;
        this.f130720c = w10;
    }

    public final String a() {
        return this.f130718a;
    }

    public final W b() {
        return this.f130720c;
    }

    public final boolean c() {
        return this.f130719b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return C17542s.e(this.f130718a, d10.f130718a) && this.f130719b == d10.f130719b && C17542s.e(this.f130720c, d10.f130720c);
    }

    public int hashCode() {
        int hashCode = ((this.f130718a.hashCode() * 31) + Boolean.hashCode(this.f130719b)) * 31;
        W w10 = this.f130720c;
        return hashCode + (w10 == null ? 0 : w10.hashCode());
    }

    public String toString() {
        String str = this.f130718a;
        boolean z10 = this.f130719b;
        W w10 = this.f130720c;
        return "ScanAndGoCoupon(couponCode=" + str + ", validated=" + z10 + ", skippedCoupon=" + w10 + ")";
    }
}
