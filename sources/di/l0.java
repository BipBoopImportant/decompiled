package DI;

import XH.C16807N;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import uJ.C18096U;
import uJ.y0;

public interface l0 {

    public static final class a implements l0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f133844a = new a();

        private a() {
        }

        public Collection<C18096U> a(y0 y0Var, Collection<? extends C18096U> collection, C17642l<? super y0, ? extends Iterable<? extends C18096U>> lVar, C17642l<? super C18096U, C16807N> lVar2) {
            C17542s.j(y0Var, "currentTypeConstructor");
            C17542s.j(collection, "superTypes");
            C17542s.j(lVar, "neighbors");
            C17542s.j(lVar2, "reportLoop");
            return collection;
        }
    }

    Collection<C18096U> a(y0 y0Var, Collection<? extends C18096U> collection, C17642l<? super y0, ? extends Iterable<? extends C18096U>> lVar, C17642l<? super C18096U, C16807N> lVar2);
}
