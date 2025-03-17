package p7;

import a7.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lp7/m;", "La7/f;", "", "sctLogId", "logServerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSctLogId", "b", "getLogServerId", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f55432a;

    /* renamed from: b  reason: collision with root package name */
    private final String f55433b;

    public m(String str, String str2) {
        C17542s.j(str, "sctLogId");
        C17542s.j(str2, "logServerId");
        this.f55432a = str;
        this.f55433b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return C17542s.e(this.f55432a, mVar.f55432a) && C17542s.e(this.f55433b, mVar.f55433b);
    }

    public int hashCode() {
        return (this.f55432a.hashCode() * 31) + this.f55433b.hashCode();
    }

    public String toString() {
        return "Log ID of SCT, " + this.f55432a + ", does not match this log's ID, " + this.f55433b;
    }
}
