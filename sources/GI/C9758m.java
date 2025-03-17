package gi;

import com.ingka.ikea.core.model.product.Measurements;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import xB.C15201a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lgi/m;", "Lgi/N;", "LxB/a;", "Lcom/ingka/ikea/core/model/product/Measurements;", "measurements", "", "isSectionExpanded", "<init>", "(Lcom/ingka/ikea/core/model/product/Measurements;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/product/Measurements;", "g", "()Lcom/ingka/ikea/core/model/product/Measurements;", "b", "Z", "h", "()Z", "", "c", "J", "f", "()J", "stableId", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gi.m  reason: case insensitive filesystem */
public final class C9758m implements N, C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final Measurements f73437a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f73438b;

    /* renamed from: c  reason: collision with root package name */
    private final long f73439c = ((long) Objects.hash(new Object[]{P.b(C9758m.class)}));

    public C9758m(Measurements measurements, boolean z10) {
        C17542s.j(measurements, "measurements");
        this.f73437a = measurements;
        this.f73438b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9758m)) {
            return false;
        }
        C9758m mVar = (C9758m) obj;
        return C17542s.e(this.f73437a, mVar.f73437a) && this.f73438b == mVar.f73438b;
    }

    public long f() {
        return this.f73439c;
    }

    public final Measurements g() {
        return this.f73437a;
    }

    public final boolean h() {
        return this.f73438b;
    }

    public int hashCode() {
        return (this.f73437a.hashCode() * 31) + Boolean.hashCode(this.f73438b);
    }

    public String toString() {
        Measurements measurements = this.f73437a;
        boolean z10 = this.f73438b;
        return "MeasurementsDelegateModel(measurements=" + measurements + ", isSectionExpanded=" + z10 + ")";
    }
}
