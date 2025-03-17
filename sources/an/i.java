package An;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LAn/i;", "LAn/o;", "", "id", "", "isSearch", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Z", "g", "()Z", "", "c", "J", "f", "()J", "stableId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    private final String f79004a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f79005b;

    /* renamed from: c  reason: collision with root package name */
    private final long f79006c = ((long) Objects.hash(new Object[]{P.b(i.class)}));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str, boolean z10) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "id");
        this.f79004a = str;
        this.f79005b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C17542s.e(this.f79004a, iVar.f79004a) && this.f79005b == iVar.f79005b;
    }

    public long f() {
        return this.f79006c;
    }

    public final boolean g() {
        return this.f79005b;
    }

    public final String getId() {
        return this.f79004a;
    }

    public int hashCode() {
        return (this.f79004a.hashCode() * 31) + Boolean.hashCode(this.f79005b);
    }

    public String toString() {
        String str = this.f79004a;
        boolean z10 = this.f79005b;
        return "EmptyResultHeaderUiModel(id=" + str + ", isSearch=" + z10 + ")";
    }
}
