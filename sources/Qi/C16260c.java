package QI;

import TI.n;
import TI.r;
import TI.w;
import YH.C16877v;
import YH.g0;
import cJ.C17069f;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17542s;

/* renamed from: QI.c  reason: case insensitive filesystem */
public interface C16260c {

    /* renamed from: QI.c$a */
    public static final class a implements C16260c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f137481a = new a();

        private a() {
        }

        public Set<C17069f> a() {
            return g0.d();
        }

        public Set<C17069f> b() {
            return g0.d();
        }

        public Set<C17069f> d() {
            return g0.d();
        }

        public w e(C17069f fVar) {
            C17542s.j(fVar, "name");
            return null;
        }

        public n f(C17069f fVar) {
            C17542s.j(fVar, "name");
            return null;
        }

        /* renamed from: g */
        public List<r> c(C17069f fVar) {
            C17542s.j(fVar, "name");
            return C16877v.n();
        }
    }

    Set<C17069f> a();

    Set<C17069f> b();

    Collection<r> c(C17069f fVar);

    Set<C17069f> d();

    w e(C17069f fVar);

    n f(C17069f fVar);
}
