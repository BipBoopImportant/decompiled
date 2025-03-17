package N1;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"LN1/Q;", "", "LN1/G;", "style", "focusedStyle", "hoveredStyle", "pressedStyle", "<init>", "(LN1/G;LN1/G;LN1/G;LN1/G;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "LN1/G;", "d", "()LN1/G;", "b", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Q {

    /* renamed from: a  reason: collision with root package name */
    private final G f9407a;

    /* renamed from: b  reason: collision with root package name */
    private final G f9408b;

    /* renamed from: c  reason: collision with root package name */
    private final G f9409c;

    /* renamed from: d  reason: collision with root package name */
    private final G f9410d;

    public Q() {
        this((G) null, (G) null, (G) null, (G) null, 15, (DefaultConstructorMarker) null);
    }

    public final G a() {
        return this.f9408b;
    }

    public final G b() {
        return this.f9409c;
    }

    public final G c() {
        return this.f9410d;
    }

    public final G d() {
        return this.f9407a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return C17542s.e(this.f9407a, q10.f9407a) && C17542s.e(this.f9408b, q10.f9408b) && C17542s.e(this.f9409c, q10.f9409c) && C17542s.e(this.f9410d, q10.f9410d);
    }

    public int hashCode() {
        G g10 = this.f9407a;
        int i10 = 0;
        int hashCode = (g10 != null ? g10.hashCode() : 0) * 31;
        G g11 = this.f9408b;
        int hashCode2 = (hashCode + (g11 != null ? g11.hashCode() : 0)) * 31;
        G g12 = this.f9409c;
        int hashCode3 = (hashCode2 + (g12 != null ? g12.hashCode() : 0)) * 31;
        G g13 = this.f9410d;
        if (g13 != null) {
            i10 = g13.hashCode();
        }
        return hashCode3 + i10;
    }

    public Q(G g10, G g11, G g12, G g13) {
        this.f9407a = g10;
        this.f9408b = g11;
        this.f9409c = g12;
        this.f9410d = g13;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(G g10, G g11, G g12, G g13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : g10, (i10 & 2) != 0 ? null : g11, (i10 & 4) != 0 ? null : g12, (i10 & 8) != 0 ? null : g13);
    }
}
