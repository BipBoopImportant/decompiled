package gJ;

import AI.C15435p;
import DI.C15535F;
import DI.C15538I;
import DI.C15554a;
import DI.C15555b;
import DI.C15558e;
import DI.C15565l;
import DI.C15573t;
import DI.C15574u;
import DI.C15579z;
import DI.a0;
import DI.b0;
import DI.c0;
import DI.d0;
import DI.h0;
import DI.i0;
import EI.C15649h;
import GI.C15717K;
import GI.C15718L;
import GI.C15719M;
import GI.C15720N;
import GI.C15721O;
import GI.C15727V;
import GI.C15739i;
import cJ.C17069f;
import cJ.C17070g;
import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import java.util.Collections;
import kJ.C17506e;
import oJ.C17700b;
import oJ.C17701c;
import oJ.C17702d;
import oJ.C17705g;
import uJ.C18096U;
import uJ.C18099X;
import uJ.G0;
import uJ.Q0;
import uJ.u0;

/* renamed from: gJ.h  reason: case insensitive filesystem */
public class C17277h {

    /* renamed from: gJ.h$a */
    private static class a extends C15739i {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C15558e eVar, i0 i0Var, boolean z10) {
            super(eVar, (C15565l) null, C15649h.f134231V.b(), true, C15555b.a.DECLARATION, i0Var);
            if (eVar == null) {
                S(0);
            }
            if (i0Var == null) {
                S(1);
            }
            q1(Collections.emptyList(), C17278i.k(eVar, z10));
        }

        private static /* synthetic */ void S(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3)];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case BuildConfig.TARGET_SDK_VERSION:
            case ImageFormat.YUV_420_888:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case BuildConfig.MIN_SDK_VERSION:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
            default:
                objArr[0] = "propertyDescriptor";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case BuildConfig.MIN_SDK_VERSION:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case BuildConfig.TARGET_SDK_VERSION:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case ImageFormat.YUV_420_888:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i10 == 12 || i10 == 23 || i10 == 25) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static d0 b(C15554a aVar, C18096U u10, C17069f fVar, C15649h hVar, int i10) {
        if (aVar == null) {
            a(32);
        }
        if (hVar == null) {
            a(33);
        }
        if (u10 == null) {
            return null;
        }
        return new C15720N(aVar, new C17701c(aVar, u10, fVar, (C17705g) null), hVar, C17070g.a(i10));
    }

    public static d0 c(C15558e eVar, C18096U u10, C17069f fVar, C15649h hVar, int i10) {
        if (eVar == null) {
            a(34);
        }
        if (hVar == null) {
            a(35);
        }
        if (u10 == null) {
            return null;
        }
        return new C15720N(eVar, new C17700b(eVar, u10, fVar, (C17705g) null), hVar, C17070g.a(i10));
    }

    public static C15718L d(a0 a0Var, C15649h hVar) {
        if (a0Var == null) {
            a(13);
        }
        if (hVar == null) {
            a(14);
        }
        return j(a0Var, hVar, true, false, false);
    }

    public static C15719M e(a0 a0Var, C15649h hVar, C15649h hVar2) {
        if (a0Var == null) {
            a(0);
        }
        if (hVar == null) {
            a(1);
        }
        if (hVar2 == null) {
            a(2);
        }
        return n(a0Var, hVar, hVar2, true, false, false, a0Var.i());
    }

    public static a0 f(C15558e eVar) {
        if (eVar == null) {
            a(26);
        }
        C15538I g10 = C17278i.g(eVar);
        C15558e a10 = C17292w.a(g10).a(g10);
        if (a10 == null) {
            return null;
        }
        C15649h.a aVar = C15649h.f134231V;
        C15649h b10 = aVar.b();
        C15535F f10 = C15535F.FINAL;
        C15574u uVar = C15573t.f133853e;
        C17069f fVar = C15435p.f133027e;
        C15555b.a aVar2 = C15555b.a.SYNTHESIZED;
        C15717K O02 = C15717K.O0(eVar, b10, f10, uVar, false, fVar, aVar2, eVar.i(), false, false, false, false, false, false);
        C15718L l10 = new C15718L(O02, aVar.b(), f10, uVar, false, false, false, aVar2, (b0) null, eVar.i());
        O02.U0(l10, (c0) null);
        O02.b1(C18099X.i(u0.f147932b.k(), a10.k(), Collections.singletonList(new G0(eVar.r())), false), Collections.emptyList(), (d0) null, (d0) null, Collections.emptyList());
        l10.Q0(O02.getReturnType());
        return O02;
    }

    public static h0 g(C15558e eVar) {
        C15558e eVar2 = eVar;
        if (eVar2 == null) {
            a(24);
        }
        C15649h.a aVar = C15649h.f134231V;
        C15721O l12 = C15721O.l1(eVar2, aVar.b(), C15435p.f133028f, C15555b.a.SYNTHESIZED, eVar.i());
        C15721O o10 = l12;
        C15721O n12 = o10.R0((d0) null, (d0) null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new C15727V(l12, (DI.u0) null, 0, aVar.b(), C17069f.v("value"), C17506e.m(eVar).X(), false, false, false, (C18096U) null, eVar.i())), eVar.r(), C15535F.FINAL, C15573t.f133853e);
        if (n12 == null) {
            a(25);
        }
        return n12;
    }

    public static h0 h(C15558e eVar) {
        if (eVar == null) {
            a(22);
        }
        C15721O n12 = C15721O.l1(eVar, C15649h.f134231V.b(), C15435p.f133026d, C15555b.a.SYNTHESIZED, eVar.i()).R0((d0) null, (d0) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), C17506e.m(eVar).m(Q0.INVARIANT, eVar.r()), C15535F.FINAL, C15573t.f133853e);
        if (n12 == null) {
            a(23);
        }
        return n12;
    }

    public static d0 i(C15554a aVar, C18096U u10, C15649h hVar) {
        if (aVar == null) {
            a(30);
        }
        if (hVar == null) {
            a(31);
        }
        if (u10 == null) {
            return null;
        }
        return new C15720N(aVar, new C17702d(aVar, u10, (C17705g) null), hVar);
    }

    public static C15718L j(a0 a0Var, C15649h hVar, boolean z10, boolean z11, boolean z12) {
        if (a0Var == null) {
            a(15);
        }
        if (hVar == null) {
            a(16);
        }
        return k(a0Var, hVar, z10, z11, z12, a0Var.i());
    }

    public static C15718L k(a0 a0Var, C15649h hVar, boolean z10, boolean z11, boolean z12, i0 i0Var) {
        if (a0Var == null) {
            a(17);
        }
        if (hVar == null) {
            a(18);
        }
        if (i0Var == null) {
            a(19);
        }
        return new C15718L(a0Var, hVar, a0Var.u(), a0Var.getVisibility(), z10, z11, z12, C15555b.a.DECLARATION, (b0) null, i0Var);
    }

    public static C15739i l(C15558e eVar, i0 i0Var) {
        if (eVar == null) {
            a(20);
        }
        if (i0Var == null) {
            a(21);
        }
        return new a(eVar, i0Var, false);
    }

    public static C15719M m(a0 a0Var, C15649h hVar, C15649h hVar2, boolean z10, boolean z11, boolean z12, C15574u uVar, i0 i0Var) {
        C15649h hVar3 = hVar2;
        if (a0Var == null) {
            a(7);
        }
        if (hVar == null) {
            a(8);
        }
        if (hVar3 == null) {
            a(9);
        }
        if (uVar == null) {
            a(10);
        }
        if (i0Var == null) {
            a(11);
        }
        C15719M m10 = new C15719M(a0Var, hVar, a0Var.u(), uVar, z10, z11, z12, C15555b.a.DECLARATION, (c0) null, i0Var);
        m10.R0(C15719M.P0(m10, a0Var.getType(), hVar2));
        return m10;
    }

    public static C15719M n(a0 a0Var, C15649h hVar, C15649h hVar2, boolean z10, boolean z11, boolean z12, i0 i0Var) {
        if (a0Var == null) {
            a(3);
        }
        if (hVar == null) {
            a(4);
        }
        if (hVar2 == null) {
            a(5);
        }
        if (i0Var == null) {
            a(6);
        }
        return m(a0Var, hVar, hVar2, z10, z11, z12, a0Var.getVisibility(), i0Var);
    }

    private static boolean o(C15579z zVar) {
        if (zVar == null) {
            a(29);
        }
        return zVar.h() == C15555b.a.SYNTHESIZED && C17278i.A(zVar.b());
    }

    public static boolean p(C15579z zVar) {
        if (zVar == null) {
            a(28);
        }
        return zVar.getName().equals(C15435p.f133028f) && o(zVar);
    }

    public static boolean q(C15579z zVar) {
        if (zVar == null) {
            a(27);
        }
        return zVar.getName().equals(C15435p.f133026d) && o(zVar);
    }
}
