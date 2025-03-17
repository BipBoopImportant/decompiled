package MI;

import DI.C15544O;
import DI.C15566m;
import DI.C15570q;
import DI.C15571r;
import DI.C15573t;
import DI.C15574u;
import DI.y0;
import HI.C15817a;
import HI.C15818b;
import HI.C15819c;
import gJ.C17278i;
import java.util.HashMap;
import java.util.Map;
import oJ.C17705g;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public static final C15574u f136402a;

    /* renamed from: b  reason: collision with root package name */
    public static final C15574u f136403b;

    /* renamed from: c  reason: collision with root package name */
    public static final C15574u f136404c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<y0, C15574u> f136405d = new HashMap();

    static class a extends C15571r {
        a(y0 y0Var) {
            super(y0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "fromPackage";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "myPackage";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "visibleFromPackage";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean e(C17705g gVar, C15570q qVar, C15566m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return y.d(qVar, mVar);
        }
    }

    static class b extends C15571r {
        b(y0 y0Var) {
            super(y0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
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
            return y.e(gVar, qVar, mVar);
        }
    }

    static class c extends C15571r {
        c(y0 y0Var) {
            super(y0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
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
            return y.e(gVar, qVar, mVar);
        }
    }

    static {
        a aVar = new a(C15817a.f135269c);
        f136402a = aVar;
        b bVar = new b(C15819c.f135271c);
        f136403b = bVar;
        c cVar = new c(C15818b.f135270c);
        f136404c = cVar;
        f(aVar);
        f(bVar);
        f(cVar);
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 5 || i10 == 6) ? 2 : 3)];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (!(i10 == 5 || i10 == 6)) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        throw ((i10 == 5 || i10 == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* access modifiers changed from: private */
    public static boolean d(C15566m mVar, C15566m mVar2) {
        if (mVar == null) {
            a(2);
        }
        if (mVar2 == null) {
            a(3);
        }
        Class<C15544O> cls = C15544O.class;
        C15544O o10 = (C15544O) C17278i.r(mVar, cls, false);
        C15544O o11 = (C15544O) C17278i.r(mVar2, cls, false);
        return (o11 == null || o10 == null || !o10.f().equals(o11.f())) ? false : true;
    }

    /* access modifiers changed from: private */
    public static boolean e(C17705g gVar, C15570q qVar, C15566m mVar) {
        if (qVar == null) {
            a(0);
        }
        if (mVar == null) {
            a(1);
        }
        if (d(C17278i.M(qVar), mVar)) {
            return true;
        }
        return C15573t.f133851c.e(gVar, qVar, mVar, false);
    }

    private static void f(C15574u uVar) {
        f136405d.put(uVar.b(), uVar);
    }

    public static C15574u g(y0 y0Var) {
        if (y0Var == null) {
            a(4);
        }
        C15574u uVar = f136405d.get(y0Var);
        if (uVar != null) {
            return uVar;
        }
        C15574u j10 = C15573t.j(y0Var);
        if (j10 == null) {
            a(5);
        }
        return j10;
    }
}
