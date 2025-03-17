package N0;

import c2.d;
import c2.h;
import kotlin.Metadata;
import o1.C5667g;
import o1.C5668h;
import o1.C5673m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\b\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Lo1/m;", "size", "", "b", "(J)F", "Lc2/d;", "", "bounded", "a", "(Lc2/d;ZJ)F", "Lc2/h;", "F", "BoundedRippleExtraRadius", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final float f9227a = h.B((float) 10);

    public static final float a(d dVar, boolean z10, long j10) {
        float k10 = C5667g.k(C5668h.a(C5673m.l(j10), C5673m.i(j10))) / 2.0f;
        return z10 ? k10 + dVar.H1(f9227a) : k10;
    }

    public static final float b(long j10) {
        return Math.max(C5673m.l(j10), C5673m.i(j10)) * 0.3f;
    }
}
