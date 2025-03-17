package nts;

/* renamed from: nts.ά  reason: contains not printable characters */
public class C3566 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public static byte[] f143 = new byte[0];

    /* renamed from: ϴ  reason: contains not printable characters */
    public byte[] f144 = new byte[0];

    /* renamed from: ગ  reason: contains not printable characters */
    public String f145 = C4081.m3207(0, 3, 99);

    /* renamed from: ᐳ  reason: contains not printable characters */
    public String f146 = "";

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m211(int i10, byte[] bArr, byte[] bArr2, boolean z10) {
        byte[] bArr3;
        int i11;
        int i12 = i10;
        byte[] bArr4 = bArr;
        byte[] bArr5 = bArr2;
        int length = bArr4 != null ? bArr4.length : 0;
        if (bArr5 != null) {
            length += bArr5.length;
        }
        String str = this.f145;
        String str2 = this.f146;
        byte[] bArr6 = this.f144;
        if (str.toLowerCase().indexOf(C3727.m1052("-%WEANM 3972DV\u001e\u000bY\u0014\u0014\b]\r\n\u0010\u0011\r\u0011\u0010\u0000\u0002G\u0001\u0007J-%==O1!\"!;#33x45?9s", 3, 4, 42)) >= 0) {
            String str3 = C3823.f1540;
            bArr3 = C3603.m419(str, str2.getBytes(), bArr6, i12, length);
        } else {
            String str4 = C3603.f440;
            if (!C3596.f367) {
                C4094 r10 = C3990.f2631;
                C3638 r72 = C3618.f582.m563(str);
                byte[] bArr7 = f143;
                if (str2 != null && str2.length() > 0) {
                    String str5 = C3823.f1540;
                    bArr7 = str2.getBytes();
                }
                if (bArr6 == null) {
                    bArr6 = f143;
                }
                byte[] bArr8 = new byte[length];
                byte[] bArr9 = f143;
                int i13 = 0;
                while (i13 < length) {
                    r72.m617();
                    if (!z10) {
                        int length2 = bArr9.length;
                        r72.m618(bArr9, 0, length2);
                        System.arraycopy(bArr9, 0, bArr9, 0, length2);
                    }
                    int length3 = bArr7.length;
                    r72.m618(bArr7, 0, length3);
                    System.arraycopy(bArr7, 0, bArr7, 0, length3);
                    if (z10) {
                        int length4 = bArr9.length;
                        r72.m618(bArr9, 0, length4);
                        System.arraycopy(bArr9, 0, bArr9, 0, length4);
                    }
                    int length5 = bArr6.length;
                    r72.m618(bArr6, 0, length5);
                    r72.f624 = r72.m624();
                    System.arraycopy(bArr6, 0, new byte[length5], 0, length5);
                    bArr9 = r72.f624;
                    for (int i14 = 1; i14 < i12; i14++) {
                        r72.m617();
                        bArr9 = r72.m620(bArr9);
                    }
                    int i15 = 0;
                    while (i13 < length && i15 < bArr9.length) {
                        bArr8[i13] = bArr9[i15];
                        i13++;
                        i15++;
                    }
                }
                bArr3 = bArr8;
            } else {
                throw new C3738(C3727.m1052("-%WEANM 3972DV\u001e\u000bY\u0014\u0014\b]\r\n\u0010\u0011\r\u0011\u0010\u0000\u0002G\u0001\u0007J-%==O1!\"!;#33x45?9s", 7, 46, 89));
            }
        }
        if (bArr4 != null) {
            System.arraycopy(bArr3, 0, bArr4, 0, bArr4.length);
            i11 = bArr4.length;
        } else {
            i11 = 0;
        }
        if (bArr5 != null) {
            System.arraycopy(bArr3, i11, bArr5, 0, bArr5.length);
        }
    }
}
