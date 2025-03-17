package nts;

/* renamed from: nts.ὐ  reason: contains not printable characters */
public class C4099 extends C3771 {
    /* renamed from: ഇ  reason: contains not printable characters */
    public long m3248(byte[] bArr, int i10, int i11) {
        String str = C3823.f1540;
        long j10 = 0;
        while (i11 > 0) {
            int i12 = i10 + i11;
            if (i12 > bArr.length) {
                break;
            }
            j10 = (j10 << 8) | ((long) (bArr[i12 - 1] & 255));
            i11--;
        }
        return j10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3249(long j10, byte[] bArr, int i10, int i11) {
        C3823.m1599(j10, bArr, i10, i11);
    }
}
