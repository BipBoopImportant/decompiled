package nts;

/* renamed from: nts.м  reason: contains not printable characters */
public class C3593 {

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] f347;

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f348;

    public C3593(C3844 r22) {
        this.f348 = 0;
        this.f347 = C4058.f2976;
        this.f348 = r22.m1736();
        this.f347 = r22.m1732(r22.m1736());
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m352() {
        C3536 r02 = new C3536();
        r02.m1740(this.f348);
        byte[] bArr = this.f347;
        int length = bArr == null ? 0 : bArr.length;
        r02.m1740(length);
        if (length > 0) {
            r02.m1752(this.f347);
        }
        return r02.m1755();
    }

    public C3593() {
        this.f348 = 0;
        this.f347 = C4058.f2976;
        this.f348 = 0;
    }

    public C3593(int i10, byte[] bArr) {
        this.f348 = 0;
        byte[] bArr2 = C4058.f2976;
        this.f348 = i10;
        this.f347 = bArr;
    }
}
