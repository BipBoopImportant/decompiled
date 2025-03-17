package uJ;

import DI.n0;
import YH.C16877v;
import YH.X;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class z0 extends H0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f147956c = new a((DefaultConstructorMarker) null);

    public static final class a {

        /* renamed from: uJ.z0$a$a  reason: collision with other inner class name */
        public static final class C4286a extends z0 {

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Map<y0, E0> f147957d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f147958e;

            C4286a(Map<y0, ? extends E0> map, boolean z10) {
                this.f147957d = map;
                this.f147958e = z10;
            }

            public boolean a() {
                return this.f147958e;
            }

            public boolean f() {
                return this.f147957d.isEmpty();
            }

            public E0 k(y0 y0Var) {
                C17542s.j(y0Var, "key");
                return this.f147957d.get(y0Var);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ z0 e(a aVar, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.d(map, z10);
        }

        public final H0 a(C18096U u10) {
            C17542s.j(u10, "kotlinType");
            return b(u10.N0(), u10.L0());
        }

        public final H0 b(y0 y0Var, List<? extends E0> list) {
            C17542s.j(y0Var, "typeConstructor");
            C17542s.j(list, "arguments");
            List<n0> parameters = y0Var.getParameters();
            C17542s.i(parameters, "getParameters(...)");
            n0 n0Var = (n0) C16877v.K0(parameters);
            if (n0Var == null || !n0Var.Q()) {
                return new C18091O(parameters, list);
            }
            List<n0> parameters2 = y0Var.getParameters();
            C17542s.i(parameters2, "getParameters(...)");
            Iterable<n0> iterable = parameters2;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (n0 k10 : iterable) {
                arrayList.add(k10.k());
            }
            return e(this, X.v(C16877v.D1(arrayList, list)), false, 2, (Object) null);
        }

        public final z0 c(Map<y0, ? extends E0> map) {
            C17542s.j(map, "map");
            return e(this, map, false, 2, (Object) null);
        }

        public final z0 d(Map<y0, ? extends E0> map, boolean z10) {
            C17542s.j(map, "map");
            return new C4286a(map, z10);
        }

        private a() {
        }
    }

    public static final H0 i(y0 y0Var, List<? extends E0> list) {
        return f147956c.b(y0Var, list);
    }

    public static final z0 j(Map<y0, ? extends E0> map) {
        return f147956c.c(map);
    }

    public E0 e(C18096U u10) {
        C17542s.j(u10, "key");
        return k(u10.N0());
    }

    public abstract E0 k(y0 y0Var);
}
