package fK;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import mK.C17611d;
import nI.C17631a;
import uI.C18055d;
import uI.C18057f;
import uI.C18068q;

@Metadata(d1 = {"fK/A", "fK/C"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class z {
    public static final KSerializer<? extends Object> a(C18055d<Object> dVar, List<? extends KSerializer<Object>> list, C17631a<? extends C18057f> aVar) {
        return C17245C.e(dVar, list, aVar);
    }

    public static final KSerializer<Object> b(Type type) {
        return C17243A.d(type);
    }

    public static final KSerializer<Object> c(C17611d dVar, Type type) {
        return C17243A.e(dVar, type);
    }

    public static final KSerializer<Object> d(C17611d dVar, C18068q qVar) {
        return C17245C.f(dVar, qVar);
    }

    public static final <T> KSerializer<T> e(C18055d<T> dVar) {
        return C17245C.g(dVar);
    }

    public static final KSerializer<Object> f(C17611d dVar, Type type) {
        return C17243A.h(dVar, type);
    }

    public static final KSerializer<Object> g(C17611d dVar, C18068q qVar) {
        return C17245C.j(dVar, qVar);
    }

    public static final <T> KSerializer<T> h(C18055d<T> dVar) {
        return C17245C.k(dVar);
    }

    public static final KSerializer<Object> i(C18068q qVar) {
        return C17245C.l(qVar);
    }

    public static final List<KSerializer<Object>> j(C17611d dVar, List<? extends C18068q> list, boolean z10) {
        return C17245C.m(dVar, list, z10);
    }
}
