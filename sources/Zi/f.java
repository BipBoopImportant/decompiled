package ZI;

import XI.C16830c;
import XI.i;
import XI.n;
import XI.q;
import XI.r;
import XI.s;
import XI.u;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;

public final class f {
    public static final q a(q qVar, g gVar) {
        C17542s.j(qVar, "<this>");
        C17542s.j(gVar, "typeTable");
        if (qVar.e0()) {
            return qVar.M();
        }
        if (qVar.f0()) {
            return gVar.a(qVar.N());
        }
        return null;
    }

    public static final List<q> b(C16830c cVar, g gVar) {
        C17542s.j(cVar, "<this>");
        C17542s.j(gVar, "typeTable");
        List<q> s02 = cVar.s0();
        if (s02.isEmpty()) {
            s02 = null;
        }
        if (s02 == null) {
            List<Integer> r02 = cVar.r0();
            C17542s.i(r02, "getContextReceiverTypeIdList(...)");
            Iterable<Integer> iterable = r02;
            s02 = new ArrayList<>(C16877v.y(iterable, 10));
            for (Integer num : iterable) {
                C17542s.g(num);
                s02.add(gVar.a(num.intValue()));
            }
        }
        return s02;
    }

    public static final List<q> c(i iVar, g gVar) {
        C17542s.j(iVar, "<this>");
        C17542s.j(gVar, "typeTable");
        List<q> T10 = iVar.T();
        if (T10.isEmpty()) {
            T10 = null;
        }
        if (T10 == null) {
            List<Integer> S10 = iVar.S();
            C17542s.i(S10, "getContextReceiverTypeIdList(...)");
            Iterable<Integer> iterable = S10;
            T10 = new ArrayList<>(C16877v.y(iterable, 10));
            for (Integer num : iterable) {
                C17542s.g(num);
                T10.add(gVar.a(num.intValue()));
            }
        }
        return T10;
    }

    public static final List<q> d(n nVar, g gVar) {
        C17542s.j(nVar, "<this>");
        C17542s.j(gVar, "typeTable");
        List<q> S10 = nVar.S();
        if (S10.isEmpty()) {
            S10 = null;
        }
        if (S10 == null) {
            List<Integer> R10 = nVar.R();
            C17542s.i(R10, "getContextReceiverTypeIdList(...)");
            Iterable<Integer> iterable = R10;
            S10 = new ArrayList<>(C16877v.y(iterable, 10));
            for (Integer num : iterable) {
                C17542s.g(num);
                S10.add(gVar.a(num.intValue()));
            }
        }
        return S10;
    }

    public static final q e(r rVar, g gVar) {
        C17542s.j(rVar, "<this>");
        C17542s.j(gVar, "typeTable");
        if (rVar.Y()) {
            q O10 = rVar.O();
            C17542s.i(O10, "getExpandedType(...)");
            return O10;
        } else if (rVar.Z()) {
            return gVar.a(rVar.P());
        } else {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
        }
    }

    public static final q f(q qVar, g gVar) {
        C17542s.j(qVar, "<this>");
        C17542s.j(gVar, "typeTable");
        if (qVar.j0()) {
            return qVar.W();
        }
        if (qVar.k0()) {
            return gVar.a(qVar.X());
        }
        return null;
    }

    public static final boolean g(i iVar) {
        C17542s.j(iVar, "<this>");
        return iVar.q0() || iVar.r0();
    }

    public static final boolean h(n nVar) {
        C17542s.j(nVar, "<this>");
        return nVar.n0() || nVar.o0();
    }

    public static final q i(C16830c cVar, g gVar) {
        C17542s.j(cVar, "<this>");
        C17542s.j(gVar, "typeTable");
        if (cVar.j1()) {
            return cVar.E0();
        }
        if (cVar.k1()) {
            return gVar.a(cVar.F0());
        }
        return null;
    }

    public static final q j(q qVar, g gVar) {
        C17542s.j(qVar, "<this>");
        C17542s.j(gVar, "typeTable");
        if (qVar.m0()) {
            return qVar.Z();
        }
        if (qVar.n0()) {
            return gVar.a(qVar.a0());
        }
        return null;
    }

    public static final q k(i iVar, g gVar) {
        C17542s.j(iVar, "<this>");
        C17542s.j(gVar, "typeTable");
        if (iVar.q0()) {
            return iVar.a0();
        }
        if (iVar.r0()) {
            return gVar.a(iVar.b0());
        }
        return null;
    }

    public static final q l(n nVar, g gVar) {
        C17542s.j(nVar, "<this>");
        C17542s.j(gVar, "typeTable");
        if (nVar.n0()) {
            return nVar.Z();
        }
        if (nVar.o0()) {
            return gVar.a(nVar.a0());
        }
        return null;
    }

    public static final q m(i iVar, g gVar) {
        C17542s.j(iVar, "<this>");
        C17542s.j(gVar, "typeTable");
        if (iVar.s0()) {
            q c02 = iVar.c0();
            C17542s.i(c02, "getReturnType(...)");
            return c02;
        } else if (iVar.t0()) {
            return gVar.a(iVar.d0());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Function");
        }
    }

    public static final q n(n nVar, g gVar) {
        C17542s.j(nVar, "<this>");
        C17542s.j(gVar, "typeTable");
        if (nVar.p0()) {
            q b02 = nVar.b0();
            C17542s.i(b02, "getReturnType(...)");
            return b02;
        } else if (nVar.q0()) {
            return gVar.a(nVar.c0());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Property");
        }
    }

    public static final List<q> o(C16830c cVar, g gVar) {
        C17542s.j(cVar, "<this>");
        C17542s.j(gVar, "typeTable");
        List<q> V02 = cVar.V0();
        if (V02.isEmpty()) {
            V02 = null;
        }
        if (V02 == null) {
            List<Integer> U02 = cVar.U0();
            C17542s.i(U02, "getSupertypeIdList(...)");
            Iterable<Integer> iterable = U02;
            V02 = new ArrayList<>(C16877v.y(iterable, 10));
            for (Integer num : iterable) {
                C17542s.g(num);
                V02.add(gVar.a(num.intValue()));
            }
        }
        return V02;
    }

    public static final q p(q.b bVar, g gVar) {
        C17542s.j(bVar, "<this>");
        C17542s.j(gVar, "typeTable");
        if (bVar.w()) {
            return bVar.t();
        }
        if (bVar.x()) {
            return gVar.a(bVar.u());
        }
        return null;
    }

    public static final q q(u uVar, g gVar) {
        C17542s.j(uVar, "<this>");
        C17542s.j(gVar, "typeTable");
        if (uVar.N()) {
            q H10 = uVar.H();
            C17542s.i(H10, "getType(...)");
            return H10;
        } else if (uVar.O()) {
            return gVar.a(uVar.I());
        } else {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
        }
    }

    public static final q r(r rVar, g gVar) {
        C17542s.j(rVar, "<this>");
        C17542s.j(gVar, "typeTable");
        if (rVar.c0()) {
            q V10 = rVar.V();
            C17542s.i(V10, "getUnderlyingType(...)");
            return V10;
        } else if (rVar.d0()) {
            return gVar.a(rVar.W());
        } else {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
        }
    }

    public static final List<q> s(s sVar, g gVar) {
        C17542s.j(sVar, "<this>");
        C17542s.j(gVar, "typeTable");
        List<q> N10 = sVar.N();
        if (N10.isEmpty()) {
            N10 = null;
        }
        if (N10 == null) {
            List<Integer> M10 = sVar.M();
            C17542s.i(M10, "getUpperBoundIdList(...)");
            Iterable<Integer> iterable = M10;
            N10 = new ArrayList<>(C16877v.y(iterable, 10));
            for (Integer num : iterable) {
                C17542s.g(num);
                N10.add(gVar.a(num.intValue()));
            }
        }
        return N10;
    }

    public static final q t(u uVar, g gVar) {
        C17542s.j(uVar, "<this>");
        C17542s.j(gVar, "typeTable");
        if (uVar.P()) {
            return uVar.J();
        }
        if (uVar.Q()) {
            return gVar.a(uVar.K());
        }
        return null;
    }
}
