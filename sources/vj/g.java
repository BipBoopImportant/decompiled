package vJ;

import DI.C15538I;
import DI.C15558e;
import DI.C15561h;
import DI.C15566m;
import cJ.C17065b;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nJ.C17656k;
import uJ.C18096U;
import uJ.C18138s;
import uJ.y0;
import yJ.C18740i;

public abstract class g extends C18138s {

    public static final class a extends g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f149050a = new a();

        private a() {
        }

        public C15558e b(C17065b bVar) {
            C17542s.j(bVar, "classId");
            return null;
        }

        public <S extends C17656k> S c(C15558e eVar, C17631a<? extends S> aVar) {
            C17542s.j(eVar, "classDescriptor");
            C17542s.j(aVar, "compute");
            return (C17656k) aVar.invoke();
        }

        public boolean d(C15538I i10) {
            C17542s.j(i10, "moduleDescriptor");
            return false;
        }

        public boolean e(y0 y0Var) {
            C17542s.j(y0Var, "typeConstructor");
            return false;
        }

        public Collection<C18096U> g(C15558e eVar) {
            C17542s.j(eVar, "classDescriptor");
            Collection<C18096U> a10 = eVar.k().a();
            C17542s.i(a10, "getSupertypes(...)");
            return a10;
        }

        /* renamed from: h */
        public C18096U a(C18740i iVar) {
            C17542s.j(iVar, "type");
            return (C18096U) iVar;
        }

        /* renamed from: i */
        public C15558e f(C15566m mVar) {
            C17542s.j(mVar, "descriptor");
            return null;
        }
    }

    public abstract C15558e b(C17065b bVar);

    public abstract <S extends C17656k> S c(C15558e eVar, C17631a<? extends S> aVar);

    public abstract boolean d(C15538I i10);

    public abstract boolean e(y0 y0Var);

    public abstract C15561h f(C15566m mVar);

    public abstract Collection<C18096U> g(C15558e eVar);

    public abstract C18096U h(C18740i iVar);
}
