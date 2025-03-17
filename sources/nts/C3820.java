package nts;

/* renamed from: nts.ቍ  reason: contains not printable characters */
public class C3820 extends C4138 {

    /* renamed from: Е  reason: contains not printable characters */
    public int f1532 = -1;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int f1533 = -1;

    /* renamed from: ખ  reason: contains not printable characters */
    public int f1534 = -1;

    /* renamed from: ᅯ  reason: contains not printable characters */
    public int f1535 = -1;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public int f1536 = -1;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int f1537 = -1;

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m1586() {
        C3844 r02 = new C3844();
        if (this.f1537 != -1) {
            r02.m1740(1);
            r02.m1759(this.f1537);
        }
        if (this.f1533 != -1) {
            r02.m1740(2);
            r02.m1759(this.f1533);
        }
        if (this.f1534 != -1) {
            r02.m1740(3);
            r02.m1759(this.f1534);
        }
        if (this.f1532 != -1) {
            r02.m1740(4);
            r02.m1759(this.f1532);
        }
        if (this.f1536 != -1) {
            r02.m1740(5);
            r02.m1759(this.f1536);
        }
        if (this.f1535 != -1) {
            r02.m1740(6);
            r02.m1759(this.f1535);
        }
        this.f3713 = 4;
        this.f3716 = r02.m1755();
        return super.m3419();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1585(byte[] bArr) {
        super.m3418(bArr);
        C3844 r22 = new C3844(this.f3716);
        while (r22.m1731() > 0) {
            switch (r22.m1736()) {
                case 1:
                    this.f1537 = r22.m1733();
                    break;
                case 2:
                    this.f1533 = r22.m1733();
                    break;
                case 3:
                    this.f1534 = r22.m1733();
                    break;
                case 4:
                    this.f1532 = r22.m1733();
                    break;
                case 5:
                    this.f1536 = r22.m1733();
                    break;
                case 6:
                    this.f1535 = r22.m1733();
                    break;
                default:
                    r22.m1733();
                    break;
            }
        }
    }
}
