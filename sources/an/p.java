package An;

import KJ.C15987c;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LAn/p;", "LAn/o;", "LKJ/c;", "", "publisherDiagnostics", "<init>", "(LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "g", "()LKJ/c;", "", "b", "J", "f", "()J", "stableId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p extends o {

    /* renamed from: a  reason: collision with root package name */
    private final C15987c<String> f79026a;

    /* renamed from: b  reason: collision with root package name */
    private final long f79027b = ((long) Objects.hash(new Object[]{P.b(p.class)}));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(C15987c<String> cVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(cVar, "publisherDiagnostics");
        this.f79026a = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && C17542s.e(this.f79026a, ((p) obj).f79026a);
    }

    public long f() {
        return this.f79027b;
    }

    public final C15987c<String> g() {
        return this.f79026a;
    }

    public int hashCode() {
        return this.f79026a.hashCode();
    }

    public String toString() {
        C15987c<String> cVar = this.f79026a;
        return "PublisherDiagnosticsUiModel(publisherDiagnostics=" + cVar + ")";
    }
}
