package GI;

import AI.C15429j;
import DI.C15561h;
import DI.C15566m;
import DI.C15568o;
import DI.i0;
import DI.l0;
import DI.n0;
import EI.C15649h;
import cJ.C17069f;
import gJ.C17276g;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kJ.C17506e;
import nI.C17631a;
import nJ.C17654i;
import nJ.C17656k;
import nJ.C17669x;
import tJ.C17989i;
import tJ.C17994n;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18113f0;
import uJ.C18134q;
import uJ.Q0;
import uJ.u0;
import uJ.y0;
import wJ.C18229k;
import wJ.C18230l;

/* renamed from: GI.h  reason: case insensitive filesystem */
public abstract class C15738h extends C15744n implements n0 {

    /* renamed from: e  reason: collision with root package name */
    private final Q0 f134599e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f134600f;

    /* renamed from: g  reason: collision with root package name */
    private final int f134601g;

    /* renamed from: h  reason: collision with root package name */
    private final C17989i<y0> f134602h;

    /* renamed from: i  reason: collision with root package name */
    private final C17989i<C18113f0> f134603i;

    /* renamed from: j  reason: collision with root package name */
    private final C17994n f134604j;

    /* renamed from: GI.h$a */
    class a implements C17631a<y0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17994n f134605a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l0 f134606b;

        a(C17994n nVar, l0 l0Var) {
            this.f134605a = nVar;
            this.f134606b = l0Var;
        }

        /* renamed from: a */
        public y0 invoke() {
            return new c(C15738h.this, this.f134605a, this.f134606b);
        }
    }

    /* renamed from: GI.h$b */
    class b implements C17631a<C18113f0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17069f f134608a;

        /* renamed from: GI.h$b$a */
        class a implements C17631a<C17656k> {
            a() {
            }

            /* renamed from: a */
            public C17656k invoke() {
                return C17669x.m("Scope for type parameter " + b.this.f134608a.b(), C15738h.this.getUpperBounds());
            }
        }

        b(C17069f fVar) {
            this.f134608a = fVar;
        }

        /* renamed from: a */
        public C18113f0 invoke() {
            return C18099X.m(u0.f147932b.k(), C15738h.this.k(), Collections.emptyList(), false, new C17654i(new a()));
        }
    }

    /* renamed from: GI.h$c */
    private class c extends C18134q {

        /* renamed from: d  reason: collision with root package name */
        private final l0 f134611d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15738h f134612e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C15738h hVar, C17994n nVar, l0 l0Var) {
            super(nVar);
            if (nVar == null) {
                I(0);
            }
            this.f134612e = hVar;
            this.f134611d = l0Var;
        }

        private static /* synthetic */ void I(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3)];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* access modifiers changed from: protected */
        public void A(C18096U u10) {
            if (u10 == null) {
                I(6);
            }
            this.f134612e.K0(u10);
        }

        public C15561h e() {
            C15738h hVar = this.f134612e;
            if (hVar == null) {
                I(3);
            }
            return hVar;
        }

        public boolean f() {
            return true;
        }

        public List<n0> getParameters() {
            List<n0> emptyList = Collections.emptyList();
            if (emptyList == null) {
                I(2);
            }
            return emptyList;
        }

        /* access modifiers changed from: protected */
        public boolean i(C15561h hVar) {
            if (hVar == null) {
                I(9);
            }
            return (hVar instanceof n0) && C17276g.f143305a.m(this.f134612e, (n0) hVar, true);
        }

        public C15429j p() {
            C15429j m10 = C17506e.m(this.f134612e);
            if (m10 == null) {
                I(4);
            }
            return m10;
        }

        /* access modifiers changed from: protected */
        public Collection<C18096U> s() {
            List<C18096U> L02 = this.f134612e.L0();
            if (L02 == null) {
                I(1);
            }
            return L02;
        }

        /* access modifiers changed from: protected */
        public C18096U t() {
            return C18230l.d(C18229k.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        public String toString() {
            return this.f134612e.getName().toString();
        }

        /* access modifiers changed from: protected */
        public l0 w() {
            l0 l0Var = this.f134611d;
            if (l0Var == null) {
                I(5);
            }
            return l0Var;
        }

        /* access modifiers changed from: protected */
        public List<C18096U> y(List<C18096U> list) {
            if (list == null) {
                I(7);
            }
            List<C18096U> H02 = this.f134612e.H0(list);
            if (H02 == null) {
                I(8);
            }
            return H02;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C15738h(C17994n nVar, C15566m mVar, C15649h hVar, C17069f fVar, Q0 q02, boolean z10, int i10, i0 i0Var, l0 l0Var) {
        super(mVar, hVar, fVar, i0Var);
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
        this.f134599e = q02;
        this.f134600f = z10;
        this.f134601g = i10;
        this.f134602h = nVar.d(new a(nVar, l0Var));
        this.f134603i = nVar.d(new b(fVar));
        this.f134604j = nVar;
    }

    private static /* synthetic */ void S(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
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
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    public boolean A() {
        return this.f134600f;
    }

    /* access modifiers changed from: protected */
    public List<C18096U> H0(List<C18096U> list) {
        if (list == null) {
            S(12);
        }
        if (list == null) {
            S(13);
        }
        return list;
    }

    /* access modifiers changed from: protected */
    public abstract void K0(C18096U u10);

    /* access modifiers changed from: protected */
    public abstract List<C18096U> L0();

    public C17994n M() {
        C17994n nVar = this.f134604j;
        if (nVar == null) {
            S(14);
        }
        return nVar;
    }

    public boolean Q() {
        return false;
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        return oVar.h(this, d10);
    }

    public int getIndex() {
        return this.f134601g;
    }

    public List<C18096U> getUpperBounds() {
        List<C18096U> x10 = ((c) k()).a();
        if (x10 == null) {
            S(8);
        }
        return x10;
    }

    public final y0 k() {
        y0 y0Var = (y0) this.f134602h.invoke();
        if (y0Var == null) {
            S(9);
        }
        return y0Var;
    }

    public Q0 o() {
        Q0 q02 = this.f134599e;
        if (q02 == null) {
            S(7);
        }
        return q02;
    }

    public C18113f0 r() {
        C18113f0 f0Var = (C18113f0) this.f134603i.invoke();
        if (f0Var == null) {
            S(10);
        }
        return f0Var;
    }

    public n0 a() {
        n0 n0Var = (n0) super.a();
        if (n0Var == null) {
            S(11);
        }
        return n0Var;
    }
}
