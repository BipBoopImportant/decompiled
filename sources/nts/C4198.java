package nts;

import java.security.SecureRandom;

/* renamed from: nts.せ  reason: contains not printable characters */
public class C4198 extends C3749 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public SecureRandom f4041;

    public C4198() {
        this.f4041 = null;
        this.f4041 = new SecureRandom();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3745(byte[] bArr) {
        this.f4041.nextBytes(bArr);
    }
}
