package Q0;

import Q0.o;
import c2.p;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"LQ0/b;", "LQ0/o$b;", "Li1/c$c;", "menuAlignment", "anchorAlignment", "", "offset", "<init>", "(Li1/c$c;Li1/c$c;I)V", "Lc2/p;", "anchorBounds", "Lc2/r;", "windowSize", "menuHeight", "a", "(Lc2/p;JI)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Li1/c$c;", "b", "c", "I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Q0.b  reason: case insensitive filesystem */
public final class C4793b implements o.b {

    /* renamed from: a  reason: collision with root package name */
    private final C5437c.C0386c f11937a;

    /* renamed from: b  reason: collision with root package name */
    private final C5437c.C0386c f11938b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11939c;

    public C4793b(C5437c.C0386c cVar, C5437c.C0386c cVar2, int i10) {
        this.f11937a = cVar;
        this.f11938b = cVar2;
        this.f11939c = i10;
    }

    public int a(p pVar, long j10, int i10) {
        return pVar.m() + this.f11938b.a(0, pVar.i()) + (-this.f11937a.a(0, i10)) + this.f11939c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4793b)) {
            return false;
        }
        C4793b bVar = (C4793b) obj;
        return C17542s.e(this.f11937a, bVar.f11937a) && C17542s.e(this.f11938b, bVar.f11938b) && this.f11939c == bVar.f11939c;
    }

    public int hashCode() {
        return (((this.f11937a.hashCode() * 31) + this.f11938b.hashCode()) * 31) + Integer.hashCode(this.f11939c);
    }

    public String toString() {
        return "Vertical(menuAlignment=" + this.f11937a + ", anchorAlignment=" + this.f11938b + ", offset=" + this.f11939c + ')';
    }
}
