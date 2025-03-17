package l9;

import android.util.Base64;
import j9.f;
import l9.C8546d;

public abstract class p {

    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(f fVar);
    }

    public static a a() {
        return new C8546d.b().d(f.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract f d();

    public boolean e() {
        return c() != null;
    }

    public p f(f fVar) {
        return a().b(b()).d(fVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", new Object[]{b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2)});
    }
}
