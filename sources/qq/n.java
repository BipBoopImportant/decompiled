package Qq;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LQq/n;", "LxB/a;", "", "id", "question", "answer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "h", "c", "g", "", "d", "J", "f", "()J", "stableId", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final String f86192a;

    /* renamed from: b  reason: collision with root package name */
    private final String f86193b;

    /* renamed from: c  reason: collision with root package name */
    private final String f86194c;

    /* renamed from: d  reason: collision with root package name */
    private final long f86195d;

    public n(String str, String str2, String str3) {
        C17542s.j(str, "id");
        C17542s.j(str2, "question");
        C17542s.j(str3, "answer");
        this.f86192a = str;
        this.f86193b = str2;
        this.f86194c = str3;
        U u10 = new U(3);
        u10.a(P.b(n.class));
        u10.a(str);
        u10.b(new Object[0]);
        this.f86195d = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return C17542s.e(this.f86192a, nVar.f86192a) && C17542s.e(this.f86193b, nVar.f86193b) && C17542s.e(this.f86194c, nVar.f86194c);
    }

    public long f() {
        return this.f86195d;
    }

    public final String g() {
        return this.f86194c;
    }

    public final String getId() {
        return this.f86192a;
    }

    public final String h() {
        return this.f86193b;
    }

    public int hashCode() {
        return (((this.f86192a.hashCode() * 31) + this.f86193b.hashCode()) * 31) + this.f86194c.hashCode();
    }

    public String toString() {
        String str = this.f86192a;
        String str2 = this.f86193b;
        String str3 = this.f86194c;
        return "FamilyRewardsFAQQuestions(id=" + str + ", question=" + str2 + ", answer=" + str3 + ")";
    }
}
