package GI;

import DI.C15535F;
import DI.C15557d;
import DI.C15558e;
import DI.C15559f;
import DI.C15566m;
import DI.C15573t;
import DI.C15574u;
import DI.i0;
import DI.n0;
import DI.s0;
import EI.C15649h;
import cJ.C17069f;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import nJ.C17656k;
import tJ.C17994n;
import uJ.C18096U;
import uJ.C18113f0;
import uJ.C18141v;
import uJ.y0;
import vJ.g;

/* renamed from: GI.k  reason: case insensitive filesystem */
public class C15741k extends C15740j {

    /* renamed from: i  reason: collision with root package name */
    private final C15535F f134617i;

    /* renamed from: j  reason: collision with root package name */
    private final C15559f f134618j;

    /* renamed from: k  reason: collision with root package name */
    private final y0 f134619k;

    /* renamed from: l  reason: collision with root package name */
    private C17656k f134620l;

    /* renamed from: m  reason: collision with root package name */
    private Set<C15557d> f134621m;

    /* renamed from: n  reason: collision with root package name */
    private C15557d f134622n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15741k(C15566m mVar, C17069f fVar, C15535F f10, C15559f fVar2, Collection<C18096U> collection, i0 i0Var, boolean z10, C17994n nVar) {
        super(nVar, mVar, fVar, i0Var, z10);
        if (mVar == null) {
            F0(0);
        }
        if (fVar == null) {
            F0(1);
        }
        if (f10 == null) {
            F0(2);
        }
        if (fVar2 == null) {
            F0(3);
        }
        if (collection == null) {
            F0(4);
        }
        if (i0Var == null) {
            F0(5);
        }
        if (nVar == null) {
            F0(6);
        }
        this.f134617i = f10;
        this.f134618j = fVar2;
        this.f134619k = new C18141v(this, Collections.emptyList(), collection, nVar);
    }

    private static /* synthetic */ void F0(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    public C15557d F() {
        return this.f134622n;
    }

    public boolean I0() {
        return false;
    }

    public final void K0(C17656k kVar, Set<C15557d> set, C15557d dVar) {
        if (kVar == null) {
            F0(7);
        }
        if (set == null) {
            F0(8);
        }
        this.f134620l = kVar;
        this.f134621m = set;
        this.f134622n = dVar;
    }

    public s0<C18113f0> V() {
        return null;
    }

    public boolean Y() {
        return false;
    }

    public boolean b0() {
        return false;
    }

    public boolean g0() {
        return false;
    }

    public C15649h getAnnotations() {
        C15649h b10 = C15649h.f134231V.b();
        if (b10 == null) {
            F0(9);
        }
        return b10;
    }

    public C15574u getVisibility() {
        C15574u uVar = C15573t.f133853e;
        if (uVar == null) {
            F0(17);
        }
        return uVar;
    }

    public C15559f h() {
        C15559f fVar = this.f134618j;
        if (fVar == null) {
            F0(15);
        }
        return fVar;
    }

    public boolean isInline() {
        return false;
    }

    public C17656k j0(g gVar) {
        if (gVar == null) {
            F0(12);
        }
        C17656k kVar = this.f134620l;
        if (kVar == null) {
            F0(13);
        }
        return kVar;
    }

    public y0 k() {
        y0 y0Var = this.f134619k;
        if (y0Var == null) {
            F0(10);
        }
        return y0Var;
    }

    public Collection<C15557d> l() {
        Set<C15557d> set = this.f134621m;
        if (set == null) {
            F0(11);
        }
        return set;
    }

    public Collection<C15558e> m() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            F0(19);
        }
        return emptyList;
    }

    public boolean m0() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public C17656k o0() {
        C17656k.b bVar = C17656k.b.f144864b;
        if (bVar == null) {
            F0(14);
        }
        return bVar;
    }

    public C15558e p0() {
        return null;
    }

    public List<n0> t() {
        List<n0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            F0(18);
        }
        return emptyList;
    }

    public String toString() {
        return "class " + getName();
    }

    public C15535F u() {
        C15535F f10 = this.f134617i;
        if (f10 == null) {
            F0(16);
        }
        return f10;
    }

    public boolean v() {
        return false;
    }
}
