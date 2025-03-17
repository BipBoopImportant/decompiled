package qb;

import java.security.GeneralSecurityException;

/* renamed from: qb.m  reason: case insensitive filesystem */
public final class C10168m {
    public static C10167l a(String str) {
        C10167l lVar = C10179x.i().get(str);
        if (lVar != null) {
            return lVar;
        }
        throw new GeneralSecurityException("cannot find key template: " + str);
    }
}
