package GI;

import DI.C15535F;
import DI.C15554a;
import DI.C15555b;
import DI.C15566m;
import DI.C15574u;
import DI.C15579z;
import DI.Z;
import DI.a0;
import DI.d0;
import DI.i0;
import DI.n0;
import EI.C15649h;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import uJ.J0;

/* renamed from: GI.J  reason: case insensitive filesystem */
public abstract class C15716J extends C15744n implements Z {

    /* renamed from: e  reason: collision with root package name */
    private boolean f134508e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f134509f;

    /* renamed from: g  reason: collision with root package name */
    private final C15535F f134510g;

    /* renamed from: h  reason: collision with root package name */
    private final a0 f134511h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f134512i;

    /* renamed from: j  reason: collision with root package name */
    private final C15555b.a f134513j;

    /* renamed from: k  reason: collision with root package name */
    private C15574u f134514k;

    /* renamed from: l  reason: collision with root package name */
    private C15579z f134515l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15716J(C15535F f10, C15574u uVar, a0 a0Var, C15649h hVar, C17069f fVar, boolean z10, boolean z11, boolean z12, C15555b.a aVar, i0 i0Var) {
        super(a0Var.b(), hVar, fVar, i0Var);
        if (f10 == null) {
            S(0);
        }
        if (uVar == null) {
            S(1);
        }
        if (a0Var == null) {
            S(2);
        }
        if (hVar == null) {
            S(3);
        }
        if (fVar == null) {
            S(4);
        }
        if (i0Var == null) {
            S(5);
        }
        this.f134515l = null;
        this.f134510g = f10;
        this.f134514k = uVar;
        this.f134511h = a0Var;
        this.f134508e = z10;
        this.f134509f = z11;
        this.f134512i = z12;
        this.f134513j = aVar;
    }

    private static /* synthetic */ void S(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    public boolean D0() {
        return false;
    }

    public boolean E() {
        return false;
    }

    public void E0(Collection<? extends C15555b> collection) {
        if (collection == null) {
            S(16);
        }
    }

    public boolean G0() {
        return false;
    }

    public boolean H() {
        return this.f134508e;
    }

    /* renamed from: H0 */
    public Z C(C15566m mVar, C15535F f10, C15574u uVar, C15555b.a aVar, boolean z10) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    /* renamed from: K0 */
    public abstract Z a();

    public d0 L() {
        return W().L();
    }

    /* access modifiers changed from: protected */
    public Collection<Z> L0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (a0 a0Var : W().e()) {
            Object d10 = z10 ? a0Var.d() : a0Var.g();
            if (d10 != null) {
                arrayList.add(d10);
            }
        }
        return arrayList;
    }

    public void M0(boolean z10) {
        this.f134508e = z10;
    }

    public void N0(C15579z zVar) {
        this.f134515l = zVar;
    }

    public d0 O() {
        return W().O();
    }

    public void O0(C15574u uVar) {
        this.f134514k = uVar;
    }

    public <V> V T(C15554a.C3296a<V> aVar) {
        return null;
    }

    public a0 W() {
        a0 a0Var = this.f134511h;
        if (a0Var == null) {
            S(13);
        }
        return a0Var;
    }

    public boolean Y() {
        return false;
    }

    public C15579z c(J0 j02) {
        if (j02 == null) {
            S(7);
        }
        return this;
    }

    public List<n0> getTypeParameters() {
        List<n0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            S(9);
        }
        return emptyList;
    }

    public C15574u getVisibility() {
        C15574u uVar = this.f134514k;
        if (uVar == null) {
            S(11);
        }
        return uVar;
    }

    public C15555b.a h() {
        C15555b.a aVar = this.f134513j;
        if (aVar == null) {
            S(6);
        }
        return aVar;
    }

    public boolean i0() {
        return false;
    }

    public boolean isExternal() {
        return this.f134509f;
    }

    public boolean isInfix() {
        return false;
    }

    public boolean isInline() {
        return this.f134512i;
    }

    public boolean isOperator() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    public boolean m0() {
        return false;
    }

    public C15579z t0() {
        return this.f134515l;
    }

    public C15535F u() {
        C15535F f10 = this.f134510g;
        if (f10 == null) {
            S(10);
        }
        return f10;
    }

    public List<d0> y0() {
        List<d0> y02 = W().y0();
        if (y02 == null) {
            S(14);
        }
        return y02;
    }
}
