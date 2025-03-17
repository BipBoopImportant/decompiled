package androidx.camera.core.impl;

import androidx.camera.core.impl.X;
import java.util.Set;

public interface S0 extends X {
    <ValueT> ValueT a(X.a<ValueT> aVar) {
        return getConfig().a(aVar);
    }

    boolean b(X.a<?> aVar) {
        return getConfig().b(aVar);
    }

    void c(String str, X.b bVar) {
        getConfig().c(str, bVar);
    }

    <ValueT> ValueT d(X.a<ValueT> aVar, X.c cVar) {
        return getConfig().d(aVar, cVar);
    }

    Set<X.a<?>> e() {
        return getConfig().e();
    }

    Set<X.c> f(X.a<?> aVar) {
        return getConfig().f(aVar);
    }

    <ValueT> ValueT g(X.a<ValueT> aVar, ValueT valuet) {
        return getConfig().g(aVar, valuet);
    }

    X getConfig();

    X.c h(X.a<?> aVar) {
        return getConfig().h(aVar);
    }
}
