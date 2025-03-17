package QL;

import GK.C15775C;
import GK.C15777E;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface h<F, T> {

    public static abstract class a {
        protected static Type a(int i10, ParameterizedType parameterizedType) {
            return C16357C.g(i10, parameterizedType);
        }

        protected static Class<?> b(Type type) {
            return C16357C.h(type);
        }

        public h<?, C15775C> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
            return null;
        }

        public h<C15777E, ?> d(Type type, Annotation[] annotationArr, y yVar) {
            return null;
        }

        public h<?, String> e(Type type, Annotation[] annotationArr, y yVar) {
            return null;
        }
    }

    T a(F f10);
}
