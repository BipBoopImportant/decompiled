package nts;

/* renamed from: nts.ᄽ  reason: contains not printable characters */
public class C3785 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public String f1297;

    /* renamed from: Е  reason: contains not printable characters */
    public int f1298;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public byte[] f1299;

    /* renamed from: ખ  reason: contains not printable characters */
    public byte[] f1300;

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] f1301;

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] f1302;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public long f1303;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public long f1304 = 0;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public long f1305 = 0;

    public C3785(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = C3596.f365;
        this.f1299 = bArr3;
        this.f1300 = bArr3;
        this.f1298 = 0;
        this.f1302 = bArr;
        this.f1301 = bArr2;
        this.f1303 = System.currentTimeMillis();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public boolean m1274() {
        if (this.f1300.length > 0) {
            return System.currentTimeMillis() < this.f1303 + (this.f1304 * 1000);
        }
        byte[] bArr = this.f1302;
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        return System.currentTimeMillis() < this.f1303 + 36000000;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1275(byte[] bArr, byte[] bArr2, byte[] bArr3, long j10, long j11, byte[] bArr4, String str, int i10) {
        this.f1302 = bArr;
        this.f1301 = bArr2;
        this.f1303 = System.currentTimeMillis();
        this.f1297 = str;
        this.f1304 = j10;
        this.f1305 = j11;
        this.f1299 = bArr4;
        this.f1300 = bArr3;
        this.f1298 = i10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean m1276() {
        return this.f1305 > 0 || this.f1299.length > 0;
    }
}
