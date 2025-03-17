package N1;

import S1.C4820m;
import Y1.k;
import Y1.t;
import c2.c;
import c2.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5667g;
import o1.C5673m;
import p1.g1;
import r1.d;
import r1.f;
import r1.g;
import r1.h;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aj\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0019\u001a\u00020\u0013*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a&\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lr1/f;", "LN1/S;", "textMeasurer", "", "text", "Lo1/g;", "topLeft", "LN1/Y;", "style", "LY1/t;", "overflow", "", "softWrap", "", "maxLines", "Lo1/m;", "size", "Lp1/d0;", "blendMode", "LXH/N;", "b", "(Lr1/f;LN1/S;Ljava/lang/String;JLN1/Y;IZIJI)V", "Lr1/h;", "LN1/P;", "textLayoutResult", "a", "(Lr1/h;LN1/P;)V", "Lc2/b;", "d", "(Lr1/f;JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class V {
    private static final void a(h hVar, P p10) {
        if (p10.i() && !t.e(p10.l().f(), t.f14827a.c())) {
            h.i(hVar, 0.0f, 0.0f, (float) r.h(p10.B()), (float) r.g(p10.B()), 0, 16, (Object) null);
        }
    }

    public static final void b(f fVar, S s10, String str, long j10, Y y10, int i10, boolean z10, int i11, long j11, int i12) {
        S s11 = s10;
        C4669d dVar = new C4669d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null);
        Y y11 = y10;
        int i13 = i10;
        boolean z11 = z10;
        int i14 = i11;
        P d10 = S.d(s11, dVar, y11, i13, z11, i14, (List) null, d(fVar, j11, j10), fVar.getLayoutDirection(), fVar, (C4820m.b) null, false, 1568, (Object) null);
        d I12 = fVar.I1();
        long b10 = I12.b();
        I12.e().t();
        try {
            h c10 = I12.c();
            c10.d(C5667g.m(j10), C5667g.n(j10));
            a(c10, d10);
            C4679n.D(d10.w(), fVar.I1().e(), 0, (g1) null, (k) null, (g) null, i12, 30, (Object) null);
        } finally {
            I12.e().n();
            I12.g(b10);
        }
    }

    public static /* synthetic */ void c(f fVar, S s10, String str, long j10, Y y10, int i10, boolean z10, int i11, long j11, int i12, int i13, Object obj) {
        int i14 = i13;
        b(fVar, s10, str, (i14 & 4) != 0 ? C5667g.f26701b.c() : j10, (i14 & 8) != 0 ? Y.f9422d.a() : y10, (i14 & 16) != 0 ? t.f14827a.a() : i10, (i14 & 32) != 0 ? true : z10, (i14 & 64) != 0 ? Integer.MAX_VALUE : i11, (i14 & 128) != 0 ? C5673m.f26722b.a() : j11, (i14 & 256) != 0 ? f.f28623w0.a() : i12);
    }

    private static final long d(f fVar, long j10, long j11) {
        int i10;
        int i11;
        int i12;
        int i13 = (j10 > 9205357640488583168L ? 1 : (j10 == 9205357640488583168L ? 0 : -1));
        int i14 = 0;
        if (i13 != 0 && !Float.isNaN(C5673m.l(j10))) {
            i11 = Math.round((float) Math.ceil((double) C5673m.l(j10)));
            i10 = i11;
        } else {
            i10 = Math.round((float) Math.ceil((double) (C5673m.l(fVar.b()) - C5667g.m(j11))));
            i11 = 0;
        }
        if (i13 != 0 && !Float.isNaN(C5673m.i(j10))) {
            i14 = Math.round((float) Math.ceil((double) C5673m.i(j10)));
            i12 = i14;
        } else {
            i12 = Math.round((float) Math.ceil((double) (C5673m.i(fVar.b()) - C5667g.n(j11))));
        }
        return c.a(i11, i10, i14, i12);
    }
}
