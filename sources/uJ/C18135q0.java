package uJ;

import DI.C15561h;
import DI.m0;
import DI.n0;
import YH.C16877v;
import YH.X;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: uJ.q0  reason: case insensitive filesystem */
public final class C18135q0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f147923e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C18135q0 f147924a;

    /* renamed from: b  reason: collision with root package name */
    private final m0 f147925b;

    /* renamed from: c  reason: collision with root package name */
    private final List<E0> f147926c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<n0, E0> f147927d;

    /* renamed from: uJ.q0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C18135q0 a(C18135q0 q0Var, m0 m0Var, List<? extends E0> list) {
            C17542s.j(m0Var, "typeAliasDescriptor");
            C17542s.j(list, "arguments");
            List<n0> parameters = m0Var.k().getParameters();
            C17542s.i(parameters, "getParameters(...)");
            Iterable<n0> iterable = parameters;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (n0 a10 : iterable) {
                arrayList.add(a10.a());
            }
            return new C18135q0(q0Var, m0Var, list, X.v(C16877v.D1(arrayList, list)), (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C18135q0(C18135q0 q0Var, m0 m0Var, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(q0Var, m0Var, list, map);
    }

    public final List<E0> a() {
        return this.f147926c;
    }

    public final m0 b() {
        return this.f147925b;
    }

    public final E0 c(y0 y0Var) {
        C17542s.j(y0Var, "constructor");
        C15561h e10 = y0Var.e();
        if (e10 instanceof n0) {
            return this.f147927d.get(e10);
        }
        return null;
    }

    public final boolean d(m0 m0Var) {
        C17542s.j(m0Var, "descriptor");
        if (!C17542s.e(this.f147925b, m0Var)) {
            C18135q0 q0Var = this.f147924a;
            return q0Var != null ? q0Var.d(m0Var) : false;
        }
    }

    private C18135q0(C18135q0 q0Var, m0 m0Var, List<? extends E0> list, Map<n0, ? extends E0> map) {
        this.f147924a = q0Var;
        this.f147925b = m0Var;
        this.f147926c = list;
        this.f147927d = map;
    }
}
