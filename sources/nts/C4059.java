package nts;

/* renamed from: nts.ᵨ  reason: contains not printable characters */
public class C4059 extends C3935 {

    /* renamed from: ᅯ  reason: contains not printable characters */
    public int f2978 = 0;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public int f2979 = 0;

    public C4059() {
        this.f910 = new C4124[]{new C4124(128, 128, 0)};
        this.f916 = new C4124[]{new C4124(64, 64, 0)};
        this.f2979 = 64;
        this.f912 = 64;
        this.f914 = 64;
        this.f913 = 128;
        this.f911 = 1;
        this.f909 = 1;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m2842(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] << 24) & -16777216) | ((bArr[i10 + 1] << 16) & 16711680) | ((bArr[i10 + 2] << 8) & 65280);
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m2846() {
        m901(C3990.m2428(this.f913 / 8));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public C4193 m2847(byte[] bArr, byte[] bArr2) {
        return new C3901(bArr, bArr2, this.f911, this.f909, this.f2979, this.f2978, this.f914);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m2849() {
        m905(C3990.m2428(this.f912 / 8));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m2843(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m2844(byte[] bArr, int[] iArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            iArr[i10] = m2842(bArr, i10 * 4);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m2845(byte[] bArr, int[] iArr, int i10, int i11) {
        int r12 = m2842(bArr, 0);
        int r32 = m2842(bArr, 4);
        if (i11 == 0) {
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                r12 += ((r32 << 4) ^ ((r32 >>> 5) + r32)) ^ (iArr[i12 & 3] + i12);
                i12 -= 1640531527;
                r32 += ((r12 << 4) ^ ((r12 >>> 5) + r12)) ^ (iArr[(i12 >>> 11) & 3] + i12);
            }
        } else {
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                r12 += (((r32 << 4) ^ (r32 >>> 5)) + r32) ^ (iArr[i14 & 3] + i14);
                i14 -= 1640531527;
                r32 += (((r12 << 4) ^ (r12 >>> 5)) + r12) ^ (iArr[(i14 >>> 11) & 3] + i14);
            }
        }
        m2843(r12, bArr, 0);
        m2843(r32, bArr, 4);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4193 m2848(byte[] bArr, byte[] bArr2) {
        return new C3917(bArr, bArr2, this.f911, this.f909, this.f2979, this.f2978, this.f914);
    }
}
