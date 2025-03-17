package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LwK/t6;", "", "LwK/S1;", "colors", "LwK/R1;", "sizes", "<init>", "(LwK/S1;LwK/R1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LwK/S1;", "()LwK/S1;", "b", "LwK/R1;", "()LwK/R1;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.t6  reason: case insensitive filesystem */
public final class C18492t6 {

    /* renamed from: a  reason: collision with root package name */
    private final S1 f151627a;

    /* renamed from: b  reason: collision with root package name */
    private final R1 f151628b;

    public C18492t6(S1 s12, R1 r12) {
        C17542s.j(s12, "colors");
        C17542s.j(r12, "sizes");
        this.f151627a = s12;
        this.f151628b = r12;
    }

    public final S1 a() {
        return this.f151627a;
    }

    public final R1 b() {
        return this.f151628b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18492t6)) {
            return false;
        }
        C18492t6 t6Var = (C18492t6) obj;
        return C17542s.e(this.f151627a, t6Var.f151627a) && C17542s.e(this.f151628b, t6Var.f151628b);
    }

    public int hashCode() {
        return (this.f151627a.hashCode() * 31) + this.f151628b.hashCode();
    }

    public String toString() {
        S1 s12 = this.f151627a;
        R1 r12 = this.f151628b;
        return "PillStyle(colors=" + s12 + ", sizes=" + r12 + ")";
    }
}
