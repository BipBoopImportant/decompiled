package Q0;

import Q0.o;
import c2.p;
import c2.t;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"LQ0/a;", "LQ0/o$a;", "Li1/c$b;", "menuAlignment", "anchorAlignment", "", "offset", "<init>", "(Li1/c$b;Li1/c$b;I)V", "Lc2/p;", "anchorBounds", "Lc2/r;", "windowSize", "menuWidth", "Lc2/t;", "layoutDirection", "a", "(Lc2/p;JILc2/t;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Li1/c$b;", "b", "c", "I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Q0.a  reason: case insensitive filesystem */
public final class C4792a implements o.a {

    /* renamed from: a  reason: collision with root package name */
    private final C5437c.b f11934a;

    /* renamed from: b  reason: collision with root package name */
    private final C5437c.b f11935b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11936c;

    public C4792a(C5437c.b bVar, C5437c.b bVar2, int i10) {
        this.f11934a = bVar;
        this.f11935b = bVar2;
        this.f11936c = i10;
    }

    public int a(p pVar, long j10, int i10, t tVar) {
        int a10 = this.f11935b.a(0, pVar.p(), tVar);
        return pVar.j() + a10 + (-this.f11934a.a(0, i10, tVar)) + (tVar == t.Ltr ? this.f11936c : -this.f11936c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4792a)) {
            return false;
        }
        C4792a aVar = (C4792a) obj;
        return C17542s.e(this.f11934a, aVar.f11934a) && C17542s.e(this.f11935b, aVar.f11935b) && this.f11936c == aVar.f11936c;
    }

    public int hashCode() {
        return (((this.f11934a.hashCode() * 31) + this.f11935b.hashCode()) * 31) + Integer.hashCode(this.f11936c);
    }

    public String toString() {
        return "Horizontal(menuAlignment=" + this.f11934a + ", anchorAlignment=" + this.f11935b + ", offset=" + this.f11936c + ')';
    }
}
