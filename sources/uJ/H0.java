package uJ;

import EI.C15649h;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class H0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f147817a = new b((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final H0 f147818b = new a();

    public static final class a extends H0 {
        a() {
        }

        public /* bridge */ /* synthetic */ E0 e(C18096U u10) {
            return (E0) i(u10);
        }

        public boolean f() {
            return true;
        }

        public Void i(C18096U u10) {
            C17542s.j(u10, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends H0 {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H0 f147819c;

        c(H0 h02) {
            this.f147819c = h02;
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public C15649h d(C15649h hVar) {
            C17542s.j(hVar, "annotations");
            return this.f147819c.d(hVar);
        }

        public E0 e(C18096U u10) {
            C17542s.j(u10, "key");
            return this.f147819c.e(u10);
        }

        public boolean f() {
            return this.f147819c.f();
        }

        public C18096U g(C18096U u10, Q0 q02) {
            C17542s.j(u10, "topLevelType");
            C17542s.j(q02, "position");
            return this.f147819c.g(u10, q02);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final J0 c() {
        J0 g10 = J0.g(this);
        C17542s.i(g10, "create(...)");
        return g10;
    }

    public C15649h d(C15649h hVar) {
        C17542s.j(hVar, "annotations");
        return hVar;
    }

    public abstract E0 e(C18096U u10);

    public boolean f() {
        return false;
    }

    public C18096U g(C18096U u10, Q0 q02) {
        C17542s.j(u10, "topLevelType");
        C17542s.j(q02, "position");
        return u10;
    }

    public final H0 h() {
        return new c(this);
    }
}
