package JI;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C17542s;

/* renamed from: JI.a  reason: case insensitive filesystem */
final class C15960a {

    /* renamed from: a  reason: collision with root package name */
    public static final C15960a f135760a = new C15960a();

    /* renamed from: b  reason: collision with root package name */
    private static C3339a f135761b;

    /* renamed from: JI.a$a  reason: collision with other inner class name */
    public static final class C3339a {

        /* renamed from: a  reason: collision with root package name */
        private final Method f135762a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f135763b;

        public C3339a(Method method, Method method2) {
            this.f135762a = method;
            this.f135763b = method2;
        }

        public final Method a() {
            return this.f135763b;
        }

        public final Method b() {
            return this.f135762a;
        }
    }

    private C15960a() {
    }

    private final C3339a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C3339a(cls.getMethod("getType", (Class[]) null), cls.getMethod("getAccessor", (Class[]) null));
        } catch (NoSuchMethodException unused) {
            return new C3339a((Method) null, (Method) null);
        }
    }

    private final C3339a b(Object obj) {
        C3339a aVar = f135761b;
        if (aVar != null) {
            return aVar;
        }
        C3339a a10 = a(obj);
        f135761b = a10;
        return a10;
    }

    public final Method c(Object obj) {
        C17542s.j(obj, "recordComponent");
        Method a10 = b(obj).a();
        if (a10 == null) {
            return null;
        }
        Object invoke = a10.invoke(obj, (Object[]) null);
        C17542s.h(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) invoke;
    }

    public final Class<?> d(Object obj) {
        C17542s.j(obj, "recordComponent");
        Method b10 = b(obj).b();
        if (b10 == null) {
            return null;
        }
        Object invoke = b10.invoke(obj, (Object[]) null);
        C17542s.h(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) invoke;
    }
}
