package Op;

import com.ingka.ikea.core.model.inspiration.Coordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"LOp/f1;", "", "Lcom/ingka/ikea/core/model/inspiration/Coordinates;", "coordinates", "LOp/d1;", "productItemUiModel", "", "showImageSwipeNudge", "<init>", "(Lcom/ingka/ikea/core/model/inspiration/Coordinates;LOp/d1;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/inspiration/Coordinates;", "()Lcom/ingka/ikea/core/model/inspiration/Coordinates;", "b", "LOp/d1;", "()LOp/d1;", "c", "Z", "()Z", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f1 {

    /* renamed from: d  reason: collision with root package name */
    public static final int f85176d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Coordinates f85177a;

    /* renamed from: b  reason: collision with root package name */
    private final d1 f85178b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f85179c;

    public f1(Coordinates coordinates, d1 d1Var, boolean z10) {
        C17542s.j(d1Var, "productItemUiModel");
        this.f85177a = coordinates;
        this.f85178b = d1Var;
        this.f85179c = z10;
    }

    public final Coordinates a() {
        return this.f85177a;
    }

    public final d1 b() {
        return this.f85178b;
    }

    public final boolean c() {
        return this.f85179c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return C17542s.e(this.f85177a, f1Var.f85177a) && C17542s.e(this.f85178b, f1Var.f85178b) && this.f85179c == f1Var.f85179c;
    }

    public int hashCode() {
        Coordinates coordinates = this.f85177a;
        return ((((coordinates == null ? 0 : coordinates.hashCode()) * 31) + this.f85178b.hashCode()) * 31) + Boolean.hashCode(this.f85179c);
    }

    public String toString() {
        Coordinates coordinates = this.f85177a;
        d1 d1Var = this.f85178b;
        boolean z10 = this.f85179c;
        return "ProductWithCoordinatesUiModel(coordinates=" + coordinates + ", productItemUiModel=" + d1Var + ", showImageSwipeNudge=" + z10 + ")";
    }
}
