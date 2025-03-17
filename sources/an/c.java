package An;

import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kp.C11519a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LAn/c;", "LAn/o;", "", "title", "", "Lkp/a;", "campaigns", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "", "c", "J", "f", "()J", "stableId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends o {

    /* renamed from: a  reason: collision with root package name */
    private final String f78988a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C11519a> f78989b;

    /* renamed from: c  reason: collision with root package name */
    private final long f78990c = ((long) Objects.hash(new Object[]{P.b(c.class)}));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, List<? extends C11519a> list) {
        super((DefaultConstructorMarker) null);
        C17542s.j(list, "campaigns");
        this.f78988a = str;
        this.f78989b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f78988a, cVar.f78988a) && C17542s.e(this.f78989b, cVar.f78989b);
    }

    public long f() {
        return this.f78990c;
    }

    public final List<C11519a> g() {
        return this.f78989b;
    }

    public final String h() {
        return this.f78988a;
    }

    public int hashCode() {
        String str = this.f78988a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f78989b.hashCode();
    }

    public String toString() {
        String str = this.f78988a;
        List<C11519a> list = this.f78989b;
        return "CampaignsUiModel(title=" + str + ", campaigns=" + list + ")";
    }
}
