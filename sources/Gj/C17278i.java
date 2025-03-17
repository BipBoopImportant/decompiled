package gJ;

import AI.C15429j;
import AI.C15439t;
import DI.C15535F;
import DI.C15538I;
import DI.C15544O;
import DI.C15551W;
import DI.C15554a;
import DI.C15555b;
import DI.C15558e;
import DI.C15559f;
import DI.C15561h;
import DI.C15566m;
import DI.C15569p;
import DI.C15570q;
import DI.C15573t;
import DI.C15574u;
import DI.c0;
import DI.d0;
import DI.j0;
import DI.v0;
import cJ.C17066c;
import cJ.C17067d;
import cJ.C17071h;
import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kJ.C17506e;
import uJ.C18096U;
import uJ.C18100Y;
import uJ.M0;
import uJ.y0;
import vJ.e;
import wJ.C18230l;

/* renamed from: gJ.i  reason: case insensitive filesystem */
public class C17278i {

    /* renamed from: a  reason: collision with root package name */
    public static final C17066c f143306a = new C17066c("kotlin.jvm.JvmName");

    public static boolean A(C15566m mVar) {
        return D(mVar, C15559f.ENUM_CLASS);
    }

    public static boolean B(C15566m mVar) {
        if (mVar == null) {
            a(36);
        }
        return D(mVar, C15559f.ENUM_ENTRY);
    }

    public static boolean C(C15566m mVar) {
        return D(mVar, C15559f.INTERFACE);
    }

    private static boolean D(C15566m mVar, C15559f fVar) {
        if (fVar == null) {
            a(37);
        }
        return (mVar instanceof C15558e) && ((C15558e) mVar).h() == fVar;
    }

    public static boolean E(C15566m mVar) {
        if (mVar == null) {
            a(1);
        }
        while (mVar != null) {
            if (u(mVar) || y(mVar)) {
                return true;
            }
            mVar = mVar.b();
        }
        return false;
    }

    private static boolean F(C18096U u10, C15566m mVar) {
        if (u10 == null) {
            a(30);
        }
        if (mVar == null) {
            a(31);
        }
        C15561h e10 = u10.N0().e();
        if (e10 == null) {
            return false;
        }
        C15566m a10 = e10.a();
        return (a10 instanceof C15561h) && (mVar instanceof C15561h) && ((C15561h) mVar).k().equals(((C15561h) a10).k());
    }

    public static boolean G(C15566m mVar) {
        return (D(mVar, C15559f.CLASS) || D(mVar, C15559f.INTERFACE)) && ((C15558e) mVar).u() == C15535F.SEALED;
    }

    public static boolean H(C15558e eVar, C15558e eVar2) {
        if (eVar == null) {
            a(28);
        }
        if (eVar2 == null) {
            a(29);
        }
        return I(eVar.r(), eVar2.a());
    }

    public static boolean I(C18096U u10, C15566m mVar) {
        if (u10 == null) {
            a(32);
        }
        if (mVar == null) {
            a(33);
        }
        if (F(u10, mVar)) {
            return true;
        }
        for (C18096U I10 : u10.N0().a()) {
            if (I(I10, mVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(C15566m mVar) {
        return mVar != null && (mVar.b() instanceof C15544O);
    }

    public static boolean K(v0 v0Var, C18096U u10) {
        if (v0Var == null) {
            a(66);
        }
        if (u10 == null) {
            a(67);
        }
        if (v0Var.N() || C18100Y.a(u10)) {
            return false;
        }
        if (M0.b(u10)) {
            return true;
        }
        C15429j m10 = C17506e.m(v0Var);
        if (!C15429j.t0(u10)) {
            e eVar = e.f149048a;
            if (!eVar.b(m10.X(), u10) && !eVar.b(m10.L().r(), u10) && !eVar.b(m10.i(), u10) && !C15439t.d(u10)) {
                return false;
            }
        }
        return true;
    }

    public static <D extends C15555b> D L(D d10) {
        if (d10 == null) {
            a(59);
        }
        while (d10.h() == C15555b.a.FAKE_OVERRIDE) {
            Collection e10 = d10.e();
            if (!e10.isEmpty()) {
                d10 = (C15555b) e10.iterator().next();
            } else {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d10);
            }
        }
        return d10;
    }

    public static <D extends C15570q> D M(D d10) {
        if (d10 == null) {
            a(64);
        }
        if (d10 instanceof C15555b) {
            return L((C15555b) d10);
        }
        if (d10 == null) {
            a(65);
        }
        return d10;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION:
            case 34:
            case ImageFormat.YUV_420_888:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case BuildConfig.TARGET_SDK_VERSION:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case BuildConfig.MIN_SDK_VERSION:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case BuildConfig.TARGET_SDK_VERSION:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case ImageFormat.YUV_420_888:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    public static boolean b(C15566m mVar, C15566m mVar2) {
        if (mVar == null) {
            a(16);
        }
        if (mVar2 == null) {
            a(17);
        }
        return g(mVar).equals(g(mVar2));
    }

    private static <D extends C15554a> void c(D d10, Set<D> set) {
        if (d10 == null) {
            a(73);
        }
        if (set == null) {
            a(74);
        }
        if (!set.contains(d10)) {
            for (C15554a a10 : d10.a().e()) {
                C15554a a11 = a10.a();
                c(a11, set);
                set.add(a11);
            }
        }
    }

    public static <D extends C15554a> Set<D> d(D d10) {
        if (d10 == null) {
            a(71);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(d10.a(), linkedHashSet);
        return linkedHashSet;
    }

    public static C15558e e(C18096U u10) {
        if (u10 == null) {
            a(45);
        }
        return f(u10.N0());
    }

    public static C15558e f(y0 y0Var) {
        if (y0Var == null) {
            a(46);
        }
        C15558e eVar = (C15558e) y0Var.e();
        if (eVar == null) {
            a(47);
        }
        return eVar;
    }

    public static C15538I g(C15566m mVar) {
        if (mVar == null) {
            a(21);
        }
        C15538I h10 = h(mVar);
        if (h10 == null) {
            a(22);
        }
        return h10;
    }

    public static C15538I h(C15566m mVar) {
        if (mVar == null) {
            a(23);
        }
        while (mVar != null) {
            if (mVar instanceof C15538I) {
                return (C15538I) mVar;
            }
            if (mVar instanceof C15551W) {
                return ((C15551W) mVar).C0();
            }
            mVar = mVar.b();
        }
        return null;
    }

    public static C15538I i(C18096U u10) {
        if (u10 == null) {
            a(20);
        }
        C15561h e10 = u10.N0().e();
        if (e10 == null) {
            return null;
        }
        return h(e10);
    }

    public static j0 j(C15566m mVar) {
        if (mVar == null) {
            a(82);
        }
        if (mVar instanceof c0) {
            mVar = ((c0) mVar).W();
        }
        if (mVar instanceof C15569p) {
            j0 b10 = ((C15569p) mVar).i().b();
            if (b10 == null) {
                a(83);
            }
            return b10;
        }
        j0 j0Var = j0.f133843a;
        if (j0Var == null) {
            a(84);
        }
        return j0Var;
    }

    public static C15574u k(C15558e eVar, boolean z10) {
        if (eVar == null) {
            a(48);
        }
        C15559f h10 = eVar.h();
        if (h10 == C15559f.ENUM_CLASS || h10.b()) {
            C15574u uVar = C15573t.f133849a;
            if (uVar == null) {
                a(49);
            }
            return uVar;
        } else if (G(eVar)) {
            if (z10) {
                C15574u uVar2 = C15573t.f133851c;
                if (uVar2 == null) {
                    a(50);
                }
                return uVar2;
            }
            C15574u uVar3 = C15573t.f133849a;
            if (uVar3 == null) {
                a(51);
            }
            return uVar3;
        } else if (u(eVar)) {
            C15574u uVar4 = C15573t.f133860l;
            if (uVar4 == null) {
                a(52);
            }
            return uVar4;
        } else {
            C15574u uVar5 = C15573t.f133853e;
            if (uVar5 == null) {
                a(53);
            }
            return uVar5;
        }
    }

    public static d0 l(C15566m mVar) {
        if (mVar == null) {
            a(0);
        }
        if (mVar instanceof C15558e) {
            return ((C15558e) mVar).J0();
        }
        return null;
    }

    public static C17067d m(C15566m mVar) {
        if (mVar == null) {
            a(2);
        }
        C17066c o10 = o(mVar);
        return o10 != null ? o10.i() : p(mVar);
    }

    public static C17066c n(C15566m mVar) {
        if (mVar == null) {
            a(3);
        }
        C17066c o10 = o(mVar);
        if (o10 == null) {
            o10 = p(mVar).m();
        }
        if (o10 == null) {
            a(4);
        }
        return o10;
    }

    private static C17066c o(C15566m mVar) {
        if (mVar == null) {
            a(5);
        }
        if ((mVar instanceof C15538I) || C18230l.m(mVar)) {
            return C17066c.f141246d;
        }
        if (mVar instanceof C15551W) {
            return ((C15551W) mVar).f();
        }
        if (mVar instanceof C15544O) {
            return ((C15544O) mVar).f();
        }
        return null;
    }

    private static C17067d p(C15566m mVar) {
        if (mVar == null) {
            a(6);
        }
        C17067d b10 = m(mVar.b()).b(mVar.getName());
        if (b10 == null) {
            a(7);
        }
        return b10;
    }

    public static <D extends C15566m> D q(C15566m mVar, Class<D> cls) {
        if (cls == null) {
            a(18);
        }
        return r(mVar, cls, true);
    }

    public static <D extends C15566m> D r(D d10, Class<D> cls, boolean z10) {
        if (cls == null) {
            a(19);
        }
        if (d10 == null) {
            return null;
        }
        if (z10) {
            d10 = d10.b();
        }
        while (d10 != null) {
            if (cls.isInstance(d10)) {
                return d10;
            }
            d10 = d10.b();
        }
        return null;
    }

    public static C15558e s(C15558e eVar) {
        if (eVar == null) {
            a(44);
        }
        for (C18096U e10 : eVar.k().a()) {
            C15558e e11 = e(e10);
            if (e11.h() != C15559f.INTERFACE) {
                return e11;
            }
        }
        return null;
    }

    public static boolean t(C15566m mVar) {
        return D(mVar, C15559f.ANNOTATION_CLASS);
    }

    public static boolean u(C15566m mVar) {
        if (mVar == null) {
            a(34);
        }
        return v(mVar) && mVar.getName().equals(C17071h.f141263b);
    }

    public static boolean v(C15566m mVar) {
        return D(mVar, C15559f.CLASS);
    }

    public static boolean w(C15566m mVar) {
        return v(mVar) || A(mVar);
    }

    public static boolean x(C15566m mVar) {
        return D(mVar, C15559f.OBJECT) && ((C15558e) mVar).b0();
    }

    public static boolean y(C15566m mVar) {
        return (mVar instanceof C15570q) && ((C15570q) mVar).getVisibility() == C15573t.f133854f;
    }

    public static boolean z(C15558e eVar, C15558e eVar2) {
        if (eVar == null) {
            a(26);
        }
        if (eVar2 == null) {
            a(27);
        }
        for (C18096U F10 : eVar.k().a()) {
            if (F(F10, eVar2.a())) {
                return true;
            }
        }
        return false;
    }
}
