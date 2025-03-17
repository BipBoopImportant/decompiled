package DI;

import DI.C15554a;
import DI.C15555b;
import EI.C15649h;
import cJ.C17069f;
import java.util.Collection;
import java.util.List;
import uJ.C18096U;
import uJ.H0;
import uJ.J0;

/* renamed from: DI.z  reason: case insensitive filesystem */
public interface C15579z extends C15555b {

    /* renamed from: DI.z$a */
    public interface a<D extends C15579z> {
        a<D> a();

        a<D> b(List<u0> list);

        a<D> c(C15535F f10);

        a<D> d(H0 h02);

        a<D> e();

        a<D> f(C15574u uVar);

        D g();

        a<D> h();

        a<D> i(C15649h hVar);

        a<D> j(C17069f fVar);

        <V> a<D> k(C15554a.C3296a<V> aVar, V v10);

        a<D> l(C15566m mVar);

        a<D> m(d0 d0Var);

        a<D> n();

        a<D> o(boolean z10);

        a<D> p(C15555b.a aVar);

        a<D> q(d0 d0Var);

        a<D> r(List<n0> list);

        a<D> s(C15555b bVar);

        a<D> t(C18096U u10);

        a<D> u();
    }

    boolean D0();

    boolean E();

    boolean G0();

    C15579z a();

    C15566m b();

    C15579z c(J0 j02);

    Collection<? extends C15579z> e();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    C15579z t0();

    a<? extends C15579z> x();
}
