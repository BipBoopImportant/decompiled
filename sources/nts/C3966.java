package nts;

import java.security.PrivateKey;

/* renamed from: nts.ឌ  reason: contains not printable characters */
public class C3966 implements PrivateKey {

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] f2367;

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] f2368;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public C3858 f2369;

    public C3966(byte[] bArr, byte[] bArr2, String str, C3858 r42) {
        this.f2369 = r42;
        this.f2368 = bArr;
        this.f2367 = bArr2;
    }

    public String getAlgorithm() {
        return C3971.f2408;
    }

    public byte[] getEncoded() {
        int i10 = this.f2369.f1666;
        String str = i10 == 3 ? C4089.f3438 : i10 == 4 ? C4089.f3462 : "";
        byte[] bArr = this.f2368;
        byte[] bArr2 = this.f2367;
        C3796 r42 = new C3796();
        int i11 = (bArr2 == null || bArr2.length <= 0) ? 0 : 1;
        C3796 r72 = new C3796();
        r72.m1333(48);
        r72.m1334(i11, 2);
        r72.m1333(48);
        r72.m1335(str);
        r72.m1338(false);
        r72.m1333(4);
        r72.m1346(bArr, 4);
        r72.m1338(false);
        if (i11 != 0) {
            r72.m1346(bArr2, 129);
        }
        r72.m1338(false);
        r42.m1336(r72.m1349());
        return r42.m1349().f934;
    }

    public String getFormat() {
        return "";
    }
}
