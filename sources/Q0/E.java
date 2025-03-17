package Q0;

import Q0.o;
import c2.p;
import c2.r;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"LQ0/E;", "LQ0/o$b;", "Li1/c$c;", "alignment", "", "margin", "<init>", "(Li1/c$c;I)V", "Lc2/p;", "anchorBounds", "Lc2/r;", "windowSize", "menuHeight", "a", "(Lc2/p;JI)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Li1/c$c;", "b", "I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class E implements o.b {

    /* renamed from: a  reason: collision with root package name */
    private final C5437c.C0386c f11932a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11933b;

    public E(C5437c.C0386c cVar, int i10) {
        this.f11932a = cVar;
        this.f11933b = i10;
    }

    public int a(p pVar, long j10, int i10) {
        return i10 >= r.g(j10) - (this.f11933b * 2) ? C5437c.f24302a.i().a(i10, r.g(j10)) : C17978n.m(this.f11932a.a(i10, r.g(j10)), this.f11933b, (r.g(j10) - this.f11933b) - i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return C17542s.e(this.f11932a, e10.f11932a) && this.f11933b == e10.f11933b;
    }

    public int hashCode() {
        return (this.f11932a.hashCode() * 31) + Integer.hashCode(this.f11933b);
    }

    public String toString() {
        return "Vertical(alignment=" + this.f11932a + ", margin=" + this.f11933b + ')';
    }
}
