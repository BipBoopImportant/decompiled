package GI;

import DI.C15535F;
import DI.C15554a;
import DI.C15555b;
import DI.C15566m;
import DI.C15568o;
import DI.C15573t;
import DI.C15574u;
import DI.C15576w;
import DI.C15579z;
import DI.Z;
import DI.a0;
import DI.b0;
import DI.c0;
import DI.d0;
import DI.i0;
import DI.n0;
import DI.u0;
import EI.C15649h;
import EJ.C15671l;
import cJ.C17069f;
import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import iJ.C17373g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kJ.C17506e;
import nI.C17631a;
import oJ.C17701c;
import oJ.C17702d;
import oJ.C17704f;
import tJ.C17990j;
import uJ.C18080D;
import uJ.C18096U;
import uJ.H0;
import uJ.J0;
import uJ.Q0;

/* renamed from: GI.K  reason: case insensitive filesystem */
public class C15717K extends C15730Y implements a0 {

    /* renamed from: A  reason: collision with root package name */
    private C15576w f134516A;

    /* renamed from: B  reason: collision with root package name */
    private C15576w f134517B;

    /* renamed from: i  reason: collision with root package name */
    private final C15535F f134518i;

    /* renamed from: j  reason: collision with root package name */
    private C15574u f134519j;

    /* renamed from: k  reason: collision with root package name */
    private Collection<? extends a0> f134520k;

    /* renamed from: l  reason: collision with root package name */
    private final a0 f134521l;

    /* renamed from: m  reason: collision with root package name */
    private final C15555b.a f134522m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f134523n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f134524o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f134525p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f134526q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f134527r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f134528s;

    /* renamed from: t  reason: collision with root package name */
    private List<d0> f134529t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public d0 f134530u;

    /* renamed from: v  reason: collision with root package name */
    private d0 f134531v;

    /* renamed from: w  reason: collision with root package name */
    private List<n0> f134532w;

    /* renamed from: x  reason: collision with root package name */
    private C15718L f134533x;

    /* renamed from: y  reason: collision with root package name */
    private c0 f134534y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f134535z;

    /* renamed from: GI.K$a */
    public class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public C15566m f134536a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public C15535F f134537b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public C15574u f134538c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public a0 f134539d = null;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f134540e = false;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public C15555b.a f134541f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public H0 f134542g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public boolean f134543h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public d0 f134544i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public List<n0> f134545j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public C17069f f134546k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public C18096U f134547l;

        public a() {
            this.f134536a = C15717K.this.b();
            this.f134537b = C15717K.this.u();
            this.f134538c = C15717K.this.getVisibility();
            this.f134541f = C15717K.this.h();
            this.f134542g = H0.f147818b;
            this.f134543h = true;
            this.f134544i = C15717K.this.f134530u;
            this.f134545j = null;
            this.f134546k = C15717K.this.getName();
            this.f134547l = C15717K.this.getType();
        }

        private static /* synthetic */ void a(int i10) {
            int i11 = i10;
            String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 5 || i11 == 7 || i11 == 9 || i11 == 11 || i11 == 19 || i11 == 13 || i11 == 14 || i11 == 16 || i11 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i11 == 1 || i11 == 2 || i11 == 3 || i11 == 5 || i11 == 7 || i11 == 9 || i11 == 11 || i11 == 19 || i11 == 13 || i11 == 14 || i11 == 16 || i11 == 17) ? 2 : 3)];
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i11 == 1) {
                objArr[1] = "setOwner";
            } else if (i11 == 2) {
                objArr[1] = "setOriginal";
            } else if (i11 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i11 == 5) {
                objArr[1] = "setReturnType";
            } else if (i11 == 7) {
                objArr[1] = "setModality";
            } else if (i11 == 9) {
                objArr[1] = "setVisibility";
            } else if (i11 == 11) {
                objArr[1] = "setKind";
            } else if (i11 == 19) {
                objArr[1] = "setName";
            } else if (i11 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i11 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i11 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i11 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i11 == 1 || i11 == 2 || i11 == 3 || i11 == 5 || i11 == 7 || i11 == 9 || i11 == 11 || i11 == 19 || i11 == 13 || i11 == 14 || i11 == 16 || i11 == 17) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public a0 n() {
            return C15717K.this.Q0(this);
        }

        /* access modifiers changed from: package-private */
        public b0 o() {
            a0 a0Var = this.f134539d;
            if (a0Var == null) {
                return null;
            }
            return a0Var.d();
        }

        /* access modifiers changed from: package-private */
        public c0 p() {
            a0 a0Var = this.f134539d;
            if (a0Var == null) {
                return null;
            }
            return a0Var.g();
        }

        public a q(boolean z10) {
            this.f134543h = z10;
            return this;
        }

        public a r(C15555b.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f134541f = aVar;
            return this;
        }

        public a s(C15535F f10) {
            if (f10 == null) {
                a(6);
            }
            this.f134537b = f10;
            return this;
        }

        public a t(C15555b bVar) {
            this.f134539d = (a0) bVar;
            return this;
        }

        public a u(C15566m mVar) {
            if (mVar == null) {
                a(0);
            }
            this.f134536a = mVar;
            return this;
        }

        public a v(H0 h02) {
            if (h02 == null) {
                a(15);
            }
            this.f134542g = h02;
            return this;
        }

        public a w(C15574u uVar) {
            if (uVar == null) {
                a(8);
            }
            this.f134538c = uVar;
            return this;
        }
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [DI.a0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C15717K(DI.C15566m r12, DI.a0 r13, EI.C15649h r14, DI.C15535F r15, DI.C15574u r16, boolean r17, cJ.C17069f r18, DI.C15555b.a r19, DI.i0 r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            r11 = this;
            r7 = r11
            r8 = r15
            r9 = r16
            r10 = r19
            if (r12 != 0) goto L_0x000c
            r0 = 0
            S(r0)
        L_0x000c:
            if (r14 != 0) goto L_0x0012
            r0 = 1
            S(r0)
        L_0x0012:
            if (r8 != 0) goto L_0x0018
            r0 = 2
            S(r0)
        L_0x0018:
            if (r9 != 0) goto L_0x001e
            r0 = 3
            S(r0)
        L_0x001e:
            if (r18 != 0) goto L_0x0024
            r0 = 4
            S(r0)
        L_0x0024:
            if (r10 != 0) goto L_0x002a
            r0 = 5
            S(r0)
        L_0x002a:
            if (r20 != 0) goto L_0x0030
            r0 = 6
            S(r0)
        L_0x0030:
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r18
            r5 = r17
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 0
            r7.f134520k = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r7.f134529t = r0
            r7.f134518i = r8
            r7.f134519j = r9
            if (r13 != 0) goto L_0x004e
            r0 = r7
            goto L_0x004f
        L_0x004e:
            r0 = r13
        L_0x004f:
            r7.f134521l = r0
            r7.f134522m = r10
            r0 = r21
            r7.f134523n = r0
            r0 = r22
            r7.f134524o = r0
            r0 = r23
            r7.f134525p = r0
            r0 = r24
            r7.f134526q = r0
            r0 = r25
            r7.f134527r = r0
            r0 = r26
            r7.f134528s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: GI.C15717K.<init>(DI.m, DI.a0, EI.h, DI.F, DI.u, boolean, cJ.f, DI.b$a, DI.i0, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public static C15717K O0(C15566m mVar, C15649h hVar, C15535F f10, C15574u uVar, boolean z10, C17069f fVar, C15555b.a aVar, i0 i0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
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
        if (aVar == null) {
            S(12);
        }
        if (i0Var == null) {
            S(13);
        }
        return new C15717K(mVar, (a0) null, hVar, f10, uVar, z10, fVar, aVar, i0Var, z11, z12, z13, z14, z15, z16);
    }

    private static /* synthetic */ void S(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (!(i10 == 28 || i10 == 38 || i10 == 39 || i10 == 41 || i10 == 42)) {
            switch (i10) {
                case 21:
                case 22:
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                case BuildConfig.MIN_SDK_VERSION:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i10 == 28 || i10 == 38 || i10 == 39 || i10 == 41 || i10 == 42)) {
            switch (i10) {
                case 21:
                case 22:
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                case BuildConfig.MIN_SDK_VERSION:
                case 25:
                case 26:
                    break;
                default:
                    i11 = 3;
                    break;
            }
        }
        i11 = 2;
        Object[] objArr = new Object[i11];
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
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case ImageFormat.YUV_420_888:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case BuildConfig.TARGET_SDK_VERSION:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i10 == 38) {
            objArr[1] = "getOriginal";
        } else if (i10 == 39) {
            objArr[1] = "getKind";
        } else if (i10 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 42) {
            switch (i10) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                    objArr[1] = "getReturnType";
                    break;
                case BuildConfig.MIN_SDK_VERSION:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case BuildConfig.TARGET_SDK_VERSION:
            case 34:
            case ImageFormat.YUV_420_888:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i10 == 28 || i10 == 38 || i10 == 39 || i10 == 41 || i10 == 42)) {
            switch (i10) {
                case 21:
                case 22:
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                case BuildConfig.MIN_SDK_VERSION:
                case 25:
                case 26:
                    break;
                default:
                    th2 = new IllegalArgumentException(format);
                    break;
            }
        }
        th2 = new IllegalStateException(format);
        throw th2;
    }

    private i0 S0(boolean z10, a0 a0Var) {
        i0 i0Var;
        if (z10) {
            if (a0Var == null) {
                a0Var = a();
            }
            i0Var = a0Var.i();
        } else {
            i0Var = i0.f133841a;
        }
        if (i0Var == null) {
            S(28);
        }
        return i0Var;
    }

    private static C15579z T0(J0 j02, Z z10) {
        if (j02 == null) {
            S(30);
        }
        if (z10 == null) {
            S(31);
        }
        if (z10.t0() != null) {
            return z10.t0().c(j02);
        }
        return null;
    }

    private static C15574u Y0(C15574u uVar, C15555b.a aVar) {
        return (aVar != C15555b.a.FAKE_OVERRIDE || !C15573t.g(uVar.f())) ? uVar : C15573t.f133856h;
    }

    private static d0 d1(J0 j02, a0 a0Var, d0 d0Var) {
        C18096U p10 = j02.p(d0Var.getType(), Q0.IN_VARIANCE);
        if (p10 == null) {
            return null;
        }
        return new C15720N(a0Var, new C17701c(a0Var, p10, ((C17704f) d0Var.getValue()).a(), d0Var.getValue()), d0Var.getAnnotations());
    }

    private static d0 e1(J0 j02, a0 a0Var, d0 d0Var) {
        C18096U p10 = j02.p(d0Var.getType(), Q0.IN_VARIANCE);
        if (p10 == null) {
            return null;
        }
        return new C15720N(a0Var, new C17702d(a0Var, p10, d0Var.getValue()), d0Var.getAnnotations());
    }

    public boolean D() {
        return this.f134528s;
    }

    public void E0(Collection<? extends C15555b> collection) {
        if (collection == null) {
            S(40);
        }
        this.f134520k = collection;
    }

    public d0 L() {
        return this.f134530u;
    }

    /* renamed from: N0 */
    public a0 C(C15566m mVar, C15535F f10, C15574u uVar, C15555b.a aVar, boolean z10) {
        a0 n10 = X0().u(mVar).t((C15555b) null).s(f10).w(uVar).r(aVar).q(z10).n();
        if (n10 == null) {
            S(42);
        }
        return n10;
    }

    public d0 O() {
        return this.f134531v;
    }

    public C15576w P() {
        return this.f134517B;
    }

    /* access modifiers changed from: protected */
    public C15717K P0(C15566m mVar, C15535F f10, C15574u uVar, a0 a0Var, C15555b.a aVar, C17069f fVar, i0 i0Var) {
        if (mVar == null) {
            S(32);
        }
        if (f10 == null) {
            S(33);
        }
        if (uVar == null) {
            S(34);
        }
        if (aVar == null) {
            S(35);
        }
        if (fVar == null) {
            S(36);
        }
        if (i0Var == null) {
            S(37);
        }
        return new C15717K(mVar, a0Var, getAnnotations(), f10, uVar, N(), fVar, aVar, i0Var, z0(), c0(), m0(), Y(), isExternal(), D());
    }

    /* access modifiers changed from: protected */
    public a0 Q0(a aVar) {
        d0 d0Var;
        C17631a<C17990j<C17373g<?>>> aVar2;
        if (aVar == null) {
            S(29);
        }
        C15717K P02 = P0(aVar.f134536a, aVar.f134537b, aVar.f134538c, aVar.f134539d, aVar.f134541f, aVar.f134546k, S0(aVar.f134540e, aVar.f134539d));
        List<n0> typeParameters = aVar.f134545j == null ? getTypeParameters() : aVar.f134545j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        J0 b10 = C18080D.b(typeParameters, aVar.f134542g, P02, arrayList);
        C18096U c10 = aVar.f134547l;
        C18096U p10 = b10.p(c10, Q0.OUT_VARIANCE);
        C15748r rVar = null;
        if (p10 == null) {
            return null;
        }
        C18096U p11 = b10.p(c10, Q0.IN_VARIANCE);
        if (p11 != null) {
            P02.Z0(p11);
        }
        d0 d10 = aVar.f134544i;
        if (d10 != null) {
            d0 c11 = d10.c(b10);
            if (c11 == null) {
                return null;
            }
            d0Var = c11;
        } else {
            d0Var = null;
        }
        d0 d0Var2 = this.f134531v;
        d0 e12 = d0Var2 != null ? e1(b10, P02, d0Var2) : null;
        ArrayList arrayList2 = new ArrayList();
        for (d0 d12 : this.f134529t) {
            d0 d13 = d1(b10, P02, d12);
            if (d13 != null) {
                arrayList2.add(d13);
            }
        }
        P02.b1(p10, arrayList, d0Var, e12, arrayList2);
        C15718L l10 = this.f134533x == null ? null : new C15718L(P02, this.f134533x.getAnnotations(), aVar.f134537b, Y0(this.f134533x.getVisibility(), aVar.f134541f), this.f134533x.H(), this.f134533x.isExternal(), this.f134533x.isInline(), aVar.f134541f, aVar.o(), i0.f133841a);
        if (l10 != null) {
            C18096U returnType = this.f134533x.getReturnType();
            l10.N0(T0(b10, this.f134533x));
            l10.Q0(returnType != null ? b10.p(returnType, Q0.OUT_VARIANCE) : null);
        }
        C15719M m10 = this.f134534y == null ? null : new C15719M(P02, this.f134534y.getAnnotations(), aVar.f134537b, Y0(this.f134534y.getVisibility(), aVar.f134541f), this.f134534y.H(), this.f134534y.isExternal(), this.f134534y.isInline(), aVar.f134541f, aVar.p(), i0.f133841a);
        if (m10 != null) {
            List<u0> P03 = C15749s.P0(m10, this.f134534y.j(), b10, false, false, (boolean[]) null);
            if (P03 == null) {
                P02.a1(true);
                P03 = Collections.singletonList(C15719M.P0(m10, C17506e.m(aVar.f134536a).I(), this.f134534y.j().get(0).getAnnotations()));
            }
            if (P03.size() == 1) {
                m10.N0(T0(b10, this.f134534y));
                m10.R0(P03.get(0));
            } else {
                throw new IllegalStateException();
            }
        }
        C15576w wVar = this.f134516A;
        C15748r rVar2 = wVar == null ? null : new C15748r(wVar.getAnnotations(), P02);
        C15576w wVar2 = this.f134517B;
        if (wVar2 != null) {
            rVar = new C15748r(wVar2.getAnnotations(), P02);
        }
        P02.V0(l10, m10, rVar2, rVar);
        if (aVar.f134543h) {
            C15671l b11 = C15671l.b();
            for (a0 c12 : e()) {
                b11.add(c12.c(b10));
            }
            P02.E0(b11);
        }
        if (c0() && (aVar2 = this.f134580h) != null) {
            P02.K0(this.f134579g, aVar2);
        }
        return P02;
    }

    /* renamed from: R0 */
    public C15718L d() {
        return this.f134533x;
    }

    public <V> V T(C15554a.C3296a<V> aVar) {
        return null;
    }

    public void U0(C15718L l10, c0 c0Var) {
        V0(l10, c0Var, (C15576w) null, (C15576w) null);
    }

    public void V0(C15718L l10, c0 c0Var, C15576w wVar, C15576w wVar2) {
        this.f134533x = l10;
        this.f134534y = c0Var;
        this.f134516A = wVar;
        this.f134517B = wVar2;
    }

    public boolean W0() {
        return this.f134535z;
    }

    public a X0() {
        return new a();
    }

    public boolean Y() {
        return this.f134526q;
    }

    public void Z0(C18096U u10) {
        if (u10 == null) {
            S(14);
        }
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        return oVar.k(this, d10);
    }

    public void a1(boolean z10) {
        this.f134535z = z10;
    }

    public void b1(C18096U u10, List<? extends n0> list, d0 d0Var, d0 d0Var2, List<d0> list2) {
        if (u10 == null) {
            S(17);
        }
        if (list == null) {
            S(18);
        }
        if (list2 == null) {
            S(19);
        }
        H0(u10);
        this.f134532w = new ArrayList(list);
        this.f134531v = d0Var2;
        this.f134530u = d0Var;
        this.f134529t = list2;
    }

    public boolean c0() {
        return this.f134524o;
    }

    public void c1(C15574u uVar) {
        if (uVar == null) {
            S(20);
        }
        this.f134519j = uVar;
    }

    public Collection<? extends a0> e() {
        Collection<? extends a0> collection = this.f134520k;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            S(41);
        }
        return collection;
    }

    public c0 g() {
        return this.f134534y;
    }

    public C18096U getReturnType() {
        C18096U type = getType();
        if (type == null) {
            S(23);
        }
        return type;
    }

    public List<n0> getTypeParameters() {
        List<n0> list = this.f134532w;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    public C15574u getVisibility() {
        C15574u uVar = this.f134519j;
        if (uVar == null) {
            S(25);
        }
        return uVar;
    }

    public C15555b.a h() {
        C15555b.a aVar = this.f134522m;
        if (aVar == null) {
            S(39);
        }
        return aVar;
    }

    public boolean isExternal() {
        return this.f134527r;
    }

    public boolean m0() {
        return this.f134525p;
    }

    public C15535F u() {
        C15535F f10 = this.f134518i;
        if (f10 == null) {
            S(24);
        }
        return f10;
    }

    public C15576w x0() {
        return this.f134516A;
    }

    public List<Z> y() {
        ArrayList arrayList = new ArrayList(2);
        C15718L l10 = this.f134533x;
        if (l10 != null) {
            arrayList.add(l10);
        }
        c0 c0Var = this.f134534y;
        if (c0Var != null) {
            arrayList.add(c0Var);
        }
        return arrayList;
    }

    public List<d0> y0() {
        List<d0> list = this.f134529t;
        if (list == null) {
            S(22);
        }
        return list;
    }

    public boolean z0() {
        return this.f134523n;
    }

    public a0 c(J0 j02) {
        if (j02 == null) {
            S(27);
        }
        if (j02.k()) {
            return this;
        }
        return X0().v(j02.j()).t(a()).n();
    }

    public a0 a() {
        a0 a0Var = this.f134521l;
        a0 a10 = a0Var == this ? this : a0Var.a();
        if (a10 == null) {
            S(38);
        }
        return a10;
    }
}
