package wb;

import Cb.J;
import java.security.GeneralSecurityException;
import ub.C10260a;

/* renamed from: wb.b  reason: case insensitive filesystem */
public final class C10350b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f77581a = new C10349a().d();
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final J f77582b = J.R();
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final J f77583c = J.R();

    static {
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        C10351c.e();
        if (!C10260a.a()) {
            C10349a.m(true);
        }
    }
}
