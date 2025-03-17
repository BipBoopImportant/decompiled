package k9;

import java.util.List;
import k9.C8477k;

/* renamed from: k9.u  reason: case insensitive filesystem */
public abstract class C8487u {

    /* renamed from: k9.u$a */
    public static abstract class a {
        public abstract C8487u a();

        public abstract a b(C8481o oVar);

        public abstract a c(List<C8486t> list);

        /* access modifiers changed from: package-private */
        public abstract a d(Integer num);

        /* access modifiers changed from: package-private */
        public abstract a e(String str);

        public abstract a f(C8490x xVar);

        public abstract a g(long j10);

        public abstract a h(long j10);

        public a i(int i10) {
            return d(Integer.valueOf(i10));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new C8477k.b();
    }

    public abstract C8481o b();

    public abstract List<C8486t> c();

    public abstract Integer d();

    public abstract String e();

    public abstract C8490x f();

    public abstract long g();

    public abstract long h();
}
