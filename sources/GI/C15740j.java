package GI;

import DI.C15566m;
import DI.i0;
import cJ.C17069f;
import tJ.C17994n;

/* renamed from: GI.j  reason: case insensitive filesystem */
public abstract class C15740j extends C15731a {

    /* renamed from: f  reason: collision with root package name */
    private final C15566m f134614f;

    /* renamed from: g  reason: collision with root package name */
    private final i0 f134615g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f134616h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C15740j(C17994n nVar, C15566m mVar, C17069f fVar, i0 i0Var, boolean z10) {
        super(nVar, fVar);
        if (nVar == null) {
            F0(0);
        }
        if (mVar == null) {
            F0(1);
        }
        if (fVar == null) {
            F0(2);
        }
        if (i0Var == null) {
            F0(3);
        }
        this.f134614f = mVar;
        this.f134615g = i0Var;
        this.f134616h = z10;
    }

    private static /* synthetic */ void F0(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 4 || i10 == 5) ? 2 : 3)];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i10 == 4 || i10 == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i10 == 4 || i10 == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C15566m b() {
        C15566m mVar = this.f134614f;
        if (mVar == null) {
            F0(4);
        }
        return mVar;
    }

    public i0 i() {
        i0 i0Var = this.f134615g;
        if (i0Var == null) {
            F0(5);
        }
        return i0Var;
    }

    public boolean isExternal() {
        return this.f134616h;
    }
}
