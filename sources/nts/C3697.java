package nts;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;

/* renamed from: nts.ਲ  reason: contains not printable characters */
public class C3697 extends C3638 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public static byte[][] f897 = new byte[17][];

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static int[] f898 = {41, 46, 67, 201, 162, 216, 124, 1, 61, 54, 84, 161, 236, 240, 6, 19, 98, 167, 5, 243, 192, 199, 115, 140, 152, 147, 43, 217, 188, 76, 130, 202, 30, 155, 87, 60, 253, 212, 224, 22, 103, 66, 111, 24, 138, 23, 229, 18, 190, 78, 196, 214, 218, 158, 222, 73, 160, 251, 245, 142, 187, 47, 238, 122, 169, 104, 121, 145, 21, 178, 7, 63, 148, 194, 16, 137, 11, 34, 95, 33, 128, 127, 93, 154, 90, 144, 50, 39, 53, 62, 204, 231, 191, 247, 151, 3, 255, 25, 48, 179, 72, 165, 181, 209, 215, 94, 146, 42, 172, 86, 170, 198, 79, 184, 56, 210, 150, 164, 125, 182, 118, 252, 107, 226, 156, 116, 4, 241, 69, 157, 112, 89, 100, 113, 135, 32, 134, 91, 207, CheckoutActivity.RESULT_CANCELED, 230, 45, 168, 2, 27, 96, 37, 173, 174, 176, 185, 246, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, 163, 35, 221, 81, 175, 58, 195, 92, 249, 206, 186, 197, 234, 38, 44, 83, 13, 110, 133, 40, 132, 9, 211, 223, 205, 244, 65, 129, 77, 82, 106, 220, 55, 200, 108, 193, 171, 250, 36, 225, 123, 8, 12, 189, 177, 74, 120, ModuleDescriptor.MODULE_VERSION, 149, 139, 227, 99, 232, 109, 233, 203, 213, 254, 59, 0, 29, 57, 242, 239, 183, 14, CheckoutActivity.RESULT_ERROR, 88, 208, 228, 166, 119, 114, 248, 235, 117, 75, 10, 49, 68, 80, 180, 143, 237, 31, 26, 219, 153, 141, 51, 159, 17, 131, 20};

    /* renamed from: ࡏ  reason: contains not printable characters */
    public short f899 = 0;

    /* renamed from: ખ  reason: contains not printable characters */
    public byte[] f900 = new byte[16];

    /* renamed from: ⶊ  reason: contains not printable characters */
    public byte[] f901 = new byte[16];

    /* renamed from: ⶏ  reason: contains not printable characters */
    public byte[] f902 = new byte[16];

    static {
        int i10 = 0;
        while (true) {
            byte[][] bArr = f897;
            if (i10 < bArr.length) {
                bArr[i10] = new byte[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    f897[i10][i11] = (byte) i10;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public C3697() {
        this.f625 = 128;
        m885();
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m885() {
        for (int i10 = 0; i10 < 16; i10++) {
            this.f901[i10] = 0;
            this.f902[i10] = 0;
            this.f900[i10] = 0;
        }
        this.f899 = 0;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m886(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        if (C3596.f363) {
            short s10 = this.f899;
            this.f899 = (short) ((s10 + i11) & 15);
            int i13 = 16 - s10;
            if (i11 >= i13) {
                System.arraycopy(bArr, i10, this.f900, s10, i13);
                m887(this.f900, 0);
                while (i13 + 15 < i11) {
                    m887(bArr, i10 + i13);
                    i13 += 16;
                }
                s10 = 0;
                i12 = i13;
            }
            System.arraycopy(bArr, i10 + i12, this.f900, s10, i11 - i12);
            return;
        }
        throw new C3625((Throwable) null, 702, C3727.m1052("H@5&hs#fh|}kjioq:", 0, 18, 23));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m887(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[48];
        System.arraycopy(this.f901, 0, bArr2, 0, 16);
        System.arraycopy(bArr, i10, bArr2, 16, 16);
        for (int i11 = 0; i11 < 16; i11++) {
            bArr2[i11 + 32] = (byte) (this.f901[i11] ^ bArr[i10 + i11]);
        }
        short s10 = 0;
        for (short s11 = 0; s11 < 18; s11 = (short) (s11 + 1)) {
            for (short s12 = 0; s12 < 48; s12 = (short) (s12 + 1)) {
                byte b10 = (byte) (((byte) f898[s10]) ^ bArr2[s12]);
                bArr2[s12] = b10;
                s10 = (short) (b10 & 255);
            }
            s10 = (short) ((s10 + s11) & 255);
        }
        System.arraycopy(bArr2, 0, this.f901, 0, 16);
        short s13 = (short) (this.f902[15] & 255);
        for (int i12 = 0; i12 < 16; i12++) {
            byte[] bArr3 = this.f902;
            byte b11 = (byte) (((byte) f898[(s13 ^ bArr[i10 + i12]) & 255]) ^ bArr3[i12]);
            bArr3[i12] = b11;
            s13 = (short) (b11 & 255);
        }
        for (int i13 = 0; i13 < 48; i13++) {
            bArr2[i13] = 0;
        }
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m888() {
        int i10 = 16 - this.f899;
        m886(f897[i10], 0, i10);
        m886(this.f902, 0, 16);
        byte[] bArr = new byte[16];
        this.f624 = bArr;
        System.arraycopy(this.f901, 0, bArr, 0, 16);
        m885();
        return this.f624;
    }
}
