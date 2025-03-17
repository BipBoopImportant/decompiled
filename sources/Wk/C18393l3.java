package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"LwK/l3;", "", "LwK/S1;", "colors", "LwK/R1;", "sizes", "LwK/J4;", "loadingAnimationType", "<init>", "(LwK/S1;LwK/R1;LwK/J4;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LwK/S1;", "()LwK/S1;", "b", "LwK/R1;", "c", "()LwK/R1;", "LwK/J4;", "()LwK/J4;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.l3  reason: case insensitive filesystem */
final class C18393l3 {

    /* renamed from: a  reason: collision with root package name */
    private final S1 f151176a;

    /* renamed from: b  reason: collision with root package name */
    private final R1 f151177b;

    /* renamed from: c  reason: collision with root package name */
    private final J4 f151178c;

    public C18393l3(S1 s12, R1 r12, J4 j42) {
        C17542s.j(s12, "colors");
        C17542s.j(r12, "sizes");
        C17542s.j(j42, "loadingAnimationType");
        this.f151176a = s12;
        this.f151177b = r12;
        this.f151178c = j42;
    }

    public final S1 a() {
        return this.f151176a;
    }

    public final J4 b() {
        return this.f151178c;
    }

    public final R1 c() {
        return this.f151177b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18393l3)) {
            return false;
        }
        C18393l3 l3Var = (C18393l3) obj;
        return C17542s.e(this.f151176a, l3Var.f151176a) && C17542s.e(this.f151177b, l3Var.f151177b) && this.f151178c == l3Var.f151178c;
    }

    public int hashCode() {
        return (((this.f151176a.hashCode() * 31) + this.f151177b.hashCode()) * 31) + this.f151178c.hashCode();
    }

    public String toString() {
        S1 s12 = this.f151176a;
        R1 r12 = this.f151177b;
        J4 j42 = this.f151178c;
        return "IconButtonStyle(colors=" + s12 + ", sizes=" + r12 + ", loadingAnimationType=" + j42 + ")";
    }
}
