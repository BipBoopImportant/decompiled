package ni;

import Rl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lni/g;", "", "LRl/e;", "marketConfig", "", "isShareButtonEnabled", "<init>", "(LRl/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LRl/e;", "()LRl/e;", "b", "Z", "()Z", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final e f75669a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f75670b;

    public g(e eVar, boolean z10) {
        this.f75669a = eVar;
        this.f75670b = z10;
    }

    public final e a() {
        return this.f75669a;
    }

    public final boolean b() {
        return this.f75670b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return C17542s.e(this.f75669a, gVar.f75669a) && this.f75670b == gVar.f75670b;
    }

    public int hashCode() {
        e eVar = this.f75669a;
        return ((eVar == null ? 0 : eVar.hashCode()) * 31) + Boolean.hashCode(this.f75670b);
    }

    public String toString() {
        e eVar = this.f75669a;
        boolean z10 = this.f75670b;
        return "PipConfig(marketConfig=" + eVar + ", isShareButtonEnabled=" + z10 + ")";
    }
}
