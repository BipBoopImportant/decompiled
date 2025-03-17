package GI;

import DI.C15535F;
import DI.C15555b;
import DI.C15557d;
import DI.C15558e;
import DI.C15566m;
import DI.C15574u;
import DI.C15579z;
import DI.d0;
import DI.i0;
import DI.m0;
import DI.u0;
import EI.C15649h;
import YH.C16877v;
import cJ.C17069f;
import cJ.C17071h;
import gJ.C17277h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import oJ.C17704f;
import oJ.C17705g;
import tJ.C17990j;
import tJ.C17994n;
import uI.C18064m;
import uJ.C18090N;
import uJ.C18096U;
import uJ.C18113f0;
import uJ.C18121j0;
import uJ.J0;
import uJ.Q0;

/* renamed from: GI.T  reason: case insensitive filesystem */
public final class C15725T extends C15749s implements C15723Q {

    /* renamed from: I  reason: collision with root package name */
    public static final a f134559I = new a((DefaultConstructorMarker) null);

    /* renamed from: J  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f134560J = {P.h(new G(C15725T.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0))};

    /* renamed from: E  reason: collision with root package name */
    private final C17994n f134561E;

    /* renamed from: F  reason: collision with root package name */
    private final m0 f134562F;

    /* renamed from: G  reason: collision with root package name */
    private final C17990j f134563G;

    /* renamed from: H  reason: collision with root package name */
    private C15557d f134564H;

    /* renamed from: GI.T$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final J0 c(m0 m0Var) {
            if (m0Var.w() == null) {
                return null;
            }
            return J0.f(m0Var.I());
        }

        public final C15723Q b(C17994n nVar, m0 m0Var, C15557d dVar) {
            C15557d c10;
            List list;
            m0 m0Var2 = m0Var;
            C15557d dVar2 = dVar;
            C17542s.j(nVar, "storageManager");
            C17542s.j(m0Var2, "typeAliasDescriptor");
            C17542s.j(dVar2, "constructor");
            J0 c11 = c(m0Var2);
            d0 d0Var = null;
            if (c11 == null || (c10 = dVar2.c(c11)) == null) {
                return null;
            }
            C15649h annotations = dVar.getAnnotations();
            C15555b.a h10 = dVar.h();
            C17542s.i(h10, "getKind(...)");
            i0 i10 = m0Var.i();
            C17542s.i(i10, "getSource(...)");
            C15725T t10 = new C15725T(nVar, m0Var, c10, (C15723Q) null, annotations, h10, i10, (DefaultConstructorMarker) null);
            List<u0> O02 = C15749s.O0(t10, dVar.j(), c11);
            if (O02 == null) {
                return null;
            }
            C18113f0 c12 = C18090N.c(c10.getReturnType().Q0());
            C18113f0 r10 = m0Var.r();
            C17542s.i(r10, "getDefaultType(...)");
            C18113f0 j10 = C18121j0.j(c12, r10);
            d0 L10 = dVar.L();
            if (L10 != null) {
                d0Var = C17277h.i(t10, c11.n(L10.getType(), Q0.INVARIANT), C15649h.f134231V.b());
            }
            d0 d0Var2 = d0Var;
            C15558e w10 = m0Var.w();
            if (w10 != null) {
                List<d0> y02 = dVar.y0();
                C17542s.i(y02, "getContextReceiverParameters(...)");
                Iterable iterable = y02;
                list = new ArrayList(C16877v.y(iterable, 10));
                int i11 = 0;
                for (Object next : iterable) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C16877v.x();
                    }
                    d0 d0Var3 = (d0) next;
                    C18096U n10 = c11.n(d0Var3.getType(), Q0.INVARIANT);
                    C17705g value = d0Var3.getValue();
                    C17542s.h(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    list.add(C17277h.c(w10, n10, ((C17704f) value).a(), C15649h.f134231V.b(), i11));
                    i11 = i12;
                }
            } else {
                list = C16877v.n();
            }
            t10.R0(d0Var2, (d0) null, list, m0Var.t(), O02, j10, C15535F.FINAL, m0Var.getVisibility());
            return t10;
        }

        private a() {
        }
    }

    public /* synthetic */ C15725T(C17994n nVar, m0 m0Var, C15557d dVar, C15723Q q10, C15649h hVar, C15555b.a aVar, i0 i0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, m0Var, dVar, q10, hVar, aVar, i0Var);
    }

    /* access modifiers changed from: private */
    public static final C15725T r1(C15725T t10, C15557d dVar) {
        C17994n nVar = t10.f134561E;
        m0 p12 = t10.p1();
        C15649h annotations = dVar.getAnnotations();
        C15555b.a h10 = dVar.h();
        C17542s.i(h10, "getKind(...)");
        i0 i10 = t10.p1().i();
        C17542s.i(i10, "getSource(...)");
        C15725T t11 = new C15725T(nVar, p12, dVar, t10, annotations, h10, i10);
        J0 a10 = f134559I.c(t10.p1());
        d0 d0Var = null;
        if (a10 == null) {
            return null;
        }
        d0 L10 = dVar.L();
        if (L10 != null) {
            d0Var = L10.c(a10);
        }
        d0 d0Var2 = d0Var;
        List<d0> y02 = dVar.y0();
        C17542s.i(y02, "getContextReceiverParameters(...)");
        Iterable<d0> iterable = y02;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (d0 c10 : iterable) {
            arrayList.add(c10.c(a10));
        }
        t11.R0((d0) null, d0Var2, arrayList, t10.p1().t(), t10.j(), t10.getReturnType(), C15535F.FINAL, t10.p1().getVisibility());
        return t11;
    }

    public C15557d R() {
        return this.f134564H;
    }

    public boolean d0() {
        return R().d0();
    }

    public C15558e e0() {
        C15558e e02 = R().e0();
        C17542s.i(e02, "getConstructedClass(...)");
        return e02;
    }

    public C18096U getReturnType() {
        C18096U returnType = super.getReturnType();
        C17542s.g(returnType);
        return returnType;
    }

    /* renamed from: l1 */
    public C15723Q K0(C15566m mVar, C15535F f10, C15574u uVar, C15555b.a aVar, boolean z10) {
        C17542s.j(mVar, "newOwner");
        C17542s.j(f10, "modality");
        C17542s.j(uVar, "visibility");
        C17542s.j(aVar, "kind");
        Object g10 = x().l(mVar).c(f10).f(uVar).p(aVar).o(z10).g();
        C17542s.h(g10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (C15723Q) g10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m1 */
    public C15725T L0(C15566m mVar, C15579z zVar, C15555b.a aVar, C17069f fVar, C15649h hVar, i0 i0Var) {
        C17542s.j(mVar, "newOwner");
        C17542s.j(aVar, "kind");
        C17542s.j(hVar, "annotations");
        C17542s.j(i0Var, "source");
        C15555b.a aVar2 = C15555b.a.DECLARATION;
        if (aVar != aVar2) {
            C15555b.a aVar3 = C15555b.a.SYNTHESIZED;
        }
        return new C15725T(this.f134561E, p1(), R(), this, hVar, aVar2, i0Var);
    }

    /* renamed from: n1 */
    public m0 b() {
        return p1();
    }

    /* renamed from: o1 */
    public C15723Q a() {
        C15579z a10 = super.a();
        C17542s.h(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (C15723Q) a10;
    }

    public m0 p1() {
        return this.f134562F;
    }

    /* renamed from: q1 */
    public C15723Q c(J0 j02) {
        C17542s.j(j02, "substitutor");
        C15579z c10 = super.c(j02);
        C17542s.h(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        C15725T t10 = (C15725T) c10;
        J0 f10 = J0.f(t10.getReturnType());
        C17542s.i(f10, "create(...)");
        C15557d c11 = R().a().c(f10);
        if (c11 == null) {
            return null;
        }
        t10.f134564H = c11;
        return t10;
    }

    private C15725T(C17994n nVar, m0 m0Var, C15557d dVar, C15723Q q10, C15649h hVar, C15555b.a aVar, i0 i0Var) {
        super(m0Var, q10, hVar, C17071h.f141271j, aVar, i0Var);
        this.f134561E = nVar;
        this.f134562F = m0Var;
        V0(p1().Y());
        this.f134563G = nVar.a(new C15724S(this, dVar));
        this.f134564H = dVar;
    }
}
