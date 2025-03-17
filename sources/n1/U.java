package N1;

import Y1.k;
import Y1.n;
import Y1.t;
import c2.r;
import kotlin.Metadata;
import o1.C5667g;
import o1.C5669i;
import o1.C5670j;
import o1.C5674n;
import p1.C5728l0;
import p1.C5732n0;
import p1.C5747v0;
import p1.g1;
import r1.g;
import r1.j;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LN1/U;", "", "<init>", "()V", "Lp1/n0;", "canvas", "LN1/P;", "textLayoutResult", "LXH/N;", "a", "(Lp1/n0;LN1/P;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class U {

    /* renamed from: a  reason: collision with root package name */
    public static final U f9418a = new U();

    private U() {
    }

    public final void a(C5732n0 n0Var, P p10) {
        boolean z10 = p10.i() && !t.e(p10.l().f(), t.f14827a.c());
        if (z10) {
            C5669i c10 = C5670j.c(C5667g.f26701b.c(), C5674n.a((float) r.h(p10.B()), (float) r.g(p10.B())));
            n0Var.t();
            C5732n0.A(n0Var, c10, 0, 2, (Object) null);
        }
        G y10 = p10.l().i().y();
        k s10 = y10.s();
        if (s10 == null) {
            s10 = k.f14792b.c();
        }
        k kVar = s10;
        g1 r10 = y10.r();
        if (r10 == null) {
            r10 = g1.f27310d.a();
        }
        g1 g1Var = r10;
        g h10 = y10.h();
        if (h10 == null) {
            h10 = j.f28627a;
        }
        g gVar = h10;
        try {
            C5728l0 f10 = y10.f();
            if (f10 != null) {
                C4679n.F(p10.w(), n0Var, f10, y10.t() != n.b.f14807b ? y10.t().a() : 1.0f, g1Var, kVar, gVar, 0, 64, (Object) null);
            } else {
                C4679n.D(p10.w(), n0Var, y10.t() != n.b.f14807b ? y10.t().b() : C5747v0.f27350b.a(), g1Var, kVar, gVar, 0, 32, (Object) null);
            }
        } finally {
            if (z10) {
                n0Var.n();
            }
        }
    }
}
