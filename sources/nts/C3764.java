package nts;

import java.security.MessageDigest;

/* renamed from: nts.ྈ  reason: contains not printable characters */
public class C3764 extends C3638 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public String f1221;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public String f1222;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public MessageDigest f1223 = null;

    public C3764() {
    }

    public Object clone() {
        C3764 r02 = new C3764();
        String str = this.f1222;
        r02.f1222 = str;
        r02.f1221 = this.f1221;
        r02.f625 = C3990.m2437(str);
        r02.f1223 = (MessageDigest) this.f1223.clone();
        return r02;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m1210() {
        try {
            String str = this.f1221;
            if (str == null) {
                this.f1223 = MessageDigest.getInstance(this.f1222);
            } else {
                this.f1223 = MessageDigest.getInstance(this.f1222, str);
            }
        } catch (Exception e10) {
            throw new C3738(e10.getMessage());
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1211(byte[] bArr, int i10, int i11) {
        try {
            this.f1223.update(bArr, i10, i11);
        } catch (Exception e10) {
            throw new C3738(e10.getMessage());
        }
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m1212() {
        return this.f1223.digest();
    }

    public C3764(String str, String str2) {
        this.f1221 = str2;
        this.f625 = C3990.m2437(str);
        this.f1222 = str.toUpperCase();
        m1210();
    }
}
