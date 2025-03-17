package xI;

import java.lang.ref.SoftReference;
import nI.C17631a;

public class a1 {

    public static class a<T> extends b<T> implements C17631a<T> {

        /* renamed from: b  reason: collision with root package name */
        private final C17631a<T> f152382b;

        /* renamed from: c  reason: collision with root package name */
        private volatile SoftReference<Object> f152383c;

        public a(T t10, C17631a<T> aVar) {
            if (aVar == null) {
                e(0);
            }
            this.f152383c = null;
            this.f152382b = aVar;
            if (t10 != null) {
                this.f152383c = new SoftReference<>(a(t10));
            }
        }

        private static /* synthetic */ void e(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"}));
        }

        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f152383c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return c(obj);
            }
            T invoke = this.f152382b.invoke();
            this.f152383c = new SoftReference<>(a(invoke));
            return invoke;
        }
    }

    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private static final Object f152384a = new a();

        static class a {
            a() {
            }
        }

        /* access modifiers changed from: protected */
        public Object a(T t10) {
            return t10 == null ? f152384a : t10;
        }

        public final T b(Object obj, Object obj2) {
            return invoke();
        }

        /* access modifiers changed from: protected */
        public T c(Object obj) {
            if (obj == f152384a) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    private static /* synthetic */ void a(int i10) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"}));
    }

    public static <T> a<T> b(T t10, C17631a<T> aVar) {
        if (aVar == null) {
            a(0);
        }
        return new a<>(t10, aVar);
    }

    public static <T> a<T> c(C17631a<T> aVar) {
        if (aVar == null) {
            a(1);
        }
        return b((Object) null, aVar);
    }
}
