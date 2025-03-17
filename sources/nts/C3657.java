package nts;

import java.security.SecureRandom;

/* renamed from: nts.ܖ  reason: contains not printable characters */
public class C3657 extends C3749 {

    /* renamed from: ગ  reason: contains not printable characters */
    public static final byte[] f754 = {1};

    /* renamed from: ഇ  reason: contains not printable characters */
    public static final byte[] f755 = {0};

    /* renamed from: ϴ  reason: contains not printable characters */
    public C3638 f756 = C3990.m2417(C3927.m2065(0, 6, 66));

    /* renamed from: Е  reason: contains not printable characters */
    public long f757 = 0;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public byte[] f758;

    /* renamed from: ખ  reason: contains not printable characters */
    public byte[] f759;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public SecureRandom f760 = null;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f761 = 440;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int f762 = 32;

    /* renamed from: ગ  reason: contains not printable characters */
    public final void m695(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length * 8 <= 524288) {
            if (this.f757 > 281474976710656L) {
                byte[] bArr5 = new byte[this.f762];
                this.f760.nextBytes(bArr5);
                byte[] r72 = m698(f754, this.f758, bArr5, bArr4);
                this.f758 = r72;
                this.f759 = m698(f755, r72, (byte[]) null, (byte[]) null);
                this.f757 = 1;
            }
            byte[] bArr6 = new byte[1];
            if (bArr4 != null) {
                bArr6[0] = 2;
                this.f756.m617();
                this.f756.m618(bArr6, 0, 1);
                C3638 r11 = this.f756;
                byte[] bArr7 = this.f758;
                r11.m618(bArr7, 0, bArr7.length);
                C3638 r112 = this.f756;
                int length = bArr4.length;
                r112.m618(bArr4, 0, length);
                r112.f624 = r112.m624();
                System.arraycopy(bArr4, 0, new byte[length], 0, length);
                C3638 r22 = this.f756;
                C4094 r113 = C3990.f2631;
                m697(this.f758, r22.f624);
            }
            int length2 = bArr3.length;
            C3638 r114 = this.f756;
            C4094 r12 = C3990.f2631;
            int i10 = r114.f625 / 8;
            int i11 = ((length2 + i10) - 1) / i10;
            byte[] bArr8 = this.f758;
            byte[] bArr9 = new byte[bArr8.length];
            System.arraycopy(bArr8, 0, bArr9, 0, bArr8.length);
            this.f756.m617();
            int i12 = 0;
            for (int i13 = 0; i13 <= i11; i13++) {
                int i14 = i10 + i12 > length2 ? length2 - i12 : i10;
                System.arraycopy(this.f756.m620(bArr9), 0, bArr3, i12, i14);
                i12 += i14;
                m697(bArr9, f754);
            }
            bArr6[0] = 3;
            this.f756.m617();
            this.f756.m618(bArr6, 0, 1);
            C3638 r13 = this.f756;
            byte[] bArr10 = this.f758;
            int length3 = bArr10.length;
            r13.m618(bArr10, 0, length3);
            r13.f624 = r13.m624();
            System.arraycopy(bArr10, 0, new byte[length3], 0, length3);
            long j10 = this.f757;
            m697(this.f758, this.f756.f624);
            m697(this.f758, this.f759);
            m697(this.f758, new byte[]{(byte) ((int) (j10 >> 24)), (byte) ((int) (j10 >> 16)), (byte) ((int) (j10 >> 8)), (byte) ((int) j10)});
            this.f757++;
            return;
        }
        throw new C3738(C3727.m1052("7-'uuw='-|\u0004\u001e\u0014FAFrhb002'=7bac}ani\u0004\u001e\u0014AB@^BJH7-'txu\u0013\t\u0003VUW;\u0016\u000f\u0017\u0018]\u0010\u0010\u0004Q\u0011\u0001\u0011\u0014\u0002\u0012H!\u000b\u0018\u00042*=\"&XCF\n\tDDX\r]ZPQMQP@B\tf@[MGCM\bCGQE\u0003NDNXJU", 99, 19, 95));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m696(byte[] bArr) {
        if (bArr.length != 0) {
            try {
                if (this.f760 == null) {
                    SecureRandom secureRandom = new SecureRandom();
                    this.f760 = secureRandom;
                    byte[] bArr2 = new byte[this.f762];
                    secureRandom.nextBytes(bArr2);
                    byte[] r12 = m698(bArr2, (byte[]) null, (byte[]) null, (byte[]) null);
                    this.f758 = r12;
                    this.f759 = m698(f755, r12, (byte[]) null, (byte[]) null);
                    this.f757 = 1;
                }
                m695(bArr, (byte[]) null);
            } catch (Exception e10) {
                throw new C3625((Throwable) null, 0, e10.getMessage());
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final byte[] m698(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = bArr;
        byte[] bArr6 = bArr2;
        byte[] bArr7 = bArr3;
        byte[] bArr8 = bArr4;
        C3638 r62 = this.f756;
        C4094 r72 = C3990.f2631;
        int i10 = r62.f625 / 8;
        int i11 = this.f761 / 8;
        int i12 = ((i11 + i10) - 1) / i10;
        byte[] bArr9 = new byte[i11];
        int i13 = 1;
        byte b10 = 1;
        int i14 = 0;
        while (i13 <= i12) {
            int i15 = this.f761;
            int i16 = i12;
            int i17 = i13;
            this.f756.m617();
            this.f756.m618(new byte[]{b10, (byte) (i15 >> 24), (byte) (i15 >> 16), (byte) (i15 >> 8), (byte) i15}, 0, 5);
            if (bArr5 != null) {
                this.f756.m618(bArr5, 0, bArr5.length);
            }
            if (bArr6 != null) {
                this.f756.m618(bArr6, 0, bArr6.length);
            }
            if (bArr7 != null) {
                this.f756.m618(bArr7, 0, bArr7.length);
            }
            if (bArr8 != null) {
                this.f756.m618(bArr8, 0, bArr8.length);
            }
            int i18 = i10 + i14 > i11 ? i11 - i14 : i10;
            C3638 r11 = this.f756;
            byte[] bArr10 = C3596.f365;
            r11.m618(bArr10, 0, 0);
            r11.f624 = r11.m624();
            System.arraycopy(bArr10, 0, new byte[0], 0, 0);
            System.arraycopy(this.f756.f624, 0, bArr9, i14, i18);
            i14 += i18;
            b10 = (byte) (b10 + 1);
            i13 = i17 + 1;
            i12 = i16;
        }
        return bArr9;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m697(byte[] bArr, byte[] bArr2) {
        byte b10 = 0;
        for (int i10 = 1; i10 <= bArr2.length; i10++) {
            int i11 = (bArr[bArr.length - i10] & 255) + (bArr2[bArr2.length - i10] & 255) + b10;
            b10 = i11 > 255 ? (byte) 1 : 0;
            bArr[bArr.length - i10] = (byte) i11;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i12 = (bArr[bArr.length - length] & 255) + b10;
            b10 = i12 > 255 ? (byte) 1 : 0;
            bArr[bArr.length - length] = (byte) i12;
        }
    }
}
