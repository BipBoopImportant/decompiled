package Kt;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.C17536l;
import kotlin.jvm.internal.C17542s;
import m0.B0;
import m0.N;
import m0.v0;
import m0.w0;
import nI.q;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LKt/c;", "jumpState", "LKt/d;", "config", "LKt/b;", "a", "(LKt/c;LKt/d;LU0/m;I)LKt/b;", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final b a(c cVar, d dVar, C4889m mVar, int i10) {
        C17542s.j(cVar, "jumpState");
        C17542s.j(dVar, "config");
        mVar.W(752392723);
        if (C4895p.J()) {
            C4895p.S(752392723, i10, -1, "com.ingka.ikea.instore.impl.storebenefits.composables.rememberJumpAnimationState (JumpAnimation.kt:58)");
        }
        v0 g10 = w0.g(cVar, "jumping cup anim", mVar, (i10 & 14) | 48, 0);
        q<v0.b<c>, C4889m, Integer, N<Float>> b10 = dVar.b();
        q<c, C4889m, Integer, Float> a10 = dVar.a();
        C17536l lVar = C17536l.f144385a;
        v0 v0Var = g10;
        C4889m mVar2 = mVar;
        A1<Float> d10 = w0.d(v0Var, a10.invoke(g10.i(), mVar, 0), a10.invoke(g10.p(), mVar, 0), b10.invoke(g10.n(), mVar, 0), B0.f(lVar), "jump animation scale", mVar2, ImageMetadata.EDGE_MODE);
        q<v0.b<c>, C4889m, Integer, N<Float>> d11 = dVar.d();
        q<c, C4889m, Integer, Float> c10 = dVar.c();
        v0 v0Var2 = g10;
        A1<Float> d12 = w0.d(v0Var2, c10.invoke(g10.i(), mVar, 0), c10.invoke(g10.p(), mVar, 0), d11.invoke(g10.n(), mVar, 0), B0.f(lVar), "jump animation translation", mVar2, ImageMetadata.EDGE_MODE);
        mVar.W(-840890129);
        Object D10 = mVar.D();
        if (D10 == C4889m.f14007a.a()) {
            D10 = new b(d10, d12, g10);
            mVar.u(D10);
        }
        b bVar = (b) D10;
        mVar.P();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return bVar;
    }
}
