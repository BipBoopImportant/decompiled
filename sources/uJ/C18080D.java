package uJ;

import DI.C15561h;
import DI.C15566m;
import DI.i0;
import DI.n0;
import GI.C15726U;
import java.util.HashMap;
import java.util.List;
import zJ.C18755d;

/* renamed from: uJ.D  reason: case insensitive filesystem */
public class C18080D {
    private static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 != 4 ? 3 : 2)];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        throw (i10 != 4 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public static J0 b(List<n0> list, H0 h02, C15566m mVar, List<n0> list2) {
        if (list == null) {
            a(0);
        }
        if (h02 == null) {
            a(1);
        }
        if (mVar == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        J0 c10 = c(list, h02, mVar, list2, (boolean[]) null);
        if (c10 != null) {
            return c10;
        }
        throw new AssertionError("Substitution failed");
    }

    public static J0 c(List<n0> list, H0 h02, C15566m mVar, List<n0> list2, boolean[] zArr) {
        H0 h03 = h02;
        List<n0> list3 = list2;
        if (list == null) {
            a(5);
        }
        if (h03 == null) {
            a(6);
        }
        if (mVar == null) {
            a(7);
        }
        if (list3 == null) {
            a(8);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i10 = 0;
        for (n0 next : list) {
            C15726U Q02 = C15726U.Q0(mVar, next.getAnnotations(), next.A(), next.o(), next.getName(), i10, i0.f133841a, next.M());
            hashMap.put(next.k(), new G0(Q02.r()));
            hashMap2.put(next, Q02);
            list3.add(Q02);
            i10++;
        }
        z0 j10 = z0.j(hashMap);
        J0 h10 = J0.h(h03, j10);
        J0 h11 = J0.h(h02.h(), j10);
        for (n0 next2 : list) {
            C15726U u10 = (C15726U) hashMap2.get(next2);
            for (C18096U next3 : next2.getUpperBounds()) {
                C15561h e10 = next3.N0().e();
                C18096U p10 = ((!(e10 instanceof n0) || !C18755d.p((n0) e10)) ? h11 : h10).p(next3, Q0.OUT_VARIANCE);
                if (p10 == null) {
                    return null;
                }
                if (!(p10 == next3 || zArr == null)) {
                    zArr[0] = true;
                }
                u10.M0(p10);
            }
            u10.V0();
        }
        return h10;
    }
}
