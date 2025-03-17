package GI;

import DI.C15566m;
import DI.i0;
import DI.l0;
import DI.n0;
import EI.C15649h;
import cJ.C17069f;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import gJ.C17278i;
import java.util.ArrayList;
import java.util.List;
import kJ.C17506e;
import nI.C17642l;
import tJ.C17994n;
import uJ.C18096U;
import uJ.C18100Y;
import uJ.Q0;

/* renamed from: GI.U  reason: case insensitive filesystem */
public class C15726U extends C15738h {

    /* renamed from: k  reason: collision with root package name */
    private final C17642l<C18096U, Void> f134565k;

    /* renamed from: l  reason: collision with root package name */
    private final List<C18096U> f134566l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f134567m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C15726U(C15566m mVar, C15649h hVar, boolean z10, Q0 q02, C17069f fVar, int i10, i0 i0Var, C17642l<C18096U, Void> lVar, l0 l0Var, C17994n nVar) {
        super(nVar, mVar, hVar, fVar, q02, z10, i10, i0Var, l0Var);
        if (mVar == null) {
            S(19);
        }
        if (hVar == null) {
            S(20);
        }
        if (q02 == null) {
            S(21);
        }
        if (fVar == null) {
            S(22);
        }
        if (i0Var == null) {
            S(23);
        }
        if (l0Var == null) {
            S(24);
        }
        if (nVar == null) {
            S(25);
        }
        this.f134566l = new ArrayList(1);
        this.f134567m = false;
        this.f134565k = lVar;
    }

    private void N0() {
        if (!this.f134567m) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + U0());
        }
    }

    private void O0() {
        if (this.f134567m) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + U0());
        }
    }

    public static C15726U P0(C15566m mVar, C15649h hVar, boolean z10, Q0 q02, C17069f fVar, int i10, i0 i0Var, C17642l<C18096U, Void> lVar, l0 l0Var, C17994n nVar) {
        if (mVar == null) {
            S(12);
        }
        if (hVar == null) {
            S(13);
        }
        if (q02 == null) {
            S(14);
        }
        if (fVar == null) {
            S(15);
        }
        if (i0Var == null) {
            S(16);
        }
        if (l0Var == null) {
            S(17);
        }
        if (nVar == null) {
            S(18);
        }
        return new C15726U(mVar, hVar, z10, q02, fVar, i10, i0Var, lVar, l0Var, nVar);
    }

    public static C15726U Q0(C15566m mVar, C15649h hVar, boolean z10, Q0 q02, C17069f fVar, int i10, i0 i0Var, C17994n nVar) {
        if (mVar == null) {
            S(6);
        }
        if (hVar == null) {
            S(7);
        }
        if (q02 == null) {
            S(8);
        }
        if (fVar == null) {
            S(9);
        }
        if (i0Var == null) {
            S(10);
        }
        if (nVar == null) {
            S(11);
        }
        return P0(mVar, hVar, z10, q02, fVar, i10, i0Var, (C17642l<C18096U, Void>) null, l0.a.f133844a, nVar);
    }

    public static n0 R0(C15566m mVar, C15649h hVar, boolean z10, Q0 q02, C17069f fVar, int i10, C17994n nVar) {
        if (mVar == null) {
            S(0);
        }
        if (hVar == null) {
            S(1);
        }
        if (q02 == null) {
            S(2);
        }
        if (fVar == null) {
            S(3);
        }
        if (nVar == null) {
            S(4);
        }
        C15726U Q02 = Q0(mVar, hVar, z10, q02, fVar, i10, i0.f133841a, nVar);
        Q02.M0(C17506e.m(mVar).z());
        Q02.V0();
        return Q02;
    }

    private static /* synthetic */ void S(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 5 || i10 == 28) ? 2 : 3)];
        switch (i10) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 10:
            case 16:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case BuildConfig.MIN_SDK_VERSION:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i10 == 5 || i10 == 28) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    private void S0(C18096U u10) {
        if (!C18100Y.a(u10)) {
            this.f134566l.add(u10);
        }
    }

    private String U0() {
        return getName() + " declared in " + C17278i.m(b());
    }

    /* access modifiers changed from: protected */
    public void K0(C18096U u10) {
        if (u10 == null) {
            S(27);
        }
        C17642l<C18096U, Void> lVar = this.f134565k;
        if (lVar != null) {
            lVar.invoke(u10);
        }
    }

    /* access modifiers changed from: protected */
    public List<C18096U> L0() {
        N0();
        List<C18096U> list = this.f134566l;
        if (list == null) {
            S(28);
        }
        return list;
    }

    public void M0(C18096U u10) {
        if (u10 == null) {
            S(26);
        }
        O0();
        S0(u10);
    }

    public boolean T0() {
        return this.f134567m;
    }

    public void V0() {
        O0();
        this.f134567m = true;
    }
}
