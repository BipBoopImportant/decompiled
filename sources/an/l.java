package An;

import YH.C16877v;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import mp.C11588a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LAn/l;", "LAn/o;", "", "title", "", "Lmp/a;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "", "f", "()J", "stableId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends o {

    /* renamed from: a  reason: collision with root package name */
    private final String f79019a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C11588a> f79020b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(String str, List<C11588a> list) {
        super((DefaultConstructorMarker) null);
        C17542s.j(list, "items");
        this.f79019a = str;
        this.f79020b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return C17542s.e(this.f79019a, lVar.f79019a) && C17542s.e(this.f79020b, lVar.f79020b);
    }

    public long f() {
        String f10 = ((C11588a) C16877v.w0(this.f79020b)).f();
        U u10 = new U(3);
        u10.a(P.b(l.class));
        u10.a(f10);
        u10.b(new Object[0]);
        return (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public final List<C11588a> g() {
        return this.f79020b;
    }

    public final String h() {
        return this.f79019a;
    }

    public int hashCode() {
        String str = this.f79019a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f79020b.hashCode();
    }

    public String toString() {
        String str = this.f79019a;
        List<C11588a> list = this.f79020b;
        return "InspirationPairUiModel(title=" + str + ", items=" + list + ")";
    }
}
