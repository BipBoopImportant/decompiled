package nts;

/* renamed from: nts.ᦅ  reason: contains not printable characters */
public class C4001 extends C3793 {

    /* renamed from: ࡑ  reason: contains not printable characters */
    public int[] f2664;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int[] f2665;

    public C4001(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        super(bArr2, 16, 16, i10, i11, i12);
        int[] iArr = new int[40];
        this.f2665 = iArr;
        int[] iArr2 = new int[1024];
        this.f2664 = iArr2;
        C3994.m2445(bArr, iArr, iArr2);
        this.f104 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m2462() {
        int i10 = this.f109;
        if (i10 == 4 || i10 == 3) {
            C3994.m2451(this.f99, this.f2665, this.f2664);
            return;
        }
        byte[] bArr = this.f99;
        int[] iArr = this.f2665;
        int[] iArr2 = this.f2664;
        int r72 = C3994.m2448(bArr, 0);
        int r82 = C3994.m2448(bArr, 4);
        int r10 = C3994.m2448(bArr, 8);
        int r12 = C3994.m2448(bArr, 12);
        int i11 = r72 ^ iArr[4];
        int i12 = r82 ^ iArr[5];
        int i13 = r10 ^ iArr[6];
        int i14 = r12 ^ iArr[7];
        int i15 = 39;
        for (int i16 = 0; i16 < 16; i16 += 2) {
            int r15 = C3994.m2449(iArr2, i11, 0);
            int r16 = C3994.m2449(iArr2, i12, 3);
            int i17 = i14 ^ ((r15 + (r16 * 2)) + iArr[i15]);
            i14 = (i17 >>> 1) | (i17 << 31);
            i13 = ((i13 << 1) | (i13 >>> 31)) ^ ((r15 + r16) + iArr[i15 - 1]);
            int r152 = C3994.m2449(iArr2, i13, 0);
            int r17 = C3994.m2449(iArr2, i14, 3);
            int i18 = i15 - 3;
            int i19 = i12 ^ ((r152 + (r17 * 2)) + iArr[i15 - 2]);
            i12 = (i19 >>> 1) | (i19 << 31);
            i15 -= 4;
            i11 = ((i11 << 1) | (i11 >>> 31)) ^ ((r152 + r17) + iArr[i18]);
        }
        int i20 = iArr[0] ^ i13;
        int i21 = iArr[1] ^ i14;
        C3994.m2450(i20, bArr, 0);
        C3994.m2450(i21, bArr, 4);
        C3994.m2450(i11 ^ iArr[2], bArr, 8);
        C3994.m2450(iArr[3] ^ i12, bArr, 12);
    }
}
