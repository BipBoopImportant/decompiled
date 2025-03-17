package gJ;

import DI.C15534E;
import DI.C15535F;
import DI.C15554a;
import DI.C15555b;
import DI.C15558e;
import DI.C15566m;
import DI.C15570q;
import DI.C15573t;
import DI.C15574u;
import DI.C15579z;
import DI.Z;
import DI.a0;
import DI.d0;
import DI.n0;
import DI.u0;
import EJ.C15671l;
import GI.C15716J;
import GI.C15717K;
import GI.C15749s;
import XH.C16807N;
import XH.v;
import YH.C16877v;
import cJ.C17069f;
import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import com.sugarcube.core.logger.DslKt;
import d9.M;
import gJ.C17279j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kJ.C17506e;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import org.maplibre.android.log.Logger;
import uJ.C18090N;
import uJ.C18096U;
import uJ.C18100Y;
import uJ.C18116h;
import uJ.x0;
import uJ.y0;
import vJ.e;
import vJ.f;
import vJ.g;

/* renamed from: gJ.o  reason: case insensitive filesystem */
public class C17284o {

    /* renamed from: e  reason: collision with root package name */
    private static final List<C17279j> f143310e;

    /* renamed from: f  reason: collision with root package name */
    public static final C17284o f143311f;

    /* renamed from: g  reason: collision with root package name */
    private static final e.a f143312g;

    /* renamed from: a  reason: collision with root package name */
    private final vJ.g f143313a;

    /* renamed from: b  reason: collision with root package name */
    private final vJ.f f143314b;

    /* renamed from: c  reason: collision with root package name */
    private final e.a f143315c;

    /* renamed from: d  reason: collision with root package name */
    private final p<C18096U, C18096U, Boolean> f143316d;

    /* renamed from: gJ.o$a */
    static class a implements e.a {
        a() {
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = DslKt.INDICATOR_BACKGROUND;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean a(y0 y0Var, y0 y0Var2) {
            if (y0Var == null) {
                b(0);
            }
            if (y0Var2 == null) {
                b(1);
            }
            return y0Var.equals(y0Var2);
        }
    }

    /* renamed from: gJ.o$b */
    static class b implements p<D, D, v<C15554a, C15554a>> {
        b() {
        }

        /* renamed from: a */
        public v<C15554a, C15554a> invoke(D d10, D d11) {
            return new v<>(d10, d11);
        }
    }

    /* renamed from: gJ.o$c */
    static class c implements C17642l<C15555b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15566m f143317a;

        c(C15566m mVar) {
            this.f143317a = mVar;
        }

        /* renamed from: a */
        public Boolean invoke(C15555b bVar) {
            return Boolean.valueOf(bVar.b() == this.f143317a);
        }
    }

    /* renamed from: gJ.o$d */
    static class d implements C17642l<C15555b, C15554a> {
        d() {
        }

        /* renamed from: a */
        public C15555b invoke(C15555b bVar) {
            return bVar;
        }
    }

    /* renamed from: gJ.o$e */
    static class e implements C17642l<C15555b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15558e f143318a;

        e(C15558e eVar) {
            this.f143318a = eVar;
        }

        /* renamed from: a */
        public Boolean invoke(C15555b bVar) {
            boolean z10 = false;
            if (!C15573t.g(bVar.getVisibility()) && C15573t.h(bVar, this.f143318a, false)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: gJ.o$f */
    static class f implements C17642l<C15555b, C15554a> {
        f() {
        }

        /* renamed from: a */
        public C15554a invoke(C15555b bVar) {
            return bVar;
        }
    }

    /* renamed from: gJ.o$g */
    static class g implements C17642l<C15555b, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17283n f143319a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15555b f143320b;

        g(C17283n nVar, C15555b bVar) {
            this.f143319a = nVar;
            this.f143320b = bVar;
        }

        /* renamed from: a */
        public C16807N invoke(C15555b bVar) {
            this.f143319a.b(this.f143320b, bVar);
            return C16807N.f139792a;
        }
    }

    /* renamed from: gJ.o$h */
    static /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f143321a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f143322b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f143323c;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0073 */
        static {
            /*
                DI.F[] r0 = DI.C15535F.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f143323c = r0
                r1 = 1
                DI.F r2 = DI.C15535F.FINAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f143323c     // Catch:{ NoSuchFieldError -> 0x001d }
                DI.F r3 = DI.C15535F.SEALED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f143323c     // Catch:{ NoSuchFieldError -> 0x0028 }
                DI.F r4 = DI.C15535F.OPEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f143323c     // Catch:{ NoSuchFieldError -> 0x0033 }
                DI.F r4 = DI.C15535F.ABSTRACT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                gJ.o$i$a[] r3 = gJ.C17284o.i.a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f143322b = r3
                gJ.o$i$a r4 = gJ.C17284o.i.a.OVERRIDABLE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r3 = f143322b     // Catch:{ NoSuchFieldError -> 0x004e }
                gJ.o$i$a r4 = gJ.C17284o.i.a.CONFLICT     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f143322b     // Catch:{ NoSuchFieldError -> 0x0058 }
                gJ.o$i$a r4 = gJ.C17284o.i.a.INCOMPATIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                gJ.j$b[] r3 = gJ.C17279j.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f143321a = r3
                gJ.j$b r4 = gJ.C17279j.b.OVERRIDABLE     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r1 = f143321a     // Catch:{ NoSuchFieldError -> 0x0073 }
                gJ.j$b r3 = gJ.C17279j.b.INCOMPATIBLE     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f143321a     // Catch:{ NoSuchFieldError -> 0x007d }
                gJ.j$b r1 = gJ.C17279j.b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gJ.C17284o.h.<clinit>():void");
        }
    }

    /* renamed from: gJ.o$i */
    public static class i {

        /* renamed from: c  reason: collision with root package name */
        private static final i f143324c = new i(a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a  reason: collision with root package name */
        private final a f143325a;

        /* renamed from: b  reason: collision with root package name */
        private final String f143326b;

        /* renamed from: gJ.o$i$a */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f143325a = aVar;
            this.f143326b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto L_0x000f
                if (r10 == r2) goto L_0x000f
                if (r10 == r1) goto L_0x000f
                if (r10 == r0) goto L_0x000f
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L_0x0011
            L_0x000f:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L_0x0011:
                if (r10 == r3) goto L_0x001b
                if (r10 == r2) goto L_0x001b
                if (r10 == r1) goto L_0x001b
                if (r10 == r0) goto L_0x001b
                r5 = r2
                goto L_0x001c
            L_0x001b:
                r5 = r1
            L_0x001c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L_0x0031
                if (r10 == r2) goto L_0x0031
                if (r10 == r1) goto L_0x002e
                if (r10 == r0) goto L_0x0031
                r5[r8] = r7
                goto L_0x0035
            L_0x002e:
                r5[r8] = r6
                goto L_0x0035
            L_0x0031:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L_0x0035:
                switch(r10) {
                    case 1: goto L_0x0045;
                    case 2: goto L_0x0045;
                    case 3: goto L_0x0045;
                    case 4: goto L_0x0045;
                    case 5: goto L_0x0040;
                    case 6: goto L_0x003b;
                    default: goto L_0x0038;
                }
            L_0x0038:
                r5[r3] = r6
                goto L_0x0047
            L_0x003b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L_0x0047
            L_0x0040:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L_0x0047
            L_0x0045:
                r5[r3] = r7
            L_0x0047:
                if (r10 == r3) goto L_0x005a
                if (r10 == r2) goto L_0x0055
                if (r10 == r1) goto L_0x0050
                if (r10 == r0) goto L_0x0050
                goto L_0x005e
            L_0x0050:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L_0x005e
            L_0x0055:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L_0x005e
            L_0x005a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L_0x005e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L_0x0070
                if (r10 == r2) goto L_0x0070
                if (r10 == r1) goto L_0x0070
                if (r10 == r0) goto L_0x0070
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L_0x0075
            L_0x0070:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L_0x0075:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: gJ.C17284o.i.a(int):void");
        }

        public static i b(String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        public static i d(String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        public static i e() {
            i iVar = f143324c;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        public a c() {
            a aVar = this.f143325a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }

        public String toString() {
            return this.f143325a + ": " + this.f143326b;
        }
    }

    static {
        Class<C17279j> cls = C17279j.class;
        f143310e = C16877v.t1(ServiceLoader.load(cls, cls.getClassLoader()));
        a aVar = new a();
        f143312g = aVar;
        f143311f = new C17284o(aVar, g.a.f149050a, f.a.f149049a, (p<C18096U, C18096U, Boolean>) null);
    }

    private C17284o(e.a aVar, vJ.g gVar, vJ.f fVar, p<C18096U, C18096U, Boolean> pVar) {
        if (aVar == null) {
            a(5);
        }
        if (gVar == null) {
            a(6);
        }
        if (fVar == null) {
            a(7);
        }
        this.f143315c = aVar;
        this.f143313a = gVar;
        this.f143314b = fVar;
        this.f143316d = pVar;
    }

    private static boolean A(Z z10, Z z11) {
        if (z10 == null || z11 == null) {
            return true;
        }
        return H(z10, z11);
    }

    public static boolean B(C15554a aVar, C15554a aVar2) {
        if (aVar == null) {
            a(65);
        }
        if (aVar2 == null) {
            a(66);
        }
        C18096U returnType = aVar.getReturnType();
        C18096U returnType2 = aVar2.getReturnType();
        if (!H(aVar, aVar2)) {
            return false;
        }
        x0 l10 = f143311f.l(aVar.getTypeParameters(), aVar2.getTypeParameters());
        if (aVar instanceof C15579z) {
            return G(aVar, returnType, aVar2, returnType2, l10);
        }
        if (aVar instanceof a0) {
            a0 a0Var = (a0) aVar;
            a0 a0Var2 = (a0) aVar2;
            if (!A(a0Var.g(), a0Var2.g())) {
                return false;
            }
            return (!a0Var.N() || !a0Var2.N()) ? (a0Var.N() || !a0Var2.N()) && G(aVar, returnType, aVar2, returnType2, l10) : C18116h.f147889a.m(l10, returnType.Q0(), returnType2.Q0());
        }
        throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
    }

    private static boolean C(C15554a aVar, Collection<C15554a> collection) {
        if (aVar == null) {
            a(69);
        }
        if (collection == null) {
            a(70);
        }
        for (C15554a B10 : collection) {
            if (!B(aVar, B10)) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(C15554a aVar, C18096U u10, C15554a aVar2, C18096U u11, x0 x0Var) {
        if (aVar == null) {
            a(71);
        }
        if (u10 == null) {
            a(72);
        }
        if (aVar2 == null) {
            a(73);
        }
        if (u11 == null) {
            a(74);
        }
        if (x0Var == null) {
            a(75);
        }
        return C18116h.f147889a.t(x0Var, u10.Q0(), u11.Q0());
    }

    private static boolean H(C15570q qVar, C15570q qVar2) {
        if (qVar == null) {
            a(67);
        }
        if (qVar2 == null) {
            a(68);
        }
        Integer d10 = C15573t.d(qVar.getVisibility(), qVar2.getVisibility());
        return d10 == null || d10.intValue() >= 0;
    }

    public static boolean I(C15534E e10, C15534E e11, boolean z10) {
        if (e10 == null) {
            a(55);
        }
        if (e11 == null) {
            a(56);
        }
        return !C15573t.g(e11.getVisibility()) && C15573t.h(e11, e10, z10);
    }

    public static <D extends C15554a> boolean J(D d10, D d11, boolean z10, boolean z11) {
        if (d10 == null) {
            a(13);
        }
        if (d11 == null) {
            a(14);
        }
        if (!d10.equals(d11) && C17276g.f143305a.k(d10.a(), d11.a(), z10, z11)) {
            return true;
        }
        C15554a a10 = d11.a();
        for (C15554a k10 : C17278i.d(d10)) {
            if (C17276g.f143305a.k(a10, k10, z10, z11)) {
                return true;
            }
        }
        return false;
    }

    public static void K(C15555b bVar, C17642l<C15555b, C16807N> lVar) {
        C15574u uVar;
        if (bVar == null) {
            a(105);
        }
        for (C15555b bVar2 : bVar.e()) {
            if (bVar2.getVisibility() == C15573t.f133855g) {
                K(bVar2, lVar);
            }
        }
        if (bVar.getVisibility() == C15573t.f133855g) {
            C15574u h10 = h(bVar);
            if (h10 == null) {
                if (lVar != null) {
                    lVar.invoke(bVar);
                }
                uVar = C15573t.f133853e;
            } else {
                uVar = h10;
            }
            if (bVar instanceof C15717K) {
                ((C15717K) bVar).c1(uVar);
                for (Z K10 : ((a0) bVar).y()) {
                    K(K10, h10 == null ? null : lVar);
                }
            } else if (bVar instanceof C15749s) {
                ((C15749s) bVar).j1(uVar);
            } else {
                C15716J j10 = (C15716J) bVar;
                j10.O0(uVar);
                if (uVar != j10.W().getVisibility()) {
                    j10.M0(false);
                }
            }
        }
    }

    public static <H> H L(Collection<H> collection, C17642l<H, C15554a> lVar) {
        H h10;
        if (collection == null) {
            a(76);
        }
        if (lVar == null) {
            a(77);
        }
        if (collection.size() == 1) {
            H v02 = C16877v.v0(collection);
            if (v02 == null) {
                a(78);
            }
            return v02;
        }
        ArrayList arrayList = new ArrayList(2);
        List<C15554a> L02 = C16877v.L0(collection, lVar);
        H v03 = C16877v.v0(collection);
        C15554a invoke = lVar.invoke(v03);
        for (H next : collection) {
            C15554a invoke2 = lVar.invoke(next);
            if (C(invoke2, L02)) {
                arrayList.add(next);
            }
            if (B(invoke2, invoke) && !B(invoke, invoke2)) {
                v03 = next;
            }
        }
        if (arrayList.isEmpty()) {
            if (v03 == null) {
                a(79);
            }
            return v03;
        } else if (arrayList.size() == 1) {
            H v04 = C16877v.v0(arrayList);
            if (v04 == null) {
                a(80);
            }
            return v04;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    h10 = null;
                    break;
                }
                h10 = it.next();
                if (!C18090N.b(lVar.invoke(h10).getReturnType())) {
                    break;
                }
            }
            if (h10 != null) {
                return h10;
            }
            H v05 = C16877v.v0(arrayList);
            if (v05 == null) {
                a(82);
            }
            return v05;
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        int i12 = i10;
        if (!(i12 == 11 || i12 == 12 || i12 == 16 || i12 == 21 || i12 == 93 || i12 == 96 || i12 == 101 || i12 == 42 || i12 == 43)) {
            switch (i12) {
                case BuildConfig.MIN_SDK_VERSION:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i12) {
                        case 30:
                        case 31:
                        case 32:
                        case BuildConfig.TARGET_SDK_VERSION:
                        case 34:
                        case ImageFormat.YUV_420_888:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i12) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i12) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i12 == 11 || i12 == 12 || i12 == 16 || i12 == 21 || i12 == 93 || i12 == 96 || i12 == 101 || i12 == 42 || i12 == 43)) {
            switch (i12) {
                case BuildConfig.MIN_SDK_VERSION:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i12) {
                        case 30:
                        case 31:
                        case 32:
                        case BuildConfig.TARGET_SDK_VERSION:
                        case 34:
                        case ImageFormat.YUV_420_888:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i12) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i12) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i11 = 2;
        Object[] objArr = new Object[i11];
        switch (i12) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case BuildConfig.MIN_SDK_VERSION:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case BuildConfig.TARGET_SDK_VERSION:
            case 34:
            case ImageFormat.YUV_420_888:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case CheckoutActivity.RESULT_CANCELED:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case 64:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = DslKt.INDICATOR_BACKGROUND;
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case Logger.NONE /*99*/:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case CheckoutActivity.RESULT_ERROR:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case CheckoutActivity.RESULT_OK:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
        }
        if (i12 == 11 || i12 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i12 != 16) {
            if (i12 != 21) {
                if (i12 == 93) {
                    objArr[1] = "getMinimalModality";
                } else if (i12 == 96) {
                    objArr[1] = "filterVisibleFakeOverrides";
                } else if (i12 != 101) {
                    if (i12 != 42 && i12 != 43) {
                        switch (i12) {
                            case BuildConfig.MIN_SDK_VERSION:
                            case 25:
                            case 26:
                            case 27:
                                break;
                            default:
                                switch (i12) {
                                    case 30:
                                    case 31:
                                    case 32:
                                    case BuildConfig.TARGET_SDK_VERSION:
                                    case 34:
                                    case ImageFormat.YUV_420_888:
                                    case 36:
                                    case 37:
                                        objArr[1] = "isOverridableByWithoutExternalConditions";
                                        break;
                                    default:
                                        switch (i12) {
                                            case 78:
                                            case 79:
                                            case 80:
                                            case 81:
                                            case 82:
                                                objArr[1] = "selectMostSpecificMember";
                                                break;
                                            default:
                                                switch (i12) {
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                        objArr[1] = "determineModalityForFakeOverride";
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                        break;
                                                }
                                        }
                                }
                        }
                    } else {
                        objArr[1] = "createTypeCheckerState";
                    }
                } else {
                    objArr[1] = "extractMembersOverridableInBothWays";
                }
            }
            objArr[1] = "isOverridableBy";
        } else {
            objArr[1] = "getOverriddenDeclarations";
        }
        switch (i12) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case BuildConfig.MIN_SDK_VERSION:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case BuildConfig.TARGET_SDK_VERSION:
            case 34:
            case ImageFormat.YUV_420_888:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case CheckoutActivity.RESULT_CANCELED:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeCheckerState";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case Logger.NONE /*99*/:
            case CheckoutActivity.RESULT_OK:
            case CheckoutActivity.RESULT_ERROR:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i12 == 11 || i12 == 12 || i12 == 16 || i12 == 21 || i12 == 93 || i12 == 96 || i12 == 101 || i12 == 42 || i12 == 43)) {
            switch (i12) {
                case BuildConfig.MIN_SDK_VERSION:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i12) {
                        case 30:
                        case 31:
                        case 32:
                        case BuildConfig.TARGET_SDK_VERSION:
                        case 34:
                        case ImageFormat.YUV_420_888:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i12) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i12) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            th2 = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th2 = new IllegalStateException(format);
        throw th2;
    }

    private static boolean b(Collection<C15555b> collection) {
        if (collection == null) {
            a(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        return C16877v.f0(collection, new c(collection.iterator().next().b()));
    }

    private static boolean c(n0 n0Var, n0 n0Var2, x0 x0Var) {
        if (n0Var == null) {
            a(47);
        }
        if (n0Var2 == null) {
            a(48);
        }
        if (x0Var == null) {
            a(49);
        }
        List<C18096U> upperBounds = n0Var.getUpperBounds();
        ArrayList arrayList = new ArrayList(n0Var2.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (C18096U next : upperBounds) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (d(next, (C18096U) listIterator.next(), x0Var)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    private static boolean d(C18096U u10, C18096U u11, x0 x0Var) {
        if (u10 == null) {
            a(44);
        }
        if (u11 == null) {
            a(45);
        }
        if (x0Var == null) {
            a(46);
        }
        if (!C18100Y.a(u10) || !C18100Y.a(u11)) {
            return C18116h.f147889a.m(x0Var, u10.Q0(), u11.Q0());
        }
        return true;
    }

    private static i e(C15554a aVar, C15554a aVar2) {
        boolean z10 = false;
        boolean z11 = aVar.O() == null;
        if (aVar2.O() == null) {
            z10 = true;
        }
        if (z11 != z10) {
            return i.d("Receiver presence mismatch");
        }
        if (aVar.j().size() != aVar2.j().size()) {
            return i.d("Value parameter number mismatch");
        }
        return null;
    }

    private static void f(C15555b bVar, Set<C15555b> set) {
        if (bVar == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (bVar.h().a()) {
            set.add(bVar);
        } else if (!bVar.e().isEmpty()) {
            for (C15555b f10 : bVar.e()) {
                f(f10, set);
            }
        } else {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
        }
    }

    private static List<C18096U> g(C15554a aVar) {
        d0 O10 = aVar.O();
        ArrayList arrayList = new ArrayList();
        if (O10 != null) {
            arrayList.add(O10.getType());
        }
        for (u0 type : aVar.j()) {
            arrayList.add(type.getType());
        }
        return arrayList;
    }

    private static C15574u h(C15555b bVar) {
        if (bVar == null) {
            a(106);
        }
        Collection<? extends C15555b> e10 = bVar.e();
        C15574u u10 = u(e10);
        if (u10 == null) {
            return null;
        }
        if (bVar.h() != C15555b.a.FAKE_OVERRIDE) {
            return u10.f();
        }
        for (C15555b bVar2 : e10) {
            if (bVar2.u() != C15535F.ABSTRACT && !bVar2.getVisibility().equals(u10)) {
                return null;
            }
        }
        return u10;
    }

    public static C17284o i(vJ.g gVar, e.a aVar) {
        if (gVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new C17284o(aVar, gVar, f.a.f149049a, (p<C18096U, C18096U, Boolean>) null);
    }

    private static void j(Collection<C15555b> collection, C15558e eVar, C17283n nVar) {
        if (collection == null) {
            a(83);
        }
        if (eVar == null) {
            a(84);
        }
        if (nVar == null) {
            a(85);
        }
        Collection<C15555b> t10 = t(eVar, collection);
        boolean isEmpty = t10.isEmpty();
        if (!isEmpty) {
            collection = t10;
        }
        C15555b C10 = ((C15555b) L(collection, new d())).C(eVar, n(collection, eVar), isEmpty ? C15573t.f133856h : C15573t.f133855g, C15555b.a.FAKE_OVERRIDE, false);
        nVar.d(C10, collection);
        nVar.a(C10);
    }

    private static void k(C15558e eVar, Collection<C15555b> collection, C17283n nVar) {
        if (eVar == null) {
            a(62);
        }
        if (collection == null) {
            a(63);
        }
        if (nVar == null) {
            a(64);
        }
        if (b(collection)) {
            for (C15555b singleton : collection) {
                j(Collections.singleton(singleton), eVar, nVar);
            }
            return;
        }
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty()) {
            j(p(C17293x.a(linkedList), linkedList, nVar), eVar, nVar);
        }
    }

    private x0 l(List<n0> list, List<n0> list2) {
        if (list == null) {
            a(40);
        }
        if (list2 == null) {
            a(41);
        }
        if (list.isEmpty()) {
            x0 N02 = new C17285p((Map<y0, ? extends y0>) null, this.f143315c, this.f143313a, this.f143314b, this.f143316d).N0(true, true);
            if (N02 == null) {
                a(42);
            }
            return N02;
        }
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashMap.put(list.get(i10).k(), list2.get(i10).k());
        }
        x0 N03 = new C17285p(hashMap, this.f143315c, this.f143313a, this.f143314b, this.f143316d).N0(true, true);
        if (N03 == null) {
            a(43);
        }
        return N03;
    }

    public static C17284o m(vJ.g gVar) {
        if (gVar == null) {
            a(0);
        }
        return new C17284o(f143312g, gVar, f.a.f149049a, (p<C18096U, C18096U, Boolean>) null);
    }

    private static C15535F n(Collection<C15555b> collection, C15558e eVar) {
        if (collection == null) {
            a(86);
        }
        if (eVar == null) {
            a(87);
        }
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (C15555b next : collection) {
            int i10 = h.f143323c[next.u().ordinal()];
            if (i10 == 1) {
                C15535F f10 = C15535F.FINAL;
                if (f10 == null) {
                    a(88);
                }
                return f10;
            } else if (i10 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + next);
            } else if (i10 == 3) {
                z11 = true;
            } else if (i10 == 4) {
                z12 = true;
            }
        }
        if (!(!eVar.m0() || eVar.u() == C15535F.ABSTRACT || eVar.u() == C15535F.SEALED)) {
            z10 = true;
        }
        if (z11 && !z12) {
            C15535F f11 = C15535F.OPEN;
            if (f11 == null) {
                a(89);
            }
            return f11;
        } else if (z11 || !z12) {
            HashSet hashSet = new HashSet();
            for (C15555b z13 : collection) {
                hashSet.addAll(z(z13));
            }
            return y(r(hashSet), z10, eVar.u());
        } else {
            C15535F u10 = z10 ? eVar.u() : C15535F.ABSTRACT;
            if (u10 == null) {
                a(90);
            }
            return u10;
        }
    }

    private Collection<C15555b> o(C15555b bVar, Collection<? extends C15555b> collection, C15558e eVar, C17283n nVar) {
        if (bVar == null) {
            a(57);
        }
        if (collection == null) {
            a(58);
        }
        if (eVar == null) {
            a(59);
        }
        if (nVar == null) {
            a(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        C15671l b10 = C15671l.b();
        for (C15555b bVar2 : collection) {
            i.a c10 = D(bVar2, bVar, eVar).c();
            boolean I10 = I(bVar, bVar2, false);
            int i10 = h.f143322b[c10.ordinal()];
            if (i10 == 1) {
                if (I10) {
                    b10.add(bVar2);
                }
                arrayList.add(bVar2);
            } else if (i10 == 2) {
                if (I10) {
                    nVar.c(bVar2, bVar);
                }
                arrayList.add(bVar2);
            }
        }
        nVar.d(bVar, b10);
        return arrayList;
    }

    private static Collection<C15555b> p(C15555b bVar, Queue<C15555b> queue, C17283n nVar) {
        if (bVar == null) {
            a(CheckoutActivity.RESULT_ERROR);
        }
        if (queue == null) {
            a(103);
        }
        if (nVar == null) {
            a(104);
        }
        return q(bVar, queue, new f(), new g(nVar, bVar));
    }

    public static <H> Collection<H> q(H h10, Collection<H> collection, C17642l<H, C15554a> lVar, C17642l<H, C16807N> lVar2) {
        if (h10 == null) {
            a(97);
        }
        if (collection == null) {
            a(98);
        }
        if (lVar == null) {
            a(99);
        }
        if (lVar2 == null) {
            a(100);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h10);
        C15554a invoke = lVar.invoke(h10);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            C15554a invoke2 = lVar.invoke(next);
            if (h10 == next) {
                it.remove();
            } else {
                i.a x10 = x(invoke, invoke2);
                if (x10 == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (x10 == i.a.CONFLICT) {
                    lVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static <D extends C15554a> Set<D> r(Set<D> set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && C17506e.y(C17506e.s((C15566m) set.iterator().next())), (C17631a<?>) null, new b());
    }

    public static <D> Set<D> s(Set<D> set, boolean z10, C17631a<?> aVar, p<? super D, ? super D, v<C15554a, C15554a>> pVar) {
        if (set == null) {
            a(9);
        }
        if (pVar == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (D next : set) {
            if (aVar != null) {
                aVar.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(next);
                    break;
                }
                v invoke = pVar.invoke(next, it.next());
                C15554a aVar2 = (C15554a) invoke.a();
                C15554a aVar3 = (C15554a) invoke.b();
                if (J(aVar2, aVar3, z10, true)) {
                    it.remove();
                } else if (J(aVar3, aVar2, z10, true)) {
                    break;
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection<C15555b> t(C15558e eVar, Collection<C15555b> collection) {
        if (eVar == null) {
            a(94);
        }
        if (collection == null) {
            a(95);
        }
        List<T> s02 = C16877v.s0(collection, new e(eVar));
        if (s02 == null) {
            a(96);
        }
        return s02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static DI.C15574u u(java.util.Collection<? extends DI.C15555b> r5) {
        /*
            if (r5 != 0) goto L_0x0007
            r0 = 107(0x6b, float:1.5E-43)
            a(r0)
        L_0x0007:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0010
            DI.u r5 = DI.C15573t.f133860l
            return r5
        L_0x0010:
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
        L_0x0015:
            r2 = r1
        L_0x0016:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0038
            java.lang.Object r3 = r0.next()
            DI.b r3 = (DI.C15555b) r3
            DI.u r3 = r3.getVisibility()
            if (r2 != 0) goto L_0x002a
        L_0x0028:
            r2 = r3
            goto L_0x0016
        L_0x002a:
            java.lang.Integer r4 = DI.C15573t.d(r3, r2)
            if (r4 != 0) goto L_0x0031
            goto L_0x0015
        L_0x0031:
            int r4 = r4.intValue()
            if (r4 <= 0) goto L_0x0016
            goto L_0x0028
        L_0x0038:
            if (r2 != 0) goto L_0x003b
            return r1
        L_0x003b:
            java.util.Iterator r5 = r5.iterator()
        L_0x003f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r5.next()
            DI.b r0 = (DI.C15555b) r0
            DI.u r0 = r0.getVisibility()
            java.lang.Integer r0 = DI.C15573t.d(r2, r0)
            if (r0 == 0) goto L_0x005b
            int r0 = r0.intValue()
            if (r0 >= 0) goto L_0x003f
        L_0x005b:
            return r1
        L_0x005c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gJ.C17284o.u(java.util.Collection):DI.u");
    }

    public static i w(C15554a aVar, C15554a aVar2) {
        boolean z10;
        if (aVar == null) {
            a(38);
        }
        if (aVar2 == null) {
            a(39);
        }
        boolean z11 = aVar instanceof C15579z;
        if ((z11 && !(aVar2 instanceof C15579z)) || (((z10 = aVar instanceof a0)) && !(aVar2 instanceof a0))) {
            return i.d("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
        } else if (!aVar.getName().equals(aVar2.getName())) {
            return i.d("Name mismatch");
        } else {
            i e10 = e(aVar, aVar2);
            if (e10 != null) {
                return e10;
            }
            return null;
        }
    }

    public static i.a x(C15554a aVar, C15554a aVar2) {
        C17284o oVar = f143311f;
        i.a c10 = oVar.D(aVar2, aVar, (C15558e) null).c();
        i.a c11 = oVar.D(aVar, aVar2, (C15558e) null).c();
        i.a aVar3 = i.a.OVERRIDABLE;
        if (c10 == aVar3 && c11 == aVar3) {
            return aVar3;
        }
        i.a aVar4 = i.a.CONFLICT;
        return (c10 == aVar4 || c11 == aVar4) ? aVar4 : i.a.INCOMPATIBLE;
    }

    private static C15535F y(Collection<C15555b> collection, boolean z10, C15535F f10) {
        if (collection == null) {
            a(91);
        }
        if (f10 == null) {
            a(92);
        }
        C15535F f11 = C15535F.ABSTRACT;
        for (C15555b next : collection) {
            C15535F u10 = (!z10 || next.u() != C15535F.ABSTRACT) ? next.u() : f10;
            if (u10.compareTo(f11) < 0) {
                f11 = u10;
            }
        }
        if (f11 == null) {
            a(93);
        }
        return f11;
    }

    public static Set<C15555b> z(C15555b bVar) {
        if (bVar == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(bVar, linkedHashSet);
        return linkedHashSet;
    }

    public i D(C15554a aVar, C15554a aVar2, C15558e eVar) {
        if (aVar == null) {
            a(19);
        }
        if (aVar2 == null) {
            a(20);
        }
        i E10 = E(aVar, aVar2, eVar, false);
        if (E10 == null) {
            a(21);
        }
        return E10;
    }

    public i E(C15554a aVar, C15554a aVar2, C15558e eVar, boolean z10) {
        if (aVar == null) {
            a(22);
        }
        if (aVar2 == null) {
            a(23);
        }
        i F10 = F(aVar, aVar2, z10);
        boolean z11 = F10.c() == i.a.OVERRIDABLE;
        for (C17279j next : f143310e) {
            if (next.a() != C17279j.a.CONFLICTS_ONLY && (!z11 || next.a() != C17279j.a.SUCCESS_ONLY)) {
                int i10 = h.f143321a[next.b(aVar, aVar2, eVar).ordinal()];
                if (i10 == 1) {
                    z11 = true;
                } else if (i10 == 2) {
                    i d10 = i.d("External condition");
                    if (d10 == null) {
                        a(24);
                    }
                    return d10;
                }
            }
        }
        if (!z11) {
            return F10;
        }
        for (C17279j next2 : f143310e) {
            if (next2.a() == C17279j.a.CONFLICTS_ONLY) {
                int i11 = h.f143321a[next2.b(aVar, aVar2, eVar).ordinal()];
                if (i11 == 1) {
                    throw new IllegalStateException("Contract violation in " + next2.getClass().getName() + " condition. It's not supposed to end with success");
                } else if (i11 == 2) {
                    i d11 = i.d("External condition");
                    if (d11 == null) {
                        a(26);
                    }
                    return d11;
                }
            }
        }
        i e10 = i.e();
        if (e10 == null) {
            a(27);
        }
        return e10;
    }

    public i F(C15554a aVar, C15554a aVar2, boolean z10) {
        if (aVar == null) {
            a(28);
        }
        if (aVar2 == null) {
            a(29);
        }
        i w10 = w(aVar, aVar2);
        if (w10 != null) {
            return w10;
        }
        List<C18096U> g10 = g(aVar);
        List<C18096U> g11 = g(aVar2);
        List<n0> typeParameters = aVar.getTypeParameters();
        List<n0> typeParameters2 = aVar2.getTypeParameters();
        int i10 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i10 < g10.size()) {
                if (!vJ.e.f149048a.b(g10.get(i10), g11.get(i10))) {
                    i d10 = i.d("Type parameter number mismatch");
                    if (d10 == null) {
                        a(31);
                    }
                    return d10;
                }
                i10++;
            }
            i b10 = i.b("Type parameter number mismatch");
            if (b10 == null) {
                a(32);
            }
            return b10;
        }
        x0 l10 = l(typeParameters, typeParameters2);
        for (int i11 = 0; i11 < typeParameters.size(); i11++) {
            if (!c(typeParameters.get(i11), typeParameters2.get(i11), l10)) {
                i d11 = i.d("Type parameter bounds mismatch");
                if (d11 == null) {
                    a(33);
                }
                return d11;
            }
        }
        while (i10 < g10.size()) {
            if (!d(g10.get(i10), g11.get(i10), l10)) {
                i d12 = i.d("Value parameter type mismatch");
                if (d12 == null) {
                    a(34);
                }
                return d12;
            }
            i10++;
        }
        if (!(aVar instanceof C15579z) || !(aVar2 instanceof C15579z) || ((C15579z) aVar).isSuspend() == ((C15579z) aVar2).isSuspend()) {
            if (z10) {
                C18096U returnType = aVar.getReturnType();
                C18096U returnType2 = aVar2.getReturnType();
                if (!(returnType == null || returnType2 == null || ((C18100Y.a(returnType2) && C18100Y.a(returnType)) || C18116h.f147889a.t(l10, returnType2.Q0(), returnType.Q0())))) {
                    i b11 = i.b("Return type mismatch");
                    if (b11 == null) {
                        a(36);
                    }
                    return b11;
                }
            }
            i e10 = i.e();
            if (e10 == null) {
                a(37);
            }
            return e10;
        }
        i b12 = i.b("Incompatible suspendability");
        if (b12 == null) {
            a(35);
        }
        return b12;
    }

    public void v(C17069f fVar, Collection<? extends C15555b> collection, Collection<? extends C15555b> collection2, C15558e eVar, C17283n nVar) {
        if (fVar == null) {
            a(50);
        }
        if (collection == null) {
            a(51);
        }
        if (collection2 == null) {
            a(52);
        }
        if (eVar == null) {
            a(53);
        }
        if (nVar == null) {
            a(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        for (C15555b o10 : collection2) {
            linkedHashSet.removeAll(o(o10, collection, eVar, nVar));
        }
        k(eVar, linkedHashSet, nVar);
    }
}
