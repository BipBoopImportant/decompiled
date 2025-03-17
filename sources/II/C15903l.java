package II;

import DI.j0;
import JI.u;
import SI.C16420a;
import SI.C16421b;
import TI.l;
import kotlin.jvm.internal.C17542s;

/* renamed from: II.l  reason: case insensitive filesystem */
public final class C15903l implements C16421b {

    /* renamed from: a  reason: collision with root package name */
    public static final C15903l f135493a = new C15903l();

    /* renamed from: II.l$a */
    public static final class a implements C16420a {

        /* renamed from: b  reason: collision with root package name */
        private final u f135494b;

        public a(u uVar) {
            C17542s.j(uVar, "javaElement");
            this.f135494b = uVar;
        }

        public j0 b() {
            j0 j0Var = j0.f133843a;
            C17542s.i(j0Var, "NO_SOURCE_FILE");
            return j0Var;
        }

        /* renamed from: d */
        public u c() {
            return this.f135494b;
        }

        public String toString() {
            return a.class.getName() + ": " + c();
        }
    }

    private C15903l() {
    }

    public C16420a a(l lVar) {
        C17542s.j(lVar, "javaElement");
        return new a((u) lVar);
    }
}
