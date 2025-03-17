package GI;

import DI.C15535F;
import DI.C15555b;
import DI.C15557d;
import DI.C15558e;
import DI.C15565l;
import DI.C15566m;
import DI.C15568o;
import DI.C15574u;
import DI.C15579z;
import DI.d0;
import DI.i0;
import DI.n0;
import DI.u0;
import EI.C15649h;
import cJ.C17069f;
import cJ.C17071h;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import uJ.C18096U;
import uJ.J0;

/* renamed from: GI.i  reason: case insensitive filesystem */
public class C15739i extends C15749s implements C15557d {

    /* renamed from: E  reason: collision with root package name */
    protected final boolean f134613E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C15739i(C15558e eVar, C15565l lVar, C15649h hVar, boolean z10, C15555b.a aVar, i0 i0Var) {
        super(eVar, lVar, hVar, C17071h.f141271j, aVar, i0Var);
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
        this.f134613E = z10;
    }

    private static /* synthetic */ void S(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (!(i10 == 21 || i10 == 27)) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i10 == 21 || i10 == 27)) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    i11 = 3;
                    break;
            }
        }
        i11 = 2;
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case BuildConfig.MIN_SDK_VERSION:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i10 == 21 || i10 == 27)) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    th2 = new IllegalArgumentException(format);
                    break;
            }
        }
        th2 = new IllegalStateException(format);
        throw th2;
    }

    private List<d0> k1() {
        C15558e p12 = b();
        if (!p12.Z().isEmpty()) {
            List<d0> Z10 = p12.Z();
            if (Z10 == null) {
                S(15);
            }
            return Z10;
        }
        List<d0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            S(16);
        }
        return emptyList;
    }

    public static C15739i n1(C15558e eVar, C15649h hVar, boolean z10, i0 i0Var) {
        if (eVar == null) {
            S(4);
        }
        if (hVar == null) {
            S(5);
        }
        if (i0Var == null) {
            S(6);
        }
        return new C15739i(eVar, (C15565l) null, hVar, z10, C15555b.a.DECLARATION, i0Var);
    }

    public void E0(Collection<? extends C15555b> collection) {
        if (collection == null) {
            S(22);
        }
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        return oVar.c(this, d10);
    }

    public boolean d0() {
        return this.f134613E;
    }

    public Collection<? extends C15579z> e() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            S(21);
        }
        return emptySet;
    }

    public C15558e e0() {
        C15558e p12 = b();
        if (p12 == null) {
            S(18);
        }
        return p12;
    }

    public d0 l1() {
        C15558e p12 = b();
        if (!p12.n()) {
            return null;
        }
        C15566m b10 = p12.b();
        if (b10 instanceof C15558e) {
            return ((C15558e) b10).J0();
        }
        return null;
    }

    /* renamed from: m1 */
    public C15557d K0(C15566m mVar, C15535F f10, C15574u uVar, C15555b.a aVar, boolean z10) {
        C15557d dVar = (C15557d) super.C(mVar, f10, uVar, aVar, z10);
        if (dVar == null) {
            S(27);
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o1 */
    public C15739i L0(C15566m mVar, C15579z zVar, C15555b.a aVar, C17069f fVar, C15649h hVar, i0 i0Var) {
        if (mVar == null) {
            S(23);
        }
        if (aVar == null) {
            S(24);
        }
        if (hVar == null) {
            S(25);
        }
        if (i0Var == null) {
            S(26);
        }
        C15555b.a aVar2 = C15555b.a.DECLARATION;
        if (aVar == aVar2 || aVar == C15555b.a.SYNTHESIZED) {
            return new C15739i((C15558e) mVar, this, hVar, this.f134613E, aVar2, i0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + aVar);
    }

    /* renamed from: p1 */
    public C15558e b() {
        C15558e eVar = (C15558e) super.b();
        if (eVar == null) {
            S(17);
        }
        return eVar;
    }

    public C15739i q1(List<u0> list, C15574u uVar) {
        if (list == null) {
            S(13);
        }
        if (uVar == null) {
            S(14);
        }
        r1(list, uVar, b().t());
        return this;
    }

    public C15739i r1(List<u0> list, C15574u uVar, List<n0> list2) {
        if (list == null) {
            S(10);
        }
        if (uVar == null) {
            S(11);
        }
        if (list2 == null) {
            S(12);
        }
        super.R0((d0) null, l1(), k1(), list2, list, (C18096U) null, C15535F.FINAL, uVar);
        return this;
    }

    public C15557d c(J0 j02) {
        if (j02 == null) {
            S(20);
        }
        return (C15557d) super.c(j02);
    }

    public C15557d a() {
        C15557d dVar = (C15557d) super.a();
        if (dVar == null) {
            S(19);
        }
        return dVar;
    }
}
