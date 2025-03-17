package An;

import KJ.C15987c;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LAn/d;", "LAn/o;", "LKJ/c;", "LAn/e;", "categories", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "g", "()LKJ/c;", "", "b", "J", "f", "()J", "stableId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends o {

    /* renamed from: a  reason: collision with root package name */
    private final C15987c<e> f78991a;

    /* renamed from: b  reason: collision with root package name */
    private final long f78992b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(C15987c<e> cVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(cVar, "categories");
        this.f78991a = cVar;
        String valueOf = String.valueOf(cVar.hashCode());
        U u10 = new U(3);
        u10.a(P.b(d.class));
        u10.a(valueOf);
        u10.b(new Object[0]);
        this.f78992b = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && C17542s.e(this.f78991a, ((d) obj).f78991a);
    }

    public long f() {
        return this.f78992b;
    }

    public final C15987c<e> g() {
        return this.f78991a;
    }

    public int hashCode() {
        return this.f78991a.hashCode();
    }

    public String toString() {
        C15987c<e> cVar = this.f78991a;
        return "CategoriesUiModel(categories=" + cVar + ")";
    }
}
