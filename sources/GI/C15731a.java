package GI;

import DI.C15558e;
import DI.C15561h;
import DI.C15568o;
import DI.d0;
import DI.m0;
import cJ.C17069f;
import gJ.C17278i;
import java.util.Collections;
import java.util.List;
import kJ.C17506e;
import nI.C17631a;
import nI.C17642l;
import nJ.C17652g;
import nJ.C17656k;
import nJ.C17665t;
import tJ.C17989i;
import tJ.C17994n;
import uJ.C18099X;
import uJ.C18113f0;
import uJ.H0;
import uJ.J0;
import uJ.M0;
import vJ.g;

/* renamed from: GI.a  reason: case insensitive filesystem */
public abstract class C15731a extends C15756z {

    /* renamed from: b  reason: collision with root package name */
    private final C17069f f134581b;

    /* renamed from: c  reason: collision with root package name */
    protected final C17989i<C18113f0> f134582c;

    /* renamed from: d  reason: collision with root package name */
    private final C17989i<C17656k> f134583d;

    /* renamed from: e  reason: collision with root package name */
    private final C17989i<d0> f134584e;

    /* renamed from: GI.a$a  reason: collision with other inner class name */
    class C3314a implements C17631a<C18113f0> {

        /* renamed from: GI.a$a$a  reason: collision with other inner class name */
        class C3315a implements C17642l<g, C18113f0> {
            C3315a() {
            }

            /* renamed from: a */
            public C18113f0 invoke(g gVar) {
                C15561h f10 = gVar.f(C15731a.this);
                return f10 == null ? (C18113f0) C15731a.this.f134582c.invoke() : f10 instanceof m0 ? C18099X.c((m0) f10, M0.g(f10.k().getParameters())) : f10 instanceof C15756z ? M0.v(f10.k().b(gVar), ((C15756z) f10).j0(gVar), this) : f10.r();
            }
        }

        C3314a() {
        }

        /* renamed from: a */
        public C18113f0 invoke() {
            C15731a aVar = C15731a.this;
            return M0.u(aVar, aVar.X(), new C3315a());
        }
    }

    /* renamed from: GI.a$b */
    class b implements C17631a<C17656k> {
        b() {
        }

        /* renamed from: a */
        public C17656k invoke() {
            return new C17652g(C15731a.this.X());
        }
    }

    /* renamed from: GI.a$c */
    class c implements C17631a<d0> {
        c() {
        }

        /* renamed from: a */
        public d0 invoke() {
            return new C15750t(C15731a.this);
        }
    }

    public C15731a(C17994n nVar, C17069f fVar) {
        if (nVar == null) {
            F0(0);
        }
        if (fVar == null) {
            F0(1);
        }
        this.f134581b = fVar;
        this.f134582c = nVar.d(new C3314a());
        this.f134583d = nVar.d(new b());
        this.f134584e = nVar.d(new c());
    }

    private static /* synthetic */ void F0(int i10) {
        int i11 = i10;
        String str = (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16 || i11 == 17 || i11 == 19 || i11 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16 || i11 == 17 || i11 == 19 || i11 == 20) ? 2 : 3)];
        switch (i11) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i11 == 2) {
            objArr[1] = "getName";
        } else if (i11 == 3) {
            objArr[1] = "getOriginal";
        } else if (i11 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i11 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i11 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i11 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i11 == 19) {
            objArr[1] = "substitute";
        } else if (i11 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i11) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16 || i11 == 17 || i11 == 19 || i11 == 20) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C17656k B(H0 h02) {
        if (h02 == null) {
            F0(15);
        }
        C17656k S10 = S(h02, C17506e.r(C17278i.g(this)));
        if (S10 == null) {
            F0(16);
        }
        return S10;
    }

    /* renamed from: H0 */
    public C15558e c(J0 j02) {
        if (j02 == null) {
            F0(18);
        }
        return j02.k() ? this : new C15755y(this, j02);
    }

    public d0 J0() {
        d0 d0Var = (d0) this.f134584e.invoke();
        if (d0Var == null) {
            F0(5);
        }
        return d0Var;
    }

    public C17656k S(H0 h02, g gVar) {
        if (h02 == null) {
            F0(10);
        }
        if (gVar == null) {
            F0(11);
        }
        if (h02.f()) {
            C17656k j02 = j0(gVar);
            if (j02 == null) {
                F0(12);
            }
            return j02;
        }
        return new C17665t(j0(gVar), J0.g(h02));
    }

    public C17656k U() {
        C17656k kVar = (C17656k) this.f134583d.invoke();
        if (kVar == null) {
            F0(4);
        }
        return kVar;
    }

    public C17656k X() {
        C17656k j02 = j0(C17506e.r(C17278i.g(this)));
        if (j02 == null) {
            F0(17);
        }
        return j02;
    }

    public List<d0> Z() {
        List<d0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            F0(6);
        }
        return emptyList;
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        return oVar.m(this, d10);
    }

    public C17069f getName() {
        C17069f fVar = this.f134581b;
        if (fVar == null) {
            F0(2);
        }
        return fVar;
    }

    public C18113f0 r() {
        C18113f0 f0Var = (C18113f0) this.f134582c.invoke();
        if (f0Var == null) {
            F0(20);
        }
        return f0Var;
    }

    public C15558e a() {
        return this;
    }
}
