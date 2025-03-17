package FI;

import DI.C15557d;
import DI.C15558e;
import DI.h0;
import YH.C16877v;
import cJ.C17069f;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;

/* renamed from: FI.a  reason: case insensitive filesystem */
public interface C15685a {

    /* renamed from: FI.a$a  reason: collision with other inner class name */
    public static final class C3308a implements C15685a {

        /* renamed from: a  reason: collision with root package name */
        public static final C3308a f134401a = new C3308a();

        private C3308a() {
        }

        public Collection<h0> a(C17069f fVar, C15558e eVar) {
            C17542s.j(fVar, "name");
            C17542s.j(eVar, "classDescriptor");
            return C16877v.n();
        }

        public Collection<C18096U> c(C15558e eVar) {
            C17542s.j(eVar, "classDescriptor");
            return C16877v.n();
        }

        public Collection<C15557d> d(C15558e eVar) {
            C17542s.j(eVar, "classDescriptor");
            return C16877v.n();
        }

        public Collection<C17069f> e(C15558e eVar) {
            C17542s.j(eVar, "classDescriptor");
            return C16877v.n();
        }
    }

    Collection<h0> a(C17069f fVar, C15558e eVar);

    Collection<C18096U> c(C15558e eVar);

    Collection<C15557d> d(C15558e eVar);

    Collection<C17069f> e(C15558e eVar);
}
