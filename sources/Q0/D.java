package Q0;

import Q0.o;
import c2.p;
import c2.r;
import c2.t;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"LQ0/D;", "LQ0/o$a;", "Li1/c$b;", "alignment", "", "margin", "<init>", "(Li1/c$b;I)V", "Lc2/p;", "anchorBounds", "Lc2/r;", "windowSize", "menuWidth", "Lc2/t;", "layoutDirection", "a", "(Lc2/p;JILc2/t;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Li1/c$b;", "b", "I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class D implements o.a {

    /* renamed from: a  reason: collision with root package name */
    private final C5437c.b f11930a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11931b;

    public D(C5437c.b bVar, int i10) {
        this.f11930a = bVar;
        this.f11931b = i10;
    }

    public int a(p pVar, long j10, int i10, t tVar) {
        return i10 >= r.h(j10) - (this.f11931b * 2) ? C5437c.f24302a.g().a(i10, r.h(j10), tVar) : C17978n.m(this.f11930a.a(i10, r.h(j10), tVar), this.f11931b, (r.h(j10) - this.f11931b) - i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return C17542s.e(this.f11930a, d10.f11930a) && this.f11931b == d10.f11931b;
    }

    public int hashCode() {
        return (this.f11930a.hashCode() * 31) + Integer.hashCode(this.f11931b);
    }

    public String toString() {
        return "Horizontal(alignment=" + this.f11930a + ", margin=" + this.f11931b + ')';
    }
}
