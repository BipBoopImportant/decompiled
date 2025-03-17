package Do;

import ho.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"LDo/n;", "", "", "showSelected", "Lho/b$a;", "deliveryOption", "<init>", "(ZLho/b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lho/b$a;", "()Lho/b$a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f80108a;

    /* renamed from: b  reason: collision with root package name */
    private final b.a f80109b;

    public n(boolean z10, b.a aVar) {
        C17542s.j(aVar, "deliveryOption");
        this.f80108a = z10;
        this.f80109b = aVar;
    }

    public final b.a a() {
        return this.f80109b;
    }

    public final boolean b() {
        return this.f80108a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f80108a == nVar.f80108a && C17542s.e(this.f80109b, nVar.f80109b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f80108a) * 31) + this.f80109b.hashCode();
    }

    public String toString() {
        boolean z10 = this.f80108a;
        b.a aVar = this.f80109b;
        return "ShowPickUpPointData(showSelected=" + z10 + ", deliveryOption=" + aVar + ")";
    }
}
