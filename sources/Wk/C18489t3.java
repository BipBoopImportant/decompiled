package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"LwK/t3;", "", "LwK/S1;", "colors", "LwK/R1;", "sizes", "<init>", "(LwK/S1;LwK/R1;)V", "a", "()LwK/S1;", "b", "()LwK/R1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LwK/S1;", "getColors", "LwK/R1;", "getSizes", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.t3  reason: case insensitive filesystem */
final class C18489t3 {

    /* renamed from: a  reason: collision with root package name */
    private final S1 f151608a;

    /* renamed from: b  reason: collision with root package name */
    private final R1 f151609b;

    public C18489t3(S1 s12, R1 r12) {
        C17542s.j(s12, "colors");
        C17542s.j(r12, "sizes");
        this.f151608a = s12;
        this.f151609b = r12;
    }

    public final S1 a() {
        return this.f151608a;
    }

    public final R1 b() {
        return this.f151609b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18489t3)) {
            return false;
        }
        C18489t3 t3Var = (C18489t3) obj;
        return C17542s.e(this.f151608a, t3Var.f151608a) && C17542s.e(this.f151609b, t3Var.f151609b);
    }

    public int hashCode() {
        return (this.f151608a.hashCode() * 31) + this.f151609b.hashCode();
    }

    public String toString() {
        S1 s12 = this.f151608a;
        R1 r12 = this.f151609b;
        return "IconPillStyle(colors=" + s12 + ", sizes=" + r12 + ")";
    }
}
