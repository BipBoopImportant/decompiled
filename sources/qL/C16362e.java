package QL;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: QL.e  reason: case insensitive filesystem */
public interface C16362e<R, T> {

    /* renamed from: QL.e$a */
    public static abstract class a {
        protected static Type b(int i10, ParameterizedType parameterizedType) {
            return C16357C.g(i10, parameterizedType);
        }

        protected static Class<?> c(Type type) {
            return C16357C.h(type);
        }

        public abstract C16362e<?, ?> a(Type type, Annotation[] annotationArr, y yVar);
    }

    Type a();

    T b(C16361d<R> dVar);
}
