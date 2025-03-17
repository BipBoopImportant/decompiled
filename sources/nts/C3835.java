package nts;

/* renamed from: nts.ዓ  reason: contains not printable characters */
public class C3835 extends C3935 {

    /* renamed from: ⴸ  reason: contains not printable characters */
    public int f1593 = 0;

    public C3835() {
        this.f910 = new C4124[]{new C4124(128, 128, 0)};
        this.f916 = new C4124[]{new C4124(64, 64, 0)};
        this.f1593 = 64;
        this.f912 = 64;
        this.f914 = 64;
        this.f913 = 128;
        this.f911 = 1;
        this.f909 = 1;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m1685(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] << 24) & -16777216) | ((bArr[i10 + 1] << 16) & 16711680) | ((bArr[i10 + 2] << 8) & 65280);
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m1689() {
        m901(C3990.m2428(this.f913 / 8));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public C4193 m1690(byte[] bArr, byte[] bArr2) {
        return new C3688(bArr, bArr2, this.f911, this.f909, this.f1593, this.f914);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1692() {
        m905(C3990.m2428(this.f912 / 8));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1686(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1687(byte[] bArr, int[] iArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            iArr[i10] = m1685(bArr, i10 * 4);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1688(byte[] bArr, int[] iArr, int i10) {
        int r12 = m1685(bArr, 0);
        int r32 = m1685(bArr, 4);
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 -= 1640531527;
            r12 += (((r32 << 4) + iArr[0]) ^ (r32 + i11)) ^ ((r32 >>> 5) + iArr[1]);
            r32 += (((r12 << 4) + iArr[2]) ^ (r12 + i11)) ^ ((r12 >>> 5) + iArr[3]);
        }
        m1686(r12, bArr, 0);
        m1686(r32, bArr, 4);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4193 m1691(byte[] bArr, byte[] bArr2) {
        return new C3754(bArr, bArr2, this.f911, this.f909, this.f1593, this.f914);
    }
}
