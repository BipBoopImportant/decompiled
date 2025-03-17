package OI;

import BJ.s;
import DI.C15535F;
import DI.C15554a;
import DI.C15555b;
import DI.C15566m;
import DI.C15574u;
import DI.C15579z;
import DI.d0;
import DI.h0;
import DI.i0;
import DI.n0;
import DI.u0;
import EI.C15649h;
import GI.C15721O;
import XH.v;
import cJ.C17069f;
import gJ.C17277h;
import java.util.List;
import java.util.Map;
import uJ.C18096U;

/* renamed from: OI.e  reason: case insensitive filesystem */
public class C16163e extends C15721O implements C16159a {

    /* renamed from: G  reason: collision with root package name */
    public static final C15554a.C3296a<u0> f136911G = new a();

    /* renamed from: H  reason: collision with root package name */
    public static final C15554a.C3296a<Boolean> f136912H = new b();

    /* renamed from: E  reason: collision with root package name */
    private c f136913E;

    /* renamed from: F  reason: collision with root package name */
    private final boolean f136914F;

    /* renamed from: OI.e$a */
    static class a implements C15554a.C3296a<u0> {
        a() {
        }
    }

    /* renamed from: OI.e$b */
    static class b implements C15554a.C3296a<Boolean> {
        b() {
        }
    }

    /* renamed from: OI.e$c */
    private enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        
        public final boolean isStable;
        public final boolean isSynthesized;

        private c(boolean z10, boolean z11) {
            this.isStable = z10;
            this.isSynthesized = z11;
        }

        public static c b(boolean z10, boolean z11) {
            c cVar = z10 ? z11 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z11 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                a(0);
            }
            return cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C16163e(C15566m mVar, h0 h0Var, C15649h hVar, C17069f fVar, C15555b.a aVar, i0 i0Var, boolean z10) {
        super(mVar, h0Var, hVar, fVar, aVar, i0Var);
        if (mVar == null) {
            S(0);
        }
        if (hVar == null) {
            S(1);
        }
        if (fVar == null) {
            S(2);
        }
        if (aVar == null) {
            S(3);
        }
        if (i0Var == null) {
            S(4);
        }
        this.f136913E = null;
        this.f136914F = z10;
    }

    private static /* synthetic */ void S(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3)];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i10 == 13 || i10 == 18 || i10 == 21) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static C16163e p1(C15566m mVar, C15649h hVar, C17069f fVar, i0 i0Var, boolean z10) {
        if (mVar == null) {
            S(5);
        }
        if (hVar == null) {
            S(6);
        }
        if (fVar == null) {
            S(7);
        }
        if (i0Var == null) {
            S(8);
        }
        return new C16163e(mVar, (h0) null, hVar, fVar, C15555b.a.DECLARATION, i0Var, z10);
    }

    public boolean Q0() {
        return this.f136913E.isStable;
    }

    public boolean i0() {
        return this.f136913E.isSynthesized;
    }

    public C15721O o1(d0 d0Var, d0 d0Var2, List<d0> list, List<? extends n0> list2, List<u0> list3, C18096U u10, C15535F f10, C15574u uVar, Map<? extends C15554a.C3296a<?>, ?> map) {
        if (list == null) {
            S(9);
        }
        if (list2 == null) {
            S(10);
        }
        if (list3 == null) {
            S(11);
        }
        if (uVar == null) {
            S(12);
        }
        C15721O o12 = super.o1(d0Var, d0Var2, list, list2, list3, u10, f10, uVar, map);
        f1(s.f133337a.a(o12).a());
        if (o12 == null) {
            S(13);
        }
        return o12;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q1 */
    public C16163e L0(C15566m mVar, C15579z zVar, C15555b.a aVar, C17069f fVar, C15649h hVar, i0 i0Var) {
        if (mVar == null) {
            S(14);
        }
        if (aVar == null) {
            S(15);
        }
        if (hVar == null) {
            S(16);
        }
        if (i0Var == null) {
            S(17);
        }
        h0 h0Var = (h0) zVar;
        if (fVar == null) {
            fVar = getName();
        }
        C16163e eVar = new C16163e(mVar, h0Var, hVar, fVar, aVar, i0Var, this.f136914F);
        eVar.s1(Q0(), i0());
        return eVar;
    }

    /* renamed from: r1 */
    public C16163e n0(C18096U u10, List<C18096U> list, C18096U u11, v<C15554a.C3296a<?>, ?> vVar) {
        if (list == null) {
            S(19);
        }
        if (u11 == null) {
            S(20);
        }
        C16163e eVar = (C16163e) x().b(h.a(list, j(), this)).t(u11).m(u10 == null ? null : C17277h.i(this, u10, C15649h.f134231V.b())).a().n().g();
        if (vVar != null) {
            eVar.U0(vVar.c(), vVar.d());
        }
        if (eVar == null) {
            S(21);
        }
        return eVar;
    }

    public void s1(boolean z10, boolean z11) {
        this.f136913E = c.b(z10, z11);
    }
}
