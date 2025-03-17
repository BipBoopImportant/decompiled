package np;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lnp/a;", "", "Lnp/a$a;", "type", "", "amount", "<init>", "(Lnp/a$a;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnp/a$a;", "b", "()Lnp/a$a;", "D", "()D", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: np.a  reason: case insensitive filesystem */
public final class C11664a {

    /* renamed from: a  reason: collision with root package name */
    private final C2303a f99975a;

    /* renamed from: b  reason: collision with root package name */
    private final double f99976b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lnp/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "ECO", "WEEE", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: np.a$a  reason: collision with other inner class name */
    public enum C2303a {
        ECO,
        WEEE;

        static {
            C2303a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public C11664a(C2303a aVar, double d10) {
        C17542s.j(aVar, "type");
        this.f99975a = aVar;
        this.f99976b = d10;
    }

    public final double a() {
        return this.f99976b;
    }

    public final C2303a b() {
        return this.f99975a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11664a)) {
            return false;
        }
        C11664a aVar = (C11664a) obj;
        return this.f99975a == aVar.f99975a && Double.compare(this.f99976b, aVar.f99976b) == 0;
    }

    public int hashCode() {
        return (this.f99975a.hashCode() * 31) + Double.hashCode(this.f99976b);
    }

    public String toString() {
        C2303a aVar = this.f99975a;
        double d10 = this.f99976b;
        return "EnvironmentalFee(type=" + aVar + ", amount=" + d10 + ")";
    }
}
