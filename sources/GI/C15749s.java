package GI;

import DI.C15535F;
import DI.C15554a;
import DI.C15555b;
import DI.C15566m;
import DI.C15568o;
import DI.C15573t;
import DI.C15574u;
import DI.C15579z;
import DI.d0;
import DI.i0;
import DI.n0;
import DI.u0;
import DI.v0;
import EI.C15649h;
import EI.C15651j;
import EJ.C15670k;
import GI.C15727V;
import YH.C16877v;
import cJ.C17069f;
import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import gJ.C17277h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nI.C17631a;
import oJ.C17702d;
import oJ.C17704f;
import uJ.C18080D;
import uJ.C18096U;
import uJ.H0;
import uJ.J0;
import uJ.Q0;

/* renamed from: GI.s  reason: case insensitive filesystem */
public abstract class C15749s extends C15744n implements C15579z {

    /* renamed from: A  reason: collision with root package name */
    private final C15579z f134645A;

    /* renamed from: B  reason: collision with root package name */
    private final C15555b.a f134646B;

    /* renamed from: C  reason: collision with root package name */
    private C15579z f134647C;

    /* renamed from: D  reason: collision with root package name */
    protected Map<C15554a.C3296a<?>, Object> f134648D;

    /* renamed from: e  reason: collision with root package name */
    private List<n0> f134649e;

    /* renamed from: f  reason: collision with root package name */
    private List<u0> f134650f;

    /* renamed from: g  reason: collision with root package name */
    private C18096U f134651g;

    /* renamed from: h  reason: collision with root package name */
    private List<d0> f134652h;

    /* renamed from: i  reason: collision with root package name */
    private d0 f134653i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public d0 f134654j;

    /* renamed from: k  reason: collision with root package name */
    private C15535F f134655k;

    /* renamed from: l  reason: collision with root package name */
    private C15574u f134656l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f134657m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f134658n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f134659o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f134660p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f134661q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f134662r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f134663s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f134664t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f134665u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f134666v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f134667w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f134668x;

    /* renamed from: y  reason: collision with root package name */
    private Collection<? extends C15579z> f134669y;

    /* renamed from: z  reason: collision with root package name */
    private volatile C17631a<Collection<C15579z>> f134670z;

    /* renamed from: GI.s$a */
    class a implements C17631a<Collection<C15579z>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J0 f134671a;

        a(J0 j02) {
            this.f134671a = j02;
        }

        /* renamed from: a */
        public Collection<C15579z> invoke() {
            C15670k kVar = new C15670k();
            for (C15579z c10 : C15749s.this.e()) {
                kVar.add(c10.c(this.f134671a));
            }
            return kVar;
        }
    }

    /* renamed from: GI.s$b */
    static class b implements C17631a<List<v0>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f134673a;

        b(List list) {
            this.f134673a = list;
        }

        /* renamed from: a */
        public List<v0> invoke() {
            return this.f134673a;
        }
    }

    /* renamed from: GI.s$c */
    public class c implements C15579z.a<C15579z> {

        /* renamed from: a  reason: collision with root package name */
        protected H0 f134674a;

        /* renamed from: b  reason: collision with root package name */
        protected C15566m f134675b;

        /* renamed from: c  reason: collision with root package name */
        protected C15535F f134676c;

        /* renamed from: d  reason: collision with root package name */
        protected C15574u f134677d;

        /* renamed from: e  reason: collision with root package name */
        protected C15579z f134678e;

        /* renamed from: f  reason: collision with root package name */
        protected C15555b.a f134679f;

        /* renamed from: g  reason: collision with root package name */
        protected List<u0> f134680g;

        /* renamed from: h  reason: collision with root package name */
        protected List<d0> f134681h;

        /* renamed from: i  reason: collision with root package name */
        protected d0 f134682i;

        /* renamed from: j  reason: collision with root package name */
        protected d0 f134683j;

        /* renamed from: k  reason: collision with root package name */
        protected C18096U f134684k;

        /* renamed from: l  reason: collision with root package name */
        protected C17069f f134685l;

        /* renamed from: m  reason: collision with root package name */
        protected boolean f134686m;

        /* renamed from: n  reason: collision with root package name */
        protected boolean f134687n;

        /* renamed from: o  reason: collision with root package name */
        protected boolean f134688o;

        /* renamed from: p  reason: collision with root package name */
        protected boolean f134689p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public boolean f134690q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public List<n0> f134691r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public C15649h f134692s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public boolean f134693t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public Map<C15554a.C3296a<?>, Object> f134694u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public Boolean f134695v;

        /* renamed from: w  reason: collision with root package name */
        protected boolean f134696w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ C15749s f134697x;

        public c(C15749s sVar, H0 h02, C15566m mVar, C15535F f10, C15574u uVar, C15555b.a aVar, List<u0> list, List<d0> list2, d0 d0Var, C18096U u10, C17069f fVar) {
            if (h02 == null) {
                v(0);
            }
            if (mVar == null) {
                v(1);
            }
            if (f10 == null) {
                v(2);
            }
            if (uVar == null) {
                v(3);
            }
            if (aVar == null) {
                v(4);
            }
            if (list == null) {
                v(5);
            }
            if (list2 == null) {
                v(6);
            }
            if (u10 == null) {
                v(7);
            }
            this.f134697x = sVar;
            this.f134678e = null;
            this.f134683j = sVar.f134654j;
            this.f134686m = true;
            this.f134687n = false;
            this.f134688o = false;
            this.f134689p = false;
            this.f134690q = sVar.D0();
            this.f134691r = null;
            this.f134692s = null;
            this.f134693t = sVar.G0();
            this.f134694u = new LinkedHashMap();
            this.f134695v = null;
            this.f134696w = false;
            this.f134674a = h02;
            this.f134675b = mVar;
            this.f134676c = f10;
            this.f134677d = uVar;
            this.f134679f = aVar;
            this.f134680g = list;
            this.f134681h = list2;
            this.f134682i = d0Var;
            this.f134684k = u10;
            this.f134685l = fVar;
        }

        private static /* synthetic */ void v(int i10) {
            String str;
            int i11;
            Throwable th2;
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case BuildConfig.MIN_SDK_VERSION:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case BuildConfig.TARGET_SDK_VERSION:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case BuildConfig.MIN_SDK_VERSION:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case BuildConfig.TARGET_SDK_VERSION:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case BuildConfig.MIN_SDK_VERSION:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case BuildConfig.TARGET_SDK_VERSION:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case ImageFormat.YUV_420_888:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
                default:
                    objArr[0] = "substitution";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case BuildConfig.MIN_SDK_VERSION:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case BuildConfig.TARGET_SDK_VERSION:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case BuildConfig.MIN_SDK_VERSION:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case BuildConfig.TARGET_SDK_VERSION:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case ImageFormat.YUV_420_888:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case BuildConfig.MIN_SDK_VERSION:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case BuildConfig.TARGET_SDK_VERSION:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    th2 = new IllegalStateException(format);
                    break;
                default:
                    th2 = new IllegalArgumentException(format);
                    break;
            }
            throw th2;
        }

        /* renamed from: C */
        public c i(C15649h hVar) {
            if (hVar == null) {
                v(35);
            }
            this.f134692s = hVar;
            return this;
        }

        /* renamed from: D */
        public c o(boolean z10) {
            this.f134686m = z10;
            return this;
        }

        /* renamed from: E */
        public c q(d0 d0Var) {
            this.f134683j = d0Var;
            return this;
        }

        /* renamed from: F */
        public c a() {
            this.f134689p = true;
            return this;
        }

        /* renamed from: G */
        public c m(d0 d0Var) {
            this.f134682i = d0Var;
            return this;
        }

        public c H(boolean z10) {
            this.f134695v = Boolean.valueOf(z10);
            return this;
        }

        /* renamed from: I */
        public c e() {
            this.f134693t = true;
            return this;
        }

        /* renamed from: J */
        public c h() {
            this.f134690q = true;
            return this;
        }

        public c K(boolean z10) {
            this.f134696w = z10;
            return this;
        }

        /* renamed from: L */
        public c p(C15555b.a aVar) {
            if (aVar == null) {
                v(14);
            }
            this.f134679f = aVar;
            return this;
        }

        /* renamed from: M */
        public c c(C15535F f10) {
            if (f10 == null) {
                v(10);
            }
            this.f134676c = f10;
            return this;
        }

        /* renamed from: N */
        public c j(C17069f fVar) {
            if (fVar == null) {
                v(17);
            }
            this.f134685l = fVar;
            return this;
        }

        /* renamed from: O */
        public c s(C15555b bVar) {
            this.f134678e = (C15579z) bVar;
            return this;
        }

        /* renamed from: P */
        public c l(C15566m mVar) {
            if (mVar == null) {
                v(8);
            }
            this.f134675b = mVar;
            return this;
        }

        /* renamed from: Q */
        public c n() {
            this.f134688o = true;
            return this;
        }

        /* renamed from: R */
        public c t(C18096U u10) {
            if (u10 == null) {
                v(23);
            }
            this.f134684k = u10;
            return this;
        }

        /* renamed from: S */
        public c u() {
            this.f134687n = true;
            return this;
        }

        /* renamed from: T */
        public c d(H0 h02) {
            if (h02 == null) {
                v(37);
            }
            this.f134674a = h02;
            return this;
        }

        /* renamed from: U */
        public c r(List<n0> list) {
            if (list == null) {
                v(21);
            }
            this.f134691r = list;
            return this;
        }

        /* renamed from: V */
        public c b(List<u0> list) {
            if (list == null) {
                v(19);
            }
            this.f134680g = list;
            return this;
        }

        /* renamed from: W */
        public c f(C15574u uVar) {
            if (uVar == null) {
                v(12);
            }
            this.f134677d = uVar;
            return this;
        }

        public C15579z g() {
            return this.f134697x.M0(this);
        }

        public <V> C15579z.a<C15579z> k(C15554a.C3296a<V> aVar, V v10) {
            if (aVar == null) {
                v(39);
            }
            this.f134694u.put(aVar, v10);
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C15749s(C15566m mVar, C15579z zVar, C15649h hVar, C17069f fVar, C15555b.a aVar, i0 i0Var) {
        super(mVar, hVar, fVar, i0Var);
        if (mVar == null) {
            S(0);
        }
        if (hVar == null) {
            S(1);
        }
        if (fVar == null) {
            S(2);
        }
        if (aVar == null) {
            S(3);
        }
        if (i0Var == null) {
            S(4);
        }
        this.f134656l = C15573t.f133857i;
        this.f134657m = false;
        this.f134658n = false;
        this.f134659o = false;
        this.f134660p = false;
        this.f134661q = false;
        this.f134662r = false;
        this.f134663s = false;
        this.f134664t = false;
        this.f134665u = false;
        this.f134666v = false;
        this.f134667w = true;
        this.f134668x = false;
        this.f134669y = null;
        this.f134670z = null;
        this.f134647C = null;
        this.f134648D = null;
        this.f134645A = zVar == null ? this : zVar;
        this.f134646B = aVar;
    }

    private i0 N0(boolean z10, C15579z zVar) {
        i0 i0Var;
        if (z10) {
            if (zVar == null) {
                zVar = a();
            }
            i0Var = zVar.i();
        } else {
            i0Var = i0.f133841a;
        }
        if (i0Var == null) {
            S(27);
        }
        return i0Var;
    }

    public static List<u0> O0(C15579z zVar, List<u0> list, J0 j02) {
        if (list == null) {
            S(28);
        }
        if (j02 == null) {
            S(29);
        }
        return P0(zVar, list, j02, false, false, (boolean[]) null);
    }

    public static List<u0> P0(C15579z zVar, List<u0> list, J0 j02, boolean z10, boolean z11, boolean[] zArr) {
        J0 j03 = j02;
        if (list == null) {
            S(30);
        }
        if (j03 == null) {
            S(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (u0 next : list) {
            C18096U type = next.getType();
            Q0 q02 = Q0.IN_VARIANCE;
            C18096U p10 = j03.p(type, q02);
            C18096U w02 = next.w0();
            C18096U p11 = w02 == null ? null : j03.p(w02, q02);
            if (p10 == null) {
                return null;
            }
            if (!((p10 == next.getType() && w02 == p11) || zArr == null)) {
                zArr[0] = true;
            }
            arrayList.add(C15727V.K0(zVar, z10 ? null : next, next.getIndex(), next.getAnnotations(), next.getName(), p10, next.B0(), next.s0(), next.r0(), p11, z11 ? next.i() : i0.f133841a, next instanceof C15727V.b ? new b(((C15727V.b) next).P0()) : null));
        }
        return arrayList;
    }

    private static /* synthetic */ void S(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case 26:
            case 27:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case BuildConfig.MIN_SDK_VERSION:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case BuildConfig.MIN_SDK_VERSION:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case 26:
            case 27:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    private void T0() {
        C17631a<Collection<C15579z>> aVar = this.f134670z;
        if (aVar != null) {
            this.f134669y = aVar.invoke();
            this.f134670z = null;
        }
    }

    private void a1(boolean z10) {
        this.f134665u = z10;
    }

    private void b1(boolean z10) {
        this.f134664t = z10;
    }

    private void d1(C15579z zVar) {
        this.f134647C = zVar;
    }

    public boolean D0() {
        return this.f134664t;
    }

    public boolean E() {
        return this.f134661q;
    }

    public void E0(Collection<? extends C15555b> collection) {
        if (collection == null) {
            S(17);
        }
        this.f134669y = collection;
        Iterator<? extends C15555b> it = collection.iterator();
        while (it.hasNext()) {
            if (((C15579z) it.next()).G0()) {
                this.f134665u = true;
                return;
            }
        }
    }

    public boolean G0() {
        return this.f134665u;
    }

    /* renamed from: K0 */
    public C15579z C(C15566m mVar, C15535F f10, C15574u uVar, C15555b.a aVar, boolean z10) {
        C15579z g10 = x().l(mVar).c(f10).f(uVar).p(aVar).o(z10).g();
        if (g10 == null) {
            S(26);
        }
        return g10;
    }

    public d0 L() {
        return this.f134654j;
    }

    /* access modifiers changed from: protected */
    public abstract C15749s L0(C15566m mVar, C15579z zVar, C15555b.a aVar, C17069f fVar, C15649h hVar, i0 i0Var);

    /* access modifiers changed from: protected */
    public C15579z M0(c cVar) {
        C15720N n10;
        d0 d0Var;
        C18096U p10;
        c cVar2 = cVar;
        if (cVar2 == null) {
            S(25);
        }
        boolean[] zArr = new boolean[1];
        C15649h a10 = cVar.f134692s != null ? C15651j.a(getAnnotations(), cVar.f134692s) : getAnnotations();
        C15566m mVar = cVar2.f134675b;
        C15579z zVar = cVar2.f134678e;
        C15749s L02 = L0(mVar, zVar, cVar2.f134679f, cVar2.f134685l, a10, N0(cVar2.f134688o, zVar));
        List<n0> typeParameters = cVar.f134691r == null ? getTypeParameters() : cVar.f134691r;
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        J0 c10 = C18080D.c(typeParameters, cVar2.f134674a, L02, arrayList, zArr);
        if (c10 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar2.f134681h.isEmpty()) {
            int i10 = 0;
            for (d0 next : cVar2.f134681h) {
                C18096U p11 = c10.p(next.getType(), Q0.IN_VARIANCE);
                if (p11 == null) {
                    return null;
                }
                int i11 = i10 + 1;
                arrayList2.add(C17277h.b(L02, p11, ((C17704f) next.getValue()).a(), next.getAnnotations(), i10));
                zArr[0] = zArr[0] | (p11 != next.getType());
                i10 = i11;
            }
        }
        d0 d0Var2 = cVar2.f134682i;
        if (d0Var2 != null) {
            C18096U p12 = c10.p(d0Var2.getType(), Q0.IN_VARIANCE);
            if (p12 == null) {
                return null;
            }
            C15720N n11 = new C15720N(L02, new C17702d(L02, p12, cVar2.f134682i.getValue()), cVar2.f134682i.getAnnotations());
            zArr[0] = (p12 != cVar2.f134682i.getType()) | zArr[0];
            n10 = n11;
        } else {
            n10 = null;
        }
        d0 d0Var3 = cVar2.f134683j;
        if (d0Var3 != null) {
            d0 c11 = d0Var3.c(c10);
            if (c11 == null) {
                return null;
            }
            zArr[0] = zArr[0] | (c11 != cVar2.f134683j);
            d0Var = c11;
        } else {
            d0Var = null;
        }
        List<u0> P02 = P0(L02, cVar2.f134680g, c10, cVar2.f134689p, cVar2.f134688o, zArr);
        if (P02 == null || (p10 = c10.p(cVar2.f134684k, Q0.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z10 = zArr[0] | (p10 != cVar2.f134684k);
        zArr[0] = z10;
        if (!z10 && cVar2.f134696w) {
            return this;
        }
        J0 j02 = c10;
        L02.R0(n10, d0Var, arrayList2, arrayList, P02, p10, cVar2.f134676c, cVar2.f134677d);
        L02.f1(this.f134657m);
        L02.c1(this.f134658n);
        L02.X0(this.f134659o);
        L02.e1(this.f134660p);
        L02.i1(this.f134661q);
        L02.h1(this.f134666v);
        L02.W0(this.f134662r);
        L02.V0(this.f134663s);
        L02.Y0(this.f134667w);
        L02.b1(cVar.f134690q);
        L02.a1(cVar.f134693t);
        L02.Z0(cVar.f134695v != null ? cVar.f134695v.booleanValue() : this.f134668x);
        if (!cVar.f134694u.isEmpty() || this.f134648D != null) {
            Map<C15554a.C3296a<?>, Object> B10 = cVar.f134694u;
            Map<C15554a.C3296a<?>, Object> map = this.f134648D;
            if (map != null) {
                for (Map.Entry next2 : map.entrySet()) {
                    if (!B10.containsKey(next2.getKey())) {
                        B10.put(next2.getKey(), next2.getValue());
                    }
                }
            }
            if (B10.size() == 1) {
                L02.f134648D = Collections.singletonMap(B10.keySet().iterator().next(), B10.values().iterator().next());
            } else {
                L02.f134648D = B10;
            }
        }
        if (cVar2.f134687n || t0() != null) {
            L02.d1((t0() != null ? t0() : this).c(j02));
        }
        if (cVar2.f134686m && !a().e().isEmpty()) {
            if (cVar2.f134674a.f()) {
                C17631a<Collection<C15579z>> aVar = this.f134670z;
                if (aVar != null) {
                    L02.f134670z = aVar;
                } else {
                    L02.E0(e());
                }
            } else {
                L02.f134670z = new a(j02);
            }
        }
        return L02;
    }

    public d0 O() {
        return this.f134653i;
    }

    public boolean Q0() {
        return this.f134667w;
    }

    public C15749s R0(d0 d0Var, d0 d0Var2, List<d0> list, List<? extends n0> list2, List<u0> list3, C18096U u10, C15535F f10, C15574u uVar) {
        if (list == null) {
            S(5);
        }
        if (list2 == null) {
            S(6);
        }
        if (list3 == null) {
            S(7);
        }
        if (uVar == null) {
            S(8);
        }
        this.f134649e = C16877v.t1(list2);
        this.f134650f = C16877v.t1(list3);
        this.f134651g = u10;
        this.f134655k = f10;
        this.f134656l = uVar;
        this.f134653i = d0Var;
        this.f134654j = d0Var2;
        this.f134652h = list;
        int i10 = 0;
        int i11 = 0;
        while (i11 < list2.size()) {
            n0 n0Var = (n0) list2.get(i11);
            if (n0Var.getIndex() == i11) {
                i11++;
            } else {
                throw new IllegalStateException(n0Var + " index is " + n0Var.getIndex() + " but position is " + i11);
            }
        }
        while (i10 < list3.size()) {
            u0 u0Var = list3.get(i10);
            if (u0Var.getIndex() == i10) {
                i10++;
            } else {
                throw new IllegalStateException(u0Var + "index is " + u0Var.getIndex() + " but position is " + i10);
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public c S0(J0 j02) {
        if (j02 == null) {
            S(24);
        }
        return new c(this, j02.j(), b(), u(), getVisibility(), h(), j(), y0(), O(), getReturnType(), (C17069f) null);
    }

    public <V> V T(C15554a.C3296a<V> aVar) {
        Map map = this.f134648D;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    public <V> void U0(C15554a.C3296a<V> aVar, Object obj) {
        if (this.f134648D == null) {
            this.f134648D = new LinkedHashMap();
        }
        this.f134648D.put(aVar, obj);
    }

    public void V0(boolean z10) {
        this.f134663s = z10;
    }

    public void W0(boolean z10) {
        this.f134662r = z10;
    }

    public void X0(boolean z10) {
        this.f134659o = z10;
    }

    public boolean Y() {
        return this.f134663s;
    }

    public void Y0(boolean z10) {
        this.f134667w = z10;
    }

    public void Z0(boolean z10) {
        this.f134668x = z10;
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        return oVar.b(this, d10);
    }

    public void c1(boolean z10) {
        this.f134658n = z10;
    }

    public Collection<? extends C15579z> e() {
        T0();
        Collection<? extends C15579z> collection = this.f134669y;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            S(14);
        }
        return collection;
    }

    public void e1(boolean z10) {
        this.f134660p = z10;
    }

    public void f1(boolean z10) {
        this.f134657m = z10;
    }

    public void g1(C18096U u10) {
        if (u10 == null) {
            S(11);
        }
        this.f134651g = u10;
    }

    public C18096U getReturnType() {
        return this.f134651g;
    }

    public List<n0> getTypeParameters() {
        List<n0> list = this.f134649e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    public C15574u getVisibility() {
        C15574u uVar = this.f134656l;
        if (uVar == null) {
            S(16);
        }
        return uVar;
    }

    public C15555b.a h() {
        C15555b.a aVar = this.f134646B;
        if (aVar == null) {
            S(21);
        }
        return aVar;
    }

    public void h1(boolean z10) {
        this.f134666v = z10;
    }

    public boolean i0() {
        return this.f134668x;
    }

    public void i1(boolean z10) {
        this.f134661q = z10;
    }

    public boolean isExternal() {
        return this.f134659o;
    }

    public boolean isInfix() {
        if (this.f134658n) {
            return true;
        }
        for (C15579z isInfix : a().e()) {
            if (isInfix.isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f134660p;
    }

    public boolean isOperator() {
        if (this.f134657m) {
            return true;
        }
        for (C15579z isOperator : a().e()) {
            if (isOperator.isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f134666v;
    }

    public List<u0> j() {
        List<u0> list = this.f134650f;
        if (list == null) {
            S(19);
        }
        return list;
    }

    public void j1(C15574u uVar) {
        if (uVar == null) {
            S(10);
        }
        this.f134656l = uVar;
    }

    public boolean m0() {
        return this.f134662r;
    }

    public C15579z t0() {
        return this.f134647C;
    }

    public C15535F u() {
        C15535F f10 = this.f134655k;
        if (f10 == null) {
            S(15);
        }
        return f10;
    }

    public C15579z.a<? extends C15579z> x() {
        c S02 = S0(J0.f147823b);
        if (S02 == null) {
            S(23);
        }
        return S02;
    }

    public List<d0> y0() {
        List<d0> list = this.f134652h;
        if (list == null) {
            S(13);
        }
        return list;
    }

    public C15579z c(J0 j02) {
        if (j02 == null) {
            S(22);
        }
        if (j02.k()) {
            return this;
        }
        return S0(j02).s(a()).n().K(true).g();
    }

    public C15579z a() {
        C15579z zVar = this.f134645A;
        C15579z a10 = zVar == this ? this : zVar.a();
        if (a10 == null) {
            S(20);
        }
        return a10;
    }
}
