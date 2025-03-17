package MI;

import AI.C15423d;
import AI.C15424e;
import DI.C15555b;
import DI.C15558e;
import DI.C15566m;
import DI.C15576w;
import DI.a0;
import gJ.C17278i;

/* renamed from: MI.o  reason: case insensitive filesystem */
public final class C16071o {
    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "companionObject";
        } else if (i10 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i10 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i10 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i10 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(C15555b bVar) {
        C15576w x02;
        if (bVar == null) {
            a(3);
        }
        if (!(bVar instanceof a0) || (x02 = ((a0) bVar).x0()) == null || !x02.getAnnotations().f2(C16047H.f136285b)) {
            return bVar.getAnnotations().f2(C16047H.f136285b);
        }
        return true;
    }

    public static boolean c(C15566m mVar) {
        if (mVar == null) {
            a(1);
        }
        return C17278i.x(mVar) && C17278i.w(mVar.b()) && !d((C15558e) mVar);
    }

    public static boolean d(C15558e eVar) {
        if (eVar == null) {
            a(2);
        }
        return C15424e.a(C15423d.f132979a, eVar);
    }

    public static boolean e(a0 a0Var) {
        if (a0Var == null) {
            a(0);
        }
        if (a0Var.h() == C15555b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(a0Var.b())) {
            return true;
        }
        return C17278i.x(a0Var.b()) && b(a0Var);
    }
}
