package zb;

import java.security.GeneralSecurityException;
import vb.C10302b;
import yb.C10414a;
import yb.C10420g;

/* renamed from: zb.b  reason: case insensitive filesystem */
public final class C10486b implements C10420g {

    /* renamed from: b  reason: collision with root package name */
    private static final C10302b.C1424b f78110b = C10302b.C1424b.ALGORITHM_NOT_FIPS;

    /* renamed from: a  reason: collision with root package name */
    private final C10414a f78111a;

    public C10486b(C10414a aVar) {
        if (f78110b.a()) {
            this.f78111a = aVar;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
