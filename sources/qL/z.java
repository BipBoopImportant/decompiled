package QL;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

abstract class z<T> {
    z() {
    }

    static <T> z<T> b(y yVar, Class<?> cls, Method method) {
        w b10 = w.b(yVar, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (C16357C.j(genericReturnType)) {
            throw C16357C.n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return n.f(yVar, method, b10);
        } else {
            throw C16357C.n(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract T a(Object obj, Object[] objArr);
}
