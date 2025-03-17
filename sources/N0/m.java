package N0;

import G1.C4507j;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.p1;
import XH.C16814e;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5546i;
import m0.M;
import m0.y0;
import n0.C5584G;
import nI.C17631a;
import p1.C5747v0;
import p1.C5753y0;
import r0.C5810b;
import r0.C5812d;
import r0.g;
import r0.j;
import r0.k;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a0\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0017\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lr0/k;", "interactionSource", "", "bounded", "Lc2/h;", "radius", "Lp1/y0;", "color", "Lkotlin/Function0;", "LN0/g;", "rippleAlpha", "LG1/j;", "c", "(Lr0/k;ZFLp1/y0;LnI/a;)LG1/j;", "Lp1/v0;", "Ln0/G;", "f", "(ZFJLU0/m;II)Ln0/G;", "Lr0/j;", "interaction", "Lm0/i;", "", "d", "(Lr0/j;)Lm0/i;", "e", "Lm0/y0;", "a", "Lm0/y0;", "DefaultTweenSpec", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final y0<Float> f9232a = new y0(15, 0, M.e(), 2, (DefaultConstructorMarker) null);

    public static final C4507j c(k kVar, boolean z10, float f10, C5753y0 y0Var, C17631a<g> aVar) {
        return q.d(kVar, z10, f10, y0Var, aVar);
    }

    /* access modifiers changed from: private */
    public static final C5546i<Float> d(j jVar) {
        return jVar instanceof g ? f9232a : jVar instanceof C5812d ? new y0(45, 0, M.e(), 2, (DefaultConstructorMarker) null) : jVar instanceof C5810b ? new y0(45, 0, M.e(), 2, (DefaultConstructorMarker) null) : f9232a;
    }

    /* access modifiers changed from: private */
    public static final C5546i<Float> e(j jVar) {
        return jVar instanceof g ? f9232a : jVar instanceof C5812d ? f9232a : jVar instanceof C5810b ? new y0(150, 0, M.e(), 2, (DefaultConstructorMarker) null) : f9232a;
    }

    @C16814e
    public static final C5584G f(boolean z10, float f10, long j10, C4889m mVar, int i10, int i11) {
        boolean z11 = true;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = h.f23031b.c();
        }
        if ((i11 & 4) != 0) {
            j10 = C5747v0.f27350b.i();
        }
        if (C4895p.J()) {
            C4895p.S(1635163520, i10, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:146)");
        }
        A1 q10 = p1.q(C5747v0.k(j10), mVar, (i10 >> 6) & 14);
        boolean z12 = (((i10 & 14) ^ 6) > 4 && mVar.b(z10)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !mVar.c(f10)) && (i10 & 48) != 32) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object D10 = mVar.D();
        if (z13 || D10 == C4889m.f14007a.a()) {
            D10 = new e(z10, f10, q10, (DefaultConstructorMarker) null);
            mVar.u(D10);
        }
        e eVar = (e) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return eVar;
    }
}
