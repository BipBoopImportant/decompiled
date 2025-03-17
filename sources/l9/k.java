package l9;

import java.util.concurrent.Executor;
import n9.b;
import n9.d;

public final class k implements b<Executor> {

    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final k f54893a = new k();
    }

    public static k a() {
        return a.f54893a;
    }

    public static Executor b() {
        return (Executor) d.d(j.a());
    }

    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
