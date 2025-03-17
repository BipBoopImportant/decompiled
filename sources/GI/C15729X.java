package GI;

import DI.C15566m;
import DI.d0;
import DI.i0;
import DI.n0;
import DI.u0;
import DI.v0;
import EI.C15649h;
import cJ.C17069f;
import java.util.Collections;
import java.util.List;
import uJ.C18096U;

/* renamed from: GI.X  reason: case insensitive filesystem */
public abstract class C15729X extends C15744n implements v0 {

    /* renamed from: e  reason: collision with root package name */
    protected C18096U f134577e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15729X(C15566m mVar, C15649h hVar, C17069f fVar, C18096U u10, i0 i0Var) {
        super(mVar, hVar, fVar, i0Var);
        if (mVar == null) {
            S(0);
        }
        if (hVar == null) {
            S(1);
        }
        if (fVar == null) {
            S(2);
        }
        if (i0Var == null) {
            S(3);
        }
        this.f134577e = u10;
    }

    private static /* synthetic */ void S(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    public void H0(C18096U u10) {
        this.f134577e = u10;
    }

    public d0 L() {
        return null;
    }

    public d0 O() {
        return null;
    }

    public C18096U getReturnType() {
        C18096U type = getType();
        if (type == null) {
            S(10);
        }
        return type;
    }

    public C18096U getType() {
        C18096U u10 = this.f134577e;
        if (u10 == null) {
            S(4);
        }
        return u10;
    }

    public List<n0> getTypeParameters() {
        List<n0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            S(8);
        }
        return emptyList;
    }

    public boolean i0() {
        return false;
    }

    public List<u0> j() {
        List<u0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            S(6);
        }
        return emptyList;
    }
}
