package Z9;

import android.util.Base64;
import java.security.SecureRandom;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final SecureRandom f41423a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f41423a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
