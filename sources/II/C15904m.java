package II;

import JI.C15965f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.C17527c;
import kotlin.jvm.internal.C17542s;

/* renamed from: II.m  reason: case insensitive filesystem */
final class C15904m {

    /* renamed from: a  reason: collision with root package name */
    public static final C15904m f135495a = new C15904m();

    private C15904m() {
    }

    public final String a(Constructor<?> constructor) {
        C17542s.j(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator a10 = C17527c.a(constructor.getParameterTypes());
        while (a10.hasNext()) {
            Class cls = (Class) a10.next();
            C17542s.g(cls);
            sb2.append(C15965f.f(cls));
        }
        sb2.append(")V");
        String sb3 = sb2.toString();
        C17542s.i(sb3, "toString(...)");
        return sb3;
    }

    public final String b(Field field) {
        C17542s.j(field, "field");
        Class<?> type = field.getType();
        C17542s.i(type, "getType(...)");
        return C15965f.f(type);
    }

    public final String c(Method method) {
        C17542s.j(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator a10 = C17527c.a(method.getParameterTypes());
        while (a10.hasNext()) {
            Class cls = (Class) a10.next();
            C17542s.g(cls);
            sb2.append(C15965f.f(cls));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        C17542s.i(returnType, "getReturnType(...)");
        sb2.append(C15965f.f(returnType));
        String sb3 = sb2.toString();
        C17542s.i(sb3, "toString(...)");
        return sb3;
    }
}
