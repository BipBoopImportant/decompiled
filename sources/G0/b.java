package G0;

import B0.M;
import Y1.t;
import c2.C5267b;
import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a2\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Lc2/b;", "constraints", "", "softWrap", "LY1/t;", "overflow", "", "maxIntrinsicWidth", "a", "(JZIF)J", "", "c", "(JZIF)I", "maxLinesIn", "b", "(ZII)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final long a(long j10, boolean z10, int i10, float f10) {
        return C5267b.f23024b.b(0, c(j10, z10, i10, f10), 0, C5267b.k(j10));
    }

    public static final int b(boolean z10, int i10, int i11) {
        if (z10 || !t.e(i10, t.f14827a.b())) {
            return C17978n.e(i11, 1);
        }
        return 1;
    }

    public static final int c(long j10, boolean z10, int i10, float f10) {
        int l10 = ((z10 || t.e(i10, t.f14827a.b())) && C5267b.h(j10)) ? C5267b.l(j10) : Integer.MAX_VALUE;
        return C5267b.n(j10) == l10 ? l10 : C17978n.m(M.a(f10), C5267b.n(j10), l10);
    }
}
