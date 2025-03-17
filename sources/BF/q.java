package bf;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lbf/q;", "Lbf/l;", "", "url", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "c", "e", "a", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends l {

    /* renamed from: d  reason: collision with root package name */
    private final String f65450d;

    /* renamed from: e  reason: collision with root package name */
    private final String f65451e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(String str, String str2) {
        super(str, str2, 8, (DefaultConstructorMarker) null);
        C17542s.j(str, "url");
        C17542s.j(str2, "description");
        this.f65450d = str;
        this.f65451e = str2;
    }

    public String a() {
        return this.f65451e;
    }

    public String c() {
        return this.f65450d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return C17542s.e(this.f65450d, qVar.f65450d) && C17542s.e(this.f65451e, qVar.f65451e);
    }

    public int hashCode() {
        return (this.f65450d.hashCode() * 31) + this.f65451e.hashCode();
    }

    public String toString() {
        String str = this.f65450d;
        String str2 = this.f65451e;
        return "Imprint(url=" + str + ", description=" + str2 + ")";
    }
}
