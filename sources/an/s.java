package An;

import KJ.C15987c;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LAn/s;", "LAn/o;", "", "title", "LKJ/c;", "suggestions", "<init>", "(Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "LKJ/c;", "g", "()LKJ/c;", "", "c", "J", "f", "()J", "stableId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s extends o {

    /* renamed from: a  reason: collision with root package name */
    private final String f79031a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<String> f79032b;

    /* renamed from: c  reason: collision with root package name */
    private final long f79033c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(String str, C15987c<String> cVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "title");
        C17542s.j(cVar, "suggestions");
        this.f79031a = str;
        this.f79032b = cVar;
        U u10 = new U(3);
        u10.a(P.b(s.class));
        u10.a(str);
        u10.b(new Object[0]);
        this.f79033c = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return C17542s.e(this.f79031a, sVar.f79031a) && C17542s.e(this.f79032b, sVar.f79032b);
    }

    public long f() {
        return this.f79033c;
    }

    public final C15987c<String> g() {
        return this.f79032b;
    }

    public final String h() {
        return this.f79031a;
    }

    public int hashCode() {
        return (this.f79031a.hashCode() * 31) + this.f79032b.hashCode();
    }

    public String toString() {
        String str = this.f79031a;
        C15987c<String> cVar = this.f79032b;
        return "SuggestionsUiModel(title=" + str + ", suggestions=" + cVar + ")";
    }
}
