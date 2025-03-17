package Db;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import qb.C10156a;
import sb.C10223b;
import vb.C10302b;

public final class c implements C10156a {

    /* renamed from: b  reason: collision with root package name */
    public static final C10302b.C1424b f59021b = C10302b.C1424b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a  reason: collision with root package name */
    private final C10223b f59022a;

    public c(byte[] bArr) {
        if (f59021b.a()) {
            this.f59022a = new C10223b(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f59022a.b(p.c(12), bArr, bArr2);
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        return this.f59022a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
