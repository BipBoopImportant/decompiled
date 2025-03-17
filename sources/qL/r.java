package QL;

import GK.C15777E;
import QL.h;
import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@TargetApi(24)
@IgnoreJRERequirement
public final class r extends h.a {

    @IgnoreJRERequirement
    static final class a<T> implements h<C15777E, Optional<T>> {

        /* renamed from: a  reason: collision with root package name */
        private final h<C15777E, T> f137803a;

        a(h<C15777E, T> hVar) {
            this.f137803a = hVar;
        }

        /* renamed from: b */
        public Optional<T> a(C15777E e10) {
            return Optional.ofNullable(this.f137803a.a(e10));
        }
    }

    r() {
    }

    public h<C15777E, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        if (h.a.b(type) != Optional.class) {
            return null;
        }
        return new a(yVar.h(h.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
