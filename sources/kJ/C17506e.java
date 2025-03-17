package kJ;

import AI.C15429j;
import DI.C15530A;
import DI.C15538I;
import DI.C15539J;
import DI.C15544O;
import DI.C15555b;
import DI.C15558e;
import DI.C15561h;
import DI.C15562i;
import DI.C15566m;
import DI.Z;
import DI.a0;
import DI.s0;
import DI.u0;
import EI.C15644c;
import EJ.C15661b;
import GJ.C15765h;
import GJ.C15768k;
import LI.C16015b;
import YH.C16877v;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17067d;
import cJ.C17069f;
import gJ.C17278i;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import nI.C17642l;
import uJ.C18096U;
import uJ.C18113f0;
import vJ.C;
import vJ.g;
import vJ.h;
import vJ.t;

/* renamed from: kJ.e  reason: case insensitive filesystem */
public final class C17506e {

    /* renamed from: a  reason: collision with root package name */
    private static final C17069f f144265a;

    /* renamed from: kJ.e$a */
    /* synthetic */ class a extends C17540p implements C17642l<u0, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f144266a = new a();

        a() {
            super(1, u0.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(u0 u0Var) {
            C17542s.j(u0Var, "p0");
            return Boolean.valueOf(u0Var.B0());
        }
    }

    /* renamed from: kJ.e$b */
    public static final class b extends C15661b.C3305b<C15555b, C15555b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ O<C15555b> f144267a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C15555b, Boolean> f144268b;

        b(O<C15555b> o10, C17642l<? super C15555b, Boolean> lVar) {
            this.f144267a = o10;
            this.f144268b = lVar;
        }

        /* renamed from: d */
        public void b(C15555b bVar) {
            C17542s.j(bVar, "current");
            if (this.f144267a.f144348a == null && this.f144268b.invoke(bVar).booleanValue()) {
                this.f144267a.f144348a = bVar;
            }
        }

        /* renamed from: e */
        public boolean c(C15555b bVar) {
            C17542s.j(bVar, "current");
            return this.f144267a.f144348a == null;
        }

        /* renamed from: f */
        public C15555b a() {
            return (C15555b) this.f144267a.f144348a;
        }
    }

    static {
        C17069f v10 = C17069f.v("value");
        C17542s.i(v10, "identifier(...)");
        f144265a = v10;
    }

    /* access modifiers changed from: private */
    public static final C15765h A(boolean z10, C15555b bVar) {
        C17542s.g(bVar);
        return z(bVar, z10);
    }

    public static final C15558e B(C15538I i10, C17066c cVar, C16015b bVar) {
        C17542s.j(i10, "<this>");
        C17542s.j(cVar, "topLevelClassFqName");
        C17542s.j(bVar, "location");
        cVar.c();
        C15561h e10 = i10.v0(cVar.d()).q().e(cVar.f(), bVar);
        if (e10 instanceof C15558e) {
            return (C15558e) e10;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final C15566m a(C15566m mVar) {
        C17542s.j(mVar, "it");
        return mVar.b();
    }

    public static final boolean f(u0 u0Var) {
        C17542s.j(u0Var, "<this>");
        Boolean e10 = C15661b.e(C16877v.e(u0Var), C17502a.f144261a, a.f144266a);
        C17542s.i(e10, "ifAny(...)");
        return e10.booleanValue();
    }

    /* access modifiers changed from: private */
    public static final Iterable g(u0 u0Var) {
        Iterable<u0> e10 = u0Var.e();
        ArrayList arrayList = new ArrayList(C16877v.y(e10, 10));
        for (u0 a10 : e10) {
            arrayList.add(a10.a());
        }
        return arrayList;
    }

    public static final C15555b h(C15555b bVar, boolean z10, C17642l<? super C15555b, Boolean> lVar) {
        C17542s.j(bVar, "<this>");
        C17542s.j(lVar, "predicate");
        return (C15555b) C15661b.b(C16877v.e(bVar), new C17504c(z10), new b(new O(), lVar));
    }

    public static /* synthetic */ C15555b i(C15555b bVar, boolean z10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(bVar, z10, lVar);
    }

    /* access modifiers changed from: private */
    public static final Iterable j(boolean z10, C15555b bVar) {
        Iterable n10;
        if (z10) {
            bVar = bVar != null ? bVar.a() : null;
        }
        if (bVar == null || (n10 = bVar.e()) == null) {
            n10 = C16877v.n();
        }
        return n10;
    }

    public static final C17066c k(C15566m mVar) {
        C17542s.j(mVar, "<this>");
        C17067d p10 = p(mVar);
        if (!p10.f()) {
            p10 = null;
        }
        if (p10 != null) {
            return p10.m();
        }
        return null;
    }

    public static final C15558e l(C15644c cVar) {
        C17542s.j(cVar, "<this>");
        C15561h e10 = cVar.getType().N0().e();
        if (e10 instanceof C15558e) {
            return (C15558e) e10;
        }
        return null;
    }

    public static final C15429j m(C15566m mVar) {
        C17542s.j(mVar, "<this>");
        return s(mVar).p();
    }

    public static final C17065b n(C15561h hVar) {
        C15566m b10;
        C17065b n10;
        if (hVar == null || (b10 = hVar.b()) == null) {
            return null;
        }
        if (b10 instanceof C15544O) {
            C17066c f10 = ((C15544O) b10).f();
            C17069f name = hVar.getName();
            C17542s.i(name, "getName(...)");
            return new C17065b(f10, name);
        } else if (!(b10 instanceof C15562i) || (n10 = n((C15561h) b10)) == null) {
            return null;
        } else {
            C17069f name2 = hVar.getName();
            C17542s.i(name2, "getName(...)");
            return n10.d(name2);
        }
    }

    public static final C17066c o(C15566m mVar) {
        C17542s.j(mVar, "<this>");
        C17066c n10 = C17278i.n(mVar);
        C17542s.i(n10, "getFqNameSafe(...)");
        return n10;
    }

    public static final C17067d p(C15566m mVar) {
        C17542s.j(mVar, "<this>");
        C17067d m10 = C17278i.m(mVar);
        C17542s.i(m10, "getFqName(...)");
        return m10;
    }

    public static final C15530A<C18113f0> q(C15558e eVar) {
        s0 V10 = eVar != null ? eVar.V() : null;
        if (V10 instanceof C15530A) {
            return (C15530A) V10;
        }
        return null;
    }

    public static final g r(C15538I i10) {
        C17542s.j(i10, "<this>");
        t tVar = (t) i10.l0(h.a());
        C c10 = tVar != null ? (C) tVar.a() : null;
        return c10 instanceof C.a ? ((C.a) c10).b() : g.a.f149050a;
    }

    public static final C15538I s(C15566m mVar) {
        C17542s.j(mVar, "<this>");
        C15538I g10 = C17278i.g(mVar);
        C17542s.i(g10, "getContainingModule(...)");
        return g10;
    }

    public static final C15539J<C18113f0> t(C15558e eVar) {
        s0 V10 = eVar != null ? eVar.V() : null;
        if (V10 instanceof C15539J) {
            return (C15539J) V10;
        }
        return null;
    }

    public static final C15765h<C15566m> u(C15566m mVar) {
        C17542s.j(mVar, "<this>");
        return C15768k.D(v(mVar), 1);
    }

    public static final C15765h<C15566m> v(C15566m mVar) {
        C17542s.j(mVar, "<this>");
        return C15768k.q(mVar, C17503b.f144262a);
    }

    public static final C15555b w(C15555b bVar) {
        C17542s.j(bVar, "<this>");
        if (!(bVar instanceof Z)) {
            return bVar;
        }
        a0 W10 = ((Z) bVar).W();
        C17542s.i(W10, "getCorrespondingProperty(...)");
        return W10;
    }

    public static final C15558e x(C15558e eVar) {
        C17542s.j(eVar, "<this>");
        for (C18096U next : eVar.r().N0().a()) {
            if (!C15429j.c0(next)) {
                C15561h e10 = next.N0().e();
                if (C17278i.w(e10)) {
                    C17542s.h(e10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (C15558e) e10;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r2 = (vJ.C) r2.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean y(DI.C15538I r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            DI.H r0 = vJ.h.a()
            java.lang.Object r2 = r2.l0(r0)
            vJ.t r2 = (vJ.t) r2
            r0 = 0
            if (r2 == 0) goto L_0x0022
            java.lang.Object r2 = r2.a()
            vJ.C r2 = (vJ.C) r2
            if (r2 == 0) goto L_0x0022
            boolean r2 = r2.a()
            r1 = 1
            if (r2 != r1) goto L_0x0022
            r0 = r1
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kJ.C17506e.y(DI.I):boolean");
    }

    public static final C15765h<C15555b> z(C15555b bVar, boolean z10) {
        C17542s.j(bVar, "<this>");
        if (z10) {
            bVar = bVar.a();
        }
        C15765h v10 = C15768k.v(bVar);
        Collection<? extends C15555b> e10 = bVar.e();
        C17542s.i(e10, "getOverriddenDescriptors(...)");
        return C15768k.U(v10, C15768k.M(C16877v.h0(e10), new C17505d(z10)));
    }
}
