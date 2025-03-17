package Db;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import vb.C10302b;

public final class n implements Bb.a {

    /* renamed from: e  reason: collision with root package name */
    public static final C10302b.C1424b f59065e = C10302b.C1424b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal<Mac> f59066a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f59067b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Key f59068c;

    /* renamed from: d  reason: collision with root package name */
    private final int f59069d;

    class a extends ThreadLocal<Mac> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Mac initialValue() {
            try {
                Mac a10 = i.f59051c.a(n.this.f59067b);
                a10.init(n.this.f59068c);
                return a10;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public n(String str, Key key) {
        a aVar = new a();
        this.f59066a = aVar;
        if (f59065e.a()) {
            this.f59067b = str;
            this.f59068c = key;
            if (key.getEncoded().length >= 16) {
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        this.f59069d = 20;
                        break;
                    case 1:
                        this.f59069d = 28;
                        break;
                    case 2:
                        this.f59069d = 32;
                        break;
                    case 3:
                        this.f59069d = 48;
                        break;
                    case 4:
                        this.f59069d = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
                }
                aVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    public byte[] a(byte[] bArr, int i10) {
        if (i10 <= this.f59069d) {
            this.f59066a.get().update(bArr);
            return Arrays.copyOf(this.f59066a.get().doFinal(), i10);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
