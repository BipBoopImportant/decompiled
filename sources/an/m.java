package An;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import mp.C11588a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LAn/m;", "LAn/o;", "", "title", "Lmp/a;", "item", "<init>", "(Ljava/lang/String;Lmp/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "Lmp/a;", "g", "()Lmp/a;", "", "f", "()J", "stableId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends o {

    /* renamed from: a  reason: collision with root package name */
    private final String f79021a;

    /* renamed from: b  reason: collision with root package name */
    private final C11588a f79022b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(String str, C11588a aVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(aVar, "item");
        this.f79021a = str;
        this.f79022b = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return C17542s.e(this.f79021a, mVar.f79021a) && C17542s.e(this.f79022b, mVar.f79022b);
    }

    public long f() {
        String f10 = this.f79022b.f();
        U u10 = new U(3);
        u10.a(P.b(m.class));
        u10.a(f10);
        u10.b(new Object[0]);
        return (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public final C11588a g() {
        return this.f79022b;
    }

    public final String h() {
        return this.f79021a;
    }

    public int hashCode() {
        String str = this.f79021a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f79022b.hashCode();
    }

    public String toString() {
        String str = this.f79021a;
        C11588a aVar = this.f79022b;
        return "InspirationSingleUiModel(title=" + str + ", item=" + aVar + ")";
    }
}
