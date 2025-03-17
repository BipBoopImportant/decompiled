package nts;

/* renamed from: nts.Ղ  reason: contains not printable characters */
public class C3629 implements C4011 {

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] f609 = new byte[0];

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3741 f610;

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] m594() {
        return this.f609;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m596(String str, byte[] bArr) {
        C3741 r02 = new C3741(str);
        this.f610 = r02;
        r02.m1146(bArr);
        this.f610.m1144();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m597(byte[] bArr, boolean z10) {
        if (z10) {
            C3741 r52 = this.f610;
            int length = bArr.length;
            r52.m1145(bArr, 0, length);
            r52.f624 = r52.m1147();
            System.arraycopy(bArr, 0, new byte[length], 0, length);
            this.f609 = this.f610.f624;
            return;
        }
        this.f610.m1145(bArr, 0, bArr.length);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m595() {
        this.f610.m1144();
    }
}
