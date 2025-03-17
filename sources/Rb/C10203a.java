package rb;

import Cb.J;
import java.security.GeneralSecurityException;
import ub.C10260a;
import yb.o;

/* renamed from: rb.a  reason: case insensitive filesystem */
public final class C10203a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f76283a = new C10207e().d();

    /* renamed from: b  reason: collision with root package name */
    public static final String f76284b = new p().d();

    /* renamed from: c  reason: collision with root package name */
    public static final String f76285c = new u().d();

    /* renamed from: d  reason: collision with root package name */
    public static final String f76286d = new C10210h().d();

    /* renamed from: e  reason: collision with root package name */
    public static final String f76287e = new C10200D().d();

    /* renamed from: f  reason: collision with root package name */
    public static final String f76288f = new C10202F().d();

    /* renamed from: g  reason: collision with root package name */
    public static final String f76289g = new z().d();

    /* renamed from: h  reason: collision with root package name */
    public static final String f76290h = new H().d();
    @Deprecated

    /* renamed from: i  reason: collision with root package name */
    public static final J f76291i;
    @Deprecated

    /* renamed from: j  reason: collision with root package name */
    public static final J f76292j;
    @Deprecated

    /* renamed from: k  reason: collision with root package name */
    public static final J f76293k;

    static {
        J R10 = J.R();
        f76291i = R10;
        f76292j = R10;
        f76293k = R10;
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
        C10206d.e();
        o.b();
        C10207e.p(true);
        p.o(true);
        if (!C10260a.a()) {
            C10210h.o(true);
            u.p(true);
            z.m(true);
            C10200D.m(true);
            C10202F.m(true);
            H.m(true);
        }
    }
}
