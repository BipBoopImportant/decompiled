package ei;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import zr.C12550a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lei/B;", "", "Lzr/a;", "firstInspirationFeed", "", "vugcInspirationOnPip", "<init>", "(Lzr/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lzr/a;", "()Lzr/a;", "b", "Z", "getVugcInspirationOnPip", "()Z", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class B {

    /* renamed from: a  reason: collision with root package name */
    private final C12550a f72730a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f72731b;

    public B(C12550a aVar, boolean z10) {
        C17542s.j(aVar, "firstInspirationFeed");
        this.f72730a = aVar;
        this.f72731b = z10;
    }

    public final C12550a a() {
        return this.f72730a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return C17542s.e(this.f72730a, b10.f72730a) && this.f72731b == b10.f72731b;
    }

    public int hashCode() {
        return (this.f72730a.hashCode() * 31) + Boolean.hashCode(this.f72731b);
    }

    public String toString() {
        C12550a aVar = this.f72730a;
        boolean z10 = this.f72731b;
        return "InspireImagesDelegateModel(firstInspirationFeed=" + aVar + ", vugcInspirationOnPip=" + z10 + ")";
    }
}
