package QI;

import AI.C15429j;
import DI.C15535F;
import DI.C15554a;
import DI.C15557d;
import DI.C15558e;
import DI.C15565l;
import DI.C15573t;
import DI.C15574u;
import DI.C15579z;
import DI.a0;
import DI.b0;
import DI.c0;
import DI.d0;
import DI.h0;
import DI.n0;
import DI.u0;
import EI.C15649h;
import EJ.C15660a;
import EJ.C15671l;
import GI.C15718L;
import GI.C15719M;
import GI.C15727V;
import GI.C15739i;
import GI.C15747q;
import KI.C15984a;
import LI.C16015b;
import LI.d;
import MI.C16047H;
import MI.C16048I;
import MI.C16053N;
import MI.C16062f;
import MI.C16065i;
import MI.C16069m;
import MI.C16076u;
import MI.T;
import MI.U;
import MI.V;
import MI.y;
import MI.z;
import NI.C16097a;
import NI.o;
import OI.C16160b;
import OI.C16162d;
import OI.C16163e;
import OI.C16164f;
import OI.h;
import PI.C16193c;
import PI.C16198h;
import PI.C16201k;
import QI.U;
import RI.C16377a;
import RI.C16378b;
import TI.C16502f;
import TI.C16503g;
import TI.k;
import TI.n;
import TI.q;
import TI.r;
import TI.w;
import TI.x;
import UI.m0;
import VI.C16661C;
import XH.v;
import YH.C16877v;
import YH.X;
import YH.g0;
import cJ.C17065b;
import cJ.C17069f;
import gJ.C17277h;
import gJ.C17278i;
import gJ.C17284o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kJ.C17506e;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nJ.C17649d;
import tI.C17978n;
import tJ.C17988h;
import tJ.C17989i;
import uJ.C18096U;
import uJ.L0;
import uJ.M0;
import vJ.e;

/* renamed from: QI.z  reason: case insensitive filesystem */
public final class C16282z extends U {

    /* renamed from: n  reason: collision with root package name */
    private final C15558e f137540n;

    /* renamed from: o  reason: collision with root package name */
    private final C16503g f137541o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f137542p;

    /* renamed from: q  reason: collision with root package name */
    private final C17989i<List<C15557d>> f137543q;

    /* renamed from: r  reason: collision with root package name */
    private final C17989i<Set<C17069f>> f137544r;

    /* renamed from: s  reason: collision with root package name */
    private final C17989i<Set<C17069f>> f137545s;

    /* renamed from: t  reason: collision with root package name */
    private final C17989i<Map<C17069f, n>> f137546t;

    /* renamed from: u  reason: collision with root package name */
    private final C17988h<C17069f, C15558e> f137547u;

    /* renamed from: QI.z$a */
    /* synthetic */ class a extends C17540p implements C17642l<C17069f, Collection<? extends h0>> {
        a(Object obj) {
            super(1, obj, C16282z.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
        }

        /* renamed from: t */
        public final Collection<h0> invoke(C17069f fVar) {
            C17542s.j(fVar, "p0");
            return ((C16282z) this.receiver).q1(fVar);
        }
    }

    /* renamed from: QI.z$b */
    /* synthetic */ class b extends C17540p implements C17642l<C17069f, Collection<? extends h0>> {
        b(Object obj) {
            super(1, obj, C16282z.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
        }

        /* renamed from: t */
        public final Collection<h0> invoke(C17069f fVar) {
            C17542s.j(fVar, "p0");
            return ((C16282z) this.receiver).r1(fVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16282z(C16201k kVar, C15558e eVar, C16503g gVar, boolean z10, C16282z zVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, eVar, gVar, z10, (i10 & 16) != 0 ? null : zVar);
    }

    /* access modifiers changed from: private */
    public static final Collection A0(C16282z zVar, C17069f fVar) {
        C17542s.j(fVar, "it");
        return zVar.q1(fVar);
    }

    /* access modifiers changed from: private */
    public static final Collection B0(C16282z zVar, C17069f fVar) {
        C17542s.j(fVar, "it");
        return zVar.r1(fVar);
    }

    private final Collection<C18096U> C0() {
        if (!this.f137542p) {
            return L().a().k().c().g(R());
        }
        Collection<C18096U> a10 = R().k().a();
        C17542s.i(a10, "getSupertypes(...)");
        return a10;
    }

    /* access modifiers changed from: private */
    public static final List D0(C16282z zVar, C16201k kVar) {
        Collection<k> l10 = zVar.f137541o.l();
        ArrayList arrayList = new ArrayList(l10.size());
        for (k o12 : l10) {
            arrayList.add(zVar.o1(o12));
        }
        if (zVar.f137541o.q()) {
            C15557d G02 = zVar.G0();
            String c10 = C16661C.c(G02, false, false, 2, (Object) null);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C17542s.e(C16661C.c((C15557d) it.next(), false, false, 2, (Object) null), c10)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            arrayList.add(G02);
            kVar.a().h().a(zVar.f137541o, G02);
        }
        kVar.a().w().f(zVar.R(), arrayList, kVar);
        m0 r10 = kVar.a().r();
        boolean isEmpty = arrayList.isEmpty();
        Collection collection = arrayList;
        if (isEmpty) {
            collection = C16877v.r(zVar.F0());
        }
        return C16877v.t1(r10.p(kVar, collection));
    }

    private final List<u0> E0(C15739i iVar) {
        v vVar;
        Collection<r> C10 = this.f137541o.C();
        ArrayList arrayList = new ArrayList(C10.size());
        C16377a b10 = C16378b.b(L0.COMMON, true, false, (n0) null, 6, (Object) null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object next : C10) {
            if (C17542s.e(((r) next).getName(), C16048I.f136291c)) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        v vVar2 = new v(arrayList2, arrayList3);
        List list = (List) vVar2.a();
        List<r> list2 = (List) vVar2.b();
        list.size();
        r rVar = (r) C16877v.y0(list);
        int i10 = 1;
        if (rVar != null) {
            x returnType = rVar.getReturnType();
            if (returnType instanceof C16502f) {
                C16502f fVar = (C16502f) returnType;
                vVar = new v(L().g().l(fVar, b10, true), L().g().p(fVar.n(), b10));
            } else {
                vVar = new v(L().g().p(returnType, b10), null);
            }
            s0(arrayList, iVar, 0, rVar, (C18096U) vVar.a(), (C18096U) vVar.b());
        }
        int i11 = 0;
        if (rVar == null) {
            i10 = 0;
        }
        for (r rVar2 : list2) {
            s0(arrayList, iVar, i11 + i10, rVar2, L().g().p(rVar2.getReturnType(), b10), (C18096U) null);
            i11++;
        }
        return arrayList;
    }

    private final C15557d F0() {
        boolean o10 = this.f137541o.o();
        if ((this.f137541o.L() || !this.f137541o.r()) && !o10) {
            return null;
        }
        C15558e c12 = R();
        C16160b t12 = C16160b.t1(c12, C15649h.f134231V.b(), true, L().a().t().a(this.f137541o));
        C17542s.i(t12, "createJavaConstructor(...)");
        List<u0> E02 = o10 ? E0(t12) : Collections.emptyList();
        t12.Z0(false);
        t12.q1(E02, Z0(c12));
        t12.Y0(true);
        t12.g1(c12.r());
        L().a().h().a(this.f137541o, t12);
        return t12;
    }

    private final C15557d G0() {
        C15558e c12 = R();
        C16160b t12 = C16160b.t1(c12, C15649h.f134231V.b(), true, L().a().t().a(this.f137541o));
        C17542s.i(t12, "createJavaConstructor(...)");
        List<u0> M02 = M0(t12);
        t12.Z0(false);
        t12.q1(M02, Z0(c12));
        t12.Y0(false);
        t12.g1(c12.r());
        return t12;
    }

    private final h0 H0(h0 h0Var, C15554a aVar, Collection<? extends h0> collection) {
        Iterable<h0> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return h0Var;
        }
        for (h0 h0Var2 : iterable) {
            if (!C17542s.e(h0Var, h0Var2) && h0Var2.t0() == null && Q0(h0Var2, aVar)) {
                Object g10 = h0Var.x().h().g();
                C17542s.g(g10);
                return (h0) g10;
            }
        }
        return h0Var;
    }

    private final h0 I0(C15579z zVar, C17642l<? super C17069f, ? extends Collection<? extends h0>> lVar) {
        Object obj;
        C17069f name = zVar.getName();
        C17542s.i(name, "getName(...)");
        Iterator it = ((Iterable) lVar.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (e1((h0) obj, zVar)) {
                break;
            }
        }
        h0 h0Var = (h0) obj;
        if (h0Var == null) {
            return null;
        }
        C15579z.a<? extends h0> x10 = h0Var.x();
        List<u0> j10 = zVar.j();
        C17542s.i(j10, "getValueParameters(...)");
        Iterable<u0> iterable = j10;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (u0 type : iterable) {
            arrayList.add(type.getType());
        }
        List<u0> j11 = h0Var.j();
        C17542s.i(j11, "getValueParameters(...)");
        x10.b(h.a(arrayList, j11, zVar));
        x10.u();
        x10.n();
        x10.k(C16163e.f136912H, Boolean.TRUE);
        return (h0) x10.g();
    }

    private final C16164f J0(a0 a0Var, C17642l<? super C17069f, ? extends Collection<? extends h0>> lVar) {
        h0 h0Var;
        C15719M m10 = null;
        if (!P0(a0Var, lVar)) {
            return null;
        }
        h0 W02 = W0(a0Var, lVar);
        C17542s.g(W02);
        if (a0Var.N()) {
            h0Var = X0(a0Var, lVar);
            C17542s.g(h0Var);
        } else {
            h0Var = null;
        }
        if (h0Var != null) {
            h0Var.u();
            W02.u();
        }
        C16162d dVar = new C16162d(R(), W02, h0Var, a0Var);
        C18096U returnType = W02.getReturnType();
        C17542s.g(returnType);
        C16162d dVar2 = dVar;
        dVar2.b1(returnType, C16877v.n(), O(), (d0) null, C16877v.n());
        C15718L k10 = C17277h.k(dVar2, W02.getAnnotations(), false, false, false, W02.i());
        k10.N0(W02);
        k10.Q0(dVar.getType());
        C17542s.i(k10, "apply(...)");
        if (h0Var != null) {
            List<u0> j10 = h0Var.j();
            C17542s.i(j10, "getValueParameters(...)");
            u0 u0Var = (u0) C16877v.y0(j10);
            if (u0Var != null) {
                m10 = C17277h.m(dVar, h0Var.getAnnotations(), u0Var.getAnnotations(), false, false, false, h0Var.getVisibility(), h0Var.i());
                m10.N0(h0Var);
            } else {
                throw new AssertionError("No parameter found for " + h0Var);
            }
        }
        dVar.U0(k10, m10);
        return dVar;
    }

    private final C16164f K0(r rVar, C18096U u10, C15535F f10) {
        C18096U u11;
        r rVar2 = rVar;
        C16164f f12 = C16164f.f1(R(), C16198h.a(L(), rVar2), f10, V.d(rVar.getVisibility()), false, rVar.getName(), L().a().t().a(rVar2), false);
        C17542s.i(f12, "create(...)");
        C15718L d10 = C17277h.d(f12, C15649h.f134231V.b());
        C17542s.i(d10, "createDefaultGetter(...)");
        f12.U0(d10, (c0) null);
        if (u10 == null) {
            u11 = A(rVar2, C16193c.i(L(), f12, rVar, 0, 4, (Object) null));
        } else {
            u11 = u10;
        }
        f12.b1(u11, C16877v.n(), O(), (d0) null, C16877v.n());
        d10.Q0(u11);
        return f12;
    }

    static /* synthetic */ C16164f L0(C16282z zVar, r rVar, C18096U u10, C15535F f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            u10 = null;
        }
        return zVar.K0(rVar, u10, f10);
    }

    private final List<u0> M0(C15739i iVar) {
        Collection<w> m10 = this.f137541o.m();
        ArrayList arrayList = new ArrayList(m10.size());
        C16377a b10 = C16378b.b(L0.COMMON, false, false, (n0) null, 6, (Object) null);
        Iterator it = m10.iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return arrayList;
            }
            i10 = i11 + 1;
            w wVar = (w) it.next();
            C18096U p10 = L().g().p(wVar.getType(), b10);
            C15727V v10 = r5;
            C15727V v11 = new C15727V(iVar, (u0) null, i11, C15649h.f134231V.b(), wVar.getName(), p10, false, false, false, wVar.b() ? L().a().m().p().k(p10) : null, L().a().t().a(wVar));
            arrayList.add(v10);
        }
    }

    private final h0 N0(h0 h0Var, C17069f fVar) {
        C15579z.a<? extends h0> x10 = h0Var.x();
        x10.j(fVar);
        x10.u();
        x10.n();
        Object g10 = x10.g();
        C17542s.g(g10);
        return (h0) g10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final DI.h0 O0(DI.h0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.j()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.Object r0 = YH.C16877v.K0(r0)
            DI.u0 r0 = (DI.u0) r0
            r2 = 0
            if (r0 == 0) goto L_0x007d
            uJ.U r3 = r0.getType()
            uJ.y0 r3 = r3.N0()
            DI.h r3 = r3.e()
            if (r3 == 0) goto L_0x0035
            cJ.d r3 = kJ.C17506e.p(r3)
            if (r3 == 0) goto L_0x0035
            boolean r4 = r3.f()
            if (r4 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            if (r3 == 0) goto L_0x0035
            cJ.c r3 = r3.m()
            goto L_0x0036
        L_0x0035:
            r3 = r2
        L_0x0036:
            cJ.c r4 = AI.C15435p.f133044v
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r3 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            if (r0 != 0) goto L_0x0043
            goto L_0x007d
        L_0x0043:
            DI.z$a r2 = r6.x()
            java.util.List r6 = r6.j()
            kotlin.jvm.internal.C17542s.i(r6, r1)
            r1 = 1
            java.util.List r6 = YH.C16877v.o0(r6, r1)
            DI.z$a r6 = r2.b(r6)
            uJ.U r0 = r0.getType()
            java.util.List r0 = r0.L0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            uJ.E0 r0 = (uJ.E0) r0
            uJ.U r0 = r0.getType()
            DI.z$a r6 = r6.t(r0)
            DI.z r6 = r6.g()
            DI.h0 r6 = (DI.h0) r6
            r0 = r6
            GI.O r0 = (GI.C15721O) r0
            if (r0 == 0) goto L_0x007c
            r0.h1(r1)
        L_0x007c:
            return r6
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: QI.C16282z.O0(DI.h0):DI.h0");
    }

    private final boolean P0(a0 a0Var, C17642l<? super C17069f, ? extends Collection<? extends h0>> lVar) {
        if (C16261d.a(a0Var)) {
            return false;
        }
        h0 W02 = W0(a0Var, lVar);
        h0 X02 = X0(a0Var, lVar);
        if (W02 == null) {
            return false;
        }
        if (!a0Var.N()) {
            return true;
        }
        return X02 != null && X02.u() == W02.u();
    }

    private final boolean Q0(C15554a aVar, C15554a aVar2) {
        C17284o.i.a c10 = C17284o.f143311f.F(aVar2, aVar, true).c();
        C17542s.i(c10, "getResult(...)");
        return c10 == C17284o.i.a.OVERRIDABLE && !z.f136406a.a(aVar2, aVar);
    }

    private final boolean R0(h0 h0Var) {
        U.a aVar = U.f136347a;
        C17069f name = h0Var.getName();
        C17542s.i(name, "getName(...)");
        C17069f b10 = aVar.b(name);
        if (b10 == null) {
            return false;
        }
        ArrayList<h0> arrayList = new ArrayList<>();
        for (Object next : b1(b10)) {
            if (T.d((h0) next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        h0 N02 = N0(h0Var, b10);
        if (arrayList.isEmpty()) {
            return false;
        }
        for (h0 S02 : arrayList) {
            if (S0(S02, N02)) {
                return true;
            }
        }
        return false;
    }

    private final boolean S0(h0 h0Var, C15579z zVar) {
        if (C16062f.f136372o.m(h0Var)) {
            zVar = zVar.a();
        }
        C17542s.g(zVar);
        return Q0(zVar, h0Var);
    }

    private final boolean T0(h0 h0Var) {
        h0 O02 = O0(h0Var);
        if (O02 == null) {
            return false;
        }
        C17069f name = h0Var.getName();
        C17542s.i(name, "getName(...)");
        Iterable<h0> b12 = b1(name);
        if ((b12 instanceof Collection) && ((Collection) b12).isEmpty()) {
            return false;
        }
        for (h0 h0Var2 : b12) {
            if (h0Var2.isSuspend() && Q0(O02, h0Var2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final Map U0(C16282z zVar) {
        ArrayList arrayList = new ArrayList();
        for (Object next : zVar.f137541o.z()) {
            if (((n) next).K()) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(arrayList, 10)), 16));
        for (Object next2 : arrayList) {
            linkedHashMap.put(((n) next2).getName(), next2);
        }
        return linkedHashMap;
    }

    private final h0 V0(a0 a0Var, String str, C17642l<? super C17069f, ? extends Collection<? extends h0>> lVar) {
        h0 h0Var;
        C17069f v10 = C17069f.v(str);
        C17542s.i(v10, "identifier(...)");
        Iterator it = ((Iterable) lVar.invoke(v10)).iterator();
        do {
            h0Var = null;
            if (!it.hasNext()) {
                break;
            }
            h0 h0Var2 = (h0) it.next();
            if (h0Var2.j().size() == 0) {
                e eVar = e.f149048a;
                C18096U returnType = h0Var2.getReturnType();
                if (returnType == null ? false : eVar.d(returnType, a0Var.getType())) {
                    h0Var = h0Var2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (h0Var == null);
        return h0Var;
    }

    private final h0 W0(a0 a0Var, C17642l<? super C17069f, ? extends Collection<? extends h0>> lVar) {
        b0 d10 = a0Var.d();
        String str = null;
        b0 b0Var = d10 != null ? (b0) T.g(d10) : null;
        if (b0Var != null) {
            str = C16069m.f136383a.b(b0Var);
        }
        if (str != null && !T.l(R(), b0Var)) {
            return V0(a0Var, str, lVar);
        }
        String b10 = a0Var.getName().b();
        C17542s.i(b10, "asString(...)");
        return V0(a0Var, C16047H.b(b10), lVar);
    }

    private final h0 X0(a0 a0Var, C17642l<? super C17069f, ? extends Collection<? extends h0>> lVar) {
        h0 h0Var;
        C18096U returnType;
        String b10 = a0Var.getName().b();
        C17542s.i(b10, "asString(...)");
        C17069f v10 = C17069f.v(C16047H.e(b10));
        C17542s.i(v10, "identifier(...)");
        Iterator it = ((Iterable) lVar.invoke(v10)).iterator();
        do {
            h0Var = null;
            if (!it.hasNext()) {
                break;
            }
            h0 h0Var2 = (h0) it.next();
            if (h0Var2.j().size() == 1 && (returnType = h0Var2.getReturnType()) != null && C15429j.D0(returnType)) {
                e eVar = e.f149048a;
                List<u0> j10 = h0Var2.j();
                C17542s.i(j10, "getValueParameters(...)");
                if (eVar.b(((u0) C16877v.b1(j10)).getType(), a0Var.getType())) {
                    h0Var = h0Var2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (h0Var == null);
        return h0Var;
    }

    /* access modifiers changed from: private */
    public static final Set Y0(C16201k kVar, C16282z zVar) {
        return C16877v.y1(kVar.a().w().a(zVar.R(), kVar));
    }

    private final C15574u Z0(C15558e eVar) {
        C15574u visibility = eVar.getVisibility();
        C17542s.i(visibility, "getVisibility(...)");
        if (!C17542s.e(visibility, y.f136403b)) {
            return visibility;
        }
        C15574u uVar = y.f136404c;
        C17542s.i(uVar, "PROTECTED_AND_PACKAGE");
        return uVar;
    }

    private final Set<h0> b1(C17069f fVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C18096U q10 : C0()) {
            C16877v.E(linkedHashSet, q10.q().d(fVar, d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    private final Set<a0> d1(C17069f fVar) {
        ArrayList arrayList = new ArrayList();
        for (C18096U q10 : C0()) {
            Iterable<a0> b10 = q10.q().b(fVar, d.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(C16877v.y(b10, 10));
            for (a0 add : b10) {
                arrayList2.add(add);
            }
            C16877v.E(arrayList, arrayList2);
        }
        return C16877v.y1(arrayList);
    }

    private final boolean e1(h0 h0Var, C15579z zVar) {
        String c10 = C16661C.c(h0Var, false, false, 2, (Object) null);
        C15579z a10 = zVar.a();
        C17542s.i(a10, "getOriginal(...)");
        return C17542s.e(c10, C16661C.c(a10, false, false, 2, (Object) null)) && !Q0(h0Var, zVar);
    }

    private final boolean f1(h0 h0Var) {
        C17069f name = h0Var.getName();
        C17542s.i(name, "getName(...)");
        Iterable<C17069f> a10 = C16053N.a(name);
        if (!(a10 instanceof Collection) || !((Collection) a10).isEmpty()) {
            for (C17069f d12 : a10) {
                Iterable<a0> d13 = d1(d12);
                if (!(d13 instanceof Collection) || !((Collection) d13).isEmpty()) {
                    for (a0 a0Var : d13) {
                        if (P0(a0Var, new C16278v(h0Var, this))) {
                            if (!a0Var.N()) {
                                String b10 = h0Var.getName().b();
                                C17542s.i(b10, "asString(...)");
                                if (!C16047H.d(b10)) {
                                }
                            }
                            return false;
                        }
                    }
                    continue;
                }
            }
        }
        return !R0(h0Var) && !s1(h0Var) && !T0(h0Var);
    }

    /* access modifiers changed from: private */
    public static final Collection g1(h0 h0Var, C16282z zVar, C17069f fVar) {
        C17542s.j(fVar, "accessorName");
        return C17542s.e(h0Var.getName(), fVar) ? C16877v.e(h0Var) : C16877v.V0(zVar.q1(fVar), zVar.r1(fVar));
    }

    /* access modifiers changed from: private */
    public static final Set h1(C16282z zVar) {
        return C16877v.y1(zVar.f137541o.B());
    }

    /* access modifiers changed from: private */
    public static final C15558e i1(C16282z zVar, C16201k kVar, C17069f fVar) {
        C16282z zVar2 = zVar;
        C16201k kVar2 = kVar;
        C17069f fVar2 = fVar;
        C17542s.j(fVar2, "name");
        if (((Set) zVar2.f137544r.invoke()).contains(fVar2)) {
            C16076u d10 = kVar.a().d();
            C17065b n10 = C17506e.n(zVar.R());
            C17542s.g(n10);
            C16503g a10 = d10.a(new C16076u.a(n10.d(fVar2), (byte[]) null, zVar2.f137541o, 2, (DefaultConstructorMarker) null));
            if (a10 == null) {
                return null;
            }
            C16271n nVar = new C16271n(kVar, zVar.R(), a10, (C15558e) null, 8, (DefaultConstructorMarker) null);
            kVar.a().e().a(nVar);
            return nVar;
        } else if (((Set) zVar2.f137545s.invoke()).contains(fVar2)) {
            List c10 = C16877v.c();
            kVar.a().w().h(zVar.R(), fVar2, c10, kVar);
            List a11 = C16877v.a(c10);
            int size = a11.size();
            if (size == 0) {
                return null;
            }
            if (size == 1) {
                return (C15558e) C16877v.b1(a11);
            }
            throw new IllegalStateException(("Multiple classes with same name are generated: " + a11).toString());
        } else {
            n nVar2 = (n) ((Map) zVar2.f137546t.invoke()).get(fVar2);
            if (nVar2 == null) {
                return null;
            }
            C17989i d11 = kVar.e().d(new C16281y(zVar));
            return C15747q.L0(kVar.e(), zVar.R(), fVar, d11, C16198h.a(kVar, nVar2), kVar.a().t().a(nVar2));
        }
    }

    /* access modifiers changed from: private */
    public static final Set j1(C16282z zVar) {
        return g0.k(zVar.a(), zVar.c());
    }

    private final h0 k1(h0 h0Var, C17642l<? super C17069f, ? extends Collection<? extends h0>> lVar, Collection<? extends h0> collection) {
        h0 I02;
        C15579z l10 = C16065i.l(h0Var);
        if (l10 == null || (I02 = I0(l10, lVar)) == null) {
            return null;
        }
        if (!f1(I02)) {
            I02 = null;
        }
        if (I02 != null) {
            return H0(I02, l10, collection);
        }
        return null;
    }

    private final h0 l1(h0 h0Var, C17642l<? super C17069f, ? extends Collection<? extends h0>> lVar, C17069f fVar, Collection<? extends h0> collection) {
        h0 h0Var2 = (h0) T.g(h0Var);
        if (h0Var2 == null) {
            return null;
        }
        String e10 = T.e(h0Var2);
        C17542s.g(e10);
        C17069f v10 = C17069f.v(e10);
        C17542s.i(v10, "identifier(...)");
        for (h0 N02 : (Collection) lVar.invoke(v10)) {
            h0 N03 = N0(N02, fVar);
            if (S0(h0Var2, N03)) {
                return H0(N03, h0Var2, collection);
            }
        }
        return null;
    }

    private final h0 m1(h0 h0Var, C17642l<? super C17069f, ? extends Collection<? extends h0>> lVar) {
        if (!h0Var.isSuspend()) {
            return null;
        }
        C17069f name = h0Var.getName();
        C17542s.i(name, "getName(...)");
        for (h0 O02 : (Iterable) lVar.invoke(name)) {
            h0 O03 = O0(O02);
            if (O03 == null || !Q0(O03, h0Var)) {
                O03 = null;
                continue;
            }
            if (O03 != null) {
                return O03;
            }
        }
        return null;
    }

    private final C16160b o1(k kVar) {
        C15558e c12 = R();
        C16160b t12 = C16160b.t1(c12, C16198h.a(L(), kVar), false, L().a().t().a(kVar));
        C17542s.i(t12, "createJavaConstructor(...)");
        C16201k h10 = C16193c.h(L(), t12, kVar, c12.t().size());
        U.b d02 = d0(h10, t12, kVar.j());
        List<n0> t10 = c12.t();
        C17542s.i(t10, "getDeclaredTypeParameters(...)");
        Collection collection = t10;
        Iterable<TI.y> typeParameters = kVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(C16877v.y(typeParameters, 10));
        for (TI.y a10 : typeParameters) {
            n0 a11 = h10.f().a(a10);
            C17542s.g(a11);
            arrayList.add(a11);
        }
        t12.r1(d02.a(), V.d(kVar.getVisibility()), C16877v.V0(collection, arrayList));
        t12.Y0(false);
        t12.Z0(d02.b());
        t12.g1(c12.r());
        h10.a().h().a(kVar, t12);
        return t12;
    }

    private final C16163e p1(w wVar) {
        w wVar2 = wVar;
        C16163e p12 = C16163e.p1(R(), C16198h.a(L(), wVar2), wVar.getName(), L().a().t().a(wVar2), true);
        C17542s.i(p12, "createJavaMethod(...)");
        C16163e eVar = p12;
        eVar.o1((d0) null, O(), C16877v.n(), C16877v.n(), C16877v.n(), L().g().p(wVar.getType(), C16378b.b(L0.COMMON, false, false, (n0) null, 6, (Object) null)), C15535F.Companion.a(false, false, true), C15573t.f133853e, (Map<? extends C15554a.C3296a<?>, ?>) null);
        p12.s1(false, false);
        L().a().h().d(wVar2, p12);
        return p12;
    }

    /* access modifiers changed from: private */
    public final Collection<h0> q1(C17069f fVar) {
        Iterable<r> c10 = ((C16260c) N().invoke()).c(fVar);
        ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
        for (r Z10 : c10) {
            arrayList.add(Z(Z10));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final Collection<h0> r1(C17069f fVar) {
        ArrayList arrayList = new ArrayList();
        for (Object next : b1(fVar)) {
            h0 h0Var = (h0) next;
            if (!T.d(h0Var) && C16065i.l(h0Var) == null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private final void s0(List<u0> list, C15565l lVar, int i10, r rVar, C18096U u10, C18096U u11) {
        C15649h b10 = C15649h.f134231V.b();
        C17069f name = rVar.getName();
        C18096U n10 = M0.n(u10);
        C17542s.i(n10, "makeNotNullable(...)");
        List<u0> list2 = list;
        list.add(new C15727V(lVar, (u0) null, i10, b10, name, n10, rVar.O(), false, false, u11 != null ? M0.n(u11) : null, L().a().t().a(rVar)));
    }

    private final boolean s1(h0 h0Var) {
        C16065i iVar = C16065i.f136375o;
        C17069f name = h0Var.getName();
        C17542s.i(name, "getName(...)");
        if (!iVar.n(name)) {
            return false;
        }
        C17069f name2 = h0Var.getName();
        C17542s.i(name2, "getName(...)");
        ArrayList<C15579z> arrayList = new ArrayList<>();
        for (h0 l10 : b1(name2)) {
            C15579z l11 = C16065i.l(l10);
            if (l11 != null) {
                arrayList.add(l11);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (C15579z e12 : arrayList) {
            if (e1(h0Var, e12)) {
                return true;
            }
        }
        return false;
    }

    private final void t0(Collection<h0> collection, C17069f fVar, Collection<? extends h0> collection2, boolean z10) {
        Collection<D> d10 = C16097a.d(fVar, collection2, collection, R(), L().a().c(), L().a().k().a());
        C17542s.i(d10, "resolveOverridesForNonStaticMembers(...)");
        if (!z10) {
            collection.addAll(d10);
            return;
        }
        Iterable<h0> iterable = d10;
        List<T> V02 = C16877v.V0(collection, iterable);
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (h0 h0Var : iterable) {
            h0 h0Var2 = (h0) T.j(h0Var);
            if (h0Var2 == null) {
                C17542s.g(h0Var);
            } else {
                C17542s.g(h0Var);
                h0Var = H0(h0Var, h0Var2, V02);
            }
            arrayList.add(h0Var);
        }
        collection.addAll(arrayList);
    }

    private final void u0(C17069f fVar, Collection<? extends h0> collection, Collection<? extends h0> collection2, Collection<h0> collection3, C17642l<? super C17069f, ? extends Collection<? extends h0>> lVar) {
        for (h0 h0Var : collection2) {
            C15660a.a(collection3, l1(h0Var, lVar, fVar, collection));
            C15660a.a(collection3, k1(h0Var, lVar, collection));
            C15660a.a(collection3, m1(h0Var, lVar));
        }
    }

    private final void v0(Set<? extends a0> set, Collection<a0> collection, Set<a0> set2, C17642l<? super C17069f, ? extends Collection<? extends h0>> lVar) {
        for (a0 a0Var : set) {
            C16164f J02 = J0(a0Var, lVar);
            if (J02 != null) {
                collection.add(J02);
                if (set2 != null) {
                    set2.add(a0Var);
                    return;
                }
                return;
            }
        }
    }

    private final void w0(C17069f fVar, Collection<a0> collection) {
        r rVar = (r) C16877v.c1(((C16260c) N().invoke()).c(fVar));
        if (rVar != null) {
            collection.add(L0(this, rVar, (C18096U) null, C15535F.FINAL, 2, (Object) null));
        }
    }

    /* access modifiers changed from: private */
    public static final boolean z0(q qVar) {
        C17542s.j(qVar, "it");
        return !qVar.g();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B(java.util.Collection<DI.h0> r10, cJ.C17069f r11) {
        /*
            r9 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.util.Set r6 = r9.b1(r11)
            MI.U$a r0 = MI.U.f136347a
            boolean r0 = r0.k(r11)
            if (r0 != 0) goto L_0x006b
            MI.i r0 = MI.C16065i.f136375o
            boolean r0 = r0.n(r11)
            if (r0 != 0) goto L_0x006b
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x002f
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x002f
            goto L_0x0046
        L_0x002f:
            java.util.Iterator r1 = r0.iterator()
        L_0x0033:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0046
            java.lang.Object r2 = r1.next()
            DI.z r2 = (DI.C15579z) r2
            boolean r2 = r2.isSuspend()
            if (r2 == 0) goto L_0x0033
            goto L_0x006b
        L_0x0046:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x004f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0066
            java.lang.Object r2 = r0.next()
            r3 = r2
            DI.h0 r3 = (DI.h0) r3
            boolean r3 = r9.f1(r3)
            if (r3 == 0) goto L_0x004f
            r1.add(r2)
            goto L_0x004f
        L_0x0066:
            r0 = 0
            r9.t0(r10, r11, r1, r0)
            return
        L_0x006b:
            EJ.l$b r0 = EJ.C15671l.f134268c
            EJ.l r7 = r0.a()
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r0 = YH.C16877v.n()
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            DI.e r3 = r9.R()
            qJ.w r4 = qJ.C17835w.f146610a
            PI.k r0 = r9.L()
            PI.d r0 = r0.a()
            vJ.p r0 = r0.k()
            gJ.o r5 = r0.a()
            r0 = r11
            java.util.Collection r8 = NI.C16097a.d(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "resolveOverridesForNonStaticMembers(...)"
            kotlin.jvm.internal.C17542s.i(r8, r0)
            QI.z$a r5 = new QI.z$a
            r5.<init>(r9)
            r0 = r9
            r1 = r11
            r2 = r10
            r3 = r8
            r4 = r10
            r0.u0(r1, r2, r3, r4, r5)
            QI.z$b r5 = new QI.z$b
            r5.<init>(r9)
            r4 = r7
            r0.u0(r1, r2, r3, r4, r5)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        L_0x00bc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00d3
            java.lang.Object r2 = r1.next()
            r3 = r2
            DI.h0 r3 = (DI.h0) r3
            boolean r3 = r9.f1(r3)
            if (r3 == 0) goto L_0x00bc
            r0.add(r2)
            goto L_0x00bc
        L_0x00d3:
            java.util.List r0 = YH.C16877v.V0(r0, r7)
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 1
            r9.t0(r10, r11, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QI.C16282z.B(java.util.Collection, cJ.f):void");
    }

    /* access modifiers changed from: protected */
    public void C(C17069f fVar, Collection<a0> collection) {
        C17542s.j(fVar, "name");
        C17542s.j(collection, "result");
        if (this.f137541o.o()) {
            w0(fVar, collection);
        }
        Set<a0> d12 = d1(fVar);
        if (!d12.isEmpty()) {
            C15671l.b bVar = C15671l.f134268c;
            C15671l a10 = bVar.a();
            C15671l a11 = bVar.a();
            v0(d12, collection, a10, new C16279w(this));
            v0(g0.i(d12, a10), a11, (Set<a0>) null, new C16280x(this));
            Collection<D> d10 = C16097a.d(fVar, g0.k(d12, a11), collection, R(), L().a().c(), L().a().k().a());
            C17542s.i(d10, "resolveOverridesForNonStaticMembers(...)");
            collection.addAll(d10);
        }
    }

    /* access modifiers changed from: protected */
    public Set<C17069f> D(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        if (this.f137541o.o()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((C16260c) N().invoke()).d());
        Collection<C18096U> a10 = R().k().a();
        C17542s.i(a10, "getSupertypes(...)");
        for (C18096U q10 : a10) {
            C16877v.E(linkedHashSet, q10.q().c());
        }
        return linkedHashSet;
    }

    /* access modifiers changed from: protected */
    public d0 O() {
        return C17278i.l(R());
    }

    /* access modifiers changed from: protected */
    public boolean V(C16163e eVar) {
        C17542s.j(eVar, "<this>");
        if (this.f137541o.o()) {
            return false;
        }
        return f1(eVar);
    }

    /* access modifiers changed from: protected */
    public U.a Y(r rVar, List<? extends n0> list, C18096U u10, List<? extends u0> list2) {
        C17542s.j(rVar, "method");
        C17542s.j(list, "methodTypeParameters");
        C17542s.j(u10, "returnType");
        C17542s.j(list2, "valueParameters");
        o.b a10 = L().a().s().a(rVar, R(), u10, (C18096U) null, list2, list);
        C17542s.i(a10, "resolvePropagatedSignature(...)");
        C18096U d10 = a10.d();
        C17542s.i(d10, "getReturnType(...)");
        C18096U c10 = a10.c();
        List<u0> f10 = a10.f();
        C17542s.i(f10, "getValueParameters(...)");
        List<n0> e10 = a10.e();
        C17542s.i(e10, "getTypeParameters(...)");
        boolean g10 = a10.g();
        List<String> b10 = a10.b();
        C17542s.i(b10, "getErrors(...)");
        return new U.a(d10, c10, f10, e10, g10, b10);
    }

    public final C17989i<List<C15557d>> a1() {
        return this.f137543q;
    }

    public Collection<a0> b(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        n1(fVar, bVar);
        return super.b(fVar, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c1 */
    public C15558e R() {
        return this.f137540n;
    }

    public Collection<h0> d(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        n1(fVar, bVar);
        return super.d(fVar, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        r3 = (r3 = r3.f137547u).invoke(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DI.C15561h e(cJ.C17069f r2, LI.C16015b r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            r1.n1(r2, r3)
            QI.U r3 = r1.Q()
            QI.z r3 = (QI.C16282z) r3
            if (r3 == 0) goto L_0x0022
            tJ.h<cJ.f, DI.e> r3 = r3.f137547u
            if (r3 == 0) goto L_0x0022
            java.lang.Object r3 = r3.invoke(r2)
            DI.e r3 = (DI.C15558e) r3
            if (r3 == 0) goto L_0x0022
            goto L_0x002b
        L_0x0022:
            tJ.h<cJ.f, DI.e> r3 = r1.f137547u
            java.lang.Object r2 = r3.invoke(r2)
            r3 = r2
            DI.h r3 = (DI.C15561h) r3
        L_0x002b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: QI.C16282z.e(cJ.f, LI.b):DI.h");
    }

    public void n1(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        C15984a.a(L().a().l(), bVar, R(), fVar);
    }

    public String toString() {
        return "Lazy Java member scope for " + this.f137541o.f();
    }

    /* access modifiers changed from: protected */
    public Set<C17069f> v(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        return g0.k((Set) this.f137544r.invoke(), ((Map) this.f137546t.invoke()).keySet());
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public LinkedHashSet<C17069f> x(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        Collection<C18096U> a10 = R().k().a();
        C17542s.i(a10, "getSupertypes(...)");
        LinkedHashSet<C17069f> linkedHashSet = new LinkedHashSet<>();
        for (C18096U q10 : a10) {
            C16877v.E(linkedHashSet, q10.q().a());
        }
        linkedHashSet.addAll(((C16260c) N().invoke()).a());
        linkedHashSet.addAll(((C16260c) N().invoke()).b());
        linkedHashSet.addAll(v(dVar, lVar));
        linkedHashSet.addAll(L().a().w().g(R(), L()));
        return linkedHashSet;
    }

    /* access modifiers changed from: protected */
    public void y(Collection<h0> collection, C17069f fVar) {
        C17542s.j(collection, "result");
        C17542s.j(fVar, "name");
        if (this.f137541o.q() && ((C16260c) N().invoke()).e(fVar) != null) {
            Iterable iterable = collection;
            if (!((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((h0) it.next()).j().isEmpty()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            w e10 = ((C16260c) N().invoke()).e(fVar);
            C17542s.g(e10);
            collection.add(p1(e10));
        }
        L().a().w().c(R(), fVar, collection, L());
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public C16259b z() {
        return new C16259b(this.f137541o, C16277u.f137534a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16282z(C16201k kVar, C15558e eVar, C16503g gVar, boolean z10, C16282z zVar) {
        super(kVar, zVar);
        C17542s.j(kVar, "c");
        C17542s.j(eVar, "ownerDescriptor");
        C17542s.j(gVar, "jClass");
        this.f137540n = eVar;
        this.f137541o = gVar;
        this.f137542p = z10;
        this.f137543q = kVar.e().d(new C16273p(this, kVar));
        this.f137544r = kVar.e().d(new C16274q(this));
        this.f137545s = kVar.e().d(new r(kVar, this));
        this.f137546t = kVar.e().d(new C16275s(this));
        this.f137547u = kVar.e().e(new C16276t(this, kVar));
    }
}
