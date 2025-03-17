package zb;

import java.security.GeneralSecurityException;
import vb.C10302b;
import yb.C10420g;
import yb.C10422i;

/* renamed from: zb.c  reason: case insensitive filesystem */
public final class C10487c implements C10420g {

    /* renamed from: b  reason: collision with root package name */
    private static final C10302b.C1424b f78112b = C10302b.C1424b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a  reason: collision with root package name */
    private final C10422i f78113a;

    public C10487c(C10422i iVar) {
        if (f78112b.a()) {
            this.f78113a = iVar;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
