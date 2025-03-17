package Db;

import java.security.SecureRandom;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<SecureRandom> f59073a = new a();

    class a extends ThreadLocal<SecureRandom> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public SecureRandom initialValue() {
            return p.b();
        }
    }

    /* access modifiers changed from: private */
    public static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int i10) {
        byte[] bArr = new byte[i10];
        f59073a.get().nextBytes(bArr);
        return bArr;
    }
}
