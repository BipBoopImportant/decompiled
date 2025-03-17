package Sc;

import com.google.gson.internal.o;
import com.google.gson.j;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final b f63330a;

    private static abstract class b {
        private b() {
        }

        public abstract Method a(Class<?> cls, Field field);

        /* access modifiers changed from: package-private */
        public abstract <T> Constructor<T> b(Class<T> cls);

        /* access modifiers changed from: package-private */
        public abstract String[] c(Class<?> cls);

        /* access modifiers changed from: package-private */
        public abstract boolean d(Class<?> cls);
    }

    private static class c extends b {
        private c() {
            super();
        }

        public Method a(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        /* access modifiers changed from: package-private */
        public <T> Constructor<T> b(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        /* access modifiers changed from: package-private */
        public String[] c(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        /* access modifiers changed from: package-private */
        public boolean d(Class<?> cls) {
            return false;
        }
    }

    private static class d extends b {

        /* renamed from: a  reason: collision with root package name */
        private final Method f63331a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f63332b;

        /* renamed from: c  reason: collision with root package name */
        private final Method f63333c;

        /* renamed from: d  reason: collision with root package name */
        private final Method f63334d;

        public Method a(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), (Class[]) null);
            } catch (ReflectiveOperationException e10) {
                throw a.d(e10);
            }
        }

        public <T> Constructor<T> b(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.f63332b.invoke(cls, (Object[]) null);
                Class[] clsArr = new Class[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    clsArr[i10] = (Class) this.f63334d.invoke(objArr[i10], (Object[]) null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e10) {
                throw a.d(e10);
            }
        }

        /* access modifiers changed from: package-private */
        public String[] c(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.f63332b.invoke(cls, (Object[]) null);
                String[] strArr = new String[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    strArr[i10] = (String) this.f63333c.invoke(objArr[i10], (Object[]) null);
                }
                return strArr;
            } catch (ReflectiveOperationException e10) {
                throw a.d(e10);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(Class<?> cls) {
            try {
                return ((Boolean) this.f63331a.invoke(cls, (Object[]) null)).booleanValue();
            } catch (ReflectiveOperationException e10) {
                throw a.d(e10);
            }
        }

        private d() {
            super();
            Class<Class> cls = Class.class;
            this.f63331a = cls.getMethod("isRecord", (Class[]) null);
            this.f63332b = cls.getMethod("getRecordComponents", (Class[]) null);
            Class<?> cls2 = Class.forName("java.lang.reflect.RecordComponent");
            this.f63333c = cls2.getMethod("getName", (Class[]) null);
            this.f63334d = cls2.getMethod("getType", (Class[]) null);
        }
    }

    static {
        b bVar;
        try {
            bVar = new d();
        } catch (ReflectiveOperationException unused) {
            bVar = new c();
        }
        f63330a = bVar;
    }

    private static void b(AccessibleObject accessibleObject, StringBuilder sb2) {
        sb2.append('(');
        Class[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i10].getSimpleName());
        }
        sb2.append(')');
    }

    public static String c(Constructor<?> constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        b(constructor, sb2);
        return sb2.toString();
    }

    /* access modifiers changed from: private */
    public static RuntimeException d(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException e(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String f(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String g(AccessibleObject accessibleObject, boolean z10) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + f((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            b(method, sb2);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb2.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + c((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z10 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Method h(Class<?> cls, Field field) {
        return f63330a.a(cls, field);
    }

    public static <T> Constructor<T> i(Class<T> cls) {
        return f63330a.b(cls);
    }

    private static String j(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        String str = (message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson";
        return "\nSee " + o.a(str);
    }

    public static String[] k(Class<?> cls) {
        return f63330a.c(cls);
    }

    public static boolean l(Class<?> cls) {
        return !n(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public static boolean m(Class<?> cls) {
        return f63330a.d(cls);
    }

    public static boolean n(Class<?> cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    public static void o(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e10) {
            String g10 = g(accessibleObject, false);
            throw new j("Failed making " + g10 + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + j(e10), e10);
        }
    }

    public static String p(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e10) {
            return "Failed making constructor '" + c(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage() + j(e10);
        }
    }
}
