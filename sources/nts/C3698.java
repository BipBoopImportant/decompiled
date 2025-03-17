package nts;

/* renamed from: nts.ਵ  reason: contains not printable characters */
public class C3698 {

    /* renamed from: ગ  reason: contains not printable characters */
    public int f903 = 0;

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f904 = 1;

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] m889() {
        long r02 = m890();
        byte[] bArr = new byte[4];
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i10] = (byte) ((int) ((r02 >> (24 - (i10 * 8))) & 255));
        }
        return bArr;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m891(byte[] bArr, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            int i13 = (this.f904 + (bArr[i12] & 255)) % 65521;
            this.f904 = i13;
            this.f903 = (this.f903 + i13) % 65521;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public long m890() {
        return (((long) this.f903) << 16) + ((long) this.f904);
    }
}
