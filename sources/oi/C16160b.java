package OI;

import DI.C15554a;
import DI.C15555b;
import DI.C15558e;
import DI.C15566m;
import DI.C15579z;
import DI.i0;
import EI.C15649h;
import GI.C15739i;
import XH.v;
import YH.C16877v;
import cJ.C17069f;
import gJ.C17277h;
import java.util.List;
import uJ.C18096U;

/* renamed from: OI.b  reason: case insensitive filesystem */
public class C16160b extends C15739i implements C16159a {

    /* renamed from: F  reason: collision with root package name */
    private Boolean f136906F;

    /* renamed from: G  reason: collision with root package name */
    private Boolean f136907G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C16160b(C15558e eVar, C16160b bVar, C15649h hVar, boolean z10, C15555b.a aVar, i0 i0Var) {
        super(eVar, bVar, hVar, z10, aVar, i0Var);
        if (eVar == null) {
            S(0);
        }
        if (hVar == null) {
            S(1);
        }
        if (aVar == null) {
            S(2);
        }
        if (i0Var == null) {
            S(3);
        }
        this.f136906F = null;
        this.f136907G = null;
    }

    private static /* synthetic */ void S(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 11 || i10 == 18) ? 2 : 3)];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i10 == 11 || i10 == 18) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static C16160b t1(C15558e eVar, C15649h hVar, boolean z10, i0 i0Var) {
        if (eVar == null) {
            S(4);
        }
        if (hVar == null) {
            S(5);
        }
        if (i0Var == null) {
            S(6);
        }
        return new C16160b(eVar, (C16160b) null, hVar, z10, C15555b.a.DECLARATION, i0Var);
    }

    public boolean Q0() {
        return this.f136906F.booleanValue();
    }

    public void Y0(boolean z10) {
        this.f136906F = Boolean.valueOf(z10);
    }

    public void Z0(boolean z10) {
        this.f136907G = Boolean.valueOf(z10);
    }

    public boolean i0() {
        return this.f136907G.booleanValue();
    }

    /* access modifiers changed from: protected */
    public C16160b s1(C15558e eVar, C16160b bVar, C15555b.a aVar, i0 i0Var, C15649h hVar) {
        if (eVar == null) {
            S(12);
        }
        if (aVar == null) {
            S(13);
        }
        if (i0Var == null) {
            S(14);
        }
        if (hVar == null) {
            S(15);
        }
        return new C16160b(eVar, bVar, hVar, this.f134613E, aVar, i0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public C16160b o1(C15566m mVar, C15579z zVar, C15555b.a aVar, C17069f fVar, C15649h hVar, i0 i0Var) {
        if (mVar == null) {
            S(7);
        }
        if (aVar == null) {
            S(8);
        }
        if (hVar == null) {
            S(9);
        }
        if (i0Var == null) {
            S(10);
        }
        if (aVar == C15555b.a.DECLARATION || aVar == C15555b.a.SYNTHESIZED) {
            C16160b s12 = s1((C15558e) mVar, (C16160b) zVar, aVar, i0Var, hVar);
            s12.Y0(Q0());
            s12.Z0(i0());
            return s12;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + aVar);
    }

    /* renamed from: v1 */
    public C16160b n0(C18096U u10, List<C18096U> list, C18096U u11, v<C15554a.C3296a<?>, ?> vVar) {
        C18096U u12 = u10;
        List<C18096U> list2 = list;
        if (list2 == null) {
            S(16);
        }
        if (u11 == null) {
            S(17);
        }
        C16160b u13 = o1(b(), (C15579z) null, h(), (C17069f) null, getAnnotations(), i());
        u13.R0(u12 == null ? null : C17277h.i(u13, u12, C15649h.f134231V.b()), L(), C16877v.n(), getTypeParameters(), h.a(list2, j(), u13), u11, u(), getVisibility());
        if (vVar != null) {
            u13.U0(vVar.c(), vVar.d());
        }
        return u13;
    }
}
