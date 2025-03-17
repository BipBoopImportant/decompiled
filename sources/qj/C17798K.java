package qJ;

import DI.C15535F;
import DI.C15544O;
import DI.C15554a;
import DI.C15555b;
import DI.C15557d;
import DI.C15558e;
import DI.C15559f;
import DI.C15565l;
import DI.C15566m;
import DI.C15574u;
import DI.a0;
import DI.b0;
import DI.c0;
import DI.d0;
import DI.h0;
import DI.i0;
import DI.m0;
import DI.n0;
import DI.u0;
import EI.C15644c;
import EI.C15649h;
import GI.C15718L;
import GI.C15719M;
import GI.C15727V;
import GI.C15748r;
import XH.v;
import XI.C16829b;
import XI.C16831d;
import XI.i;
import XI.k;
import XI.n;
import XI.q;
import XI.r;
import XI.s;
import XI.u;
import XI.x;
import YH.C16877v;
import YH.X;
import ZI.C17004a;
import ZI.C17005b;
import ZI.c;
import ZI.f;
import ZI.g;
import ZI.h;
import cJ.C17069f;
import eJ.C17206q;
import gJ.C17277h;
import iJ.C17373g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qJ.C17801N;
import sJ.C17918N;
import sJ.C17919O;
import sJ.C17920P;
import sJ.C17923T;
import sJ.C17924a;
import sJ.C17926c;
import sJ.C17936m;
import tJ.C17990j;
import uJ.C18096U;

/* renamed from: qJ.K  reason: case insensitive filesystem */
public final class C17798K {

    /* renamed from: a  reason: collision with root package name */
    private final C17828p f146497a;

    /* renamed from: b  reason: collision with root package name */
    private final C17819g f146498b;

    public C17798K(C17828p pVar) {
        C17542s.j(pVar, "c");
        this.f146497a = pVar;
        this.f146498b = new C17819g(pVar.c().q(), pVar.c().r());
    }

    private final d0 A(q qVar, C17828p pVar, C15554a aVar, int i10) {
        return C17277h.b(aVar, pVar.i().u(qVar), (C17069f) null, C15649h.f134231V.b(), i10);
    }

    private final List<u0> B(List<u> list, C17206q qVar, C17816d dVar) {
        C15566m e10 = this.f146497a.e();
        C17542s.h(e10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        C15554a aVar = (C15554a) e10;
        C15566m b10 = aVar.b();
        C17542s.i(b10, "getContainingDeclaration(...)");
        C17801N i10 = i(b10);
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        int i11 = 0;
        for (Object next : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C16877v.x();
            }
            u uVar = (u) next;
            int F10 = uVar.L() ? uVar.F() : 0;
            C17923T b11 = (i10 == null || !C17005b.f140813c.d(F10).booleanValue()) ? C15649h.f134231V.b() : new C17923T(this.f146497a.h(), new C17795H(this, i10, qVar, dVar, i11, uVar));
            C17069f b12 = C17799L.b(this.f146497a.g(), uVar.G());
            C18096U u10 = this.f146497a.i().u(f.q(uVar, this.f146497a.j()));
            Boolean f10 = C17005b.f140802H.d(F10);
            C17542s.i(f10, "get(...)");
            boolean booleanValue = f10.booleanValue();
            Boolean f11 = C17005b.f140803I.d(F10);
            C17542s.i(f11, "get(...)");
            boolean booleanValue2 = f11.booleanValue();
            Boolean f12 = C17005b.f140804J.d(F10);
            C17542s.i(f12, "get(...)");
            boolean booleanValue3 = f12.booleanValue();
            q t10 = f.t(uVar, this.f146497a.j());
            C18096U u11 = t10 != null ? this.f146497a.i().u(t10) : null;
            i0 i0Var = i0.f133841a;
            C17542s.i(i0Var, "NO_SOURCE");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new C15727V(aVar, (u0) null, i11, b11, b12, u10, booleanValue, booleanValue2, booleanValue3, u11, i0Var));
            arrayList = arrayList2;
            i11 = i12;
        }
        return C16877v.t1(arrayList);
    }

    /* access modifiers changed from: private */
    public static final List C(C17798K k10, C17801N n10, C17206q qVar, C17816d dVar, int i10, u uVar) {
        return C16877v.t1(k10.f146497a.c().d().l(n10, qVar, dVar, i10, uVar));
    }

    private final C17801N i(C15566m mVar) {
        if (mVar instanceof C15544O) {
            return new C17801N.b(((C15544O) mVar).f(), this.f146497a.g(), this.f146497a.j(), this.f146497a.d());
        }
        if (mVar instanceof C17936m) {
            return ((C17936m) mVar).i1();
        }
        return null;
    }

    private final C15649h j(C17206q qVar, int i10, C17816d dVar) {
        return !C17005b.f140813c.d(i10).booleanValue() ? C15649h.f134231V.b() : new C17923T(this.f146497a.h(), new C17792E(this, qVar, dVar));
    }

    /* access modifiers changed from: private */
    public static final List k(C17798K k10, C17206q qVar, C17816d dVar) {
        C17801N i10 = k10.i(k10.f146497a.e());
        List t12 = i10 != null ? C16877v.t1(k10.f146497a.c().d().j(i10, qVar, dVar)) : null;
        return t12 == null ? C16877v.n() : t12;
    }

    private final d0 l() {
        C15566m e10 = this.f146497a.e();
        C15558e eVar = e10 instanceof C15558e ? (C15558e) e10 : null;
        if (eVar != null) {
            return eVar.J0();
        }
        return null;
    }

    private final C15649h m(n nVar, boolean z10) {
        return !C17005b.f140813c.d(nVar.V()).booleanValue() ? C15649h.f134231V.b() : new C17923T(this.f146497a.h(), new C17793F(this, z10, nVar));
    }

    /* access modifiers changed from: private */
    public static final List n(C17798K k10, boolean z10, n nVar) {
        C17801N i10 = k10.i(k10.f146497a.e());
        List t12 = i10 != null ? z10 ? C16877v.t1(k10.f146497a.c().d().g(i10, nVar)) : C16877v.t1(k10.f146497a.c().d().c(i10, nVar)) : null;
        return t12 == null ? C16877v.n() : t12;
    }

    private final C15649h o(C17206q qVar, C17816d dVar) {
        return new C17924a(this.f146497a.h(), new C17794G(this, qVar, dVar));
    }

    /* access modifiers changed from: private */
    public static final List p(C17798K k10, C17206q qVar, C17816d dVar) {
        C17801N i10 = k10.i(k10.f146497a.e());
        List<C15644c> e10 = i10 != null ? k10.f146497a.c().d().e(i10, qVar, dVar) : null;
        return e10 == null ? C16877v.n() : e10;
    }

    private final void q(C17919O o10, d0 d0Var, d0 d0Var2, List<? extends d0> list, List<? extends n0> list2, List<? extends u0> list3, C18096U u10, C15535F f10, C15574u uVar, Map<? extends C15554a.C3296a<?>, ?> map) {
        o10.o1(d0Var, d0Var2, list, list2, list3, u10, f10, uVar, map);
    }

    private final int t(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    /* access modifiers changed from: private */
    public static final C17990j v(C17798K k10, n nVar, C17918N n10) {
        return k10.f146497a.h().a(new C17796I(k10, nVar, n10));
    }

    /* access modifiers changed from: private */
    public static final C17373g w(C17798K k10, n nVar, C17918N n10) {
        C17801N i10 = k10.i(k10.f146497a.e());
        C17542s.g(i10);
        C17817e<C15644c, C17373g<?>> d10 = k10.f146497a.c().d();
        C18096U returnType = n10.getReturnType();
        C17542s.i(returnType, "getReturnType(...)");
        return d10.d(i10, nVar, returnType);
    }

    /* access modifiers changed from: private */
    public static final C17990j x(C17798K k10, n nVar, C17918N n10) {
        return k10.f146497a.h().a(new C17797J(k10, nVar, n10));
    }

    /* access modifiers changed from: private */
    public static final C17373g y(C17798K k10, n nVar, C17918N n10) {
        C17801N i10 = k10.i(k10.f146497a.e());
        C17542s.g(i10);
        C17817e<C15644c, C17373g<?>> d10 = k10.f146497a.c().d();
        C18096U returnType = n10.getReturnType();
        C17542s.i(returnType, "getReturnType(...)");
        return d10.a(i10, nVar, returnType);
    }

    public final C15557d r(C16831d dVar, boolean z10) {
        C16831d dVar2 = dVar;
        C17542s.j(dVar2, "proto");
        C15566m e10 = this.f146497a.e();
        C17542s.h(e10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        C15558e eVar = (C15558e) e10;
        int E10 = dVar.E();
        C17816d dVar3 = C17816d.FUNCTION;
        C17926c cVar = r1;
        C17926c cVar2 = new C17926c(eVar, (C15565l) null, j(dVar2, E10, dVar3), z10, C15555b.a.DECLARATION, dVar, this.f146497a.g(), this.f146497a.j(), this.f146497a.k(), this.f146497a.d(), (i0) null, 1024, (DefaultConstructorMarker) null);
        C17798K f10 = C17828p.b(this.f146497a, cVar, C16877v.n(), (c) null, (g) null, (h) null, (C17004a) null, 60, (Object) null).f();
        List<u> H10 = dVar.H();
        C17542s.i(H10, "getValueParameterList(...)");
        C17926c cVar3 = cVar;
        cVar3.q1(f10.B(H10, dVar2, dVar3), C17803P.a(C17802O.f146513a, C17005b.f140814d.d(dVar.E())));
        cVar3.g1(eVar.r());
        cVar3.W0(eVar.m0());
        cVar3.Y0(!C17005b.f140825o.d(dVar.E()).booleanValue());
        return cVar3;
    }

    public final h0 s(i iVar) {
        C18096U u10;
        i iVar2 = iVar;
        C17542s.j(iVar2, "proto");
        int X10 = iVar.n0() ? iVar.X() : t(iVar.Z());
        C17816d dVar = C17816d.FUNCTION;
        C15649h j10 = j(iVar2, X10, dVar);
        C15649h o10 = f.g(iVar) ? o(iVar2, dVar) : C15649h.f134231V.b();
        C17919O o11 = new C17919O(this.f146497a.e(), (h0) null, j10, C17799L.b(this.f146497a.g(), iVar.Y()), C17803P.b(C17802O.f146513a, C17005b.f140826p.d(X10)), iVar, this.f146497a.g(), this.f146497a.j(), C17542s.e(C17506e.o(this.f146497a.e()).b(C17799L.b(this.f146497a.g(), iVar.Y())), C17804Q.f146525a) ? h.f140844b.b() : this.f146497a.k(), this.f146497a.d(), (i0) null, 1024, (DefaultConstructorMarker) null);
        C17828p pVar = this.f146497a;
        List<s> g02 = iVar.g0();
        C17542s.i(g02, "getTypeParameterList(...)");
        C17828p b10 = C17828p.b(pVar, o11, g02, (c) null, (g) null, (h) null, (C17004a) null, 60, (Object) null);
        q k10 = f.k(iVar2, this.f146497a.j());
        d0 i10 = (k10 == null || (u10 = b10.i().u(k10)) == null) ? null : C17277h.i(o11, u10, o10);
        d0 l10 = l();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object next : f.c(iVar2, this.f146497a.j())) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C16877v.x();
            }
            d0 A10 = A((q) next, b10, o11, i11);
            if (A10 != null) {
                arrayList.add(A10);
            }
            i11 = i12;
        }
        List<n0> m10 = b10.i().m();
        C17798K f10 = b10.f();
        List<u> k02 = iVar.k0();
        C17542s.i(k02, "getValueParameterList(...)");
        List<u0> B10 = f10.B(k02, iVar2, C17816d.FUNCTION);
        C18096U u11 = b10.i().u(f.m(iVar2, this.f146497a.j()));
        C17802O o12 = C17802O.f146513a;
        C17919O o13 = o11;
        C17828p pVar2 = b10;
        C17919O o14 = o11;
        int i13 = X10;
        q(o13, i10, l10, arrayList, m10, B10, u11, o12.b(C17005b.f140815e.d(X10)), C17803P.a(o12, C17005b.f140814d.d(X10)), X.j());
        o14.f1(C17005b.f140827q.d(i13).booleanValue());
        o14.c1(C17005b.f140828r.d(i13).booleanValue());
        o14.X0(C17005b.f140831u.d(i13).booleanValue());
        o14.e1(C17005b.f140829s.d(i13).booleanValue());
        o14.i1(C17005b.f140830t.d(i13).booleanValue());
        o14.h1(C17005b.f140832v.d(i13).booleanValue());
        o14.W0(C17005b.f140833w.d(i13).booleanValue());
        o14.Y0(!C17005b.f140834x.d(i13).booleanValue());
        v<C15554a.C3296a<?>, Object> a10 = this.f146497a.c().h().a(iVar2, o14, this.f146497a.j(), pVar2.i());
        if (a10 != null) {
            o14.U0(a10.c(), a10.d());
        }
        return o14;
    }

    public final a0 u(n nVar) {
        n nVar2;
        C15649h hVar;
        C17918N n10;
        d0 d0Var;
        C17005b.d<k> dVar;
        C17005b.d<x> dVar2;
        C17828p pVar;
        C15718L l10;
        n nVar3;
        C17918N n11;
        C15718L l11;
        C15719M m10;
        C15718L l12;
        C18096U u10;
        n nVar4 = nVar;
        C17542s.j(nVar4, "proto");
        int V10 = nVar.j0() ? nVar.V() : t(nVar.Y());
        C15566m e10 = this.f146497a.e();
        C15649h j10 = j(nVar4, V10, C17816d.PROPERTY);
        C17802O o10 = C17802O.f146513a;
        C15535F b10 = o10.b(C17005b.f140815e.d(V10));
        C15574u a10 = C17803P.a(o10, C17005b.f140814d.d(V10));
        Boolean f10 = C17005b.f140835y.d(V10);
        C17542s.i(f10, "get(...)");
        boolean booleanValue = f10.booleanValue();
        C17069f b11 = C17799L.b(this.f146497a.g(), nVar.X());
        C15555b.a b12 = C17803P.b(o10, C17005b.f140826p.d(V10));
        Boolean f11 = C17005b.f140797C.d(V10);
        C17542s.i(f11, "get(...)");
        boolean booleanValue2 = f11.booleanValue();
        Boolean f12 = C17005b.f140796B.d(V10);
        C17542s.i(f12, "get(...)");
        boolean booleanValue3 = f12.booleanValue();
        Boolean f13 = C17005b.f140799E.d(V10);
        C17542s.i(f13, "get(...)");
        boolean booleanValue4 = f13.booleanValue();
        C17918N n12 = r1;
        Boolean f14 = C17005b.f140800F.d(V10);
        C17542s.i(f14, "get(...)");
        String str = "get(...)";
        boolean booleanValue5 = f14.booleanValue();
        Boolean f15 = C17005b.f140801G.d(V10);
        C17542s.i(f15, str);
        C17918N n13 = n12;
        String str2 = str;
        C17918N n14 = new C17918N(e10, (a0) null, j10, b10, a10, booleanValue, b11, b12, booleanValue2, booleanValue3, booleanValue4, booleanValue5, f15.booleanValue(), nVar, this.f146497a.g(), this.f146497a.j(), this.f146497a.k(), this.f146497a.d());
        C17828p pVar2 = this.f146497a;
        List<s> h02 = nVar.h0();
        C17542s.i(h02, "getTypeParameterList(...)");
        C17828p b13 = C17828p.b(pVar2, n13, h02, (c) null, (g) null, (h) null, (C17004a) null, 60, (Object) null);
        int i10 = V10;
        Boolean f16 = C17005b.f140836z.d(i10);
        String str3 = str2;
        C17542s.i(f16, str3);
        boolean booleanValue6 = f16.booleanValue();
        if (!booleanValue6 || !f.h(nVar)) {
            nVar2 = nVar;
            hVar = C15649h.f134231V.b();
        } else {
            nVar2 = nVar;
            hVar = o(nVar2, C17816d.PROPERTY_GETTER);
        }
        C18096U u11 = b13.i().u(f.n(nVar2, this.f146497a.j()));
        List<n0> m11 = b13.i().m();
        d0 l13 = l();
        q l14 = f.l(nVar2, this.f146497a.j());
        C15559f fVar = null;
        if (l14 == null || (u10 = b13.i().u(l14)) == null) {
            n10 = n13;
            d0Var = null;
        } else {
            n10 = n13;
            d0Var = C17277h.i(n10, u10, hVar);
        }
        Iterable d10 = f.d(nVar2, this.f146497a.j());
        ArrayList arrayList = new ArrayList(C16877v.y(d10, 10));
        int i11 = 0;
        for (Object next : d10) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C16877v.x();
            }
            arrayList.add(A((q) next, b13, n10, i11));
            i11 = i12;
        }
        n10.b1(u11, m11, l13, d0Var, arrayList);
        Boolean f17 = C17005b.f140813c.d(i10);
        C17542s.i(f17, str3);
        boolean booleanValue7 = f17.booleanValue();
        C17005b.d<x> dVar3 = C17005b.f140814d;
        C17005b.d<k> dVar4 = C17005b.f140815e;
        int b14 = C17005b.b(booleanValue7, dVar3.d(i10), dVar4.d(i10), false, false, false);
        if (booleanValue6) {
            int W10 = nVar.k0() ? nVar.W() : b14;
            Boolean f18 = C17005b.f140805K.d(W10);
            C17542s.i(f18, str3);
            boolean booleanValue8 = f18.booleanValue();
            Boolean f19 = C17005b.f140806L.d(W10);
            C17542s.i(f19, str3);
            boolean booleanValue9 = f19.booleanValue();
            Boolean f20 = C17005b.f140807M.d(W10);
            C17542s.i(f20, str3);
            boolean booleanValue10 = f20.booleanValue();
            C15649h j11 = j(nVar2, W10, C17816d.PROPERTY_GETTER);
            if (booleanValue8) {
                C17802O o11 = C17802O.f146513a;
                dVar = dVar4;
                pVar = b13;
                n11 = n10;
                dVar2 = dVar3;
                nVar3 = nVar2;
                l12 = new C15718L(n10, j11, o11.b(dVar4.d(W10)), C17803P.a(o11, dVar3.d(W10)), !booleanValue8, booleanValue9, booleanValue10, n10.h(), (b0) null, i0.f133841a);
            } else {
                pVar = b13;
                dVar = dVar4;
                dVar2 = dVar3;
                n11 = n10;
                nVar3 = nVar2;
                C15718L d11 = C17277h.d(n11, j11);
                C17542s.g(d11);
                l12 = d11;
            }
            l12.Q0(n11.getReturnType());
            l10 = l12;
        } else {
            pVar = b13;
            dVar = dVar4;
            dVar2 = dVar3;
            n11 = n10;
            nVar3 = nVar2;
            l10 = null;
        }
        if (C17005b.f140795A.d(i10).booleanValue()) {
            if (nVar.r0()) {
                b14 = nVar.d0();
            }
            int i13 = b14;
            Boolean f21 = C17005b.f140805K.d(i13);
            C17542s.i(f21, str3);
            boolean booleanValue11 = f21.booleanValue();
            Boolean f22 = C17005b.f140806L.d(i13);
            C17542s.i(f22, str3);
            boolean booleanValue12 = f22.booleanValue();
            Boolean f23 = C17005b.f140807M.d(i13);
            C17542s.i(f23, str3);
            boolean booleanValue13 = f23.booleanValue();
            C17816d dVar5 = C17816d.PROPERTY_SETTER;
            C15649h j12 = j(nVar3, i13, dVar5);
            if (booleanValue11) {
                C17802O o12 = C17802O.f146513a;
                C15719M m12 = r4;
                l11 = l10;
                C15719M m13 = new C15719M(n11, j12, o12.b(dVar.d(i13)), C17803P.a(o12, dVar2.d(i13)), !booleanValue11, booleanValue12, booleanValue13, n11.h(), (c0) null, i0.f133841a);
                C15719M m14 = m12;
                m14.R0((u0) C16877v.b1(C17828p.b(pVar, m12, C16877v.n(), (c) null, (g) null, (h) null, (C17004a) null, 60, (Object) null).f().B(C16877v.e(nVar.e0()), nVar3, dVar5)));
                m10 = m14;
            } else {
                l11 = l10;
                m10 = C17277h.e(n11, j12, C15649h.f134231V.b());
                C17542s.g(m10);
            }
        } else {
            l11 = l10;
            m10 = null;
        }
        if (C17005b.f140798D.d(i10).booleanValue()) {
            n11.L0(new C17790C(this, nVar3, n11));
        }
        C15566m e11 = this.f146497a.e();
        C15558e eVar = e11 instanceof C15558e ? (C15558e) e11 : null;
        if (eVar != null) {
            fVar = eVar.h();
        }
        if (fVar == C15559f.ANNOTATION_CLASS) {
            n11.L0(new C17791D(this, nVar3, n11));
        }
        n11.V0(l11, m10, new C15748r(m(nVar3, false), n11), new C15748r(m(nVar3, true), n11));
        return n11;
    }

    public final m0 z(r rVar) {
        r rVar2 = rVar;
        C17542s.j(rVar2, "proto");
        C15649h.a aVar = C15649h.f134231V;
        List<C16829b> L10 = rVar.L();
        C17542s.i(L10, "getAnnotationList(...)");
        Iterable<C16829b> iterable = L10;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C16829b bVar : iterable) {
            C17819g gVar = this.f146498b;
            C17542s.g(bVar);
            arrayList.add(gVar.a(bVar, this.f146497a.g()));
        }
        C17920P p10 = new C17920P(this.f146497a.h(), this.f146497a.e(), aVar.a(arrayList), C17799L.b(this.f146497a.g(), rVar.R()), C17803P.a(C17802O.f146513a, C17005b.f140814d.d(rVar.Q())), rVar, this.f146497a.g(), this.f146497a.j(), this.f146497a.k(), this.f146497a.d());
        C17828p pVar = this.f146497a;
        List<s> U10 = rVar.U();
        C17542s.i(U10, "getTypeParameterList(...)");
        C17920P p11 = p10;
        C17828p b10 = C17828p.b(pVar, p10, U10, (c) null, (g) null, (h) null, (C17004a) null, 60, (Object) null);
        p11.W0(b10.i().m(), b10.i().o(f.r(rVar2, this.f146497a.j()), false), b10.i().o(f.e(rVar2, this.f146497a.j()), false));
        return p11;
    }
}
