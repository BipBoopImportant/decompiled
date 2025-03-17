package GI;

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
import cJ.C17069f;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import uJ.C18096U;

/* renamed from: GI.O  reason: case insensitive filesystem */
public class C15721O extends C15749s implements h0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C15721O(C15566m mVar, h0 h0Var, C15649h hVar, C17069f fVar, C15555b.a aVar, i0 i0Var) {
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
    }

    private static /* synthetic */ void S(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3)];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static C15721O l1(C15566m mVar, C15649h hVar, C17069f fVar, C15555b.a aVar, i0 i0Var) {
        if (mVar == null) {
            S(5);
        }
        if (hVar == null) {
            S(6);
        }
        if (fVar == null) {
            S(7);
        }
        if (aVar == null) {
            S(8);
        }
        if (i0Var == null) {
            S(9);
        }
        return new C15721O(mVar, (h0) null, hVar, fVar, aVar, i0Var);
    }

    /* access modifiers changed from: protected */
    public C15749s L0(C15566m mVar, C15579z zVar, C15555b.a aVar, C17069f fVar, C15649h hVar, i0 i0Var) {
        if (mVar == null) {
            S(25);
        }
        if (aVar == null) {
            S(26);
        }
        if (hVar == null) {
            S(27);
        }
        if (i0Var == null) {
            S(28);
        }
        h0 h0Var = (h0) zVar;
        if (fVar == null) {
            fVar = getName();
        }
        return new C15721O(mVar, h0Var, hVar, fVar, aVar, i0Var);
    }

    /* renamed from: k1 */
    public h0 K0(C15566m mVar, C15535F f10, C15574u uVar, C15555b.a aVar, boolean z10) {
        h0 h0Var = (h0) super.C(mVar, f10, uVar, aVar, z10);
        if (h0Var == null) {
            S(29);
        }
        return h0Var;
    }

    /* renamed from: m1 */
    public h0 a() {
        h0 h0Var = (h0) super.a();
        if (h0Var == null) {
            S(24);
        }
        return h0Var;
    }

    /* renamed from: n1 */
    public C15721O R0(d0 d0Var, d0 d0Var2, List<d0> list, List<? extends n0> list2, List<u0> list3, C18096U u10, C15535F f10, C15574u uVar) {
        if (list == null) {
            S(14);
        }
        if (list2 == null) {
            S(15);
        }
        if (list3 == null) {
            S(16);
        }
        if (uVar == null) {
            S(17);
        }
        C15721O o12 = o1(d0Var, d0Var2, list, list2, list3, u10, f10, uVar, (Map<? extends C15554a.C3296a<?>, ?>) null);
        if (o12 == null) {
            S(18);
        }
        return o12;
    }

    public C15721O o1(d0 d0Var, d0 d0Var2, List<d0> list, List<? extends n0> list2, List<u0> list3, C18096U u10, C15535F f10, C15574u uVar, Map<? extends C15554a.C3296a<?>, ?> map) {
        if (list == null) {
            S(19);
        }
        if (list2 == null) {
            S(20);
        }
        if (list3 == null) {
            S(21);
        }
        if (uVar == null) {
            S(22);
        }
        super.R0(d0Var, d0Var2, list, list2, list3, u10, f10, uVar);
        if (map != null && !map.isEmpty()) {
            this.f134648D = new LinkedHashMap(map);
        }
        return this;
    }

    public C15579z.a<? extends h0> x() {
        C15579z.a<? extends C15579z> x10 = super.x();
        if (x10 == null) {
            S(30);
        }
        return x10;
    }
}
