package H0;

import N1.P;
import c2.r;
import kotlin.Metadata;
import o1.C5667g;
import o1.C5668h;
import tI.C17978n;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LN1/P;", "textLayoutResult", "", "offset", "", "isStart", "areHandlesCrossed", "Lo1/g;", "b", "(LN1/P;IZZ)J", "", "a", "(LN1/P;IZZ)F", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class X {
    public static final float a(P p10, int i10, boolean z10, boolean z11) {
        boolean z12 = false;
        if (p10.c(((!z10 || z11) && (z10 || !z11)) ? Math.max(i10 - 1, 0) : i10) == p10.y(i10)) {
            z12 = true;
        }
        return p10.j(i10, z12);
    }

    public static final long b(P p10, int i10, boolean z10, boolean z11) {
        int q10 = p10.q(i10);
        return q10 >= p10.n() ? C5667g.f26701b.b() : C5668h.a(C17978n.l(a(p10, i10, z10, z11), 0.0f, (float) r.h(p10.B())), C17978n.l(p10.m(q10), 0.0f, (float) r.g(p10.B())));
    }
}
