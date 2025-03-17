package rz;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lrz/M;", "", "", "coupon", "Lrz/X;", "reason", "<init>", "(Ljava/lang/String;Lrz/X;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lrz/X;", "()Lrz/X;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class M {

    /* renamed from: a  reason: collision with root package name */
    private final String f130761a;

    /* renamed from: b  reason: collision with root package name */
    private final X f130762b;

    public M(String str, X x10) {
        C17542s.j(str, "coupon");
        C17542s.j(x10, "reason");
        this.f130761a = str;
        this.f130762b = x10;
    }

    public final String a() {
        return this.f130761a;
    }

    public final X b() {
        return this.f130762b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return C17542s.e(this.f130761a, m10.f130761a) && this.f130762b == m10.f130762b;
    }

    public int hashCode() {
        return (this.f130761a.hashCode() * 31) + this.f130762b.hashCode();
    }

    public String toString() {
        String str = this.f130761a;
        X x10 = this.f130762b;
        return "ScanAndGoSkippedCoupon(coupon=" + str + ", reason=" + x10 + ")";
    }
}
