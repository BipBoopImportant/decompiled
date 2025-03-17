package GI;

import DI.C15566m;
import EI.C15649h;
import cJ.C17069f;
import cJ.C17071h;
import oJ.C17705g;

/* renamed from: GI.N  reason: case insensitive filesystem */
public class C15720N extends C15733c {

    /* renamed from: c  reason: collision with root package name */
    private final C15566m f134553c;

    /* renamed from: d  reason: collision with root package name */
    private C17705g f134554d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15720N(C15566m mVar, C17705g gVar, C15649h hVar) {
        this(mVar, gVar, hVar, C17071h.f141270i);
        if (mVar == null) {
            S(0);
        }
        if (gVar == null) {
            S(1);
        }
        if (hVar == null) {
            S(2);
        }
    }

    private static /* synthetic */ void S(int i10) {
        String str = (i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 7 || i10 == 8) ? 2 : 3)];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getValue";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i10) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i10 == 7 || i10 == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C15566m b() {
        C15566m mVar = this.f134553c;
        if (mVar == null) {
            S(8);
        }
        return mVar;
    }

    public C17705g getValue() {
        C17705g gVar = this.f134554d;
        if (gVar == null) {
            S(7);
        }
        return gVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15720N(C15566m mVar, C17705g gVar, C15649h hVar, C17069f fVar) {
        super(hVar, fVar);
        if (mVar == null) {
            S(3);
        }
        if (gVar == null) {
            S(4);
        }
        if (hVar == null) {
            S(5);
        }
        if (fVar == null) {
            S(6);
        }
        this.f134553c = mVar;
        this.f134554d = gVar;
    }
}
