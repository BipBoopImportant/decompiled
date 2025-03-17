package GI;

import DI.C15566m;
import DI.i0;
import DI.l0;
import EI.C15649h;
import cJ.C17069f;
import tJ.C17994n;
import uJ.Q0;

/* renamed from: GI.b  reason: case insensitive filesystem */
public abstract class C15732b extends C15738h {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15732b(C17994n nVar, C15566m mVar, C15649h hVar, C17069f fVar, Q0 q02, boolean z10, int i10, i0 i0Var, l0 l0Var) {
        super(nVar, mVar, hVar, fVar, q02, z10, i10, i0Var, l0Var);
        if (nVar == null) {
            S(0);
        }
        if (mVar == null) {
            S(1);
        }
        if (hVar == null) {
            S(2);
        }
        if (fVar == null) {
            S(3);
        }
        if (q02 == null) {
            S(4);
        }
        if (i0Var == null) {
            S(5);
        }
        if (l0Var == null) {
            S(6);
        }
    }

    private static /* synthetic */ void S(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        String str = "";
        String str2 = A() ? "reified " : str;
        if (o() != Q0.INVARIANT) {
            str = o() + " ";
        }
        return String.format("%s%s%s", new Object[]{str2, str, getName()});
    }
}
