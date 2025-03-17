package nts;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;

/* renamed from: nts.ፆ  reason: contains not printable characters */
public class C3852 {

    /* renamed from: ગ  reason: contains not printable characters */
    public static final int[] f1632 = {1634760805, 824206446, 2036477238, 1797285236};

    /* renamed from: ഇ  reason: contains not printable characters */
    public static final int[] f1633 = {1634760805, 857760878, 2036477234, 1797285236};

    /* renamed from: ϴ  reason: contains not printable characters */
    public int[] f1634 = new int[16];

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int f1635 = 20;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int[] f1636 = new int[16];

    /* renamed from: ⶊ  reason: contains not printable characters */
    public byte[] f1637 = new byte[64];

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int f1638 = 0;

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m1783(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1787(byte[] bArr, byte[] bArr2, long j10, int i10, int i11) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        long j11 = j10;
        int[] iArr = this.f1636;
        boolean z10 = i11 == 1;
        if (!z10 && bArr3.length != 32 && bArr3.length != 16) {
            throw new C3738(C3727.m1052("2!/1$vwf;-:?$>*=q1scglw9+xiok|=7\u0015@\b\u0007\u001crxie}n>=\"qepsnv`i;y9,**=pzd1}rmcp~`u'&7j|knuo{l dzbgqj~(?>+ndz/YG\u0010\u001a\u000b\u0007\u001f\f\\_@\u0013\u0007\u0012\u0011\f\u0014\u0002\u000bY\u001f\u0003\u001d\u001e\n\u0013\tQCJFU\u0014\u001e<i#=", 0, 37, 100));
        } else if (z10 && bArr3.length != 32) {
            throw new C3738(C3727.m1052("2!/1$vwf;-:?$>*=q1scglw9+xiok|=7\u0015@\b\u0007\u001crxie}n>=\"qepsnv`i;y9,**=pzd1}rmcp~`u'&7j|knuo{l dzbgqj~(?>+ndz/YG\u0010\u001a\u000b\u0007\u001f\f\\_@\u0013\u0007\u0012\u0011\f\u0014\u0002\u000bY\u001f\u0003\u001d\u001e\n\u0013\tQCJFU\u0014\u001e<i#=", 37, 31, 48));
        } else if (!z10 && bArr4.length != 8) {
            throw new C3738(C3727.m1052("2!/1$vwf;-:?$>*=q1scglw9+xiok|=7\u0015@\b\u0007\u001crxie}n>=\"qepsnv`i;y9,**=pzd1}rmcp~`u'&7j|knuo{l dzbgqj~(?>+ndz/YG\u0010\u001a\u000b\u0007\u001f\f\\_@\u0013\u0007\u0012\u0011\f\u0014\u0002\u000bY\u001f\u0003\u001d\u001e\n\u0013\tQCJFU\u0014\u001e<i#=", 68, 34, 118));
        } else if (!z10 || bArr4.length == 24) {
            boolean z11 = bArr3.length == 16;
            for (int i12 = 0; i12 < 4; i12++) {
                iArr[i12 * 5] = z11 ? f1632[i12] : f1633[i12];
            }
            iArr[1] = m1784(bArr3, 0);
            iArr[2] = m1784(bArr3, 4);
            iArr[3] = m1784(bArr3, 8);
            iArr[4] = m1784(bArr3, 12);
            iArr[11] = m1784(bArr3, z11 ? 0 : 16);
            iArr[12] = m1784(bArr3, z11 ? 4 : 20);
            iArr[13] = m1784(bArr3, z11 ? 8 : 24);
            iArr[14] = m1784(bArr3, z11 ? 12 : 28);
            iArr[6] = m1784(bArr4, 0);
            iArr[7] = m1784(bArr4, 4);
            int i13 = (int) j11;
            iArr[8] = i13;
            int i14 = (int) (j11 >>> 32);
            iArr[9] = i14;
            if (z10) {
                iArr[8] = m1784(bArr4, 8);
                iArr[9] = m1784(bArr4, 12);
                int[] iArr2 = new int[16];
                m1785(20, iArr, iArr2, new byte[64]);
                iArr[1] = iArr2[0] - iArr[0];
                iArr[2] = iArr2[5] - iArr[5];
                iArr[3] = iArr2[10] - iArr[10];
                iArr[4] = iArr2[15] - iArr[15];
                iArr[11] = iArr2[6] - iArr[6];
                iArr[12] = iArr2[7] - iArr[7];
                iArr[13] = iArr2[8] - iArr[8];
                iArr[14] = iArr2[9] - iArr[9];
                iArr[6] = m1784(bArr4, 16);
                iArr[7] = m1784(bArr4, 20);
                iArr[8] = i13;
                iArr[9] = i14;
            }
            this.f1635 = i10;
        } else {
            throw new C3738(C3727.m1052("2!/1$vwf;-:?$>*=q1scglw9+xiok|=7\u0015@\b\u0007\u001crxie}n>=\"qepsnv`i;y9,**=pzd1}rmcp~`u'&7j|knuo{l dzbgqj~(?>+ndz/YG\u0010\u001a\u000b\u0007\u001f\f\\_@\u0013\u0007\u0012\u0011\f\u0014\u0002\u000bY\u001f\u0003\u001d\u001e\n\u0013\tQCJFU\u0014\u001e<i#=", (int) CheckoutActivity.RESULT_ERROR, 36, 42));
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1786(byte[] bArr) {
        int[] iArr = this.f1636;
        int[] iArr2 = this.f1634;
        byte[] bArr2 = this.f1637;
        int i10 = this.f1638;
        int i11 = this.f1635;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            int i13 = (i12 + i10) % 64;
            if (i13 == 0) {
                m1785(i11, iArr, iArr2, bArr2);
                int i14 = iArr[8] + 1;
                iArr[8] = i14;
                if (i14 == 0) {
                    iArr[9] = iArr[9] + 1;
                }
            }
            bArr[i12] = (byte) (bArr2[i13] ^ bArr[i12]);
        }
        this.f1638 = (this.f1638 + bArr.length) & 63;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1785(int i10, int[] iArr, int[] iArr2, byte[] bArr) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int i11 = 16;
        System.arraycopy(iArr3, 0, iArr4, 0, 16);
        int i12 = i10;
        while (i12 > 0) {
            int r72 = iArr4[4] ^ m1783(iArr4[0] + iArr4[12], 7);
            iArr4[4] = r72;
            int r73 = m1783(r72 + iArr4[0], 9) ^ iArr4[8];
            iArr4[8] = r73;
            int r74 = m1783(r73 + iArr4[4], 13) ^ iArr4[12];
            iArr4[12] = r74;
            iArr4[0] = m1783(r74 + iArr4[8], 18) ^ iArr4[0];
            int r75 = iArr4[9] ^ m1783(iArr4[5] + iArr4[1], 7);
            iArr4[9] = r75;
            int r76 = m1783(r75 + iArr4[5], 9) ^ iArr4[13];
            iArr4[13] = r76;
            int r77 = m1783(r76 + iArr4[9], 13) ^ iArr4[1];
            iArr4[1] = r77;
            iArr4[5] = m1783(r77 + iArr4[13], 18) ^ iArr4[5];
            int r32 = m1783(iArr4[10] + iArr4[6], 7) ^ iArr4[14];
            iArr4[14] = r32;
            int r33 = iArr4[2] ^ m1783(r32 + iArr4[10], 9);
            iArr4[2] = r33;
            int r34 = iArr4[6] ^ m1783(r33 + iArr4[14], 13);
            iArr4[6] = r34;
            iArr4[10] = iArr4[10] ^ m1783(r34 + iArr4[2], 18);
            int r35 = iArr4[3] ^ m1783(iArr4[15] + iArr4[11], 7);
            iArr4[3] = r35;
            int r36 = m1783(r35 + iArr4[15], 9) ^ iArr4[7];
            iArr4[7] = r36;
            int r37 = m1783(r36 + iArr4[3], 13) ^ iArr4[11];
            iArr4[11] = r37;
            iArr4[15] = m1783(r37 + iArr4[7], 18) ^ iArr4[15];
            int r38 = iArr4[1] ^ m1783(iArr4[0] + iArr4[3], 7);
            iArr4[1] = r38;
            int r39 = m1783(r38 + iArr4[0], 9) ^ iArr4[2];
            iArr4[2] = r39;
            int r310 = m1783(r39 + iArr4[1], 13) ^ iArr4[3];
            iArr4[3] = r310;
            iArr4[0] = m1783(r310 + iArr4[2], 18) ^ iArr4[0];
            int r311 = iArr4[6] ^ m1783(iArr4[5] + iArr4[4], 7);
            iArr4[6] = r311;
            int r312 = m1783(r311 + iArr4[5], 9) ^ iArr4[7];
            iArr4[7] = r312;
            int r313 = m1783(r312 + iArr4[6], 13) ^ iArr4[4];
            iArr4[4] = r313;
            iArr4[5] = m1783(r313 + iArr4[7], 18) ^ iArr4[5];
            int r314 = iArr4[11] ^ m1783(iArr4[10] + iArr4[9], 7);
            iArr4[11] = r314;
            int r315 = m1783(r314 + iArr4[10], 9) ^ iArr4[8];
            iArr4[8] = r315;
            int r316 = m1783(r315 + iArr4[11], 13) ^ iArr4[9];
            iArr4[9] = r316;
            iArr4[10] = m1783(r316 + iArr4[8], 18) ^ iArr4[10];
            int r317 = iArr4[12] ^ m1783(iArr4[15] + iArr4[14], 7);
            iArr4[12] = r317;
            int r318 = m1783(r317 + iArr4[15], 9) ^ iArr4[13];
            iArr4[13] = r318;
            int r319 = m1783(r318 + iArr4[12], 13) ^ iArr4[14];
            iArr4[14] = r319;
            iArr4[15] = m1783(r319 + iArr4[13], 18) ^ iArr4[15];
            i12 -= 2;
            i11 = 16;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = iArr4[i13] + iArr3[i13];
            iArr4[i13] = i14;
            int i15 = i13 * 4;
            bArr[i15] = (byte) i14;
            bArr[i15 + 1] = (byte) (i14 >>> 8);
            bArr[i15 + 2] = (byte) (i14 >>> 16);
            bArr[i15 + 3] = (byte) (i14 >>> 24);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m1784(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] << 24) & -16777216) | (bArr[i10] & 255) | ((bArr[i10 + 1] << 8) & 65280) | ((bArr[i10 + 2] << 16) & 16711680);
    }
}
