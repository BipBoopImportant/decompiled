package GI;

import DI.C15554a;
import DI.C15555b;
import DI.C15566m;
import DI.C15568o;
import DI.C15573t;
import DI.C15574u;
import DI.i0;
import DI.u0;
import DI.v0;
import EI.C15649h;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import cJ.C17069f;
import iJ.C17373g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import uJ.C18096U;
import uJ.J0;

/* renamed from: GI.V  reason: case insensitive filesystem */
public class C15727V extends C15729X implements u0 {

    /* renamed from: l  reason: collision with root package name */
    public static final a f134568l = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private final int f134569f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f134570g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f134571h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f134572i;

    /* renamed from: j  reason: collision with root package name */
    private final C18096U f134573j;

    /* renamed from: k  reason: collision with root package name */
    private final u0 f134574k;

    /* renamed from: GI.V$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15727V a(C15554a aVar, u0 u0Var, int i10, C15649h hVar, C17069f fVar, C18096U u10, boolean z10, boolean z11, boolean z12, C18096U u11, i0 i0Var, C17631a<? extends List<? extends v0>> aVar2) {
            C15554a aVar3 = aVar;
            C17542s.j(aVar, "containingDeclaration");
            C17542s.j(hVar, "annotations");
            C17542s.j(fVar, "name");
            C17542s.j(u10, "outType");
            C17542s.j(i0Var, "source");
            return aVar2 == null ? new C15727V(aVar, u0Var, i10, hVar, fVar, u10, z10, z11, z12, u11, i0Var) : new b(aVar, u0Var, i10, hVar, fVar, u10, z10, z11, z12, u11, i0Var, aVar2);
        }

        private a() {
        }
    }

    /* renamed from: GI.V$b */
    public static final class b extends C15727V {

        /* renamed from: m  reason: collision with root package name */
        private final C16824o f134575m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C15554a aVar, u0 u0Var, int i10, C15649h hVar, C17069f fVar, C18096U u10, boolean z10, boolean z11, boolean z12, C18096U u11, i0 i0Var, C17631a<? extends List<? extends v0>> aVar2) {
            super(aVar, u0Var, i10, hVar, fVar, u10, z10, z11, z12, u11, i0Var);
            C17542s.j(aVar, "containingDeclaration");
            C17542s.j(hVar, "annotations");
            C17542s.j(fVar, "name");
            C17542s.j(u10, "outType");
            C17542s.j(i0Var, "source");
            C17542s.j(aVar2, "destructuringVariables");
            this.f134575m = C16825p.b(aVar2);
        }

        /* access modifiers changed from: private */
        public static final List O0(b bVar) {
            return bVar.P0();
        }

        public final List<v0> P0() {
            return (List) this.f134575m.getValue();
        }

        public u0 f0(C15554a aVar, C17069f fVar, int i10) {
            C15554a aVar2 = aVar;
            C17542s.j(aVar2, "newOwner");
            C17069f fVar2 = fVar;
            C17542s.j(fVar2, "newName");
            C15649h annotations = getAnnotations();
            C17542s.i(annotations, "<get-annotations>(...)");
            C18096U type = getType();
            C17542s.i(type, "getType(...)");
            boolean B02 = B0();
            boolean s02 = s0();
            boolean r02 = r0();
            C18096U w02 = w0();
            i0 i0Var = i0.f133841a;
            C17542s.i(i0Var, "NO_SOURCE");
            return new b(aVar2, (u0) null, i10, annotations, fVar2, type, B02, s02, r02, w02, i0Var, new C15728W(this));
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [DI.u0] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15727V(DI.C15554a r8, DI.u0 r9, int r10, EI.C15649h r11, cJ.C17069f r12, uJ.C18096U r13, boolean r14, boolean r15, boolean r16, uJ.C18096U r17, DI.i0 r18) {
        /*
            r7 = this;
            r6 = r7
            java.lang.String r0 = "containingDeclaration"
            r1 = r8
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "annotations"
            r2 = r11
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "name"
            r3 = r12
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "outType"
            r4 = r13
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "source"
            r5 = r18
            kotlin.jvm.internal.C17542s.j(r5, r0)
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r10
            r6.f134569f = r0
            r0 = r14
            r6.f134570g = r0
            r0 = r15
            r6.f134571h = r0
            r0 = r16
            r6.f134572i = r0
            r0 = r17
            r6.f134573j = r0
            if (r9 != 0) goto L_0x0039
            r0 = r6
            goto L_0x003a
        L_0x0039:
            r0 = r9
        L_0x003a:
            r6.f134574k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: GI.C15727V.<init>(DI.a, DI.u0, int, EI.h, cJ.f, uJ.U, boolean, boolean, boolean, uJ.U, DI.i0):void");
    }

    public static final C15727V K0(C15554a aVar, u0 u0Var, int i10, C15649h hVar, C17069f fVar, C18096U u10, boolean z10, boolean z11, boolean z12, C18096U u11, i0 i0Var, C17631a<? extends List<? extends v0>> aVar2) {
        return f134568l.a(aVar, u0Var, i10, hVar, fVar, u10, z10, z11, z12, u11, i0Var, aVar2);
    }

    public boolean B0() {
        if (this.f134570g) {
            C15554a b10 = b();
            C17542s.h(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((C15555b) b10).h().a()) {
                return true;
            }
        }
        return false;
    }

    public Void L0() {
        return null;
    }

    /* renamed from: M0 */
    public u0 c(J0 j02) {
        C17542s.j(j02, "substitutor");
        if (j02.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    public boolean N() {
        return false;
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        C17542s.j(oVar, "visitor");
        return oVar.i(this, d10);
    }

    public Collection<u0> e() {
        Collection<? extends C15554a> e10 = b().e();
        C17542s.i(e10, "getOverriddenDescriptors(...)");
        Iterable<C15554a> iterable = e10;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C15554a j10 : iterable) {
            arrayList.add(j10.j().get(getIndex()));
        }
        return arrayList;
    }

    public u0 f0(C15554a aVar, C17069f fVar, int i10) {
        C17542s.j(aVar, "newOwner");
        C17542s.j(fVar, "newName");
        C15649h annotations = getAnnotations();
        C17542s.i(annotations, "<get-annotations>(...)");
        C18096U type = getType();
        C17542s.i(type, "getType(...)");
        boolean B02 = B0();
        boolean s02 = s0();
        boolean r02 = r0();
        C18096U w02 = w0();
        i0 i0Var = i0.f133841a;
        C17542s.i(i0Var, "NO_SOURCE");
        return new C15727V(aVar, (u0) null, i10, annotations, fVar, type, B02, s02, r02, w02, i0Var);
    }

    public int getIndex() {
        return this.f134569f;
    }

    public C15574u getVisibility() {
        C15574u uVar = C15573t.f133854f;
        C17542s.i(uVar, "LOCAL");
        return uVar;
    }

    public /* bridge */ /* synthetic */ C17373g q0() {
        return (C17373g) L0();
    }

    public boolean r0() {
        return this.f134572i;
    }

    public boolean s0() {
        return this.f134571h;
    }

    public C18096U w0() {
        return this.f134573j;
    }

    public C15554a b() {
        C15566m b10 = super.b();
        C17542s.h(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (C15554a) b10;
    }

    public u0 a() {
        u0 u0Var = this.f134574k;
        return u0Var == this ? this : u0Var.a();
    }
}
