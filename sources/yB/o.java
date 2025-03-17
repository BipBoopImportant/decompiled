package yb;

import Cb.J;
import java.security.GeneralSecurityException;
import ub.C10260a;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final String f77876a = new C10424k().d();
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final J f77877b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final J f77878c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final J f77879d;

    static {
        J R10 = J.R();
        f77877b = R10;
        f77878c = R10;
        f77879d = R10;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    @Deprecated
    public static void a() {
        b();
    }

    public static void b() {
        r.f();
        C10421h.d();
        C10424k.p(true);
        if (!C10260a.a()) {
            C10416c.o(true);
        }
    }
}
