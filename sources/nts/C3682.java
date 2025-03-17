package nts;

/* renamed from: nts.ॱ  reason: contains not printable characters */
public class C3682 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public static byte[] f814 = new byte[0];

    /* renamed from: ϴ  reason: contains not printable characters */
    public byte[] f815 = new byte[0];

    /* renamed from: ࡏ  reason: contains not printable characters */
    public byte[] f816;

    /* renamed from: ગ  reason: contains not printable characters */
    public String f817 = C4081.m3211(0, 8, 7);

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] f818 = new byte[0];

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f819;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int f820;

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m805() {
        int i10 = 1;
        String str = this.f817;
        C4094 r32 = C3990.f2631;
        C3967 r22 = C3618.f582.m566(str);
        byte[] bArr = this.f818;
        byte[] bArr2 = this.f815;
        int i11 = this.f819;
        int i12 = 8;
        int i13 = this.f820 / 8;
        int i14 = r22.f625 / 8;
        this.f816 = new byte[i13];
        if (((double) i13) <= (Math.pow(2.0d, 32.0d) - 1.0d) * ((double) i14)) {
            if (bArr == null) {
                bArr = f814;
            }
            if (bArr2 == null) {
                bArr2 = f814;
            }
            int i15 = 0;
            int i16 = (i13 / i14) + (i13 % i14 > 0 ? 1 : 0);
            byte[] bArr3 = new byte[(i16 * i14)];
            int i17 = 0;
            int i18 = 0;
            while (i17 < i16) {
                i17 += i10;
                byte[] bArr4 = new byte[(bArr2.length + 4)];
                System.arraycopy(bArr2, i15, bArr4, i15, bArr2.length);
                bArr4[bArr2.length] = (byte) ((i17 & -16777216) >> 24);
                bArr4[bArr2.length + i10] = (byte) ((16711680 & i17) >> 16);
                bArr4[bArr2.length + 2] = (byte) ((65280 & i17) >> i12);
                bArr4[bArr2.length + 3] = (byte) (i17 & 255);
                C4094 r11 = C3990.f2631;
                int i19 = r22.f625 / i12;
                byte[] bArr5 = new byte[i19];
                int i20 = 0;
                while (i20 < i11) {
                    r22.m617();
                    r22.m2254(bArr);
                    int length = bArr4.length;
                    byte[] bArr6 = bArr;
                    r22.m618(bArr4, 0, length);
                    r22.f624 = r22.m624();
                    byte[] bArr7 = bArr2;
                    System.arraycopy(bArr4, 0, new byte[length], 0, length);
                    bArr4 = r22.f624;
                    for (int i21 = 0; i21 < i19; i21++) {
                        bArr5[i21] = (byte) (bArr5[i21] ^ bArr4[i21]);
                    }
                    i10 = 1;
                    i20++;
                    bArr = bArr6;
                    bArr2 = bArr7;
                }
                byte[] bArr8 = bArr2;
                System.arraycopy(bArr5, 0, bArr3, i18, i19);
                i18 += i14;
                i15 = 0;
                bArr = bArr;
                i12 = 8;
            }
            int i22 = i15;
            System.arraycopy(bArr3, i22, this.f816, i22, i13);
            return this.f816;
        }
        throw new C3625((Throwable) null, 200, C3727.m1052("GCLOXBH9,,8\":(*o+$;c0*)g464<", 8, 20, 84));
    }
}
