package pc;

import pc.C10132a;
import pc.C10134c;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static d f75833a = a().a();

    public static abstract class a {
        public abstract d a();

        public abstract a b(String str);

        public abstract a c(long j10);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(C10134c.a aVar);

        public abstract a h(long j10);
    }

    public static a a() {
        return new C10132a.b().h(0).g(C10134c.a.ATTEMPT_MIGRATION).c(0);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract C10134c.a g();

    public abstract long h();

    public boolean i() {
        return g() == C10134c.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == C10134c.a.NOT_GENERATED || g() == C10134c.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == C10134c.a.REGISTERED;
    }

    public boolean l() {
        return g() == C10134c.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == C10134c.a.ATTEMPT_MIGRATION;
    }

    public abstract a n();

    public d o(String str, long j10, long j11) {
        return n().b(str).c(j10).h(j11).a();
    }

    public d p() {
        return n().b((String) null).a();
    }

    public d q(String str) {
        return n().e(str).g(C10134c.a.REGISTER_ERROR).a();
    }

    public d r() {
        return n().g(C10134c.a.NOT_GENERATED).a();
    }

    public d s(String str, String str2, long j10, String str3, long j11) {
        return n().d(str).g(C10134c.a.REGISTERED).b(str3).f(str2).c(j11).h(j10).a();
    }

    public d t(String str) {
        return n().d(str).g(C10134c.a.UNREGISTERED).a();
    }
}
