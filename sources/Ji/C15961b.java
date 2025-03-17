package JI;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C17542s;

/* renamed from: JI.b  reason: case insensitive filesystem */
final class C15961b {

    /* renamed from: a  reason: collision with root package name */
    public static final C15961b f135764a = new C15961b();

    /* renamed from: b  reason: collision with root package name */
    private static a f135765b;

    /* renamed from: JI.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Method f135766a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f135767b;

        /* renamed from: c  reason: collision with root package name */
        private final Method f135768c;

        /* renamed from: d  reason: collision with root package name */
        private final Method f135769d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f135766a = method;
            this.f135767b = method2;
            this.f135768c = method3;
            this.f135769d = method4;
        }

        public final Method a() {
            return this.f135767b;
        }

        public final Method b() {
            return this.f135769d;
        }

        public final Method c() {
            return this.f135768c;
        }

        public final Method d() {
            return this.f135766a;
        }
    }

    private C15961b() {
    }

    private final a a() {
        Class<Class> cls = Class.class;
        try {
            return new a(cls.getMethod("isSealed", (Class[]) null), cls.getMethod("getPermittedSubclasses", (Class[]) null), cls.getMethod("isRecord", (Class[]) null), cls.getMethod("getRecordComponents", (Class[]) null));
        } catch (NoSuchMethodException unused) {
            return new a((Method) null, (Method) null, (Method) null, (Method) null);
        }
    }

    private final a b() {
        a aVar = f135765b;
        if (aVar != null) {
            return aVar;
        }
        a a10 = a();
        f135765b = a10;
        return a10;
    }

    public final Class<?>[] c(Class<?> cls) {
        C17542s.j(cls, "clazz");
        Method a10 = b().a();
        if (a10 == null) {
            return null;
        }
        Object invoke = a10.invoke(cls, (Object[]) null);
        C17542s.h(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) invoke;
    }

    public final Object[] d(Class<?> cls) {
        C17542s.j(cls, "clazz");
        Method b10 = b().b();
        if (b10 == null) {
            return null;
        }
        return (Object[]) b10.invoke(cls, (Object[]) null);
    }

    public final Boolean e(Class<?> cls) {
        C17542s.j(cls, "clazz");
        Method c10 = b().c();
        if (c10 == null) {
            return null;
        }
        Object invoke = c10.invoke(cls, (Object[]) null);
        C17542s.h(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }

    public final Boolean f(Class<?> cls) {
        C17542s.j(cls, "clazz");
        Method d10 = b().d();
        if (d10 == null) {
            return null;
        }
        Object invoke = d10.invoke(cls, (Object[]) null);
        C17542s.h(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }
}
