package tJ;

import EJ.C15663d;
import EJ.C15672m;
import HJ.C15854t;
import XH.C16807N;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import nI.C17631a;
import nI.C17642l;

/* renamed from: tJ.f  reason: case insensitive filesystem */
public class C17986f implements C17994n {

    /* renamed from: d  reason: collision with root package name */
    private static final String f147351d = C15854t.v1(C17986f.class.getCanonicalName(), ".", "");

    /* renamed from: e  reason: collision with root package name */
    public static final C17994n f147352e = new a("NO_LOCKS", C4283f.f147361a, C17985e.f147350b);

    /* renamed from: a  reason: collision with root package name */
    protected final C17991k f147353a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C4283f f147354b;

    /* renamed from: c  reason: collision with root package name */
    private final String f147355c;

    /* renamed from: tJ.f$a */
    static class a extends C17986f {
        a(String str, C4283f fVar, C17991k kVar) {
            super(str, fVar, kVar, (a) null);
        }

        private static /* synthetic */ void j(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i10 != 1 ? 3 : 2)];
            if (i10 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i10 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String format = String.format(str, objArr);
            throw (i10 != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* access modifiers changed from: protected */
        public <K, V> o<V> p(String str, K k10) {
            if (str == null) {
                j(0);
            }
            o<V> a10 = o.a();
            if (a10 == null) {
                j(1);
            }
            return a10;
        }
    }

    /* renamed from: tJ.f$b */
    class b extends j<T> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f147356d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17986f fVar, C17631a aVar, Object obj) {
            super(fVar, aVar);
            this.f147356d = obj;
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"}));
        }

        /* access modifiers changed from: protected */
        public o<T> c(boolean z10) {
            o<T> d10 = o.d(this.f147356d);
            if (d10 == null) {
                a(0);
            }
            return d10;
        }
    }

    /* renamed from: tJ.f$c */
    class c extends k<T> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l f147358e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l f147359f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17986f fVar, C17631a aVar, C17642l lVar, C17642l lVar2) {
            super(fVar, aVar);
            this.f147358e = lVar;
            this.f147359f = lVar2;
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 != 2 ? 2 : 3)];
            if (i10 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i10 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i10 == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            throw (i10 != 2 ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* access modifiers changed from: protected */
        public o<T> c(boolean z10) {
            C17642l lVar = this.f147358e;
            if (lVar == null) {
                o<T> c10 = super.c(z10);
                if (c10 == null) {
                    a(0);
                }
                return c10;
            }
            o<T> d10 = o.d(lVar.invoke(Boolean.valueOf(z10)));
            if (d10 == null) {
                a(1);
            }
            return d10;
        }

        /* access modifiers changed from: protected */
        public void e(T t10) {
            if (t10 == null) {
                a(2);
            }
            this.f147359f.invoke(t10);
        }
    }

    /* renamed from: tJ.f$d */
    private static class d<K, V> extends e<K, V> implements C17981a<K, V> {
        /* synthetic */ d(C17986f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i10 != 3 ? 3 : 2)];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i10 != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public V a(K k10, C17631a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            V a10 = super.a(k10, aVar);
            if (a10 == null) {
                b(3);
            }
            return a10;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private d(C17986f fVar, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, (a) null);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* renamed from: tJ.f$e */
    private static class e<K, V> extends l<g<K, V>, V> implements C17982b<K, V> {

        /* renamed from: tJ.f$e$a */
        class a implements C17642l<g<K, V>, V> {
            a() {
            }

            /* renamed from: a */
            public V invoke(g<K, V> gVar) {
                return gVar.f147363b.invoke();
            }
        }

        /* synthetic */ e(C17986f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public V a(K k10, C17631a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            return invoke(new g(k10, aVar));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private e(C17986f fVar, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, new a());
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* renamed from: tJ.f$f  reason: collision with other inner class name */
    public interface C4283f {

        /* renamed from: a  reason: collision with root package name */
        public static final C4283f f147361a = new a();

        /* renamed from: tJ.f$f$a */
        static class a implements C4283f {
            a() {
            }

            private static /* synthetic */ void b(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"}));
            }

            public RuntimeException a(Throwable th2) {
                if (th2 == null) {
                    b(0);
                }
                throw C15663d.b(th2);
            }
        }

        RuntimeException a(Throwable th2);
    }

    /* renamed from: tJ.f$g */
    private static class g<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final K f147362a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C17631a<? extends V> f147363b;

        public g(K k10, C17631a<? extends V> aVar) {
            this.f147362a = k10;
            this.f147363b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f147362a.equals(((g) obj).f147362a);
        }

        public int hashCode() {
            return this.f147362a.hashCode();
        }
    }

    /* renamed from: tJ.f$h */
    private static class h<T> implements C17990j<T> {

        /* renamed from: a  reason: collision with root package name */
        private final C17986f f147364a;

        /* renamed from: b  reason: collision with root package name */
        private final C17631a<? extends T> f147365b;

        /* renamed from: c  reason: collision with root package name */
        private volatile Object f147366c;

        public h(C17986f fVar, C17631a<? extends T> aVar) {
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f147366c = n.NOT_COMPUTED;
            this.f147364a = fVar;
            this.f147365b = aVar;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i10 == 2 || i10 == 3) ? 2 : 3)];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (!(i10 == 2 || i10 == 3)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i10 == 2 || i10 == 3) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* access modifiers changed from: protected */
        public void b(T t10) {
        }

        /* access modifiers changed from: protected */
        public o<T> c(boolean z10) {
            o<T> p10 = this.f147364a.p("in a lazy value", null);
            if (p10 == null) {
                a(2);
            }
            return p10;
        }

        public T invoke() {
            T invoke;
            Object obj = this.f147366c;
            if (!(obj instanceof n)) {
                return C15672m.f(obj);
            }
            this.f147364a.f147353a.lock();
            try {
                Object obj2 = this.f147366c;
                if (!(obj2 instanceof n)) {
                    invoke = C15672m.f(obj2);
                } else {
                    n nVar = n.COMPUTING;
                    if (obj2 == nVar) {
                        this.f147366c = n.RECURSION_WAS_DETECTED;
                        o c10 = c(true);
                        if (!c10.c()) {
                            invoke = c10.b();
                        }
                    }
                    if (obj2 == n.RECURSION_WAS_DETECTED) {
                        o c11 = c(false);
                        if (!c11.c()) {
                            invoke = c11.b();
                        }
                    }
                    this.f147366c = nVar;
                    invoke = this.f147365b.invoke();
                    b(invoke);
                    this.f147366c = invoke;
                }
                this.f147364a.f147353a.unlock();
                return invoke;
            } catch (Throwable th2) {
                this.f147364a.f147353a.unlock();
                throw th2;
            }
        }

        public boolean w() {
            return (this.f147366c == n.NOT_COMPUTED || this.f147366c == n.COMPUTING) ? false : true;
        }
    }

    /* renamed from: tJ.f$i */
    private static abstract class i<T> extends h<T> {

        /* renamed from: d  reason: collision with root package name */
        private volatile C17992l<T> f147367d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C17986f fVar, C17631a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f147367d = null;
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* access modifiers changed from: protected */
        public final void b(T t10) {
            this.f147367d = new C17992l<>(t10);
            try {
                e(t10);
            } finally {
                this.f147367d = null;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void e(T t10);

        public T invoke() {
            C17992l<T> lVar = this.f147367d;
            return (lVar == null || !lVar.b()) ? super.invoke() : lVar.a();
        }
    }

    /* renamed from: tJ.f$j */
    private static class j<T> extends h<T> implements C17989i<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C17986f fVar, C17631a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i10 != 2 ? 3 : 2)];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i10 != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T invoke() {
            T invoke = super.invoke();
            if (invoke == null) {
                a(2);
            }
            return invoke;
        }
    }

    /* renamed from: tJ.f$k */
    private static abstract class k<T> extends i<T> implements C17989i<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(C17986f fVar, C17631a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i10 != 2 ? 3 : 2)];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i10 != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T invoke() {
            T invoke = super.invoke();
            if (invoke == null) {
                a(2);
            }
            return invoke;
        }
    }

    /* renamed from: tJ.f$l */
    private static class l<K, V> implements C17988h<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final C17986f f147368a;

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentMap<K, Object> f147369b;

        /* renamed from: c  reason: collision with root package name */
        private final C17642l<? super K, ? extends V> f147370c;

        public l(C17986f fVar, ConcurrentMap<K, Object> concurrentMap, C17642l<? super K, ? extends V> lVar) {
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
            this.f147368a = fVar;
            this.f147369b = concurrentMap;
            this.f147370c = lVar;
        }

        private static /* synthetic */ void b(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i10 == 3 || i10 == 4) ? 2 : 3)];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (!(i10 == 3 || i10 == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i10 == 3 || i10 == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        private AssertionError c(K k10, Object obj) {
            return (AssertionError) C17986f.q(new AssertionError("Inconsistent key detected. " + n.COMPUTING + " is expected, was: " + obj + ", most probably race condition detected on input " + k10 + " under " + this.f147368a));
        }

        private AssertionError e(K k10, Object obj) {
            AssertionError assertionError = (AssertionError) C17986f.q(new AssertionError("Race condition detected on input " + k10 + ". Old value is " + obj + " under " + this.f147368a));
            if (assertionError == null) {
                b(4);
            }
            return assertionError;
        }

        private AssertionError h(K k10, Throwable th2) {
            return (AssertionError) C17986f.q(new AssertionError("Unable to remove " + k10 + " under " + this.f147368a, th2));
        }

        /* access modifiers changed from: protected */
        public o<V> f(K k10, boolean z10) {
            o<V> p10 = this.f147368a.p("", k10);
            if (p10 == null) {
                b(3);
            }
            return p10;
        }

        public V invoke(K k10) {
            V d10;
            Object obj = this.f147369b.get(k10);
            if (obj != null && obj != n.COMPUTING) {
                return C15672m.d(obj);
            }
            this.f147368a.f147353a.lock();
            try {
                Object obj2 = this.f147369b.get(k10);
                n nVar = n.COMPUTING;
                if (obj2 == nVar) {
                    obj2 = n.RECURSION_WAS_DETECTED;
                    o f10 = f(k10, true);
                    if (!f10.c()) {
                        d10 = f10.b();
                        this.f147368a.f147353a.unlock();
                        return d10;
                    }
                }
                if (obj2 == n.RECURSION_WAS_DETECTED) {
                    o f11 = f(k10, false);
                    if (!f11.c()) {
                        d10 = f11.b();
                        this.f147368a.f147353a.unlock();
                        return d10;
                    }
                }
                if (obj2 != null) {
                    d10 = C15672m.d(obj2);
                    this.f147368a.f147353a.unlock();
                    return d10;
                }
                this.f147369b.put(k10, nVar);
                V invoke = this.f147370c.invoke(k10);
                Object put = this.f147369b.put(k10, C15672m.b(invoke));
                if (put == nVar) {
                    this.f147368a.f147353a.unlock();
                    return invoke;
                }
                throw e(k10, put);
            } catch (Throwable th2) {
                throw h(k10, th2);
            }
        }

        public boolean x(K k10) {
            Object obj = this.f147369b.get(k10);
            return (obj == null || obj == n.COMPUTING) ? false : true;
        }
    }

    /* renamed from: tJ.f$m */
    private static class m<K, V> extends l<K, V> implements C17987g<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(C17986f fVar, ConcurrentMap<K, Object> concurrentMap, C17642l<? super K, ? extends V> lVar) {
            super(fVar, concurrentMap, lVar);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i10 != 3 ? 3 : 2)];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i10 != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public V invoke(K k10) {
            V invoke = super.invoke(k10);
            if (invoke == null) {
                b(3);
            }
            return invoke;
        }
    }

    /* renamed from: tJ.f$n */
    private enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* renamed from: tJ.f$o */
    private static class o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f147371a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f147372b;

        private o(T t10, boolean z10) {
            this.f147371a = t10;
            this.f147372b = z10;
        }

        public static <T> o<T> a() {
            return new o<>((Object) null, true);
        }

        public static <T> o<T> d(T t10) {
            return new o<>(t10, false);
        }

        public T b() {
            return this.f147371a;
        }

        public boolean c() {
            return this.f147372b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.f147371a);
        }
    }

    /* synthetic */ C17986f(String str, C4283f fVar, C17991k kVar, a aVar) {
        this(str, fVar, kVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void j(int r13) {
        /*
            r0 = 37
            r1 = 20
            r2 = 13
            r3 = 10
            if (r13 == r3) goto L_0x0013
            if (r13 == r2) goto L_0x0013
            if (r13 == r1) goto L_0x0013
            if (r13 == r0) goto L_0x0013
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x0015
        L_0x0013:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L_0x0015:
            r5 = 3
            r6 = 2
            if (r13 == r3) goto L_0x0021
            if (r13 == r2) goto L_0x0021
            if (r13 == r1) goto L_0x0021
            if (r13 == r0) goto L_0x0021
            r7 = r5
            goto L_0x0022
        L_0x0021:
            r7 = r6
        L_0x0022:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "compute"
            java.lang.String r9 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager"
            r10 = 1
            r11 = 0
            if (r13 == r10) goto L_0x0065
            if (r13 == r5) goto L_0x0065
            r5 = 5
            if (r13 == r5) goto L_0x0065
            r5 = 6
            if (r13 == r5) goto L_0x0060
            switch(r13) {
                case 8: goto L_0x0065;
                case 9: goto L_0x005d;
                case 10: goto L_0x005a;
                case 11: goto L_0x005d;
                case 12: goto L_0x0055;
                case 13: goto L_0x005a;
                case 14: goto L_0x005d;
                case 15: goto L_0x0050;
                case 16: goto L_0x005d;
                case 17: goto L_0x0055;
                case 18: goto L_0x0050;
                case 19: goto L_0x005d;
                case 20: goto L_0x005a;
                case 21: goto L_0x005d;
                case 22: goto L_0x0050;
                case 23: goto L_0x004b;
                case 24: goto L_0x004b;
                case 25: goto L_0x0055;
                case 26: goto L_0x004b;
                case 27: goto L_0x0055;
                case 28: goto L_0x004b;
                case 29: goto L_0x0046;
                case 30: goto L_0x004b;
                case 31: goto L_0x004b;
                case 32: goto L_0x004b;
                case 33: goto L_0x0046;
                case 34: goto L_0x004b;
                case 35: goto L_0x0041;
                case 36: goto L_0x003c;
                case 37: goto L_0x005a;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.lang.String r5 = "debugText"
            r7[r11] = r5
            goto L_0x0069
        L_0x003c:
            java.lang.String r5 = "throwable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0041:
            java.lang.String r5 = "source"
            r7[r11] = r5
            goto L_0x0069
        L_0x0046:
            java.lang.String r5 = "postCompute"
            r7[r11] = r5
            goto L_0x0069
        L_0x004b:
            java.lang.String r5 = "computable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0050:
            java.lang.String r5 = "map"
            r7[r11] = r5
            goto L_0x0069
        L_0x0055:
            java.lang.String r5 = "onRecursiveCall"
            r7[r11] = r5
            goto L_0x0069
        L_0x005a:
            r7[r11] = r9
            goto L_0x0069
        L_0x005d:
            r7[r11] = r8
            goto L_0x0069
        L_0x0060:
            java.lang.String r5 = "lock"
            r7[r11] = r5
            goto L_0x0069
        L_0x0065:
            java.lang.String r5 = "exceptionHandlingStrategy"
            r7[r11] = r5
        L_0x0069:
            java.lang.String r5 = "createMemoizedFunction"
            java.lang.String r11 = "createMemoizedFunctionWithNullableValues"
            java.lang.String r12 = "sanitizeStackTrace"
            if (r13 == r3) goto L_0x0080
            if (r13 == r2) goto L_0x0080
            if (r13 == r1) goto L_0x007d
            if (r13 == r0) goto L_0x007a
            r7[r10] = r9
            goto L_0x0082
        L_0x007a:
            r7[r10] = r12
            goto L_0x0082
        L_0x007d:
            r7[r10] = r11
            goto L_0x0082
        L_0x0080:
            r7[r10] = r5
        L_0x0082:
            switch(r13) {
                case 4: goto L_0x00be;
                case 5: goto L_0x00be;
                case 6: goto L_0x00be;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00b9;
                case 9: goto L_0x00b6;
                case 10: goto L_0x00c2;
                case 11: goto L_0x00b6;
                case 12: goto L_0x00b6;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00b6;
                case 15: goto L_0x00b6;
                case 16: goto L_0x00b6;
                case 17: goto L_0x00b6;
                case 18: goto L_0x00b6;
                case 19: goto L_0x00b3;
                case 20: goto L_0x00c2;
                case 21: goto L_0x00b3;
                case 22: goto L_0x00b3;
                case 23: goto L_0x00ae;
                case 24: goto L_0x00ae;
                case 25: goto L_0x00ae;
                case 26: goto L_0x00a9;
                case 27: goto L_0x00a9;
                case 28: goto L_0x00a4;
                case 29: goto L_0x00a4;
                case 30: goto L_0x009f;
                case 31: goto L_0x009a;
                case 32: goto L_0x0095;
                case 33: goto L_0x0095;
                case 34: goto L_0x0092;
                case 35: goto L_0x008d;
                case 36: goto L_0x008a;
                case 37: goto L_0x00c2;
                default: goto L_0x0085;
            }
        L_0x0085:
            java.lang.String r5 = "createWithExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x008a:
            r7[r6] = r12
            goto L_0x00c2
        L_0x008d:
            java.lang.String r5 = "recursionDetectedDefault"
            r7[r6] = r5
            goto L_0x00c2
        L_0x0092:
            r7[r6] = r8
            goto L_0x00c2
        L_0x0095:
            java.lang.String r5 = "createNullableLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009a:
            java.lang.String r5 = "createRecursionTolerantNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009f:
            java.lang.String r5 = "createNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a4:
            java.lang.String r5 = "createLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a9:
            java.lang.String r5 = "createRecursionTolerantLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00ae:
            java.lang.String r5 = "createLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00b3:
            r7[r6] = r11
            goto L_0x00c2
        L_0x00b6:
            r7[r6] = r5
            goto L_0x00c2
        L_0x00b9:
            java.lang.String r5 = "replaceExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00be:
            java.lang.String r5 = "<init>"
            r7[r6] = r5
        L_0x00c2:
            java.lang.String r4 = java.lang.String.format(r4, r7)
            if (r13 == r3) goto L_0x00d4
            if (r13 == r2) goto L_0x00d4
            if (r13 == r1) goto L_0x00d4
            if (r13 == r0) goto L_0x00d4
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r4)
            goto L_0x00d9
        L_0x00d4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r4)
        L_0x00d9:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: tJ.C17986f.j(int):void");
    }

    private static <K> ConcurrentMap<K, Object> m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* access modifiers changed from: private */
    public static <T extends Throwable> T q(T t10) {
        if (t10 == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!stackTrace[i10].getClassName().startsWith(f147351d)) {
                break;
            } else {
                i10++;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i10, length);
        t10.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t10;
    }

    public <T> C17990j<T> a(C17631a<? extends T> aVar) {
        if (aVar == null) {
            j(30);
        }
        return new h(this, aVar);
    }

    public <K, V> C17981a<K, V> b() {
        return new d(this, m(), (a) null);
    }

    public <T> T c(C17631a<? extends T> aVar) {
        if (aVar == null) {
            j(34);
        }
        this.f147353a.lock();
        try {
            T invoke = aVar.invoke();
            this.f147353a.unlock();
            return invoke;
        } catch (Throwable th2) {
            this.f147353a.unlock();
            throw th2;
        }
    }

    public <T> C17989i<T> d(C17631a<? extends T> aVar) {
        if (aVar == null) {
            j(23);
        }
        return new j(this, aVar);
    }

    public <K, V> C17988h<K, V> e(C17642l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(19);
        }
        C17988h<K, V> o10 = o(lVar, m());
        if (o10 == null) {
            j(20);
        }
        return o10;
    }

    public <K, V> C17982b<K, V> f() {
        return new e(this, m(), (a) null);
    }

    public <K, V> C17987g<K, V> g(C17642l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(9);
        }
        C17987g<K, V> n10 = n(lVar, m());
        if (n10 == null) {
            j(10);
        }
        return n10;
    }

    public <T> C17989i<T> h(C17631a<? extends T> aVar, T t10) {
        if (aVar == null) {
            j(26);
        }
        if (t10 == null) {
            j(27);
        }
        return new b(this, aVar, t10);
    }

    public <T> C17989i<T> i(C17631a<? extends T> aVar, C17642l<? super Boolean, ? extends T> lVar, C17642l<? super T, C16807N> lVar2) {
        if (aVar == null) {
            j(28);
        }
        if (lVar2 == null) {
            j(29);
        }
        return new c(this, aVar, lVar, lVar2);
    }

    public <K, V> C17987g<K, V> n(C17642l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, lVar);
    }

    public <K, V> C17988h<K, V> o(C17642l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, lVar);
    }

    /* access modifiers changed from: protected */
    public <K, V> o<V> p(String str, K k10) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (k10 == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k10;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f147355c + ")";
    }

    private C17986f(String str, C4283f fVar, C17991k kVar) {
        if (str == null) {
            j(4);
        }
        if (fVar == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f147353a = kVar;
        this.f147354b = fVar;
        this.f147355c = str;
    }

    public C17986f(String str) {
        this(str, (Runnable) null, (C17642l<InterruptedException, C16807N>) null);
    }

    public C17986f(String str, Runnable runnable, C17642l<InterruptedException, C16807N> lVar) {
        this(str, C4283f.f147361a, (C17991k) C17991k.f147373a.a(runnable, lVar));
    }
}
