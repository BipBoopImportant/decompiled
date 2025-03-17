package vJ;

import AI.C15429j;
import AI.C15432m;
import AI.C15435p;
import DI.C15530A;
import DI.C15536G;
import DI.C15558e;
import DI.C15559f;
import DI.C15561h;
import DI.m0;
import DI.n0;
import DI.s0;
import cJ.C17066c;
import cJ.C17067d;
import com.sugarcube.core.logger.DslKt;
import gJ.C17280k;
import hJ.C17330a;
import iJ.C17383q;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import uJ.C18082F;
import uJ.C18087K;
import uJ.C18095T;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18100Y;
import uJ.C18107c0;
import uJ.C18111e0;
import uJ.C18113f0;
import uJ.C18119i0;
import uJ.C18145z;
import uJ.E0;
import uJ.J0;
import uJ.K0;
import uJ.M0;
import uJ.P0;
import uJ.Q0;
import uJ.x0;
import uJ.y0;
import uJ.z0;
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
import yJ.q;
import yJ.r;
import yJ.t;
import yJ.u;
import zJ.C18755d;

/* renamed from: vJ.b  reason: case insensitive filesystem */
public interface C18198b extends K0, r {

    /* renamed from: vJ.b$a */
    public static final class a {

        /* renamed from: vJ.b$a$a  reason: collision with other inner class name */
        public static final class C4301a extends x0.c.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C18198b f149046a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ J0 f149047b;

            C4301a(C18198b bVar, J0 j02) {
                this.f149046a = bVar;
                this.f149047b = j02;
            }

            /* renamed from: b */
            public C18742k a(x0 x0Var, C18740i iVar) {
                C17542s.j(x0Var, "state");
                C17542s.j(iVar, "type");
                C18198b bVar = this.f149046a;
                J0 j02 = this.f149047b;
                C18741j p10 = bVar.p(iVar);
                C17542s.h(p10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                C18096U n10 = j02.n((C18096U) p10, Q0.INVARIANT);
                C17542s.i(n10, "safeSubstitute(...)");
                C18742k d10 = bVar.d(n10);
                C17542s.g(d10);
                return d10;
            }
        }

        public static u A(C18198b bVar, o oVar) {
            C17542s.j(oVar, "$receiver");
            if (oVar instanceof n0) {
                Q0 o10 = ((n0) oVar).o();
                C17542s.i(o10, "getVariance(...)");
                return q.a(o10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + P.b(oVar.getClass())).toString());
        }

        public static boolean B(C18198b bVar, C18740i iVar, C17066c cVar) {
            C17542s.j(iVar, "$receiver");
            C17542s.j(cVar, "fqName");
            if (iVar instanceof C18096U) {
                return ((C18096U) iVar).getAnnotations().f2(cVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + P.b(iVar.getClass())).toString());
        }

        public static boolean C(C18198b bVar, o oVar, n nVar) {
            C17542s.j(oVar, "$receiver");
            if (oVar instanceof n0) {
                n0 n0Var = (n0) oVar;
                if (nVar == null ? true : nVar instanceof y0) {
                    return C18755d.r(n0Var, (y0) nVar, (Set) null, 4, (Object) null);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + n0Var + ", " + P.b(n0Var.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + P.b(oVar.getClass())).toString());
        }

        public static boolean D(C18198b bVar, C18741j jVar, C18741j jVar2) {
            C17542s.j(jVar, "a");
            C17542s.j(jVar2, DslKt.INDICATOR_BACKGROUND);
            if (!(jVar instanceof C18113f0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + P.b(jVar.getClass())).toString());
            } else if (jVar2 instanceof C18113f0) {
                return ((C18113f0) jVar).L0() == ((C18113f0) jVar2).L0();
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar2 + ", " + P.b(jVar2.getClass())).toString());
            }
        }

        public static C18740i E(C18198b bVar, Collection<? extends C18740i> collection) {
            C17542s.j(collection, "types");
            return C18200d.a(collection);
        }

        public static boolean F(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                return C15429j.x0((y0) nVar, C15435p.a.f133092b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static boolean G(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                return ((y0) nVar).e() instanceof C15558e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static boolean H(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                C15561h e10 = ((y0) nVar).e();
                C15558e eVar = e10 instanceof C15558e ? (C15558e) e10 : null;
                return (eVar == null || !C15536G.a(eVar) || eVar.h() == C15559f.ENUM_ENTRY || eVar.h() == C15559f.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static boolean I(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                return ((y0) nVar).f();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static boolean J(C18198b bVar, C18740i iVar) {
            C17542s.j(iVar, "$receiver");
            if (iVar instanceof C18096U) {
                return C18100Y.a((C18096U) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + P.b(iVar.getClass())).toString());
        }

        public static boolean K(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                C15561h e10 = ((y0) nVar).e();
                s0<C18113f0> s0Var = null;
                C15558e eVar = e10 instanceof C15558e ? (C15558e) e10 : null;
                if (eVar != null) {
                    s0Var = eVar.V();
                }
                return s0Var instanceof C15530A;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static boolean L(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                return nVar instanceof C17383q;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static boolean M(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                return nVar instanceof C18095T;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static boolean N(C18198b bVar) {
            return false;
        }

        public static boolean O(C18198b bVar, C18740i iVar) {
            C17542s.j(iVar, "$receiver");
            return (iVar instanceof C18113f0) && ((C18113f0) iVar).O0();
        }

        public static boolean P(C18198b bVar, C18740i iVar) {
            C17542s.j(iVar, "$receiver");
            return iVar instanceof C18107c0;
        }

        public static boolean Q(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                return C15429j.x0((y0) nVar, C15435p.a.f133094c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static boolean R(C18198b bVar, C18740i iVar) {
            C17542s.j(iVar, "$receiver");
            if (iVar instanceof C18096U) {
                return M0.l((C18096U) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + P.b(iVar.getClass())).toString());
        }

        public static boolean S(C18198b bVar, C18735d dVar) {
            C17542s.j(dVar, "$receiver");
            return dVar instanceof C17330a;
        }

        public static boolean T(C18198b bVar, C18742k kVar) {
            C17542s.j(kVar, "$receiver");
            if (kVar instanceof C18096U) {
                return C15429j.t0((C18096U) kVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + P.b(kVar.getClass())).toString());
        }

        public static boolean U(C18198b bVar, C18735d dVar) {
            C17542s.j(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + P.b(dVar.getClass())).toString());
        }

        public static boolean V(C18198b bVar, C18740i iVar) {
            C17542s.j(iVar, "$receiver");
            if (iVar instanceof C18096U) {
                return iVar instanceof C18111e0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + P.b(iVar.getClass())).toString());
        }

        public static boolean W(C18198b bVar, C18741j jVar) {
            C17542s.j(jVar, "$receiver");
            if (jVar instanceof C18113f0) {
                if (!C18100Y.a((C18096U) jVar)) {
                    C18113f0 f0Var = (C18113f0) jVar;
                    return !(f0Var.N0().e() instanceof m0) && (f0Var.N0().e() != null || (jVar instanceof C17330a) || (jVar instanceof i) || (jVar instanceof C18145z) || (f0Var.N0() instanceof C17383q) || X(bVar, (C18742k) jVar));
                }
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + P.b(jVar.getClass())).toString());
        }

        private static boolean X(C18198b bVar, C18742k kVar) {
            return (kVar instanceof C18119i0) && bVar.c(((C18119i0) kVar).H0());
        }

        public static boolean Y(C18198b bVar, m mVar) {
            C17542s.j(mVar, "$receiver");
            if (mVar instanceof E0) {
                return ((E0) mVar).a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + P.b(mVar.getClass())).toString());
        }

        public static boolean Z(C18198b bVar, C18741j jVar) {
            C17542s.j(jVar, "$receiver");
            if (jVar instanceof C18113f0) {
                return C18755d.u((C18096U) jVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + P.b(jVar.getClass())).toString());
        }

        public static boolean a(C18198b bVar, n nVar, n nVar2) {
            C17542s.j(nVar, "c1");
            C17542s.j(nVar2, "c2");
            if (!(nVar instanceof y0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
            } else if (nVar2 instanceof y0) {
                return C17542s.e(nVar, nVar2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar2 + ", " + P.b(nVar2.getClass())).toString());
            }
        }

        public static boolean a0(C18198b bVar, C18741j jVar) {
            C17542s.j(jVar, "$receiver");
            if (jVar instanceof C18113f0) {
                return C18755d.v((C18096U) jVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + P.b(jVar.getClass())).toString());
        }

        public static int b(C18198b bVar, C18740i iVar) {
            C17542s.j(iVar, "$receiver");
            if (iVar instanceof C18096U) {
                return ((C18096U) iVar).L0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + P.b(iVar.getClass())).toString());
        }

        public static boolean b0(C18198b bVar, C18740i iVar) {
            C17542s.j(iVar, "$receiver");
            return (iVar instanceof P0) && (((P0) iVar).N0() instanceof r);
        }

        public static C18743l c(C18198b bVar, C18741j jVar) {
            C17542s.j(jVar, "$receiver");
            if (jVar instanceof C18113f0) {
                return (C18743l) jVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + P.b(jVar.getClass())).toString());
        }

        public static boolean c0(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                C15561h e10 = ((y0) nVar).e();
                return e10 != null && C15429j.C0(e10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static C18735d d(C18198b bVar, C18742k kVar) {
            C17542s.j(kVar, "$receiver");
            if (!(kVar instanceof C18113f0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + P.b(kVar.getClass())).toString());
            } else if (kVar instanceof C18119i0) {
                return bVar.b(((C18119i0) kVar).H0());
            } else {
                if (kVar instanceof i) {
                    return (i) kVar;
                }
                return null;
            }
        }

        public static C18742k d0(C18198b bVar, C18738g gVar) {
            C17542s.j(gVar, "$receiver");
            if (gVar instanceof C18087K) {
                return ((C18087K) gVar).V0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + P.b(gVar.getClass())).toString());
        }

        public static C18736e e(C18198b bVar, C18741j jVar) {
            C17542s.j(jVar, "$receiver");
            if (!(jVar instanceof C18113f0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + P.b(jVar.getClass())).toString());
            } else if (jVar instanceof C18145z) {
                return (C18145z) jVar;
            } else {
                return null;
            }
        }

        public static C18740i e0(C18198b bVar, C18735d dVar) {
            C17542s.j(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).Y0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + P.b(dVar.getClass())).toString());
        }

        public static C18737f f(C18198b bVar, C18738g gVar) {
            C17542s.j(gVar, "$receiver");
            if (!(gVar instanceof C18087K)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + P.b(gVar.getClass())).toString());
            } else if (gVar instanceof C18082F) {
                return (C18082F) gVar;
            } else {
                return null;
            }
        }

        public static C18740i f0(C18198b bVar, C18740i iVar, boolean z10) {
            C17542s.j(iVar, "$receiver");
            if (iVar instanceof P0) {
                return C18199c.b((P0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + P.b(iVar.getClass())).toString());
        }

        public static C18738g g(C18198b bVar, C18740i iVar) {
            C17542s.j(iVar, "$receiver");
            if (iVar instanceof C18096U) {
                P0 Q02 = ((C18096U) iVar).Q0();
                if (Q02 instanceof C18087K) {
                    return (C18087K) Q02;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + P.b(iVar.getClass())).toString());
        }

        public static x0 g0(C18198b bVar, boolean z10, boolean z11) {
            return C18197a.b(z10, z11, bVar, (f) null, (g) null, 24, (Object) null);
        }

        public static C18742k h(C18198b bVar, C18740i iVar) {
            C17542s.j(iVar, "$receiver");
            if (iVar instanceof C18096U) {
                P0 Q02 = ((C18096U) iVar).Q0();
                if (Q02 instanceof C18113f0) {
                    return (C18113f0) Q02;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + P.b(iVar.getClass())).toString());
        }

        public static C18742k h0(C18198b bVar, C18736e eVar) {
            C17542s.j(eVar, "$receiver");
            if (eVar instanceof C18145z) {
                return ((C18145z) eVar).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + eVar + ", " + P.b(eVar.getClass())).toString());
        }

        public static m i(C18198b bVar, C18740i iVar) {
            C17542s.j(iVar, "$receiver");
            if (iVar instanceof C18096U) {
                return C18755d.d((C18096U) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + P.b(iVar.getClass())).toString());
        }

        public static int i0(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                return ((y0) nVar).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static C18113f0 j(C18198b bVar, C18741j jVar, C18733b bVar2) {
            C17542s.j(jVar, "type");
            C17542s.j(bVar2, "status");
            if (jVar instanceof C18113f0) {
                return o.b((C18113f0) jVar, bVar2);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + P.b(jVar.getClass())).toString());
        }

        public static Collection<C18740i> j0(C18198b bVar, C18741j jVar) {
            C17542s.j(jVar, "$receiver");
            n a10 = bVar.a(jVar);
            if (a10 instanceof C17383q) {
                return ((C17383q) a10).k();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + P.b(jVar.getClass())).toString());
        }

        public static C18733b k(C18198b bVar, C18735d dVar) {
            C17542s.j(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + P.b(dVar.getClass())).toString());
        }

        public static m k0(C18198b bVar, C18734c cVar) {
            C17542s.j(cVar, "$receiver");
            if (cVar instanceof n) {
                return ((n) cVar).d();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + P.b(cVar.getClass())).toString());
        }

        public static C18740i l(C18198b bVar, C18741j jVar, C18741j jVar2) {
            C17542s.j(jVar, "lowerBound");
            C17542s.j(jVar2, "upperBound");
            if (!(jVar instanceof C18113f0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + P.b(bVar.getClass())).toString());
            } else if (jVar2 instanceof C18113f0) {
                return C18099X.e((C18113f0) jVar, (C18113f0) jVar2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + P.b(bVar.getClass())).toString());
            }
        }

        public static x0.c l0(C18198b bVar, C18741j jVar) {
            C17542s.j(jVar, "type");
            if (jVar instanceof C18113f0) {
                return new C4301a(bVar, z0.f147956c.a((C18096U) jVar).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + P.b(jVar.getClass())).toString());
        }

        public static m m(C18198b bVar, C18740i iVar, int i10) {
            C17542s.j(iVar, "$receiver");
            if (iVar instanceof C18096U) {
                return ((C18096U) iVar).L0().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + P.b(iVar.getClass())).toString());
        }

        public static Collection<C18740i> m0(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                Collection<C18096U> a10 = ((y0) nVar).a();
                C17542s.i(a10, "getSupertypes(...)");
                return a10;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static List<m> n(C18198b bVar, C18740i iVar) {
            C17542s.j(iVar, "$receiver");
            if (iVar instanceof C18096U) {
                return ((C18096U) iVar).L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + P.b(iVar.getClass())).toString());
        }

        public static C18734c n0(C18198b bVar, C18735d dVar) {
            C17542s.j(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + P.b(dVar.getClass())).toString());
        }

        public static C17067d o(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                C15561h e10 = ((y0) nVar).e();
                C17542s.h(e10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return C17506e.p((C15558e) e10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static n o0(C18198b bVar, C18741j jVar) {
            C17542s.j(jVar, "$receiver");
            if (jVar instanceof C18113f0) {
                return ((C18113f0) jVar).N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + P.b(jVar.getClass())).toString());
        }

        public static o p(C18198b bVar, n nVar, int i10) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                n0 n0Var = ((y0) nVar).getParameters().get(i10);
                C17542s.i(n0Var, "get(...)");
                return n0Var;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static C18742k p0(C18198b bVar, C18738g gVar) {
            C17542s.j(gVar, "$receiver");
            if (gVar instanceof C18087K) {
                return ((C18087K) gVar).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + P.b(gVar.getClass())).toString());
        }

        public static List<o> q(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                List<n0> parameters = ((y0) nVar).getParameters();
                C17542s.i(parameters, "getParameters(...)");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static C18740i q0(C18198b bVar, C18740i iVar, boolean z10) {
            C17542s.j(iVar, "$receiver");
            if (iVar instanceof C18741j) {
                return bVar.g((C18741j) iVar, z10);
            }
            if (iVar instanceof C18738g) {
                C18738g gVar = (C18738g) iVar;
                return bVar.H0(bVar.g(bVar.h(gVar), z10), bVar.g(bVar.e(gVar), z10));
            }
            throw new IllegalStateException("sealed");
        }

        public static C15432m r(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                C15561h e10 = ((y0) nVar).e();
                C17542s.h(e10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return C15429j.Q((C15558e) e10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static C18742k r0(C18198b bVar, C18741j jVar, boolean z10) {
            C17542s.j(jVar, "$receiver");
            if (jVar instanceof C18113f0) {
                return ((C18113f0) jVar).U0(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + P.b(jVar.getClass())).toString());
        }

        public static C15432m s(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                C15561h e10 = ((y0) nVar).e();
                C17542s.h(e10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return C15429j.T((C15558e) e10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static C18740i t(C18198b bVar, o oVar) {
            C17542s.j(oVar, "$receiver");
            if (oVar instanceof n0) {
                return C18755d.o((n0) oVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + P.b(oVar.getClass())).toString());
        }

        public static C18740i u(C18198b bVar, m mVar) {
            C17542s.j(mVar, "$receiver");
            if (bVar.f(mVar)) {
                return null;
            }
            if (mVar instanceof E0) {
                return ((E0) mVar).getType().Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + P.b(mVar.getClass())).toString());
        }

        public static o v(C18198b bVar, t tVar) {
            C17542s.j(tVar, "$receiver");
            if (tVar instanceof r) {
                return ((r) tVar).c();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + tVar + ", " + P.b(tVar.getClass())).toString());
        }

        public static o w(C18198b bVar, n nVar) {
            C17542s.j(nVar, "$receiver");
            if (nVar instanceof y0) {
                C15561h e10 = ((y0) nVar).e();
                if (e10 instanceof n0) {
                    return (n0) e10;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + P.b(nVar.getClass())).toString());
        }

        public static C18740i x(C18198b bVar, C18740i iVar) {
            C17542s.j(iVar, "$receiver");
            if (iVar instanceof C18096U) {
                return C17280k.k((C18096U) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + P.b(iVar.getClass())).toString());
        }

        public static List<C18740i> y(C18198b bVar, o oVar) {
            C17542s.j(oVar, "$receiver");
            if (oVar instanceof n0) {
                List<C18096U> upperBounds = ((n0) oVar).getUpperBounds();
                C17542s.i(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + P.b(oVar.getClass())).toString());
        }

        public static u z(C18198b bVar, m mVar) {
            C17542s.j(mVar, "$receiver");
            if (mVar instanceof E0) {
                Q0 c10 = ((E0) mVar).c();
                C17542s.i(c10, "getProjectionKind(...)");
                return q.a(c10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + P.b(mVar.getClass())).toString());
        }
    }

    C18740i H0(C18741j jVar, C18741j jVar2);

    n a(C18741j jVar);

    C18735d b(C18742k kVar);

    boolean c(C18741j jVar);

    C18742k d(C18740i iVar);

    C18742k e(C18738g gVar);

    boolean f(m mVar);

    C18742k g(C18741j jVar, boolean z10);

    C18742k h(C18738g gVar);
}
