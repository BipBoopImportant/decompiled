package AI;

import AI.C15435p;
import BI.C15463a;
import DI.C15538I;
import DI.C15544O;
import DI.C15551W;
import DI.C15558e;
import DI.C15561h;
import DI.C15566m;
import DI.C15572s;
import DI.C15578y;
import DI.a0;
import DI.b0;
import DI.c0;
import EI.C15649h;
import FI.C15685a;
import FI.C15686b;
import FI.C15687c;
import GI.C15712F;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17067d;
import cJ.C17069f;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import d9.M;
import dJ.C17171a;
import gJ.C17278i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kJ.C17506e;
import nI.C17631a;
import nI.C17642l;
import nJ.C17656k;
import org.maplibre.android.log.Logger;
import tJ.C17987g;
import tJ.C17989i;
import tJ.C17994n;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18113f0;
import uJ.G0;
import uJ.M0;
import uJ.Q0;
import uJ.v0;
import uJ.y0;

/* renamed from: AI.j  reason: case insensitive filesystem */
public abstract class C15429j {

    /* renamed from: g  reason: collision with root package name */
    public static final C17069f f132984g = C17069f.D("<built-ins module>");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public C15712F f132985a;

    /* renamed from: b  reason: collision with root package name */
    private C17989i<C15712F> f132986b;

    /* renamed from: c  reason: collision with root package name */
    private final C17989i<e> f132987c;

    /* renamed from: d  reason: collision with root package name */
    private final C17989i<Collection<C15551W>> f132988d;

    /* renamed from: e  reason: collision with root package name */
    private final C17987g<C17069f, C15558e> f132989e;

    /* renamed from: f  reason: collision with root package name */
    private final C17994n f132990f;

    /* renamed from: AI.j$a */
    class a implements C17631a<Collection<C15551W>> {
        a() {
        }

        /* renamed from: a */
        public Collection<C15551W> invoke() {
            return Arrays.asList(new C15551W[]{C15429j.this.s().v0(C15435p.f133015A), C15429j.this.s().v0(C15435p.f133017C), C15429j.this.s().v0(C15435p.f133018D), C15429j.this.s().v0(C15435p.f133016B)});
        }
    }

    /* renamed from: AI.j$b */
    class b implements C17631a<e> {
        b() {
        }

        /* renamed from: a */
        public e invoke() {
            EnumMap enumMap = new EnumMap(C15432m.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (C15432m mVar : C15432m.values()) {
                C18113f0 b10 = C15429j.this.r(mVar.C().b());
                C18113f0 b11 = C15429j.this.r(mVar.v().b());
                enumMap.put(mVar, b11);
                hashMap.put(b10, b11);
                hashMap2.put(b11, b10);
            }
            return new e(enumMap, hashMap, hashMap2, (a) null);
        }
    }

    /* renamed from: AI.j$c */
    class c implements C17642l<C17069f, C15558e> {
        c() {
        }

        /* renamed from: a */
        public C15558e invoke(C17069f fVar) {
            C15561h e10 = C15429j.this.t().e(fVar, LI.d.FROM_BUILTINS);
            if (e10 == null) {
                throw new AssertionError("Built-in class " + C15435p.f133015A.b(fVar) + " is not found");
            } else if (e10 instanceof C15558e) {
                return (C15558e) e10;
            } else {
                throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + e10);
            }
        }
    }

    /* renamed from: AI.j$d */
    class d implements C17631a<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15712F f132994a;

        d(C15712F f10) {
            this.f132994a = f10;
        }

        /* renamed from: a */
        public Void invoke() {
            if (C15429j.this.f132985a == null) {
                C15712F unused = C15429j.this.f132985a = this.f132994a;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + C15429j.this.f132985a + " (attempting to reset to " + this.f132994a + ")");
        }
    }

    /* renamed from: AI.j$e */
    private static class e {

        /* renamed from: a  reason: collision with root package name */
        public final Map<C15432m, C18113f0> f132996a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<C18096U, C18113f0> f132997b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<C18113f0, C18113f0> f132998c;

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i10 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private e(Map<C15432m, C18113f0> map, Map<C18096U, C18113f0> map2, Map<C18113f0, C18113f0> map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f132996a = map;
            this.f132997b = map2;
            this.f132998c = map3;
        }
    }

    protected C15429j(C17994n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f132990f = nVar;
        this.f132988d = nVar.d(new a());
        this.f132987c = nVar.d(new b());
        this.f132989e = nVar.g(new c());
    }

    public static boolean A0(C18096U u10) {
        if (u10 == null) {
            a(131);
        }
        return j0(u10, C15435p.a.f133070K0.i());
    }

    private static C18096U B(C18096U u10, C15538I i10) {
        C17065b n10;
        C17065b a10;
        C15558e b10;
        if (u10 == null) {
            a(71);
        }
        if (i10 == null) {
            a(72);
        }
        C15561h e10 = u10.N0().e();
        if (e10 == null) {
            return null;
        }
        C15439t tVar = C15439t.f133143a;
        if (!tVar.b(e10.getName()) || (n10 = C17506e.n(e10)) == null || (a10 = tVar.a(n10)) == null || (b10 = C15578y.b(i10, a10)) == null) {
            return null;
        }
        return b10.r();
    }

    public static boolean B0(C18096U u10) {
        if (u10 == null) {
            a(129);
        }
        return j0(u10, C15435p.a.f133066I0.i());
    }

    public static boolean C0(C15566m mVar) {
        if (mVar == null) {
            a(10);
        }
        while (mVar != null) {
            if (mVar instanceof C15544O) {
                return ((C15544O) mVar).f().h(C15435p.f133048z);
            }
            mVar = mVar.b();
        }
        return false;
    }

    public static boolean D0(C18096U u10) {
        if (u10 == null) {
            a(142);
        }
        return n0(u10, C15435p.a.f133100f);
    }

    public static boolean E0(C18096U u10) {
        if (u10 == null) {
            a(132);
        }
        return y0(u10) || B0(u10) || z0(u10) || A0(u10);
    }

    public static C15432m O(C18096U u10) {
        if (u10 == null) {
            a(92);
        }
        C15561h e10 = u10.N0().e();
        if (e10 == null) {
            return null;
        }
        return Q(e10);
    }

    public static C15432m Q(C15566m mVar) {
        if (mVar == null) {
            a(77);
        }
        if (C15435p.a.f133074M0.contains(mVar.getName())) {
            return C15435p.a.f133078O0.get(C17278i.m(mVar));
        }
        return null;
    }

    private C15558e R(C15432m mVar) {
        if (mVar == null) {
            a(16);
        }
        return q(mVar.C().b());
    }

    public static C15432m T(C15566m mVar) {
        if (mVar == null) {
            a(76);
        }
        if (C15435p.a.f133072L0.contains(mVar.getName())) {
            return C15435p.a.f133076N0.get(C17278i.m(mVar));
        }
        return null;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        int i12 = i10;
        if (!(i12 == 11 || i12 == 13 || i12 == 15 || i12 == 69 || i12 == 74 || i12 == 81 || i12 == 84 || i12 == 86 || i12 == 87)) {
            switch (i12) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i12) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                        case BuildConfig.MIN_SDK_VERSION:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case BuildConfig.TARGET_SDK_VERSION:
                        case 34:
                        case ImageFormat.YUV_420_888:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i12) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i12) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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
        if (!(i12 == 11 || i12 == 13 || i12 == 15 || i12 == 69 || i12 == 74 || i12 == 81 || i12 == 84 || i12 == 86 || i12 == 87)) {
            switch (i12) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i12) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                        case BuildConfig.MIN_SDK_VERSION:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case BuildConfig.TARGET_SDK_VERSION:
                        case 34:
                        case ImageFormat.YUV_420_888:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i12) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i12) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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
        switch (i12) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case BuildConfig.TARGET_SDK_VERSION:
            case 34:
            case ImageFormat.YUV_420_888:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case CheckoutActivity.RESULT_OK:
            case CheckoutActivity.RESULT_ERROR:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case Logger.NONE /*99*/:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case ModuleDescriptor.MODULE_VERSION:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case 70:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case CheckoutActivity.RESULT_CANCELED:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i12 == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i12 == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i12 == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i12 == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i12 == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i12 == 81 || i12 == 84) {
            objArr[1] = "getArrayType";
        } else if (i12 == 86) {
            objArr[1] = "getEnumType";
        } else if (i12 != 87) {
            switch (i12) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i12) {
                        case 18:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case 19:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                            objArr[1] = "getKCallable";
                            break;
                        case BuildConfig.MIN_SDK_VERSION:
                            objArr[1] = "getKProperty";
                            break;
                        case 25:
                            objArr[1] = "getKProperty0";
                            break;
                        case 26:
                            objArr[1] = "getKProperty1";
                            break;
                        case 27:
                            objArr[1] = "getKProperty2";
                            break;
                        case 28:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case 29:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case 30:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case 31:
                            objArr[1] = "getIterator";
                            break;
                        case 32:
                            objArr[1] = "getIterable";
                            break;
                        case BuildConfig.TARGET_SDK_VERSION:
                            objArr[1] = "getMutableIterable";
                            break;
                        case 34:
                            objArr[1] = "getMutableIterator";
                            break;
                        case ImageFormat.YUV_420_888:
                            objArr[1] = "getCollection";
                            break;
                        case 36:
                            objArr[1] = "getMutableCollection";
                            break;
                        case 37:
                            objArr[1] = "getList";
                            break;
                        case 38:
                            objArr[1] = "getMutableList";
                            break;
                        case 39:
                            objArr[1] = "getSet";
                            break;
                        case 40:
                            objArr[1] = "getMutableSet";
                            break;
                        case 41:
                            objArr[1] = "getMap";
                            break;
                        case 42:
                            objArr[1] = "getMutableMap";
                            break;
                        case 43:
                            objArr[1] = "getMapEntry";
                            break;
                        case 44:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case 45:
                            objArr[1] = "getListIterator";
                            break;
                        case 46:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i12) {
                                case 48:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case 49:
                                    objArr[1] = "getNothingType";
                                    break;
                                case 50:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case 51:
                                    objArr[1] = "getAnyType";
                                    break;
                                case 52:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case 53:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i12) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case 58:
                                            objArr[1] = "getShortType";
                                            break;
                                        case 59:
                                            objArr[1] = "getIntType";
                                            break;
                                        case 60:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case 64:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case 67:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                            }
                    }
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i12) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case BuildConfig.TARGET_SDK_VERSION:
            case 34:
            case ImageFormat.YUV_420_888:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case Logger.NONE /*99*/:
            case CheckoutActivity.RESULT_OK:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case CheckoutActivity.RESULT_CANCELED:
            case CheckoutActivity.RESULT_ERROR:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case ModuleDescriptor.MODULE_VERSION:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i12 == 11 || i12 == 13 || i12 == 15 || i12 == 69 || i12 == 74 || i12 == 81 || i12 == 84 || i12 == 86 || i12 == 87)) {
            switch (i12) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i12) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                        case BuildConfig.MIN_SDK_VERSION:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case BuildConfig.TARGET_SDK_VERSION:
                        case 34:
                        case ImageFormat.YUV_420_888:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i12) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i12) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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

    public static boolean b0(C15558e eVar) {
        if (eVar == null) {
            a(108);
        }
        return e(eVar, C15435p.a.f133092b);
    }

    public static boolean c0(C18096U u10) {
        if (u10 == null) {
            a(139);
        }
        return i0(u10, C15435p.a.f133092b);
    }

    public static boolean d0(C18096U u10) {
        if (u10 == null) {
            a(88);
        }
        return i0(u10, C15435p.a.f133106i);
    }

    private static boolean e(C15561h hVar, C17067d dVar) {
        if (hVar == null) {
            a(103);
        }
        if (dVar == null) {
            a(104);
        }
        return hVar.getName().equals(dVar.j()) && dVar.equals(C17278i.m(hVar));
    }

    public static boolean e0(C15558e eVar) {
        if (eVar == null) {
            a(89);
        }
        return e(eVar, C15435p.a.f133106i) || Q(eVar) != null;
    }

    public static boolean f0(C18096U u10) {
        if (u10 == null) {
            a(90);
        }
        return d0(u10) || r0(u10);
    }

    public static boolean g0(C18096U u10) {
        if (u10 == null) {
            a(110);
        }
        return j0(u10, C15435p.a.f133108j);
    }

    public static boolean h0(C15566m mVar) {
        if (mVar == null) {
            a(9);
        }
        return C17278i.r(mVar, C15422c.class, false) != null;
    }

    private static boolean i0(C18096U u10, C17067d dVar) {
        if (u10 == null) {
            a(97);
        }
        if (dVar == null) {
            a(98);
        }
        return x0(u10.N0(), dVar);
    }

    private static boolean j0(C18096U u10, C17067d dVar) {
        if (u10 == null) {
            a(134);
        }
        if (dVar == null) {
            a(135);
        }
        return i0(u10, dVar) && !u10.O0();
    }

    public static boolean k0(C18096U u10) {
        if (u10 == null) {
            a(141);
        }
        return q0(u10);
    }

    public static boolean l0(C15566m mVar) {
        if (mVar == null) {
            a(161);
        }
        if (mVar.a().getAnnotations().f2(C15435p.a.f133138y)) {
            return true;
        }
        if (!(mVar instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) mVar;
        boolean N10 = a0Var.N();
        b0 d10 = a0Var.d();
        c0 g10 = a0Var.g();
        if (d10 != null && l0(d10)) {
            if (!N10) {
                return true;
            }
            if (g10 != null && l0(g10)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m0(C15558e eVar) {
        if (eVar == null) {
            a(158);
        }
        return e(eVar, C15435p.a.f133113l0);
    }

    private static boolean n0(C18096U u10, C17067d dVar) {
        if (u10 == null) {
            a(105);
        }
        if (dVar == null) {
            a(106);
        }
        return !u10.O0() && i0(u10, dVar);
    }

    public static boolean o0(C18096U u10) {
        if (u10 == null) {
            a(ModuleDescriptor.MODULE_VERSION);
        }
        return p0(u10) && !M0.l(u10);
    }

    public static boolean p0(C18096U u10) {
        if (u10 == null) {
            a(138);
        }
        return i0(u10, C15435p.a.f133094c);
    }

    private C15558e q(String str) {
        if (str == null) {
            a(14);
        }
        C15558e invoke = this.f132989e.invoke(C17069f.v(str));
        if (invoke == null) {
            a(15);
        }
        return invoke;
    }

    public static boolean q0(C18096U u10) {
        if (u10 == null) {
            a(140);
        }
        return c0(u10) && u10.O0();
    }

    /* access modifiers changed from: private */
    public C18113f0 r(String str) {
        if (str == null) {
            a(47);
        }
        C18113f0 r10 = q(str).r();
        if (r10 == null) {
            a(48);
        }
        return r10;
    }

    public static boolean r0(C18096U u10) {
        if (u10 == null) {
            a(91);
        }
        C15561h e10 = u10.N0().e();
        return (e10 == null || Q(e10) == null) ? false : true;
    }

    public static boolean s0(C15558e eVar) {
        if (eVar == null) {
            a(96);
        }
        return T(eVar) != null;
    }

    public static boolean t0(C18096U u10) {
        if (u10 == null) {
            a(94);
        }
        return !u10.O0() && u0(u10);
    }

    public static boolean u0(C18096U u10) {
        if (u10 == null) {
            a(95);
        }
        C15561h e10 = u10.N0().e();
        return (e10 instanceof C15558e) && s0((C15558e) e10);
    }

    public static boolean v0(C15558e eVar) {
        if (eVar == null) {
            a(107);
        }
        return e(eVar, C15435p.a.f133092b) || e(eVar, C15435p.a.f133094c);
    }

    public static boolean w0(C18096U u10) {
        return u10 != null && n0(u10, C15435p.a.f133104h);
    }

    public static boolean x0(y0 y0Var, C17067d dVar) {
        if (y0Var == null) {
            a(CheckoutActivity.RESULT_CANCELED);
        }
        if (dVar == null) {
            a(CheckoutActivity.RESULT_ERROR);
        }
        C15561h e10 = y0Var.e();
        return (e10 instanceof C15558e) && e(e10, dVar);
    }

    public static boolean y0(C18096U u10) {
        if (u10 == null) {
            a(128);
        }
        return j0(u10, C15435p.a.f133064H0.i());
    }

    public static boolean z0(C18096U u10) {
        if (u10 == null) {
            a(130);
        }
        return j0(u10, C15435p.a.f133068J0.i());
    }

    public C18113f0 A() {
        C18113f0 S10 = S(C15432m.DOUBLE);
        if (S10 == null) {
            a(62);
        }
        return S10;
    }

    public C18113f0 C() {
        C18113f0 S10 = S(C15432m.FLOAT);
        if (S10 == null) {
            a(61);
        }
        return S10;
    }

    public C15558e D(int i10) {
        return q(C15435p.b(i10));
    }

    public C18113f0 E() {
        C18113f0 S10 = S(C15432m.INT);
        if (S10 == null) {
            a(59);
        }
        return S10;
    }

    public C15558e F() {
        C15558e p10 = p(C15435p.a.f133113l0.m());
        if (p10 == null) {
            a(21);
        }
        return p10;
    }

    public void F0(C15712F f10) {
        if (f10 == null) {
            a(1);
        }
        this.f132990f.c(new d(f10));
    }

    public C18113f0 G() {
        C18113f0 S10 = S(C15432m.LONG);
        if (S10 == null) {
            a(60);
        }
        return S10;
    }

    public C15558e H() {
        return q("Nothing");
    }

    public C18113f0 I() {
        C18113f0 r10 = H().r();
        if (r10 == null) {
            a(49);
        }
        return r10;
    }

    public C18113f0 J() {
        C18113f0 U02 = i().U0(true);
        if (U02 == null) {
            a(52);
        }
        return U02;
    }

    public C18113f0 K() {
        C18113f0 U02 = I().U0(true);
        if (U02 == null) {
            a(50);
        }
        return U02;
    }

    public C15558e L() {
        return q("Number");
    }

    public C18113f0 M() {
        C18113f0 r10 = L().r();
        if (r10 == null) {
            a(56);
        }
        return r10;
    }

    /* access modifiers changed from: protected */
    public C15687c N() {
        C15687c.b bVar = C15687c.b.f134403a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    public C18113f0 P(C15432m mVar) {
        if (mVar == null) {
            a(73);
        }
        C18113f0 f0Var = ((e) this.f132987c.invoke()).f132996a.get(mVar);
        if (f0Var == null) {
            a(74);
        }
        return f0Var;
    }

    public C18113f0 S(C15432m mVar) {
        if (mVar == null) {
            a(54);
        }
        C18113f0 r10 = R(mVar).r();
        if (r10 == null) {
            a(55);
        }
        return r10;
    }

    public C18113f0 U() {
        C18113f0 S10 = S(C15432m.SHORT);
        if (S10 == null) {
            a(58);
        }
        return S10;
    }

    /* access modifiers changed from: protected */
    public C17994n V() {
        C17994n nVar = this.f132990f;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    public C15558e W() {
        return q("String");
    }

    public C18113f0 X() {
        C18113f0 r10 = W().r();
        if (r10 == null) {
            a(66);
        }
        return r10;
    }

    public C15558e Y(int i10) {
        C15558e p10 = p(C15435p.f133041s.b(C17069f.v(C15435p.d(i10))));
        if (p10 == null) {
            a(18);
        }
        return p10;
    }

    public C15558e Z() {
        return q("Unit");
    }

    public C18113f0 a0() {
        C18113f0 r10 = Z().r();
        if (r10 == null) {
            a(65);
        }
        return r10;
    }

    /* access modifiers changed from: protected */
    public void f(boolean z10) {
        C15712F f10 = new C15712F(f132984g, this.f132990f, this, (C17171a) null);
        this.f132985a = f10;
        f10.O0(C15421b.f132976a.c().a(this.f132990f, this.f132985a, w(), N(), g(), z10));
        C15712F f11 = this.f132985a;
        f11.W0(f11);
    }

    /* access modifiers changed from: protected */
    public C15685a g() {
        C15685a.C3308a aVar = C15685a.C3308a.f134401a;
        if (aVar == null) {
            a(3);
        }
        return aVar;
    }

    public C15558e h() {
        return q("Any");
    }

    public C18113f0 i() {
        C18113f0 r10 = h().r();
        if (r10 == null) {
            a(51);
        }
        return r10;
    }

    public C15558e j() {
        return q("Array");
    }

    public C18096U k(C18096U u10) {
        if (u10 == null) {
            a(68);
        }
        C18096U l10 = l(u10);
        if (l10 != null) {
            return l10;
        }
        throw new IllegalStateException("not array: " + u10);
    }

    public C18096U l(C18096U u10) {
        C18096U B10;
        if (u10 == null) {
            a(70);
        }
        if (!d0(u10)) {
            C18096U n10 = M0.n(u10);
            C18096U u11 = ((e) this.f132987c.invoke()).f132998c.get(n10);
            if (u11 != null) {
                return u11;
            }
            C15538I i10 = C17278i.i(n10);
            if (i10 == null || (B10 = B(n10, i10)) == null) {
                return null;
            }
            return B10;
        } else if (u10.L0().size() != 1) {
            return null;
        } else {
            return u10.L0().get(0).getType();
        }
    }

    public C18113f0 m(Q0 q02, C18096U u10) {
        if (q02 == null) {
            a(82);
        }
        if (u10 == null) {
            a(83);
        }
        C18113f0 n10 = n(q02, u10, C15649h.f134231V.b());
        if (n10 == null) {
            a(84);
        }
        return n10;
    }

    public C18113f0 n(Q0 q02, C18096U u10, C15649h hVar) {
        if (q02 == null) {
            a(78);
        }
        if (u10 == null) {
            a(79);
        }
        if (hVar == null) {
            a(80);
        }
        C18113f0 h10 = C18099X.h(v0.b(hVar), j(), Collections.singletonList(new G0(q02, u10)));
        if (h10 == null) {
            a(81);
        }
        return h10;
    }

    public C18113f0 o() {
        C18113f0 S10 = S(C15432m.BOOLEAN);
        if (S10 == null) {
            a(64);
        }
        return S10;
    }

    public C15558e p(C17066c cVar) {
        if (cVar == null) {
            a(12);
        }
        C15558e d10 = C15572s.d(s(), cVar, LI.d.FROM_BUILTINS);
        if (d10 == null) {
            a(13);
        }
        return d10;
    }

    public C15712F s() {
        if (this.f132985a == null) {
            this.f132985a = (C15712F) this.f132986b.invoke();
        }
        C15712F f10 = this.f132985a;
        if (f10 == null) {
            a(7);
        }
        return f10;
    }

    public C17656k t() {
        C17656k q10 = s().v0(C15435p.f133015A).q();
        if (q10 == null) {
            a(11);
        }
        return q10;
    }

    public C18113f0 u() {
        C18113f0 S10 = S(C15432m.BYTE);
        if (S10 == null) {
            a(57);
        }
        return S10;
    }

    public C18113f0 v() {
        C18113f0 S10 = S(C15432m.CHAR);
        if (S10 == null) {
            a(63);
        }
        return S10;
    }

    /* access modifiers changed from: protected */
    public Iterable<C15686b> w() {
        List singletonList = Collections.singletonList(new C15463a(this.f132990f, s()));
        if (singletonList == null) {
            a(5);
        }
        return singletonList;
    }

    public C15558e x() {
        C15558e p10 = p(C15435p.a.f133087X);
        if (p10 == null) {
            a(35);
        }
        return p10;
    }

    public C15558e y() {
        return q("Comparable");
    }

    public C18113f0 z() {
        C18113f0 J10 = J();
        if (J10 == null) {
            a(53);
        }
        return J10;
    }
}
