package G1;

import E1.J;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LG1/r0;", "LG1/n0;", "LE1/J;", "result", "LG1/P;", "placeable", "<init>", "(LE1/J;LG1/P;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LE1/J;", "b", "()LE1/J;", "LG1/P;", "()LG1/P;", "f1", "()Z", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class r0 implements n0 {

    /* renamed from: a  reason: collision with root package name */
    private final J f6577a;

    /* renamed from: b  reason: collision with root package name */
    private final P f6578b;

    public r0(J j10, P p10) {
        this.f6577a = j10;
        this.f6578b = p10;
    }

    public final P a() {
        return this.f6578b;
    }

    public final J b() {
        return this.f6577a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return C17542s.e(this.f6577a, r0Var.f6577a) && C17542s.e(this.f6578b, r0Var.f6578b);
    }

    public boolean f1() {
        return this.f6578b.o1().c();
    }

    public int hashCode() {
        return (this.f6577a.hashCode() * 31) + this.f6578b.hashCode();
    }

    public String toString() {
        return "PlaceableResult(result=" + this.f6577a + ", placeable=" + this.f6578b + ')';
    }
}
