package EJ;

import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import nI.C17642l;

/* renamed from: EJ.b  reason: case insensitive filesystem */
public class C15661b {

    /* renamed from: EJ.b$a */
    static class a extends C3305b<N, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l f134247a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean[] f134248b;

        a(C17642l lVar, boolean[] zArr) {
            this.f134247a = lVar;
            this.f134248b = zArr;
        }

        public boolean c(N n10) {
            if (((Boolean) this.f134247a.invoke(n10)).booleanValue()) {
                this.f134248b[0] = true;
            }
            return !this.f134248b[0];
        }

        /* renamed from: d */
        public Boolean a() {
            return Boolean.valueOf(this.f134248b[0]);
        }
    }

    /* renamed from: EJ.b$b  reason: collision with other inner class name */
    public static abstract class C3305b<N, R> implements d<N, R> {
        public void b(N n10) {
        }
    }

    /* renamed from: EJ.b$c */
    public interface c<N> {
        Iterable<? extends N> a(N n10);
    }

    /* renamed from: EJ.b$d */
    public interface d<N, R> {
        R a();

        void b(N n10);

        boolean c(N n10);
    }

    /* renamed from: EJ.b$e */
    public interface e<N> {
        boolean a(N n10);
    }

    /* renamed from: EJ.b$f */
    public static class f<N> implements e<N> {

        /* renamed from: a  reason: collision with root package name */
        private final Set<N> f134249a;

        public f() {
            this(new HashSet());
        }

        private static /* synthetic */ void b(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"}));
        }

        public boolean a(N n10) {
            return this.f134249a.add(n10);
        }

        public f(Set<N> set) {
            if (set == null) {
                b(0);
            }
            this.f134249a = set;
        }
    }

    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case BuildConfig.MIN_SDK_VERSION:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
            default:
                objArr[0] = "nodes";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i10) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <N, R> R b(Collection<N> collection, c<N> cVar, d<N, R> dVar) {
        if (collection == null) {
            a(4);
        }
        if (cVar == null) {
            a(5);
        }
        if (dVar == null) {
            a(6);
        }
        return c(collection, cVar, new f(), dVar);
    }

    public static <N, R> R c(Collection<N> collection, c<N> cVar, e<N> eVar, d<N, R> dVar) {
        if (collection == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        if (eVar == null) {
            a(2);
        }
        if (dVar == null) {
            a(3);
        }
        for (N d10 : collection) {
            d(d10, cVar, eVar, dVar);
        }
        return dVar.a();
    }

    public static <N> void d(N n10, c<N> cVar, e<N> eVar, d<N, ?> dVar) {
        if (n10 == null) {
            a(22);
        }
        if (cVar == null) {
            a(23);
        }
        if (eVar == null) {
            a(24);
        }
        if (dVar == null) {
            a(25);
        }
        if (eVar.a(n10) && dVar.c(n10)) {
            for (Object d10 : cVar.a(n10)) {
                d(d10, cVar, eVar, dVar);
            }
            dVar.b(n10);
        }
    }

    public static <N> Boolean e(Collection<N> collection, c<N> cVar, C17642l<N, Boolean> lVar) {
        if (collection == null) {
            a(7);
        }
        if (cVar == null) {
            a(8);
        }
        if (lVar == null) {
            a(9);
        }
        return (Boolean) b(collection, cVar, new a(lVar, new boolean[1]));
    }
}
