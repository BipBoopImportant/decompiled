package My;

import Dy.C0;
import Dy.G;
import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LMy/d;", "", "LDy/G;", "checkoutButton", "LDy/C0;", "scannerIconButton", "<init>", "(LDy/G;LDy/C0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LDy/G;", "()LDy/G;", "b", "LDy/C0;", "()LDy/C0;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final int f112103c = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final G f112104a;

    /* renamed from: b  reason: collision with root package name */
    private final C0 f112105b;

    public d() {
        this((G) null, (C0) null, 3, (DefaultConstructorMarker) null);
    }

    public final G a() {
        return this.f112104a;
    }

    public final C0 b() {
        return this.f112105b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return C17542s.e(this.f112104a, dVar.f112104a) && C17542s.e(this.f112105b, dVar.f112105b);
    }

    public int hashCode() {
        return (this.f112104a.hashCode() * 31) + this.f112105b.hashCode();
    }

    public String toString() {
        G g10 = this.f112104a;
        C0 c02 = this.f112105b;
        return "CartFooterButtonUiState(checkoutButton=" + g10 + ", scannerIconButton=" + c02 + ")";
    }

    public d(G g10, C0 c02) {
        C17542s.j(g10, "checkoutButton");
        C17542s.j(c02, "scannerIconButton");
        this.f112104a = g10;
        this.f112105b = c02;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(G g10, C0 c02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new G.b(0, 1, (DefaultConstructorMarker) null) : g10, (i10 & 2) != 0 ? C0.a.f109111a : c02);
    }
}
