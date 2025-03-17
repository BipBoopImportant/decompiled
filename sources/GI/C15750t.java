package GI;

import DI.C15558e;
import DI.C15566m;
import EI.C15649h;
import oJ.C17703e;
import oJ.C17705g;

/* renamed from: GI.t  reason: case insensitive filesystem */
public class C15750t extends C15733c {

    /* renamed from: c  reason: collision with root package name */
    private final C15558e f134698c;

    /* renamed from: d  reason: collision with root package name */
    private final C17703e f134699d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15750t(C15558e eVar) {
        super(C15649h.f134231V.b());
        if (eVar == null) {
            S(0);
        }
        this.f134698c = eVar;
        this.f134699d = new C17703e(eVar, (C17703e) null);
    }

    private static /* synthetic */ void S(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 1 || i10 == 2) ? 2 : 3)];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i10 == 1 || i10 == 2)) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        throw ((i10 == 1 || i10 == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C15566m b() {
        C15558e eVar = this.f134698c;
        if (eVar == null) {
            S(2);
        }
        return eVar;
    }

    public C17705g getValue() {
        C17703e eVar = this.f134699d;
        if (eVar == null) {
            S(1);
        }
        return eVar;
    }

    public String toString() {
        return "class " + this.f134698c.getName() + "::this";
    }
}
