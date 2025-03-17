package B0;

import N1.A;
import N1.C4669d;
import N1.O;
import N1.P;
import N1.Y;
import S1.C4820m;
import c2.C5267b;
import c2.d;
import c2.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ar\u0010\u0017\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"LN1/P;", "LN1/d;", "text", "LN1/Y;", "style", "", "LN1/d$c;", "LN1/A;", "placeholders", "", "maxLines", "", "softWrap", "LY1/t;", "overflow", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "LS1/m$b;", "fontFamilyResolver", "Lc2/b;", "constraints", "a", "(LN1/P;LN1/d;LN1/Y;Ljava/util/List;IZILc2/d;Lc2/t;LS1/m$b;J)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c0 {
    public static final boolean a(P p10, C4669d dVar, Y y10, List<C4669d.c<A>> list, int i10, boolean z10, int i11, d dVar2, t tVar, C4820m.b bVar, long j10) {
        O l10 = p10.l();
        if (p10.w().j().b() || !C17542s.e(l10.j(), dVar) || !l10.i().G(y10) || !C17542s.e(l10.g(), list) || l10.e() != i10 || l10.h() != z10 || !Y1.t.e(l10.f(), i11) || !C17542s.e(l10.b(), dVar2) || l10.d() != tVar || !C17542s.e(l10.c(), bVar) || C5267b.n(j10) != C5267b.n(l10.a())) {
            return false;
        }
        if (z10 || Y1.t.e(i11, Y1.t.f14827a.b())) {
            return C5267b.l(j10) == C5267b.l(l10.a()) && C5267b.k(j10) == C5267b.k(l10.a());
        }
        return true;
    }
}
