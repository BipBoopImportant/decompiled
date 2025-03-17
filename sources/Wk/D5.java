package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LwK/D5;", "", "LwK/f5;", "colors", "LwK/C5;", "sizes", "<init>", "(LwK/f5;LwK/C5;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LwK/f5;", "()LwK/f5;", "b", "LwK/C5;", "()LwK/C5;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class D5 {

    /* renamed from: a  reason: collision with root package name */
    private final C18323f5 f149410a;

    /* renamed from: b  reason: collision with root package name */
    private final C5 f149411b;

    public D5(C18323f5 f5Var, C5 c52) {
        C17542s.j(f5Var, "colors");
        C17542s.j(c52, "sizes");
        this.f149410a = f5Var;
        this.f149411b = c52;
    }

    public final C18323f5 a() {
        return this.f149410a;
    }

    public final C5 b() {
        return this.f149411b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D5)) {
            return false;
        }
        D5 d52 = (D5) obj;
        return C17542s.e(this.f149410a, d52.f149410a) && C17542s.e(this.f149411b, d52.f149411b);
    }

    public int hashCode() {
        return (this.f149410a.hashCode() * 31) + this.f149411b.hashCode();
    }

    public String toString() {
        C18323f5 f5Var = this.f149410a;
        C5 c52 = this.f149411b;
        return "MemberCardStyle(colors=" + f5Var + ", sizes=" + c52 + ")";
    }
}
