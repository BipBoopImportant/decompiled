package GI;

import DI.C15566m;
import DI.i0;
import EI.C15649h;
import cJ.C17069f;
import iJ.C17373g;
import nI.C17631a;
import tJ.C17990j;
import uJ.C18096U;

/* renamed from: GI.Y  reason: case insensitive filesystem */
public abstract class C15730Y extends C15729X {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f134578f;

    /* renamed from: g  reason: collision with root package name */
    protected C17990j<C17373g<?>> f134579g;

    /* renamed from: h  reason: collision with root package name */
    protected C17631a<C17990j<C17373g<?>>> f134580h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15730Y(C15566m mVar, C15649h hVar, C17069f fVar, C18096U u10, boolean z10, i0 i0Var) {
        super(mVar, hVar, fVar, u10, i0Var);
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
        this.f134578f = z10;
    }

    private static /* synthetic */ void S(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void K0(C17990j<C17373g<?>> jVar, C17631a<C17990j<C17373g<?>>> aVar) {
        if (aVar == null) {
            S(5);
        }
        this.f134580h = aVar;
        if (jVar == null) {
            jVar = aVar.invoke();
        }
        this.f134579g = jVar;
    }

    public void L0(C17631a<C17990j<C17373g<?>>> aVar) {
        if (aVar == null) {
            S(4);
        }
        K0((C17990j<C17373g<?>>) null, aVar);
    }

    public boolean N() {
        return this.f134578f;
    }

    public C17373g<?> q0() {
        C17990j<C17373g<?>> jVar = this.f134579g;
        if (jVar != null) {
            return (C17373g) jVar.invoke();
        }
        return null;
    }
}
