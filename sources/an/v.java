package An;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LAn/v;", "LAn/o;", "", "title", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "h", "", "c", "J", "f", "()J", "stableId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends o {

    /* renamed from: a  reason: collision with root package name */
    private final String f79039a;

    /* renamed from: b  reason: collision with root package name */
    private final String f79040b;

    /* renamed from: c  reason: collision with root package name */
    private final long f79041c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(String str, String str2) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "title");
        C17542s.j(str2, "url");
        this.f79039a = str;
        this.f79040b = str2;
        U u10 = new U(3);
        u10.a(P.b(v.class));
        u10.a(str);
        u10.b(new Object[]{str2});
        this.f79041c = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return C17542s.e(this.f79039a, vVar.f79039a) && C17542s.e(this.f79040b, vVar.f79040b);
    }

    public long f() {
        return this.f79041c;
    }

    public final String g() {
        return this.f79039a;
    }

    public final String h() {
        return this.f79040b;
    }

    public int hashCode() {
        return (this.f79039a.hashCode() * 31) + this.f79040b.hashCode();
    }

    public String toString() {
        String str = this.f79039a;
        String str2 = this.f79040b;
        return "WebViewHeroUiModel(title=" + str + ", url=" + str2 + ")";
    }
}
