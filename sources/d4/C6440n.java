package D4;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"LD4/n;", "", "", "generationId", "LD4/d0;", "hint", "<init>", "(ILD4/d0;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "LD4/d0;", "()LD4/d0;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.n  reason: case insensitive filesystem */
public final class C6440n {

    /* renamed from: a  reason: collision with root package name */
    private final int f34421a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f34422b;

    public C6440n(int i10, d0 d0Var) {
        C17542s.j(d0Var, "hint");
        this.f34421a = i10;
        this.f34422b = d0Var;
    }

    public final int a() {
        return this.f34421a;
    }

    public final d0 b() {
        return this.f34422b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6440n)) {
            return false;
        }
        C6440n nVar = (C6440n) obj;
        return this.f34421a == nVar.f34421a && C17542s.e(this.f34422b, nVar.f34422b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f34421a) * 31) + this.f34422b.hashCode();
    }

    public String toString() {
        return "GenerationalViewportHint(generationId=" + this.f34421a + ", hint=" + this.f34422b + ')';
    }
}
