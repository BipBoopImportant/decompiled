package qb;

import java.security.GeneralSecurityException;

/* renamed from: qb.y  reason: case insensitive filesystem */
public final class C10180y {

    /* renamed from: a  reason: collision with root package name */
    private static final C10180y f76015a = new C10180y();

    private C10180y() {
    }

    static C10180y a() {
        return f76015a;
    }

    public static C10180y b(C10180y yVar) {
        if (yVar != null) {
            return yVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
