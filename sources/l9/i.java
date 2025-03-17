package l9;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l9.C8544b;

public abstract class i {

    public static abstract class a {
        public final a a(String str, int i10) {
            e().put(str, String.valueOf(i10));
            return this;
        }

        public final a b(String str, long j10) {
            e().put(str, String.valueOf(j10));
            return this;
        }

        public final a c(String str, String str2) {
            e().put(str, str2);
            return this;
        }

        public abstract i d();

        /* access modifiers changed from: protected */
        public abstract Map<String, String> e();

        /* access modifiers changed from: protected */
        public abstract a f(Map<String, String> map);

        public abstract a g(Integer num);

        public abstract a h(h hVar);

        public abstract a i(long j10);

        public abstract a j(byte[] bArr);

        public abstract a k(byte[] bArr);

        public abstract a l(Integer num);

        public abstract a m(String str);

        public abstract a n(String str);

        public abstract a o(long j10);
    }

    public static a a() {
        return new C8544b.C0873b().f(new HashMap());
    }

    public final String b(String str) {
        String str2 = c().get(str);
        return str2 == null ? "" : str2;
    }

    /* access modifiers changed from: protected */
    public abstract Map<String, String> c();

    public abstract Integer d();

    public abstract h e();

    public abstract long f();

    public abstract byte[] g();

    public abstract byte[] h();

    public final int i(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long j(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> k() {
        return Collections.unmodifiableMap(c());
    }

    public abstract Integer l();

    public abstract String m();

    public abstract String n();

    public abstract long o();

    public a p() {
        return new C8544b.C0873b().n(n()).g(d()).l(l()).m(m()).j(g()).k(h()).h(e()).i(f()).o(o()).f(new HashMap(c()));
    }
}
