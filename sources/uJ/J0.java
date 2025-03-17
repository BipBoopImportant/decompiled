package uJ;

import AI.C15429j;
import AI.C15435p;
import AJ.C15442c;
import DI.n0;
import EI.C15649h;
import EI.C15656o;
import EI.C15657p;
import EJ.C15663d;
import cJ.C17066c;
import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import hJ.C17334e;
import java.util.ArrayList;
import java.util.List;
import nI.C17642l;
import vJ.n;
import wJ.C18227i;
import wJ.C18229k;
import wJ.C18230l;
import zJ.C18755d;

public class J0 {

    /* renamed from: b  reason: collision with root package name */
    public static final J0 f147823b = g(H0.f147818b);

    /* renamed from: a  reason: collision with root package name */
    private final H0 f147824a;

    static class a implements C17642l<C17066c, Boolean> {
        a() {
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"}));
        }

        /* renamed from: b */
        public Boolean invoke(C17066c cVar) {
            if (cVar == null) {
                a(0);
            }
            return Boolean.valueOf(!cVar.equals(C15435p.a.f133080Q));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f147825a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                uJ.J0$d[] r0 = uJ.J0.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f147825a = r0
                uJ.J0$d r1 = uJ.J0.d.OUT_IN_IN_POSITION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f147825a     // Catch:{ NoSuchFieldError -> 0x001d }
                uJ.J0$d r1 = uJ.J0.d.IN_IN_OUT_POSITION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f147825a     // Catch:{ NoSuchFieldError -> 0x0028 }
                uJ.J0$d r1 = uJ.J0.d.NO_CONFLICT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uJ.J0.b.<clinit>():void");
        }
    }

    private static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    private enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected J0(H0 h02) {
        if (h02 == null) {
            a(7);
        }
        this.f147824a = h02;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (!(i10 == 1 || i10 == 2 || i10 == 8 || i10 == 34 || i10 == 37)) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                        case BuildConfig.MIN_SDK_VERSION:
                        case 25:
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i10 == 1 || i10 == 2 || i10 == 8 || i10 == 34 || i10 == 37)) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                        case BuildConfig.MIN_SDK_VERSION:
                        case 25:
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i11 = 2;
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case BuildConfig.TARGET_SDK_VERSION:
                objArr[0] = "annotations";
                break;
            case ImageFormat.YUV_420_888:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
            default:
                objArr[0] = "substitution";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i10 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i10 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i10 != 34) {
            if (i10 != 37) {
                switch (i10) {
                    case 11:
                    case 12:
                    case 13:
                        objArr[1] = "safeSubstitute";
                        break;
                    default:
                        switch (i10) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                            case BuildConfig.MIN_SDK_VERSION:
                            case 25:
                                objArr[1] = "unsafeSubstitute";
                                break;
                            default:
                                switch (i10) {
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                        break;
                                    default:
                                        switch (i10) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                break;
                                        }
                                }
                        }
                }
            }
            objArr[1] = "combine";
        } else {
            objArr[1] = "filterOutUnsafeVariance";
        }
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case BuildConfig.TARGET_SDK_VERSION:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case ImageFormat.YUV_420_888:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i10 == 1 || i10 == 2 || i10 == 8 || i10 == 34 || i10 == 37)) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                        case BuildConfig.MIN_SDK_VERSION:
                        case 25:
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            th2 = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th2 = new IllegalStateException(format);
        throw th2;
    }

    private static void b(int i10, E0 e02, H0 h02) {
        if (i10 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + o(e02) + "; substitution: " + o(h02));
        }
    }

    public static Q0 c(Q0 q02, E0 e02) {
        if (q02 == null) {
            a(35);
        }
        if (e02 == null) {
            a(36);
        }
        if (!e02.a()) {
            return d(q02, e02.c());
        }
        Q0 q03 = Q0.OUT_VARIANCE;
        if (q03 == null) {
            a(37);
        }
        return q03;
    }

    public static Q0 d(Q0 q02, Q0 q03) {
        if (q02 == null) {
            a(38);
        }
        if (q03 == null) {
            a(39);
        }
        Q0 q04 = Q0.INVARIANT;
        if (q02 == q04) {
            if (q03 == null) {
                a(40);
            }
            return q03;
        } else if (q03 == q04) {
            if (q02 == null) {
                a(41);
            }
            return q02;
        } else if (q02 == q03) {
            if (q03 == null) {
                a(42);
            }
            return q03;
        } else {
            throw new AssertionError("Variance conflict: type parameter variance '" + q02 + "' and projection kind '" + q03 + "' cannot be combined");
        }
    }

    private static d e(Q0 q02, Q0 q03) {
        Q0 q04 = Q0.IN_VARIANCE;
        return (q02 == q04 && q03 == Q0.OUT_VARIANCE) ? d.OUT_IN_IN_POSITION : (q02 == Q0.OUT_VARIANCE && q03 == q04) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    public static J0 f(C18096U u10) {
        if (u10 == null) {
            a(6);
        }
        return g(z0.i(u10.N0(), u10.L0()));
    }

    public static J0 g(H0 h02) {
        if (h02 == null) {
            a(0);
        }
        return new J0(h02);
    }

    public static J0 h(H0 h02, H0 h03) {
        if (h02 == null) {
            a(3);
        }
        if (h03 == null) {
            a(4);
        }
        return g(C18081E.i(h02, h03));
    }

    private static C15649h i(C15649h hVar) {
        if (hVar == null) {
            a(33);
        }
        return !hVar.f2(C15435p.a.f133080Q) ? hVar : new C15657p(hVar, new a());
    }

    private static E0 l(C18096U u10, E0 e02, n0 n0Var, E0 e03) {
        if (u10 == null) {
            a(26);
        }
        if (e02 == null) {
            a(27);
        }
        if (e03 == null) {
            a(28);
        }
        if (!u10.getAnnotations().f2(C15435p.a.f133080Q)) {
            if (e02 == null) {
                a(29);
            }
            return e02;
        }
        y0 N02 = e02.getType().N0();
        if (!(N02 instanceof n)) {
            return e02;
        }
        E0 d10 = ((n) N02).d();
        Q0 c10 = d10.c();
        d e10 = e(e03.c(), c10);
        d dVar = d.OUT_IN_IN_POSITION;
        return e10 == dVar ? new G0(d10.getType()) : (n0Var != null && e(n0Var.o(), c10) == dVar) ? new G0(d10.getType()) : e02;
    }

    private static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (!C15663d.a(th2)) {
                return "[Exception while computing toString(): " + th2 + "]";
            }
            throw th2;
        }
    }

    private E0 r(E0 e02, int i10) {
        C18096U type = e02.getType();
        Q0 c10 = e02.c();
        if (type.N0().e() instanceof n0) {
            return e02;
        }
        C18113f0 b10 = C18121j0.b(type);
        C18096U p10 = b10 != null ? m().p(b10, Q0.INVARIANT) : null;
        C18096U b11 = I0.b(type, s(type.N0().getParameters(), type.L0(), i10), this.f147824a.d(type.getAnnotations()));
        if ((b11 instanceof C18113f0) && (p10 instanceof C18113f0)) {
            b11 = C18121j0.j((C18113f0) b11, (C18113f0) p10);
        }
        return new G0(c10, b11);
    }

    private List<E0> s(List<n0> list, List<E0> list2, int i10) {
        Q0 q02;
        ArrayList arrayList = new ArrayList(list.size());
        boolean z10 = false;
        for (int i11 = 0; i11 < list.size(); i11++) {
            n0 n0Var = list.get(i11);
            E0 e02 = list2.get(i11);
            E0 u10 = u(e02, n0Var, i10 + 1);
            int i12 = b.f147825a[e(n0Var.o(), u10.c()).ordinal()];
            if (i12 == 1 || i12 == 2) {
                u10 = M0.s(n0Var);
            } else if (i12 == 3 && n0Var.o() != (q02 = Q0.INVARIANT) && !u10.a()) {
                u10 = new G0(q02, u10.getType());
            }
            if (u10 != e02) {
                z10 = true;
            }
            arrayList.add(u10);
        }
        return !z10 ? list2 : arrayList;
    }

    private E0 u(E0 e02, n0 n0Var, int i10) {
        if (e02 == null) {
            a(18);
        }
        b(i10, e02, this.f147824a);
        if (e02.a()) {
            return e02;
        }
        C18096U type = e02.getType();
        if (type instanceof N0) {
            N0 n02 = (N0) type;
            P0 H02 = n02.H0();
            C18096U j02 = n02.j0();
            E0 u10 = u(new G0(e02.c(), H02), n0Var, i10 + 1);
            if (u10.a()) {
                return u10;
            }
            return new G0(u10.c(), O0.d(u10.getType().Q0(), p(j02, e02.c())));
        }
        if (!C18083G.a(type) && !(type.Q0() instanceof C18111e0)) {
            E0 e10 = this.f147824a.e(type);
            E0 l10 = e10 != null ? l(type, e10, n0Var, e02) : null;
            Q0 c10 = e02.c();
            if (l10 == null && C18090N.b(type) && !w0.b(type)) {
                C18087K a10 = C18090N.a(type);
                int i11 = i10 + 1;
                E0 u11 = u(new G0(c10, a10.V0()), n0Var, i11);
                E0 u12 = u(new G0(c10, a10.W0()), n0Var, i11);
                return (u11.getType() == a10.V0() && u12.getType() == a10.W0()) ? e02 : new G0(u11.c(), C18099X.e(I0.a(u11.getType()), I0.a(u12.getType())));
            } else if (!C15429j.o0(type) && !C18100Y.a(type)) {
                if (l10 != null) {
                    d e11 = e(c10, l10.c());
                    if (!C17334e.f(type)) {
                        int i12 = b.f147825a[e11.ordinal()];
                        if (i12 == 1) {
                            throw new c("Out-projection in in-position");
                        } else if (i12 == 2) {
                            return new G0(Q0.OUT_VARIANCE, type.N0().p().J());
                        }
                    }
                    C18143x a11 = w0.a(type);
                    if (l10.a()) {
                        return l10;
                    }
                    C18096U S10 = a11 != null ? a11.S(l10.getType()) : M0.q(l10.getType(), type.O0());
                    if (!type.getAnnotations().isEmpty()) {
                        S10 = C18755d.C(S10, new C15656o(S10.getAnnotations(), i(this.f147824a.d(type.getAnnotations()))));
                    }
                    if (e11 == d.NO_CONFLICT) {
                        c10 = d(c10, l10.c());
                    }
                    return new G0(c10, S10);
                }
                e02 = r(e02, i10);
                if (e02 == null) {
                    a(25);
                }
            }
        }
        return e02;
    }

    public H0 j() {
        H0 h02 = this.f147824a;
        if (h02 == null) {
            a(8);
        }
        return h02;
    }

    public boolean k() {
        return this.f147824a.f();
    }

    public J0 m() {
        H0 h02 = this.f147824a;
        return (!(h02 instanceof C18091O) || !h02.b()) ? this : new J0(new C18091O(((C18091O) this.f147824a).j(), ((C18091O) this.f147824a).i(), false));
    }

    public C18096U n(C18096U u10, Q0 q02) {
        if (u10 == null) {
            a(9);
        }
        if (q02 == null) {
            a(10);
        }
        if (k()) {
            if (u10 == null) {
                a(11);
            }
            return u10;
        }
        try {
            C18096U type = u(new G0(q02, u10), (n0) null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e10) {
            C18227i d10 = C18230l.d(C18229k.UNABLE_TO_SUBSTITUTE_TYPE, e10.getMessage());
            if (d10 == null) {
                a(13);
            }
            return d10;
        }
    }

    public C18096U p(C18096U u10, Q0 q02) {
        if (u10 == null) {
            a(14);
        }
        if (q02 == null) {
            a(15);
        }
        E0 q10 = q(new G0(q02, j().g(u10, q02)));
        if (q10 == null) {
            return null;
        }
        return q10.getType();
    }

    public E0 q(E0 e02) {
        if (e02 == null) {
            a(16);
        }
        E0 t10 = t(e02);
        return (this.f147824a.a() || this.f147824a.b()) ? C15442c.d(t10, this.f147824a.b()) : t10;
    }

    public E0 t(E0 e02) {
        if (e02 == null) {
            a(17);
        }
        if (k()) {
            return e02;
        }
        try {
            return u(e02, (n0) null, 0);
        } catch (c unused) {
            return null;
        }
    }
}
