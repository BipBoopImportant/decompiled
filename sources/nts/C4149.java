package nts;

import java.security.SecureRandom;

/* renamed from: nts.Ⲥ  reason: contains not printable characters */
public class C4149 extends C3749 {

    /* renamed from: ગ  reason: contains not printable characters */
    public static SecureRandom f3774;

    /* renamed from: ഇ  reason: contains not printable characters */
    public static SecureRandom f3775;

    /* renamed from: ϴ  reason: contains not printable characters */
    public String f3776;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] f3777 = null;

    public C4149(String str) {
        this.f3776 = str.toUpperCase();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static byte[] m3450(int i10) {
        if (f3774 == null) {
            f3774 = m3449(C3727.m1052("==?327;02,cccevnuyy{wvstvhEEGKJOCHJT\r\r\r\u000b\u0018\u0000\u001b\u0019\u0019\u001f\u0011\u000f\r", 0, 10, 121));
        }
        byte[] bArr = new byte[i10];
        f3774.nextBytes(bArr);
        return bArr;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3451(byte[] bArr) {
        SecureRandom secureRandom;
        if (this.f3776.equals(C3727.m1052("==?327;02,cccevnuyy{wvstvhEEGKJOCHJT\r\r\r\u000b\u0018\u0000\u001b\u0019\u0019\u001f\u0011\u000f\r", 17, 10, 44))) {
            if (f3774 == null) {
                f3774 = m3449(C3727.m1052("==?327;02,cccevnuyy{wvstvhEEGKJOCHJT\r\r\r\u000b\u0018\u0000\u001b\u0019\u0019\u001f\u0011\u000f\r", 27, 10, 26));
            }
            secureRandom = f3774;
        } else {
            if (f3775 == null) {
                SecureRandom r02 = m3449(C3727.m1052("==?327;02,cccevnuyy{wvstvhEEGKJOCHJT\r\r\r\u000b\u0018\u0000\u001b\u0019\u0019\u001f\u0011\u000f\r", 37, 7, 107));
                f3775 = r02;
                byte[] bArr2 = this.f3777;
                if (bArr2 != null && bArr2.length > 0) {
                    r02.setSeed(bArr2);
                }
            }
            secureRandom = f3775;
        }
        secureRandom.nextBytes(bArr);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static SecureRandom m3449(String str) {
        try {
            return SecureRandom.getInstance(str, C3727.m1052("==?327;02,cccevnuyy{wvstvhEEGKJOCHJT\r\r\r\u000b\u0018\u0000\u001b\u0019\u0019\u001f\u0011\u000f\r", 44, 6, 113));
        } catch (Exception e10) {
            throw new C3625(0, e10.getMessage());
        }
    }
}
