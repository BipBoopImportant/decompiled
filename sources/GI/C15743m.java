package GI;

import DI.C15566m;
import EI.C15643b;
import EI.C15649h;
import cJ.C17069f;
import fJ.n;

/* renamed from: GI.m  reason: case insensitive filesystem */
public abstract class C15743m extends C15643b implements C15566m {

    /* renamed from: b  reason: collision with root package name */
    private final C17069f f134625b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15743m(C15649h hVar, C17069f fVar) {
        super(hVar);
        if (hVar == null) {
            S(0);
        }
        if (fVar == null) {
            S(1);
        }
        this.f134625b = fVar;
    }

    private static /* synthetic */ void S(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3)];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (!(i10 == 2 || i10 == 3)) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (!(i10 == 5 || i10 == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        throw ((i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static String j0(C15566m mVar) {
        if (mVar == null) {
            S(4);
        }
        try {
            String str = n.f143183k.M(mVar) + "[" + mVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(mVar)) + "]";
            if (str == null) {
                S(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = mVar.getClass().getSimpleName() + " " + mVar.getName();
            if (str2 == null) {
                S(6);
            }
            return str2;
        }
    }

    public C15566m a() {
        return this;
    }

    public C17069f getName() {
        C17069f fVar = this.f134625b;
        if (fVar == null) {
            S(2);
        }
        return fVar;
    }

    public String toString() {
        return j0(this);
    }
}
