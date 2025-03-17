package l9;

import j9.c;
import j9.d;
import j9.h;
import l9.C8545c;

abstract class o {

    public static abstract class a {
        public abstract o a();

        /* access modifiers changed from: package-private */
        public abstract a b(c cVar);

        /* access modifiers changed from: package-private */
        public abstract a c(d<?> dVar);

        /* access modifiers changed from: package-private */
        public abstract a d(h<?, byte[]> hVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    o() {
    }

    public static a a() {
        return new C8545c.b();
    }

    public abstract c b();

    /* access modifiers changed from: package-private */
    public abstract d<?> c();

    public byte[] d() {
        return e().apply(c().c());
    }

    /* access modifiers changed from: package-private */
    public abstract h<?, byte[]> e();

    public abstract p f();

    public abstract String g();
}
