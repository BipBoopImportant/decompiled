package B0;

import N1.A;
import N1.C4669d;
import N1.Y;
import S1.C4820m;
import Y1.t;
import c2.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001av\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"", "", "a", "(F)I", "LB0/L;", "current", "LN1/d;", "text", "LN1/Y;", "style", "Lc2/d;", "density", "LS1/m$b;", "fontFamilyResolver", "", "softWrap", "LY1/t;", "overflow", "maxLines", "minLines", "", "LN1/d$c;", "LN1/A;", "placeholders", "b", "(LB0/L;LN1/d;LN1/Y;Lc2/d;LS1/m$b;ZIIILjava/util/List;)LB0/L;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class M {
    public static final int a(float f10) {
        return Math.round((float) Math.ceil((double) f10));
    }

    public static final L b(L l10, C4669d dVar, Y y10, d dVar2, C4820m.b bVar, boolean z10, int i10, int i11, int i12, List<C4669d.c<A>> list) {
        C4669d dVar3 = dVar;
        if (C17542s.e(l10.k(), dVar)) {
            Y y11 = y10;
            if (C17542s.e(l10.j(), y10)) {
                if (l10.i() != z10) {
                    d dVar4 = dVar2;
                    C4820m.b bVar2 = bVar;
                    int i13 = i10;
                    int i14 = i11;
                    int i15 = i12;
                } else if (!t.e(l10.g(), i10)) {
                    d dVar5 = dVar2;
                    C4820m.b bVar3 = bVar;
                    int i142 = i11;
                    int i152 = i12;
                } else if (l10.d() == i11) {
                    if (l10.e() == i12) {
                        d dVar6 = dVar2;
                        if (C17542s.e(l10.a(), dVar2)) {
                            if (!C17542s.e(l10.h(), list)) {
                                C4820m.b bVar4 = bVar;
                            } else if (l10.b() == bVar) {
                                return l10;
                            }
                            return new L(dVar, y10, i11, i12, z10, i10, dVar2, bVar, list, (DefaultConstructorMarker) null);
                        }
                    } else {
                        d dVar7 = dVar2;
                    }
                    C4820m.b bVar5 = bVar;
                } else {
                    d dVar8 = dVar2;
                    C4820m.b bVar6 = bVar;
                    int i1522 = i12;
                }
            }
            d dVar9 = dVar2;
            C4820m.b bVar7 = bVar;
            boolean z11 = z10;
            int i132 = i10;
            int i1422 = i11;
            int i15222 = i12;
        } else {
            Y y12 = y10;
            d dVar92 = dVar2;
            C4820m.b bVar72 = bVar;
            boolean z112 = z10;
            int i1322 = i10;
            int i14222 = i11;
            int i152222 = i12;
        }
        List<C4669d.c<A>> list2 = list;
        return new L(dVar, y10, i11, i12, z10, i10, dVar2, bVar, list, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ L c(L l10, C4669d dVar, Y y10, d dVar2, C4820m.b bVar, boolean z10, int i10, int i11, int i12, List list, int i13, Object obj) {
        int i14 = i13;
        return b(l10, dVar, y10, dVar2, bVar, (i14 & 32) != 0 ? true : z10, (i14 & 64) != 0 ? t.f14827a.a() : i10, (i14 & 128) != 0 ? Integer.MAX_VALUE : i11, (i14 & 256) != 0 ? 1 : i12, list);
    }
}
