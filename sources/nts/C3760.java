package nts;

/* renamed from: nts.ອ  reason: contains not printable characters */
public class C3760 extends C4138 {

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int f1195 = 0;

    /* renamed from: ખ  reason: contains not printable characters */
    public byte[] f1196 = null;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int f1197 = 0;

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m1207() {
        C3844 r02 = new C3844();
        r02.m1759(this.f1197);
        r02.m1759(this.f1195);
        byte[] bArr = this.f1196;
        if (bArr != null) {
            r02.m1752(bArr);
        }
        this.f3713 = 7;
        this.f3716 = r02.m1755();
        return super.m3419();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1206(byte[] bArr) {
        super.m3418(bArr);
        C3844 r22 = new C3844(this.f3716);
        this.f1197 = r22.m1733();
        this.f1195 = r22.m1733();
        if (r22.m1731() > 0) {
            this.f1196 = r22.m1738();
        }
    }
}
