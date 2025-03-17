package Kv;

import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.draw.b;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m1.i;
import nI.C17631a;
import o1.C5662b;
import o1.C5668h;
import o1.C5670j;
import o1.C5671k;
import o1.C5672l;
import o1.C5673m;
import o1.C5674n;
import p1.C5749w0;
import p1.U0;
import p1.Y;
import r1.f;
import r1.g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function0;", "Lc2/h;", "cornerRadius", "overlap", "Lp1/v0;", "color", "c", "(Landroidx/compose/ui/d;LnI/a;FJ)Landroidx/compose/ui/d;", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kv.c  reason: case insensitive filesystem */
public final class C6630c {
    public static final d c(d dVar, C17631a<h> aVar, float f10, long j10) {
        C17542s.j(dVar, "$this$drawContentBackground");
        C17542s.j(aVar, "cornerRadius");
        return b.c(dVar, new C6628a(aVar, f10, j10));
    }

    /* access modifiers changed from: private */
    public static final i d(C17631a aVar, float f10, long j10, m1.d dVar) {
        C17542s.j(dVar, "$this$drawWithCache");
        U0 a10 = Y.a();
        return dVar.h(new C6629b(dVar.H1(f10), C5662b.b(dVar.H1(((h) aVar.invoke()).G()), 0.0f, 2, (Object) null), a10, j10));
    }

    /* access modifiers changed from: private */
    public static final C16807N e(float f10, long j10, U0 u02, long j11, f fVar) {
        float f11 = f10;
        f fVar2 = fVar;
        C17542s.j(fVar2, "$this$onDrawBehind");
        C5671k d10 = C5672l.d(C5670j.c(C5668h.a(0.0f, -f11), C5674n.a(C5673m.l(fVar.b()), C5673m.i(fVar.b()) + f11)), j10, j10, 0, 0, 24, (Object) null);
        u02.D();
        U0.s(u02, d10, (U0.b) null, 2, (Object) null);
        f.j1(fVar2, u02, j11, 0.0f, (g) null, (C5749w0) null, 0, 60, (Object) null);
        return C16807N.f139792a;
    }
}
