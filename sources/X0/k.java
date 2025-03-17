package x0;

import U0.C4889m;
import U0.C4895p;
import androidx.compose.ui.platform.C5100f0;
import c2.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.r;
import l0.z;
import m0.C5546i;
import m0.C5548j;
import m0.C5570z;
import m0.P0;
import nI.q;
import p0.H;
import p0.v;
import q0.C5766g;
import q0.C5768i;
import z1.C6271a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0003\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lx0/k;", "", "<init>", "()V", "Lx0/C;", "state", "Lx0/A;", "pagerSnapDistance", "Lm0/z;", "", "decayAnimationSpec", "Lm0/i;", "snapAnimationSpec", "snapPositionalThreshold", "Lp0/H;", "a", "(Lx0/C;Lx0/A;Lm0/z;Lm0/i;FLU0/m;II)Lp0/H;", "Lp0/v;", "orientation", "Lz1/a;", "b", "(Lx0/C;Lp0/v;LU0/m;I)Lz1/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f31709a = new k();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0005\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "flingVelocity", "lowerBound", "upperBound", "a", "(FFF)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements q<Float, Float, Float, Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6230C f31710c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t f31711d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f31712e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6230C c10, t tVar, float f10) {
            super(3);
            this.f31710c = c10;
            this.f31711d = tVar;
            this.f31712e = f10;
        }

        public final Float a(float f10, float f11, float f12) {
            return Float.valueOf(C5766g.d(this.f31710c, this.f31711d, this.f31712e, f10, f11, f12));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Number) obj).floatValue(), ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
        }
    }

    private k() {
    }

    public final H a(C6230C c10, C6228A a10, C5570z<Float> zVar, C5546i<Float> iVar, float f10, C4889m mVar, int i10, int i11) {
        boolean z10 = true;
        if ((i11 & 2) != 0) {
            a10 = C6228A.f31553a.a(1);
        }
        if ((i11 & 4) != 0) {
            zVar = z.b(mVar, 0);
        }
        if ((i11 & 8) != 0) {
            iVar = C5548j.h(0.0f, 400.0f, Float.valueOf((float) P0.b(r.f144386a)), 1, (Object) null);
        }
        if ((i11 & 16) != 0) {
            f10 = 0.5f;
        }
        if (C4895p.J()) {
            C4895p.S(1559769181, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:301)");
        }
        if (0.0f > f10 || f10 > 1.0f) {
            throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f10).toString());
        }
        d dVar = (d) mVar.Q(C5100f0.e());
        t tVar = (t) mVar.Q(C5100f0.k());
        boolean V10 = ((((i10 & 14) ^ 6) > 4 && mVar.V(c10)) || (i10 & 6) == 4) | mVar.V(zVar) | mVar.V(iVar);
        if ((((i10 & 112) ^ 48) <= 32 || !mVar.V(a10)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean V11 = V10 | z10 | mVar.V(dVar) | mVar.V(tVar);
        Object D10 = mVar.D();
        if (V11 || D10 == C4889m.f14007a.a()) {
            D10 = C5768i.l(C5766g.a(c10, a10, new a(c10, tVar, f10)), zVar, iVar);
            mVar.u(D10);
        }
        H h10 = (H) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return h10;
    }

    public final C6271a b(C6230C c10, v vVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(877583120, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:350)");
        }
        boolean z10 = false;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && mVar.V(c10)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) > 32 && mVar.V(vVar)) || (i10 & 48) == 32) {
            z10 = true;
        }
        boolean z12 = z11 | z10;
        Object D10 = mVar.D();
        if (z12 || D10 == C4889m.f14007a.a()) {
            D10 = new C6233a(c10, vVar);
            mVar.u(D10);
        }
        C6233a aVar = (C6233a) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return aVar;
    }
}
