package GI;

import DI.C15552X;
import DI.C15554a;
import DI.C15558e;
import DI.C15568o;
import DI.C15573t;
import DI.C15574u;
import DI.d0;
import DI.i0;
import DI.n0;
import DI.u0;
import EI.C15649h;
import cJ.C17069f;
import cJ.C17071h;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import oJ.j;
import uJ.C18096U;
import uJ.J0;
import uJ.Q0;

/* renamed from: GI.c  reason: case insensitive filesystem */
public abstract class C15733c extends C15743m implements d0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15733c(C15649h hVar) {
        super(hVar, C17071h.f141270i);
        if (hVar == null) {
            S(0);
        }
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
            case 11:
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
            case 11:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    /* renamed from: F0 */
    public C15552X a() {
        return this;
    }

    public d0 L() {
        return null;
    }

    public d0 O() {
        return null;
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        return oVar.d(this, d10);
    }

    public Collection<? extends C15554a> e() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            S(8);
        }
        return emptySet;
    }

    public C18096U getReturnType() {
        return getType();
    }

    public C18096U getType() {
        C18096U type = getValue().getType();
        if (type == null) {
            S(6);
        }
        return type;
    }

    public List<n0> getTypeParameters() {
        List<n0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            S(5);
        }
        return emptyList;
    }

    public C15574u getVisibility() {
        C15574u uVar = C15573t.f133854f;
        if (uVar == null) {
            S(9);
        }
        return uVar;
    }

    public i0 i() {
        i0 i0Var = i0.f133841a;
        if (i0Var == null) {
            S(11);
        }
        return i0Var;
    }

    public boolean i0() {
        return false;
    }

    public List<u0> j() {
        List<u0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            S(7);
        }
        return emptyList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15733c(C15649h hVar, C17069f fVar) {
        super(hVar, fVar);
        if (hVar == null) {
            S(1);
        }
        if (fVar == null) {
            S(2);
        }
    }

    public d0 c(J0 j02) {
        C18096U u10;
        if (j02 == null) {
            S(3);
        }
        if (j02.k()) {
            return this;
        }
        if (b() instanceof C15558e) {
            u10 = j02.p(getType(), Q0.OUT_VARIANCE);
        } else {
            u10 = j02.p(getType(), Q0.INVARIANT);
        }
        if (u10 == null) {
            return null;
        }
        if (u10 == getType()) {
            return this;
        }
        return new C15720N(b(), new j(u10), getAnnotations());
    }
}
