package nts;

import java.util.Vector;

/* renamed from: nts.ⰸ  reason: contains not printable characters */
public class C4137 extends C4138 {

    /* renamed from: ࡏ  reason: contains not printable characters */
    public Vector f3709 = new Vector();

    /* renamed from: ખ  reason: contains not printable characters */
    public C3892 f3710;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public byte[] f3711 = null;

    public C4137(C3892 r22) {
        this.f3710 = r22;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m3417() {
        C3844 r02 = new C3844();
        r02.m1752(this.f3711);
        this.f3713 = 9;
        this.f3716 = r02.m1755();
        return super.m3419();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3416(byte[] bArr) {
        super.m3418(bArr);
        byte[] r42 = new C3844(this.f3716).m1738();
        this.f3711 = r42;
        this.f3709 = C4155.m3466(r42, 0, this.f3714, this.f3710);
    }
}
