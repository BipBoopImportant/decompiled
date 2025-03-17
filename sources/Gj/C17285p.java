package gJ;

import AI.C15432m;
import cJ.C17066c;
import cJ.C17067d;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.p;
import uJ.C18096U;
import uJ.C18113f0;
import uJ.x0;
import uJ.y0;
import vJ.C18197a;
import vJ.C18198b;
import vJ.e;
import vJ.f;
import vJ.g;
import yJ.C18732a;
import yJ.C18733b;
import yJ.C18734c;
import yJ.C18735d;
import yJ.C18736e;
import yJ.C18737f;
import yJ.C18738g;
import yJ.C18740i;
import yJ.C18741j;
import yJ.C18742k;
import yJ.C18743l;
import yJ.m;
import yJ.n;
import yJ.o;
import yJ.t;
import yJ.u;

/* renamed from: gJ.p  reason: case insensitive filesystem */
public final class C17285p implements C18198b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<y0, y0> f143327a;

    /* renamed from: b  reason: collision with root package name */
    private final e.a f143328b;

    /* renamed from: c  reason: collision with root package name */
    private final g f143329c;

    /* renamed from: d  reason: collision with root package name */
    private final f f143330d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final p<C18096U, C18096U, Boolean> f143331e;

    /* renamed from: gJ.p$a */
    public static final class a extends x0 {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17285p f143332k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, boolean z11, C17285p pVar, f fVar, g gVar) {
            super(z10, z11, true, pVar, fVar, gVar);
            this.f143332k = pVar;
        }

        public boolean f(C18740i iVar, C18740i iVar2) {
            C17542s.j(iVar, "subType");
            C17542s.j(iVar2, "superType");
            if (!(iVar instanceof C18096U)) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (iVar2 instanceof C18096U) {
                return ((Boolean) this.f143332k.f143331e.invoke(iVar, iVar2)).booleanValue();
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
    }

    public C17285p(Map<y0, ? extends y0> map, e.a aVar, g gVar, f fVar, p<? super C18096U, ? super C18096U, Boolean> pVar) {
        C17542s.j(aVar, "equalityAxioms");
        C17542s.j(gVar, "kotlinTypeRefiner");
        C17542s.j(fVar, "kotlinTypePreparator");
        this.f143327a = map;
        this.f143328b = aVar;
        this.f143329c = gVar;
        this.f143330d = fVar;
        this.f143331e = pVar;
    }

    private final boolean L0(y0 y0Var, y0 y0Var2) {
        if (this.f143328b.a(y0Var, y0Var2)) {
            return true;
        }
        Map<y0, y0> map = this.f143327a;
        if (map == null) {
            return false;
        }
        y0 y0Var3 = map.get(y0Var);
        y0 y0Var4 = this.f143327a.get(y0Var2);
        if (y0Var3 == null || !C17542s.e(y0Var3, y0Var2)) {
            return y0Var4 != null && C17542s.e(y0Var4, y0Var);
        }
        return true;
    }

    public C18740i A(C18740i iVar, boolean z10) {
        return C18198b.a.f0(this, iVar, z10);
    }

    public C18734c A0(C18735d dVar) {
        return C18198b.a.n0(this, dVar);
    }

    public C18742k B(C18736e eVar) {
        return C18198b.a.h0(this, eVar);
    }

    public m B0(C18734c cVar) {
        return C18198b.a.k0(this, cVar);
    }

    public C18740i C(C18740i iVar, boolean z10) {
        return C18198b.a.q0(this, iVar, z10);
    }

    public boolean C0(C18741j jVar) {
        C17542s.j(jVar, "<this>");
        return e0(a(jVar));
    }

    public boolean D(n nVar) {
        return C18198b.a.F(this, nVar);
    }

    public C18743l E(C18741j jVar) {
        return C18198b.a.c(this, jVar);
    }

    public boolean E0(n nVar) {
        return C18198b.a.c0(this, nVar);
    }

    public boolean F(C18740i iVar) {
        return C18198b.a.R(this, iVar);
    }

    public C18740i F0(C18740i iVar) {
        return C18198b.a.x(this, iVar);
    }

    public boolean G(C18740i iVar) {
        C17542s.j(iVar, "<this>");
        return d0(p(iVar)) != d0(z(iVar));
    }

    public boolean G0(C18741j jVar) {
        return C18198b.a.a0(this, jVar);
    }

    public C18740i H(Collection<? extends C18740i> collection) {
        return C18198b.a.E(this, collection);
    }

    public C18740i H0(C18741j jVar, C18741j jVar2) {
        return C18198b.a.l(this, jVar, jVar2);
    }

    public C18740i I(C18735d dVar) {
        return C18198b.a.e0(this, dVar);
    }

    public C18738g I0(C18740i iVar) {
        return C18198b.a.g(this, iVar);
    }

    public boolean J(C18740i iVar, C17066c cVar) {
        return C18198b.a.B(this, iVar, cVar);
    }

    public boolean J0(C18741j jVar) {
        return C18198b.a.Z(this, jVar);
    }

    public boolean K() {
        return C18198b.a.N(this);
    }

    public boolean L(n nVar) {
        return C18198b.a.K(this, nVar);
    }

    public List<o> M(n nVar) {
        return C18198b.a.q(this, nVar);
    }

    /* renamed from: M0 */
    public C18113f0 D0(C18741j jVar, C18733b bVar) {
        return C18198b.a.j(this, jVar, bVar);
    }

    public boolean N(C18741j jVar, C18741j jVar2) {
        return C18198b.a.D(this, jVar, jVar2);
    }

    public x0 N0(boolean z10, boolean z11) {
        if (this.f143331e == null) {
            return C18197a.a(z10, z11, this, this.f143330d, this.f143329c);
        }
        return new a(z10, z11, this, this.f143330d, this.f143329c);
    }

    public C18735d O(C18741j jVar) {
        C17542s.j(jVar, "<this>");
        return b(w0(jVar));
    }

    public C15432m P(n nVar) {
        return C18198b.a.r(this, nVar);
    }

    public boolean Q(o oVar, n nVar) {
        return C18198b.a.C(this, oVar, nVar);
    }

    public m R(C18743l lVar, int i10) {
        C17542s.j(lVar, "<this>");
        if (lVar instanceof C18742k) {
            return l((C18740i) lVar, i10);
        }
        if (lVar instanceof C18732a) {
            Object obj = ((C18732a) lVar).get(i10);
            C17542s.i(obj, "get(...)");
            return (m) obj;
        }
        throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + P.b(lVar.getClass())).toString());
    }

    public C18740i S(o oVar) {
        return C18198b.a.t(this, oVar);
    }

    public boolean T(C18740i iVar) {
        return C18198b.a.V(this, iVar);
    }

    public int U(C18740i iVar) {
        return C18198b.a.b(this, iVar);
    }

    public boolean V(n nVar) {
        return C18198b.a.M(this, nVar);
    }

    public int W(n nVar) {
        return C18198b.a.i0(this, nVar);
    }

    public Collection<C18740i> X(C18741j jVar) {
        return C18198b.a.j0(this, jVar);
    }

    public C18740i Y(m mVar) {
        return C18198b.a.u(this, mVar);
    }

    public boolean Z(C18741j jVar) {
        C17542s.j(jVar, "<this>");
        return t(jVar) != null;
    }

    public n a(C18741j jVar) {
        return C18198b.a.o0(this, jVar);
    }

    public u a0(m mVar) {
        return C18198b.a.z(this, mVar);
    }

    public C18735d b(C18742k kVar) {
        return C18198b.a.d(this, kVar);
    }

    public C18737f b0(C18738g gVar) {
        return C18198b.a.f(this, gVar);
    }

    public boolean c(C18741j jVar) {
        return C18198b.a.W(this, jVar);
    }

    public Collection<C18740i> c0(n nVar) {
        return C18198b.a.m0(this, nVar);
    }

    public boolean d0(C18740i iVar) {
        return C18198b.a.O(this, iVar);
    }

    public boolean e0(n nVar) {
        return C18198b.a.L(this, nVar);
    }

    public boolean f(m mVar) {
        return C18198b.a.Y(this, mVar);
    }

    public n f0(C18740i iVar) {
        C17542s.j(iVar, "<this>");
        C18741j d10 = d(iVar);
        if (d10 == null) {
            d10 = p(iVar);
        }
        return a(d10);
    }

    public x0.c g0(C18741j jVar) {
        return C18198b.a.l0(this, jVar);
    }

    public o h0(n nVar) {
        return C18198b.a.w(this, nVar);
    }

    public boolean i(n nVar) {
        return C18198b.a.Q(this, nVar);
    }

    public boolean i0(C18735d dVar) {
        return C18198b.a.U(this, dVar);
    }

    public List<C18740i> j(o oVar) {
        return C18198b.a.y(this, oVar);
    }

    public boolean j0(C18740i iVar) {
        return C18198b.a.J(this, iVar);
    }

    public C17067d k(n nVar) {
        return C18198b.a.o(this, nVar);
    }

    public List<m> k0(C18740i iVar) {
        return C18198b.a.n(this, iVar);
    }

    public m l(C18740i iVar, int i10) {
        return C18198b.a.m(this, iVar, i10);
    }

    public boolean l0(n nVar) {
        return C18198b.a.G(this, nVar);
    }

    public boolean m(C18740i iVar) {
        return C18198b.a.P(this, iVar);
    }

    public m m0(C18740i iVar) {
        return C18198b.a.i(this, iVar);
    }

    public boolean n(C18740i iVar) {
        C17542s.j(iVar, "<this>");
        return i(f0(iVar)) && !F(iVar);
    }

    public boolean n0(C18740i iVar) {
        C17542s.j(iVar, "<this>");
        C18738g I02 = I0(iVar);
        return (I02 != null ? b0(I02) : null) != null;
    }

    public boolean o(n nVar) {
        return C18198b.a.I(this, nVar);
    }

    public o o0(t tVar) {
        return C18198b.a.v(this, tVar);
    }

    public C18741j p(C18740i iVar) {
        C18741j h10;
        C17542s.j(iVar, "<this>");
        C18738g I02 = I0(iVar);
        if (I02 != null && (h10 = h(I02)) != null) {
            return h10;
        }
        C18741j d10 = d(iVar);
        C17542s.g(d10);
        return d10;
    }

    public boolean p0(C18742k kVar) {
        return C18198b.a.T(this, kVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = g(r0, true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yJ.C18740i q(yJ.C18740i r3) {
        /*
            r2 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            yJ.j r0 = r2.d(r3)
            if (r0 == 0) goto L_0x0013
            r1 = 1
            yJ.j r0 = r2.g(r0, r1)
            if (r0 == 0) goto L_0x0013
            r3 = r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gJ.C17285p.q(yJ.i):yJ.i");
    }

    public List<C18742k> q0(C18741j jVar, n nVar) {
        C17542s.j(jVar, "<this>");
        C17542s.j(nVar, "constructor");
        return null;
    }

    public boolean r(C18740i iVar) {
        C17542s.j(iVar, "<this>");
        C18741j d10 = d(iVar);
        return (d10 != null ? O(d10) : null) != null;
    }

    public int r0(C18743l lVar) {
        C17542s.j(lVar, "<this>");
        if (lVar instanceof C18741j) {
            return U((C18740i) lVar);
        }
        if (lVar instanceof C18732a) {
            return ((C18732a) lVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + P.b(lVar.getClass())).toString());
    }

    public boolean s(C18735d dVar) {
        return C18198b.a.S(this, dVar);
    }

    public m s0(C18741j jVar, int i10) {
        C17542s.j(jVar, "<this>");
        if (i10 < 0 || i10 >= U(jVar)) {
            return null;
        }
        return l(jVar, i10);
    }

    public C18736e t(C18741j jVar) {
        return C18198b.a.e(this, jVar);
    }

    public o t0(n nVar, int i10) {
        return C18198b.a.p(this, nVar, i10);
    }

    public u u(o oVar) {
        return C18198b.a.A(this, oVar);
    }

    public boolean u0(C18740i iVar) {
        C17542s.j(iVar, "<this>");
        return !C17542s.e(a(p(iVar)), a(z(iVar)));
    }

    public boolean v(n nVar) {
        return C18198b.a.H(this, nVar);
    }

    public C18733b v0(C18735d dVar) {
        return C18198b.a.k(this, dVar);
    }

    public C18740i w(C18740i iVar) {
        C17542s.j(iVar, "<this>");
        return A(iVar, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = B(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yJ.C18742k w0(yJ.C18741j r2) {
        /*
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            yJ.e r0 = r1.t(r2)
            if (r0 == 0) goto L_0x0011
            yJ.k r0 = r1.B(r0)
            if (r0 != 0) goto L_0x0014
        L_0x0011:
            r0 = r2
            yJ.k r0 = (yJ.C18742k) r0
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gJ.C17285p.w0(yJ.j):yJ.k");
    }

    public boolean x(C18740i iVar) {
        return C18198b.a.b0(this, iVar);
    }

    public boolean x0(C18741j jVar) {
        C17542s.j(jVar, "<this>");
        return l0(a(jVar));
    }

    public boolean y(n nVar, n nVar2) {
        C17542s.j(nVar, "c1");
        C17542s.j(nVar2, "c2");
        if (!(nVar instanceof y0)) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (nVar2 instanceof y0) {
            return C18198b.a.a(this, nVar, nVar2) || L0((y0) nVar, (y0) nVar2);
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public boolean y0(C18740i iVar) {
        C17542s.j(iVar, "<this>");
        C18741j d10 = d(iVar);
        return (d10 != null ? t(d10) : null) != null;
    }

    public C18741j z(C18740i iVar) {
        C18741j e10;
        C17542s.j(iVar, "<this>");
        C18738g I02 = I0(iVar);
        if (I02 != null && (e10 = e(I02)) != null) {
            return e10;
        }
        C18741j d10 = d(iVar);
        C17542s.g(d10);
        return d10;
    }

    public C15432m z0(n nVar) {
        return C18198b.a.s(this, nVar);
    }

    public C18742k d(C18740i iVar) {
        return C18198b.a.h(this, iVar);
    }

    public C18742k e(C18738g gVar) {
        return C18198b.a.p0(this, gVar);
    }

    public C18742k g(C18741j jVar, boolean z10) {
        return C18198b.a.r0(this, jVar, z10);
    }

    public C18742k h(C18738g gVar) {
        return C18198b.a.d0(this, gVar);
    }
}
