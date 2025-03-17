package GI;

import DI.C15566m;
import DI.C15567n;
import DI.C15569p;
import DI.i0;
import EI.C15649h;
import cJ.C17069f;

/* renamed from: GI.n  reason: case insensitive filesystem */
public abstract class C15744n extends C15743m implements C15567n {

    /* renamed from: c  reason: collision with root package name */
    private final C15566m f134626c;

    /* renamed from: d  reason: collision with root package name */
    private final i0 f134627d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C15744n(C15566m mVar, C15649h hVar, C17069f fVar, i0 i0Var) {
        super(hVar, fVar);
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
        this.f134626c = mVar;
        this.f134627d = i0Var;
    }

    private static /* synthetic */ void S(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3)];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i10 == 4 || i10 == 5 || i10 == 6)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i10 == 4 || i10 == 5 || i10 == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: F0 */
    public C15569p a() {
        C15569p pVar = (C15569p) super.a();
        if (pVar == null) {
            S(4);
        }
        return pVar;
    }

    public C15566m b() {
        C15566m mVar = this.f134626c;
        if (mVar == null) {
            S(5);
        }
        return mVar;
    }

    public i0 i() {
        i0 i0Var = this.f134627d;
        if (i0Var == null) {
            S(6);
        }
        return i0Var;
    }
}
