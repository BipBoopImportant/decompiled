package nts;

/* renamed from: nts.Ѫ  reason: contains not printable characters */
public class C3602 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public String f438 = C4081.m3210(0, 4, 92);

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m408(String str) {
        if (str != null) {
            this.f438 = str;
            return;
        }
        throw new C3641(C3727.m1052("\u000b\u0011\u001bjK]SK\\{oiYhik\u00046 3,%-6m/. ''?j71w8414&4*:~q;9\b\u0000\u0010\u0012\u0014\u000fIM", 4, 5, 60));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m409(byte[] bArr, int i10) {
        byte[] bArr2 = bArr;
        int i11 = i10;
        if (bArr2 == null) {
            throw new C3641(C3727.m1052("\u000b\u0011\u001bjK]SK\\{oiYhik\u00046 3,%-6m/. ''?j71w8414&4*:~q;9\b\u0000\u0010\u0012\u0014\u000fIM", 9, 7, 7));
        } else if (i11 >= 0) {
            byte[] bArr3 = new byte[i11];
            String str = this.f438;
            C4094 r92 = C3990.f2631;
            C3638 r82 = C3618.f582.m563(str);
            int i12 = r82.f625 / 8;
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14 += i12) {
                byte[] bArr4 = {(byte) (i13 >> 24), (byte) (i13 >> 16), (byte) (i13 >> 8), (byte) i13};
                int length = bArr2.length;
                r82.m618(bArr2, 0, length);
                System.arraycopy(bArr2, 0, new byte[bArr2.length], 0, length);
                r82.m618(bArr4, 0, 4);
                r82.f624 = r82.m624();
                System.arraycopy(bArr4, 0, new byte[4], 0, 4);
                byte[] bArr5 = r82.f624;
                int i15 = i11 - i14;
                if (i12 <= i15) {
                    System.arraycopy(bArr5, 0, bArr3, i14, i12);
                } else {
                    System.arraycopy(bArr5, 0, bArr3, i14, i15);
                }
                r82.m617();
                i13++;
            }
            return bArr3;
        } else {
            throw new IndexOutOfBoundsException(C3727.m1052("\u000b\u0011\u001bjK]SK\\{oiYhik\u00046 3,%-6m/. ''?j71w8414&4*:~q;9\b\u0000\u0010\u0012\u0014\u000fIM", 16, 39, 114));
        }
    }
}
