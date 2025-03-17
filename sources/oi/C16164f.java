package OI;

import AI.C15429j;
import DI.C15535F;
import DI.C15554a;
import DI.C15555b;
import DI.C15563j;
import DI.C15566m;
import DI.C15574u;
import DI.a0;
import DI.c0;
import DI.i0;
import EI.C15649h;
import GI.C15717K;
import GI.C15718L;
import GI.C15719M;
import UI.s0;
import XH.v;
import YH.C16877v;
import cJ.C17069f;
import gJ.C17277h;
import iJ.C17373g;
import java.util.List;
import nI.C17631a;
import tJ.C17990j;
import uJ.C18096U;

/* renamed from: OI.f  reason: case insensitive filesystem */
public class C16164f extends C15717K implements C16159a {

    /* renamed from: C  reason: collision with root package name */
    private final boolean f136915C;

    /* renamed from: D  reason: collision with root package name */
    private final v<C15554a.C3296a<?>, ?> f136916D;

    /* renamed from: E  reason: collision with root package name */
    private C18096U f136917E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C16164f(C15566m mVar, C15649h hVar, C15535F f10, C15574u uVar, boolean z10, C17069f fVar, i0 i0Var, a0 a0Var, C15555b.a aVar, boolean z11, v<C15554a.C3296a<?>, ?> vVar) {
        super(mVar, a0Var, hVar, f10, uVar, z10, fVar, aVar, i0Var, false, false, false, false, false, false);
        if (mVar == null) {
            S(0);
        }
        if (hVar == null) {
            S(1);
        }
        if (f10 == null) {
            S(2);
        }
        if (uVar == null) {
            S(3);
        }
        if (fVar == null) {
            S(4);
        }
        if (i0Var == null) {
            S(5);
        }
        if (aVar == null) {
            S(6);
        }
        this.f136917E = null;
        this.f136915C = z11;
        this.f136916D = vVar;
    }

    private static /* synthetic */ void S(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 != 21 ? 3 : 2)];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw (i10 != 21 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public static C16164f f1(C15566m mVar, C15649h hVar, C15535F f10, C15574u uVar, boolean z10, C17069f fVar, i0 i0Var, boolean z11) {
        if (mVar == null) {
            S(7);
        }
        if (hVar == null) {
            S(8);
        }
        if (f10 == null) {
            S(9);
        }
        if (uVar == null) {
            S(10);
        }
        if (fVar == null) {
            S(11);
        }
        if (i0Var == null) {
            S(12);
        }
        return new C16164f(mVar, hVar, f10, uVar, z10, fVar, i0Var, (a0) null, C15555b.a.DECLARATION, z11, (v<C15554a.C3296a<?>, ?>) null);
    }

    /* access modifiers changed from: protected */
    public C15717K P0(C15566m mVar, C15535F f10, C15574u uVar, a0 a0Var, C15555b.a aVar, C17069f fVar, i0 i0Var) {
        if (mVar == null) {
            S(13);
        }
        if (f10 == null) {
            S(14);
        }
        if (uVar == null) {
            S(15);
        }
        if (aVar == null) {
            S(16);
        }
        if (fVar == null) {
            S(17);
        }
        if (i0Var == null) {
            S(18);
        }
        return new C16164f(mVar, getAnnotations(), f10, uVar, N(), fVar, i0Var, a0Var, aVar, this.f136915C, this.f136916D);
    }

    public <V> V T(C15554a.C3296a<V> aVar) {
        v<C15554a.C3296a<?>, ?> vVar = this.f136916D;
        if (vVar == null || !vVar.c().equals(aVar)) {
            return null;
        }
        return this.f136916D.d();
    }

    public void Z0(C18096U u10) {
        if (u10 == null) {
            S(22);
        }
        this.f136917E = u10;
    }

    public boolean c0() {
        C18096U type = getType();
        return this.f136915C && C15563j.a(type) && (!s0.i(type) || C15429j.w0(type));
    }

    public boolean i0() {
        return false;
    }

    public C16159a n0(C18096U u10, List<C18096U> list, C18096U u11, v<C15554a.C3296a<?>, ?> vVar) {
        C15718L l10;
        C15719M m10;
        C18096U u12 = u10;
        C18096U u13 = u11;
        if (list == null) {
            S(19);
        }
        if (u13 == null) {
            S(20);
        }
        a0 a10 = a() == this ? null : a();
        C16164f fVar = r5;
        C16164f fVar2 = new C16164f(b(), getAnnotations(), u(), getVisibility(), N(), getName(), i(), a10, h(), this.f136915C, vVar);
        C15718L R02 = d();
        if (R02 != null) {
            l10 = r5;
            C15718L l11 = new C15718L(fVar, R02.getAnnotations(), R02.u(), R02.getVisibility(), R02.H(), R02.isExternal(), R02.isInline(), h(), a10 == null ? null : a10.d(), R02.i());
            l10.N0(R02.t0());
            l10.Q0(u13);
        } else {
            l10 = null;
        }
        c0 g10 = g();
        if (g10 != null) {
            C15719M m11 = r5;
            C15719M m12 = new C15719M(fVar, g10.getAnnotations(), g10.u(), g10.getVisibility(), g10.H(), g10.isExternal(), g10.isInline(), h(), a10 == null ? null : a10.g(), g10.i());
            C15719M m13 = m11;
            m13.N0(m11.t0());
            m13.R0(g10.j().get(0));
            m10 = m13;
        } else {
            m10 = null;
        }
        C16164f fVar3 = fVar;
        fVar3.V0(l10, m10, x0(), P());
        fVar3.a1(W0());
        C17631a<C17990j<C17373g<?>>> aVar = this.f134580h;
        if (aVar != null) {
            fVar3.K0(this.f134579g, aVar);
        }
        fVar3.E0(e());
        fVar3.b1(u11, getTypeParameters(), L(), u12 == null ? null : C17277h.i(this, u12, C15649h.f134231V.b()), C16877v.n());
        return fVar3;
    }
}
