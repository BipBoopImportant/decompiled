package sJ;

import DI.C15558e;
import DI.C15561h;
import DI.C15566m;
import DI.m0;
import DI.n0;
import DI.r0;
import EI.C15649h;
import GI.C15737g;
import XI.r;
import ZI.c;
import ZI.g;
import ZI.h;
import cJ.C17069f;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import tJ.C17994n;
import uJ.C18096U;
import uJ.C18100Y;
import uJ.C18113f0;
import uJ.I0;
import uJ.J0;
import uJ.Q0;

/* renamed from: sJ.P  reason: case insensitive filesystem */
public final class C17920P extends C15737g implements C17943t {

    /* renamed from: k  reason: collision with root package name */
    private final r f147034k;

    /* renamed from: l  reason: collision with root package name */
    private final c f147035l;

    /* renamed from: m  reason: collision with root package name */
    private final g f147036m;

    /* renamed from: n  reason: collision with root package name */
    private final h f147037n;

    /* renamed from: o  reason: collision with root package name */
    private final C17942s f147038o;

    /* renamed from: p  reason: collision with root package name */
    private C18113f0 f147039p;

    /* renamed from: q  reason: collision with root package name */
    private C18113f0 f147040q;

    /* renamed from: r  reason: collision with root package name */
    private List<? extends n0> f147041r;

    /* renamed from: s  reason: collision with root package name */
    private C18113f0 f147042s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17920P(tJ.C17994n r13, DI.C15566m r14, EI.C15649h r15, cJ.C17069f r16, DI.C15574u r17, XI.r r18, ZI.c r19, ZI.g r20, ZI.h r21, sJ.C17942s r22) {
        /*
            r12 = this;
            r7 = r12
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            java.lang.String r0 = "storageManager"
            r1 = r13
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "containingDeclaration"
            r2 = r14
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "annotations"
            r3 = r15
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "name"
            r4 = r16
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "visibility"
            r6 = r17
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            DI.i0 r5 = DI.i0.f133841a
            java.lang.String r0 = "NO_SOURCE"
            kotlin.jvm.internal.C17542s.i(r5, r0)
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f147034k = r8
            r7.f147035l = r9
            r7.f147036m = r10
            r7.f147037n = r11
            r0 = r22
            r7.f147038o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sJ.C17920P.<init>(tJ.n, DI.m, EI.h, cJ.f, DI.u, XI.r, ZI.c, ZI.g, ZI.h, sJ.s):void");
    }

    public g G() {
        return this.f147036m;
    }

    public C18113f0 I() {
        C18113f0 f0Var = this.f147040q;
        if (f0Var != null) {
            return f0Var;
        }
        C17542s.z("expandedType");
        return null;
    }

    public c J() {
        return this.f147035l;
    }

    public C17942s K() {
        return this.f147038o;
    }

    /* access modifiers changed from: protected */
    public List<n0> R0() {
        List<? extends n0> list = this.f147041r;
        if (list != null) {
            return list;
        }
        C17542s.z("typeConstructorParameters");
        return null;
    }

    /* renamed from: U0 */
    public r h0() {
        return this.f147034k;
    }

    public h V0() {
        return this.f147037n;
    }

    public final void W0(List<? extends n0> list, C18113f0 f0Var, C18113f0 f0Var2) {
        C17542s.j(list, "declaredTypeParameters");
        C17542s.j(f0Var, "underlyingType");
        C17542s.j(f0Var2, "expandedType");
        S0(list);
        this.f147039p = f0Var;
        this.f147040q = f0Var2;
        this.f147041r = r0.g(this);
        this.f147042s = M0();
    }

    /* renamed from: X0 */
    public m0 c(J0 j02) {
        C17542s.j(j02, "substitutor");
        if (j02.k()) {
            return this;
        }
        C17994n M10 = M();
        C15566m b10 = b();
        C17542s.i(b10, "getContainingDeclaration(...)");
        C15649h annotations = getAnnotations();
        C17542s.i(annotations, "<get-annotations>(...)");
        C17069f name = getName();
        C17542s.i(name, "getName(...)");
        C17920P p10 = new C17920P(M10, b10, annotations, name, getVisibility(), h0(), J(), G(), V0(), K());
        List<n0> t10 = t();
        C18113f0 u02 = u0();
        Q0 q02 = Q0.INVARIANT;
        C18096U n10 = j02.n(u02, q02);
        C17542s.i(n10, "safeSubstitute(...)");
        C18113f0 a10 = I0.a(n10);
        C18096U n11 = j02.n(I(), q02);
        C17542s.i(n11, "safeSubstitute(...)");
        p10.W0(t10, a10, I0.a(n11));
        return p10;
    }

    public C18113f0 r() {
        C18113f0 f0Var = this.f147042s;
        if (f0Var != null) {
            return f0Var;
        }
        C17542s.z("defaultTypeImpl");
        return null;
    }

    public C18113f0 u0() {
        C18113f0 f0Var = this.f147039p;
        if (f0Var != null) {
            return f0Var;
        }
        C17542s.z("underlyingType");
        return null;
    }

    public C15558e w() {
        if (C18100Y.a(I())) {
            return null;
        }
        C15561h e10 = I().N0().e();
        if (e10 instanceof C15558e) {
            return (C15558e) e10;
        }
        return null;
    }
}
