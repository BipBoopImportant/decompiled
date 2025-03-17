package GI;

import AI.C15429j;
import DI.C15557d;
import DI.C15558e;
import DI.C15561h;
import DI.C15566m;
import DI.C15568o;
import DI.C15569p;
import DI.C15574u;
import DI.i0;
import DI.m0;
import DI.n0;
import EI.C15649h;
import GI.C15725T;
import YH.C16877v;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nJ.C17656k;
import tJ.C17989i;
import tJ.C17994n;
import uI.C18064m;
import uJ.C18096U;
import uJ.C18100Y;
import uJ.C18113f0;
import uJ.M0;
import uJ.P0;
import uJ.y0;
import vJ.g;

/* renamed from: GI.g  reason: case insensitive filesystem */
public abstract class C15737g extends C15744n implements m0 {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f134592j = {P.h(new G(C15737g.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};

    /* renamed from: e  reason: collision with root package name */
    private final C17994n f134593e;

    /* renamed from: f  reason: collision with root package name */
    private final C15574u f134594f;

    /* renamed from: g  reason: collision with root package name */
    private final C17989i f134595g;

    /* renamed from: h  reason: collision with root package name */
    private List<? extends n0> f134596h;

    /* renamed from: i  reason: collision with root package name */
    private final a f134597i = new a(this);

    /* renamed from: GI.g$a */
    public static final class a implements y0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15737g f134598a;

        a(C15737g gVar) {
            this.f134598a = gVar;
        }

        public Collection<C18096U> a() {
            Collection<C18096U> a10 = e().u0().N0().a();
            C17542s.i(a10, "getSupertypes(...)");
            return a10;
        }

        public y0 b(g gVar) {
            C17542s.j(gVar, "kotlinTypeRefiner");
            return this;
        }

        public boolean f() {
            return true;
        }

        /* renamed from: g */
        public m0 e() {
            return this.f134598a;
        }

        public List<n0> getParameters() {
            return this.f134598a.R0();
        }

        public C15429j p() {
            return C17506e.m(e());
        }

        public String toString() {
            return "[typealias " + e().getName().b() + ']';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15737g(C17994n nVar, C15566m mVar, C15649h hVar, C17069f fVar, i0 i0Var, C15574u uVar) {
        super(mVar, hVar, fVar, i0Var);
        C17542s.j(nVar, "storageManager");
        C17542s.j(mVar, "containingDeclaration");
        C17542s.j(hVar, "annotations");
        C17542s.j(fVar, "name");
        C17542s.j(i0Var, "sourceElement");
        C17542s.j(uVar, "visibilityImpl");
        this.f134593e = nVar;
        this.f134594f = uVar;
        this.f134595g = nVar.d(new C15734d(this));
    }

    /* access modifiers changed from: private */
    public static final C18113f0 N0(C15737g gVar, g gVar2) {
        C15561h f10 = gVar2.f(gVar);
        if (f10 != null) {
            return f10.r();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final Collection O0(C15737g gVar) {
        return gVar.Q0();
    }

    /* access modifiers changed from: private */
    public static final Boolean T0(C15737g gVar, P0 p02) {
        boolean z10;
        C17542s.g(p02);
        if (!C18100Y.a(p02)) {
            C15561h e10 = p02.N0().e();
            if ((e10 instanceof n0) && !C17542s.e(((n0) e10).b(), gVar)) {
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }

    /* access modifiers changed from: protected */
    public final C17994n M() {
        return this.f134593e;
    }

    /* access modifiers changed from: protected */
    public final C18113f0 M0() {
        C17656k kVar;
        C15558e w10 = w();
        if (w10 == null || (kVar = w10.X()) == null) {
            kVar = C17656k.b.f144864b;
        }
        C18113f0 u10 = M0.u(this, kVar, new C15736f(this));
        C17542s.i(u10, "makeUnsubstitutedType(...)");
        return u10;
    }

    /* renamed from: P0 */
    public m0 a() {
        C15569p F02 = super.a();
        C17542s.h(F02, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (m0) F02;
    }

    public final Collection<C15723Q> Q0() {
        C15558e w10 = w();
        if (w10 == null) {
            return C16877v.n();
        }
        Collection<C15557d> l10 = w10.l();
        C17542s.i(l10, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (C15557d dVar : l10) {
            C15725T.a aVar = C15725T.f134559I;
            C17994n nVar = this.f134593e;
            C17542s.g(dVar);
            C15723Q b10 = aVar.b(nVar, this, dVar);
            if (b10 != null) {
                arrayList.add(b10);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public abstract List<n0> R0();

    public final void S0(List<? extends n0> list) {
        C17542s.j(list, "declaredTypeParameters");
        this.f134596h = list;
    }

    public boolean Y() {
        return false;
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        C17542s.j(oVar, "visitor");
        return oVar.g(this, d10);
    }

    public C15574u getVisibility() {
        return this.f134594f;
    }

    public boolean isExternal() {
        return false;
    }

    public y0 k() {
        return this.f134597i;
    }

    public boolean m0() {
        return false;
    }

    public boolean n() {
        return M0.c(u0(), new C15735e(this));
    }

    public List<n0> t() {
        List<? extends n0> list = this.f134596h;
        if (list != null) {
            return list;
        }
        C17542s.z("declaredTypeParametersImpl");
        return null;
    }

    public String toString() {
        return "typealias " + getName().b();
    }
}
