package H0;

import H0.C4538p;
import N1.P;
import c2.r;
import java.util.Comparator;
import kotlin.Metadata;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a6\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u0012\u001a\u00020\u0010*\u00020\u000b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0006`\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\"\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019\u001a#\u0010\u001c\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"\u001a\"\u0010#\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"LH0/D;", "LN1/P;", "textLayoutResult", "Lo1/g;", "localPosition", "previousHandlePosition", "", "selectableId", "LXH/N;", "a", "(LH0/D;LN1/P;JJJ)V", "LH0/p$a;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "selectableIdOrderingComparator", "currentSelectableId", "", "currentTextLength", "e", "(LH0/p$a;Ljava/util/Comparator;JI)I", "position", "Lo1/i;", "bounds", "LH0/f;", "f", "(JLo1/i;)LH0/f;", "g", "anchorSelectableId", "c", "(LH0/D;JJ)LH0/f;", "currentDirection", "otherDirection", "", "h", "(LH0/f;LH0/f;)Z", "d", "(JLN1/P;)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.l  reason: case insensitive filesystem */
public final class C4534l {
    public static final void a(D d10, P p10, long j10, long j11, long j12) {
        C4528f fVar;
        C4528f fVar2;
        C4528f fVar3;
        C4528f fVar4;
        C4528f fVar5;
        int i10;
        int i11;
        C4538p.a e10;
        C4538p.a c10;
        P p11 = p10;
        long j13 = j10;
        long j14 = j12;
        C5669i iVar = new C5669i(0.0f, 0.0f, (float) r.h(p10.B()), (float) r.g(p10.B()));
        C4528f f10 = f(j13, iVar);
        C4528f g10 = g(j13, iVar);
        if (d10.h()) {
            C4538p f11 = d10.f();
            fVar5 = b(f10, g10, d10, j12, f11 != null ? f11.c() : null);
            fVar2 = fVar5;
            fVar = fVar2;
            fVar4 = f10;
            fVar3 = g10;
        } else {
            C4538p f12 = d10.f();
            fVar5 = b(f10, g10, d10, j12, f12 != null ? f12.e() : null);
            fVar4 = fVar5;
            fVar3 = fVar4;
            fVar2 = f10;
            fVar = g10;
        }
        if (h(E.f(f10, g10), fVar5)) {
            int length = p10.l().j().length();
            if (d10.h()) {
                int d11 = d(j13, p10);
                C4538p f13 = d10.f();
                i11 = d11;
                i10 = (f13 == null || (c10 = f13.c()) == null) ? d11 : e(c10, d10.g(), j14, length);
            } else {
                int d12 = d(j13, p10);
                C4538p f14 = d10.f();
                i10 = d12;
                i11 = (f14 == null || (e10 = f14.e()) == null) ? d12 : e(e10, d10.g(), j14, length);
            }
            d10.a(j12, i11, fVar4, fVar3, i10, fVar2, fVar, C5668h.d(j11) ? -1 : d(j11, p10), p10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r4 = c(r4, r7.e(), r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final H0.C4528f b(H0.C4528f r2, H0.C4528f r3, H0.D r4, long r5, H0.C4538p.a r7) {
        /*
            if (r7 == 0) goto L_0x000d
            long r0 = r7.e()
            H0.f r4 = c(r4, r0, r5)
            if (r4 == 0) goto L_0x000d
            goto L_0x0011
        L_0x000d:
            H0.f r4 = H0.E.f(r2, r3)
        L_0x0011:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.C4534l.b(H0.f, H0.f, H0.D, long, H0.p$a):H0.f");
    }

    private static final C4528f c(D d10, long j10, long j11) {
        int compare = d10.g().compare(Long.valueOf(j10), Long.valueOf(j11));
        return compare < 0 ? C4528f.BEFORE : compare > 0 ? C4528f.AFTER : C4528f.ON;
    }

    private static final int d(long j10, P p10) {
        if (C5667g.n(j10) <= 0.0f) {
            return 0;
        }
        return C5667g.n(j10) >= p10.w().h() ? p10.l().j().length() : p10.x(j10);
    }

    private static final int e(C4538p.a aVar, Comparator<Long> comparator, long j10, int i10) {
        int compare = comparator.compare(Long.valueOf(aVar.e()), Long.valueOf(j10));
        if (compare < 0) {
            return 0;
        }
        return compare > 0 ? i10 : aVar.d();
    }

    private static final C4528f f(long j10, C5669i iVar) {
        return C5667g.m(j10) < iVar.o() ? C4528f.BEFORE : C5667g.m(j10) > iVar.p() ? C4528f.AFTER : C4528f.ON;
    }

    private static final C4528f g(long j10, C5669i iVar) {
        return C5667g.n(j10) < iVar.r() ? C4528f.BEFORE : C5667g.n(j10) > iVar.j() ? C4528f.AFTER : C4528f.ON;
    }

    private static final boolean h(C4528f fVar, C4528f fVar2) {
        return fVar == C4528f.ON || fVar != fVar2;
    }
}
