package uJ;

import DI.C15558e;
import DI.C15561h;
import DI.n0;
import EJ.C15671l;
import YH.C16877v;
import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import com.sugarcube.core.logger.DslKt;
import d9.M;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nI.C17642l;
import nJ.C17656k;
import vJ.g;
import vJ.r;
import wJ.C18227i;
import wJ.C18229k;
import wJ.C18230l;

public class M0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C18113f0 f147833a = C18230l.d(C18229k.DONT_CARE, new String[0]);

    /* renamed from: b  reason: collision with root package name */
    public static final C18113f0 f147834b = C18230l.d(C18229k.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final C18113f0 f147835c = new a("NO_EXPECTED_TYPE");

    /* renamed from: d  reason: collision with root package name */
    public static final C18113f0 f147836d = new a("UNIT_EXPECTED_TYPE");

    public static class a extends C18078B {

        /* renamed from: b  reason: collision with root package name */
        private final String f147837b;

        public a(String str) {
            this.f147837b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0044  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static /* synthetic */ void Z0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L_0x0009
                if (r9 == r0) goto L_0x0009
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L_0x000b
            L_0x0009:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            L_0x000b:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L_0x0013
                if (r9 == r0) goto L_0x0013
                r5 = r3
                goto L_0x0014
            L_0x0013:
                r5 = r4
            L_0x0014:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L_0x0030
                if (r9 == r4) goto L_0x002b
                if (r9 == r3) goto L_0x0026
                if (r9 == r0) goto L_0x0030
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L_0x0032
            L_0x0026:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L_0x0032
            L_0x002b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L_0x0032
            L_0x0030:
                r5[r7] = r6
            L_0x0032:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L_0x003e
                if (r9 == r0) goto L_0x003b
                r5[r1] = r6
                goto L_0x0042
            L_0x003b:
                r5[r1] = r7
                goto L_0x0042
            L_0x003e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L_0x0042:
                if (r9 == r1) goto L_0x0056
                if (r9 == r4) goto L_0x0052
                if (r9 == r3) goto L_0x004f
                if (r9 == r0) goto L_0x0056
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L_0x0056
            L_0x004f:
                r5[r4] = r7
                goto L_0x0056
            L_0x0052:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L_0x0056:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L_0x0064
                if (r9 == r0) goto L_0x0064
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L_0x0069
            L_0x0064:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L_0x0069:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: uJ.M0.a.Z0(int):void");
        }

        /* renamed from: U0 */
        public C18113f0 R0(boolean z10) {
            throw new IllegalStateException(this.f147837b);
        }

        /* renamed from: V0 */
        public C18113f0 T0(u0 u0Var) {
            if (u0Var == null) {
                Z0(0);
            }
            throw new IllegalStateException(this.f147837b);
        }

        /* access modifiers changed from: protected */
        public C18113f0 W0() {
            throw new IllegalStateException(this.f147837b);
        }

        public C18078B Y0(C18113f0 f0Var) {
            if (f0Var == null) {
                Z0(2);
            }
            throw new IllegalStateException(this.f147837b);
        }

        /* renamed from: a1 */
        public a X0(g gVar) {
            if (gVar == null) {
                Z0(3);
            }
            return this;
        }

        public String toString() {
            String str = this.f147837b;
            if (str == null) {
                Z0(1);
            }
            return str;
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        int i12 = i10;
        if (!(i12 == 4 || i12 == 9 || i12 == 11 || i12 == 15 || i12 == 17 || i12 == 19 || i12 == 26 || i12 == 35 || i12 == 48 || i12 == 53 || i12 == 6 || i12 == 7)) {
            switch (i12) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i12 == 4 || i12 == 9 || i12 == 11 || i12 == 15 || i12 == 17 || i12 == 19 || i12 == 26 || i12 == 35 || i12 == 48 || i12 == 53 || i12 == 6 || i12 == 7)) {
            switch (i12) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    i11 = 3;
                    break;
            }
        }
        i11 = 2;
        Object[] objArr = new Object[i11];
        switch (i12) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case ImageFormat.YUV_420_888:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case BuildConfig.MIN_SDK_VERSION:
                objArr[0] = "result";
                break;
            case 31:
            case BuildConfig.TARGET_SDK_VERSION:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = DslKt.INDICATOR_BACKGROUND;
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
            default:
                objArr[0] = "type";
                break;
        }
        if (i12 != 4) {
            if (i12 != 9) {
                if (i12 == 11 || i12 == 15) {
                    objArr[1] = "makeUnsubstitutedType";
                } else if (i12 == 17) {
                    objArr[1] = "getDefaultTypeProjections";
                } else if (i12 == 19) {
                    objArr[1] = "getImmediateSupertypes";
                } else if (i12 == 26) {
                    objArr[1] = "getAllSupertypes";
                } else if (i12 == 35) {
                    objArr[1] = "substituteProjectionsForParameters";
                } else if (i12 != 48) {
                    if (i12 != 53) {
                        if (!(i12 == 6 || i12 == 7)) {
                            switch (i12) {
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    break;
                                default:
                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                    break;
                            }
                        }
                    }
                    objArr[1] = "getPrimitiveNumberType";
                } else {
                    objArr[1] = "getDefaultPrimitiveNumberType";
                }
            }
            objArr[1] = "makeNullableIfNeeded";
        } else {
            objArr[1] = "makeNullableAsSpecified";
        }
        switch (i12) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case ImageFormat.YUV_420_888:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case BuildConfig.TARGET_SDK_VERSION:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i12 == 4 || i12 == 9 || i12 == 11 || i12 == 15 || i12 == 17 || i12 == 19 || i12 == 26 || i12 == 35 || i12 == 48 || i12 == 53 || i12 == 6 || i12 == 7)) {
            switch (i12) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    th2 = new IllegalArgumentException(format);
                    break;
            }
        }
        th2 = new IllegalStateException(format);
        throw th2;
    }

    public static boolean b(C18096U u10) {
        if (u10 == null) {
            a(28);
        }
        if (u10.O0()) {
            return true;
        }
        return C18090N.b(u10) && b(C18090N.a(u10).W0());
    }

    public static boolean c(C18096U u10, C17642l<P0, Boolean> lVar) {
        if (lVar == null) {
            a(43);
        }
        return d(u10, lVar, (C15671l<C18096U>) null);
    }

    private static boolean d(C18096U u10, C17642l<P0, Boolean> lVar, C15671l<C18096U> lVar2) {
        if (lVar == null) {
            a(44);
        }
        if (u10 == null) {
            return false;
        }
        P0 Q02 = u10.Q0();
        if (w(u10)) {
            return lVar.invoke(Q02).booleanValue();
        }
        if (lVar2 != null && lVar2.contains(u10)) {
            return false;
        }
        if (lVar.invoke(Q02).booleanValue()) {
            return true;
        }
        if (lVar2 == null) {
            lVar2 = C15671l.b();
        }
        lVar2.add(u10);
        C18087K k10 = Q02 instanceof C18087K ? (C18087K) Q02 : null;
        if (k10 != null && (d(k10.V0(), lVar, lVar2) || d(k10.W0(), lVar, lVar2))) {
            return true;
        }
        if ((Q02 instanceof C18145z) && d(((C18145z) Q02).Z0(), lVar, lVar2)) {
            return true;
        }
        y0 N02 = u10.N0();
        if (N02 instanceof C18095T) {
            for (C18096U d10 : ((C18095T) N02).a()) {
                if (d(d10, lVar, lVar2)) {
                    return true;
                }
            }
            return false;
        }
        for (E0 next : u10.L0()) {
            if (!next.a() && d(next.getType(), lVar, lVar2)) {
                return true;
            }
        }
        return false;
    }

    public static C18096U e(C18096U u10, C18096U u11, J0 j02) {
        if (u10 == null) {
            a(20);
        }
        if (u11 == null) {
            a(21);
        }
        if (j02 == null) {
            a(22);
        }
        C18096U p10 = j02.p(u11, Q0.INVARIANT);
        if (p10 != null) {
            return q(p10, u10.O0());
        }
        return null;
    }

    public static C15558e f(C18096U u10) {
        if (u10 == null) {
            a(30);
        }
        C15561h e10 = u10.N0().e();
        if (e10 instanceof C15558e) {
            return (C15558e) e10;
        }
        return null;
    }

    public static List<E0> g(List<n0> list) {
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (n0 r10 : list) {
            arrayList.add(new G0(r10.r()));
        }
        List<E0> t12 = C16877v.t1(arrayList);
        if (t12 == null) {
            a(17);
        }
        return t12;
    }

    public static List<C18096U> h(C18096U u10) {
        if (u10 == null) {
            a(18);
        }
        J0 f10 = J0.f(u10);
        Collection<C18096U> a10 = u10.N0().a();
        ArrayList arrayList = new ArrayList(a10.size());
        for (C18096U e10 : a10) {
            C18096U e11 = e(u10, e10, f10);
            if (e11 != null) {
                arrayList.add(e11);
            }
        }
        return arrayList;
    }

    public static n0 i(C18096U u10) {
        if (u10 == null) {
            a(63);
        }
        if (u10.N0().e() instanceof n0) {
            return (n0) u10.N0().e();
        }
        return null;
    }

    public static boolean j(C18096U u10) {
        if (u10 == null) {
            a(29);
        }
        if (u10.N0().e() instanceof C15558e) {
            return false;
        }
        for (C18096U l10 : h(u10)) {
            if (l(l10)) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(C18096U u10) {
        return u10 != null && u10.N0() == f147833a.N0();
    }

    public static boolean l(C18096U u10) {
        if (u10 == null) {
            a(27);
        }
        if (u10.O0()) {
            return true;
        }
        if (C18090N.b(u10) && l(C18090N.a(u10).W0())) {
            return true;
        }
        if (C18121j0.c(u10)) {
            return false;
        }
        if (m(u10)) {
            return j(u10);
        }
        if (u10 instanceof C18110e) {
            n0 c10 = ((C18110e) u10).W0().c();
            return c10 == null || j(c10.r());
        }
        y0 N02 = u10.N0();
        if (N02 instanceof C18095T) {
            for (C18096U l10 : N02.a()) {
                if (l(l10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(C18096U u10) {
        if (u10 == null) {
            a(60);
        }
        return i(u10) != null || (u10.N0() instanceof r);
    }

    public static C18096U n(C18096U u10) {
        if (u10 == null) {
            a(2);
        }
        return p(u10, false);
    }

    public static C18096U o(C18096U u10) {
        if (u10 == null) {
            a(1);
        }
        return p(u10, true);
    }

    public static C18096U p(C18096U u10, boolean z10) {
        if (u10 == null) {
            a(3);
        }
        P0 R02 = u10.Q0().R0(z10);
        if (R02 == null) {
            a(4);
        }
        return R02;
    }

    public static C18096U q(C18096U u10, boolean z10) {
        if (u10 == null) {
            a(8);
        }
        if (z10) {
            return o(u10);
        }
        if (u10 == null) {
            a(9);
        }
        return u10;
    }

    public static C18113f0 r(C18113f0 f0Var, boolean z10) {
        if (f0Var == null) {
            a(5);
        }
        if (z10) {
            C18113f0 U02 = f0Var.U0(true);
            if (U02 == null) {
                a(6);
            }
            return U02;
        }
        if (f0Var == null) {
            a(7);
        }
        return f0Var;
    }

    public static E0 s(n0 n0Var) {
        if (n0Var == null) {
            a(45);
        }
        return new C18127m0(n0Var);
    }

    public static E0 t(n0 n0Var, C18085I i10) {
        if (n0Var == null) {
            a(46);
        }
        return i10.b() == L0.SUPERTYPE ? new G0(C18129n0.b(n0Var)) : new C18127m0(n0Var);
    }

    public static C18113f0 u(C15561h hVar, C17656k kVar, C17642l<g, C18113f0> lVar) {
        if (!C18230l.m(hVar)) {
            return v(hVar.k(), kVar, lVar);
        }
        C18227i d10 = C18230l.d(C18229k.UNABLE_TO_SUBSTITUTE_TYPE, hVar.toString());
        if (d10 == null) {
            a(11);
        }
        return d10;
    }

    public static C18113f0 v(y0 y0Var, C17656k kVar, C17642l<g, C18113f0> lVar) {
        if (y0Var == null) {
            a(12);
        }
        if (kVar == null) {
            a(13);
        }
        if (lVar == null) {
            a(14);
        }
        C18113f0 n10 = C18099X.n(u0.f147932b.k(), y0Var, g(y0Var.getParameters()), false, kVar, lVar);
        if (n10 == null) {
            a(15);
        }
        return n10;
    }

    public static boolean w(C18096U u10) {
        if (u10 == null) {
            a(0);
        }
        return u10 == f147835c || u10 == f147836d;
    }
}
