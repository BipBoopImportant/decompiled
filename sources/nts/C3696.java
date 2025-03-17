package nts;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;

/* renamed from: nts.ਔ  reason: contains not printable characters */
public abstract class C3696 {

    /* renamed from: ગ  reason: contains not printable characters */
    public PublicKey f894 = null;

    /* renamed from: ഇ  reason: contains not printable characters */
    public PrivateKey f895 = null;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int f896 = 0;

    /* renamed from: ഇ  reason: contains not printable characters */
    public static KeyFactory m883(String str, String str2) {
        if (C3596.f367) {
            str2 = C3690.f885;
        }
        if (str2 == null || str2.length() <= 0) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, str2);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public abstract int m884();
}
