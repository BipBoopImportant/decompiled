package DI;

import BJ.C15477l;
import DI.x0;
import EJ.C15660a;
import GI.C15723Q;
import YH.g0;
import gJ.C17278i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import oJ.C17705g;
import oJ.C17706h;
import oJ.C17707i;
import uJ.C18083G;
import uJ.C18096U;

/* renamed from: DI.t  reason: case insensitive filesystem */
public class C15573t {

    /* renamed from: a  reason: collision with root package name */
    public static final C15574u f133849a;

    /* renamed from: b  reason: collision with root package name */
    public static final C15574u f133850b;

    /* renamed from: c  reason: collision with root package name */
    public static final C15574u f133851c;

    /* renamed from: d  reason: collision with root package name */
    public static final C15574u f133852d;

    /* renamed from: e  reason: collision with root package name */
    public static final C15574u f133853e;

    /* renamed from: f  reason: collision with root package name */
    public static final C15574u f133854f;

    /* renamed from: g  reason: collision with root package name */
    public static final C15574u f133855g;

    /* renamed from: h  reason: collision with root package name */
    public static final C15574u f133856h;

    /* renamed from: i  reason: collision with root package name */
    public static final C15574u f133857i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<C15574u> f133858j;

    /* renamed from: k  reason: collision with root package name */
    private static final Map<C15574u, Integer> f133859k;

    /* renamed from: l  reason: collision with root package name */
    public static final C15574u f133860l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final C17705g f133861m = new a();

    /* renamed from: n  reason: collision with root package name */
    public static final C17705g f133862n = new b();
    @Deprecated

    /* renamed from: o  reason: collision with root package name */
    public static final C17705g f133863o = new c();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final C15477l f133864p;

    /* renamed from: q  reason: collision with root package name */
    private static final Map<y0, C15574u> f133865q = new HashMap();

    /* renamed from: DI.t$a */
    static class a implements C17705g {
        a() {
        }

        public C18096U getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: DI.t$b */
    static class b implements C17705g {
        b() {
        }

        public C18096U getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: DI.t$c */
    static class c implements C17705g {
        c() {
        }

        public C18096U getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: DI.t$d */
    static class d extends C15571r {
        d(y0 y0Var) {
            super(y0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(C15566m mVar) {
            if (mVar == null) {
                g(0);
            }
            return C17278i.j(mVar) != j0.f133843a;
        }

        public boolean e(C17705g gVar, C15570q qVar, C15566m mVar, boolean z10) {
            C15566m mVar2;
            if (qVar == null) {
                g(1);
            }
            if (mVar == null) {
                g(2);
            }
            if (C17278i.J(qVar) && h(mVar)) {
                return C15573t.f(qVar, mVar);
            }
            if (qVar instanceof C15565l) {
                C15562i b10 = ((C15565l) qVar).b();
                if (z10 && C17278i.G(b10) && C17278i.J(b10) && (mVar instanceof C15565l) && C17278i.J(mVar.b()) && C15573t.f(qVar, mVar)) {
                    return true;
                }
            }
            C15566m mVar3 = qVar;
            while (mVar3 != null) {
                C15566m b11 = mVar3.b();
                if ((b11 instanceof C15558e) && !C17278i.x(b11)) {
                    mVar2 = b11;
                    break;
                }
                boolean z11 = b11 instanceof C15544O;
                mVar3 = b11;
                if (z11) {
                    mVar2 = b11;
                    break;
                }
            }
            mVar2 = mVar3;
            if (mVar2 == null) {
                return false;
            }
            while (mVar != null) {
                if (mVar2 == mVar) {
                    return true;
                }
                if (mVar instanceof C15544O) {
                    return (mVar2 instanceof C15544O) && ((C15544O) mVar2).f().equals(((C15544O) mVar).f()) && C17278i.b(mVar, mVar2);
                }
                mVar = mVar.b();
            }
            return false;
        }
    }

    /* renamed from: DI.t$e */
    static class e extends C15571r {
        e(y0 y0Var) {
            super(y0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C17705g gVar, C15570q qVar, C15566m mVar, boolean z10) {
            C15566m q10;
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            if (C15573t.f133849a.e(gVar, qVar, mVar, z10)) {
                if (gVar == C15573t.f133862n) {
                    return true;
                }
                if (!(gVar == C15573t.f133861m || (q10 = C17278i.q(qVar, C15558e.class)) == null || !(gVar instanceof C17707i))) {
                    return ((C17707i) gVar).w().a().equals(q10.a());
                }
            }
            return false;
        }
    }

    /* renamed from: DI.t$f */
    static class f extends C15571r {
        f(y0 y0Var) {
            super(y0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(C17705g gVar, C15570q qVar, C15558e eVar) {
            if (qVar == null) {
                g(2);
            }
            if (eVar == null) {
                g(3);
            }
            if (gVar == C15573t.f133863o) {
                return false;
            }
            if (!(qVar instanceof C15555b) || (qVar instanceof C15565l) || gVar == C15573t.f133862n) {
                return true;
            }
            if (gVar == C15573t.f133861m || gVar == null) {
                return false;
            }
            C18096U b10 = gVar instanceof C17706h ? ((C17706h) gVar).b() : gVar.getType();
            return C17278i.I(b10, eVar) || C18083G.a(b10);
        }

        public boolean e(C17705g gVar, C15570q qVar, C15566m mVar, boolean z10) {
            C15558e eVar;
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            Class<C15558e> cls = C15558e.class;
            C15558e eVar2 = (C15558e) C17278i.q(qVar, cls);
            C15558e eVar3 = (C15558e) C17278i.r(mVar, cls, false);
            if (eVar3 == null) {
                return false;
            }
            if (eVar2 != null && C17278i.x(eVar2) && (eVar = (C15558e) C17278i.q(eVar2, cls)) != null && C17278i.H(eVar3, eVar)) {
                return true;
            }
            C15570q M10 = C17278i.M(qVar);
            C15558e eVar4 = (C15558e) C17278i.q(M10, cls);
            if (eVar4 == null) {
                return false;
            }
            if (!C17278i.H(eVar3, eVar4) || !h(gVar, M10, eVar3)) {
                return e(gVar, qVar, eVar3.b(), z10);
            }
            return true;
        }
    }

    /* renamed from: DI.t$g */
    static class g extends C15571r {
        g(y0 y0Var) {
            super(y0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C17705g gVar, C15570q qVar, C15566m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            if (!C17278i.g(mVar).z(C17278i.g(qVar))) {
                return false;
            }
            return C15573t.f133864p.a(qVar, mVar);
        }
    }

    /* renamed from: DI.t$h */
    static class h extends C15571r {
        h(y0 y0Var) {
            super(y0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C17705g gVar, C15570q qVar, C15566m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return true;
        }
    }

    /* renamed from: DI.t$i */
    static class i extends C15571r {
        i(y0 y0Var) {
            super(y0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C17705g gVar, C15570q qVar, C15566m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* renamed from: DI.t$j */
    static class j extends C15571r {
        j(y0 y0Var) {
            super(y0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C17705g gVar, C15570q qVar, C15566m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* renamed from: DI.t$k */
    static class k extends C15571r {
        k(y0 y0Var) {
            super(y0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C17705g gVar, C15570q qVar, C15566m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return false;
        }
    }

    /* renamed from: DI.t$l */
    static class l extends C15571r {
        l(y0 y0Var) {
            super(y0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C17705g gVar, C15570q qVar, C15566m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        d dVar = new d(x0.e.f133875c);
        f133849a = dVar;
        e eVar = new e(x0.f.f133876c);
        f133850b = eVar;
        f fVar = new f(x0.g.f133877c);
        f133851c = fVar;
        g gVar = new g(x0.b.f133872c);
        f133852d = gVar;
        h hVar = new h(x0.h.f133878c);
        f133853e = hVar;
        i iVar = new i(x0.d.f133874c);
        f133854f = iVar;
        j jVar = new j(x0.a.f133871c);
        f133855g = jVar;
        k kVar = new k(x0.c.f133873c);
        f133856h = kVar;
        l lVar = new l(x0.i.f133879c);
        f133857i = lVar;
        f133858j = Collections.unmodifiableSet(g0.h(dVar, eVar, gVar, iVar));
        HashMap e10 = C15660a.e(4);
        e10.put(eVar, 0);
        e10.put(dVar, 0);
        e10.put(gVar, 1);
        e10.put(fVar, 1);
        e10.put(hVar, 2);
        f133859k = Collections.unmodifiableMap(e10);
        f133860l = hVar;
        Class<C15477l> cls = C15477l.class;
        Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        f133864p = it.hasNext() ? (C15477l) it.next() : C15477l.a.f133327a;
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    private static /* synthetic */ void a(int i10) {
        String str = i10 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 != 16 ? 3 : 2)];
        if (!(i10 == 1 || i10 == 3 || i10 == 5 || i10 == 7)) {
            switch (i10) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        }
        objArr[0] = "from";
        if (i10 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i10) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String format = String.format(str, objArr);
        throw (i10 != 16 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public static Integer d(C15574u uVar, C15574u uVar2) {
        if (uVar == null) {
            a(12);
        }
        if (uVar2 == null) {
            a(13);
        }
        Integer a10 = uVar.a(uVar2);
        if (a10 != null) {
            return a10;
        }
        Integer a11 = uVar2.a(uVar);
        if (a11 != null) {
            return Integer.valueOf(-a11.intValue());
        }
        return null;
    }

    public static C15570q e(C17705g gVar, C15570q qVar, C15566m mVar, boolean z10) {
        C15570q e10;
        if (qVar == null) {
            a(8);
        }
        if (mVar == null) {
            a(9);
        }
        C15570q qVar2 = (C15570q) qVar.a();
        while (qVar2 != null && qVar2.getVisibility() != f133854f) {
            if (!qVar2.getVisibility().e(gVar, qVar2, mVar, z10)) {
                return qVar2;
            }
            qVar2 = (C15570q) C17278i.q(qVar2, C15570q.class);
        }
        if (!(qVar instanceof C15723Q) || (e10 = e(gVar, ((C15723Q) qVar).R(), mVar, z10)) == null) {
            return null;
        }
        return e10;
    }

    public static boolean f(C15566m mVar, C15566m mVar2) {
        if (mVar == null) {
            a(6);
        }
        if (mVar2 == null) {
            a(7);
        }
        j0 j10 = C17278i.j(mVar2);
        if (j10 != j0.f133843a) {
            return j10.equals(C17278i.j(mVar));
        }
        return false;
    }

    public static boolean g(C15574u uVar) {
        if (uVar == null) {
            a(14);
        }
        return uVar == f133849a || uVar == f133850b;
    }

    public static boolean h(C15570q qVar, C15566m mVar, boolean z10) {
        if (qVar == null) {
            a(2);
        }
        if (mVar == null) {
            a(3);
        }
        return e(f133862n, qVar, mVar, z10) == null;
    }

    private static void i(C15574u uVar) {
        f133865q.put(uVar.b(), uVar);
    }

    public static C15574u j(y0 y0Var) {
        if (y0Var == null) {
            a(15);
        }
        C15574u uVar = f133865q.get(y0Var);
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + y0Var);
    }
}
