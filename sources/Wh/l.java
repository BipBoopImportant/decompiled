package wh;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lwh/l;", "", "Lwh/o;", "deliveryService", "Lwh/q;", "type", "<init>", "(Lwh/o;Lwh/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwh/o;", "()Lwh/o;", "b", "Lwh/q;", "()Lwh/q;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final o f77670a;

    /* renamed from: b  reason: collision with root package name */
    private final q f77671b;

    public l(o oVar, q qVar) {
        C17542s.j(oVar, "deliveryService");
        C17542s.j(qVar, "type");
        this.f77670a = oVar;
        this.f77671b = qVar;
    }

    public final o a() {
        return this.f77670a;
    }

    public final q b() {
        return this.f77671b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return C17542s.e(this.f77670a, lVar.f77670a) && this.f77671b == lVar.f77671b;
    }

    public int hashCode() {
        return (this.f77670a.hashCode() * 31) + this.f77671b.hashCode();
    }

    public String toString() {
        o oVar = this.f77670a;
        q qVar = this.f77671b;
        return "SelectDeliveryAndServicesInput(deliveryService=" + oVar + ", type=" + qVar + ")";
    }
}
