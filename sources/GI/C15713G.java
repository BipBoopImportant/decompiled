package GI;

import DI.C15535F;
import DI.C15557d;
import DI.C15558e;
import DI.C15559f;
import DI.C15566m;
import DI.C15574u;
import DI.i0;
import DI.n0;
import DI.s0;
import EI.C15649h;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nJ.C17656k;
import tJ.C17994n;
import uJ.C18096U;
import uJ.C18113f0;
import uJ.C18141v;
import uJ.y0;
import vJ.g;

/* renamed from: GI.G  reason: case insensitive filesystem */
public class C15713G extends C15740j {

    /* renamed from: i  reason: collision with root package name */
    private final C15559f f134494i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f134495j;

    /* renamed from: k  reason: collision with root package name */
    private C15535F f134496k;

    /* renamed from: l  reason: collision with root package name */
    private C15574u f134497l;

    /* renamed from: m  reason: collision with root package name */
    private y0 f134498m;

    /* renamed from: n  reason: collision with root package name */
    private List<n0> f134499n;

    /* renamed from: o  reason: collision with root package name */
    private final Collection<C18096U> f134500o;

    /* renamed from: p  reason: collision with root package name */
    private final C17994n f134501p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15713G(C15566m mVar, C15559f fVar, boolean z10, boolean z11, C17069f fVar2, i0 i0Var, C17994n nVar) {
        super(nVar, mVar, fVar2, i0Var, z11);
        if (mVar == null) {
            F0(0);
        }
        if (fVar == null) {
            F0(1);
        }
        if (fVar2 == null) {
            F0(2);
        }
        if (i0Var == null) {
            F0(3);
        }
        if (nVar == null) {
            F0(4);
        }
        this.f134500o = new ArrayList();
        this.f134501p = nVar;
        this.f134494i = fVar;
        this.f134495j = z10;
    }

    private static /* synthetic */ void F0(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
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
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
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
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
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
        return null;
    }

    public boolean I0() {
        return false;
    }

    public void K0() {
        this.f134498m = new C18141v(this, this.f134499n, this.f134500o, this.f134501p);
        Iterator<C15557d> it = l().iterator();
        while (it.hasNext()) {
            ((C15739i) it.next()).g1(r());
        }
    }

    /* renamed from: L0 */
    public Set<C15557d> l() {
        Set<C15557d> emptySet = Collections.emptySet();
        if (emptySet == null) {
            F0(13);
        }
        return emptySet;
    }

    public void M0(C15535F f10) {
        if (f10 == null) {
            F0(6);
        }
        this.f134496k = f10;
    }

    public void N0(List<n0> list) {
        if (list == null) {
            F0(14);
        }
        if (this.f134499n == null) {
            this.f134499n = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    public void O0(C15574u uVar) {
        if (uVar == null) {
            F0(9);
        }
        this.f134497l = uVar;
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
            F0(5);
        }
        return b10;
    }

    public C15574u getVisibility() {
        C15574u uVar = this.f134497l;
        if (uVar == null) {
            F0(10);
        }
        return uVar;
    }

    public C15559f h() {
        C15559f fVar = this.f134494i;
        if (fVar == null) {
            F0(8);
        }
        return fVar;
    }

    public boolean isInline() {
        return false;
    }

    public C17656k j0(g gVar) {
        if (gVar == null) {
            F0(16);
        }
        C17656k.b bVar = C17656k.b.f144864b;
        if (bVar == null) {
            F0(17);
        }
        return bVar;
    }

    public y0 k() {
        y0 y0Var = this.f134498m;
        if (y0Var == null) {
            F0(11);
        }
        return y0Var;
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
        return this.f134495j;
    }

    public C17656k o0() {
        C17656k.b bVar = C17656k.b.f144864b;
        if (bVar == null) {
            F0(18);
        }
        return bVar;
    }

    public C15558e p0() {
        return null;
    }

    public List<n0> t() {
        List<n0> list = this.f134499n;
        if (list == null) {
            F0(15);
        }
        return list;
    }

    public String toString() {
        return C15743m.j0(this);
    }

    public C15535F u() {
        C15535F f10 = this.f134496k;
        if (f10 == null) {
            F0(7);
        }
        return f10;
    }

    public boolean v() {
        return false;
    }
}
