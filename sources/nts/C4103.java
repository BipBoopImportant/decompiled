package nts;

import java.security.PublicKey;

/* renamed from: nts.ὠ  reason: contains not printable characters */
public class C4103 implements PublicKey {

    /* renamed from: ગ  reason: contains not printable characters */
    public C3858 f3511;

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] f3512;

    public C4103(byte[] bArr, C3858 r22) {
        this.f3511 = r22;
        this.f3512 = bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4103)) {
            return false;
        }
        return C3874.m1912(this.f3512, ((C4103) obj).f3512);
    }

    public String getAlgorithm() {
        return C3971.f2408;
    }

    public byte[] getEncoded() {
        int i10 = this.f3511.f1666;
        String str = i10 == 3 ? C4089.f3438 : i10 == 4 ? C4089.f3462 : "";
        byte[] bArr = this.f3512;
        C3796 r32 = new C3796();
        C3796 r42 = new C3796();
        r42.m1333(48);
        r42.m1333(48);
        r42.m1335(str);
        r42.m1338(false);
        r42.m1331(bArr, 3);
        r42.m1338(false);
        r32.m1336(r42.m1349());
        return r32.m1349().f934;
    }

    public String getFormat() {
        return "";
    }

    public int hashCode() {
        return super.hashCode();
    }
}
