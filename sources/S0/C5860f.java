package s0;

import androidx.compose.foundation.layout.C5079j;
import c2.C5267b;
import c2.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\f\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000e\u001a\u00020\t*\u00020\tH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR \u0010\u0006\u001a\u00020\u00058\u0016X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001f8VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\u00020\u001f8VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b#\u0010!\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Ls0/f;", "Ls0/e;", "Ls0/c;", "Lc2/d;", "density", "Lc2/b;", "constraints", "<init>", "(Lc2/d;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/d;", "Li1/c;", "alignment", "a", "(Landroidx/compose/ui/d;Li1/c;)Landroidx/compose/ui/d;", "e", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lc2/d;", "b", "J", "()J", "Lc2/h;", "c", "()F", "maxWidth", "d", "maxHeight", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.f  reason: case insensitive filesystem */
final class C5860f implements C5859e, C5857c {

    /* renamed from: a  reason: collision with root package name */
    private final d f28807a;

    /* renamed from: b  reason: collision with root package name */
    private final long f28808b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C5079j f28809c;

    public /* synthetic */ C5860f(d dVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j10);
    }

    public androidx.compose.ui.d a(androidx.compose.ui.d dVar, C5437c cVar) {
        return this.f28809c.a(dVar, cVar);
    }

    public long b() {
        return this.f28808b;
    }

    public float c() {
        return C5267b.h(b()) ? this.f28807a.H(C5267b.l(b())) : h.f23031b.b();
    }

    public float d() {
        return C5267b.g(b()) ? this.f28807a.H(C5267b.k(b())) : h.f23031b.b();
    }

    public androidx.compose.ui.d e(androidx.compose.ui.d dVar) {
        return this.f28809c.e(dVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5860f)) {
            return false;
        }
        C5860f fVar = (C5860f) obj;
        return C17542s.e(this.f28807a, fVar.f28807a) && C5267b.f(this.f28808b, fVar.f28808b);
    }

    public int hashCode() {
        return (this.f28807a.hashCode() * 31) + C5267b.o(this.f28808b);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f28807a + ", constraints=" + C5267b.q(this.f28808b) + ')';
    }

    private C5860f(d dVar, long j10) {
        this.f28807a = dVar;
        this.f28808b = j10;
        this.f28809c = C5079j.f18125a;
    }
}
