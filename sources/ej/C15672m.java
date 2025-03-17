package EJ;

/* renamed from: EJ.m  reason: case insensitive filesystem */
public class C15672m {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f134274a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f134275b = false;

    /* renamed from: EJ.m$a */
    static class a {
        a() {
        }

        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* renamed from: EJ.m$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f134276a;

        /* synthetic */ b(Throwable th2, a aVar) {
            this(th2);
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i10 != 1 ? 3 : 2)];
            if (i10 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i10 != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i10 != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public Throwable b() {
            Throwable th2 = this.f134276a;
            if (th2 == null) {
                a(1);
            }
            return th2;
        }

        public String toString() {
            return this.f134276a.toString();
        }

        private b(Throwable th2) {
            if (th2 == null) {
                a(0);
            }
            this.f134276a = th2;
        }
    }

    /* renamed from: EJ.m$c */
    public static class c extends RuntimeException {
        public c(Throwable th2) {
            super("Rethrow stored exception", th2);
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 1 || i10 == 2) ? 2 : 3)];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i10 != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i10 == 1 || i10 == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (!(i10 == 1 || i10 == 2)) {
            if (i10 == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i10 != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String format = String.format(str, objArr);
        throw ((i10 == 1 || i10 == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static <V> Object b(V v10) {
        if (v10 == null && (v10 = f134274a) == null) {
            a(1);
        }
        return v10;
    }

    public static Object c(Throwable th2) {
        if (th2 == null) {
            a(3);
        }
        return new b(th2, (a) null);
    }

    public static <V> V d(Object obj) {
        if (obj == null) {
            a(4);
        }
        return e(f(obj));
    }

    public static <V> V e(Object obj) {
        if (obj == null) {
            a(0);
        }
        if (obj == f134274a) {
            return null;
        }
        return obj;
    }

    public static <V> V f(Object obj) {
        if (!(obj instanceof b)) {
            return obj;
        }
        Throwable b10 = ((b) obj).b();
        if (!f134275b || !C15663d.a(b10)) {
            throw C15663d.b(b10);
        }
        throw new c(b10);
    }
}
